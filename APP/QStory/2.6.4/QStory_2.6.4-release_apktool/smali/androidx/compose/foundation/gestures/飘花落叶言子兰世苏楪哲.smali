.class public final Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;


# instance fields
.field public 飘花落叶言子楪世兰苏哲:F

.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

.field public 飘花落叶言子楪世苏兰哲:J

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子苏兰哲楪世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Landroidx/compose/animation/core/飘花落叶言子苏兰世哲楪;

    .line 5
    .line 6
    invoke-interface {p1, v0}, Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/animation/core/飘花落叶言子苏兰世楪哲;)Landroidx/compose/animation/core/飘花落叶言子苏兰哲楪世;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子苏兰哲楪世;

    .line 11
    .line 12
    const-wide/high16 v0, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世苏兰哲:J

    .line 15
    .line 16
    sget-object p1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/飘花落叶言子楪哲兰苏世;Landroidx/compose/foundation/gestures/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;

    .line 11
    .line 12
    iget v3, v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->label:I

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
    iput v3, v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v4, v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    sget-object v6, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 37
    .line 38
    const-wide/high16 v7, -0x8000000000000000L

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v10, 0x2

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v12, 0x1

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    if-eq v4, v12, :cond_2

    .line 47
    .line 48
    if-ne v4, v10, :cond_1

    .line 49
    .line 50
    iget-object v2, v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 53
    .line 54
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v5

    .line 68
    :cond_2
    iget v4, v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->F$0:F

    .line 69
    .line 70
    iget-object v13, v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v13, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    iget-object v14, v2, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v14, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 77
    .line 78
    :try_start_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    .line 81
    move v0, v4

    .line 82
    move-object v4, v2

    .line 83
    move-object v2, v13

    .line 84
    move v13, v0

    .line 85
    move-object v0, v14

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v0, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世哲兰苏:Z

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    const-string v0, "animateToZero called while previous animation is running"

    .line 95
    .line 96
    invoke-static {v0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-interface {v2}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v4, Landroidx/compose/ui/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪世苏兰哲;

    .line 104
    .line 105
    invoke-interface {v0, v4}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲兰世苏;

    .line 110
    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    invoke-interface {v0}, Landroidx/compose/ui/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏楪哲世兰()F

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    goto :goto_1

    .line 118
    :cond_5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 119
    .line 120
    :goto_1
    iput-boolean v12, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世哲兰苏:Z

    .line 121
    .line 122
    move v13, v0

    .line 123
    move-object v4, v2

    .line 124
    move-object/from16 v0, p1

    .line 125
    .line 126
    move-object/from16 v2, p2

    .line 127
    .line 128
    :cond_6
    :try_start_2
    iget v14, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世兰苏哲:F

    .line 129
    .line 130
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 131
    .line 132
    .line 133
    move-result v14

    .line 134
    const v15, 0x3c23d70a    # 0.01f

    .line 135
    .line 136
    .line 137
    cmpg-float v14, v14, v15

    .line 138
    .line 139
    if-gez v14, :cond_7

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_7
    new-instance v14, Landroidx/compose/foundation/gestures/飘花落叶言子兰世楪哲苏;

    .line 143
    .line 144
    invoke-direct {v14, v1, v13, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子兰世楪哲苏;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;FL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 145
    .line 146
    .line 147
    iput-object v0, v4, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v2, v4, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->L$1:Ljava/lang/Object;

    .line 150
    .line 151
    iput v13, v4, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->F$0:F

    .line 152
    .line 153
    iput v12, v4, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->label:I

    .line 154
    .line 155
    invoke-interface {v4}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 156
    .line 157
    .line 158
    move-result-object v15

    .line 159
    invoke-static {v15}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    invoke-interface {v15, v14, v4}, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏兰世楪哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    if-ne v14, v3, :cond_8

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_8
    :goto_2
    invoke-interface {v2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    cmpg-float v14, v13, v9

    .line 174
    .line 175
    if-nez v14, :cond_6

    .line 176
    .line 177
    :goto_3
    iget v12, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世兰苏哲:F

    .line 178
    .line 179
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    cmpg-float v9, v12, v9

    .line 184
    .line 185
    if-nez v9, :cond_9

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    new-instance v9, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪世兰;

    .line 189
    .line 190
    invoke-direct {v9, v1, v10, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪世兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iput-object v2, v4, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->L$0:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v5, v4, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->L$1:Ljava/lang/Object;

    .line 196
    .line 197
    iput v10, v4, Landroidx/compose/foundation/gestures/UpdatableAnimationState$animateToZero$1;->label:I

    .line 198
    .line 199
    invoke-interface {v4}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-interface {v0, v9, v4}, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏兰世楪哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-ne v0, v3, :cond_a

    .line 212
    .line 213
    :goto_4
    return-object v3

    .line 214
    :cond_a
    :goto_5
    invoke-interface {v2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 215
    .line 216
    .line 217
    :goto_6
    iput-wide v7, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世苏兰哲:J

    .line 218
    .line 219
    iput-object v6, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 220
    .line 221
    iput-boolean v11, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世哲兰苏:Z

    .line 222
    .line 223
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 224
    .line 225
    return-object v0

    .line 226
    :goto_7
    iput-wide v7, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世苏兰哲:J

    .line 227
    .line 228
    iput-object v6, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 229
    .line 230
    iput-boolean v11, v1, Landroidx/compose/foundation/gestures/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世哲兰苏:Z

    .line 231
    .line 232
    throw v0
.end method
