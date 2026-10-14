fetch('http://localhost:6061/api/v1/customer')
    .then(response => response.json())
    .then(data => console.log(JSON.stringify(data, null, 2)));