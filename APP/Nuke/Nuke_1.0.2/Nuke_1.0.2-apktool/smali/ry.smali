.class public final Lry;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljb2;
.implements Lwg0;


# instance fields
.field public final a:Liy2;

.field public final b:Lud0;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:Ls52;

.field public final i:Lx52;

.field public final j:Lhb2;

.field public final k:Ljava/util/List;

.field public final l:Lk82;

.field public final m:I

.field public final n:Z

.field public volatile o:Z

.field public p:Ljava/net/Socket;

.field public q:Ljava/net/Socket;

.field public r:Lyr0;

.field public s:Lc42;

.field public t:Lb5;

.field public u:Lt52;


# direct methods
.method public constructor <init>(Liy2;Lud0;IIIIZLs52;Lx52;Lhb2;Ljava/util/List;Lk82;IZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lry;->a:Liy2;

    .line 14
    .line 15
    iput-object p2, p0, Lry;->b:Lud0;

    .line 16
    .line 17
    iput p3, p0, Lry;->c:I

    .line 18
    .line 19
    iput p4, p0, Lry;->d:I

    .line 20
    .line 21
    iput p5, p0, Lry;->e:I

    .line 22
    .line 23
    iput p6, p0, Lry;->f:I

    .line 24
    .line 25
    iput-boolean p7, p0, Lry;->g:Z

    .line 26
    .line 27
    iput-object p8, p0, Lry;->h:Ls52;

    .line 28
    .line 29
    iput-object p9, p0, Lry;->i:Lx52;

    .line 30
    .line 31
    iput-object p10, p0, Lry;->j:Lhb2;

    .line 32
    .line 33
    iput-object p11, p0, Lry;->k:Ljava/util/List;

    .line 34
    .line 35
    iput-object p12, p0, Lry;->l:Lk82;

    .line 36
    .line 37
    iput p13, p0, Lry;->m:I

    .line 38
    .line 39
    iput-boolean p14, p0, Lry;->n:Z

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a()Ljb2;
    .locals 15

    .line 1
    new-instance v0, Lry;

    .line 2
    .line 3
    iget v13, p0, Lry;->m:I

    .line 4
    .line 5
    iget-boolean v14, p0, Lry;->n:Z

    .line 6
    .line 7
    iget-object v1, p0, Lry;->a:Liy2;

    .line 8
    .line 9
    iget-object v2, p0, Lry;->b:Lud0;

    .line 10
    .line 11
    iget v3, p0, Lry;->c:I

    .line 12
    .line 13
    iget v4, p0, Lry;->d:I

    .line 14
    .line 15
    iget v5, p0, Lry;->e:I

    .line 16
    .line 17
    iget v6, p0, Lry;->f:I

    .line 18
    .line 19
    iget-boolean v7, p0, Lry;->g:Z

    .line 20
    .line 21
    iget-object v8, p0, Lry;->h:Ls52;

    .line 22
    .line 23
    iget-object v9, p0, Lry;->i:Lx52;

    .line 24
    .line 25
    iget-object v10, p0, Lry;->j:Lhb2;

    .line 26
    .line 27
    iget-object v11, p0, Lry;->k:Ljava/util/List;

    .line 28
    .line 29
    iget-object v12, p0, Lry;->l:Lk82;

    .line 30
    .line 31
    invoke-direct/range {v0 .. v14}, Lry;-><init>(Liy2;Lud0;IIIIZLs52;Lx52;Lhb2;Ljava/util/List;Lk82;IZ)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final b(Ls52;Ljava/io/IOException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()Lib2;
    .locals 14

    .line 1
    iget-object v4, p0, Lry;->p:Ljava/net/Socket;

    .line 2
    .line 3
    const/4 v9, 0x0

    .line 4
    if-eqz v4, :cond_12

    .line 5
    .line 6
    invoke-virtual {p0}, Lry;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_11

    .line 11
    .line 12
    iget-object v0, p0, Lry;->j:Lhb2;

    .line 13
    .line 14
    iget-object v0, v0, Lhb2;->a:Lq5;

    .line 15
    .line 16
    iget-object v0, v0, Lq5;->k:Ljava/util/List;

    .line 17
    .line 18
    iget-object v1, p0, Lry;->h:Ls52;

    .line 19
    .line 20
    iget-object v1, v1, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const/4 v10, 0x0

    .line 26
    :try_start_0
    iget-object v1, p0, Lry;->l:Lk82;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lry;->k()Lib2;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, v1, Lib2;->c:Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lry;->h:Ls52;

    .line 39
    .line 40
    iget-object v0, v0, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lry;->q:Ljava/net/Socket;

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    invoke-static {p0}, Lwg3;->c(Ljava/net/Socket;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-static {v4}, Lwg3;->c(Ljava/net/Socket;)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    move-object v6, v9

    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_1
    :try_start_1
    iget-object v1, p0, Lry;->j:Lhb2;

    .line 64
    .line 65
    iget-object v1, v1, Lhb2;->a:Lq5;

    .line 66
    .line 67
    iget-object v2, v1, Lq5;->c:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    const/4 v11, 0x1

    .line 70
    const-string v3, "socket"

    .line 71
    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    :try_start_2
    iget-object v1, p0, Lry;->t:Lb5;

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v1, v1, Lb5;->j:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lo52;

    .line 81
    .line 82
    iget-object v1, v1, Lo52;->i:Lfn;

    .line 83
    .line 84
    invoke-virtual {v1}, Lfn;->k()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    iget-object v1, p0, Lry;->t:Lb5;

    .line 91
    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    iget-object v1, v1, Lb5;->k:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Ln52;

    .line 97
    .line 98
    iget-object v1, v1, Ln52;->i:Lfn;

    .line 99
    .line 100
    invoke-virtual {v1}, Lfn;->k()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    iget-object v1, p0, Lry;->h:Ls52;

    .line 107
    .line 108
    iget-object v1, v1, Ls52;->k:Lkg0;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lry;->j:Lhb2;

    .line 114
    .line 115
    iget-object v1, v1, Lhb2;->a:Lq5;

    .line 116
    .line 117
    iget-object v2, v1, Lq5;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 118
    .line 119
    iget-object v1, v1, Lq5;->i:Lyw0;

    .line 120
    .line 121
    iget-object v5, v1, Lyw0;->d:Ljava/lang/String;

    .line 122
    .line 123
    iget v1, v1, Lyw0;->e:I

    .line 124
    .line 125
    invoke-virtual {v2, v4, v5, v1, v11}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    check-cast v1, Ljavax/net/ssl/SSLSocket;

    .line 133
    .line 134
    invoke-virtual {p0, v0, v1}, Lry;->m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lry;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iget v5, v2, Lry;->m:I

    .line 139
    .line 140
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    check-cast v5, Luy;

    .line 145
    .line 146
    invoke-virtual {v2, v0, v1}, Lry;->l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lry;

    .line 147
    .line 148
    .line 149
    move-result-object v6
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    :try_start_3
    iget-boolean v0, v2, Lry;->n:Z

    .line 151
    .line 152
    invoke-virtual {v5, v1, v0}, Luy;->a(Ljavax/net/ssl/SSLSocket;Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v1, v5}, Lry;->j(Ljavax/net/ssl/SSLSocket;Luy;)V

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lry;->h:Ls52;

    .line 159
    .line 160
    iget-object v0, v0, Ls52;->k:Lkg0;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 163
    .line 164
    .line 165
    move-object v12, v6

    .line 166
    goto :goto_1

    .line 167
    :catch_1
    move-exception v0

    .line 168
    goto/16 :goto_3

    .line 169
    .line 170
    :cond_2
    :try_start_4
    invoke-static {v3}, Lt11;->S(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v9

    .line 174
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 175
    .line 176
    const-string v1, "TLS tunnel buffered too many bytes!"

    .line 177
    .line 178
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :cond_4
    invoke-static {v3}, Lt11;->S(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v9

    .line 186
    :cond_5
    iput-object v4, p0, Lry;->q:Ljava/net/Socket;

    .line 187
    .line 188
    iget-object v0, v1, Lq5;->j:Ljava/util/List;

    .line 189
    .line 190
    sget-object v1, Lc42;->n:Lc42;

    .line 191
    .line 192
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_6

    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_6
    sget-object v1, Lc42;->k:Lc42;

    .line 200
    .line 201
    :goto_0
    iput-object v1, p0, Lry;->s:Lc42;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 202
    .line 203
    move-object v12, v9

    .line 204
    :goto_1
    :try_start_5
    new-instance v0, Lt52;

    .line 205
    .line 206
    iget-object v1, p0, Lry;->a:Liy2;

    .line 207
    .line 208
    iget-object v2, p0, Lry;->b:Lud0;

    .line 209
    .line 210
    move-object v5, v3

    .line 211
    iget-object v3, p0, Lry;->j:Lhb2;

    .line 212
    .line 213
    move-object v6, v5

    .line 214
    iget-object v5, p0, Lry;->q:Ljava/net/Socket;

    .line 215
    .line 216
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-object v7, v6

    .line 220
    iget-object v6, p0, Lry;->r:Lyr0;

    .line 221
    .line 222
    move-object v8, v7

    .line 223
    iget-object v7, p0, Lry;->s:Lc42;

    .line 224
    .line 225
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-object v13, v8

    .line 229
    iget-object v8, p0, Lry;->t:Lb5;

    .line 230
    .line 231
    if-eqz v8, :cond_7

    .line 232
    .line 233
    iget-object v13, p0, Lry;->b:Lud0;

    .line 234
    .line 235
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-direct/range {v0 .. v8}, Lt52;-><init>(Liy2;Lud0;Lhb2;Ljava/net/Socket;Ljava/net/Socket;Lyr0;Lc42;Lb5;)V

    .line 239
    .line 240
    .line 241
    iput-object v0, p0, Lry;->u:Lt52;

    .line 242
    .line 243
    invoke-virtual {v0}, Lt52;->i()V

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Lry;->h:Ls52;

    .line 247
    .line 248
    iget-object v0, v0, Ls52;->k:Lkg0;

    .line 249
    .line 250
    iget-object v1, p0, Lry;->j:Lhb2;

    .line 251
    .line 252
    iget-object v1, v1, Lhb2;->c:Ljava/net/InetSocketAddress;

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 258
    .line 259
    .line 260
    :try_start_6
    new-instance v0, Lib2;

    .line 261
    .line 262
    const/4 v1, 0x6

    .line 263
    invoke-direct {v0, p0, v9, v1}, Lib2;-><init>(Ljb2;Ljava/lang/Throwable;I)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 264
    .line 265
    .line 266
    iget-object v1, p0, Lry;->h:Ls52;

    .line 267
    .line 268
    iget-object v1, v1, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 269
    .line 270
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    return-object v0

    .line 274
    :catchall_1
    move-exception v0

    .line 275
    move v10, v11

    .line 276
    goto :goto_5

    .line 277
    :catch_2
    move-exception v0

    .line 278
    move v10, v11

    .line 279
    :goto_2
    move-object v6, v12

    .line 280
    goto :goto_3

    .line 281
    :catch_3
    move-exception v0

    .line 282
    goto :goto_2

    .line 283
    :cond_7
    :try_start_7
    invoke-static {v13}, Lt11;->S(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v9
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 287
    :goto_3
    :try_start_8
    iget-object v1, p0, Lry;->h:Ls52;

    .line 288
    .line 289
    iget-object v1, v1, Ls52;->k:Lkg0;

    .line 290
    .line 291
    iget-object v2, p0, Lry;->j:Lhb2;

    .line 292
    .line 293
    iget-object v2, v2, Lhb2;->c:Ljava/net/InetSocketAddress;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget-object v1, p0, Lry;->b:Lud0;

    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    iget-object v1, p0, Lry;->j:Lhb2;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    iget-boolean v1, p0, Lry;->g:Z

    .line 312
    .line 313
    if-eqz v1, :cond_c

    .line 314
    .line 315
    instance-of v1, v0, Ljava/net/ProtocolException;

    .line 316
    .line 317
    if-eqz v1, :cond_8

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_8
    instance-of v1, v0, Ljava/io/InterruptedIOException;

    .line 321
    .line 322
    if-eqz v1, :cond_9

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_9
    instance-of v1, v0, Ljavax/net/ssl/SSLHandshakeException;

    .line 326
    .line 327
    if-eqz v1, :cond_a

    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    instance-of v1, v1, Ljava/security/cert/CertificateException;

    .line 334
    .line 335
    if-eqz v1, :cond_a

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_a
    instance-of v1, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 339
    .line 340
    if-eqz v1, :cond_b

    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_b
    instance-of v1, v0, Ljavax/net/ssl/SSLException;

    .line 344
    .line 345
    if-eqz v1, :cond_c

    .line 346
    .line 347
    move-object v9, v6

    .line 348
    :cond_c
    :goto_4
    new-instance v1, Lib2;

    .line 349
    .line 350
    invoke-direct {v1, p0, v9, v0}, Lib2;-><init>(Ljb2;Lry;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 351
    .line 352
    .line 353
    iget-object v0, p0, Lry;->h:Ls52;

    .line 354
    .line 355
    iget-object v0, v0, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 356
    .line 357
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    if-nez v10, :cond_e

    .line 361
    .line 362
    iget-object p0, p0, Lry;->q:Ljava/net/Socket;

    .line 363
    .line 364
    if-eqz p0, :cond_d

    .line 365
    .line 366
    invoke-static {p0}, Lwg3;->c(Ljava/net/Socket;)V

    .line 367
    .line 368
    .line 369
    :cond_d
    invoke-static {v4}, Lwg3;->c(Ljava/net/Socket;)V

    .line 370
    .line 371
    .line 372
    :cond_e
    return-object v1

    .line 373
    :goto_5
    iget-object v1, p0, Lry;->h:Ls52;

    .line 374
    .line 375
    iget-object v1, v1, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 376
    .line 377
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    if-nez v10, :cond_10

    .line 381
    .line 382
    iget-object p0, p0, Lry;->q:Ljava/net/Socket;

    .line 383
    .line 384
    if-eqz p0, :cond_f

    .line 385
    .line 386
    invoke-static {p0}, Lwg3;->c(Ljava/net/Socket;)V

    .line 387
    .line 388
    .line 389
    :cond_f
    invoke-static {v4}, Lwg3;->c(Ljava/net/Socket;)V

    .line 390
    .line 391
    .line 392
    :cond_10
    throw v0

    .line 393
    :cond_11
    const-string p0, "already connected"

    .line 394
    .line 395
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    return-object v9

    .line 399
    :cond_12
    const-string p0, "TCP not connected"

    .line 400
    .line 401
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    return-object v9
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lry;->o:Z

    .line 3
    .line 4
    iget-object p0, p0, Lry;->p:Ljava/net/Socket;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lwg3;->c(Ljava/net/Socket;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d()Lt52;
    .locals 5

    .line 1
    iget-object v0, p0, Lry;->h:Ls52;

    .line 2
    .line 3
    iget-object v0, v0, Ls52;->h:Let1;

    .line 4
    .line 5
    iget-object v0, v0, Let1;->C:Lhh1;

    .line 6
    .line 7
    iget-object v1, p0, Lry;->j:Lhb2;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lhh1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    iget-object v0, p0, Lry;->u:Lt52;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lry;->j:Lhb2;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lry;->i:Lx52;

    .line 32
    .line 33
    iget-object v2, p0, Lry;->k:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v1, p0, v2}, Lx52;->d(Lry;Ljava/util/List;)Lda2;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iget-object p0, v1, Lda2;->a:Lt52;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    monitor-enter v0

    .line 45
    :try_start_1
    iget-object v1, p0, Lry;->b:Lud0;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    sget-object v2, Lwg3;->a:Ljava/util/TimeZone;

    .line 51
    .line 52
    iget-object v2, v1, Lud0;->d:Ljava/io/Serializable;

    .line 53
    .line 54
    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    iget-object v2, v1, Lud0;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lhy2;

    .line 62
    .line 63
    iget-object v1, v1, Lud0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lu52;

    .line 66
    .line 67
    const-wide/16 v3, 0x0

    .line 68
    .line 69
    invoke-virtual {v2, v1, v3, v4}, Lhy2;->c(Ley2;J)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lry;->h:Ls52;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Ls52;->d(Lt52;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    monitor-exit v0

    .line 78
    iget-object p0, p0, Lry;->h:Ls52;

    .line 79
    .line 80
    iget-object p0, p0, Ls52;->k:Lkg0;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    monitor-exit v0

    .line 88
    throw p0

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    throw p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lry;->s:Lc42;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final f()Lhb2;
    .locals 0

    .line 1
    iget-object p0, p0, Lry;->j:Lhb2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Lib2;
    .locals 5

    .line 1
    iget-object v0, p0, Lry;->p:Ljava/net/Socket;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lry;->h:Ls52;

    .line 7
    .line 8
    iget-object v0, v0, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    iget-object v2, p0, Lry;->h:Ls52;

    .line 15
    .line 16
    iget-object v2, v2, Ls52;->k:Lkg0;

    .line 17
    .line 18
    iget-object v3, p0, Lry;->j:Lhb2;

    .line 19
    .line 20
    iget-object v3, v3, Lhb2;->c:Ljava/net/InetSocketAddress;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lry;->b:Lud0;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lry;->j:Lhb2;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lry;->i()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    new-instance v2, Lib2;

    .line 43
    .line 44
    const/4 v3, 0x6

    .line 45
    invoke-direct {v2, p0, v1, v3}, Lib2;-><init>(Ljb2;Ljava/lang/Throwable;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lry;->h:Ls52;

    .line 49
    .line 50
    iget-object v0, v0, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :catchall_0
    move-exception v1

    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception v1

    .line 59
    :try_start_1
    iget-object v2, p0, Lry;->j:Lhb2;

    .line 60
    .line 61
    iget-object v3, v2, Lhb2;->a:Lq5;

    .line 62
    .line 63
    iget-object v3, v3, Lq5;->g:Ljava/net/Proxy;

    .line 64
    .line 65
    if-nez v3, :cond_0

    .line 66
    .line 67
    iget-object v2, v2, Lhb2;->b:Ljava/net/Proxy;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 74
    .line 75
    if-eq v2, v3, :cond_0

    .line 76
    .line 77
    iget-object v2, p0, Lry;->j:Lhb2;

    .line 78
    .line 79
    iget-object v2, v2, Lhb2;->a:Lq5;

    .line 80
    .line 81
    iget-object v3, v2, Lq5;->h:Ljava/net/ProxySelector;

    .line 82
    .line 83
    iget-object v2, v2, Lq5;->i:Lyw0;

    .line 84
    .line 85
    invoke-virtual {v2}, Lyw0;->h()Ljava/net/URI;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget-object v4, p0, Lry;->j:Lhb2;

    .line 90
    .line 91
    iget-object v4, v4, Lhb2;->b:Ljava/net/Proxy;

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v3, v2, v4, v1}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 98
    .line 99
    .line 100
    :cond_0
    iget-object v2, p0, Lry;->h:Ls52;

    .line 101
    .line 102
    iget-object v2, v2, Ls52;->k:Lkg0;

    .line 103
    .line 104
    iget-object v3, p0, Lry;->j:Lhb2;

    .line 105
    .line 106
    iget-object v3, v3, Lhb2;->c:Ljava/net/InetSocketAddress;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v2, p0, Lry;->b:Lud0;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v2, p0, Lry;->j:Lhb2;

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v2, Lib2;

    .line 125
    .line 126
    const/4 v3, 0x2

    .line 127
    invoke-direct {v2, p0, v1, v3}, Lib2;-><init>(Ljb2;Ljava/lang/Throwable;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    .line 130
    iget-object v1, p0, Lry;->h:Ls52;

    .line 131
    .line 132
    iget-object v1, v1, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 133
    .line 134
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    if-nez v0, :cond_1

    .line 138
    .line 139
    iget-object p0, p0, Lry;->p:Ljava/net/Socket;

    .line 140
    .line 141
    if-eqz p0, :cond_1

    .line 142
    .line 143
    invoke-static {p0}, Lwg3;->c(Ljava/net/Socket;)V

    .line 144
    .line 145
    .line 146
    :cond_1
    return-object v2

    .line 147
    :goto_0
    iget-object v2, p0, Lry;->h:Ls52;

    .line 148
    .line 149
    iget-object v2, v2, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 150
    .line 151
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    if-nez v0, :cond_2

    .line 155
    .line 156
    iget-object p0, p0, Lry;->p:Ljava/net/Socket;

    .line 157
    .line 158
    if-eqz p0, :cond_2

    .line 159
    .line 160
    invoke-static {p0}, Lwg3;->c(Ljava/net/Socket;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    throw v1

    .line 164
    :cond_3
    const-string p0, "TCP already connected"

    .line 165
    .line 166
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-object v1
.end method

.method public final h()V
    .locals 0

    .line 1
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lry;->j:Lhb2;

    .line 2
    .line 3
    iget-object v0, v0, Lhb2;->b:Ljava/net/Proxy;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Lqy;->a:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Ljava/net/Socket;

    .line 28
    .line 29
    iget-object v1, p0, Lry;->j:Lhb2;

    .line 30
    .line 31
    iget-object v1, v1, Lhb2;->b:Ljava/net/Proxy;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v0, p0, Lry;->j:Lhb2;

    .line 38
    .line 39
    iget-object v0, v0, Lhb2;->a:Lq5;

    .line 40
    .line 41
    iget-object v0, v0, Lq5;->b:Ljavax/net/SocketFactory;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    :goto_1
    iput-object v0, p0, Lry;->p:Ljava/net/Socket;

    .line 51
    .line 52
    iget-boolean v1, p0, Lry;->o:Z

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    iget v1, p0, Lry;->f:I

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 59
    .line 60
    .line 61
    :try_start_0
    sget-object v1, Lzz1;->a:Lzz1;

    .line 62
    .line 63
    sget-object v1, Lzz1;->a:Lzz1;

    .line 64
    .line 65
    iget-object v2, p0, Lry;->j:Lhb2;

    .line 66
    .line 67
    iget-object v2, v2, Lhb2;->c:Ljava/net/InetSocketAddress;

    .line 68
    .line 69
    iget v3, p0, Lry;->e:I

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2, v3}, Lzz1;->c(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 72
    .line 73
    .line 74
    :try_start_1
    new-instance v1, Lkj1;

    .line 75
    .line 76
    invoke-direct {v1, v0}, Lkj1;-><init>(Ljava/net/Socket;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Lb5;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lb5;-><init>(Lkj1;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lry;->t:Lb5;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    move-exception p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "throw with null exception"

    .line 93
    .line 94
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 102
    .line 103
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :catch_1
    move-exception v0

    .line 108
    new-instance v1, Ljava/net/ConnectException;

    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v3, "Failed to connect to "

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Lry;->j:Lhb2;

    .line 118
    .line 119
    iget-object p0, p0, Lhb2;->c:Ljava/net/InetSocketAddress;

    .line 120
    .line 121
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-direct {v1, p0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 132
    .line 133
    .line 134
    throw v1

    .line 135
    :cond_3
    const-string p0, "canceled"

    .line 136
    .line 137
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final j(Ljavax/net/ssl/SSLSocket;Luy;)V
    .locals 9

    .line 1
    const-string v0, "Hostname "

    .line 2
    .line 3
    const-string v1, "\n            |Hostname "

    .line 4
    .line 5
    iget-object v2, p0, Lry;->j:Lhb2;

    .line 6
    .line 7
    iget-object v2, v2, Lhb2;->a:Lq5;

    .line 8
    .line 9
    :try_start_0
    iget-boolean v3, p2, Luy;->b:Z

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    sget-object v3, Lzz1;->a:Lzz1;

    .line 14
    .line 15
    sget-object v3, Lzz1;->a:Lzz1;

    .line 16
    .line 17
    iget-object v4, v2, Lq5;->i:Lyw0;

    .line 18
    .line 19
    iget-object v4, v4, Lyw0;->d:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v5, v2, Lq5;->j:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v3, p1, v4, v5}, Lzz1;->b(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Lte;->B(Ljavax/net/ssl/SSLSession;)Lyr0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v5, v2, Lq5;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v6, v2, Lq5;->i:Lyw0;

    .line 50
    .line 51
    iget-object v6, v6, Lyw0;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {v5, v6, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    invoke-virtual {v4}, Lyr0;->a()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-nez p2, :cond_1

    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 78
    .line 79
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 80
    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v2, Lq5;->i:Lyw0;

    .line 87
    .line 88
    iget-object v1, v1, Lyw0;->d:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, " not verified:\n            |    certificate: "

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    sget-object v1, Lcq;->c:Lcq;

    .line 99
    .line 100
    invoke-static {p0}, Ls11;->V(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, "\n            |    DN: "

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, "\n            |    subjectAltNames: "

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const/4 v1, 0x7

    .line 129
    invoke-static {p0, v1}, Lys1;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const/4 v2, 0x2

    .line 134
    invoke-static {p0, v2}, Lys1;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {v1, p0}, Ldu;->x0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p0, "\n            "

    .line 146
    .line 147
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Lqv2;->T(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-direct {p2, p0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p2

    .line 162
    :cond_1
    new-instance p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 163
    .line 164
    new-instance p2, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object v0, v2, Lq5;->i:Lyw0;

    .line 170
    .line 171
    iget-object v0, v0, Lyw0;->d:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v0, " not verified (no certificates)"

    .line 177
    .line 178
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-direct {p0, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw p0

    .line 189
    :cond_2
    iget-object v0, v2, Lq5;->e:Lcq;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v1, Lyr0;

    .line 195
    .line 196
    iget-object v3, v4, Lyr0;->a:Ls23;

    .line 197
    .line 198
    iget-object v5, v4, Lyr0;->b:Lps;

    .line 199
    .line 200
    iget-object v6, v4, Lyr0;->c:Ljava/util/List;

    .line 201
    .line 202
    new-instance v7, Ls1;

    .line 203
    .line 204
    const/4 v8, 0x6

    .line 205
    invoke-direct {v7, v0, v4, v2, v8}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    invoke-direct {v1, v3, v5, v6, v7}, Lyr0;-><init>(Ls23;Lps;Ljava/util/List;Lxm0;)V

    .line 209
    .line 210
    .line 211
    iput-object v1, p0, Lry;->r:Lyr0;

    .line 212
    .line 213
    iget-object v1, v2, Lq5;->i:Lyw0;

    .line 214
    .line 215
    iget-object v1, v1, Lyw0;->d:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    iget-object v0, v0, Lcq;->a:Ljava/util/Set;

    .line 221
    .line 222
    check-cast v0, Ljava/lang/Iterable;

    .line 223
    .line 224
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    const/4 v2, 0x0

    .line 233
    if-nez v1, :cond_5

    .line 234
    .line 235
    iget-boolean p2, p2, Luy;->b:Z

    .line 236
    .line 237
    if-eqz p2, :cond_3

    .line 238
    .line 239
    sget-object p2, Lzz1;->a:Lzz1;

    .line 240
    .line 241
    sget-object p2, Lzz1;->a:Lzz1;

    .line 242
    .line 243
    invoke-virtual {p2, p1}, Lzz1;->d(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    :cond_3
    iput-object p1, p0, Lry;->q:Ljava/net/Socket;

    .line 248
    .line 249
    new-instance p2, Lkj1;

    .line 250
    .line 251
    invoke-direct {p2, p1}, Lkj1;-><init>(Ljava/net/Socket;)V

    .line 252
    .line 253
    .line 254
    new-instance v0, Lb5;

    .line 255
    .line 256
    invoke-direct {v0, p2}, Lb5;-><init>(Lkj1;)V

    .line 257
    .line 258
    .line 259
    iput-object v0, p0, Lry;->t:Lb5;

    .line 260
    .line 261
    if-eqz v2, :cond_4

    .line 262
    .line 263
    sget-object p2, Lc42;->i:Li51;

    .line 264
    .line 265
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-static {v2}, Li51;->n(Ljava/lang/String;)Lc42;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    goto :goto_1

    .line 273
    :cond_4
    sget-object p2, Lc42;->k:Lc42;

    .line 274
    .line 275
    :goto_1
    iput-object p2, p0, Lry;->s:Lc42;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    .line 277
    sget-object p0, Lzz1;->a:Lzz1;

    .line 278
    .line 279
    sget-object p0, Lzz1;->a:Lzz1;

    .line 280
    .line 281
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_5
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    invoke-static {p0}, Lvi0;->t(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 293
    :goto_2
    sget-object p2, Lzz1;->a:Lzz1;

    .line 294
    .line 295
    sget-object p2, Lzz1;->a:Lzz1;

    .line 296
    .line 297
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-static {p1}, Lwg3;->c(Ljava/net/Socket;)V

    .line 301
    .line 302
    .line 303
    throw p0
.end method

.method public final k()Lib2;
    .locals 9

    .line 1
    iget-object v0, p0, Lry;->l:Lk82;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lry;->j:Lhb2;

    .line 7
    .line 8
    iget-object v2, v1, Lhb2;->a:Lq5;

    .line 9
    .line 10
    iget-object v2, v2, Lq5;->i:Lyw0;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "CONNECT "

    .line 15
    .line 16
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    invoke-static {v2, v4}, Lwg3;->h(Lyw0;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " HTTP/1.1"

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, Liv0;

    .line 37
    .line 38
    iget-object v4, p0, Lry;->t:Lb5;

    .line 39
    .line 40
    const-string v5, "socket"

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    if-eqz v4, :cond_5

    .line 44
    .line 45
    invoke-direct {v3, v6, p0, v4}, Liv0;-><init>(Let1;Lwg0;Lb5;)V

    .line 46
    .line 47
    .line 48
    iget-object v4, p0, Lry;->t:Lb5;

    .line 49
    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    iget-object v4, v4, Lb5;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lo52;

    .line 55
    .line 56
    iget-object v4, v4, Lo52;->h:Lht2;

    .line 57
    .line 58
    invoke-interface {v4}, Lht2;->a()Lo23;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget v7, p0, Lry;->c:I

    .line 63
    .line 64
    int-to-long v7, v7

    .line 65
    invoke-virtual {v4, v7, v8}, Lo23;->g(J)Lo23;

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, Lry;->t:Lb5;

    .line 69
    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    iget-object v4, v4, Lb5;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Ln52;

    .line 75
    .line 76
    iget-object v4, v4, Ln52;->h:Lfr2;

    .line 77
    .line 78
    invoke-interface {v4}, Lfr2;->a()Lo23;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    iget v5, p0, Lry;->d:I

    .line 83
    .line 84
    int-to-long v7, v5

    .line 85
    invoke-virtual {v4, v7, v8}, Lo23;->g(J)Lo23;

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, Lk82;->c:Ljs0;

    .line 89
    .line 90
    invoke-virtual {v3, v4, v2}, Liv0;->l(Ljs0;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Liv0;->c()V

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-virtual {v3, v2}, Liv0;->j(Z)Lp92;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iput-object v0, v2, Lp92;->a:Lk82;

    .line 105
    .line 106
    invoke-virtual {v2}, Lp92;->a()Lr92;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget v2, v0, Lr92;->k:I

    .line 111
    .line 112
    invoke-static {v0}, Lwg3;->e(Lr92;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    const-wide/16 v7, -0x1

    .line 117
    .line 118
    cmp-long v7, v4, v7

    .line 119
    .line 120
    if-nez v7, :cond_0

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    iget-object v0, v0, Lr92;->h:Lk82;

    .line 124
    .line 125
    iget-object v0, v0, Lk82;->a:Lyw0;

    .line 126
    .line 127
    invoke-virtual {v3, v0, v4, v5}, Liv0;->k(Lyw0;J)Lfv0;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const v3, 0x7fffffff

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v3}, Lwg3;->f(Lht2;I)Z

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lfv0;->close()V

    .line 138
    .line 139
    .line 140
    :goto_0
    const/16 v0, 0xc8

    .line 141
    .line 142
    if-eq v2, v0, :cond_2

    .line 143
    .line 144
    const/16 p0, 0x197

    .line 145
    .line 146
    if-ne v2, p0, :cond_1

    .line 147
    .line 148
    iget-object p0, v1, Lhb2;->a:Lq5;

    .line 149
    .line 150
    iget-object p0, p0, Lq5;->f:Lgd3;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    const-string p0, "Failed to authenticate with proxy"

    .line 156
    .line 157
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-object v6

    .line 161
    :cond_1
    const-string p0, "Unexpected response code for CONNECT: "

    .line 162
    .line 163
    invoke-static {p0, v2}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object v6

    .line 171
    :cond_2
    new-instance v0, Lib2;

    .line 172
    .line 173
    const/4 v1, 0x6

    .line 174
    invoke-direct {v0, p0, v6, v1}, Lib2;-><init>(Ljb2;Ljava/lang/Throwable;I)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :cond_3
    invoke-static {v5}, Lt11;->S(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v6

    .line 182
    :cond_4
    invoke-static {v5}, Lt11;->S(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v6

    .line 186
    :cond_5
    invoke-static {v5}, Lt11;->S(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v6
.end method

.method public final l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lry;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lry;->m:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    :goto_0
    if-ge v2, v3, :cond_4

    .line 15
    .line 16
    move-object/from16 v4, p1

    .line 17
    .line 18
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Luy;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-boolean v6, v5, Luy;->a:Z

    .line 28
    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object v6, v5, Luy;->d:[Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    sget-object v8, Ldm1;->b:Ldm1;

    .line 41
    .line 42
    invoke-static {v6, v7, v8}, Lug3;->e([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v5, v5, Luy;->c:[Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    sget-object v7, Lps;->c:Lsl0;

    .line 58
    .line 59
    invoke-static {v5, v6, v7}, Lug3;->e([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 v3, -0x1

    .line 69
    if-eq v1, v3, :cond_3

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    :goto_2
    move/from16 v18, v1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    const/4 v1, 0x0

    .line 76
    goto :goto_2

    .line 77
    :goto_3
    new-instance v4, Lry;

    .line 78
    .line 79
    iget-object v14, v0, Lry;->j:Lhb2;

    .line 80
    .line 81
    iget-object v15, v0, Lry;->k:Ljava/util/List;

    .line 82
    .line 83
    iget-object v5, v0, Lry;->a:Liy2;

    .line 84
    .line 85
    iget-object v6, v0, Lry;->b:Lud0;

    .line 86
    .line 87
    iget v7, v0, Lry;->c:I

    .line 88
    .line 89
    iget v8, v0, Lry;->d:I

    .line 90
    .line 91
    iget v9, v0, Lry;->e:I

    .line 92
    .line 93
    iget v10, v0, Lry;->f:I

    .line 94
    .line 95
    iget-boolean v11, v0, Lry;->g:Z

    .line 96
    .line 97
    iget-object v12, v0, Lry;->h:Ls52;

    .line 98
    .line 99
    iget-object v13, v0, Lry;->i:Lx52;

    .line 100
    .line 101
    iget-object v0, v0, Lry;->l:Lk82;

    .line 102
    .line 103
    move-object/from16 v16, v0

    .line 104
    .line 105
    move/from16 v17, v2

    .line 106
    .line 107
    invoke-direct/range {v4 .. v18}, Lry;-><init>(Liy2;Lud0;IIIIZLs52;Lx52;Lhb2;Ljava/util/List;Lk82;IZ)V

    .line 108
    .line 109
    .line 110
    return-object v4

    .line 111
    :cond_4
    const/4 v0, 0x0

    .line 112
    return-object v0
.end method

.method public final m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lry;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lry;->m:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Lry;->l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lry;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Unable to find acceptable protocols. isFallback="

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-boolean p0, p0, Lry;->n:Z

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ", modes="

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const-string p1, ", supported protocols="

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {v0, p0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method
