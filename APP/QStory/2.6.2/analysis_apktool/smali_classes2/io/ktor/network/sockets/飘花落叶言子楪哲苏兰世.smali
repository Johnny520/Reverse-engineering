.class public final Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;
.implements Lio/ktor/network/sockets/飘花落叶言子楪世哲兰苏;
.implements Lio/ktor/network/sockets/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

.field public final 飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;


# direct methods
.method public constructor <init>(Ljava/nio/channels/ServerSocketChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;-><init>(Ljava/nio/channels/spi/AbstractSelectableChannel;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;

    .line 13
    .line 14
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 15
    .line 16
    iput-object p2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/nio/channels/SelectableChannel;->isBlocking()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏()Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "Channel need to be configured as non-blocking."

    .line 32
    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    .line 10
    :try_start_1
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰哲苏(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世楪苏兰()Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_0

    .line 21
    :catchall_1
    move-exception v2

    .line 22
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰哲苏(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V

    .line 25
    .line 26
    .line 27
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    :goto_0
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世楪兰苏(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final dispose()V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    :catchall_0
    return-void
.end method

.method public final getLocalAddress()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;
    .locals 1

    .line 1
    sget-boolean v0, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/nio/channels/ServerSocketChannel;->getLocalAddress()Ljava/net/SocketAddress;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/net/ServerSocket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/net/SocketAddress;)Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final isClosed()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子世兰哲楪苏()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世哲楪苏兰()I
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final 飘花落叶言子世苏楪哲兰()Ljava/nio/channels/SelectableChannel;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/nio/channels/SocketChannel;)Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;
    .locals 2

    .line 1
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->ACCEPT:Lio/ktor/network/selector/SelectInterest;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->getLocalAddress()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v0, v0, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-boolean v0, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Ljava/net/StandardSocketOptions;->TCP_NODELAY:Ljava/net/SocketOption;

    .line 23
    .line 24
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Ljava/nio/channels/SocketChannel;->setOption(Ljava/net/SocketOption;Ljava/lang/Object;)Ljava/nio/channels/SocketChannel;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    new-instance v0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 39
    .line 40
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 41
    .line 42
    invoke-direct {v0, p1, p0}, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;-><init>(Ljava/nio/channels/SocketChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    sget-object p1, Lio/ktor/network/selector/SelectInterest;->ACCEPT:Lio/ktor/network/selector/SelectInterest;

    .line 55
    .line 56
    invoke-virtual {p0, p1, v3}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 60
    .line 61
    iput-object p0, v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput v3, v0, Lio/ktor/network/sockets/ServerSocketImpl$acceptSuspend$1;->label:I

    .line 64
    .line 65
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 66
    .line 67
    invoke-virtual {v2, p0, p1, v0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_4

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_4
    :goto_1
    iget-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/nio/channels/ServerSocketChannel;->accept()Ljava/nio/channels/SocketChannel;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/nio/channels/SocketChannel;)Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰世苏()Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    return-object p0
.end method
