.class public final LYue/ۥۡۧ۠ۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧ۠ۦ$ۥ;,
        LYue/ۥۡۧ۠ۦ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۟:LYue/ۥۡۧ۠ۦ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:LYue/ۥ۟۠ۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۡۧ۠ۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥۣ۟ۦۣ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟:LYue/ۥ۠ۡۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/net/Proxy;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/net/InetSocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟ۢ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e7\u06e0\u06e3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۧ۠ۦ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۧ۠ۦ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۧ۠ۦ;->ۥۣ۟۟۟:LYue/ۥۡۧ۠ۦ$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟۠ۢ;LYue/ۥۡۧ۠ۤ;LYue/ۥۣ۟ۦۣ;LYue/ۥ۠ۡۡ۟;)V
    .locals 1
    .param p1    # LYue/ۥ۟۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۧ۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۟ۦۣ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۠ۡۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routeDatabase"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧ۠ۦ;->ۥ:LYue/ۥ۟۠ۢ;

    iput-object p2, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟:LYue/ۥۡۧ۠ۤ;

    iput-object p3, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟:LYue/ۥۣ۟ۦۣ;

    iput-object p4, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟:LYue/ۥ۠ۡۡ۟;

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۡ:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۢ:Ljava/util/List;

    invoke-virtual {p1}, LYue/ۥ۟۠ۢ;->ۥ۟۟۠ۦ()LYue/ۥ۠ۤۨۥ;

    move-result-object p2

    invoke-virtual {p1}, LYue/ۥ۟۠ۢ;->ۥ۟۟۠ۡ()Ljava/net/Proxy;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۠(LYue/ۥ۠ۤۨۥ;Ljava/net/Proxy;)V

    return-void
.end method

