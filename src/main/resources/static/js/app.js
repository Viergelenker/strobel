/**
 * Created by Julien on 19.07.16.
 */
$(document).foundation();

// ===== Scroll to Top ====
$(window).scroll(function () {
    if ($(this).scrollTop() >= 100) {        // If page is scrolled more than 100px
        $('#return-to-top').fadeIn(200);    // Fade in the arrow
    } else {
        $('#return-to-top').fadeOut(200);   // Else fade out the arrow
    }
});
$('#return-to-top').click(function () {      // When arrow is clicked
    $('body,html').animate({
        scrollTop: 0                       // Scroll to top of body
    }, 500);
});


$(document).ready(function(){
    $('.carousel').slick({
        autoplay: true,
        infinite: true,
        autoplaySpeed: 5000,
});
});