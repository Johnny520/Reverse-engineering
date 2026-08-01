.class public abstract Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/high16 v0, 0x3e000000    # 0.125f

    .line 2
    .line 3
    const/high16 v1, 0x41900000    # 18.0f

    .line 4
    .line 5
    div-float/2addr v0, v1

    .line 6
    sput v0, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:F

    .line 7
    .line 8
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JILandroidx/compose/foundation/gestures/飘花落叶言子世哲兰楪苏;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 34
    .line 35
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    const/4 v8, 0x2

    .line 38
    const/4 v9, 0x1

    .line 39
    const/4 v10, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v9, :cond_2

    .line 43
    .line 44
    if-ne v5, v8, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 55
    .line 56
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v12, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v12, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    iget-object v13, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v13, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 p5, v11

    .line 72
    .line 73
    move v11, v0

    .line 74
    move-object v0, v12

    .line 75
    move-object/from16 v12, p5

    .line 76
    .line 77
    move-object/from16 p5, v5

    .line 78
    .line 79
    move-object v5, v3

    .line 80
    move-object/from16 v3, p5

    .line 81
    .line 82
    move v15, v8

    .line 83
    move v2, v9

    .line 84
    move-object/from16 p5, v10

    .line 85
    .line 86
    move-wide v7, v6

    .line 87
    goto/16 :goto_a

    .line 88
    .line 89
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 90
    .line 91
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v10

    .line 95
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->F$0:F

    .line 96
    .line 97
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 100
    .line 101
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 104
    .line 105
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 108
    .line 109
    iget-object v12, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v12, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 112
    .line 113
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object/from16 v17, v11

    .line 117
    .line 118
    move v11, v0

    .line 119
    move-object/from16 v0, v17

    .line 120
    .line 121
    move-object/from16 v17, v3

    .line 122
    .line 123
    move-object v3, v1

    .line 124
    move-object v1, v12

    .line 125
    move-object v12, v5

    .line 126
    :goto_1
    move-object/from16 v5, v17

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 133
    .line 134
    move-object/from16 v5, p0

    .line 135
    .line 136
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 137
    .line 138
    iget-object v5, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 139
    .line 140
    iget-object v5, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 141
    .line 142
    invoke-static {v5, v0, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_4

    .line 147
    .line 148
    move-object/from16 p5, v10

    .line 149
    .line 150
    goto/16 :goto_b

    .line 151
    .line 152
    :cond_4
    move-object/from16 v5, p0

    .line 153
    .line 154
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 155
    .line 156
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    move/from16 v11, p3

    .line 161
    .line 162
    invoke-static {v5, v11}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;I)F

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 167
    .line 168
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-wide v0, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 172
    .line 173
    new-instance v0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 174
    .line 175
    invoke-direct {v0, v6, v7, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;-><init>(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 176
    .line 177
    .line 178
    move-object/from16 v1, p4

    .line 179
    .line 180
    move-object v2, v0

    .line 181
    move-object/from16 v0, p0

    .line 182
    .line 183
    :goto_2
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 192
    .line 193
    iput v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->F$0:F

    .line 194
    .line 195
    iput v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 196
    .line 197
    invoke-static {v0, v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    if-ne v12, v4, :cond_5

    .line 202
    .line 203
    goto/16 :goto_9

    .line 204
    .line 205
    :cond_5
    move-object/from16 v17, v3

    .line 206
    .line 207
    move-object v3, v2

    .line 208
    move-object v2, v12

    .line 209
    move-object v12, v11

    .line 210
    move v11, v5

    .line 211
    goto :goto_1

    .line 212
    :goto_3
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 213
    .line 214
    iget-object v13, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    move-object/from16 p5, v10

    .line 221
    .line 222
    const/4 v10, 0x0

    .line 223
    :goto_4
    if-ge v10, v14, :cond_7

    .line 224
    .line 225
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v16

    .line 229
    move-object/from16 v15, v16

    .line 230
    .line 231
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 232
    .line 233
    iget-wide v6, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 234
    .line 235
    iget-wide v8, v12, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 236
    .line 237
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    if-eqz v6, :cond_6

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 245
    .line 246
    const-wide/16 v6, 0x0

    .line 247
    .line 248
    const/4 v8, 0x2

    .line 249
    const/4 v9, 0x1

    .line 250
    goto :goto_4

    .line 251
    :cond_7
    move-object/from16 v16, p5

    .line 252
    .line 253
    :goto_5
    move-object/from16 v6, v16

    .line 254
    .line 255
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 256
    .line 257
    if-nez v6, :cond_8

    .line 258
    .line 259
    goto/16 :goto_b

    .line 260
    .line 261
    :cond_8
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_9

    .line 266
    .line 267
    goto/16 :goto_b

    .line 268
    .line 269
    :cond_9
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    if-eqz v7, :cond_d

    .line 274
    .line 275
    iget-object v2, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    const/4 v7, 0x0

    .line 282
    :goto_6
    if-ge v7, v6, :cond_b

    .line 283
    .line 284
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    move-object v9, v8

    .line 289
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 290
    .line 291
    iget-boolean v9, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 292
    .line 293
    if-eqz v9, :cond_a

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_b
    move-object/from16 v8, p5

    .line 300
    .line 301
    :goto_7
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 302
    .line 303
    if-nez v8, :cond_c

    .line 304
    .line 305
    goto/16 :goto_b

    .line 306
    .line 307
    :cond_c
    iget-wide v6, v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 308
    .line 309
    iput-wide v6, v12, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 310
    .line 311
    const/4 v2, 0x1

    .line 312
    const-wide/16 v7, 0x0

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_d
    const/4 v2, 0x1

    .line 316
    invoke-static {v6, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 317
    .line 318
    .line 319
    move-result-wide v7

    .line 320
    invoke-virtual {v3, v11, v7, v8, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(FJZ)J

    .line 321
    .line 322
    .line 323
    move-result-wide v7

    .line 324
    const-wide v9, 0x7fffffff7fffffffL

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    and-long/2addr v9, v7

    .line 330
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    cmp-long v9, v9, v13

    .line 336
    .line 337
    if-eqz v9, :cond_f

    .line 338
    .line 339
    const-wide v9, 0xffffffffL

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    and-long/2addr v7, v9

    .line 345
    long-to-int v7, v7

    .line 346
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    new-instance v8, Ljava/lang/Float;

    .line 351
    .line 352
    invoke-direct {v8, v7}, Ljava/lang/Float;-><init>(F)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v1, v6, v8}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    if-eqz v7, :cond_e

    .line 363
    .line 364
    return-object v6

    .line 365
    :cond_e
    const-wide/16 v7, 0x0

    .line 366
    .line 367
    iput-wide v7, v3, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 368
    .line 369
    :goto_8
    move-object/from16 v10, p5

    .line 370
    .line 371
    move v9, v2

    .line 372
    move-object v2, v3

    .line 373
    move-object v3, v5

    .line 374
    move-wide v6, v7

    .line 375
    move v5, v11

    .line 376
    move-object v11, v12

    .line 377
    const/4 v8, 0x2

    .line 378
    goto/16 :goto_2

    .line 379
    .line 380
    :cond_f
    const-wide/16 v7, 0x0

    .line 381
    .line 382
    sget-object v9, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 383
    .line 384
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v12, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v6, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 393
    .line 394
    iput v11, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->F$0:F

    .line 395
    .line 396
    const/4 v15, 0x2

    .line 397
    iput v15, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 398
    .line 399
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 400
    .line 401
    invoke-virtual {v0, v9, v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    if-ne v9, v4, :cond_10

    .line 406
    .line 407
    :goto_9
    return-object v4

    .line 408
    :cond_10
    move-object v13, v1

    .line 409
    move-object v1, v6

    .line 410
    :goto_a
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-eqz v1, :cond_11

    .line 415
    .line 416
    :goto_b
    return-object p5

    .line 417
    :cond_11
    move-object/from16 v10, p5

    .line 418
    .line 419
    move v9, v2

    .line 420
    move-object v2, v3

    .line 421
    move-object v3, v5

    .line 422
    move-wide v6, v7

    .line 423
    move v5, v11

    .line 424
    move-object v11, v12

    .line 425
    move-object v1, v13

    .line 426
    move v8, v15

    .line 427
    goto/16 :goto_2
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JLandroidx/compose/foundation/text/selection/飘花落叶言子世楪苏兰哲;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 34
    .line 35
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    const/4 v8, 0x2

    .line 38
    const/4 v9, 0x1

    .line 39
    const/4 v10, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v9, :cond_2

    .line 43
    .line 44
    if-ne v5, v8, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 55
    .line 56
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v12, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v12, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    iget-object v13, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v13, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 p4, v5

    .line 72
    .line 73
    move v5, v0

    .line 74
    move-object v0, v12

    .line 75
    move-object v12, v11

    .line 76
    move-object v11, v3

    .line 77
    move-object/from16 v3, p4

    .line 78
    .line 79
    move v15, v8

    .line 80
    move v2, v9

    .line 81
    move-object/from16 p4, v10

    .line 82
    .line 83
    move-wide v7, v6

    .line 84
    goto/16 :goto_9

    .line 85
    .line 86
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v10

    .line 92
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->F$0:F

    .line 93
    .line 94
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 97
    .line 98
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 101
    .line 102
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 105
    .line 106
    iget-object v12, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v12, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 109
    .line 110
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object/from16 v17, v5

    .line 114
    .line 115
    move v5, v0

    .line 116
    move-object v0, v11

    .line 117
    move-object v11, v3

    .line 118
    move-object v3, v1

    .line 119
    move-object v1, v12

    .line 120
    move-object/from16 v12, v17

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    move-object/from16 v2, p0

    .line 127
    .line 128
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 129
    .line 130
    iget-object v2, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 131
    .line 132
    iget-object v2, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 133
    .line 134
    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_4

    .line 139
    .line 140
    move-object/from16 p4, v10

    .line 141
    .line 142
    goto/16 :goto_a

    .line 143
    .line 144
    :cond_4
    move-object/from16 v2, p0

    .line 145
    .line 146
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 147
    .line 148
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-interface {v2}, Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰哲苏()F

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 157
    .line 158
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-wide v0, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 162
    .line 163
    new-instance v0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 164
    .line 165
    invoke-direct {v0, v6, v7, v10}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;-><init>(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 166
    .line 167
    .line 168
    move-object/from16 v1, p3

    .line 169
    .line 170
    move-object v11, v5

    .line 171
    move-object v5, v3

    .line 172
    move v3, v2

    .line 173
    move-object v2, v0

    .line 174
    move-object/from16 v0, p0

    .line 175
    .line 176
    :goto_1
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v11, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v2, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v10, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 185
    .line 186
    iput v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->F$0:F

    .line 187
    .line 188
    iput v9, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 189
    .line 190
    invoke-static {v0, v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    if-ne v12, v4, :cond_5

    .line 195
    .line 196
    goto/16 :goto_8

    .line 197
    .line 198
    :cond_5
    move/from16 v17, v3

    .line 199
    .line 200
    move-object v3, v2

    .line 201
    move-object v2, v12

    .line 202
    move-object v12, v11

    .line 203
    move-object v11, v5

    .line 204
    move/from16 v5, v17

    .line 205
    .line 206
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 207
    .line 208
    iget-object v13, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 209
    .line 210
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    move-object/from16 p4, v10

    .line 215
    .line 216
    const/4 v10, 0x0

    .line 217
    :goto_3
    if-ge v10, v14, :cond_7

    .line 218
    .line 219
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v16

    .line 223
    move-object/from16 v15, v16

    .line 224
    .line 225
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 226
    .line 227
    iget-wide v6, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 228
    .line 229
    iget-wide v8, v12, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 230
    .line 231
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-eqz v6, :cond_6

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 239
    .line 240
    const-wide/16 v6, 0x0

    .line 241
    .line 242
    const/4 v8, 0x2

    .line 243
    const/4 v9, 0x1

    .line 244
    goto :goto_3

    .line 245
    :cond_7
    move-object/from16 v16, p4

    .line 246
    .line 247
    :goto_4
    move-object/from16 v6, v16

    .line 248
    .line 249
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 250
    .line 251
    if-nez v6, :cond_8

    .line 252
    .line 253
    goto/16 :goto_a

    .line 254
    .line 255
    :cond_8
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    if-eqz v7, :cond_9

    .line 260
    .line 261
    goto/16 :goto_a

    .line 262
    .line 263
    :cond_9
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-eqz v7, :cond_d

    .line 268
    .line 269
    iget-object v2, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 270
    .line 271
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    const/4 v7, 0x0

    .line 276
    :goto_5
    if-ge v7, v6, :cond_b

    .line 277
    .line 278
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    move-object v9, v8

    .line 283
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 284
    .line 285
    iget-boolean v9, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 286
    .line 287
    if-eqz v9, :cond_a

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_b
    move-object/from16 v8, p4

    .line 294
    .line 295
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 296
    .line 297
    if-nez v8, :cond_c

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :cond_c
    iget-wide v6, v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 301
    .line 302
    iput-wide v6, v12, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 303
    .line 304
    const/4 v2, 0x1

    .line 305
    const-wide/16 v7, 0x0

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_d
    const/4 v2, 0x1

    .line 309
    invoke-static {v6, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 310
    .line 311
    .line 312
    move-result-wide v7

    .line 313
    invoke-virtual {v3, v5, v7, v8, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(FJZ)J

    .line 314
    .line 315
    .line 316
    move-result-wide v7

    .line 317
    const-wide v9, 0x7fffffff7fffffffL

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    and-long/2addr v9, v7

    .line 323
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    cmp-long v9, v9, v13

    .line 329
    .line 330
    if-eqz v9, :cond_f

    .line 331
    .line 332
    new-instance v9, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 333
    .line 334
    invoke-direct {v9, v7, v8}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v1, v6, v9}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    if-eqz v7, :cond_e

    .line 345
    .line 346
    return-object v6

    .line 347
    :cond_e
    const-wide/16 v7, 0x0

    .line 348
    .line 349
    iput-wide v7, v3, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 350
    .line 351
    :goto_7
    move-object/from16 v10, p4

    .line 352
    .line 353
    move v9, v2

    .line 354
    move-object v2, v3

    .line 355
    move v3, v5

    .line 356
    move-wide v6, v7

    .line 357
    move-object v5, v11

    .line 358
    move-object v11, v12

    .line 359
    const/4 v8, 0x2

    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    :cond_f
    const-wide/16 v7, 0x0

    .line 363
    .line 364
    sget-object v9, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 365
    .line 366
    iput-object v1, v11, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 367
    .line 368
    iput-object v0, v11, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v12, v11, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v3, v11, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v6, v11, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 375
    .line 376
    iput v5, v11, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->F$0:F

    .line 377
    .line 378
    const/4 v15, 0x2

    .line 379
    iput v15, v11, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 380
    .line 381
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 382
    .line 383
    invoke-virtual {v0, v9, v11}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    if-ne v9, v4, :cond_10

    .line 388
    .line 389
    :goto_8
    return-object v4

    .line 390
    :cond_10
    move-object v13, v1

    .line 391
    move-object v1, v6

    .line 392
    :goto_9
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-eqz v1, :cond_11

    .line 397
    .line 398
    :goto_a
    return-object p4

    .line 399
    :cond_11
    move-object/from16 v10, p4

    .line 400
    .line 401
    move v9, v2

    .line 402
    move-object v2, v3

    .line 403
    move v3, v5

    .line 404
    move-wide v6, v7

    .line 405
    move-object v5, v11

    .line 406
    move-object v11, v12

    .line 407
    move-object v1, v13

    .line 408
    move v8, v15

    .line 409
    goto/16 :goto_1
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JLkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 40
    .line 41
    iget-object p1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 44
    .line 45
    iget-object p2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v4

    .line 60
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object p3, p0

    .line 64
    check-cast p3, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 65
    .line 66
    iget-object p3, p3, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 67
    .line 68
    iget-object p3, p3, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 69
    .line 70
    invoke-static {p3, p1, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_3

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_3
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 78
    .line 79
    iget-object p3, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 80
    .line 81
    iget-object p3, p3, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 82
    .line 83
    iget-object p3, p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    const/4 v5, 0x0

    .line 90
    :goto_1
    if-ge v5, v2, :cond_5

    .line 91
    .line 92
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    move-object v7, v6

    .line 97
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 98
    .line 99
    iget-wide v7, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 100
    .line 101
    invoke-static {v7, v8, p1, p2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    move-object v6, v4

    .line 112
    :goto_2
    move-object p2, v6

    .line 113
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 114
    .line 115
    if-nez p2, :cond_6

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 119
    .line 120
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 124
    .line 125
    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 126
    .line 127
    .line 128
    iput-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-interface {v2}, Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲()J

    .line 135
    .line 136
    .line 137
    move-result-wide v5

    .line 138
    :try_start_1
    new-instance v2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 139
    .line 140
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v7, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2;

    .line 144
    .line 145
    invoke-direct {v7, v2, p3, p1, v4}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 146
    .line 147
    .line 148
    iput-object p2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object p1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 153
    .line 154
    iput v3, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->label:I

    .line 155
    .line 156
    invoke-virtual {p0, v5, v6, v7, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世哲兰(JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    if-ne p0, v1, :cond_7

    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_7
    move-object p0, v2

    .line 164
    :goto_3
    iget-boolean p0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 165
    .line 166
    if-eqz p0, :cond_9

    .line 167
    .line 168
    iget-object p0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 171
    .line 172
    if-nez p0, :cond_8

    .line 173
    .line 174
    return-object p2

    .line 175
    :cond_8
    return-object p0

    .line 176
    :cond_9
    :goto_4
    return-object v4

    .line 177
    :catch_0
    iget-object p0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 180
    .line 181
    if-nez p0, :cond_a

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_a
    move-object p2, p0

    .line 185
    :goto_5
    return-object p2
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JILandroidx/compose/foundation/gestures/飘花落叶言子世哲兰楪苏;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 34
    .line 35
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    const/4 v8, 0x2

    .line 38
    const/4 v9, 0x1

    .line 39
    const/4 v10, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v9, :cond_2

    .line 43
    .line 44
    if-ne v5, v8, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 55
    .line 56
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v12, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v12, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    iget-object v13, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v13, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 p5, v11

    .line 72
    .line 73
    move v11, v0

    .line 74
    move-object v0, v12

    .line 75
    move-object/from16 v12, p5

    .line 76
    .line 77
    move-object/from16 p5, v5

    .line 78
    .line 79
    move-object v5, v3

    .line 80
    move-object/from16 v3, p5

    .line 81
    .line 82
    move v15, v8

    .line 83
    move v2, v9

    .line 84
    move-object/from16 p5, v10

    .line 85
    .line 86
    move-wide v7, v6

    .line 87
    goto/16 :goto_a

    .line 88
    .line 89
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 90
    .line 91
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v10

    .line 95
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 96
    .line 97
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 100
    .line 101
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 104
    .line 105
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 108
    .line 109
    iget-object v12, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v12, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 112
    .line 113
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object/from16 v17, v11

    .line 117
    .line 118
    move v11, v0

    .line 119
    move-object/from16 v0, v17

    .line 120
    .line 121
    move-object/from16 v17, v3

    .line 122
    .line 123
    move-object v3, v1

    .line 124
    move-object v1, v12

    .line 125
    move-object v12, v5

    .line 126
    :goto_1
    move-object/from16 v5, v17

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 133
    .line 134
    move-object/from16 v5, p0

    .line 135
    .line 136
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 137
    .line 138
    iget-object v5, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 139
    .line 140
    iget-object v5, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 141
    .line 142
    invoke-static {v5, v0, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_4

    .line 147
    .line 148
    move-object/from16 p5, v10

    .line 149
    .line 150
    goto/16 :goto_b

    .line 151
    .line 152
    :cond_4
    move-object/from16 v5, p0

    .line 153
    .line 154
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 155
    .line 156
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    move/from16 v11, p3

    .line 161
    .line 162
    invoke-static {v5, v11}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;I)F

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 167
    .line 168
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-wide v0, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 172
    .line 173
    new-instance v0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 174
    .line 175
    invoke-direct {v0, v6, v7, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;-><init>(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 176
    .line 177
    .line 178
    move-object/from16 v1, p4

    .line 179
    .line 180
    move-object v2, v0

    .line 181
    move-object/from16 v0, p0

    .line 182
    .line 183
    :goto_2
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 192
    .line 193
    iput v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 194
    .line 195
    iput v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 196
    .line 197
    invoke-static {v0, v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    if-ne v12, v4, :cond_5

    .line 202
    .line 203
    goto/16 :goto_9

    .line 204
    .line 205
    :cond_5
    move-object/from16 v17, v3

    .line 206
    .line 207
    move-object v3, v2

    .line 208
    move-object v2, v12

    .line 209
    move-object v12, v11

    .line 210
    move v11, v5

    .line 211
    goto :goto_1

    .line 212
    :goto_3
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 213
    .line 214
    iget-object v13, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    move-object/from16 p5, v10

    .line 221
    .line 222
    const/4 v10, 0x0

    .line 223
    :goto_4
    if-ge v10, v14, :cond_7

    .line 224
    .line 225
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v16

    .line 229
    move-object/from16 v15, v16

    .line 230
    .line 231
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 232
    .line 233
    iget-wide v6, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 234
    .line 235
    iget-wide v8, v12, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 236
    .line 237
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    if-eqz v6, :cond_6

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 245
    .line 246
    const-wide/16 v6, 0x0

    .line 247
    .line 248
    const/4 v8, 0x2

    .line 249
    const/4 v9, 0x1

    .line 250
    goto :goto_4

    .line 251
    :cond_7
    move-object/from16 v16, p5

    .line 252
    .line 253
    :goto_5
    move-object/from16 v6, v16

    .line 254
    .line 255
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 256
    .line 257
    if-nez v6, :cond_8

    .line 258
    .line 259
    goto/16 :goto_b

    .line 260
    .line 261
    :cond_8
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_9

    .line 266
    .line 267
    goto/16 :goto_b

    .line 268
    .line 269
    :cond_9
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    if-eqz v7, :cond_d

    .line 274
    .line 275
    iget-object v2, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    const/4 v7, 0x0

    .line 282
    :goto_6
    if-ge v7, v6, :cond_b

    .line 283
    .line 284
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    move-object v9, v8

    .line 289
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 290
    .line 291
    iget-boolean v9, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 292
    .line 293
    if-eqz v9, :cond_a

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_b
    move-object/from16 v8, p5

    .line 300
    .line 301
    :goto_7
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 302
    .line 303
    if-nez v8, :cond_c

    .line 304
    .line 305
    goto/16 :goto_b

    .line 306
    .line 307
    :cond_c
    iget-wide v6, v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 308
    .line 309
    iput-wide v6, v12, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 310
    .line 311
    const/4 v2, 0x1

    .line 312
    const-wide/16 v7, 0x0

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_d
    const/4 v2, 0x1

    .line 316
    invoke-static {v6, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 317
    .line 318
    .line 319
    move-result-wide v7

    .line 320
    invoke-virtual {v3, v11, v7, v8, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(FJZ)J

    .line 321
    .line 322
    .line 323
    move-result-wide v7

    .line 324
    const-wide v9, 0x7fffffff7fffffffL

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    and-long/2addr v9, v7

    .line 330
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    cmp-long v9, v9, v13

    .line 336
    .line 337
    if-eqz v9, :cond_f

    .line 338
    .line 339
    const/16 v9, 0x20

    .line 340
    .line 341
    shr-long/2addr v7, v9

    .line 342
    long-to-int v7, v7

    .line 343
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    new-instance v8, Ljava/lang/Float;

    .line 348
    .line 349
    invoke-direct {v8, v7}, Ljava/lang/Float;-><init>(F)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v1, v6, v8}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    if-eqz v7, :cond_e

    .line 360
    .line 361
    return-object v6

    .line 362
    :cond_e
    const-wide/16 v7, 0x0

    .line 363
    .line 364
    iput-wide v7, v3, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 365
    .line 366
    :goto_8
    move-object/from16 v10, p5

    .line 367
    .line 368
    move v9, v2

    .line 369
    move-object v2, v3

    .line 370
    move-object v3, v5

    .line 371
    move-wide v6, v7

    .line 372
    move v5, v11

    .line 373
    move-object v11, v12

    .line 374
    const/4 v8, 0x2

    .line 375
    goto/16 :goto_2

    .line 376
    .line 377
    :cond_f
    const-wide/16 v7, 0x0

    .line 378
    .line 379
    sget-object v9, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 380
    .line 381
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 382
    .line 383
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 384
    .line 385
    iput-object v12, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 386
    .line 387
    iput-object v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v6, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 390
    .line 391
    iput v11, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 392
    .line 393
    const/4 v15, 0x2

    .line 394
    iput v15, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 395
    .line 396
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 397
    .line 398
    invoke-virtual {v0, v9, v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v9

    .line 402
    if-ne v9, v4, :cond_10

    .line 403
    .line 404
    :goto_9
    return-object v4

    .line 405
    :cond_10
    move-object v13, v1

    .line 406
    move-object v1, v6

    .line 407
    :goto_a
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    if-eqz v1, :cond_11

    .line 412
    .line 413
    :goto_b
    return-object p5

    .line 414
    :cond_11
    move-object/from16 v10, p5

    .line 415
    .line 416
    move v9, v2

    .line 417
    move-object v2, v3

    .line 418
    move-object v3, v5

    .line 419
    move-wide v6, v7

    .line 420
    move v5, v11

    .line 421
    move-object v11, v12

    .line 422
    move-object v1, v13

    .line 423
    move v8, v15

    .line 424
    goto/16 :goto_2
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->label:I

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    if-ne v5, v6, :cond_1

    .line 40
    .line 41
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 44
    .line 45
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 48
    .line 49
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object/from16 v16, v1

    .line 53
    .line 54
    move-object v1, v0

    .line 55
    move-object/from16 v0, v16

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v7

    .line 64
    :cond_2
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object/from16 v2, p0

    .line 68
    .line 69
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 70
    .line 71
    iget-object v2, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 72
    .line 73
    iget-object v2, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 74
    .line 75
    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    goto/16 :goto_8

    .line 82
    .line 83
    :cond_3
    new-instance v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 84
    .line 85
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-wide v0, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 89
    .line 90
    move-object/from16 v0, p0

    .line 91
    .line 92
    :goto_1
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    iput v6, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->label:I

    .line 97
    .line 98
    invoke-static {v0, v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-ne v1, v4, :cond_4

    .line 103
    .line 104
    return-object v4

    .line 105
    :cond_4
    move-object/from16 v16, v2

    .line 106
    .line 107
    move-object v2, v1

    .line 108
    move-object/from16 v1, v16

    .line 109
    .line 110
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 111
    .line 112
    iget-object v5, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    const/4 v9, 0x0

    .line 119
    move v10, v9

    .line 120
    :goto_3
    if-ge v10, v8, :cond_6

    .line 121
    .line 122
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    move-object v12, v11

    .line 127
    check-cast v12, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 128
    .line 129
    iget-wide v12, v12, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 130
    .line 131
    iget-wide v14, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 132
    .line 133
    invoke-static {v12, v13, v14, v15}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-eqz v12, :cond_5

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    move-object v11, v7

    .line 144
    :goto_4
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 145
    .line 146
    if-nez v11, :cond_7

    .line 147
    .line 148
    move-object v11, v7

    .line 149
    goto :goto_7

    .line 150
    :cond_7
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_b

    .line 155
    .line 156
    iget-object v2, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 157
    .line 158
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    :goto_5
    if-ge v9, v5, :cond_9

    .line 163
    .line 164
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    move-object v10, v8

    .line 169
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 170
    .line 171
    iget-boolean v10, v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 172
    .line 173
    if-eqz v10, :cond_8

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_9
    move-object v8, v7

    .line 180
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 181
    .line 182
    if-nez v8, :cond_a

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_a
    iget-wide v8, v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 186
    .line 187
    iput-wide v8, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_b
    invoke-static {v11, v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 191
    .line 192
    .line 193
    move-result-wide v8

    .line 194
    const-wide/16 v12, 0x0

    .line 195
    .line 196
    invoke-static {v8, v9, v12, v13}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-nez v2, :cond_d

    .line 201
    .line 202
    :goto_7
    if-eqz v11, :cond_c

    .line 203
    .line 204
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_c

    .line 209
    .line 210
    return-object v11

    .line 211
    :cond_c
    :goto_8
    return-object v7

    .line 212
    :cond_d
    :goto_9
    move-object v2, v1

    .line 213
    goto :goto_1
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;

    .line 11
    .line 12
    iget v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v7, :cond_1

    .line 40
    .line 41
    iget v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->F$0:F

    .line 42
    .line 43
    iget v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->I$0:I

    .line 44
    .line 45
    iget-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 48
    .line 49
    iget-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 52
    .line 53
    iget-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 56
    .line 57
    iget-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v16, v2

    .line 65
    .line 66
    move v2, v0

    .line 67
    move-object v0, v10

    .line 68
    move-object v10, v9

    .line 69
    move-object v9, v8

    .line 70
    move v8, v4

    .line 71
    :goto_1
    move-object/from16 v4, v16

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v5

    .line 80
    :cond_2
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-static/range {p0 .. p0}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_3
    new-instance v1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 93
    .line 94
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 95
    .line 96
    .line 97
    iget-wide v8, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 98
    .line 99
    iput-wide v8, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 100
    .line 101
    move-object/from16 v4, p0

    .line 102
    .line 103
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 104
    .line 105
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    iget v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:I

    .line 110
    .line 111
    invoke-static {v8, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;I)F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    new-instance v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 116
    .line 117
    const/4 v9, 0x3

    .line 118
    invoke-direct {v8, v5, v9}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;-><init>(Landroidx/compose/foundation/gestures/Orientation;I)V

    .line 119
    .line 120
    .line 121
    move-object v10, v1

    .line 122
    move-object v9, v8

    .line 123
    const/4 v8, 0x0

    .line 124
    move v1, v0

    .line 125
    move-object/from16 v0, p2

    .line 126
    .line 127
    :goto_2
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$1:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$2:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$3:Ljava/lang/Object;

    .line 134
    .line 135
    iput v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->I$0:I

    .line 136
    .line 137
    iput v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->F$0:F

    .line 138
    .line 139
    iput v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->label:I

    .line 140
    .line 141
    move-object v11, v4

    .line 142
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 143
    .line 144
    invoke-virtual {v11, v0, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    if-ne v4, v3, :cond_4

    .line 149
    .line 150
    return-object v3

    .line 151
    :cond_4
    move-object/from16 v16, v2

    .line 152
    .line 153
    move v2, v1

    .line 154
    move-object v1, v4

    .line 155
    goto :goto_1

    .line 156
    :goto_3
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 157
    .line 158
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    const/4 v13, 0x0

    .line 165
    :goto_4
    if-ge v13, v12, :cond_6

    .line 166
    .line 167
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v14

    .line 171
    move-object v15, v14

    .line 172
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 173
    .line 174
    iget-wide v5, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 175
    .line 176
    move/from16 p0, v8

    .line 177
    .line 178
    iget-wide v7, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 179
    .line 180
    invoke-static {v5, v6, v7, v8}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_5

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 188
    .line 189
    const/4 v5, 0x0

    .line 190
    move/from16 v8, p0

    .line 191
    .line 192
    const/4 v7, 0x1

    .line 193
    goto :goto_4

    .line 194
    :cond_6
    move/from16 p0, v8

    .line 195
    .line 196
    const/4 v14, 0x0

    .line 197
    :goto_5
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 198
    .line 199
    if-eqz v14, :cond_7

    .line 200
    .line 201
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-eqz v5, :cond_8

    .line 206
    .line 207
    :cond_7
    const/4 v15, 0x1

    .line 208
    goto :goto_6

    .line 209
    :cond_8
    const/4 v15, 0x1

    .line 210
    invoke-static {v14, v15}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 211
    .line 212
    .line 213
    move-result-wide v5

    .line 214
    invoke-virtual {v9, v2, v5, v6, v15}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(FJZ)J

    .line 215
    .line 216
    .line 217
    move-result-wide v5

    .line 218
    const-wide v7, 0x7fffffff7fffffffL

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    and-long/2addr v5, v7

    .line 224
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    cmp-long v5, v5, v7

    .line 230
    .line 231
    if-eqz v5, :cond_d

    .line 232
    .line 233
    move v8, v15

    .line 234
    goto :goto_a

    .line 235
    :goto_6
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    const/4 v6, 0x0

    .line 240
    :goto_7
    if-ge v6, v5, :cond_a

    .line 241
    .line 242
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    move-object v8, v7

    .line 247
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 248
    .line 249
    iget-boolean v8, v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 250
    .line 251
    if-eqz v8, :cond_9

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_a
    const/4 v7, 0x0

    .line 258
    :goto_8
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 259
    .line 260
    if-nez v7, :cond_c

    .line 261
    .line 262
    if-eqz p0, :cond_b

    .line 263
    .line 264
    move v6, v15

    .line 265
    goto :goto_9

    .line 266
    :cond_b
    const/4 v6, 0x0

    .line 267
    :goto_9
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    return-object v0

    .line 272
    :cond_c
    iget-wide v5, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 273
    .line 274
    iput-wide v5, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 275
    .line 276
    :cond_d
    move/from16 v8, p0

    .line 277
    .line 278
    :goto_a
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    const/4 v6, 0x0

    .line 283
    :goto_b
    if-ge v6, v5, :cond_f

    .line 284
    .line 285
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 290
    .line 291
    iget-boolean v7, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 292
    .line 293
    if-eqz v7, :cond_e

    .line 294
    .line 295
    move v1, v2

    .line 296
    move-object v2, v4

    .line 297
    move-object v4, v11

    .line 298
    move v7, v15

    .line 299
    const/4 v5, 0x0

    .line 300
    goto/16 :goto_2

    .line 301
    .line 302
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 303
    .line 304
    goto :goto_b

    .line 305
    :cond_f
    if-eqz v8, :cond_10

    .line 306
    .line 307
    move v6, v15

    .line 308
    goto :goto_c

    .line 309
    :cond_10
    const/4 v6, 0x0

    .line 310
    :goto_c
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    return-object v0
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JLandroidx/compose/foundation/gestures/飘花落叶言子世哲苏兰楪;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->label:I

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v6, :cond_1

    .line 38
    .line 39
    iget-object v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$4:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 42
    .line 43
    iget-object v7, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    iget-object v8, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v8, Landroidx/compose/foundation/gestures/Orientation;

    .line 50
    .line 51
    iget-object v9, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    iget-object v10, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v10, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v16, v10

    .line 63
    .line 64
    move-object v10, v1

    .line 65
    move-object/from16 v1, v16

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 78
    .line 79
    move-object/from16 v3, p0

    .line 80
    .line 81
    check-cast v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 82
    .line 83
    iget-object v3, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 84
    .line 85
    iget-object v3, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 86
    .line 87
    move-wide/from16 v7, p1

    .line 88
    .line 89
    invoke-static {v3, v7, v8}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    move v15, v6

    .line 96
    goto/16 :goto_e

    .line 97
    .line 98
    :cond_3
    move-object v3, v0

    .line 99
    move-object v9, v1

    .line 100
    move-object/from16 v0, p0

    .line 101
    .line 102
    move-object/from16 v1, p3

    .line 103
    .line 104
    :goto_1
    new-instance v10, Lkotlin/jvm/internal/Ref$LongRef;

    .line 105
    .line 106
    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-wide v7, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 110
    .line 111
    move-object v7, v0

    .line 112
    move-object v8, v3

    .line 113
    move-object v3, v10

    .line 114
    :goto_2
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v8, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$2:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v7, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$3:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$4:Ljava/lang/Object;

    .line 123
    .line 124
    iput v6, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->label:I

    .line 125
    .line 126
    invoke-static {v7, v9}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    if-ne v10, v2, :cond_4

    .line 131
    .line 132
    return-object v2

    .line 133
    :cond_4
    move-object/from16 v16, v9

    .line 134
    .line 135
    move-object v9, v0

    .line 136
    move-object v0, v10

    .line 137
    move-object/from16 v10, v16

    .line 138
    .line 139
    :goto_3
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 140
    .line 141
    iget-object v11, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    const/4 v13, 0x0

    .line 148
    :goto_4
    if-ge v13, v12, :cond_6

    .line 149
    .line 150
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    move-object v15, v14

    .line 155
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 156
    .line 157
    iget-wide v4, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 158
    .line 159
    move-object/from16 p0, v7

    .line 160
    .line 161
    iget-wide v6, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 162
    .line 163
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_5

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 171
    .line 172
    move-object/from16 v7, p0

    .line 173
    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v6, 0x1

    .line 176
    goto :goto_4

    .line 177
    :cond_6
    move-object/from16 p0, v7

    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    :goto_5
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 181
    .line 182
    if-nez v14, :cond_7

    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    :goto_6
    const/4 v15, 0x1

    .line 186
    goto :goto_c

    .line 187
    :cond_7
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_b

    .line 192
    .line 193
    iget-object v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    const/4 v5, 0x0

    .line 200
    :goto_7
    if-ge v5, v4, :cond_9

    .line 201
    .line 202
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    move-object v7, v6

    .line 207
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 208
    .line 209
    iget-boolean v7, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 210
    .line 211
    if-eqz v7, :cond_8

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_9
    const/4 v6, 0x0

    .line 218
    :goto_8
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 219
    .line 220
    if-nez v6, :cond_a

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_a
    iget-wide v4, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 224
    .line 225
    iput-wide v4, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 226
    .line 227
    const/4 v15, 0x1

    .line 228
    goto :goto_b

    .line 229
    :cond_b
    const/4 v15, 0x1

    .line 230
    invoke-static {v14, v15}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 231
    .line 232
    .line 233
    move-result-wide v4

    .line 234
    if-nez v8, :cond_c

    .line 235
    .line 236
    invoke-static {v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    goto :goto_a

    .line 241
    :cond_c
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 242
    .line 243
    if-ne v8, v0, :cond_d

    .line 244
    .line 245
    const-wide v6, 0xffffffffL

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    and-long/2addr v4, v6

    .line 251
    :goto_9
    long-to-int v0, v4

    .line 252
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    goto :goto_a

    .line 257
    :cond_d
    const/16 v0, 0x20

    .line 258
    .line 259
    shr-long/2addr v4, v0

    .line 260
    goto :goto_9

    .line 261
    :goto_a
    const/4 v4, 0x0

    .line 262
    cmpg-float v0, v0, v4

    .line 263
    .line 264
    if-nez v0, :cond_e

    .line 265
    .line 266
    :goto_b
    move-object/from16 v7, p0

    .line 267
    .line 268
    move-object v0, v9

    .line 269
    move-object v9, v10

    .line 270
    move v6, v15

    .line 271
    const/4 v5, 0x0

    .line 272
    goto/16 :goto_2

    .line 273
    .line 274
    :cond_e
    :goto_c
    if-nez v14, :cond_f

    .line 275
    .line 276
    :goto_d
    const/4 v5, 0x0

    .line 277
    goto :goto_e

    .line 278
    :cond_f
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_10

    .line 283
    .line 284
    goto :goto_d

    .line 285
    :cond_10
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_12

    .line 290
    .line 291
    move-object v5, v14

    .line 292
    :goto_e
    if-eqz v5, :cond_11

    .line 293
    .line 294
    move v4, v15

    .line 295
    goto :goto_f

    .line 296
    :cond_11
    const/4 v4, 0x0

    .line 297
    :goto_f
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    return-object v0

    .line 302
    :cond_12
    invoke-interface {v1, v14}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    iget-wide v3, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 306
    .line 307
    move-wide v5, v3

    .line 308
    move-object v3, v8

    .line 309
    move-wide v7, v5

    .line 310
    move-object v0, v9

    .line 311
    move-object v9, v10

    .line 312
    move v6, v15

    .line 313
    const/4 v5, 0x0

    .line 314
    goto/16 :goto_1
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 39
    .line 40
    iget-object p1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object p3, p0

    .line 48
    move-object p0, p1

    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    iput-object p0, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p3, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->label:I

    .line 65
    .line 66
    invoke-static {p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    if-ne p4, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_2
    check-cast p4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 74
    .line 75
    if-nez p4, :cond_4

    .line 76
    .line 77
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_4
    invoke-static {p4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_5
    invoke-interface {p3, p4}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    iget-wide p1, p4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 93
    .line 94
    goto :goto_1
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v3, Landroidx/compose/foundation/gestures/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    invoke-direct {v3, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲苏楪兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 4
    .line 5
    .line 6
    new-instance v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲楪苏世兰;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-direct {v6, p2, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲楪苏世兰;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroidx/compose/foundation/gestures/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$13;

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    move-object v5, p3

    .line 22
    move-object v4, p4

    .line 23
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$13;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/Orientation;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, p5}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    sget-object p2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 33
    .line 34
    if-ne p0, p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p0, p2

    .line 38
    :goto_0
    if-ne p0, p1, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    return-object p2
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;I)F
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰哲苏()F

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    sget p1, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:F

    .line 9
    .line 10
    mul-float/2addr p0, p1

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰哲苏()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final 飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/Orientation;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    instance-of v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;

    .line 11
    .line 12
    iget v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 34
    .line 35
    const/4 v14, 0x0

    .line 36
    packed-switch v4, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v14

    .line 45
    :pswitch_0
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 48
    .line 49
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 52
    .line 53
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 56
    .line 57
    iget-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 60
    .line 61
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v7, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    iget-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v8, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 68
    .line 69
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v11, v14

    .line 73
    move-object v14, v3

    .line 74
    goto/16 :goto_28

    .line 75
    .line 76
    :pswitch_1
    iget v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->F$0:F

    .line 77
    .line 78
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$11:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 81
    .line 82
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 85
    .line 86
    iget-object v15, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v15, Lkotlin/jvm/internal/Ref$LongRef;

    .line 89
    .line 90
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    iget-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 98
    .line 99
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Lkotlin/jvm/internal/Ref$LongRef;

    .line 102
    .line 103
    const-wide v18, 0x7fffffff7fffffffL

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    iget-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 111
    .line 112
    iget-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v9, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 115
    .line 116
    iget-object v12, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v12, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 119
    .line 120
    iget-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v10, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 123
    .line 124
    iget-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v11, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 127
    .line 128
    iget-object v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v14, Landroidx/compose/foundation/gestures/Orientation;

    .line 131
    .line 132
    iget-object v13, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 135
    .line 136
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move v1, v0

    .line 140
    move-object v0, v7

    .line 141
    move-object v7, v12

    .line 142
    move-object v12, v5

    .line 143
    move-object v5, v8

    .line 144
    move-object v8, v10

    .line 145
    move-object v10, v14

    .line 146
    move-object v14, v3

    .line 147
    move-object v3, v9

    .line 148
    move-object v9, v11

    .line 149
    move-object v11, v13

    .line 150
    goto/16 :goto_22

    .line 151
    .line 152
    :pswitch_2
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    const-wide v18, 0x7fffffff7fffffffL

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    iget v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->F$0:F

    .line 163
    .line 164
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 167
    .line 168
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 171
    .line 172
    iget-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 175
    .line 176
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v7, Lkotlin/jvm/internal/Ref$LongRef;

    .line 179
    .line 180
    iget-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 183
    .line 184
    iget-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v9, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 187
    .line 188
    iget-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v10, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 191
    .line 192
    iget-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v11, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 195
    .line 196
    iget-object v12, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v12, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 199
    .line 200
    iget-object v13, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v13, Landroidx/compose/foundation/gestures/Orientation;

    .line 203
    .line 204
    iget-object v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 207
    .line 208
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    move-object v15, v5

    .line 212
    move-object v5, v8

    .line 213
    move-object v8, v11

    .line 214
    move-object v11, v14

    .line 215
    move-object v14, v3

    .line 216
    move-object v3, v2

    .line 217
    move v2, v0

    .line 218
    move-object v0, v7

    .line 219
    move-object v7, v10

    .line 220
    move-object v10, v13

    .line 221
    goto/16 :goto_1b

    .line 222
    .line 223
    :pswitch_3
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    const-wide v18, 0x7fffffff7fffffffL

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 236
    .line 237
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 240
    .line 241
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 244
    .line 245
    iget-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v6, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 248
    .line 249
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v7, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 252
    .line 253
    iget-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v8, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 256
    .line 257
    iget-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v9, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 260
    .line 261
    iget-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v10, Landroidx/compose/foundation/gestures/Orientation;

    .line 264
    .line 265
    iget-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 268
    .line 269
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    move-object v14, v3

    .line 273
    goto/16 :goto_13

    .line 274
    .line 275
    :pswitch_4
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    const-wide v18, 0x7fffffff7fffffffL

    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    iget v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->F$0:F

    .line 286
    .line 287
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$11:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 290
    .line 291
    iget-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v6, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 294
    .line 295
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v7, Lkotlin/jvm/internal/Ref$LongRef;

    .line 298
    .line 299
    iget-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 302
    .line 303
    iget-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 306
    .line 307
    iget-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 310
    .line 311
    iget-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v11, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 314
    .line 315
    iget-object v12, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v12, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 318
    .line 319
    iget-object v13, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v13, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 322
    .line 323
    iget-object v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v14, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 326
    .line 327
    iget-object v15, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v15, Landroidx/compose/foundation/gestures/Orientation;

    .line 330
    .line 331
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 334
    .line 335
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    move-object v1, v10

    .line 339
    move-object v10, v7

    .line 340
    move-object v7, v13

    .line 341
    move-object v13, v6

    .line 342
    move-object v6, v8

    .line 343
    move-object v8, v14

    .line 344
    move-object v14, v3

    .line 345
    move-object v3, v5

    .line 346
    move-object v5, v12

    .line 347
    move-object v12, v9

    .line 348
    move-object v9, v15

    .line 349
    goto/16 :goto_d

    .line 350
    .line 351
    :pswitch_5
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    const-wide v18, 0x7fffffff7fffffffL

    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    iget v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->F$0:F

    .line 362
    .line 363
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v4, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 366
    .line 367
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 370
    .line 371
    iget-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 374
    .line 375
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v7, Lkotlin/jvm/internal/Ref$LongRef;

    .line 378
    .line 379
    iget-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 382
    .line 383
    iget-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v9, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 386
    .line 387
    iget-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v10, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 390
    .line 391
    iget-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v11, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 394
    .line 395
    iget-object v12, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v12, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 398
    .line 399
    iget-object v13, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v13, Landroidx/compose/foundation/gestures/Orientation;

    .line 402
    .line 403
    iget-object v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 406
    .line 407
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    move-object v15, v10

    .line 411
    move-object v10, v5

    .line 412
    move-object v5, v15

    .line 413
    move-object v15, v4

    .line 414
    move-object v4, v9

    .line 415
    move-object v9, v13

    .line 416
    move-object v13, v7

    .line 417
    move-object v7, v11

    .line 418
    move-object v11, v14

    .line 419
    const/4 v14, 0x2

    .line 420
    goto/16 :goto_6

    .line 421
    .line 422
    :pswitch_6
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    const-wide v18, 0x7fffffff7fffffffL

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    iget-boolean v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->Z$0:Z

    .line 433
    .line 434
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v4, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 437
    .line 438
    iget-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v5, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 441
    .line 442
    iget-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v6, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 445
    .line 446
    iget-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v7, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 449
    .line 450
    iget-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v8, Landroidx/compose/foundation/gestures/Orientation;

    .line 453
    .line 454
    iget-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 457
    .line 458
    iget-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 461
    .line 462
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    goto :goto_2

    .line 466
    :pswitch_7
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    const-wide v18, 0x7fffffff7fffffffL

    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    invoke-interface/range {p2 .. p2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    check-cast v1, Ljava/lang/Boolean;

    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    if-nez v1, :cond_1

    .line 490
    .line 491
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 492
    .line 493
    .line 494
    :cond_1
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 495
    .line 496
    move-object/from16 v4, p1

    .line 497
    .line 498
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 499
    .line 500
    move-object/from16 v5, p3

    .line 501
    .line 502
    iput-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 503
    .line 504
    move-object/from16 v6, p4

    .line 505
    .line 506
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 507
    .line 508
    move-object/from16 v7, p5

    .line 509
    .line 510
    iput-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 511
    .line 512
    move-object/from16 v8, p6

    .line 513
    .line 514
    iput-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 515
    .line 516
    move-object/from16 v9, p7

    .line 517
    .line 518
    iput-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 519
    .line 520
    iput-boolean v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->Z$0:Z

    .line 521
    .line 522
    const/4 v10, 0x1

    .line 523
    iput v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 524
    .line 525
    const/4 v10, 0x2

    .line 526
    const/4 v11, 0x0

    .line 527
    invoke-static {v0, v11, v2, v10}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v12

    .line 531
    if-ne v12, v3, :cond_2

    .line 532
    .line 533
    :goto_1
    move-object v14, v3

    .line 534
    goto/16 :goto_27

    .line 535
    .line 536
    :cond_2
    move-object v10, v9

    .line 537
    move-object v9, v4

    .line 538
    move-object v4, v10

    .line 539
    move-object v10, v8

    .line 540
    move-object v8, v5

    .line 541
    move-object v5, v10

    .line 542
    move-object v10, v7

    .line 543
    move-object v7, v6

    .line 544
    move-object v6, v10

    .line 545
    move-object v10, v0

    .line 546
    move v0, v1

    .line 547
    move-object v1, v12

    .line 548
    :goto_2
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 549
    .line 550
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 551
    .line 552
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 553
    .line 554
    .line 555
    const-wide/16 v12, 0x0

    .line 556
    .line 557
    iput-wide v12, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 558
    .line 559
    if-eqz v0, :cond_13

    .line 560
    .line 561
    :goto_3
    iget-wide v12, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 562
    .line 563
    iget v0, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:I

    .line 564
    .line 565
    move-object v9, v10

    .line 566
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 567
    .line 568
    iget-object v9, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 569
    .line 570
    iget-object v9, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 571
    .line 572
    invoke-static {v9, v12, v13}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    if-eqz v9, :cond_3

    .line 577
    .line 578
    move-object v14, v3

    .line 579
    :goto_4
    const/4 v3, 0x0

    .line 580
    goto/16 :goto_e

    .line 581
    .line 582
    :cond_3
    move-object v9, v10

    .line 583
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 584
    .line 585
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 586
    .line 587
    .line 588
    move-result-object v9

    .line 589
    invoke-static {v9, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;I)F

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    new-instance v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 594
    .line 595
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 596
    .line 597
    .line 598
    iput-wide v12, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 599
    .line 600
    new-instance v12, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 601
    .line 602
    const-wide/16 v13, 0x0

    .line 603
    .line 604
    invoke-direct {v12, v13, v14, v8}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;-><init>(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 605
    .line 606
    .line 607
    move-object v13, v12

    .line 608
    move-object v12, v11

    .line 609
    move-object v11, v10

    .line 610
    move-object v10, v9

    .line 611
    move-object v9, v8

    .line 612
    move-object v8, v7

    .line 613
    move-object v7, v6

    .line 614
    move-object v6, v11

    .line 615
    :goto_5
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 616
    .line 617
    iput-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 618
    .line 619
    iput-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 620
    .line 621
    iput-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 622
    .line 623
    iput-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 624
    .line 625
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 626
    .line 627
    iput-object v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 628
    .line 629
    iput-object v12, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 630
    .line 631
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 632
    .line 633
    iput-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 634
    .line 635
    iput-object v13, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 636
    .line 637
    const/4 v14, 0x0

    .line 638
    iput-object v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$11:Ljava/lang/Object;

    .line 639
    .line 640
    iput v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->F$0:F

    .line 641
    .line 642
    const/4 v14, 0x2

    .line 643
    iput v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 644
    .line 645
    invoke-static {v6, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v15

    .line 649
    if-ne v15, v3, :cond_4

    .line 650
    .line 651
    goto :goto_1

    .line 652
    :cond_4
    move-object/from16 v24, v8

    .line 653
    .line 654
    move-object v8, v1

    .line 655
    move-object v1, v15

    .line 656
    move-object v15, v13

    .line 657
    move-object v13, v12

    .line 658
    move-object/from16 v12, v24

    .line 659
    .line 660
    :goto_6
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 661
    .line 662
    iget-object v14, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 663
    .line 664
    move-object/from16 v21, v3

    .line 665
    .line 666
    invoke-interface {v14}, Ljava/util/Collection;->size()I

    .line 667
    .line 668
    .line 669
    move-result v3

    .line 670
    move-object/from16 p0, v6

    .line 671
    .line 672
    const/4 v6, 0x0

    .line 673
    :goto_7
    if-ge v6, v3, :cond_6

    .line 674
    .line 675
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v22

    .line 679
    move/from16 p1, v3

    .line 680
    .line 681
    move-object/from16 v3, v22

    .line 682
    .line 683
    check-cast v3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 684
    .line 685
    move-object/from16 p2, v4

    .line 686
    .line 687
    iget-wide v3, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 688
    .line 689
    move-object/from16 p3, v5

    .line 690
    .line 691
    move/from16 p4, v6

    .line 692
    .line 693
    iget-wide v5, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 694
    .line 695
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    if-eqz v3, :cond_5

    .line 700
    .line 701
    goto :goto_8

    .line 702
    :cond_5
    add-int/lit8 v6, p4, 0x1

    .line 703
    .line 704
    move/from16 v3, p1

    .line 705
    .line 706
    move-object/from16 v4, p2

    .line 707
    .line 708
    move-object/from16 v5, p3

    .line 709
    .line 710
    goto :goto_7

    .line 711
    :cond_6
    move-object/from16 p2, v4

    .line 712
    .line 713
    move-object/from16 p3, v5

    .line 714
    .line 715
    const/16 v22, 0x0

    .line 716
    .line 717
    :goto_8
    move-object/from16 v3, v22

    .line 718
    .line 719
    check-cast v3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 720
    .line 721
    if-nez v3, :cond_7

    .line 722
    .line 723
    :goto_9
    move-object/from16 v4, p2

    .line 724
    .line 725
    move-object/from16 v5, p3

    .line 726
    .line 727
    move-object v6, v7

    .line 728
    move-object v1, v8

    .line 729
    move-object v8, v9

    .line 730
    move-object v10, v11

    .line 731
    move-object v7, v12

    .line 732
    move-object v11, v13

    .line 733
    move-object/from16 v14, v21

    .line 734
    .line 735
    goto/16 :goto_4

    .line 736
    .line 737
    :cond_7
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 738
    .line 739
    .line 740
    move-result v4

    .line 741
    if-eqz v4, :cond_8

    .line 742
    .line 743
    goto :goto_9

    .line 744
    :cond_8
    invoke-static {v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 745
    .line 746
    .line 747
    move-result v4

    .line 748
    if-eqz v4, :cond_c

    .line 749
    .line 750
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 751
    .line 752
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 753
    .line 754
    .line 755
    move-result v3

    .line 756
    const/4 v4, 0x0

    .line 757
    :goto_a
    if-ge v4, v3, :cond_a

    .line 758
    .line 759
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v5

    .line 763
    move-object v6, v5

    .line 764
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 765
    .line 766
    iget-boolean v6, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 767
    .line 768
    if-eqz v6, :cond_9

    .line 769
    .line 770
    goto :goto_b

    .line 771
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 772
    .line 773
    goto :goto_a

    .line 774
    :cond_a
    const/4 v5, 0x0

    .line 775
    :goto_b
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 776
    .line 777
    if-nez v5, :cond_b

    .line 778
    .line 779
    goto :goto_9

    .line 780
    :cond_b
    iget-wide v3, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 781
    .line 782
    iput-wide v3, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 783
    .line 784
    goto :goto_c

    .line 785
    :cond_c
    const/4 v1, 0x1

    .line 786
    invoke-static {v3, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 787
    .line 788
    .line 789
    move-result-wide v4

    .line 790
    invoke-virtual {v15, v0, v4, v5, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(FJZ)J

    .line 791
    .line 792
    .line 793
    move-result-wide v4

    .line 794
    and-long v22, v4, v18

    .line 795
    .line 796
    cmp-long v1, v22, v16

    .line 797
    .line 798
    if-eqz v1, :cond_e

    .line 799
    .line 800
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 801
    .line 802
    .line 803
    iput-wide v4, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 804
    .line 805
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    if-eqz v1, :cond_d

    .line 810
    .line 811
    move-object/from16 v4, p2

    .line 812
    .line 813
    move-object/from16 v5, p3

    .line 814
    .line 815
    move-object v6, v7

    .line 816
    move-object v1, v8

    .line 817
    move-object v8, v9

    .line 818
    move-object v10, v11

    .line 819
    move-object v7, v12

    .line 820
    move-object v11, v13

    .line 821
    move-object/from16 v14, v21

    .line 822
    .line 823
    goto/16 :goto_e

    .line 824
    .line 825
    :cond_d
    const-wide/16 v3, 0x0

    .line 826
    .line 827
    iput-wide v3, v15, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 828
    .line 829
    :goto_c
    move-object/from16 v6, p0

    .line 830
    .line 831
    move-object/from16 v4, p2

    .line 832
    .line 833
    move-object/from16 v5, p3

    .line 834
    .line 835
    move-object v1, v8

    .line 836
    move-object v8, v12

    .line 837
    move-object v12, v13

    .line 838
    move-object v13, v15

    .line 839
    move-object/from16 v3, v21

    .line 840
    .line 841
    goto/16 :goto_5

    .line 842
    .line 843
    :cond_e
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 844
    .line 845
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 846
    .line 847
    iput-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 848
    .line 849
    iput-object v12, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 850
    .line 851
    iput-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 852
    .line 853
    move-object/from16 v5, p3

    .line 854
    .line 855
    iput-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 856
    .line 857
    move-object/from16 v4, p2

    .line 858
    .line 859
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 860
    .line 861
    iput-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 862
    .line 863
    iput-object v13, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 864
    .line 865
    move-object/from16 v6, p0

    .line 866
    .line 867
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 868
    .line 869
    iput-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 870
    .line 871
    iput-object v15, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 872
    .line 873
    iput-object v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$11:Ljava/lang/Object;

    .line 874
    .line 875
    iput v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->F$0:F

    .line 876
    .line 877
    const/4 v14, 0x3

    .line 878
    iput v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 879
    .line 880
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 881
    .line 882
    invoke-virtual {v6, v1, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    move-object/from16 v14, v21

    .line 887
    .line 888
    if-ne v1, v14, :cond_f

    .line 889
    .line 890
    goto/16 :goto_27

    .line 891
    .line 892
    :cond_f
    move-object v1, v4

    .line 893
    move-object v4, v3

    .line 894
    move-object v3, v11

    .line 895
    move-object v11, v1

    .line 896
    move-object v1, v8

    .line 897
    move-object v8, v12

    .line 898
    move-object v12, v13

    .line 899
    move-object v13, v15

    .line 900
    :goto_d
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    if-eqz v4, :cond_12

    .line 905
    .line 906
    move-object v10, v3

    .line 907
    move-object v6, v7

    .line 908
    move-object v7, v8

    .line 909
    move-object v8, v9

    .line 910
    move-object v4, v11

    .line 911
    move-object v11, v12

    .line 912
    goto/16 :goto_4

    .line 913
    .line 914
    :goto_e
    if-eqz v3, :cond_11

    .line 915
    .line 916
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 917
    .line 918
    .line 919
    move-result v0

    .line 920
    if-eqz v0, :cond_10

    .line 921
    .line 922
    goto :goto_f

    .line 923
    :cond_10
    move-object v3, v14

    .line 924
    goto/16 :goto_3

    .line 925
    .line 926
    :cond_11
    :goto_f
    move-object v9, v3

    .line 927
    goto :goto_10

    .line 928
    :cond_12
    move-object v4, v11

    .line 929
    move-object v11, v3

    .line 930
    move-object v3, v14

    .line 931
    goto/16 :goto_5

    .line 932
    .line 933
    :cond_13
    move-object v14, v3

    .line 934
    :goto_10
    if-nez v9, :cond_2a

    .line 935
    .line 936
    move-object v0, v10

    .line 937
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 938
    .line 939
    iget-object v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 940
    .line 941
    iget-object v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 942
    .line 943
    iget-object v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 944
    .line 945
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    const/4 v12, 0x0

    .line 950
    :goto_11
    if-ge v12, v3, :cond_2a

    .line 951
    .line 952
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v13

    .line 956
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 957
    .line 958
    iget-boolean v13, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 959
    .line 960
    if-eqz v13, :cond_29

    .line 961
    .line 962
    move-object v0, v5

    .line 963
    move-object v5, v1

    .line 964
    move-object v1, v8

    .line 965
    move-object v8, v6

    .line 966
    move-object v6, v4

    .line 967
    move-object v4, v9

    .line 968
    move-object v9, v7

    .line 969
    move-object v7, v0

    .line 970
    move-object v0, v11

    .line 971
    :goto_12
    sget-object v3, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 972
    .line 973
    iput-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 974
    .line 975
    iput-object v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 976
    .line 977
    iput-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 978
    .line 979
    iput-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 980
    .line 981
    iput-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 982
    .line 983
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 984
    .line 985
    iput-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 986
    .line 987
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 988
    .line 989
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 990
    .line 991
    const/4 v11, 0x0

    .line 992
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 993
    .line 994
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 995
    .line 996
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$11:Ljava/lang/Object;

    .line 997
    .line 998
    const/4 v11, 0x4

    .line 999
    iput v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 1000
    .line 1001
    move-object v11, v10

    .line 1002
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 1003
    .line 1004
    invoke-virtual {v11, v3, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v3

    .line 1008
    if-ne v3, v14, :cond_14

    .line 1009
    .line 1010
    goto/16 :goto_27

    .line 1011
    .line 1012
    :cond_14
    move-object v10, v1

    .line 1013
    move-object v1, v3

    .line 1014
    :goto_13
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 1015
    .line 1016
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 1017
    .line 1018
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1019
    .line 1020
    .line 1021
    move-result v3

    .line 1022
    const/4 v12, 0x0

    .line 1023
    :goto_14
    if-ge v12, v3, :cond_17

    .line 1024
    .line 1025
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v13

    .line 1029
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1030
    .line 1031
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 1032
    .line 1033
    .line 1034
    move-result v13

    .line 1035
    if-eqz v13, :cond_16

    .line 1036
    .line 1037
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1038
    .line 1039
    .line 1040
    move-result v3

    .line 1041
    const/4 v12, 0x0

    .line 1042
    :goto_15
    if-ge v12, v3, :cond_17

    .line 1043
    .line 1044
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v13

    .line 1048
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1049
    .line 1050
    iget-boolean v13, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1051
    .line 1052
    if-eqz v13, :cond_15

    .line 1053
    .line 1054
    move-object v1, v10

    .line 1055
    move-object v10, v11

    .line 1056
    goto :goto_12

    .line 1057
    :cond_15
    add-int/lit8 v12, v12, 0x1

    .line 1058
    .line 1059
    goto :goto_15

    .line 1060
    :cond_16
    add-int/lit8 v12, v12, 0x1

    .line 1061
    .line 1062
    goto :goto_14

    .line 1063
    :cond_17
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1064
    .line 1065
    .line 1066
    move-result v3

    .line 1067
    const/4 v12, 0x0

    .line 1068
    :goto_16
    if-ge v12, v3, :cond_28

    .line 1069
    .line 1070
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v13

    .line 1074
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1075
    .line 1076
    iget-boolean v13, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1077
    .line 1078
    if-eqz v13, :cond_27

    .line 1079
    .line 1080
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲苏世兰楪(Ljava/util/List;)Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1085
    .line 1086
    if-eqz v1, :cond_18

    .line 1087
    .line 1088
    iget-wide v12, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 1089
    .line 1090
    goto :goto_17

    .line 1091
    :cond_18
    const-wide/16 v12, 0x0

    .line 1092
    .line 1093
    :goto_17
    iget-wide v3, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 1094
    .line 1095
    invoke-static {v12, v13, v3, v4}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 1096
    .line 1097
    .line 1098
    move-result-wide v3

    .line 1099
    iget-wide v12, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 1100
    .line 1101
    iget v1, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:I

    .line 1102
    .line 1103
    move-object v15, v11

    .line 1104
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 1105
    .line 1106
    iget-object v15, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 1107
    .line 1108
    iget-object v15, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 1109
    .line 1110
    invoke-static {v15, v12, v13}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v15

    .line 1114
    if-eqz v15, :cond_19

    .line 1115
    .line 1116
    move-object v1, v5

    .line 1117
    move-object v4, v6

    .line 1118
    :goto_18
    move-object v5, v7

    .line 1119
    move-object v6, v8

    .line 1120
    move-object v7, v9

    .line 1121
    move-object v8, v10

    .line 1122
    move-object v10, v11

    .line 1123
    :goto_19
    const/4 v9, 0x0

    .line 1124
    goto/16 :goto_23

    .line 1125
    .line 1126
    :cond_19
    move-object v15, v11

    .line 1127
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 1128
    .line 1129
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v15

    .line 1133
    invoke-static {v15, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;I)F

    .line 1134
    .line 1135
    .line 1136
    move-result v1

    .line 1137
    new-instance v15, Lkotlin/jvm/internal/Ref$LongRef;

    .line 1138
    .line 1139
    invoke-direct {v15}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 1140
    .line 1141
    .line 1142
    iput-wide v12, v15, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1143
    .line 1144
    new-instance v12, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 1145
    .line 1146
    invoke-direct {v12, v3, v4, v10}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;-><init>(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 1147
    .line 1148
    .line 1149
    move-object v3, v6

    .line 1150
    move-object v6, v11

    .line 1151
    :cond_1a
    :goto_1a
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 1152
    .line 1153
    iput-object v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 1154
    .line 1155
    iput-object v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 1156
    .line 1157
    iput-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 1158
    .line 1159
    iput-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 1160
    .line 1161
    iput-object v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 1162
    .line 1163
    iput-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 1164
    .line 1165
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 1166
    .line 1167
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 1168
    .line 1169
    iput-object v15, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 1170
    .line 1171
    iput-object v12, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 1172
    .line 1173
    const/4 v4, 0x0

    .line 1174
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$11:Ljava/lang/Object;

    .line 1175
    .line 1176
    iput v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->F$0:F

    .line 1177
    .line 1178
    const/4 v4, 0x5

    .line 1179
    iput v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 1180
    .line 1181
    invoke-static {v6, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v4

    .line 1185
    if-ne v4, v14, :cond_1b

    .line 1186
    .line 1187
    goto/16 :goto_27

    .line 1188
    .line 1189
    :cond_1b
    move-object/from16 v24, v2

    .line 1190
    .line 1191
    move v2, v1

    .line 1192
    move-object v1, v4

    .line 1193
    move-object v4, v12

    .line 1194
    move-object v12, v9

    .line 1195
    move-object v9, v3

    .line 1196
    move-object/from16 v3, v24

    .line 1197
    .line 1198
    :goto_1b
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 1199
    .line 1200
    iget-object v13, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 1201
    .line 1202
    move-object/from16 v21, v14

    .line 1203
    .line 1204
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 1205
    .line 1206
    .line 1207
    move-result v14

    .line 1208
    move-object/from16 v20, v6

    .line 1209
    .line 1210
    const/4 v6, 0x0

    .line 1211
    :goto_1c
    if-ge v6, v14, :cond_1d

    .line 1212
    .line 1213
    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v22

    .line 1217
    move/from16 v23, v6

    .line 1218
    .line 1219
    move-object/from16 v6, v22

    .line 1220
    .line 1221
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1222
    .line 1223
    move-object/from16 p0, v13

    .line 1224
    .line 1225
    move/from16 p1, v14

    .line 1226
    .line 1227
    iget-wide v13, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 1228
    .line 1229
    move-object/from16 p2, v5

    .line 1230
    .line 1231
    iget-wide v5, v15, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1232
    .line 1233
    invoke-static {v13, v14, v5, v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v5

    .line 1237
    if-eqz v5, :cond_1c

    .line 1238
    .line 1239
    goto :goto_1d

    .line 1240
    :cond_1c
    add-int/lit8 v6, v23, 0x1

    .line 1241
    .line 1242
    move-object/from16 v13, p0

    .line 1243
    .line 1244
    move/from16 v14, p1

    .line 1245
    .line 1246
    move-object/from16 v5, p2

    .line 1247
    .line 1248
    goto :goto_1c

    .line 1249
    :cond_1d
    move-object/from16 p2, v5

    .line 1250
    .line 1251
    const/16 v22, 0x0

    .line 1252
    .line 1253
    :goto_1d
    move-object/from16 v5, v22

    .line 1254
    .line 1255
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1256
    .line 1257
    if-nez v5, :cond_1e

    .line 1258
    .line 1259
    :goto_1e
    move-object/from16 v1, p2

    .line 1260
    .line 1261
    move-object v2, v3

    .line 1262
    move-object v5, v7

    .line 1263
    move-object v6, v8

    .line 1264
    move-object v4, v9

    .line 1265
    move-object v8, v10

    .line 1266
    move-object v10, v11

    .line 1267
    move-object v7, v12

    .line 1268
    move-object/from16 v14, v21

    .line 1269
    .line 1270
    goto/16 :goto_19

    .line 1271
    .line 1272
    :cond_1e
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v6

    .line 1276
    if-eqz v6, :cond_1f

    .line 1277
    .line 1278
    goto :goto_1e

    .line 1279
    :cond_1f
    invoke-static {v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v6

    .line 1283
    if-eqz v6, :cond_23

    .line 1284
    .line 1285
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 1286
    .line 1287
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1288
    .line 1289
    .line 1290
    move-result v5

    .line 1291
    const/4 v6, 0x0

    .line 1292
    :goto_1f
    if-ge v6, v5, :cond_21

    .line 1293
    .line 1294
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v13

    .line 1298
    move-object v14, v13

    .line 1299
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1300
    .line 1301
    iget-boolean v14, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1302
    .line 1303
    if-eqz v14, :cond_20

    .line 1304
    .line 1305
    goto :goto_20

    .line 1306
    :cond_20
    add-int/lit8 v6, v6, 0x1

    .line 1307
    .line 1308
    goto :goto_1f

    .line 1309
    :cond_21
    const/4 v13, 0x0

    .line 1310
    :goto_20
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1311
    .line 1312
    if-nez v13, :cond_22

    .line 1313
    .line 1314
    goto :goto_1e

    .line 1315
    :cond_22
    iget-wide v5, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 1316
    .line 1317
    iput-wide v5, v15, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1318
    .line 1319
    const-wide/16 v13, 0x0

    .line 1320
    .line 1321
    goto :goto_21

    .line 1322
    :cond_23
    const/4 v1, 0x1

    .line 1323
    invoke-static {v5, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 1324
    .line 1325
    .line 1326
    move-result-wide v13

    .line 1327
    invoke-virtual {v4, v2, v13, v14, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(FJZ)J

    .line 1328
    .line 1329
    .line 1330
    move-result-wide v13

    .line 1331
    and-long v13, v13, v18

    .line 1332
    .line 1333
    cmp-long v1, v13, v16

    .line 1334
    .line 1335
    if-eqz v1, :cond_25

    .line 1336
    .line 1337
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 1338
    .line 1339
    .line 1340
    const/4 v1, 0x0

    .line 1341
    invoke-static {v5, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 1342
    .line 1343
    .line 1344
    move-result-wide v13

    .line 1345
    iput-wide v13, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1346
    .line 1347
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 1348
    .line 1349
    .line 1350
    move-result v1

    .line 1351
    if-eqz v1, :cond_24

    .line 1352
    .line 1353
    move-object/from16 v1, p2

    .line 1354
    .line 1355
    move-object v2, v3

    .line 1356
    move-object v6, v8

    .line 1357
    move-object v4, v9

    .line 1358
    move-object v8, v10

    .line 1359
    move-object v10, v11

    .line 1360
    move-object/from16 v14, v21

    .line 1361
    .line 1362
    move-object v11, v0

    .line 1363
    move-object v9, v5

    .line 1364
    move-object v5, v7

    .line 1365
    move-object v7, v12

    .line 1366
    goto/16 :goto_10

    .line 1367
    .line 1368
    :cond_24
    const-wide/16 v13, 0x0

    .line 1369
    .line 1370
    iput-wide v13, v4, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 1371
    .line 1372
    :goto_21
    move-object/from16 v5, p2

    .line 1373
    .line 1374
    move v1, v2

    .line 1375
    move-object v2, v3

    .line 1376
    move-object v3, v9

    .line 1377
    move-object v9, v12

    .line 1378
    move-object/from16 v6, v20

    .line 1379
    .line 1380
    move-object/from16 v14, v21

    .line 1381
    .line 1382
    move-object v12, v4

    .line 1383
    goto/16 :goto_1a

    .line 1384
    .line 1385
    :cond_25
    const-wide/16 v13, 0x0

    .line 1386
    .line 1387
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 1388
    .line 1389
    iput-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 1390
    .line 1391
    iput-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 1392
    .line 1393
    iput-object v12, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 1394
    .line 1395
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 1396
    .line 1397
    iput-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 1398
    .line 1399
    iput-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 1400
    .line 1401
    move-object/from16 v6, p2

    .line 1402
    .line 1403
    iput-object v6, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 1404
    .line 1405
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 1406
    .line 1407
    move-object/from16 v13, v20

    .line 1408
    .line 1409
    iput-object v13, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 1410
    .line 1411
    iput-object v15, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 1412
    .line 1413
    iput-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 1414
    .line 1415
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$11:Ljava/lang/Object;

    .line 1416
    .line 1417
    iput v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->F$0:F

    .line 1418
    .line 1419
    const/4 v14, 0x6

    .line 1420
    iput v14, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 1421
    .line 1422
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 1423
    .line 1424
    invoke-virtual {v13, v1, v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v1

    .line 1428
    move-object/from16 v14, v21

    .line 1429
    .line 1430
    if-ne v1, v14, :cond_26

    .line 1431
    .line 1432
    goto/16 :goto_27

    .line 1433
    .line 1434
    :cond_26
    move v1, v2

    .line 1435
    move-object v2, v3

    .line 1436
    move-object v3, v9

    .line 1437
    move-object v9, v12

    .line 1438
    move-object v12, v4

    .line 1439
    move-object v4, v5

    .line 1440
    move-object v5, v6

    .line 1441
    move-object v6, v13

    .line 1442
    :goto_22
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 1443
    .line 1444
    .line 1445
    move-result v4

    .line 1446
    if-eqz v4, :cond_1a

    .line 1447
    .line 1448
    move-object v4, v3

    .line 1449
    move-object v1, v5

    .line 1450
    goto/16 :goto_18

    .line 1451
    .line 1452
    :cond_27
    add-int/lit8 v12, v12, 0x1

    .line 1453
    .line 1454
    goto/16 :goto_16

    .line 1455
    .line 1456
    :cond_28
    move-object v1, v5

    .line 1457
    move-object v5, v7

    .line 1458
    move-object v7, v9

    .line 1459
    move-object v9, v4

    .line 1460
    move-object v4, v6

    .line 1461
    move-object v6, v8

    .line 1462
    move-object v8, v10

    .line 1463
    move-object v10, v11

    .line 1464
    :goto_23
    move-object v11, v0

    .line 1465
    goto/16 :goto_10

    .line 1466
    .line 1467
    :cond_29
    add-int/lit8 v12, v12, 0x1

    .line 1468
    .line 1469
    goto/16 :goto_11

    .line 1470
    .line 1471
    :cond_2a
    if-eqz v9, :cond_39

    .line 1472
    .line 1473
    iget-wide v12, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1474
    .line 1475
    new-instance v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 1476
    .line 1477
    invoke-direct {v0, v12, v13}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 1478
    .line 1479
    .line 1480
    invoke-interface {v7, v1, v9, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1481
    .line 1482
    .line 1483
    iget-wide v0, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1484
    .line 1485
    new-instance v3, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 1486
    .line 1487
    invoke-direct {v3, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 1488
    .line 1489
    .line 1490
    invoke-interface {v6, v9, v3}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    iget-wide v0, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 1494
    .line 1495
    move-object v3, v10

    .line 1496
    check-cast v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 1497
    .line 1498
    iget-object v3, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 1499
    .line 1500
    iget-object v3, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 1501
    .line 1502
    invoke-static {v3, v0, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 1503
    .line 1504
    .line 1505
    move-result v3

    .line 1506
    if-eqz v3, :cond_2b

    .line 1507
    .line 1508
    :goto_24
    const/4 v14, 0x0

    .line 1509
    goto/16 :goto_30

    .line 1510
    .line 1511
    :cond_2b
    :goto_25
    new-instance v3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 1512
    .line 1513
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 1514
    .line 1515
    .line 1516
    iput-wide v0, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1517
    .line 1518
    move-object v0, v3

    .line 1519
    move-object v7, v5

    .line 1520
    move-object v8, v6

    .line 1521
    move-object v5, v10

    .line 1522
    move-object v6, v4

    .line 1523
    move-object v4, v5

    .line 1524
    :goto_26
    iput-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$0:Ljava/lang/Object;

    .line 1525
    .line 1526
    iput-object v7, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$1:Ljava/lang/Object;

    .line 1527
    .line 1528
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$2:Ljava/lang/Object;

    .line 1529
    .line 1530
    iput-object v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$3:Ljava/lang/Object;

    .line 1531
    .line 1532
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$4:Ljava/lang/Object;

    .line 1533
    .line 1534
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$5:Ljava/lang/Object;

    .line 1535
    .line 1536
    const/4 v11, 0x0

    .line 1537
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$6:Ljava/lang/Object;

    .line 1538
    .line 1539
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$7:Ljava/lang/Object;

    .line 1540
    .line 1541
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$8:Ljava/lang/Object;

    .line 1542
    .line 1543
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$9:Ljava/lang/Object;

    .line 1544
    .line 1545
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$10:Ljava/lang/Object;

    .line 1546
    .line 1547
    iput-object v11, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->L$11:Ljava/lang/Object;

    .line 1548
    .line 1549
    const/4 v1, 0x7

    .line 1550
    iput v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$processDragGesture$1;->label:I

    .line 1551
    .line 1552
    invoke-static {v4, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v1

    .line 1556
    if-ne v1, v14, :cond_2c

    .line 1557
    .line 1558
    :goto_27
    return-object v14

    .line 1559
    :cond_2c
    :goto_28
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 1560
    .line 1561
    iget-object v3, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 1562
    .line 1563
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1564
    .line 1565
    .line 1566
    move-result v9

    .line 1567
    const/4 v10, 0x0

    .line 1568
    :goto_29
    if-ge v10, v9, :cond_2e

    .line 1569
    .line 1570
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v12

    .line 1574
    move-object v13, v12

    .line 1575
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1576
    .line 1577
    move-object/from16 p0, v12

    .line 1578
    .line 1579
    iget-wide v11, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 1580
    .line 1581
    move-object/from16 p1, v2

    .line 1582
    .line 1583
    move-object v13, v3

    .line 1584
    iget-wide v2, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1585
    .line 1586
    invoke-static {v11, v12, v2, v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 1587
    .line 1588
    .line 1589
    move-result v2

    .line 1590
    if-eqz v2, :cond_2d

    .line 1591
    .line 1592
    move-object/from16 v11, p0

    .line 1593
    .line 1594
    goto :goto_2a

    .line 1595
    :cond_2d
    add-int/lit8 v10, v10, 0x1

    .line 1596
    .line 1597
    move-object/from16 v2, p1

    .line 1598
    .line 1599
    move-object v3, v13

    .line 1600
    const/4 v11, 0x0

    .line 1601
    goto :goto_29

    .line 1602
    :cond_2e
    move-object/from16 p1, v2

    .line 1603
    .line 1604
    const/4 v11, 0x0

    .line 1605
    :goto_2a
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1606
    .line 1607
    if-nez v11, :cond_2f

    .line 1608
    .line 1609
    const/4 v1, 0x1

    .line 1610
    const/4 v11, 0x0

    .line 1611
    goto :goto_2e

    .line 1612
    :cond_2f
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 1613
    .line 1614
    .line 1615
    move-result v2

    .line 1616
    if-eqz v2, :cond_33

    .line 1617
    .line 1618
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 1619
    .line 1620
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1621
    .line 1622
    .line 1623
    move-result v2

    .line 1624
    const/4 v3, 0x0

    .line 1625
    :goto_2b
    if-ge v3, v2, :cond_31

    .line 1626
    .line 1627
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v9

    .line 1631
    move-object v10, v9

    .line 1632
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1633
    .line 1634
    iget-boolean v10, v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1635
    .line 1636
    if-eqz v10, :cond_30

    .line 1637
    .line 1638
    goto :goto_2c

    .line 1639
    :cond_30
    add-int/lit8 v3, v3, 0x1

    .line 1640
    .line 1641
    goto :goto_2b

    .line 1642
    :cond_31
    const/4 v9, 0x0

    .line 1643
    :goto_2c
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 1644
    .line 1645
    if-nez v9, :cond_32

    .line 1646
    .line 1647
    const/4 v1, 0x1

    .line 1648
    goto :goto_2e

    .line 1649
    :cond_32
    iget-wide v1, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 1650
    .line 1651
    iput-wide v1, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1652
    .line 1653
    const/4 v1, 0x1

    .line 1654
    goto :goto_2d

    .line 1655
    :cond_33
    const/4 v1, 0x1

    .line 1656
    invoke-static {v11, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 1657
    .line 1658
    .line 1659
    move-result-wide v2

    .line 1660
    invoke-static {v2, v3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 1661
    .line 1662
    .line 1663
    move-result v2

    .line 1664
    const/4 v3, 0x0

    .line 1665
    cmpg-float v2, v2, v3

    .line 1666
    .line 1667
    if-nez v2, :cond_34

    .line 1668
    .line 1669
    :goto_2d
    move-object/from16 v2, p1

    .line 1670
    .line 1671
    goto/16 :goto_26

    .line 1672
    .line 1673
    :cond_34
    :goto_2e
    if-nez v11, :cond_35

    .line 1674
    .line 1675
    :goto_2f
    move-object v4, v6

    .line 1676
    move-object v5, v7

    .line 1677
    goto/16 :goto_24

    .line 1678
    .line 1679
    :cond_35
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 1680
    .line 1681
    .line 1682
    move-result v0

    .line 1683
    if-eqz v0, :cond_36

    .line 1684
    .line 1685
    goto :goto_2f

    .line 1686
    :cond_36
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 1687
    .line 1688
    .line 1689
    move-result v0

    .line 1690
    if-eqz v0, :cond_38

    .line 1691
    .line 1692
    move-object v4, v6

    .line 1693
    move-object v5, v7

    .line 1694
    move-object v14, v11

    .line 1695
    :goto_30
    if-nez v14, :cond_37

    .line 1696
    .line 1697
    invoke-interface {v5}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 1698
    .line 1699
    .line 1700
    goto :goto_31

    .line 1701
    :cond_37
    invoke-interface {v4, v14}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1702
    .line 1703
    .line 1704
    goto :goto_31

    .line 1705
    :cond_38
    const/4 v0, 0x0

    .line 1706
    invoke-static {v11, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 1707
    .line 1708
    .line 1709
    move-result-wide v2

    .line 1710
    new-instance v4, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 1711
    .line 1712
    invoke-direct {v4, v2, v3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 1713
    .line 1714
    .line 1715
    invoke-interface {v8, v11, v4}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 1719
    .line 1720
    .line 1721
    iget-wide v2, v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 1722
    .line 1723
    move-wide v0, v2

    .line 1724
    move-object v10, v5

    .line 1725
    move-object v4, v6

    .line 1726
    move-object v5, v7

    .line 1727
    move-object v6, v8

    .line 1728
    move-object/from16 v2, p1

    .line 1729
    .line 1730
    goto/16 :goto_25

    .line 1731
    .line 1732
    :cond_39
    :goto_31
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 1733
    .line 1734
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static final 飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JLandroidx/compose/foundation/gestures/飘花落叶言子世哲苏兰楪;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->label:I

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v6, :cond_1

    .line 38
    .line 39
    iget-object v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$4:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 42
    .line 43
    iget-object v7, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    iget-object v8, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v8, Landroidx/compose/foundation/gestures/Orientation;

    .line 50
    .line 51
    iget-object v9, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    iget-object v10, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v10, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v16, v10

    .line 63
    .line 64
    move-object v10, v1

    .line 65
    move-object/from16 v1, v16

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 78
    .line 79
    move-object/from16 v3, p0

    .line 80
    .line 81
    check-cast v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 82
    .line 83
    iget-object v3, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 84
    .line 85
    iget-object v3, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 86
    .line 87
    move-wide/from16 v7, p1

    .line 88
    .line 89
    invoke-static {v3, v7, v8}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    move v15, v6

    .line 96
    goto/16 :goto_e

    .line 97
    .line 98
    :cond_3
    move-object v3, v0

    .line 99
    move-object v9, v1

    .line 100
    move-object/from16 v0, p0

    .line 101
    .line 102
    move-object/from16 v1, p3

    .line 103
    .line 104
    :goto_1
    new-instance v10, Lkotlin/jvm/internal/Ref$LongRef;

    .line 105
    .line 106
    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-wide v7, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 110
    .line 111
    move-object v7, v0

    .line 112
    move-object v8, v3

    .line 113
    move-object v3, v10

    .line 114
    :goto_2
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v8, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$2:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v7, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$3:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$4:Ljava/lang/Object;

    .line 123
    .line 124
    iput v6, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->label:I

    .line 125
    .line 126
    invoke-static {v7, v9}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    if-ne v10, v2, :cond_4

    .line 131
    .line 132
    return-object v2

    .line 133
    :cond_4
    move-object/from16 v16, v9

    .line 134
    .line 135
    move-object v9, v0

    .line 136
    move-object v0, v10

    .line 137
    move-object/from16 v10, v16

    .line 138
    .line 139
    :goto_3
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 140
    .line 141
    iget-object v11, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    const/4 v13, 0x0

    .line 148
    :goto_4
    if-ge v13, v12, :cond_6

    .line 149
    .line 150
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    move-object v15, v14

    .line 155
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 156
    .line 157
    iget-wide v4, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 158
    .line 159
    move-object/from16 p0, v7

    .line 160
    .line 161
    iget-wide v6, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 162
    .line 163
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_5

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 171
    .line 172
    move-object/from16 v7, p0

    .line 173
    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v6, 0x1

    .line 176
    goto :goto_4

    .line 177
    :cond_6
    move-object/from16 p0, v7

    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    :goto_5
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 181
    .line 182
    if-nez v14, :cond_7

    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    :goto_6
    const/4 v15, 0x1

    .line 186
    goto :goto_c

    .line 187
    :cond_7
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_b

    .line 192
    .line 193
    iget-object v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    const/4 v5, 0x0

    .line 200
    :goto_7
    if-ge v5, v4, :cond_9

    .line 201
    .line 202
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    move-object v7, v6

    .line 207
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 208
    .line 209
    iget-boolean v7, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 210
    .line 211
    if-eqz v7, :cond_8

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_9
    const/4 v6, 0x0

    .line 218
    :goto_8
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 219
    .line 220
    if-nez v6, :cond_a

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_a
    iget-wide v4, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 224
    .line 225
    iput-wide v4, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 226
    .line 227
    const/4 v15, 0x1

    .line 228
    goto :goto_b

    .line 229
    :cond_b
    const/4 v15, 0x1

    .line 230
    invoke-static {v14, v15}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 231
    .line 232
    .line 233
    move-result-wide v4

    .line 234
    if-nez v8, :cond_c

    .line 235
    .line 236
    invoke-static {v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    goto :goto_a

    .line 241
    :cond_c
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 242
    .line 243
    if-ne v8, v0, :cond_d

    .line 244
    .line 245
    const-wide v6, 0xffffffffL

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    and-long/2addr v4, v6

    .line 251
    :goto_9
    long-to-int v0, v4

    .line 252
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    goto :goto_a

    .line 257
    :cond_d
    const/16 v0, 0x20

    .line 258
    .line 259
    shr-long/2addr v4, v0

    .line 260
    goto :goto_9

    .line 261
    :goto_a
    const/4 v4, 0x0

    .line 262
    cmpg-float v0, v0, v4

    .line 263
    .line 264
    if-nez v0, :cond_e

    .line 265
    .line 266
    :goto_b
    move-object/from16 v7, p0

    .line 267
    .line 268
    move-object v0, v9

    .line 269
    move-object v9, v10

    .line 270
    move v6, v15

    .line 271
    const/4 v5, 0x0

    .line 272
    goto/16 :goto_2

    .line 273
    .line 274
    :cond_e
    :goto_c
    if-nez v14, :cond_f

    .line 275
    .line 276
    :goto_d
    const/4 v5, 0x0

    .line 277
    goto :goto_e

    .line 278
    :cond_f
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_10

    .line 283
    .line 284
    goto :goto_d

    .line 285
    :cond_10
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_12

    .line 290
    .line 291
    move-object v5, v14

    .line 292
    :goto_e
    if-eqz v5, :cond_11

    .line 293
    .line 294
    move v4, v15

    .line 295
    goto :goto_f

    .line 296
    :cond_11
    const/4 v4, 0x0

    .line 297
    :goto_f
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    return-object v0

    .line 302
    :cond_12
    invoke-interface {v1, v14}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    iget-wide v3, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 306
    .line 307
    move-wide v5, v3

    .line 308
    move-object v3, v8

    .line 309
    move-wide v7, v5

    .line 310
    move-object v0, v9

    .line 311
    move-object v9, v10

    .line 312
    move v6, v15

    .line 313
    const/4 v5, 0x0

    .line 314
    goto/16 :goto_1
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z
    .locals 6

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    move-object v4, v3

    .line 16
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 17
    .line 18
    iget-wide v4, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 19
    .line 20
    invoke-static {v4, v5, p1, p2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v3, 0x0

    .line 31
    :goto_1
    check-cast v3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget-boolean p1, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 37
    .line 38
    if-ne p1, p0, :cond_2

    .line 39
    .line 40
    move v1, p0

    .line 41
    :cond_2
    xor-int/2addr p0, v1

    .line 42
    return p0
.end method
