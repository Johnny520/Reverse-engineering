.class final Landroidx/compose/material3/SliderKt$awaitSlop$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.material3.SliderKt"
    f = "Slider.kt"
    l = {
        0x88c
    }
    m = "awaitSlop-8vUncbI"
.end annotation


# instance fields
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
            "Landroidx/compose/material3/SliderKt$awaitSlop$1;",
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
    iput-object p1, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 9
    .line 10
    sget v1, Landroidx/compose/material3/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏哲兰:I

    .line 11
    .line 12
    and-int v1, p1, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p1, v0

    .line 17
    iput p1, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Landroidx/compose/material3/SliderKt$awaitSlop$1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Landroidx/compose/material3/SliderKt$awaitSlop$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    move-object p0, p1

    .line 26
    :goto_0
    iget-object p1, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 29
    .line 30
    iget v1, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 56
    .line 57
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;

    .line 61
    .line 62
    const/4 v4, 0x2

    .line 63
    invoke-direct {v1, p1, v4}, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput v3, p0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 69
    .line 70
    invoke-static {v1, p0}, Landroidx/compose/material3/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v0, :cond_3

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_3
    move-object v5, p1

    .line 78
    move-object p1, p0

    .line 79
    move-object p0, v5

    .line 80
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    iget p0, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 85
    .line 86
    new-instance v0, Ljava/lang/Float;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Ljava/lang/Float;-><init>(F)V

    .line 89
    .line 90
    .line 91
    new-instance p0, Lkotlin/Pair;

    .line 92
    .line 93
    invoke-direct {p0, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_4
    return-object v2
.end method
