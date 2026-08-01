.class public final synthetic Lzk0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lf8;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lf8;I)V
    .locals 0

    .line 12
    iput p3, p0, Lzk0;->ε:I

    iput-object p1, p0, Lzk0;->ζ:Landroid/app/Activity;

    iput-object p2, p0, Lzk0;->η:Lf8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lf8;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lzk0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzk0;->η:Lf8;

    .line 8
    .line 9
    iput-object p2, p0, Lzk0;->ζ:Landroid/app/Activity;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lzk0;->ε:I

    .line 4
    .line 5
    const-string v2, "DYHelper"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, Lzk0;->ζ:Landroid/app/Activity;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, Lzk0;->η:Lf8;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const-string v0, "\u672a\u627e\u5230 8K/4K \u539f\u753b\u8d28\uff0c\u6539\u7528\u666e\u901a\u89c6\u9891\u4e0b\u8f7d"

    .line 18
    .line 19
    invoke-static {v4, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lqy0;->α:Lqy0;

    .line 27
    .line 28
    invoke-virtual {v0, v4, v6, v3}, Lqy0;->Π(Landroid/app/Activity;Lf8;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 33
    .line 34
    invoke-direct {v0, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "\u672a\u627e\u5230\u65e0\u6c34\u5370\u8d44\u6e90"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, v6, Lf8;->Ι:Ljava/lang/String;

    .line 44
    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    const-string v1, "\u672a\u77e5"

    .line 48
    .line 49
    :cond_0
    iget-object v2, v6, Lf8;->Ν:Ljava/util/List;

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v2, v7

    .line 59
    :goto_0
    iget-object v4, v6, Lf8;->Η:Ljava/util/List;

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v4, v7

    .line 69
    :goto_1
    iget-object v5, v6, Lf8;->δ:Ljava/util/List;

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    :cond_3
    const-string v5, "\n\u89c6\u9891\u5019\u9009\u6570\uff1a"

    .line 78
    .line 79
    const-string v6, "\n\u52a8\u56fe\u6761\u76ee\u6570\uff1a"

    .line 80
    .line 81
    const-string v8, "\u5f53\u524d\u4f5c\u54c1\u5df2\u8bc6\u522b\u4e3a\u52a8\u56fe / LivePhoto\uff0c\u4f46\u6ca1\u6709\u4ece Aweme \u6570\u636e\u4e2d\u627e\u5230\u53ef\u4e0b\u8f7d\u7684\u89c6\u9891\u6216\u56fe\u7247\u8d44\u6e90\u3002\n\n\u8bc6\u522b\u539f\u56e0\uff1a"

    .line 82
    .line 83
    invoke-static {v2, v8, v1, v5, v6}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v2, "\n\u56fe\u7247\u6570\uff1a"

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v1, "\u786e\u5b9a"

    .line 107
    .line 108
    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_1
    iget-object v1, v0, Lzk0;->ζ:Landroid/app/Activity;

    .line 117
    .line 118
    const-string v0, "showSelectiveDownloadDialog awemeId="

    .line 119
    .line 120
    :try_start_0
    sget-object v3, Lqy0;->α:Lqy0;

    .line 121
    .line 122
    iget-object v3, v6, Lf8;->θ:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v4, v6, Lf8;->ζ:Lh8;

    .line 125
    .line 126
    iget-object v8, v6, Lf8;->Ρ:Ljava/util/List;

    .line 127
    .line 128
    if-eqz v8, :cond_4

    .line 129
    .line 130
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    goto :goto_2

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    move-object v7, v1

    .line 137
    goto/16 :goto_6

    .line 138
    .line 139
    :cond_4
    move v8, v7

    .line 140
    :goto_2
    iget-object v9, v6, Lf8;->δ:Ljava/util/List;

    .line 141
    .line 142
    if-eqz v9, :cond_5

    .line 143
    .line 144
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    goto :goto_3

    .line 149
    :cond_5
    move v9, v7

    .line 150
    :goto_3
    iget-object v10, v6, Lf8;->Η:Ljava/util/List;

    .line 151
    .line 152
    if-eqz v10, :cond_6

    .line 153
    .line 154
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    goto :goto_4

    .line 159
    :cond_6
    move v10, v7

    .line 160
    :goto_4
    iget-object v11, v6, Lf8;->Ο:Ljava/util/List;

    .line 161
    .line 162
    if-eqz v11, :cond_7

    .line 163
    .line 164
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    move v11, v7

    .line 170
    :goto_5
    new-instance v12, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v0, ", type="

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v0, ", pageMediaItems="

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v0, ", imageUrls="

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v0, ", animatedUrls="

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v0, ", livePhotoItems="

    .line 211
    .line 212
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lqy0;->Ε(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v6}, Lqy0;->λ(Lf8;)Ljava/util/ArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_8

    .line 234
    .line 235
    const-string v0, "\u6ca1\u6709\u53ef\u9009\u62e9\u4e0b\u8f7d\u7684\u8d44\u6e90"

    .line 236
    .line 237
    invoke-static {v1, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_8
    new-instance v0, Ldz0;

    .line 242
    .line 243
    new-instance v12, Lzx0;

    .line 244
    .line 245
    invoke-direct {v12, v1, v6, v7}, Lzx0;-><init>(Landroid/app/Activity;Lf8;I)V

    .line 246
    .line 247
    .line 248
    sget-object v9, Lyy0;->ε:Lyy0;

    .line 249
    .line 250
    const-string v10, "\u9009\u62e9\u8981\u4e0b\u8f7d\u7684\u5185\u5bb9"

    .line 251
    .line 252
    const-string v11, "\u591a\u9009"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    .line 254
    move-object v6, v0

    .line 255
    move-object v7, v1

    .line 256
    :try_start_1
    invoke-direct/range {v6 .. v12}, Ldz0;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;Lyy0;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6}, Ldz0;->θ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 260
    .line 261
    .line 262
    goto :goto_7

    .line 263
    :catchall_1
    move-exception v0

    .line 264
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    new-instance v3, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v4, "\u9009\u62e9\u4e0b\u8f7d\u5f39\u7a97\u6253\u5f00\u5931\u8d25\uff1a"

    .line 271
    .line 272
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-static {v7, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 287
    .line 288
    .line 289
    const-string v1, "\u9009\u62e9\u4e0b\u8f7d\u5f39\u7a97\u6253\u5f00\u5931\u8d25"

    .line 290
    .line 291
    invoke-static {v2, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    :goto_7
    return-void

    .line 295
    :pswitch_2
    sget-object v1, Ldl0;->α:Landroid/os/Handler;

    .line 296
    .line 297
    const/16 v1, 0xa

    .line 298
    .line 299
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    const/16 v2, 0x14

    .line 304
    .line 305
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    sget-object v4, Lxk0;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 310
    .line 311
    new-instance v6, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    :cond_9
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    if-eqz v8, :cond_a

    .line 325
    .line 326
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    check-cast v8, Ljava/lang/ref/WeakReference;

    .line 331
    .line 332
    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    check-cast v8, Landroid/graphics/Bitmap;

    .line 337
    .line 338
    if-eqz v8, :cond_9

    .line 339
    .line 340
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_a
    new-instance v11, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    :cond_b
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-eqz v6, :cond_c

    .line 358
    .line 359
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    move-object v8, v6

    .line 364
    check-cast v8, Landroid/graphics/Bitmap;

    .line 365
    .line 366
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    if-nez v8, :cond_b

    .line 371
    .line 372
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_c
    sget-object v4, Lxk0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 377
    .line 378
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    const/4 v8, 0x3

    .line 387
    iget-object v12, v0, Lzk0;->ζ:Landroid/app/Activity;

    .line 388
    .line 389
    const/high16 v9, 0x41500000    # 13.0f

    .line 390
    .line 391
    const/4 v10, -0x1

    .line 392
    const/16 v13, 0x11

    .line 393
    .line 394
    const-string v14, "#EE111827"

    .line 395
    .line 396
    if-eqz v6, :cond_e

    .line 397
    .line 398
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-nez v0, :cond_d

    .line 403
    .line 404
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 405
    .line 406
    .line 407
    new-instance v0, Lf9;

    .line 408
    .line 409
    invoke-direct {v0, v12, v8}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 410
    .line 411
    .line 412
    new-instance v4, Landroid/app/AlertDialog$Builder;

    .line 413
    .line 414
    invoke-direct {v4, v12}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 415
    .line 416
    .line 417
    new-instance v6, Landroid/widget/LinearLayout;

    .line 418
    .line 419
    invoke-direct {v6, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v6, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v6, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 426
    .line 427
    .line 428
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 429
    .line 430
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 434
    .line 435
    .line 436
    move-result v11

    .line 437
    invoke-virtual {v8, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v2}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    check-cast v11, Ljava/lang/Number;

    .line 445
    .line 446
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 447
    .line 448
    .line 449
    move-result v11

    .line 450
    int-to-float v11, v11

    .line 451
    invoke-virtual {v8, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 455
    .line 456
    .line 457
    const/16 v8, 0x1c

    .line 458
    .line 459
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v8

    .line 463
    invoke-virtual {v0, v8}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v11

    .line 467
    check-cast v11, Ljava/lang/Number;

    .line 468
    .line 469
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 470
    .line 471
    .line 472
    move-result v11

    .line 473
    const/16 v14, 0x20

    .line 474
    .line 475
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v14

    .line 479
    invoke-virtual {v0, v14}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v14

    .line 483
    check-cast v14, Ljava/lang/Number;

    .line 484
    .line 485
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 486
    .line 487
    .line 488
    move-result v14

    .line 489
    invoke-virtual {v0, v8}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v15

    .line 493
    check-cast v15, Ljava/lang/Number;

    .line 494
    .line 495
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 496
    .line 497
    .line 498
    move-result v15

    .line 499
    invoke-virtual {v0, v8}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    check-cast v8, Ljava/lang/Number;

    .line 504
    .line 505
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 506
    .line 507
    .line 508
    move-result v8

    .line 509
    invoke-virtual {v6, v11, v14, v15, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 510
    .line 511
    .line 512
    new-instance v8, Landroid/widget/TextView;

    .line 513
    .line 514
    invoke-direct {v8, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 515
    .line 516
    .line 517
    const-string v11, "\ud83d\uddbc\ufe0f"

    .line 518
    .line 519
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 520
    .line 521
    .line 522
    const/high16 v11, 0x42200000    # 40.0f

    .line 523
    .line 524
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 531
    .line 532
    .line 533
    new-instance v8, Landroid/widget/TextView;

    .line 534
    .line 535
    invoke-direct {v8, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 536
    .line 537
    .line 538
    const-string v11, "\u56fe\u7247\u672a\u7f13\u5b58"

    .line 539
    .line 540
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 541
    .line 542
    .line 543
    const/high16 v11, 0x41880000    # 17.0f

    .line 544
    .line 545
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v8, v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 558
    .line 559
    .line 560
    new-instance v3, Landroid/widget/TextView;

    .line 561
    .line 562
    invoke-direct {v3, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 563
    .line 564
    .line 565
    const-string v5, "\u8bf7\u6ed1\u52a8\u6d4f\u89c8\u56fe\u6587\uff0c\u8ba9\u6296\u97f3\u6e32\u67d3\u56fe\u7247\u540e\u518d\u8bd5"

    .line 566
    .line 567
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 571
    .line 572
    .line 573
    const-string v5, "#AAAAAA"

    .line 574
    .line 575
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 576
    .line 577
    .line 578
    move-result v5

    .line 579
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    check-cast v1, Ljava/lang/Number;

    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    invoke-virtual {v0, v2}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    check-cast v2, Ljava/lang/Number;

    .line 600
    .line 601
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    invoke-virtual {v3, v7, v1, v7, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 609
    .line 610
    .line 611
    new-instance v1, Lal0;

    .line 612
    .line 613
    invoke-direct {v1, v6, v7}, Lal0;-><init>(Landroid/widget/LinearLayout;I)V

    .line 614
    .line 615
    .line 616
    const-string v14, "\u77e5\u9053\u4e86"

    .line 617
    .line 618
    const-string v15, "#FFFFFF"

    .line 619
    .line 620
    const-string v16, "#333333"

    .line 621
    .line 622
    move-object v13, v0

    .line 623
    move-object/from16 v17, v1

    .line 624
    .line 625
    invoke-static/range {v12 .. v17}, Ldl0;->α(Landroid/app/Activity;Lf9;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)Landroid/widget/TextView;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v4, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_e

    .line 644
    .line 645
    :cond_d
    move-object v4, v12

    .line 646
    const-string v0, "\u672a\u6355\u83b7\u5230\u56fe\u7247\uff0c\u8bf7\u6ed1\u52a8\u56fe\u6587\u540e\u518d\u8bd5"

    .line 647
    .line 648
    invoke-static {v4, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 653
    .line 654
    .line 655
    goto/16 :goto_e

    .line 656
    .line 657
    :cond_e
    move-object v4, v12

    .line 658
    const/16 v6, 0xc3

    .line 659
    .line 660
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 661
    .line 662
    .line 663
    move-result-object v6

    .line 664
    new-instance v12, Lf9;

    .line 665
    .line 666
    invoke-direct {v12, v4, v8}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 667
    .line 668
    .line 669
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 670
    .line 671
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 672
    .line 673
    .line 674
    new-instance v15, Lum1;

    .line 675
    .line 676
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-static {v4, v5}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 680
    .line 681
    .line 682
    move-result-object v13

    .line 683
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 684
    .line 685
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 686
    .line 687
    .line 688
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 689
    .line 690
    .line 691
    move-result v14

    .line 692
    invoke-virtual {v9, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v2}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    check-cast v2, Ljava/lang/Number;

    .line 700
    .line 701
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    int-to-float v2, v2

    .line 706
    invoke-virtual {v9, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v13, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 710
    .line 711
    .line 712
    move-object v2, v15

    .line 713
    new-instance v15, Landroid/widget/TextView;

    .line 714
    .line 715
    invoke-direct {v15, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 719
    .line 720
    .line 721
    move-result v9

    .line 722
    new-instance v14, Ljava/lang/StringBuilder;

    .line 723
    .line 724
    const-string v7, "\u9009\u62e9\u56fe\u7247\uff08\u5171 "

    .line 725
    .line 726
    invoke-direct {v14, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    const-string v7, " \u5f20\uff09"

    .line 733
    .line 734
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v7

    .line 741
    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 742
    .line 743
    .line 744
    const/high16 v7, 0x41700000    # 15.0f

    .line 745
    .line 746
    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v15, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v15, v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 753
    .line 754
    .line 755
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 756
    .line 757
    const/4 v9, -0x2

    .line 758
    const/high16 v14, 0x3f800000    # 1.0f

    .line 759
    .line 760
    move-object/from16 v18, v3

    .line 761
    .line 762
    const/4 v3, 0x0

    .line 763
    invoke-direct {v7, v3, v9, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v15, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 767
    .line 768
    .line 769
    new-instance v3, Landroid/widget/TextView;

    .line 770
    .line 771
    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 772
    .line 773
    .line 774
    const-string v7, "\u5168\u9009"

    .line 775
    .line 776
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 777
    .line 778
    .line 779
    const/high16 v7, 0x41400000    # 12.0f

    .line 780
    .line 781
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 782
    .line 783
    .line 784
    const-string v7, "#FE2C55"

    .line 785
    .line 786
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 787
    .line 788
    .line 789
    move-result v14

    .line 790
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 791
    .line 792
    .line 793
    const/16 v14, 0xc

    .line 794
    .line 795
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 796
    .line 797
    .line 798
    move-result-object v14

    .line 799
    invoke-virtual {v12, v14}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v19

    .line 803
    check-cast v19, Ljava/lang/Number;

    .line 804
    .line 805
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Number;->intValue()I

    .line 806
    .line 807
    .line 808
    move-result v9

    .line 809
    const/16 v19, 0x5

    .line 810
    .line 811
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 812
    .line 813
    .line 814
    move-result-object v10

    .line 815
    invoke-virtual {v12, v10}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v19

    .line 819
    check-cast v19, Ljava/lang/Number;

    .line 820
    .line 821
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Number;->intValue()I

    .line 822
    .line 823
    .line 824
    move-result v5

    .line 825
    invoke-virtual {v12, v14}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v19

    .line 829
    check-cast v19, Ljava/lang/Number;

    .line 830
    .line 831
    move-object/from16 v22, v2

    .line 832
    .line 833
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Number;->intValue()I

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    invoke-virtual {v12, v10}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v19

    .line 841
    check-cast v19, Ljava/lang/Number;

    .line 842
    .line 843
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Number;->intValue()I

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    invoke-virtual {v3, v9, v5, v2, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 848
    .line 849
    .line 850
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 851
    .line 852
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 853
    .line 854
    .line 855
    const-string v2, "#"

    .line 856
    .line 857
    const-string v5, "#22"

    .line 858
    .line 859
    invoke-static {v7, v2, v5}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 868
    .line 869
    .line 870
    const/16 v2, 0x8

    .line 871
    .line 872
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 873
    .line 874
    .line 875
    move-result-object v5

    .line 876
    invoke-virtual {v12, v5}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v9

    .line 880
    check-cast v9, Ljava/lang/Number;

    .line 881
    .line 882
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 883
    .line 884
    .line 885
    move-result v9

    .line 886
    int-to-float v9, v9

    .line 887
    invoke-virtual {v0, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 891
    .line 892
    .line 893
    const/4 v9, 0x1

    .line 894
    invoke-virtual {v3, v9}, Landroid/view/View;->setClickable(Z)V

    .line 895
    .line 896
    .line 897
    const/4 v9, 0x0

    .line 898
    invoke-static {v4, v9}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    const/16 v9, 0x10

    .line 903
    .line 904
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 909
    .line 910
    .line 911
    const/16 v23, 0x12

    .line 912
    .line 913
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 914
    .line 915
    .line 916
    move-result-object v9

    .line 917
    invoke-virtual {v12, v9}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v9

    .line 921
    check-cast v9, Ljava/lang/Number;

    .line 922
    .line 923
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 924
    .line 925
    .line 926
    move-result v9

    .line 927
    invoke-virtual {v12, v2}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v23

    .line 931
    check-cast v23, Ljava/lang/Number;

    .line 932
    .line 933
    move-object/from16 v24, v7

    .line 934
    .line 935
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Number;->intValue()I

    .line 936
    .line 937
    .line 938
    move-result v7

    .line 939
    const/16 v23, 0xe

    .line 940
    .line 941
    move-object/from16 v25, v2

    .line 942
    .line 943
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    invoke-virtual {v12, v2}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v23

    .line 951
    check-cast v23, Ljava/lang/Number;

    .line 952
    .line 953
    move-object/from16 v26, v2

    .line 954
    .line 955
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Number;->intValue()I

    .line 956
    .line 957
    .line 958
    move-result v2

    .line 959
    invoke-virtual {v12, v14}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v23

    .line 963
    check-cast v23, Ljava/lang/Number;

    .line 964
    .line 965
    move-object/from16 v27, v6

    .line 966
    .line 967
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Number;->intValue()I

    .line 968
    .line 969
    .line 970
    move-result v6

    .line 971
    invoke-virtual {v0, v9, v7, v2, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 981
    .line 982
    .line 983
    new-instance v0, Landroid/view/View;

    .line 984
    .line 985
    invoke-direct {v0, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 986
    .line 987
    .line 988
    const-string v2, "#22FFFFFF"

    .line 989
    .line 990
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 991
    .line 992
    .line 993
    move-result v6

    .line 994
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 995
    .line 996
    .line 997
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 998
    .line 999
    const/4 v7, -0x1

    .line 1000
    const/4 v9, 0x1

    .line 1001
    invoke-direct {v6, v7, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1008
    .line 1009
    .line 1010
    new-instance v0, Ljava/util/ArrayList;

    .line 1011
    .line 1012
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1013
    .line 1014
    .line 1015
    new-instance v6, Ljava/util/ArrayList;

    .line 1016
    .line 1017
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1018
    .line 1019
    .line 1020
    invoke-static {v4, v9}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v7

    .line 1024
    invoke-virtual {v12, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v9

    .line 1028
    check-cast v9, Ljava/lang/Number;

    .line 1029
    .line 1030
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1031
    .line 1032
    .line 1033
    move-result v9

    .line 1034
    invoke-virtual {v12, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v23

    .line 1038
    check-cast v23, Ljava/lang/Number;

    .line 1039
    .line 1040
    move-object/from16 v28, v2

    .line 1041
    .line 1042
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Number;->intValue()I

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    invoke-virtual {v12, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v23

    .line 1050
    check-cast v23, Ljava/lang/Number;

    .line 1051
    .line 1052
    move-object/from16 v29, v3

    .line 1053
    .line 1054
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Number;->intValue()I

    .line 1055
    .line 1056
    .line 1057
    move-result v3

    .line 1058
    const/16 v23, 0x4

    .line 1059
    .line 1060
    move-object/from16 v30, v13

    .line 1061
    .line 1062
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v13

    .line 1066
    invoke-virtual {v12, v13}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v13

    .line 1070
    check-cast v13, Ljava/lang/Number;

    .line 1071
    .line 1072
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1073
    .line 1074
    .line 1075
    move-result v13

    .line 1076
    invoke-virtual {v7, v9, v2, v3, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 1077
    .line 1078
    .line 1079
    const/4 v2, 0x2

    .line 1080
    invoke-static {v2, v11}, Lxh;->А(ILjava/util/List;)Ljava/util/ArrayList;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v3

    .line 1084
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    const/4 v9, 0x0

    .line 1089
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1090
    .line 1091
    .line 1092
    move-result v13

    .line 1093
    if-eqz v13, :cond_14

    .line 1094
    .line 1095
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v13

    .line 1099
    add-int/lit8 v23, v9, 0x1

    .line 1100
    .line 1101
    if-ltz v9, :cond_13

    .line 1102
    .line 1103
    check-cast v13, Ljava/util/List;

    .line 1104
    .line 1105
    move/from16 v31, v2

    .line 1106
    .line 1107
    move-object/from16 v32, v3

    .line 1108
    .line 1109
    const/4 v2, 0x0

    .line 1110
    invoke-static {v4, v2}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v3

    .line 1114
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1115
    .line 1116
    move/from16 v33, v9

    .line 1117
    .line 1118
    move-object/from16 v20, v13

    .line 1119
    .line 1120
    const/4 v9, -0x1

    .line 1121
    const/4 v13, -0x2

    .line 1122
    invoke-direct {v2, v9, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v12, v5}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v9

    .line 1129
    check-cast v9, Ljava/lang/Number;

    .line 1130
    .line 1131
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1132
    .line 1133
    .line 1134
    move-result v9

    .line 1135
    iput v9, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1136
    .line 1137
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v2

    .line 1144
    const/4 v9, 0x0

    .line 1145
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1146
    .line 1147
    .line 1148
    move-result v34

    .line 1149
    if-eqz v34, :cond_11

    .line 1150
    .line 1151
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v34

    .line 1155
    add-int/lit8 v35, v9, 0x1

    .line 1156
    .line 1157
    if-ltz v9, :cond_10

    .line 1158
    .line 1159
    move-object/from16 v13, v34

    .line 1160
    .line 1161
    check-cast v13, Landroid/graphics/Bitmap;

    .line 1162
    .line 1163
    mul-int/lit8 v34, v33, 0x2

    .line 1164
    .line 1165
    add-int v41, v34, v9

    .line 1166
    .line 1167
    move-object/from16 v34, v2

    .line 1168
    .line 1169
    new-instance v2, Lbl0;

    .line 1170
    .line 1171
    move-object/from16 v42, v5

    .line 1172
    .line 1173
    const/4 v5, 0x0

    .line 1174
    invoke-direct {v2, v8, v15, v11, v5}, Lbl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1175
    .line 1176
    .line 1177
    new-instance v5, Landroid/widget/FrameLayout;

    .line 1178
    .line 1179
    invoke-direct {v5, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 1180
    .line 1181
    .line 1182
    move-object/from16 v40, v2

    .line 1183
    .line 1184
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 1185
    .line 1186
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1187
    .line 1188
    .line 1189
    const-string v36, "#33FFFFFF"

    .line 1190
    .line 1191
    move-object/from16 v43, v8

    .line 1192
    .line 1193
    invoke-static/range {v36 .. v36}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1194
    .line 1195
    .line 1196
    move-result v8

    .line 1197
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v12, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v8

    .line 1204
    check-cast v8, Ljava/lang/Number;

    .line 1205
    .line 1206
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1207
    .line 1208
    .line 1209
    move-result v8

    .line 1210
    int-to-float v8, v8

    .line 1211
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v5, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1215
    .line 1216
    .line 1217
    const/4 v2, 0x1

    .line 1218
    invoke-virtual {v5, v2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 1219
    .line 1220
    .line 1221
    new-instance v2, Landroid/widget/ImageView;

    .line 1222
    .line 1223
    invoke-direct {v2, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1224
    .line 1225
    .line 1226
    sget-object v8, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1227
    .line 1228
    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1229
    .line 1230
    .line 1231
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 1232
    .line 1233
    move/from16 v44, v9

    .line 1234
    .line 1235
    const/4 v9, -0x1

    .line 1236
    invoke-direct {v8, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v2, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v2, v13}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1249
    .line 1250
    .line 1251
    new-instance v2, Landroid/widget/TextView;

    .line 1252
    .line 1253
    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1254
    .line 1255
    .line 1256
    add-int/lit8 v8, v41, 0x1

    .line 1257
    .line 1258
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v8

    .line 1262
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1263
    .line 1264
    .line 1265
    const/high16 v8, 0x41200000    # 10.0f

    .line 1266
    .line 1267
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1268
    .line 1269
    .line 1270
    const/4 v9, -0x1

    .line 1271
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v12, v10}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v8

    .line 1278
    check-cast v8, Ljava/lang/Number;

    .line 1279
    .line 1280
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1281
    .line 1282
    .line 1283
    move-result v8

    .line 1284
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v9

    .line 1288
    invoke-virtual {v12, v9}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v13

    .line 1292
    check-cast v13, Ljava/lang/Number;

    .line 1293
    .line 1294
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1295
    .line 1296
    .line 1297
    move-result v13

    .line 1298
    invoke-virtual {v12, v10}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v36

    .line 1302
    check-cast v36, Ljava/lang/Number;

    .line 1303
    .line 1304
    move-object/from16 v45, v6

    .line 1305
    .line 1306
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Number;->intValue()I

    .line 1307
    .line 1308
    .line 1309
    move-result v6

    .line 1310
    invoke-virtual {v12, v9}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v9

    .line 1314
    check-cast v9, Ljava/lang/Number;

    .line 1315
    .line 1316
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1317
    .line 1318
    .line 1319
    move-result v9

    .line 1320
    invoke-virtual {v2, v8, v13, v6, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1321
    .line 1322
    .line 1323
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 1324
    .line 1325
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1326
    .line 1327
    .line 1328
    const-string v8, "#99000000"

    .line 1329
    .line 1330
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1331
    .line 1332
    .line 1333
    move-result v8

    .line 1334
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v12, v10}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v8

    .line 1341
    check-cast v8, Ljava/lang/Number;

    .line 1342
    .line 1343
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1344
    .line 1345
    .line 1346
    move-result v8

    .line 1347
    int-to-float v8, v8

    .line 1348
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1355
    .line 1356
    .line 1357
    new-instance v2, Landroid/widget/TextView;

    .line 1358
    .line 1359
    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1360
    .line 1361
    .line 1362
    const-string v6, "\u2713"

    .line 1363
    .line 1364
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1365
    .line 1366
    .line 1367
    const/high16 v6, 0x41500000    # 13.0f

    .line 1368
    .line 1369
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1370
    .line 1371
    .line 1372
    const/4 v9, -0x1

    .line 1373
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1374
    .line 1375
    .line 1376
    const/16 v8, 0x11

    .line 1377
    .line 1378
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 1382
    .line 1383
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1384
    .line 1385
    .line 1386
    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1387
    .line 1388
    .line 1389
    move-result v13

    .line 1390
    invoke-virtual {v9, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v12, v14}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v13

    .line 1397
    check-cast v13, Ljava/lang/Number;

    .line 1398
    .line 1399
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1400
    .line 1401
    .line 1402
    move-result v13

    .line 1403
    int-to-float v13, v13

    .line 1404
    invoke-virtual {v9, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v2, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1408
    .line 1409
    .line 1410
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 1411
    .line 1412
    const/16 v13, 0x1a

    .line 1413
    .line 1414
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v13

    .line 1418
    invoke-virtual {v12, v13}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v16

    .line 1422
    check-cast v16, Ljava/lang/Number;

    .line 1423
    .line 1424
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 1425
    .line 1426
    .line 1427
    move-result v6

    .line 1428
    invoke-virtual {v12, v13}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v13

    .line 1432
    check-cast v13, Ljava/lang/Number;

    .line 1433
    .line 1434
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1435
    .line 1436
    .line 1437
    move-result v13

    .line 1438
    invoke-direct {v9, v6, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1439
    .line 1440
    .line 1441
    const v6, 0x800035

    .line 1442
    .line 1443
    .line 1444
    iput v6, v9, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1445
    .line 1446
    const/4 v6, 0x6

    .line 1447
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v6

    .line 1451
    invoke-virtual {v12, v6}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v13

    .line 1455
    check-cast v13, Ljava/lang/Number;

    .line 1456
    .line 1457
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1458
    .line 1459
    .line 1460
    move-result v13

    .line 1461
    iput v13, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 1462
    .line 1463
    invoke-virtual {v12, v6}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v6

    .line 1467
    check-cast v6, Ljava/lang/Number;

    .line 1468
    .line 1469
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1470
    .line 1471
    .line 1472
    move-result v6

    .line 1473
    iput v6, v9, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 1474
    .line 1475
    invoke-virtual {v2, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1476
    .line 1477
    .line 1478
    const/16 v6, 0x8

    .line 1479
    .line 1480
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1484
    .line 1485
    .line 1486
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1487
    .line 1488
    .line 1489
    new-instance v37, Lqm1;

    .line 1490
    .line 1491
    invoke-direct/range {v37 .. v37}, Ljava/lang/Object;-><init>()V

    .line 1492
    .line 1493
    .line 1494
    new-instance v36, Lyk0;

    .line 1495
    .line 1496
    move-object/from16 v38, v2

    .line 1497
    .line 1498
    move-object/from16 v39, v5

    .line 1499
    .line 1500
    invoke-direct/range {v36 .. v41}, Lyk0;-><init>(Lqm1;Landroid/widget/TextView;Landroid/widget/FrameLayout;Lbl0;I)V

    .line 1501
    .line 1502
    .line 1503
    move-object/from16 v5, v36

    .line 1504
    .line 1505
    move-object/from16 v2, v39

    .line 1506
    .line 1507
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1508
    .line 1509
    .line 1510
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1511
    .line 1512
    move-object/from16 v9, v27

    .line 1513
    .line 1514
    invoke-virtual {v12, v9}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v13

    .line 1518
    check-cast v13, Ljava/lang/Number;

    .line 1519
    .line 1520
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1521
    .line 1522
    .line 1523
    move-result v13

    .line 1524
    const/4 v6, 0x0

    .line 1525
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1526
    .line 1527
    invoke-direct {v5, v6, v13, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v12, v10}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v6

    .line 1534
    check-cast v6, Ljava/lang/Number;

    .line 1535
    .line 1536
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1537
    .line 1538
    .line 1539
    move-result v6

    .line 1540
    if-nez v44, :cond_f

    .line 1541
    .line 1542
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1543
    .line 1544
    goto :goto_c

    .line 1545
    :cond_f
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1546
    .line 1547
    :goto_c
    invoke-virtual {v3, v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1548
    .line 1549
    .line 1550
    move-object/from16 v27, v9

    .line 1551
    .line 1552
    move-object/from16 v2, v34

    .line 1553
    .line 1554
    move/from16 v9, v35

    .line 1555
    .line 1556
    move-object/from16 v5, v42

    .line 1557
    .line 1558
    move-object/from16 v8, v43

    .line 1559
    .line 1560
    move-object/from16 v6, v45

    .line 1561
    .line 1562
    const/4 v13, -0x2

    .line 1563
    goto/16 :goto_b

    .line 1564
    .line 1565
    :cond_10
    invoke-static {}, Lyh;->х()V

    .line 1566
    .line 1567
    .line 1568
    throw v18

    .line 1569
    :cond_11
    move-object/from16 v42, v5

    .line 1570
    .line 1571
    move-object/from16 v45, v6

    .line 1572
    .line 1573
    move-object/from16 v43, v8

    .line 1574
    .line 1575
    move-object/from16 v9, v27

    .line 1576
    .line 1577
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 1578
    .line 1579
    .line 1580
    move-result v2

    .line 1581
    const/4 v5, 0x1

    .line 1582
    if-ne v2, v5, :cond_12

    .line 1583
    .line 1584
    new-instance v2, Landroid/view/View;

    .line 1585
    .line 1586
    invoke-direct {v2, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1587
    .line 1588
    .line 1589
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1590
    .line 1591
    invoke-virtual {v12, v9}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v6

    .line 1595
    check-cast v6, Ljava/lang/Number;

    .line 1596
    .line 1597
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1598
    .line 1599
    .line 1600
    move-result v6

    .line 1601
    const/4 v8, 0x0

    .line 1602
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1603
    .line 1604
    invoke-direct {v5, v8, v6, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v12, v10}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v6

    .line 1611
    check-cast v6, Ljava/lang/Number;

    .line 1612
    .line 1613
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1614
    .line 1615
    .line 1616
    move-result v6

    .line 1617
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1618
    .line 1619
    invoke-virtual {v3, v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1620
    .line 1621
    .line 1622
    goto :goto_d

    .line 1623
    :cond_12
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1624
    .line 1625
    :goto_d
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1626
    .line 1627
    .line 1628
    move-object/from16 v27, v9

    .line 1629
    .line 1630
    move/from16 v9, v23

    .line 1631
    .line 1632
    move/from16 v2, v31

    .line 1633
    .line 1634
    move-object/from16 v3, v32

    .line 1635
    .line 1636
    move-object/from16 v5, v42

    .line 1637
    .line 1638
    move-object/from16 v8, v43

    .line 1639
    .line 1640
    move-object/from16 v6, v45

    .line 1641
    .line 1642
    goto/16 :goto_a

    .line 1643
    .line 1644
    :cond_13
    invoke-static {}, Lyh;->х()V

    .line 1645
    .line 1646
    .line 1647
    throw v18

    .line 1648
    :cond_14
    move/from16 v31, v2

    .line 1649
    .line 1650
    move-object/from16 v45, v6

    .line 1651
    .line 1652
    move-object/from16 v43, v8

    .line 1653
    .line 1654
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1655
    .line 1656
    new-instance v2, Landroid/widget/ScrollView;

    .line 1657
    .line 1658
    invoke-direct {v2, v4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 1659
    .line 1660
    .line 1661
    move/from16 v3, v31

    .line 1662
    .line 1663
    invoke-virtual {v2, v3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 1664
    .line 1665
    .line 1666
    const/4 v3, 0x0

    .line 1667
    invoke-virtual {v2, v3}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 1668
    .line 1669
    .line 1670
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1671
    .line 1672
    const/16 v5, 0x1cc

    .line 1673
    .line 1674
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v5

    .line 1678
    invoke-virtual {v12, v5}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v5

    .line 1682
    check-cast v5, Ljava/lang/Number;

    .line 1683
    .line 1684
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1685
    .line 1686
    .line 1687
    move-result v5

    .line 1688
    const/4 v9, -0x1

    .line 1689
    invoke-direct {v3, v9, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v2, v7}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 1696
    .line 1697
    .line 1698
    move-object/from16 v3, v30

    .line 1699
    .line 1700
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1701
    .line 1702
    .line 1703
    move/from16 v21, v9

    .line 1704
    .line 1705
    new-instance v9, Lcl0;

    .line 1706
    .line 1707
    const/16 v16, 0x0

    .line 1708
    .line 1709
    move-object v2, v12

    .line 1710
    move-object v12, v0

    .line 1711
    move-object v0, v2

    .line 1712
    move v8, v13

    .line 1713
    move/from16 v7, v21

    .line 1714
    .line 1715
    move-object/from16 v2, v22

    .line 1716
    .line 1717
    move-object/from16 v14, v29

    .line 1718
    .line 1719
    move-object/from16 v10, v43

    .line 1720
    .line 1721
    move-object/from16 v13, v45

    .line 1722
    .line 1723
    const/4 v5, -0x2

    .line 1724
    const/16 v6, 0x10

    .line 1725
    .line 1726
    invoke-direct/range {v9 .. v16}, Lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v14, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1730
    .line 1731
    .line 1732
    new-instance v9, Landroid/view/View;

    .line 1733
    .line 1734
    invoke-direct {v9, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1735
    .line 1736
    .line 1737
    invoke-static/range {v28 .. v28}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1738
    .line 1739
    .line 1740
    move-result v12

    .line 1741
    invoke-virtual {v9, v12}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1742
    .line 1743
    .line 1744
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 1745
    .line 1746
    const/4 v13, 0x1

    .line 1747
    invoke-direct {v12, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1754
    .line 1755
    .line 1756
    new-instance v7, Landroid/widget/LinearLayout;

    .line 1757
    .line 1758
    invoke-direct {v7, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1759
    .line 1760
    .line 1761
    const/4 v9, 0x0

    .line 1762
    invoke-virtual {v7, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1766
    .line 1767
    .line 1768
    move-object/from16 v6, v26

    .line 1769
    .line 1770
    invoke-virtual {v0, v6}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v9

    .line 1774
    check-cast v9, Ljava/lang/Number;

    .line 1775
    .line 1776
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1777
    .line 1778
    .line 1779
    move-result v9

    .line 1780
    invoke-virtual {v0, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v12

    .line 1784
    check-cast v12, Ljava/lang/Number;

    .line 1785
    .line 1786
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1787
    .line 1788
    .line 1789
    move-result v12

    .line 1790
    invoke-virtual {v0, v6}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v6

    .line 1794
    check-cast v6, Ljava/lang/Number;

    .line 1795
    .line 1796
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1797
    .line 1798
    .line 1799
    move-result v6

    .line 1800
    move-object/from16 v13, v25

    .line 1801
    .line 1802
    invoke-virtual {v0, v13}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v13

    .line 1806
    check-cast v13, Ljava/lang/Number;

    .line 1807
    .line 1808
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1809
    .line 1810
    .line 1811
    move-result v13

    .line 1812
    invoke-virtual {v7, v9, v12, v6, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 1813
    .line 1814
    .line 1815
    new-instance v6, Lei;

    .line 1816
    .line 1817
    const/4 v9, 0x1

    .line 1818
    invoke-direct {v6, v2, v9}, Lei;-><init>(Lum1;I)V

    .line 1819
    .line 1820
    .line 1821
    const-string v14, "\u53d6\u6d88"

    .line 1822
    .line 1823
    const-string v15, "#888888"

    .line 1824
    .line 1825
    const-string v16, "#22FFFFFF"

    .line 1826
    .line 1827
    move-object v13, v0

    .line 1828
    move-object v12, v4

    .line 1829
    move-object/from16 v17, v6

    .line 1830
    .line 1831
    invoke-static/range {v12 .. v17}, Ldl0;->α(Landroid/app/Activity;Lf9;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)Landroid/widget/TextView;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v0

    .line 1835
    move-object v4, v13

    .line 1836
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1837
    .line 1838
    invoke-direct {v6, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1839
    .line 1840
    .line 1841
    invoke-virtual {v4, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v1

    .line 1845
    check-cast v1, Ljava/lang/Number;

    .line 1846
    .line 1847
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1848
    .line 1849
    .line 1850
    move-result v1

    .line 1851
    iput v1, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1852
    .line 1853
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1857
    .line 1858
    .line 1859
    new-instance v17, Lvb0;

    .line 1860
    .line 1861
    move-object/from16 v0, p0

    .line 1862
    .line 1863
    iget-object v13, v0, Lzk0;->η:Lf8;

    .line 1864
    .line 1865
    move-object v14, v11

    .line 1866
    move-object v11, v12

    .line 1867
    move-object/from16 v9, v17

    .line 1868
    .line 1869
    move-object v12, v2

    .line 1870
    invoke-direct/range {v9 .. v14}, Lvb0;-><init>(Ljava/util/LinkedHashSet;Landroid/app/Activity;Lum1;Lf8;Ljava/util/ArrayList;)V

    .line 1871
    .line 1872
    .line 1873
    move-object v12, v11

    .line 1874
    const-string v14, "\u4fdd\u5b58\u9009\u4e2d"

    .line 1875
    .line 1876
    const-string v15, "#FFFFFF"

    .line 1877
    .line 1878
    const-string v16, "#FE2C55"

    .line 1879
    .line 1880
    move-object v13, v4

    .line 1881
    invoke-static/range {v12 .. v17}, Ldl0;->α(Landroid/app/Activity;Lf9;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)Landroid/widget/TextView;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v0

    .line 1885
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 1886
    .line 1887
    const/4 v9, 0x0

    .line 1888
    invoke-direct {v1, v9, v5, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1889
    .line 1890
    .line 1891
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1892
    .line 1893
    .line 1894
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1895
    .line 1896
    .line 1897
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1898
    .line 1899
    .line 1900
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 1901
    .line 1902
    invoke-direct {v0, v12}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1903
    .line 1904
    .line 1905
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v0

    .line 1909
    const/4 v9, 0x1

    .line 1910
    invoke-virtual {v0, v9}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v0

    .line 1914
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v0

    .line 1918
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v1

    .line 1922
    if-eqz v1, :cond_15

    .line 1923
    .line 1924
    const v3, 0x106000d

    .line 1925
    .line 1926
    .line 1927
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 1928
    .line 1929
    .line 1930
    const v3, 0x3f59999a    # 0.85f

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v1, v3}, Landroid/view/Window;->setDimAmount(F)V

    .line 1934
    .line 1935
    .line 1936
    const/4 v3, 0x2

    .line 1937
    invoke-virtual {v1, v3}, Landroid/view/Window;->addFlags(I)V

    .line 1938
    .line 1939
    .line 1940
    :cond_15
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 1941
    .line 1942
    .line 1943
    iput-object v0, v2, Lum1;->ε:Ljava/lang/Object;

    .line 1944
    .line 1945
    :goto_e
    return-void

    .line 1946
    :pswitch_3
    :try_start_2
    invoke-static {}, Lxk0;->γ()V

    .line 1947
    .line 1948
    .line 1949
    sget-object v0, Ldl0;->α:Landroid/os/Handler;

    .line 1950
    .line 1951
    new-instance v1, Lzk0;

    .line 1952
    .line 1953
    const/4 v9, 0x1

    .line 1954
    invoke-direct {v1, v4, v6, v9}, Lzk0;-><init>(Landroid/app/Activity;Lf8;I)V

    .line 1955
    .line 1956
    .line 1957
    const-wide/16 v5, 0xc8

    .line 1958
    .line 1959
    invoke-virtual {v0, v1, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1960
    .line 1961
    .line 1962
    goto :goto_f

    .line 1963
    :catchall_2
    move-exception v0

    .line 1964
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v1

    .line 1968
    const-string v3, "ImagePreviewDialog \u5f02\u5e38: "

    .line 1969
    .line 1970
    invoke-static {v3, v1, v2, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1971
    .line 1972
    .line 1973
    const-string v0, "\u6253\u5f00\u9884\u89c8\u5931\u8d25"

    .line 1974
    .line 1975
    const/4 v9, 0x0

    .line 1976
    invoke-static {v4, v0, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v0

    .line 1980
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1981
    .line 1982
    .line 1983
    :goto_f
    return-void

    .line 1984
    nop

    .line 1985
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
