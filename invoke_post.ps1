$headers = New-Object "System.Collections.Generic.Dictionary[[String],[String]]"
$headers.Add("Content-Type", "application/json")
$body = "{`n `"name`": `"Bruce`" `n}"
$response = Invoke-RestMethod 'http://localhost:8080/hi/deepak?location=Powai' -Method 'POST' -Headers $headers -Body $body
$response | ConvertTo-Json