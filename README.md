<h1> Prova Onsafety - Última Etapa </h1>

<p> para que tudo funcione, basta substituir os campos escritos em letras maiúsculas (Exemplo: <strong> ENDEREÇO_DO_SEU_DB) </strong> pelos dados solicitados, exemplo:
<strong> String urlConnection = "jdbc:mysql://localhost:3306/onsafety" </strong>; onde <strong>"//localhost:3306/onsafety"</strong> está no lugar de <strong>"PORTA_E_ENDEREÇO_DO_SEU_DB"</strong>;</p>
<br> <p> bem como: conn = DriverManager.getConnection(urlConnection, <strong>"SEU_USER", "SEU_PASSWORD"</strong>); onde podemos substituir por: conn = DriverManager.getConnection(urlConnection, <strong>"root", "1234567D"</strong>);

<p> Após isso, basta criar um banco de dados no SGBD, e realizar sua respectiva conexão! </p>
