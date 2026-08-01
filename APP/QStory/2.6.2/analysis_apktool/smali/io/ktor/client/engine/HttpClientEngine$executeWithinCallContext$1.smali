.class final Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls"
    f = "HttpClientEngine.kt"
    l = {
        0x5b,
        0x64
    }
    m = "executeWithinCallContext"
.end annotation


# instance fields
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
            "Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;",
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
    iput-object p1, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->label:I

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
    iput p1, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->label:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eq v1, v4, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    iget-object v1, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 52
    .line 53
    iget-object v4, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    if-nez v4, :cond_4

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 61
    .line 62
    new-instance v4, Lio/ktor/client/engine/飘花落叶言子楪世兰苏哲;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v4}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v4, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$2;

    .line 75
    .line 76
    invoke-direct {v4, v2, v1, v2}, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$2;-><init>(Lio/ktor/client/engine/飘花落叶言子楪世苏哲兰;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2, p1, v4, v3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子世苏哲兰楪;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object v2, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v2, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->L$1:Ljava/lang/Object;

    .line 86
    .line 87
    iput v3, p0, Lio/ktor/client/engine/HttpClientEngine$executeWithinCallContext$1;->label:I

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子世苏楪兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-ne p0, v0, :cond_3

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_3
    return-object p0

    .line 97
    :cond_4
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 98
    .line 99
    .line 100
    return-object v2

    .line 101
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    throw v2
.end method
