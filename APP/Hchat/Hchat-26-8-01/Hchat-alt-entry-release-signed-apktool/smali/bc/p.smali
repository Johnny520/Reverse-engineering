.class public final enum Lbc/p;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum h:Lbc/p;

.field public static final enum i:Lbc/p;

.field public static final enum j:Lbc/p;

.field public static final enum k:Lbc/p;

.field public static final l:Ljava/util/HashMap;

.field public static final synthetic m:[Lbc/p;


# instance fields
.field public final g:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    new-instance v1, Lbc/p;

    .line 2
    .line 3
    const-string v0, ".jar"

    .line 4
    .line 5
    const-string v2, ".class"

    .line 6
    .line 7
    const-string v3, ".dex"

    .line 8
    .line 9
    filled-new-array {v3, v0, v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "CODE"

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, v2, v3, v0}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lbc/p;

    .line 20
    .line 21
    const-string v0, ".xml"

    .line 22
    .line 23
    filled-new-array {v0}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v4, "XML"

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-direct {v2, v4, v5, v0}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Lbc/p;->h:Lbc/p;

    .line 34
    .line 35
    new-instance v0, Lbc/p;

    .line 36
    .line 37
    const-string v4, ".arsc"

    .line 38
    .line 39
    filled-new-array {v4}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "ARSC"

    .line 44
    .line 45
    const/4 v6, 0x2

    .line 46
    invoke-direct {v0, v5, v6, v4}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lbc/p;->i:Lbc/p;

    .line 50
    .line 51
    new-instance v4, Lbc/p;

    .line 52
    .line 53
    const-string v5, ".apkm"

    .line 54
    .line 55
    const-string v6, ".apks"

    .line 56
    .line 57
    const-string v7, ".apk"

    .line 58
    .line 59
    filled-new-array {v7, v5, v6}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const-string v6, "APK"

    .line 64
    .line 65
    const/4 v7, 0x3

    .line 66
    invoke-direct {v4, v6, v7, v5}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v5, Lbc/p;

    .line 70
    .line 71
    const-string v6, ".ttc"

    .line 72
    .line 73
    const-string v7, ".otf"

    .line 74
    .line 75
    const-string v8, ".ttf"

    .line 76
    .line 77
    filled-new-array {v8, v6, v7}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const-string v7, "FONT"

    .line 82
    .line 83
    const/4 v8, 0x4

    .line 84
    invoke-direct {v5, v7, v8, v6}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    new-instance v6, Lbc/p;

    .line 88
    .line 89
    const-string v12, ".bmp"

    .line 90
    .line 91
    const-string v13, ".tiff"

    .line 92
    .line 93
    const-string v7, ".png"

    .line 94
    .line 95
    const-string v8, ".gif"

    .line 96
    .line 97
    const-string v9, ".jpg"

    .line 98
    .line 99
    const-string v10, ".jpeg"

    .line 100
    .line 101
    const-string v11, ".webp"

    .line 102
    .line 103
    filled-new-array/range {v7 .. v13}, [Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    const-string v8, "IMG"

    .line 108
    .line 109
    const/4 v9, 0x5

    .line 110
    invoke-direct {v6, v8, v9, v7}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v7, Lbc/p;

    .line 114
    .line 115
    const-string v21, ".tgz"

    .line 116
    .line 117
    const-string v22, ".bz2"

    .line 118
    .line 119
    const-string v8, ".zip"

    .line 120
    .line 121
    const-string v9, ".rar"

    .line 122
    .line 123
    const-string v10, ".7zip"

    .line 124
    .line 125
    const-string v11, ".7z"

    .line 126
    .line 127
    const-string v12, ".arj"

    .line 128
    .line 129
    const-string v13, ".tar"

    .line 130
    .line 131
    const-string v14, ".gzip"

    .line 132
    .line 133
    const-string v15, ".bzip"

    .line 134
    .line 135
    const-string v16, ".bzip2"

    .line 136
    .line 137
    const-string v17, ".cab"

    .line 138
    .line 139
    const-string v18, ".cpio"

    .line 140
    .line 141
    const-string v19, ".ar"

    .line 142
    .line 143
    const-string v20, ".gz"

    .line 144
    .line 145
    filled-new-array/range {v8 .. v22}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    const-string v9, "ARCHIVE"

    .line 150
    .line 151
    const/4 v10, 0x6

    .line 152
    invoke-direct {v7, v9, v10, v8}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v8, Lbc/p;

    .line 156
    .line 157
    const-string v13, ".flv"

    .line 158
    .line 159
    const-string v14, ".3gp"

    .line 160
    .line 161
    const-string v9, ".mp4"

    .line 162
    .line 163
    const-string v10, ".mkv"

    .line 164
    .line 165
    const-string v11, ".webm"

    .line 166
    .line 167
    const-string v12, ".avi"

    .line 168
    .line 169
    filled-new-array/range {v9 .. v14}, [Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    const-string v10, "VIDEOS"

    .line 174
    .line 175
    const/4 v11, 0x7

    .line 176
    invoke-direct {v8, v10, v11, v9}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    new-instance v9, Lbc/p;

    .line 180
    .line 181
    const-string v16, ".mid"

    .line 182
    .line 183
    const-string v17, ".midi"

    .line 184
    .line 185
    const-string v10, ".aac"

    .line 186
    .line 187
    const-string v11, ".ogg"

    .line 188
    .line 189
    const-string v12, ".opus"

    .line 190
    .line 191
    const-string v13, ".mp3"

    .line 192
    .line 193
    const-string v14, ".wav"

    .line 194
    .line 195
    const-string v15, ".wma"

    .line 196
    .line 197
    filled-new-array/range {v10 .. v17}, [Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    const-string v11, "SOUNDS"

    .line 202
    .line 203
    const/16 v12, 0x8

    .line 204
    .line 205
    invoke-direct {v9, v11, v12, v10}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-instance v10, Lbc/p;

    .line 209
    .line 210
    const-string v11, ".json"

    .line 211
    .line 212
    filled-new-array {v11}, [Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    const-string v12, "JSON"

    .line 217
    .line 218
    const/16 v13, 0x9

    .line 219
    .line 220
    invoke-direct {v10, v12, v13, v11}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    new-instance v11, Lbc/p;

    .line 224
    .line 225
    const-string v19, ".kt"

    .line 226
    .line 227
    const-string v20, ".md"

    .line 228
    .line 229
    const-string v12, ".txt"

    .line 230
    .line 231
    const-string v13, ".ini"

    .line 232
    .line 233
    const-string v14, ".conf"

    .line 234
    .line 235
    const-string v15, ".yaml"

    .line 236
    .line 237
    const-string v16, ".properties"

    .line 238
    .line 239
    const-string v17, ".js"

    .line 240
    .line 241
    const-string v18, ".java"

    .line 242
    .line 243
    filled-new-array/range {v12 .. v20}, [Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    const-string v13, "TEXT"

    .line 248
    .line 249
    const/16 v14, 0xa

    .line 250
    .line 251
    invoke-direct {v11, v13, v14, v12}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    new-instance v12, Lbc/p;

    .line 255
    .line 256
    const-string v13, ".html"

    .line 257
    .line 258
    const-string v14, ".htm"

    .line 259
    .line 260
    filled-new-array {v13, v14}, [Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    const-string v14, "HTML"

    .line 265
    .line 266
    const/16 v15, 0xb

    .line 267
    .line 268
    invoke-direct {v12, v14, v15, v13}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance v13, Lbc/p;

    .line 272
    .line 273
    const-string v14, ".so"

    .line 274
    .line 275
    filled-new-array {v14}, [Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v14

    .line 279
    const-string v15, "LIB"

    .line 280
    .line 281
    const/16 v3, 0xc

    .line 282
    .line 283
    invoke-direct {v13, v15, v3, v14}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    new-instance v14, Lbc/p;

    .line 287
    .line 288
    const/16 v3, 0xd

    .line 289
    .line 290
    move-object/from16 v17, v0

    .line 291
    .line 292
    const/4 v15, 0x0

    .line 293
    new-array v0, v15, [Ljava/lang/String;

    .line 294
    .line 295
    const-string v15, "MANIFEST"

    .line 296
    .line 297
    invoke-direct {v14, v15, v3, v0}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    sput-object v14, Lbc/p;->j:Lbc/p;

    .line 301
    .line 302
    new-instance v15, Lbc/p;

    .line 303
    .line 304
    const-string v0, ".bin"

    .line 305
    .line 306
    filled-new-array {v0}, [Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    const-string v3, "UNKNOWN_BIN"

    .line 311
    .line 312
    move-object/from16 v18, v1

    .line 313
    .line 314
    const/16 v1, 0xe

    .line 315
    .line 316
    invoke-direct {v15, v3, v1, v0}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    new-instance v0, Lbc/p;

    .line 320
    .line 321
    const/16 v1, 0xf

    .line 322
    .line 323
    move-object/from16 v16, v2

    .line 324
    .line 325
    const/4 v3, 0x0

    .line 326
    new-array v2, v3, [Ljava/lang/String;

    .line 327
    .line 328
    const-string v3, "UNKNOWN"

    .line 329
    .line 330
    invoke-direct {v0, v3, v1, v2}, Lbc/p;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    sput-object v0, Lbc/p;->k:Lbc/p;

    .line 334
    .line 335
    move-object/from16 v2, v16

    .line 336
    .line 337
    move-object/from16 v3, v17

    .line 338
    .line 339
    move-object/from16 v1, v18

    .line 340
    .line 341
    const/16 v19, 0x0

    .line 342
    .line 343
    move-object/from16 v16, v0

    .line 344
    .line 345
    filled-new-array/range {v1 .. v16}, [Lbc/p;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    sput-object v0, Lbc/p;->m:[Lbc/p;

    .line 350
    .line 351
    new-instance v0, Ljava/util/HashMap;

    .line 352
    .line 353
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 354
    .line 355
    .line 356
    sput-object v0, Lbc/p;->l:Ljava/util/HashMap;

    .line 357
    .line 358
    invoke-static {}, Lbc/p;->values()[Lbc/p;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    array-length v1, v0

    .line 363
    move/from16 v3, v19

    .line 364
    .line 365
    :goto_0
    if-ge v3, v1, :cond_2

    .line 366
    .line 367
    aget-object v2, v0, v3

    .line 368
    .line 369
    iget-object v4, v2, Lbc/p;->g:[Ljava/lang/String;

    .line 370
    .line 371
    array-length v5, v4

    .line 372
    move/from16 v6, v19

    .line 373
    .line 374
    :goto_1
    if-ge v6, v5, :cond_1

    .line 375
    .line 376
    aget-object v7, v4, v6

    .line 377
    .line 378
    sget-object v8, Lbc/p;->l:Ljava/util/HashMap;

    .line 379
    .line 380
    invoke-virtual {v8, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v8

    .line 384
    check-cast v8, Lbc/p;

    .line 385
    .line 386
    if-nez v8, :cond_0

    .line 387
    .line 388
    add-int/lit8 v6, v6, 0x1

    .line 389
    .line 390
    goto :goto_1

    .line 391
    :cond_0
    const-string v0, "Duplicate extension in ResourceType: "

    .line 392
    .line 393
    invoke-static {v0, v7}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 402
    .line 403
    goto :goto_0

    .line 404
    :cond_2
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lbc/p;->g:[Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/lang/String;)Lbc/p;
    .locals 2

    .line 1
    const-string v0, "/resources.pb"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lbc/p;->i:Lbc/p;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v0, 0x2e

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, -0x1

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Lbc/p;->l:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lbc/p;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    sget-object v1, Lbc/p;->h:Lbc/p;

    .line 42
    .line 43
    if-ne v0, v1, :cond_1

    .line 44
    .line 45
    const-string v1, "AndroidManifest.xml"

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    sget-object p0, Lbc/p;->j:Lbc/p;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    return-object v0

    .line 57
    :cond_2
    sget-object p0, Lbc/p;->k:Lbc/p;

    .line 58
    .line 59
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lbc/p;
    .locals 1

    .line 1
    const-class v0, Lbc/p;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbc/p;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lbc/p;
    .locals 1

    .line 1
    sget-object v0, Lbc/p;->m:[Lbc/p;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lbc/p;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lbc/p;

    .line 8
    .line 9
    return-object v0
.end method
