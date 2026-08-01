.class final Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
        "",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "it",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;Ljava/lang/Object;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1"
    f = "WebSockets.kt"
    l = {
        0xa4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $extensionsSupported:Z

.field final synthetic $plugin:Lio/ktor/client/plugins/websocket/飘花落叶言子楪世哲苏兰;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(ZLio/ktor/client/plugins/websocket/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/ktor/client/plugins/websocket/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->$extensionsSupported:Z

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p2, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;

    .line 2
    .line 3
    iget-boolean p0, p0, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->$extensionsSupported:Z

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p2, p0, v0, p3}, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;-><init>(ZLio/ktor/client/plugins/websocket/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p2, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->L$0:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 12
    .line 13
    invoke-virtual {p2, p0}, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v4

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    iget-object v1, p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v5, v1

    .line 33
    check-cast v5, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;

    .line 34
    .line 35
    iget-object v5, v5, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏兰楪哲;

    .line 36
    .line 37
    invoke-virtual {v5}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰()L飘花落叶言楪兰苏世子哲/飘花落叶言子世哲楪苏兰;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v5, v5, L飘花落叶言楪兰苏世子哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 45
    .line 46
    const-string v6, "ws"

    .line 47
    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    const-string v6, "wss"

    .line 55
    .line 56
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    sget-object p0, Lio/ktor/client/plugins/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪兰哲世苏(L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    new-instance p1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v0, "Skipping WebSocket plugin for non-websocket request: "

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    check-cast v1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;

    .line 79
    .line 80
    iget-object v0, v1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏兰楪哲;

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p0, p1}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v4

    .line 93
    :cond_3
    :goto_0
    sget-object v5, Lio/ktor/client/plugins/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 94
    .line 95
    invoke-static {v5}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪兰哲世苏(L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    new-instance v6, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v7, "Sending WebSocket request "

    .line 104
    .line 105
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    move-object v7, v1

    .line 109
    check-cast v7, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;

    .line 110
    .line 111
    iget-object v7, v7, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏兰楪哲;

    .line 112
    .line 113
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-interface {v5, v6}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    check-cast v1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;

    .line 124
    .line 125
    sget-object v5, Lio/ktor/client/plugins/websocket/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/client/plugins/websocket/飘花落叶言子楪世苏哲兰;

    .line 126
    .line 127
    invoke-virtual {v1, v5, v4}, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/client/engine/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-boolean v1, p0, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->$extensionsSupported:Z

    .line 131
    .line 132
    if-nez v1, :cond_6

    .line 133
    .line 134
    new-instance v1, Lio/ktor/client/plugins/websocket/飘花落叶言子楪世苏兰哲;

    .line 135
    .line 136
    invoke-direct {v1}, Lio/ktor/client/plugins/websocket/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 137
    .line 138
    .line 139
    iput v3, p0, Lio/ktor/client/plugins/websocket/WebSockets$Plugin$install$1;->label:I

    .line 140
    .line 141
    invoke-virtual {p1, v1, p0}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-ne p0, v0, :cond_5

    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_5
    return-object v4

    .line 149
    :cond_6
    sget p0, Lio/ktor/client/plugins/websocket/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 150
    .line 151
    throw v2
.end method
