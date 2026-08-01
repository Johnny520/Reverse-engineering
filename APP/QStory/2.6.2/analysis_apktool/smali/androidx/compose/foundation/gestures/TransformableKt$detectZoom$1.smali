.class final Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;
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
    c = "androidx.compose.foundation.gestures.TransformableKt"
    f = "Transformable.kt"
    l = {
        0x1cd,
        0x1cf,
        0x209
    }
    m = "detectZoom"
    v = 0x1
.end annotation


# instance fields
.field F$0:F

.field F$1:F

.field F$2:F

.field I$0:I

.field I$1:I

.field I$2:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field Z$0:Z

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
            "Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;",
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
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->result:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 13
    .line 14
    and-int v3, v1, v2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    iput v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :goto_0
    iget-object v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v3, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 33
    .line 34
    if-eqz v3, :cond_20

    .line 35
    .line 36
    const/4 v5, 0x3

    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eq v3, v8, :cond_3

    .line 40
    .line 41
    if-eq v3, v6, :cond_2

    .line 42
    .line 43
    if-ne v3, v5, :cond_1

    .line 44
    .line 45
    iget v3, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$2:I

    .line 46
    .line 47
    iget v9, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 48
    .line 49
    iget v10, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 50
    .line 51
    iget v11, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 52
    .line 53
    iget-wide v12, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 54
    .line 55
    iget v14, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 56
    .line 57
    iget v15, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 58
    .line 59
    iget-boolean v5, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 60
    .line 61
    iget-object v7, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$3:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 64
    .line 65
    iget-object v8, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v8, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 68
    .line 69
    iget-object v6, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 72
    .line 73
    const/16 v17, 0x0

    .line 74
    .line 75
    iget-object v4, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move/from16 v27, v15

    .line 83
    .line 84
    move-object v15, v2

    .line 85
    move v2, v5

    .line 86
    move v5, v11

    .line 87
    move-object v11, v8

    .line 88
    move v8, v14

    .line 89
    move-object v14, v7

    .line 90
    move-wide/from16 v28, v12

    .line 91
    .line 92
    move-object v13, v4

    .line 93
    move-object v12, v6

    .line 94
    move v4, v10

    .line 95
    move-wide/from16 v6, v28

    .line 96
    .line 97
    move/from16 v10, v27

    .line 98
    .line 99
    goto/16 :goto_12

    .line 100
    .line 101
    :cond_1
    const/16 v17, 0x0

    .line 102
    .line 103
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 104
    .line 105
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v17

    .line 109
    :cond_2
    const/16 v17, 0x0

    .line 110
    .line 111
    iget v3, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 112
    .line 113
    iget v4, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 114
    .line 115
    iget v5, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 116
    .line 117
    iget-wide v6, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 118
    .line 119
    iget v8, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 120
    .line 121
    iget v9, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 122
    .line 123
    iget-boolean v10, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 124
    .line 125
    iget-object v11, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v11, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 128
    .line 129
    iget-object v12, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v12, Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 132
    .line 133
    iget-object v13, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 136
    .line 137
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move-object v14, v12

    .line 141
    move v12, v4

    .line 142
    move v4, v5

    .line 143
    move v5, v10

    .line 144
    move v10, v9

    .line 145
    move v9, v8

    .line 146
    move-wide v7, v6

    .line 147
    move-object v6, v14

    .line 148
    move-object v14, v1

    .line 149
    const/4 v1, 0x2

    .line 150
    goto :goto_2

    .line 151
    :cond_3
    const/16 v17, 0x0

    .line 152
    .line 153
    iget v3, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 154
    .line 155
    iget v4, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 156
    .line 157
    iget v5, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 158
    .line 159
    iget-wide v6, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 160
    .line 161
    iget v8, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 162
    .line 163
    iget v9, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 164
    .line 165
    iget-boolean v10, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 166
    .line 167
    iget-object v11, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v11, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 170
    .line 171
    iget-object v12, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v12, Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 174
    .line 175
    iget-object v13, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 178
    .line 179
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :goto_1
    iput-object v13, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v12, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v11, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 187
    .line 188
    move-object/from16 v1, v17

    .line 189
    .line 190
    iput-object v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$3:Ljava/lang/Object;

    .line 191
    .line 192
    iput-boolean v10, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 193
    .line 194
    iput v9, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 195
    .line 196
    iput v8, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 197
    .line 198
    iput-wide v6, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 199
    .line 200
    iput v5, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 201
    .line 202
    iput v4, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 203
    .line 204
    iput v3, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 205
    .line 206
    const/4 v1, 0x2

    .line 207
    iput v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 208
    .line 209
    invoke-static {v13, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    if-ne v14, v2, :cond_4

    .line 214
    .line 215
    move-object v15, v2

    .line 216
    goto/16 :goto_11

    .line 217
    .line 218
    :cond_4
    move-object/from16 v27, v12

    .line 219
    .line 220
    move v12, v4

    .line 221
    move v4, v5

    .line 222
    move v5, v10

    .line 223
    move v10, v9

    .line 224
    move v9, v8

    .line 225
    move-wide v7, v6

    .line 226
    move-object/from16 v6, v27

    .line 227
    .line 228
    :goto_2
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 229
    .line 230
    iget-object v15, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 231
    .line 232
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    move/from16 v18, v3

    .line 237
    .line 238
    move/from16 v19, v4

    .line 239
    .line 240
    const/4 v3, 0x0

    .line 241
    :goto_3
    const/16 v4, 0x8

    .line 242
    .line 243
    if-ge v3, v1, :cond_6

    .line 244
    .line 245
    invoke-interface {v15, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v20

    .line 249
    check-cast v20, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 250
    .line 251
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 252
    .line 253
    .line 254
    move-result v20

    .line 255
    if-eqz v20, :cond_5

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_6
    iget v1, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 262
    .line 263
    const/16 v3, 0xa

    .line 264
    .line 265
    if-ne v1, v3, :cond_7

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_7
    const/16 v3, 0xb

    .line 269
    .line 270
    if-ne v1, v3, :cond_8

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_8
    const/16 v3, 0xc

    .line 274
    .line 275
    if-ne v1, v3, :cond_9

    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_9
    const/4 v3, 0x7

    .line 279
    if-ne v1, v3, :cond_a

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_a
    if-ne v1, v4, :cond_b

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_b
    const/16 v3, 0x9

    .line 286
    .line 287
    if-ne v1, v3, :cond_c

    .line 288
    .line 289
    :goto_4
    const/4 v3, 0x1

    .line 290
    goto :goto_5

    .line 291
    :cond_c
    const/4 v3, 0x0

    .line 292
    :goto_5
    if-nez v3, :cond_1a

    .line 293
    .line 294
    const/4 v1, 0x1

    .line 295
    invoke-static {v14, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Z)F

    .line 296
    .line 297
    .line 298
    move-result v15

    .line 299
    const/4 v1, 0x0

    .line 300
    invoke-static {v14, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Z)F

    .line 301
    .line 302
    .line 303
    move-result v20

    .line 304
    const/4 v1, 0x0

    .line 305
    cmpg-float v21, v15, v1

    .line 306
    .line 307
    const/high16 v22, 0x3f800000    # 1.0f

    .line 308
    .line 309
    if-nez v21, :cond_d

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_d
    cmpg-float v21, v20, v1

    .line 313
    .line 314
    if-nez v21, :cond_e

    .line 315
    .line 316
    :goto_6
    move/from16 v15, v22

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_e
    div-float v15, v15, v20

    .line 320
    .line 321
    :goto_7
    invoke-static {v14}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)F

    .line 322
    .line 323
    .line 324
    move-result v20

    .line 325
    move/from16 v21, v1

    .line 326
    .line 327
    new-instance v1, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;

    .line 328
    .line 329
    invoke-direct {v1, v4}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 330
    .line 331
    .line 332
    move/from16 v16, v9

    .line 333
    .line 334
    move/from16 v23, v10

    .line 335
    .line 336
    const/4 v4, 0x1

    .line 337
    invoke-static {v14, v4, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)J

    .line 338
    .line 339
    .line 340
    move-result-wide v9

    .line 341
    move v1, v5

    .line 342
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    invoke-static {v9, v10, v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    move/from16 v24, v4

    .line 352
    .line 353
    if-eqz v24, :cond_f

    .line 354
    .line 355
    move/from16 v26, v1

    .line 356
    .line 357
    move-object/from16 v25, v2

    .line 358
    .line 359
    const-wide/16 v1, 0x0

    .line 360
    .line 361
    const/4 v5, 0x0

    .line 362
    goto :goto_8

    .line 363
    :cond_f
    new-instance v4, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;

    .line 364
    .line 365
    const/16 v5, 0x8

    .line 366
    .line 367
    invoke-direct {v4, v5}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 368
    .line 369
    .line 370
    move/from16 v26, v1

    .line 371
    .line 372
    move-object/from16 v25, v2

    .line 373
    .line 374
    const/4 v5, 0x0

    .line 375
    invoke-static {v14, v5, v4}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)J

    .line 376
    .line 377
    .line 378
    move-result-wide v1

    .line 379
    invoke-static {v9, v10, v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 380
    .line 381
    .line 382
    move-result-wide v1

    .line 383
    :goto_8
    if-nez v19, :cond_13

    .line 384
    .line 385
    mul-float v9, v16, v15

    .line 386
    .line 387
    add-float v10, v23, v20

    .line 388
    .line 389
    invoke-static {v7, v8, v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 390
    .line 391
    .line 392
    move-result-wide v7

    .line 393
    invoke-static {v14, v5}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Z)F

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    sub-float v5, v22, v9

    .line 398
    .line 399
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    mul-float/2addr v5, v4

    .line 404
    const v16, 0x40490fdb    # (float)Math.PI

    .line 405
    .line 406
    .line 407
    mul-float v16, v16, v10

    .line 408
    .line 409
    mul-float v16, v16, v4

    .line 410
    .line 411
    const/high16 v4, 0x43340000    # 180.0f

    .line 412
    .line 413
    div-float v16, v16, v4

    .line 414
    .line 415
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(F)F

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    invoke-static {v7, v8}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 420
    .line 421
    .line 422
    move-result v16

    .line 423
    cmpl-float v5, v5, v12

    .line 424
    .line 425
    if-gtz v5, :cond_11

    .line 426
    .line 427
    cmpl-float v5, v4, v12

    .line 428
    .line 429
    if-gtz v5, :cond_11

    .line 430
    .line 431
    cmpl-float v5, v16, v12

    .line 432
    .line 433
    if-lez v5, :cond_10

    .line 434
    .line 435
    new-instance v5, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 436
    .line 437
    invoke-direct {v5, v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 438
    .line 439
    .line 440
    invoke-interface {v11, v5}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    check-cast v5, Ljava/lang/Boolean;

    .line 445
    .line 446
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    if-eqz v5, :cond_10

    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_10
    move/from16 v4, v19

    .line 454
    .line 455
    goto :goto_b

    .line 456
    :cond_11
    :goto_9
    if-eqz v26, :cond_12

    .line 457
    .line 458
    cmpg-float v4, v4, v12

    .line 459
    .line 460
    if-gez v4, :cond_12

    .line 461
    .line 462
    const/4 v4, 0x1

    .line 463
    goto :goto_a

    .line 464
    :cond_12
    const/4 v4, 0x0

    .line 465
    :goto_a
    sget-object v5, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子兰楪世哲苏;

    .line 466
    .line 467
    invoke-interface {v6, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move/from16 v18, v4

    .line 471
    .line 472
    const/4 v4, 0x1

    .line 473
    goto :goto_b

    .line 474
    :cond_13
    move/from16 v9, v16

    .line 475
    .line 476
    move/from16 v4, v19

    .line 477
    .line 478
    move/from16 v10, v23

    .line 479
    .line 480
    :goto_b
    if-eqz v4, :cond_19

    .line 481
    .line 482
    new-instance v5, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;

    .line 483
    .line 484
    move/from16 v16, v4

    .line 485
    .line 486
    const/16 v4, 0x8

    .line 487
    .line 488
    invoke-direct {v5, v4}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 489
    .line 490
    .line 491
    const/4 v4, 0x0

    .line 492
    invoke-static {v14, v4, v5}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)J

    .line 493
    .line 494
    .line 495
    if-eqz v18, :cond_14

    .line 496
    .line 497
    move/from16 v20, v21

    .line 498
    .line 499
    :cond_14
    cmpg-float v4, v20, v21

    .line 500
    .line 501
    if-nez v4, :cond_15

    .line 502
    .line 503
    cmpg-float v4, v15, v22

    .line 504
    .line 505
    if-nez v4, :cond_15

    .line 506
    .line 507
    const-wide/16 v4, 0x0

    .line 508
    .line 509
    invoke-static {v1, v2, v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 510
    .line 511
    .line 512
    move-result v15

    .line 513
    if-nez v15, :cond_16

    .line 514
    .line 515
    new-instance v4, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 516
    .line 517
    invoke-direct {v4, v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 518
    .line 519
    .line 520
    invoke-interface {v11, v4}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    check-cast v1, Ljava/lang/Boolean;

    .line 525
    .line 526
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 527
    .line 528
    .line 529
    move-result v1

    .line 530
    if-eqz v1, :cond_16

    .line 531
    .line 532
    :cond_15
    new-instance v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪世苏哲;

    .line 533
    .line 534
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 535
    .line 536
    .line 537
    invoke-interface {v6, v1}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    :cond_16
    iget-object v1, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 541
    .line 542
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    const/4 v4, 0x0

    .line 547
    :goto_c
    if-ge v4, v2, :cond_18

    .line 548
    .line 549
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v5

    .line 553
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 554
    .line 555
    move-object/from16 v19, v1

    .line 556
    .line 557
    move/from16 p1, v2

    .line 558
    .line 559
    const/4 v15, 0x0

    .line 560
    invoke-static {v5, v15}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 561
    .line 562
    .line 563
    move-result-wide v1

    .line 564
    move/from16 v20, v4

    .line 565
    .line 566
    move-object/from16 v21, v5

    .line 567
    .line 568
    const-wide/16 v4, 0x0

    .line 569
    .line 570
    invoke-static {v1, v2, v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-nez v1, :cond_17

    .line 575
    .line 576
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 577
    .line 578
    .line 579
    :cond_17
    add-int/lit8 v1, v20, 0x1

    .line 580
    .line 581
    move/from16 v2, p1

    .line 582
    .line 583
    move v4, v1

    .line 584
    move-object/from16 v1, v19

    .line 585
    .line 586
    goto :goto_c

    .line 587
    :cond_18
    :goto_d
    const/4 v15, 0x0

    .line 588
    goto :goto_e

    .line 589
    :cond_19
    move/from16 v16, v4

    .line 590
    .line 591
    goto :goto_d

    .line 592
    :goto_e
    move v2, v9

    .line 593
    move/from16 v1, v16

    .line 594
    .line 595
    :goto_f
    move/from16 v9, v18

    .line 596
    .line 597
    goto :goto_10

    .line 598
    :cond_1a
    move-object/from16 v25, v2

    .line 599
    .line 600
    move/from16 v26, v5

    .line 601
    .line 602
    move/from16 v16, v9

    .line 603
    .line 604
    move/from16 v23, v10

    .line 605
    .line 606
    const/4 v15, 0x0

    .line 607
    sget-object v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏世哲;

    .line 608
    .line 609
    invoke-interface {v6, v1}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move/from16 v2, v16

    .line 613
    .line 614
    move/from16 v1, v19

    .line 615
    .line 616
    goto :goto_f

    .line 617
    :goto_10
    sget-object v4, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 618
    .line 619
    iput-object v13, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 620
    .line 621
    iput-object v6, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 622
    .line 623
    iput-object v11, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 624
    .line 625
    iput-object v14, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$3:Ljava/lang/Object;

    .line 626
    .line 627
    move/from16 v5, v26

    .line 628
    .line 629
    iput-boolean v5, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->Z$0:Z

    .line 630
    .line 631
    iput v10, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 632
    .line 633
    iput v2, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 634
    .line 635
    iput-wide v7, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 636
    .line 637
    iput v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 638
    .line 639
    iput v12, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 640
    .line 641
    iput v9, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 642
    .line 643
    iput v3, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$2:I

    .line 644
    .line 645
    const/4 v15, 0x3

    .line 646
    iput v15, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 647
    .line 648
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 649
    .line 650
    invoke-virtual {v13, v4, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v4

    .line 654
    move-object/from16 v15, v25

    .line 655
    .line 656
    if-ne v4, v15, :cond_1b

    .line 657
    .line 658
    :goto_11
    return-object v15

    .line 659
    :cond_1b
    move/from16 v27, v5

    .line 660
    .line 661
    move v5, v1

    .line 662
    move-object v1, v4

    .line 663
    move v4, v12

    .line 664
    move-object v12, v6

    .line 665
    move-wide v6, v7

    .line 666
    move v8, v2

    .line 667
    move/from16 v2, v27

    .line 668
    .line 669
    :goto_12
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 670
    .line 671
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 672
    .line 673
    move-object/from16 v16, v0

    .line 674
    .line 675
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    move/from16 v18, v2

    .line 680
    .line 681
    const/4 v2, 0x0

    .line 682
    :goto_13
    if-ge v2, v0, :cond_1d

    .line 683
    .line 684
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v19

    .line 688
    check-cast v19, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 689
    .line 690
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 691
    .line 692
    .line 693
    move-result v19

    .line 694
    if-eqz v19, :cond_1c

    .line 695
    .line 696
    if-nez v5, :cond_1d

    .line 697
    .line 698
    const/4 v1, 0x1

    .line 699
    goto :goto_14

    .line 700
    :cond_1c
    add-int/lit8 v2, v2, 0x1

    .line 701
    .line 702
    goto :goto_13

    .line 703
    :cond_1d
    const/4 v1, 0x0

    .line 704
    :goto_14
    if-nez v3, :cond_1f

    .line 705
    .line 706
    if-nez v1, :cond_1f

    .line 707
    .line 708
    iget-object v0, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 709
    .line 710
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    const/4 v2, 0x0

    .line 715
    :goto_15
    if-ge v2, v1, :cond_1f

    .line 716
    .line 717
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    check-cast v3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 722
    .line 723
    iget-boolean v3, v3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 724
    .line 725
    if-eqz v3, :cond_1e

    .line 726
    .line 727
    move v3, v9

    .line 728
    move v9, v10

    .line 729
    move-object v2, v15

    .line 730
    move-object/from16 v0, v16

    .line 731
    .line 732
    move/from16 v10, v18

    .line 733
    .line 734
    const/16 v17, 0x0

    .line 735
    .line 736
    goto/16 :goto_1

    .line 737
    .line 738
    :cond_1e
    add-int/lit8 v2, v2, 0x1

    .line 739
    .line 740
    goto :goto_15

    .line 741
    :cond_1f
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 742
    .line 743
    return-object v0

    .line 744
    :cond_20
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    const/16 v17, 0x0

    .line 748
    .line 749
    throw v17
.end method
