$(function() {

	// solving the Active problam
	switch (menu) {

	case 'About us':
		$('#about').addClass('active');
		break;

	case 'Contact us':
		$('#contact').addClass('active');
		break;
		
	case 'All Products':
		$('#listProduct').addClass('active');
		break;

	default:
		$('#catgeory').addClass('active');
	    $('#a_'+menu).addClass('active');
		break;
	}
});