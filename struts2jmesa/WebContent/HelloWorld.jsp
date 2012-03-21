<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="/WEB-INF/tld/jmesa.tld" prefix="jmesa"%>
<html>
<head>
<title>Struts 2 - jmesa</title>
		<script type="text/javascript" src="/gesubvenciones/js/jquery-1.6.2.js"></script>
		<!-- JMESA -->
		<link rel="stylesheet" type="text/css" href="/gesubvenciones/css/jmesa.css"/>
		<script type="text/javascript" src="/gesubvenciones/js/jquery.jmesa.js"/></script>
		<script type="text/javascript" src="/gesubvenciones/js/jmesa.js"/></script>
</head>

<body>

	<h3>Probatina</h3>
	<ul>
		<li>
			<form>
				<jmesa:struts2TableModel items="${listaDatos}" id="miID" var="bean">
					<jmesa:htmlTable>
						<jmesa:htmlRow>
							<jmesa:htmlColumn property="id" />
							<jmesa:htmlColumn property="codigo" title="ID" />
							<jmesa:htmlColumn property="descripcion" title="Group" />

						</jmesa:htmlRow>
					</jmesa:htmlTable>

				</jmesa:struts2TableModel>
			</form>
		</li>
	</ul>
	<script type="text/javascript">
		function onInvokeAction(id) {
			createHiddenInputFieldsForLimitAndSubmit(id);
		}
	</script>
</body>
</html>
