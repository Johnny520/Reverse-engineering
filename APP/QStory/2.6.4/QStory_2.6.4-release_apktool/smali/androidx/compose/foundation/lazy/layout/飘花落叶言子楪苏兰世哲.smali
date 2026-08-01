.class public abstract Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;IIIL飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 28

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v3, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    .line 13
    .line 14
    iget v4, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    .line 27
    .line 28
    invoke-direct {v3, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v5, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v11, 0x1

    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    if-eq v5, v11, :cond_2

    .line 44
    .line 45
    if-ne v5, v8, :cond_1

    .line 46
    .line 47
    iget v0, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .line 48
    .line 49
    iget v1, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .line 50
    .line 51
    iget-object v3, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;

    .line 54
    .line 55
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_10

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v9

    .line 66
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$3:I

    .line 67
    .line 68
    iget v1, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$2:F

    .line 69
    .line 70
    iget v5, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$1:F

    .line 71
    .line 72
    iget v12, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$0:F

    .line 73
    .line 74
    iget v13, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$2:I

    .line 75
    .line 76
    iget v14, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .line 77
    .line 78
    iget v15, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .line 79
    .line 80
    iget-object v10, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v10, Lkotlin/jvm/internal/Ref$IntRef;

    .line 83
    .line 84
    iget-object v8, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 87
    .line 88
    iget-object v9, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v9, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 91
    .line 92
    iget-object v6, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v6, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;

    .line 95
    .line 96
    :try_start_0
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    move/from16 v25, v5

    .line 100
    .line 101
    move/from16 v26, v14

    .line 102
    .line 103
    move-object v5, v3

    .line 104
    move v3, v1

    .line 105
    move v1, v11

    .line 106
    move v11, v13

    .line 107
    :goto_1
    move v2, v15

    .line 108
    goto/16 :goto_9

    .line 109
    .line 110
    :catch_0
    move-exception v0

    .line 111
    move-object v13, v3

    .line 112
    move v7, v14

    .line 113
    goto/16 :goto_c

    .line 114
    .line 115
    :cond_3
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    int-to-float v2, v1

    .line 119
    cmpl-float v2, v2, v7

    .line 120
    .line 121
    if-ltz v2, :cond_4

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    const-string v2, "Index should be non-negative"

    .line 125
    .line 126
    invoke-static {v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    const v2, 0x451c4000    # 2500.0f

    .line 130
    .line 131
    .line 132
    :try_start_1
    invoke-interface {v0, v2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏世楪哲兰(F)F

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    const v5, 0x44bb8000    # 1500.0f

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v5}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏世楪哲兰(F)F

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    const/high16 v6, 0x42480000    # 50.0f

    .line 144
    .line 145
    invoke-interface {v0, v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏世楪哲兰(F)F

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    new-instance v6, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 150
    .line 151
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-boolean v11, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 155
    .line 156
    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 157
    .line 158
    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 159
    .line 160
    .line 161
    const/16 v9, 0x1e

    .line 162
    .line 163
    invoke-static {v7, v7, v9}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    iput-object v10, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-static/range {p0 .. p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰世哲(Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;I)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-nez v9, :cond_c

    .line 174
    .line 175
    invoke-interface/range {p0 .. p0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()I

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    if-le v1, v9, :cond_5

    .line 180
    .line 181
    move v9, v11

    .line 182
    goto :goto_3

    .line 183
    :cond_5
    const/4 v9, 0x0

    .line 184
    :goto_3
    new-instance v10, Lkotlin/jvm/internal/Ref$IntRef;

    .line 185
    .line 186
    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 187
    .line 188
    .line 189
    iput v11, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_1
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_1 .. :try_end_1} :catch_8

    .line 190
    .line 191
    move/from16 v26, p2

    .line 192
    .line 193
    move/from16 v25, p3

    .line 194
    .line 195
    move v12, v2

    .line 196
    move/from16 v23, v5

    .line 197
    .line 198
    move v2, v1

    .line 199
    move-object v5, v3

    .line 200
    move-object/from16 v1, p0

    .line 201
    .line 202
    move v3, v0

    .line 203
    move v0, v9

    .line 204
    :goto_4
    move-object/from16 v24, v10

    .line 205
    .line 206
    :try_start_2
    iget-boolean v9, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 207
    .line 208
    if-eqz v9, :cond_f

    .line 209
    .line 210
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏()I

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    if-lez v9, :cond_f

    .line 215
    .line 216
    invoke-interface {v1, v2}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲(I)I

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    add-int v9, v9, v26

    .line 221
    .line 222
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    .line 223
    .line 224
    .line 225
    move-result v10
    :try_end_2
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_2 .. :try_end_2} :catch_6

    .line 226
    int-to-float v10, v10

    .line 227
    cmpg-float v10, v10, v12

    .line 228
    .line 229
    if-gez v10, :cond_7

    .line 230
    .line 231
    int-to-float v9, v9

    .line 232
    :try_start_3
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    invoke-static {v9, v3}, Ljava/lang/Math;->max(FF)F

    .line 237
    .line 238
    .line 239
    move-result v9
    :try_end_3
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_3 .. :try_end_3} :catch_1

    .line 240
    if-eqz v0, :cond_6

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_6
    neg-float v9, v9

    .line 244
    goto :goto_6

    .line 245
    :catch_1
    move-exception v0

    .line 246
    move-object v6, v1

    .line 247
    :goto_5
    move v15, v2

    .line 248
    move-object v13, v5

    .line 249
    move/from16 v7, v26

    .line 250
    .line 251
    goto/16 :goto_c

    .line 252
    .line 253
    :cond_7
    if-eqz v0, :cond_8

    .line 254
    .line 255
    move v9, v12

    .line 256
    goto :goto_6

    .line 257
    :cond_8
    neg-float v9, v12

    .line 258
    :goto_6
    :try_start_4
    iget-object v10, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v10, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 261
    .line 262
    const/16 v13, 0x1e

    .line 263
    .line 264
    invoke-static {v10, v7, v7, v13}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    iput-object v10, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 269
    .line 270
    new-instance v20, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 271
    .line 272
    invoke-direct/range {v20 .. v20}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 273
    .line 274
    .line 275
    iget-object v10, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v10, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;
    :try_end_4
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_4 .. :try_end_4} :catch_6

    .line 278
    .line 279
    :try_start_5
    new-instance v13, Ljava/lang/Float;

    .line 280
    .line 281
    invoke-direct {v13, v9}, Ljava/lang/Float;-><init>(F)V
    :try_end_5
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_5 .. :try_end_5} :catch_7

    .line 282
    .line 283
    .line 284
    :try_start_6
    iget-object v14, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v14, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 287
    .line 288
    invoke-virtual {v14}, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    check-cast v14, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    cmpg-float v14, v14, v7

    .line 299
    .line 300
    if-nez v14, :cond_9

    .line 301
    .line 302
    move v14, v11

    .line 303
    goto :goto_7

    .line 304
    :cond_9
    const/4 v14, 0x0

    .line 305
    :goto_7
    xor-int/2addr v14, v11

    .line 306
    if-eqz v0, :cond_a

    .line 307
    .line 308
    move/from16 v22, v11

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_a
    const/16 v22, 0x0

    .line 312
    .line 313
    :goto_8
    new-instance v16, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏兰楪;
    :try_end_6
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_6 .. :try_end_6} :catch_6

    .line 314
    .line 315
    move-object/from16 v17, v1

    .line 316
    .line 317
    move/from16 v18, v2

    .line 318
    .line 319
    move-object/from16 v21, v6

    .line 320
    .line 321
    move-object/from16 v27, v8

    .line 322
    .line 323
    move/from16 v19, v9

    .line 324
    .line 325
    :try_start_7
    invoke-direct/range {v16 .. v27}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏兰楪;-><init>(Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;IFLkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;IILkotlin/jvm/internal/Ref$ObjectRef;)V
    :try_end_7
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_7 .. :try_end_7} :catch_5

    .line 326
    .line 327
    .line 328
    move-object/from16 v6, v17

    .line 329
    .line 330
    move/from16 v15, v18

    .line 331
    .line 332
    move-object/from16 v9, v21

    .line 333
    .line 334
    move/from16 v1, v23

    .line 335
    .line 336
    move-object/from16 v2, v24

    .line 337
    .line 338
    move/from16 v11, v25

    .line 339
    .line 340
    move/from16 v7, v26

    .line 341
    .line 342
    move-object/from16 v8, v27

    .line 343
    .line 344
    :try_start_8
    iput-object v6, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v9, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v8, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v2, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    .line 351
    .line 352
    iput v15, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .line 353
    .line 354
    iput v7, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .line 355
    .line 356
    iput v11, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$2:I

    .line 357
    .line 358
    iput v12, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$0:F

    .line 359
    .line 360
    iput v1, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$1:F

    .line 361
    .line 362
    iput v3, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$2:F

    .line 363
    .line 364
    iput v0, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$3:I

    .line 365
    .line 366
    move/from16 v25, v1

    .line 367
    .line 368
    const/4 v1, 0x1

    .line 369
    iput v1, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I
    :try_end_8
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_8 .. :try_end_8} :catch_4

    .line 370
    .line 371
    const/16 v18, 0x0

    .line 372
    .line 373
    const/16 v22, 0x2

    .line 374
    .line 375
    move-object/from16 v21, v5

    .line 376
    .line 377
    move-object/from16 v17, v13

    .line 378
    .line 379
    move/from16 v19, v14

    .line 380
    .line 381
    move-object/from16 v20, v16

    .line 382
    .line 383
    move-object/from16 v16, v10

    .line 384
    .line 385
    :try_start_9
    invoke-static/range {v16 .. v22}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;Ljava/lang/Object;Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v5
    :try_end_9
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_9 .. :try_end_9} :catch_3

    .line 389
    if-ne v5, v4, :cond_b

    .line 390
    .line 391
    goto/16 :goto_f

    .line 392
    .line 393
    :cond_b
    move-object v10, v2

    .line 394
    move/from16 v26, v7

    .line 395
    .line 396
    move-object/from16 v5, v21

    .line 397
    .line 398
    goto/16 :goto_1

    .line 399
    .line 400
    :goto_9
    :try_start_a
    iget v7, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 401
    .line 402
    add-int/2addr v7, v1

    .line 403
    iput v7, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_a
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_a .. :try_end_a} :catch_2

    .line 404
    .line 405
    move-object v1, v6

    .line 406
    move-object v6, v9

    .line 407
    move/from16 v23, v25

    .line 408
    .line 409
    const/4 v7, 0x0

    .line 410
    move/from16 v25, v11

    .line 411
    .line 412
    const/4 v11, 0x1

    .line 413
    goto/16 :goto_4

    .line 414
    .line 415
    :catch_2
    move-exception v0

    .line 416
    goto/16 :goto_5

    .line 417
    .line 418
    :catch_3
    move-exception v0

    .line 419
    :goto_a
    move-object/from16 v13, v21

    .line 420
    .line 421
    goto :goto_c

    .line 422
    :catch_4
    move-exception v0

    .line 423
    move-object/from16 v21, v5

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :catch_5
    move-exception v0

    .line 427
    move-object/from16 v21, v5

    .line 428
    .line 429
    move-object/from16 v6, v17

    .line 430
    .line 431
    move/from16 v15, v18

    .line 432
    .line 433
    :goto_b
    move/from16 v7, v26

    .line 434
    .line 435
    goto :goto_a

    .line 436
    :catch_6
    move-exception v0

    .line 437
    move-object v6, v1

    .line 438
    move v15, v2

    .line 439
    move-object/from16 v21, v5

    .line 440
    .line 441
    goto :goto_b

    .line 442
    :catch_7
    move-exception v0

    .line 443
    move-object v6, v1

    .line 444
    move v15, v2

    .line 445
    move-object/from16 v21, v5

    .line 446
    .line 447
    goto :goto_b

    .line 448
    :catch_8
    move-exception v0

    .line 449
    move-object/from16 v6, p0

    .line 450
    .line 451
    move/from16 v7, p2

    .line 452
    .line 453
    move v15, v1

    .line 454
    move-object v13, v3

    .line 455
    goto :goto_c

    .line 456
    :cond_c
    :try_start_b
    invoke-interface/range {p0 .. p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲(I)I

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    new-instance v2, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;

    .line 461
    .line 462
    iget-object v5, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v5, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 465
    .line 466
    invoke-direct {v2, v0, v5}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;-><init>(ILandroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;)V

    .line 467
    .line 468
    .line 469
    throw v2
    :try_end_b
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_b .. :try_end_b} :catch_8

    .line 470
    :goto_c
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->getPreviousAnimation()Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    const/4 v2, 0x0

    .line 475
    const/16 v9, 0x1e

    .line 476
    .line 477
    invoke-static {v1, v2, v2, v9}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->getItemOffset()I

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    add-int/2addr v0, v7

    .line 486
    int-to-float v0, v0

    .line 487
    new-instance v1, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 488
    .line 489
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 490
    .line 491
    .line 492
    new-instance v9, Ljava/lang/Float;

    .line 493
    .line 494
    invoke-direct {v9, v0}, Ljava/lang/Float;-><init>(F)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v8}, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    check-cast v3, Ljava/lang/Number;

    .line 502
    .line 503
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    cmpg-float v2, v3, v2

    .line 508
    .line 509
    if-nez v2, :cond_d

    .line 510
    .line 511
    const/4 v10, 0x1

    .line 512
    :goto_d
    const/4 v2, 0x1

    .line 513
    goto :goto_e

    .line 514
    :cond_d
    const/4 v10, 0x0

    .line 515
    goto :goto_d

    .line 516
    :goto_e
    xor-int/lit8 v11, v10, 0x1

    .line 517
    .line 518
    new-instance v12, Landroidx/compose/foundation/gestures/飘花落叶言子兰世楪哲苏;

    .line 519
    .line 520
    invoke-direct {v12, v0, v1, v6, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子兰世楪哲苏;-><init>(FLjava/lang/Object;Ljava/lang/Object;I)V

    .line 521
    .line 522
    .line 523
    iput-object v6, v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    .line 524
    .line 525
    const/4 v1, 0x0

    .line 526
    iput-object v1, v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v1, v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v1, v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    .line 531
    .line 532
    iput v15, v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .line 533
    .line 534
    iput v7, v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .line 535
    .line 536
    const/4 v1, 0x2

    .line 537
    iput v1, v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    .line 538
    .line 539
    const/4 v10, 0x0

    .line 540
    const/4 v14, 0x2

    .line 541
    invoke-static/range {v8 .. v14}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;Ljava/lang/Object;Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    if-ne v0, v4, :cond_e

    .line 546
    .line 547
    :goto_f
    return-object v4

    .line 548
    :cond_e
    move-object v3, v6

    .line 549
    move v0, v7

    .line 550
    move v1, v15

    .line 551
    :goto_10
    invoke-interface {v3, v1, v0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏兰哲(II)V

    .line 552
    .line 553
    .line 554
    :cond_f
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 555
    .line 556
    return-object v0
.end method

.method public static final 飘花落叶言子楪世兰苏哲(ILandroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)I
    .locals 5

    .line 1
    iget v0, p1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    sub-int v2, v0, v1

    .line 9
    .line 10
    div-int/lit8 v2, v2, 0x2

    .line 11
    .line 12
    add-int/2addr v2, v1

    .line 13
    iget-object v3, p1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object v4, v3, v2

    .line 16
    .line 17
    check-cast v4, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    iget v4, v4, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 20
    .line 21
    if-ne v4, p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    if-ge v4, p0, :cond_2

    .line 25
    .line 26
    add-int/lit8 v1, v2, 0x1

    .line 27
    .line 28
    aget-object v3, v3, v1

    .line 29
    .line 30
    check-cast v3, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;

    .line 31
    .line 32
    iget v3, v3, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 33
    .line 34
    if-ge p0, v3, :cond_0

    .line 35
    .line 36
    :goto_1
    return v2

    .line 37
    :cond_2
    add-int/lit8 v0, v2, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    return v1
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 6

    .line 1
    check-cast p4, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, 0x55d242fd

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p4, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p5

    .line 19
    invoke-virtual {p4, p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v1, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v1

    .line 31
    invoke-virtual {p4, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    const/16 v1, 0x100

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/16 v1, 0x80

    .line 41
    .line 42
    :goto_2
    or-int/2addr v0, v1

    .line 43
    invoke-virtual {p4, p3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/16 v1, 0x800

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    const/16 v1, 0x400

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    and-int/lit16 v1, v0, 0x493

    .line 56
    .line 57
    const/16 v2, 0x492

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    if-eq v1, v2, :cond_4

    .line 61
    .line 62
    move v1, v3

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    const/4 v1, 0x0

    .line 65
    :goto_4
    and-int/2addr v0, v3

    .line 66
    invoke-virtual {p4, v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    move-object v0, p1

    .line 73
    check-cast v0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲苏兰;

    .line 74
    .line 75
    new-instance v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏哲兰世;

    .line 76
    .line 77
    invoke-direct {v1, p2, p0, p3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏哲兰世;-><init>(ILandroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const v2, 0x3a785bde

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v1, p4}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(ILkotlin/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const/16 v2, 0x30

    .line 88
    .line 89
    invoke-interface {v0, p3, v1, p4, v2}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    invoke-virtual {p4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 94
    .line 95
    .line 96
    :goto_5
    invoke-virtual {p4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    if-eqz p4, :cond_6

    .line 101
    .line 102
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪苏哲兰;

    .line 103
    .line 104
    move-object v1, p0

    .line 105
    move-object v2, p1

    .line 106
    move v3, p2

    .line 107
    move-object v4, p3

    .line 108
    move v5, p5

    .line 109
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪苏哲兰;-><init>(Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p4, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 113
    .line 114
    :cond_6
    return-void
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 10

    .line 1
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, -0x2a4a252b

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    and-int/lit8 v3, p2, 0x1

    .line 19
    .line 20
    invoke-virtual {p1, v3, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    sget-object v0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;

    .line 33
    .line 34
    const v4, 0x753e26b5

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世哲兰(I)V

    .line 38
    .line 39
    .line 40
    new-array v4, v2, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    sget-object v6, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 47
    .line 48
    if-ne v5, v6, :cond_1

    .line 49
    .line 50
    new-instance v5, L飘花落叶言世子苏哲楪兰/飘花落叶言楪世苏子哲兰;

    .line 51
    .line 52
    const/16 v7, 0xb

    .line 53
    .line 54
    invoke-direct {v5, v7}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪世苏子哲兰;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    check-cast v5, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    const/16 v7, 0x180

    .line 63
    .line 64
    sget-object v8, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;

    .line 65
    .line 66
    invoke-static {v4, v8, v5, p1, v7}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏([Ljava/lang/Object;L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲兰苏;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;

    .line 77
    .line 78
    iput-object v5, v4, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 81
    .line 82
    .line 83
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    new-instance v7, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;

    .line 88
    .line 89
    invoke-direct {v7, v1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v1, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;

    .line 93
    .line 94
    const/16 v8, 0xc

    .line 95
    .line 96
    invoke-direct {v1, v3, v8, v4}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance v8, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;

    .line 100
    .line 101
    const/16 v9, 0xf

    .line 102
    .line 103
    invoke-direct {v8, v7, v9, v1}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-virtual {p1, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    or-int/2addr v1, v7

    .line 115
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    const/4 v9, 0x3

    .line 120
    if-nez v1, :cond_2

    .line 121
    .line 122
    if-ne v7, v6, :cond_3

    .line 123
    .line 124
    :cond_2
    new-instance v7, Landroidx/activity/compose/飘花落叶言子楪世苏兰哲;

    .line 125
    .line 126
    invoke-direct {v7, v3, v9, v4}, Landroidx/activity/compose/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v7}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    check-cast v7, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 133
    .line 134
    invoke-static {v5, v8, v7, p1, v2}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏([Ljava/lang/Object;L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰苏楪哲;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Landroidx/appcompat/widget/飘花落叶言子楪兰哲苏世;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v2, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;

    .line 145
    .line 146
    invoke-direct {v2, p0, v9, v1}, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    const v1, -0x189b31eb

    .line 150
    .line 151
    .line 152
    invoke-static {v1, v2, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(ILkotlin/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const/16 v2, 0x38

    .line 157
    .line 158
    invoke-static {v0, v1, p1, v2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(Landroidx/appcompat/widget/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 163
    .line 164
    .line 165
    :goto_1
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-eqz p1, :cond_5

    .line 170
    .line 171
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰苏哲楪;

    .line 172
    .line 173
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰苏哲楪;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;I)V

    .line 174
    .line 175
    .line 176
    iput-object v0, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 177
    .line 178
    :cond_5
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v0, p4

    .line 12
    .line 13
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 14
    .line 15
    const v6, 0x340208e3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v6, v5, 0x6

    .line 22
    .line 23
    if-nez v6, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v6, 0x2

    .line 34
    :goto_0
    or-int/2addr v6, v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v6, v5

    .line 37
    :goto_1
    and-int/lit8 v8, v5, 0x30

    .line 38
    .line 39
    if-nez v8, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    const/16 v8, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v8, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v6, v8

    .line 53
    :cond_3
    and-int/lit16 v8, v5, 0x180

    .line 54
    .line 55
    if-nez v8, :cond_5

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_4

    .line 62
    .line 63
    const/16 v8, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v8, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v6, v8

    .line 69
    :cond_5
    and-int/lit16 v8, v5, 0xc00

    .line 70
    .line 71
    if-nez v8, :cond_7

    .line 72
    .line 73
    invoke-virtual {v0, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    const/16 v8, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v8, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v6, v8

    .line 85
    :cond_7
    and-int/lit16 v8, v6, 0x493

    .line 86
    .line 87
    const/16 v9, 0x492

    .line 88
    .line 89
    if-eq v8, v9, :cond_8

    .line 90
    .line 91
    const/4 v8, 0x1

    .line 92
    goto :goto_5

    .line 93
    :cond_8
    const/4 v8, 0x0

    .line 94
    :goto_5
    and-int/lit8 v9, v6, 0x1

    .line 95
    .line 96
    invoke-virtual {v0, v9, v8}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_11

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    or-int/2addr v8, v9

    .line 111
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    sget-object v10, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 116
    .line 117
    if-nez v8, :cond_9

    .line 118
    .line 119
    if-ne v9, v10, :cond_a

    .line 120
    .line 121
    :cond_9
    new-instance v9, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 122
    .line 123
    invoke-direct {v9, v1, v3}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;-><init>(Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_a
    check-cast v9, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 130
    .line 131
    iput v2, v9, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 132
    .line 133
    iget-object v8, v9, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 134
    .line 135
    sget-object v11, Landroidx/compose/ui/layout/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 136
    .line 137
    invoke-virtual {v0, v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    check-cast v12, Landroidx/compose/ui/layout/飘花落叶言子苏世哲兰楪;

    .line 142
    .line 143
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    if-eqz v13, :cond_b

    .line 148
    .line 149
    invoke-virtual {v13}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    goto :goto_6

    .line 154
    :cond_b
    const/4 v15, 0x0

    .line 155
    :goto_6
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    :try_start_0
    move-object/from16 v16, v8

    .line 160
    .line 161
    check-cast v16, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 162
    .line 163
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v16

    .line 167
    move-object/from16 v7, v16

    .line 168
    .line 169
    check-cast v7, Landroidx/compose/ui/layout/飘花落叶言子苏世哲兰楪;

    .line 170
    .line 171
    if-eq v12, v7, :cond_e

    .line 172
    .line 173
    check-cast v8, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 174
    .line 175
    invoke-virtual {v8, v12}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget v7, v9, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 179
    .line 180
    if-lez v7, :cond_e

    .line 181
    .line 182
    iget-object v7, v9, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 183
    .line 184
    if-eqz v7, :cond_c

    .line 185
    .line 186
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :catchall_0
    move-exception v0

    .line 191
    goto :goto_9

    .line 192
    :cond_c
    :goto_7
    if-eqz v12, :cond_d

    .line 193
    .line 194
    move-object v7, v12

    .line 195
    check-cast v7, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 196
    .line 197
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰()Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 198
    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_d
    const/4 v7, 0x0

    .line 202
    :goto_8
    iput-object v7, v9, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    .line 204
    :cond_e
    invoke-static {v13, v14, v15}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    if-nez v7, :cond_f

    .line 216
    .line 217
    if-ne v8, v10, :cond_10

    .line 218
    .line 219
    :cond_f
    new-instance v8, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏兰哲世;

    .line 220
    .line 221
    const/4 v7, 0x2

    .line 222
    invoke-direct {v8, v9, v7}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v8}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_10
    check-cast v8, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 229
    .line 230
    invoke-static {v9, v8, v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v11, v9}, Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Landroidx/appcompat/widget/飘花落叶言子楪兰哲苏世;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    shr-int/lit8 v6, v6, 0x6

    .line 238
    .line 239
    and-int/lit8 v6, v6, 0x70

    .line 240
    .line 241
    const/16 v8, 0x8

    .line 242
    .line 243
    or-int/2addr v6, v8

    .line 244
    invoke-static {v7, v4, v0, v6}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(Landroidx/appcompat/widget/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 245
    .line 246
    .line 247
    goto :goto_a

    .line 248
    :goto_9
    invoke-static {v13, v14, v15}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :cond_11
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 253
    .line 254
    .line 255
    :goto_a
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    if-eqz v6, :cond_12

    .line 260
    .line 261
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪兰哲;

    .line 262
    .line 263
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪兰哲;-><init>(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;I)V

    .line 264
    .line 265
    .line 266
    iput-object v0, v6, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 267
    .line 268
    :cond_12
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏兰哲楪;Landroidx/compose/foundation/lazy/飘花落叶言子楪哲苏世兰;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 6

    .line 1
    check-cast p4, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, 0x3ee63d6d

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p4, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p5

    .line 19
    invoke-virtual {p4, p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v1, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v1

    .line 31
    invoke-virtual {p4, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    const/16 v1, 0x100

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/16 v1, 0x80

    .line 41
    .line 42
    :goto_2
    or-int/2addr v0, v1

    .line 43
    invoke-virtual {p4, p3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/16 v1, 0x800

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    const/16 v1, 0x400

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    and-int/lit16 v1, v0, 0x493

    .line 56
    .line 57
    const/16 v2, 0x492

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    if-eq v1, v2, :cond_4

    .line 61
    .line 62
    move v1, v3

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    const/4 v1, 0x0

    .line 65
    :goto_4
    and-int/2addr v0, v3

    .line 66
    invoke-virtual {p4, v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    invoke-static {p0, p4}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪苏兰哲;

    .line 77
    .line 78
    invoke-direct {v1, p2, p1, p3, v0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪苏兰哲;-><init>(Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏兰哲楪;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/lazy/飘花落叶言子楪哲苏世兰;Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;)V

    .line 79
    .line 80
    .line 81
    const v0, -0x379ecb6b

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1, p4}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(ILkotlin/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const/4 v1, 0x6

    .line 89
    invoke-static {v0, p4, v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    invoke-virtual {p4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 94
    .line 95
    .line 96
    :goto_5
    invoke-virtual {p4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    if-eqz p4, :cond_6

    .line 101
    .line 102
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪哲苏兰;

    .line 103
    .line 104
    move-object v1, p0

    .line 105
    move-object v2, p1

    .line 106
    move-object v3, p2

    .line 107
    move-object v4, p3

    .line 108
    move v5, p5

    .line 109
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪哲苏兰;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏兰哲楪;Landroidx/compose/foundation/lazy/飘花落叶言子楪哲苏世兰;I)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p4, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 113
    .line 114
    :cond_6
    return-void
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Lkotlin/reflect/飘花落叶言子楪兰世哲苏;Landroidx/compose/foundation/lazy/飘花落叶言子楪世兰苏哲;Landroidx/compose/foundation/gestures/Orientation;Z)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲兰楪苏;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲兰楪苏;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/lazy/飘花落叶言子楪世兰苏哲;Landroidx/compose/foundation/gestures/Orientation;Z)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世兰哲()Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(ZLandroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;II)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-le p0, p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ne p0, p2, :cond_3

    .line 15
    .line 16
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-le p0, p3, :cond_3

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-ge p0, p2, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-ne p0, p2, :cond_3

    .line 35
    .line 36
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-ge p0, p3, :cond_3

    .line 41
    .line 42
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_3
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;I)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-gt p1, p0, :cond_0

    .line 11
    .line 12
    if-gt v0, p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    return v1
.end method

.method public static final 飘花落叶言子楪苏兰哲世(Landroidx/compose/foundation/lazy/飘花落叶言子楪世兰哲苏;Landroidx/compose/foundation/gestures/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏哲兰世;-><init>(Landroidx/compose/foundation/lazy/飘花落叶言子楪世兰哲苏;Landroidx/compose/foundation/gestures/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/gestures/Orientation;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final 飘花落叶言子楪苏哲世兰(ILandroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;Ljava/lang/Object;)I
    .locals 1

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ge p0, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p2, -0x1

    .line 34
    if-eq p1, p2, :cond_2

    .line 35
    .line 36
    return p1

    .line 37
    :cond_2
    :goto_0
    return p0
.end method


# virtual methods
.method public 飘花落叶言子楪苏哲兰世(I)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲(I)Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 10
    .line 11
    sub-int v0, p1, v0

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p0, v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object p0

    .line 33
    :cond_1
    :goto_0
    new-instance p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    .line 34
    .line 35
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;-><init>(I)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method
