.class public final Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;Landroidx/recyclerview/widget/飘花落叶言子世楪苏兰哲;I)V
    .locals 0

    .line 1
    const/4 p3, 0x3

    .line 2
    iput p3, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Ljava/util/ArrayList;I)V
    .locals 0

    .line 12
    iput p3, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iget-object v3, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, Landroidx/recyclerview/widget/飘花落叶言子世楪苏兰哲;

    .line 14
    .line 15
    iget-object v0, v4, Landroidx/recyclerview/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 16
    .line 17
    check-cast v3, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;

    .line 18
    .line 19
    iget-object v1, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 20
    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    iget-boolean v1, v1, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世苏哲兰楪:Z

    .line 24
    .line 25
    if-eqz v1, :cond_4

    .line 26
    .line 27
    iget-boolean v1, v4, Landroidx/recyclerview/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏兰世哲:Z

    .line 28
    .line 29
    if-nez v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, -0x1

    .line 36
    if-eq v1, v2, :cond_4

    .line 37
    .line 38
    iget-object v1, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    :cond_0
    iget-object v1, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v4, 0x0

    .line 59
    :goto_0
    if-ge v4, v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Landroidx/recyclerview/widget/飘花落叶言子世楪苏兰哲;

    .line 66
    .line 67
    iget-boolean v5, v5, Landroidx/recyclerview/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏兰哲世:Z

    .line 68
    .line 69
    if-nez v5, :cond_2

    .line 70
    .line 71
    :cond_1
    iget-object v0, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    iget-object p0, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲世苏兰:L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const-wide v1, -0x36a5d900051405a7L    # -2.3328669902521372E45

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    :cond_4
    :goto_1
    return-void

    .line 97
    :pswitch_0
    check-cast v3, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;

    .line 98
    .line 99
    check-cast v4, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    iget-object v6, v3, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏世兰:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    iget-wide v7, v3, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:J

    .line 136
    .line 137
    invoke-virtual {v6, v7, v8}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    new-instance v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏世兰哲;

    .line 142
    .line 143
    invoke-direct {v7, v3, v0, v1, v5}, Landroidx/recyclerview/widget/飘花落叶言子楪苏世兰哲;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 155
    .line 156
    .line 157
    iget-object p0, v3, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰哲世:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :pswitch_1
    move-object v6, v3

    .line 164
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;

    .line 165
    .line 166
    check-cast v4, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    :cond_6
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    move-object v7, v0

    .line 183
    check-cast v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;

    .line 184
    .line 185
    iget-object v0, v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 186
    .line 187
    iget-wide v11, v6, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏:J

    .line 188
    .line 189
    iget-object v3, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 190
    .line 191
    const/4 v5, 0x0

    .line 192
    if-nez v3, :cond_7

    .line 193
    .line 194
    move-object v9, v5

    .line 195
    goto :goto_4

    .line 196
    :cond_7
    iget-object v3, v3, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 197
    .line 198
    move-object v9, v3

    .line 199
    :goto_4
    iget-object v3, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 200
    .line 201
    if-eqz v3, :cond_8

    .line 202
    .line 203
    iget-object v5, v3, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 204
    .line 205
    :cond_8
    move-object v3, v5

    .line 206
    if-eqz v9, :cond_9

    .line 207
    .line 208
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-virtual {v5, v11, v12}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    iget-object v5, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 217
    .line 218
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    iget v5, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:I

    .line 222
    .line 223
    iget v10, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:I

    .line 224
    .line 225
    sub-int/2addr v5, v10

    .line 226
    int-to-float v5, v5

    .line 227
    invoke-virtual {v8, v5}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 228
    .line 229
    .line 230
    iget v5, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:I

    .line 231
    .line 232
    iget v10, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:I

    .line 233
    .line 234
    sub-int/2addr v5, v10

    .line 235
    int-to-float v5, v5

    .line 236
    invoke-virtual {v8, v5}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v8, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 240
    .line 241
    .line 242
    move-result-object v13

    .line 243
    new-instance v5, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲兰世;

    .line 244
    .line 245
    const/4 v10, 0x0

    .line 246
    invoke-direct/range {v5 .. v10}, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲兰世;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v13, v5}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-virtual {v5}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 254
    .line 255
    .line 256
    :cond_9
    if-eqz v3, :cond_6

    .line 257
    .line 258
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    iget-object v5, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 263
    .line 264
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0, v11, v12}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    new-instance v5, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲兰世;

    .line 284
    .line 285
    const/4 v10, 0x1

    .line 286
    move-object v9, v3

    .line 287
    invoke-direct/range {v5 .. v10}, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲兰世;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 299
    .line 300
    .line 301
    iget-object p0, v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏:Ljava/util/ArrayList;

    .line 302
    .line 303
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_2
    move-object v6, v3

    .line 308
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;

    .line 309
    .line 310
    check-cast v4, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-eqz v0, :cond_d

    .line 321
    .line 322
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;

    .line 327
    .line 328
    iget-object v7, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 329
    .line 330
    iget v2, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:I

    .line 331
    .line 332
    iget v3, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 333
    .line 334
    iget v5, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:I

    .line 335
    .line 336
    iget v0, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲:I

    .line 337
    .line 338
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object v9, v7, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 342
    .line 343
    sub-int v8, v5, v2

    .line 344
    .line 345
    sub-int v10, v0, v3

    .line 346
    .line 347
    if-eqz v8, :cond_b

    .line 348
    .line 349
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 354
    .line 355
    .line 356
    :cond_b
    if-eqz v10, :cond_c

    .line 357
    .line 358
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 363
    .line 364
    .line 365
    :cond_c
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 366
    .line 367
    .line 368
    move-result-object v11

    .line 369
    iget-object v0, v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    iget-wide v2, v6, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲:J

    .line 375
    .line 376
    invoke-virtual {v11, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    new-instance v5, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲世兰;

    .line 381
    .line 382
    invoke-direct/range {v5 .. v11}, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲世兰;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 390
    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 394
    .line 395
    .line 396
    iget-object p0, v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰:Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    nop

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
