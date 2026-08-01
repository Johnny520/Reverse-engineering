.class public final Lvz;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lvz;

.field private static final b:Ljava/lang/String; = "ImgDL"

.field private static final c:Ljava/util/concurrent/ExecutorService;

.field private static final d:I = 0x2

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvz;

    .line 2
    .line 3
    invoke-direct {v0}, Lvz;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvz;->a:Lvz;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Lvz;->c:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    sput v0, Lvz;->e:I

    .line 17
    .line 18
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Landroid/content/Context;IJLsw;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvz;->n(Ljava/lang/String;Landroid/content/Context;IJLsw;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvz;->s(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Lsw;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvz;->p(Ljava/lang/String;Lsw;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ljava/util/List;Lww;ILandroid/content/Context;J)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvz;->k(Ljava/util/List;Lww;ILandroid/content/Context;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Ljava/lang/String;Landroid/content/Context;IJLjava/util/concurrent/atomic/AtomicInteger;Lww;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lvz;->h(Ljava/lang/String;Landroid/content/Context;IJLjava/util/concurrent/atomic/AtomicInteger;Lww;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lvz;Landroid/content/Context;Ljava/util/List;Lww;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lvz;->f(Landroid/content/Context;Ljava/util/List;Lww;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final h(Ljava/lang/String;Landroid/content/Context;IJLjava/util/concurrent/atomic/AtomicInteger;Lww;I)V
    .locals 11

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    sget-object v1, Lsz;->a:Lsz;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Lsz;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    const/4 v2, 0x3

    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 26
    .line 27
    const/16 v3, 0x1f40

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0x7530

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/16 v4, 0xc8

    .line 49
    .line 50
    if-ne v3, v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-nez v3, :cond_0

    .line 57
    .line 58
    const-string v3, "image/jpeg"

    .line 59
    .line 60
    :cond_0
    sget-object v4, Lvz;->a:Lvz;

    .line 61
    .line 62
    invoke-direct {v4, v3}, Lvz;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Lp30;->S(Ljava/io/InputStream;)[B

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 78
    .line 79
    .line 80
    move-object v5, p1

    .line 81
    move v7, p2

    .line 82
    move-wide v9, p3

    .line 83
    invoke-direct/range {v4 .. v10}, Lvz;->r(Landroid/content/Context;[BILjava/lang/String;J)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    :catch_0
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    :goto_1
    invoke-virtual/range {p5 .. p5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {v0, p0, p1}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
.end method

.method public static synthetic j(Lvz;Landroid/content/Context;Ljava/util/List;Lww;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lvz;->i(Landroid/content/Context;Ljava/util/List;Lww;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final k(Ljava/util/List;Lww;ILandroid/content/Context;J)V
    .locals 40

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/4 v4, 0x0

    .line 8
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_c

    .line 13
    .line 14
    add-int/lit8 v5, v4, 0x1

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Luo0;

    .line 21
    .line 22
    sget-object v6, Llp;->a:Llp;

    .line 23
    .line 24
    invoke-virtual {v6}, Llp;->d()Z

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    new-instance v8, Llp$a;

    .line 31
    .line 32
    const/16 v16, 0xf

    .line 33
    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    const-wide/16 v10, 0x0

    .line 38
    .line 39
    const-wide/16 v12, 0x0

    .line 40
    .line 41
    const/4 v14, 0x0

    .line 42
    const/4 v15, 0x1

    .line 43
    invoke-direct/range {v8 .. v17}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v8}, Llp;->j(Llp$a;)V

    .line 47
    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v1, v0, v2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_0
    iget-object v7, v0, Luo0;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v7, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v0, v0, Luo0;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    const-string v0, "\u56fe\u7247 "

    .line 77
    .line 78
    const-string v8, "/"

    .line 79
    .line 80
    move/from16 v15, p2

    .line 81
    .line 82
    invoke-static {v5, v15, v0, v8}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v17

    .line 86
    new-instance v16, Llp$a;

    .line 87
    .line 88
    const/16 v24, 0x18

    .line 89
    .line 90
    const/16 v25, 0x0

    .line 91
    .line 92
    const-wide/16 v18, 0x0

    .line 93
    .line 94
    const-wide/16 v20, 0x0

    .line 95
    .line 96
    const/16 v22, 0x0

    .line 97
    .line 98
    const/16 v23, 0x0

    .line 99
    .line 100
    invoke-direct/range {v16 .. v25}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v0, v16

    .line 104
    .line 105
    invoke-virtual {v6, v0}, Llp;->j(Llp$a;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lsz;->a:Lsz;

    .line 109
    .line 110
    invoke-virtual {v0, v7}, Lsz;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    const/4 v7, 0x0

    .line 115
    :goto_1
    const/4 v0, 0x3

    .line 116
    const-string v8, "ImgDL"

    .line 117
    .line 118
    if-ge v7, v0, :cond_a

    .line 119
    .line 120
    sget-object v0, Llp;->a:Llp;

    .line 121
    .line 122
    invoke-virtual {v0}, Llp;->d()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_a

    .line 127
    .line 128
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 129
    .line 130
    invoke-direct {v0, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 141
    .line 142
    const/16 v9, 0x1f40

    .line 143
    .line 144
    invoke-virtual {v0, v9}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 145
    .line 146
    .line 147
    const/16 v9, 0x7530

    .line 148
    .line 149
    invoke-virtual {v0, v9}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 150
    .line 151
    .line 152
    const/4 v9, 0x1

    .line 153
    invoke-virtual {v0, v9}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    const/16 v10, 0xc8

    .line 164
    .line 165
    if-ne v9, v10, :cond_9

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    if-nez v9, :cond_1

    .line 172
    .line 173
    const-string v9, "image/jpeg"

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :catch_0
    move-exception v0

    .line 177
    move-object/from16 v29, v2

    .line 178
    .line 179
    :goto_2
    move/from16 v30, v5

    .line 180
    .line 181
    :goto_3
    move-object/from16 p0, v6

    .line 182
    .line 183
    :goto_4
    move-object v2, v8

    .line 184
    goto/16 :goto_b

    .line 185
    .line 186
    :cond_1
    :goto_5
    sget-object v10, Lvz;->a:Lvz;

    .line 187
    .line 188
    invoke-direct {v10, v9}, Lvz;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    int-to-long v9, v9

    .line 197
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    new-instance v14, Ljava/io/ByteArrayOutputStream;

    .line 202
    .line 203
    invoke-direct {v14}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 204
    .line 205
    .line 206
    const/16 v3, 0x4000

    .line 207
    .line 208
    new-array v3, v3, [B

    .line 209
    .line 210
    invoke-virtual {v13, v3}, Ljava/io/InputStream;->read([B)I

    .line 211
    .line 212
    .line 213
    move-result v16
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 214
    const-wide/16 v26, 0x0

    .line 215
    .line 216
    move-object/from16 v28, v0

    .line 217
    .line 218
    move-object/from16 v29, v2

    .line 219
    .line 220
    move/from16 v0, v16

    .line 221
    .line 222
    move-wide/from16 v18, v26

    .line 223
    .line 224
    move-wide/from16 v20, v18

    .line 225
    .line 226
    :goto_6
    const/4 v2, -0x1

    .line 227
    if-eq v0, v2, :cond_6

    .line 228
    .line 229
    :try_start_1
    sget-object v2, Llp;->a:Llp;

    .line 230
    .line 231
    invoke-virtual {v2}, Llp;->d()Z

    .line 232
    .line 233
    .line 234
    move-result v16

    .line 235
    if-eqz v16, :cond_3

    .line 236
    .line 237
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v28 .. v28}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 241
    .line 242
    .line 243
    new-instance v30, Llp$a;

    .line 244
    .line 245
    const/16 v38, 0xf

    .line 246
    .line 247
    const/16 v39, 0x0

    .line 248
    .line 249
    const/16 v31, 0x0

    .line 250
    .line 251
    const-wide/16 v32, 0x0

    .line 252
    .line 253
    const-wide/16 v34, 0x0

    .line 254
    .line 255
    const/16 v36, 0x0

    .line 256
    .line 257
    const/16 v37, 0x1

    .line 258
    .line 259
    invoke-direct/range {v30 .. v39}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v0, v30

    .line 263
    .line 264
    invoke-virtual {v2, v0}, Llp;->j(Llp$a;)V

    .line 265
    .line 266
    .line 267
    if-eqz v1, :cond_2

    .line 268
    .line 269
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-interface {v1, v0, v2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :catch_1
    move-exception v0

    .line 282
    goto :goto_2

    .line 283
    :cond_2
    :goto_7
    return-void

    .line 284
    :cond_3
    move/from16 v30, v5

    .line 285
    .line 286
    const/4 v5, 0x0

    .line 287
    :try_start_2
    invoke-virtual {v14, v3, v5, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 288
    .line 289
    .line 290
    move-object/from16 p0, v6

    .line 291
    .line 292
    int-to-long v5, v0

    .line 293
    add-long v18, v18, v5

    .line 294
    .line 295
    sub-long v5, v18, v20

    .line 296
    .line 297
    const-wide/32 v22, 0x20000

    .line 298
    .line 299
    .line 300
    cmp-long v0, v5, v22

    .line 301
    .line 302
    if-lez v0, :cond_5

    .line 303
    .line 304
    :try_start_3
    new-instance v16, Llp$a;

    .line 305
    .line 306
    cmp-long v0, v9, v26

    .line 307
    .line 308
    if-lez v0, :cond_4

    .line 309
    .line 310
    move-wide/from16 v20, v9

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_4
    const-wide/16 v5, -0x1

    .line 314
    .line 315
    move-wide/from16 v20, v5

    .line 316
    .line 317
    :goto_8
    const/16 v24, 0x18

    .line 318
    .line 319
    const/16 v25, 0x0

    .line 320
    .line 321
    const/16 v22, 0x0

    .line 322
    .line 323
    const/16 v23, 0x0

    .line 324
    .line 325
    invoke-direct/range {v16 .. v25}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 326
    .line 327
    .line 328
    move-object/from16 v0, v16

    .line 329
    .line 330
    invoke-virtual {v2, v0}, Llp;->j(Llp$a;)V

    .line 331
    .line 332
    .line 333
    move-wide/from16 v20, v18

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :catch_2
    move-exception v0

    .line 337
    goto/16 :goto_4

    .line 338
    .line 339
    :cond_5
    :goto_9
    invoke-virtual {v13, v3}, Ljava/io/InputStream;->read([B)I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    move-object/from16 v6, p0

    .line 344
    .line 345
    move/from16 v5, v30

    .line 346
    .line 347
    goto :goto_6

    .line 348
    :catch_3
    move-exception v0

    .line 349
    goto/16 :goto_3

    .line 350
    .line 351
    :cond_6
    move/from16 v30, v5

    .line 352
    .line 353
    move-object/from16 p0, v6

    .line 354
    .line 355
    sget-object v0, Llp;->a:Llp;

    .line 356
    .line 357
    new-instance v16, Llp$a;

    .line 358
    .line 359
    cmp-long v2, v9, v26

    .line 360
    .line 361
    move-wide/from16 v26, v18

    .line 362
    .line 363
    if-lez v2, :cond_7

    .line 364
    .line 365
    move-wide/from16 v18, v9

    .line 366
    .line 367
    :cond_7
    if-lez v2, :cond_8

    .line 368
    .line 369
    move-wide/from16 v20, v9

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_8
    move-wide/from16 v20, v26

    .line 373
    .line 374
    :goto_a
    const/16 v24, 0x18

    .line 375
    .line 376
    const/16 v25, 0x0

    .line 377
    .line 378
    const/16 v22, 0x0

    .line 379
    .line 380
    const/16 v23, 0x0

    .line 381
    .line 382
    invoke-direct/range {v16 .. v25}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 383
    .line 384
    .line 385
    move-object/from16 v2, v16

    .line 386
    .line 387
    invoke-virtual {v0, v2}, Llp;->j(Llp$a;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v28 .. v28}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 394
    .line 395
    .line 396
    move-object v2, v8

    .line 397
    :try_start_4
    sget-object v8, Lvz;->a:Lvz;

    .line 398
    .line 399
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    move-object/from16 v9, p3

    .line 407
    .line 408
    move-wide/from16 v13, p4

    .line 409
    .line 410
    invoke-direct/range {v8 .. v14}, Lvz;->r(Landroid/content/Context;[BILjava/lang/String;J)V

    .line 411
    .line 412
    .line 413
    goto :goto_d

    .line 414
    :catch_4
    move-exception v0

    .line 415
    goto :goto_b

    .line 416
    :cond_9
    move-object/from16 v28, v0

    .line 417
    .line 418
    move-object/from16 v29, v2

    .line 419
    .line 420
    move/from16 v30, v5

    .line 421
    .line 422
    move-object/from16 p0, v6

    .line 423
    .line 424
    move-object v2, v8

    .line 425
    invoke-virtual/range {v28 .. v28}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 426
    .line 427
    .line 428
    goto :goto_c

    .line 429
    :goto_b
    sget-object v3, Llb0;->a:Llb0;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    new-instance v5, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v6, "dl fail idx="

    .line 438
    .line 439
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    const-string v6, ": "

    .line 446
    .line 447
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v3, v2, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    :goto_c
    add-int/lit8 v7, v7, 0x1

    .line 461
    .line 462
    move-object/from16 v6, p0

    .line 463
    .line 464
    move-object/from16 v2, v29

    .line 465
    .line 466
    move/from16 v5, v30

    .line 467
    .line 468
    goto/16 :goto_1

    .line 469
    .line 470
    :cond_a
    move-object/from16 v29, v2

    .line 471
    .line 472
    move/from16 v30, v5

    .line 473
    .line 474
    move-object v2, v8

    .line 475
    sget-object v0, Llb0;->a:Llb0;

    .line 476
    .line 477
    new-instance v3, Ljava/lang/StringBuilder;

    .line 478
    .line 479
    const-string v5, "dl failed after retry idx="

    .line 480
    .line 481
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    invoke-virtual {v0, v2, v3}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :goto_d
    if-eqz v1, :cond_b

    .line 495
    .line 496
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    invoke-interface {v1, v0, v2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    :cond_b
    move-object/from16 v2, v29

    .line 508
    .line 509
    move/from16 v4, v30

    .line 510
    .line 511
    goto/16 :goto_0

    .line 512
    .line 513
    :cond_c
    sget-object v0, Llp;->a:Llp;

    .line 514
    .line 515
    new-instance v1, Llp$a;

    .line 516
    .line 517
    const/16 v9, 0x17

    .line 518
    .line 519
    const/4 v10, 0x0

    .line 520
    const/4 v2, 0x0

    .line 521
    const-wide/16 v3, 0x0

    .line 522
    .line 523
    const-wide/16 v5, 0x0

    .line 524
    .line 525
    const/4 v7, 0x1

    .line 526
    const/4 v8, 0x0

    .line 527
    invoke-direct/range {v1 .. v10}, Llp$a;-><init>(Ljava/lang/String;JJZZILpl;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v1}, Llp;->j(Llp$a;)V

    .line 531
    .line 532
    .line 533
    return-void
.end method

.method private final l(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string p0, "heif"

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_6

    .line 9
    .line 10
    const-string v1, "heic"

    .line 11
    .line 12
    invoke-static {p1, v1, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "webp"

    .line 20
    .line 21
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    const-string p0, "png"

    .line 29
    .line 30
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    const-string p0, "gif"

    .line 38
    .line 39
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    const-string p0, "bmp"

    .line 47
    .line 48
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_4
    const-string p0, "svg"

    .line 56
    .line 57
    invoke-static {p1, p0, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_5
    const-string p0, "jpg"

    .line 65
    .line 66
    :cond_6
    :goto_0
    return-object p0
.end method

.method private static final n(Ljava/lang/String;Landroid/content/Context;IJLsw;)V
    .locals 12

    .line 1
    sget-object v0, Lsz;->a:Lsz;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lsz;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    const/4 v2, 0x3

    .line 10
    if-ge v1, v2, :cond_2

    .line 11
    .line 12
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 25
    .line 26
    const/16 v3, 0x1f40

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 29
    .line 30
    .line 31
    const/16 v3, 0x7530

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const/16 v5, 0xc8

    .line 48
    .line 49
    if-ne v4, v5, :cond_1

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-nez v4, :cond_0

    .line 56
    .line 57
    const-string v4, "image/jpeg"

    .line 58
    .line 59
    :cond_0
    sget-object v5, Lvz;->a:Lvz;

    .line 60
    .line 61
    invoke-direct {v5, v4}, Lvz;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Lp30;->S(Ljava/io/InputStream;)[B

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 77
    .line 78
    .line 79
    move-object v6, p1

    .line 80
    move v8, p2

    .line 81
    move-wide v10, p3

    .line 82
    invoke-direct/range {v5 .. v11}, Lvz;->r(Landroid/content/Context;[BILjava/lang/String;J)V

    .line 83
    .line 84
    .line 85
    move v0, v3

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    :catch_0
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    move-object/from16 p1, p5

    .line 98
    .line 99
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method private static final p(Ljava/lang/String;Lsw;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const/4 v2, 0x3

    .line 4
    if-ge v1, v2, :cond_2

    .line 5
    .line 6
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 7
    .line 8
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    const/16 v3, 0x1388

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 23
    .line 24
    .line 25
    const/16 v3, 0x2710

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/16 v4, 0xc8

    .line 42
    .line 43
    if-ne v3, v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 54
    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    :catch_0
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    :goto_1
    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private final q(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sparse-switch p0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :sswitch_0
    const-string p0, "webp"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "image/webp"

    .line 19
    .line 20
    return-object p0

    .line 21
    :sswitch_1
    const-string p0, "heif"

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string p0, "image/heif"

    .line 31
    .line 32
    return-object p0

    .line 33
    :sswitch_2
    const-string p0, "svg"

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string p0, "image/svg+xml"

    .line 43
    .line 44
    return-object p0

    .line 45
    :sswitch_3
    const-string p0, "png"

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const-string p0, "image/png"

    .line 55
    .line 56
    return-object p0

    .line 57
    :sswitch_4
    const-string p0, "gif"

    .line 58
    .line 59
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    const-string p0, "image/gif"

    .line 67
    .line 68
    return-object p0

    .line 69
    :sswitch_5
    const-string p0, "bmp"

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_5

    .line 76
    .line 77
    :goto_0
    const-string p0, "image/jpeg"

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_5
    const-string p0, "image/bmp"

    .line 81
    .line 82
    return-object p0

    .line 83
    :sswitch_data_0
    .sparse-switch
        0x17d85 -> :sswitch_5
        0x18fc4 -> :sswitch_4
        0x1b229 -> :sswitch_3
        0x1be64 -> :sswitch_2
        0x30ceda -> :sswitch_1
        0x379f9c -> :sswitch_0
    .end sparse-switch
.end method

.method private final r(Landroid/content/Context;[BILjava/lang/String;J)V
    .locals 5

    .line 1
    const-string v0, "whs-"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lm00;->S:Lm00$a;

    .line 4
    .line 5
    const-string v2, "\u539f\u56fe_whs"

    .line 6
    .line 7
    invoke-virtual {v1, p1, v2}, Lm00$a;->i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    add-int/lit8 v2, p3, 0x1

    .line 12
    .line 13
    new-instance v3, Ljava/io/File;

    .line 14
    .line 15
    new-instance v4, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, "-"

    .line 24
    .line 25
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, "."

    .line 32
    .line 33
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {v3, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ljava/io/FileOutputStream;

    .line 47
    .line 48
    invoke-direct {v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    :try_start_1
    invoke-virtual {v0, p2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    :try_start_2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 55
    .line 56
    .line 57
    int-to-long p2, p3

    .line 58
    add-long/2addr p5, p2

    .line 59
    invoke-virtual {v3, p5, p6}, Ljava/io/File;->setLastModified(J)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    filled-new-array {p2}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p0, p4}, Lvz;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    filled-new-array {p0}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance p3, Lcp;

    .line 79
    .line 80
    const/4 p4, 0x6

    .line 81
    invoke-direct {p3, p4}, Lcp;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2, p0, p3}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    :catchall_1
    move-exception p1

    .line 91
    :try_start_4
    invoke-static {v0, p0}, Li4;->k(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 95
    :catch_0
    return-void
.end method

.method private static final s(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final f(Landroid/content/Context;Ljava/util/List;Lww;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Luo0;",
            ">;",
            "Lww;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v8

    .line 11
    new-instance v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-direct {v6, p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Luo0;

    .line 36
    .line 37
    iget-object v0, p2, Luo0;->d:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v1, v0

    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    iget-object p2, p2, Luo0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sget-object p2, Lvz;->c:Ljava/util/concurrent/ExecutorService;

    .line 51
    .line 52
    new-instance v0, Ltz;

    .line 53
    .line 54
    move-object v2, p1

    .line 55
    move-object v7, p3

    .line 56
    invoke-direct/range {v0 .. v8}, Ltz;-><init>(Ljava/lang/String;Landroid/content/Context;IJLjava/util/concurrent/atomic/AtomicInteger;Lww;I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
.end method

.method public final i(Landroid/content/Context;Ljava/util/List;Lww;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Luo0;",
            ">;",
            "Lww;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    sget-object p0, Lvz;->c:Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    new-instance v0, Luz;

    .line 18
    .line 19
    move-object v4, p1

    .line 20
    move-object v1, p2

    .line 21
    move-object v2, p3

    .line 22
    invoke-direct/range {v0 .. v6}, Luz;-><init>(Ljava/util/List;Lww;ILandroid/content/Context;J)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final m(Landroid/content/Context;Ljava/lang/String;ILsw;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "I",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    sget-object p0, Lvz;->c:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    new-instance v0, Luz;

    .line 17
    .line 18
    move-object v2, p1

    .line 19
    move-object v1, p2

    .line 20
    move v3, p3

    .line 21
    move-object v6, p4

    .line 22
    invoke-direct/range {v0 .. v6}, Luz;-><init>(Ljava/lang/String;Landroid/content/Context;IJLsw;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final o(Ljava/lang/String;Lsw;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lvz;->c:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    new-instance v0, Lt4;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, v1, p1, p2}, Lt4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
