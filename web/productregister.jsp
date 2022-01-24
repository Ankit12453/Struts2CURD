<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>RegisterProduct</title>
        <style type="text/css">
            .button-register {background-color: green;color: white;}
            .button-report {background-color: #000000;color: white;margin-left: 30%;}
        </style>
    </head>
    <body>
        <h2>Simple CURD Using STRUTS2 FRAMEWORK</h2>
        <a href="reportproduct"><button class="button-report" type="button">Report</button></a>
        <s:form action="registerproduct.action" method="post">
            <s:textfield label="Product ID" name="productId" />
            <s:textfield label="Product Name" name="productName" />
            <s:textfield label="Product Make" name="productMake" />
            <s:textfield label="Price" name="price" />
            <s:textfield label="Product Availability" name="availability" />
            <s:submit cssClass="button-register" value="Register" />
        </s:form>
        <s:if test="ctr>0">
            <span style="color: green;"><s:property value="msg" /></span>
        </s:if>
        <s:else>
            <span style="color: red;"><s:property value="msg" /></span>
        </s:else>
    </body>
</html>