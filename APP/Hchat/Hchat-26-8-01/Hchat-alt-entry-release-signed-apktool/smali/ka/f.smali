.class public final Lka/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:Ljava/util/List;


# instance fields
.field public final a:Lia/t;

.field public final b:Landroid/content/Context;

.field public final c:Lka/g;

.field public final d:Lka/a;

.field public final e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v4, ".ogg"

    .line 2
    .line 3
    const-string v5, ".wav"

    .line 4
    .line 5
    const-string v0, ".mp3"

    .line 6
    .line 7
    const-string v1, ".m4a"

    .line 8
    .line 9
    const-string v2, ".mp4"

    .line 10
    .line 11
    const-string v3, ".flac"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lka/f;->f:Ljava/util/List;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lia/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lka/f;->a:Lia/t;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p2, p1

    .line 14
    :goto_0
    iput-object p2, p0, Lka/f;->b:Landroid/content/Context;

    .line 15
    .line 16
    new-instance p2, Lka/g;

    .line 17
    .line 18
    invoke-direct {p2, p1}, Lka/g;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lka/f;->c:Lka/g;

    .line 22
    .line 23
    new-instance p1, Lka/a;

    .line 24
    .line 25
    invoke-direct {p1}, Lka/a;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lka/f;->d:Lka/a;

    .line 29
    .line 30
    new-instance p1, Lc9/q;

    .line 31
    .line 32
    const/16 p2, 0x13

    .line 33
    .line 34
    invoke-direct {p1, p2}, Lc9/q;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lka/f;->e:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    return-void
.end method

