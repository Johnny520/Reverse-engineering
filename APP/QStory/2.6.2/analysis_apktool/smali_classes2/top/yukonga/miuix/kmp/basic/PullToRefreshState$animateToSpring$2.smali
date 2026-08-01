.class final Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
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
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "top.yukonga.miuix.kmp.basic.PullToRefreshState$animateToSpring$2"
    f = "PullToRefresh.kt"
    l = {
        0x11c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $targetValue:F

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世楪苏哲兰;


# direct methods
.method public constructor <init>(Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世楪苏哲兰;FLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/yukonga/miuix/kmp/basic/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            "F",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p2, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->$targetValue:F

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世楪苏哲兰;J)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long p1, v0, v2

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iput-wide p2, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    iput-wide p2, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lkotlin/jvm/internal/Ref$LongRef;J)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世楪苏哲兰;J)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
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
    new-instance v0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget p0, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->$targetValue:F

    .line 5
    .line 6
    invoke-direct {v0, v1, p0, p2}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;-><init>(Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世楪苏哲兰;FLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, v0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->L$0:Ljava/lang/Object;

    .line 10
    .line 11
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_6

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-ne v2, v4, :cond_5

    .line 14
    .line 15
    iget v2, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->I$0:I

    .line 16
    .line 17
    iget-object v5, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->L$1:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    new-instance p1, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子楪兰哲苏世;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {p1, v5, v6}, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    iput-object v5, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    iput v2, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->I$0:I

    .line 50
    .line 51
    iput v4, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshState$animateToSpring$2;->label:I

    .line 52
    .line 53
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-static {v6}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-interface {v6, p1, p0}, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-ne p1, v1, :cond_0

    .line 66
    .line 67
    return-object v1

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 71
    .line 72
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    throw v3

    .line 76
    :goto_1
    if-eqz v2, :cond_4

    .line 77
    .line 78
    throw v3

    .line 79
    :cond_4
    throw p0

    .line 80
    :cond_5
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object v3

    .line 86
    :cond_6
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw v3
.end method
