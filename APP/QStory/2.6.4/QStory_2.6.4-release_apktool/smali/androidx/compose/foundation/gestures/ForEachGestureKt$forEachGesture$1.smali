.class final Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.ForEachGestureKt"
    f = "ForEachGesture.kt"
    l = {
        0x30,
        0x33,
        0x38
    }
    m = "forEachGesture"
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;",
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
    .locals 11

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    sget-object v2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x3

    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x1

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    if-eq v0, v6, :cond_3

    .line 22
    .line 23
    if-eq v0, v5, :cond_1

    .line 24
    .line 25
    if-ne v0, v4, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$2:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 30
    .line 31
    iget-object v7, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v7, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 34
    .line 35
    iget-object v8, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 52
    .line 53
    iget-object v7, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 56
    .line 57
    iget-object v8, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;

    .line 60
    .line 61
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    move-object p1, v0

    .line 65
    move-object v0, v7

    .line 66
    move-object v7, v8

    .line 67
    goto :goto_1

    .line 68
    :catch_0
    move-exception p1

    .line 69
    goto :goto_4

    .line 70
    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$2:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 73
    .line 74
    iget-object v7, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v7, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 77
    .line 78
    iget-object v8, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;

    .line 81
    .line 82
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    move-object v0, v3

    .line 94
    move-object v7, v0

    .line 95
    :goto_1
    invoke-static {p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_9

    .line 100
    .line 101
    :try_start_2
    iput-object v7, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v0, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p1, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    iput v6, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->label:I

    .line 108
    .line 109
    invoke-interface {v0, v7, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 113
    if-ne v8, v1, :cond_5

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_5
    move-object v8, v7

    .line 117
    move-object v7, v0

    .line 118
    move-object v0, p1

    .line 119
    :goto_2
    :try_start_3
    iput-object v8, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$0:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v7, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v0, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$2:Ljava/lang/Object;

    .line 124
    .line 125
    iput v5, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->label:I

    .line 126
    .line 127
    new-instance p1, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$2;

    .line 128
    .line 129
    invoke-direct {p1, v3}, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 130
    .line 131
    .line 132
    move-object v9, v8

    .line 133
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 134
    .line 135
    invoke-virtual {v9, p1, p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子哲兰世苏楪(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    sget-object v9, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 140
    .line 141
    if-ne p1, v9, :cond_6

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    move-object p1, v2

    .line 145
    :goto_3
    if-ne p1, v1, :cond_2

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :catch_1
    move-exception v8

    .line 149
    move-object v10, v0

    .line 150
    move-object v0, p1

    .line 151
    move-object p1, v8

    .line 152
    move-object v8, v7

    .line 153
    move-object v7, v10

    .line 154
    :goto_4
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-eqz v9, :cond_8

    .line 159
    .line 160
    iput-object v8, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$0:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v7, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$1:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object v0, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->L$2:Ljava/lang/Object;

    .line 165
    .line 166
    iput v4, p0, Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;->label:I

    .line 167
    .line 168
    new-instance p1, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$2;

    .line 169
    .line 170
    invoke-direct {p1, v3}, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 171
    .line 172
    .line 173
    move-object v9, v8

    .line 174
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 175
    .line 176
    invoke-virtual {v9, p1, p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子哲兰世苏楪(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    sget-object v9, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 181
    .line 182
    if-ne p1, v9, :cond_7

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_7
    move-object p1, v2

    .line 186
    :goto_5
    if-ne p1, v1, :cond_2

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_8
    throw p1

    .line 190
    :cond_9
    move-object v1, v2

    .line 191
    :goto_6
    return-object v1
.end method
