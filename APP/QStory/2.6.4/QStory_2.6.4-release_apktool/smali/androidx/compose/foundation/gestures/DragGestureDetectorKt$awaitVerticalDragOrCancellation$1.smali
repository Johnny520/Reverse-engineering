.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
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
    c = "androidx.compose.foundation.gestures.DragGestureDetectorKt"
    f = "DragGestureDetector.kt"
    l = {
        0x487
    }
    m = "awaitVerticalDragOrCancellation-rnUCldI"
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

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
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;",
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
    .locals 14

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    iput v0, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->label:I

    .line 9
    .line 10
    sget v2, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:F

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    iput v0, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->label:I

    .line 14
    .line 15
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_b

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-ne v0, v3, :cond_a

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 26
    .line 27
    iget-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 35
    .line 36
    iget-object v5, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x0

    .line 43
    move v8, v7

    .line 44
    :goto_0
    if-ge v8, v6, :cond_2

    .line 45
    .line 46
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    move-object v10, v9

    .line 51
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 52
    .line 53
    iget-wide v10, v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 54
    .line 55
    iget-wide v12, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 56
    .line 57
    invoke-static {v10, v11, v12, v13}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(JJ)Z

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    if-eqz v10, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object v9, v2

    .line 68
    :goto_1
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 69
    .line 70
    if-nez v9, :cond_3

    .line 71
    .line 72
    move-object v9, v2

    .line 73
    goto :goto_5

    .line 74
    :cond_3
    invoke-static {v9}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_7

    .line 79
    .line 80
    iget-object p1, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    :goto_2
    if-ge v7, v5, :cond_5

    .line 87
    .line 88
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    move-object v8, v6

    .line 93
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 94
    .line 95
    iget-boolean v8, v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 96
    .line 97
    if-eqz v8, :cond_4

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move-object v6, v2

    .line 104
    :goto_3
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 105
    .line 106
    if-nez v6, :cond_6

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_6
    iget-wide v5, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 110
    .line 111
    iput-wide v5, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-static {v9, v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 115
    .line 116
    .line 117
    move-result-wide v5

    .line 118
    const-wide v7, 0xffffffffL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    and-long/2addr v5, v7

    .line 124
    long-to-int p1, v5

    .line 125
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    const/4 v5, 0x0

    .line 130
    cmpg-float p1, p1, v5

    .line 131
    .line 132
    if-nez p1, :cond_8

    .line 133
    .line 134
    :goto_4
    iput-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v0, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 137
    .line 138
    iput v3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->label:I

    .line 139
    .line 140
    invoke-static {v4, p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-ne p1, v1, :cond_0

    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_8
    :goto_5
    if-eqz v9, :cond_9

    .line 148
    .line 149
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-nez p0, :cond_9

    .line 154
    .line 155
    return-object v9

    .line 156
    :cond_9
    return-object v2

    .line 157
    :cond_a
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 158
    .line 159
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object v2

    .line 163
    :cond_b
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    throw v2
.end method
