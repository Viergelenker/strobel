$(document).foundation(), $(window).scroll(function () {
    $(this).scrollTop() >= 100 ? $("#return-to-top").fadeIn(200) : $("#return-to-top").fadeOut(200)
}), $("#return-to-top").click(function () {
    $("body,html").animate({scrollTop: 0}, 500)
}), $(document).ready(function () {
    $(".carousel").slick({autoplay: !0, infinite: !0, autoplaySpeed: 5e3, arrows: false})
});