.class public final Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;
.super Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

.field public 飘花落叶言子楪苏世兰哲:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

.field public final 飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 p2, 0x6

    .line 8
    const p3, 0x7fffffff

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p2, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 16
    .line 17
    return-void
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$ObjectRef;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-wide/from16 v1, p5

    .line 2
    .line 3
    move-object/from16 v3, p7

    .line 4
    .line 5
    instance-of v4, v3, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;

    .line 6
    .line 7
    if-eqz v4, :cond_0

    .line 8
    .line 9
    move-object v4, v3

    .line 10
    check-cast v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;

    .line 11
    .line 12
    iget v5, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->label:I

    .line 13
    .line 14
    const/high16 v6, -0x80000000

    .line 15
    .line 16
    and-int v7, v5, v6

    .line 17
    .line 18
    if-eqz v7, :cond_0

    .line 19
    .line 20
    sub-int/2addr v5, v6

    .line 21
    iput v5, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;

    .line 25
    .line 26
    invoke-direct {v4, v3}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v3, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v5, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v6, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->label:I

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    if-eqz v6, :cond_2

    .line 38
    .line 39
    if-ne v6, v8, :cond_1

    .line 40
    .line 41
    iget-object v0, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$4:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 44
    .line 45
    iget-object v1, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 48
    .line 49
    iget-object v2, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 52
    .line 53
    iget-object v5, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 56
    .line 57
    iget-object v4, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;

    .line 60
    .line 61
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object v10, v0

    .line 65
    move-object v9, v1

    .line 66
    move-object v0, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v7

    .line 74
    :cond_2
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const-wide/16 v9, 0x0

    .line 78
    .line 79
    cmp-long v3, v1, v9

    .line 80
    .line 81
    if-gez v3, :cond_3

    .line 82
    .line 83
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_3
    new-instance v3, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2;

    .line 87
    .line 88
    invoke-direct {v3, p0, v7}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 89
    .line 90
    .line 91
    iput-object p0, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p1, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object p2, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$2:Ljava/lang/Object;

    .line 96
    .line 97
    move-object/from16 v9, p3

    .line 98
    .line 99
    iput-object v9, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$3:Ljava/lang/Object;

    .line 100
    .line 101
    move-object/from16 v10, p4

    .line 102
    .line 103
    iput-object v10, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->L$4:Ljava/lang/Object;

    .line 104
    .line 105
    iput v8, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;->label:I

    .line 106
    .line 107
    invoke-static {v1, v2, v3, v4}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰(JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-ne v3, v5, :cond_4

    .line 112
    .line 113
    return-object v5

    .line 114
    :cond_4
    move-object v0, p0

    .line 115
    move-object v5, p1

    .line 116
    move-object v2, p2

    .line 117
    :goto_1
    check-cast v3, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 118
    .line 119
    if-eqz v3, :cond_5

    .line 120
    .line 121
    iget-object v1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 124
    .line 125
    iget-boolean v1, v1, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世哲苏兰:Z

    .line 126
    .line 127
    iget-wide v6, v3, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:J

    .line 128
    .line 129
    iget-wide v11, v3, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏兰哲:J

    .line 130
    .line 131
    new-instance v4, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 132
    .line 133
    move/from16 p5, v1

    .line 134
    .line 135
    move-object p0, v4

    .line 136
    move-wide p1, v6

    .line 137
    move-wide/from16 p3, v11

    .line 138
    .line 139
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;-><init>(JJZ)V

    .line 140
    .line 141
    .line 142
    move-object v1, p0

    .line 143
    iput-object v1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-virtual {v9, v6, v7}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 146
    .line 147
    .line 148
    move-result-wide v4

    .line 149
    invoke-virtual {v9, v4, v5}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏哲世兰(J)F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    iput v1, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 154
    .line 155
    const/16 v1, 0x1e

    .line 156
    .line 157
    const/4 v4, 0x0

    .line 158
    invoke-static {v4, v4, v1}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iput-object v1, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 163
    .line 164
    iget-object v0, v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 165
    .line 166
    iget-wide v4, v3, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏兰哲:J

    .line 167
    .line 168
    iget-wide v6, v3, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:J

    .line 169
    .line 170
    iget-object v1, v0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 173
    .line 174
    const/16 v3, 0x20

    .line 175
    .line 176
    shr-long v9, v6, v3

    .line 177
    .line 178
    long-to-int v3, v9

    .line 179
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    invoke-virtual {v1, v3, v4, v5}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 184
    .line 185
    .line 186
    iget-object v0, v0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 189
    .line 190
    const-wide v9, 0xffffffffL

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    and-long/2addr v6, v9

    .line 196
    long-to-int v1, v6

    .line 197
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v0, v1, v4, v5}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 202
    .line 203
    .line 204
    iget v0, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 205
    .line 206
    invoke-static {v0}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(F)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    xor-int/2addr v0, v8

    .line 211
    goto :goto_2

    .line 212
    :cond_5
    const/4 v0, 0x0

    .line 213
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;FFLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v9, v5, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 13
    .line 14
    instance-of v2, v1, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    move-object v2, v1

    .line 19
    check-cast v2, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;

    .line 20
    .line 21
    iget v3, v2, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->label:I

    .line 22
    .line 23
    const/high16 v4, -0x80000000

    .line 24
    .line 25
    and-int v6, v3, v4

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    sub-int/2addr v3, v4

    .line 30
    iput v3, v2, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->label:I

    .line 31
    .line 32
    :goto_0
    move-object v10, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance v2, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;

    .line 35
    .line 36
    invoke-direct {v2, v5, v1}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    iget-object v1, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->result:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v11, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 43
    .line 44
    iget v2, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->label:I

    .line 45
    .line 46
    const/4 v13, 0x0

    .line 47
    sget-object v14, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 48
    .line 49
    const/4 v15, 0x2

    .line 50
    const/4 v3, 0x1

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    if-eq v2, v3, :cond_2

    .line 54
    .line 55
    if-ne v2, v15, :cond_1

    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v14

    .line 61
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v13

    .line 67
    :cond_2
    iget v0, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->F$0:F

    .line 68
    .line 69
    iget-object v2, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 72
    .line 73
    iget-object v3, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 76
    .line 77
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object/from16 v16, v14

    .line 81
    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :cond_3
    invoke-static {v1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move v1, v3

    .line 88
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 89
    .line 90
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 94
    .line 95
    iget-wide v1, v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏兰哲:J

    .line 96
    .line 97
    move-object/from16 v16, v14

    .line 98
    .line 99
    iget-wide v13, v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:J

    .line 100
    .line 101
    iget-object v0, v9, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 104
    .line 105
    const/16 v4, 0x20

    .line 106
    .line 107
    move-wide/from16 v17, v13

    .line 108
    .line 109
    shr-long v12, v17, v4

    .line 110
    .line 111
    long-to-int v6, v12

    .line 112
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {v0, v6, v1, v2}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 117
    .line 118
    .line 119
    iget-object v0, v9, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 122
    .line 123
    const-wide v19, 0xffffffffL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    and-long v12, v17, v19

    .line 129
    .line 130
    long-to-int v6, v12

    .line 131
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-virtual {v0, v6, v1, v2}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v5, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 139
    .line 140
    invoke-static {v0}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世哲兰(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;)Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_4

    .line 145
    .line 146
    iget-wide v1, v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏兰哲:J

    .line 147
    .line 148
    iget-wide v12, v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:J

    .line 149
    .line 150
    iget-object v6, v9, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 153
    .line 154
    shr-long v4, v12, v4

    .line 155
    .line 156
    long-to-int v4, v4

    .line 157
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    invoke-virtual {v6, v4, v1, v2}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 162
    .line 163
    .line 164
    iget-object v4, v9, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 167
    .line 168
    and-long v5, v12, v19

    .line 169
    .line 170
    long-to-int v5, v5

    .line 171
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    invoke-virtual {v4, v5, v1, v2}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 176
    .line 177
    .line 178
    iget-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 181
    .line 182
    invoke-virtual {v1, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;)Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iput-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 187
    .line 188
    :cond_4
    new-instance v1, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 189
    .line 190
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 191
    .line 192
    .line 193
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 196
    .line 197
    iget-wide v4, v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:J

    .line 198
    .line 199
    invoke-virtual {v7, v4, v5}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 200
    .line 201
    .line 202
    move-result-wide v4

    .line 203
    invoke-virtual {v7, v4, v5}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    iput v0, v1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 208
    .line 209
    invoke-static {v0}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(F)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_5

    .line 214
    .line 215
    goto/16 :goto_6

    .line 216
    .line 217
    :cond_5
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 218
    .line 219
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 220
    .line 221
    .line 222
    const/16 v0, 0x1e

    .line 223
    .line 224
    const/4 v4, 0x0

    .line 225
    invoke-static {v4, v4, v0}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iput-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 230
    .line 231
    new-instance v0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;

    .line 232
    .line 233
    const/4 v8, 0x0

    .line 234
    move-object/from16 v5, p0

    .line 235
    .line 236
    move/from16 v4, p3

    .line 237
    .line 238
    move/from16 v6, p4

    .line 239
    .line 240
    const/4 v12, 0x1

    .line 241
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;-><init>(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;FLandroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;FLandroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 242
    .line 243
    .line 244
    iput-object v7, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->L$0:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v1, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->L$1:Ljava/lang/Object;

    .line 247
    .line 248
    iput v6, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->F$0:F

    .line 249
    .line 250
    iput v12, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->label:I

    .line 251
    .line 252
    invoke-virtual {v5, v0, v10}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏兰哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    if-ne v0, v11, :cond_6

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_6
    move-object v2, v1

    .line 260
    move v0, v6

    .line 261
    move-object v3, v7

    .line 262
    :goto_2
    iget-object v1, v9, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 265
    .line 266
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v4}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(F)F

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    iget-object v6, v9, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v6, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 276
    .line 277
    invoke-virtual {v6, v4}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(F)F

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    invoke-static {v1, v4}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 282
    .line 283
    .line 284
    move-result-wide v6

    .line 285
    const-wide/16 v8, 0x0

    .line 286
    .line 287
    cmp-long v1, v6, v8

    .line 288
    .line 289
    if-nez v1, :cond_9

    .line 290
    .line 291
    iget v1, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 292
    .line 293
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    const/high16 v4, 0x42c80000    # 100.0f

    .line 298
    .line 299
    div-float/2addr v1, v4

    .line 300
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    iget v1, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 305
    .line 306
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    invoke-virtual {v3, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    mul-float/2addr v1, v0

    .line 315
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 316
    .line 317
    mul-float/2addr v1, v0

    .line 318
    const/4 v4, 0x0

    .line 319
    cmpg-float v0, v1, v4

    .line 320
    .line 321
    if-nez v0, :cond_7

    .line 322
    .line 323
    move-wide v6, v8

    .line 324
    goto :goto_4

    .line 325
    :cond_7
    iget-object v0, v3, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/gestures/Orientation;

    .line 326
    .line 327
    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 328
    .line 329
    if-ne v0, v2, :cond_8

    .line 330
    .line 331
    invoke-static {v1, v4}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 332
    .line 333
    .line 334
    move-result-wide v0

    .line 335
    :goto_3
    move-wide v6, v0

    .line 336
    goto :goto_4

    .line 337
    :cond_8
    invoke-static {v4, v1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 338
    .line 339
    .line 340
    move-result-wide v0

    .line 341
    goto :goto_3

    .line 342
    :cond_9
    :goto_4
    iget-object v0, v5, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 343
    .line 344
    new-instance v1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 345
    .line 346
    invoke-direct {v1, v6, v7}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 347
    .line 348
    .line 349
    const/4 v2, 0x0

    .line 350
    iput-object v2, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->L$0:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v2, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->L$1:Ljava/lang/Object;

    .line 353
    .line 354
    iput v15, v10, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$1;->label:I

    .line 355
    .line 356
    invoke-interface {v0, v1, v10}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    if-ne v0, v11, :cond_a

    .line 361
    .line 362
    :goto_5
    return-object v11

    .line 363
    :cond_a
    :goto_6
    return-object v16
.end method

.method public static 飘花落叶言子楪苏世哲兰(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;)Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪世兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪世兰;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;I)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Landroidx/compose/foundation/gestures/NonTouchScrollingLogicKt$untilNull$1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/gestures/NonTouchScrollingLogicKt$untilNull$1;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世苏哲楪兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lkotlin/sequences/飘花落叶言子楪苏哲兰世;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-virtual {p0}, Lkotlin/sequences/飘花落叶言子楪苏哲兰世;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lkotlin/sequences/飘花落叶言子楪苏哲兰世;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    :goto_1
    move-object v1, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;)Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;J)Z
    .locals 6

    .line 1
    iget-object p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世兰哲苏:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 8
    .line 9
    invoke-virtual {p3, v1, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-virtual {p3, v3, v4}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏哲世兰(J)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v3, 0x0

    .line 18
    cmpg-float v4, v0, v3

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    cmpl-float v0, v0, v3

    .line 25
    .line 26
    iget-object p3, p3, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;

    .line 27
    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p3}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏()Z

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {p3}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲苏兰()Z

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    :goto_0
    if-eqz p3, :cond_2

    .line 40
    .line 41
    new-instance v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 42
    .line 43
    iget-object p1, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏楪世哲兰(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 50
    .line 51
    iget-wide v3, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:J

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;-><init>(JJZ)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 61
    .line 62
    invoke-interface {p0, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    instance-of p0, p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰哲世;

    .line 67
    .line 68
    xor-int/lit8 p0, p0, 0x1

    .line 69
    .line 70
    return p0

    .line 71
    :cond_2
    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:Z

    .line 72
    .line 73
    return p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;F)F
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世兰哲(F)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 14
    .line 15
    iget-object p2, p1, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏兰世哲:Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p1, p2, v0, v1, v2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;JI)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method
