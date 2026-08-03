.class public final LYue/ۥۣۡۧ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:LYue/ۥ۟۠ۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/net/Proxy;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/net/InetSocketAddress;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۠ۢ;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V
    .locals 1
    .param p1    # LYue/ۥ۟۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/net/Proxy;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/net/InetSocketAddress;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxy"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "socketAddress"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۧ۠;->ۥ:LYue/ۥ۟۠ۢ;

    iput-object p2, p0, LYue/ۥۣۡۧ۠;->ۥ۟:Ljava/net/Proxy;

    iput-object p3, p0, LYue/ۥۣۡۧ۠;->ۥ۟۟:Ljava/net/InetSocketAddress;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥۣۡۧ۠;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥۣۡۧ۠;

    iget-object v0, p1, LYue/ۥۣۡۧ۠;->ۥ:LYue/ۥ۟۠ۢ;

    iget-object v1, p0, LYue/ۥۣۡۧ۠;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, LYue/ۥۣۡۧ۠;->ۥ۟:Ljava/net/Proxy;

    iget-object v1, p0, LYue/ۥۣۡۧ۠;->ۥ۟:Ljava/net/Proxy;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LYue/ۥۣۡۧ۠;->ۥ۟۟:Ljava/net/InetSocketAddress;

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ۟۟:Ljava/net/InetSocketAddress;

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۢ;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ۟:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ۟۟:Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Route{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣۡۧ۠;->ۥ۟۟:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()LYue/ۥ۟۠ۢ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "address"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_address"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ:LYue/ۥ۟۠ۢ;

    return-object v0
.end method

.method public final ۥ۟()Ljava/net/Proxy;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "proxy"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_proxy"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ۟:Ljava/net/Proxy;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/net/InetSocketAddress;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "socketAddress"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_socketAddress"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ۟۟:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public final ۥ۟۟۟()LYue/ۥ۟۠ۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "address"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ:LYue/ۥ۟۠ۢ;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/net/Proxy;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "proxy"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ۟:Ljava/net/Proxy;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ:LYue/ۥ۟۠ۢ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۢ;->ۥ۟۟۠ۥ()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ۟:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/net/InetSocketAddress;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "socketAddress"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۧ۠;->ۥ۟۟:Ljava/net/InetSocketAddress;

    return-object v0
.end method
