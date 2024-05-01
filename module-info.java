module Login {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.media;
	requires javafx.web;
	requires java.desktop;
	requires javafx.base;
	requires javafx.graphics;
	requires itextpdf;
	
	opens application to javafx.graphics, javafx.fxml;
	opens rajasthan to javafx.graphics, javafx.fxml;
	opens authorise to javafx.graphics, javafx.fxml;
	opens unity to javafx.graphics, javafx.fxml;
	opens madhya to javafx.graphics, javafx.fxml;
	opens kashmir to javafx.graphics, javafx.fxml;
	opens dakor to javafx.graphics, javafx.fxml;

}
