.class final Landroidx/compose/animation/core/Transition$animateTo$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.animation.core.Transition$animateTo$1$1$1"
    f = "Transition.kt"
    l = {
        0x4c6
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field F$0:F

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/animation/core/Transition$animateTo$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->this$0:Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;FJ)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪苏世哲兰:Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲世苏兰()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const-wide/high16 v4, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long v0, v2, v4

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, p2, p3}, Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲苏世兰(J)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子苏兰楪世哲;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/compose/animation/core/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 25
    .line 26
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲世苏兰()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sub-long/2addr p2, v0

    .line 38
    const/4 v0, 0x0

    .line 39
    cmpg-float v0, p1, v0

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    long-to-double p2, p2

    .line 45
    float-to-double v1, p1

    .line 46
    div-double/2addr p2, v1

    .line 47
    invoke-static {p2, p3}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲兰苏(D)J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    :goto_0
    iget-object p1, p0, Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;

    .line 52
    .line 53
    if-nez p1, :cond_2

    .line 54
    .line 55
    iget-object p1, p0, Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;

    .line 56
    .line 57
    invoke-virtual {p1, p2, p3}, Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪哲苏世兰(J)V

    .line 58
    .line 59
    .line 60
    :cond_2
    if-nez v0, :cond_3

    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    const/4 p1, 0x0

    .line 65
    :goto_1
    invoke-virtual {p0, p2, p3, p1}, Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪苏世兰哲(JZ)V

    .line 66
    .line 67
    .line 68
    :cond_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 69
    .line 70
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;FJ)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->invokeSuspend$lambda$0(Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;FJ)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->this$0:Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;-><init>(Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget v1, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->F$0:F

    .line 11
    .line 12
    iget-object v3, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->L$0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 33
    .line 34
    invoke-interface {p1}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子苏兰哲楪世()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    move-object v3, p1

    .line 43
    :cond_2
    :goto_0
    invoke-static {v3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏兰哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    iget-object p1, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->this$0:Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;

    .line 50
    .line 51
    new-instance v4, Landroidx/compose/animation/core/飘花落叶言子苏哲楪世兰;

    .line 52
    .line 53
    invoke-direct {v4, p1, v1}, Landroidx/compose/animation/core/飘花落叶言子苏哲楪世兰;-><init>(Landroidx/compose/animation/core/飘花落叶言子苏哲世楪兰;F)V

    .line 54
    .line 55
    .line 56
    iput-object v3, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    iput v1, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->F$0:F

    .line 59
    .line 60
    iput v2, p0, Landroidx/compose/animation/core/Transition$animateTo$1$1$1;->label:I

    .line 61
    .line 62
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {p1, v4, p0}, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏兰世楪哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_2

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 78
    .line 79
    return-object p0
.end method