.method public static a(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static e(JLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    cmp-long v1, p0, v1

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0, p1, p2, p3}, Lk8/g;->u(JLjava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0, p2, p3}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final b(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Z
    .locals 16

    .line 1
    invoke-static/range {p3 .. p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v2, 0x0

    .line 10
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v3, v0

    .line 25
    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 26
    .line 27
    const/16 v0, 0x3a98

    .line 28
    .line 29
    :try_start_1
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 30
    .line 31
    .line 32
    const/16 v0, 0x7530

    .line 33
    .line 34
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 39
    .line 40
    .line 41
    const-string v2, "User-Agent"

    .line 42
    .line 43
    const-string v4, "MicroMessenger Client"

    .line 44
    .line 45
    invoke-virtual {v3, v2, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v2, "Referer"

    .line 49
    .line 50
    const-string v4, "https://y.qq.com/"

    .line 51
    .line 52
    invoke-virtual {v3, v2, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/16 v4, 0xc8

    .line 60
    .line 61
    if-gt v4, v2, :cond_9

    .line 62
    .line 63
    const/16 v4, 0x12c

    .line 64
    .line 65
    if-ge v2, v4, :cond_9

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    const-string v2, ""

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object v2, v3

    .line 78
    goto/16 :goto_8

    .line 79
    .line 80
    :cond_1
    :goto_0
    const/16 v4, 0x3b

    .line 81
    .line 82
    invoke-static {v2, v4}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 87
    .line 88
    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const-string v4, "text/"

    .line 96
    .line 97
    invoke-static {v2, v4, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_9

    .line 102
    .line 103
    const-string v4, "json"

    .line 104
    .line 105
    invoke-static {v2, v4, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-nez v4, :cond_9

    .line 110
    .line 111
    const-string v4, "xml"

    .line 112
    .line 113
    invoke-static {v2, v4, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_2

    .line 118
    .line 119
    goto/16 :goto_7

    .line 120
    .line 121
    :cond_2
    invoke-virtual {v3}, Ljava/net/URLConnection;->getContentLengthLong()J

    .line 122
    .line 123
    .line 124
    move-result-wide v4

    .line 125
    const-wide/32 v6, 0x8000000

    .line 126
    .line 127
    .line 128
    cmp-long v2, v4, v6

    .line 129
    .line 130
    if-lez v2, :cond_3

    .line 131
    .line 132
    goto/16 :goto_7

    .line 133
    .line 134
    :cond_3
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 135
    .line 136
    .line 137
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    if-eqz v2, :cond_9

    .line 139
    .line 140
    :try_start_2
    new-instance v4, Ljava/io/FileOutputStream;

    .line 141
    .line 142
    move-object/from16 v5, p1

    .line 143
    .line 144
    invoke-direct {v4, v5, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 145
    .line 146
    .line 147
    const/16 v8, 0x2000

    .line 148
    .line 149
    :try_start_3
    new-array v8, v8, [B

    .line 150
    .line 151
    const-wide/16 v9, 0x0

    .line 152
    .line 153
    move-wide v11, v9

    .line 154
    :goto_1
    invoke-virtual {v2, v8}, Ljava/io/InputStream;->read([B)I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-gez v13, :cond_4

    .line 159
    .line 160
    move v6, v1

    .line 161
    goto :goto_2

    .line 162
    :cond_4
    int-to-long v14, v13

    .line 163
    add-long/2addr v11, v14

    .line 164
    cmp-long v14, v11, v6

    .line 165
    .line 166
    if-lez v14, :cond_8

    .line 167
    .line 168
    move v6, v0

    .line 169
    :goto_2
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 170
    .line 171
    .line 172
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 173
    .line 174
    .line 175
    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 176
    .line 177
    .line 178
    if-nez v6, :cond_9

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_9

    .line 185
    .line 186
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 187
    .line 188
    .line 189
    move-result-wide v6

    .line 190
    cmp-long v2, v6, v9

    .line 191
    .line 192
    if-gtz v2, :cond_5

    .line 193
    .line 194
    goto/16 :goto_7

    .line 195
    .line 196
    :cond_5
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->exists()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_6

    .line 201
    .line 202
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->delete()Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-nez v2, :cond_6

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_6
    invoke-virtual/range {p1 .. p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_9

    .line 214
    .line 215
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->isFile()Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_9

    .line 220
    .line 221
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->length()J

    .line 222
    .line 223
    .line 224
    move-result-wide v4

    .line 225
    cmp-long v2, v4, v9

    .line 226
    .line 227
    if-lez v2, :cond_9

    .line 228
    .line 229
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    .line 230
    .line 231
    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 232
    .line 233
    .line 234
    :try_start_6
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-virtual {v2, v4}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    const/16 v4, 0x9

    .line 242
    .line 243
    invoke-virtual {v2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    if-eqz v4, :cond_7

    .line 248
    .line 249
    invoke-static {v4}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    if-eqz v4, :cond_7

    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 256
    .line 257
    .line 258
    move-result-wide v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 259
    cmp-long v4, v4, v9

    .line 260
    .line 261
    if-lez v4, :cond_7

    .line 262
    .line 263
    move v4, v0

    .line 264
    goto :goto_3

    .line 265
    :cond_7
    move v4, v1

    .line 266
    :goto_3
    :try_start_7
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :catchall_1
    :try_start_8
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 271
    .line 272
    .line 273
    :catchall_2
    move v4, v1

    .line 274
    :catchall_3
    :goto_4
    if-eqz v4, :cond_9

    .line 275
    .line 276
    move v1, v0

    .line 277
    goto :goto_7

    .line 278
    :catchall_4
    move-exception v0

    .line 279
    move-object v1, v0

    .line 280
    goto :goto_6

    .line 281
    :catchall_5
    move-exception v0

    .line 282
    move-object v1, v0

    .line 283
    goto :goto_5

    .line 284
    :cond_8
    :try_start_9
    invoke-virtual {v4, v8, v1, v13}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 285
    .line 286
    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :goto_5
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 290
    :catchall_6
    move-exception v0

    .line 291
    :try_start_b
    invoke-static {v4, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 295
    :goto_6
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 296
    :catchall_7
    move-exception v0

    .line 297
    :try_start_d
    invoke-static {v2, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    throw v0

    .line 301
    :cond_9
    :goto_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 302
    .line 303
    .line 304
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 305
    goto :goto_9

    .line 306
    :catchall_8
    move-exception v0

    .line 307
    :goto_8
    new-instance v1, Lsf/f;

    .line 308
    .line 309
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    move-object v0, v1

    .line 313
    move-object v3, v2

    .line 314
    :goto_9
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    move-object/from16 v2, p0

    .line 319
    .line 320
    if-eqz v1, :cond_a

    .line 321
    .line 322
    iget-object v4, v2, Lka/f;->a:Lia/t;

    .line 323
    .line 324
    const-string v5, "QQ\u70b9\u6b4c\u6b4c\u66f2\u97f3\u9891\u4e0b\u8f7d\u5931\u8d25"

    .line 325
    .line 326
    invoke-virtual {v4, v5, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    :cond_a
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 330
    .line 331
    instance-of v4, v0, Lsf/f;

    .line 332
    .line 333
    if-eqz v4, :cond_b

    .line 334
    .line 335
    move-object v0, v1

    .line 336
    :cond_b
    check-cast v0, Ljava/lang/Boolean;

    .line 337
    .line 338
    if-eqz v3, :cond_c

    .line 339
    .line 340
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 341
    .line 342
    .line 343
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    return v0
.end method

.method public final c(Ljava/lang/String;)Lka/d;
    .locals 7

    .line 1
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lka/f;->c:Lka/g;

    .line 10
    .line 11
    const-string v1, "qq_music_order_triggers"

    .line 12
    .line 13
    const-string v2, "\u70b9\u6b4c"

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lka/g;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v3, 0x3

    .line 20
    new-array v3, v3, [C

    .line 21
    .line 22
    fill-array-data v3, :array_0

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x6

    .line 26
    invoke-static {v1, v3, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v5, v3}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v6, v5

    .line 79
    check-cast v6, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-lez v6, :cond_1

    .line 86
    .line 87
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    invoke-static {v1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_3

    .line 104
    .line 105
    invoke-static {v2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    const/4 v3, 0x0

    .line 118
    const/4 v5, 0x0

    .line 119
    if-eqz v2, :cond_5

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move-object v6, v2

    .line 126
    check-cast v6, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {p1, v6, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-eqz v6, :cond_4

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move-object v2, v5

    .line 136
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 137
    .line 138
    if-eqz v2, :cond_b

    .line 139
    .line 140
    invoke-static {p1, v2}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const-string v1, "qq_music_order_custom_singer"

    .line 153
    .line 154
    invoke-virtual {v0, v1, v3}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    const/4 v1, 0x1

    .line 159
    if-eqz v0, :cond_8

    .line 160
    .line 161
    const/16 v0, 0x26

    .line 162
    .line 163
    invoke-static {p1, v0, v3, v4}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-ltz v0, :cond_8

    .line 168
    .line 169
    add-int/lit8 v2, v0, 0x1

    .line 170
    .line 171
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-lez v4, :cond_6

    .line 188
    .line 189
    move v4, v1

    .line 190
    goto :goto_3

    .line 191
    :cond_6
    move v4, v3

    .line 192
    :goto_3
    if-eqz v4, :cond_7

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_7
    move-object v2, v5

    .line 196
    :goto_4
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    goto :goto_5

    .line 209
    :cond_8
    move-object v2, v5

    .line 210
    :goto_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-lez v0, :cond_9

    .line 215
    .line 216
    move v3, v1

    .line 217
    :cond_9
    if-eqz v3, :cond_a

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_a
    move-object p1, v5

    .line 221
    :goto_6
    if-eqz p1, :cond_b

    .line 222
    .line 223
    new-instance v0, Lka/d;

    .line 224
    .line 225
    invoke-direct {v0, p1, v2}, Lka/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-object v0

    .line 229
    :cond_b
    return-object v5

    .line 230
    nop

    .line 231
    :array_0
    .array-data 2
        0x2cs
        -0xf4s
        0xas
    .end array-data
.end method

.method public final d(Ljava/lang/String;JLjava/lang/String;Lka/d;)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p5

    .line 4
    .line 5
    iget-object v5, v4, Lka/d;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v6, v1, Lka/f;->d:Lka/a;

    .line 8
    .line 9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v7, "https://c.y.qq.com/lyric/fcgi-bin/fcg_query_lyric_new.fcg?format=json&nobase64=1&songmid="

    .line 13
    .line 14
    const-string v8, "param"

    .line 15
    .line 16
    const-string v9, "module"

    .line 17
    .line 18
    const-string v10, "method"

    .line 19
    .line 20
    const-string v11, "req"

    .line 21
    .line 22
    const-string v14, "1882"

    .line 23
    .line 24
    const-string v15, "cv"

    .line 25
    .line 26
    const-string v2, "19"

    .line 27
    .line 28
    const-string v4, "ct"

    .line 29
    .line 30
    const-string v3, "comm"

    .line 31
    .line 32
    const-string v12, "https://u.y.qq.com/cgi-bin/musicu.fcg?data="

    .line 33
    .line 34
    new-instance v0, Lsf/e;

    .line 35
    .line 36
    const-string v13, "User-Agent"

    .line 37
    .line 38
    const-string v1, "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 (KHTML, like Gecko) Mobile Safari/537.36"

    .line 39
    .line 40
    invoke-direct {v0, v13, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lsf/e;

    .line 44
    .line 45
    move-object/from16 v16, v13

    .line 46
    .line 47
    const-string v13, "Referer"

    .line 48
    .line 49
    move-object/from16 v17, v7

    .line 50
    .line 51
    const-string v7, "https://y.qq.com/"

    .line 52
    .line 53
    invoke-direct {v1, v13, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v18, v7

    .line 57
    .line 58
    new-instance v7, Lsf/e;

    .line 59
    .line 60
    move-object/from16 v19, v13

    .line 61
    .line 62
    const-string v13, "Origin"

    .line 63
    .line 64
    move-object/from16 v20, v6

    .line 65
    .line 66
    const-string v6, "https://y.qq.com"

    .line 67
    .line 68
    invoke-direct {v7, v13, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v6, Lsf/e;

    .line 72
    .line 73
    const-string v13, "Accept"

    .line 74
    .line 75
    move-object/from16 v21, v12

    .line 76
    .line 77
    const-string v12, "application/json, text/plain, */*"

    .line 78
    .line 79
    invoke-direct {v6, v13, v12}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    filled-new-array {v0, v1, v7, v6}, [Lsf/e;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 91
    .line 92
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v6, Lorg/json/JSONObject;

    .line 96
    .line 97
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v6, v15, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v0, v3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    new-instance v6, Lorg/json/JSONObject;

    .line 112
    .line 113
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v7, "DoSearchForQQMusicDesktop"

    .line 117
    .line 118
    invoke-virtual {v6, v10, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    const-string v7, "music.search.SearchCgiService"

    .line 122
    .line 123
    invoke-virtual {v6, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    new-instance v7, Lorg/json/JSONObject;

    .line 127
    .line 128
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v13, "num_per_page"

    .line 132
    .line 133
    const/16 v12, 0xa

    .line 134
    .line 135
    invoke-virtual {v7, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    const-string v12, "page_num"

    .line 139
    .line 140
    const/4 v13, 0x1

    .line 141
    invoke-virtual {v7, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    const-string v12, "query"

    .line 145
    .line 146
    invoke-virtual {v7, v12, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 147
    .line 148
    .line 149
    const-string v12, "search_type"

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    invoke-virtual {v7, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v11, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget-object v6, Log/a;->a:Ljava/nio/charset/Charset;

    .line 166
    .line 167
    invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v0, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    new-instance v6, Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 176
    .line 177
    move-object/from16 v7, v21

    .line 178
    .line 179
    :try_start_1
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 189
    move-object/from16 v6, v20

    .line 190
    .line 191
    :try_start_2
    invoke-virtual {v6, v0, v1}, Lka/a;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, Lka/a;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 196
    .line 197
    .line 198
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    goto :goto_1

    .line 200
    :catchall_0
    move-exception v0

    .line 201
    goto :goto_0

    .line 202
    :catchall_1
    move-exception v0

    .line 203
    move-object/from16 v6, v20

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :catchall_2
    move-exception v0

    .line 207
    move-object/from16 v6, v20

    .line 208
    .line 209
    move-object/from16 v7, v21

    .line 210
    .line 211
    :goto_0
    new-instance v12, Lsf/f;

    .line 212
    .line 213
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    move-object v0, v12

    .line 217
    :goto_1
    nop

    .line 218
    instance-of v12, v0, Lsf/f;

    .line 219
    .line 220
    if-eqz v12, :cond_0

    .line 221
    .line 222
    const/4 v0, 0x0

    .line 223
    :cond_0
    check-cast v0, Lorg/json/JSONObject;

    .line 224
    .line 225
    const-string v12, "mid"

    .line 226
    .line 227
    const-string v13, "data"

    .line 228
    .line 229
    move-object/from16 v21, v7

    .line 230
    .line 231
    const-string v7, ""

    .line 232
    .line 233
    if-eqz v0, :cond_1

    .line 234
    .line 235
    move-object/from16 v24, v5

    .line 236
    .line 237
    move-object/from16 v23, v7

    .line 238
    .line 239
    goto/16 :goto_6

    .line 240
    .line 241
    :cond_1
    const-string v0, "https://c.y.qq.com/splcloud/fcgi-bin/smartbox_new.fcg?format=json&inCharset=utf8&outCharset=utf-8&key="

    .line 242
    .line 243
    :try_start_3
    sget-object v22, Log/a;->a:Ljava/nio/charset/Charset;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 244
    .line 245
    move-object/from16 v23, v7

    .line 246
    .line 247
    :try_start_4
    invoke-virtual/range {v22 .. v22}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    invoke-static {v5, v7}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 255
    move-object/from16 v24, v5

    .line 256
    .line 257
    :try_start_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v6, v0, v1}, Lka/a;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    if-eqz v0, :cond_5

    .line 274
    .line 275
    new-instance v5, Lorg/json/JSONObject;

    .line 276
    .line 277
    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-eqz v0, :cond_2

    .line 285
    .line 286
    const-string v5, "song"

    .line 287
    .line 288
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz v0, :cond_2

    .line 293
    .line 294
    const-string v5, "itemlist"

    .line 295
    .line 296
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-eqz v0, :cond_2

    .line 301
    .line 302
    const/4 v5, 0x0

    .line 303
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-eqz v0, :cond_2

    .line 308
    .line 309
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    goto :goto_2

    .line 314
    :catchall_3
    move-exception v0

    .line 315
    goto/16 :goto_4

    .line 316
    .line 317
    :cond_2
    const/4 v0, 0x0

    .line 318
    :goto_2
    if-nez v0, :cond_3

    .line 319
    .line 320
    move-object/from16 v0, v23

    .line 321
    .line 322
    :cond_3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    if-eqz v5, :cond_4

    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_4
    new-instance v5, Lorg/json/JSONObject;

    .line 330
    .line 331
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 332
    .line 333
    .line 334
    new-instance v7, Lorg/json/JSONObject;

    .line 335
    .line 336
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v7, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-virtual {v2, v15, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-virtual {v5, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 348
    .line 349
    .line 350
    new-instance v2, Lorg/json/JSONObject;

    .line 351
    .line 352
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 353
    .line 354
    .line 355
    const-string v4, "music.pf_song_detail_svr"

    .line 356
    .line 357
    invoke-virtual {v2, v9, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 358
    .line 359
    .line 360
    const-string v4, "get_song_detail"

    .line 361
    .line 362
    invoke-virtual {v2, v10, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 363
    .line 364
    .line 365
    new-instance v4, Lorg/json/JSONObject;

    .line 366
    .line 367
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 368
    .line 369
    .line 370
    const-string v7, "song_mid"

    .line 371
    .line 372
    invoke-virtual {v4, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v2, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual/range {v22 .. v22}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    new-instance v2, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    move-object/from16 v7, v21

    .line 397
    .line 398
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v6, v0, v1}, Lka/a;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    if-eqz v0, :cond_5

    .line 413
    .line 414
    new-instance v1, Lorg/json/JSONObject;

    .line 415
    .line 416
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    if-eqz v0, :cond_5

    .line 424
    .line 425
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-eqz v0, :cond_5

    .line 430
    .line 431
    const-string v1, "track_info"

    .line 432
    .line 433
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 434
    .line 435
    .line 436
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 437
    goto :goto_5

    .line 438
    :cond_5
    :goto_3
    const/4 v0, 0x0

    .line 439
    goto :goto_5

    .line 440
    :catchall_4
    move-exception v0

    .line 441
    move-object/from16 v24, v5

    .line 442
    .line 443
    goto :goto_4

    .line 444
    :catchall_5
    move-exception v0

    .line 445
    move-object/from16 v24, v5

    .line 446
    .line 447
    move-object/from16 v23, v7

    .line 448
    .line 449
    :goto_4
    new-instance v1, Lsf/f;

    .line 450
    .line 451
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 452
    .line 453
    .line 454
    move-object v0, v1

    .line 455
    :goto_5
    nop

    .line 456
    instance-of v1, v0, Lsf/f;

    .line 457
    .line 458
    if-eqz v1, :cond_6

    .line 459
    .line 460
    const/4 v0, 0x0

    .line 461
    :cond_6
    check-cast v0, Lorg/json/JSONObject;

    .line 462
    .line 463
    :goto_6
    sget-object v1, Lka/j;->a:Lka/j;

    .line 464
    .line 465
    sget-object v2, Lka/h;->a:Lka/h;

    .line 466
    .line 467
    if-eqz v0, :cond_b

    .line 468
    .line 469
    const-string v4, "album"

    .line 470
    .line 471
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    if-eqz v4, :cond_7

    .line 476
    .line 477
    const-string v5, "pmid"

    .line 478
    .line 479
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    goto :goto_7

    .line 484
    :cond_7
    const/4 v4, 0x0

    .line 485
    :goto_7
    if-nez v4, :cond_8

    .line 486
    .line 487
    move-object/from16 v4, v23

    .line 488
    .line 489
    :cond_8
    const-string v5, "file"

    .line 490
    .line 491
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    if-eqz v5, :cond_9

    .line 496
    .line 497
    const-string v7, "media_mid"

    .line 498
    .line 499
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    goto :goto_8

    .line 504
    :cond_9
    const/4 v5, 0x0

    .line 505
    :goto_8
    if-nez v5, :cond_a

    .line 506
    .line 507
    move-object/from16 v5, v23

    .line 508
    .line 509
    :cond_a
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 517
    .line 518
    .line 519
    move-result v11

    .line 520
    if-eqz v11, :cond_c

    .line 521
    .line 522
    :cond_b
    move-object/from16 v18, v2

    .line 523
    .line 524
    move-object/from16 v19, v16

    .line 525
    .line 526
    move-object/from16 v16, v1

    .line 527
    .line 528
    move-object/from16 v1, v18

    .line 529
    .line 530
    goto/16 :goto_20

    .line 531
    .line 532
    :cond_c
    const-string v11, "name"

    .line 533
    .line 534
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v12

    .line 538
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 539
    .line 540
    .line 541
    move-result v14

    .line 542
    if-eqz v14, :cond_d

    .line 543
    .line 544
    move-object/from16 v26, v24

    .line 545
    .line 546
    goto :goto_9

    .line 547
    :cond_d
    move-object/from16 v26, v12

    .line 548
    .line 549
    :goto_9
    const-string v12, "singer"

    .line 550
    .line 551
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 552
    .line 553
    .line 554
    move-result-object v12

    .line 555
    if-eqz v12, :cond_e

    .line 556
    .line 557
    const/4 v14, 0x0

    .line 558
    invoke-virtual {v12, v14}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 559
    .line 560
    .line 561
    move-result-object v12

    .line 562
    if-eqz v12, :cond_e

    .line 563
    .line 564
    invoke-virtual {v12, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v11

    .line 568
    goto :goto_a

    .line 569
    :cond_e
    const/4 v11, 0x0

    .line 570
    :goto_a
    if-nez v11, :cond_f

    .line 571
    .line 572
    move-object/from16 v27, v23

    .line 573
    .line 574
    goto :goto_b

    .line 575
    :cond_f
    move-object/from16 v27, v11

    .line 576
    .line 577
    :goto_b
    const-string v11, "id"

    .line 578
    .line 579
    const-wide/16 v14, 0x0

    .line 580
    .line 581
    invoke-virtual {v0, v11, v14, v15}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 582
    .line 583
    .line 584
    move-result-wide v11

    .line 585
    move-wide/from16 v24, v14

    .line 586
    .line 587
    move-object/from16 v14, v17

    .line 588
    .line 589
    :try_start_6
    invoke-virtual {v14, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    const-string v14, "Mozilla/5.0"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    .line 594
    .line 595
    :try_start_7
    new-instance v15, Lsf/e;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 596
    .line 597
    move-object/from16 v17, v4

    .line 598
    .line 599
    move-object/from16 v4, v16

    .line 600
    .line 601
    :try_start_8
    invoke-direct {v15, v4, v14}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    new-instance v14, Lsf/e;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 605
    .line 606
    move-object/from16 v16, v18

    .line 607
    .line 608
    move-object/from16 v18, v2

    .line 609
    .line 610
    move-object/from16 v2, v16

    .line 611
    .line 612
    move-object/from16 v16, v1

    .line 613
    .line 614
    move-object/from16 v1, v19

    .line 615
    .line 616
    :try_start_9
    invoke-direct {v14, v1, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    filled-new-array {v15, v14}, [Lsf/e;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-static {v1}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-virtual {v6, v0, v1}, Lka/a;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    if-eqz v0, :cond_10

    .line 632
    .line 633
    new-instance v1, Lorg/json/JSONObject;

    .line 634
    .line 635
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    const-string v0, "lyric"

    .line 639
    .line 640
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 644
    goto :goto_c

    .line 645
    :catchall_6
    move-exception v0

    .line 646
    goto :goto_e

    .line 647
    :cond_10
    const/4 v0, 0x0

    .line 648
    :goto_c
    if-nez v0, :cond_11

    .line 649
    .line 650
    move-object/from16 v0, v23

    .line 651
    .line 652
    goto :goto_f

    .line 653
    :catchall_7
    move-exception v0

    .line 654
    move-object/from16 v16, v1

    .line 655
    .line 656
    move-object/from16 v18, v2

    .line 657
    .line 658
    goto :goto_e

    .line 659
    :catchall_8
    move-exception v0

    .line 660
    move-object/from16 v17, v4

    .line 661
    .line 662
    move-object/from16 v4, v16

    .line 663
    .line 664
    move-object/from16 v18, v2

    .line 665
    .line 666
    goto :goto_d

    .line 667
    :catchall_9
    move-exception v0

    .line 668
    move-object/from16 v18, v2

    .line 669
    .line 670
    move-object/from16 v17, v4

    .line 671
    .line 672
    move-object/from16 v4, v16

    .line 673
    .line 674
    :goto_d
    move-object/from16 v16, v1

    .line 675
    .line 676
    :goto_e
    new-instance v1, Lsf/f;

    .line 677
    .line 678
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 679
    .line 680
    .line 681
    move-object v0, v1

    .line 682
    :cond_11
    :goto_f
    nop

    .line 683
    instance-of v1, v0, Lsf/f;

    .line 684
    .line 685
    if-eqz v1, :cond_12

    .line 686
    .line 687
    move-object/from16 v0, v23

    .line 688
    .line 689
    :cond_12
    move-object/from16 v30, v0

    .line 690
    .line 691
    check-cast v30, Ljava/lang/String;

    .line 692
    .line 693
    cmp-long v0, v11, v24

    .line 694
    .line 695
    const-string v1, "guid"

    .line 696
    .line 697
    const-string v2, "music.vkey.GetVkey"

    .line 698
    .line 699
    const-string v14, "Yun"

    .line 700
    .line 701
    const-string v15, "request"

    .line 702
    .line 703
    if-lez v0, :cond_1a

    .line 704
    .line 705
    new-instance v0, Lorg/json/JSONObject;

    .line 706
    .line 707
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 708
    .line 709
    .line 710
    move-object/from16 v19, v4

    .line 711
    .line 712
    invoke-static {}, Lka/a;->c()Lorg/json/JSONObject;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 717
    .line 718
    .line 719
    new-instance v4, Lorg/json/JSONObject;

    .line 720
    .line 721
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 722
    .line 723
    .line 724
    move-object/from16 v21, v5

    .line 725
    .line 726
    const-string v5, "music.qqmusiclite.MtLimitFreeSvr"

    .line 727
    .line 728
    invoke-virtual {v4, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 729
    .line 730
    .line 731
    const-string v5, "Obtain"

    .line 732
    .line 733
    invoke-virtual {v4, v10, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 734
    .line 735
    .line 736
    new-instance v5, Lorg/json/JSONObject;

    .line 737
    .line 738
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 739
    .line 740
    .line 741
    move-object/from16 v22, v3

    .line 742
    .line 743
    new-instance v3, Lorg/json/JSONArray;

    .line 744
    .line 745
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v3, v11, v12}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    const-string v11, "songid"

    .line 753
    .line 754
    invoke-virtual {v5, v11, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    const-string v5, "need_ppurl"

    .line 759
    .line 760
    const/4 v11, 0x1

    .line 761
    invoke-virtual {v3, v5, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    invoke-virtual {v4, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v0, v15, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 769
    .line 770
    .line 771
    :try_start_a
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v6, v0}, Lka/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    if-eqz v0, :cond_13

    .line 783
    .line 784
    new-instance v3, Lorg/json/JSONObject;

    .line 785
    .line 786
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    if-eqz v0, :cond_13

    .line 794
    .line 795
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    if-eqz v0, :cond_13

    .line 800
    .line 801
    const-string v3, "tracks"

    .line 802
    .line 803
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    if-eqz v0, :cond_13

    .line 808
    .line 809
    const/4 v5, 0x0

    .line 810
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    if-eqz v0, :cond_13

    .line 815
    .line 816
    const-string v3, "control"

    .line 817
    .line 818
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    if-eqz v0, :cond_13

    .line 823
    .line 824
    const-string v3, "ppurl"

    .line 825
    .line 826
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 830
    goto :goto_10

    .line 831
    :catchall_a
    move-exception v0

    .line 832
    goto :goto_11

    .line 833
    :cond_13
    const/4 v0, 0x0

    .line 834
    :goto_10
    if-nez v0, :cond_14

    .line 835
    .line 836
    move-object/from16 v0, v23

    .line 837
    .line 838
    goto :goto_12

    .line 839
    :goto_11
    new-instance v3, Lsf/f;

    .line 840
    .line 841
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 842
    .line 843
    .line 844
    move-object v0, v3

    .line 845
    :cond_14
    :goto_12
    nop

    .line 846
    instance-of v3, v0, Lsf/f;

    .line 847
    .line 848
    if-eqz v3, :cond_15

    .line 849
    .line 850
    move-object/from16 v0, v23

    .line 851
    .line 852
    :cond_15
    check-cast v0, Ljava/lang/String;

    .line 853
    .line 854
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 855
    .line 856
    .line 857
    move-result v3

    .line 858
    if-nez v3, :cond_19

    .line 859
    .line 860
    new-instance v3, Lorg/json/JSONObject;

    .line 861
    .line 862
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 863
    .line 864
    .line 865
    const-string v4, "CgiGetTempVkey"

    .line 866
    .line 867
    invoke-static {v9, v2, v10, v4}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 868
    .line 869
    .line 870
    move-result-object v4

    .line 871
    invoke-static {v1, v14}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 872
    .line 873
    .line 874
    move-result-object v5

    .line 875
    new-instance v11, Lorg/json/JSONArray;

    .line 876
    .line 877
    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 878
    .line 879
    .line 880
    const-string v12, "mediamid"

    .line 881
    .line 882
    move-object/from16 v24, v1

    .line 883
    .line 884
    const-string v1, "tempVkey"

    .line 885
    .line 886
    invoke-static {v12, v14, v1, v0}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    const-string v1, "songMID"

    .line 891
    .line 892
    invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v11, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    const-string v1, "songlist"

    .line 900
    .line 901
    invoke-virtual {v5, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v4, v8, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v3, v15, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    :try_start_b
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    invoke-virtual {v6, v0}, Lka/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    if-eqz v0, :cond_16

    .line 923
    .line 924
    new-instance v1, Lorg/json/JSONObject;

    .line 925
    .line 926
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    if-eqz v0, :cond_16

    .line 934
    .line 935
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    if-eqz v0, :cond_16

    .line 940
    .line 941
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    if-eqz v0, :cond_16

    .line 946
    .line 947
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    if-eqz v0, :cond_16

    .line 952
    .line 953
    const-string v1, "purl"

    .line 954
    .line 955
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 959
    goto :goto_13

    .line 960
    :catchall_b
    move-exception v0

    .line 961
    goto :goto_14

    .line 962
    :cond_16
    const/4 v0, 0x0

    .line 963
    :goto_13
    if-nez v0, :cond_17

    .line 964
    .line 965
    move-object/from16 v0, v23

    .line 966
    .line 967
    goto :goto_15

    .line 968
    :goto_14
    new-instance v1, Lsf/f;

    .line 969
    .line 970
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 971
    .line 972
    .line 973
    move-object v0, v1

    .line 974
    :cond_17
    :goto_15
    nop

    .line 975
    instance-of v1, v0, Lsf/f;

    .line 976
    .line 977
    if-eqz v1, :cond_18

    .line 978
    .line 979
    move-object/from16 v0, v23

    .line 980
    .line 981
    :cond_18
    check-cast v0, Ljava/lang/String;

    .line 982
    .line 983
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 984
    .line 985
    .line 986
    move-result v1

    .line 987
    if-nez v1, :cond_1b

    .line 988
    .line 989
    :goto_16
    move-object/from16 v29, v0

    .line 990
    .line 991
    goto/16 :goto_1c

    .line 992
    .line 993
    :cond_19
    move-object/from16 v24, v1

    .line 994
    .line 995
    goto :goto_17

    .line 996
    :cond_1a
    move-object/from16 v24, v1

    .line 997
    .line 998
    move-object/from16 v22, v3

    .line 999
    .line 1000
    move-object/from16 v19, v4

    .line 1001
    .line 1002
    move-object/from16 v21, v5

    .line 1003
    .line 1004
    :cond_1b
    :goto_17
    invoke-static/range {v21 .. v21}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    if-eqz v0, :cond_1c

    .line 1009
    .line 1010
    const/16 v29, 0x0

    .line 1011
    .line 1012
    goto/16 :goto_1c

    .line 1013
    .line 1014
    :cond_1c
    new-instance v0, Lorg/json/JSONObject;

    .line 1015
    .line 1016
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1017
    .line 1018
    .line 1019
    invoke-static {}, Lka/a;->c()Lorg/json/JSONObject;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    move-object/from16 v3, v22

    .line 1024
    .line 1025
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1026
    .line 1027
    .line 1028
    new-instance v1, Lorg/json/JSONObject;

    .line 1029
    .line 1030
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v1, v9, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1034
    .line 1035
    .line 1036
    const-string v2, "UrlGetVkey"

    .line 1037
    .line 1038
    invoke-virtual {v1, v10, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1039
    .line 1040
    .line 1041
    new-instance v2, Lorg/json/JSONObject;

    .line 1042
    .line 1043
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 1044
    .line 1045
    .line 1046
    move-object/from16 v3, v24

    .line 1047
    .line 1048
    invoke-virtual {v2, v3, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1049
    .line 1050
    .line 1051
    new-instance v3, Lorg/json/JSONArray;

    .line 1052
    .line 1053
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v3

    .line 1060
    const-string v4, "songmid"

    .line 1061
    .line 1062
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1063
    .line 1064
    .line 1065
    new-instance v3, Lorg/json/JSONArray;

    .line 1066
    .line 1067
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 1068
    .line 1069
    .line 1070
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    const-string v5, "M500"

    .line 1073
    .line 1074
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    move-object/from16 v5, v21

    .line 1078
    .line 1079
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    .line 1082
    const-string v5, ".mp3"

    .line 1083
    .line 1084
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v4

    .line 1091
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v3

    .line 1095
    const-string v4, "filename"

    .line 1096
    .line 1097
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v1, v8, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v0, v15, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1104
    .line 1105
    .line 1106
    :try_start_c
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v6, v0}, Lka/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    if-eqz v0, :cond_1d

    .line 1118
    .line 1119
    new-instance v1, Lorg/json/JSONObject;

    .line 1120
    .line 1121
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    if-eqz v0, :cond_1d

    .line 1129
    .line 1130
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    if-eqz v0, :cond_1d

    .line 1135
    .line 1136
    const-string v1, "midurlinfo"

    .line 1137
    .line 1138
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    if-eqz v0, :cond_1d

    .line 1143
    .line 1144
    const/4 v5, 0x0

    .line 1145
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    if-eqz v0, :cond_1d

    .line 1150
    .line 1151
    const-string v1, "flowurl"

    .line 1152
    .line 1153
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1157
    goto :goto_18

    .line 1158
    :catchall_c
    move-exception v0

    .line 1159
    goto :goto_19

    .line 1160
    :cond_1d
    const/4 v0, 0x0

    .line 1161
    :goto_18
    if-nez v0, :cond_1e

    .line 1162
    .line 1163
    move-object/from16 v0, v23

    .line 1164
    .line 1165
    goto :goto_1a

    .line 1166
    :goto_19
    new-instance v1, Lsf/f;

    .line 1167
    .line 1168
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1169
    .line 1170
    .line 1171
    move-object v0, v1

    .line 1172
    :cond_1e
    :goto_1a
    nop

    .line 1173
    instance-of v1, v0, Lsf/f;

    .line 1174
    .line 1175
    if-eqz v1, :cond_1f

    .line 1176
    .line 1177
    move-object/from16 v0, v23

    .line 1178
    .line 1179
    :cond_1f
    check-cast v0, Ljava/lang/String;

    .line 1180
    .line 1181
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1182
    .line 1183
    .line 1184
    move-result v1

    .line 1185
    if-nez v1, :cond_20

    .line 1186
    .line 1187
    goto :goto_1b

    .line 1188
    :cond_20
    const/4 v0, 0x0

    .line 1189
    :goto_1b
    if-eqz v0, :cond_21

    .line 1190
    .line 1191
    const-string v1, "https://sjy.stream.qqmusic.qq.com/"

    .line 1192
    .line 1193
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    goto/16 :goto_16

    .line 1198
    .line 1199
    :cond_21
    const/4 v0, 0x0

    .line 1200
    goto/16 :goto_16

    .line 1201
    .line 1202
    :goto_1c
    if-eqz v29, :cond_25

    .line 1203
    .line 1204
    invoke-static/range {v17 .. v17}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v0

    .line 1208
    if-nez v0, :cond_22

    .line 1209
    .line 1210
    move-object/from16 v4, v17

    .line 1211
    .line 1212
    goto :goto_1d

    .line 1213
    :cond_22
    const/4 v4, 0x0

    .line 1214
    :goto_1d
    if-eqz v4, :cond_23

    .line 1215
    .line 1216
    const-string v0, "https://y.gtimg.cn/music/photo_new/T002R500x500M000"

    .line 1217
    .line 1218
    const-string v1, ".jpg"

    .line 1219
    .line 1220
    invoke-static {v0, v4, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    goto :goto_1e

    .line 1225
    :cond_23
    const/4 v0, 0x0

    .line 1226
    :goto_1e
    if-nez v0, :cond_24

    .line 1227
    .line 1228
    move-object/from16 v31, v23

    .line 1229
    .line 1230
    goto :goto_1f

    .line 1231
    :cond_24
    move-object/from16 v31, v0

    .line 1232
    .line 1233
    :goto_1f
    const-string v0, "https://y.qq.com/n/ryqq/songDetail/"

    .line 1234
    .line 1235
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v32

    .line 1239
    new-instance v25, Lka/k;

    .line 1240
    .line 1241
    move-object/from16 v28, v7

    .line 1242
    .line 1243
    invoke-direct/range {v25 .. v32}, Lka/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1244
    .line 1245
    .line 1246
    move-object/from16 v0, v25

    .line 1247
    .line 1248
    new-instance v1, Lka/i;

    .line 1249
    .line 1250
    invoke-direct {v1, v0}, Lka/i;-><init>(Lka/k;)V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_20

    .line 1254
    :cond_25
    move-object/from16 v1, v16

    .line 1255
    .line 1256
    :goto_20
    instance-of v0, v1, Lka/i;

    .line 1257
    .line 1258
    if-eqz v0, :cond_5c

    .line 1259
    .line 1260
    check-cast v1, Lka/i;

    .line 1261
    .line 1262
    iget-object v1, v1, Lka/i;->a:Lka/k;

    .line 1263
    .line 1264
    iget-object v7, v1, Lka/k;->d:Ljava/lang/String;

    .line 1265
    .line 1266
    const-string v0, "qq_music_order_send_as_card"

    .line 1267
    .line 1268
    move-object/from16 v12, p0

    .line 1269
    .line 1270
    iget-object v2, v12, Lka/f;->c:Lka/g;

    .line 1271
    .line 1272
    const/4 v11, 0x1

    .line 1273
    invoke-virtual {v2, v0, v11}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 1274
    .line 1275
    .line 1276
    move-result v0

    .line 1277
    const-string v3, "qq_music_order_send_as_voice"

    .line 1278
    .line 1279
    const/4 v5, 0x0

    .line 1280
    invoke-virtual {v2, v3, v5}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v13

    .line 1284
    if-nez v0, :cond_26

    .line 1285
    .line 1286
    if-nez v13, :cond_26

    .line 1287
    .line 1288
    const-string v0, "\u8bf7\u81f3\u5c11\u5f00\u542f\u97f3\u4e50\u5361\u7247\u6216\u6b4c\u66f2\u8bed\u97f3\u53d1\u9001"

    .line 1289
    .line 1290
    move-object/from16 v3, p1

    .line 1291
    .line 1292
    move-wide/from16 v14, p2

    .line 1293
    .line 1294
    invoke-static {v14, v15, v3, v0}, Lka/f;->e(JLjava/lang/String;Ljava/lang/String;)V

    .line 1295
    .line 1296
    .line 1297
    return-void

    .line 1298
    :cond_26
    move-object/from16 v3, p1

    .line 1299
    .line 1300
    move-wide/from16 v14, p2

    .line 1301
    .line 1302
    if-eqz v0, :cond_4b

    .line 1303
    .line 1304
    move-object/from16 v4, p5

    .line 1305
    .line 1306
    iget-object v0, v4, Lka/d;->b:Ljava/lang/String;

    .line 1307
    .line 1308
    iget-object v4, v1, Lka/k;->b:Ljava/lang/String;

    .line 1309
    .line 1310
    iget-object v5, v1, Lka/k;->f:Ljava/lang/String;

    .line 1311
    .line 1312
    if-eqz v0, :cond_28

    .line 1313
    .line 1314
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1315
    .line 1316
    .line 1317
    move-result v6

    .line 1318
    if-eqz v6, :cond_27

    .line 1319
    .line 1320
    goto :goto_21

    .line 1321
    :cond_27
    move-object/from16 v9, p4

    .line 1322
    .line 1323
    move-object v4, v0

    .line 1324
    move-object/from16 v6, v23

    .line 1325
    .line 1326
    goto/16 :goto_2d

    .line 1327
    .line 1328
    :cond_28
    :goto_21
    const-string v0, "qq_music_order_custom_singer"

    .line 1329
    .line 1330
    const/4 v6, 0x0

    .line 1331
    invoke-virtual {v2, v0, v6}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 1332
    .line 1333
    .line 1334
    move-result v0

    .line 1335
    if-eqz v0, :cond_29

    .line 1336
    .line 1337
    const-string v0, "qq_music_order_default_singer"

    .line 1338
    .line 1339
    move-object/from16 v6, v23

    .line 1340
    .line 1341
    invoke-virtual {v2, v0, v6}, Lka/g;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v8

    .line 1345
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v8

    .line 1349
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v8

    .line 1353
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1354
    .line 1355
    .line 1356
    move-result v8

    .line 1357
    if-nez v8, :cond_2a

    .line 1358
    .line 1359
    invoke-virtual {v2, v0, v6}, Lka/g;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    move-object/from16 v9, p4

    .line 1372
    .line 1373
    :goto_22
    move-object v4, v0

    .line 1374
    goto/16 :goto_2d

    .line 1375
    .line 1376
    :cond_29
    move-object/from16 v6, v23

    .line 1377
    .line 1378
    :cond_2a
    const-string v0, "qq_music_order_replace_singer_with_nickname"

    .line 1379
    .line 1380
    const/4 v8, 0x0

    .line 1381
    invoke-virtual {v2, v0, v8}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 1382
    .line 1383
    .line 1384
    move-result v0

    .line 1385
    if-eqz v0, :cond_3a

    .line 1386
    .line 1387
    invoke-static/range {p4 .. p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1388
    .line 1389
    .line 1390
    move-result v0

    .line 1391
    if-nez v0, :cond_3a

    .line 1392
    .line 1393
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v0

    .line 1397
    move-object/from16 v9, p4

    .line 1398
    .line 1399
    if-eqz v0, :cond_2b

    .line 1400
    .line 1401
    invoke-virtual {v0, v9}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v10

    .line 1405
    goto :goto_23

    .line 1406
    :cond_2b
    const/4 v10, 0x0

    .line 1407
    :goto_23
    const-string v11, "@chatroom"

    .line 1408
    .line 1409
    invoke-static {v3, v11, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v11

    .line 1413
    if-nez v11, :cond_2d

    .line 1414
    .line 1415
    const-string v11, "@im.chatroom"

    .line 1416
    .line 1417
    invoke-static {v3, v11, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v11

    .line 1421
    if-eqz v11, :cond_2c

    .line 1422
    .line 1423
    goto :goto_25

    .line 1424
    :cond_2c
    :goto_24
    move-object v8, v6

    .line 1425
    goto :goto_28

    .line 1426
    :cond_2d
    :goto_25
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v8

    .line 1430
    if-eqz v8, :cond_2f

    .line 1431
    .line 1432
    iget-object v8, v8, Lg8/d;->b:Lg8/i;

    .line 1433
    .line 1434
    if-nez v8, :cond_2e

    .line 1435
    .line 1436
    move-object v8, v9

    .line 1437
    goto :goto_26

    .line 1438
    :cond_2e
    invoke-virtual {v8, v3, v9}, Lg8/i;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v8

    .line 1442
    goto :goto_26

    .line 1443
    :cond_2f
    const/4 v8, 0x0

    .line 1444
    :goto_26
    if-nez v8, :cond_30

    .line 1445
    .line 1446
    move-object v8, v6

    .line 1447
    :cond_30
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1448
    .line 1449
    .line 1450
    move-result v11

    .line 1451
    if-eqz v11, :cond_33

    .line 1452
    .line 1453
    if-eqz v0, :cond_31

    .line 1454
    .line 1455
    invoke-virtual {v0, v3, v9}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    goto :goto_27

    .line 1460
    :cond_31
    const/4 v0, 0x0

    .line 1461
    :goto_27
    if-nez v0, :cond_32

    .line 1462
    .line 1463
    goto :goto_24

    .line 1464
    :cond_32
    move-object v8, v0

    .line 1465
    :cond_33
    :goto_28
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v0

    .line 1469
    if-eqz v0, :cond_36

    .line 1470
    .line 1471
    if-eqz v10, :cond_34

    .line 1472
    .line 1473
    iget-object v0, v10, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 1474
    .line 1475
    goto :goto_29

    .line 1476
    :cond_34
    const/4 v0, 0x0

    .line 1477
    :goto_29
    if-nez v0, :cond_35

    .line 1478
    .line 1479
    move-object v8, v6

    .line 1480
    goto :goto_2a

    .line 1481
    :cond_35
    move-object v8, v0

    .line 1482
    :cond_36
    :goto_2a
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v0

    .line 1486
    if-eqz v0, :cond_38

    .line 1487
    .line 1488
    if-eqz v10, :cond_37

    .line 1489
    .line 1490
    iget-object v0, v10, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 1491
    .line 1492
    goto :goto_2b

    .line 1493
    :cond_37
    const/4 v0, 0x0

    .line 1494
    :goto_2b
    if-nez v0, :cond_39

    .line 1495
    .line 1496
    move-object v0, v6

    .line 1497
    goto :goto_2c

    .line 1498
    :cond_38
    move-object v0, v8

    .line 1499
    :cond_39
    :goto_2c
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1500
    .line 1501
    .line 1502
    move-result v8

    .line 1503
    if-nez v8, :cond_3b

    .line 1504
    .line 1505
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1506
    .line 1507
    .line 1508
    move-result v8

    .line 1509
    if-nez v8, :cond_3b

    .line 1510
    .line 1511
    goto/16 :goto_22

    .line 1512
    .line 1513
    :cond_3a
    move-object/from16 v9, p4

    .line 1514
    .line 1515
    :cond_3b
    :goto_2d
    const-string v0, "qq_music_order_replace_cover_with_avatar"

    .line 1516
    .line 1517
    const/4 v8, 0x0

    .line 1518
    invoke-virtual {v2, v0, v8}, Lka/g;->b(Ljava/lang/String;Z)Z

    .line 1519
    .line 1520
    .line 1521
    move-result v0

    .line 1522
    if-eqz v0, :cond_3f

    .line 1523
    .line 1524
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    if-eqz v0, :cond_3c

    .line 1529
    .line 1530
    const/4 v11, 0x1

    .line 1531
    invoke-virtual {v0, v9, v11}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    goto :goto_2e

    .line 1536
    :cond_3c
    const/4 v0, 0x0

    .line 1537
    :goto_2e
    if-nez v0, :cond_3d

    .line 1538
    .line 1539
    move-object v0, v6

    .line 1540
    :cond_3d
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1541
    .line 1542
    .line 1543
    move-result v8

    .line 1544
    if-eqz v8, :cond_3e

    .line 1545
    .line 1546
    goto :goto_2f

    .line 1547
    :cond_3e
    move-object v5, v0

    .line 1548
    :cond_3f
    :goto_2f
    move-object v9, v5

    .line 1549
    const-string v0, "R500x500"

    .line 1550
    .line 1551
    const-string v5, "R300x300"

    .line 1552
    .line 1553
    const/4 v8, 0x0

    .line 1554
    invoke-static {v9, v0, v5, v8}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v0

    .line 1558
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1559
    .line 1560
    .line 1561
    move-result v5

    .line 1562
    if-eqz v5, :cond_40

    .line 1563
    .line 1564
    move-object/from16 p5, v4

    .line 1565
    .line 1566
    const/4 v10, 0x0

    .line 1567
    goto/16 :goto_36

    .line 1568
    .line 1569
    :cond_40
    :try_start_d
    new-instance v5, Ljava/net/URL;

    .line 1570
    .line 1571
    invoke-direct {v5, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 1572
    .line 1573
    .line 1574
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v0

    .line 1578
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1579
    .line 1580
    .line 1581
    move-object v5, v0

    .line 1582
    check-cast v5, Ljava/net/HttpURLConnection;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_13

    .line 1583
    .line 1584
    const/16 v0, 0x2710

    .line 1585
    .line 1586
    :try_start_e
    invoke-virtual {v5, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v5, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 1590
    .line 1591
    .line 1592
    const/4 v11, 0x1

    .line 1593
    invoke-virtual {v5, v11}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 1594
    .line 1595
    .line 1596
    const-string v0, "MicroMessenger Client"

    .line 1597
    .line 1598
    move-object/from16 v8, v19

    .line 1599
    .line 1600
    invoke-virtual {v5, v8, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1601
    .line 1602
    .line 1603
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 1604
    .line 1605
    .line 1606
    move-result v0

    .line 1607
    const/16 v8, 0xc8

    .line 1608
    .line 1609
    if-gt v8, v0, :cond_43

    .line 1610
    .line 1611
    const/16 v8, 0x12c

    .line 1612
    .line 1613
    if-ge v0, v8, :cond_43

    .line 1614
    .line 1615
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v8
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_12

    .line 1619
    if-eqz v8, :cond_43

    .line 1620
    .line 1621
    :try_start_f
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 1622
    .line 1623
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1624
    .line 1625
    .line 1626
    const/16 v10, 0x2000

    .line 1627
    .line 1628
    new-array v10, v10, [B

    .line 1629
    .line 1630
    const/4 v11, 0x0

    .line 1631
    :goto_30
    invoke-virtual {v8, v10}, Ljava/io/InputStream;->read([B)I

    .line 1632
    .line 1633
    .line 1634
    move-result v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_10

    .line 1635
    if-gez v3, :cond_41

    .line 1636
    .line 1637
    :try_start_10
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 1638
    .line 1639
    .line 1640
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_d

    .line 1641
    move-object/from16 p5, v4

    .line 1642
    .line 1643
    goto :goto_31

    .line 1644
    :catchall_d
    move-exception v0

    .line 1645
    move-object v3, v0

    .line 1646
    move-object/from16 p5, v4

    .line 1647
    .line 1648
    goto :goto_33

    .line 1649
    :cond_41
    add-int/2addr v11, v3

    .line 1650
    move-object/from16 p5, v4

    .line 1651
    .line 1652
    const/high16 v4, 0x20000

    .line 1653
    .line 1654
    if-le v11, v4, :cond_42

    .line 1655
    .line 1656
    const/4 v0, 0x0

    .line 1657
    :goto_31
    :try_start_11
    invoke-interface {v8}, Ljava/io/Closeable;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    .line 1658
    .line 1659
    .line 1660
    goto :goto_35

    .line 1661
    :catchall_e
    move-exception v0

    .line 1662
    goto :goto_34

    .line 1663
    :cond_42
    const/4 v4, 0x0

    .line 1664
    :try_start_12
    invoke-virtual {v0, v10, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    .line 1665
    .line 1666
    .line 1667
    move-object/from16 v4, p5

    .line 1668
    .line 1669
    goto :goto_30

    .line 1670
    :catchall_f
    move-exception v0

    .line 1671
    :goto_32
    move-object v3, v0

    .line 1672
    goto :goto_33

    .line 1673
    :catchall_10
    move-exception v0

    .line 1674
    move-object/from16 p5, v4

    .line 1675
    .line 1676
    goto :goto_32

    .line 1677
    :goto_33
    :try_start_13
    throw v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_11

    .line 1678
    :catchall_11
    move-exception v0

    .line 1679
    :try_start_14
    invoke-static {v8, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1680
    .line 1681
    .line 1682
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    .line 1683
    :cond_43
    move-object/from16 p5, v4

    .line 1684
    .line 1685
    const/4 v0, 0x0

    .line 1686
    goto :goto_35

    .line 1687
    :catchall_12
    move-exception v0

    .line 1688
    move-object/from16 p5, v4

    .line 1689
    .line 1690
    goto :goto_34

    .line 1691
    :catchall_13
    move-exception v0

    .line 1692
    move-object/from16 p5, v4

    .line 1693
    .line 1694
    const/4 v5, 0x0

    .line 1695
    :goto_34
    new-instance v3, Lsf/f;

    .line 1696
    .line 1697
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1698
    .line 1699
    .line 1700
    move-object v0, v3

    .line 1701
    :goto_35
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v3

    .line 1705
    if-eqz v3, :cond_44

    .line 1706
    .line 1707
    iget-object v4, v12, Lka/f;->a:Lia/t;

    .line 1708
    .line 1709
    const-string v8, "QQ\u70b9\u6b4c\u5c01\u9762\u4e0b\u8f7d\u5931\u8d25"

    .line 1710
    .line 1711
    invoke-virtual {v4, v8, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1712
    .line 1713
    .line 1714
    :cond_44
    instance-of v3, v0, Lsf/f;

    .line 1715
    .line 1716
    if-eqz v3, :cond_45

    .line 1717
    .line 1718
    const/4 v0, 0x0

    .line 1719
    :cond_45
    check-cast v0, [B

    .line 1720
    .line 1721
    if-eqz v5, :cond_46

    .line 1722
    .line 1723
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 1724
    .line 1725
    .line 1726
    :cond_46
    move-object v10, v0

    .line 1727
    :goto_36
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v0

    .line 1731
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1732
    .line 1733
    .line 1734
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->i()Lj8/p;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    if-eqz v0, :cond_49

    .line 1739
    .line 1740
    iget-object v4, v1, Lka/k;->a:Ljava/lang/String;

    .line 1741
    .line 1742
    move-object/from16 v23, v6

    .line 1743
    .line 1744
    iget-object v6, v1, Lka/k;->g:Ljava/lang/String;

    .line 1745
    .line 1746
    iget-object v1, v1, Lka/k;->e:Ljava/lang/String;

    .line 1747
    .line 1748
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1749
    .line 1750
    .line 1751
    move-result v3

    .line 1752
    if-eqz v3, :cond_47

    .line 1753
    .line 1754
    const-string v1, "[99:99.99]\u6682\u65e0\u6b4c\u8bcd"

    .line 1755
    .line 1756
    :cond_47
    move-object v8, v1

    .line 1757
    const-string v1, "qq_music_order_app_id"

    .line 1758
    .line 1759
    const-string v3, "wx485a97c844086dc9"

    .line 1760
    .line 1761
    invoke-virtual {v2, v1, v3}, Lka/g;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v1

    .line 1765
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v1

    .line 1769
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v1

    .line 1773
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1774
    .line 1775
    .line 1776
    move-result v2

    .line 1777
    if-eqz v2, :cond_48

    .line 1778
    .line 1779
    move-object v11, v3

    .line 1780
    goto :goto_37

    .line 1781
    :cond_48
    move-object v11, v1

    .line 1782
    :goto_37
    iget-object v2, v0, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 1783
    .line 1784
    move-object/from16 v3, p1

    .line 1785
    .line 1786
    move-object/from16 v5, p5

    .line 1787
    .line 1788
    invoke-virtual/range {v2 .. v11}, Landroidx/lifecycle/x;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 1789
    .line 1790
    .line 1791
    move-result v0

    .line 1792
    const/4 v11, 0x1

    .line 1793
    if-ne v0, v11, :cond_4a

    .line 1794
    .line 1795
    move v0, v11

    .line 1796
    goto :goto_38

    .line 1797
    :cond_49
    move-object/from16 v3, p1

    .line 1798
    .line 1799
    move-object/from16 v23, v6

    .line 1800
    .line 1801
    const/4 v11, 0x1

    .line 1802
    :cond_4a
    const/4 v0, 0x0

    .line 1803
    :goto_38
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v0

    .line 1807
    move-object v1, v0

    .line 1808
    goto :goto_39

    .line 1809
    :cond_4b
    const/4 v11, 0x1

    .line 1810
    const/4 v1, 0x0

    .line 1811
    :goto_39
    if-eqz v13, :cond_57

    .line 1812
    .line 1813
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v0

    .line 1817
    if-eqz v0, :cond_4c

    .line 1818
    .line 1819
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 1820
    .line 1821
    move-object v2, v0

    .line 1822
    goto :goto_3a

    .line 1823
    :cond_4c
    const/4 v2, 0x0

    .line 1824
    :goto_3a
    if-eqz v2, :cond_4d

    .line 1825
    .line 1826
    invoke-virtual {v2}, Lj8/y;->b()Z

    .line 1827
    .line 1828
    .line 1829
    move-result v0

    .line 1830
    if-nez v0, :cond_4e

    .line 1831
    .line 1832
    :cond_4d
    const/4 v6, 0x0

    .line 1833
    goto/16 :goto_40

    .line 1834
    .line 1835
    :cond_4e
    new-instance v4, Ljava/io/File;

    .line 1836
    .line 1837
    iget-object v0, v12, Lka/f;->b:Landroid/content/Context;

    .line 1838
    .line 1839
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v0

    .line 1843
    const-string v5, "Hchat_qq_music_order_voice"

    .line 1844
    .line 1845
    invoke-direct {v4, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 1849
    .line 1850
    .line 1851
    move-result v0

    .line 1852
    if-nez v0, :cond_4f

    .line 1853
    .line 1854
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 1855
    .line 1856
    .line 1857
    move-result v0

    .line 1858
    if-eqz v0, :cond_50

    .line 1859
    .line 1860
    :cond_4f
    invoke-virtual {v4}, Ljava/io/File;->canWrite()Z

    .line 1861
    .line 1862
    .line 1863
    move-result v0

    .line 1864
    if-nez v0, :cond_51

    .line 1865
    .line 1866
    :cond_50
    const/4 v13, 0x0

    .line 1867
    goto/16 :goto_42

    .line 1868
    .line 1869
    :cond_51
    new-instance v5, Ljava/io/File;

    .line 1870
    .line 1871
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1872
    .line 1873
    .line 1874
    move-result-wide v8

    .line 1875
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1876
    .line 1877
    .line 1878
    move-result-wide v11

    .line 1879
    :try_start_15
    new-instance v0, Ljava/net/URL;

    .line 1880
    .line 1881
    invoke-direct {v0, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 1882
    .line 1883
    .line 1884
    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v0

    .line 1888
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1889
    .line 1890
    .line 1891
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1892
    .line 1893
    invoke-virtual {v0, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v0

    .line 1897
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_14

    .line 1898
    .line 1899
    .line 1900
    goto :goto_3b

    .line 1901
    :catchall_14
    move-exception v0

    .line 1902
    new-instance v6, Lsf/f;

    .line 1903
    .line 1904
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1905
    .line 1906
    .line 1907
    move-object v0, v6

    .line 1908
    :goto_3b
    nop

    .line 1909
    instance-of v6, v0, Lsf/f;

    .line 1910
    .line 1911
    if-eqz v6, :cond_52

    .line 1912
    .line 1913
    move-object/from16 v0, v23

    .line 1914
    .line 1915
    :cond_52
    check-cast v0, Ljava/lang/String;

    .line 1916
    .line 1917
    sget-object v6, Lka/f;->f:Ljava/util/List;

    .line 1918
    .line 1919
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v6

    .line 1923
    :goto_3c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1924
    .line 1925
    .line 1926
    move-result v10

    .line 1927
    if-eqz v10, :cond_54

    .line 1928
    .line 1929
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v10

    .line 1933
    move-object v13, v10

    .line 1934
    check-cast v13, Ljava/lang/String;

    .line 1935
    .line 1936
    move-object/from16 p4, v6

    .line 1937
    .line 1938
    const/4 v6, 0x0

    .line 1939
    invoke-static {v0, v13, v6}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1940
    .line 1941
    .line 1942
    move-result v13

    .line 1943
    if-eqz v13, :cond_53

    .line 1944
    .line 1945
    move-object v13, v10

    .line 1946
    goto :goto_3d

    .line 1947
    :cond_53
    move-object/from16 v6, p4

    .line 1948
    .line 1949
    goto :goto_3c

    .line 1950
    :cond_54
    const/4 v6, 0x0

    .line 1951
    const/4 v13, 0x0

    .line 1952
    :goto_3d
    check-cast v13, Ljava/lang/String;

    .line 1953
    .line 1954
    if-eqz v13, :cond_55

    .line 1955
    .line 1956
    goto :goto_3e

    .line 1957
    :cond_55
    const-string v13, ".audio"

    .line 1958
    .line 1959
    :goto_3e
    const-string v0, "qq_music_"

    .line 1960
    .line 1961
    const-string v10, "_"

    .line 1962
    .line 1963
    invoke-static {v8, v9, v0, v10}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v0

    .line 1967
    invoke-static {v0, v11, v12, v13}, Leh/a;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v0

    .line 1971
    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1972
    .line 1973
    .line 1974
    new-instance v4, Ljava/io/File;

    .line 1975
    .line 1976
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v0

    .line 1980
    const-string v8, ".part"

    .line 1981
    .line 1982
    invoke-static {v0, v8}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v0

    .line 1986
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1987
    .line 1988
    .line 1989
    move-object/from16 v12, p0

    .line 1990
    .line 1991
    :try_start_16
    invoke-virtual {v12, v4, v5, v7}, Lka/f;->b(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Z

    .line 1992
    .line 1993
    .line 1994
    move-result v0

    .line 1995
    if-eqz v0, :cond_56

    .line 1996
    .line 1997
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v0

    .line 2001
    invoke-virtual {v2, v3, v0}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2002
    .line 2003
    .line 2004
    move-result v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_15

    .line 2005
    if-eqz v0, :cond_56

    .line 2006
    .line 2007
    const/4 v6, 0x1

    .line 2008
    goto :goto_3f

    .line 2009
    :catchall_15
    move-exception v0

    .line 2010
    goto :goto_41

    .line 2011
    :cond_56
    :goto_3f
    invoke-static {v4}, Lka/f;->a(Ljava/io/File;)V

    .line 2012
    .line 2013
    .line 2014
    invoke-static {v5}, Lka/f;->a(Ljava/io/File;)V

    .line 2015
    .line 2016
    .line 2017
    :goto_40
    move v13, v6

    .line 2018
    goto :goto_42

    .line 2019
    :goto_41
    invoke-static {v4}, Lka/f;->a(Ljava/io/File;)V

    .line 2020
    .line 2021
    .line 2022
    invoke-static {v5}, Lka/f;->a(Ljava/io/File;)V

    .line 2023
    .line 2024
    .line 2025
    throw v0

    .line 2026
    :goto_42
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v13

    .line 2030
    goto :goto_43

    .line 2031
    :cond_57
    const/4 v13, 0x0

    .line 2032
    :goto_43
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2033
    .line 2034
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2035
    .line 2036
    .line 2037
    move-result v2

    .line 2038
    if-nez v2, :cond_58

    .line 2039
    .line 2040
    invoke-static {v13, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2041
    .line 2042
    .line 2043
    move-result v2

    .line 2044
    if-nez v2, :cond_58

    .line 2045
    .line 2046
    goto :goto_44

    .line 2047
    :cond_58
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2048
    .line 2049
    .line 2050
    move-result v2

    .line 2051
    if-eqz v2, :cond_59

    .line 2052
    .line 2053
    invoke-static {v13, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2054
    .line 2055
    .line 2056
    move-result v2

    .line 2057
    if-eqz v2, :cond_59

    .line 2058
    .line 2059
    const-string v0, "\u97f3\u4e50\u5361\u7247\u548c\u6b4c\u66f2\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 2060
    .line 2061
    invoke-static {v14, v15, v3, v0}, Lka/f;->e(JLjava/lang/String;Ljava/lang/String;)V

    .line 2062
    .line 2063
    .line 2064
    goto :goto_44

    .line 2065
    :cond_59
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v1

    .line 2069
    if-eqz v1, :cond_5a

    .line 2070
    .line 2071
    const-string v0, "\u97f3\u4e50\u5361\u7247\u53d1\u9001\u5931\u8d25"

    .line 2072
    .line 2073
    invoke-static {v14, v15, v3, v0}, Lka/f;->e(JLjava/lang/String;Ljava/lang/String;)V

    .line 2074
    .line 2075
    .line 2076
    goto :goto_44

    .line 2077
    :cond_5a
    invoke-static {v13, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2078
    .line 2079
    .line 2080
    move-result v0

    .line 2081
    if-eqz v0, :cond_5b

    .line 2082
    .line 2083
    const-string v0, "\u6b4c\u66f2\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 2084
    .line 2085
    invoke-static {v14, v15, v3, v0}, Lka/f;->e(JLjava/lang/String;Ljava/lang/String;)V

    .line 2086
    .line 2087
    .line 2088
    :cond_5b
    :goto_44
    return-void

    .line 2089
    :cond_5c
    move-object/from16 v12, p0

    .line 2090
    .line 2091
    move-object/from16 v3, p1

    .line 2092
    .line 2093
    move-wide/from16 v14, p2

    .line 2094
    .line 2095
    move-object/from16 v2, v18

    .line 2096
    .line 2097
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2098
    .line 2099
    .line 2100
    move-result v0

    .line 2101
    if-eqz v0, :cond_5d

    .line 2102
    .line 2103
    const-string v0, "\u672a\u641c\u5230"

    .line 2104
    .line 2105
    invoke-static {v14, v15, v3, v0}, Lka/f;->e(JLjava/lang/String;Ljava/lang/String;)V

    .line 2106
    .line 2107
    .line 2108
    return-void

    .line 2109
    :cond_5d
    move-object/from16 v2, v16

    .line 2110
    .line 2111
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2112
    .line 2113
    .line 2114
    move-result v0

    .line 2115
    if-eqz v0, :cond_5e

    .line 2116
    .line 2117
    const-string v0, "\u83b7\u53d6\u5931\u8d25\uff0c\u53ef\u80fd\u662f\u7248\u6743\u9650\u5236\u6216\u6570\u5b57\u4e13\u8f91"

    .line 2118
    .line 2119
    invoke-static {v14, v15, v3, v0}, Lka/f;->e(JLjava/lang/String;Ljava/lang/String;)V

    .line 2120
    .line 2121
    .line 2122
    return-void

    .line 2123
    :cond_5e
    invoke-static {}, Lokio/a;->k()V

    .line 2124
    .line 2125
    .line 2126
    return-void
.end method

.method public final f(Ljava/lang/String;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lka/f;->c:Lka/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lka/g;->a()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {v1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, v1}, Lka/g;->c(Ljava/util/Set;)V

    .line 23
    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const-string p2, "\u8be5\u804a\u5929\u70b9\u6b4c\u5f00\u5173\u5df2\u5f00\u542f\uff0c\u5176\u4ed6\u4eba\u53ef\u4ee5\u70b9\u6b4c\u4e86"

    .line 28
    .line 29
    :goto_1
    move-object v2, p2

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    const-string p2, "\u8be5\u804a\u5929\u70b9\u6b4c\u5f00\u5173\u5df2\u5173\u95ed\uff0c\u53ea\u6709\u4f60\u80fd\u70b9\u6b4c\u4e86"

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :goto_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->h()Lk8/e;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    const/4 v5, 0x1

    .line 52
    move-object v1, p1

    .line 53
    invoke-virtual/range {v0 .. v5}, Lk8/e;->e(Ljava/lang/String;Ljava/lang/String;JZ)J

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method
