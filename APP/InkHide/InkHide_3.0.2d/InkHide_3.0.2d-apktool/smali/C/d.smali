.class public final synthetic LC/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements LM0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC/d;->a:I

    iput-object p2, p0, LC/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LC/j;ILandroid/os/Bundle;)Z
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    and-int/2addr p2, v2

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    :try_start_0
    iget-object p2, p1, LC/j;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, LC/i;

    .line 14
    .line 15
    invoke-interface {p2}, LC/i;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    iget-object p2, p1, LC/j;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, LC/i;

    .line 21
    .line 22
    invoke-interface {p2}, LC/i;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Landroid/os/Parcelable;

    .line 27
    .line 28
    if-nez p3, :cond_0

    .line 29
    .line 30
    new-instance p3, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    move-object p3, v1

    .line 42
    :goto_0
    const-string v1, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 43
    .line 44
    invoke-virtual {p3, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catch_0
    move-exception p1

    .line 49
    const-string p2, "InputConnectionCompat"

    .line 50
    .line 51
    const-string p3, "Can\'t insert content from IME; requestPermission() failed"

    .line 52
    .line 53
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 58
    .line 59
    iget-object v1, p1, LC/j;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, LC/i;

    .line 62
    .line 63
    invoke-interface {v1}, LC/i;->a()Landroid/content/ClipDescription;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v3, Landroid/content/ClipData$Item;

    .line 68
    .line 69
    iget-object p1, p1, LC/j;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, LC/i;

    .line 72
    .line 73
    invoke-interface {p1}, LC/i;->e()Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-direct {v3, v4}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p2, v1, v3}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 81
    .line 82
    .line 83
    const/16 v1, 0x1f

    .line 84
    .line 85
    const/4 v3, 0x2

    .line 86
    if-lt v0, v1, :cond_2

    .line 87
    .line 88
    new-instance v0, LC/j;

    .line 89
    .line 90
    invoke-direct {v0, p2, v3}, LC/j;-><init>(Landroid/content/ClipData;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    new-instance v0, Ly/e;

    .line 95
    .line 96
    invoke-direct {v0}, Ly/e;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p2, v0, Ly/e;->c:Landroid/content/ClipData;

    .line 100
    .line 101
    iput v3, v0, Ly/e;->d:I

    .line 102
    .line 103
    :goto_2
    invoke-interface {p1}, LC/i;->c()Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {v0, p1}, Ly/d;->c(Landroid/net/Uri;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0, p3}, Ly/d;->a(Landroid/os/Bundle;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Ly/d;->k()Ly/g;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object p2, p0, LC/d;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p2, Li/v;

    .line 120
    .line 121
    invoke-static {p2, p1}, Ly/L;->f(Landroid/view/View;Ly/g;)Ly/g;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-nez p1, :cond_3

    .line 126
    .line 127
    return v2

    .line 128
    :cond_3
    :goto_3
    const/4 p1, 0x0

    .line 129
    return p1
.end method

.method public b()Ljava/lang/Object;
    .locals 2

    .line 1
    sget v0, Lcom/lu/wxmask/ui/WebViewActivity;->x:I

    .line 2
    .line 3
    new-instance v0, Ly0/d;

    .line 4
    .line 5
    iget-object v1, p0, LC/d;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/lu/wxmask/ui/WebViewActivity;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ly0/d;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    const-string v0, "recyclerEntryNames"

    .line 2
    .line 3
    const-string v1, "dataFieldNames"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const-string v4, "adapterClassNames"

    .line 9
    .line 10
    const-string v5, "activityClassNames"

    .line 11
    .line 12
    const-string v6, "getSharedPreferences(...)"

    .line 13
    .line 14
    const-string v7, "hook_point_cache"

    .line 15
    .line 16
    const-string v8, "put(...)"

    .line 17
    .line 18
    const-string v9, "appContext"

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x1

    .line 23
    iget v13, p0, LC/d;->a:I

    .line 24
    .line 25
    packed-switch v13, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    check-cast p1, Lz0/b;

    .line 29
    .line 30
    const-string v0, "result"

    .line 31
    .line 32
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, LA0/m;

    .line 36
    .line 37
    iget-object v1, p0, LC/d;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, LM0/l;

    .line 40
    .line 41
    const/16 v2, 0xf

    .line 42
    .line 43
    invoke-direct {v0, v1, p1, v2}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lk0/b;->d:LC/j;

    .line 47
    .line 48
    iget-object p1, p1, LC/j;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lk0/a;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lk0/a;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    sget-object p1, LE0/i;->a:LE0/i;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, LC/d;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Ls0/G;

    .line 66
    .line 67
    iget-object v0, v0, Ls0/G;->e:LM0/l;

    .line 68
    .line 69
    invoke-interface {v0, p1}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p1, LE0/i;->a:LE0/i;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_1
    check-cast p1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 76
    .line 77
    const-string v0, "item"

    .line 78
    .line 79
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Lz0/l;->a:Landroid/util/LruCache;

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-object v0, p0, LC/d;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroid/app/Activity;

    .line 91
    .line 92
    if-eqz p1, :cond_0

    .line 93
    .line 94
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    :cond_0
    if-nez v11, :cond_1

    .line 103
    .line 104
    move-object v11, v2

    .line 105
    :cond_1
    invoke-static {v11}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    sget-object v1, LE0/i;->a:LE0/i;

    .line 110
    .line 111
    if-eqz p1, :cond_2

    .line 112
    .line 113
    const-string p1, "\u5fae\u4fe1ID\u4e3a\u7a7a"

    .line 114
    .line 115
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    invoke-static {v11}, Lz0/l;->g(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, Landroid/content/Intent;

    .line 123
    .line 124
    const-string v3, "android.intent.action.OPEN_DOCUMENT"

    .line 125
    .line 126
    invoke-direct {p1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-string v3, "android.intent.category.OPENABLE"

    .line 130
    .line 131
    invoke-virtual {p1, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    .line 133
    .line 134
    const-string v3, "image/*"

    .line 135
    .line 136
    invoke-virtual {p1, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v12}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 140
    .line 141
    .line 142
    const/16 v3, 0x40

    .line 143
    .line 144
    invoke-virtual {p1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    const/16 v3, 0x5721

    .line 148
    .line 149
    :try_start_0
    invoke-virtual {v0, p1, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    move-object v0, v1

    .line 153
    goto :goto_0

    .line 154
    :catchall_0
    move-exception p1

    .line 155
    new-instance v0, LE0/d;

    .line 156
    .line 157
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :goto_0
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-eqz p1, :cond_3

    .line 165
    .line 166
    invoke-static {v2}, Lz0/l;->g(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v0, "launch custom avatar picker fail"

    .line 170
    .line 171
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    const-string p1, "\u6253\u5f00\u56fe\u7247\u9009\u62e9\u5931\u8d25"

    .line 179
    .line 180
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :cond_3
    :goto_1
    return-object v1

    .line 184
    :pswitch_2
    check-cast p1, Lt0/c;

    .line 185
    .line 186
    const-string v0, "it"

    .line 187
    .line 188
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, LC/d;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, Ls0/l;

    .line 194
    .line 195
    invoke-virtual {p1}, Ls0/l;->d()V

    .line 196
    .line 197
    .line 198
    sget-object p1, LE0/i;->a:LE0/i;

    .line 199
    .line 200
    return-object p1

    .line 201
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 202
    .line 203
    if-eqz p1, :cond_4

    .line 204
    .line 205
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    :cond_4
    if-eqz v11, :cond_6

    .line 214
    .line 215
    invoke-static {v11}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_5

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_5
    iget-object p1, p0, LC/d;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 225
    .line 226
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {v11, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-nez p1, :cond_6

    .line 235
    .line 236
    move v10, v12

    .line 237
    :cond_6
    :goto_2
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    return-object p1

    .line 242
    :pswitch_4
    check-cast p1, Landroid/content/Context;

    .line 243
    .line 244
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {}, LA0/k;->a()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_7

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-eqz v0, :cond_8

    .line 259
    .line 260
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_8
    move-object v0, v11

    .line 264
    :goto_3
    if-eqz v0, :cond_c

    .line 265
    .line 266
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_9

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_9
    :try_start_1
    new-instance v2, LA0/h;

    .line 274
    .line 275
    const/16 v9, 0xa

    .line 276
    .line 277
    invoke-direct {v2, p1, v9}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0, v2}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    check-cast p1, LA0/b0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :catchall_1
    move-exception p1

    .line 288
    new-instance v0, LE0/d;

    .line 289
    .line 290
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    move-object p1, v0

    .line 294
    :goto_4
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    if-eqz v0, :cond_a

    .line 299
    .line 300
    const-string v2, "text status dexkit resolve fail"

    .line 301
    .line 302
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    :cond_a
    instance-of v0, p1, LE0/d;

    .line 310
    .line 311
    if-eqz v0, :cond_b

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_b
    move-object v11, p1

    .line 315
    :goto_5
    check-cast v11, LA0/b0;

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_c
    :goto_6
    const-string p1, "text status dexkit apk path empty"

    .line 319
    .line 320
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :goto_7
    if-eqz v11, :cond_d

    .line 328
    .line 329
    new-instance p1, Lorg/json/JSONObject;

    .line 330
    .line 331
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 332
    .line 333
    .line 334
    iget-object v0, v11, LA0/b0;->a:Ljava/util/List;

    .line 335
    .line 336
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {p1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    iget-object v0, v11, LA0/b0;->b:Ljava/util/List;

    .line 345
    .line 346
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {p1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    iget-object v0, v11, LA0/b0;->c:Ljava/util/List;

    .line 355
    .line 356
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    iget-object v0, v11, LA0/b0;->d:Ljava/util/List;

    .line 365
    .line 366
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    const-string v1, "groupItemClassNames"

    .line 371
    .line 372
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iget-object v0, v11, LA0/b0;->e:Ljava/util/List;

    .line 377
    .line 378
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    const-string v1, "titleItemClassNames"

    .line 383
    .line 384
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    iget-object v0, v11, LA0/b0;->f:Ljava/util/List;

    .line 389
    .line 390
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    const-string v1, "mainRecyclerEntryNames"

    .line 395
    .line 396
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    iget-object v0, v11, LA0/b0;->g:Ljava/util/List;

    .line 401
    .line 402
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    const-string v1, "titleEntryNames"

    .line 407
    .line 408
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    iget-object v0, v11, LA0/b0;->h:Ljava/util/List;

    .line 413
    .line 414
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    const-string v1, "avatarContainerEntryNames"

    .line 419
    .line 420
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    invoke-static {p1, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-static {p1, v3}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v0, v7, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    const-string v1, "text_status_v1"

    .line 447
    .line 448
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 457
    .line 458
    .line 459
    iget-object p1, p0, LC/d;->b:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast p1, Lr0/D1;

    .line 462
    .line 463
    iput-object v11, p1, Lr0/D1;->m:LA0/b0;

    .line 464
    .line 465
    const-string p1, "text_status_scan_status_v1"

    .line 466
    .line 467
    invoke-static {p1, v12}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 468
    .line 469
    .line 470
    new-instance p1, LA0/t;

    .line 471
    .line 472
    const-string v0, "\u5df2\u627e\u5230\u72b6\u6001\u9875\u7ed3\u6784"

    .line 473
    .line 474
    invoke-direct {p1, v12, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 475
    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_d
    new-instance p1, LA0/t;

    .line 479
    .line 480
    const-string v0, "\u672a\u627e\u5230\u72b6\u6001\u9875\u7ed3\u6784"

    .line 481
    .line 482
    invoke-direct {p1, v10, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 483
    .line 484
    .line 485
    :goto_8
    return-object p1

    .line 486
    :pswitch_5
    check-cast p1, Landroid/widget/TextView;

    .line 487
    .line 488
    const-string v0, "textView"

    .line 489
    .line 490
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    if-eqz p1, :cond_e

    .line 498
    .line 499
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v11

    .line 503
    :cond_e
    if-nez v11, :cond_f

    .line 504
    .line 505
    goto :goto_9

    .line 506
    :cond_f
    move-object v2, v11

    .line 507
    :goto_9
    const-string p1, "\u9471\u5a42\u3049\u7481\u677f\u7d8d\u7ecc\u6d2a\u68ff\u7ee0\uff04\u608a"

    .line 508
    .line 509
    invoke-static {v2, p1, v10}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 510
    .line 511
    .line 512
    move-result p1

    .line 513
    if-nez p1, :cond_10

    .line 514
    .line 515
    const-string p1, "\u7ee0\uff04\u608a\u9471\u5a42\u3049\u7481\u677f\u7d8d"

    .line 516
    .line 517
    invoke-static {v2, p1, v10}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 518
    .line 519
    .line 520
    move-result p1

    .line 521
    if-eqz p1, :cond_11

    .line 522
    .line 523
    :cond_10
    iget-object p1, p0, LC/d;->b:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast p1, LN0/k;

    .line 526
    .line 527
    iput-boolean v12, p1, LN0/k;->a:Z

    .line 528
    .line 529
    :cond_11
    sget-object p1, LE0/i;->a:LE0/i;

    .line 530
    .line 531
    return-object p1

    .line 532
    :pswitch_6
    iget-object v0, p0, LC/d;->b:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v0, Lr0/f1;

    .line 535
    .line 536
    check-cast p1, Landroid/content/Context;

    .line 537
    .line 538
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    sget-object v1, LA0/Y;->a:Ljava/util/List;

    .line 542
    .line 543
    invoke-static {}, LA0/k;->a()Z

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    if-nez v1, :cond_12

    .line 548
    .line 549
    goto :goto_e

    .line 550
    :cond_12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    if-eqz v1, :cond_13

    .line 555
    .line 556
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 557
    .line 558
    goto :goto_a

    .line 559
    :cond_13
    move-object v1, v11

    .line 560
    :goto_a
    if-eqz v1, :cond_17

    .line 561
    .line 562
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-eqz v2, :cond_14

    .line 567
    .line 568
    goto :goto_d

    .line 569
    :cond_14
    :try_start_2
    new-instance v2, LA0/h;

    .line 570
    .line 571
    invoke-direct {v2, p1}, LA0/h;-><init>(Landroid/content/Context;)V

    .line 572
    .line 573
    .line 574
    invoke-static {v1, v2}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    check-cast p1, LA0/W;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 579
    .line 580
    goto :goto_b

    .line 581
    :catchall_2
    move-exception p1

    .line 582
    new-instance v1, LE0/d;

    .line 583
    .line 584
    invoke-direct {v1, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 585
    .line 586
    .line 587
    move-object p1, v1

    .line 588
    :goto_b
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    if-eqz v1, :cond_15

    .line 593
    .line 594
    const-string v2, "sns dexkit resolve fail"

    .line 595
    .line 596
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    :cond_15
    instance-of v1, p1, LE0/d;

    .line 604
    .line 605
    if-eqz v1, :cond_16

    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_16
    move-object v11, p1

    .line 609
    :goto_c
    check-cast v11, LA0/W;

    .line 610
    .line 611
    goto :goto_e

    .line 612
    :cond_17
    :goto_d
    const-string p1, "sns dexkit apk path empty"

    .line 613
    .line 614
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object p1

    .line 618
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    :goto_e
    if-eqz v11, :cond_18

    .line 622
    .line 623
    new-instance p1, Lorg/json/JSONObject;

    .line 624
    .line 625
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 626
    .line 627
    .line 628
    iget-object v1, v11, LA0/W;->a:Ljava/util/List;

    .line 629
    .line 630
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    const-string v2, "timelineClassNames"

    .line 635
    .line 636
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 637
    .line 638
    .line 639
    move-result-object p1

    .line 640
    iget-object v1, v11, LA0/W;->b:Ljava/util/List;

    .line 641
    .line 642
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    const-string v2, "snsObjectProviderClassNames"

    .line 647
    .line 648
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 649
    .line 650
    .line 651
    move-result-object p1

    .line 652
    iget-object v1, v11, LA0/W;->c:Ljava/util/List;

    .line 653
    .line 654
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    const-string v2, "detailActivityClassNames"

    .line 659
    .line 660
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 661
    .line 662
    .line 663
    move-result-object p1

    .line 664
    iget-object v1, v11, LA0/W;->d:Ljava/util/List;

    .line 665
    .line 666
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    const-string v2, "selfAlbumAdapterClassNames"

    .line 671
    .line 672
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 673
    .line 674
    .line 675
    move-result-object p1

    .line 676
    iget-object v1, v11, LA0/W;->e:Ljava/util/List;

    .line 677
    .line 678
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    const-string v2, "snsInfoUserFieldNames"

    .line 683
    .line 684
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 685
    .line 686
    .line 687
    move-result-object p1

    .line 688
    iget-object v1, v11, LA0/W;->f:Ljava/util/List;

    .line 689
    .line 690
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    const-string v2, "snsInfoSnsIdFieldNames"

    .line 695
    .line 696
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 697
    .line 698
    .line 699
    move-result-object p1

    .line 700
    iget-object v1, v11, LA0/W;->g:Ljava/util/List;

    .line 701
    .line 702
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    const-string v2, "snsInfoLocalIdFieldNames"

    .line 707
    .line 708
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 709
    .line 710
    .line 711
    move-result-object p1

    .line 712
    iget-object v1, v11, LA0/W;->h:Ljava/util/List;

    .line 713
    .line 714
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    const-string v2, "timeLineObjectUserFieldNames"

    .line 719
    .line 720
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 721
    .line 722
    .line 723
    move-result-object p1

    .line 724
    iget-object v1, v11, LA0/W;->i:Ljava/util/List;

    .line 725
    .line 726
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    const-string v2, "snsObjectExtFlagFieldNames"

    .line 731
    .line 732
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    iget-object v1, v11, LA0/W;->j:Ljava/util/List;

    .line 737
    .line 738
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    const-string v2, "snsObjectLikeListFieldNames"

    .line 743
    .line 744
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 745
    .line 746
    .line 747
    move-result-object p1

    .line 748
    iget-object v1, v11, LA0/W;->k:Ljava/util/List;

    .line 749
    .line 750
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    const-string v2, "snsObjectLikeCountFieldNames"

    .line 755
    .line 756
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 757
    .line 758
    .line 759
    move-result-object p1

    .line 760
    iget-object v1, v11, LA0/W;->l:Ljava/util/List;

    .line 761
    .line 762
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    const-string v2, "snsObjectLikeListCountFieldNames"

    .line 767
    .line 768
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 769
    .line 770
    .line 771
    move-result-object p1

    .line 772
    iget-object v1, v11, LA0/W;->m:Ljava/util/List;

    .line 773
    .line 774
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    const-string v2, "snsObjectCommentListFieldNames"

    .line 779
    .line 780
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 781
    .line 782
    .line 783
    move-result-object p1

    .line 784
    iget-object v1, v11, LA0/W;->n:Ljava/util/List;

    .line 785
    .line 786
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    const-string v2, "snsObjectCommentCountFieldNames"

    .line 791
    .line 792
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 793
    .line 794
    .line 795
    move-result-object p1

    .line 796
    iget-object v1, v11, LA0/W;->o:Ljava/util/List;

    .line 797
    .line 798
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    const-string v2, "snsObjectCommentListCountFieldNames"

    .line 803
    .line 804
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 805
    .line 806
    .line 807
    move-result-object p1

    .line 808
    iget-object v1, v11, LA0/W;->p:Ljava/util/List;

    .line 809
    .line 810
    invoke-static {v1}, LA0/l;->A(Ljava/util/List;)Lorg/json/JSONArray;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    const-string v2, "contextMenuCreateMethods"

    .line 815
    .line 816
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 817
    .line 818
    .line 819
    move-result-object p1

    .line 820
    iget-object v1, v11, LA0/W;->q:Ljava/util/List;

    .line 821
    .line 822
    invoke-static {v1}, LA0/l;->A(Ljava/util/List;)Lorg/json/JSONArray;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    const-string v2, "contextMenuSelectMethods"

    .line 827
    .line 828
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 829
    .line 830
    .line 831
    move-result-object p1

    .line 832
    invoke-static {p1, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    invoke-static {p1, v3}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    invoke-virtual {v1, v7, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    invoke-static {v1, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    const-string v2, "sns_moment_v2"

    .line 855
    .line 856
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object p1

    .line 860
    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 861
    .line 862
    .line 863
    move-result-object p1

    .line 864
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 865
    .line 866
    .line 867
    iput-object v11, v0, Lr0/f1;->i:LA0/W;

    .line 868
    .line 869
    sget-object p1, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 870
    .line 871
    sput-object v11, Lz0/w;->g:LA0/W;

    .line 872
    .line 873
    new-instance p1, LA0/t;

    .line 874
    .line 875
    const-string v0, "\u670b\u53cb\u5708\u9690\u85cf\u9002\u914d\u6210\u529f"

    .line 876
    .line 877
    invoke-direct {p1, v12, v0, v10}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 878
    .line 879
    .line 880
    goto :goto_f

    .line 881
    :cond_18
    new-instance p1, LA0/t;

    .line 882
    .line 883
    const-string v0, "\u670b\u53cb\u5708\u9690\u85cf\u672a\u627e\u5230\u53ef\u7528 Hook \u70b9"

    .line 884
    .line 885
    invoke-direct {p1, v10, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 886
    .line 887
    .line 888
    :goto_f
    return-object p1

    .line 889
    :pswitch_7
    check-cast p1, Ljava/lang/Class;

    .line 890
    .line 891
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 892
    .line 893
    .line 894
    iget-object v0, p0, LC/d;->b:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v0, Lr0/Y0;

    .line 897
    .line 898
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    invoke-static {p1}, Lr0/Y0;->N(Ljava/lang/Class;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    return-object p1

    .line 906
    :pswitch_8
    check-cast p1, Landroid/content/Context;

    .line 907
    .line 908
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    invoke-static {}, LA0/k;->a()Z

    .line 912
    .line 913
    .line 914
    move-result v2

    .line 915
    if-nez v2, :cond_19

    .line 916
    .line 917
    goto :goto_14

    .line 918
    :cond_19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    if-eqz v2, :cond_1a

    .line 923
    .line 924
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 925
    .line 926
    goto :goto_10

    .line 927
    :cond_1a
    move-object v2, v11

    .line 928
    :goto_10
    if-eqz v2, :cond_1e

    .line 929
    .line 930
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 931
    .line 932
    .line 933
    move-result v9

    .line 934
    if-eqz v9, :cond_1b

    .line 935
    .line 936
    goto :goto_13

    .line 937
    :cond_1b
    :try_start_3
    new-instance v9, LA0/h;

    .line 938
    .line 939
    const/4 v13, 0x5

    .line 940
    invoke-direct {v9, p1, v13}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 941
    .line 942
    .line 943
    invoke-static {v2, v9}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object p1

    .line 947
    check-cast p1, LA0/U;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 948
    .line 949
    goto :goto_11

    .line 950
    :catchall_3
    move-exception p1

    .line 951
    new-instance v2, LE0/d;

    .line 952
    .line 953
    invoke-direct {v2, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 954
    .line 955
    .line 956
    move-object p1, v2

    .line 957
    :goto_11
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    if-eqz v2, :cond_1c

    .line 962
    .line 963
    const-string v9, "recent forward dexkit resolve fail"

    .line 964
    .line 965
    filled-new-array {v9, v2}, [Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 970
    .line 971
    .line 972
    :cond_1c
    instance-of v2, p1, LE0/d;

    .line 973
    .line 974
    if-eqz v2, :cond_1d

    .line 975
    .line 976
    goto :goto_12

    .line 977
    :cond_1d
    move-object v11, p1

    .line 978
    :goto_12
    check-cast v11, LA0/U;

    .line 979
    .line 980
    goto :goto_14

    .line 981
    :cond_1e
    :goto_13
    const-string p1, "recent forward dexkit apk path empty"

    .line 982
    .line 983
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object p1

    .line 987
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 988
    .line 989
    .line 990
    :goto_14
    if-eqz v11, :cond_1f

    .line 991
    .line 992
    new-instance p1, Lorg/json/JSONObject;

    .line 993
    .line 994
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 995
    .line 996
    .line 997
    iget-object v2, v11, LA0/U;->a:Ljava/util/List;

    .line 998
    .line 999
    invoke-static {v2}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v2

    .line 1003
    invoke-virtual {p1, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1004
    .line 1005
    .line 1006
    move-result-object p1

    .line 1007
    iget-object v2, v11, LA0/U;->b:Ljava/util/List;

    .line 1008
    .line 1009
    invoke-static {v2}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    invoke-virtual {p1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1014
    .line 1015
    .line 1016
    move-result-object p1

    .line 1017
    iget-object v2, v11, LA0/U;->c:Ljava/util/List;

    .line 1018
    .line 1019
    invoke-static {v2}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1024
    .line 1025
    .line 1026
    move-result-object p1

    .line 1027
    iget-object v1, v11, LA0/U;->d:Ljava/util/List;

    .line 1028
    .line 1029
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v1

    .line 1033
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1034
    .line 1035
    .line 1036
    move-result-object p1

    .line 1037
    invoke-static {p1, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    invoke-static {p1, v3}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 1041
    .line 1042
    .line 1043
    move-result-object p1

    .line 1044
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-virtual {v0, v7, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    const-string v1, "recent_forward_v1"

    .line 1060
    .line 1061
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object p1

    .line 1065
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1066
    .line 1067
    .line 1068
    move-result-object p1

    .line 1069
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1070
    .line 1071
    .line 1072
    iget-object p1, p0, LC/d;->b:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast p1, Lr0/L0;

    .line 1075
    .line 1076
    iput-object v11, p1, Lr0/L0;->o:Ljava/lang/Object;

    .line 1077
    .line 1078
    new-instance p1, LA0/t;

    .line 1079
    .line 1080
    const-string v0, "\u5df2\u627e\u5230\u6700\u8fd1\u8f6c\u53d1\u5217\u8868\u7ed3\u6784"

    .line 1081
    .line 1082
    invoke-direct {p1, v12, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 1083
    .line 1084
    .line 1085
    goto :goto_15

    .line 1086
    :cond_1f
    new-instance p1, LA0/t;

    .line 1087
    .line 1088
    const-string v0, "\u672a\u627e\u5230\u6700\u8fd1\u8f6c\u53d1\u5217\u8868\u7ed3\u6784"

    .line 1089
    .line 1090
    invoke-direct {p1, v10, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 1091
    .line 1092
    .line 1093
    :goto_15
    return-object p1

    .line 1094
    :pswitch_9
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 1095
    .line 1096
    const-string v0, "ref"

    .line 1097
    .line 1098
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object p1

    .line 1105
    check-cast p1, Landroid/widget/PopupWindow;

    .line 1106
    .line 1107
    if-eqz p1, :cond_20

    .line 1108
    .line 1109
    iget-object v0, p0, LC/d;->b:Ljava/lang/Object;

    .line 1110
    .line 1111
    check-cast v0, Landroid/widget/PopupWindow;

    .line 1112
    .line 1113
    if-ne p1, v0, :cond_21

    .line 1114
    .line 1115
    :cond_20
    move v10, v12

    .line 1116
    :cond_21
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1117
    .line 1118
    .line 1119
    move-result-object p1

    .line 1120
    return-object p1

    .line 1121
    :pswitch_a
    check-cast p1, Landroid/content/Context;

    .line 1122
    .line 1123
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1124
    .line 1125
    .line 1126
    invoke-static {}, LA0/k;->a()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v0

    .line 1130
    if-nez v0, :cond_22

    .line 1131
    .line 1132
    goto :goto_1a

    .line 1133
    :cond_22
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    if-eqz v0, :cond_23

    .line 1138
    .line 1139
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 1140
    .line 1141
    goto :goto_16

    .line 1142
    :cond_23
    move-object v0, v11

    .line 1143
    :goto_16
    if-eqz v0, :cond_27

    .line 1144
    .line 1145
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v1

    .line 1149
    if-eqz v1, :cond_24

    .line 1150
    .line 1151
    goto :goto_19

    .line 1152
    :cond_24
    :try_start_4
    new-instance v1, LA0/h;

    .line 1153
    .line 1154
    const/4 v2, 0x3

    .line 1155
    invoke-direct {v1, p1, v2}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 1156
    .line 1157
    .line 1158
    invoke-static {v0, v1}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object p1

    .line 1162
    check-cast p1, LA0/z;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1163
    .line 1164
    goto :goto_17

    .line 1165
    :catchall_4
    move-exception p1

    .line 1166
    new-instance v0, LE0/d;

    .line 1167
    .line 1168
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1169
    .line 1170
    .line 1171
    move-object p1, v0

    .line 1172
    :goto_17
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v0

    .line 1176
    if-eqz v0, :cond_25

    .line 1177
    .line 1178
    const-string v1, "group create contact dexkit resolve fail"

    .line 1179
    .line 1180
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    :cond_25
    instance-of v0, p1, LE0/d;

    .line 1188
    .line 1189
    if-eqz v0, :cond_26

    .line 1190
    .line 1191
    goto :goto_18

    .line 1192
    :cond_26
    move-object v11, p1

    .line 1193
    :goto_18
    check-cast v11, LA0/z;

    .line 1194
    .line 1195
    goto :goto_1a

    .line 1196
    :cond_27
    :goto_19
    const-string p1, "group create contact dexkit apk path empty"

    .line 1197
    .line 1198
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object p1

    .line 1202
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1203
    .line 1204
    .line 1205
    :goto_1a
    if-eqz v11, :cond_28

    .line 1206
    .line 1207
    new-instance p1, Lorg/json/JSONObject;

    .line 1208
    .line 1209
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 1210
    .line 1211
    .line 1212
    iget-object v0, v11, LA0/z;->a:Ljava/util/List;

    .line 1213
    .line 1214
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v0

    .line 1218
    invoke-virtual {p1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1219
    .line 1220
    .line 1221
    move-result-object p1

    .line 1222
    iget-object v0, v11, LA0/z;->b:Ljava/util/List;

    .line 1223
    .line 1224
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v0

    .line 1228
    invoke-virtual {p1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1229
    .line 1230
    .line 1231
    move-result-object p1

    .line 1232
    iget-object v0, v11, LA0/z;->c:Ljava/util/List;

    .line 1233
    .line 1234
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v0

    .line 1238
    const-string v1, "listEntryNames"

    .line 1239
    .line 1240
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1241
    .line 1242
    .line 1243
    move-result-object p1

    .line 1244
    invoke-static {p1, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    invoke-static {p1, v12}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 1248
    .line 1249
    .line 1250
    move-result-object p1

    .line 1251
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    invoke-virtual {v0, v7, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    const-string v1, "group_create_contact_v1"

    .line 1267
    .line 1268
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object p1

    .line 1272
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1273
    .line 1274
    .line 1275
    move-result-object p1

    .line 1276
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1277
    .line 1278
    .line 1279
    iget-object p1, p0, LC/d;->b:Ljava/lang/Object;

    .line 1280
    .line 1281
    check-cast p1, Lr0/j0;

    .line 1282
    .line 1283
    iput-object v11, p1, Lr0/j0;->l:LA0/z;

    .line 1284
    .line 1285
    new-instance p1, LA0/t;

    .line 1286
    .line 1287
    const-string v0, "\u5df2\u627e\u5230\u9009\u62e9\u8054\u7cfb\u4eba\u7ed3\u6784"

    .line 1288
    .line 1289
    invoke-direct {p1, v12, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_1b

    .line 1293
    :cond_28
    new-instance p1, LA0/t;

    .line 1294
    .line 1295
    const-string v0, "\u672a\u627e\u5230\u9009\u62e9\u8054\u7cfb\u4eba\u7ed3\u6784"

    .line 1296
    .line 1297
    invoke-direct {p1, v10, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 1298
    .line 1299
    .line 1300
    :goto_1b
    return-object p1

    .line 1301
    :pswitch_b
    check-cast p1, Landroid/content/Context;

    .line 1302
    .line 1303
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1304
    .line 1305
    .line 1306
    invoke-static {}, LA0/k;->a()Z

    .line 1307
    .line 1308
    .line 1309
    move-result v1

    .line 1310
    if-nez v1, :cond_29

    .line 1311
    .line 1312
    goto :goto_20

    .line 1313
    :cond_29
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v1

    .line 1317
    if-eqz v1, :cond_2a

    .line 1318
    .line 1319
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 1320
    .line 1321
    goto :goto_1c

    .line 1322
    :cond_2a
    move-object v1, v11

    .line 1323
    :goto_1c
    if-eqz v1, :cond_2e

    .line 1324
    .line 1325
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v2

    .line 1329
    if-eqz v2, :cond_2b

    .line 1330
    .line 1331
    goto :goto_1f

    .line 1332
    :cond_2b
    :try_start_5
    new-instance v2, LA0/h;

    .line 1333
    .line 1334
    const/16 v3, 0x9

    .line 1335
    .line 1336
    invoke-direct {v2, p1, v3}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 1337
    .line 1338
    .line 1339
    invoke-static {v1, v2}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object p1

    .line 1343
    check-cast p1, LA0/a0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1344
    .line 1345
    goto :goto_1d

    .line 1346
    :catchall_5
    move-exception p1

    .line 1347
    new-instance v1, LE0/d;

    .line 1348
    .line 1349
    invoke-direct {v1, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1350
    .line 1351
    .line 1352
    move-object p1, v1

    .line 1353
    :goto_1d
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v1

    .line 1357
    if-eqz v1, :cond_2c

    .line 1358
    .line 1359
    const-string v2, "tag contact dexkit resolve fail"

    .line 1360
    .line 1361
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v1

    .line 1365
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1366
    .line 1367
    .line 1368
    :cond_2c
    instance-of v1, p1, LE0/d;

    .line 1369
    .line 1370
    if-eqz v1, :cond_2d

    .line 1371
    .line 1372
    goto :goto_1e

    .line 1373
    :cond_2d
    move-object v11, p1

    .line 1374
    :goto_1e
    check-cast v11, LA0/a0;

    .line 1375
    .line 1376
    goto :goto_20

    .line 1377
    :cond_2e
    :goto_1f
    const-string p1, "tag contact dexkit apk path empty"

    .line 1378
    .line 1379
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object p1

    .line 1383
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1384
    .line 1385
    .line 1386
    :goto_20
    if-eqz v11, :cond_2f

    .line 1387
    .line 1388
    new-instance p1, Lorg/json/JSONObject;

    .line 1389
    .line 1390
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 1391
    .line 1392
    .line 1393
    iget-object v1, v11, LA0/a0;->a:Ljava/util/List;

    .line 1394
    .line 1395
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v1

    .line 1399
    invoke-virtual {p1, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1400
    .line 1401
    .line 1402
    move-result-object p1

    .line 1403
    iget-object v1, v11, LA0/a0;->b:Ljava/util/List;

    .line 1404
    .line 1405
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v1

    .line 1409
    invoke-virtual {p1, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1410
    .line 1411
    .line 1412
    move-result-object p1

    .line 1413
    iget-object v1, v11, LA0/a0;->c:Ljava/util/List;

    .line 1414
    .line 1415
    invoke-static {v1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1420
    .line 1421
    .line 1422
    move-result-object p1

    .line 1423
    invoke-static {p1, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1424
    .line 1425
    .line 1426
    invoke-static {p1, v12}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 1427
    .line 1428
    .line 1429
    move-result-object p1

    .line 1430
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v0

    .line 1434
    invoke-virtual {v0, v7, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1439
    .line 1440
    .line 1441
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v0

    .line 1445
    const-string v1, "tag_contact_v1"

    .line 1446
    .line 1447
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object p1

    .line 1451
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1452
    .line 1453
    .line 1454
    move-result-object p1

    .line 1455
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1456
    .line 1457
    .line 1458
    iget-object p1, p0, LC/d;->b:Ljava/lang/Object;

    .line 1459
    .line 1460
    check-cast p1, Lr0/g0;

    .line 1461
    .line 1462
    iput-object v11, p1, Lr0/g0;->h:LA0/a0;

    .line 1463
    .line 1464
    new-instance p1, LA0/t;

    .line 1465
    .line 1466
    const-string v0, "\u5df2\u627e\u5230\u6807\u7b7e\u9875\u7ed3\u6784"

    .line 1467
    .line 1468
    invoke-direct {p1, v12, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 1469
    .line 1470
    .line 1471
    goto :goto_21

    .line 1472
    :cond_2f
    new-instance p1, LA0/t;

    .line 1473
    .line 1474
    const-string v0, "\u672a\u627e\u5230\u6807\u7b7e\u9875\u7ed3\u6784"

    .line 1475
    .line 1476
    invoke-direct {p1, v10, v0, v12}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 1477
    .line 1478
    .line 1479
    :goto_21
    return-object p1

    .line 1480
    nop

    .line 1481
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
