function handleLogin(event)
{
	event.preventDefault(); //Prevent the form to refreshing the page
	const uName = document.getElementById('username').value;
	const pwd = document.getElementById('password').value;
	
	//Logic to send data from html to js 
	fetch('/loginsubmit',{
		method: 'POST',
		headers:{
			'Content-Type':'application/json',
		},
		body:JSON.stringify({username:uName,password:pwd})
	
	})
	.then(response => response.json())
	.then(data => {
	document.getElementById('LoginID').style.display='none';
	document.getElementById('responseMessage').innerText = data.message;
	
	})
	.catch(error => console.error('Error:', error));
	
}