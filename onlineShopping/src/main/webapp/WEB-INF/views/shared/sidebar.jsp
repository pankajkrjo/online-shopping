
<p class="lead">Shop Name</p>
<div class="list-group">
     
      <%--  <c:forEach items="${categories}" var="catgeory">
	<a href="${contextRoot}/show/category/${catgeory.id}/products" class="list-group-item" id="a_${catgeory.name }">${catgeory.name}</a>
		</c:forEach --%>
		
		
	 <c:forEach items="${categories}" var="catgeory">
	<a href="${contextRoot}/show/category/${catgeory.id}/products" class="list-group-item" id="a_${catgeory.name }" >${catgeory.name}</a>
		</c:forEach>
</div>