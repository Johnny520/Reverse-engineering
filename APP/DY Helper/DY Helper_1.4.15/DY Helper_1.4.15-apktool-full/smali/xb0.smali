.class public final synthetic Lxb0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Lxb0;->ε:I

    iput-object p1, p0, Lxb0;->η:Ljava/lang/Object;

    iput-object p2, p0, Lxb0;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Lxb0;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lxb0;->ι:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/view/View;Lum1;Landroid/app/Dialog;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxb0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxb0;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lxb0;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lxb0;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lxb0;->ι:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lxb0;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Ls62;->α:Ls62;

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Lxb0;->ι:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Lxb0;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, p0, Lxb0;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, Lxb0;->η:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, Ljava/lang/ClassLoader;

    .line 20
    .line 21
    check-cast v7, Lvc1;

    .line 22
    .line 23
    check-cast v6, Llc1;

    .line 24
    .line 25
    check-cast v5, Lid1;

    .line 26
    .line 27
    iget-object v0, v6, Llc1;->α:Ljava/lang/String;

    .line 28
    .line 29
    iget v1, v5, Lid1;->α:I

    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    :try_start_0
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    if-lez v1, :cond_0

    .line 45
    .line 46
    const-string v3, "POST"

    .line 47
    .line 48
    const-string v4, "https://vassets-backend.douyin.com/gameplay/farm/plant_crops"

    .line 49
    .line 50
    const-string v5, "shop_type"

    .line 51
    .line 52
    new-instance v6, Ll91;

    .line 53
    .line 54
    invoke-direct {v6, v5, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-string v5, "plant_type"

    .line 58
    .line 59
    new-instance v8, Ll91;

    .line 60
    .line 61
    invoke-direct {v8, v5, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "seed_id"

    .line 65
    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v5, Ll91;

    .line 71
    .line 72
    invoke-direct {v5, v2, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-string v1, "decorate_uuid"

    .line 76
    .line 77
    new-instance v2, Ll91;

    .line 78
    .line 79
    invoke-direct {v2, v1, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    filled-new-array {v6, v8, v5, v2}, [Ll91;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lex0;->Ι([Ll91;)Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {p0, v7, v3, v4, v0}, Li81;->ω(Ljava/lang/ClassLoader;Lvc1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lza1;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Li81;->υ(Lza1;)Lkc1;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    goto :goto_0

    .line 99
    :cond_0
    const-string p0, "seedId \u5fc5\u987b\u5927\u4e8e 0"

    .line 100
    .line 101
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :cond_1
    const-string p0, "decorateUuid \u4e0d\u80fd\u4e3a\u7a7a"

    .line 108
    .line 109
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    move-object p0, v0

    .line 117
    new-instance v0, Leo1;

    .line 118
    .line 119
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object p0, v0

    .line 123
    :goto_0
    new-instance v0, Lfo1;

    .line 124
    .line 125
    invoke-direct {v0, p0}, Lfo1;-><init>(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_0
    check-cast p0, Landroid/app/Activity;

    .line 130
    .line 131
    check-cast v7, Landroid/widget/ImageView;

    .line 132
    .line 133
    check-cast v6, Lj71;

    .line 134
    .line 135
    check-cast v5, Lp70;

    .line 136
    .line 137
    new-instance v0, Landroid/widget/PopupMenu;

    .line 138
    .line 139
    invoke-direct {v0, p0, v7}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v2, v6, Lj71;->κ:Ljava/lang/String;

    .line 147
    .line 148
    if-nez v2, :cond_2

    .line 149
    .line 150
    const-string v2, "\u66f4\u591a\u9009\u9879"

    .line 151
    .line 152
    :cond_2
    invoke-interface {v1, v2}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 153
    .line 154
    .line 155
    new-instance v1, Lu61;

    .line 156
    .line 157
    invoke-direct {v1, v5, v6, p0}, Lu61;-><init>(Lp70;Lj71;Landroid/app/Activity;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    .line 164
    .line 165
    .line 166
    return-object v3

    .line 167
    :pswitch_1
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 168
    .line 169
    check-cast v6, Landroid/view/View;

    .line 170
    .line 171
    check-cast v7, Lum1;

    .line 172
    .line 173
    check-cast v5, Landroid/app/Dialog;

    .line 174
    .line 175
    sget-object v0, Lin0;->α:Landroid/os/Handler;

    .line 176
    .line 177
    invoke-virtual {p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_3

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_5

    .line 193
    .line 194
    iget-object v0, v7, Lum1;->ε:Ljava/lang/Object;

    .line 195
    .line 196
    if-eqz v0, :cond_4

    .line 197
    .line 198
    check-cast v0, Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 199
    .line 200
    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_4
    const-string p0, "firstFrameListener"

    .line 205
    .line 206
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v1

    .line 210
    :cond_5
    :goto_1
    invoke-virtual {v5}, Landroid/app/Dialog;->isShowing()Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-eqz p0, :cond_6

    .line 215
    .line 216
    invoke-static {v5}, Lin0;->ζ(Landroid/app/Dialog;)Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-eqz p0, :cond_6

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_6
    move v4, v2

    .line 224
    :goto_2
    invoke-virtual {v5}, Landroid/app/Dialog;->isShowing()Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-eqz p0, :cond_7

    .line 229
    .line 230
    if-nez v4, :cond_7

    .line 231
    .line 232
    invoke-static {v5, v2}, Lin0;->β(Landroid/app/Dialog;I)V

    .line 233
    .line 234
    .line 235
    :cond_7
    move v2, v4

    .line 236
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :pswitch_2
    check-cast p0, Ldc0;

    .line 242
    .line 243
    check-cast v7, Lum1;

    .line 244
    .line 245
    check-cast v6, Lum1;

    .line 246
    .line 247
    check-cast v5, Ljava/util/Map;

    .line 248
    .line 249
    iput-boolean v2, p0, Ldc0;->φ:Z

    .line 250
    .line 251
    iget-object v0, v7, Lum1;->ε:Ljava/lang/Object;

    .line 252
    .line 253
    if-eqz v0, :cond_e

    .line 254
    .line 255
    check-cast v0, Lsb0;

    .line 256
    .line 257
    iget-object v4, v6, Lum1;->ε:Ljava/lang/Object;

    .line 258
    .line 259
    const-string v7, "approval"

    .line 260
    .line 261
    if-eqz v4, :cond_d

    .line 262
    .line 263
    check-cast v4, Leb0;

    .line 264
    .line 265
    iget-object v4, v4, Leb0;->δ:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v8, v0, Lsb0;->δ:Ljava/lang/String;

    .line 268
    .line 269
    filled-new-array {v4, v8}, [Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    new-instance v8, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    :cond_8
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-eqz v9, :cond_9

    .line 291
    .line 292
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    move-object v10, v9

    .line 297
    check-cast v10, Ljava/lang/String;

    .line 298
    .line 299
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    if-nez v10, :cond_8

    .line 304
    .line 305
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_9
    const/4 v13, 0x0

    .line 310
    const/16 v14, 0x3e

    .line 311
    .line 312
    const-string v9, "\uff1b"

    .line 313
    .line 314
    const/4 v10, 0x0

    .line 315
    const/4 v11, 0x0

    .line 316
    const/4 v12, 0x0

    .line 317
    invoke-static/range {v8 .. v14}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    iget-object v8, v0, Lsb0;->α:Ljava/util/List;

    .line 322
    .line 323
    iget-object v0, v0, Lsb0;->β:Ljava/util/List;

    .line 324
    .line 325
    iput-object v0, p0, Ldc0;->σ:Ljava/util/List;

    .line 326
    .line 327
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    iput v0, p0, Ldc0;->τ:I

    .line 332
    .line 333
    iput-object v4, p0, Ldc0;->ψ:Ljava/lang/String;

    .line 334
    .line 335
    iget-object v0, p0, Ldc0;->π:Ljava/util/LinkedHashMap;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    iget-object v8, p0, Ldc0;->σ:Ljava/util/List;

    .line 342
    .line 343
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 344
    .line 345
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    if-eqz v10, :cond_a

    .line 357
    .line 358
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v10

    .line 362
    check-cast v10, Lic0;

    .line 363
    .line 364
    iget-wide v10, v10, Lic0;->β:J

    .line 365
    .line 366
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_a
    invoke-interface {v4, v9}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v5}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p0}, Ldc0;->η()V

    .line 381
    .line 382
    .line 383
    iget-object p0, p0, Ldc0;->α:Landroid/app/Activity;

    .line 384
    .line 385
    iget-object v0, v6, Lum1;->ε:Ljava/lang/Object;

    .line 386
    .line 387
    if-eqz v0, :cond_c

    .line 388
    .line 389
    check-cast v0, Leb0;

    .line 390
    .line 391
    iget-boolean v0, v0, Leb0;->γ:Z

    .line 392
    .line 393
    if-eqz v0, :cond_b

    .line 394
    .line 395
    const-string v0, "\u5ba1\u6279\u5b8c\u6210\uff0c\u5217\u8868\u5df2\u5237\u65b0"

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_b
    const-string v0, "\u90e8\u5206\u5ba1\u6279\u5931\u8d25\uff0c\u5217\u8868\u5df2\u5237\u65b0"

    .line 399
    .line 400
    :goto_6
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 405
    .line 406
    .line 407
    return-object v3

    .line 408
    :cond_c
    invoke-static {v7}, Lln0;->и(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw v1

    .line 412
    :cond_d
    invoke-static {v7}, Lln0;->и(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    throw v1

    .line 416
    :cond_e
    const-string p0, "refreshed"

    .line 417
    .line 418
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw v1

    .line 422
    nop

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
