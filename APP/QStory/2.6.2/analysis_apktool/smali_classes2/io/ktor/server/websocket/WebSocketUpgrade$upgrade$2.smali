.class final Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;
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
    c = "io.ktor.server.websocket.WebSocketUpgrade$upgrade$2"
    f = "WebSocketUpgrade.kt"
    l = {
        0x61,
        0x62
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $webSocket:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

.field label:I

.field final synthetic this$0:Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;


# direct methods
.method public constructor <init>(Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/websocket/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Lio/ktor/websocket/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->this$0:Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->$webSocket:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

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
    new-instance p1, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;

    .line 2
    .line 3
    iget-object v0, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->this$0:Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    iget-object p0, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->$webSocket:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;-><init>(Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

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

    invoke-virtual {p0, p1, p2}, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_3

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :try_start_2
    iget-object p1, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->this$0:Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;

    .line 34
    .line 35
    iget-object p1, p1, Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 36
    .line 37
    iget-object v1, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->$webSocket:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 38
    .line 39
    iput v4, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->label:I

    .line 40
    .line 41
    invoke-interface {p1, v1, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    :goto_0
    iget-object p1, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->$webSocket:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 49
    .line 50
    iput v3, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->label:I

    .line 51
    .line 52
    invoke-interface {p1, p0}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰哲世(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    if-ne p1, v0, :cond_4

    .line 57
    .line 58
    :goto_1
    return-object v0

    .line 59
    :cond_4
    :goto_2
    iget-object p0, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->$webSocket:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 60
    .line 61
    invoke-static {p0, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Ljava/util/concurrent/CancellationException;)V

    .line 62
    .line 63
    .line 64
    goto :goto_4

    .line 65
    :goto_3
    :try_start_3
    iget-object v0, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->$webSocket:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 66
    .line 67
    const-string v1, "WebSocket is cancelled"

    .line 68
    .line 69
    invoke-static {v1, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {v0, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Ljava/util/concurrent/CancellationException;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 78
    .line 79
    return-object p0

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    iget-object p0, p0, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;->$webSocket:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 82
    .line 83
    invoke-static {p0, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method
