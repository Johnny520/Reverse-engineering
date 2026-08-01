.class public final synthetic Lvj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/KeyEvent$Callback;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 16
    iput p1, p0, Lvj;->ε:I

    iput-object p3, p0, Lvj;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lvj;->ι:Ljava/lang/Object;

    iput-object p5, p0, Lvj;->η:Ljava/lang/Object;

    iput-object p2, p0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/View;Lod;)V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput v0, p0, Lvj;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    iput-object p2, p0, Lvj;->η:Ljava/lang/Object;

    iput-object p3, p0, Lvj;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lvj;->ι:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/AlertDialog;Landroid/app/Activity;Ljava/lang/String;La80;)V
    .locals 1

    .line 18
    const/4 v0, 0x5

    iput v0, p0, Lvj;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj;->η:Ljava/lang/Object;

    iput-object p2, p0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    iput-object p3, p0, Lvj;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lvj;->ι:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lfk0;Landroid/app/Activity;Lhu;Landroid/app/AlertDialog;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lvj;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvj;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    .line 10
    .line 11
    iput-object p3, p0, Lvj;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lvj;->η:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lfi;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 19
    const/4 v0, 0x4

    iput v0, p0, Lvj;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj;->θ:Ljava/lang/Object;

    iput-object p2, p0, Lvj;->ι:Ljava/lang/Object;

    iput-object p3, p0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    iput-object p4, p0, Lvj;->η:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lvj;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lvj;->η:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/app/AlertDialog;

    .line 15
    .line 16
    iget-object v2, v0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    .line 17
    .line 18
    move-object v3, v2

    .line 19
    check-cast v3, Landroid/app/Activity;

    .line 20
    .line 21
    iget-object v2, v0, Lvj;->θ:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v6, v2

    .line 24
    check-cast v6, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, v0, Lvj;->ι:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La80;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 31
    .line 32
    .line 33
    sget-object v1, Lbv1;->α:Lbv1;

    .line 34
    .line 35
    const-string v4, "\u624b\u52a8\u7f16\u8f91\u4fe1\u606f\u6761\u683c\u5f0f"

    .line 36
    .line 37
    const-string v5, "{time:yyyy-MM-dd HH:mm} \u00b7 {location}"

    .line 38
    .line 39
    new-instance v8, Lhu;

    .line 40
    .line 41
    const/16 v1, 0x1b

    .line 42
    .line 43
    invoke-direct {v8, v0, v3, v1}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 44
    .line 45
    .line 46
    const v7, 0x20001

    .line 47
    .line 48
    .line 49
    invoke-static/range {v3 .. v8}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_0
    iget-object v1, v0, Lvj;->θ:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v2, v0, Lvj;->ι:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lfi;

    .line 60
    .line 61
    iget-object v3, v0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    .line 62
    .line 63
    check-cast v3, Landroid/app/Activity;

    .line 64
    .line 65
    iget-object v0, v0, Lvj;->η:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    sget-object v4, Lbv1;->α:Lbv1;

    .line 70
    .line 71
    const-string v4, "info_bar_text_color"

    .line 72
    .line 73
    invoke-static {v4, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Lfi;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v4, "\u5df2\u5e94\u7528 "

    .line 82
    .line 83
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v0, " ("

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v0, ")"

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v3, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_1
    iget-object v1, v0, Lvj;->θ:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Landroid/widget/LinearLayout;

    .line 117
    .line 118
    iget-object v6, v0, Lvj;->ι:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v6, Landroid/widget/FrameLayout;

    .line 121
    .line 122
    iget-object v7, v0, Lvj;->η:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v7, Ljava/lang/String;

    .line 125
    .line 126
    iget-object v0, v0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    .line 127
    .line 128
    check-cast v0, Landroid/widget/TextView;

    .line 129
    .line 130
    const/4 v8, 0x3

    .line 131
    invoke-virtual {v1, v8}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_0

    .line 139
    .line 140
    move v1, v4

    .line 141
    goto :goto_0

    .line 142
    :cond_0
    move v1, v5

    .line 143
    :goto_0
    sget-object v9, Lbv1;->α:Lbv1;

    .line 144
    .line 145
    const-string v9, "settings_section_expanded_"

    .line 146
    .line 147
    invoke-virtual {v9, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-static {v7, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    if-eqz v1, :cond_3

    .line 156
    .line 157
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    instance-of v9, v1, Landroid/view/View;

    .line 172
    .line 173
    if-eqz v9, :cond_1

    .line 174
    .line 175
    move-object v2, v1

    .line 176
    check-cast v2, Landroid/view/View;

    .line 177
    .line 178
    :cond_1
    if-eqz v2, :cond_2

    .line 179
    .line 180
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    goto :goto_1

    .line 185
    :cond_2
    move v1, v5

    .line 186
    :goto_1
    const/high16 v2, 0x40000000    # 2.0f

    .line 187
    .line 188
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-virtual {v6, v1, v2}, Landroid/view/View;->measure(II)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    iput v5, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 208
    .line 209
    invoke-virtual {v6}, Landroid/view/View;->requestLayout()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v6, v7}, Landroid/view/View;->setAlpha(F)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    const/4 v9, 0x6

    .line 223
    invoke-static {v2, v9}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    neg-int v2, v2

    .line 228
    int-to-float v2, v2

    .line 229
    invoke-virtual {v6, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 230
    .line 231
    .line 232
    new-instance v2, Landroid/animation/AnimatorSet;

    .line 233
    .line 234
    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 235
    .line 236
    .line 237
    filled-new-array {v5, v1}, [I

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    const-wide/16 v10, 0x140

    .line 246
    .line 247
    invoke-virtual {v1, v10, v11}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 248
    .line 249
    .line 250
    new-instance v12, Landroid/view/animation/DecelerateInterpolator;

    .line 251
    .line 252
    invoke-direct {v12}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v12}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 256
    .line 257
    .line 258
    new-instance v12, Lfg;

    .line 259
    .line 260
    invoke-direct {v12, v6, v4}, Lfg;-><init>(Landroid/view/View;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v12}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 264
    .line 265
    .line 266
    sget-object v12, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 267
    .line 268
    new-array v13, v3, [F

    .line 269
    .line 270
    fill-array-data v13, :array_0

    .line 271
    .line 272
    .line 273
    invoke-static {v6, v12, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    const-wide/16 v13, 0x104

    .line 278
    .line 279
    invoke-virtual {v12, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 280
    .line 281
    .line 282
    new-instance v15, Landroid/view/animation/DecelerateInterpolator;

    .line 283
    .line 284
    invoke-direct {v15}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v15}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 288
    .line 289
    .line 290
    sget-object v15, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 291
    .line 292
    move/from16 p0, v7

    .line 293
    .line 294
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-static {v7, v9}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    neg-int v7, v7

    .line 306
    int-to-float v7, v7

    .line 307
    new-array v9, v3, [F

    .line 308
    .line 309
    aput v7, v9, v5

    .line 310
    .line 311
    aput p0, v9, v4

    .line 312
    .line 313
    invoke-static {v6, v15, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-virtual {v7, v10, v11}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 318
    .line 319
    .line 320
    new-instance v9, Landroid/view/animation/DecelerateInterpolator;

    .line 321
    .line 322
    invoke-direct {v9}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7, v9}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 326
    .line 327
    .line 328
    new-array v8, v8, [Landroid/animation/Animator;

    .line 329
    .line 330
    aput-object v1, v8, v5

    .line 331
    .line 332
    aput-object v12, v8, v4

    .line 333
    .line 334
    aput-object v7, v8, v3

    .line 335
    .line 336
    invoke-virtual {v2, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 337
    .line 338
    .line 339
    new-instance v1, Lsu1;

    .line 340
    .line 341
    invoke-direct {v1, v6, v4}, Lsu1;-><init>(Landroid/view/View;I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const/high16 v1, 0x42b40000    # 90.0f

    .line 355
    .line 356
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v0, v13, v14}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    .line 365
    .line 366
    const v2, 0x3f99999a    # 1.2f

    .line 367
    .line 368
    .line 369
    invoke-direct {v1, v2}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_2

    .line 380
    .line 381
    :cond_3
    move/from16 p0, v7

    .line 382
    .line 383
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    new-instance v2, Landroid/animation/AnimatorSet;

    .line 395
    .line 396
    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 397
    .line 398
    .line 399
    filled-new-array {v1, v5}, [I

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    const-wide/16 v9, 0xf0

    .line 408
    .line 409
    invoke-virtual {v1, v9, v10}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 410
    .line 411
    .line 412
    new-instance v7, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 413
    .line 414
    invoke-direct {v7}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v7}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 418
    .line 419
    .line 420
    new-instance v7, Lfg;

    .line 421
    .line 422
    invoke-direct {v7, v6, v3}, Lfg;-><init>(Landroid/view/View;I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v7}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 426
    .line 427
    .line 428
    sget-object v7, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 429
    .line 430
    new-array v9, v3, [F

    .line 431
    .line 432
    fill-array-data v9, :array_1

    .line 433
    .line 434
    .line 435
    invoke-static {v6, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    const-wide/16 v9, 0xaa

    .line 440
    .line 441
    invoke-virtual {v7, v9, v10}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 442
    .line 443
    .line 444
    new-instance v9, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 445
    .line 446
    invoke-direct {v9}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v7, v9}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 450
    .line 451
    .line 452
    sget-object v9, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 453
    .line 454
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    const/4 v11, 0x5

    .line 462
    invoke-static {v10, v11}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 463
    .line 464
    .line 465
    move-result v10

    .line 466
    neg-int v10, v10

    .line 467
    int-to-float v10, v10

    .line 468
    new-array v11, v3, [F

    .line 469
    .line 470
    aput p0, v11, v5

    .line 471
    .line 472
    aput v10, v11, v4

    .line 473
    .line 474
    invoke-static {v6, v9, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    const-wide/16 v10, 0xc8

    .line 479
    .line 480
    invoke-virtual {v9, v10, v11}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 481
    .line 482
    .line 483
    new-instance v10, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 484
    .line 485
    invoke-direct {v10}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v9, v10}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 489
    .line 490
    .line 491
    new-array v8, v8, [Landroid/animation/Animator;

    .line 492
    .line 493
    aput-object v1, v8, v5

    .line 494
    .line 495
    aput-object v7, v8, v4

    .line 496
    .line 497
    aput-object v9, v8, v3

    .line 498
    .line 499
    invoke-virtual {v2, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 500
    .line 501
    .line 502
    new-instance v1, Lsu1;

    .line 503
    .line 504
    invoke-direct {v1, v6, v5}, Lsu1;-><init>(Landroid/view/View;I)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    move/from16 v1, p0

    .line 518
    .line 519
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    const-wide/16 v1, 0xdc

    .line 524
    .line 525
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 530
    .line 531
    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 539
    .line 540
    .line 541
    :goto_2
    return-void

    .line 542
    :pswitch_2
    iget-object v1, v0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    .line 543
    .line 544
    move-object v9, v1

    .line 545
    check-cast v9, Landroid/app/Activity;

    .line 546
    .line 547
    iget-object v1, v0, Lvj;->η:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v1, Landroid/app/AlertDialog;

    .line 550
    .line 551
    iget-object v6, v0, Lvj;->θ:Ljava/lang/Object;

    .line 552
    .line 553
    move-object v13, v6

    .line 554
    check-cast v13, Landroid/view/View;

    .line 555
    .line 556
    iget-object v0, v0, Lvj;->ι:Ljava/lang/Object;

    .line 557
    .line 558
    move-object v10, v0

    .line 559
    check-cast v10, Lod;

    .line 560
    .line 561
    invoke-static {}, Lx9;->ζ()Z

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    if-nez v0, :cond_4

    .line 566
    .line 567
    const-string v0, "\u5185\u6d4b\u8d44\u683c\u5df2\u5931\u6548"

    .line 568
    .line 569
    invoke-static {v9, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 577
    .line 578
    .line 579
    goto/16 :goto_9

    .line 580
    .line 581
    :cond_4
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-eqz v0, :cond_7

    .line 589
    .line 590
    if-eq v0, v4, :cond_6

    .line 591
    .line 592
    if-ne v0, v3, :cond_5

    .line 593
    .line 594
    const-string v0, "\u6b63\u5728\u6279\u91cf\u6d47\u6c34"

    .line 595
    .line 596
    goto :goto_3

    .line 597
    :cond_5
    invoke-static {}, Lγ;->κ()V

    .line 598
    .line 599
    .line 600
    goto/16 :goto_9

    .line 601
    .line 602
    :cond_6
    const-string v0, "\u6b63\u5728\u6279\u91cf\u79cd\u5730"

    .line 603
    .line 604
    goto :goto_3

    .line 605
    :cond_7
    const-string v0, "\u6b63\u5728\u4e00\u952e\u6536\u83dc"

    .line 606
    .line 607
    :goto_3
    const-string v1, "\u6b63\u5728\u7b49\u5f85\u8425\u5730\u4efb\u52a1\u5f00\u59cb"

    .line 608
    .line 609
    invoke-static {v9, v13, v0, v1}, Lxn0;->ξ(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    sget-object v0, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 613
    .line 614
    new-instance v11, Lmb1;

    .line 615
    .line 616
    const/4 v0, 0x4

    .line 617
    invoke-direct {v11, v9, v13, v0}, Lmb1;-><init>(Landroid/app/Activity;Landroid/view/View;I)V

    .line 618
    .line 619
    .line 620
    new-instance v12, Lmb1;

    .line 621
    .line 622
    invoke-direct {v12, v9, v13, v5}, Lmb1;-><init>(Landroid/app/Activity;Landroid/view/View;I)V

    .line 623
    .line 624
    .line 625
    invoke-static {}, Lx9;->ζ()Z

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    if-eqz v0, :cond_b

    .line 630
    .line 631
    invoke-static {}, Lui1;->Α()Z

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    if-nez v0, :cond_8

    .line 636
    .line 637
    goto/16 :goto_7

    .line 638
    .line 639
    :cond_8
    sget-object v1, Ljc1;->γ:La;

    .line 640
    .line 641
    monitor-enter v1

    .line 642
    :try_start_0
    iget-object v0, v1, La;->β:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v0, Lｚ;

    .line 645
    .line 646
    iget-boolean v0, v0, Lｚ;->β:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 647
    .line 648
    if-eqz v0, :cond_9

    .line 649
    .line 650
    monitor-exit v1

    .line 651
    goto :goto_4

    .line 652
    :cond_9
    :try_start_1
    iget-object v0, v1, La;->α:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 655
    .line 656
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 657
    .line 658
    .line 659
    move-result-wide v15

    .line 660
    new-instance v14, Lｚ;

    .line 661
    .line 662
    const/16 v18, 0x0

    .line 663
    .line 664
    const/16 v19, 0x0

    .line 665
    .line 666
    const/16 v17, 0x1

    .line 667
    .line 668
    invoke-direct/range {v14 .. v19}, Lｚ;-><init>(JZLjava/lang/Object;Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    iput-object v14, v1, La;->β:Ljava/lang/Object;

    .line 672
    .line 673
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 674
    .line 675
    .line 676
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 677
    monitor-exit v1

    .line 678
    :goto_4
    if-eqz v2, :cond_c

    .line 679
    .line 680
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 681
    .line 682
    .line 683
    move-result-wide v15

    .line 684
    sget-object v0, Ljc1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 685
    .line 686
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 687
    .line 688
    .line 689
    new-instance v0, Ljava/lang/Thread;

    .line 690
    .line 691
    new-instance v6, Lyb1;

    .line 692
    .line 693
    move-wide v7, v15

    .line 694
    invoke-direct/range {v6 .. v12}, Lyb1;-><init>(JLandroid/app/Activity;Lod;Lmb1;Lmb1;)V

    .line 695
    .line 696
    .line 697
    move-object/from16 v17, v12

    .line 698
    .line 699
    const-string v1, "r4d363e284cf7777d"

    .line 700
    .line 701
    invoke-direct {v0, v6, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 705
    .line 706
    .line 707
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 708
    .line 709
    .line 710
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 711
    .line 712
    goto :goto_5

    .line 713
    :catchall_0
    move-exception v0

    .line 714
    new-instance v1, Leo1;

    .line 715
    .line 716
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 717
    .line 718
    .line 719
    move-object v0, v1

    .line 720
    :goto_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    if-nez v1, :cond_a

    .line 725
    .line 726
    goto :goto_6

    .line 727
    :cond_a
    new-instance v18, Ldc1;

    .line 728
    .line 729
    const/16 v26, 0x0

    .line 730
    .line 731
    const/16 v27, 0x1bc

    .line 732
    .line 733
    const/16 v19, 0x0

    .line 734
    .line 735
    const/16 v20, 0x0

    .line 736
    .line 737
    const/16 v21, 0x0

    .line 738
    .line 739
    const/16 v22, 0x0

    .line 740
    .line 741
    const/16 v23, 0x0

    .line 742
    .line 743
    const/16 v24, 0x0

    .line 744
    .line 745
    const/16 v25, 0x1

    .line 746
    .line 747
    invoke-direct/range {v18 .. v27}, Ldc1;-><init>(IIIIIIIZI)V

    .line 748
    .line 749
    .line 750
    move-object/from16 v0, v18

    .line 751
    .line 752
    sget-object v2, Ljc1;->γ:La;

    .line 753
    .line 754
    invoke-virtual {v2, v7, v8, v0}, La;->α(JLdc1;)V

    .line 755
    .line 756
    .line 757
    const-string v2, "r7ce9b41b1577bc7d"

    .line 758
    .line 759
    const-string v3, "\u521b\u5efa\u8425\u5730\u540e\u53f0\u4efb\u52a1\u5931\u8d25"

    .line 760
    .line 761
    invoke-static {v2, v3, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 762
    .line 763
    .line 764
    :try_start_3
    new-instance v14, Lzb1;

    .line 765
    .line 766
    const/16 v19, 0x0

    .line 767
    .line 768
    move-object/from16 v18, v0

    .line 769
    .line 770
    move-wide v15, v7

    .line 771
    invoke-direct/range {v14 .. v19}, Lzb1;-><init>(JLa80;Ljava/lang/Object;I)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v9, v14}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 775
    .line 776
    .line 777
    :catchall_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 778
    .line 779
    :goto_6
    check-cast v0, Ljava/lang/Boolean;

    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 782
    .line 783
    .line 784
    move-result v5

    .line 785
    goto :goto_8

    .line 786
    :catchall_2
    move-exception v0

    .line 787
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 788
    throw v0

    .line 789
    :cond_b
    :goto_7
    new-instance v14, Ldc1;

    .line 790
    .line 791
    const/16 v22, 0x0

    .line 792
    .line 793
    const/16 v23, 0x1bc

    .line 794
    .line 795
    const/4 v15, 0x0

    .line 796
    const/16 v16, 0x0

    .line 797
    .line 798
    const/16 v17, 0x0

    .line 799
    .line 800
    const/16 v18, 0x0

    .line 801
    .line 802
    const/16 v19, 0x0

    .line 803
    .line 804
    const/16 v20, 0x0

    .line 805
    .line 806
    const/16 v21, 0x1

    .line 807
    .line 808
    invoke-direct/range {v14 .. v23}, Ldc1;-><init>(IIIIIIIZI)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12, v14}, Lmb1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    :cond_c
    :goto_8
    if-nez v5, :cond_d

    .line 815
    .line 816
    invoke-static {v9, v13, v4}, Lxn0;->З(Landroid/app/Activity;Landroid/view/View;Z)Z

    .line 817
    .line 818
    .line 819
    :cond_d
    :goto_9
    return-void

    .line 820
    :pswitch_3
    iget-object v1, v0, Lvj;->θ:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v1, Lfk0;

    .line 823
    .line 824
    iget-object v3, v0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    .line 825
    .line 826
    check-cast v3, Landroid/app/Activity;

    .line 827
    .line 828
    iget-object v4, v0, Lvj;->ι:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v4, Lhu;

    .line 831
    .line 832
    iget-object v0, v0, Lvj;->η:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast v0, Landroid/app/AlertDialog;

    .line 835
    .line 836
    const-string v6, ""

    .line 837
    .line 838
    iget-object v7, v1, Lfk0;->ο:Landroid/widget/EditText;

    .line 839
    .line 840
    invoke-virtual {v7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 841
    .line 842
    .line 843
    move-result-object v7

    .line 844
    if-eqz v7, :cond_e

    .line 845
    .line 846
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v7

    .line 850
    goto :goto_a

    .line 851
    :cond_e
    move-object v7, v2

    .line 852
    :goto_a
    if-nez v7, :cond_f

    .line 853
    .line 854
    move-object v7, v6

    .line 855
    :cond_f
    iget-object v8, v1, Lfk0;->κ:Landroid/widget/EditText;

    .line 856
    .line 857
    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 858
    .line 859
    .line 860
    move-result-object v8

    .line 861
    if-eqz v8, :cond_10

    .line 862
    .line 863
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    :cond_10
    if-nez v2, :cond_11

    .line 868
    .line 869
    goto :goto_b

    .line 870
    :cond_11
    move-object v6, v2

    .line 871
    :goto_b
    sget-object v2, Lhk0;->α:Lym1;

    .line 872
    .line 873
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    invoke-static {v7, v2}, Lhk0;->α(Ljava/lang/String;Ljava/util/Locale;)Z

    .line 881
    .line 882
    .line 883
    move-result v2

    .line 884
    if-eqz v2, :cond_13

    .line 885
    .line 886
    invoke-static {v6}, Lhk0;->β(Ljava/lang/String;)Z

    .line 887
    .line 888
    .line 889
    move-result v2

    .line 890
    if-nez v2, :cond_12

    .line 891
    .line 892
    goto :goto_c

    .line 893
    :cond_12
    new-instance v1, Lgk0;

    .line 894
    .line 895
    invoke-static {v7}, Lhk0;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    invoke-static {v6}, Lhk0;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v3

    .line 903
    invoke-direct {v1, v2, v3}, Lgk0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    invoke-virtual {v4, v1}, Lhu;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 910
    .line 911
    .line 912
    goto :goto_d

    .line 913
    :cond_13
    :goto_c
    invoke-static {v3, v1}, Lxb;->Υ(Landroid/app/Activity;Lfk0;)V

    .line 914
    .line 915
    .line 916
    const-string v0, "\u8bf7\u5148\u4fee\u6b63\u6807\u7ea2\u7684\u8f93\u5165\u5185\u5bb9"

    .line 917
    .line 918
    invoke-static {v3, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 923
    .line 924
    .line 925
    :goto_d
    return-void

    .line 926
    :pswitch_4
    iget-object v1, v0, Lvj;->θ:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 929
    .line 930
    iget-object v2, v0, Lvj;->ι:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v2, Lp70;

    .line 933
    .line 934
    iget-object v3, v0, Lvj;->η:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast v3, Landroid/app/AlertDialog;

    .line 937
    .line 938
    iget-object v0, v0, Lvj;->ζ:Landroid/view/KeyEvent$Callback;

    .line 939
    .line 940
    check-cast v0, Landroid/app/Activity;

    .line 941
    .line 942
    move-object/from16 v4, p1

    .line 943
    .line 944
    invoke-static {v1, v2, v3, v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->α(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;Landroid/app/AlertDialog;Landroid/app/Activity;Landroid/view/View;)V

    .line 945
    .line 946
    .line 947
    return-void

    .line 948
    nop

    .line 949
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
