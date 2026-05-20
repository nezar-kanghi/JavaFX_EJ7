package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ejercicio_7 extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setHgap(10); // espacio horizontal entre celdas
        grid.setVgap(10); // espacio vertical entre celdas

        // grid.add(elemento, columna, fila)
        grid.add(new Button("Botón 1"), 0, 0);
        grid.add(new Button("Botón 2"), 1, 0);
        grid.add(new Button("Botón 3"), 2, 0);

        grid.add(new Button("Botón 4"), 0, 1);
        grid.add(new Button("Botón 5"), 1, 1);
        grid.add(new Button("Botón 6"), 2, 1);

        grid.add(new Button("Botón 7"), 0, 2);
        grid.add(new Button("Botón 8"), 1, 2);
        grid.add(new Button("Botón 9"), 2, 2);

        Scene scene = new Scene(grid, 250, 150);
        stage.setTitle("Ejercicio 7 - GridPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}