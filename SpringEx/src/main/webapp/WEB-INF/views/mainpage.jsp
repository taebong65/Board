<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, 그리고 Bootstrap 기여자들">
    <meta name="generator" content="Hugo 0.88.1">
    <title>mainpage</title>

    <!-- <link rel="canonical" href="https://getbootstrap.kr/docs/5.1/examples/blog/"> -->

    

    <!-- Bootstrap core CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <!-- Favicons -->
<link rel="apple-touch-icon" href="/docs/5.1/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="/docs/5.1/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="/docs/5.1/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/5.1/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="/docs/5.1/assets/img/favicons/safari-pinned-tab.svg" color="#7952b3">
<link rel="icon" href="/docs/5.1/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#7952b3">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <!-- <link href="https://fonts.googleapis.com/css?family=Playfair&#43;Display:700,900&amp;display=swap" rel="stylesheet"> -->
    <!-- Custom styles for this template -->
    <!-- <link href="blog.css" rel="stylesheet"> -->
    
  </head>
  
  
  <body>
<%@ include file="./header&footer/header.jsp" %>


<main class="container">

<div class=background>
	
  <div class="p-4 p-md-5 mb-4 text-white rounded bg-dark">
    <div class="col-md-6 px-0">
    
      <h1 class="display-4 fst-italic" >Lee Tae Heon</h1>
      <p class="lead my-3">New Developer</p>
      <p class="lead mb-0"><a href="/aboutme" class="text-white fw-bold">More...</a></p>
    </div>
  </div>
</div>
  <div class="row mb-2">
    <div class="col-md-6">
      <div class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
        <div class="col p-4 d-flex flex-column position-static">
          <strong class="d-inline-block mb-2 text-primary">학력</strong>
          <h3 class="mb-0"></h3>
          <div class="mb-1 text-muted"></div>
          <p class="card-text mb-auto"></p>
          <p class="card-text mb-auto"></p>
          <p class="card-text mb-auto"></p>
          <p class="card-text mb-auto"></p>
          <p class="card-text mb-auto"></p>
          <p class="card-text mb-auto">2010 ~ 2013 울산 동천고등학교 졸업</p>
          <p class="card-text mb-auto">2013 ~ 2019 대구 가톨릭 대학교 졸업 </p>
          
        </div>
        <div class="col-auto d-none d-lg-block">
        <img src="../resources/img/school.png" width="125px" height= "auto">
          <svg class="bd-placeholder-img" width="100" height="auto" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false" >

        </div>
      </div>
    </div>
    <div class="col-md-6">
      <div class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-200 position-relative">
        <div class="col p-2 d-flex flex-column position-static">
          <strong class="d-inline-block mb-2 text-success">경력사항</strong>
          <h3 class="mb-0"></h3>
          <div class="mb-1 text-muted"></div>
          <p class="mb-auto">2012.12 ~ 2013.01 마우나 리조트<br> 눈썰매장 썰매 정리 및 운영</p> <br>
          <p class="mb-auto">2017.07 ~ 2017.08 마우나 리조트<br> 마트  수박 진열 및 판매 </p> <br>
          <p class="mb-auto">2020.03 ~ 2021.07 울산과학기술원<br> 주차관제 시스템 ,CCTV,출입통제</p>
          
        </div>
        <div class="col-auto d-none d-lg-block">
          
		  <img src="../resources/img/alba.png" width="125px" height= "auto">
          <svg class="bd-placeholder-img" width="200" height="200" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false" >
        </div>
      </div>
    </div>
  </div>

	<%@ include file="./header&footer/footer.jsp" %>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    
  </body>
</html>
