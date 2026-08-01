.class public abstract Lu0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/content/Intent;

    .line 7
    .line 8
    const-class v1, Lcom/lu/wxmask/ui/MainActivity;

    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    const/high16 v1, 0x10000000

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    const-string v1, "data"

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v0, "App Route"

    .line 7
    .line 8
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "maskwechat"

    .line 29
    .line 30
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "com.lu.wxmask"

    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    move v3, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    move v3, v1

    .line 51
    :goto_1
    if-eqz v3, :cond_5

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v4, 0x2

    .line 62
    if-ne v3, v4, :cond_4

    .line 63
    .line 64
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    const-string v3, ""

    .line 71
    .line 72
    if-nez v1, :cond_2

    .line 73
    .line 74
    move-object v1, v3

    .line 75
    :cond_2
    :try_start_1
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Ljava/lang/String;

    .line 80
    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v3, p1

    .line 85
    :goto_2
    invoke-static {p0, v0, v1, v3}, Lu0/a;->d(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    const-string p1, "is Mask App link ,but pathSegments\u2018s size is not match. Jump to main Page"

    .line 92
    .line 93
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0, v0}, Lu0/a;->a(Landroid/content/Context;Landroid/net/Uri;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0, v0, p1}, Lu0/a;->c(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_3
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    if-eqz p2, :cond_6

    .line 119
    .line 120
    invoke-interface {p2, p0}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :cond_6
    return-void
.end method

.method public static c(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "http"

    .line 6
    .line 7
    invoke-static {v0, v1}, LU0/q;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "https"

    .line 18
    .line 19
    invoke-static {v0, v1}, LU0/q;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x4

    .line 27
    invoke-static {p2, p1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    new-instance p2, Landroid/content/Intent;

    .line 33
    .line 34
    const-string v0, "android.intent.action.VIEW"

    .line 35
    .line 36
    invoke-direct {p2, v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 37
    .line 38
    .line 39
    const-string p1, "android.intent.category.BROWSABLE"

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-object p1, p2

    .line 45
    :goto_1
    const/4 p2, 0x0

    .line 46
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    const/high16 p2, 0x10000000

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static d(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "feat"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const-string p1, "checkAppUpdate"

    .line 10
    .line 11
    invoke-virtual {p3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    new-instance p1, Lx0/b;

    .line 18
    .line 19
    invoke-direct {p1}, Lx0/b;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string p2, "context"

    .line 23
    .line 24
    invoke-static {p0, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-boolean p2, p1, Lx0/b;->d:Z

    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_0
    const/4 p2, 0x1

    .line 34
    iput-boolean p2, p1, Lx0/b;->d:Z

    .line 35
    .line 36
    sget-object p3, Lz0/d;->a:Lz0/c;

    .line 37
    .line 38
    new-instance v0, Lo0/a;

    .line 39
    .line 40
    const-string v1, "\u672a\u68c0\u67e5\u5230\u65b0\u7248\u672c"

    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    invoke-direct {v0, p1, p0, v1, v2}, Lo0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    new-instance p0, LC/d;

    .line 47
    .line 48
    const/16 p1, 0xe

    .line 49
    .line 50
    invoke-direct {p0, p1, v0}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, p2, p0}, Lz0/c;->h(ZLM0/l;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    const-string p0, "donate"

    .line 58
    .line 59
    invoke-virtual {p3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    const-string p0, "Good good study, day day up."

    .line 66
    .line 67
    invoke-static {p0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    const-string p0, "for mask link featGroup not impl"

    .line 72
    .line 73
    filled-new-array {p3, p0}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    const-string v0, "page"

    .line 82
    .line 83
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_16

    .line 88
    .line 89
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    const v0, -0x741c88a2

    .line 94
    .line 95
    .line 96
    const/high16 v1, 0x10000000

    .line 97
    .line 98
    const-class v2, Lcom/lu/wxmask/ui/WebViewActivity;

    .line 99
    .line 100
    const-string v3, "isDialog"

    .line 101
    .line 102
    const-string v4, "url"

    .line 103
    .line 104
    const-string v5, "forceHtml"

    .line 105
    .line 106
    const-string v6, "title"

    .line 107
    .line 108
    if-eq p2, v0, :cond_12

    .line 109
    .line 110
    const v0, 0x3305b9

    .line 111
    .line 112
    .line 113
    if-eq p2, v0, :cond_10

    .line 114
    .line 115
    const v0, 0x48ecb019

    .line 116
    .line 117
    .line 118
    if-eq p2, v0, :cond_4

    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :cond_4
    const-string p2, "webView"

    .line 123
    .line 124
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-nez p2, :cond_5

    .line 129
    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :cond_5
    invoke-virtual {p1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    const/4 p3, 0x0

    .line 137
    if-eqz p2, :cond_6

    .line 138
    .line 139
    invoke-static {p2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    goto :goto_0

    .line 148
    :cond_6
    move-object p2, p3

    .line 149
    :goto_0
    if-nez p2, :cond_7

    .line 150
    .line 151
    const-string p2, ""

    .line 152
    .line 153
    :cond_7
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_8

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    :try_start_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 161
    .line 162
    .line 163
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    goto :goto_1

    .line 165
    :catchall_0
    move-exception p2

    .line 166
    new-instance v0, LE0/d;

    .line 167
    .line 168
    invoke-direct {v0, p2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    move-object p2, v0

    .line 172
    :goto_1
    nop

    .line 173
    instance-of v0, p2, LE0/d;

    .line 174
    .line 175
    if-eqz v0, :cond_9

    .line 176
    .line 177
    move-object p2, p3

    .line 178
    :cond_9
    check-cast p2, Landroid/net/Uri;

    .line 179
    .line 180
    if-nez p2, :cond_a

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_a
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    const-string v7, "https"

    .line 188
    .line 189
    invoke-static {v0, v7}, LU0/q;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_d

    .line 194
    .line 195
    invoke-virtual {p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_d

    .line 200
    .line 201
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_b

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_b
    invoke-virtual {p2}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_c

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_c
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    :cond_d
    :goto_2
    if-nez p3, :cond_e

    .line 220
    .line 221
    const-string p0, "\u94fe\u63a5\u65e0\u6548\u6216\u4e0d\u5b89\u5168"

    .line 222
    .line 223
    invoke-static {p0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_e
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    invoke-static {p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-eqz p2, :cond_f

    .line 236
    .line 237
    new-instance p2, Lv0/d;

    .line 238
    .line 239
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {p1, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-direct {p2, p0, p3, v0, p1}, Lv0/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2}, Landroid/app/Dialog;->show()V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_f
    new-instance p2, Landroid/content/Intent;

    .line 259
    .line 260
    invoke-direct {p2, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2, v4, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p3

    .line 273
    invoke-virtual {p2, v6, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    invoke-virtual {p2, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 288
    .line 289
    .line 290
    :goto_3
    return-void

    .line 291
    :cond_10
    const-string p2, "main"

    .line 292
    .line 293
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result p2

    .line 297
    if-nez p2, :cond_11

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_11
    invoke-static {p0, p1}, Lu0/a;->a(Landroid/content/Context;Landroid/net/Uri;)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :cond_12
    const-string p2, "releasesNote"

    .line 305
    .line 306
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result p2

    .line 310
    if-nez p2, :cond_13

    .line 311
    .line 312
    :goto_4
    const-string p0, "for mask link pageGroup not impl"

    .line 313
    .line 314
    filled-new-array {p3, p0}, [Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_13
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    invoke-static {p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    sget-object p3, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 331
    .line 332
    invoke-virtual {p3}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->getReleaseNoteWebUrl()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p3

    .line 336
    const/16 v0, 0x42

    .line 337
    .line 338
    const-string v3, "https?://.+\\.html"

    .line 339
    .line 340
    invoke-static {v3, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    const-string v3, "compile(...)"

    .line 345
    .line 346
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    const-string v3, "input"

    .line 350
    .line 351
    invoke-static {p3, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz p2, :cond_15

    .line 363
    .line 364
    new-instance p2, Lv0/d;

    .line 365
    .line 366
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    if-nez p1, :cond_14

    .line 371
    .line 372
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 377
    .line 378
    :cond_14
    invoke-direct {p2, p0, p3, p1, v0}, Lv0/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p2}, Landroid/app/Dialog;->show()V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :cond_15
    new-instance p2, Landroid/content/Intent;

    .line 386
    .line 387
    invoke-direct {p2, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 391
    .line 392
    .line 393
    invoke-virtual {p2, v4, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    invoke-virtual {p2, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 401
    .line 402
    .line 403
    invoke-virtual {p2, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 404
    .line 405
    .line 406
    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :cond_16
    const-string p0, "for mask link \'s group not impl"

    .line 411
    .line 412
    filled-new-array {p2, p0}, [Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    return-void
.end method
