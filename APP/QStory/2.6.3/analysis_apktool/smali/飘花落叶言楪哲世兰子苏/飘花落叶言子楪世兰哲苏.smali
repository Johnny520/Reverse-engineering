.class public final L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;
.super Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世兰楪哲苏(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/high16 v4, 0x40000000    # 2.0f

    .line 8
    .line 9
    const v5, 0x24010013

    .line 10
    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    const-wide/16 v10, 0x0

    .line 15
    .line 16
    const/high16 v12, 0x3f800000    # 1.0f

    .line 17
    .line 18
    iget-object v13, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v14, 0x0

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 27
    .line 28
    check-cast v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 29
    .line 30
    iget-object v1, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    iget-object v4, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-eqz v4, :cond_0

    .line 49
    .line 50
    iget-object v4, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object v4, v3

    .line 58
    :goto_0
    if-eqz v4, :cond_2

    .line 59
    .line 60
    invoke-virtual {v4}, Landroid/view/animation/Animation;->getDuration()J

    .line 61
    .line 62
    .line 63
    move-result-wide v15

    .line 64
    cmp-long v5, v15, v10

    .line 65
    .line 66
    if-nez v5, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v4}, Landroid/view/animation/Animation;->getDuration()J

    .line 70
    .line 71
    .line 72
    move-result-wide v8

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    :goto_1
    const-wide/16 v8, 0x12c

    .line 75
    .line 76
    :goto_2
    iget-wide v4, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:J

    .line 77
    .line 78
    cmp-long v1, v4, v10

    .line 79
    .line 80
    if-ltz v1, :cond_3

    .line 81
    .line 82
    move-wide v8, v4

    .line 83
    :cond_3
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 84
    .line 85
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v8, v9}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 97
    .line 98
    .line 99
    new-array v1, v6, [F

    .line 100
    .line 101
    fill-array-data v1, :array_0

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 109
    .line 110
    .line 111
    new-instance v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;

    .line 112
    .line 113
    invoke-direct {v3, v0, v14}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 120
    .line 121
    .line 122
    iget-object v0, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0, v8, v9}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0, v12}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 137
    .line 138
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_0
    move-object/from16 v0, p1

    .line 150
    .line 151
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 152
    .line 153
    check-cast v13, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 154
    .line 155
    iget-object v0, v13, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 158
    .line 159
    iget-object v1, v13, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Landroid/widget/LinearLayout;

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    iget v7, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子世兰楪哲苏:I

    .line 168
    .line 169
    if-nez v7, :cond_4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    move v5, v7

    .line 173
    :goto_3
    invoke-static {v6, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    if-nez v5, :cond_5

    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    if-eqz v6, :cond_5

    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    goto :goto_4

    .line 190
    :cond_5
    move-object v6, v5

    .line 191
    :goto_4
    if-eqz v6, :cond_7

    .line 192
    .line 193
    invoke-virtual {v6}, Landroid/view/animation/Animation;->getDuration()J

    .line 194
    .line 195
    .line 196
    move-result-wide v14

    .line 197
    cmp-long v7, v14, v10

    .line 198
    .line 199
    if-nez v7, :cond_6

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_6
    invoke-virtual {v6}, Landroid/view/animation/Animation;->getDuration()J

    .line 203
    .line 204
    .line 205
    move-result-wide v8

    .line 206
    goto :goto_6

    .line 207
    :cond_7
    :goto_5
    const-wide/16 v8, 0x12c

    .line 208
    .line 209
    :goto_6
    iget-wide v6, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:J

    .line 210
    .line 211
    cmp-long v0, v6, v10

    .line 212
    .line 213
    if-ltz v0, :cond_8

    .line 214
    .line 215
    move-wide v8, v6

    .line 216
    :cond_8
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 217
    .line 218
    invoke-direct {v0, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5, v8, v9}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5, v3}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 231
    .line 232
    .line 233
    iget-object v0, v13, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0, v8, v9}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0, v12}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 250
    .line 251
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :pswitch_1
    move-object/from16 v1, p1

    .line 263
    .line 264
    check-cast v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 265
    .line 266
    check-cast v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;

    .line 267
    .line 268
    iget-object v1, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 269
    .line 270
    iget-object v2, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 271
    .line 272
    iget-object v3, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 273
    .line 274
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    iget-object v3, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 278
    .line 279
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-static {v3, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    if-nez v3, :cond_9

    .line 294
    .line 295
    invoke-virtual {v2}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    if-eqz v4, :cond_9

    .line 300
    .line 301
    invoke-virtual {v2}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    goto :goto_7

    .line 306
    :cond_9
    move-object v4, v3

    .line 307
    :goto_7
    if-eqz v4, :cond_b

    .line 308
    .line 309
    invoke-virtual {v4}, Landroid/view/animation/Animation;->getDuration()J

    .line 310
    .line 311
    .line 312
    move-result-wide v12

    .line 313
    cmp-long v5, v12, v10

    .line 314
    .line 315
    if-nez v5, :cond_a

    .line 316
    .line 317
    goto :goto_8

    .line 318
    :cond_a
    invoke-virtual {v4}, Landroid/view/animation/Animation;->getDuration()J

    .line 319
    .line 320
    .line 321
    move-result-wide v8

    .line 322
    goto :goto_9

    .line 323
    :cond_b
    :goto_8
    const-wide/16 v8, 0x12c

    .line 324
    .line 325
    :goto_9
    iget-wide v4, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:J

    .line 326
    .line 327
    cmp-long v1, v4, v10

    .line 328
    .line 329
    if-ltz v1, :cond_c

    .line 330
    .line 331
    move-wide v8, v4

    .line 332
    :cond_c
    invoke-virtual {v3, v8, v9}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 333
    .line 334
    .line 335
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 336
    .line 337
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 344
    .line 345
    .line 346
    new-array v1, v6, [F

    .line 347
    .line 348
    fill-array-data v1, :array_1

    .line 349
    .line 350
    .line 351
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-virtual {v1, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 356
    .line 357
    .line 358
    new-instance v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏哲兰;

    .line 359
    .line 360
    invoke-direct {v2, v0, v14}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :pswitch_2
    move-object/from16 v0, p1

    .line 371
    .line 372
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 373
    .line 374
    check-cast v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 375
    .line 376
    invoke-virtual {v13}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏()V

    .line 377
    .line 378
    .line 379
    iget-object v0, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 380
    .line 381
    invoke-virtual {v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getSafeHeight()F

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    iget v2, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲世兰:I

    .line 386
    .line 387
    int-to-float v2, v2

    .line 388
    sub-float/2addr v1, v2

    .line 389
    iput v1, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 390
    .line 391
    cmpg-float v1, v1, v7

    .line 392
    .line 393
    if-gez v1, :cond_d

    .line 394
    .line 395
    iput v7, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 396
    .line 397
    :cond_d
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    iget v1, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 402
    .line 403
    float-to-int v1, v1

    .line 404
    invoke-virtual {v13, v0, v1, v14}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(IIZ)V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :pswitch_3
    move-object/from16 v1, p1

    .line 409
    .line 410
    check-cast v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 411
    .line 412
    check-cast v13, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 413
    .line 414
    iget-object v1, v13, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 417
    .line 418
    iget-object v2, v13, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v2, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 421
    .line 422
    iget-object v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰楪哲苏:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 423
    .line 424
    if-eqz v3, :cond_16

    .line 425
    .line 426
    iget-object v3, v3, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v3, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 429
    .line 430
    if-nez v3, :cond_e

    .line 431
    .line 432
    goto/16 :goto_d

    .line 433
    .line 434
    :cond_e
    iget v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏楪哲:I

    .line 435
    .line 436
    if-ne v3, v5, :cond_f

    .line 437
    .line 438
    iget v7, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏哲楪:I

    .line 439
    .line 440
    const v12, 0x24010014

    .line 441
    .line 442
    .line 443
    if-ne v7, v12, :cond_f

    .line 444
    .line 445
    sget-object v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:[I

    .line 446
    .line 447
    iget-object v5, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰哲楪苏:Lcom/kongzue/dialogx/dialogs/CustomDialog$ALIGN;

    .line 448
    .line 449
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    aget v3, v3, v5

    .line 454
    .line 455
    packed-switch v3, :pswitch_data_1

    .line 456
    .line 457
    .line 458
    :pswitch_4
    goto :goto_a

    .line 459
    :pswitch_5
    const v3, 0x24010010

    .line 460
    .line 461
    .line 462
    iput v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏楪哲:I

    .line 463
    .line 464
    const v3, 0x24010011

    .line 465
    .line 466
    .line 467
    iput v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏哲楪:I

    .line 468
    .line 469
    goto :goto_a

    .line 470
    :pswitch_6
    const v3, 0x24010019

    .line 471
    .line 472
    .line 473
    iput v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏楪哲:I

    .line 474
    .line 475
    const v3, 0x2401001a

    .line 476
    .line 477
    .line 478
    iput v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏哲楪:I

    .line 479
    .line 480
    goto :goto_a

    .line 481
    :pswitch_7
    const v3, 0x24010015

    .line 482
    .line 483
    .line 484
    iput v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏楪哲:I

    .line 485
    .line 486
    const v3, 0x24010016

    .line 487
    .line 488
    .line 489
    iput v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏哲楪:I

    .line 490
    .line 491
    goto :goto_a

    .line 492
    :pswitch_8
    const v3, 0x2401001b

    .line 493
    .line 494
    .line 495
    iput v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏楪哲:I

    .line 496
    .line 497
    const v3, 0x2401001c

    .line 498
    .line 499
    .line 500
    iput v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏哲楪:I

    .line 501
    .line 502
    :goto_a
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    iget v5, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏楪哲:I

    .line 507
    .line 508
    invoke-static {v3, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    new-instance v5, Landroid/view/animation/DecelerateInterpolator;

    .line 513
    .line 514
    invoke-direct {v5, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v3, v5}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 518
    .line 519
    .line 520
    goto :goto_b

    .line 521
    :cond_f
    if-eqz v3, :cond_10

    .line 522
    .line 523
    move v5, v3

    .line 524
    :cond_10
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    invoke-static {v3, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    :goto_b
    invoke-virtual {v3}, Landroid/view/animation/Animation;->getDuration()J

    .line 533
    .line 534
    .line 535
    move-result-wide v4

    .line 536
    iget-wide v8, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:J

    .line 537
    .line 538
    cmp-long v7, v8, v10

    .line 539
    .line 540
    if-ltz v7, :cond_11

    .line 541
    .line 542
    move-wide v4, v8

    .line 543
    :cond_11
    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v3}, Landroid/view/animation/Animation;->getDuration()J

    .line 547
    .line 548
    .line 549
    move-result-wide v4

    .line 550
    cmp-long v4, v4, v10

    .line 551
    .line 552
    if-nez v4, :cond_12

    .line 553
    .line 554
    const-wide/16 v8, 0x12c

    .line 555
    .line 556
    goto :goto_c

    .line 557
    :cond_12
    invoke-virtual {v3}, Landroid/view/animation/Animation;->getDuration()J

    .line 558
    .line 559
    .line 560
    move-result-wide v8

    .line 561
    :goto_c
    iget-wide v4, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:J

    .line 562
    .line 563
    cmp-long v7, v4, v10

    .line 564
    .line 565
    if-ltz v7, :cond_13

    .line 566
    .line 567
    move-wide v8, v4

    .line 568
    :cond_13
    invoke-virtual {v3, v8, v9}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 569
    .line 570
    .line 571
    if-eqz v2, :cond_14

    .line 572
    .line 573
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 577
    .line 578
    .line 579
    :cond_14
    iget v1, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰哲苏楪:I

    .line 580
    .line 581
    if-eqz v1, :cond_15

    .line 582
    .line 583
    iget-object v2, v13, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v2, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 586
    .line 587
    invoke-virtual {v2, v1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setBackgroundColor(I)V

    .line 588
    .line 589
    .line 590
    :cond_15
    new-array v1, v6, [F

    .line 591
    .line 592
    fill-array-data v1, :array_2

    .line 593
    .line 594
    .line 595
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    invoke-virtual {v1, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 600
    .line 601
    .line 602
    new-instance v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲世兰苏;

    .line 603
    .line 604
    invoke-direct {v2, v0, v14}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 611
    .line 612
    .line 613
    :cond_16
    :goto_d
    return-void

    .line 614
    :pswitch_9
    move-object/from16 v1, p1

    .line 615
    .line 616
    check-cast v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 617
    .line 618
    check-cast v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;

    .line 619
    .line 620
    iget-object v2, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 621
    .line 622
    iget-wide v8, v2, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:J

    .line 623
    .line 624
    cmp-long v5, v8, v10

    .line 625
    .line 626
    if-ltz v5, :cond_17

    .line 627
    .line 628
    goto :goto_e

    .line 629
    :cond_17
    const-wide/16 v8, 0x12c

    .line 630
    .line 631
    :goto_e
    iget-object v5, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Landroid/widget/RelativeLayout;

    .line 632
    .line 633
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏()Z

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    if-eqz v1, :cond_18

    .line 638
    .line 639
    goto :goto_f

    .line 640
    :cond_18
    invoke-virtual {v5, v14, v14, v14, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 641
    .line 642
    .line 643
    :goto_f
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世()Landroid/widget/FrameLayout;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    if-nez v1, :cond_19

    .line 648
    .line 649
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 658
    .line 659
    :goto_10
    int-to-float v1, v1

    .line 660
    goto :goto_11

    .line 661
    :cond_19
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世()Landroid/widget/FrameLayout;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    goto :goto_10

    .line 670
    :goto_11
    iget-object v2, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 671
    .line 672
    invoke-virtual {v2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 677
    .line 678
    int-to-float v2, v2

    .line 679
    add-float/2addr v2, v7

    .line 680
    iput v2, v13, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:F

    .line 681
    .line 682
    new-array v7, v6, [F

    .line 683
    .line 684
    aput v1, v7, v14

    .line 685
    .line 686
    aput v2, v7, v3

    .line 687
    .line 688
    const-string v1, "y"

    .line 689
    .line 690
    invoke-static {v5, v1, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-virtual {v1, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1, v3}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V

    .line 698
    .line 699
    .line 700
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 701
    .line 702
    invoke-direct {v2, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    .line 709
    .line 710
    .line 711
    new-array v1, v6, [F

    .line 712
    .line 713
    fill-array-data v1, :array_3

    .line 714
    .line 715
    .line 716
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    invoke-virtual {v1, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 721
    .line 722
    .line 723
    new-instance v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰苏哲;

    .line 724
    .line 725
    invoke-direct {v2, v0, v14}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 732
    .line 733
    .line 734
    return-void

    .line 735
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
    .end packed-switch

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    :array_3
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final 飘花落叶言子世兰楪苏哲(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "y"

    .line 5
    .line 6
    const-wide/16 v3, -0x1

    .line 7
    .line 8
    const-wide/16 v5, 0x12c

    .line 9
    .line 10
    const v7, 0x24010014

    .line 11
    .line 12
    .line 13
    iget-object v8, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x1

    .line 17
    const/4 v11, 0x2

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 22
    .line 23
    check-cast v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 24
    .line 25
    iget-object p1, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    iget-object p1, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :cond_0
    if-nez p1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {p1, v7}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v8, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/animation/Animation;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    .line 54
    .line 55
    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 62
    .line 63
    invoke-virtual {v2, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    .line 77
    .line 78
    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 86
    .line 87
    .line 88
    new-array p1, v11, [F

    .line 89
    .line 90
    fill-array-data p1, :array_0

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 98
    .line 99
    .line 100
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;

    .line 101
    .line 102
    invoke-direct {v0, p0, v10}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 109
    .line 110
    .line 111
    :goto_0
    return-void

    .line 112
    :pswitch_0
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 113
    .line 114
    check-cast v8, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 115
    .line 116
    iget-object p0, v8, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 119
    .line 120
    iget-object p1, v8, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v0, :cond_2

    .line 129
    .line 130
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_1
    iget p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子世兰苏楪哲:I

    .line 140
    .line 141
    if-nez p0, :cond_3

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    move v7, p0

    .line 145
    :goto_2
    invoke-static {v0, v7}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {v8, p0}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Landroid/view/animation/Animation;)J

    .line 150
    .line 151
    .line 152
    move-result-wide v0

    .line 153
    invoke-virtual {p0, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v10}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 157
    .line 158
    .line 159
    iget-object v2, v8, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Landroid/widget/LinearLayout;

    .line 162
    .line 163
    invoke-virtual {v2, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    .line 175
    .line 176
    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_1
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 188
    .line 189
    check-cast v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;

    .line 190
    .line 191
    iget-object p1, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 192
    .line 193
    iget-object v0, p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v0, p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {p1, v7}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {v8, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/view/animation/Animation;)J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    .line 219
    .line 220
    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 227
    .line 228
    .line 229
    iget-object v2, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 230
    .line 231
    invoke-virtual {v2, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 232
    .line 233
    .line 234
    new-array p1, v11, [F

    .line 235
    .line 236
    fill-array-data p1, :array_1

    .line 237
    .line 238
    .line 239
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 244
    .line 245
    .line 246
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏哲兰;

    .line 247
    .line 248
    invoke-direct {v0, p0, v10}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :pswitch_2
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 259
    .line 260
    check-cast v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 261
    .line 262
    iget-object p1, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 263
    .line 264
    iget-wide v12, p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰:J

    .line 265
    .line 266
    cmp-long p1, v12, v3

    .line 267
    .line 268
    if-eqz p1, :cond_4

    .line 269
    .line 270
    move-wide v5, v12

    .line 271
    :cond_4
    iget-object p1, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 272
    .line 273
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    iget-object v3, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Landroid/widget/RelativeLayout;

    .line 278
    .line 279
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    int-to-float v3, v3

    .line 284
    new-array v4, v11, [F

    .line 285
    .line 286
    aput v0, v4, v1

    .line 287
    .line 288
    aput v3, v4, v10

    .line 289
    .line 290
    invoke-static {p1, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-virtual {p1, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 298
    .line 299
    .line 300
    new-array p1, v11, [F

    .line 301
    .line 302
    fill-array-data p1, :array_2

    .line 303
    .line 304
    .line 305
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-virtual {p1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 310
    .line 311
    .line 312
    new-instance v0, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;

    .line 313
    .line 314
    const/4 v1, 0x4

    .line 315
    invoke-direct {v0, p0, v1}, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :pswitch_3
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 326
    .line 327
    check-cast v8, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 328
    .line 329
    iget-object p1, v8, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 332
    .line 333
    iget-object v0, v8, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 336
    .line 337
    iget-object v1, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰楪哲苏:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 338
    .line 339
    if-eqz v1, :cond_9

    .line 340
    .line 341
    iget-object v1, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v1, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 344
    .line 345
    if-nez v1, :cond_5

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_5
    iget v1, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰苏哲楪:I

    .line 349
    .line 350
    if-eqz v1, :cond_6

    .line 351
    .line 352
    move v7, v1

    .line 353
    :cond_6
    if-eqz v0, :cond_8

    .line 354
    .line 355
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    if-nez v1, :cond_7

    .line 360
    .line 361
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    goto :goto_3

    .line 366
    :cond_7
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    :goto_3
    invoke-static {p1, v7}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    invoke-virtual {v8, p1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世哲兰楪苏(Landroid/view/animation/Animation;)J

    .line 375
    .line 376
    .line 377
    move-result-wide v1

    .line 378
    invoke-virtual {p1, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 382
    .line 383
    .line 384
    goto :goto_4

    .line 385
    :cond_8
    const/4 p1, 0x0

    .line 386
    invoke-virtual {v8, p1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世哲兰楪苏(Landroid/view/animation/Animation;)J

    .line 387
    .line 388
    .line 389
    move-result-wide v1

    .line 390
    :goto_4
    new-array p1, v11, [F

    .line 391
    .line 392
    fill-array-data p1, :array_3

    .line 393
    .line 394
    .line 395
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 400
    .line 401
    .line 402
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲世兰苏;

    .line 403
    .line 404
    invoke-direct {v0, p0, v10}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 411
    .line 412
    .line 413
    :cond_9
    :goto_5
    return-void

    .line 414
    :pswitch_4
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 415
    .line 416
    check-cast v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;

    .line 417
    .line 418
    iget-object p1, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 419
    .line 420
    iget-wide v12, p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰:J

    .line 421
    .line 422
    cmp-long p1, v12, v3

    .line 423
    .line 424
    if-eqz p1, :cond_a

    .line 425
    .line 426
    move-wide v5, v12

    .line 427
    :cond_a
    iget-object p1, v8, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Landroid/widget/RelativeLayout;

    .line 428
    .line 429
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    int-to-float v3, v3

    .line 438
    new-array v4, v11, [F

    .line 439
    .line 440
    aput v0, v4, v1

    .line 441
    .line 442
    aput v3, v4, v10

    .line 443
    .line 444
    invoke-static {p1, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    invoke-virtual {p1, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 449
    .line 450
    .line 451
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 452
    .line 453
    .line 454
    new-array p1, v11, [F

    .line 455
    .line 456
    fill-array-data p1, :array_4

    .line 457
    .line 458
    .line 459
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    invoke-virtual {p1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 464
    .line 465
    .line 466
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰苏哲;

    .line 467
    .line 468
    invoke-direct {v0, p0, v10}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 475
    .line 476
    .line 477
    return-void

    .line 478
    nop

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 518
    :array_4
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
