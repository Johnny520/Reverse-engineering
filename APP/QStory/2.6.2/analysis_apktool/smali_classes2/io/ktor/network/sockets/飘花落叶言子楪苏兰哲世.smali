.class public final Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;
.super Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/net/InetSocketAddress;


# direct methods
.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/net/InetSocketAddress;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v0, 0x0

    .line 13
    :goto_0
    const-class v1, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 27
    .line 28
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/net/InetSocketAddress;

    .line 29
    .line 30
    iget-object p1, p1, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/net/InetSocketAddress;

    .line 31
    .line 32
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/net/InetSocketAddress;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/net/InetSocketAddress;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/net/SocketAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/net/InetSocketAddress;

    .line 2
    .line 3
    return-object p0
.end method
