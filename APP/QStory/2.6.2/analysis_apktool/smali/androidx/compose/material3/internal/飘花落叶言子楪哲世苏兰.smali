.class public abstract Landroidx/compose/material3/internal/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

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
    iput v2, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v3, :cond_f

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    const/4 v6, 0x1

    .line 38
    if-eq v3, v6, :cond_2

    .line 39
    .line 40
    if-ne v3, v5, :cond_1

    .line 41
    .line 42
    iget v3, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$1:F

    .line 43
    .line 44
    iget v7, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 45
    .line 46
    iget-object v8, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 49
    .line 50
    iget-object v9, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 53
    .line 54
    iget-object v10, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 57
    .line 58
    iget-object v11, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v11, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 61
    .line 62
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 p1, v4

    .line 66
    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v4

    .line 75
    :cond_2
    iget v3, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$1:F

    .line 76
    .line 77
    iget v7, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 78
    .line 79
    iget-object v8, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v8, Lkotlin/jvm/internal/Ref$LongRef;

    .line 82
    .line 83
    iget-object v9, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 86
    .line 87
    iget-object v10, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v10, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object v11, v9

    .line 95
    move-object v9, v8

    .line 96
    move-object v8, v11

    .line 97
    move-object v11, v10

    .line 98
    :goto_1
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 99
    .line 100
    iget-object v10, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    const/4 v14, 0x0

    .line 107
    :goto_2
    if-ge v14, v12, :cond_4

    .line 108
    .line 109
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    move-object v13, v15

    .line 114
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 115
    .line 116
    move-object/from16 p1, v4

    .line 117
    .line 118
    iget-wide v4, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 119
    .line 120
    move/from16 v16, v7

    .line 121
    .line 122
    iget-wide v6, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 123
    .line 124
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_3

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 132
    .line 133
    move-object/from16 v4, p1

    .line 134
    .line 135
    move/from16 v7, v16

    .line 136
    .line 137
    const/4 v5, 0x2

    .line 138
    const/4 v6, 0x1

    .line 139
    goto :goto_2

    .line 140
    :cond_4
    move-object/from16 p1, v4

    .line 141
    .line 142
    move/from16 v16, v7

    .line 143
    .line 144
    move-object/from16 v15, p1

    .line 145
    .line 146
    :goto_3
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-object v4, v15

    .line 150
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 151
    .line 152
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_5

    .line 157
    .line 158
    goto/16 :goto_7

    .line 159
    .line 160
    :cond_5
    invoke-static {v4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_9

    .line 165
    .line 166
    iget-object v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    const/4 v5, 0x0

    .line 173
    :goto_4
    if-ge v5, v4, :cond_7

    .line 174
    .line 175
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    move-object v7, v6

    .line 180
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 181
    .line 182
    iget-boolean v7, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 183
    .line 184
    if-eqz v7, :cond_6

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_7
    move-object/from16 v6, p1

    .line 191
    .line 192
    :goto_5
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 193
    .line 194
    if-nez v6, :cond_8

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_8
    iget-wide v4, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 198
    .line 199
    iput-wide v4, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 200
    .line 201
    move/from16 v7, v16

    .line 202
    .line 203
    const/4 v5, 0x2

    .line 204
    goto :goto_8

    .line 205
    :cond_9
    iget-wide v5, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 206
    .line 207
    iget-wide v14, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:J

    .line 208
    .line 209
    const/16 v0, 0x20

    .line 210
    .line 211
    shr-long/2addr v5, v0

    .line 212
    long-to-int v5, v5

    .line 213
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    shr-long v6, v14, v0

    .line 218
    .line 219
    long-to-int v0, v6

    .line 220
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    sub-float/2addr v5, v0

    .line 225
    add-float/2addr v3, v5

    .line 226
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    cmpg-float v0, v0, v16

    .line 231
    .line 232
    if-gez v0, :cond_c

    .line 233
    .line 234
    sget-object v0, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 235
    .line 236
    iput-object v11, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v8, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v9, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v4, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 243
    .line 244
    move/from16 v7, v16

    .line 245
    .line 246
    iput v7, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 247
    .line 248
    iput v3, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$1:F

    .line 249
    .line 250
    const/4 v5, 0x2

    .line 251
    iput v5, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 252
    .line 253
    move-object v10, v8

    .line 254
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 255
    .line 256
    invoke-virtual {v10, v0, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-ne v0, v2, :cond_a

    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_a
    move-object v8, v4

    .line 264
    :goto_6
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_b

    .line 269
    .line 270
    :goto_7
    return-object p1

    .line 271
    :cond_b
    move-object v8, v10

    .line 272
    goto :goto_8

    .line 273
    :cond_c
    move/from16 v7, v16

    .line 274
    .line 275
    const/4 v5, 0x2

    .line 276
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    mul-float/2addr v0, v7

    .line 281
    sub-float/2addr v3, v0

    .line 282
    new-instance v0, Ljava/lang/Float;

    .line 283
    .line 284
    invoke-direct {v0, v3}, Ljava/lang/Float;-><init>(F)V

    .line 285
    .line 286
    .line 287
    invoke-interface {v11, v4, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_d

    .line 295
    .line 296
    return-object v4

    .line 297
    :cond_d
    const/4 v0, 0x0

    .line 298
    move v3, v0

    .line 299
    :goto_8
    iput-object v11, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v8, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v9, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 304
    .line 305
    move-object/from16 v4, p1

    .line 306
    .line 307
    iput-object v4, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 308
    .line 309
    iput v7, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 310
    .line 311
    iput v3, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$1:F

    .line 312
    .line 313
    const/4 v13, 0x1

    .line 314
    iput v13, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 315
    .line 316
    invoke-static {v8, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-ne v0, v2, :cond_e

    .line 321
    .line 322
    :goto_9
    return-object v2

    .line 323
    :cond_e
    move v6, v13

    .line 324
    goto/16 :goto_1

    .line 325
    .line 326
    :cond_f
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    throw v4
.end method