.method public static final ۥ۟۟۟ۡ(Ljava/net/Proxy;LYue/ۥ۠ۤۨۥ;LYue/ۥۡۧ۠ۦ;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/Proxy;",
            "LYue/\u06e5\u06e0\u06e4\u06e8\u06e5;",
            "LYue/\u06e5\u06e1\u06e7\u06e0\u06e6;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/Proxy;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-static {p0}, LYue/ۥ۟ۥۡۢ;->ۥ۟۟۟ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1}, LYue/ۥ۠ۤۨۥ;->ۥۣ۟۟ۢ()Ljava/net/URI;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p0, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p0}, [Ljava/net/Proxy;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡۡ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    iget-object p1, p2, LYue/ۥۡۧ۠ۦ;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-virtual {p1}, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۠()Ljava/net/ProxySelector;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "proxiesOrNull"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    sget-object p0, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p0}, [Ljava/net/Proxy;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡۡ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ()Z
    .locals 2

    invoke-virtual {p0}, LYue/ۥۡۧ۠ۦ;->ۥ۟()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۢ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public final ۥ۟()Z
    .locals 2

    iget v0, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۠:I

    iget-object v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟()LYue/ۥۡۧ۠ۦ$ۥ۟;
    .locals 6
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۧ۠ۦ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۧ۠ۦ;->ۥ۟()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۡ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/InetSocketAddress;

    new-instance v4, LYue/ۥۣۡۧ۠;

    iget-object v5, p0, LYue/ۥۡۧ۠ۦ;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-direct {v4, v5, v1, v3}, LYue/ۥۣۡۧ۠;-><init>(LYue/ۥ۟۠ۢ;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    iget-object v3, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟:LYue/ۥۡۧ۠ۤ;

    invoke-virtual {v3, v4}, LYue/ۥۡۧ۠ۤ;->ۥ۟۟(LYue/ۥۣۡۧ۠;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۢ:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۢ:Ljava/util/List;

    invoke-static {v0, v1}, LYue/ۥ۟ۥۡۨ;->ۥ۟۟ۤۦ(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    iget-object v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۢ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_4
    new-instance v1, LYue/ۥۡۧ۠ۦ$ۥ۟;

    invoke-direct {v1, v0}, LYue/ۥۡۧ۠ۦ$ۥ۟;-><init>(Ljava/util/List;)V

    return-object v1

    :cond_5
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۥ۟۟۟()Ljava/net/Proxy;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۧ۠ۦ;->ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۟:Ljava/util/List;

    iget v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۠:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۠:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/Proxy;

    invoke-virtual {p0, v0}, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۟(Ljava/net/Proxy;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/net/SocketException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No route to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۧ۠ۦ;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-virtual {v2}, LYue/ۥ۟۠ۢ;->ۥ۟۟۠ۦ()LYue/ۥ۠ۤۨۥ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۡۤ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; exhausted proxy configurations: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟۟(Ljava/net/Proxy;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۡ:Ljava/util/List;

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v1, v2, :cond_2

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v1

    instance-of v2, v1, Ljava/net/InetSocketAddress;

    if-eqz v2, :cond_1

    sget-object v2, LYue/ۥۡۧ۠ۦ;->ۥۣ۟۟۟:LYue/ۥۡۧ۠ۦ$ۥ;

    const-string v3, "proxyAddress"

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/net/InetSocketAddress;

    invoke-virtual {v2, v1}, LYue/ۥۡۧ۠ۦ$ۥ;->ۥ(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Proxy.address() is not an InetSocketAddress: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget-object v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-virtual {v1}, LYue/ۥ۟۠ۢ;->ۥ۟۟۠ۦ()LYue/ۥ۠ۤۨۥ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۡۤ()Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-virtual {v1}, LYue/ۥ۟۠ۢ;->ۥ۟۟۠ۦ()LYue/ۥ۠ۤۨۥ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۢۡ()I

    move-result v1

    :goto_1
    const/4 v3, 0x1

    if-gt v3, v1, :cond_7

    const/high16 v3, 0x10000

    if-ge v1, v3, :cond_7

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p1

    sget-object v3, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne p1, v3, :cond_3

    invoke-static {v2, v1}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    invoke-static {v2}, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۥ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۥۡۢ;->ۥ۟۟۟ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_4
    iget-object p1, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟:LYue/ۥ۠ۡۡ۟;

    iget-object v3, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟:LYue/ۥۣ۟ۦۣ;

    invoke-virtual {p1, v3, v2}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟۟ۨ(LYue/ۥۣ۟ۦۣ;Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥۡۧ۠ۦ;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-virtual {p1}, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۨ()LYue/ۥ۠۟ۧۢ;

    move-result-object p1

    invoke-interface {p1, v2}, LYue/ۥ۠۟ۧۢ;->ۥ(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟:LYue/ۥ۠ۡۡ۟;

    iget-object v4, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟:LYue/ۥۣ۟ۦۣ;

    invoke-virtual {v3, v4, v2, p1}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟۟ۧ(LYue/ۥۣ۟ۦۣ;Ljava/lang/String;Ljava/util/List;)V

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    new-instance v3, Ljava/net/InetSocketAddress;

    invoke-direct {v3, v2, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    :goto_4
    return-void

    :cond_6
    new-instance p1, Ljava/net/UnknownHostException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-virtual {v1}, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۨ()LYue/ۥ۠۟ۧۢ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned no addresses for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/net/SocketException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No route to "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "; port is out of range"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟۠(LYue/ۥ۠ۤۨۥ;Ljava/net/Proxy;)V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟:LYue/ۥ۠ۡۡ۟;

    iget-object v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟:LYue/ۥۣ۟ۦۣ;

    invoke-virtual {v0, v1, p1}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟۠۟(LYue/ۥۣ۟ۦۣ;LYue/ۥ۠ۤۨۥ;)V

    invoke-static {p2, p1, p0}, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟ۡ(Ljava/net/Proxy;LYue/ۥ۠ۤۨۥ;LYue/ۥۡۧ۠ۦ;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۟:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟۠:I

    iget-object v0, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟۟:LYue/ۥ۠ۡۡ۟;

    iget-object v1, p0, LYue/ۥۡۧ۠ۦ;->ۥ۟۟:LYue/ۥۣ۟ۦۣ;

    invoke-virtual {v0, v1, p1, p2}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟۠(LYue/ۥۣ۟ۦۣ;LYue/ۥ۠ۤۨۥ;Ljava/util/List;)V

    return-void
.end method
