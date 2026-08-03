.class public final Lo8/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Ljava/util/regex/Pattern;

.field public static final f:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ClassLoader;

.field public volatile c:Ll8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(?:patch\\.client\\.ver|clientVersion|CLIENT_VERSION)\\s*[=:]\\s*(0x[0-9a-fA-F]+|\\d+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lo8/k;->d:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "(?:NEW_TINKER_ID|TINKER_ID)\\s*[=:]\\s*([^,}\\s]+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lo8/k;->e:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "intent_patch_(?:new|old)_version\\s*[=:]\\s*([^,}\\s]+)"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lo8/k;->f:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo8/k;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lo8/k;->b:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v3, Ll8/i;

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    const-string v13, ""

    .line 23
    .line 24
    const-string v4, ""

    .line 25
    .line 26
    const-string v5, ""

    .line 27
    .line 28
    const-string v6, ""

    .line 29
    .line 30
    const-string v7, ""

    .line 31
    .line 32
    const-wide/16 v8, 0x0

    .line 33
    .line 34
    const-wide/16 v10, 0x0

    .line 35
    .line 36
    const-string v12, ""

    .line 37
    .line 38
    invoke-direct/range {v3 .. v13}, Ll8/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const/4 v3, 0x0

    .line 47
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v5, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    iget-object v8, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    if-eqz v8, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object v8, v2

    .line 61
    :goto_0
    :try_start_1
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v10, 0x1c

    .line 64
    .line 65
    if-lt v9, v10, :cond_2

    .line 66
    .line 67
    invoke-static {v4}, Lb0/b0;->b(Landroid/content/pm/PackageInfo;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v9

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget v4, v4, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    int-to-long v9, v4

    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-object v8, v2

    .line 77
    :catchall_1
    const-wide/16 v9, 0x0

    .line 78
    .line 79
    :goto_1
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-eqz v4, :cond_3

    .line 84
    .line 85
    iget-object v11, v4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    if-nez v11, :cond_3

    .line 92
    .line 93
    new-instance v11, Ljava/io/File;

    .line 94
    .line 95
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v11, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11}, Ljava/io/File;->lastModified()J

    .line 101
    .line 102
    .line 103
    move-result-wide v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    goto :goto_2

    .line 105
    :catchall_2
    :cond_3
    const-wide/16 v11, 0x0

    .line 106
    .line 107
    :goto_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    if-nez v1, :cond_5

    .line 112
    .line 113
    :catchall_3
    :cond_4
    move-object v3, v2

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    :try_start_3
    const-string v13, "com.tencent.mm.boot.BuildConfig"

    .line 116
    .line 117
    invoke-static {v13, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    const-string v14, "CLIENT_VERSION_ARM64"

    .line 122
    .line 123
    invoke-static {v13, v14}, Lo8/k;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v14

    .line 127
    const-string v15, "CLIENT_VERSION"

    .line 128
    .line 129
    invoke-static {v13, v15}, Lo8/k;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    const-string v3, "CLIENT_VERSION_INT"

    .line 134
    .line 135
    invoke-static {v13, v3}, Lo8/k;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    const-string v6, "CLIENTVERSION"

    .line 140
    .line 141
    invoke-static {v13, v6}, Lo8/k;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    filled-new-array {v14, v15, v3, v6}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v3}, Lo8/k;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-eqz v3, :cond_4

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 159
    :goto_3
    sget-object v6, Lo8/k;->d:Ljava/util/regex/Pattern;

    .line 160
    .line 161
    invoke-static {v6, v4}, Lo8/k;->d(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    const-string v7, "patch.client.ver"

    .line 166
    .line 167
    invoke-static {v0, v7}, Lo8/k;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    const-string v13, "client.ver"

    .line 172
    .line 173
    invoke-static {v0, v13}, Lo8/k;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v13

    .line 177
    filled-new-array {v3, v6, v7, v13}, [Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-static {v3}, Lo8/k;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    sget-object v3, Lo8/k;->e:Ljava/util/regex/Pattern;

    .line 186
    .line 187
    invoke-static {v3, v4}, Lo8/k;->d(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    const-string v6, "NEW_TINKER_ID"

    .line 192
    .line 193
    invoke-static {v0, v6}, Lo8/k;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    const-string v13, "TINKER_ID"

    .line 198
    .line 199
    invoke-static {v0, v13}, Lo8/k;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    filled-new-array {v3, v6, v13}, [Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-static {v3}, Lo8/k;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    sget-object v6, Lo8/k;->f:Ljava/util/regex/Pattern;

    .line 212
    .line 213
    invoke-static {v6, v4}, Lo8/k;->d(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    :try_start_4
    new-instance v6, Ljava/io/File;

    .line 218
    .line 219
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const-string v13, "tinker"

    .line 228
    .line 229
    invoke-direct {v6, v0, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-nez v0, :cond_6

    .line 237
    .line 238
    :catchall_4
    move-object v14, v2

    .line 239
    goto :goto_6

    .line 240
    :cond_6
    array-length v6, v0

    .line 241
    move-object v14, v2

    .line 242
    const/4 v13, 0x0

    .line 243
    const-wide/16 v17, 0x0

    .line 244
    .line 245
    :goto_4
    if-ge v13, v6, :cond_b

    .line 246
    .line 247
    aget-object v15, v0, v13

    .line 248
    .line 249
    if-eqz v15, :cond_7

    .line 250
    .line 251
    invoke-virtual {v15}, Ljava/io/File;->isDirectory()Z

    .line 252
    .line 253
    .line 254
    move-result v16

    .line 255
    if-nez v16, :cond_8

    .line 256
    .line 257
    :cond_7
    move-object/from16 p0, v0

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_8
    move-object/from16 p0, v0

    .line 261
    .line 262
    invoke-virtual {v15}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v16

    .line 270
    if-nez v16, :cond_a

    .line 271
    .line 272
    const-string v1, "patch-"

    .line 273
    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-nez v1, :cond_9

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_9
    invoke-virtual {v15}, Ljava/io/File;->lastModified()J

    .line 282
    .line 283
    .line 284
    move-result-wide v15
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 285
    cmp-long v1, v15, v17

    .line 286
    .line 287
    if-ltz v1, :cond_a

    .line 288
    .line 289
    move-object v14, v0

    .line 290
    move-wide/from16 v17, v15

    .line 291
    .line 292
    :cond_a
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 293
    .line 294
    move-object/from16 v0, p0

    .line 295
    .line 296
    move-object/from16 v1, p1

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_b
    :goto_6
    filled-new-array {v4, v14}, [Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0}, Lo8/k;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v13

    .line 307
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    new-instance v1, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    if-eqz v5, :cond_c

    .line 325
    .line 326
    move-object v4, v5

    .line 327
    goto :goto_7

    .line 328
    :cond_c
    move-object v4, v2

    .line 329
    :goto_7
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    const/16 v4, 0x7c

    .line 333
    .line 334
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    if-eqz v7, :cond_d

    .line 350
    .line 351
    move-object v6, v7

    .line 352
    goto :goto_8

    .line 353
    :cond_d
    move-object v6, v2

    .line 354
    :goto_8
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    if-eqz v3, :cond_e

    .line 361
    .line 362
    move-object v6, v3

    .line 363
    goto :goto_9

    .line 364
    :cond_e
    move-object v6, v2

    .line 365
    :goto_9
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    if-eqz v13, :cond_f

    .line 372
    .line 373
    move-object v6, v13

    .line 374
    goto :goto_a

    .line 375
    :cond_f
    move-object v6, v2

    .line 376
    :goto_a
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    if-eqz v0, :cond_10

    .line 389
    .line 390
    move-object v2, v0

    .line 391
    :cond_10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    new-instance v4, Ll8/i;

    .line 399
    .line 400
    move-object v6, v8

    .line 401
    move-object v8, v3

    .line 402
    invoke-direct/range {v4 .. v14}, Ll8/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    return-object v4
.end method

.method public static varargs c([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p0, v1

    .line 6
    .line 7
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const-string p0, ""

    .line 18
    .line 19
    return-object p0
.end method

.method public static d(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    return-object p0

    .line 26
    :catchall_0
    :cond_1
    :goto_0
    const-string p0, ""

    .line 27
    .line 28
    return-object p0
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return-object p0

    .line 30
    :catchall_0
    :cond_1
    :goto_0
    const-string p0, ""

    .line 31
    .line 32
    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v1, "tinker"

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p1}, Lo8/k;->g(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    return-object p0

    .line 32
    :catchall_0
    :cond_1
    :goto_0
    const-string p0, ""

    .line 33
    .line 34
    return-object p0
.end method

.method public static g(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_7

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    :cond_1
    array-length v0, p0

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v0, :cond_c

    .line 22
    .line 23
    aget-object v3, p0, v2

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    invoke-static {v3, p1}, Lo8/k;->g(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_b

    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_b

    .line 55
    .line 56
    const-string v5, ".meta"

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_4

    .line 63
    .line 64
    const-string v5, ".txt"

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-nez v5, :cond_4

    .line 71
    .line 72
    const-string v5, ".properties"

    .line 73
    .line 74
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_4

    .line 79
    .line 80
    goto :goto_6

    .line 81
    :cond_4
    const/4 v4, 0x0

    .line 82
    :try_start_0
    new-instance v5, Ljava/io/BufferedReader;

    .line 83
    .line 84
    new-instance v6, Ljava/io/FileReader;

    .line 85
    .line 86
    invoke-direct {v6, v3}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v5, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 90
    .line 91
    .line 92
    :cond_5
    :goto_1
    :try_start_1
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    if-eqz v3, :cond_9

    .line 97
    .line 98
    invoke-virtual {v3, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-gez v4, :cond_6

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    add-int/2addr v6, v4

    .line 110
    const/16 v7, 0x3d

    .line 111
    .line 112
    invoke-virtual {v3, v7, v6}, Ljava/lang/String;->indexOf(II)I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-gez v6, :cond_7

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    add-int/2addr v4, v6

    .line 123
    const/16 v6, 0x3a

    .line 124
    .line 125
    invoke-virtual {v3, v6, v4}, Ljava/lang/String;->indexOf(II)I

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    goto :goto_2

    .line 130
    :catchall_0
    move-object v4, v5

    .line 131
    goto :goto_3

    .line 132
    :cond_7
    :goto_2
    if-ltz v6, :cond_5

    .line 133
    .line 134
    add-int/lit8 v6, v6, 0x1

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-lt v6, v4, :cond_8

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_8
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    :try_start_2
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_9
    :try_start_3
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :catchall_1
    :goto_3
    if-eqz v4, :cond_a

    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 162
    .line 163
    .line 164
    :catchall_2
    :cond_a
    :goto_4
    move-object v3, v1

    .line 165
    :catchall_3
    :goto_5
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-nez v4, :cond_b

    .line 170
    .line 171
    return-object v3

    .line 172
    :cond_b
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_c
    :goto_7
    return-object v1
.end method


# virtual methods
.method public final b()Ll8/i;
    .locals 6

    .line 1
    iget-object v0, p0, Lo8/k;->c:Ll8/i;

    .line 2
    .line 3
    iget-object v1, p0, Lo8/k;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lo8/k;->b:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object v1, p0, Lo8/k;->c:Ll8/i;

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    iget-object v2, v0, Ll8/i;->e:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v2, v0, Ll8/i;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget-wide v2, v0, Ll8/i;->a:J

    .line 35
    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    cmp-long v2, v2, v4

    .line 39
    .line 40
    if-gtz v2, :cond_3

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    iget-object v2, v0, Ll8/i;->h:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, v1, Ll8/i;->h:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    iget-object v2, v0, Ll8/i;->e:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v3, v1, Ll8/i;->e:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    iget-object v2, v0, Ll8/i;->f:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v3, v1, Ll8/i;->f:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    iget-object v2, v0, Ll8/i;->g:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v3, v1, Ll8/i;->g:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_4

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    return-object v0

    .line 85
    :cond_5
    :goto_0
    iput-object v1, p0, Lo8/k;->c:Ll8/i;

    .line 86
    .line 87
    return-object v1
.end method
