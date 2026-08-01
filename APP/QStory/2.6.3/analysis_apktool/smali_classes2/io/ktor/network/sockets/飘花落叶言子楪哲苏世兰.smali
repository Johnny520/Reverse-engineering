.class public abstract Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;
.super Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lio/ktor/network/sockets/飘花落叶言子楪世哲兰苏;
.implements Lio/ktor/network/sockets/飘花落叶言子楪世哲苏兰;
.implements Lio/ktor/network/sockets/飘花落叶言子楪世兰苏哲;
.implements Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

.field public final 飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReference;

.field public final 飘花落叶言子楪兰哲苏世:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

.field public final 飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final 飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ljava/nio/channels/SocketChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;-><init>(Ljava/nio/channels/spi/AbstractSelectableChannel;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    invoke-static {}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏()Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲苏世:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 35
    .line 36
    return-void
.end method

.method public static 飘花落叶言子世楪苏哲兰(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    sget-object v1, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 11
    .line 12
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->isCancelled()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p0, v0

    .line 24
    :goto_0
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰苏哲世()Ljava/util/concurrent/CancellationException;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 23
    .line 24
    invoke-static {v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object v1, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 38
    .line 39
    invoke-virtual {v0}, Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x0

    .line 44
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final dispose()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->close()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子世兰苏哲楪()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲苏世:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲苏世:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "reading"

    .line 8
    .line 9
    iget-object v2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {p0, v1, p1, v2, v0}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/atomic/AtomicReference;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 16
    .line 17
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏哲世()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    iget-object v0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    sget-object v2, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 20
    .line 21
    invoke-interface {v1}, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子世兰哲苏楪()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :cond_1
    :goto_0
    iget-object v1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    sget-object v3, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 44
    .line 45
    invoke-interface {v2}, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v2}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子世兰哲苏楪()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    return-void

    .line 57
    :cond_3
    :goto_1
    invoke-static {v0}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏哲兰(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏哲兰(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 66
    .line 67
    :try_start_0
    move-object v3, p0

    .line 68
    check-cast v3, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 69
    .line 70
    iget-object v3, v3, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/nio/channels/Channel;->close()V

    .line 73
    .line 74
    .line 75
    invoke-super {p0}, Lio/ktor/network/selector/飘花落叶言子楪苏哲兰世;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 79
    .line 80
    invoke-virtual {v2, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    goto :goto_2

    .line 85
    :catchall_0
    move-exception v3

    .line 86
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 87
    .line 88
    invoke-virtual {v2, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V

    .line 89
    .line 90
    .line 91
    move-object v2, v3

    .line 92
    :goto_2
    if-nez v0, :cond_4

    .line 93
    .line 94
    move-object v0, v1

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    if-nez v1, :cond_5

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    if-ne v0, v1, :cond_6

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :goto_3
    if-nez v0, :cond_7

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_7
    if-nez v2, :cond_8

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_8
    if-ne v0, v2, :cond_9

    .line 112
    .line 113
    :goto_4
    move-object v2, v0

    .line 114
    goto :goto_5

    .line 115
    :cond_9
    invoke-static {v0, v2}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :goto_5
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲苏世:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 120
    .line 121
    if-nez v2, :cond_a

    .line 122
    .line 123
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世楪苏兰()Z

    .line 124
    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_a
    invoke-virtual {p0, v2}, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世楪兰苏(Ljava/lang/Throwable;)Z

    .line 128
    .line 129
    .line 130
    :cond_b
    :goto_6
    return-void
.end method

.method public final 飘花落叶言子楪哲兰苏世(Ljava/lang/String;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/atomic/AtomicReference;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    invoke-interface {p4}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    check-cast p4, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;

    .line 14
    .line 15
    :goto_0
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p3, v1, p4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {p4}, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance p3, Lio/ktor/utils/io/飘花落叶言子楪苏哲世兰;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-direct {p3, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏哲世兰;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p3}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子世兰楪哲苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 45
    .line 46
    .line 47
    new-instance p1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 48
    .line 49
    const/16 p2, 0x8

    .line 50
    .line 51
    invoke-direct {p1, p0, p2}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 55
    .line 56
    invoke-interface {p4}, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance p2, Lio/ktor/utils/io/飘花落叶言子楪哲苏兰世;

    .line 61
    .line 62
    invoke-direct {p2, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p0, p2}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子世兰楪哲苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 66
    .line 67
    .line 68
    return-object p4

    .line 69
    :cond_0
    new-instance p0, Ljava/nio/channels/ClosedChannelException;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 75
    .line 76
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-interface {p4}, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-interface {p1, v1}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p2, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_1
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-nez v2, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string p2, " channel has already been set"

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sget-object p1, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 109
    .line 110
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-interface {p4}, Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p1, v1}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_3
    new-instance p0, Ljava/nio/channels/ClosedChannelException;

    .line 122
    .line 123
    invoke-direct {p0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-static {p2, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "writing"

    .line 8
    .line 9
    iget-object v2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {p0, v1, p1, v2, v0}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/atomic/AtomicReference;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lio/ktor/utils/io/飘花落叶言子楪兰世苏哲;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 16
    .line 17
    return-object p0
.end method
