.class public final synthetic Lgc;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/lang/Object;

.field public final synthetic λ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p7, p0, Lgc;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lgc;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lgc;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lgc;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lgc;->ι:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lgc;->κ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p6, p0, Lgc;->λ:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lgc;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, Ls62;->α:Ls62;

    .line 8
    .line 9
    iget-object v5, v0, Lgc;->λ:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, Lgc;->κ:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, Lgc;->ι:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, v0, Lgc;->θ:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v9, v0, Lgc;->η:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v0, v0, Lgc;->ζ:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v0, Lab2;

    .line 25
    .line 26
    check-cast v9, Lya2;

    .line 27
    .line 28
    check-cast v8, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    check-cast v6, [Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, Lp70;

    .line 33
    .line 34
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, Lcb2;

    .line 37
    .line 38
    sget-object v2, Lib2;->α:Lib2;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-object v2, v9, Lya2;->ε:Lkf0;

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Lab2;->α(Lcb2;Lkf0;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lya2;->η:Lya2;

    .line 48
    .line 49
    if-ne v9, v0, :cond_0

    .line 50
    .line 51
    invoke-static {v1}, Lib2;->ω(Lcb2;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-static {v7, v8, v6}, Lib2;->σ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v5}, Lp70;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-object v4

    .line 61
    :pswitch_0
    check-cast v0, Landroid/widget/TextView;

    .line 62
    .line 63
    check-cast v9, Ljava/lang/String;

    .line 64
    .line 65
    check-cast v8, Landroid/widget/TextView;

    .line 66
    .line 67
    check-cast v7, Landroid/app/Activity;

    .line 68
    .line 69
    check-cast v6, Lum1;

    .line 70
    .line 71
    check-cast v5, Ljava/lang/String;

    .line 72
    .line 73
    move-object/from16 v1, p1

    .line 74
    .line 75
    check-cast v1, Lfo1;

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v1, Lfo1;->ε:Ljava/lang/Object;

    .line 84
    .line 85
    instance-of v1, v0, Leo1;

    .line 86
    .line 87
    if-nez v1, :cond_1

    .line 88
    .line 89
    move-object v1, v0

    .line 90
    check-cast v1, Lef1;

    .line 91
    .line 92
    invoke-static {v6, v5}, Ljz1;->ψ(Lum1;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const-string v6, "\u6295\u5582\u98df\u7269\uff1a"

    .line 97
    .line 98
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, v1, Lef1;->α:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    new-instance v5, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v6, "\u5df2\u66f4\u65b0 "

    .line 114
    .line 115
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v1, " \u79cd\u98df\u7269"

    .line 122
    .line 123
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v7, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 135
    .line 136
    .line 137
    :cond_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_3

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-nez v0, :cond_2

    .line 148
    .line 149
    const-string v0, ""

    .line 150
    .line 151
    :cond_2
    const-string v1, "\u66f4\u65b0\u5931\u8d25: "

    .line 152
    .line 153
    invoke-static {v3, v7, v1, v0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_3
    return-object v4

    .line 157
    :pswitch_1
    check-cast v0, Ln;

    .line 158
    .line 159
    check-cast v9, Landroid/app/Activity;

    .line 160
    .line 161
    check-cast v8, Landroid/app/AlertDialog;

    .line 162
    .line 163
    check-cast v7, Landroid/widget/TextView;

    .line 164
    .line 165
    check-cast v6, Landroid/widget/TextView;

    .line 166
    .line 167
    check-cast v5, Landroid/widget/ProgressBar;

    .line 168
    .line 169
    move-object/from16 v1, p1

    .line 170
    .line 171
    check-cast v1, Ljh0;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_a

    .line 185
    .line 186
    invoke-virtual {v9}, Landroid/app/Activity;->isFinishing()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_a

    .line 191
    .line 192
    invoke-virtual {v9}, Landroid/app/Activity;->isDestroyed()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_a

    .line 197
    .line 198
    invoke-virtual {v8}, Landroid/app/Dialog;->isShowing()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_a

    .line 203
    .line 204
    sget-object v0, Lq71;->α:Lq71;

    .line 205
    .line 206
    iget-object v0, v1, Ljh0;->θ:Ljava/lang/String;

    .line 207
    .line 208
    iget v8, v1, Ljh0;->ζ:I

    .line 209
    .line 210
    iget-object v9, v1, Ljh0;->α:Lkh0;

    .line 211
    .line 212
    iget v10, v1, Ljh0;->η:I

    .line 213
    .line 214
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-eqz v11, :cond_7

    .line 219
    .line 220
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_6

    .line 225
    .line 226
    if-eq v0, v3, :cond_5

    .line 227
    .line 228
    const/4 v11, 0x2

    .line 229
    if-ne v0, v11, :cond_4

    .line 230
    .line 231
    const-string v0, "\u6b63\u5728\u5199\u5165\u5bfc\u51fa\u6587\u4ef6"

    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_4
    invoke-static {}, Lγ;->κ()V

    .line 235
    .line 236
    .line 237
    const/4 v4, 0x0

    .line 238
    goto :goto_2

    .line 239
    :cond_5
    const-string v0, "\u6b63\u5728\u6574\u7406\u6708\u4efd\u65f6\u95f4\u7ebf"

    .line 240
    .line 241
    goto :goto_0

    .line 242
    :cond_6
    const-string v0, "\u6b63\u5728\u8bfb\u53d6\u5b8c\u6574\u804a\u5929\u8bb0\u5f55"

    .line 243
    .line 244
    :cond_7
    :goto_0
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    .line 246
    .line 247
    iget-object v0, v1, Ljh0;->γ:Ljava/lang/Long;

    .line 248
    .line 249
    iget-object v7, v1, Ljh0;->δ:Ljava/lang/Long;

    .line 250
    .line 251
    invoke-static {v0, v7}, Lq71;->σ(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    new-instance v7, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    const-string v11, "\u6d88\u606f\uff1a"

    .line 258
    .line 259
    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    iget v11, v1, Ljh0;->β:I

    .line 263
    .line 264
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v11, " \u6761\n\u65f6\u95f4\u8303\u56f4\uff1a"

    .line 268
    .line 269
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    sget-object v0, Lkh0;->η:Lkh0;

    .line 276
    .line 277
    if-ne v9, v0, :cond_8

    .line 278
    .line 279
    if-lez v10, :cond_8

    .line 280
    .line 281
    const-string v11, "\n\u6708\u4efd\u8fdb\u5ea6\uff1a"

    .line 282
    .line 283
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const/16 v11, 0x2f

    .line 290
    .line 291
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    iget-object v1, v1, Ljh0;->ε:Ljava/lang/String;

    .line 298
    .line 299
    if-eqz v1, :cond_8

    .line 300
    .line 301
    const-string v11, "\uff08"

    .line 302
    .line 303
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    const v1, 0xff09

    .line 310
    .line 311
    .line 312
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    :cond_8
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 320
    .line 321
    .line 322
    if-ne v9, v0, :cond_9

    .line 323
    .line 324
    if-lez v10, :cond_9

    .line 325
    .line 326
    goto :goto_1

    .line 327
    :cond_9
    move v3, v2

    .line 328
    :goto_1
    xor-int/lit8 v0, v3, 0x1

    .line 329
    .line 330
    invoke-virtual {v5, v0}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 331
    .line 332
    .line 333
    if-eqz v3, :cond_a

    .line 334
    .line 335
    invoke-virtual {v5, v10}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 336
    .line 337
    .line 338
    invoke-static {v8, v2, v10}, Lj81;->μ(III)I

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    invoke-virtual {v5, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 343
    .line 344
    .line 345
    :cond_a
    :goto_2
    return-object v4

    .line 346
    :pswitch_2
    check-cast v0, [Lch1;

    .line 347
    .line 348
    check-cast v9, Ljava/util/List;

    .line 349
    .line 350
    check-cast v8, Lrx0;

    .line 351
    .line 352
    check-cast v7, Lsm1;

    .line 353
    .line 354
    check-cast v6, Lsm1;

    .line 355
    .line 356
    check-cast v5, Lhc;

    .line 357
    .line 358
    move-object/from16 v10, p1

    .line 359
    .line 360
    check-cast v10, Lbh1;

    .line 361
    .line 362
    array-length v1, v0

    .line 363
    move v3, v2

    .line 364
    :goto_3
    if-ge v2, v1, :cond_b

    .line 365
    .line 366
    aget-object v11, v0, v2

    .line 367
    .line 368
    add-int/lit8 v17, v3, 0x1

    .line 369
    .line 370
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    move-object v12, v3

    .line 378
    check-cast v12, Lkx0;

    .line 379
    .line 380
    invoke-interface {v8}, Lrx0;->getLayoutDirection()Lnp0;

    .line 381
    .line 382
    .line 383
    move-result-object v13

    .line 384
    iget v14, v7, Lsm1;->ε:I

    .line 385
    .line 386
    iget v15, v6, Lsm1;->ε:I

    .line 387
    .line 388
    iget-object v3, v5, Lhc;->α:Laa;

    .line 389
    .line 390
    move-object/from16 v16, v3

    .line 391
    .line 392
    invoke-static/range {v10 .. v16}, Lec;->β(Lbh1;Lch1;Lkx0;Lnp0;IILaa;)V

    .line 393
    .line 394
    .line 395
    add-int/lit8 v2, v2, 0x1

    .line 396
    .line 397
    move/from16 v3, v17

    .line 398
    .line 399
    goto :goto_3

    .line 400
    :cond_b
    return-object v4

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
