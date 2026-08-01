.class public final Ly0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public a:Ly0/e;

.field public final b:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroid/webkit/WebView;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ly0/d;->b:Landroid/webkit/WebView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 43
    .line 44
    .line 45
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v2, 0x21

    .line 48
    .line 49
    if-lt v1, v2, :cond_0

    .line 50
    .line 51
    invoke-static {p1}, Lt0/a;->c(Landroid/webkit/WebSettings;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    new-instance p1, Ly0/a;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Ly0/a;-><init>(Ly0/d;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Ly0/c;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Ly0/c;-><init>(Ly0/d;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ly0/e;)V
    .locals 9

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ly0/d;->a:Ly0/e;

    .line 7
    .line 8
    :try_start_0
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p2, v0

    .line 23
    new-instance v0, LE0/d;

    .line 24
    .line 25
    invoke-direct {v0, p2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p2, v0

    .line 29
    :goto_0
    nop

    .line 30
    instance-of v0, p2, LE0/d;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    move-object p2, v1

    .line 36
    :cond_0
    check-cast p2, Landroid/net/Uri;

    .line 37
    .line 38
    iget-object v2, p0, Ly0/d;->b:Landroid/webkit/WebView;

    .line 39
    .line 40
    const-string v8, "d"

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v3, "https"

    .line 49
    .line 50
    invoke-static {v0, v3}, LU0/q;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p2}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_9

    .line 83
    .line 84
    :cond_2
    :goto_1
    const-string v3, "about:blank"

    .line 85
    .line 86
    if-eqz p2, :cond_9

    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v4, "file"

    .line 93
    .line 94
    invoke-static {v0, v4}, LU0/q;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_9

    .line 99
    .line 100
    :try_start_1
    new-instance p1, Ljava/io/File;

    .line 101
    .line 102
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-nez v0, :cond_3

    .line 107
    .line 108
    const-string v0, ""

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_1
    move-exception v0

    .line 112
    move-object p1, v0

    .line 113
    goto :goto_3

    .line 114
    :cond_3
    :goto_2
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 118
    .line 119
    .line 120
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    goto :goto_4

    .line 122
    :goto_3
    new-instance v0, LE0/d;

    .line 123
    .line 124
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    move-object p1, v0

    .line 128
    :goto_4
    nop

    .line 129
    instance-of v0, p1, LE0/d;

    .line 130
    .line 131
    if-eqz v0, :cond_4

    .line 132
    .line 133
    move-object p1, v1

    .line 134
    :cond_4
    check-cast p1, Ljava/io/File;

    .line 135
    .line 136
    :try_start_2
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 145
    .line 146
    .line 147
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 148
    goto :goto_5

    .line 149
    :catchall_2
    move-exception v0

    .line 150
    new-instance v4, LE0/d;

    .line 151
    .line 152
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    move-object v0, v4

    .line 156
    :goto_5
    nop

    .line 157
    instance-of v4, v0, LE0/d;

    .line 158
    .line 159
    if-eqz v4, :cond_5

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_5
    move-object v1, v0

    .line 163
    :goto_6
    check-cast v1, Ljava/io/File;

    .line 164
    .line 165
    if-eqz p1, :cond_8

    .line 166
    .line 167
    if-eqz v1, :cond_8

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const-string v4, "getPath(...)"

    .line 174
    .line 175
    invoke-static {v0, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 183
    .line 184
    new-instance v5, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const/4 v4, 0x0

    .line 200
    invoke-static {v0, v4, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-nez v0, :cond_6

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_6
    :try_start_3
    sget-object v0, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 214
    .line 215
    invoke-static {p1, v0}, LD/h;->O(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 219
    goto :goto_7

    .line 220
    :catchall_3
    move-exception v0

    .line 221
    new-instance v1, LE0/d;

    .line 222
    .line 223
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    move-object v0, v1

    .line 227
    :goto_7
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    if-nez v1, :cond_7

    .line 232
    .line 233
    move-object v4, v0

    .line 234
    check-cast v4, Ljava/lang/String;

    .line 235
    .line 236
    const-string v6, "utf-8"

    .line 237
    .line 238
    const/4 v7, 0x0

    .line 239
    const-string v3, "https://local.inkhide.invalid/"

    .line 240
    .line 241
    const-string v5, "text/html"

    .line 242
    .line 243
    invoke-virtual/range {v2 .. v7}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_7
    const-string v0, "read local webview file fail"

    .line 248
    .line 249
    filled-new-array {v8, v0, p1, v1}, [Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_8
    :goto_8
    const-string p1, "blocked unsafe local webview file"

    .line 261
    .line 262
    filled-new-array {v8, p1, p2}, [Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_9
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_a

    .line 278
    .line 279
    invoke-virtual {v2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_a
    const-string v0, "blocked unsafe webview url"

    .line 284
    .line 285
    filled-new-array {v8, v0, p1}, [Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    :goto_9
    const-string p1, "webview load url:"

    .line 296
    .line 297
    filled-new-array {v8, p1, p2}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-static {p1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    return-void
.end method
