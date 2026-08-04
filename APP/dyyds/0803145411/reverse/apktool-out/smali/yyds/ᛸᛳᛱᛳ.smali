.class public final synthetic Lyyds/ᛸᛳᛱᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛸᛳᛱᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛸᛳᛱᛳ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lyyds/ᛸᛳᛱᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const-wide/16 v1, 0x708

    .line 4
    .line 5
    const-wide/16 v3, 0xf0

    .line 6
    .line 7
    const/high16 v5, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object p0, p0, Lyyds/ᛸᛳᛱᛳ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᲁᛲ;

    .line 16
    .line 17
    sget-object v1, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛱᲁᛳ()V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :pswitch_0
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᲁᛲ;

    .line 30
    .line 31
    sget-object v1, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 32
    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ()V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛱᲁᛳ()V

    .line 40
    .line 41
    .line 42
    :goto_1
    return-void

    .line 43
    :pswitch_1
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-wide v0, -0xf77be68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-object v0, v6

    .line 56
    :cond_2
    invoke-virtual {v0, v5}, Landroid/view/View;->setScaleX(F)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 60
    .line 61
    if-nez p0, :cond_3

    .line 62
    .line 63
    const-wide v0, -0xf788e68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    move-object v6, p0

    .line 73
    :goto_2
    invoke-virtual {v6, v5}, Landroid/view/View;->setScaleY(F)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_2
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᲁᛲ;

    .line 78
    .line 79
    sget-object v1, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 80
    .line 81
    if-ne v0, v1, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ()V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛱᲁᛳ()V

    .line 88
    .line 89
    .line 90
    :goto_3
    return-void

    .line 91
    :pswitch_3
    iget-boolean v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᲇᛲᛱ:Z

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᛶᛳ()V

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void

    .line 111
    :pswitch_4
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛳᲀ()V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 117
    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    const-wide v0, -0xf795e68a836eL

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-object v0, v6

    .line 129
    :cond_6
    new-instance v1, Lyyds/ᛸᛳᛱᛳ;

    .line 130
    .line 131
    const/4 v2, 0x7

    .line 132
    invoke-direct {v1, p0, v2}, Lyyds/ᛸᛳᛱᛳ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 139
    .line 140
    if-nez v0, :cond_7

    .line 141
    .line 142
    const-wide v0, -0xf7a2e68a836eL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-object v0, v6

    .line 151
    :cond_7
    const v1, 0x3f75c28f    # 0.96f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 158
    .line 159
    if-nez v0, :cond_8

    .line 160
    .line 161
    const-wide v7, -0xf7afe68a836eL

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-object v0, v6

    .line 170
    :cond_8
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 174
    .line 175
    if-nez v0, :cond_9

    .line 176
    .line 177
    const-wide v0, -0xf7bce68a836eL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_9
    move-object v6, v0

    .line 187
    :goto_4
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    .line 208
    .line 209
    const v2, 0x3f19999a    # 0.6f

    .line 210
    .line 211
    .line 212
    invoke-direct {v1, v2}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    new-instance v1, Lyyds/ᛸᛳᛱᛳ;

    .line 220
    .line 221
    const/16 v2, 0x8

    .line 222
    .line 223
    invoke-direct {v1, p0, v2}, Lyyds/ᛸᛳᛱᛳ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :pswitch_5
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᛶᛲᲀ:Landroid/view/View;

    .line 235
    .line 236
    if-nez p0, :cond_a

    .line 237
    .line 238
    const-wide v0, -0xf769e68a836eL

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_a
    move-object v6, p0

    .line 248
    :goto_5
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p0, v5}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-virtual {p0, v5}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-virtual {p0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    .line 265
    .line 266
    const v1, 0x400ccccd    # 2.2f

    .line 267
    .line 268
    .line 269
    invoke-direct {v0, v1}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :pswitch_6
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 281
    .line 282
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ()V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :pswitch_7
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᛶᛲᲀ:Landroid/view/View;

    .line 287
    .line 288
    if-nez v0, :cond_b

    .line 289
    .line 290
    const-wide v3, -0xf7c9e68a836eL

    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_b
    move-object v6, v0

    .line 300
    :goto_6
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    const v3, 0x3f6b851f    # 0.92f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    new-instance v1, Lyyds/ᛸᛳᛱᛳ;

    .line 320
    .line 321
    const/4 v2, 0x6

    .line 322
    invoke-direct {v1, p0, v2}, Lyyds/ᛸᛳᛱᛳ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_8
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 334
    .line 335
    const/4 v0, 0x0

    .line 336
    invoke-virtual {p0, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᲀᲈᛴ(Z)V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :pswitch_9
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᛶᛲᲀ:Landroid/view/View;

    .line 341
    .line 342
    if-nez v0, :cond_c

    .line 343
    .line 344
    const-wide v3, -0xf7d2e68a836eL

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_c
    move-object v6, v0

    .line 354
    :goto_7
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const v3, 0x3f8f5c29    # 1.12f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    new-instance v1, Lyyds/ᛸᛳᛱᛳ;

    .line 374
    .line 375
    const/4 v2, 0x2

    .line 376
    invoke-direct {v1, p0, v2}, Lyyds/ᛸᛳᛱᛳ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
