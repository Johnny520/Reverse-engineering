.class public final synthetic Ldd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ldd0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ldd0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldd0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ldd0;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 9

    .line 1
    iget p1, p0, Ldd0;->ε:I

    .line 2
    .line 3
    const/4 p2, 0x7

    .line 4
    const/4 v0, 0x0

    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldd0;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Landroid/widget/EditText;

    .line 11
    .line 12
    iget-object p2, p0, Ldd0;->η:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Landroid/app/Activity;

    .line 15
    .line 16
    iget-object p0, p0, Ldd0;->θ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lty1;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object p1, v1

    .line 33
    :goto_0
    if-nez p1, :cond_1

    .line 34
    .line 35
    const-string p1, ""

    .line 36
    .line 37
    :cond_1
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    const-string p0, "\u5206\u7ec4\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a"

    .line 52
    .line 53
    invoke-static {p2, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    sget-object v2, Lry1;->α:Lry1;

    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const-string v4, "group_"

    .line 68
    .line 69
    invoke-static {v2, v3, v4}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v3, Lmy1;

    .line 74
    .line 75
    const/16 v4, 0xff

    .line 76
    .line 77
    invoke-direct {v3, v4, v1, v1}, Lmy1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v1, "follow"

    .line 81
    .line 82
    new-instance v4, Lrd;

    .line 83
    .line 84
    invoke-direct {v4}, Lrd;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-static {v2, p1, v3, v1, v4}, Lry1;->Щ(Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Lrd;)Ls62;

    .line 88
    .line 89
    .line 90
    const-string p1, "\u5206\u7ec4\u5df2\u521b\u5efa"

    .line 91
    .line 92
    invoke-static {p2, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lty1;->invoke()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :goto_1
    return-void

    .line 103
    :pswitch_0
    iget-object p1, p0, Ldd0;->ζ:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Lgz1;

    .line 106
    .line 107
    iget-object p2, p0, Ldd0;->η:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p2, Landroid/app/Activity;

    .line 110
    .line 111
    iget-object p0, p0, Ldd0;->θ:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, Lcu1;

    .line 114
    .line 115
    sget-object v1, Lry1;->α:Lry1;

    .line 116
    .line 117
    iget-object p1, p1, Lgz1;->α:Ljava/lang/String;

    .line 118
    .line 119
    const-string v1, "spark_person_group_order_v1"

    .line 120
    .line 121
    const-string v2, "spark_person_groups_v1"

    .line 122
    .line 123
    const-string v3, "spark_message_groups_v1"

    .line 124
    .line 125
    const-string v4, "{}"

    .line 126
    .line 127
    invoke-static {}, Lui1;->Α()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-nez v5, :cond_3

    .line 132
    .line 133
    goto/16 :goto_7

    .line 134
    .line 135
    :cond_3
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-nez v6, :cond_c

    .line 148
    .line 149
    const-string v6, "default"

    .line 150
    .line 151
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-eqz v6, :cond_4

    .line 156
    .line 157
    goto/16 :goto_7

    .line 158
    .line 159
    :cond_4
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 160
    .line 161
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :catchall_0
    move-exception v6

    .line 170
    new-instance v7, Leo1;

    .line 171
    .line 172
    invoke-direct {v7, v6}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    move-object v6, v7

    .line 176
    :goto_2
    new-instance v7, Lorg/json/JSONObject;

    .line 177
    .line 178
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 179
    .line 180
    .line 181
    instance-of v8, v6, Leo1;

    .line 182
    .line 183
    if-eqz v8, :cond_5

    .line 184
    .line 185
    move-object v6, v7

    .line 186
    :cond_5
    check-cast v6, Lorg/json/JSONObject;

    .line 187
    .line 188
    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    sget-object v7, Lui1;->α:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-static {v3, v6}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 204
    .line 205
    invoke-static {v2, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-direct {v3, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :catchall_1
    move-exception v3

    .line 214
    new-instance v6, Leo1;

    .line 215
    .line 216
    invoke-direct {v6, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    move-object v3, v6

    .line 220
    :goto_3
    new-instance v6, Lorg/json/JSONObject;

    .line 221
    .line 222
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 223
    .line 224
    .line 225
    instance-of v7, v3, Leo1;

    .line 226
    .line 227
    if-eqz v7, :cond_6

    .line 228
    .line 229
    move-object v3, v6

    .line 230
    :cond_6
    check-cast v3, Lorg/json/JSONObject;

    .line 231
    .line 232
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {v6}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    invoke-static {v6}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    :cond_7
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-eqz v7, :cond_8

    .line 256
    .line 257
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-static {v8, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-eqz v8, :cond_7

    .line 272
    .line 273
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_8
    sget-object v6, Lui1;->α:Ljava/lang/Object;

    .line 278
    .line 279
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-static {v2, v3}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :try_start_2
    new-instance v2, Lorg/json/JSONObject;

    .line 290
    .line 291
    invoke-static {v1, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 296
    .line 297
    .line 298
    goto :goto_5

    .line 299
    :catchall_2
    move-exception v2

    .line 300
    new-instance v3, Leo1;

    .line 301
    .line 302
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 303
    .line 304
    .line 305
    move-object v2, v3

    .line 306
    :goto_5
    new-instance v3, Lorg/json/JSONObject;

    .line 307
    .line 308
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 309
    .line 310
    .line 311
    instance-of v4, v2, Leo1;

    .line 312
    .line 313
    if-eqz v4, :cond_9

    .line 314
    .line 315
    move-object v2, v3

    .line 316
    :cond_9
    check-cast v2, Lorg/json/JSONObject;

    .line 317
    .line 318
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    sget-object v3, Lui1;->α:Ljava/lang/Object;

    .line 322
    .line 323
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-static {v1, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    const-string v1, "spark_group_order_v1"

    .line 334
    .line 335
    sget-object v2, Lry1;->α:Lry1;

    .line 336
    .line 337
    invoke-static {}, Lry1;->М()Ljava/util/ArrayList;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    new-instance v3, Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    :cond_a
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-eqz v4, :cond_b

    .line 355
    .line 356
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    move-object v6, v4

    .line 361
    check-cast v6, Ljava/lang/String;

    .line 362
    .line 363
    invoke-static {v6, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    if-nez v6, :cond_a

    .line 368
    .line 369
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_b
    new-instance v2, Lorg/json/JSONArray;

    .line 374
    .line 375
    invoke-direct {v2, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-static {v1, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    :cond_c
    :goto_7
    sget-object v1, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 389
    .line 390
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    const-string p1, "\u5206\u7ec4\u5df2\u5220\u9664"

    .line 394
    .line 395
    invoke-static {p2, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0}, Lcu1;->invoke()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :pswitch_1
    iget-object p1, p0, Ldd0;->ζ:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p1, Lxd0;

    .line 409
    .line 410
    iget-object v1, p0, Ldd0;->η:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v1, Landroid/widget/ImageView;

    .line 413
    .line 414
    iget-object p0, p0, Ldd0;->θ:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast p0, Ljava/lang/String;

    .line 417
    .line 418
    sget-object v2, Lbe0;->α:Lbe0;

    .line 419
    .line 420
    invoke-virtual {v2, p1}, Lbe0;->α(Lxd0;)Lyd0;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 425
    .line 426
    .line 427
    move-result p1

    .line 428
    if-eqz p1, :cond_10

    .line 429
    .line 430
    const/4 v2, 0x1

    .line 431
    if-eq p1, v2, :cond_10

    .line 432
    .line 433
    const/4 p0, 0x4

    .line 434
    if-eq p1, p0, :cond_f

    .line 435
    .line 436
    const/4 p0, 0x5

    .line 437
    if-eq p1, p0, :cond_e

    .line 438
    .line 439
    if-eq p1, p2, :cond_d

    .line 440
    .line 441
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    const-string p1, "\u65e0\u6cd5\u8bc6\u522b\u8054\u7cfb\u4eba\u8eab\u4efd"

    .line 446
    .line 447
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 452
    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_d
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    const-string p1, "\u9690\u85cf\u540d\u5355\u4fdd\u5b58\u5931\u8d25"

    .line 460
    .line 461
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 466
    .line 467
    .line 468
    goto :goto_8

    .line 469
    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    const-string p1, "\u5f53\u524d\u8d26\u53f7\u5c1a\u672a\u8bc6\u522b"

    .line 474
    .line 475
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 480
    .line 481
    .line 482
    goto :goto_8

    .line 483
    :cond_f
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    const-string p1, "\u8be5\u8054\u7cfb\u4eba\u5df2\u9690\u85cf"

    .line 488
    .line 489
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 494
    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_10
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    const-string p2, "\u5df2\u9690\u85cf "

    .line 502
    .line 503
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 512
    .line 513
    .line 514
    :goto_8
    return-void

    .line 515
    :pswitch_2
    iget-object p1, p0, Ldd0;->ζ:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast p1, Landroid/app/Activity;

    .line 518
    .line 519
    iget-object p2, p0, Ldd0;->η:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast p2, Lxg1;

    .line 522
    .line 523
    iget-object p0, p0, Ldd0;->θ:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast p0, Landroid/net/Uri;

    .line 526
    .line 527
    const-string v0, "\u6b63\u5728\u53d1\u9001 SAF \u56fe\u7247"

    .line 528
    .line 529
    new-instance v1, Lz7;

    .line 530
    .line 531
    const/16 v2, 0xd

    .line 532
    .line 533
    invoke-direct {v1, p1, p2, p0, v2}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 534
    .line 535
    .line 536
    invoke-static {p1, v0, v1}, Lwg1;->β(Landroid/app/Activity;Ljava/lang/String;Lp70;)V

    .line 537
    .line 538
    .line 539
    return-void

    .line 540
    :pswitch_3
    iget-object p1, p0, Ldd0;->ζ:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast p1, Landroid/app/Activity;

    .line 543
    .line 544
    iget-object p2, p0, Ldd0;->η:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast p2, Lyg1;

    .line 547
    .line 548
    iget-object p0, p0, Ldd0;->θ:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast p0, Landroid/widget/EditText;

    .line 551
    .line 552
    const-string v0, "\u6b63\u5728\u6309\u4efb\u52a1\u6570\u91cf\u53d1\u9001\u6587\u672c"

    .line 553
    .line 554
    new-instance v1, Lz7;

    .line 555
    .line 556
    const/16 v2, 0xc

    .line 557
    .line 558
    invoke-direct {v1, p1, p2, p0, v2}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 559
    .line 560
    .line 561
    invoke-static {p1, v0, v1}, Lwg1;->β(Landroid/app/Activity;Ljava/lang/String;Lp70;)V

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :pswitch_4
    iget-object p1, p0, Ldd0;->ζ:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast p1, Lxd0;

    .line 568
    .line 569
    iget-object v1, p0, Ldd0;->η:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v1, Lnd0;

    .line 572
    .line 573
    iget-object p0, p0, Ldd0;->θ:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast p0, Ljava/lang/String;

    .line 576
    .line 577
    sget-object v2, Lbe0;->α:Lbe0;

    .line 578
    .line 579
    monitor-enter v2

    .line 580
    :try_start_3
    invoke-virtual {v2}, Lbe0;->ε()V

    .line 581
    .line 582
    .line 583
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    if-nez v3, :cond_11

    .line 592
    .line 593
    sget-object p1, Lyd0;->κ:Lyd0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 594
    .line 595
    monitor-exit v2

    .line 596
    goto :goto_a

    .line 597
    :catchall_3
    move-exception p0

    .line 598
    goto :goto_c

    .line 599
    :cond_11
    :try_start_4
    invoke-virtual {v2}, Lbe0;->ξ()Ljava/util/List;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    new-instance v4, Ljava/util/ArrayList;

    .line 604
    .line 605
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 606
    .line 607
    .line 608
    new-instance v3, Lθ;

    .line 609
    .line 610
    const/16 v5, 0x10

    .line 611
    .line 612
    invoke-direct {v3, v5, p1}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    invoke-static {v4, v3}, Lxh;->Ч(Ljava/util/List;La80;)Z

    .line 616
    .line 617
    .line 618
    move-result p1

    .line 619
    if-nez p1, :cond_12

    .line 620
    .line 621
    sget-object p1, Lyd0;->ι:Lyd0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 622
    .line 623
    monitor-exit v2

    .line 624
    goto :goto_a

    .line 625
    :cond_12
    :try_start_5
    const-string p1, "remove"

    .line 626
    .line 627
    invoke-virtual {v2, p1, v4}, Lbe0;->ν(Ljava/lang/String;Ljava/util/List;)Z

    .line 628
    .line 629
    .line 630
    move-result p1

    .line 631
    if-eqz p1, :cond_13

    .line 632
    .line 633
    sget-object p1, Lyd0;->η:Lyd0;

    .line 634
    .line 635
    goto :goto_9

    .line 636
    :cond_13
    sget-object p1, Lyd0;->μ:Lyd0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 637
    .line 638
    :goto_9
    monitor-exit v2

    .line 639
    :goto_a
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 640
    .line 641
    .line 642
    move-result p1

    .line 643
    const/4 v2, 0x2

    .line 644
    if-eq p1, v2, :cond_15

    .line 645
    .line 646
    if-eq p1, p2, :cond_14

    .line 647
    .line 648
    invoke-virtual {v1}, Lnd0;->ε()V

    .line 649
    .line 650
    .line 651
    goto :goto_b

    .line 652
    :cond_14
    iget-object p0, v1, Lnd0;->α:Landroid/app/Activity;

    .line 653
    .line 654
    const-string p1, "\u9690\u85cf\u540d\u5355\u4fdd\u5b58\u5931\u8d25"

    .line 655
    .line 656
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 657
    .line 658
    .line 659
    move-result-object p0

    .line 660
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 661
    .line 662
    .line 663
    goto :goto_b

    .line 664
    :cond_15
    invoke-virtual {v1}, Lnd0;->ε()V

    .line 665
    .line 666
    .line 667
    iget-object p1, v1, Lnd0;->α:Landroid/app/Activity;

    .line 668
    .line 669
    const-string p2, "\u5df2\u6062\u590d "

    .line 670
    .line 671
    invoke-static {v0, p1, p2, p0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    :goto_b
    return-void

    .line 675
    :goto_c
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 676
    throw p0

    .line 677
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
