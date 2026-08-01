.class final Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$3;
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
    c = "androidx.compose.foundation.gestures.ScrollExtensionsKt"
    f = "ScrollExtensions.kt"
    l = {
        0x3e
    }
    m = "animateScrollBy-ubNVwUQ"
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
            "Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$3;",
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
    .locals 9

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$3;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$3;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$3;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$3;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-wide p0, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 27
    .line 28
    new-instance v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    invoke-direct {v0, p0, p1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v7, Lkotlin/jvm/internal/Ref$LongRef;

    .line 44
    .line 45
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 46
    .line 47
    .line 48
    const-wide/16 v3, 0x0

    .line 49
    .line 50
    iput-wide v3, v7, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 51
    .line 52
    new-instance v3, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$4;

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-direct/range {v3 .. v8}, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$4;-><init>(JLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 59
    .line 60
    .line 61
    iput-object v7, p0, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$3;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput v2, p0, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$animateScrollBy$3;->label:I

    .line 64
    .line 65
    sget-object p0, Landroidx/compose/foundation/MutatePriority;->Default:Landroidx/compose/foundation/MutatePriority;

    .line 66
    .line 67
    throw v1
.end method
