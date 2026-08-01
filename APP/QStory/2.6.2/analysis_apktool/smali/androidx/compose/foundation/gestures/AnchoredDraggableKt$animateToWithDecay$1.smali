.class final Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

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
    c = "androidx.compose.foundation.gestures.AnchoredDraggableKt"
    f = "AnchoredDraggable.kt"
    l = {
        0x586
    }
    m = "animateToWithDecay"
    v = 0x1
.end annotation


# instance fields
.field F$0:F

.field L$0:Ljava/lang/Object;

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
            "Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;",
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
    .locals 10

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->label:I

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
    iput p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->label:I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-ne v0, v2, :cond_1

    .line 35
    .line 36
    iget v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->F$0:F

    .line 37
    .line 38
    iget-object p0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget p0, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 46
    .line 47
    sub-float/2addr v0, p0

    .line 48
    new-instance p0, Ljava/lang/Float;

    .line 49
    .line 50
    invoke-direct {p0, v0}, Ljava/lang/Float;-><init>(F)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v7, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 64
    .line 65
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 66
    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    iput v5, v7, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 70
    .line 71
    new-instance v3, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    invoke-direct/range {v3 .. v9}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世哲兰;FLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 78
    .line 79
    .line 80
    iput-object v7, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput v5, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->F$0:F

    .line 83
    .line 84
    iput v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$1;->label:I

    .line 85
    .line 86
    sget-object p0, Landroidx/compose/foundation/MutatePriority;->Default:Landroidx/compose/foundation/MutatePriority;

    .line 87
    .line 88
    throw v1
.end method
