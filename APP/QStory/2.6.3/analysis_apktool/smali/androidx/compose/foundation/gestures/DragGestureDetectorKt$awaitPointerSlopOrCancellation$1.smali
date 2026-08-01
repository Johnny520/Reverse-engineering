.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0xb0
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.DragGestureDetectorKt"
    f = "DragGestureDetector.kt"
    l = {
        0x364,
        0x37f
    }
    m = "awaitPointerSlopOrCancellation-6ksA65w"
    v = 0x1
.end annotation


# instance fields
.field F$0:F

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 6
    .line 7
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 8
    .line 9
    const/high16 v3, -0x80000000

    .line 10
    .line 11
    or-int/2addr v2, v3

    .line 12
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    sget v4, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:F

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 18
    .line 19
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v2, :cond_f

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v6, 0x1

    .line 26
    if-eq v2, v6, :cond_1

    .line 27
    .line 28
    if-ne v2, v5, :cond_0

    .line 29
    .line 30
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->F$0:F

    .line 31
    .line 32
    iget-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 35
    .line 36
    iget-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 39
    .line 40
    iget-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 43
    .line 44
    iget-object v10, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 47
    .line 48
    iget-object v11, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v16, v4

    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v4

    .line 65
    :cond_1
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->F$0:F

    .line 66
    .line 67
    iget-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 70
    .line 71
    iget-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, Lkotlin/jvm/internal/Ref$LongRef;

    .line 74
    .line 75
    iget-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 78
    .line 79
    iget-object v10, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 82
    .line 83
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object/from16 v17, v8

    .line 87
    .line 88
    move-object v8, v7

    .line 89
    move-object v7, v9

    .line 90
    move-object/from16 v9, v17

    .line 91
    .line 92
    :goto_0
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 93
    .line 94
    iget-object v11, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    const/4 v14, 0x0

    .line 101
    :goto_1
    if-ge v14, v12, :cond_3

    .line 102
    .line 103
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v15

    .line 107
    move-object v13, v15

    .line 108
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 109
    .line 110
    move-object/from16 v16, v4

    .line 111
    .line 112
    iget-wide v4, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 113
    .line 114
    move-object/from16 p1, v7

    .line 115
    .line 116
    iget-wide v6, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 117
    .line 118
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_2

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    add-int/lit8 v14, v14, 0x1

    .line 126
    .line 127
    move-object/from16 v7, p1

    .line 128
    .line 129
    move-object/from16 v4, v16

    .line 130
    .line 131
    const/4 v5, 0x2

    .line 132
    const/4 v6, 0x1

    .line 133
    goto :goto_1

    .line 134
    :cond_3
    move-object/from16 v16, v4

    .line 135
    .line 136
    move-object/from16 p1, v7

    .line 137
    .line 138
    move-object/from16 v15, v16

    .line 139
    .line 140
    :goto_2
    move-object v7, v15

    .line 141
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 142
    .line 143
    if-nez v7, :cond_4

    .line 144
    .line 145
    goto/16 :goto_7

    .line 146
    .line 147
    :cond_4
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_5

    .line 152
    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_5
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_9

    .line 160
    .line 161
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    const/4 v5, 0x0

    .line 168
    :goto_3
    if-ge v5, v4, :cond_7

    .line 169
    .line 170
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    move-object v7, v6

    .line 175
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 176
    .line 177
    iget-boolean v7, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 178
    .line 179
    if-eqz v7, :cond_6

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    move-object/from16 v6, v16

    .line 186
    .line 187
    :goto_4
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 188
    .line 189
    if-nez v6, :cond_8

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_8
    iget-wide v4, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 193
    .line 194
    iput-wide v4, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 195
    .line 196
    move-object/from16 v4, p1

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_9
    const/4 v13, 0x1

    .line 200
    invoke-static {v7, v13}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 201
    .line 202
    .line 203
    move-result-wide v4

    .line 204
    invoke-virtual {v8, v2, v4, v5, v13}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(FJZ)J

    .line 205
    .line 206
    .line 207
    move-result-wide v4

    .line 208
    const-wide v11, 0x7fffffff7fffffffL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    and-long/2addr v11, v4

    .line 214
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    cmp-long v1, v11, v14

    .line 220
    .line 221
    if-eqz v1, :cond_b

    .line 222
    .line 223
    new-instance v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 224
    .line 225
    invoke-direct {v1, v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v4, p1

    .line 229
    .line 230
    invoke-interface {v4, v7, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_a

    .line 238
    .line 239
    return-object v7

    .line 240
    :cond_a
    const-wide/16 v5, 0x0

    .line 241
    .line 242
    iput-wide v5, v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 243
    .line 244
    :goto_5
    move-object v7, v4

    .line 245
    const/4 v5, 0x2

    .line 246
    goto :goto_8

    .line 247
    :cond_b
    move-object/from16 v4, p1

    .line 248
    .line 249
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 250
    .line 251
    iput-object v10, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v4, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 256
    .line 257
    iput-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 260
    .line 261
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->F$0:F

    .line 262
    .line 263
    const/4 v5, 0x2

    .line 264
    iput v5, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 265
    .line 266
    move-object v11, v10

    .line 267
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 268
    .line 269
    invoke-virtual {v11, v1, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    if-ne v1, v3, :cond_c

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_c
    move-object v10, v4

    .line 277
    :goto_6
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eqz v1, :cond_d

    .line 282
    .line 283
    :goto_7
    return-object v16

    .line 284
    :cond_d
    move-object v7, v10

    .line 285
    move-object v10, v11

    .line 286
    :goto_8
    iput-object v10, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 289
    .line 290
    iput-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 291
    .line 292
    iput-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 293
    .line 294
    move-object/from16 v4, v16

    .line 295
    .line 296
    iput-object v4, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 297
    .line 298
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->F$0:F

    .line 299
    .line 300
    const/4 v13, 0x1

    .line 301
    iput v13, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 302
    .line 303
    invoke-static {v10, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    if-ne v1, v3, :cond_e

    .line 308
    .line 309
    :goto_9
    return-object v3

    .line 310
    :cond_e
    move v6, v13

    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :cond_f
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    throw v4
.end method
