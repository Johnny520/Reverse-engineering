.class public final Lba/f;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lba/f;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 7
    iput p2, p0, Lba/f;->a:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private final a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v1, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v1, v0, Ljava/lang/Integer;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v2

    .line 23
    :goto_0
    if-eqz v0, :cond_14

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const v1, 0x4843525b    # 200009.42f

    .line 30
    .line 31
    .line 32
    if-eq v0, v1, :cond_1

    .line 33
    .line 34
    const v3, 0x4843525c    # 200009.44f

    .line 35
    .line 36
    .line 37
    if-eq v0, v3, :cond_1

    .line 38
    .line 39
    goto/16 :goto_c

    .line 40
    .line 41
    :cond_1
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    invoke-static {v4, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    instance-of v5, v3, Ljava/lang/Integer;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    check-cast v3, Ljava/lang/Integer;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v3, v2

    .line 59
    :goto_1
    if-eqz v3, :cond_14

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/4 v5, -0x1

    .line 66
    if-eq v3, v5, :cond_3

    .line 67
    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :cond_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x2

    .line 76
    invoke-static {v3, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    instance-of v3, p1, Landroid/content/Intent;

    .line 81
    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    check-cast p1, Landroid/content/Intent;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object p1, v2

    .line 88
    :goto_2
    if-eqz p1, :cond_14

    .line 89
    .line 90
    sget-object v3, Lwb/d;->e:Landroid/app/Activity;

    .line 91
    .line 92
    if-eqz v3, :cond_14

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_14

    .line 99
    .line 100
    const-string v6, ""

    .line 101
    .line 102
    if-ne v0, v1, :cond_f

    .line 103
    .line 104
    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "content"

    .line 109
    .line 110
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    and-int/2addr p1, v4

    .line 122
    if-nez p1, :cond_6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1, v5, v4}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    :catchall_0
    :goto_3
    sget-object p1, Lwb/d;->a:Lwb/d;

    .line 133
    .line 134
    const-string p1, "_"

    .line 135
    .line 136
    const-string v0, "file"

    .line 137
    .line 138
    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    const-string v1, "audio_input"

    .line 147
    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-nez v0, :cond_7

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_7
    move-object v6, v0

    .line 158
    :goto_4
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_9

    .line 163
    .line 164
    invoke-static {v6}, Leh/a;->y(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_9

    .line 169
    .line 170
    new-instance p1, Ljava/io/File;

    .line 171
    .line 172
    invoke-direct {p1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_8

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_8
    move-object v1, p1

    .line 187
    :goto_5
    new-instance v2, Lsf/e;

    .line 188
    .line 189
    invoke-direct {v2, v6, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_9

    .line 193
    .line 194
    :cond_9
    :try_start_1
    invoke-static {v3, v5}, Lwb/ho;->C6(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-eqz v0, :cond_a

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_a
    invoke-virtual {v5}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-eqz v0, :cond_b

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_b
    move-object v0, v1

    .line 209
    :goto_6
    const-string v4, "[\\\\/:*?\"<>|]"

    .line 210
    .line 211
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_c

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_c
    move-object v1, v0

    .line 245
    :goto_7
    new-instance v0, Ljava/io/File;

    .line 246
    .line 247
    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    const-string v6, "Hchat/audio_transform/input"

    .line 252
    .line 253
    invoke-direct {v0, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 257
    .line 258
    .line 259
    new-instance v4, Ljava/io/File;

    .line 260
    .line 261
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    new-instance v8, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-direct {v4, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p1, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 291
    .line 292
    .line 293
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 294
    if-eqz p1, :cond_e

    .line 295
    .line 296
    :try_start_2
    new-instance v0, Ljava/io/FileOutputStream;

    .line 297
    .line 298
    invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 299
    .line 300
    .line 301
    :try_start_3
    invoke-static {p1, v0}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 302
    .line 303
    .line 304
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 305
    .line 306
    .line 307
    :try_start_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    if-eqz p1, :cond_e

    .line 315
    .line 316
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 317
    .line 318
    .line 319
    move-result-wide v5

    .line 320
    const-wide/16 v7, 0x0

    .line 321
    .line 322
    cmp-long p1, v5, v7

    .line 323
    .line 324
    if-gtz p1, :cond_d

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_d
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    new-instance v0, Lsf/e;

    .line 332
    .line 333
    invoke-direct {v0, p1, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 334
    .line 335
    .line 336
    move-object v2, v0

    .line 337
    goto :goto_9

    .line 338
    :catchall_1
    move-exception v0

    .line 339
    goto :goto_8

    .line 340
    :catchall_2
    move-exception v1

    .line 341
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 342
    :catchall_3
    move-exception v3

    .line 343
    :try_start_7
    invoke-static {v0, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 344
    .line 345
    .line 346
    throw v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 347
    :goto_8
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 348
    :catchall_4
    move-exception v1

    .line 349
    :try_start_9
    invoke-static {p1, v0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 350
    .line 351
    .line 352
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 353
    :catchall_5
    :cond_e
    :goto_9
    if-eqz v2, :cond_14

    .line 354
    .line 355
    sget-object p1, Lwb/d;->c:Lwb/la;

    .line 356
    .line 357
    if-eqz p1, :cond_14

    .line 358
    .line 359
    iget-object v0, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 360
    .line 361
    iget-object v1, v2, Lsf/e;->h:Ljava/lang/Object;

    .line 362
    .line 363
    invoke-virtual {p1, v0, v1}, Lwb/la;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_f
    invoke-static {v3, v5}, Lwb/ho;->C6(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    if-eqz p1, :cond_10

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_10
    invoke-virtual {v5}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    if-eqz p1, :cond_11

    .line 379
    .line 380
    const/16 v0, 0x2f

    .line 381
    .line 382
    invoke-static {p1, v0, p1}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    const/16 v0, 0x3a

    .line 387
    .line 388
    invoke-static {p1, v0, p1}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    :cond_11
    if-nez v2, :cond_12

    .line 393
    .line 394
    goto :goto_a

    .line 395
    :cond_12
    move-object v6, v2

    .line 396
    :goto_a
    move-object p1, v6

    .line 397
    :goto_b
    sget-object v0, Lwb/d;->d:Lc9/d0;

    .line 398
    .line 399
    if-eqz v0, :cond_14

    .line 400
    .line 401
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    if-eqz v1, :cond_13

    .line 406
    .line 407
    const-string p1, "output"

    .line 408
    .line 409
    :cond_13
    invoke-virtual {v0, v5, p1}, Lc9/d0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    :cond_14
    :goto_c
    return-void
.end method

.method private final b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v1, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v2, v0, Ljava/lang/Integer;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v3

    .line 23
    :goto_0
    if-eqz v0, :cond_15

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const v2, 0x48435257    # 200009.36f

    .line 30
    .line 31
    .line 32
    if-eq v0, v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_c

    .line 35
    .line 36
    :cond_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-static {v2, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v4, v0, Ljava/lang/Integer;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    check-cast v0, Ljava/lang/Integer;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object v0, v3

    .line 54
    :goto_1
    if-eqz v0, :cond_15

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v4, -0x1

    .line 61
    if-eq v0, v4, :cond_3

    .line 62
    .line 63
    goto/16 :goto_c

    .line 64
    .line 65
    :cond_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x2

    .line 71
    invoke-static {v0, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    instance-of v0, p1, Landroid/content/Intent;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    check-cast p1, Landroid/content/Intent;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move-object p1, v3

    .line 83
    :goto_2
    if-eqz p1, :cond_15

    .line 84
    .line 85
    sget-object v0, Lwb/p;->d:Landroid/app/Activity;

    .line 86
    .line 87
    if-eqz v0, :cond_15

    .line 88
    .line 89
    new-instance v4, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_5

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_5
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    if-eqz v5, :cond_8

    .line 108
    .line 109
    invoke-virtual {v5}, Landroid/content/ClipData;->getItemCount()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    :goto_3
    if-lt v1, v6, :cond_6

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    :try_start_0
    invoke-virtual {v5, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-eqz v7, :cond_7

    .line 121
    .line 122
    invoke-virtual {v7}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    if-eqz v7, :cond_7

    .line 127
    .line 128
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    .line 131
    :catchall_0
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_8
    :goto_4
    const-string v1, "android.intent.extra.STREAM"

    .line 135
    .line 136
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    instance-of v5, v1, Landroid/net/Uri;

    .line 141
    .line 142
    if-eqz v5, :cond_9

    .line 143
    .line 144
    check-cast v1, Landroid/net/Uri;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_9
    move-object v1, v3

    .line 148
    :goto_5
    if-eqz v1, :cond_a

    .line 149
    .line 150
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    :cond_a
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    new-instance v4, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    :cond_b
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-eqz v5, :cond_14

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, Landroid/net/Uri;

    .line 181
    .line 182
    sget-object v6, Lwb/p;->a:Lwb/p;

    .line 183
    .line 184
    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    const-string v7, "content"

    .line 189
    .line 190
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-nez v6, :cond_c

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_c
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    and-int/2addr v6, v2

    .line 202
    if-nez v6, :cond_d

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_d
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-virtual {v6, v5, v2}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 210
    .line 211
    .line 212
    :catchall_1
    :goto_7
    sget-object v6, Lwb/p;->a:Lwb/p;

    .line 213
    .line 214
    const-string v6, "_"

    .line 215
    .line 216
    const-string v7, "file"

    .line 217
    .line 218
    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-eqz v7, :cond_f

    .line 227
    .line 228
    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    if-nez v7, :cond_e

    .line 233
    .line 234
    const-string v7, ""

    .line 235
    .line 236
    :cond_e
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-nez v8, :cond_f

    .line 241
    .line 242
    invoke-static {v7}, Leh/a;->y(Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    if-eqz v8, :cond_f

    .line 247
    .line 248
    goto/16 :goto_b

    .line 249
    .line 250
    :cond_f
    :try_start_2
    invoke-static {v0, v5}, Lwb/ho;->C6(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 254
    const-string v8, "reply_file"

    .line 255
    .line 256
    if-eqz v7, :cond_10

    .line 257
    .line 258
    goto :goto_8

    .line 259
    :cond_10
    :try_start_3
    invoke-virtual {v5}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    if-eqz v7, :cond_11

    .line 264
    .line 265
    goto :goto_8

    .line 266
    :cond_11
    move-object v7, v8

    .line 267
    :goto_8
    const-string v9, "[\\\\/:*?\"<>|]"

    .line 268
    .line 269
    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    invoke-virtual {v7, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-eqz v9, :cond_12

    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_12
    move-object v8, v7

    .line 303
    :goto_9
    new-instance v7, Ljava/io/File;

    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    const-string v10, "Hchat/auto_reply"

    .line 310
    .line 311
    invoke-direct {v7, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    .line 315
    .line 316
    .line 317
    new-instance v9, Ljava/io/File;

    .line 318
    .line 319
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 320
    .line 321
    .line 322
    move-result-wide v10

    .line 323
    new-instance v12, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    invoke-direct {v9, v7, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    invoke-virtual {v6, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 349
    .line 350
    .line 351
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 352
    if-eqz v5, :cond_13

    .line 353
    .line 354
    :try_start_4
    new-instance v6, Ljava/io/FileOutputStream;

    .line 355
    .line 356
    invoke-direct {v6, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 357
    .line 358
    .line 359
    :try_start_5
    invoke-static {v5, v6}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 360
    .line 361
    .line 362
    :try_start_6
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 363
    .line 364
    .line 365
    :try_start_7
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    if-eqz v5, :cond_13

    .line 377
    .line 378
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 379
    .line 380
    .line 381
    move-result-wide v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 382
    const-wide/16 v8, 0x0

    .line 383
    .line 384
    cmp-long v5, v5, v8

    .line 385
    .line 386
    if-lez v5, :cond_13

    .line 387
    .line 388
    goto :goto_b

    .line 389
    :catchall_2
    move-exception v6

    .line 390
    goto :goto_a

    .line 391
    :catchall_3
    move-exception v7

    .line 392
    :try_start_8
    throw v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 393
    :catchall_4
    move-exception v8

    .line 394
    :try_start_9
    invoke-static {v6, v7}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    throw v8
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 398
    :goto_a
    :try_start_a
    throw v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 399
    :catchall_5
    move-exception v7

    .line 400
    :try_start_b
    invoke-static {v5, v6}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 401
    .line 402
    .line 403
    throw v7
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 404
    :catchall_6
    :cond_13
    move-object v7, v3

    .line 405
    :goto_b
    if-eqz v7, :cond_b

    .line 406
    .line 407
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    goto/16 :goto_6

    .line 411
    .line 412
    :cond_14
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-nez v0, :cond_15

    .line 425
    .line 426
    sget-object v0, Lwb/p;->c:Lwb/dj;

    .line 427
    .line 428
    if-eqz v0, :cond_15

    .line 429
    .line 430
    invoke-virtual {v0, p1}, Lwb/dj;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    :cond_15
    :goto_c
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lba/f;->a:I

    .line 6
    .line 7
    const/4 v6, -0x1

    .line 8
    const/4 v8, 0x1

    .line 9
    const/4 v10, 0x0

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :sswitch_0
    invoke-direct/range {p0 .. p1}, Lba/f;->b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :sswitch_1
    invoke-direct/range {p0 .. p1}, Lba/f;->a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :sswitch_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object v0, Lp8/j;->a:Lp8/j;

    .line 29
    .line 30
    sget-object v6, Lp8/j;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    sget-object v11, Lp8/j;->d:Ljava/util/Map;

    .line 33
    .line 34
    sget-object v0, Lp8/j;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v0, Ljava/lang/Iterable;

    .line 44
    .line 45
    new-instance v12, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v13

    .line 54
    :cond_0
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v14

    .line 64
    move-object v0, v14

    .line 65
    check-cast v0, Lp8/i;

    .line 66
    .line 67
    iget-object v0, v0, Lp8/i;->g:Lfg/a;

    .line 68
    .line 69
    :try_start_0
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    new-instance v15, Lsf/f;

    .line 76
    .line 77
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object v0, v15

    .line 81
    :goto_1
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 82
    .line 83
    const/16 v16, 0x4

    .line 84
    .line 85
    instance-of v3, v0, Lsf/f;

    .line 86
    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    move-object v0, v15

    .line 90
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_0

    .line 100
    .line 101
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    const/16 v16, 0x4

    .line 106
    .line 107
    new-instance v0, La9/h;

    .line 108
    .line 109
    const/16 v3, 0x18

    .line 110
    .line 111
    invoke-direct {v0, v3}, La9/h;-><init>(I)V

    .line 112
    .line 113
    .line 114
    new-instance v3, Lc9/a0;

    .line 115
    .line 116
    const/16 v13, 0x16

    .line 117
    .line 118
    invoke-direct {v3, v0, v13}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 119
    .line 120
    .line 121
    invoke-static {v12, v3}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_3

    .line 130
    .line 131
    goto/16 :goto_1d

    .line 132
    .line 133
    :cond_3
    invoke-static {v2}, Lp8/j;->f(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Lp8/l;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    if-eqz v3, :cond_26

    .line 138
    .line 139
    iget-object v12, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 140
    .line 141
    if-eqz v12, :cond_26

    .line 142
    .line 143
    invoke-static {v10, v12}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    if-eqz v12, :cond_26

    .line 148
    .line 149
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 150
    .line 151
    if-eqz v2, :cond_4

    .line 152
    .line 153
    invoke-static {v8, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    goto :goto_2

    .line 158
    :cond_4
    const/4 v2, 0x0

    .line 159
    :goto_2
    instance-of v13, v2, Landroid/view/View;

    .line 160
    .line 161
    if-eqz v13, :cond_5

    .line 162
    .line 163
    check-cast v2, Landroid/view/View;

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_5
    const/4 v2, 0x0

    .line 167
    :goto_3
    invoke-interface {v11}, Ljava/util/Map;->clear()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 171
    .line 172
    .line 173
    new-instance v13, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_8

    .line 187
    .line 188
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    move-object v0, v15

    .line 193
    check-cast v0, Lp8/i;

    .line 194
    .line 195
    :try_start_1
    iget-object v0, v0, Lp8/i;->h:Lfg/l;

    .line 196
    .line 197
    invoke-interface {v0, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 204
    .line 205
    .line 206
    move/from16 v17, v8

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :catchall_1
    move-exception v0

    .line 210
    move/from16 v17, v8

    .line 211
    .line 212
    new-instance v8, Lsf/f;

    .line 213
    .line 214
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    move-object v0, v8

    .line 218
    :goto_5
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 219
    .line 220
    move/from16 v18, v10

    .line 221
    .line 222
    instance-of v10, v0, Lsf/f;

    .line 223
    .line 224
    if-eqz v10, :cond_6

    .line 225
    .line 226
    move-object v0, v8

    .line 227
    :cond_6
    check-cast v0, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_7

    .line 234
    .line 235
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    :cond_7
    move/from16 v8, v17

    .line 239
    .line 240
    move/from16 v10, v18

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_8
    move/from16 v17, v8

    .line 244
    .line 245
    move/from16 v18, v10

    .line 246
    .line 247
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_26

    .line 256
    .line 257
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    move-object v10, v0

    .line 262
    check-cast v10, Lp8/i;

    .line 263
    .line 264
    sget-object v0, Lp8/j;->a:Lp8/j;

    .line 265
    .line 266
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    iget v13, v10, Lp8/i;->b:I

    .line 270
    .line 271
    const-string v14, "add"

    .line 272
    .line 273
    const-class v15, Ljava/lang/CharSequence;

    .line 274
    .line 275
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 276
    .line 277
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    :try_start_2
    iget-object v0, v10, Lp8/i;->e:Lfg/a;

    .line 282
    .line 283
    if-eqz v0, :cond_9

    .line 284
    .line 285
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :catchall_2
    move-exception v0

    .line 293
    goto :goto_7

    .line 294
    :cond_9
    const/4 v0, 0x0

    .line 295
    goto :goto_8

    .line 296
    :goto_7
    new-instance v9, Lsf/f;

    .line 297
    .line 298
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    move-object v0, v9

    .line 302
    :goto_8
    nop

    .line 303
    instance-of v9, v0, Lsf/f;

    .line 304
    .line 305
    if-eqz v9, :cond_a

    .line 306
    .line 307
    const/4 v0, 0x0

    .line 308
    :cond_a
    check-cast v0, Ljava/lang/String;

    .line 309
    .line 310
    if-eqz v0, :cond_b

    .line 311
    .line 312
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    goto :goto_9

    .line 321
    :cond_b
    const/4 v0, 0x0

    .line 322
    :goto_9
    if-nez v0, :cond_c

    .line 323
    .line 324
    const-string v0, ""

    .line 325
    .line 326
    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 327
    .line 328
    .line 329
    move-result v9

    .line 330
    if-nez v9, :cond_d

    .line 331
    .line 332
    iget-object v0, v10, Lp8/i;->c:Ljava/lang/String;

    .line 333
    .line 334
    :cond_d
    move-object v9, v0

    .line 335
    iget v7, v10, Lp8/i;->d:I

    .line 336
    .line 337
    iget-object v10, v10, Lp8/i;->f:Ljava/lang/String;

    .line 338
    .line 339
    invoke-static {v13, v12}, Lp8/j;->b(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-eqz v0, :cond_e

    .line 344
    .line 345
    :try_start_3
    invoke-interface {v0, v9}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 346
    .line 347
    .line 348
    :catchall_3
    move-object/from16 v21, v2

    .line 349
    .line 350
    goto/16 :goto_1c

    .line 351
    .line 352
    :cond_e
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_10

    .line 357
    .line 358
    :cond_f
    move-object/from16 v21, v2

    .line 359
    .line 360
    :goto_a
    move/from16 v1, v18

    .line 361
    .line 362
    goto :goto_e

    .line 363
    :cond_10
    if-eqz v2, :cond_11

    .line 364
    .line 365
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-eqz v0, :cond_11

    .line 370
    .line 371
    :goto_b
    move-object/from16 p1, v0

    .line 372
    .line 373
    goto :goto_c

    .line 374
    :cond_11
    invoke-static {}, Lp8/j;->a()Landroid/app/Activity;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    if-eqz v0, :cond_f

    .line 379
    .line 380
    goto :goto_b

    .line 381
    :goto_c
    const-string v0, "raw"

    .line 382
    .line 383
    const-string v1, "drawable"

    .line 384
    .line 385
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    move-object/from16 v21, v2

    .line 390
    .line 391
    move/from16 v1, v18

    .line 392
    .line 393
    :goto_d
    const/4 v2, 0x2

    .line 394
    if-lt v1, v2, :cond_12

    .line 395
    .line 396
    goto :goto_a

    .line 397
    :cond_12
    aget-object v2, v0, v1

    .line 398
    .line 399
    move-object/from16 v22, v0

    .line 400
    .line 401
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    move/from16 v23, v1

    .line 406
    .line 407
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v0, v10, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_13

    .line 416
    .line 417
    move v1, v0

    .line 418
    goto :goto_e

    .line 419
    :cond_13
    add-int/lit8 v1, v23, 0x1

    .line 420
    .line 421
    move-object/from16 v0, v22

    .line 422
    .line 423
    goto :goto_d

    .line 424
    :goto_e
    if-nez v1, :cond_15

    .line 425
    .line 426
    :cond_14
    const/4 v0, 0x0

    .line 427
    goto/16 :goto_15

    .line 428
    .line 429
    :cond_15
    if-eqz v21, :cond_16

    .line 430
    .line 431
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    if-eqz v0, :cond_16

    .line 436
    .line 437
    :goto_f
    move-object v2, v0

    .line 438
    goto :goto_10

    .line 439
    :cond_16
    invoke-static {}, Lp8/j;->a()Landroid/app/Activity;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    if-eqz v0, :cond_14

    .line 444
    .line 445
    goto :goto_f

    .line 446
    :goto_10
    :try_start_4
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 447
    .line 448
    .line 449
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 450
    move-object/from16 p1, v2

    .line 451
    .line 452
    :try_start_5
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 457
    .line 458
    .line 459
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 460
    goto :goto_12

    .line 461
    :catchall_4
    move-exception v0

    .line 462
    goto :goto_11

    .line 463
    :catchall_5
    move-exception v0

    .line 464
    move-object/from16 p1, v2

    .line 465
    .line 466
    :goto_11
    new-instance v2, Lsf/f;

    .line 467
    .line 468
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 469
    .line 470
    .line 471
    move-object v0, v2

    .line 472
    :goto_12
    nop

    .line 473
    instance-of v2, v0, Lsf/f;

    .line 474
    .line 475
    if-eqz v2, :cond_17

    .line 476
    .line 477
    const/4 v0, 0x0

    .line 478
    :cond_17
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 479
    .line 480
    if-eqz v0, :cond_18

    .line 481
    .line 482
    goto :goto_15

    .line 483
    :cond_18
    :try_start_6
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 488
    .line 489
    .line 490
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 491
    :try_start_7
    invoke-static {v2, v10}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 492
    .line 493
    .line 494
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 495
    const/4 v10, 0x0

    .line 496
    :try_start_8
    invoke-static {v2, v10}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 497
    .line 498
    .line 499
    goto :goto_14

    .line 500
    :catchall_6
    move-exception v0

    .line 501
    goto :goto_13

    .line 502
    :catchall_7
    move-exception v0

    .line 503
    const/4 v10, 0x0

    .line 504
    move-object v10, v0

    .line 505
    :try_start_9
    throw v10
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 506
    :catchall_8
    move-exception v0

    .line 507
    :try_start_a
    invoke-static {v2, v10}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 508
    .line 509
    .line 510
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 511
    :goto_13
    new-instance v2, Lsf/f;

    .line 512
    .line 513
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 514
    .line 515
    .line 516
    move-object v0, v2

    .line 517
    :goto_14
    nop

    .line 518
    instance-of v2, v0, Lsf/f;

    .line 519
    .line 520
    if-eqz v2, :cond_19

    .line 521
    .line 522
    const/4 v0, 0x0

    .line 523
    :cond_19
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 524
    .line 525
    :goto_15
    if-eqz v0, :cond_1c

    .line 526
    .line 527
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 540
    .line 541
    .line 542
    move-result v10

    .line 543
    if-eqz v10, :cond_1b

    .line 544
    .line 545
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v10

    .line 549
    move-object/from16 v22, v10

    .line 550
    .line 551
    check-cast v22, Ljava/lang/reflect/Method;

    .line 552
    .line 553
    move-object/from16 p1, v2

    .line 554
    .line 555
    invoke-virtual/range {v22 .. v22}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    move/from16 v22, v7

    .line 560
    .line 561
    array-length v7, v2

    .line 562
    move-object/from16 v23, v2

    .line 563
    .line 564
    const/4 v2, 0x3

    .line 565
    if-ne v7, v2, :cond_1a

    .line 566
    .line 567
    aget-object v2, v23, v18

    .line 568
    .line 569
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    if-eqz v2, :cond_1a

    .line 574
    .line 575
    aget-object v2, v23, v17

    .line 576
    .line 577
    invoke-virtual {v15, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 578
    .line 579
    .line 580
    move-result v2

    .line 581
    if-eqz v2, :cond_1a

    .line 582
    .line 583
    const-class v2, Landroid/graphics/drawable/Drawable;

    .line 584
    .line 585
    const/16 v20, 0x2

    .line 586
    .line 587
    aget-object v7, v23, v20

    .line 588
    .line 589
    invoke-virtual {v2, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    if-eqz v2, :cond_1a

    .line 594
    .line 595
    goto :goto_17

    .line 596
    :cond_1a
    move-object/from16 v2, p1

    .line 597
    .line 598
    move/from16 v7, v22

    .line 599
    .line 600
    goto :goto_16

    .line 601
    :cond_1b
    move/from16 v22, v7

    .line 602
    .line 603
    const/4 v10, 0x0

    .line 604
    :goto_17
    check-cast v10, Ljava/lang/reflect/Method;

    .line 605
    .line 606
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    filled-new-array {v2, v9, v0}, [Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-static {v10, v12, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    if-eqz v2, :cond_1d

    .line 619
    .line 620
    invoke-static {v13, v12}, Lp8/j;->b(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    goto/16 :goto_1c

    .line 625
    .line 626
    :cond_1c
    move/from16 v22, v7

    .line 627
    .line 628
    :cond_1d
    if-eqz v1, :cond_20

    .line 629
    .line 630
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 643
    .line 644
    .line 645
    move-result v7

    .line 646
    if-eqz v7, :cond_1f

    .line 647
    .line 648
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v7

    .line 652
    move-object v10, v7

    .line 653
    check-cast v10, Ljava/lang/reflect/Method;

    .line 654
    .line 655
    move-object/from16 p1, v2

    .line 656
    .line 657
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v10

    .line 665
    move-object/from16 v23, v7

    .line 666
    .line 667
    const-string v7, "c"

    .line 668
    .line 669
    invoke-static {v10, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v7

    .line 673
    if-eqz v7, :cond_1e

    .line 674
    .line 675
    array-length v7, v2

    .line 676
    const/4 v10, 0x5

    .line 677
    if-ne v7, v10, :cond_1e

    .line 678
    .line 679
    aget-object v7, v2, v18

    .line 680
    .line 681
    invoke-static {v7, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    if-eqz v7, :cond_1e

    .line 686
    .line 687
    aget-object v7, v2, v17

    .line 688
    .line 689
    invoke-static {v7, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v7

    .line 693
    if-eqz v7, :cond_1e

    .line 694
    .line 695
    const/16 v20, 0x2

    .line 696
    .line 697
    aget-object v7, v2, v20

    .line 698
    .line 699
    invoke-static {v7, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    if-eqz v7, :cond_1e

    .line 704
    .line 705
    const/16 v19, 0x3

    .line 706
    .line 707
    aget-object v7, v2, v19

    .line 708
    .line 709
    invoke-virtual {v15, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 710
    .line 711
    .line 712
    move-result v7

    .line 713
    if-eqz v7, :cond_1e

    .line 714
    .line 715
    aget-object v2, v2, v16

    .line 716
    .line 717
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    move-result v2

    .line 721
    if-eqz v2, :cond_1e

    .line 722
    .line 723
    move-object/from16 v7, v23

    .line 724
    .line 725
    goto :goto_19

    .line 726
    :cond_1e
    move-object/from16 v2, p1

    .line 727
    .line 728
    goto :goto_18

    .line 729
    :cond_1f
    const/4 v7, 0x0

    .line 730
    :goto_19
    check-cast v7, Ljava/lang/reflect/Method;

    .line 731
    .line 732
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 737
    .line 738
    .line 739
    move-result-object v4

    .line 740
    filled-new-array {v5, v2, v5, v9, v4}, [Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    invoke-static {v7, v12, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-eqz v2, :cond_20

    .line 749
    .line 750
    invoke-static {v13, v12}, Lp8/j;->b(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    goto :goto_1c

    .line 755
    :cond_20
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    filled-new-array {v5, v2, v4, v9}, [Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    invoke-static {v12, v14, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    if-eqz v2, :cond_21

    .line 772
    .line 773
    goto :goto_1a

    .line 774
    :cond_21
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    filled-new-array {v5, v2, v4, v9}, [Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    invoke-static {v12, v14, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    :goto_1a
    instance-of v4, v2, Landroid/view/MenuItem;

    .line 791
    .line 792
    if-eqz v4, :cond_24

    .line 793
    .line 794
    if-eqz v0, :cond_22

    .line 795
    .line 796
    :try_start_b
    move-object v1, v2

    .line 797
    check-cast v1, Landroid/view/MenuItem;

    .line 798
    .line 799
    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 800
    .line 801
    .line 802
    goto :goto_1b

    .line 803
    :cond_22
    if-eqz v1, :cond_23

    .line 804
    .line 805
    move-object v0, v2

    .line 806
    check-cast v0, Landroid/view/MenuItem;

    .line 807
    .line 808
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 809
    .line 810
    .line 811
    :catchall_9
    :cond_23
    :goto_1b
    move-object v0, v2

    .line 812
    check-cast v0, Landroid/view/MenuItem;

    .line 813
    .line 814
    goto :goto_1c

    .line 815
    :cond_24
    invoke-static {v13, v12}, Lp8/j;->b(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    :goto_1c
    if-eqz v0, :cond_25

    .line 820
    .line 821
    move-object v1, v11

    .line 822
    check-cast v1, Ljava/util/Map;

    .line 823
    .line 824
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 832
    .line 833
    invoke-direct {v1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v6, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    :cond_25
    move-object/from16 v1, p0

    .line 840
    .line 841
    move-object/from16 v2, v21

    .line 842
    .line 843
    goto/16 :goto_6

    .line 844
    .line 845
    :cond_26
    :goto_1d
    return-void

    .line 846
    :sswitch_3
    move/from16 v18, v10

    .line 847
    .line 848
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    sget-object v1, Lp8/j;->a:Lp8/j;

    .line 852
    .line 853
    monitor-enter v1

    .line 854
    :try_start_c
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 855
    .line 856
    if-eqz v0, :cond_37

    .line 857
    .line 858
    array-length v3, v0

    .line 859
    move/from16 v10, v18

    .line 860
    .line 861
    :goto_1e
    if-ge v10, v3, :cond_29

    .line 862
    .line 863
    aget-object v4, v0, v10

    .line 864
    .line 865
    instance-of v5, v4, Landroid/view/MenuItem;

    .line 866
    .line 867
    if-eqz v5, :cond_27

    .line 868
    .line 869
    check-cast v4, Landroid/view/MenuItem;

    .line 870
    .line 871
    goto :goto_1f

    .line 872
    :catchall_a
    move-exception v0

    .line 873
    goto/16 :goto_27

    .line 874
    .line 875
    :cond_27
    const/4 v4, 0x0

    .line 876
    :goto_1f
    if-eqz v4, :cond_28

    .line 877
    .line 878
    goto :goto_20

    .line 879
    :cond_28
    add-int/lit8 v10, v10, 0x1

    .line 880
    .line 881
    goto :goto_1e

    .line 882
    :cond_29
    const/4 v4, 0x0

    .line 883
    :goto_20
    if-eqz v4, :cond_37

    .line 884
    .line 885
    sget-object v0, Lp8/j;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 886
    .line 887
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    check-cast v0, Ljava/lang/Iterable;

    .line 895
    .line 896
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    :cond_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    if-eqz v3, :cond_2b

    .line 905
    .line 906
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v3

    .line 910
    move-object v5, v3

    .line 911
    check-cast v5, Lp8/i;

    .line 912
    .line 913
    iget v5, v5, Lp8/i;->b:I

    .line 914
    .line 915
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 916
    .line 917
    .line 918
    move-result v6

    .line 919
    if-ne v5, v6, :cond_2a

    .line 920
    .line 921
    goto :goto_21

    .line 922
    :cond_2b
    const/4 v3, 0x0

    .line 923
    :goto_21
    check-cast v3, Lp8/i;

    .line 924
    .line 925
    if-eqz v3, :cond_36

    .line 926
    .line 927
    iget-object v0, v3, Lp8/i;->g:Lfg/a;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 928
    .line 929
    :try_start_d
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 933
    goto :goto_22

    .line 934
    :catchall_b
    move-exception v0

    .line 935
    :try_start_e
    new-instance v5, Lsf/f;

    .line 936
    .line 937
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 938
    .line 939
    .line 940
    move-object v0, v5

    .line 941
    :goto_22
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 942
    .line 943
    instance-of v6, v0, Lsf/f;

    .line 944
    .line 945
    if-eqz v6, :cond_2c

    .line 946
    .line 947
    move-object v0, v5

    .line 948
    :cond_2c
    check-cast v0, Ljava/lang/Boolean;

    .line 949
    .line 950
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 951
    .line 952
    .line 953
    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 954
    if-nez v0, :cond_2d

    .line 955
    .line 956
    monitor-exit v1

    .line 957
    goto/16 :goto_26

    .line 958
    .line 959
    :cond_2d
    :try_start_f
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 960
    .line 961
    .line 962
    move-result-wide v5

    .line 963
    sget-object v0, Lp8/j;->h:Ljava/lang/ref/WeakReference;

    .line 964
    .line 965
    if-eqz v0, :cond_2e

    .line 966
    .line 967
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    check-cast v0, Landroid/view/MenuItem;

    .line 972
    .line 973
    goto :goto_23

    .line 974
    :cond_2e
    const/4 v0, 0x0

    .line 975
    :goto_23
    if-ne v0, v4, :cond_2f

    .line 976
    .line 977
    sget-wide v7, Lp8/j;->i:J
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 978
    .line 979
    sub-long v7, v5, v7

    .line 980
    .line 981
    const-wide/16 v9, 0x5dc

    .line 982
    .line 983
    cmp-long v0, v7, v9

    .line 984
    .line 985
    if-gez v0, :cond_2f

    .line 986
    .line 987
    monitor-exit v1

    .line 988
    goto/16 :goto_26

    .line 989
    .line 990
    :cond_2f
    :try_start_10
    sget-object v0, Lp8/j;->d:Ljava/util/Map;

    .line 991
    .line 992
    invoke-interface {v0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v7

    .line 996
    check-cast v7, Lp8/l;

    .line 997
    .line 998
    if-eqz v7, :cond_30

    .line 999
    .line 1000
    goto :goto_25

    .line 1001
    :cond_30
    sget-object v7, Lp8/j;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1002
    .line 1003
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 1004
    .line 1005
    .line 1006
    move-result v8

    .line 1007
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v8

    .line 1011
    invoke-virtual {v7, v8}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v7

    .line 1015
    check-cast v7, Ljava/lang/ref/WeakReference;

    .line 1016
    .line 1017
    if-eqz v7, :cond_31

    .line 1018
    .line 1019
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v7

    .line 1023
    move-object v9, v7

    .line 1024
    check-cast v9, Lp8/l;

    .line 1025
    .line 1026
    goto :goto_24

    .line 1027
    :cond_31
    const/4 v9, 0x0

    .line 1028
    :goto_24
    if-eqz v9, :cond_32

    .line 1029
    .line 1030
    move-object v7, v9

    .line 1031
    goto :goto_25

    .line 1032
    :cond_32
    invoke-static {v2}, Lp8/j;->f(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Lp8/l;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v7

    .line 1036
    if-eqz v7, :cond_35

    .line 1037
    .line 1038
    :goto_25
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 1039
    .line 1040
    .line 1041
    sget-object v0, Lp8/j;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1042
    .line 1043
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 1044
    .line 1045
    .line 1046
    invoke-static {}, Lp8/j;->a()Landroid/app/Activity;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    if-eqz v0, :cond_34

    .line 1051
    .line 1052
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 1053
    .line 1054
    invoke-direct {v2, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1055
    .line 1056
    .line 1057
    sput-object v2, Lp8/j;->h:Ljava/lang/ref/WeakReference;

    .line 1058
    .line 1059
    sput-wide v5, Lp8/j;->i:J

    .line 1060
    .line 1061
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    if-eqz v2, :cond_33

    .line 1066
    .line 1067
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v2

    .line 1071
    if-eqz v2, :cond_33

    .line 1072
    .line 1073
    new-instance v4, Lac/l;

    .line 1074
    .line 1075
    const/16 v5, 0x19

    .line 1076
    .line 1077
    invoke-direct {v4, v0, v3, v7, v5}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v2, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 1081
    .line 1082
    .line 1083
    :cond_33
    monitor-exit v1

    .line 1084
    goto :goto_26

    .line 1085
    :cond_34
    monitor-exit v1

    .line 1086
    goto :goto_26

    .line 1087
    :cond_35
    monitor-exit v1

    .line 1088
    goto :goto_26

    .line 1089
    :cond_36
    monitor-exit v1

    .line 1090
    goto :goto_26

    .line 1091
    :cond_37
    monitor-exit v1

    .line 1092
    :goto_26
    return-void

    .line 1093
    :goto_27
    :try_start_11
    monitor-exit v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 1094
    throw v0

    .line 1095
    :sswitch_4
    move/from16 v17, v8

    .line 1096
    .line 1097
    move/from16 v18, v10

    .line 1098
    .line 1099
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    new-instance v0, Ljava/lang/Throwable;

    .line 1103
    .line 1104
    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    .line 1105
    .line 1106
    .line 1107
    new-instance v1, Ljava/io/StringWriter;

    .line 1108
    .line 1109
    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 1110
    .line 1111
    .line 1112
    new-instance v3, Ljava/io/PrintWriter;

    .line 1113
    .line 1114
    invoke-direct {v3, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v3}, Ljava/io/PrintWriter;->flush()V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1128
    .line 1129
    .line 1130
    const-string v1, "com.tencent.mm.pluginsdk.ui.chat"

    .line 1131
    .line 1132
    move/from16 v3, v18

    .line 1133
    .line 1134
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v0

    .line 1138
    xor-int/lit8 v0, v0, 0x1

    .line 1139
    .line 1140
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1145
    .line 1146
    .line 1147
    return-void

    .line 1148
    :sswitch_5
    move/from16 v17, v8

    .line 1149
    .line 1150
    move v3, v10

    .line 1151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1155
    .line 1156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    invoke-static {v3, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    instance-of v1, v0, Ljava/lang/Integer;

    .line 1164
    .line 1165
    if-eqz v1, :cond_38

    .line 1166
    .line 1167
    check-cast v0, Ljava/lang/Integer;

    .line 1168
    .line 1169
    goto :goto_28

    .line 1170
    :cond_38
    const/4 v0, 0x0

    .line 1171
    :goto_28
    if-eqz v0, :cond_40

    .line 1172
    .line 1173
    sget-object v1, Lk9/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1174
    .line 1175
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v3

    .line 1179
    check-cast v3, Lk9/h;

    .line 1180
    .line 1181
    if-eqz v3, :cond_40

    .line 1182
    .line 1183
    iget-object v4, v3, Lk9/h;->a:Ljava/lang/ref/WeakReference;

    .line 1184
    .line 1185
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v4

    .line 1189
    check-cast v4, Landroid/app/Activity;

    .line 1190
    .line 1191
    if-nez v4, :cond_39

    .line 1192
    .line 1193
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    goto :goto_2d

    .line 1197
    :cond_39
    iget-object v5, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1198
    .line 1199
    if-ne v5, v4, :cond_40

    .line 1200
    .line 1201
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v0

    .line 1205
    if-nez v0, :cond_3a

    .line 1206
    .line 1207
    goto :goto_2d

    .line 1208
    :cond_3a
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1209
    .line 1210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1211
    .line 1212
    .line 1213
    move/from16 v1, v17

    .line 1214
    .line 1215
    invoke-static {v1, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    instance-of v1, v0, Ljava/lang/Integer;

    .line 1220
    .line 1221
    if-eqz v1, :cond_3b

    .line 1222
    .line 1223
    check-cast v0, Ljava/lang/Integer;

    .line 1224
    .line 1225
    goto :goto_29

    .line 1226
    :cond_3b
    const/4 v0, 0x0

    .line 1227
    :goto_29
    if-eqz v0, :cond_40

    .line 1228
    .line 1229
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    iget-object v1, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1234
    .line 1235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1236
    .line 1237
    .line 1238
    const/4 v2, 0x2

    .line 1239
    invoke-static {v2, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v1

    .line 1243
    instance-of v2, v1, Landroid/content/Intent;

    .line 1244
    .line 1245
    if-eqz v2, :cond_3c

    .line 1246
    .line 1247
    check-cast v1, Landroid/content/Intent;

    .line 1248
    .line 1249
    goto :goto_2a

    .line 1250
    :cond_3c
    const/4 v1, 0x0

    .line 1251
    :goto_2a
    if-eqz v1, :cond_3d

    .line 1252
    .line 1253
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v9

    .line 1257
    goto :goto_2b

    .line 1258
    :cond_3d
    const/4 v9, 0x0

    .line 1259
    :goto_2b
    if-ne v0, v6, :cond_3f

    .line 1260
    .line 1261
    if-nez v9, :cond_3e

    .line 1262
    .line 1263
    goto :goto_2c

    .line 1264
    :cond_3e
    new-instance v6, Ljava/lang/Thread;

    .line 1265
    .line 1266
    new-instance v0, Lac/l;

    .line 1267
    .line 1268
    const/16 v5, 0x12

    .line 1269
    .line 1270
    move-object/from16 v1, p0

    .line 1271
    .line 1272
    move-object v2, v4

    .line 1273
    move-object v4, v9

    .line 1274
    invoke-direct/range {v0 .. v5}, Lac/l;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1275
    .line 1276
    .line 1277
    const-string v1, "Hchat-FloatingShortcutIcon"

    .line 1278
    .line 1279
    invoke-direct {v6, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 1283
    .line 1284
    .line 1285
    goto :goto_2d

    .line 1286
    :cond_3f
    :goto_2c
    iget-object v0, v3, Lk9/h;->c:Lwb/da;

    .line 1287
    .line 1288
    sget-object v1, Lk9/e;->a:Lk9/e;

    .line 1289
    .line 1290
    invoke-virtual {v0, v1}, Lwb/da;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    :cond_40
    :goto_2d
    return-void

    .line 1294
    :sswitch_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1295
    .line 1296
    .line 1297
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1298
    .line 1299
    instance-of v1, v0, Landroid/app/Activity;

    .line 1300
    .line 1301
    if-eqz v1, :cond_41

    .line 1302
    .line 1303
    move-object v9, v0

    .line 1304
    check-cast v9, Landroid/app/Activity;

    .line 1305
    .line 1306
    goto :goto_2e

    .line 1307
    :cond_41
    const/4 v9, 0x0

    .line 1308
    :goto_2e
    if-eqz v9, :cond_44

    .line 1309
    .line 1310
    sget-object v0, Lk9/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1311
    .line 1312
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1317
    .line 1318
    .line 1319
    check-cast v0, Ljava/lang/Iterable;

    .line 1320
    .line 1321
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    :cond_42
    :goto_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1326
    .line 1327
    .line 1328
    move-result v1

    .line 1329
    if-eqz v1, :cond_44

    .line 1330
    .line 1331
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    check-cast v1, Ljava/util/Map$Entry;

    .line 1336
    .line 1337
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    check-cast v2, Lk9/h;

    .line 1342
    .line 1343
    iget-object v2, v2, Lk9/h;->a:Ljava/lang/ref/WeakReference;

    .line 1344
    .line 1345
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v2

    .line 1349
    check-cast v2, Landroid/app/Activity;

    .line 1350
    .line 1351
    if-eqz v2, :cond_43

    .line 1352
    .line 1353
    if-ne v2, v9, :cond_42

    .line 1354
    .line 1355
    :cond_43
    sget-object v2, Lk9/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1356
    .line 1357
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v3

    .line 1361
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v1

    .line 1365
    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1366
    .line 1367
    .line 1368
    goto :goto_2f

    .line 1369
    :cond_44
    return-void

    .line 1370
    :sswitch_7
    if-eqz v2, :cond_45

    .line 1371
    .line 1372
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1373
    .line 1374
    if-eqz v0, :cond_45

    .line 1375
    .line 1376
    sput-object v0, Lj8/n;->e:Ljava/lang/Object;

    .line 1377
    .line 1378
    :cond_45
    return-void

    .line 1379
    :sswitch_8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1380
    .line 1381
    .line 1382
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1383
    .line 1384
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1385
    .line 1386
    .line 1387
    const/4 v3, 0x0

    .line 1388
    invoke-static {v3, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    instance-of v1, v0, Ljava/lang/Integer;

    .line 1393
    .line 1394
    if-eqz v1, :cond_46

    .line 1395
    .line 1396
    check-cast v0, Ljava/lang/Integer;

    .line 1397
    .line 1398
    goto :goto_30

    .line 1399
    :cond_46
    const/4 v0, 0x0

    .line 1400
    :goto_30
    if-eqz v0, :cond_4d

    .line 1401
    .line 1402
    sget-object v1, Ld9/f;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1403
    .line 1404
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    check-cast v0, Ld9/e;

    .line 1409
    .line 1410
    if-eqz v0, :cond_4d

    .line 1411
    .line 1412
    iget-object v1, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1413
    .line 1414
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1415
    .line 1416
    .line 1417
    const/4 v3, 0x1

    .line 1418
    invoke-static {v3, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v1

    .line 1422
    instance-of v3, v1, Ljava/lang/Integer;

    .line 1423
    .line 1424
    if-eqz v3, :cond_47

    .line 1425
    .line 1426
    check-cast v1, Ljava/lang/Integer;

    .line 1427
    .line 1428
    goto :goto_31

    .line 1429
    :cond_47
    const/4 v1, 0x0

    .line 1430
    :goto_31
    if-eqz v1, :cond_4d

    .line 1431
    .line 1432
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1433
    .line 1434
    .line 1435
    move-result v1

    .line 1436
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1437
    .line 1438
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    const/4 v3, 0x2

    .line 1442
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v2

    .line 1446
    instance-of v3, v2, Landroid/content/Intent;

    .line 1447
    .line 1448
    if-eqz v3, :cond_48

    .line 1449
    .line 1450
    check-cast v2, Landroid/content/Intent;

    .line 1451
    .line 1452
    goto :goto_32

    .line 1453
    :cond_48
    const/4 v2, 0x0

    .line 1454
    :goto_32
    if-eqz v2, :cond_49

    .line 1455
    .line 1456
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v9

    .line 1460
    goto :goto_33

    .line 1461
    :cond_49
    const/4 v9, 0x0

    .line 1462
    :goto_33
    if-ne v1, v6, :cond_4d

    .line 1463
    .line 1464
    if-nez v9, :cond_4a

    .line 1465
    .line 1466
    goto :goto_35

    .line 1467
    :cond_4a
    iget-object v1, v0, Ld9/e;->a:Landroid/app/Activity;

    .line 1468
    .line 1469
    invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v3

    .line 1473
    const-string v4, "content"

    .line 1474
    .line 1475
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1476
    .line 1477
    .line 1478
    move-result v3

    .line 1479
    if-nez v3, :cond_4b

    .line 1480
    .line 1481
    goto :goto_34

    .line 1482
    :cond_4b
    :try_start_12
    invoke-virtual {v2}, Landroid/content/Intent;->getFlags()I

    .line 1483
    .line 1484
    .line 1485
    move-result v2

    .line 1486
    and-int/lit8 v2, v2, 0x40

    .line 1487
    .line 1488
    if-eqz v2, :cond_4c

    .line 1489
    .line 1490
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v1

    .line 1494
    const/4 v3, 0x1

    .line 1495
    invoke-virtual {v1, v9, v3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 1496
    .line 1497
    .line 1498
    :catchall_c
    :cond_4c
    :goto_34
    new-instance v1, Ljava/lang/Thread;

    .line 1499
    .line 1500
    new-instance v2, La1/d;

    .line 1501
    .line 1502
    const/4 v3, 0x6

    .line 1503
    invoke-direct {v2, v0, v3, v9}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1504
    .line 1505
    .line 1506
    const-string v0, "Hchat-CustomAvatarSave"

    .line 1507
    .line 1508
    invoke-direct {v1, v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 1512
    .line 1513
    .line 1514
    :cond_4d
    :goto_35
    return-void

    .line 1515
    :sswitch_9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1516
    .line 1517
    .line 1518
    sget-object v0, Lc9/d2;->j:Ljava/lang/ThreadLocal;

    .line 1519
    .line 1520
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 1521
    .line 1522
    .line 1523
    return-void

    .line 1524
    :sswitch_a
    const/16 v16, 0x4

    .line 1525
    .line 1526
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1527
    .line 1528
    .line 1529
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 1530
    .line 1531
    const-class v1, Ljava/lang/Object;

    .line 1532
    .line 1533
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1534
    .line 1535
    if-eqz v0, :cond_4e

    .line 1536
    .line 1537
    const/4 v3, 0x0

    .line 1538
    invoke-static {v3, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    goto :goto_36

    .line 1543
    :cond_4e
    const/4 v0, 0x0

    .line 1544
    :goto_36
    instance-of v3, v0, Landroid/view/ContextMenu;

    .line 1545
    .line 1546
    if-eqz v3, :cond_4f

    .line 1547
    .line 1548
    check-cast v0, Landroid/view/ContextMenu;

    .line 1549
    .line 1550
    move-object v3, v0

    .line 1551
    goto :goto_37

    .line 1552
    :cond_4f
    const/4 v3, 0x0

    .line 1553
    :goto_37
    if-eqz v3, :cond_67

    .line 1554
    .line 1555
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1556
    .line 1557
    if-eqz v0, :cond_50

    .line 1558
    .line 1559
    const/4 v4, 0x1

    .line 1560
    invoke-static {v4, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    goto :goto_38

    .line 1565
    :cond_50
    const/4 v0, 0x0

    .line 1566
    :goto_38
    instance-of v4, v0, Landroid/view/View;

    .line 1567
    .line 1568
    if-eqz v4, :cond_51

    .line 1569
    .line 1570
    check-cast v0, Landroid/view/View;

    .line 1571
    .line 1572
    goto :goto_39

    .line 1573
    :cond_51
    const/4 v0, 0x0

    .line 1574
    :goto_39
    if-eqz v0, :cond_67

    .line 1575
    .line 1576
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v0

    .line 1580
    invoke-static {v0}, Lc9/d2;->l(Landroid/content/Context;)Landroid/app/Activity;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v4

    .line 1584
    if-eqz v4, :cond_67

    .line 1585
    .line 1586
    const-string v0, "Hchat_conversation_groups"

    .line 1587
    .line 1588
    invoke-static {v4, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    const-string v5, "enabled"

    .line 1593
    .line 1594
    const/4 v7, 0x0

    .line 1595
    invoke-interface {v0, v5, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1596
    .line 1597
    .line 1598
    move-result v0

    .line 1599
    if-nez v0, :cond_52

    .line 1600
    .line 1601
    goto/16 :goto_4a

    .line 1602
    .line 1603
    :cond_52
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1604
    .line 1605
    if-eqz v0, :cond_55

    .line 1606
    .line 1607
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v5

    .line 1611
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v5

    .line 1615
    invoke-static {v5}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v5

    .line 1619
    new-instance v8, Lb4/b;

    .line 1620
    .line 1621
    const/4 v10, 0x5

    .line 1622
    invoke-direct {v8, v10}, Lb4/b;-><init>(I)V

    .line 1623
    .line 1624
    .line 1625
    new-instance v9, Lng/i;

    .line 1626
    .line 1627
    invoke-direct {v9, v5, v7, v8}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1628
    .line 1629
    .line 1630
    new-instance v5, Lc9/k1;

    .line 1631
    .line 1632
    invoke-direct {v5, v0, v7}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 1633
    .line 1634
    .line 1635
    invoke-static {v9, v5}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v0

    .line 1639
    new-instance v5, Lb4/b;

    .line 1640
    .line 1641
    const/4 v7, 0x2

    .line 1642
    invoke-direct {v5, v7}, Lb4/b;-><init>(I)V

    .line 1643
    .line 1644
    .line 1645
    invoke-static {v0, v5}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    new-instance v5, Lng/h;

    .line 1650
    .line 1651
    invoke-direct {v5, v0}, Lng/h;-><init>(Lng/i;)V

    .line 1652
    .line 1653
    .line 1654
    :cond_53
    invoke-virtual {v5}, Lng/h;->hasNext()Z

    .line 1655
    .line 1656
    .line 1657
    move-result v0

    .line 1658
    if-eqz v0, :cond_54

    .line 1659
    .line 1660
    invoke-virtual {v5}, Lng/h;->next()Ljava/lang/Object;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v0

    .line 1664
    move-object v7, v0

    .line 1665
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1666
    .line 1667
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v8

    .line 1671
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 1672
    .line 1673
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v8

    .line 1677
    if-eqz v8, :cond_53

    .line 1678
    .line 1679
    const-string v8, "com.tencent.mm.ui.conversation."

    .line 1680
    .line 1681
    const/4 v9, 0x0

    .line 1682
    invoke-static {v7, v9, v8}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 1683
    .line 1684
    .line 1685
    move-result v7

    .line 1686
    if-eqz v7, :cond_53

    .line 1687
    .line 1688
    goto :goto_3a

    .line 1689
    :cond_54
    const/4 v0, 0x0

    .line 1690
    :goto_3a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1691
    .line 1692
    if-eqz v0, :cond_55

    .line 1693
    .line 1694
    new-instance v5, Lba/f;

    .line 1695
    .line 1696
    const/16 v7, 0x9

    .line 1697
    .line 1698
    invoke-direct {v5, v7}, Lba/f;-><init>(I)V

    .line 1699
    .line 1700
    .line 1701
    invoke-static {v0, v5}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1702
    .line 1703
    .line 1704
    move-result v0

    .line 1705
    goto :goto_3b

    .line 1706
    :cond_55
    const/4 v0, 0x0

    .line 1707
    :goto_3b
    if-nez v0, :cond_56

    .line 1708
    .line 1709
    goto/16 :goto_4a

    .line 1710
    .line 1711
    :cond_56
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1712
    .line 1713
    if-eqz v0, :cond_5a

    .line 1714
    .line 1715
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v2

    .line 1719
    if-eqz v2, :cond_5a

    .line 1720
    .line 1721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v5

    .line 1725
    :goto_3c
    if-eqz v5, :cond_5a

    .line 1726
    .line 1727
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1728
    .line 1729
    .line 1730
    move-result v7

    .line 1731
    if-nez v7, :cond_5a

    .line 1732
    .line 1733
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v7

    .line 1737
    invoke-static {v7}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v7

    .line 1741
    new-instance v8, Lb4/b;

    .line 1742
    .line 1743
    move/from16 v9, v16

    .line 1744
    .line 1745
    invoke-direct {v8, v9}, Lb4/b;-><init>(I)V

    .line 1746
    .line 1747
    .line 1748
    new-instance v10, Lng/i;

    .line 1749
    .line 1750
    const/4 v11, 0x1

    .line 1751
    invoke-direct {v10, v7, v11, v8}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1752
    .line 1753
    .line 1754
    new-instance v7, Lc9/k1;

    .line 1755
    .line 1756
    const/4 v8, 0x2

    .line 1757
    invoke-direct {v7, v0, v8}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 1758
    .line 1759
    .line 1760
    invoke-static {v10, v7}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v7

    .line 1764
    sget-object v8, Lc9/y1;->n:Lc9/y1;

    .line 1765
    .line 1766
    invoke-static {v7, v8}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v7

    .line 1770
    sget-object v8, Lc9/z1;->n:Lc9/z1;

    .line 1771
    .line 1772
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1773
    .line 1774
    .line 1775
    new-instance v10, Lng/i;

    .line 1776
    .line 1777
    invoke-direct {v10, v7, v11, v8}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1778
    .line 1779
    .line 1780
    invoke-static {v10}, Lng/m;->S(Lng/j;)Lng/c;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v7

    .line 1784
    invoke-virtual {v7}, Lng/c;->iterator()Ljava/util/Iterator;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v7

    .line 1788
    :cond_57
    move-object v8, v7

    .line 1789
    check-cast v8, Ltf/b;

    .line 1790
    .line 1791
    invoke-virtual {v8}, Ltf/b;->hasNext()Z

    .line 1792
    .line 1793
    .line 1794
    move-result v10

    .line 1795
    if-eqz v10, :cond_58

    .line 1796
    .line 1797
    invoke-virtual {v8}, Ltf/b;->next()Ljava/lang/Object;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v8

    .line 1801
    move-object v10, v8

    .line 1802
    check-cast v10, Ljava/lang/String;

    .line 1803
    .line 1804
    const-string v11, "SELECT username FROM rconversation WHERE username=? LIMIT 1"

    .line 1805
    .line 1806
    filled-new-array {v10}, [Ljava/lang/String;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v12

    .line 1810
    const-string v13, "username"

    .line 1811
    .line 1812
    invoke-virtual {v2, v11, v12, v13}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v11

    .line 1816
    invoke-static {v11, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1817
    .line 1818
    .line 1819
    move-result v10

    .line 1820
    if-eqz v10, :cond_57

    .line 1821
    .line 1822
    goto :goto_3d

    .line 1823
    :cond_58
    const/4 v8, 0x0

    .line 1824
    :goto_3d
    check-cast v8, Ljava/lang/String;

    .line 1825
    .line 1826
    if-eqz v8, :cond_59

    .line 1827
    .line 1828
    goto :goto_3e

    .line 1829
    :cond_59
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v5

    .line 1833
    move/from16 v16, v9

    .line 1834
    .line 1835
    goto :goto_3c

    .line 1836
    :cond_5a
    const/4 v8, 0x0

    .line 1837
    :goto_3e
    if-eqz v8, :cond_67

    .line 1838
    .line 1839
    const v2, 0x48434752    # 199965.28f

    .line 1840
    .line 1841
    .line 1842
    invoke-interface {v3, v2}, Landroid/view/Menu;->removeItem(I)V

    .line 1843
    .line 1844
    .line 1845
    const/4 v7, 0x0

    .line 1846
    :try_start_13
    invoke-interface {v3, v7}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v0

    .line 1850
    invoke-interface {v0}, Landroid/view/MenuItem;->getGroupId()I

    .line 1851
    .line 1852
    .line 1853
    move-result v0

    .line 1854
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_d

    .line 1858
    :goto_3f
    const/4 v7, 0x0

    .line 1859
    goto :goto_40

    .line 1860
    :catchall_d
    move-exception v0

    .line 1861
    new-instance v5, Lsf/f;

    .line 1862
    .line 1863
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1864
    .line 1865
    .line 1866
    move-object v0, v5

    .line 1867
    goto :goto_3f

    .line 1868
    :goto_40
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v5

    .line 1872
    instance-of v9, v0, Lsf/f;

    .line 1873
    .line 1874
    if-eqz v9, :cond_5b

    .line 1875
    .line 1876
    move-object v0, v5

    .line 1877
    :cond_5b
    check-cast v0, Ljava/lang/Number;

    .line 1878
    .line 1879
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1880
    .line 1881
    .line 1882
    move-result v0

    .line 1883
    const-string v5, "\u804a\u5929\u5206\u7ec4"

    .line 1884
    .line 1885
    invoke-interface {v3, v0, v2, v7, v5}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v0

    .line 1889
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1890
    .line 1891
    .line 1892
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v5

    .line 1896
    :goto_41
    if-eqz v5, :cond_66

    .line 1897
    .line 1898
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1899
    .line 1900
    .line 1901
    move-result v7

    .line 1902
    if-nez v7, :cond_66

    .line 1903
    .line 1904
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v7

    .line 1908
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v7

    .line 1912
    :cond_5c
    :goto_42
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1913
    .line 1914
    .line 1915
    move-result v9

    .line 1916
    if-eqz v9, :cond_65

    .line 1917
    .line 1918
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v9

    .line 1922
    check-cast v9, Ljava/lang/reflect/Field;

    .line 1923
    .line 1924
    const-class v10, Ljava/util/List;

    .line 1925
    .line 1926
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v11

    .line 1930
    invoke-virtual {v10, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1931
    .line 1932
    .line 1933
    move-result v10

    .line 1934
    if-nez v10, :cond_5d

    .line 1935
    .line 1936
    goto :goto_42

    .line 1937
    :cond_5d
    invoke-static {v9, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v9

    .line 1941
    invoke-static {v9}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 1942
    .line 1943
    .line 1944
    move-result v10

    .line 1945
    if-eqz v10, :cond_5e

    .line 1946
    .line 1947
    check-cast v9, Ljava/util/List;

    .line 1948
    .line 1949
    goto :goto_43

    .line 1950
    :cond_5e
    const/4 v9, 0x0

    .line 1951
    :goto_43
    if-eqz v9, :cond_5c

    .line 1952
    .line 1953
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v10

    .line 1957
    const/4 v11, 0x0

    .line 1958
    :goto_44
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1959
    .line 1960
    .line 1961
    move-result v12

    .line 1962
    if-eqz v12, :cond_63

    .line 1963
    .line 1964
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v12

    .line 1968
    if-eq v12, v0, :cond_61

    .line 1969
    .line 1970
    instance-of v13, v12, Landroid/view/MenuItem;

    .line 1971
    .line 1972
    if-eqz v13, :cond_5f

    .line 1973
    .line 1974
    check-cast v12, Landroid/view/MenuItem;

    .line 1975
    .line 1976
    goto :goto_45

    .line 1977
    :cond_5f
    const/4 v12, 0x0

    .line 1978
    :goto_45
    if-eqz v12, :cond_60

    .line 1979
    .line 1980
    invoke-interface {v12}, Landroid/view/MenuItem;->getItemId()I

    .line 1981
    .line 1982
    .line 1983
    move-result v12

    .line 1984
    if-ne v12, v2, :cond_60

    .line 1985
    .line 1986
    goto :goto_46

    .line 1987
    :cond_60
    const/4 v12, 0x0

    .line 1988
    goto :goto_47

    .line 1989
    :cond_61
    :goto_46
    const/4 v12, 0x1

    .line 1990
    :goto_47
    if-eqz v12, :cond_62

    .line 1991
    .line 1992
    goto :goto_48

    .line 1993
    :cond_62
    add-int/lit8 v11, v11, 0x1

    .line 1994
    .line 1995
    goto :goto_44

    .line 1996
    :cond_63
    move v11, v6

    .line 1997
    :goto_48
    if-lez v11, :cond_64

    .line 1998
    .line 1999
    :try_start_14
    invoke-interface {v9, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v10

    .line 2003
    const/4 v12, 0x0

    .line 2004
    invoke-interface {v9, v12, v10}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    .line 2005
    .line 2006
    .line 2007
    :catchall_e
    :cond_64
    if-ltz v11, :cond_5c

    .line 2008
    .line 2009
    goto :goto_49

    .line 2010
    :cond_65
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v5

    .line 2014
    goto :goto_41

    .line 2015
    :cond_66
    :goto_49
    sget-object v1, Lc9/d2;->f:Ljava/util/Map;

    .line 2016
    .line 2017
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2018
    .line 2019
    .line 2020
    check-cast v1, Ljava/util/Map;

    .line 2021
    .line 2022
    new-instance v2, Lc9/r1;

    .line 2023
    .line 2024
    invoke-direct {v2, v4, v8}, Lc9/r1;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2025
    .line 2026
    .line 2027
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    :cond_67
    :goto_4a
    return-void

    .line 2031
    :sswitch_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2032
    .line 2033
    .line 2034
    sget-object v0, Lc9/d2;->l:Ljava/lang/ThreadLocal;

    .line 2035
    .line 2036
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v0

    .line 2040
    check-cast v0, Lc9/u1;

    .line 2041
    .line 2042
    if-eqz v0, :cond_6f

    .line 2043
    .line 2044
    iget-object v1, v0, Lc9/u1;->b:Ljava/lang/String;

    .line 2045
    .line 2046
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2047
    .line 2048
    .line 2049
    move-result v3

    .line 2050
    if-nez v3, :cond_6f

    .line 2051
    .line 2052
    invoke-static {v1}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 2053
    .line 2054
    .line 2055
    move-result v3

    .line 2056
    if-eqz v3, :cond_68

    .line 2057
    .line 2058
    goto/16 :goto_50

    .line 2059
    .line 2060
    :cond_68
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2061
    .line 2062
    if-eqz v2, :cond_69

    .line 2063
    .line 2064
    const/4 v3, 0x0

    .line 2065
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v2

    .line 2069
    goto :goto_4b

    .line 2070
    :cond_69
    const/4 v2, 0x0

    .line 2071
    :goto_4b
    instance-of v3, v2, Landroid/view/ContextMenu;

    .line 2072
    .line 2073
    if-eqz v3, :cond_6a

    .line 2074
    .line 2075
    check-cast v2, Landroid/view/ContextMenu;

    .line 2076
    .line 2077
    goto :goto_4c

    .line 2078
    :cond_6a
    const/4 v2, 0x0

    .line 2079
    :goto_4c
    if-eqz v2, :cond_6f

    .line 2080
    .line 2081
    iget-object v3, v0, Lc9/u1;->a:Landroid/app/Activity;

    .line 2082
    .line 2083
    invoke-static {v3}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v3

    .line 2087
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v3

    .line 2091
    :cond_6b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2092
    .line 2093
    .line 2094
    move-result v4

    .line 2095
    if-eqz v4, :cond_6c

    .line 2096
    .line 2097
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v4

    .line 2101
    move-object v5, v4

    .line 2102
    check-cast v5, Lc9/a;

    .line 2103
    .line 2104
    iget-object v6, v5, Lc9/a;->a:Ljava/lang/String;

    .line 2105
    .line 2106
    iget-object v7, v0, Lc9/u1;->c:Ljava/lang/String;

    .line 2107
    .line 2108
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2109
    .line 2110
    .line 2111
    move-result v6

    .line 2112
    if-eqz v6, :cond_6b

    .line 2113
    .line 2114
    iget-object v5, v5, Lc9/a;->e:Ljava/util/List;

    .line 2115
    .line 2116
    invoke-interface {v5, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2117
    .line 2118
    .line 2119
    move-result v5

    .line 2120
    if-eqz v5, :cond_6b

    .line 2121
    .line 2122
    move-object v9, v4

    .line 2123
    goto :goto_4d

    .line 2124
    :cond_6c
    const/4 v9, 0x0

    .line 2125
    :goto_4d
    check-cast v9, Lc9/a;

    .line 2126
    .line 2127
    if-eqz v9, :cond_6f

    .line 2128
    .line 2129
    const v3, 0x48434760    # 199965.5f

    .line 2130
    .line 2131
    .line 2132
    invoke-interface {v2, v3}, Landroid/view/Menu;->removeItem(I)V

    .line 2133
    .line 2134
    .line 2135
    const v4, 0x48434761    # 199965.52f

    .line 2136
    .line 2137
    .line 2138
    invoke-interface {v2, v4}, Landroid/view/Menu;->removeItem(I)V

    .line 2139
    .line 2140
    .line 2141
    const v5, 0x48434762    # 199965.53f

    .line 2142
    .line 2143
    .line 2144
    invoke-interface {v2, v5}, Landroid/view/Menu;->removeItem(I)V

    .line 2145
    .line 2146
    .line 2147
    invoke-interface {v2}, Landroid/view/Menu;->size()I

    .line 2148
    .line 2149
    .line 2150
    move-result v6

    .line 2151
    const-string v7, "\u79fb\u51fa"

    .line 2152
    .line 2153
    const/4 v12, 0x0

    .line 2154
    invoke-interface {v2, v12, v3, v6, v7}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v3

    .line 2158
    invoke-interface {v2}, Landroid/view/Menu;->size()I

    .line 2159
    .line 2160
    .line 2161
    move-result v6

    .line 2162
    const-string v7, "\u79fb\u81f3"

    .line 2163
    .line 2164
    invoke-interface {v2, v12, v4, v6, v7}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v4

    .line 2168
    iget-object v6, v9, Lc9/a;->f:Ljava/util/List;

    .line 2169
    .line 2170
    invoke-interface {v6, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2171
    .line 2172
    .line 2173
    move-result v1

    .line 2174
    invoke-interface {v2}, Landroid/view/Menu;->size()I

    .line 2175
    .line 2176
    .line 2177
    move-result v6

    .line 2178
    if-eqz v1, :cond_6d

    .line 2179
    .line 2180
    const-string v7, "\u53d6\u6d88\u7f6e\u9876"

    .line 2181
    .line 2182
    goto :goto_4e

    .line 2183
    :cond_6d
    const-string v7, "\u7f6e\u9876\u804a\u5929"

    .line 2184
    .line 2185
    :goto_4e
    invoke-interface {v2, v12, v5, v6, v7}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v2

    .line 2189
    sget-object v5, Lc9/d2;->g:Ljava/util/Map;

    .line 2190
    .line 2191
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2192
    .line 2193
    .line 2194
    check-cast v5, Ljava/util/Map;

    .line 2195
    .line 2196
    new-instance v6, Lc9/x1;

    .line 2197
    .line 2198
    sget-object v7, Lc9/v1;->g:Lc9/v1;

    .line 2199
    .line 2200
    invoke-direct {v6, v0, v7}, Lc9/x1;-><init>(Lc9/u1;Lc9/v1;)V

    .line 2201
    .line 2202
    .line 2203
    invoke-interface {v5, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2204
    .line 2205
    .line 2206
    new-instance v3, Lc9/x1;

    .line 2207
    .line 2208
    sget-object v6, Lc9/v1;->h:Lc9/v1;

    .line 2209
    .line 2210
    invoke-direct {v3, v0, v6}, Lc9/x1;-><init>(Lc9/u1;Lc9/v1;)V

    .line 2211
    .line 2212
    .line 2213
    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2214
    .line 2215
    .line 2216
    new-instance v3, Lc9/x1;

    .line 2217
    .line 2218
    if-eqz v1, :cond_6e

    .line 2219
    .line 2220
    sget-object v1, Lc9/v1;->j:Lc9/v1;

    .line 2221
    .line 2222
    goto :goto_4f

    .line 2223
    :cond_6e
    sget-object v1, Lc9/v1;->i:Lc9/v1;

    .line 2224
    .line 2225
    :goto_4f
    invoke-direct {v3, v0, v1}, Lc9/x1;-><init>(Lc9/u1;Lc9/v1;)V

    .line 2226
    .line 2227
    .line 2228
    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2229
    .line 2230
    .line 2231
    :cond_6f
    :goto_50
    return-void

    .line 2232
    :sswitch_c
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2233
    .line 2234
    .line 2235
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2236
    .line 2237
    instance-of v1, v0, Landroid/app/Activity;

    .line 2238
    .line 2239
    if-eqz v1, :cond_70

    .line 2240
    .line 2241
    move-object v9, v0

    .line 2242
    check-cast v9, Landroid/app/Activity;

    .line 2243
    .line 2244
    goto :goto_51

    .line 2245
    :cond_70
    const/4 v9, 0x0

    .line 2246
    :goto_51
    if-eqz v9, :cond_73

    .line 2247
    .line 2248
    sget-object v0, Lc9/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2249
    .line 2250
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 2251
    .line 2252
    .line 2253
    move-result-object v0

    .line 2254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2255
    .line 2256
    .line 2257
    check-cast v0, Ljava/lang/Iterable;

    .line 2258
    .line 2259
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v0

    .line 2263
    :cond_71
    :goto_52
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2264
    .line 2265
    .line 2266
    move-result v1

    .line 2267
    if-eqz v1, :cond_73

    .line 2268
    .line 2269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v1

    .line 2273
    check-cast v1, Ljava/util/Map$Entry;

    .line 2274
    .line 2275
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v2

    .line 2279
    check-cast v2, Lc9/d;

    .line 2280
    .line 2281
    iget-object v2, v2, Lc9/d;->a:Ljava/lang/ref/WeakReference;

    .line 2282
    .line 2283
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2284
    .line 2285
    .line 2286
    move-result-object v2

    .line 2287
    check-cast v2, Landroid/app/Activity;

    .line 2288
    .line 2289
    if-eqz v2, :cond_72

    .line 2290
    .line 2291
    if-ne v2, v9, :cond_71

    .line 2292
    .line 2293
    :cond_72
    sget-object v2, Lc9/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2294
    .line 2295
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v3

    .line 2299
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2300
    .line 2301
    .line 2302
    move-result-object v1

    .line 2303
    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2304
    .line 2305
    .line 2306
    goto :goto_52

    .line 2307
    :cond_73
    return-void

    .line 2308
    :sswitch_d
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2309
    .line 2310
    .line 2311
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2312
    .line 2313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2314
    .line 2315
    .line 2316
    const/4 v3, 0x0

    .line 2317
    invoke-static {v3, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v0

    .line 2321
    instance-of v1, v0, Ljava/lang/Integer;

    .line 2322
    .line 2323
    if-eqz v1, :cond_74

    .line 2324
    .line 2325
    check-cast v0, Ljava/lang/Integer;

    .line 2326
    .line 2327
    goto :goto_53

    .line 2328
    :cond_74
    const/4 v0, 0x0

    .line 2329
    :goto_53
    if-eqz v0, :cond_7c

    .line 2330
    .line 2331
    sget-object v1, Lba/g;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2332
    .line 2333
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2334
    .line 2335
    .line 2336
    move-result-object v0

    .line 2337
    check-cast v0, Lba/d;

    .line 2338
    .line 2339
    if-eqz v0, :cond_7c

    .line 2340
    .line 2341
    iget-object v1, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2342
    .line 2343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2344
    .line 2345
    .line 2346
    const/4 v3, 0x1

    .line 2347
    invoke-static {v3, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v1

    .line 2351
    instance-of v3, v1, Ljava/lang/Integer;

    .line 2352
    .line 2353
    if-eqz v3, :cond_75

    .line 2354
    .line 2355
    check-cast v1, Ljava/lang/Integer;

    .line 2356
    .line 2357
    goto :goto_54

    .line 2358
    :cond_75
    const/4 v1, 0x0

    .line 2359
    :goto_54
    if-eqz v1, :cond_7c

    .line 2360
    .line 2361
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2362
    .line 2363
    .line 2364
    move-result v1

    .line 2365
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2366
    .line 2367
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2368
    .line 2369
    .line 2370
    const/4 v3, 0x2

    .line 2371
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v2

    .line 2375
    instance-of v3, v2, Landroid/content/Intent;

    .line 2376
    .line 2377
    if-eqz v3, :cond_76

    .line 2378
    .line 2379
    check-cast v2, Landroid/content/Intent;

    .line 2380
    .line 2381
    goto :goto_55

    .line 2382
    :cond_76
    const/4 v2, 0x0

    .line 2383
    :goto_55
    if-eqz v2, :cond_77

    .line 2384
    .line 2385
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 2386
    .line 2387
    .line 2388
    move-result-object v9

    .line 2389
    goto :goto_56

    .line 2390
    :cond_77
    const/4 v9, 0x0

    .line 2391
    :goto_56
    if-ne v1, v6, :cond_7b

    .line 2392
    .line 2393
    if-nez v9, :cond_78

    .line 2394
    .line 2395
    goto :goto_58

    .line 2396
    :cond_78
    iget-object v1, v0, Lba/d;->a:Landroid/app/Activity;

    .line 2397
    .line 2398
    invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v3

    .line 2402
    const-string v4, "content"

    .line 2403
    .line 2404
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2405
    .line 2406
    .line 2407
    move-result v3

    .line 2408
    if-nez v3, :cond_79

    .line 2409
    .line 2410
    goto :goto_57

    .line 2411
    :cond_79
    :try_start_15
    invoke-virtual {v2}, Landroid/content/Intent;->getFlags()I

    .line 2412
    .line 2413
    .line 2414
    move-result v2

    .line 2415
    and-int/lit8 v2, v2, 0x40

    .line 2416
    .line 2417
    if-eqz v2, :cond_7a

    .line 2418
    .line 2419
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2420
    .line 2421
    .line 2422
    move-result-object v1

    .line 2423
    const/4 v3, 0x1

    .line 2424
    invoke-virtual {v1, v9, v3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_f

    .line 2425
    .line 2426
    .line 2427
    :catchall_f
    :cond_7a
    :goto_57
    new-instance v1, Ljava/lang/Thread;

    .line 2428
    .line 2429
    new-instance v2, La1/d;

    .line 2430
    .line 2431
    const/4 v3, 0x3

    .line 2432
    invoke-direct {v2, v0, v3, v9}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2433
    .line 2434
    .line 2435
    const-string v0, "Hchat-MessageBubbleSave"

    .line 2436
    .line 2437
    invoke-direct {v1, v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 2438
    .line 2439
    .line 2440
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 2441
    .line 2442
    .line 2443
    goto :goto_59

    .line 2444
    :cond_7b
    :goto_58
    iget-object v0, v0, Lba/d;->c:Lwb/dj;

    .line 2445
    .line 2446
    sget-object v1, Lba/b;->h:Lba/b;

    .line 2447
    .line 2448
    invoke-virtual {v0, v1}, Lwb/dj;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2449
    .line 2450
    .line 2451
    :cond_7c
    :goto_59
    return-void

    .line 2452
    nop

    .line 2453
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_d
        0x1 -> :sswitch_c
        0x4 -> :sswitch_b
        0x5 -> :sswitch_a
        0x7 -> :sswitch_9
        0xc -> :sswitch_8
        0xe -> :sswitch_7
        0xf -> :sswitch_6
        0x10 -> :sswitch_5
        0x13 -> :sswitch_4
        0x14 -> :sswitch_3
        0x15 -> :sswitch_2
        0x1c -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    iget v0, p0, Lba/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI"

    .line 5
    .line 6
    const-class v3, Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v4, 0x6

    .line 9
    const-string v5, "Hchat"

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    array-length v1, v0

    .line 26
    const/4 v2, 0x4

    .line 27
    if-ge v1, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x3

    .line 31
    aget-object v0, v0, v1

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget-object v1, Lwa/j;->b:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    sget-object p1, Lwa/j;->a:Lwa/g;

    .line 48
    .line 49
    :cond_2
    :goto_0
    return-void

    .line 50
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 54
    .line 55
    instance-of v1, v0, Landroid/app/Activity;

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    check-cast v0, Landroid/app/Activity;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move-object v0, v7

    .line 63
    :goto_1
    if-eqz v0, :cond_7

    .line 64
    .line 65
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v6, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_7

    .line 75
    .line 76
    invoke-static {v1}, Luf/d;->J(Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "hchat_profile_id"

    .line 81
    .line 82
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    sget-object v1, Lva/b;->h:Lva/b;

    .line 90
    .line 91
    invoke-static {v0, v1}, Luf/d;->K(Landroid/app/Activity;Lva/b;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-eqz v1, :cond_7

    .line 96
    .line 97
    const-string v2, "clipboard"

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    instance-of v3, v2, Landroid/content/ClipboardManager;

    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    move-object v7, v2

    .line 108
    check-cast v7, Landroid/content/ClipboardManager;

    .line 109
    .line 110
    :cond_5
    if-eqz v7, :cond_6

    .line 111
    .line 112
    const-string v2, "ID"

    .line 113
    .line 114
    invoke-static {v2, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v7, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 119
    .line 120
    .line 121
    :cond_6
    const-string v1, "\u5df2\u590d\u5236ID"

    .line 122
    .line 123
    invoke-static {v0, v1, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 128
    .line 129
    .line 130
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_7
    :goto_2
    return-void

    .line 136
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_4
    :try_start_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Landroid/app/Activity;

    .line 150
    .line 151
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 152
    .line 153
    aget-object p1, p1, v8

    .line 154
    .line 155
    check-cast p1, Landroid/content/Intent;

    .line 156
    .line 157
    if-eqz p1, :cond_8

    .line 158
    .line 159
    invoke-virtual {p1, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_8

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v7, v8}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    .line 171
    :catchall_0
    :cond_8
    return-void

    .line 172
    :pswitch_5
    :try_start_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p1, Landroid/app/Activity;

    .line 175
    .line 176
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-eqz v0, :cond_9

    .line 181
    .line 182
    invoke-virtual {v0, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_9

    .line 187
    .line 188
    new-instance v0, Landroid/os/Handler;

    .line 189
    .line 190
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 195
    .line 196
    .line 197
    new-instance v1, Lh/Hchat/crash/d;

    .line 198
    .line 199
    invoke-direct {v1, p0, p1}, Lh/Hchat/crash/d;-><init>(Lba/f;Landroid/app/Activity;)V

    .line 200
    .line 201
    .line 202
    const-wide/16 v2, 0x1f4

    .line 203
    .line 204
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 205
    .line 206
    .line 207
    :catchall_1
    :cond_9
    return-void

    .line 208
    :pswitch_6
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 209
    .line 210
    aget-object v0, v0, v8

    .line 211
    .line 212
    check-cast v0, Ljava/lang/Integer;

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    const v1, -0x48435854

    .line 219
    .line 220
    .line 221
    if-ne v0, v1, :cond_a

    .line 222
    .line 223
    invoke-virtual {p1, v5}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :cond_a
    return-void

    .line 227
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 231
    .line 232
    if-eqz p1, :cond_b

    .line 233
    .line 234
    invoke-static {p1}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    goto :goto_3

    .line 239
    :cond_b
    move-object p1, v7

    .line 240
    :goto_3
    instance-of v0, p1, Landroid/widget/Button;

    .line 241
    .line 242
    if-eqz v0, :cond_c

    .line 243
    .line 244
    move-object v7, p1

    .line 245
    check-cast v7, Landroid/widget/Button;

    .line 246
    .line 247
    :cond_c
    if-eqz v7, :cond_d

    .line 248
    .line 249
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-eqz p1, :cond_d

    .line 254
    .line 255
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 256
    .line 257
    .line 258
    :cond_d
    return-void

    .line 259
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 263
    .line 264
    instance-of v1, v0, Landroid/app/Activity;

    .line 265
    .line 266
    if-eqz v1, :cond_e

    .line 267
    .line 268
    check-cast v0, Landroid/app/Activity;

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_e
    move-object v0, v7

    .line 272
    :goto_4
    if-eqz v0, :cond_15

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    const-string v2, "hchat_silent_repeat"

    .line 279
    .line 280
    invoke-virtual {v1, v2, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-nez v1, :cond_f

    .line 285
    .line 286
    goto/16 :goto_8

    .line 287
    .line 288
    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const-string v3, "Select_Conv_User"

    .line 298
    .line 299
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    if-eqz v2, :cond_14

    .line 304
    .line 305
    new-array v3, v6, [C

    .line 306
    .line 307
    const/16 v5, 0x2c

    .line 308
    .line 309
    aput-char v5, v3, v8

    .line 310
    .line 311
    invoke-static {v2, v3, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    new-instance v3, Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-eqz v4, :cond_10

    .line 333
    .line 334
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    check-cast v4, Ljava/lang/String;

    .line 339
    .line 340
    invoke-static {v4, v3}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 341
    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_10
    new-instance v2, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    :cond_11
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    if-eqz v4, :cond_13

    .line 358
    .line 359
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    move-object v5, v4

    .line 364
    check-cast v5, Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    if-lez v5, :cond_12

    .line 371
    .line 372
    move v5, v6

    .line 373
    goto :goto_7

    .line 374
    :cond_12
    move v5, v8

    .line 375
    :goto_7
    if-eqz v5, :cond_11

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_13
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 382
    .line 383
    .line 384
    :cond_14
    new-instance v2, Landroid/content/Intent;

    .line 385
    .line 386
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 387
    .line 388
    .line 389
    const-string v3, "SendMsgUsernames"

    .line 390
    .line 391
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 392
    .line 393
    .line 394
    const-string v1, "sendResult"

    .line 395
    .line 396
    invoke-virtual {v2, v1, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 397
    .line 398
    .line 399
    const/4 v1, -0x1

    .line 400
    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    :cond_15
    :goto_8
    return-void

    .line 410
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    sget-object v0, Le9/q;->l:Ljava/lang/ThreadLocal;

    .line 414
    .line 415
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Ljava/util/ArrayDeque;

    .line 420
    .line 421
    if-eqz v0, :cond_16

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 428
    .line 429
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v8

    .line 433
    :cond_16
    if-nez v8, :cond_17

    .line 434
    .line 435
    goto :goto_9

    .line 436
    :cond_17
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    :goto_9
    return-void

    .line 440
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 444
    .line 445
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 446
    .line 447
    if-nez v0, :cond_18

    .line 448
    .line 449
    goto :goto_b

    .line 450
    :cond_18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    :goto_a
    if-eqz v5, :cond_1b

    .line 455
    .line 456
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v9

    .line 460
    if-nez v9, :cond_1b

    .line 461
    .line 462
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v9

    .line 466
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    :cond_19
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 471
    .line 472
    .line 473
    move-result v10

    .line 474
    if-eqz v10, :cond_1a

    .line 475
    .line 476
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v10

    .line 480
    check-cast v10, Ljava/lang/reflect/Field;

    .line 481
    .line 482
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    move-result-object v11

    .line 486
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v11

    .line 490
    invoke-virtual {v11, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v11

    .line 494
    if-eqz v11, :cond_19

    .line 495
    .line 496
    invoke-static {v10, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    goto :goto_c

    .line 501
    :cond_1a
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    goto :goto_a

    .line 506
    :cond_1b
    :goto_b
    move-object v0, v7

    .line 507
    :goto_c
    if-eqz v0, :cond_25

    .line 508
    .line 509
    sget-object v2, Lc9/d2;->a:Lc9/d2;

    .line 510
    .line 511
    invoke-static {v0}, Lc9/d2;->v(Ljava/lang/Object;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    if-eqz v2, :cond_25

    .line 516
    .line 517
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 518
    .line 519
    if-eqz v2, :cond_1c

    .line 520
    .line 521
    invoke-static {v8, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    goto :goto_d

    .line 526
    :cond_1c
    move-object v2, v7

    .line 527
    :goto_d
    instance-of v3, v2, Landroid/widget/AdapterView;

    .line 528
    .line 529
    if-eqz v3, :cond_1d

    .line 530
    .line 531
    check-cast v2, Landroid/widget/AdapterView;

    .line 532
    .line 533
    goto :goto_e

    .line 534
    :cond_1d
    move-object v2, v7

    .line 535
    :goto_e
    if-eqz v2, :cond_25

    .line 536
    .line 537
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 538
    .line 539
    if-eqz v3, :cond_1e

    .line 540
    .line 541
    invoke-static {v6, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    goto :goto_f

    .line 546
    :cond_1e
    move-object v3, v7

    .line 547
    :goto_f
    instance-of v5, v3, Landroid/view/View;

    .line 548
    .line 549
    if-eqz v5, :cond_1f

    .line 550
    .line 551
    check-cast v3, Landroid/view/View;

    .line 552
    .line 553
    goto :goto_10

    .line 554
    :cond_1f
    move-object v3, v7

    .line 555
    :goto_10
    if-eqz v3, :cond_25

    .line 556
    .line 557
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 558
    .line 559
    if-eqz v5, :cond_20

    .line 560
    .line 561
    invoke-static {v1, v5}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    goto :goto_11

    .line 566
    :cond_20
    move-object v1, v7

    .line 567
    :goto_11
    instance-of v5, v1, Ljava/lang/Integer;

    .line 568
    .line 569
    if-eqz v5, :cond_21

    .line 570
    .line 571
    check-cast v1, Ljava/lang/Integer;

    .line 572
    .line 573
    goto :goto_12

    .line 574
    :cond_21
    move-object v1, v7

    .line 575
    :goto_12
    if-eqz v1, :cond_25

    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    :try_start_2
    invoke-virtual {v2, v1}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 585
    goto :goto_13

    .line 586
    :catchall_2
    move-exception v1

    .line 587
    new-instance v2, Lsf/f;

    .line 588
    .line 589
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 590
    .line 591
    .line 592
    move-object v1, v2

    .line 593
    :goto_13
    nop

    .line 594
    instance-of v2, v1, Lsf/f;

    .line 595
    .line 596
    if-eqz v2, :cond_22

    .line 597
    .line 598
    move-object v1, v7

    .line 599
    :cond_22
    if-eqz v1, :cond_25

    .line 600
    .line 601
    sget-object v2, Lc9/d2;->a:Lc9/d2;

    .line 602
    .line 603
    invoke-static {v1}, Lc9/d2;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    invoke-static {v3}, Lc9/d2;->l(Landroid/content/Context;)Landroid/app/Activity;

    .line 612
    .line 613
    .line 614
    move-result-object v3

    .line 615
    if-eqz v3, :cond_25

    .line 616
    .line 617
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    if-eqz v2, :cond_24

    .line 621
    .line 622
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 623
    .line 624
    .line 625
    move-result p1

    .line 626
    if-eqz p1, :cond_23

    .line 627
    .line 628
    goto :goto_14

    .line 629
    :cond_23
    sget-object p1, Lc9/d2;->n:Landroid/os/Handler;

    .line 630
    .line 631
    new-instance v1, Lac/l;

    .line 632
    .line 633
    invoke-direct {v1, v3, v0, v2, v4}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 637
    .line 638
    .line 639
    goto :goto_15

    .line 640
    :cond_24
    :goto_14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    const-string v0, "[Hchat:ConversationGroup] \u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u5217\u8868\u65e0\u6cd5\u89e3\u6790\u4f1a\u8bdd: item="

    .line 649
    .line 650
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    :cond_25
    :goto_15
    return-void

    .line 658
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 662
    .line 663
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_2b

    .line 676
    .line 677
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 678
    .line 679
    if-eqz v0, :cond_26

    .line 680
    .line 681
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    goto :goto_16

    .line 686
    :cond_26
    move-object v0, v7

    .line 687
    :goto_16
    const-string v1, "Contact_User"

    .line 688
    .line 689
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    if-nez v0, :cond_27

    .line 694
    .line 695
    goto :goto_19

    .line 696
    :cond_27
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 697
    .line 698
    const-string v2, "getActivity"

    .line 699
    .line 700
    new-array v3, v8, [Ljava/lang/Object;

    .line 701
    .line 702
    invoke-static {v0, v2, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    if-eqz v0, :cond_28

    .line 707
    .line 708
    goto :goto_17

    .line 709
    :cond_28
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 710
    .line 711
    const-string v2, "thisActivity"

    .line 712
    .line 713
    new-array v3, v8, [Ljava/lang/Object;

    .line 714
    .line 715
    invoke-static {v0, v2, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    :goto_17
    instance-of v2, v0, Landroid/app/Activity;

    .line 720
    .line 721
    if-eqz v2, :cond_29

    .line 722
    .line 723
    check-cast v0, Landroid/app/Activity;

    .line 724
    .line 725
    goto :goto_18

    .line 726
    :cond_29
    move-object v0, v7

    .line 727
    :goto_18
    if-eqz v0, :cond_2b

    .line 728
    .line 729
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    if-eqz v0, :cond_2b

    .line 734
    .line 735
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    if-eqz v0, :cond_2b

    .line 740
    .line 741
    invoke-static {v0}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 750
    .line 751
    .line 752
    move-result v1

    .line 753
    if-eqz v1, :cond_2a

    .line 754
    .line 755
    move-object v7, v0

    .line 756
    :cond_2a
    if-eqz v7, :cond_2b

    .line 757
    .line 758
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    :cond_2b
    :goto_19
    return-void

    .line 762
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 766
    .line 767
    if-eqz v0, :cond_2c

    .line 768
    .line 769
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    goto :goto_1a

    .line 774
    :cond_2c
    move-object v0, v7

    .line 775
    :goto_1a
    instance-of v1, v0, Landroid/view/MenuItem;

    .line 776
    .line 777
    if-eqz v1, :cond_2d

    .line 778
    .line 779
    check-cast v0, Landroid/view/MenuItem;

    .line 780
    .line 781
    goto :goto_1b

    .line 782
    :cond_2d
    move-object v0, v7

    .line 783
    :goto_1b
    if-eqz v0, :cond_2f

    .line 784
    .line 785
    invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I

    .line 786
    .line 787
    .line 788
    move-result v1

    .line 789
    const v2, 0x48434752    # 199965.28f

    .line 790
    .line 791
    .line 792
    if-eq v1, v2, :cond_2e

    .line 793
    .line 794
    goto :goto_1c

    .line 795
    :cond_2e
    sget-object v1, Lc9/d2;->f:Ljava/util/Map;

    .line 796
    .line 797
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    check-cast v0, Lc9/r1;

    .line 802
    .line 803
    if-eqz v0, :cond_2f

    .line 804
    .line 805
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    sget-object p1, Lc9/d2;->n:Landroid/os/Handler;

    .line 809
    .line 810
    new-instance v1, La1/a;

    .line 811
    .line 812
    invoke-direct {v1, v0, v4}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 816
    .line 817
    .line 818
    :cond_2f
    :goto_1c
    return-void

    .line 819
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    sget-object v0, Lc9/d2;->k:Ljava/lang/ThreadLocal;

    .line 823
    .line 824
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    check-cast v0, Ljava/lang/String;

    .line 829
    .line 830
    invoke-static {v0}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 831
    .line 832
    .line 833
    move-result v0

    .line 834
    if-eqz v0, :cond_31

    .line 835
    .line 836
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 837
    .line 838
    if-eqz v0, :cond_30

    .line 839
    .line 840
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    goto :goto_1d

    .line 845
    :cond_30
    move-object v0, v7

    .line 846
    :goto_1d
    const-string v1, "@placeholder_foldgroup"

    .line 847
    .line 848
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    move-result v0

    .line 852
    if-eqz v0, :cond_31

    .line 853
    .line 854
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    :cond_31
    return-void

    .line 858
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    sget-object v0, Lc9/d2;->j:Ljava/lang/ThreadLocal;

    .line 862
    .line 863
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 864
    .line 865
    .line 866
    sget-object v1, Lc9/d2;->h:Ljava/util/Map;

    .line 867
    .line 868
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 869
    .line 870
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object p1

    .line 874
    check-cast p1, Ljava/lang/String;

    .line 875
    .line 876
    if-eqz p1, :cond_33

    .line 877
    .line 878
    invoke-static {p1}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 879
    .line 880
    .line 881
    move-result v1

    .line 882
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 887
    .line 888
    .line 889
    move-result v1

    .line 890
    if-eqz v1, :cond_32

    .line 891
    .line 892
    move-object v7, p1

    .line 893
    :cond_32
    if-eqz v7, :cond_33

    .line 894
    .line 895
    invoke-virtual {v0, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 896
    .line 897
    .line 898
    :cond_33
    return-void

    .line 899
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 903
    .line 904
    if-eqz v0, :cond_34

    .line 905
    .line 906
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    goto :goto_1e

    .line 911
    :cond_34
    move-object v0, v7

    .line 912
    :goto_1e
    instance-of v1, v0, Ljava/lang/String;

    .line 913
    .line 914
    if-eqz v1, :cond_35

    .line 915
    .line 916
    move-object v7, v0

    .line 917
    check-cast v7, Ljava/lang/String;

    .line 918
    .line 919
    :cond_35
    invoke-static {v7}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 920
    .line 921
    .line 922
    move-result v0

    .line 923
    if-eqz v0, :cond_36

    .line 924
    .line 925
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 926
    .line 927
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    :cond_36
    return-void

    .line 931
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 935
    .line 936
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 937
    .line 938
    if-eqz v0, :cond_37

    .line 939
    .line 940
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    goto :goto_1f

    .line 945
    :cond_37
    move-object v0, v7

    .line 946
    :goto_1f
    instance-of v1, v0, Landroid/view/MenuItem;

    .line 947
    .line 948
    if-eqz v1, :cond_38

    .line 949
    .line 950
    check-cast v0, Landroid/view/MenuItem;

    .line 951
    .line 952
    goto :goto_20

    .line 953
    :cond_38
    move-object v0, v7

    .line 954
    :goto_20
    if-eqz v0, :cond_39

    .line 955
    .line 956
    sget-object v1, Lc9/d2;->g:Ljava/util/Map;

    .line 957
    .line 958
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    check-cast v0, Lc9/x1;

    .line 963
    .line 964
    if-eqz v0, :cond_39

    .line 965
    .line 966
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    sget-object p1, Lc9/d2;->n:Landroid/os/Handler;

    .line 970
    .line 971
    new-instance v1, La1/a;

    .line 972
    .line 973
    const/4 v2, 0x5

    .line 974
    invoke-direct {v1, v0, v2}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 978
    .line 979
    .line 980
    :cond_39
    return-void

    .line 981
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 985
    .line 986
    if-eqz v0, :cond_3a

    .line 987
    .line 988
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    goto :goto_21

    .line 993
    :cond_3a
    move-object v0, v7

    .line 994
    :goto_21
    instance-of v2, v0, Landroid/widget/AdapterView;

    .line 995
    .line 996
    if-eqz v2, :cond_3b

    .line 997
    .line 998
    check-cast v0, Landroid/widget/AdapterView;

    .line 999
    .line 1000
    goto :goto_22

    .line 1001
    :cond_3b
    move-object v0, v7

    .line 1002
    :goto_22
    if-eqz v0, :cond_47

    .line 1003
    .line 1004
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1005
    .line 1006
    if-eqz v2, :cond_3c

    .line 1007
    .line 1008
    invoke-static {v6, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v2

    .line 1012
    goto :goto_23

    .line 1013
    :cond_3c
    move-object v2, v7

    .line 1014
    :goto_23
    instance-of v4, v2, Landroid/view/View;

    .line 1015
    .line 1016
    if-eqz v4, :cond_3d

    .line 1017
    .line 1018
    check-cast v2, Landroid/view/View;

    .line 1019
    .line 1020
    goto :goto_24

    .line 1021
    :cond_3d
    move-object v2, v7

    .line 1022
    :goto_24
    if-eqz v2, :cond_47

    .line 1023
    .line 1024
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1025
    .line 1026
    if-eqz v4, :cond_3e

    .line 1027
    .line 1028
    invoke-static {v1, v4}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    goto :goto_25

    .line 1033
    :cond_3e
    move-object v1, v7

    .line 1034
    :goto_25
    instance-of v4, v1, Ljava/lang/Integer;

    .line 1035
    .line 1036
    if-eqz v4, :cond_3f

    .line 1037
    .line 1038
    check-cast v1, Ljava/lang/Integer;

    .line 1039
    .line 1040
    goto :goto_26

    .line 1041
    :cond_3f
    move-object v1, v7

    .line 1042
    :goto_26
    if-eqz v1, :cond_47

    .line 1043
    .line 1044
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1045
    .line 1046
    .line 1047
    move-result v1

    .line 1048
    :try_start_3
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1052
    goto :goto_27

    .line 1053
    :catchall_3
    move-exception v0

    .line 1054
    new-instance v1, Lsf/f;

    .line 1055
    .line 1056
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1057
    .line 1058
    .line 1059
    move-object v0, v1

    .line 1060
    :goto_27
    nop

    .line 1061
    instance-of v1, v0, Lsf/f;

    .line 1062
    .line 1063
    if-eqz v1, :cond_40

    .line 1064
    .line 1065
    move-object v0, v7

    .line 1066
    :cond_40
    if-eqz v0, :cond_47

    .line 1067
    .line 1068
    sget-object v1, Lc9/d2;->a:Lc9/d2;

    .line 1069
    .line 1070
    invoke-static {v0}, Lc9/d2;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    if-eqz v1, :cond_41

    .line 1075
    .line 1076
    invoke-static {v1}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v4

    .line 1080
    if-eqz v4, :cond_41

    .line 1081
    .line 1082
    goto :goto_28

    .line 1083
    :cond_41
    move-object v1, v7

    .line 1084
    :goto_28
    if-eqz v1, :cond_42

    .line 1085
    .line 1086
    goto :goto_2b

    .line 1087
    :cond_42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    :goto_29
    if-eqz v1, :cond_46

    .line 1092
    .line 1093
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v4

    .line 1097
    if-nez v4, :cond_46

    .line 1098
    .line 1099
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v4

    .line 1103
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v4

    .line 1107
    :cond_43
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1108
    .line 1109
    .line 1110
    move-result v5

    .line 1111
    if-eqz v5, :cond_45

    .line 1112
    .line 1113
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v5

    .line 1117
    check-cast v5, Ljava/lang/reflect/Field;

    .line 1118
    .line 1119
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v8

    .line 1123
    const-class v9, Ljava/lang/String;

    .line 1124
    .line 1125
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v8

    .line 1129
    if-eqz v8, :cond_43

    .line 1130
    .line 1131
    invoke-static {v5, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v5

    .line 1135
    instance-of v8, v5, Ljava/lang/String;

    .line 1136
    .line 1137
    if-eqz v8, :cond_44

    .line 1138
    .line 1139
    check-cast v5, Ljava/lang/String;

    .line 1140
    .line 1141
    goto :goto_2a

    .line 1142
    :cond_44
    move-object v5, v7

    .line 1143
    :goto_2a
    invoke-static {v5}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v8

    .line 1147
    if-eqz v8, :cond_43

    .line 1148
    .line 1149
    move-object v1, v5

    .line 1150
    goto :goto_2b

    .line 1151
    :cond_45
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v1

    .line 1155
    goto :goto_29

    .line 1156
    :cond_46
    move-object v1, v7

    .line 1157
    :goto_2b
    if-eqz v1, :cond_47

    .line 1158
    .line 1159
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 1160
    .line 1161
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    invoke-static {v0}, Lc9/d2;->l(Landroid/content/Context;)Landroid/app/Activity;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    if-eqz v0, :cond_47

    .line 1170
    .line 1171
    invoke-virtual {p1, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1172
    .line 1173
    .line 1174
    sget-object p1, Lc9/d2;->n:Landroid/os/Handler;

    .line 1175
    .line 1176
    new-instance v2, Lc9/t;

    .line 1177
    .line 1178
    invoke-direct {v2, v0, v1, v6}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1182
    .line 1183
    .line 1184
    :cond_47
    return-void

    .line 1185
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
