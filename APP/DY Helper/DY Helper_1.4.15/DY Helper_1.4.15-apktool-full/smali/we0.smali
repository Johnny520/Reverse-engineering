.class public final synthetic Lwe0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lz81;

.field public final synthetic η:Z


# direct methods
.method public synthetic constructor <init>(Lz81;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lwe0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lwe0;->ζ:Lz81;

    .line 4
    .line 5
    iput-boolean p2, p0, Lwe0;->η:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(ZLz81;I)V
    .locals 0

    .line 11
    iput p3, p0, Lwe0;->ε:I

    iput-boolean p1, p0, Lwe0;->η:Z

    iput-object p2, p0, Lwe0;->ζ:Lz81;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwe0;->ε:I

    .line 4
    .line 5
    const/16 v2, 0x15

    .line 6
    .line 7
    const/16 v3, 0x16

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    sget-object v6, Ls62;->α:Ls62;

    .line 12
    .line 13
    iget-boolean v7, v0, Lwe0;->η:Z

    .line 14
    .line 15
    iget-object v8, v0, Lwe0;->ζ:Lz81;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    invoke-static {v0, v7}, Lx;->χ(Ljava/lang/ClassLoader;Z)V

    .line 23
    .line 24
    .line 25
    return-object v6

    .line 26
    :pswitch_0
    invoke-static {v8, v7}, Lv71;->κ(Lz81;Z)V

    .line 27
    .line 28
    .line 29
    return-object v6

    .line 30
    :pswitch_1
    if-eqz v7, :cond_0

    .line 31
    .line 32
    sget-object v0, Lm82;->α:Lm82;

    .line 33
    .line 34
    iget-object v1, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lm82;->γ(Ljava/lang/ClassLoader;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_17

    .line 40
    .line 41
    :cond_0
    sget-object v0, Ln82;->α:[Ljava/lang/String;

    .line 42
    .line 43
    const-string v1, "setSpeed"

    .line 44
    .line 45
    const-string v7, ": "

    .line 46
    .line 47
    :try_start_0
    const-string v0, "video_speed_hook_enabled"

    .line 48
    .line 49
    invoke-static {v0, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move v0, v4

    .line 55
    :goto_0
    const/4 v9, 0x4

    .line 56
    const-string v10, "rfe847aaa60ab2d90"

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    const-string v0, "VideoSpeedHook disabled by prefs"

    .line 62
    .line 63
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_17

    .line 67
    .line 68
    :cond_1
    :try_start_1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 69
    .line 70
    const-string v0, "~791C379118E47E8B07D05A90B0CB4AAAEFB24B3BF0773879FC833D3987C0B1293BF3"

    .line 71
    .line 72
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v12, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 77
    .line 78
    invoke-static {v12, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    :try_start_2
    sget-object v12, Lxq0;->α:Lxq0;

    .line 86
    .line 87
    const-string v13, "getIntValue"

    .line 88
    .line 89
    new-instance v14, Lpy1;

    .line 90
    .line 91
    invoke-direct {v14, v3}, Lpy1;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v0, v13, v14}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    .line 96
    .line 97
    :catchall_1
    :try_start_3
    sget-object v3, Lxq0;->α:Lxq0;

    .line 98
    .line 99
    const-string v12, "getBooleanValue"

    .line 100
    .line 101
    new-instance v13, Lpy1;

    .line 102
    .line 103
    const/16 v14, 0x17

    .line 104
    .line 105
    invoke-direct {v13, v14}, Lpy1;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v0, v12, v13}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 109
    .line 110
    .line 111
    :catchall_2
    :try_start_4
    const-string v0, "\u2705 ABManager fallback installed"

    .line 112
    .line 113
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catchall_3
    move-exception v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v12, "ABManager fallback ERR: "

    .line 131
    .line 132
    invoke-static {v12, v3, v7, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :goto_1
    :try_start_5
    sget-object v3, Ln82;->α:[Ljava/lang/String;

    .line 140
    .line 141
    array-length v12, v3

    .line 142
    move v13, v5

    .line 143
    :goto_2
    if-ge v13, v12, :cond_4

    .line 144
    .line 145
    aget-object v0, v3, v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 146
    .line 147
    :try_start_6
    iget-object v14, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 148
    .line 149
    invoke-static {v0, v5, v14}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 153
    goto :goto_3

    .line 154
    :catchall_4
    move-exception v0

    .line 155
    :try_start_7
    new-instance v14, Leo1;

    .line 156
    .line 157
    invoke-direct {v14, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object v0, v14

    .line 161
    :goto_3
    instance-of v14, v0, Leo1;

    .line 162
    .line 163
    if-eqz v14, :cond_3

    .line 164
    .line 165
    move-object v0, v11

    .line 166
    :cond_3
    check-cast v0, Ljava/lang/Class;

    .line 167
    .line 168
    if-nez v0, :cond_5

    .line 169
    .line 170
    add-int/lit8 v13, v13, 0x1

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :catchall_5
    move-exception v0

    .line 174
    goto :goto_5

    .line 175
    :cond_4
    move-object v0, v11

    .line 176
    :cond_5
    if-nez v0, :cond_6

    .line 177
    .line 178
    const-string v0, "AbilityAb optional missing on host 39.0"

    .line 179
    .line 180
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    array-length v3, v0

    .line 192
    move v12, v5

    .line 193
    move v13, v12

    .line 194
    :goto_4
    if-ge v12, v3, :cond_8

    .line 195
    .line 196
    aget-object v14, v0, v12

    .line 197
    .line 198
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    const-string v5, "LIZJ"

    .line 203
    .line 204
    invoke-static {v15, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-eqz v5, :cond_7

    .line 209
    .line 210
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 215
    .line 216
    invoke-static {v5, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-eqz v5, :cond_7

    .line 221
    .line 222
    invoke-virtual {v14, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 223
    .line 224
    .line 225
    sget-object v5, Lxq0;->α:Lxq0;

    .line 226
    .line 227
    new-instance v13, Lpy1;

    .line 228
    .line 229
    invoke-direct {v13, v2}, Lpy1;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v14, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 233
    .line 234
    .line 235
    move v13, v4

    .line 236
    :cond_7
    add-int/lit8 v12, v12, 0x1

    .line 237
    .line 238
    const/4 v5, 0x0

    .line 239
    goto :goto_4

    .line 240
    :cond_8
    if-eqz v13, :cond_9

    .line 241
    .line 242
    const-string v0, "\u2705 AbilityAb.LIZJ=true (safe method hook)"

    .line 243
    .line 244
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_9
    const-string v0, "\u26a0\ufe0f AbilityAb.LIZJ method not found, using ABManager fallback"

    .line 249
    .line 250
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 251
    .line 252
    .line 253
    goto :goto_6

    .line 254
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const-string v3, "AbilityAb safe hook ERR: "

    .line 267
    .line 268
    invoke-static {v3, v2, v7, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :goto_6
    :try_start_8
    sget-object v2, Ln82;->β:[Ljava/lang/String;

    .line 276
    .line 277
    array-length v3, v2

    .line 278
    const/4 v5, 0x0

    .line 279
    :goto_7
    if-ge v5, v3, :cond_b

    .line 280
    .line 281
    aget-object v0, v2, v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 282
    .line 283
    :try_start_9
    iget-object v12, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    invoke-static {v0, v13, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 290
    goto :goto_8

    .line 291
    :catchall_6
    move-exception v0

    .line 292
    :try_start_a
    new-instance v12, Leo1;

    .line 293
    .line 294
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    move-object v0, v12

    .line 298
    :goto_8
    instance-of v12, v0, Leo1;

    .line 299
    .line 300
    if-eqz v12, :cond_a

    .line 301
    .line 302
    move-object v0, v11

    .line 303
    :cond_a
    check-cast v0, Ljava/lang/Class;

    .line 304
    .line 305
    if-nez v0, :cond_c

    .line 306
    .line 307
    add-int/lit8 v5, v5, 0x1

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :catchall_7
    move-exception v0

    .line 311
    goto :goto_b

    .line 312
    :cond_b
    move-object v0, v11

    .line 313
    :cond_c
    if-nez v0, :cond_d

    .line 314
    .line 315
    const-string v0, "speed option config optional missing on host 39.0"

    .line 316
    .line 317
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    goto :goto_c

    .line 321
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v2, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    array-length v3, v0

    .line 334
    const/4 v5, 0x0

    .line 335
    :goto_9
    if-ge v5, v3, :cond_f

    .line 336
    .line 337
    aget-object v12, v0, v5

    .line 338
    .line 339
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {v12}, Ln82;->δ(Ljava/lang/reflect/Method;)Z

    .line 343
    .line 344
    .line 345
    move-result v13

    .line 346
    if-eqz v13, :cond_e

    .line 347
    .line 348
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 352
    .line 353
    goto :goto_9

    .line 354
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const/4 v2, 0x0

    .line 359
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_10

    .line 364
    .line 365
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    check-cast v3, Ljava/lang/reflect/Method;

    .line 370
    .line 371
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 372
    .line 373
    .line 374
    sget-object v5, Lxq0;->α:Lxq0;

    .line 375
    .line 376
    new-instance v12, Lpy1;

    .line 377
    .line 378
    const/16 v13, 0x18

    .line 379
    .line 380
    invoke-direct {v12, v13}, Lpy1;-><init>(I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v5, v3, v12}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 384
    .line 385
    .line 386
    add-int/lit8 v2, v2, 0x1

    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    const-string v3, "\u2705 DSpeedOptionConfig speed options hook OK count="

    .line 395
    .line 396
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 407
    .line 408
    .line 409
    goto :goto_c

    .line 410
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    const-string v3, "DSpeedOptionConfig ERR: "

    .line 423
    .line 424
    invoke-static {v3, v2, v7, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    :goto_c
    :try_start_b
    const-string v0, "X.C1131250fQ2"

    .line 432
    .line 433
    iget-object v2, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    invoke-static {v0, v13, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    new-instance v2, Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 450
    .line 451
    .line 452
    array-length v3, v0

    .line 453
    const/4 v5, 0x0

    .line 454
    :goto_d
    if-ge v5, v3, :cond_12

    .line 455
    .line 456
    aget-object v7, v0, v5

    .line 457
    .line 458
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-static {v7}, Ln82;->δ(Ljava/lang/reflect/Method;)Z

    .line 462
    .line 463
    .line 464
    move-result v12

    .line 465
    if-eqz v12, :cond_11

    .line 466
    .line 467
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    :cond_11
    add-int/lit8 v5, v5, 0x1

    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_12
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    const/4 v13, 0x0

    .line 478
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-eqz v2, :cond_13

    .line 483
    .line 484
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    check-cast v2, Ljava/lang/reflect/Method;

    .line 489
    .line 490
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 491
    .line 492
    .line 493
    sget-object v3, Lxq0;->α:Lxq0;

    .line 494
    .line 495
    new-instance v5, Lxe;

    .line 496
    .line 497
    const/16 v7, 0xd

    .line 498
    .line 499
    const/4 v12, 0x0

    .line 500
    invoke-direct {v5, v2, v7, v12}, Lxe;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v3, v2, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 504
    .line 505
    .line 506
    add-int/lit8 v13, v13, 0x1

    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 512
    .line 513
    .line 514
    const-string v2, "\u2705 C1131250fQ2 speed options hook OK count="

    .line 515
    .line 516
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 527
    .line 528
    .line 529
    :catchall_8
    invoke-static {v8}, Ln82;->γ(Lz81;)V

    .line 530
    .line 531
    .line 532
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 533
    .line 534
    :try_start_c
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 535
    .line 536
    const-string v0, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"

    .line 537
    .line 538
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    iget-object v3, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 543
    .line 544
    invoke-static {v3, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    if-eqz v0, :cond_14

    .line 549
    .line 550
    new-instance v3, Lpy1;

    .line 551
    .line 552
    const/16 v4, 0x1a

    .line 553
    .line 554
    invoke-direct {v3, v4}, Lpy1;-><init>(I)V

    .line 555
    .line 556
    .line 557
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    invoke-static {v0, v1, v3}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 562
    .line 563
    .line 564
    const-string v0, "\u2705 Probe FeedPlayerWrapper.setSpeed"

    .line 565
    .line 566
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 567
    .line 568
    .line 569
    goto :goto_f

    .line 570
    :catchall_9
    move-exception v0

    .line 571
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    const-string v3, "Probe FeedPlayerWrapper ERR: "

    .line 576
    .line 577
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :cond_14
    :goto_f
    :try_start_d
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 585
    .line 586
    const-string v0, "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE0AE615CE280772922D63B5F8A7251BD40F9CB4512B8F0072E7"

    .line 587
    .line 588
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    iget-object v3, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 593
    .line 594
    invoke-static {v3, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    if-eqz v0, :cond_15

    .line 599
    .line 600
    new-instance v3, Lpy1;

    .line 601
    .line 602
    const/16 v4, 0x1b

    .line 603
    .line 604
    invoke-direct {v3, v4}, Lpy1;-><init>(I)V

    .line 605
    .line 606
    .line 607
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    invoke-static {v0, v1, v3}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 612
    .line 613
    .line 614
    const-string v0, "\u2705 Probe SimPlayer.setSpeed"

    .line 615
    .line 616
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 617
    .line 618
    .line 619
    goto :goto_10

    .line 620
    :catchall_a
    move-exception v0

    .line 621
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    const-string v3, "Probe SimPlayer ERR: "

    .line 626
    .line 627
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    :cond_15
    :goto_10
    const-string v35, "X.C1GU8"

    .line 635
    .line 636
    const-string v36, "X.C1GU9"

    .line 637
    .line 638
    const-string v12, "X.C1GTT"

    .line 639
    .line 640
    const-string v13, "X.C1GTS"

    .line 641
    .line 642
    const-string v14, "X.C1GTR"

    .line 643
    .line 644
    const-string v15, "X.C1GTQ"

    .line 645
    .line 646
    const-string v16, "X.C1GTP"

    .line 647
    .line 648
    const-string v17, "X.C1GTO"

    .line 649
    .line 650
    const-string v18, "X.C1GTN"

    .line 651
    .line 652
    const-string v19, "X.C1GTM"

    .line 653
    .line 654
    const-string v20, "X.C1GTL"

    .line 655
    .line 656
    const-string v21, "X.C1GTK"

    .line 657
    .line 658
    const-string v22, "X.C1GTJ"

    .line 659
    .line 660
    const-string v23, "X.C1GTI"

    .line 661
    .line 662
    const-string v24, "X.C1GTH"

    .line 663
    .line 664
    const-string v25, "X.C1GTG"

    .line 665
    .line 666
    const-string v26, "X.C1GTF"

    .line 667
    .line 668
    const-string v27, "X.C1GU0"

    .line 669
    .line 670
    const-string v28, "X.C1GU1"

    .line 671
    .line 672
    const-string v29, "X.C1GU2"

    .line 673
    .line 674
    const-string v30, "X.C1GU3"

    .line 675
    .line 676
    const-string v31, "X.C1GU4"

    .line 677
    .line 678
    const-string v32, "X.C1GU5"

    .line 679
    .line 680
    const-string v33, "X.C1GU6"

    .line 681
    .line 682
    const-string v34, "X.C1GU7"

    .line 683
    .line 684
    filled-new-array/range {v12 .. v36}, [Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    :catch_0
    :catchall_b
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 697
    .line 698
    .line 699
    move-result v3

    .line 700
    const-string v4, "\u2705 Probe "

    .line 701
    .line 702
    if-eqz v3, :cond_17

    .line 703
    .line 704
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    check-cast v3, Ljava/lang/String;

    .line 709
    .line 710
    :try_start_e
    sget-object v5, Lqe0;->α:Ljava/lang/Object;

    .line 711
    .line 712
    iget-object v5, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 713
    .line 714
    invoke-static {v5, v3}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    move-result-object v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 718
    if-nez v5, :cond_16

    .line 719
    .line 720
    goto :goto_11

    .line 721
    :cond_16
    :try_start_f
    const-string v7, "setPlaySpeed"

    .line 722
    .line 723
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    move-result-object v12

    .line 727
    invoke-virtual {v5, v7, v12}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 728
    .line 729
    .line 730
    move-result-object v5
    :try_end_f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 731
    :try_start_10
    sget-object v7, Lxq0;->α:Lxq0;

    .line 732
    .line 733
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    new-instance v12, Lbt;

    .line 737
    .line 738
    const/4 v13, 0x3

    .line 739
    invoke-direct {v12, v3, v13}, Lbt;-><init>(Ljava/lang/String;I)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v7, v5, v12}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 743
    .line 744
    .line 745
    new-instance v5, Ljava/lang/StringBuilder;

    .line 746
    .line 747
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    const-string v3, ".setPlaySpeed"

    .line 754
    .line 755
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    invoke-static {v10, v3, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    .line 763
    .line 764
    .line 765
    goto :goto_11

    .line 766
    :cond_17
    const-string v0, "~793C911F02B4DC50C7A540827E13BF2EE460C1D7866986C60E01C6BDB0E2B70E7431B64B4D80F270F827"

    .line 767
    .line 768
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    const-string v2, "com.google.android.exoplayer2.PlaybackParameters"

    .line 773
    .line 774
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    :catchall_c
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    if-eqz v2, :cond_19

    .line 791
    .line 792
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    check-cast v2, Ljava/lang/String;

    .line 797
    .line 798
    :try_start_11
    sget-object v3, Lqe0;->α:Ljava/lang/Object;

    .line 799
    .line 800
    iget-object v3, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 801
    .line 802
    invoke-static {v3, v2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    move-result-object v3

    .line 806
    if-nez v3, :cond_18

    .line 807
    .line 808
    goto :goto_12

    .line 809
    :cond_18
    sget-object v5, Lxq0;->α:Lxq0;

    .line 810
    .line 811
    new-instance v7, Lbt;

    .line 812
    .line 813
    invoke-direct {v7, v2, v9}, Lbt;-><init>(Ljava/lang/String;I)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v5, v3, v7}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 817
    .line 818
    .line 819
    new-instance v3, Ljava/lang/StringBuilder;

    .line 820
    .line 821
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    invoke-static {v10, v2, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    .line 835
    .line 836
    .line 837
    goto :goto_12

    .line 838
    :cond_19
    const-string v2, "~7908F94440A3C3FF1093F148DDFD25ECA65A2F6D3C7D5B2BE16B4D0599404E3FFA8D8123B7F37C"

    .line 839
    .line 840
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    const-string v3, "tv.danmaku.ijk.media.player.IjkMediaPlayer"

    .line 845
    .line 846
    const-string v5, "com.google.android.exoplayer2.ExoPlayerImpl"

    .line 847
    .line 848
    const-string v7, "com.google.android.exoplayer2.SimpleExoPlayer"

    .line 849
    .line 850
    filled-new-array {v5, v7, v0, v3}, [Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    :catchall_d
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 863
    .line 864
    .line 865
    move-result v3

    .line 866
    if-eqz v3, :cond_1b

    .line 867
    .line 868
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v3

    .line 872
    check-cast v3, Ljava/lang/String;

    .line 873
    .line 874
    :try_start_12
    sget-object v5, Lqe0;->α:Ljava/lang/Object;

    .line 875
    .line 876
    iget-object v5, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 877
    .line 878
    invoke-static {v5, v3}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    if-nez v5, :cond_1a

    .line 883
    .line 884
    goto :goto_13

    .line 885
    :cond_1a
    sget-object v7, Lxq0;->α:Lxq0;

    .line 886
    .line 887
    const-string v12, "setPlaybackParameters"

    .line 888
    .line 889
    new-instance v13, Lbt;

    .line 890
    .line 891
    const/4 v14, 0x5

    .line 892
    invoke-direct {v13, v3, v14}, Lbt;-><init>(Ljava/lang/String;I)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v7, v5, v12, v13}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 896
    .line 897
    .line 898
    new-instance v5, Ljava/lang/StringBuilder;

    .line 899
    .line 900
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 907
    .line 908
    .line 909
    const-string v3, ".setPlaybackParameters"

    .line 910
    .line 911
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    invoke-static {v10, v3, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    .line 919
    .line 920
    .line 921
    goto :goto_13

    .line 922
    :cond_1b
    :try_start_13
    const-class v0, Ljava/lang/ClassLoader;

    .line 923
    .line 924
    const-string v3, "loadClass"

    .line 925
    .line 926
    const-class v4, Ljava/lang/String;

    .line 927
    .line 928
    new-instance v5, Lpy1;

    .line 929
    .line 930
    const/16 v7, 0x1c

    .line 931
    .line 932
    invoke-direct {v5, v7}, Lpy1;-><init>(I)V

    .line 933
    .line 934
    .line 935
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v4

    .line 939
    invoke-static {v0, v3, v4}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 940
    .line 941
    .line 942
    const-string v0, "\u2705 Probe ClassLoader.loadClass (with dedup)"

    .line 943
    .line 944
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    .line 945
    .line 946
    .line 947
    goto :goto_14

    .line 948
    :catchall_e
    move-exception v0

    .line 949
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    const-string v3, "Probe ClassLoader ERR: "

    .line 954
    .line 955
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    invoke-static {v10, v0, v11, v9, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 960
    .line 961
    .line 962
    :goto_14
    :try_start_14
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    const-string v2, "~792CC2D8D4DF443DA74B7503A721D5A1984EBA79CD86B55E128005B785C87E89A5CAFFBCA026238D02932E878F8E"

    .line 967
    .line 968
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    :cond_1c
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 985
    .line 986
    .line 987
    move-result v2

    .line 988
    if-eqz v2, :cond_1e

    .line 989
    .line 990
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v2

    .line 994
    check-cast v2, Ljava/lang/String;

    .line 995
    .line 996
    sget-object v3, Lqe0;->α:Ljava/lang/Object;

    .line 997
    .line 998
    iget-object v3, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 999
    .line 1000
    invoke-static {v3, v2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    if-nez v2, :cond_1d

    .line 1005
    .line 1006
    goto :goto_15

    .line 1007
    :cond_1d
    const-string v3, "setPlaybackSpeed"

    .line 1008
    .line 1009
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v3

    .line 1013
    invoke-static {v3}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v3

    .line 1017
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v3

    .line 1021
    :catchall_f
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v4

    .line 1025
    if-eqz v4, :cond_1c

    .line 1026
    .line 1027
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v4

    .line 1031
    check-cast v4, Ljava/lang/String;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_10

    .line 1032
    .line 1033
    :try_start_15
    sget-object v5, Lxq0;->α:Lxq0;

    .line 1034
    .line 1035
    new-instance v7, Lpy1;

    .line 1036
    .line 1037
    const/16 v9, 0x19

    .line 1038
    .line 1039
    invoke-direct {v7, v9}, Lpy1;-><init>(I)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v5, v2, v4, v7}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_f

    .line 1043
    .line 1044
    .line 1045
    goto :goto_16

    .line 1046
    :catchall_10
    :cond_1e
    :goto_17
    return-object v6

    .line 1047
    :pswitch_2
    if-eqz v7, :cond_20

    .line 1048
    .line 1049
    sget-object v0, Lhb2;->α:Lhb2;

    .line 1050
    .line 1051
    sget-object v0, Lib2;->α:Lib2;

    .line 1052
    .line 1053
    iget-object v1, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1054
    .line 1055
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v0, v1}, Lib2;->ν(Ljava/lang/ClassLoader;)V

    .line 1059
    .line 1060
    .line 1061
    :try_start_16
    iget-object v0, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1062
    .line 1063
    invoke-static {v0}, Lhb2;->γ(Ljava/lang/ClassLoader;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_11

    .line 1064
    .line 1065
    .line 1066
    move-object v1, v6

    .line 1067
    goto :goto_18

    .line 1068
    :catchall_11
    move-exception v0

    .line 1069
    new-instance v1, Leo1;

    .line 1070
    .line 1071
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1072
    .line 1073
    .line 1074
    :goto_18
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    const-string v1, "re4b6c41332ef57c6"

    .line 1079
    .line 1080
    if-eqz v0, :cond_1f

    .line 1081
    .line 1082
    const-string v2, "39.6+ \u8bc4\u8bba\u8bed\u97f3\u66ff\u6362 Hook \u5b89\u88c5\u5931\u8d25\uff0c\u5df2\u4fdd\u7559\u5bbf\u4e3b\u539f\u53d1\u9001"

    .line 1083
    .line 1084
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1085
    .line 1086
    .line 1087
    :cond_1f
    :try_start_17
    iget-object v0, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1088
    .line 1089
    invoke-static {v0}, Lhb2;->ε(Ljava/lang/ClassLoader;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_12

    .line 1090
    .line 1091
    .line 1092
    move-object v2, v6

    .line 1093
    goto :goto_19

    .line 1094
    :catchall_12
    move-exception v0

    .line 1095
    new-instance v2, Leo1;

    .line 1096
    .line 1097
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1098
    .line 1099
    .line 1100
    :goto_19
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    if-eqz v0, :cond_22

    .line 1105
    .line 1106
    const-string v2, "39.6+ \u79c1\u4fe1\u8bed\u97f3\u66ff\u6362 Hook \u5b89\u88c5\u5931\u8d25\uff0c\u5df2\u4fdd\u7559\u5bbf\u4e3b\u539f\u53d1\u9001"

    .line 1107
    .line 1108
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1109
    .line 1110
    .line 1111
    goto :goto_1b

    .line 1112
    :cond_20
    sget-object v0, Lib2;->α:Lib2;

    .line 1113
    .line 1114
    sget-object v1, Lib2;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1115
    .line 1116
    const/4 v13, 0x0

    .line 1117
    invoke-virtual {v1, v13, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    if-nez v1, :cond_21

    .line 1122
    .line 1123
    goto :goto_1a

    .line 1124
    :cond_21
    sget-object v1, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1125
    .line 1126
    new-instance v1, Lj72;

    .line 1127
    .line 1128
    invoke-direct {v1, v2}, Lj72;-><init>(I)V

    .line 1129
    .line 1130
    .line 1131
    const-string v2, "voice_replace_hook"

    .line 1132
    .line 1133
    invoke-static {v2, v1}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1134
    .line 1135
    .line 1136
    new-instance v1, Lj72;

    .line 1137
    .line 1138
    invoke-direct {v1, v3}, Lj72;-><init>(I)V

    .line 1139
    .line 1140
    .line 1141
    invoke-static {v2, v1}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1142
    .line 1143
    .line 1144
    :goto_1a
    iget-object v1, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1145
    .line 1146
    invoke-virtual {v0, v1}, Lib2;->ρ(Ljava/lang/ClassLoader;)V

    .line 1147
    .line 1148
    .line 1149
    iget-object v1, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1150
    .line 1151
    invoke-virtual {v0, v1}, Lib2;->π(Ljava/lang/ClassLoader;)V

    .line 1152
    .line 1153
    .line 1154
    iget-object v1, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1155
    .line 1156
    invoke-virtual {v0, v1}, Lib2;->ξ(Ljava/lang/ClassLoader;)V

    .line 1157
    .line 1158
    .line 1159
    iget-object v1, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1160
    .line 1161
    invoke-virtual {v0, v1}, Lib2;->ο(Ljava/lang/ClassLoader;)V

    .line 1162
    .line 1163
    .line 1164
    const-string v0, "rb360b99c73f2f647"

    .line 1165
    .line 1166
    const-string v1, "voice replace hook installed"

    .line 1167
    .line 1168
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    :cond_22
    :goto_1b
    return-object v6

    .line 1172
    :pswitch_3
    invoke-static {v8, v7}, Lv71;->κ(Lz81;Z)V

    .line 1173
    .line 1174
    .line 1175
    return-object v6

    .line 1176
    :pswitch_4
    iget-object v0, v8, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1177
    .line 1178
    invoke-static {v0, v7}, Lx;->χ(Ljava/lang/ClassLoader;Z)V

    .line 1179
    .line 1180
    .line 1181
    return-object v6

    .line 1182
    nop

    .line 1183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
