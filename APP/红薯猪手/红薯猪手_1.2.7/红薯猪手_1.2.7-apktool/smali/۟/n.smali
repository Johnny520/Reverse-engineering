.class public final L۟/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/n$a;
    }
.end annotation


# instance fields
.field public ۥ:L۟/g0;

.field public final ۥ۟:Ljava/util/zip/ZipFile;

.field public ۥ۟۟:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    iput-object p1, p0, L۟/n;->ۥ۟۟:Ljava/io/File;

    new-instance v0, Ljava/util/zip/ZipFile;

    invoke-direct {v0, p1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    iput-object v0, p0, L۟/n;->ۥ۟:Ljava/util/zip/ZipFile;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, L۟/n$a;

    const/16 v2, 0xf

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    const/4 v3, 0x6

    new-array v3, v3, [B

    fill-array-data v3, :array_1

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, L۟/n$a;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1

    nop

    :array_0
    .array-data 1
        -0x26t
        0x5bt
        -0x1ft
        0x1at
        0x19t
        0x7bt
        -0x9t
        0x15t
        -0x2at
        0x2bt
        0x3et
        0x28t
        -0x4dt
        0x10t
        -0x1ct
    .end array-data

    :array_1
    .array-data 1
        -0x6dt
        0x35t
        -0x69t
        0x7bt
        0x75t
        0x12t
    .end array-data
.end method

.method public static ۥ۟۟(Ljava/io/File;)L۟/n;
    .locals 1

    new-instance v0, L۟/n;

    invoke-direct {v0, p0}, L۟/n;-><init>(Ljava/io/File;)V

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, L۟/n;->ۥ:L۟/g0;

    :try_start_0
    iget-object v0, p0, L۟/n;->ۥ۟:Ljava/util/zip/ZipFile;

    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ۥ۟ۦ()L۟/g0;
    .locals 14

    .line 1
    iget-object v0, p0, L۟/n;->ۥ:L۟/g0;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, L۟/n;->ۥ۟:Ljava/util/zip/ZipFile;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x6

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v3, v1

    .line 24
    check-cast v3, Ljava/util/zip/ZipEntry;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v4, 0x4

    .line 42
    new-array v5, v4, [B

    .line 43
    .line 44
    fill-array-data v5, :array_0

    .line 45
    .line 46
    .line 47
    new-array v6, v2, [B

    .line 48
    .line 49
    fill-array-data v6, :array_1

    .line 50
    .line 51
    .line 52
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-array v4, v4, [B

    .line 71
    .line 72
    fill-array-data v4, :array_2

    .line 73
    .line 74
    .line 75
    new-array v5, v2, [B

    .line 76
    .line 77
    fill-array-data v5, :array_3

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_0

    .line 89
    .line 90
    :cond_2
    if-eqz v3, :cond_6

    .line 91
    .line 92
    iget-object v0, p0, L۟/n;->ۥ۟:Ljava/util/zip/ZipFile;

    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 99
    .line 100
    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 101
    .line 102
    .line 103
    const/16 v3, 0x400

    .line 104
    .line 105
    :try_start_0
    new-array v3, v3, [B

    .line 106
    .line 107
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 108
    .line 109
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    const/4 v6, -0x1

    .line 117
    const/4 v7, 0x0

    .line 118
    if-eq v5, v6, :cond_3

    .line 119
    .line 120
    invoke-virtual {v4, v3, v7, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    :try_start_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 125
    .line 126
    .line 127
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, Ljavax/security/cert/X509Certificate;->getInstance([B)Ljavax/security/cert/X509Certificate;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v3, L۟/g0$a;

    .line 139
    .line 140
    invoke-direct {v3}, L۟/g0$a;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljavax/security/cert/Certificate;->getEncoded()[B

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    const/4 v5, 0x3

    .line 148
    new-array v6, v5, [B

    .line 149
    .line 150
    fill-array-data v6, :array_4

    .line 151
    .line 152
    .line 153
    new-array v8, v2, [B

    .line 154
    .line 155
    fill-array-data v8, :array_5

    .line 156
    .line 157
    .line 158
    invoke-static {v6, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    :try_start_3
    invoke-static {v6}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 163
    .line 164
    .line 165
    move-result-object v6
    :try_end_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_1

    .line 166
    invoke-virtual {v6, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-static {v6}, L۟/h0;->ۥ([B)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    new-instance v8, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    array-length v9, v4

    .line 180
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 181
    .line 182
    .line 183
    array-length v9, v4

    .line 184
    move v10, v7

    .line 185
    :goto_2
    if-ge v10, v9, :cond_5

    .line 186
    .line 187
    aget-byte v11, v4, v10

    .line 188
    .line 189
    int-to-char v11, v11

    .line 190
    and-int/lit16 v11, v11, 0xff

    .line 191
    .line 192
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    const/4 v13, 0x2

    .line 201
    if-ge v12, v13, :cond_4

    .line 202
    .line 203
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    :cond_4
    invoke-virtual {v11}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    add-int/lit8 v10, v10, 0x1

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_5
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    new-array v5, v5, [B

    .line 221
    .line 222
    fill-array-data v5, :array_6

    .line 223
    .line 224
    .line 225
    new-array v7, v2, [B

    .line 226
    .line 227
    fill-array-data v7, :array_7

    .line 228
    .line 229
    .line 230
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    :try_start_4
    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 235
    .line 236
    .line 237
    move-result-object v5
    :try_end_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_0

    .line 238
    const/4 v7, 0x5

    .line 239
    new-array v7, v7, [B

    .line 240
    .line 241
    fill-array-data v7, :array_8

    .line 242
    .line 243
    .line 244
    new-array v2, v2, [B

    .line 245
    .line 246
    fill-array-data v2, :array_9

    .line 247
    .line 248
    .line 249
    invoke-static {v7, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v4, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v5, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/security/MessageDigest;->digest()[B

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-static {v2}, L۟/h0;->ۥ([B)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    iput-object v2, v3, L۟/g0$a;->ۥ۟:Ljava/lang/String;

    .line 273
    .line 274
    iput-object v6, v3, L۟/g0$a;->ۥ۟۟:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljavax/security/cert/X509Certificate;->getNotBefore()Ljava/util/Date;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1}, Ljavax/security/cert/X509Certificate;->getNotAfter()Ljava/util/Date;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1}, Ljavax/security/cert/X509Certificate;->getSigAlgName()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    iput-object v2, v3, L۟/g0$a;->ۥ:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v1}, Ljavax/security/cert/X509Certificate;->getSigAlgOID()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    new-instance v1, L۟/g0;

    .line 292
    .line 293
    invoke-direct {v1, v3}, L۟/g0;-><init>(L۟/g0$a;)V

    .line 294
    .line 295
    .line 296
    iput-object v1, p0, L۟/n;->ۥ:L۟/g0;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 299
    .line 300
    .line 301
    goto :goto_3

    .line 302
    :catch_0
    move-exception v0

    .line 303
    new-instance v1, Ljava/lang/RuntimeException;

    .line 304
    .line 305
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    throw v1

    .line 309
    :catch_1
    move-exception v0

    .line 310
    new-instance v1, Ljava/lang/RuntimeException;

    .line 311
    .line 312
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    throw v1

    .line 316
    :catchall_0
    move-exception v0

    .line 317
    :try_start_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 318
    .line 319
    .line 320
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 321
    :catchall_1
    move-exception v0

    .line 322
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 323
    .line 324
    .line 325
    throw v0

    .line 326
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 327
    .line 328
    const/16 v1, 0x1f

    .line 329
    .line 330
    new-array v1, v1, [B

    .line 331
    .line 332
    fill-array-data v1, :array_a

    .line 333
    .line 334
    .line 335
    new-array v2, v2, [B

    .line 336
    .line 337
    fill-array-data v2, :array_b

    .line 338
    .line 339
    .line 340
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v0

    .line 348
    :cond_7
    :goto_3
    iget-object v0, p0, L۟/n;->ۥ:L۟/g0;

    .line 349
    .line 350
    return-object v0

    .line 351
    :array_0
    .array-data 1
        -0x7ft
        -0x43t
        0x12t
        0x46t
    .end array-data

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    :array_1
    .array-data 1
        -0x51t
        -0x11t
        0x41t
        0x7t
        0x1bt
        0x7dt
    .end array-data

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    nop

    .line 365
    :array_2
    .array-data 1
        0x43t
        0x63t
        -0x23t
        0x6et
    .end array-data

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    :array_3
    .array-data 1
        0x6dt
        0x27t
        -0x72t
        0x2ft
        0x49t
        -0x7at
    .end array-data

    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    nop

    .line 379
    :array_4
    .array-data 1
        -0x2ft
        -0x55t
        0x3bt
    .end array-data

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    :array_5
    .array-data 1
        -0x64t
        -0x11t
        0xet
        0x43t
        -0x36t
        0x1t
    .end array-data

    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    nop

    .line 393
    :array_6
    .array-data 1
        0x55t
        -0x53t
        0x2dt
    .end array-data

    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    :array_7
    .array-data 1
        0x18t
        -0x17t
        0x18t
        -0x4et
        0x77t
        -0x5bt
    .end array-data

    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    nop

    .line 407
    :array_8
    .array-data 1
        0x54t
        -0x7t
        0x6et
        0x27t
        0x5et
    .end array-data

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    nop

    .line 415
    :array_9
    .array-data 1
        0x1t
        -0x53t
        0x28t
        0xat
        0x66t
        0x5et
    .end array-data

    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    nop

    .line 423
    :array_a
    .array-data 1
        -0x6ft
        0x55t
        0x4bt
        -0x46t
        0x44t
        0x11t
        -0x5dt
        0x40t
        0x52t
        -0x36t
        0x46t
        0x6t
        -0x5et
        0x51t
        0x49t
        -0x74t
        0x4ct
        0x0t
        -0x4ft
        0x51t
        0x45t
        -0x36t
        0x4bt
        0xct
        -0x5ct
        0x5t
        0x46t
        -0x7bt
        0x50t
        0xdt
        -0x4ct
    .end array-data

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    :array_b
    .array-data 1
        -0x30t
        0x25t
        0x20t
        -0x16t
        0x25t
        0x63t
    .end array-data
.end method

.method public final ۥۣ۠()I
    .locals 8

    .line 1
    iget-object v0, p0, L۟/n;->ۥ۟:Ljava/util/zip/ZipFile;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    new-array v1, v1, [B

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x6

    .line 11
    new-array v2, v2, [B

    .line 12
    .line 13
    fill-array-data v2, :array_1

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    new-instance v0, Ljava/util/jar/JarFile;

    .line 29
    .line 30
    iget-object v2, p0, L۟/n;->ۥ۟۟:Ljava/io/File;

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/util/jar/JarFile;-><init>(Ljava/io/File;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/jar/JarFile;->entries()Ljava/util/Enumeration;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/16 v3, 0x2000

    .line 40
    .line 41
    new-array v4, v3, [B

    .line 42
    .line 43
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljava/util/jar/JarEntry;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    :try_start_0
    invoke-virtual {v0, v5}, Ljava/util/jar/JarFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    :goto_1
    invoke-virtual {v5, v4, v1, v3}, Ljava/io/InputStream;->read([BII)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const/4 v7, -0x1

    .line 71
    if-eq v6, v7, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catch_0
    const/4 v0, 0x1

    .line 79
    return v0

    .line 80
    :cond_3
    const/4 v0, 0x2

    .line 81
    return v0

    .line 82
    nop

    .line 83
    :array_0
    .array-data 1
        0x15t
        -0x44t
        0x51t
        -0x41t
        -0x7bt
        -0x60t
        0x16t
        -0x41t
        0x2at
        -0x4dt
        -0x17t
        -0x59t
        0x11t
        -0x41t
        0x40t
        -0x53t
        -0x4t
        -0x39t
        0x15t
        -0x41t
    .end array-data

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    :array_1
    .array-data 1
        0x58t
        -0x7t
        0x5t
        -0x2t
        -0x58t
        -0x17t
    .end array-data
.end method
