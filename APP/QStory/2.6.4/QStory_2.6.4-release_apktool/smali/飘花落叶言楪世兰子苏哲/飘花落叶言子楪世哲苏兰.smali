.class public final L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰哲苏;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲兰苏;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 9

    .line 1
    iget v0, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, -0x80000000

    .line 5
    .line 6
    const-string v3, "OnGlobalLayoutListener called attachStateListener="

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v7, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 17
    .line 18
    invoke-virtual {v7, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->飘花落叶言子楪哲苏兰世(I)V

    .line 19
    .line 20
    .line 21
    return v5

    .line 22
    :pswitch_0
    const-string v0, "ViewTarget"

    .line 23
    .line 24
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_0
    check-cast v7, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰哲苏;

    .line 52
    .line 53
    if-eqz p0, :cond_8

    .line 54
    .line 55
    iget-object v0, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 56
    .line 57
    iget-object v3, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    add-int/2addr v7, v4

    .line 75
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    move v4, v6

    .line 85
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    invoke-virtual {p0, v8, v4, v7}, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(III)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    add-int/2addr v8, v7

    .line 102
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    if-eqz v7, :cond_3

    .line 107
    .line 108
    iget v6, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 109
    .line 110
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-virtual {p0, v7, v6, v8}, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(III)I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-gtz v4, :cond_4

    .line 119
    .line 120
    if-ne v4, v2, :cond_8

    .line 121
    .line 122
    :cond_4
    if-gtz v6, :cond_5

    .line 123
    .line 124
    if-ne v6, v2, :cond_8

    .line 125
    .line 126
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-eqz v7, :cond_6

    .line 140
    .line 141
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    check-cast v7, Lcom/bumptech/glide/request/飘花落叶言子楪世兰哲苏;

    .line 146
    .line 147
    invoke-virtual {v7, v4, v6}, Lcom/bumptech/glide/request/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(II)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_7

    .line 160
    .line 161
    iget-object v3, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;

    .line 162
    .line 163
    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 164
    .line 165
    .line 166
    :cond_7
    iput-object v1, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 169
    .line 170
    .line 171
    :cond_8
    :goto_2
    return v5

    .line 172
    :pswitch_1
    const-string v0, "CustomViewTarget"

    .line 173
    .line 174
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_9

    .line 179
    .line 180
    new-instance v4, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    :cond_9
    check-cast v7, Ljava/lang/ref/WeakReference;

    .line 196
    .line 197
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲兰苏;

    .line 202
    .line 203
    if-eqz p0, :cond_11

    .line 204
    .line 205
    iget-object v0, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 206
    .line 207
    iget-object v3, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_a

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_a
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    add-int/2addr v7, v4

    .line 225
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    if-eqz v4, :cond_b

    .line 230
    .line 231
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_b
    move v4, v6

    .line 235
    :goto_3
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    invoke-virtual {p0, v8, v4, v7}, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(III)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    add-int/2addr v8, v7

    .line 252
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    if-eqz v7, :cond_c

    .line 257
    .line 258
    iget v6, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 259
    .line 260
    :cond_c
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    invoke-virtual {p0, v7, v6, v8}, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(III)I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-gtz v4, :cond_d

    .line 269
    .line 270
    if-ne v4, v2, :cond_11

    .line 271
    .line 272
    :cond_d
    if-gtz v6, :cond_e

    .line 273
    .line 274
    if-ne v6, v2, :cond_11

    .line 275
    .line 276
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-eqz v7, :cond_f

    .line 290
    .line 291
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    check-cast v7, Lcom/bumptech/glide/request/飘花落叶言子楪世兰哲苏;

    .line 296
    .line 297
    invoke-virtual {v7, v4, v6}, Lcom/bumptech/glide/request/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(II)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_f
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    if-eqz v3, :cond_10

    .line 310
    .line 311
    iget-object v3, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;

    .line 312
    .line 313
    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 314
    .line 315
    .line 316
    :cond_10
    iput-object v1, p0, L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世哲苏兰;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 319
    .line 320
    .line 321
    :cond_11
    :goto_5
    return v5

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
