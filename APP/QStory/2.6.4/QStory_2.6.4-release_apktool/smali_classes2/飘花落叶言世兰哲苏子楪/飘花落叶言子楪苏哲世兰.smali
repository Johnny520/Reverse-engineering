.class public final L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰哲世;


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Ljavax/net/ssl/SSLSocket;)L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;
    .locals 0

    .line 1
    new-instance p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    .line 1
    sget-boolean p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lorg/conscrypt/Conscrypt;->isConscrypt(Ljavax/net/ssl/SSLSocket;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method
