.class public final Lxhss/ᲀᛴᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲈᲀᛳᲇ;


# static fields
.field public static final ᛱᛱᛲᲇ:Z

.field public static final ᛷᛵᛵᲈ:Lxhss/ᲀᛵᛷᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᲀᛵᛷᛵ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᲀᛴᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛵᛷᛵ;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    const-string v1, "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"

    .line 10
    .line 11
    const-class v2, Lxhss/ᲁᛵᛸᛳ;

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
    sput-boolean v0, Lxhss/ᲀᛴᛶ;->ᛱᛱᛲᲇ:Z

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
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

.method public final ᛳᲁᲇᛸ()Z
    .locals 0

    .line 1
    sget-boolean p0, Lxhss/ᲀᛴᛶ;->ᛱᛱᛲᲇ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᲇᛴᲇᛵ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᲀᛴᛶ;->ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lorg/bouncycastle/jsse/BCSSLSocket;

    .line 8
    .line 9
    invoke-interface {p1}, Lorg/bouncycastle/jsse/BCSSLSocket;->getParameters()Lorg/bouncycastle/jsse/BCSSLParameters;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p2, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 14
    .line 15
    invoke-static {p3}, Lxhss/ᛶᛵᲇᛸ;->ᛱᛱᛲᲇ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 p3, 0x0

    .line 20
    new-array p3, p3, [Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, [Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lorg/bouncycastle/jsse/BCSSLParameters;->setApplicationProtocols([Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p0}, Lorg/bouncycastle/jsse/BCSSLSocket;->setParameters(Lorg/bouncycastle/jsse/BCSSLParameters;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
