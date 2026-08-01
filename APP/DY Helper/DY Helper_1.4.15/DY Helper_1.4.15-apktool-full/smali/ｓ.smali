.class public final Lｓ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lｓ;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lｓ;->η:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p2, p0, Lｓ;->ε:I

    iput-object p1, p0, Lｓ;->η:Ljava/lang/Object;

    iput-object p3, p0, Lｓ;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lｓ;->ε:I

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object p0, p0, Lｓ;->η:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroidx/appcompat/widget/ScrollingTabContainerView;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sub-int/2addr v2, v0

    .line 32
    div-int/lit8 v2, v2, 0x2

    .line 33
    .line 34
    sub-int/2addr v1, v2

    .line 35
    invoke-virtual {p0, v1, v4}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->ε:Lｓ;

    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    iget-object v0, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lr50;

    .line 44
    .line 45
    iget-object p0, p0, Lｓ;->η:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Lr50;->accept(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    iget-object v0, p0, Lｓ;->η:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lqr0;

    .line 54
    .line 55
    iget-object v3, v0, Lqr0;->θ:Lkotlinx/coroutines/α;

    .line 56
    .line 57
    :cond_0
    :try_start_0
    iget-object v5, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Ljava/lang/Runnable;

    .line 60
    .line 61
    invoke-interface {v5}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v5

    .line 66
    sget-object v6, Lhz;->ε:Lhz;

    .line 67
    .line 68
    invoke-static {v6, v5}, Lbd;->ω(Lup;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {v0}, Lqr0;->υ()Ljava/lang/Runnable;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-nez v5, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iput-object v5, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 79
    .line 80
    add-int/2addr v4, v2

    .line 81
    if-lt v4, v1, :cond_0

    .line 82
    .line 83
    invoke-virtual {v3, v0}, Lkotlinx/coroutines/α;->σ(Lup;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_0

    .line 88
    .line 89
    invoke-virtual {v3, v0, p0}, Lkotlinx/coroutines/α;->ρ(Lup;Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-void

    .line 93
    :pswitch_2
    iget-object v0, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lae;

    .line 96
    .line 97
    iget-object p0, p0, Lｓ;->η:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Lnc0;

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Lae;->Ε(Lkotlinx/coroutines/α;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_3
    sget-boolean v0, Lyw;->ι:Z

    .line 106
    .line 107
    if-nez v0, :cond_2

    .line 108
    .line 109
    goto/16 :goto_3

    .line 110
    .line 111
    :cond_2
    sget v0, Lyw;->κ:I

    .line 112
    .line 113
    if-gtz v0, :cond_3

    .line 114
    .line 115
    sget-object v0, Lyw;->α:Landroid/os/Handler;

    .line 116
    .line 117
    sput-boolean v4, Lyw;->ι:Z

    .line 118
    .line 119
    const-string v0, "\u5012\u8ba1\u65f6\u5f52\u96f6\uff0c\u6267\u884c\u9000\u51fa"

    .line 120
    .line 121
    const/4 v1, 0x4

    .line 122
    const-string v2, "DYHelper:DurationAlert"

    .line 123
    .line 124
    invoke-static {v2, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    sget-object v0, Lyw;->α:Landroid/os/Handler;

    .line 128
    .line 129
    invoke-static {}, Lyw;->θ()V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Landroid/app/Activity;

    .line 135
    .line 136
    iget-object p0, p0, Lｓ;->η:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, Lxw;

    .line 139
    .line 140
    invoke-static {v0, p0}, Lyw;->ζ(Landroid/app/Activity;Lxw;)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_3

    .line 144
    .line 145
    :cond_3
    sget-object v0, Lyw;->α:Landroid/os/Handler;

    .line 146
    .line 147
    iget-object v0, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Landroid/app/Activity;

    .line 150
    .line 151
    sget v5, Lyw;->κ:I

    .line 152
    .line 153
    const-string v6, "\u5373\u5c06\u9000\u51fa\uff0c\u5269\u4f59 "

    .line 154
    .line 155
    const/4 v7, -0x1

    .line 156
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 165
    .line 166
    new-instance v9, Landroid/widget/LinearLayout;

    .line 167
    .line 168
    invoke-direct {v9, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v9, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 172
    .line 173
    .line 174
    const/16 v10, 0x11

    .line 175
    .line 176
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 177
    .line 178
    .line 179
    const/16 v11, 0x18

    .line 180
    .line 181
    int-to-float v11, v11

    .line 182
    mul-float/2addr v11, v8

    .line 183
    float-to-int v11, v11

    .line 184
    int-to-float v1, v1

    .line 185
    mul-float/2addr v1, v8

    .line 186
    float-to-int v1, v1

    .line 187
    invoke-virtual {v9, v11, v1, v11, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 188
    .line 189
    .line 190
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 191
    .line 192
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 193
    .line 194
    .line 195
    const v11, -0x1933de00

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 199
    .line 200
    .line 201
    int-to-float v1, v1

    .line 202
    invoke-virtual {v8, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 206
    .line 207
    .line 208
    new-instance v1, Landroid/widget/TextView;

    .line 209
    .line 210
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 211
    .line 212
    .line 213
    const-string v8, " \u5373\u5c06\u9000\u51fa\u6296\u97f3"

    .line 214
    .line 215
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    .line 217
    .line 218
    const/high16 v8, 0x41700000    # 15.0f

    .line 219
    .line 220
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v3, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 233
    .line 234
    .line 235
    new-instance v1, Landroid/widget/TextView;

    .line 236
    .line 237
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 238
    .line 239
    .line 240
    const-string v2, "\u89e6\u6478\u5c4f\u5e55\u4efb\u610f\u4f4d\u7f6e\u53ef\u53d6\u6d88"

    .line 241
    .line 242
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    .line 244
    .line 245
    const/high16 v2, 0x41400000    # 12.0f

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 248
    .line 249
    .line 250
    const v2, -0x33000001    # -1.3421772E8f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 260
    .line 261
    .line 262
    new-instance v1, Landroid/widget/Toast;

    .line 263
    .line 264
    invoke-direct {v1, v0}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v9}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v4}, Landroid/widget/Toast;->setDuration(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v10, v4, v4}, Landroid/widget/Toast;->setGravity(III)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 277
    .line 278
    .line 279
    goto :goto_2

    .line 280
    :catchall_1
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v2, "s"

    .line 289
    .line 290
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 302
    .line 303
    .line 304
    :catchall_2
    :goto_2
    sget v0, Lyw;->κ:I

    .line 305
    .line 306
    sget-object v1, Lyw;->α:Landroid/os/Handler;

    .line 307
    .line 308
    add-int/2addr v0, v7

    .line 309
    sput v0, Lyw;->κ:I

    .line 310
    .line 311
    sget-object v0, Lyw;->α:Landroid/os/Handler;

    .line 312
    .line 313
    const-wide/16 v1, 0x3e8

    .line 314
    .line 315
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 316
    .line 317
    .line 318
    :goto_3
    return-void

    .line 319
    :pswitch_4
    iget-object v0, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Ly21;

    .line 322
    .line 323
    iget-object p0, p0, Lｓ;->η:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast p0, Landroid/graphics/Typeface;

    .line 326
    .line 327
    iget-object v0, v0, Ly21;->ε:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Ly5;

    .line 330
    .line 331
    if-eqz v0, :cond_4

    .line 332
    .line 333
    invoke-virtual {v0, p0}, Ly5;->β(Landroid/graphics/Typeface;)V

    .line 334
    .line 335
    .line 336
    :cond_4
    return-void

    .line 337
    :pswitch_5
    iget-object v0, p0, Lｓ;->ζ:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Lｑ;

    .line 340
    .line 341
    iget-object p0, p0, Lｓ;->η:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p0, Landroidx/appcompat/widget/γ;

    .line 344
    .line 345
    iget-object v1, p0, Landroidx/appcompat/widget/γ;->η:Liz0;

    .line 346
    .line 347
    if-eqz v1, :cond_5

    .line 348
    .line 349
    iget-object v2, v1, Liz0;->ε:Lgz0;

    .line 350
    .line 351
    if-eqz v2, :cond_5

    .line 352
    .line 353
    invoke-interface {v2, v1}, Lgz0;->θ(Liz0;)V

    .line 354
    .line 355
    .line 356
    :cond_5
    iget-object v1, p0, Landroidx/appcompat/widget/γ;->μ:Lwz0;

    .line 357
    .line 358
    check-cast v1, Landroid/view/View;

    .line 359
    .line 360
    if-eqz v1, :cond_8

    .line 361
    .line 362
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    if-eqz v1, :cond_8

    .line 367
    .line 368
    invoke-virtual {v0}, Lqz0;->β()Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_6

    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_6
    iget-object v1, v0, Lqz0;->ε:Landroid/view/View;

    .line 376
    .line 377
    if-nez v1, :cond_7

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_7
    invoke-virtual {v0, v4, v4, v4, v4}, Lqz0;->δ(IIZZ)V

    .line 381
    .line 382
    .line 383
    :goto_4
    iput-object v0, p0, Landroidx/appcompat/widget/γ;->ψ:Lｑ;

    .line 384
    .line 385
    :cond_8
    :goto_5
    iput-object v3, p0, Landroidx/appcompat/widget/γ;->Α:Lｓ;

    .line 386
    .line 387
    return-void

    .line 388
    nop

    .line 389
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
