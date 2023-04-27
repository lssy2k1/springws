<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    // let register_form = {
    //     init : function(){
    //         $('#register_btn').click(function(){
    //             register_form.send();
    //         });
    //     },
    //     send : function(){
    //         $('#register_form').attr({
    //             'action':'/registerimpl',//MainController로 요청을 보낸다.
    //             'method':'get'
    //         });
    //         $('#register_form').submit();
    //     }
    // };
    // $(function(){
    //     register_form.init()
    // });
</script>
<div class="col-sm-8 text-left">
    <div class = "container">
        <h2 style = "text-align: center; margin-bottom: 50px">회원가입</h2>
        <form class="form-horizontal" id = "register_form">

            <div class="form-group has-success has-feedback">
                <label class="col-sm-2 control-label" for="id">ID</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name = "id" id="id">
                    <span class="glyphicon glyphicon-ok form-control-feedback"></span>
                </div>
            </div>

            <div class="form-group has-warning has-feedback">
                <label class="col-sm-2 control-label" for="pwd">Password</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="pwd" name = "pwd">
                    <span class="glyphicon glyphicon-warning-sign form-control-feedback"></span>
                </div>
            </div>

            <div class="form-group has-error has-feedback">
                <label class="col-sm-2 control-label" for="name">name</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="name" name = "name">
                    <span class="glyphicon glyphicon-remove form-control-feedback"></span>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type = "button" id = "register_btn" class="btn btn-warning">Register</button>
                </div>
            </div>
        </form>
    </div>
</div>

