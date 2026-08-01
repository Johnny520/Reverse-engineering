.class final Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3"
    f = "StdioClientTransport.kt"
    l = {
        0x58,
        0x59
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $outputStream:Lkotlinx/io/飘花落叶言子楪苏哲兰世;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世哲兰苏;Lkotlinx/io/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/modelcontextprotocol/kotlin/sdk/client/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Lkotlinx/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->$outputStream:Lkotlinx/io/飘花落叶言子楪苏哲兰世;

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
    new-instance v0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->$outputStream:Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 5
    .line 6
    invoke-direct {v0, v1, p0, p2}, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;-><init>(Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世哲兰苏;Lkotlinx/io/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, v0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->L$0:Ljava/lang/Object;

    .line 10
    .line 11
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->label:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v4

    .line 20
    :cond_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    iget-object v1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 38
    .line 39
    new-instance v1, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3$readJob$1;

    .line 40
    .line 41
    invoke-direct {v1, v4, v4}, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3$readJob$1;-><init>(Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x3

    .line 45
    invoke-static {p1, v4, v4, v1, v5}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v6, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3$writeJob$1;

    .line 50
    .line 51
    iget-object v7, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->$outputStream:Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 52
    .line 53
    invoke-direct {v6, v4, v7, v4}, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3$writeJob$1;-><init>(Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世哲兰苏;Lkotlinx/io/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v4, v4, v6, v5}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput v3, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->label:I

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪哲兰苏世(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-ne v1, v0, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    move-object v1, p1

    .line 72
    :goto_0
    iput-object v4, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    iput v2, p0, Lio/modelcontextprotocol/kotlin/sdk/client/StdioClientTransport$start$3;->label:I

    .line 75
    .line 76
    invoke-static {v1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰世哲(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v0, :cond_4

    .line 81
    .line 82
    :goto_1
    return-object v0

    .line 83
    :cond_4
    :goto_2
    throw v4
.end method
