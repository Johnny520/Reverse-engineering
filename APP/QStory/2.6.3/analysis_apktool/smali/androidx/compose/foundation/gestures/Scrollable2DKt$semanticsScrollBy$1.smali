.class final Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;
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
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.Scrollable2DKt"
    f = "Scrollable2D.kt"
    l = {
        0x202
    }
    m = "semanticsScrollBy-d-4ec7I"
    v = 0x1
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
            "Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;",
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
    .locals 5

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->label:I

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
    iput p1, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v0, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->label:I

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
    iget-object p0, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-wide p0, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 44
    .line 45
    new-instance v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    invoke-direct {v0, p0, p1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 61
    .line 62
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 63
    .line 64
    .line 65
    const-wide/16 v3, 0x0

    .line 66
    .line 67
    iput-wide v3, p1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 68
    .line 69
    sget-object v0, Landroidx/compose/foundation/MutatePriority;->Default:Landroidx/compose/foundation/MutatePriority;

    .line 70
    .line 71
    new-instance v0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$2;

    .line 72
    .line 73
    invoke-direct {v0, v3, v4, p1, v1}, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$2;-><init>(JLkotlin/jvm/internal/Ref$LongRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    iput v2, p0, Landroidx/compose/foundation/gestures/Scrollable2DKt$semanticsScrollBy$1;->label:I

    .line 79
    .line 80
    throw v1
.end method
