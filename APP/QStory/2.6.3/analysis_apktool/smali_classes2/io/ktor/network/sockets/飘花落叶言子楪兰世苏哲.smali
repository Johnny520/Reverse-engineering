.class public final Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;
.super Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;


# instance fields
.field public final 飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;


# direct methods
.method public constructor <init>(Ljava/nio/channels/SocketChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;-><init>(Ljava/nio/channels/SocketChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractSelectableChannel;->isBlocking()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "Channel need to be configured as non-blocking."

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0
.end method


# virtual methods
.method public final getLocalAddress()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;
    .locals 1

    .line 1
    sget-boolean v0, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->getLocalAddress()Ljava/net/SocketAddress;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/net/SocketAddress;)Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const-string p0, "Channel is not yet bound"

    .line 28
    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public final 飘花落叶言子世楪哲兰苏()Ljava/nio/channels/SelectableChannel;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世苏兰()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;
    .locals 1

    .line 1
    sget-boolean v0, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->getRemoteAddress()Ljava/net/SocketAddress;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/net/SocketAddress;)Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const-string p0, "Channel is not yet connected"

    .line 28
    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method
