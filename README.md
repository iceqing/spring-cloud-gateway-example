
```
wrk -t25 -c 1000 -d 10s http://127.0.0.1:8080/a/ping
```

**test result**

```
Running 10s test @ http://127.0.0.1:8080/a/ping
  25 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.21s   361.54ms   2.00s    64.56%
    Req/Sec    26.20     22.45   131.00     76.98%
  4036 requests in 10.09s, 705.82KB read
  Socket errors: connect 4, read 0, write 0, timeout 1090
  Non-2xx or 3xx responses: 1546
Requests/sec:    400.04
Transfer/sec:     69.96KB

```