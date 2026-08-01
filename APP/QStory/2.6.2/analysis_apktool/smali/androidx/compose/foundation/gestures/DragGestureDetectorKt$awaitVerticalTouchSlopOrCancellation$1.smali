.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.DragGestureDetectorKt"
    f = "DragGestureDetector.kt"
    l = {
        0x494,
        0x4c0
    }
    m = "awaitVerticalTouchSlopOrCancellation-jO51t88"
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
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;",
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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 6
    .line 7
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 8
    .line 9
    const/high16 v3, -0x80000000

    .line 10
    .line 11
    or-int/2addr v2, v3

    .line 12
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    sget v4, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:F

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

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
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->F$0:F

    .line 31
    .line 32
    iget-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 35
    .line 36
    iget-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 39
    .line 40
    iget-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 43
    .line 44
    iget-object v10, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 47
    .line 48
    iget-object v11, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v11, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

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
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->F$0:F

    .line 66
    .line 67
    iget-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;

    .line 70
    .line 71
    iget-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, Lkotlin/jvm/internal/Ref$LongRef;

    .line 74
    .line 75
    iget-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 78
    .line 79
    iget-object v10, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 82
    .line 83
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object v11, v8

    .line 87
    move-object v8, v7

    .line 88
    move-object v7, v9

    .line 89
    move-object v9, v11

    .line 90
    move-object v11, v10

    .line 91
    :goto_0
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 92
    .line 93
    iget-object v10, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    const/4 v14, 0x0

    .line 100
    :goto_1
    if-ge v14, v12, :cond_3

    .line 101
    .line 102
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v15

    .line 106
    move-object v13, v15

    .line 107
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 108
    .line 109
    move-object/from16 v16, v4

    .line 110
    .line 111
    iget-wide v4, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 112
    .line 113
    move-object/from16 p1, v7

    .line 114
    .line 115
    iget-wide v6, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 116
    .line 117
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    add-int/lit8 v14, v14, 0x1

    .line 125
    .line 126
    move-object/from16 v7, p1

    .line 127
    .line 128
    move-object/from16 v4, v16

    .line 129
    .line 130
    const/4 v5, 0x2

    .line 131
    const/4 v6, 0x1

    .line 132
    goto :goto_1

    .line 133
    :cond_3
    move-object/from16 v16, v4

    .line 134
    .line 135
    move-object/from16 p1, v7

    .line 136
    .line 137
    move-object/from16 v15, v16

    .line 138
    .line 139
    :goto_2
    move-object v7, v15

    .line 140
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 141
    .line 142
    if-nez v7, :cond_4

    .line 143
    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :cond_4
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_5

    .line 151
    .line 152
    goto/16 :goto_7

    .line 153
    .line 154
    :cond_5
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-eqz v4, :cond_9

    .line 159
    .line 160
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    const/4 v5, 0x0

    .line 167
    :goto_3
    if-ge v5, v4, :cond_7

    .line 168
    .line 169
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    move-object v7, v6

    .line 174
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 175
    .line 176
    iget-boolean v7, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 177
    .line 178
    if-eqz v7, :cond_6

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_7
    move-object/from16 v6, v16

    .line 185
    .line 186
    :goto_4
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 187
    .line 188
    if-nez v6, :cond_8

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_8
    iget-wide v4, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 192
    .line 193
    iput-wide v4, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_9
    const/4 v13, 0x1

    .line 197
    invoke-static {v7, v13}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 198
    .line 199
    .line 200
    move-result-wide v4

    .line 201
    invoke-virtual {v8, v2, v4, v5, v13}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰(FJZ)J

    .line 202
    .line 203
    .line 204
    move-result-wide v4

    .line 205
    const-wide v14, 0x7fffffff7fffffffL

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    and-long/2addr v14, v4

    .line 211
    const-wide v17, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    cmp-long v1, v14, v17

    .line 217
    .line 218
    if-eqz v1, :cond_b

    .line 219
    .line 220
    const-wide v14, 0xffffffffL

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    and-long/2addr v4, v14

    .line 226
    long-to-int v1, v4

    .line 227
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    new-instance v4, Ljava/lang/Float;

    .line 232
    .line 233
    invoke-direct {v4, v1}, Ljava/lang/Float;-><init>(F)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v11, v7, v4}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_a

    .line 244
    .line 245
    return-object v7

    .line 246
    :cond_a
    const-wide/16 v4, 0x0

    .line 247
    .line 248
    iput-wide v4, v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 249
    .line 250
    :goto_5
    move-object/from16 v7, p1

    .line 251
    .line 252
    const/4 v5, 0x2

    .line 253
    goto :goto_8

    .line 254
    :cond_b
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 255
    .line 256
    iput-object v11, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 257
    .line 258
    move-object/from16 v4, p1

    .line 259
    .line 260
    iput-object v4, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 267
    .line 268
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->F$0:F

    .line 269
    .line 270
    const/4 v5, 0x2

    .line 271
    iput v5, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 272
    .line 273
    move-object v10, v4

    .line 274
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 275
    .line 276
    invoke-virtual {v10, v1, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-ne v1, v3, :cond_c

    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_c
    :goto_6
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_d

    .line 288
    .line 289
    :goto_7
    return-object v16

    .line 290
    :cond_d
    move-object v7, v10

    .line 291
    :goto_8
    iput-object v11, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 292
    .line 293
    iput-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 298
    .line 299
    move-object/from16 v4, v16

    .line 300
    .line 301
    iput-object v4, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 302
    .line 303
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->F$0:F

    .line 304
    .line 305
    const/4 v13, 0x1

    .line 306
    iput v13, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 307
    .line 308
    invoke-static {v7, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    if-ne v1, v3, :cond_e

    .line 313
    .line 314
    :goto_9
    return-object v3

    .line 315
    :cond_e
    move v6, v13

    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :cond_f
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 322
    .line 323
    throw v4
.end method
