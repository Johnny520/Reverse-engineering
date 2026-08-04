.class public final Lyyds/ᛳᛴᛱᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛳᛴᛱᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛳᛴᛱᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛳᛴᛱᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛳᛴᛱᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lyyds/ᛳᛶᛷᲈ;

    .line 10
    .line 11
    iget-object p0, v2, Lyyds/ᛳᛶᛷᲈ;->ᛷᲈᲈᲁ:Lyyds/ᲈᲇᲇᲁ;

    .line 12
    .line 13
    invoke-virtual {v2}, Lyyds/ᛳᛶᛷᲈ;->ᛲᲈᲁ()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-boolean v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᛵᛸ:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, v2, Lyyds/ᛳᛶᛷᲈ;->ᛳᲁᲁᲇ:Landroid/view/View;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲁᲇᲀᛸ;->show()V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lyyds/ᛳᛶᛷᲈ;->dismiss()V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_1
    return-void

    .line 42
    :pswitch_0
    check-cast v2, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 43
    .line 44
    iget-object v0, v2, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛳᲀ:Landroid/widget/LinearLayout;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    const-wide v4, -0x61438e68a836eL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-object v0, v3

    .line 58
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, v2, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛳᲀ:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    if-nez p0, :cond_4

    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-nez p0, :cond_5

    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_5
    iget-object v0, v2, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛳᲀ:Landroid/widget/LinearLayout;

    .line 80
    .line 81
    if-nez v0, :cond_6

    .line 82
    .line 83
    const-wide v0, -0xf298e68a836eL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    move-object v3, v0

    .line 93
    :goto_2
    const/4 v0, 0x1

    .line 94
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 100
    .line 101
    .line 102
    const/16 v3, 0x28

    .line 103
    .line 104
    invoke-virtual {v2, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    neg-float v3, v3

    .line 109
    invoke-virtual {p0, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 110
    .line 111
    .line 112
    const v3, 0x3f733333    # 0.95f

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v3}, Landroid/view/View;->setScaleX(F)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v3}, Landroid/view/View;->setScaleY(F)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const/high16 v3, 0x3f800000    # 1.0f

    .line 126
    .line 127
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    const-wide/16 v4, 0x78

    .line 144
    .line 145
    invoke-virtual {p0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    const-wide/16 v4, 0x1cc

    .line 150
    .line 151
    invoke-virtual {p0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    new-instance v4, Landroid/view/animation/OvershootInterpolator;

    .line 156
    .line 157
    const v5, 0x3f4ccccd    # 0.8f

    .line 158
    .line 159
    .line 160
    invoke-direct {v4, v5}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v4}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 168
    .line 169
    .line 170
    if-eqz v0, :cond_7

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 173
    .line 174
    .line 175
    const/16 p0, 0x18

    .line 176
    .line 177
    invoke-virtual {v2, p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    invoke-virtual {v0, p0}, Landroid/view/View;->setTranslationY(F)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    const-wide/16 v0, 0x140

    .line 197
    .line 198
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    const-wide/16 v0, 0x168

    .line 203
    .line 204
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    .line 209
    .line 210
    const v1, 0x3f19999a    # 0.6f

    .line 211
    .line 212
    .line 213
    invoke-direct {v0, v1}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 221
    .line 222
    .line 223
    :cond_7
    :goto_3
    return-void

    .line 224
    :pswitch_1
    check-cast v2, Lyyds/ᲁᲈᲇᛴ;

    .line 225
    .line 226
    iget-object p0, v2, Lyyds/ᲁᲈᲇᛴ;->ᛷᲈᲈᲁ:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v2}, Lyyds/ᲁᲈᲇᛴ;->ᛲᲈᲁ()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_a

    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-lez v0, :cond_a

    .line 239
    .line 240
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Lyyds/ᛳᛵᛸᛷ;

    .line 245
    .line 246
    iget-object v0, v0, Lyyds/ᛳᛵᛸᛷ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲇᲁ;

    .line 247
    .line 248
    iget-boolean v0, v0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᛵᛸ:Z

    .line 249
    .line 250
    if-nez v0, :cond_a

    .line 251
    .line 252
    iget-object v0, v2, Lyyds/ᲁᲈᲇᛴ;->ᛶᛳᛶᛵ:Landroid/view/View;

    .line 253
    .line 254
    if-eqz v0, :cond_9

    .line 255
    .line 256
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_8

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_a

    .line 272
    .line 273
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, Lyyds/ᛳᛵᛸᛷ;

    .line 278
    .line 279
    iget-object v0, v0, Lyyds/ᛳᛵᛸᛷ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲇᲁ;

    .line 280
    .line 281
    invoke-virtual {v0}, Lyyds/ᲁᲇᲀᛸ;->show()V

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_9
    :goto_5
    invoke-virtual {v2}, Lyyds/ᲁᲈᲇᛴ;->dismiss()V

    .line 286
    .line 287
    .line 288
    :cond_a
    return-void

    .line 289
    :pswitch_2
    check-cast v2, Lyyds/ᲈᛱᲈᛵ;

    .line 290
    .line 291
    iget-object p0, v2, Lyyds/ᲈᛱᲈᛵ;->ᲀᛴᲁᲈ:Lyyds/ᲀᛱᛵᛶ;

    .line 292
    .line 293
    sget-object v0, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_b

    .line 300
    .line 301
    iget-object v0, v2, Lyyds/ᲈᛱᲈᛵ;->ᛸᛸᛷᛱ:Landroid/graphics/Rect;

    .line 302
    .line 303
    invoke-virtual {p0, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    if-eqz p0, :cond_b

    .line 308
    .line 309
    invoke-virtual {v2}, Lyyds/ᲈᛱᲈᛵ;->ᛶᛳᛶᛵ()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Lyyds/ᲁᲇᲀᛸ;->show()V

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_b
    invoke-virtual {v2}, Lyyds/ᲁᲇᲀᛸ;->dismiss()V

    .line 317
    .line 318
    .line 319
    :goto_6
    return-void

    .line 320
    :pswitch_3
    check-cast v2, Lyyds/ᲀᛱᛵᛶ;

    .line 321
    .line 322
    invoke-virtual {v2}, Lyyds/ᲀᛱᛵᛶ;->getInternalPopup()Lyyds/ᛸᛱᲈᛵ;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-interface {v0}, Lyyds/ᛸᛱᲈᛵ;->ᛲᲈᲁ()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-nez v0, :cond_c

    .line 331
    .line 332
    iget-object v0, v2, Lyyds/ᲀᛱᛵᛶ;->ᛱᲈᲁ:Lyyds/ᛸᛱᲈᛵ;

    .line 333
    .line 334
    invoke-static {v2}, Lyyds/ᛱᛷᛵᛷ;->ᛵᛸᛸᛷ(Landroid/view/View;)I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    invoke-static {v2}, Lyyds/ᛱᛷᛵᛷ;->ᛲᲈᲁ(Landroid/view/View;)I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    invoke-interface {v0, v1, v3}, Lyyds/ᛸᛱᲈᛵ;->ᛷᛲᲈᛱ(II)V

    .line 343
    .line 344
    .line 345
    :cond_c
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    if-eqz v0, :cond_d

    .line 350
    .line 351
    invoke-static {v0, p0}, Lyyds/ᛸᛶᲀᛳ;->ᛲᲈᲁ(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 352
    .line 353
    .line 354
    :cond_d
    return-void

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
