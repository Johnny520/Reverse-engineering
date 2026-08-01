.class public final Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object v3, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 10
    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    iget-object p0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 15
    .line 16
    if-eq v0, v1, :cond_7

    .line 17
    .line 18
    if-eq v0, v5, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x3

    .line 21
    if-eq v0, p1, :cond_7

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    iget-boolean v0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 26
    .line 27
    if-eqz v0, :cond_d

    .line 28
    .line 29
    iget-object v0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 30
    .line 31
    iget-object v6, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    add-float/2addr v7, v0

    .line 42
    iget v0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 43
    .line 44
    sub-float/2addr v7, v0

    .line 45
    iget-object v0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    invoke-interface {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    iget-object v0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 56
    .line 57
    check-cast v0, Landroid/view/View;

    .line 58
    .line 59
    new-instance v8, Landroid/graphics/RectF;

    .line 60
    .line 61
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 62
    .line 63
    .line 64
    new-array v9, v5, [I

    .line 65
    .line 66
    new-array v5, v5, [I

    .line 67
    .line 68
    invoke-virtual {v0, v9}, Landroid/view/View;->getLocationInWindow([I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v5}, Landroid/view/View;->getLocationInWindow([I)V

    .line 72
    .line 73
    .line 74
    aget p1, v9, v2

    .line 75
    .line 76
    aget v10, v5, v2

    .line 77
    .line 78
    sub-int/2addr p1, v10

    .line 79
    int-to-float p1, p1

    .line 80
    iput p1, v8, Landroid/graphics/RectF;->left:F

    .line 81
    .line 82
    aget v9, v9, v1

    .line 83
    .line 84
    aget v5, v5, v1

    .line 85
    .line 86
    sub-int/2addr v9, v5

    .line 87
    int-to-float v5, v9

    .line 88
    iput v5, v8, Landroid/graphics/RectF;->top:F

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    int-to-float v5, v5

    .line 95
    add-float/2addr p1, v5

    .line 96
    iput p1, v8, Landroid/graphics/RectF;->right:F

    .line 97
    .line 98
    iget p1, v8, Landroid/graphics/RectF;->top:F

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    int-to-float v0, v0

    .line 105
    add-float/2addr p1, v0

    .line 106
    iput p1, v8, Landroid/graphics/RectF;->bottom:F

    .line 107
    .line 108
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    iget v0, v8, Landroid/graphics/RectF;->left:F

    .line 113
    .line 114
    cmpl-float p1, p1, v0

    .line 115
    .line 116
    if-ltz p1, :cond_5

    .line 117
    .line 118
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iget v0, v8, Landroid/graphics/RectF;->right:F

    .line 123
    .line 124
    cmpg-float p1, p1, v0

    .line 125
    .line 126
    if-gtz p1, :cond_5

    .line 127
    .line 128
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    iget v0, v8, Landroid/graphics/RectF;->top:F

    .line 133
    .line 134
    cmpl-float p1, p1, v0

    .line 135
    .line 136
    if-ltz p1, :cond_5

    .line 137
    .line 138
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iget v0, v8, Landroid/graphics/RectF;->bottom:F

    .line 143
    .line 144
    cmpg-float p1, p1, v0

    .line 145
    .line 146
    if-gtz p1, :cond_5

    .line 147
    .line 148
    iget-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 149
    .line 150
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    cmpl-float p1, v7, p1

    .line 155
    .line 156
    iget-object v0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 157
    .line 158
    if-lez p1, :cond_3

    .line 159
    .line 160
    invoke-interface {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->getScrollDistance()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-nez p0, :cond_2

    .line 165
    .line 166
    iget-object p0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 167
    .line 168
    if-eqz p0, :cond_1

    .line 169
    .line 170
    invoke-interface {p0, v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 171
    .line 172
    .line 173
    :cond_1
    invoke-virtual {v6, v7}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setY(F)V

    .line 174
    .line 175
    .line 176
    return v2

    .line 177
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    iput p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 182
    .line 183
    return v2

    .line 184
    :cond_3
    if-eqz v0, :cond_4

    .line 185
    .line 186
    invoke-interface {v0, v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 187
    .line 188
    .line 189
    :cond_4
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 190
    .line 191
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    invoke-virtual {v6, p0}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setY(F)V

    .line 196
    .line 197
    .line 198
    return v2

    .line 199
    :cond_5
    iget-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 200
    .line 201
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    cmpg-float p1, v7, p1

    .line 206
    .line 207
    if-gez p1, :cond_6

    .line 208
    .line 209
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 210
    .line 211
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    :cond_6
    invoke-virtual {v6, v7}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setY(F)V

    .line 216
    .line 217
    .line 218
    return v2

    .line 219
    :cond_7
    iput-boolean v2, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 220
    .line 221
    iget p1, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 222
    .line 223
    iget-object p2, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 224
    .line 225
    invoke-virtual {p2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    cmpl-float p1, p1, p2

    .line 230
    .line 231
    const-wide/16 v6, 0x12c

    .line 232
    .line 233
    const-string p2, "y"

    .line 234
    .line 235
    if-nez p1, :cond_a

    .line 236
    .line 237
    iget-object p1, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 238
    .line 239
    iget-object v0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 240
    .line 241
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    sget v3, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:I

    .line 246
    .line 247
    int-to-float v3, v3

    .line 248
    cmpg-float p1, p1, v3

    .line 249
    .line 250
    if-gez p1, :cond_8

    .line 251
    .line 252
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 257
    .line 258
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 259
    .line 260
    .line 261
    move-result p0

    .line 262
    new-array v3, v5, [F

    .line 263
    .line 264
    aput p1, v3, v2

    .line 265
    .line 266
    aput p0, v3, v1

    .line 267
    .line 268
    invoke-static {v0, p2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    invoke-virtual {p0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    add-float/2addr p1, v3

    .line 289
    cmpl-float p0, p0, p1

    .line 290
    .line 291
    if-lez p0, :cond_9

    .line 292
    .line 293
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 294
    .line 295
    .line 296
    goto :goto_0

    .line 297
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 302
    .line 303
    .line 304
    move-result p1

    .line 305
    new-array v3, v5, [F

    .line 306
    .line 307
    aput p0, v3, v2

    .line 308
    .line 309
    aput p1, v3, v1

    .line 310
    .line 311
    invoke-static {v0, p2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-virtual {p0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 319
    .line 320
    .line 321
    goto :goto_0

    .line 322
    :cond_a
    iget-object p1, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 323
    .line 324
    iget-object v0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 325
    .line 326
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    iget v8, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 331
    .line 332
    sget v9, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:I

    .line 333
    .line 334
    int-to-float v9, v9

    .line 335
    sub-float/2addr v8, v9

    .line 336
    cmpg-float p1, p1, v8

    .line 337
    .line 338
    if-gez p1, :cond_b

    .line 339
    .line 340
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 345
    .line 346
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 347
    .line 348
    .line 349
    move-result p0

    .line 350
    new-array v3, v5, [F

    .line 351
    .line 352
    aput p1, v3, v2

    .line 353
    .line 354
    aput p0, v3, v1

    .line 355
    .line 356
    invoke-static {v0, p2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    invoke-virtual {p0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 361
    .line 362
    .line 363
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 364
    .line 365
    .line 366
    goto :goto_0

    .line 367
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 368
    .line 369
    .line 370
    move-result p0

    .line 371
    iget p1, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 372
    .line 373
    add-float/2addr p1, v9

    .line 374
    cmpl-float p0, p0, p1

    .line 375
    .line 376
    if-lez p0, :cond_c

    .line 377
    .line 378
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 379
    .line 380
    .line 381
    goto :goto_0

    .line 382
    :cond_c
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 383
    .line 384
    .line 385
    move-result p0

    .line 386
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    new-array v3, v5, [F

    .line 391
    .line 392
    aput p0, v3, v2

    .line 393
    .line 394
    aput p1, v3, v1

    .line 395
    .line 396
    invoke-static {v0, p2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    invoke-virtual {p0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 401
    .line 402
    .line 403
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 404
    .line 405
    .line 406
    :goto_0
    iget-object p0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 407
    .line 408
    if-eqz p0, :cond_d

    .line 409
    .line 410
    invoke-interface {p0, v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 411
    .line 412
    .line 413
    :cond_d
    :goto_1
    return v2

    .line 414
    :cond_e
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 415
    .line 416
    .line 417
    move-result p0

    .line 418
    iput p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 419
    .line 420
    iput-boolean v1, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 421
    .line 422
    iget-object p0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 423
    .line 424
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 425
    .line 426
    .line 427
    move-result p0

    .line 428
    iput p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 429
    .line 430
    return v2
.end method
