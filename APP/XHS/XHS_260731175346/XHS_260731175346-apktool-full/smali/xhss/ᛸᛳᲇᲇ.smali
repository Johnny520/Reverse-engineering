.class public final Lxhss/ᛸᛳᲇᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲈᲀᛳᲇ;


# static fields
.field public static final ᛱᛱᛲᲇ:Z

.field public static final ᛷᛵᛵᲈ:Lxhss/ᲁᲀᲇᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᲁᲀᲇᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛸᛳᲇᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲁᲀᲇᛶ;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    const-string v1, "org.conscrypt.Conscrypt$Version"

    .line 10
    .line 11
    const-class v2, Lxhss/ᛶᛸᛴᛴ;

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
    invoke-static {}, Lxhss/ᛶᛸᛴᛴ;->ᛷᛵᛵᲈ()Z

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
    sput-boolean v0, Lxhss/ᛸᛳᲇᲇ;->ᛱᛱᛲᲇ:Z

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛸᛳᲇᲇ;->ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z

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

.method public final ᛳᲁᲇᛸ()Z
    .locals 0

    .line 1
    sget-boolean p0, Lxhss/ᛸᛳᲇᲇ;->ᛱᛱᛲᲇ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z
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

.method public final ᲇᛴᲇᛵ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛸᛳᲇᲇ;->ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    invoke-static {p1, p0}, Lorg/conscrypt/Conscrypt;->setUseSessionTickets(Ljavax/net/ssl/SSLSocket;Z)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 12
    .line 13
    invoke-static {p3}, Lxhss/ᛶᛵᲇᛸ;->ᛱᛱᛲᲇ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p2, 0x0

    .line 18
    new-array p2, p2, [Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, [Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p1, p0}, Lorg/conscrypt/Conscrypt;->setApplicationProtocols(Ljavax/net/ssl/SSLSocket;[Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method
