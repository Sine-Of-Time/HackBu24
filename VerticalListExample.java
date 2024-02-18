package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class VerticalListExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a VBox layout container
        VBox root = new VBox();
        root.setSpacing(10); // Set spacing between items

        // Add some sample objects to the list
        root.getChildren().add(new Label("Item 1"));
        root.getChildren().add(new Label("Item 2"));
        root.getChildren().add(new Label("Item 3"));

        // Create the scene with the VBox as the root node
        Scene scene = new Scene(root, 400, 300);

        // Set the alignment of the VBox to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Set the scene to the stage and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vertical List Example");
        primaryStage.show();
    }

    public VBox getRoot() {
        // Create a VBox layout container
        VBox root = new VBox();
        root.setSpacing(10); // Set spacing between items

        // Add some sample objects to the list
        Separator line = new Separator();
        line.setPrefWidth(50);
        Separator line2 = new Separator();
        line2.setPrefWidth(20);
        Separator line3 = new Separator();
        line3.setPrefWidth(20);
        Button b1=new Button("Push Day");
        Button b2=new Button("Pull Day");
        Button b3=new Button("Leg Day");
        
        b1.setOnAction(event -> {
         Label lbl=new Label("Bench Press");
         lbl.setStyle("-fx-font-weight: bold");
         Label s1=new Label("Set 1");
         Label s2=new Label("Set 2");
         Label s3=new Label("Set 3");
         Label lbs=new Label("Lbs:");
         lbs.setStyle("-fx-font-weight: bold");
         Label reps=new Label("Reps:");
         reps.setStyle("-fx-font-weight: bold");
         TextField txt=new TextField();
   
         TextField txt2=new TextField();
         TextField txt3=new TextField();
         TextField txt4=new TextField();
         TextField txt5=new TextField();
         TextField txt6=new TextField();
         TextField txt7=new TextField();
         
         GridPane gridPane = new GridPane();
         gridPane.setPadding(new Insets(10));
         gridPane.add(lbl, 0, 0, 1, 1);
         gridPane.add(lbs, 1, 0, 1, 1);
         gridPane.add(reps, 2, 0, 1, 1);
         gridPane.add(s1, 0, 1, 1, 1);
         gridPane.add(s2, 0, 2, 1, 1);
         gridPane.add(s3, 0, 3, 1, 1);
         gridPane.add(txt, 1, 1, 1, 1);
         gridPane.add(txt5, 1, 2, 1, 1);
         gridPane.add(txt6, 1, 3, 1, 1);
         gridPane.add(txt2, 2, 1, 1, 1);
         gridPane.add(txt3, 2,2, 1, 1);
         gridPane.add(txt4, 2,3, 1, 1);
 
         gridPane.setHgap(10);
         gridPane.setVgap(10);
         //-----------------------------
         Label lblA=new Label("Incline Press");
         lblA.setStyle("-fx-font-weight: bold");
         Label s1A=new Label("Set 1");
         Label s2A=new Label("Set 2");
         Label s3A=new Label("Set 3");
         Label lbsA=new Label("Lbs:");
         lbsA.setStyle("-fx-font-weight: bold");
         Label repsA=new Label("Reps:");
         repsA.setStyle("-fx-font-weight: bold");
         TextField txtA=new TextField();
   
         TextField txt2A=new TextField();
         TextField txt3A=new TextField();
         TextField txt4A=new TextField();
         TextField txt5A=new TextField();
         TextField txt6A=new TextField();
         TextField txt7A=new TextField();
         
         GridPane gridPaneA = new GridPane();
         gridPaneA.setPadding(new Insets(10));
         gridPaneA.add(lblA, 0, 0, 1, 1);
         gridPaneA.add(lbsA, 1, 0, 1, 1);
         gridPaneA.add(repsA, 2, 0, 1, 1);
         gridPaneA.add(s1A, 0, 1, 1, 1);
         gridPaneA.add(s2A, 0, 2, 1, 1);
         gridPaneA.add(s3A, 0, 3, 1, 1);
         gridPaneA.add(txtA, 1, 1, 1, 1);
         gridPaneA.add(txt5A, 1, 2, 1, 1);
         gridPaneA.add(txt6A, 1, 3, 1, 1);
         gridPaneA.add(txt2A, 2, 1, 1, 1);
         gridPaneA.add(txt3A, 2,2, 1, 1);
         gridPaneA.add(txt4A, 2,3, 1, 1);
 
         gridPaneA.setHgap(10);
         gridPaneA.setVgap(10);
         
       //-----------------------------
         Label lblB=new Label("Tricep Ext");
         lblB.setStyle("-fx-font-weight: bold");
         Label s1B=new Label("Set 1");
         Label s2B=new Label("Set 2");
         Label s3B=new Label("Set 3");
         Label lbsB=new Label("Lbs:");
         lbsB.setStyle("-fx-font-weight: bold");
         Label repsB=new Label("Reps:");
         repsB.setStyle("-fx-font-weight: bold");
         TextField txtB=new TextField();
   
         TextField txt2B=new TextField();
         TextField txt3B=new TextField();
         TextField txt4B=new TextField();
         TextField txt5B=new TextField();
         TextField txt6B=new TextField();
         TextField txt7B=new TextField();
        
         GridPane gridPaneB = new GridPane();
         gridPaneB.setPadding(new Insets(10));
         gridPaneB.add(lblB, 0, 0, 1, 1);
         gridPaneB.add(lbsB, 1, 0, 1, 1);
         gridPaneB.add(repsB, 2, 0, 1, 1);
         gridPaneB.add(s1B, 0, 1, 1, 1);
         gridPaneB.add(s2B, 0, 2, 1, 1);
         gridPaneB.add(s3B, 0, 3, 1, 1);
         gridPaneB.add(txtB, 1, 1, 1, 1);
         gridPaneB.add(txt5B, 1, 2, 1, 1);
         gridPaneB.add(txt6B, 1, 3, 1, 1);
         gridPaneB.add(txt2B, 2, 1, 1, 1);
         gridPaneB.add(txt3B, 2,2, 1, 1);
         gridPaneB.add(txt4B, 2,3, 1, 1);
 
         gridPaneB.setHgap(10);
         gridPaneB.setVgap(10);
         
         VBox root2 = new VBox();
            root2.setSpacing(10);
            root2.getChildren().add(gridPane);
            root2.getChildren().add(new Separator());
            root2.getChildren().add(gridPaneA);
            root2.getChildren().add(new Separator());
            root2.getChildren().add(gridPaneB);
            root2.getChildren().add(new Separator());
            
            Separator line4 = new Separator();
            line4.setPrefWidth(50);
            
            Scene scene2=new Scene(root2);
            Stage stage2= new Stage();
            
            stage2.setScene(scene2);
            stage2.setTitle("Workout 1");
            stage2.show();
        });
        
        b2.setOnAction(event -> {
        	 Label lbl=new Label("Pull Up");
             lbl.setStyle("-fx-font-weight: bold");
             Label s1=new Label("Set 1");
             Label s2=new Label("Set 2");
             Label s3=new Label("Set 3");
             Label lbs=new Label("Lbs:");
             lbs.setStyle("-fx-font-weight: bold");
             Label reps=new Label("Reps:");
             reps.setStyle("-fx-font-weight: bold");
             TextField txt=new TextField();
       
             TextField txt2=new TextField();
             TextField txt3=new TextField();
             TextField txt4=new TextField();
             TextField txt5=new TextField();
             TextField txt6=new TextField();
             TextField txt7=new TextField();
             
             GridPane gridPane = new GridPane();
             gridPane.setPadding(new Insets(10));
             gridPane.add(lbl, 0, 0, 1, 1);
             gridPane.add(lbs, 1, 0, 1, 1);
             gridPane.add(reps, 2, 0, 1, 1);
             gridPane.add(s1, 0, 1, 1, 1);
             gridPane.add(s2, 0, 2, 1, 1);
             gridPane.add(s3, 0, 3, 1, 1);
             gridPane.add(txt, 1, 1, 1, 1);
             gridPane.add(txt5, 1, 2, 1, 1);
             gridPane.add(txt6, 1, 3, 1, 1);
             gridPane.add(txt2, 2, 1, 1, 1);
             gridPane.add(txt3, 2,2, 1, 1);
             gridPane.add(txt4, 2,3, 1, 1);
     
             gridPane.setHgap(10);
             gridPane.setVgap(10);
             //-----------------------------
             Label lblA=new Label("Lat Pull");
             lblA.setStyle("-fx-font-weight: bold");
             Label s1A=new Label("Set 1");
             Label s2A=new Label("Set 2");
             Label s3A=new Label("Set 3");
             Label lbsA=new Label("Lbs:");
             lbsA.setStyle("-fx-font-weight: bold");
             Label repsA=new Label("Reps:");
             repsA.setStyle("-fx-font-weight: bold");
             TextField txtA=new TextField();
       
             TextField txt2A=new TextField();
             TextField txt3A=new TextField();
             TextField txt4A=new TextField();
             TextField txt5A=new TextField();
             TextField txt6A=new TextField();
             TextField txt7A=new TextField();
             
             GridPane gridPaneA = new GridPane();
             gridPaneA.setPadding(new Insets(10));
             gridPaneA.add(lblA, 0, 0, 1, 1);
             gridPaneA.add(lbsA, 1, 0, 1, 1);
             gridPaneA.add(repsA, 2, 0, 1, 1);
             gridPaneA.add(s1A, 0, 1, 1, 1);
             gridPaneA.add(s2A, 0, 2, 1, 1);
             gridPaneA.add(s3A, 0, 3, 1, 1);
             gridPaneA.add(txtA, 1, 1, 1, 1);
             gridPaneA.add(txt5A, 1, 2, 1, 1);
             gridPaneA.add(txt6A, 1, 3, 1, 1);
             gridPaneA.add(txt2A, 2, 1, 1, 1);
             gridPaneA.add(txt3A, 2,2, 1, 1);
             gridPaneA.add(txt4A, 2,3, 1, 1);
     
             gridPaneA.setHgap(10);
             gridPaneA.setVgap(10);
             
           //-----------------------------
             Label lblB=new Label("Bicep Curl");
             lblB.setStyle("-fx-font-weight: bold");
             Label s1B=new Label("Set 1");
             Label s2B=new Label("Set 2");
             Label s3B=new Label("Set 3");
             Label lbsB=new Label("Lbs:");
             lbsB.setStyle("-fx-font-weight: bold");
             Label repsB=new Label("Reps:");
             repsB.setStyle("-fx-font-weight: bold");
             TextField txtB=new TextField();
       
             TextField txt2B=new TextField();
             TextField txt3B=new TextField();
             TextField txt4B=new TextField();
             TextField txt5B=new TextField();
             TextField txt6B=new TextField();
             TextField txt7B=new TextField();
            
             GridPane gridPaneB = new GridPane();
             gridPaneB.setPadding(new Insets(10));
             gridPaneB.add(lblB, 0, 0, 1, 1);
             gridPaneB.add(lbsB, 1, 0, 1, 1);
             gridPaneB.add(repsB, 2, 0, 1, 1);
             gridPaneB.add(s1B, 0, 1, 1, 1);
             gridPaneB.add(s2B, 0, 2, 1, 1);
             gridPaneB.add(s3B, 0, 3, 1, 1);
             gridPaneB.add(txtB, 1, 1, 1, 1);
             gridPaneB.add(txt5B, 1, 2, 1, 1);
             gridPaneB.add(txt6B, 1, 3, 1, 1);
             gridPaneB.add(txt2B, 2, 1, 1, 1);
             gridPaneB.add(txt3B, 2,2, 1, 1);
             gridPaneB.add(txt4B, 2,3, 1, 1);
     
             gridPaneB.setHgap(10);
             gridPaneB.setVgap(10);
             
             VBox root2 = new VBox();
                root2.setSpacing(10);
                root2.getChildren().add(gridPane);
                root2.getChildren().add(new Separator());
                root2.getChildren().add(gridPaneA);
                root2.getChildren().add(new Separator());
                root2.getChildren().add(gridPaneB);
                root2.getChildren().add(new Separator());
                
                Separator line4 = new Separator();
                line4.setPrefWidth(50);
                
                Scene scene2=new Scene(root2);
                Stage stage2= new Stage();
                
                stage2.setScene(scene2);
                stage2.setTitle("Push Day");
                stage2.show();
        });
        
        b3.setOnAction(event -> {
        	 Label lbl=new Label("Squat");
             lbl.setStyle("-fx-font-weight: bold");
             Label s1=new Label("Set 1");
             Label s2=new Label("Set 2");
             Label s3=new Label("Set 3");
             Label lbs=new Label("Lbs:");
             lbs.setStyle("-fx-font-weight: bold");
             Label reps=new Label("Reps:");
             reps.setStyle("-fx-font-weight: bold");
             TextField txt=new TextField();
       
             TextField txt2=new TextField();
             TextField txt3=new TextField();
             TextField txt4=new TextField();
             TextField txt5=new TextField();
             TextField txt6=new TextField();
             TextField txt7=new TextField();
             
             GridPane gridPane = new GridPane();
             gridPane.setPadding(new Insets(10));
             gridPane.add(lbl, 0, 0, 1, 1);
             gridPane.add(lbs, 1, 0, 1, 1);
             gridPane.add(reps, 2, 0, 1, 1);
             gridPane.add(s1, 0, 1, 1, 1);
             gridPane.add(s2, 0, 2, 1, 1);
             gridPane.add(s3, 0, 3, 1, 1);
             gridPane.add(txt, 1, 1, 1, 1);
             gridPane.add(txt5, 1, 2, 1, 1);
             gridPane.add(txt6, 1, 3, 1, 1);
             gridPane.add(txt2, 2, 1, 1, 1);
             gridPane.add(txt3, 2,2, 1, 1);
             gridPane.add(txt4, 2,3, 1, 1);
     
             gridPane.setHgap(10);
             gridPane.setVgap(10);
             //-----------------------------
             Label lblA=new Label("Calf Raise");
             lblA.setStyle("-fx-font-weight: bold");
             Label s1A=new Label("Set 1");
             Label s2A=new Label("Set 2");
             Label s3A=new Label("Set 3");
             Label lbsA=new Label("Lbs:");
             lbsA.setStyle("-fx-font-weight: bold");
             Label repsA=new Label("Reps:");
             repsA.setStyle("-fx-font-weight: bold");
             TextField txtA=new TextField();
       
             TextField txt2A=new TextField();
             TextField txt3A=new TextField();
             TextField txt4A=new TextField();
             TextField txt5A=new TextField();
             TextField txt6A=new TextField();
             TextField txt7A=new TextField();
             
             GridPane gridPaneA = new GridPane();
             gridPaneA.setPadding(new Insets(10));
             gridPaneA.add(lblA, 0, 0, 1, 1);
             gridPaneA.add(lbsA, 1, 0, 1, 1);
             gridPaneA.add(repsA, 2, 0, 1, 1);
             gridPaneA.add(s1A, 0, 1, 1, 1);
             gridPaneA.add(s2A, 0, 2, 1, 1);
             gridPaneA.add(s3A, 0, 3, 1, 1);
             gridPaneA.add(txtA, 1, 1, 1, 1);
             gridPaneA.add(txt5A, 1, 2, 1, 1);
             gridPaneA.add(txt6A, 1, 3, 1, 1);
             gridPaneA.add(txt2A, 2, 1, 1, 1);
             gridPaneA.add(txt3A, 2,2, 1, 1);
             gridPaneA.add(txt4A, 2,3, 1, 1);
     
             gridPaneA.setHgap(10);
             gridPaneA.setVgap(10);
             
           //-----------------------------
             Label lblB=new Label("Ab Crunch");
             lblB.setStyle("-fx-font-weight: bold");
             Label s1B=new Label("Set 1");
             Label s2B=new Label("Set 2");
             Label s3B=new Label("Set 3");
             Label lbsB=new Label("Lbs:");
             lbsB.setStyle("-fx-font-weight: bold");
             Label repsB=new Label("Reps:");
             repsB.setStyle("-fx-font-weight: bold");
             TextField txtB=new TextField();
       
             TextField txt2B=new TextField();
             TextField txt3B=new TextField();
             TextField txt4B=new TextField();
             TextField txt5B=new TextField();
             TextField txt6B=new TextField();
             TextField txt7B=new TextField();
            
             GridPane gridPaneB = new GridPane();
             gridPaneB.setPadding(new Insets(10));
             gridPaneB.add(lblB, 0, 0, 1, 1);
             gridPaneB.add(lbsB, 1, 0, 1, 1);
             gridPaneB.add(repsB, 2, 0, 1, 1);
             gridPaneB.add(s1B, 0, 1, 1, 1);
             gridPaneB.add(s2B, 0, 2, 1, 1);
             gridPaneB.add(s3B, 0, 3, 1, 1);
             gridPaneB.add(txtB, 1, 1, 1, 1);
             gridPaneB.add(txt5B, 1, 2, 1, 1);
             gridPaneB.add(txt6B, 1, 3, 1, 1);
             gridPaneB.add(txt2B, 2, 1, 1, 1);
             gridPaneB.add(txt3B, 2,2, 1, 1);
             gridPaneB.add(txt4B, 2,3, 1, 1);
     
             gridPaneB.setHgap(10);
             gridPaneB.setVgap(10);
             
             VBox root2 = new VBox();
                root2.setSpacing(10);
                root2.getChildren().add(gridPane);
                root2.getChildren().add(new Separator());
                root2.getChildren().add(gridPaneA);
                root2.getChildren().add(new Separator());
                root2.getChildren().add(gridPaneB);
                root2.getChildren().add(new Separator());
                
                Separator line4 = new Separator();
                line4.setPrefWidth(50);
                
                Scene scene2=new Scene(root2);
                Stage stage2= new Stage();
                
                stage2.setScene(scene2);
                stage2.setTitle("Workout 1");
                stage2.show();
        });
        
        root.getChildren().add(b1);
        root.getChildren().add(line);
        root.getChildren().add(b2);
        root.getChildren().add(line2);
        root.getChildren().add(b3);
        //root.getChildren().add(line3);\
        // Set the alignment of the VBox to center
        
        root.setAlignment(javafx.geometry.Pos.CENTER);
        return root;
    }
}