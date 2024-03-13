<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<form action="/gio-hang/update" method="post">
    <div class="mb-3">
        <label class="form-label">ma gio hang</label>
        <input class="form-control" type="text" name="maGioHang" value="${gh.maGioHang}">
    </div>
    <div class="mb-3">
        <label class="form-label">ma khach hang</label>
<%--        <input class="form-control" type="text" name="maKhachHang" value="${kh.maKhachHang}">--%>
        <select name="NguoiSoHuu">
        <c:forEach items="${khachHangList}" var="i" >
        <option value="${i.maKhachHang}"   ${i.maKhachHang == gh.khachHang.maKhachHang ? 'selected="selected"' : ''}> ${i.maKhachHang}</option>
        </c:forEach>
        </select>
    </div>
<%--    <div class="mb-3">--%>
<%--        <label class="form-label">sdt</label>--%>
<%--        <input class="form-control" type="text" name="sdt" value="${kh.sdt}">--%>
<%--    </div>--%>
    <div class="mb-3">
        <label class="form-label">ghi chu</label>
        <input class="form-control" type="text" name="ghiChu" value="${gh.ghiChu}">
    </div>
    <div class="mb-3">
        <label class="form-label">trang thai</label>
        <input class="form-control" type="text" name="trangThai" value="${gh.trangThai}">
    </div>
    <button type="submit">Update</button>

</form>
</body>
</html>