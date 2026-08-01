.class public final Landroidx/recyclerview/widget/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    iget-object p0, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲世苏兰:L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世哲苏兰;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const/16 p0, 0x8f0

    .line 86
    .line 87
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_1
    return-void

    .line 94
    :pswitch_0
    check-cast v3, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;

    .line 95
    .line 96
    check-cast v4, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 118
    .line 119
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    iget-object v6, v3, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏世兰:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    iget-wide v7, v3, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:J

    .line 133
    .line 134
    invoke-virtual {v6, v7, v8}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    new-instance v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏世兰哲;

    .line 139
    .line 140
    invoke-direct {v7, v3, v0, v1, v5}, Landroidx/recyclerview/widget/飘花落叶言子楪苏世兰哲;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 152
    .line 153
    .line 154
    iget-object p0, v3, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰哲世:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_1
    move-object v6, v3

    .line 161
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;

    .line 162
    .line 163
    check-cast v4, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    :cond_6
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    move-object v7, v0

    .line 180
    check-cast v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;

    .line 181
    .line 182
    iget-object v0, v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 183
    .line 184
    iget-wide v11, v6, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏:J

    .line 185
    .line 186
    iget-object v3, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 187
    .line 188
    const/4 v5, 0x0

    .line 189
    if-nez v3, :cond_7

    .line 190
    .line 191
    move-object v9, v5

    .line 192
    goto :goto_4

    .line 193
    :cond_7
    iget-object v3, v3, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 194
    .line 195
    move-object v9, v3

    .line 196
    :goto_4
    iget-object v3, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 197
    .line 198
    if-eqz v3, :cond_8

    .line 199
    .line 200
    iget-object v5, v3, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 201
    .line 202
    :cond_8
    move-object v3, v5

    .line 203
    if-eqz v9, :cond_9

    .line 204
    .line 205
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-virtual {v5, v11, v12}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    iget-object v5, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 214
    .line 215
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    iget v5, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:I

    .line 219
    .line 220
    iget v10, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:I

    .line 221
    .line 222
    sub-int/2addr v5, v10

    .line 223
    int-to-float v5, v5

    .line 224
    invoke-virtual {v8, v5}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 225
    .line 226
    .line 227
    iget v5, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:I

    .line 228
    .line 229
    iget v10, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:I

    .line 230
    .line 231
    sub-int/2addr v5, v10

    .line 232
    int-to-float v5, v5

    .line 233
    invoke-virtual {v8, v5}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    new-instance v5, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲兰世;

    .line 241
    .line 242
    const/4 v10, 0x0

    .line 243
    invoke-direct/range {v5 .. v10}, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲兰世;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v13, v5}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-virtual {v5}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 251
    .line 252
    .line 253
    :cond_9
    if-eqz v3, :cond_6

    .line 254
    .line 255
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    iget-object v5, v7, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 260
    .line 261
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    invoke-virtual {v8, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0, v11, v12}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v5, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲兰世;

    .line 281
    .line 282
    const/4 v10, 0x1

    .line 283
    move-object v9, v3

    .line 284
    invoke-direct/range {v5 .. v10}, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲兰世;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Landroidx/recyclerview/widget/飘花落叶言子楪苏兰世哲;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 292
    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 296
    .line 297
    .line 298
    iget-object p0, v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏:Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :pswitch_2
    move-object v6, v3

    .line 305
    check-cast v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;

    .line 306
    .line 307
    check-cast v4, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_d

    .line 318
    .line 319
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;

    .line 324
    .line 325
    iget-object v7, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 326
    .line 327
    iget v2, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:I

    .line 328
    .line 329
    iget v3, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 330
    .line 331
    iget v5, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:I

    .line 332
    .line 333
    iget v0, v0, Landroidx/recyclerview/widget/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲:I

    .line 334
    .line 335
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    iget-object v9, v7, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 339
    .line 340
    sub-int v8, v5, v2

    .line 341
    .line 342
    sub-int v10, v0, v3

    .line 343
    .line 344
    if-eqz v8, :cond_b

    .line 345
    .line 346
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 351
    .line 352
    .line 353
    :cond_b
    if-eqz v10, :cond_c

    .line 354
    .line 355
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 360
    .line 361
    .line 362
    :cond_c
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    iget-object v0, v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    iget-wide v2, v6, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲:J

    .line 372
    .line 373
    invoke-virtual {v11, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    new-instance v5, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲世兰;

    .line 378
    .line 379
    invoke-direct/range {v5 .. v11}, Landroidx/recyclerview/widget/飘花落叶言子楪苏哲世兰;-><init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 391
    .line 392
    .line 393
    iget-object p0, v6, Landroidx/recyclerview/widget/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰:Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    return-void

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
