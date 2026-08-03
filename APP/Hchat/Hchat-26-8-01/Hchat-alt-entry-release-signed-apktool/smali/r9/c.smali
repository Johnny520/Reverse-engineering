.class public final synthetic Lr9/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lr9/d0;


# direct methods
.method public synthetic constructor <init>(Lr9/d0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr9/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lr9/c;->h:Lr9/d0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lr9/c;->g:I

    .line 2
    .line 3
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr9/c;->h:Lr9/d0;

    .line 12
    .line 13
    iget-object v0, v0, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    const-string v1, "red_packet_details_enable"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    invoke-static {v1, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object p1, v0

    .line 38
    :goto_0
    instance-of v1, p1, Lorg/json/JSONObject;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    check-cast v0, Lorg/json/JSONObject;

    .line 44
    .line 45
    :cond_2
    if-eqz v0, :cond_5

    .line 46
    .line 47
    const-string p1, "totalAmount"

    .line 48
    .line 49
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const-string v1, "totalNum"

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const-string v3, "recNum"

    .line 60
    .line 61
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const-string v4, "recAmount"

    .line 66
    .line 67
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-gtz p1, :cond_3

    .line 72
    .line 73
    if-gtz v1, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    sub-int v4, p1, v2

    .line 77
    .line 78
    int-to-double v4, v4

    .line 79
    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    .line 80
    .line 81
    div-double/2addr v4, v6

    .line 82
    new-instance v8, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v9, "\u91d1\u989d:"

    .line 85
    .line 86
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    int-to-double v9, v2

    .line 90
    div-double/2addr v9, v6

    .line 91
    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const/16 v2, 0x2f

    .line 95
    .line 96
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    int-to-double v9, p1

    .line 100
    div-double/2addr v9, v6

    .line 101
    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, "\u5143\n\u6570\u91cf:"

    .line 105
    .line 106
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-wide/16 v1, 0x0

    .line 119
    .line 120
    cmpl-double p1, v4, v1

    .line 121
    .line 122
    if-lez p1, :cond_4

    .line 123
    .line 124
    const-string p1, "\n\u5269\u4f59:"

    .line 125
    .line 126
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string p1, "\u5143"

    .line 133
    .line 134
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    :cond_4
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string v1, "headTitle"

    .line 142
    .line 143
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    :cond_5
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 147
    .line 148
    return-object p1

    .line 149
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Lr9/c;->h:Lr9/d0;

    .line 153
    .line 154
    iget-object v0, v1, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 155
    .line 156
    const-string v2, "red_packet_details_enable"

    .line 157
    .line 158
    const/4 v3, 0x0

    .line 159
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_6

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_6
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 167
    .line 168
    const/4 v2, 0x0

    .line 169
    if-eqz v0, :cond_7

    .line 170
    .line 171
    invoke-static {v3, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    goto :goto_2

    .line 176
    :cond_7
    move-object v0, v2

    .line 177
    :goto_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 178
    .line 179
    const/4 v4, 0x1

    .line 180
    if-eqz p1, :cond_8

    .line 181
    .line 182
    invoke-static {v4, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    goto :goto_3

    .line 187
    :cond_8
    move-object p1, v2

    .line 188
    :goto_3
    new-instance v5, Ljava/util/IdentityHashMap;

    .line 189
    .line 190
    invoke-direct {v5}, Ljava/util/IdentityHashMap;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    check-cast v5, Ljava/util/Set;

    .line 201
    .line 202
    invoke-static {v3, p1, v5}, Lr9/d0;->w(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-eqz p1, :cond_b

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 209
    .line 210
    .line 211
    move-result-wide v5

    .line 212
    invoke-static {v5, v6}, Lr9/d0;->x(J)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v1, v0, v3}, Lr9/d0;->E0(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    invoke-virtual {v1, v0, v5, v6}, Lr9/d0;->y(Ljava/lang/Object;J)Landroid/widget/TextView;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    if-eqz v7, :cond_9

    .line 225
    .line 226
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    .line 228
    .line 229
    new-instance p1, Lr8/b;

    .line 230
    .line 231
    invoke-direct {p1, v1, v7, v3}, Lr8/b;-><init>(Lr9/d0;Landroid/widget/TextView;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_9
    move v4, p1

    .line 239
    :goto_4
    if-nez v4, :cond_b

    .line 240
    .line 241
    if-eqz v0, :cond_a

    .line 242
    .line 243
    invoke-virtual {v1, v0}, Lr9/d0;->u(Ljava/lang/Object;)Landroid/view/View;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    :cond_a
    move-object p1, v2

    .line 248
    if-eqz p1, :cond_b

    .line 249
    .line 250
    move-object v2, v0

    .line 251
    new-instance v0, Lbb/h;

    .line 252
    .line 253
    move-wide v4, v5

    .line 254
    invoke-direct/range {v0 .. v5}, Lbb/h;-><init>(Lr9/d0;Ljava/lang/Object;Ljava/lang/String;J)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 258
    .line 259
    .line 260
    :cond_b
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 261
    .line 262
    return-object p1

    .line 263
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    const/4 v0, 0x0

    .line 267
    iget-object v1, p0, Lr9/c;->h:Lr9/d0;

    .line 268
    .line 269
    iget-object v1, v1, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 270
    .line 271
    const-string v2, "red_packet_details_enable"

    .line 272
    .line 273
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-nez v0, :cond_c

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_c
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 281
    .line 282
    const/4 v1, 0x0

    .line 283
    if-eqz v0, :cond_d

    .line 284
    .line 285
    const/4 v2, 0x1

    .line 286
    invoke-static {v2, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    goto :goto_6

    .line 291
    :cond_d
    move-object v0, v1

    .line 292
    :goto_6
    instance-of v2, v0, Ljava/lang/Number;

    .line 293
    .line 294
    if-eqz v2, :cond_e

    .line 295
    .line 296
    check-cast v0, Ljava/lang/Number;

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_e
    move-object v0, v1

    .line 300
    :goto_7
    if-eqz v0, :cond_10

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 303
    .line 304
    .line 305
    move-result-wide v2

    .line 306
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    sget-object v4, Lr9/d0;->K:Llg/f;

    .line 311
    .line 312
    iget-wide v5, v4, Llg/f;->g:J

    .line 313
    .line 314
    iget-wide v7, v4, Llg/f;->h:J

    .line 315
    .line 316
    cmp-long v4, v2, v7

    .line 317
    .line 318
    if-gtz v4, :cond_f

    .line 319
    .line 320
    cmp-long v2, v5, v2

    .line 321
    .line 322
    if-gtz v2, :cond_f

    .line 323
    .line 324
    move-object v1, v0

    .line 325
    :cond_f
    if-eqz v1, :cond_10

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 328
    .line 329
    .line 330
    move-result-wide v0

    .line 331
    invoke-static {v0, v1}, Lr9/d0;->x(J)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :cond_10
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 339
    .line 340
    return-object p1

    .line 341
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    const/4 v0, 0x0

    .line 345
    iget-object v1, p0, Lr9/c;->h:Lr9/d0;

    .line 346
    .line 347
    iget-object v1, v1, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 348
    .line 349
    const-string v2, "skip_web_risk_enable"

    .line 350
    .line 351
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-eqz v0, :cond_11

    .line 356
    .line 357
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 358
    .line 359
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 363
    .line 364
    return-object p1

    .line 365
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    const/4 v0, 0x0

    .line 369
    iget-object v1, p0, Lr9/c;->h:Lr9/d0;

    .line 370
    .line 371
    iget-object v1, v1, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 372
    .line 373
    const-string v2, "skip_web_risk_enable"

    .line 374
    .line 375
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_12

    .line 380
    .line 381
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 382
    .line 383
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    :cond_12
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 387
    .line 388
    return-object p1

    .line 389
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 393
    .line 394
    instance-of v1, v0, Landroid/app/Activity;

    .line 395
    .line 396
    const/4 v2, 0x0

    .line 397
    if-eqz v1, :cond_13

    .line 398
    .line 399
    check-cast v0, Landroid/app/Activity;

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_13
    move-object v0, v2

    .line 403
    :goto_9
    if-eqz v0, :cond_1c

    .line 404
    .line 405
    const-string v1, "group_member_history_enable"

    .line 406
    .line 407
    iget-object v3, p0, Lr9/c;->h:Lr9/d0;

    .line 408
    .line 409
    iget-object v4, v3, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 410
    .line 411
    const/4 v5, 0x0

    .line 412
    invoke-interface {v4, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-nez v1, :cond_14

    .line 417
    .line 418
    goto :goto_f

    .line 419
    :cond_14
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 420
    .line 421
    const-string v4, "\u5386\u53f2\u53d1\u8a00\u8bb0\u5f55"

    .line 422
    .line 423
    const-string v6, "hchat_group_member_history"

    .line 424
    .line 425
    if-eqz v1, :cond_15

    .line 426
    .line 427
    const/4 v7, 0x1

    .line 428
    invoke-static {v7, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    if-eqz v7, :cond_15

    .line 433
    .line 434
    invoke-static {v7}, Lr9/d0;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v8

    .line 438
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v8

    .line 442
    if-nez v8, :cond_16

    .line 443
    .line 444
    invoke-static {v7}, Lr9/d0;->k0(Ljava/lang/Object;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v8

    .line 448
    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    if-eqz v8, :cond_15

    .line 453
    .line 454
    goto :goto_a

    .line 455
    :cond_15
    move-object v7, v2

    .line 456
    :cond_16
    :goto_a
    if-eqz v7, :cond_17

    .line 457
    .line 458
    move-object v2, v7

    .line 459
    goto :goto_e

    .line 460
    :cond_17
    if-eqz v1, :cond_1b

    .line 461
    .line 462
    array-length v7, v1

    .line 463
    :goto_b
    if-ge v5, v7, :cond_1b

    .line 464
    .line 465
    aget-object v8, v1, v5

    .line 466
    .line 467
    if-nez v8, :cond_18

    .line 468
    .line 469
    goto :goto_c

    .line 470
    :cond_18
    invoke-static {v8}, Lr9/d0;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v9

    .line 478
    if-nez v9, :cond_1a

    .line 479
    .line 480
    invoke-static {v8}, Lr9/d0;->k0(Ljava/lang/Object;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v9

    .line 484
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v9

    .line 488
    if-eqz v9, :cond_19

    .line 489
    .line 490
    goto :goto_d

    .line 491
    :cond_19
    :goto_c
    add-int/lit8 v5, v5, 0x1

    .line 492
    .line 493
    goto :goto_b

    .line 494
    :cond_1a
    :goto_d
    move-object v2, v8

    .line 495
    :cond_1b
    :goto_e
    if-eqz v2, :cond_1c

    .line 496
    .line 497
    invoke-virtual {v3, v0}, Lr9/d0;->e0(Landroid/app/Activity;)V

    .line 498
    .line 499
    .line 500
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 501
    .line 502
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    :cond_1c
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 506
    .line 507
    return-object p1

    .line 508
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 512
    .line 513
    instance-of v0, p1, Landroid/app/Activity;

    .line 514
    .line 515
    const/4 v1, 0x0

    .line 516
    if-eqz v0, :cond_1d

    .line 517
    .line 518
    check-cast p1, Landroid/app/Activity;

    .line 519
    .line 520
    goto :goto_10

    .line 521
    :cond_1d
    move-object p1, v1

    .line 522
    :goto_10
    if-eqz p1, :cond_23

    .line 523
    .line 524
    const/4 v0, 0x0

    .line 525
    iget-object v2, p0, Lr9/c;->h:Lr9/d0;

    .line 526
    .line 527
    iget-object v3, v2, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 528
    .line 529
    const-string v4, "group_member_history_enable"

    .line 530
    .line 531
    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    if-nez v0, :cond_1e

    .line 536
    .line 537
    goto :goto_14

    .line 538
    :cond_1e
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    if-eqz v0, :cond_1f

    .line 543
    .line 544
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    goto :goto_11

    .line 549
    :cond_1f
    move-object v0, v1

    .line 550
    :goto_11
    instance-of v3, v0, Landroid/view/ViewGroup;

    .line 551
    .line 552
    if-eqz v3, :cond_20

    .line 553
    .line 554
    check-cast v0, Landroid/view/ViewGroup;

    .line 555
    .line 556
    goto :goto_12

    .line 557
    :cond_20
    move-object v0, v1

    .line 558
    :goto_12
    invoke-static {v0}, Lr9/d0;->r(Landroid/view/ViewGroup;)Landroid/widget/ListView;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    if-eqz v0, :cond_21

    .line 563
    .line 564
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    goto :goto_13

    .line 569
    :cond_21
    move-object v0, v1

    .line 570
    :goto_13
    if-eqz v0, :cond_22

    .line 571
    .line 572
    invoke-virtual {v2, p1, v0}, Lr9/d0;->D(Landroid/app/Activity;Landroid/widget/ListAdapter;)Z

    .line 573
    .line 574
    .line 575
    move-result v0

    .line 576
    if-eqz v0, :cond_22

    .line 577
    .line 578
    goto :goto_14

    .line 579
    :cond_22
    invoke-virtual {v2, p1, v1}, Lr9/d0;->D(Landroid/app/Activity;Landroid/widget/ListAdapter;)Z

    .line 580
    .line 581
    .line 582
    :cond_23
    :goto_14
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 583
    .line 584
    return-object p1

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
