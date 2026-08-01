.class public final synthetic Lqh1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lqh1;->ε:I

    iput-object p1, p0, Lqh1;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Lqh1;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lry1;Ljava/util/List;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    const/4 p1, 0x7

    .line 2
    iput p1, p0, Lqh1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lqh1;->η:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lqh1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcw1;

    .line 9
    .line 10
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lm62;

    .line 13
    .line 14
    check-cast p1, Ln62;

    .line 15
    .line 16
    iget-object v1, v0, Lcw1;->ζ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lzz1;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iget-boolean v2, p1, Ln62;->ζ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    iget-object v0, v0, Lcw1;->η:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lkw0;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    :try_start_1
    invoke-virtual {v0, p0, p1}, Lkw0;->β(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ln62;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0, p0}, Lkw0;->γ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Ln62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    :goto_0
    monitor-exit v1

    .line 45
    sget-object p0, Ls62;->α:Ls62;

    .line 46
    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v1

    .line 49
    throw p0

    .line 50
    :pswitch_0
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Landroid/app/Activity;

    .line 53
    .line 54
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Lky1;

    .line 57
    .line 58
    check-cast p1, Lmy1;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v1, Lry1;->α:Lry1;

    .line 64
    .line 65
    const-string v2, "\u5929)"

    .line 66
    .line 67
    const-string v3, " ("

    .line 68
    .line 69
    const-string v4, "spark:test_renew"

    .line 70
    .line 71
    const-string v5, "\u5929"

    .line 72
    .line 73
    const-string v6, " "

    .line 74
    .line 75
    const-string v7, " UID="

    .line 76
    .line 77
    sget-object v8, Lry1;->χ:Landroid/content/Context;

    .line 78
    .line 79
    if-nez v8, :cond_1

    .line 80
    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    sput-object v8, Lry1;->χ:Landroid/content/Context;

    .line 88
    .line 89
    :cond_1
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-static {}, Lui1;->Α()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-nez v8, :cond_2

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v8}, Lui1;->π(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    sget-object v8, Lry1;->φ:Ljava/lang/ClassLoader;

    .line 108
    .line 109
    if-nez v8, :cond_4

    .line 110
    .line 111
    if-eqz v0, :cond_3

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    goto :goto_2

    .line 122
    :cond_3
    const/4 v8, 0x0

    .line 123
    :cond_4
    :goto_2
    if-eqz v8, :cond_5

    .line 124
    .line 125
    const/4 v9, 0x1

    .line 126
    invoke-virtual {v1, v8, v9}, Lry1;->Γ(Ljava/lang/ClassLoader;Z)V

    .line 127
    .line 128
    .line 129
    :cond_5
    invoke-static {}, Lry1;->х()Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-nez v8, :cond_6

    .line 134
    .line 135
    const-string p0, "\u53d1\u9001\u529f\u80fd\u5c1a\u672a\u5c31\u7eea\n\u8bf7\u7a0d\u7b49\u7247\u523b\u6216\u968f\u4fbf\u70b9\u5f00\u4e00\u4e2a\u79c1\u4fe1\u7a97\u53e3\u518d\u8bd5"

    .line 136
    .line 137
    goto/16 :goto_3

    .line 138
    .line 139
    :cond_6
    invoke-static {}, Lry1;->К()Ljy1;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    invoke-static {p0}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    if-eqz v0, :cond_7

    .line 148
    .line 149
    const-string v10, "\u6d4b\u8bd5\u7eed\u706b"

    .line 150
    .line 151
    const-string v11, "1/1"

    .line 152
    .line 153
    const/16 v12, 0x64

    .line 154
    .line 155
    invoke-static {v12, v0, v4, v10, v11}, Lry1;->ｏ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_7
    invoke-static {p0, v8, p1}, Lry1;->Ц(Lky1;Ljy1;Lmy1;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {v1, p0, p1}, Lry1;->ｈ(Lky1;Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    invoke-static {}, Lry1;->Ν()V

    .line 167
    .line 168
    .line 169
    iget-wide v10, p0, Lky1;->γ:J

    .line 170
    .line 171
    iget v1, p0, Lky1;->ε:I

    .line 172
    .line 173
    if-eqz p1, :cond_8

    .line 174
    .line 175
    const-string p1, "[\u6d4b\u8bd5] \u5df2\u63d0\u4ea4 "

    .line 176
    .line 177
    invoke-static {p1, v9, v10, v11, v7}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {p1}, Lry1;->ю(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    const-string p1, "\u6d4b\u8bd5\u7eed\u706b\u5b8c\u6210"

    .line 198
    .line 199
    invoke-static {v0, v4, p1, v9}, Lry1;->σ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iget p0, p0, Lky1;->ε:I

    .line 203
    .line 204
    new-instance p1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v0, "\u6d4b\u8bd5\u7eed\u706b\u6d88\u606f\u5df2\u63d0\u4ea4: "

    .line 207
    .line 208
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    goto :goto_3

    .line 228
    :cond_8
    const-string p1, "[\u6d4b\u8bd5] \u53d1\u9001\u5931\u8d25 "

    .line 229
    .line 230
    invoke-static {p1, v9, v10, v11, v7}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-static {p1}, Lry1;->ю(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    const-string p1, "\u6d4b\u8bd5\u7eed\u706b\u5931\u8d25"

    .line 251
    .line 252
    invoke-static {v0, v4, p1, v9}, Lry1;->Δ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    iget p0, p0, Lky1;->ε:I

    .line 256
    .line 257
    new-instance p1, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v0, "\u6d4b\u8bd5\u7eed\u706b\u6d88\u606f\u53d1\u9001\u5931\u8d25: "

    .line 260
    .line 261
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    :goto_3
    return-object p0

    .line 281
    :pswitch_1
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lorg/json/JSONObject;

    .line 284
    .line 285
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast p0, Ljava/lang/String;

    .line 288
    .line 289
    check-cast p1, Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    return-object p0

    .line 304
    :pswitch_2
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, Ljava/util/List;

    .line 307
    .line 308
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast p0, Ljava/lang/ClassLoader;

    .line 311
    .line 312
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    :try_start_2
    new-instance v1, Lay1;

    .line 318
    .line 319
    const/16 v2, 0x12

    .line 320
    .line 321
    invoke-direct {v1, v2}, Lay1;-><init>(I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    new-instance v1, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    :cond_9
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_a

    .line 342
    .line 343
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 348
    .line 349
    invoke-virtual {v2, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    if-eqz v2, :cond_9

    .line 354
    .line 355
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 356
    .line 357
    .line 358
    goto :goto_4

    .line 359
    :catchall_1
    move-exception p0

    .line 360
    new-instance v1, Leo1;

    .line 361
    .line 362
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 363
    .line 364
    .line 365
    :cond_a
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    if-nez p0, :cond_b

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_b
    sget-object v1, Ljz;->ε:Ljz;

    .line 373
    .line 374
    :goto_5
    check-cast v1, Ljava/util/List;

    .line 375
    .line 376
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 377
    .line 378
    .line 379
    move-result p0

    .line 380
    if-nez p0, :cond_c

    .line 381
    .line 382
    move-object v0, v1

    .line 383
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    if-eqz p1, :cond_d

    .line 392
    .line 393
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    check-cast p1, Ljava/lang/reflect/Method;

    .line 398
    .line 399
    const/4 v1, 0x1

    .line 400
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 401
    .line 402
    .line 403
    goto :goto_6

    .line 404
    :cond_d
    return-object v0

    .line 405
    :pswitch_3
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Landroid/app/Activity;

    .line 408
    .line 409
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast p0, Landroid/widget/Switch;

    .line 412
    .line 413
    check-cast p1, La80;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    new-instance v1, Lic;

    .line 419
    .line 420
    const/16 v2, 0x8

    .line 421
    .line 422
    invoke-direct {v1, p1, v2, p0}, Lic;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    const-string p0, "pet_elf_task_image_uri"

    .line 426
    .line 427
    const-string p1, ""

    .line 428
    .line 429
    invoke-static {p0, p1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    xor-int/lit8 p1, p0, 0x1

    .line 438
    .line 439
    const/4 v2, 0x0

    .line 440
    const/4 v3, 0x1

    .line 441
    if-nez p0, :cond_e

    .line 442
    .line 443
    const/4 p0, 0x2

    .line 444
    new-array p0, p0, [Ljava/lang/String;

    .line 445
    .line 446
    const-string v4, "\u91cd\u65b0\u9009\u62e9\u56fe\u7247"

    .line 447
    .line 448
    aput-object v4, p0, v2

    .line 449
    .line 450
    const-string v2, "\u6e05\u9664\u56fe\u7247"

    .line 451
    .line 452
    aput-object v2, p0, v3

    .line 453
    .line 454
    goto :goto_7

    .line 455
    :cond_e
    new-array p0, v3, [Ljava/lang/String;

    .line 456
    .line 457
    const-string v3, "\u9009\u62e9\u56fe\u7247"

    .line 458
    .line 459
    aput-object v3, p0, v2

    .line 460
    .line 461
    :goto_7
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 462
    .line 463
    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 464
    .line 465
    .line 466
    const-string v3, "\u81ea\u52a8\u4efb\u52a1\u56fe\u7247"

    .line 467
    .line 468
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    check-cast p0, [Ljava/lang/CharSequence;

    .line 473
    .line 474
    new-instance v3, Lvt1;

    .line 475
    .line 476
    invoke-direct {v3, p1, v1, v0}, Lvt1;-><init>(ZLic;Landroid/app/Activity;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2, p0, v3}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    const-string p1, "\u53d6\u6d88"

    .line 484
    .line 485
    const/4 v0, 0x0

    .line 486
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 491
    .line 492
    .line 493
    sget-object p0, Ls62;->α:Ls62;

    .line 494
    .line 495
    return-object p0

    .line 496
    :pswitch_4
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v0, Landroid/app/Activity;

    .line 499
    .line 500
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast p0, Lxj0;

    .line 503
    .line 504
    check-cast p1, Ljava/lang/String;

    .line 505
    .line 506
    const/4 v1, 0x0

    .line 507
    if-nez p1, :cond_f

    .line 508
    .line 509
    const-string v2, "\u672a\u9009\u62e9 MP3 \u6587\u4ef6"

    .line 510
    .line 511
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 516
    .line 517
    .line 518
    goto :goto_8

    .line 519
    :cond_f
    const-string v2, "\u5df2\u9009\u62e9: "

    .line 520
    .line 521
    invoke-static {v1, v0, v2, p1}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    :goto_8
    invoke-virtual {p0, p1}, Lxj0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    sget-object p0, Ls62;->α:Ls62;

    .line 528
    .line 529
    return-object p0

    .line 530
    :pswitch_5
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v0, Lkl1;

    .line 533
    .line 534
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast p0, Ljava/lang/Throwable;

    .line 537
    .line 538
    check-cast p1, Ljava/lang/Throwable;

    .line 539
    .line 540
    iget-object v1, v0, Lkl1;->γ:Ljava/lang/Object;

    .line 541
    .line 542
    monitor-enter v1

    .line 543
    const/4 v2, 0x0

    .line 544
    if-eqz p0, :cond_11

    .line 545
    .line 546
    if-eqz p1, :cond_12

    .line 547
    .line 548
    :try_start_3
    instance-of v3, p1, Ljava/util/concurrent/CancellationException;

    .line 549
    .line 550
    if-nez v3, :cond_10

    .line 551
    .line 552
    goto :goto_9

    .line 553
    :cond_10
    move-object p1, v2

    .line 554
    :goto_9
    if-eqz p1, :cond_12

    .line 555
    .line 556
    invoke-static {p0, p1}, Lln0;->η(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 557
    .line 558
    .line 559
    goto :goto_a

    .line 560
    :catchall_2
    move-exception p0

    .line 561
    goto :goto_b

    .line 562
    :cond_11
    move-object p0, v2

    .line 563
    :cond_12
    :goto_a
    iput-object p0, v0, Lkl1;->ε:Ljava/lang/Throwable;

    .line 564
    .line 565
    iget-object p0, v0, Lkl1;->φ:Lf02;

    .line 566
    .line 567
    sget-object p1, Lfl1;->ε:Lfl1;

    .line 568
    .line 569
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-virtual {p0, v2, p1}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 573
    .line 574
    .line 575
    monitor-exit v1

    .line 576
    sget-object p0, Ls62;->α:Ls62;

    .line 577
    .line 578
    return-object p0

    .line 579
    :goto_b
    monitor-exit v1

    .line 580
    throw p0

    .line 581
    :pswitch_6
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v0, Lzn;

    .line 584
    .line 585
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast p0, Lc21;

    .line 588
    .line 589
    invoke-virtual {v0, p1}, Lzn;->Α(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    if-eqz p0, :cond_13

    .line 593
    .line 594
    invoke-virtual {p0, p1}, Lc21;->α(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    :cond_13
    sget-object p0, Ls62;->α:Ls62;

    .line 598
    .line 599
    return-object p0

    .line 600
    :pswitch_7
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v0, Landroid/view/View;

    .line 603
    .line 604
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast p0, Landroid/widget/TextView;

    .line 607
    .line 608
    check-cast p1, Landroid/view/ViewGroup;

    .line 609
    .line 610
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    if-eq p1, v0, :cond_14

    .line 614
    .line 615
    invoke-static {p1, v0}, Luj1;->γ(Landroid/view/View;Landroid/view/View;)Z

    .line 616
    .line 617
    .line 618
    move-result v0

    .line 619
    if-eqz v0, :cond_14

    .line 620
    .line 621
    invoke-static {p0, p1}, Luj1;->γ(Landroid/view/View;Landroid/view/View;)Z

    .line 622
    .line 623
    .line 624
    move-result p0

    .line 625
    if-eqz p0, :cond_14

    .line 626
    .line 627
    const/4 p0, 0x1

    .line 628
    goto :goto_c

    .line 629
    :cond_14
    const/4 p0, 0x0

    .line 630
    :goto_c
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 631
    .line 632
    .line 633
    move-result-object p0

    .line 634
    return-object p0

    .line 635
    :pswitch_8
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v0, Lki1;

    .line 638
    .line 639
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast p0, Ljava/lang/ClassLoader;

    .line 642
    .line 643
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 644
    .line 645
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 649
    .line 650
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 651
    .line 652
    .line 653
    sget-object v2, Lki1;->ε:Ljava/util/List;

    .line 654
    .line 655
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 660
    .line 661
    .line 662
    move-result v3

    .line 663
    if-eqz v3, :cond_15

    .line 664
    .line 665
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    check-cast v3, Ljava/lang/String;

    .line 670
    .line 671
    new-instance v4, Lz61;

    .line 672
    .line 673
    const/4 v5, 0x1

    .line 674
    invoke-direct {v4, p1, v5, v3}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    invoke-static {p0, v1, v4}, Lki1;->δ(Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Lp70;)V

    .line 678
    .line 679
    .line 680
    goto :goto_d

    .line 681
    :cond_15
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    if-nez v2, :cond_16

    .line 686
    .line 687
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    check-cast v2, Ljava/lang/Iterable;

    .line 695
    .line 696
    invoke-static {v2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    invoke-virtual {v0, v2}, Lki1;->ν(Ljava/util/List;)Ljava/util/List;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    if-eqz v2, :cond_17

    .line 709
    .line 710
    :cond_16
    new-instance v2, Lη;

    .line 711
    .line 712
    const/16 v3, 0xd

    .line 713
    .line 714
    invoke-direct {v2, v3, p1}, Lη;-><init>(ILjava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    invoke-static {p0, v1, v2}, Lki1;->δ(Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Lp70;)V

    .line 718
    .line 719
    .line 720
    :cond_17
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    if-nez v2, :cond_18

    .line 725
    .line 726
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    check-cast v2, Ljava/lang/Iterable;

    .line 734
    .line 735
    invoke-static {v2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    invoke-virtual {v0, v2}, Lki1;->ν(Ljava/util/List;)Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    if-eqz v2, :cond_19

    .line 748
    .line 749
    :cond_18
    sget-object v2, Lki1;->γ:Ljava/util/List;

    .line 750
    .line 751
    const/4 v3, 0x1

    .line 752
    invoke-static {v2, v3}, Lxh;->Г(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 761
    .line 762
    .line 763
    move-result v3

    .line 764
    if-eqz v3, :cond_19

    .line 765
    .line 766
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    check-cast v3, Ljava/util/List;

    .line 771
    .line 772
    new-instance v4, Lz61;

    .line 773
    .line 774
    const/4 v5, 0x2

    .line 775
    invoke-direct {v4, p1, v5, v3}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    invoke-static {p0, v1, v4}, Lki1;->δ(Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Lp70;)V

    .line 779
    .line 780
    .line 781
    goto :goto_e

    .line 782
    :cond_19
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 783
    .line 784
    .line 785
    move-result-object p0

    .line 786
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    check-cast p0, Ljava/lang/Iterable;

    .line 790
    .line 791
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 792
    .line 793
    .line 794
    move-result-object p0

    .line 795
    invoke-virtual {v0, p0}, Lki1;->ν(Ljava/util/List;)Ljava/util/List;

    .line 796
    .line 797
    .line 798
    move-result-object p0

    .line 799
    return-object p0

    .line 800
    :pswitch_9
    iget-object v0, p0, Lqh1;->ζ:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v0, Lqm1;

    .line 803
    .line 804
    iget-object p0, p0, Lqh1;->η:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast p0, Landroid/view/ViewGroup;

    .line 807
    .line 808
    check-cast p1, Landroid/view/View;

    .line 809
    .line 810
    const-string v1, "comment"

    .line 811
    .line 812
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    iget-boolean v2, v0, Lqm1;->ε:Z

    .line 816
    .line 817
    if-eqz v2, :cond_1a

    .line 818
    .line 819
    goto/16 :goto_12

    .line 820
    .line 821
    :cond_1a
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    if-nez v2, :cond_1b

    .line 826
    .line 827
    goto/16 :goto_12

    .line 828
    .line 829
    :cond_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 838
    .line 839
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    instance-of v3, p1, Landroid/widget/EditText;

    .line 847
    .line 848
    const/4 v4, 0x1

    .line 849
    if-nez v3, :cond_1c

    .line 850
    .line 851
    goto :goto_11

    .line 852
    :cond_1c
    move-object v3, p1

    .line 853
    :goto_f
    if-eqz v3, :cond_1f

    .line 854
    .line 855
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    move-result-object v5

    .line 859
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v5

    .line 863
    invoke-static {v5, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 864
    .line 865
    .line 866
    move-result v5

    .line 867
    if-eqz v5, :cond_1d

    .line 868
    .line 869
    goto :goto_10

    .line 870
    :cond_1d
    if-eq v3, p0, :cond_1f

    .line 871
    .line 872
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    instance-of v5, v3, Landroid/view/View;

    .line 877
    .line 878
    if-eqz v5, :cond_1e

    .line 879
    .line 880
    check-cast v3, Landroid/view/View;

    .line 881
    .line 882
    goto :goto_f

    .line 883
    :cond_1e
    const/4 v3, 0x0

    .line 884
    goto :goto_f

    .line 885
    :cond_1f
    move-object v3, p1

    .line 886
    check-cast v3, Landroid/widget/EditText;

    .line 887
    .line 888
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    int-to-float v5, v5

    .line 893
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 894
    .line 895
    .line 896
    move-result v6

    .line 897
    int-to-float v6, v6

    .line 898
    const v7, 0x3ee66666    # 0.45f

    .line 899
    .line 900
    .line 901
    mul-float/2addr v6, v7

    .line 902
    cmpg-float v5, v5, v6

    .line 903
    .line 904
    if-gez v5, :cond_20

    .line 905
    .line 906
    goto :goto_11

    .line 907
    :cond_20
    const/4 v5, 0x2

    .line 908
    new-array v6, v5, [I

    .line 909
    .line 910
    new-array v7, v5, [I

    .line 911
    .line 912
    invoke-virtual {p0, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {p1, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 916
    .line 917
    .line 918
    aget v7, v7, v4

    .line 919
    .line 920
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 921
    .line 922
    .line 923
    move-result v3

    .line 924
    div-int/2addr v3, v5

    .line 925
    add-int/2addr v3, v7

    .line 926
    aget v5, v6, v4

    .line 927
    .line 928
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 929
    .line 930
    .line 931
    move-result v7

    .line 932
    int-to-float v7, v7

    .line 933
    const v8, 0x3f0ccccd    # 0.55f

    .line 934
    .line 935
    .line 936
    mul-float/2addr v7, v8

    .line 937
    float-to-int v7, v7

    .line 938
    add-int/2addr v5, v7

    .line 939
    aget v6, v6, v4

    .line 940
    .line 941
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 942
    .line 943
    .line 944
    move-result v7

    .line 945
    add-int/2addr v7, v6

    .line 946
    if-gt v5, v3, :cond_21

    .line 947
    .line 948
    if-gt v3, v7, :cond_21

    .line 949
    .line 950
    :goto_10
    iput-boolean v4, v0, Lqm1;->ε:Z

    .line 951
    .line 952
    goto :goto_12

    .line 953
    :cond_21
    :goto_11
    const/4 v3, 0x0

    .line 954
    invoke-static {v2, v1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 955
    .line 956
    .line 957
    move-result v1

    .line 958
    if-eqz v1, :cond_22

    .line 959
    .line 960
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 961
    .line 962
    .line 963
    move-result v1

    .line 964
    int-to-float v1, v1

    .line 965
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    int-to-float v2, v2

    .line 970
    const/high16 v3, 0x3e800000    # 0.25f

    .line 971
    .line 972
    mul-float/2addr v2, v3

    .line 973
    cmpl-float v1, v1, v2

    .line 974
    .line 975
    if-lez v1, :cond_22

    .line 976
    .line 977
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 978
    .line 979
    .line 980
    move-result p1

    .line 981
    int-to-float p1, p1

    .line 982
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 983
    .line 984
    .line 985
    move-result p0

    .line 986
    int-to-float p0, p0

    .line 987
    const v1, 0x3f19999a    # 0.6f

    .line 988
    .line 989
    .line 990
    mul-float/2addr p0, v1

    .line 991
    cmpl-float p0, p1, p0

    .line 992
    .line 993
    if-lez p0, :cond_22

    .line 994
    .line 995
    iput-boolean v4, v0, Lqm1;->ε:Z

    .line 996
    .line 997
    :cond_22
    :goto_12
    sget-object p0, Ls62;->α:Ls62;

    .line 998
    .line 999
    return-object p0

    .line 1000
    nop

    .line 1001
    :pswitch_data_0
    .packed-switch 0x0
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
