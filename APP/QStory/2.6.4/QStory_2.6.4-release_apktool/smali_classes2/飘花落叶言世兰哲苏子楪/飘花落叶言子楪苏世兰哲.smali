.class public final L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Z

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    const-string v1, "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"

    .line 10
    .line 11
    const-class v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    :catch_0
    sput-boolean v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Ljavax/net/ssl/SSLSocket;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lorg/bouncycastle/jsse/BCSSLSocket;

    .line 11
    .line 12
    invoke-interface {p1}, Lorg/bouncycastle/jsse/BCSSLSocket;->getParameters()Lorg/bouncycastle/jsse/BCSSLParameters;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p2, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    invoke-static {p3}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(Ljava/util/List;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 p3, 0x0

    .line 23
    new-array p3, p3, [Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, [Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Lorg/bouncycastle/jsse/BCSSLParameters;->setApplicationProtocols([Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p0}, Lorg/bouncycastle/jsse/BCSSLSocket;->setParameters(Lorg/bouncycastle/jsse/BCSSLParameters;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    .line 1
    check-cast p1, Lorg/bouncycastle/jsse/BCSSLSocket;

    .line 2
    .line 3
    invoke-interface {p1}, Lorg/bouncycastle/jsse/BCSSLSocket;->getApplicationProtocol()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Z
    .locals 0

    .line 1
    sget-boolean p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    return p0
.end method
