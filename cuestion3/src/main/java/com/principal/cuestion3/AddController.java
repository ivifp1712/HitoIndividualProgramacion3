package com.principal.cuestion3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.*;

public class AddController {

    @FXML
    private TableView<Producto> tabla;
    @FXML private TableColumn<Producto, String> id;
    @FXML private TableColumn<Producto, String> nombre;
    @FXML private TableColumn<Producto, String> fenvasado;

    @FXML private TableColumn<Producto, String> unidades;
    @FXML private TableColumn<Producto, String> precio;
    @FXML private TableColumn<Producto, String> disponible;

    @FXML private DatePicker tfechaenvasado;
    @FXML private TextField tnombre;
    @FXML private TextField tunidades;
    @FXML private TextField tprecio;
    @FXML private ChoiceBox<String> tdisponible;




    public void initialize() throws Exception {
        //ObservableList<String> availableChoices = tdisponible.getItems();
        tdisponible.getItems().removeAll(tdisponible.getItems());
        tdisponible.getItems().addAll("si", "no");


        id = new TableColumn<>("id");
        id.setCellValueFactory(new PropertyValueFactory<>("id"));

        nombre = new TableColumn<>("nombre");
        nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        fenvasado = new TableColumn<>("Envasado en:");
        fenvasado.setCellValueFactory(new PropertyValueFactory<>("fenvasado"));

        unidades = new TableColumn<>("unidades");
        unidades.setCellValueFactory(new PropertyValueFactory<>("unidades"));

        precio = new TableColumn<>("precio");
        precio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        disponible = new TableColumn<>("disponible");
        disponible.setCellValueFactory(new PropertyValueFactory<>("disponible"));

        //table = new TableView<>();
        ObservableList<Producto> OProductos = FXCollections.observableArrayList();
        //Onotas.add(new Nota("presentacion", "nota"));
        tabla.setItems(OProductos);
        tabla.getColumns().setAll(id, nombre, fenvasado, unidades, precio, disponible);

        onVer();

    }

    public static Connection conexion() throws ClassNotFoundException, SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_pro","root","");

        return conn;
    }
    @FXML
    public void onVer() throws Exception {
        Connection conn = conexion();
        tabla.getItems().setAll();
        //String[] columnas = {"id", "nombre", "fenvasado", "unidades", "precio", "disponible"};
        PreparedStatement ps4 = conn.prepareStatement("select * from productos");
        ResultSet rs4 = ps4.executeQuery();
        //String temp = null;
        while (rs4.next()) {
            //System.out.println(rs4.getString(1));
            //System.out.println(rs4.getString(2));
            tabla.getItems().add(new Producto(rs4.getString(1),
                    rs4.getString(2), rs4.getString(3),
                    rs4.getString(4), rs4.getString(5),
                    rs4.getString(6)));

        }
    }
        @FXML
        public void onAdd() throws Exception {
            Connection conn = conexion();
            //tabla.getItems().setAll();
            System.out.println();

            System.out.println(tfechaenvasado.getValue());
            BigDecimal b = new BigDecimal(tprecio.getText(), MathContext.DECIMAL64);
            //String[] columnas = {"id", "nombre", "fenvasado", "unidades", "precio", "disponible"};
            PreparedStatement ps4 = conn.prepareStatement("INSERT INTO `productos` (`id`, `nombre`, `fechaEnvasado`, `unidades`, `precio`, `disponible`) VALUES (NULL, ?, ?, ?, ?, ?)");
            ps4.setString(1, tnombre.getText());
            ps4.setString(2, String.valueOf(tfechaenvasado.getValue()));
            ps4.setInt(3, Integer.parseInt(tunidades.getText()));
            ps4.setBigDecimal(4, b);

            if (String.valueOf(tdisponible.getValue()).equals("si")){
                System.out.println("Esta disponible");
                ps4.setBoolean(5, true);
            } else if (String.valueOf(tdisponible.getValue()).equals("no")) {
                System.out.println("no Esta disponible");
                ps4.setBoolean(5, false);
            } else{
                System.out.println("ERROR");
            }

            //ps4.setString(2, tfechaenvasado.getValue());
            ps4.executeUpdate();
            //String temp = null;

    }

    @FXML
    protected void cAdd() throws IOException {
        //welcomeText.setText("Welcome to JavaFX Application!");
        HelloApplication.setRoot("add");
    }
    @FXML
    protected void cEditar() throws IOException {
        //welcomeText.setText("Welcome to JavaFX Application!");
        HelloApplication.setRoot("editar");
    }




}
