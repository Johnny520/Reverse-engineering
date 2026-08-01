.class final Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;
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
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "top.yukonga.miuix.kmp.utils.OverscrollNode$startSpringAnimation$1"
    f = "Overscroll.kt"
    l = {
        0xe3
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

.field final synthetic this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;FLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/yukonga/miuix/kmp/utils/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            "F",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    iput p2, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->$initialVelocity:F

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

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;J)Z
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
    iget-object p0, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰楪哲:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(F)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    iget-object p2, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰楪哲:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;

    .line 29
    .line 30
    iget-wide p2, p2, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:D

    .line 31
    .line 32
    double-to-float p2, p2

    .line 33
    invoke-virtual {p1, p2}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪苏哲世(F)V

    .line 34
    .line 35
    .line 36
    iget p2, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 37
    .line 38
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iget p3, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 43
    .line 44
    iget v0, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏兰楪:F

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
    iput p3, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰:F

    .line 52
    .line 53
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$LongRef;Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;J)Z

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
    new-instance v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;

    .line 2
    .line 3
    iget-object v1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    iget p0, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->$initialVelocity:F

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;-><init>(Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;FLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->L$1:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 36
    .line 37
    iget-object v2, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰楪哲:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;

    .line 38
    .line 39
    iget p1, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 40
    .line 41
    iget v5, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->$initialVelocity:F

    .line 42
    .line 43
    invoke-virtual {v2, p1, v5}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰(FF)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 47
    .line 48
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 49
    .line 50
    .line 51
    const-wide/16 v5, -0x1

    .line 52
    .line 53
    iput-wide v5, p1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 54
    .line 55
    move-object v2, p1

    .line 56
    move p1, v3

    .line 57
    :goto_0
    if-nez p1, :cond_4

    .line 58
    .line 59
    :try_start_1
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏兰哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    iget-object v5, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 66
    .line 67
    new-instance v6, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏世哲;

    .line 68
    .line 69
    invoke-direct {v6, v2, v3, v5}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v2, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    iput p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->I$0:I

    .line 77
    .line 78
    iput v4, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->label:I

    .line 79
    .line 80
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {p1, v6, p0}, Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏兰世楪哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v1, :cond_2

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_2
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    goto :goto_0

    .line 102
    :goto_2
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 103
    .line 104
    iget v0, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 105
    .line 106
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 111
    .line 112
    iget v1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:F

    .line 113
    .line 114
    cmpg-float v0, v0, v1

    .line 115
    .line 116
    if-gtz v0, :cond_3

    .line 117
    .line 118
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪苏世哲()V

    .line 119
    .line 120
    .line 121
    :cond_3
    throw p1

    .line 122
    :cond_4
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 123
    .line 124
    iget p1, p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪兰苏:F

    .line 125
    .line 126
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$startSpringAnimation$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 131
    .line 132
    iget v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰:F

    .line 133
    .line 134
    cmpg-float p1, p1, v0

    .line 135
    .line 136
    if-gtz p1, :cond_5

    .line 137
    .line 138
    invoke-virtual {p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子兰楪苏世哲()V

    .line 139
    .line 140
    .line 141
    :cond_5
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 142
    .line 143
    return-object p0
.end method
