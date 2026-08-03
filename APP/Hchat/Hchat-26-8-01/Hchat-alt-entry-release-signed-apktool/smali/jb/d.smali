.class public final Ljb/d;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljb/e;


# direct methods
.method public synthetic constructor <init>(Ljb/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljb/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ljb/d;->b:Ljb/e;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    iget v0, p0, Ljb/d;->a:I

    .line 2
    .line 3
    const v1, 0x48434602    # 199960.03f

    .line 4
    .line 5
    .line 6
    const v2, 0x48434601    # 199960.02f

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    iget-object v5, p0, Ljb/d;->b:Ljb/e;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    array-length v0, p1

    .line 27
    :goto_0
    if-ge v3, v0, :cond_1

    .line 28
    .line 29
    aget-object v6, p1, v3

    .line 30
    .line 31
    instance-of v7, v6, Landroid/view/ContextMenu;

    .line 32
    .line 33
    if-eqz v7, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v6, v4

    .line 40
    :goto_1
    instance-of p1, v6, Landroid/view/ContextMenu;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    move-object v4, v6

    .line 45
    check-cast v4, Landroid/view/ContextMenu;

    .line 46
    .line 47
    :cond_2
    if-eqz v4, :cond_3

    .line 48
    .line 49
    :try_start_0
    const-string p1, "\u590d\u5236\u94fe\u63a5"

    .line 50
    .line 51
    const v0, 0x7f050006

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v4, v2, p1, v0}, Ljb/e;->a(Landroid/view/ContextMenu;ILjava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    const-string p1, "\u4e0b\u8f7d\u89c6\u9891"

    .line 58
    .line 59
    const v0, 0x7f050007

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v4, v1, p1, v0}, Ljb/e;->a(Landroid/view/ContextMenu;ILjava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object p1, v0

    .line 70
    new-instance v0, Lsf/f;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object p1, v0

    .line 76
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    iget-object v0, v5, Ljb/e;->b:Lia/t;

    .line 83
    .line 84
    const-string v1, "\u89c6\u9891\u53f7\u83dc\u5355\u6ce8\u5165\u5931\u8d25"

    .line 85
    .line 86
    invoke-virtual {v0, v1, p1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void

    .line 90
    :pswitch_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    array-length v6, v0

    .line 98
    move v7, v3

    .line 99
    :goto_3
    if-ge v7, v6, :cond_5

    .line 100
    .line 101
    aget-object v8, v0, v7

    .line 102
    .line 103
    instance-of v9, v8, Landroid/view/MenuItem;

    .line 104
    .line 105
    if-eqz v9, :cond_4

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    move-object v8, v4

    .line 112
    :goto_4
    instance-of v0, v8, Landroid/view/MenuItem;

    .line 113
    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    check-cast v8, Landroid/view/MenuItem;

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_6
    move-object v8, v4

    .line 120
    :goto_5
    if-eqz v8, :cond_22

    .line 121
    .line 122
    invoke-interface {v8}, Landroid/view/MenuItem;->getItemId()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eq v0, v2, :cond_7

    .line 127
    .line 128
    invoke-interface {v8}, Landroid/view/MenuItem;->getItemId()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eq v0, v1, :cond_7

    .line 133
    .line 134
    goto/16 :goto_15

    .line 135
    .line 136
    :cond_7
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 137
    .line 138
    if-eqz v0, :cond_9

    .line 139
    .line 140
    invoke-static {v3, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_9

    .line 145
    .line 146
    invoke-static {v0}, Ljb/e;->e(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_8
    move-object v0, v4

    .line 154
    :goto_6
    if-eqz v0, :cond_9

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_9
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 158
    .line 159
    if-eqz v0, :cond_b

    .line 160
    .line 161
    array-length v1, v0

    .line 162
    move v6, v3

    .line 163
    :goto_7
    if-ge v6, v1, :cond_b

    .line 164
    .line 165
    aget-object v7, v0, v6

    .line 166
    .line 167
    invoke-static {v7}, Ljb/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    if-eqz v7, :cond_a

    .line 172
    .line 173
    move-object v0, v7

    .line 174
    goto :goto_8

    .line 175
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_b
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-static {v0}, Ljb/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :goto_8
    if-eqz v0, :cond_21

    .line 185
    .line 186
    const-string v1, "feedObject"

    .line 187
    .line 188
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-eqz v0, :cond_11

    .line 193
    .line 194
    const-string v1, "getMediaType"

    .line 195
    .line 196
    new-array v6, v3, [Ljava/lang/Object;

    .line 197
    .line 198
    invoke-static {v0, v1, v6}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    instance-of v6, v1, Ljava/lang/Number;

    .line 203
    .line 204
    if-eqz v6, :cond_c

    .line 205
    .line 206
    check-cast v1, Ljava/lang/Number;

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_c
    move-object v1, v4

    .line 210
    :goto_9
    if-eqz v1, :cond_11

    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    const-string v6, "getMediaList"

    .line 217
    .line 218
    new-array v7, v3, [Ljava/lang/Object;

    .line 219
    .line 220
    invoke-static {v0, v6, v7}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    instance-of v6, v0, Ljava/util/LinkedList;

    .line 225
    .line 226
    if-eqz v6, :cond_d

    .line 227
    .line 228
    check-cast v0, Ljava/util/LinkedList;

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_d
    move-object v0, v4

    .line 232
    :goto_a
    if-eqz v0, :cond_11

    .line 233
    .line 234
    new-instance v6, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    :cond_e
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    if-eqz v7, :cond_10

    .line 248
    .line 249
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    const-string v9, "toJSON"

    .line 254
    .line 255
    new-array v10, v3, [Ljava/lang/Object;

    .line 256
    .line 257
    invoke-static {v7, v9, v10}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    instance-of v9, v7, Lorg/json/JSONObject;

    .line 262
    .line 263
    if-eqz v9, :cond_f

    .line 264
    .line 265
    check-cast v7, Lorg/json/JSONObject;

    .line 266
    .line 267
    goto :goto_c

    .line 268
    :cond_f
    move-object v7, v4

    .line 269
    :goto_c
    if-eqz v7, :cond_e

    .line 270
    .line 271
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_b

    .line 275
    :cond_10
    new-instance v0, Ljb/c;

    .line 276
    .line 277
    invoke-direct {v0, v1, v6}, Ljb/c;-><init>(ILjava/util/ArrayList;)V

    .line 278
    .line 279
    .line 280
    goto :goto_d

    .line 281
    :cond_11
    move-object v0, v4

    .line 282
    :goto_d
    if-nez v0, :cond_12

    .line 283
    .line 284
    const-string v0, "\u672a\u89e3\u6790\u5230\u89c6\u9891\u53f7\u5a92\u4f53"

    .line 285
    .line 286
    invoke-virtual {v5, v0}, Ljb/e;->k(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_15

    .line 293
    .line 294
    :cond_12
    iget-object v1, v0, Ljb/c;->b:Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-interface {v8}, Landroid/view/MenuItem;->getItemId()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    iget v0, v0, Ljb/c;->a:I

    .line 301
    .line 302
    const/4 v6, 0x4

    .line 303
    const/4 v7, 0x2

    .line 304
    if-ne v3, v2, :cond_1d

    .line 305
    .line 306
    if-eq v0, v7, :cond_17

    .line 307
    .line 308
    const-string v2, ""

    .line 309
    .line 310
    if-eq v0, v6, :cond_13

    .line 311
    .line 312
    goto/16 :goto_12

    .line 313
    .line 314
    :cond_13
    invoke-static {v1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, Lorg/json/JSONObject;

    .line 319
    .line 320
    invoke-static {v0}, Ljb/e;->i(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-nez v3, :cond_14

    .line 329
    .line 330
    const-string v0, "\u94fe\u63a5: "

    .line 331
    .line 332
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    :goto_e
    move-object v2, v0

    .line 337
    goto :goto_12

    .line 338
    :cond_14
    invoke-static {v0}, Ljb/e;->d(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    const-string v3, "\u5bc6\u94fe: "

    .line 343
    .line 344
    invoke-static {v3, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    if-eqz v0, :cond_15

    .line 349
    .line 350
    const-string v3, "decodeKey"

    .line 351
    .line 352
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    goto :goto_f

    .line 357
    :cond_15
    move-object v0, v4

    .line 358
    :goto_f
    if-nez v0, :cond_16

    .line 359
    .line 360
    goto :goto_10

    .line 361
    :cond_16
    move-object v2, v0

    .line 362
    :goto_10
    const-string v0, "\u5bc6\u94a5: "

    .line 363
    .line 364
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    const/4 v10, 0x0

    .line 377
    const/16 v11, 0x3e

    .line 378
    .line 379
    const-string v7, "\n"

    .line 380
    .line 381
    const/4 v8, 0x0

    .line 382
    const/4 v9, 0x0

    .line 383
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    goto :goto_e

    .line 388
    :cond_17
    new-instance v6, Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    :cond_18
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-eqz v1, :cond_19

    .line 402
    .line 403
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    check-cast v1, Lorg/json/JSONObject;

    .line 408
    .line 409
    invoke-static {v1}, Ljb/e;->d(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    if-eqz v1, :cond_18

    .line 414
    .line 415
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    goto :goto_11

    .line 419
    :cond_19
    const/4 v10, 0x0

    .line 420
    const/16 v11, 0x3e

    .line 421
    .line 422
    const-string v7, "\n"

    .line 423
    .line 424
    const/4 v8, 0x0

    .line 425
    const/4 v9, 0x0

    .line 426
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    :goto_12
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-eqz v0, :cond_1a

    .line 435
    .line 436
    const-string v0, "\u672a\u77e5\u7684\u5a92\u4f53\u7c7b\u578b\uff0c\u65e0\u6cd5\u590d\u5236"

    .line 437
    .line 438
    invoke-virtual {v5, v0}, Ljb/e;->k(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    goto :goto_14

    .line 442
    :cond_1a
    iget-object v0, v5, Ljb/e;->a:Lr8/g;

    .line 443
    .line 444
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 445
    .line 446
    const-string v1, "clipboard"

    .line 447
    .line 448
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    instance-of v1, v0, Landroid/content/ClipboardManager;

    .line 453
    .line 454
    if-eqz v1, :cond_1b

    .line 455
    .line 456
    check-cast v0, Landroid/content/ClipboardManager;

    .line 457
    .line 458
    goto :goto_13

    .line 459
    :cond_1b
    move-object v0, v4

    .line 460
    :goto_13
    if-eqz v0, :cond_1c

    .line 461
    .line 462
    const-string v1, "Hchat Finder Media"

    .line 463
    .line 464
    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 469
    .line 470
    .line 471
    :cond_1c
    const-string v0, "\u5df2\u590d\u5236"

    .line 472
    .line 473
    invoke-virtual {v5, v0}, Ljb/e;->k(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    goto :goto_14

    .line 477
    :cond_1d
    if-eq v0, v7, :cond_20

    .line 478
    .line 479
    if-eq v0, v6, :cond_1e

    .line 480
    .line 481
    const-string v0, "\u672a\u77e5\u7684\u5a92\u4f53\u7c7b\u578b\uff0c\u65e0\u6cd5\u4e0b\u8f7d"

    .line 482
    .line 483
    invoke-virtual {v5, v0}, Ljb/e;->k(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    goto :goto_14

    .line 487
    :cond_1e
    invoke-static {v1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    check-cast v0, Lorg/json/JSONObject;

    .line 492
    .line 493
    if-nez v0, :cond_1f

    .line 494
    .line 495
    const-string v0, "\u672a\u627e\u5230\u89c6\u9891"

    .line 496
    .line 497
    invoke-virtual {v5, v0}, Ljb/e;->k(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    goto :goto_14

    .line 501
    :cond_1f
    new-instance v1, Ljava/lang/Thread;

    .line 502
    .line 503
    new-instance v2, La1/d;

    .line 504
    .line 505
    const/16 v3, 0x13

    .line 506
    .line 507
    invoke-direct {v2, v5, v3, v0}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    const-string v0, "Hchat-FinderVideoDownload"

    .line 511
    .line 512
    invoke-direct {v1, v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 516
    .line 517
    .line 518
    goto :goto_14

    .line 519
    :cond_20
    new-instance v0, Ljava/lang/Thread;

    .line 520
    .line 521
    new-instance v2, La1/d;

    .line 522
    .line 523
    const/16 v3, 0x14

    .line 524
    .line 525
    invoke-direct {v2, v1, v3, v5}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    const-string v1, "Hchat-FinderImageDownload"

    .line 529
    .line 530
    invoke-direct {v0, v2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 534
    .line 535
    .line 536
    :goto_14
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    goto :goto_15

    .line 540
    :cond_21
    const-string v0, "\u672a\u627e\u5230\u89c6\u9891\u53f7\u5a92\u4f53"

    .line 541
    .line 542
    invoke-virtual {v5, v0}, Ljb/e;->k(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :cond_22
    :goto_15
    return-void

    .line 549
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
