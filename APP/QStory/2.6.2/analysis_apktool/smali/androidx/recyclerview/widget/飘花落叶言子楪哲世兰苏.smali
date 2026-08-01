.class public final Landroidx/recyclerview/widget/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/recyclerview/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, Landroidx/recyclerview/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 13
    .line 14
    invoke-virtual {v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->飘花落叶言子兰楪世苏哲()Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;

    .line 19
    .line 20
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 21
    .line 22
    if-eqz v1, :cond_c

    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    iget-wide v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲兰苏:J

    .line 29
    .line 30
    const-wide/high16 v9, -0x8000000000000000L

    .line 31
    .line 32
    cmp-long v1, v7, v9

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    const-wide/16 v7, 0x0

    .line 37
    .line 38
    :goto_0
    move-wide v15, v7

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    sub-long v7, v5, v7

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_1
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲苏兰:Landroid/graphics/Rect;

    .line 50
    .line 51
    if-nez v7, :cond_1

    .line 52
    .line 53
    new-instance v7, Landroid/graphics/Rect;

    .line 54
    .line 55
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲苏兰:Landroid/graphics/Rect;

    .line 59
    .line 60
    :cond_1
    iget-object v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 61
    .line 62
    iget-object v7, v7, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 63
    .line 64
    iget-object v8, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲苏兰:Landroid/graphics/Rect;

    .line 65
    .line 66
    invoke-virtual {v1, v8, v7}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏世兰(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_3

    .line 74
    .line 75
    iget v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世:F

    .line 76
    .line 77
    iget v8, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲:F

    .line 78
    .line 79
    add-float/2addr v7, v8

    .line 80
    float-to-int v7, v7

    .line 81
    iget-object v8, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲苏兰:Landroid/graphics/Rect;

    .line 82
    .line 83
    iget v8, v8, Landroid/graphics/Rect;->left:I

    .line 84
    .line 85
    sub-int v8, v7, v8

    .line 86
    .line 87
    iget-object v11, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 88
    .line 89
    invoke-virtual {v11}, Landroid/view/View;->getPaddingLeft()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    sub-int/2addr v8, v11

    .line 94
    iget v11, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲:F

    .line 95
    .line 96
    cmpg-float v12, v11, v3

    .line 97
    .line 98
    if-gez v12, :cond_2

    .line 99
    .line 100
    if-gez v8, :cond_2

    .line 101
    .line 102
    :goto_2
    move v14, v8

    .line 103
    goto :goto_3

    .line 104
    :cond_2
    cmpl-float v8, v11, v3

    .line 105
    .line 106
    if-lez v8, :cond_3

    .line 107
    .line 108
    iget-object v8, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 109
    .line 110
    iget-object v8, v8, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 111
    .line 112
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    add-int/2addr v8, v7

    .line 117
    iget-object v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲苏兰:Landroid/graphics/Rect;

    .line 118
    .line 119
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 120
    .line 121
    add-int/2addr v8, v7

    .line 122
    iget-object v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 123
    .line 124
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    iget-object v11, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 129
    .line 130
    invoke-virtual {v11}, Landroid/view/View;->getPaddingRight()I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    sub-int/2addr v7, v11

    .line 135
    sub-int/2addr v8, v7

    .line 136
    if-lez v8, :cond_3

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_3
    move v14, v2

    .line 140
    :goto_3
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_5

    .line 145
    .line 146
    iget v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰世哲:F

    .line 147
    .line 148
    iget v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲世兰:F

    .line 149
    .line 150
    add-float/2addr v1, v7

    .line 151
    float-to-int v1, v1

    .line 152
    iget-object v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲苏兰:Landroid/graphics/Rect;

    .line 153
    .line 154
    iget v7, v7, Landroid/graphics/Rect;->top:I

    .line 155
    .line 156
    sub-int v7, v1, v7

    .line 157
    .line 158
    iget-object v8, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 159
    .line 160
    invoke-virtual {v8}, Landroid/view/View;->getPaddingTop()I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    sub-int/2addr v7, v8

    .line 165
    iget v8, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲世兰:F

    .line 166
    .line 167
    cmpg-float v11, v8, v3

    .line 168
    .line 169
    if-gez v11, :cond_4

    .line 170
    .line 171
    if-gez v7, :cond_4

    .line 172
    .line 173
    move v2, v7

    .line 174
    goto :goto_4

    .line 175
    :cond_4
    cmpl-float v3, v8, v3

    .line 176
    .line 177
    if-lez v3, :cond_5

    .line 178
    .line 179
    iget-object v3, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 180
    .line 181
    iget-object v3, v3, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 182
    .line 183
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    add-int/2addr v3, v1

    .line 188
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲苏兰:Landroid/graphics/Rect;

    .line 189
    .line 190
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 191
    .line 192
    add-int/2addr v3, v1

    .line 193
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    iget-object v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 200
    .line 201
    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    sub-int/2addr v1, v7

    .line 206
    sub-int/2addr v3, v1

    .line 207
    if-lez v3, :cond_5

    .line 208
    .line 209
    move v2, v3

    .line 210
    :cond_5
    :goto_4
    if-eqz v14, :cond_6

    .line 211
    .line 212
    iget-object v11, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲世苏兰:L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;

    .line 213
    .line 214
    iget-object v12, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 215
    .line 216
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 217
    .line 218
    iget-object v1, v1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 219
    .line 220
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 225
    .line 226
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v11 .. v16}, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏(Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;IIJ)I

    .line 230
    .line 231
    .line 232
    move-result v14

    .line 233
    :cond_6
    move v1, v14

    .line 234
    if-eqz v2, :cond_7

    .line 235
    .line 236
    iget-object v11, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲世苏兰:L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;

    .line 237
    .line 238
    iget-object v12, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 239
    .line 240
    iget-object v3, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 241
    .line 242
    iget-object v3, v3, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 243
    .line 244
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    iget-object v3, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 249
    .line 250
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 251
    .line 252
    .line 253
    move v14, v2

    .line 254
    invoke-virtual/range {v11 .. v16}, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏(Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;IIJ)I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    goto :goto_5

    .line 259
    :cond_7
    move v14, v2

    .line 260
    :goto_5
    if-nez v1, :cond_9

    .line 261
    .line 262
    if-eqz v2, :cond_8

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_8
    iput-wide v9, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲兰苏:J

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_9
    :goto_6
    iget-wide v7, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲兰苏:J

    .line 269
    .line 270
    cmp-long v3, v7, v9

    .line 271
    .line 272
    if-nez v3, :cond_a

    .line 273
    .line 274
    iput-wide v5, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪哲兰苏:J

    .line 275
    .line 276
    :cond_a
    iget-object v3, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 277
    .line 278
    invoke-virtual {v3, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 279
    .line 280
    .line 281
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 282
    .line 283
    if-eqz v1, :cond_b

    .line 284
    .line 285
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 286
    .line 287
    .line 288
    :cond_b
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 289
    .line 290
    iget-object v2, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/飘花落叶言子楪哲世兰苏;

    .line 291
    .line 292
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 293
    .line 294
    .line 295
    iget-object v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 296
    .line 297
    sget-object v2, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 298
    .line 299
    invoke-virtual {v1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 300
    .line 301
    .line 302
    :cond_c
    :goto_7
    return-void

    .line 303
    :pswitch_1
    check-cast v4, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;

    .line 304
    .line 305
    iget-object v0, v4, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪苏兰哲:Landroid/animation/ValueAnimator;

    .line 306
    .line 307
    iget v1, v4, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪哲苏兰:I

    .line 308
    .line 309
    const/4 v5, 0x2

    .line 310
    const/4 v6, 0x1

    .line 311
    if-eq v1, v6, :cond_d

    .line 312
    .line 313
    if-eq v1, v5, :cond_e

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_d
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 317
    .line 318
    .line 319
    :cond_e
    const/4 v1, 0x3

    .line 320
    iput v1, v4, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪哲苏兰:I

    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    check-cast v1, Ljava/lang/Float;

    .line 327
    .line 328
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    new-array v4, v5, [F

    .line 333
    .line 334
    aput v1, v4, v2

    .line 335
    .line 336
    aput v3, v4, v6

    .line 337
    .line 338
    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 339
    .line 340
    .line 341
    const-wide/16 v1, 0x1f4

    .line 342
    .line 343
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 347
    .line 348
    .line 349
    :goto_8
    return-void

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
