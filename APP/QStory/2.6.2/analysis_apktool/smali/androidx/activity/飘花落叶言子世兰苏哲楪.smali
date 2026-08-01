.class public final synthetic Landroidx/activity/飘花落叶言子世兰苏哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Landroidx/activity/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILandroidx/compose/foundation/lazy/飘花落叶言子楪哲兰苏世;)V
    .locals 0

    .line 1
    const/16 p1, 0x16

    .line 2
    .line 3
    iput p1, p0, Landroidx/activity/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget p0, p0, Landroidx/activity/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, -0x1

    .line 5
    sget-object v2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x20

    .line 10
    .line 11
    const-wide v6, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;

    .line 20
    .line 21
    iget-object p0, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 22
    .line 23
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 24
    .line 25
    iget-wide v2, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏:J

    .line 26
    .line 27
    sget v5, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 28
    .line 29
    and-long/2addr v2, v6

    .line 30
    long-to-int v2, v2

    .line 31
    if-gtz v2, :cond_0

    .line 32
    .line 33
    :goto_0
    move p0, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-static {}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏()L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    if-gtz v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {p0, v2, v1}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    add-int/lit8 v5, v2, -0x1

    .line 50
    .line 51
    invoke-virtual {v3, v5, p0}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-gez v3, :cond_4

    .line 56
    .line 57
    if-gtz v2, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-static {p0, v2, v1}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    move p0, v3

    .line 66
    :goto_1
    if-ne p0, v1, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;

    .line 70
    .line 71
    iget-wide v1, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏:J

    .line 72
    .line 73
    and-long/2addr v1, v6

    .line 74
    long-to-int p1, v1

    .line 75
    sub-int/2addr p1, p0

    .line 76
    invoke-direct {v0, p1, v4}, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;-><init>(II)V

    .line 77
    .line 78
    .line 79
    :goto_2
    return-object v0

    .line 80
    :pswitch_0
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 81
    .line 82
    return-object v2

    .line 83
    :pswitch_1
    check-cast p1, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 84
    .line 85
    sget p0, Landroidx/compose/foundation/text/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:I

    .line 86
    .line 87
    return-object v2

    .line 88
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 89
    .line 90
    new-instance p0, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世哲苏兰;

    .line 91
    .line 92
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, [I

    .line 97
    .line 98
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, [I

    .line 103
    .line 104
    invoke-direct {p0, v0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世哲苏兰;-><init>([I[I)V

    .line 105
    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object p0, Landroidx/compose/foundation/lazy/grid/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/lazy/grid/飘花落叶言子楪世苏哲兰;

    .line 114
    .line 115
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 129
    .line 130
    new-instance p0, Landroidx/compose/foundation/lazy/grid/飘花落叶言子楪世苏兰哲;

    .line 131
    .line 132
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-direct {p0, v0, p1}, Landroidx/compose/foundation/lazy/grid/飘花落叶言子楪世苏兰哲;-><init>(II)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_6
    check-cast p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;

    .line 157
    .line 158
    return-object v2

    .line 159
    :pswitch_7
    check-cast p1, Ljava/util/List;

    .line 160
    .line 161
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;

    .line 162
    .line 163
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    invoke-direct {p0, v0, p1}, Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;-><init>(II)V

    .line 184
    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_9
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 194
    .line 195
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:F

    .line 196
    .line 197
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    return-object p0

    .line 202
    :pswitch_a
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;

    .line 203
    .line 204
    new-instance p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 205
    .line 206
    iget v0, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 207
    .line 208
    iget v1, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:F

    .line 209
    .line 210
    iget v2, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:F

    .line 211
    .line 212
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:F

    .line 213
    .line 214
    invoke-direct {p0, v0, v1, v2, p1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;-><init>(FFFF)V

    .line 215
    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_b
    check-cast p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 219
    .line 220
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;

    .line 221
    .line 222
    iget v0, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 223
    .line 224
    iget v1, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 225
    .line 226
    iget v2, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 227
    .line 228
    iget p1, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 229
    .line 230
    invoke-direct {p0, v0, v1, v2, p1}, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;-><init>(FFFF)V

    .line 231
    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_c
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 235
    .line 236
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 237
    .line 238
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    if-gez p0, :cond_6

    .line 243
    .line 244
    move p0, v4

    .line 245
    :cond_6
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 246
    .line 247
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-gez p1, :cond_7

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_7
    move v4, p1

    .line 255
    :goto_3
    int-to-long p0, p0

    .line 256
    shl-long/2addr p0, v5

    .line 257
    int-to-long v0, v4

    .line 258
    and-long/2addr v0, v6

    .line 259
    or-long/2addr p0, v0

    .line 260
    new-instance v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 261
    .line 262
    invoke-direct {v0, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;-><init>(J)V

    .line 263
    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_d
    check-cast p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 267
    .line 268
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 269
    .line 270
    iget-wide v0, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 271
    .line 272
    shr-long v2, v0, v5

    .line 273
    .line 274
    long-to-int p1, v2

    .line 275
    int-to-float p1, p1

    .line 276
    and-long/2addr v0, v6

    .line 277
    long-to-int v0, v0

    .line 278
    int-to-float v0, v0

    .line 279
    invoke-direct {p0, p1, v0}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;-><init>(FF)V

    .line 280
    .line 281
    .line 282
    return-object p0

    .line 283
    :pswitch_e
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 284
    .line 285
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 286
    .line 287
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 292
    .line 293
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    int-to-long v0, p0

    .line 298
    shl-long/2addr v0, v5

    .line 299
    int-to-long p0, p1

    .line 300
    and-long/2addr p0, v6

    .line 301
    or-long/2addr p0, v0

    .line 302
    new-instance v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;

    .line 303
    .line 304
    invoke-direct {v0, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;-><init>(J)V

    .line 305
    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_f
    check-cast p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;

    .line 309
    .line 310
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 311
    .line 312
    iget-wide v0, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:J

    .line 313
    .line 314
    shr-long v2, v0, v5

    .line 315
    .line 316
    long-to-int p1, v2

    .line 317
    int-to-float p1, p1

    .line 318
    and-long/2addr v0, v6

    .line 319
    long-to-int v0, v0

    .line 320
    int-to-float v0, v0

    .line 321
    invoke-direct {p0, p1, v0}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;-><init>(FF)V

    .line 322
    .line 323
    .line 324
    return-object p0

    .line 325
    :pswitch_10
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 326
    .line 327
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 328
    .line 329
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 330
    .line 331
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 332
    .line 333
    .line 334
    move-result p0

    .line 335
    int-to-long v0, p0

    .line 336
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 337
    .line 338
    .line 339
    move-result p0

    .line 340
    int-to-long p0, p0

    .line 341
    shl-long/2addr v0, v5

    .line 342
    and-long/2addr p0, v6

    .line 343
    or-long/2addr p0, v0

    .line 344
    new-instance v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 345
    .line 346
    invoke-direct {v0, p0, p1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 347
    .line 348
    .line 349
    return-object v0

    .line 350
    :pswitch_11
    check-cast p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 351
    .line 352
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 353
    .line 354
    iget-wide v0, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 355
    .line 356
    shr-long/2addr v0, v5

    .line 357
    long-to-int v0, v0

    .line 358
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    iget-wide v1, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 363
    .line 364
    and-long/2addr v1, v6

    .line 365
    long-to-int p1, v1

    .line 366
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    invoke-direct {p0, v0, p1}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;-><init>(FF)V

    .line 371
    .line 372
    .line 373
    return-object p0

    .line 374
    :pswitch_12
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 375
    .line 376
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 377
    .line 378
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 379
    .line 380
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 381
    .line 382
    .line 383
    move-result p0

    .line 384
    int-to-long v0, p0

    .line 385
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 386
    .line 387
    .line 388
    move-result p0

    .line 389
    int-to-long p0, p0

    .line 390
    shl-long/2addr v0, v5

    .line 391
    and-long/2addr p0, v6

    .line 392
    or-long/2addr p0, v0

    .line 393
    new-instance v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 394
    .line 395
    invoke-direct {v0, p0, p1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;-><init>(J)V

    .line 396
    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_13
    check-cast p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 400
    .line 401
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 402
    .line 403
    iget-wide v0, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 404
    .line 405
    shr-long/2addr v0, v5

    .line 406
    long-to-int v0, v0

    .line 407
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    iget-wide v1, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 412
    .line 413
    and-long/2addr v1, v6

    .line 414
    long-to-int p1, v1

    .line 415
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 416
    .line 417
    .line 418
    move-result p1

    .line 419
    invoke-direct {p0, v0, p1}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;-><init>(FF)V

    .line 420
    .line 421
    .line 422
    return-object p0

    .line 423
    :pswitch_14
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 424
    .line 425
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 426
    .line 427
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 428
    .line 429
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 430
    .line 431
    .line 432
    move-result p0

    .line 433
    int-to-long v0, p0

    .line 434
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 435
    .line 436
    .line 437
    move-result p0

    .line 438
    int-to-long p0, p0

    .line 439
    shl-long/2addr v0, v5

    .line 440
    and-long/2addr p0, v6

    .line 441
    or-long/2addr p0, v0

    .line 442
    new-instance v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏世哲兰;

    .line 443
    .line 444
    invoke-direct {v0, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏世哲兰;-><init>(J)V

    .line 445
    .line 446
    .line 447
    return-object v0

    .line 448
    :pswitch_15
    check-cast p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏世哲兰;

    .line 449
    .line 450
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 451
    .line 452
    iget-wide v0, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 453
    .line 454
    shr-long/2addr v0, v5

    .line 455
    long-to-int v0, v0

    .line 456
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    iget-wide v1, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 461
    .line 462
    and-long/2addr v1, v6

    .line 463
    long-to-int p1, v1

    .line 464
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    invoke-direct {p0, v0, p1}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;-><init>(FF)V

    .line 469
    .line 470
    .line 471
    return-object p0

    .line 472
    :pswitch_16
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 473
    .line 474
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:F

    .line 475
    .line 476
    new-instance p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世兰哲苏;

    .line 477
    .line 478
    invoke-direct {p1, p0}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世兰哲苏;-><init>(F)V

    .line 479
    .line 480
    .line 481
    return-object p1

    .line 482
    :pswitch_17
    check-cast p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世兰哲苏;

    .line 483
    .line 484
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 485
    .line 486
    iget p1, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:F

    .line 487
    .line 488
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;-><init>(F)V

    .line 489
    .line 490
    .line 491
    return-object p0

    .line 492
    :pswitch_18
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 493
    .line 494
    iget p0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:F

    .line 495
    .line 496
    float-to-int p0, p0

    .line 497
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    return-object p0

    .line 502
    :pswitch_19
    check-cast p1, Ljava/lang/Integer;

    .line 503
    .line 504
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 505
    .line 506
    .line 507
    move-result p0

    .line 508
    new-instance p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 509
    .line 510
    int-to-float p0, p0

    .line 511
    invoke-direct {p1, p0}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;-><init>(F)V

    .line 512
    .line 513
    .line 514
    return-object p1

    .line 515
    :pswitch_1a
    check-cast p1, Ljava/lang/Float;

    .line 516
    .line 517
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 518
    .line 519
    .line 520
    move-result p0

    .line 521
    new-instance p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 522
    .line 523
    invoke-direct {p1, p0}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;-><init>(F)V

    .line 524
    .line 525
    .line 526
    return-object p1

    .line 527
    :pswitch_1b
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;

    .line 528
    .line 529
    return-object v2

    .line 530
    :pswitch_1c
    check-cast p1, Landroid/content/res/Resources;

    .line 531
    .line 532
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 536
    .line 537
    .line 538
    move-result-object p0

    .line 539
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 540
    .line 541
    and-int/lit8 p0, p0, 0x30

    .line 542
    .line 543
    if-ne p0, v5, :cond_8

    .line 544
    .line 545
    goto :goto_4

    .line 546
    :cond_8
    move v3, v4

    .line 547
    :goto_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 548
    .line 549
    .line 550
    move-result-object p0

    .line 551
    return-object p0

    .line 552
    nop

    .line 553
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
