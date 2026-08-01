.class public final L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Z

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    const-string v1, "org.conscrypt.Conscrypt$Version"

    .line 10
    .line 11
    const-class v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲兰世;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lorg/conscrypt/Conscrypt;->isAvailable()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-static {}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    :catch_0
    :cond_0
    sput-boolean v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Z

    .line 34
    .line 35
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
    invoke-virtual {p0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljavax/net/ssl/SSLSocket;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    invoke-static {p1, p0}, Lorg/conscrypt/Conscrypt;->setUseSessionTickets(Ljavax/net/ssl/SSLSocket;Z)V

    .line 12
    .line 13
    .line 14
    sget-object p0, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    invoke-static {p3}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(Ljava/util/List;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 p2, 0x0

    .line 21
    new-array p2, p2, [Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, [Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, p0}, Lorg/conscrypt/Conscrypt;->setApplicationProtocols(Ljavax/net/ssl/SSLSocket;[Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljavax/net/ssl/SSLSocket;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lorg/conscrypt/Conscrypt;->getApplicationProtocol(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lorg/conscrypt/Conscrypt;->isConscrypt(Ljavax/net/ssl/SSLSocket;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Z
    .locals 0

    .line 1
    sget-boolean p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    return p0
.end method
