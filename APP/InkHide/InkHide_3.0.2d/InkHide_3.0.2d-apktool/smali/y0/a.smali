.class public final Ly0/a;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final a:LG/d;

.field public final synthetic b:Ly0/d;


# direct methods
.method public constructor <init>(Ly0/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ly0/a;->b:Ly0/d;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, LG/d;

    .line 7
    .line 8
    const/16 v0, 0x1d

    .line 9
    .line 10
    invoke-direct {p1, v0}, LG/d;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ly0/a;->a:LG/d;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v0, "webViewLinker onLoadResource "

    .line 7
    .line 8
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "d"

    .line 19
    .line 20
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "d"

    .line 5
    .line 6
    const-string v0, "onPageFinished"

    .line 7
    .line 8
    filled-new-array {p1, v0, p2}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ly0/a;->b:Ly0/d;

    .line 16
    .line 17
    iget-object p1, p1, Ly0/d;->a:Ly0/e;

    .line 18
    .line 19
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    const-string v0, "d"

    .line 2
    .line 3
    const-string v1, "onPageStarted"

    .line 4
    .line 5
    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "d"

    const-string p3, "onReceivedError"

    filled-new-array {p2, p3, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    if-eqz p2, :cond_0

    .line 4
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "d"

    const-string p3, "onReceivedError"

    filled-new-array {p2, p3, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    const-string p2, "d"

    .line 13
    .line 14
    const-string v0, "onReceivedHttpError"

    .line 15
    .line 16
    filled-new-array {p2, v0, p1, p3}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 4
    .line 5
    .line 6
    :cond_0
    const-string p1, "d"

    .line 7
    .line 8
    const-string p2, "onReceivedSslError"

    .line 9
    .line 10
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "d"

    .line 7
    .line 8
    const-string v1, "shouldInterceptRequest"

    .line 9
    .line 10
    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 7

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "d"

    .line 12
    .line 13
    const-string v1, "shouldOverrideUrlLoading"

    .line 14
    .line 15
    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Ly0/a;->a:LG/d;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    if-eqz v1, :cond_4

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    :cond_0
    const-string v2, ""

    .line 46
    .line 47
    :cond_1
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "toLowerCase(...)"

    .line 54
    .line 55
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-string v4, "toString(...)"

    .line 63
    .line 64
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/16 v4, 0x42

    .line 68
    .line 69
    const-string v5, "https?://.+\\.(?:apk|zip|rar|gzip)"

    .line 70
    .line 71
    invoke-static {v5, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v5, "compile(...)"

    .line 76
    .line 77
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    const/4 v4, 0x0

    .line 89
    const-string v5, "getContext(...)"

    .line 90
    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {p1, p2, v4}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const-string v6, "maskwechat"

    .line 113
    .line 114
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_3

    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const-string v6, "com.lu.wxmask"

    .line 125
    .line 126
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    const-string p2, "webView appLink:"

    .line 133
    .line 134
    filled-new-array {v0, p2, v1}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-static {p2}, Li0/a;->c([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {p1, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-static {p1, p2, v4}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_3
    const-string v0, "https"

    .line 157
    .line 158
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_4

    .line 163
    .line 164
    const-string v0, "about"

    .line 165
    .line 166
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_4

    .line 171
    .line 172
    :goto_0
    const/4 p1, 0x1

    .line 173
    return p1

    .line 174
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    return p1
.end method
