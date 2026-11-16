# TP 1.4, Séquence 1 (L'environnement de travail),

## Contenu

- Projet Maven `sn.ucad.esp.glsi:tp14`, Java 25
- JavaFX 25.0.5 (`javafx-controls`, `javafx-fxml`)
- Fenêtre vide `vue.fxml` créée avec Scene Builder (`src/main/resources/sn/ucad/esp/glsi/`)
- Connexion à MySQL avec `mysql-connector-j` 26.10.0 (classe `Test_MySQL`)

## Prérequis

- JDK 25
- Maven 3.10.0
- MySQL avec la base `tp13`, sa table `information` et l'utilisateur `esp`

## Utilisation

Compiler le projet :

```
mvn compile
```

Lancer l'application JavaFX (classe principale `sn.ucad.esp.glsi.App`) :

```
mvn clean javafx:run
```

Tester la connexion à la base : exécuter la classe `Test_MySQL` depuis l'IDE, après avoir adapté les identifiants de connexion dans `Test_MySQL.java`.