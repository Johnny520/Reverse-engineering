.class final Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;
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
    c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt"
    f = "SnapFlingBehavior.kt"
    l = {
        0x15d
    }
    m = "animateWithTarget"
    v = 0x1
.end annotation


# instance fields
.field F$0:F

.field F$1:F

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
            "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;",
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
    .locals 6

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->label:I

    .line 9
    .line 10
    and-int v1, p1, v0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iput p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v0, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->label:I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-ne v0, v2, :cond_4

    .line 35
    .line 36
    iget v0, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->F$1:F

    .line 37
    .line 38
    iget v1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->F$0:F

    .line 39
    .line 40
    iget-object v3, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->L$1:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 43
    .line 44
    iget-object p0, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt$animateWithTarget$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/4 v4, 0x0

    .line 62
    cmpg-float v5, v0, v4

    .line 63
    .line 64
    if-nez v5, :cond_1

    .line 65
    .line 66
    move v0, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    cmpl-float v5, v0, v4

    .line 69
    .line 70
    if-lez v5, :cond_2

    .line 71
    .line 72
    cmpl-float v5, p1, v0

    .line 73
    .line 74
    if-lez v5, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    cmpg-float v5, p1, v0

    .line 78
    .line 79
    if-gez v5, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move v0, p1

    .line 83
    :goto_1
    new-instance p1, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 84
    .line 85
    iget v3, v3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 86
    .line 87
    sub-float/2addr v1, v3

    .line 88
    new-instance v3, Ljava/lang/Float;

    .line 89
    .line 90
    invoke-direct {v3, v1}, Ljava/lang/Float;-><init>(F)V

    .line 91
    .line 92
    .line 93
    const/16 v1, 0x1d

    .line 94
    .line 95
    invoke-static {p0, v4, v0, v1}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 96
    .line 97
    .line 98
    invoke-direct {p1, v2}, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 103
    .line 104
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    new-instance p0, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 112
    .line 113
    invoke-direct {p0}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 114
    .line 115
    .line 116
    throw v1
.end method
