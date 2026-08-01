.class final Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;
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
    c = "io.modelcontextprotocol.kotlin.sdk.client.Client"
    f = "Client.kt"
    l = {
        0x52,
        0x5a,
        0x65,
        0x67
    }
    m = "connect$suspendImpl"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/modelcontextprotocol/kotlin/sdk/client/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->this$0:Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->label:I

    .line 9
    .line 10
    const-string v1, "Server\'s protocol version is not supported: "

    .line 11
    .line 12
    and-int v2, p1, v0

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sub-int/2addr p1, v0

    .line 18
    iput p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->label:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;

    .line 22
    .line 23
    invoke-direct {p1, v3, p0}, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;-><init>(Lio/modelcontextprotocol/kotlin/sdk/client/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 24
    .line 25
    .line 26
    move-object p0, p1

    .line 27
    :goto_0
    iget-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v0, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->label:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v0, :cond_7

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    if-eq v0, v2, :cond_6

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    if-eq v0, v2, :cond_4

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    if-eq v0, v1, :cond_3

    .line 44
    .line 45
    if-ne v0, v4, :cond_2

    .line 46
    .line 47
    iget-object p0, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Ljava/lang/Throwable;

    .line 50
    .line 51
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 55
    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    const-string p1, "Error connecting to transport: "

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v3

    .line 68
    :cond_1
    throw p0

    .line 69
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v3

    .line 75
    :cond_3
    iget-object v0, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 84
    .line 85
    return-object p0

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    iget-object v0, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    check-cast p1, L飘花落叶言世子苏哲楪兰/飘花落叶言子苏兰哲楪世;

    .line 97
    .line 98
    sget-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言世楪子苏哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 99
    .line 100
    iget-object v2, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v2, v0}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    throw v3

    .line 109
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    new-instance v2, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    :cond_6
    iget-object v0, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :try_start_2
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    :goto_1
    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->L$0:Ljava/lang/Object;

    .line 139
    .line 140
    iput v4, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->label:I

    .line 141
    .line 142
    throw v3

    .line 143
    :cond_7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iput-object v3, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    iput v2, p0, Lio/modelcontextprotocol/kotlin/sdk/client/Client$connect$1;->label:I

    .line 149
    .line 150
    throw v3
.end method
