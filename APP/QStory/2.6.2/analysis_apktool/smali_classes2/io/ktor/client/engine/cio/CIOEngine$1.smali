.class final Lio/ktor/client/engine/cio/CIOEngine$1;
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
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.engine.cio.CIOEngine$1"
    f = "CIOEngine.kt"
    l = {
        0x43,
        0x46,
        0x46
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $requestJob:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

.field final synthetic $selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u696a\u5170\u54f2;",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/engine/cio/CIOEngine$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$requestJob:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

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
    new-instance p1, Lio/ktor/client/engine/cio/CIOEngine$1;

    .line 2
    .line 3
    iget-object v0, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$requestJob:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 4
    .line 5
    iget-object p0, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lio/ktor/client/engine/cio/CIOEngine$1;-><init>(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/engine/cio/CIOEngine$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/engine/cio/CIOEngine$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/engine/cio/CIOEngine$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/engine/cio/CIOEngine$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->label:I

    .line 4
    .line 5
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v5, :cond_2

    .line 13
    .line 14
    if-eq v1, v4, :cond_1

    .line 15
    .line 16
    if-eq v1, v3, :cond_0

    .line 17
    .line 18
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_0
    iget-object p0, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/lang/Throwable;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :try_start_1
    iget-object p1, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$requestJob:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 47
    .line 48
    iput v5, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->label:I

    .line 49
    .line 50
    invoke-interface {p1, p0}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    if-ne p1, v0, :cond_4

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    :goto_0
    iget-object p1, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 58
    .line 59
    check-cast p1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    invoke-virtual {p1}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->close()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 65
    .line 66
    check-cast p1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 67
    .line 68
    iget-object p1, p1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 69
    .line 70
    invoke-interface {p1, v2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 78
    .line 79
    iput v4, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->label:I

    .line 80
    .line 81
    invoke-interface {p1, p0}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v0, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 89
    .line 90
    return-object p0

    .line 91
    :goto_2
    iget-object v1, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 92
    .line 93
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 94
    .line 95
    invoke-virtual {v1}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->close()V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 99
    .line 100
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 101
    .line 102
    iget-object v1, v1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 103
    .line 104
    invoke-interface {v1, v2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 112
    .line 113
    iput-object p1, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput v3, p0, Lio/ktor/client/engine/cio/CIOEngine$1;->label:I

    .line 116
    .line 117
    invoke-interface {v1, p0}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v0, :cond_6

    .line 122
    .line 123
    :goto_3
    return-object v0

    .line 124
    :cond_6
    move-object p0, p1

    .line 125
    :goto_4
    throw p0
.end method
