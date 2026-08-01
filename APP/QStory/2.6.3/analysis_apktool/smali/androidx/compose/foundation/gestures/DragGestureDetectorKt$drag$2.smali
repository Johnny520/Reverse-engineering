.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;
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
        0x487
    }
    m = "drag-VnAYq1g"
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

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
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;",
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
    iput-object v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->result:Ljava/lang/Object;

    .line 6
    .line 7
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->label:I

    .line 8
    .line 9
    const/high16 v3, -0x80000000

    .line 10
    .line 11
    or-int/2addr v2, v3

    .line 12
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->label:I

    .line 13
    .line 14
    sget v4, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:F

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    iput v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->label:I

    .line 18
    .line 19
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 20
    .line 21
    if-eqz v2, :cond_f

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    if-ne v2, v5, :cond_e

    .line 25
    .line 26
    iget-object v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$5:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 29
    .line 30
    iget-object v6, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$4:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 33
    .line 34
    iget-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$3:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 37
    .line 38
    iget-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$2:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v8, Landroidx/compose/foundation/gestures/Orientation;

    .line 41
    .line 42
    iget-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v9, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 45
    .line 46
    iget-object v10, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 54
    .line 55
    iget-object v11, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    const/4 v14, 0x0

    .line 62
    :goto_1
    if-ge v14, v12, :cond_1

    .line 63
    .line 64
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v15

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    move-object v4, v15

    .line 71
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 72
    .line 73
    move/from16 v17, v14

    .line 74
    .line 75
    iget-wide v13, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 76
    .line 77
    move-object/from16 v18, v6

    .line 78
    .line 79
    iget-wide v5, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 80
    .line 81
    invoke-static {v13, v14, v5, v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_0

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_0
    add-int/lit8 v14, v17, 0x1

    .line 89
    .line 90
    move-object/from16 v6, v18

    .line 91
    .line 92
    const/4 v5, 0x1

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    move-object/from16 v18, v6

    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    move-object/from16 v15, v16

    .line 99
    .line 100
    :goto_2
    check-cast v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 101
    .line 102
    if-nez v15, :cond_2

    .line 103
    .line 104
    move-object/from16 v15, v16

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_2
    invoke-static {v15}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_6

    .line 112
    .line 113
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    const/4 v13, 0x0

    .line 120
    :goto_3
    if-ge v13, v5, :cond_4

    .line 121
    .line 122
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    move-object v11, v6

    .line 127
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 128
    .line 129
    iget-boolean v11, v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 130
    .line 131
    if-eqz v11, :cond_3

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_3
    add-int/lit8 v13, v13, 0x1

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    move-object/from16 v6, v16

    .line 138
    .line 139
    :goto_4
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 140
    .line 141
    if-nez v6, :cond_5

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_5
    iget-wide v5, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 145
    .line 146
    iput-wide v5, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_6
    const/4 v4, 0x1

    .line 150
    invoke-static {v15, v4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 151
    .line 152
    .line 153
    move-result-wide v5

    .line 154
    if-nez v8, :cond_7

    .line 155
    .line 156
    invoke-static {v5, v6}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    goto :goto_5

    .line 161
    :cond_7
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 162
    .line 163
    if-ne v8, v1, :cond_8

    .line 164
    .line 165
    const-wide v11, 0xffffffffL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    and-long/2addr v5, v11

    .line 171
    long-to-int v1, v5

    .line 172
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    goto :goto_5

    .line 177
    :cond_8
    const/16 v1, 0x20

    .line 178
    .line 179
    shr-long/2addr v5, v1

    .line 180
    long-to-int v1, v5

    .line 181
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    :goto_5
    const/4 v5, 0x0

    .line 186
    cmpg-float v1, v1, v5

    .line 187
    .line 188
    if-nez v1, :cond_9

    .line 189
    .line 190
    :goto_6
    move-object/from16 v6, v18

    .line 191
    .line 192
    goto :goto_9

    .line 193
    :cond_9
    :goto_7
    if-nez v15, :cond_a

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_a
    invoke-interface {v7, v15}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_b

    .line 207
    .line 208
    :goto_8
    return-object v16

    .line 209
    :cond_b
    invoke-static {v15}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_c

    .line 214
    .line 215
    return-object v15

    .line 216
    :cond_c
    invoke-interface {v9, v15}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    iget-wide v1, v15, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 220
    .line 221
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 222
    .line 223
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 224
    .line 225
    .line 226
    iput-wide v1, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 227
    .line 228
    move-object v2, v5

    .line 229
    move-object v6, v10

    .line 230
    :goto_9
    iput-object v10, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$0:Ljava/lang/Object;

    .line 231
    .line 232
    iput-object v9, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$1:Ljava/lang/Object;

    .line 233
    .line 234
    iput-object v8, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$2:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object v7, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$3:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v6, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$4:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$5:Ljava/lang/Object;

    .line 241
    .line 242
    const/4 v4, 0x1

    .line 243
    iput v4, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->label:I

    .line 244
    .line 245
    invoke-static {v6, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    if-ne v1, v3, :cond_d

    .line 250
    .line 251
    return-object v3

    .line 252
    :cond_d
    move v5, v4

    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_e
    const/16 v16, 0x0

    .line 256
    .line 257
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 258
    .line 259
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-object v16

    .line 263
    :cond_f
    const/16 v16, 0x0

    .line 264
    .line 265
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    throw v16
.end method
