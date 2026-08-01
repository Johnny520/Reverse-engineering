.class final Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/ktor/client/plugins/api/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "request",
        "Lio/ktor/client/call/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "<anonymous>",
        "(Lio/ktor/client/plugins/api/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;)Lio/ktor/client/call/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1"
    f = "HttpTimeout.kt"
    l = {
        0x90,
        0xaf
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $connectTimeoutMillis:Ljava/lang/Long;

.field final synthetic $requestTimeoutMillis:Ljava/lang/Long;

.field final synthetic $socketTimeoutMillis:Ljava/lang/Long;

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$requestTimeoutMillis:Ljava/lang/Long;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$connectTimeoutMillis:Ljava/lang/Long;

    .line 4
    .line 5
    iput-object p3, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$socketTimeoutMillis:Ljava/lang/Long;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invokeSuspend$lambda$1$lambda$0(Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;Ljava/lang/Throwable;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-interface {p0, p1}, Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;Ljava/lang/Throwable;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->invokeSuspend$lambda$1$lambda$0(Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;Ljava/lang/Throwable;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final invoke(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/client/plugins/api/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/call/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$requestTimeoutMillis:Ljava/lang/Long;

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$connectTimeoutMillis:Ljava/lang/Long;

    .line 6
    .line 7
    iget-object p0, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$socketTimeoutMillis:Ljava/lang/Long;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p3}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p2, v0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->L$1:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23
    check-cast p1, Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;

    check-cast p2, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->invoke(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->label:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    if-nez p1, :cond_c

    .line 34
    .line 35
    iget-object p1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->L$1:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;

    .line 38
    .line 39
    iget-object v0, p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏兰楪哲;

    .line 40
    .line 41
    invoke-virtual {v0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰()L飘花落叶言楪兰苏世子哲/飘花落叶言子世哲楪苏兰;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 49
    .line 50
    const-string v4, "ws"

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_b

    .line 57
    .line 58
    const-string v4, "wss"

    .line 59
    .line 60
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_b

    .line 65
    .line 66
    iget-object v0, p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 67
    .line 68
    instance-of v4, v0, Lio/ktor/client/plugins/websocket/飘花落叶言子楪世苏兰哲;

    .line 69
    .line 70
    if-nez v4, :cond_b

    .line 71
    .line 72
    instance-of v0, v0, Lio/ktor/client/plugins/sse/飘花落叶言子楪世哲兰苏;

    .line 73
    .line 74
    if-nez v0, :cond_b

    .line 75
    .line 76
    iget-object v0, p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 77
    .line 78
    sget-object v2, Lio/ktor/client/engine/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/util/Map;

    .line 85
    .line 86
    sget-object v2, Lio/ktor/client/plugins/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/client/plugins/飘花落叶言子楪兰哲世苏;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    move-object v0, v3

    .line 96
    :goto_0
    check-cast v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;

    .line 97
    .line 98
    if-nez v0, :cond_5

    .line 99
    .line 100
    iget-object v4, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$requestTimeoutMillis:Ljava/lang/Long;

    .line 101
    .line 102
    iget-object v5, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$connectTimeoutMillis:Ljava/lang/Long;

    .line 103
    .line 104
    iget-object v6, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$socketTimeoutMillis:Ljava/lang/Long;

    .line 105
    .line 106
    sget-object v7, Lio/ktor/client/plugins/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 107
    .line 108
    if-nez v4, :cond_4

    .line 109
    .line 110
    if-nez v5, :cond_4

    .line 111
    .line 112
    if-eqz v6, :cond_5

    .line 113
    .line 114
    :cond_4
    new-instance v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;

    .line 115
    .line 116
    invoke-direct {v0}, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v2, v0}, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/client/engine/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    if-eqz v0, :cond_a

    .line 123
    .line 124
    iget-object v2, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$connectTimeoutMillis:Ljava/lang/Long;

    .line 125
    .line 126
    iget-object v4, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$socketTimeoutMillis:Ljava/lang/Long;

    .line 127
    .line 128
    iget-object v5, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->$requestTimeoutMillis:Ljava/lang/Long;

    .line 129
    .line 130
    iget-object v6, v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

    .line 131
    .line 132
    if-nez v6, :cond_6

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_6
    move-object v2, v6

    .line 136
    :goto_1
    invoke-static {v2}, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Long;)V

    .line 137
    .line 138
    .line 139
    iput-object v2, v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

    .line 140
    .line 141
    iget-object v2, v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

    .line 142
    .line 143
    if-nez v2, :cond_7

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    move-object v4, v2

    .line 147
    :goto_2
    invoke-static {v4}, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Long;)V

    .line 148
    .line 149
    .line 150
    iput-object v4, v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

    .line 151
    .line 152
    iget-object v2, v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Long;

    .line 153
    .line 154
    if-nez v2, :cond_8

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    move-object v5, v2

    .line 158
    :goto_3
    invoke-static {v5}, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Long;)V

    .line 159
    .line 160
    .line 161
    iput-object v5, v0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Long;

    .line 162
    .line 163
    if-eqz v5, :cond_a

    .line 164
    .line 165
    const-wide v6, 0x7fffffffffffffffL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v8

    .line 174
    cmp-long v0, v8, v6

    .line 175
    .line 176
    if-nez v0, :cond_9

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_9
    iget-object v0, p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lkotlinx/coroutines/飘花落叶言子哲世楪苏兰;

    .line 180
    .line 181
    new-instance v2, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;

    .line 182
    .line 183
    invoke-direct {v2, v5, p1, v0, v3}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;-><init>(Ljava/lang/Long;L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 184
    .line 185
    .line 186
    const/4 v0, 0x3

    .line 187
    invoke-static {v3, v3, v3, v2, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iget-object p1, p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lkotlinx/coroutines/飘花落叶言子哲世楪苏兰;

    .line 192
    .line 193
    new-instance v2, Lio/ktor/client/plugins/飘花落叶言子世楪苏哲兰;

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    invoke-direct {v2, v0, v4}, Lio/ktor/client/plugins/飘花落叶言子世楪苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v2}, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲兰楪苏;

    .line 200
    .line 201
    .line 202
    :cond_a
    :goto_4
    iput-object v3, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->L$0:Ljava/lang/Object;

    .line 203
    .line 204
    iput v1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->label:I

    .line 205
    .line 206
    throw v3

    .line 207
    :cond_b
    iput-object v3, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->L$0:Ljava/lang/Object;

    .line 208
    .line 209
    iput v2, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->label:I

    .line 210
    .line 211
    throw v3

    .line 212
    :cond_c
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 213
    .line 214
    .line 215
    return-object v3
.end method
