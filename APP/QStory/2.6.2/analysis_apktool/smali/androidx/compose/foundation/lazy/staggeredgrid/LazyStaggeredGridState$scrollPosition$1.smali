.class final synthetic Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollPosition$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "fillNearestIndices(II)[I"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    const-class v3, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    const-string v4, "fillNearestIndices"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 353
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollPosition$1;->invoke(II)[I

    move-result-object p0

    return-object p0
.end method

.method public final invoke(II)[I
    .locals 10

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    sget v0, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰:I

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-array v0, p2, [I

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 13
    .line 14
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世苏哲兰;

    .line 21
    .line 22
    iget-object v1, v1, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-ltz p1, :cond_1

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;

    .line 30
    .line 31
    iget v3, v1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:I

    .line 32
    .line 33
    if-lt p1, v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v1, p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲(I)Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 41
    .line 42
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 47
    .line 48
    add-int v1, p1, p2

    .line 49
    .line 50
    iget-object v3, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 53
    .line 54
    iget v4, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 55
    .line 56
    sub-int v5, v1, v4

    .line 57
    .line 58
    const/4 v6, 0x2

    .line 59
    const/high16 v7, 0x20000

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    if-ltz v5, :cond_2

    .line 63
    .line 64
    if-ge v5, v7, :cond_2

    .line 65
    .line 66
    add-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    invoke-virtual {p0, v5, v8}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(II)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget-object v5, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v5, [I

    .line 75
    .line 76
    array-length v5, v5

    .line 77
    div-int/2addr v5, v6

    .line 78
    sub-int/2addr v1, v5

    .line 79
    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput v1, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 84
    .line 85
    sub-int/2addr v1, v4

    .line 86
    iget-object v4, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, [I

    .line 89
    .line 90
    if-ltz v1, :cond_4

    .line 91
    .line 92
    array-length v5, v4

    .line 93
    if-ge v1, v5, :cond_3

    .line 94
    .line 95
    array-length v5, v4

    .line 96
    invoke-static {v8, v1, v5, v4, v4}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲苏兰楪(III[I[I)V

    .line 97
    .line 98
    .line 99
    :cond_3
    iget-object v4, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, [I

    .line 102
    .line 103
    array-length v5, v4

    .line 104
    sub-int/2addr v5, v1

    .line 105
    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    iget-object v5, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v5, [I

    .line 112
    .line 113
    array-length v5, v5

    .line 114
    invoke-static {v4, v1, v5, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    neg-int v1, v1

    .line 119
    array-length v5, v4

    .line 120
    add-int/2addr v5, v1

    .line 121
    if-ge v5, v7, :cond_5

    .line 122
    .line 123
    array-length v4, v4

    .line 124
    add-int/2addr v4, v1

    .line 125
    add-int/lit8 v4, v4, 0x1

    .line 126
    .line 127
    invoke-virtual {p0, v4, v1}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(II)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    array-length v5, v4

    .line 132
    if-ge v1, v5, :cond_6

    .line 133
    .line 134
    array-length v5, v4

    .line 135
    sub-int/2addr v5, v1

    .line 136
    invoke-static {v1, v8, v5, v4, v4}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲苏兰楪(III[I[I)V

    .line 137
    .line 138
    .line 139
    :cond_6
    iget-object v4, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, [I

    .line 142
    .line 143
    array-length v5, v4

    .line 144
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-static {v4, v8, v1, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 149
    .line 150
    .line 151
    :goto_1
    invoke-virtual {v3}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_19

    .line 156
    .line 157
    invoke-virtual {v3}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_18

    .line 162
    .line 163
    iget v1, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 164
    .line 165
    const/4 v2, -0x1

    .line 166
    if-lt p1, v1, :cond_8

    .line 167
    .line 168
    iget-object v3, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v3, [I

    .line 171
    .line 172
    array-length v4, v3

    .line 173
    add-int/2addr v4, v1

    .line 174
    if-lt p1, v4, :cond_7

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_7
    sub-int v1, p1, v1

    .line 178
    .line 179
    aget v1, v3, v1

    .line 180
    .line 181
    add-int/lit8 v1, v1, -0x1

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_8
    :goto_2
    move v1, v2

    .line 185
    :goto_3
    const/4 v3, -0x2

    .line 186
    if-eq v1, v3, :cond_a

    .line 187
    .line 188
    if-eq v1, v2, :cond_a

    .line 189
    .line 190
    if-ltz v1, :cond_9

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    const-string v5, "Expected positive lane number, got "

    .line 196
    .line 197
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v5, " instead."

    .line 204
    .line 205
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v4}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :goto_4
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    :cond_a
    add-int/lit8 v1, v8, -0x1

    .line 220
    .line 221
    move v4, p1

    .line 222
    :goto_5
    if-ge v2, v1, :cond_11

    .line 223
    .line 224
    add-int/lit8 v4, v4, -0x1

    .line 225
    .line 226
    :goto_6
    if-ge v2, v4, :cond_e

    .line 227
    .line 228
    iget v5, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 229
    .line 230
    if-lt v4, v5, :cond_c

    .line 231
    .line 232
    iget-object v7, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v7, [I

    .line 235
    .line 236
    array-length v9, v7

    .line 237
    add-int/2addr v9, v5

    .line 238
    if-lt v4, v9, :cond_b

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_b
    sub-int v5, v4, v5

    .line 242
    .line 243
    aget v5, v7, v5

    .line 244
    .line 245
    add-int/lit8 v5, v5, -0x1

    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_c
    :goto_7
    move v5, v2

    .line 249
    :goto_8
    if-eq v5, v1, :cond_f

    .line 250
    .line 251
    if-eq v5, v2, :cond_f

    .line 252
    .line 253
    if-ne v5, v3, :cond_d

    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_d
    add-int/lit8 v4, v4, -0x1

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_e
    move v4, v2

    .line 260
    :cond_f
    :goto_9
    aput v4, v0, v1

    .line 261
    .line 262
    if-ne v4, v2, :cond_10

    .line 263
    .line 264
    invoke-static {v0, v2, v1, v6}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏楪兰世哲([IIII)V

    .line 265
    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_10
    add-int/lit8 v1, v1, -0x1

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_11
    :goto_a
    aput p1, v0, v8

    .line 272
    .line 273
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 274
    .line 275
    if-ge v8, p2, :cond_17

    .line 276
    .line 277
    add-int/lit8 p1, p1, 0x1

    .line 278
    .line 279
    iget v1, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 280
    .line 281
    iget-object v4, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v4, [I

    .line 284
    .line 285
    array-length v4, v4

    .line 286
    add-int/2addr v1, v4

    .line 287
    :goto_c
    iget v4, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 288
    .line 289
    if-ge p1, v1, :cond_15

    .line 290
    .line 291
    if-lt p1, v4, :cond_13

    .line 292
    .line 293
    iget-object v5, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v5, [I

    .line 296
    .line 297
    array-length v6, v5

    .line 298
    add-int/2addr v6, v4

    .line 299
    if-lt p1, v6, :cond_12

    .line 300
    .line 301
    goto :goto_d

    .line 302
    :cond_12
    sub-int v4, p1, v4

    .line 303
    .line 304
    aget v4, v5, v4

    .line 305
    .line 306
    add-int/lit8 v4, v4, -0x1

    .line 307
    .line 308
    goto :goto_e

    .line 309
    :cond_13
    :goto_d
    move v4, v2

    .line 310
    :goto_e
    if-eq v4, v8, :cond_16

    .line 311
    .line 312
    if-eq v4, v2, :cond_16

    .line 313
    .line 314
    if-ne v4, v3, :cond_14

    .line 315
    .line 316
    goto :goto_f

    .line 317
    :cond_14
    add-int/lit8 p1, p1, 0x1

    .line 318
    .line 319
    goto :goto_c

    .line 320
    :cond_15
    iget-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast p1, [I

    .line 323
    .line 324
    array-length p1, p1

    .line 325
    add-int/2addr v4, p1

    .line 326
    move p1, v4

    .line 327
    :cond_16
    :goto_f
    aput p1, v0, v8

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_17
    return-object v0

    .line 331
    :cond_18
    invoke-virtual {v3}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->last()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 339
    .line 340
    .line 341
    return-object v2

    .line 342
    :cond_19
    invoke-virtual {v3}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->first()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 350
    .line 351
    .line 352
    return-object v2
.end method
