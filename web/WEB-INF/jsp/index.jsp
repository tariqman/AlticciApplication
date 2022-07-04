<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Alticci Sequence</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="${pageContext.request.contextPath}/alticciJS.js"></script>
    </head>
    <body>
       <form id="myForm">
            <label for="myName">Please enter n value</label>
            <input type="number" min="0" id="n" name="n" required >
            <button onclick="alticci(); return false;" title="Submit">Submit</button>
        </form>
    </body>
</html>
