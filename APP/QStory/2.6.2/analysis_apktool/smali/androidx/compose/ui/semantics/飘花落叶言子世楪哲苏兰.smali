.class public abstract Landroidx/compose/ui/semantics/飘花落叶言子世楪哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Ljava/util/Comparator;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v0, :cond_1

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    sget-object v4, Landroidx/compose/ui/semantics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Landroidx/compose/ui/semantics/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object v4, Landroidx/compose/ui/semantics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/semantics/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    :goto_1
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲世楪兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    new-instance v6, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏哲兰;

    .line 18
    .line 19
    invoke-direct {v6, v4, v5}, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏哲兰;-><init>(Ljava/util/Comparator;Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏兰哲;

    .line 23
    .line 24
    invoke-direct {v4, v6, v2}, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    aput-object v4, v1, v3

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sput-object v1, Landroidx/compose/ui/semantics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:[Ljava/util/Comparator;

    .line 33
    .line 34
    sget-object v0, Landroidx/compose/ui/semantics/SemanticsSortKt$UnmergedConfigComparator$1;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsSortKt$UnmergedConfigComparator$1;

    .line 35
    .line 36
    sput-object v0, Landroidx/compose/ui/semantics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 37
    .line 38
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    sget-object v1, Landroidx/collection/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子世楪兰苏哲;

    .line 4
    .line 5
    new-instance v1, Landroidx/collection/飘花落叶言子世楪兰苏哲;

    .line 6
    .line 7
    invoke-direct {v1}, Landroidx/collection/飘花落叶言子世楪兰苏哲;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v5, 0x0

    .line 20
    :goto_0
    if-ge v5, v3, :cond_0

    .line 21
    .line 22
    move-object/from16 v6, p3

    .line 23
    .line 24
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    check-cast v7, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 29
    .line 30
    move-object/from16 v8, p1

    .line 31
    .line 32
    invoke-static {v7, v2, v8, v0, v1}, Landroidx/compose/ui/semantics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;Ljava/util/ArrayList;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Landroidx/collection/飘花落叶言子世楪兰苏哲;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object/from16 v5, p0

    .line 39
    .line 40
    iget-object v3, v5, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 41
    .line 42
    iget-object v3, v3, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰苏楪:Landroidx/compose/ui/unit/LayoutDirection;

    .line 43
    .line 44
    sget-object v5, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    if-ne v3, v5, :cond_1

    .line 48
    .line 49
    move v3, v6

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v3, 0x0

    .line 52
    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    div-int/lit8 v7, v7, 0x2

    .line 59
    .line 60
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    sub-int/2addr v7, v6

    .line 68
    if-ltz v7, :cond_7

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    :goto_2
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    check-cast v9, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 76
    .line 77
    if-eqz v8, :cond_5

    .line 78
    .line 79
    invoke-virtual {v9}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲()L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    iget v10, v10, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 84
    .line 85
    invoke-virtual {v9}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲()L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    iget v11, v11, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 90
    .line 91
    cmpl-float v12, v10, v11

    .line 92
    .line 93
    if-ltz v12, :cond_2

    .line 94
    .line 95
    move v12, v6

    .line 96
    goto :goto_3

    .line 97
    :cond_2
    const/4 v12, 0x0

    .line 98
    :goto_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    sub-int/2addr v13, v6

    .line 103
    if-ltz v13, :cond_5

    .line 104
    .line 105
    const/4 v14, 0x0

    .line 106
    :goto_4
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v15

    .line 110
    check-cast v15, Lkotlin/Pair;

    .line 111
    .line 112
    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v15

    .line 116
    check-cast v15, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 117
    .line 118
    move/from16 p0, v6

    .line 119
    .line 120
    iget v6, v15, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 121
    .line 122
    iget v4, v15, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 123
    .line 124
    cmpl-float v16, v6, v4

    .line 125
    .line 126
    if-ltz v16, :cond_3

    .line 127
    .line 128
    move/from16 v16, p0

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_3
    const/16 v16, 0x0

    .line 132
    .line 133
    :goto_5
    if-nez v12, :cond_4

    .line 134
    .line 135
    if-nez v16, :cond_4

    .line 136
    .line 137
    invoke-static {v10, v6}, Ljava/lang/Math;->max(FF)F

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    invoke-static {v11, v4}, Ljava/lang/Math;->min(FF)F

    .line 142
    .line 143
    .line 144
    move-result v16

    .line 145
    cmpg-float v6, v6, v16

    .line 146
    .line 147
    if-gez v6, :cond_4

    .line 148
    .line 149
    new-instance v6, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 150
    .line 151
    iget v12, v15, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 152
    .line 153
    const/4 v13, 0x0

    .line 154
    invoke-static {v12, v13}, Ljava/lang/Math;->max(FF)F

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    iget v13, v15, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 159
    .line 160
    invoke-static {v13, v10}, Ljava/lang/Math;->max(FF)F

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    iget v13, v15, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 165
    .line 166
    const/high16 v15, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 167
    .line 168
    invoke-static {v13, v15}, Ljava/lang/Math;->min(FF)F

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    invoke-static {v4, v11}, Ljava/lang/Math;->min(FF)F

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-direct {v6, v12, v10, v13, v4}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;-><init>(FFFF)V

    .line 177
    .line 178
    .line 179
    new-instance v4, Lkotlin/Pair;

    .line 180
    .line 181
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    check-cast v10, Lkotlin/Pair;

    .line 186
    .line 187
    invoke-virtual {v10}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-direct {v4, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5, v14, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    check-cast v4, Lkotlin/Pair;

    .line 202
    .line 203
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    check-cast v4, Ljava/util/List;

    .line 208
    .line 209
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_4
    if-eq v14, v13, :cond_6

    .line 214
    .line 215
    add-int/lit8 v14, v14, 0x1

    .line 216
    .line 217
    move/from16 v6, p0

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_5
    move/from16 p0, v6

    .line 221
    .line 222
    :cond_6
    invoke-virtual {v9}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲()L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    new-instance v6, Lkotlin/Pair;

    .line 227
    .line 228
    filled-new-array {v9}, [Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-static {v9}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲兰苏([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    invoke-direct {v6, v4, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    :goto_6
    if-eq v8, v7, :cond_8

    .line 243
    .line 244
    add-int/lit8 v8, v8, 0x1

    .line 245
    .line 246
    move/from16 v6, p0

    .line 247
    .line 248
    goto/16 :goto_2

    .line 249
    .line 250
    :cond_7
    move/from16 p0, v6

    .line 251
    .line 252
    :cond_8
    sget-object v2, Landroidx/compose/ui/semantics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/semantics/飘花落叶言子楪世兰哲苏;

    .line 253
    .line 254
    invoke-static {v5, v2}, Lkotlin/collections/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏楪兰(Ljava/util/List;Ljava/util/Comparator;)V

    .line 255
    .line 256
    .line 257
    new-instance v2, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 260
    .line 261
    .line 262
    sget-object v4, Landroidx/compose/ui/semantics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:[Ljava/util/Comparator;

    .line 263
    .line 264
    xor-int/lit8 v3, v3, 0x1

    .line 265
    .line 266
    aget-object v3, v4, v3

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    const/4 v6, 0x0

    .line 273
    :goto_7
    if-ge v6, v4, :cond_9

    .line 274
    .line 275
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    check-cast v7, Lkotlin/Pair;

    .line 280
    .line 281
    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    check-cast v8, Ljava/util/List;

    .line 286
    .line 287
    invoke-static {v8, v3}, Lkotlin/collections/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏楪兰(Ljava/util/List;Ljava/util/Comparator;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    check-cast v7, Ljava/util/Collection;

    .line 295
    .line 296
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 297
    .line 298
    .line 299
    add-int/lit8 v6, v6, 0x1

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_9
    new-instance v3, Landroidx/compose/ui/semantics/飘花落叶言子楪兰哲苏世;

    .line 303
    .line 304
    sget-object v4, Landroidx/compose/ui/semantics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 305
    .line 306
    const/4 v5, 0x0

    .line 307
    invoke-direct {v3, v4, v5}, Landroidx/compose/ui/semantics/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 308
    .line 309
    .line 310
    invoke-static {v2, v3}, Lkotlin/collections/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏楪兰(Ljava/util/List;Ljava/util/Comparator;)V

    .line 311
    .line 312
    .line 313
    move v4, v5

    .line 314
    :goto_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    add-int/lit8 v3, v3, -0x1

    .line 319
    .line 320
    if-gt v4, v3, :cond_c

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    check-cast v3, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 327
    .line 328
    iget v3, v3, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:I

    .line 329
    .line 330
    invoke-virtual {v1, v3}, Landroidx/collection/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    check-cast v3, Ljava/util/List;

    .line 335
    .line 336
    if-eqz v3, :cond_b

    .line 337
    .line 338
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-interface {v0, v5}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    check-cast v5, Ljava/lang/Boolean;

    .line 347
    .line 348
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    if-nez v5, :cond_a

    .line 353
    .line 354
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 359
    .line 360
    :goto_9
    invoke-virtual {v2, v4, v3}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 361
    .line 362
    .line 363
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    add-int/2addr v4, v3

    .line 368
    goto :goto_8

    .line 369
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_c
    return-object v2
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;Ljava/util/ArrayList;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Landroidx/collection/飘花落叶言子世楪兰苏哲;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/semantics/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲世兰苏:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/ui/semantics/SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p3, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    :cond_1
    invoke-interface {p2, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_2
    const/4 v1, 0x7

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget p1, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:I

    .line 58
    .line 59
    invoke-static {v1, p0}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲兰世(ILandroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {p0, p2, p3, v0}, Landroidx/compose/ui/semantics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Ljava/util/List;)Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p4, p1, p0}, Landroidx/collection/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    invoke-static {v1, p0}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲兰世(ILandroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v1, 0x0

    .line 80
    :goto_0
    if-ge v1, v0, :cond_4

    .line 81
    .line 82
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 87
    .line 88
    invoke-static {v2, p1, p2, p3, p4}, Landroidx/compose/ui/semantics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;Ljava/util/ArrayList;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Landroidx/collection/飘花落叶言子世楪兰苏哲;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    return-void
.end method
