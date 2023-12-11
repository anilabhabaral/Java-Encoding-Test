DemoShowDefaultCharset lists all the charsets that can be used: java DemoShowDefaultCharset
```
$java DemoShowDefaultCharset

Big5
Big5-HKSCS
CESU-8
EUC-JP
EUC-KR
GB18030
GB2312
GBK
IBM-Thai
IBM00858
IBM01140
IBM01141
IBM01142
IBM01143
```
```
$ java TestDefaultCharset 

My project encoding is : UTF-8
My project encoding is : UTF-8
```

```
$ java -Dfile.encoding=ASCII TestDefaultCharset 

My project encoding is : US-ASCII
My project encoding is : US-ASCII
```
