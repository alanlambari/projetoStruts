<html>

    <script type="text/javascript" src="scripts/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="scripts/jquery.mockjax.js"></script>
    <script type="text/javascript" src="src/jquery.autocomplete.js"></script>
    <script type="text/javascript" src="scripts/estacoes.js"></script>
    <script type="text/javascript" src="scripts/demo.js"></script>

	<head>
		<link href="content/styles.css" rel="stylesheet" />
		<title></title>
	</head>

	<body background="img/fundoEstacao.jpg">
		<div align="center">
			<form action="buscarEstacao.do" method="POST">
				<br><br>
	        	
	        	<div style="width: 50%; margin: 0 auto; clear: both;">
        			<h2 style="color: FFFFFF">Estações</h2>
       				 <p style="color: FFFFFF">Forneça o nome da estação desejada!!!</p>
       				<div>
            			<input type="text" name="estacao" id="autocomplete-dynamic" style="width: 100%; border-width: 5px;"/>
        			</div>
    			</div>
			</form>
			<BR>
			<a href="index.jsp" style="color: FFFFFF">Voltar</a>   
	 	</div>
	</body>
</html>

