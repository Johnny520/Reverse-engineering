.class final Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;
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
    c = "top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect$startSpringAnimationY$1"
    f = "OverscrollFactory.kt"
    l = {
        0xb9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $initialVelocity:F

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;FLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/yukonga/miuix/kmp/utils/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
            "F",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    iput p2, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->$initialVelocity:F

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;J)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

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
    sub-long v0, p2, v0

    .line 14
    .line 15
    long-to-float v0, v0

    .line 16
    const v1, 0x4e6e6b28    # 1.0E9f

    .line 17
    .line 18
    .line 19
    div-float/2addr v0, v1

    .line 20
    iput-wide p2, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 21
    .line 22
    iget-object p0, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲(F)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    iget-object p2, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;

    .line 29
    .line 30
    iget-wide p2, p2, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 31
    .line 32
    double-to-float p2, p2

    .line 33
    invoke-virtual {p1, p2}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(F)V

    .line 34
    .line 35
    .line 36
    iget p2, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:F

    .line 37
    .line 38
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iget p3, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:F

    .line 43
    .line 44
    iget v0, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:F

    .line 45
    .line 46
    invoke-static {p3, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰(FF)F

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    mul-float/2addr p3, p2

    .line 51
    iput p3, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:F

    .line 52
    .line 53
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
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
    new-instance v0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;

    .line 2
    .line 3
    iget-object v1, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    iget p0, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->$initialVelocity:F

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;-><init>(Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;FLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v5, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->L$1:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_2

    .line 27
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 38
    .line 39
    iget-object v2, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;

    .line 40
    .line 41
    iget p1, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:F

    .line 42
    .line 43
    iget v6, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->$initialVelocity:F

    .line 44
    .line 45
    invoke-virtual {v2, p1, v6}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(FF)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 49
    .line 50
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 51
    .line 52
    .line 53
    const-wide/16 v6, -0x1

    .line 54
    .line 55
    iput-wide v6, p1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    :goto_0
    if-nez v2, :cond_4

    .line 59
    .line 60
    :try_start_1
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    iget-object v6, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 67
    .line 68
    new-instance v7, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪世兰哲苏;

    .line 69
    .line 70
    invoke-direct {v7, p1, v6, v5}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪世兰哲苏;-><init>(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;I)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object p1, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    iput v2, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->I$0:I

    .line 78
    .line 79
    iput v5, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->label:I

    .line 80
    .line 81
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {v2, v7, p0}, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-ne v2, v1, :cond_2

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_2
    move-object v8, v2

    .line 97
    move-object v2, p1

    .line 98
    move-object p1, v8

    .line 99
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    move-object v8, v2

    .line 106
    move v2, p1

    .line 107
    move-object p1, v8

    .line 108
    goto :goto_0

    .line 109
    :goto_2
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 110
    .line 111
    iget v0, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:F

    .line 112
    .line 113
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-object v1, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    cmpg-float v0, v0, v4

    .line 123
    .line 124
    if-gtz v0, :cond_3

    .line 125
    .line 126
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 127
    .line 128
    invoke-virtual {p0, v3}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(F)V

    .line 129
    .line 130
    .line 131
    iput v3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:F

    .line 132
    .line 133
    :cond_3
    throw p1

    .line 134
    :cond_4
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 135
    .line 136
    iget p1, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:F

    .line 137
    .line 138
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    cmpg-float p1, p1, v4

    .line 148
    .line 149
    if-gtz p1, :cond_5

    .line 150
    .line 151
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/MiuixOverscrollEffect$startSpringAnimationY$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;

    .line 152
    .line 153
    invoke-virtual {p0, v3}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(F)V

    .line 154
    .line 155
    .line 156
    iput v3, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:F

    .line 157
    .line 158
    :cond_5
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 159
    .line 160
    return-object p0
.end method
