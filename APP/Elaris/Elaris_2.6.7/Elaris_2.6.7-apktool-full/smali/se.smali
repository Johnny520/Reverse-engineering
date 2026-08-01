.class public final Lse;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:Ljava/lang/ClassLoader;

.field public final synthetic e:Lpd;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Le2;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lse;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lse;->c:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lse;->d:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    iput-object p3, p0, Lse;->e:Lpd;

    .line 12
    .line 13
    iput-object p4, p0, Lse;->b:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;I)V
    .locals 0

    .line 16
    iput p5, p0, Lse;->a:I

    iput-object p1, p0, Lse;->b:Ljava/lang/Object;

    iput-object p2, p0, Lse;->c:Landroid/app/Activity;

    iput-object p3, p0, Lse;->d:Ljava/lang/ClassLoader;

    iput-object p4, p0, Lse;->e:Lpd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lse;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v4, v0, Lse;->c:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object v5, v0, Lse;->d:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    iget-object v6, v0, Lse;->e:Lpd;

    .line 14
    .line 15
    iget-object v0, v0, Lse;->b:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v7, v0

    .line 18
    check-cast v7, Le2;

    .line 19
    .line 20
    new-instance v8, Landroid/widget/EditText;

    .line 21
    .line 22
    invoke-direct {v8, v4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "\u8868\u60c5\u540d\u79f0\uff08\u53ef\u9009\uff09"

    .line 29
    .line 30
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 34
    .line 35
    .line 36
    const/high16 v0, 0x41800000    # 16.0f

    .line 37
    .line 38
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 39
    .line 40
    .line 41
    const/high16 v1, 0x41400000    # 12.0f

    .line 42
    .line 43
    invoke-static {v4, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v4, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/4 v10, 0x0

    .line 52
    invoke-virtual {v8, v3, v10, v9, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 53
    .line 54
    .line 55
    const/16 v3, 0xf5

    .line 56
    .line 57
    const/16 v9, 0xf6

    .line 58
    .line 59
    const/16 v11, 0xf9

    .line 60
    .line 61
    invoke-static {v3, v9, v11}, Landroid/graphics/Color;->rgb(III)I

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    const/high16 v13, 0x41100000    # 9.0f

    .line 66
    .line 67
    invoke-static {v4, v13}, Lg2;->g(Landroid/content/Context;F)I

    .line 68
    .line 69
    .line 70
    move-result v14

    .line 71
    const/16 v15, 0xe1

    .line 72
    .line 73
    const/16 v13, 0xe5

    .line 74
    .line 75
    const/16 v3, 0xec

    .line 76
    .line 77
    invoke-static {v15, v13, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    const/high16 v3, 0x3f800000    # 1.0f

    .line 82
    .line 83
    invoke-static {v4, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    invoke-static {v12, v14, v9, v13}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 92
    .line 93
    .line 94
    new-instance v9, Landroid/widget/EditText;

    .line 95
    .line 96
    invoke-direct {v9, v4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 100
    .line 101
    .line 102
    const-string v12, "\u6587\u4ef6\u5939\uff08\u53ef\u9009\uff09"

    .line 103
    .line 104
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 111
    .line 112
    .line 113
    invoke-static {v4, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-static {v4, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    invoke-virtual {v9, v0, v10, v12, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 122
    .line 123
    .line 124
    const/16 v0, 0xf5

    .line 125
    .line 126
    const/16 v12, 0xf6

    .line 127
    .line 128
    invoke-static {v0, v12, v11}, Landroid/graphics/Color;->rgb(III)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    const/high16 v11, 0x41100000    # 9.0f

    .line 133
    .line 134
    invoke-static {v4, v11}, Lg2;->g(Landroid/content/Context;F)I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    const/16 v12, 0xe5

    .line 139
    .line 140
    const/16 v13, 0xec

    .line 141
    .line 142
    invoke-static {v15, v12, v13}, Landroid/graphics/Color;->rgb(III)I

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    invoke-static {v4, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    invoke-static {v0, v11, v12, v13}, Lg2;->n(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v9, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 155
    .line 156
    .line 157
    const-string v0, "__uncategorized__"

    .line 158
    .line 159
    iget-object v11, v7, Le2;->i:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_0

    .line 166
    .line 167
    iget-object v0, v7, Le2;->i:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v0}, Li5;->G1(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    .line 176
    :cond_0
    const-string v0, "\u4e0a\u4f20\u516c\u5f00\u8868\u60c5"

    .line 177
    .line 178
    const-string v11, "\u5ba1\u6838\u901a\u8fc7\u540e\uff0c\u6240\u6709 Elaris \u7528\u6237\u90fd\u53ef\u4ee5\u770b\u5230\u5e76\u53d1\u9001\u3002"

    .line 179
    .line 180
    invoke-static {v4, v0, v11}, Lg2;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ly;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-object v11, v0, Ly;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v11, Landroid/app/Dialog;

    .line 187
    .line 188
    iget-object v0, v0, Ly;->a:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Landroid/widget/LinearLayout;

    .line 191
    .line 192
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 193
    .line 194
    const/high16 v13, 0x42400000    # 48.0f

    .line 195
    .line 196
    invoke-static {v4, v13}, Lg2;->g(Landroid/content/Context;F)I

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    const/4 v15, -0x1

    .line 201
    invoke-direct {v12, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 202
    .line 203
    .line 204
    invoke-static {v4, v1}, Lg2;->g(Landroid/content/Context;F)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    iput v1, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 209
    .line 210
    invoke-virtual {v0, v8, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 211
    .line 212
    .line 213
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 214
    .line 215
    invoke-static {v4, v13}, Lg2;->g(Landroid/content/Context;F)I

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    invoke-direct {v1, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 220
    .line 221
    .line 222
    const/high16 v12, 0x41000000    # 8.0f

    .line 223
    .line 224
    invoke-static {v4, v12}, Lg2;->g(Landroid/content/Context;F)I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    iput v12, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 229
    .line 230
    invoke-virtual {v0, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 231
    .line 232
    .line 233
    new-instance v1, Landroid/widget/LinearLayout;

    .line 234
    .line 235
    invoke-direct {v1, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 236
    .line 237
    .line 238
    const/16 v12, 0x10

    .line 239
    .line 240
    invoke-virtual {v1, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 241
    .line 242
    .line 243
    const-string v12, "\u53d6\u6d88"

    .line 244
    .line 245
    invoke-static {v4, v12}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    const-string v13, "\u9009\u62e9\u56fe\u7247"

    .line 250
    .line 251
    invoke-static {v4, v13}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 256
    .line 257
    const/high16 v15, 0x42280000    # 42.0f

    .line 258
    .line 259
    invoke-static {v4, v15}, Lg2;->g(Landroid/content/Context;F)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-direct {v14, v10, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v12, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 267
    .line 268
    .line 269
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 270
    .line 271
    invoke-static {v4, v15}, Lg2;->g(Landroid/content/Context;F)I

    .line 272
    .line 273
    .line 274
    move-result v14

    .line 275
    invoke-direct {v2, v10, v14, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 276
    .line 277
    .line 278
    const/high16 v3, 0x41200000    # 10.0f

    .line 279
    .line 280
    invoke-static {v4, v3}, Lg2;->g(Landroid/content/Context;F)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 285
    .line 286
    invoke-virtual {v1, v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v4}, Lg2;->c(Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 294
    .line 295
    .line 296
    new-instance v0, Lq1;

    .line 297
    .line 298
    const/4 v1, 0x1

    .line 299
    invoke-direct {v0, v11, v1}, Lq1;-><init>(Landroid/app/Dialog;I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 303
    .line 304
    .line 305
    new-instance v3, Lt1;

    .line 306
    .line 307
    move-object v10, v11

    .line 308
    invoke-direct/range {v3 .. v10}, Lt1;-><init>(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Le2;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/app/Dialog;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v13, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v10, v4}, Lg2;->p(Landroid/app/Dialog;Landroid/app/Activity;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :pswitch_0
    :try_start_0
    iget-object v1, v0, Lse;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v1, Landroid/app/Dialog;

    .line 321
    .line 322
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 323
    .line 324
    .line 325
    :catchall_0
    iget-object v1, v0, Lse;->c:Landroid/app/Activity;

    .line 326
    .line 327
    iget-object v2, v0, Lse;->d:Ljava/lang/ClassLoader;

    .line 328
    .line 329
    iget-object v0, v0, Lse;->e:Lpd;

    .line 330
    .line 331
    if-eqz v1, :cond_8

    .line 332
    .line 333
    invoke-static {}, Lcom/mr/elaris/w;->S()I

    .line 334
    .line 335
    .line 336
    new-instance v3, Ly;

    .line 337
    .line 338
    invoke-direct {v3, v2, v0}, Ly;-><init>(Ljava/lang/ClassLoader;Lpd;)V

    .line 339
    .line 340
    .line 341
    sput-object v3, Lcom/mr/elaris/w;->r:Ly;

    .line 342
    .line 343
    new-instance v0, Landroid/content/Intent;

    .line 344
    .line 345
    const-string v2, "android.intent.action.OPEN_DOCUMENT_TREE"

    .line 346
    .line 347
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    const/16 v2, 0xc3

    .line 351
    .line 352
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 353
    .line 354
    .line 355
    const/4 v2, 0x0

    .line 356
    :try_start_1
    invoke-static {v1}, Lcom/mr/elaris/w;->H0(Landroid/content/Context;)Lw6;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    if-eqz v3, :cond_1

    .line 361
    .line 362
    iget-object v3, v3, Lw6;->b:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v3, Landroid/net/Uri;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 365
    .line 366
    if-eqz v3, :cond_1

    .line 367
    .line 368
    goto :goto_2

    .line 369
    :catchall_1
    :cond_1
    :try_start_2
    sget-object v3, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 370
    .line 371
    invoke-static {v3}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    if-nez v3, :cond_2

    .line 376
    .line 377
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    :cond_2
    if-nez v3, :cond_3

    .line 382
    .line 383
    :catchall_2
    move-object v3, v2

    .line 384
    goto :goto_2

    .line 385
    :cond_3
    const-string v4, "primary"

    .line 386
    .line 387
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    const/16 v5, 0x2f

    .line 392
    .line 393
    const/16 v6, 0x5c

    .line 394
    .line 395
    invoke-virtual {v3, v6, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v7

    .line 407
    invoke-virtual {v7, v6, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    if-eqz v6, :cond_4

    .line 416
    .line 417
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    :cond_4
    :goto_0
    const-string v5, "/"

    .line 426
    .line 427
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    if-eqz v5, :cond_5

    .line 432
    .line 433
    const/4 v5, 0x1

    .line 434
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    goto :goto_0

    .line 439
    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    if-nez v5, :cond_6

    .line 444
    .line 445
    goto :goto_1

    .line 446
    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    .line 447
    .line 448
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    const-string v4, ":"

    .line 455
    .line 456
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    :goto_1
    const-string v3, "com.android.externalstorage.documents"

    .line 467
    .line 468
    invoke-static {v3, v4}, Landroid/provider/DocumentsContract;->buildDocumentUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 469
    .line 470
    .line 471
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 472
    :goto_2
    if-eqz v3, :cond_7

    .line 473
    .line 474
    const-string v4, "android.provider.extra.INITIAL_URI"

    .line 475
    .line 476
    invoke-virtual {v0, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 477
    .line 478
    .line 479
    :cond_7
    const/16 v3, 0x2018

    .line 480
    .line 481
    :try_start_3
    invoke-virtual {v1, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 482
    .line 483
    .line 484
    const-string v0, "\u8bf7\u9009\u62e9\u7cfb\u7edf\u5141\u8bb8\u7684\u6700\u9ad8\u5c42\u76ee\u5f55\uff0c\u6388\u6743\u5c06\u8986\u76d6\u8be5\u76ee\u5f55\u53ca\u5168\u90e8\u5b50\u76ee\u5f55"

    .line 485
    .line 486
    invoke-static {v1, v0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 487
    .line 488
    .line 489
    goto :goto_3

    .line 490
    :catchall_3
    move-exception v0

    .line 491
    sput-object v2, Lcom/mr/elaris/w;->r:Ly;

    .line 492
    .line 493
    const-string v2, "\u65e0\u6cd5\u6253\u5f00\u76ee\u5f55\u6388\u6743"

    .line 494
    .line 495
    invoke-static {v1, v2}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    new-instance v1, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    const-string v2, "local voice tree picker failed: "

    .line 501
    .line 502
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    const-string v2, ": "

    .line 517
    .line 518
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    goto :goto_3

    .line 540
    :cond_8
    const-string v0, "\u672a\u8bc6\u522b\u5f53\u524d\u804a\u5929"

    .line 541
    .line 542
    invoke-static {v1, v0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    :goto_3
    return-void

    .line 546
    :pswitch_1
    :try_start_4
    iget-object v1, v0, Lse;->b:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v1, Landroid/app/Dialog;

    .line 549
    .line 550
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 551
    .line 552
    .line 553
    :catchall_4
    iget-object v1, v0, Lse;->c:Landroid/app/Activity;

    .line 554
    .line 555
    iget-object v2, v0, Lse;->d:Ljava/lang/ClassLoader;

    .line 556
    .line 557
    iget-object v0, v0, Lse;->e:Lpd;

    .line 558
    .line 559
    invoke-static {v1, v2, v0}, Li5;->P1(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
