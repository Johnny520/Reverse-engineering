.class public final Lyyds/ᛴᛴᛲᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Lyyds/ᛷᛴᛱᛱ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛱᲈ;

.field public final ᲇᲈᛵᛷ:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILyyds/ᛷᛴᛱᛱ;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput v1, v0, Lyyds/ᛴᛴᛲᛷ;->ᛲᲈᲁ:I

    .line 9
    .line 10
    move-object/from16 v2, p3

    .line 11
    .line 12
    iput-object v2, v0, Lyyds/ᛴᛴᛲᛷ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛴᛱᛱ;

    .line 13
    .line 14
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object/from16 v2, p1

    .line 22
    .line 23
    :goto_0
    sget-object v3, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ(Landroid/content/Context;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Lyyds/ᛵᛶᛵᲈ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const v4, 0x660c005b

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-virtual {v3, v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const v4, 0x660900e4

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    move-object v10, v7

    .line 52
    check-cast v10, Landroid/widget/TextView;

    .line 53
    .line 54
    if-eqz v10, :cond_2

    .line 55
    .line 56
    const v4, 0x6609037d

    .line 57
    .line 58
    .line 59
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    move-object v11, v7

    .line 64
    check-cast v11, Landroid/widget/ProgressBar;

    .line 65
    .line 66
    if-eqz v11, :cond_2

    .line 67
    .line 68
    const v4, 0x6609037e

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    move-object v12, v7

    .line 76
    check-cast v12, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;

    .line 77
    .line 78
    if-eqz v12, :cond_2

    .line 79
    .line 80
    const v4, 0x6609037f

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    move-object v13, v7

    .line 88
    check-cast v13, Landroid/widget/ProgressBar;

    .line 89
    .line 90
    if-eqz v13, :cond_2

    .line 91
    .line 92
    const v4, 0x660904f3

    .line 93
    .line 94
    .line 95
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    move-object v14, v7

    .line 100
    check-cast v14, Landroid/widget/TextView;

    .line 101
    .line 102
    if-eqz v14, :cond_2

    .line 103
    .line 104
    const v4, 0x660904f4

    .line 105
    .line 106
    .line 107
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    move-object v15, v7

    .line 112
    check-cast v15, Landroid/widget/TextView;

    .line 113
    .line 114
    if-eqz v15, :cond_2

    .line 115
    .line 116
    const v4, 0x660904f5

    .line 117
    .line 118
    .line 119
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    move-object/from16 v16, v7

    .line 124
    .line 125
    check-cast v16, Landroid/widget/TextView;

    .line 126
    .line 127
    if-eqz v16, :cond_2

    .line 128
    .line 129
    const v4, 0x660904f6

    .line 130
    .line 131
    .line 132
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    move-object/from16 v17, v7

    .line 137
    .line 138
    check-cast v17, Landroid/widget/TextView;

    .line 139
    .line 140
    if-eqz v17, :cond_2

    .line 141
    .line 142
    const v4, 0x660904f7

    .line 143
    .line 144
    .line 145
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    move-object/from16 v18, v7

    .line 150
    .line 151
    check-cast v18, Landroid/widget/TextView;

    .line 152
    .line 153
    if-eqz v18, :cond_2

    .line 154
    .line 155
    const v4, 0x660904f8

    .line 156
    .line 157
    .line 158
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    move-object/from16 v19, v7

    .line 163
    .line 164
    check-cast v19, Landroid/widget/TextView;

    .line 165
    .line 166
    if-eqz v19, :cond_2

    .line 167
    .line 168
    const v4, 0x660904f9

    .line 169
    .line 170
    .line 171
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    move-object/from16 v20, v7

    .line 176
    .line 177
    check-cast v20, Landroid/widget/TextView;

    .line 178
    .line 179
    if-eqz v20, :cond_2

    .line 180
    .line 181
    const v4, 0x660904fa

    .line 182
    .line 183
    .line 184
    invoke-static {v3, v4}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    move-object/from16 v21, v7

    .line 189
    .line 190
    check-cast v21, Landroid/widget/TextView;

    .line 191
    .line 192
    if-eqz v21, :cond_2

    .line 193
    .line 194
    new-instance v8, Lyyds/ᛷᛳᛱᲈ;

    .line 195
    .line 196
    move-object v9, v3

    .line 197
    check-cast v9, Landroid/widget/FrameLayout;

    .line 198
    .line 199
    invoke-direct/range {v8 .. v21}, Lyyds/ᛷᛳᛱᲈ;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ProgressBar;Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 200
    .line 201
    .line 202
    move-object/from16 v7, v21

    .line 203
    .line 204
    const-wide v3, -0x6655e68a836eL

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    iput-object v8, v0, Lyyds/ᛴᛴᛲᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛱᲈ;

    .line 213
    .line 214
    invoke-static {v9}, Lyyds/ᲈᛷᛵᛷ;->ᛳᛸᛴᛶ(Landroid/view/View;)V

    .line 215
    .line 216
    .line 217
    new-instance v3, Lyyds/ᛸᛸᲁᲀ;

    .line 218
    .line 219
    const v4, 0x66060075

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4}, Landroid/content/Context;->getColor(I)I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    const v5, 0x66060087

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v5}, Landroid/content/Context;->getColor(I)I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    move-object v14, v12

    .line 234
    new-instance v12, Lyyds/ᛱᲁᛲᛱ;

    .line 235
    .line 236
    const-wide v15, -0xd830e68a836eL

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    invoke-static/range {v15 .. v16}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v16

    .line 245
    const-wide v17, -0xd84de68a836eL

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    invoke-static/range {v17 .. v18}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v17

    .line 254
    const/16 v18, 0x0

    .line 255
    .line 256
    const/16 v19, 0x3

    .line 257
    .line 258
    const/4 v13, 0x2

    .line 259
    const-class v15, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;

    .line 260
    .line 261
    invoke-direct/range {v12 .. v19}, Lyyds/ᛱᲁᛲᛱ;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 262
    .line 263
    .line 264
    move-object v8, v12

    .line 265
    move-object v12, v14

    .line 266
    invoke-direct {v3, v4, v5, v8}, Lyyds/ᛸᛸᲁᲀ;-><init>(IILyyds/ᛲᲇᲁᛴ;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v11, v3}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 270
    .line 271
    .line 272
    const/4 v3, 0x0

    .line 273
    const/4 v4, 0x1

    .line 274
    invoke-virtual {v12, v3, v4}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛳᲀ(FZ)V

    .line 275
    .line 276
    .line 277
    new-instance v3, Landroid/app/Dialog;

    .line 278
    .line 279
    const v4, 0x1030010

    .line 280
    .line 281
    .line 282
    invoke-direct {v3, v2, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3, v9}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v6}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3, v6}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 292
    .line 293
    .line 294
    new-instance v2, Lyyds/ᛲᛴᛸᛶ;

    .line 295
    .line 296
    invoke-direct {v2, v0}, Lyyds/ᛲᛴᛸᛶ;-><init>(Lyyds/ᛴᛴᛲᛷ;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3, v2}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 300
    .line 301
    .line 302
    iput-object v3, v0, Lyyds/ᛴᛴᛲᛷ;->ᲇᲈᛵᛷ:Landroid/app/Dialog;

    .line 303
    .line 304
    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    if-eqz v2, :cond_1

    .line 309
    .line 310
    const v3, 0x106000d

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 314
    .line 315
    .line 316
    const/16 v3, 0x11

    .line 317
    .line 318
    invoke-virtual {v2, v3}, Landroid/view/Window;->setGravity(I)V

    .line 319
    .line 320
    .line 321
    const/4 v3, -0x1

    .line 322
    invoke-virtual {v2, v3, v3}, Landroid/view/Window;->setLayout(II)V

    .line 323
    .line 324
    .line 325
    const/4 v3, 0x2

    .line 326
    invoke-virtual {v2, v3}, Landroid/view/Window;->addFlags(I)V

    .line 327
    .line 328
    .line 329
    const v3, 0x3ec28f5c    # 0.38f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v3}, Landroid/view/Window;->setDimAmount(F)V

    .line 333
    .line 334
    .line 335
    const v3, 0x1030003

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v3}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 339
    .line 340
    .line 341
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-wide v3, -0x6662e68a836eL

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-wide v3, -0x666be68a836eL

    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    .line 377
    new-instance v1, Lyyds/ᛶᲈᛴᲈ;

    .line 378
    .line 379
    const/16 v2, 0xd

    .line 380
    .line 381
    invoke-direct {v1, v2, v0}, Lyyds/ᛶᲈᛴᲈ;-><init>(ILjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v10, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    const-wide v1, -0x63411e68a836eL

    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛱᛳᲇ(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v5
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛴᛲᛷ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyyds/ᛴᛴᛲᛷ;->ᛲᛴᛳᛲ:Z

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛴᛴᛲᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛱᲈ;

    .line 10
    .line 11
    iget-object v1, v0, Lyyds/ᛷᛳᛱᲈ;->ᛶᛷᛲᲁ:Landroid/widget/TextView;

    .line 12
    .line 13
    iget-object v2, v0, Lyyds/ᛷᛳᛱᲈ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 14
    .line 15
    const-wide v3, -0x66d3e68a836eL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lyyds/ᛷᛳᛱᲈ;->ᛷᛲᲈᛱ:Landroid/widget/TextView;

    .line 28
    .line 29
    const-wide v3, -0x66d7e68a836eL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 43
    .line 44
    .line 45
    const v0, 0x3f3851ec    # 0.72f

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 49
    .line 50
    .line 51
    const-wide v0, -0x66e1e68a836eL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lyyds/ᛴᛴᛲᛷ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛴᛱᛱ;

    .line 64
    .line 65
    invoke-virtual {p0}, Lyyds/ᛷᛴᛱᛱ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final ᛵᛸᛸᛷ(II)V
    .locals 6

    .line 1
    sub-int v0, p1, p2

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :cond_0
    iget-object v1, p0, Lyyds/ᛴᛴᛲᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛱᲈ;

    .line 7
    .line 8
    iget-object v2, v1, Lyyds/ᛷᛳᛱᲈ;->ᛷᛵᲇᲀ:Landroid/widget/TextView;

    .line 9
    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-wide v4, -0x66bae68a836eL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-wide v4, -0x66bee68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, v1, Lyyds/ᛷᛳᛱᲈ;->ᛱᛳᲇ:Landroid/widget/TextView;

    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-wide v1, -0x66c5e68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget p0, p0, Lyyds/ᛴᛴᛲᛷ;->ᛲᲈᲁ:I

    .line 66
    .line 67
    if-le p1, p0, :cond_1

    .line 68
    .line 69
    move p1, p0

    .line 70
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-wide v1, -0x66cae68a836eL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-wide p0, -0x66cee68a836eL

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final ᲀᛲᛳᲀ(F)V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛴᛴᛲᛷ;->ᛲᲈᲁ:I

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    div-float/2addr p1, v1

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p1, v1, v0}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :cond_0
    iget-object p0, p0, Lyyds/ᛴᛴᛲᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛱᲈ;

    .line 15
    .line 16
    iget-object p1, p0, Lyyds/ᛷᛳᛱᲈ;->ᲇᲇᲇᛱ:Landroid/widget/ProgressBar;

    .line 17
    .line 18
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 19
    .line 20
    mul-float/2addr v1, v0

    .line 21
    invoke-static {v1}, Lyyds/ᛱᛷᲈᛲ;->ᛶᛳᛶᛵ(F)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {p1, v1, v2}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lyyds/ᛷᛳᛱᲈ;->ᛲᛲᲈᲈ:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-static {v0}, Lyyds/ᛱᛳᛳᛵ;->ᛲᛴᛳᛲ(F)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
