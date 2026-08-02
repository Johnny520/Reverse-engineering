.class public final Lzo;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final b:Lzo;

.field public static final c:Lzo;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lzo;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lzo;->b:Lzo;

    .line 8
    .line 9
    new-instance v0, Lzo;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lzo;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lzo;->c:Lzo;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lzo;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lr92;Lf90;Lv52;)Lk82;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lf90;->c()Lt52;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v1, v1, Lt52;->c:Lhb2;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    iget v2, p0, Lr92;->k:I

    .line 13
    .line 14
    iget-object v3, p0, Lr92;->h:Lk82;

    .line 15
    .line 16
    iget-object v4, v3, Lk82;->b:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    const/16 v7, 0x134

    .line 21
    .line 22
    const/16 v8, 0x133

    .line 23
    .line 24
    if-eq v2, v8, :cond_e

    .line 25
    .line 26
    if-eq v2, v7, :cond_e

    .line 27
    .line 28
    const/16 v9, 0x191

    .line 29
    .line 30
    if-eq v2, v9, :cond_d

    .line 31
    .line 32
    const/16 v9, 0x1a5

    .line 33
    .line 34
    if-eq v2, v9, :cond_a

    .line 35
    .line 36
    const/16 p1, 0x1f7

    .line 37
    .line 38
    if-eq v2, p1, :cond_8

    .line 39
    .line 40
    const/16 p1, 0x197

    .line 41
    .line 42
    if-eq v2, p1, :cond_6

    .line 43
    .line 44
    const/16 p1, 0x198

    .line 45
    .line 46
    if-eq v2, p1, :cond_1

    .line 47
    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    iget-boolean p2, p2, Lv52;->r:Z

    .line 54
    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_2
    iget-object p2, v3, Lk82;->d:Lo82;

    .line 60
    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p2}, Lo82;->c()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_3
    iget-object p2, p0, Lr92;->r:Lr92;

    .line 72
    .line 73
    if-eqz p2, :cond_4

    .line 74
    .line 75
    iget p2, p2, Lr92;->k:I

    .line 76
    .line 77
    if-ne p2, p1, :cond_4

    .line 78
    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :cond_4
    invoke-static {p0, v5}, Lzo;->c(Lr92;I)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-lez p1, :cond_5

    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_5
    iget-object p0, p0, Lr92;->h:Lk82;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p0, v1, Lhb2;->b:Ljava/net/Proxy;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    sget-object p1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 102
    .line 103
    if-ne p0, p1, :cond_7

    .line 104
    .line 105
    iget-object p0, p2, Lv52;->p:Lgd3;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_7
    new-instance p0, Ljava/net/ProtocolException;

    .line 112
    .line 113
    const-string p1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 114
    .line 115
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p0

    .line 119
    :cond_8
    iget-object p2, p0, Lr92;->r:Lr92;

    .line 120
    .line 121
    if-eqz p2, :cond_9

    .line 122
    .line 123
    iget p2, p2, Lr92;->k:I

    .line 124
    .line 125
    if-ne p2, p1, :cond_9

    .line 126
    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :cond_9
    const p1, 0x7fffffff

    .line 130
    .line 131
    .line 132
    invoke-static {p0, p1}, Lzo;->c(Lr92;I)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_14

    .line 137
    .line 138
    iget-object p0, p0, Lr92;->h:Lk82;

    .line 139
    .line 140
    return-object p0

    .line 141
    :cond_a
    iget-object p2, v3, Lk82;->d:Lo82;

    .line 142
    .line 143
    if-eqz p2, :cond_b

    .line 144
    .line 145
    invoke-virtual {p2}, Lo82;->c()Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_b

    .line 150
    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :cond_b
    if-eqz p1, :cond_14

    .line 154
    .line 155
    iget-object p2, p1, Lf90;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, Lyg0;

    .line 158
    .line 159
    invoke-interface {p2}, Lyg0;->i()Lx52;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    iget-object p2, p2, Lx52;->i:Lq5;

    .line 164
    .line 165
    iget-object p2, p2, Lq5;->i:Lyw0;

    .line 166
    .line 167
    iget-object p2, p2, Lyw0;->d:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v1, p1, Lf90;->d:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, Lxg0;

    .line 172
    .line 173
    invoke-interface {v1}, Lxg0;->g()Lwg0;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-interface {v1}, Lwg0;->f()Lhb2;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    iget-object v1, v1, Lhb2;->a:Lq5;

    .line 182
    .line 183
    iget-object v1, v1, Lq5;->i:Lyw0;

    .line 184
    .line 185
    iget-object v1, v1, Lyw0;->d:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {p2, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    if-eqz p2, :cond_c

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_c
    invoke-virtual {p1}, Lf90;->c()Lt52;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    monitor-enter p1

    .line 199
    :try_start_0
    iput-boolean v6, p1, Lt52;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    .line 201
    monitor-exit p1

    .line 202
    iget-object p0, p0, Lr92;->h:Lk82;

    .line 203
    .line 204
    return-object p0

    .line 205
    :catchall_0
    move-exception p0

    .line 206
    monitor-exit p1

    .line 207
    throw p0

    .line 208
    :cond_d
    iget-object p0, p2, Lv52;->i:Lgd3;

    .line 209
    .line 210
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_e
    :pswitch_0
    const-string p1, "PROPFIND"

    .line 215
    .line 216
    iget-object v1, p2, Lv52;->a:Ls52;

    .line 217
    .line 218
    iget-object v1, v1, Ls52;->h:Let1;

    .line 219
    .line 220
    iget-boolean v1, v1, Let1;->h:Z

    .line 221
    .line 222
    if-nez v1, :cond_f

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_f
    const-string v1, "Location"

    .line 226
    .line 227
    iget-object v2, p0, Lr92;->m:Ljs0;

    .line 228
    .line 229
    invoke-virtual {v2, v1}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    if-nez v1, :cond_10

    .line 234
    .line 235
    move-object v1, v0

    .line 236
    :cond_10
    iget-object v2, p0, Lr92;->h:Lk82;

    .line 237
    .line 238
    if-nez v1, :cond_11

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_11
    iget-object v3, v2, Lk82;->a:Lyw0;

    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    :try_start_1
    new-instance v9, Lxw0;

    .line 247
    .line 248
    invoke-direct {v9}, Lxw0;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v9, v3, v1}, Lxw0;->e(Lyw0;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :catch_0
    move-object v9, v0

    .line 256
    :goto_1
    if-eqz v9, :cond_12

    .line 257
    .line 258
    invoke-virtual {v9}, Lxw0;->b()Lyw0;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    goto :goto_2

    .line 263
    :cond_12
    move-object v1, v0

    .line 264
    :goto_2
    if-nez v1, :cond_13

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_13
    iget-object v3, v1, Lyw0;->a:Ljava/lang/String;

    .line 268
    .line 269
    iget-object v9, v2, Lk82;->a:Lyw0;

    .line 270
    .line 271
    iget-object v9, v9, Lyw0;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-static {v3, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-nez v3, :cond_15

    .line 278
    .line 279
    iget-object p2, p2, Lv52;->a:Ls52;

    .line 280
    .line 281
    iget-object p2, p2, Ls52;->h:Let1;

    .line 282
    .line 283
    iget-boolean p2, p2, Let1;->i:Z

    .line 284
    .line 285
    if-nez p2, :cond_15

    .line 286
    .line 287
    :cond_14
    :goto_3
    return-object v0

    .line 288
    :cond_15
    invoke-virtual {v2}, Lk82;->a()Lcj;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    invoke-static {v4}, Lfg1;->I(Ljava/lang/String;)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-eqz v3, :cond_1a

    .line 297
    .line 298
    iget p0, p0, Lr92;->k:I

    .line 299
    .line 300
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-nez v3, :cond_16

    .line 305
    .line 306
    if-eq p0, v7, :cond_16

    .line 307
    .line 308
    if-ne p0, v8, :cond_17

    .line 309
    .line 310
    :cond_16
    move v5, v6

    .line 311
    :cond_17
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-nez p1, :cond_18

    .line 316
    .line 317
    if-eq p0, v7, :cond_18

    .line 318
    .line 319
    if-eq p0, v8, :cond_18

    .line 320
    .line 321
    const-string p0, "GET"

    .line 322
    .line 323
    invoke-virtual {p2, p0, v0}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_18
    if-eqz v5, :cond_19

    .line 328
    .line 329
    iget-object v0, v2, Lk82;->d:Lo82;

    .line 330
    .line 331
    :cond_19
    invoke-virtual {p2, v4, v0}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 332
    .line 333
    .line 334
    :goto_4
    if-nez v5, :cond_1a

    .line 335
    .line 336
    const-string p0, "Transfer-Encoding"

    .line 337
    .line 338
    iget-object p1, p2, Lcj;->c:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast p1, Lye0;

    .line 341
    .line 342
    invoke-virtual {p1, p0}, Lye0;->n(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    const-string p0, "Content-Length"

    .line 346
    .line 347
    iget-object p1, p2, Lcj;->c:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast p1, Lye0;

    .line 350
    .line 351
    invoke-virtual {p1, p0}, Lye0;->n(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    const-string p0, "Content-Type"

    .line 355
    .line 356
    iget-object p1, p2, Lcj;->c:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast p1, Lye0;

    .line 359
    .line 360
    invoke-virtual {p1, p0}, Lye0;->n(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    :cond_1a
    iget-object p0, v2, Lk82;->a:Lyw0;

    .line 364
    .line 365
    invoke-static {p0, v1}, Lwg3;->a(Lyw0;Lyw0;)Z

    .line 366
    .line 367
    .line 368
    move-result p0

    .line 369
    if-nez p0, :cond_1b

    .line 370
    .line 371
    const-string p0, "Authorization"

    .line 372
    .line 373
    iget-object p1, p2, Lcj;->c:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast p1, Lye0;

    .line 376
    .line 377
    invoke-virtual {p1, p0}, Lye0;->n(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :cond_1b
    iput-object v1, p2, Lcj;->a:Ljava/lang/Object;

    .line 381
    .line 382
    new-instance p0, Lk82;

    .line 383
    .line 384
    invoke-direct {p0, p2}, Lk82;-><init>(Lcj;)V

    .line 385
    .line 386
    .line 387
    return-object p0

    .line 388
    nop

    .line 389
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Ljava/io/IOException;Ls52;Lv52;Lk82;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Lsy;

    .line 2
    .line 3
    iget-boolean p2, p2, Lv52;->r:Z

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    if-nez v0, :cond_2

    .line 9
    .line 10
    iget-object p2, p3, Lk82;->d:Lo82;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Lo82;->c()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_8

    .line 19
    .line 20
    :cond_1
    instance-of p2, p0, Ljava/io/FileNotFoundException;

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    instance-of p2, p0, Ljava/net/ProtocolException;

    .line 26
    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_3
    instance-of p2, p0, Ljava/io/InterruptedIOException;

    .line 31
    .line 32
    if-eqz p2, :cond_4

    .line 33
    .line 34
    instance-of p0, p0, Ljava/net/SocketTimeoutException;

    .line 35
    .line 36
    if-eqz p0, :cond_8

    .line 37
    .line 38
    if-eqz v0, :cond_8

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    instance-of p2, p0, Ljavax/net/ssl/SSLHandshakeException;

    .line 42
    .line 43
    if-eqz p2, :cond_5

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    instance-of p2, p2, Ljava/security/cert/CertificateException;

    .line 50
    .line 51
    if-eqz p2, :cond_5

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_5
    instance-of p0, p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 55
    .line 56
    if-eqz p0, :cond_6

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_6
    :goto_0
    iget-object p0, p1, Ls52;->y:Lf90;

    .line 60
    .line 61
    if-eqz p0, :cond_8

    .line 62
    .line 63
    iget-boolean p0, p0, Lf90;->a:Z

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    if-ne p0, p2, :cond_8

    .line 67
    .line 68
    iget-object p0, p1, Ls52;->o:Lyg0;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, Lyg0;->i()Lx52;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p1, p1, Ls52;->y:Lf90;

    .line 78
    .line 79
    if-eqz p1, :cond_7

    .line 80
    .line 81
    invoke-virtual {p1}, Lf90;->c()Lt52;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    goto :goto_1

    .line 86
    :cond_7
    const/4 p1, 0x0

    .line 87
    :goto_1
    invoke-virtual {p0, p1}, Lx52;->a(Lt52;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_8

    .line 92
    .line 93
    return p2

    .line 94
    :cond_8
    :goto_2
    const/4 p0, 0x0

    .line 95
    return p0
.end method

.method public static c(Lr92;I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lr92;->m:Ljs0;

    .line 2
    .line 3
    const-string v0, "Retry-After"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    const-string p1, "\\d+"

    .line 16
    .line 17
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_2
    const p0, 0x7fffffff

    .line 47
    .line 48
    .line 49
    return p0
.end method
