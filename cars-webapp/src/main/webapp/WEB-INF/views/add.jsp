<%--
  Created by IntelliJ IDEA.
  User: JF194405
  Date: 24.07.2017
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Dodaj samochód</title>
</head>
<body>
<a href="list">Powrót do listy samochodów</a><br />
<form method="POST">
    <table border="1">
        <tbody>
        <tr>
            <th>Marka</th>
            <td><input type="text" name="make" /></td>
        </tr>
        <tr>
            <th>Data produkcji</th>
            <td><input type="text" name="productionDate" /></td>
        </tr>
        <tr>
            <th>Waga</th>
            <td><input type="text" name="weight" /></td>
        </tr>
        <tr>
            <th>Właściciel</th>
            <td><input type="text" name="owner" /></td>
        </tr>
        <tr>
            <td colspan="2" align="right"><input type="submit" value="Dodaj!" /></td>
        </tr>
        </tbody>
    </table>
</form>
<br />
<hr />
Uwaga! W kontekście użycia HTML oraz sposobu budowania stron, te rozwiązania są bardziej antyprzykładem niż materiałem do nauki!<br />
Jeśli chciałabyś także tworzyć same widoki i pisac poprawny, dobrze skonstruowany kod HTML, zachęcamy do zapoznania się np. z frameworkiem <a href="http://getbootstrap.com" target="_blank">Bootstrap</a>.
</body>
</html>
