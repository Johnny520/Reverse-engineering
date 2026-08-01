.class public final Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;

.field public 飘花落叶言子楪世哲苏兰:Landroid/app/Activity;

.field public 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世苏哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;


# virtual methods
.method public final getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/CharSequence;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .line 1
    iget-object p3, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    new-instance p2, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 20
    .line 21
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 22
    .line 23
    .line 24
    iget-object v4, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    const v4, 0x240c0065

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const v4, 0x24090195

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Landroid/widget/ImageView;

    .line 50
    .line 51
    iput-object v4, p2, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/widget/ImageView;

    .line 52
    .line 53
    const v4, 0x24090196

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Landroid/widget/ImageView;

    .line 61
    .line 62
    iput-object v4, p2, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 63
    .line 64
    const v4, 0x240903b3

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Landroid/widget/TextView;

    .line 72
    .line 73
    iput-object v4, p2, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 74
    .line 75
    const v4, 0x24090312

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Landroid/widget/Space;

    .line 83
    .line 84
    iput-object v4, p2, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Space;

    .line 85
    .line 86
    invoke-virtual {v3, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object v11, v3

    .line 90
    move-object v3, p2

    .line 91
    move-object p2, v11

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;

    .line 98
    .line 99
    :goto_0
    iget-object v4, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲世兰楪:Ljava/util/HashMap;

    .line 100
    .line 101
    iget-object v5, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 102
    .line 103
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Ljava/lang/Boolean;

    .line 112
    .line 113
    const/4 v6, 0x1

    .line 114
    if-nez v4, :cond_1

    .line 115
    .line 116
    move v4, v6

    .line 117
    goto :goto_1

    .line 118
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    :goto_1
    if-nez v4, :cond_2

    .line 123
    .line 124
    const v4, 0x3ecccccd    # 0.4f

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_2
    const/high16 v4, 0x3f800000    # 1.0f

    .line 132
    .line 133
    invoke-virtual {p2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 134
    .line 135
    .line 136
    :goto_2
    iget-object v4, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲世楪兰:Lcom/kongzue/dialogx/interfaces/SELECT_MODE;

    .line 137
    .line 138
    sget-object v7, Lcom/kongzue/dialogx/interfaces/SELECT_MODE;->SINGLE:Lcom/kongzue/dialogx/interfaces/SELECT_MODE;

    .line 139
    .line 140
    const/16 v8, 0x8

    .line 141
    .line 142
    const/4 v9, 0x0

    .line 143
    if-ne v4, v7, :cond_5

    .line 144
    .line 145
    iget-object v4, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 146
    .line 147
    if-eqz v4, :cond_8

    .line 148
    .line 149
    iget v7, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲楪兰世:I

    .line 150
    .line 151
    if-ne v7, p1, :cond_3

    .line 152
    .line 153
    invoke-virtual {v4, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v6}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲(Z)I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_8

    .line 168
    .line 169
    iget-object v7, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 170
    .line 171
    invoke-virtual {v7, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_3
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v9}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲(Z)I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    iget-object v7, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 187
    .line 188
    if-eqz v4, :cond_4

    .line 189
    .line 190
    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    iget-object v7, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 194
    .line 195
    invoke-virtual {v7, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_4
    const/4 v4, 0x4

    .line 200
    invoke-virtual {v7, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_5
    sget-object v7, Lcom/kongzue/dialogx/interfaces/SELECT_MODE;->MULTIPLE:Lcom/kongzue/dialogx/interfaces/SELECT_MODE;

    .line 205
    .line 206
    if-ne v4, v7, :cond_7

    .line 207
    .line 208
    iget-object v4, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 209
    .line 210
    if-nez v4, :cond_6

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_6
    throw v2

    .line 214
    :cond_7
    iget-object v4, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 215
    .line 216
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 217
    .line 218
    .line 219
    :cond_8
    :goto_3
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 226
    .line 227
    .line 228
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    check-cast p1, Ljava/lang/CharSequence;

    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 235
    .line 236
    .line 237
    move-result p3

    .line 238
    if-eqz p3, :cond_9

    .line 239
    .line 240
    const p3, 0x2406003d

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_9
    const p3, 0x24060479

    .line 245
    .line 246
    .line 247
    :goto_4
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    invoke-virtual {v4, v7}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(Z)I

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-eqz v4, :cond_a

    .line 263
    .line 264
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    invoke-virtual {p3, v4}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(Z)I

    .line 273
    .line 274
    .line 275
    move-result p3

    .line 276
    :cond_a
    if-eqz p1, :cond_e

    .line 277
    .line 278
    iget-object v4, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;

    .line 279
    .line 280
    if-nez v4, :cond_c

    .line 281
    .line 282
    new-instance v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;

    .line 283
    .line 284
    invoke-direct {v4}, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;-><init>()V

    .line 285
    .line 286
    .line 287
    iget-object v7, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 288
    .line 289
    invoke-virtual {v7}, Landroid/widget/TextView;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 294
    .line 295
    if-ne v7, v10, :cond_b

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_b
    move v6, v9

    .line 299
    :goto_5
    iput-boolean v6, v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰:Z

    .line 300
    .line 301
    iget-object v6, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 302
    .line 303
    invoke-virtual {v6}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-virtual {v6}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    iput v6, v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:I

    .line 312
    .line 313
    iget-object v6, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 314
    .line 315
    invoke-virtual {v6}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    invoke-virtual {v6}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    iput-boolean v6, v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Z

    .line 324
    .line 325
    iget-object v6, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 326
    .line 327
    invoke-virtual {v6}, Landroid/widget/TextView;->getTextSize()F

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 340
    .line 341
    div-float/2addr v6, v7

    .line 342
    const/high16 v7, 0x3f000000    # 0.5f

    .line 343
    .line 344
    add-float/2addr v6, v7

    .line 345
    float-to-int v6, v6

    .line 346
    iput v6, v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 347
    .line 348
    iget-object v6, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 349
    .line 350
    invoke-virtual {v6}, Landroid/widget/TextView;->getGravity()I

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    iput v6, v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:I

    .line 355
    .line 356
    iget-object v6, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 357
    .line 358
    invoke-virtual {v6}, Landroid/widget/TextView;->getMaxLines()I

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    iput v6, v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:I

    .line 363
    .line 364
    iput-object v4, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Lcom/kongzue/dialogx/util/飘花落叶言子楪苏兰世哲;

    .line 365
    .line 366
    :cond_c
    iget-object p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 367
    .line 368
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 369
    .line 370
    .line 371
    iget-object p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/widget/TextView;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getColor(I)I

    .line 378
    .line 379
    .line 380
    move-result p1

    .line 381
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 382
    .line 383
    .line 384
    sget-object p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 385
    .line 386
    iget-object p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 387
    .line 388
    if-eqz p0, :cond_d

    .line 389
    .line 390
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲()Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲()Z

    .line 397
    .line 398
    .line 399
    iget-object p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/ImageView;

    .line 400
    .line 401
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 402
    .line 403
    .line 404
    :cond_d
    iget-object p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/widget/ImageView;

    .line 405
    .line 406
    invoke-virtual {p0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 407
    .line 408
    .line 409
    iget-object p0, v3, Lcom/kongzue/dialogx/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Space;

    .line 410
    .line 411
    if-eqz p0, :cond_e

    .line 412
    .line 413
    invoke-virtual {p0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 414
    .line 415
    .line 416
    :cond_e
    return-object p2
.end method
