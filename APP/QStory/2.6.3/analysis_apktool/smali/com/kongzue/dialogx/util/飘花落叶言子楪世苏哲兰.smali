.class public final Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;

.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    iget-object p1, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iget-object v0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世哲楪兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    invoke-direct {v0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x1

    .line 18
    iget-object v3, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    iget-object v4, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;

    .line 21
    .line 22
    if-eqz v0, :cond_c

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    if-eq v0, v2, :cond_6

    .line 26
    .line 27
    if-eq v0, v5, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x3

    .line 30
    if-eq v0, p0, :cond_6

    .line 31
    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :cond_1
    iget-boolean v0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 35
    .line 36
    if-eqz v0, :cond_b

    .line 37
    .line 38
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_b

    .line 43
    .line 44
    iget-object p1, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Landroid/widget/RelativeLayout;

    .line 45
    .line 46
    iget-object v0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Landroid/widget/RelativeLayout;

    .line 47
    .line 48
    iget-object v6, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    add-float/2addr v7, p1

    .line 59
    iget p1, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 60
    .line 61
    sub-float/2addr v7, p1

    .line 62
    iget-object p1, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 63
    .line 64
    invoke-interface {p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    iget-object p1, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 71
    .line 72
    check-cast p1, Landroid/view/View;

    .line 73
    .line 74
    new-instance v8, Landroid/graphics/RectF;

    .line 75
    .line 76
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 77
    .line 78
    .line 79
    new-array v9, v5, [I

    .line 80
    .line 81
    new-array v5, v5, [I

    .line 82
    .line 83
    invoke-virtual {p1, v9}, Landroid/view/View;->getLocationInWindow([I)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {p0, v5}, Landroid/view/View;->getLocationInWindow([I)V

    .line 89
    .line 90
    .line 91
    aget p0, v9, v1

    .line 92
    .line 93
    aget v10, v5, v1

    .line 94
    .line 95
    sub-int/2addr p0, v10

    .line 96
    int-to-float p0, p0

    .line 97
    iput p0, v8, Landroid/graphics/RectF;->left:F

    .line 98
    .line 99
    aget v9, v9, v2

    .line 100
    .line 101
    aget v5, v5, v2

    .line 102
    .line 103
    sub-int/2addr v9, v5

    .line 104
    int-to-float v5, v9

    .line 105
    iput v5, v8, Landroid/graphics/RectF;->top:F

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    int-to-float v5, v5

    .line 112
    add-float/2addr p0, v5

    .line 113
    iput p0, v8, Landroid/graphics/RectF;->right:F

    .line 114
    .line 115
    iget p0, v8, Landroid/graphics/RectF;->top:F

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    int-to-float p1, p1

    .line 122
    add-float/2addr p0, p1

    .line 123
    iput p0, v8, Landroid/graphics/RectF;->bottom:F

    .line 124
    .line 125
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    iget p1, v8, Landroid/graphics/RectF;->left:F

    .line 130
    .line 131
    cmpl-float p0, p0, p1

    .line 132
    .line 133
    if-ltz p0, :cond_4

    .line 134
    .line 135
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    iget p1, v8, Landroid/graphics/RectF;->right:F

    .line 140
    .line 141
    cmpg-float p0, p0, p1

    .line 142
    .line 143
    if-gtz p0, :cond_4

    .line 144
    .line 145
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    iget p1, v8, Landroid/graphics/RectF;->top:F

    .line 150
    .line 151
    cmpl-float p0, p0, p1

    .line 152
    .line 153
    if-ltz p0, :cond_4

    .line 154
    .line 155
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    iget p1, v8, Landroid/graphics/RectF;->bottom:F

    .line 160
    .line 161
    cmpg-float p0, p0, p1

    .line 162
    .line 163
    if-gtz p0, :cond_4

    .line 164
    .line 165
    invoke-virtual {v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 170
    .line 171
    int-to-float p0, p0

    .line 172
    cmpl-float p0, v7, p0

    .line 173
    .line 174
    iget-object p1, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 175
    .line 176
    if-lez p0, :cond_3

    .line 177
    .line 178
    invoke-interface {p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->getScrollDistance()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    if-nez p0, :cond_2

    .line 183
    .line 184
    iget-object p0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 185
    .line 186
    invoke-interface {p0, v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v7}, Landroid/view/View;->setY(F)V

    .line 190
    .line 191
    .line 192
    return v1

    .line 193
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    iput p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 198
    .line 199
    return v1

    .line 200
    :cond_3
    invoke-interface {p1, v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 208
    .line 209
    int-to-float p0, p0

    .line 210
    invoke-virtual {v0, p0}, Landroid/view/View;->setY(F)V

    .line 211
    .line 212
    .line 213
    return v1

    .line 214
    :cond_4
    invoke-virtual {v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 219
    .line 220
    int-to-float p0, p0

    .line 221
    cmpl-float p0, v7, p0

    .line 222
    .line 223
    if-lez p0, :cond_5

    .line 224
    .line 225
    invoke-virtual {v0, v7}, Landroid/view/View;->setY(F)V

    .line 226
    .line 227
    .line 228
    return v2

    .line 229
    :cond_5
    invoke-virtual {v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 234
    .line 235
    int-to-float p0, p0

    .line 236
    invoke-virtual {v0, p0}, Landroid/view/View;->setY(F)V

    .line 237
    .line 238
    .line 239
    return v1

    .line 240
    :cond_6
    iget-object p0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 241
    .line 242
    iget-object p1, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 243
    .line 244
    iget-object p2, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Landroid/widget/RelativeLayout;

    .line 245
    .line 246
    invoke-interface {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->getScrollDistance()I

    .line 247
    .line 248
    .line 249
    iput-boolean v1, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 250
    .line 251
    iget p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 252
    .line 253
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 258
    .line 259
    int-to-float v0, v0

    .line 260
    cmpl-float p0, p0, v0

    .line 261
    .line 262
    const-wide/16 v6, 0x12c

    .line 263
    .line 264
    const-string v0, "y"

    .line 265
    .line 266
    if-nez p0, :cond_8

    .line 267
    .line 268
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 277
    .line 278
    int-to-float p1, p1

    .line 279
    iget v8, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:F

    .line 280
    .line 281
    add-float/2addr p1, v8

    .line 282
    sget v8, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:I

    .line 283
    .line 284
    int-to-float v8, v8

    .line 285
    add-float/2addr p1, v8

    .line 286
    cmpl-float p0, p0, p1

    .line 287
    .line 288
    if-lez p0, :cond_7

    .line 289
    .line 290
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲()V

    .line 291
    .line 292
    .line 293
    goto :goto_0

    .line 294
    :cond_7
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    iget p1, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 299
    .line 300
    cmpl-float p0, p0, p1

    .line 301
    .line 302
    if-eqz p0, :cond_a

    .line 303
    .line 304
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 305
    .line 306
    .line 307
    move-result p0

    .line 308
    iget p1, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:F

    .line 309
    .line 310
    new-array v3, v5, [F

    .line 311
    .line 312
    aput p0, v3, v1

    .line 313
    .line 314
    aput p1, v3, v2

    .line 315
    .line 316
    invoke-static {p2, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-virtual {p0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 324
    .line 325
    .line 326
    goto :goto_0

    .line 327
    :cond_8
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    iget v8, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 332
    .line 333
    sget v9, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:I

    .line 334
    .line 335
    int-to-float v9, v9

    .line 336
    add-float/2addr v8, v9

    .line 337
    cmpl-float p0, p0, v8

    .line 338
    .line 339
    if-lez p0, :cond_9

    .line 340
    .line 341
    invoke-virtual {v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲()V

    .line 342
    .line 343
    .line 344
    goto :goto_0

    .line 345
    :cond_9
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 346
    .line 347
    .line 348
    move-result p0

    .line 349
    iget v3, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 350
    .line 351
    cmpl-float p0, p0, v3

    .line 352
    .line 353
    if-eqz p0, :cond_a

    .line 354
    .line 355
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 356
    .line 357
    .line 358
    move-result p0

    .line 359
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 364
    .line 365
    int-to-float p1, p1

    .line 366
    new-array v3, v5, [F

    .line 367
    .line 368
    aput p0, v3, v1

    .line 369
    .line 370
    aput p1, v3, v2

    .line 371
    .line 372
    invoke-static {p2, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    invoke-virtual {p0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 380
    .line 381
    .line 382
    :cond_a
    :goto_0
    iget-object p0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;

    .line 383
    .line 384
    if-eqz p0, :cond_b

    .line 385
    .line 386
    invoke-interface {p0, v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 387
    .line 388
    .line 389
    :cond_b
    :goto_1
    return v1

    .line 390
    :cond_c
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 391
    .line 392
    .line 393
    move-result p0

    .line 394
    iput p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 395
    .line 396
    iput-boolean v2, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 397
    .line 398
    iget-object p0, v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Landroid/widget/RelativeLayout;

    .line 399
    .line 400
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 401
    .line 402
    .line 403
    move-result p0

    .line 404
    iput p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 405
    .line 406
    return v1
.end method
