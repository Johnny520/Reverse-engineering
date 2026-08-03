.class public final LYue/ۥ۟۠ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:LYue/ۥ۠۟ۧۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljavax/net/SocketFactory;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:Ljavax/net/ssl/SSLSocketFactory;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟:Ljavax/net/ssl/HostnameVerifier;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:LYue/ۥ۟ۤ۟ۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟۠:LYue/ۥ۟ۢۡۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:Ljava/net/Proxy;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟ۢ:Ljava/net/ProxySelector;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟ۤ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟ۥ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILYue/ۥ۠۟ۧۢ;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LYue/ۥ۟ۤ۟ۧ;LYue/ۥ۟ۢۡۡ;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۠۟ۧۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # Ljavax/net/SocketFactory;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p6    # Ljavax/net/ssl/HostnameVerifier;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p7    # LYue/ۥ۟ۤ۟ۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p8    # LYue/ۥ۟ۢۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p9    # Ljava/net/Proxy;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p12    # Ljava/net/ProxySelector;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "LYue/\u06e5\u06e0\u06df\u06e7\u06e2;",
            "Ljavax/net/SocketFactory;",
            "Ljavax/net/ssl/SSLSocketFactory;",
            "Ljavax/net/ssl/HostnameVerifier;",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e7;",
            "LYue/\u06e5\u06df\u06e2\u06e1\u06e1;",
            "Ljava/net/Proxy;",
            "Ljava/util/List<",
            "+",
            "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
            ">;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e8;",
            ">;",
            "Ljava/net/ProxySelector;",
            ")V"
        }
    .end annotation

    const-string v0, "uriHost"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dns"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "socketFactory"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxyAuthenticator"

    invoke-static {p8, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p10, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionSpecs"

    invoke-static {p11, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxySelector"

    invoke-static {p12, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LYue/ۥ۟۠ۢ;->ۥ:LYue/ۥ۠۟ۧۢ;

    iput-object p4, p0, LYue/ۥ۟۠ۢ;->ۥ۟:Ljavax/net/SocketFactory;

    iput-object p5, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p6, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟:Ljavax/net/ssl/HostnameVerifier;

    iput-object p7, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۟:LYue/ۥ۟ۤ۟ۧ;

    iput-object p8, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۠:LYue/ۥ۟ۢۡۡ;

    iput-object p9, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۡ:Ljava/net/Proxy;

    iput-object p12, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۢ:Ljava/net/ProxySelector;

    new-instance p3, LYue/ۥ۠ۤۨۥ$ۥ;

    invoke-direct {p3}, LYue/ۥ۠ۤۨۥ$ۥ;-><init>()V

    if-eqz p5, :cond_0

    const-string p4, "https"

    goto :goto_0

    :cond_0
    const-string p4, "http"

    :goto_0
    invoke-virtual {p3, p4}, LYue/ۥ۠ۤۨۥ$ۥ;->ۥ۟۟ۢ۠(Ljava/lang/String;)LYue/ۥ۠ۤۨۥ$ۥ;

    move-result-object p3

    invoke-virtual {p3, p1}, LYue/ۥ۠ۤۨۥ$ۥ;->ۥ۟۟۠ۧ(Ljava/lang/String;)LYue/ۥ۠ۤۨۥ$ۥ;

    move-result-object p1

    invoke-virtual {p1, p2}, LYue/ۥ۠ۤۨۥ$ۥ;->ۥ۟۟ۡۢ(I)LYue/ۥ۠ۤۨۥ$ۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠ۤۨۥ$ۥ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۤۨۥ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    invoke-static {p10}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۤ:Ljava/util/List;

    invoke-static {p11}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥ۟۠ۢ;

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    check-cast p1, LYue/ۥ۟۠ۢ;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥ۟۠ۢ;->ۥ۟۟۠(LYue/ۥ۟۠ۢ;)Z

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

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨۥ;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ:LYue/ۥ۠۟ۧۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۠:LYue/ۥ۟ۢۡۡ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۤ:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۢ:Ljava/net/ProxySelector;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۡ:Ljava/net/Proxy;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۟:LYue/ۥ۟ۤ۟ۧ;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Address{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    invoke-virtual {v1}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۡۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    invoke-virtual {v1}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۢۡ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۡ:Ljava/net/Proxy;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "proxy="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۡ:Ljava/net/Proxy;

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "proxySelector="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۢ:Ljava/net/ProxySelector;

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()LYue/ۥ۟ۤ۟ۧ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "certificatePinner"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_certificatePinner"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۟:LYue/ۥ۟ۤ۟ۧ;

    return-object v0
.end method

.method public final ۥ۟()Ljava/util/List;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "connectionSpecs"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_connectionSpecs"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e8;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥ۠۟ۧۢ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "dns"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_dns"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ:LYue/ۥ۠۟ۧۢ;

    return-object v0
.end method

.method public final ۥ۟۟۟()Ljavax/net/ssl/HostnameVerifier;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "hostnameVerifier"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_hostnameVerifier"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/util/List;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "protocols"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_protocols"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۤ:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()Ljava/net/Proxy;
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

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۡ:Ljava/net/Proxy;

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥ۟ۢۡۡ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "proxyAuthenticator"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_proxyAuthenticator"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۠:LYue/ۥ۟ۢۡۡ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/net/ProxySelector;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "proxySelector"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_proxySelector"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۢ:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()Ljavax/net/SocketFactory;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "socketFactory"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_socketFactory"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "sslSocketFactory"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_sslSocketFactory"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public final ۥ۟۟۟ۥ()LYue/ۥ۠ۤۨۥ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "url"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_url"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ()LYue/ۥ۟ۤ۟ۧ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "certificatePinner"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۟:LYue/ۥ۟ۤ۟ۧ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۧ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "connectionSpecs"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e8;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۟ۨ()LYue/ۥ۠۟ۧۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "dns"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ:LYue/ۥ۠۟ۧۢ;

    return-object v0
.end method

.method public final ۥ۟۟۠(LYue/ۥ۟۠ۢ;)Z
    .locals 2
    .param p1    # LYue/ۥ۟۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "that"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ:LYue/ۥ۠۟ۧۢ;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ:LYue/ۥ۠۟ۧۢ;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۠:LYue/ۥ۟ۢۡۡ;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۠:LYue/ۥ۟ۢۡۡ;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۤ:Ljava/util/List;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۤ:Ljava/util/List;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۢ:Ljava/net/ProxySelector;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۢ:Ljava/net/ProxySelector;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۡ:Ljava/net/Proxy;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۡ:Ljava/net/Proxy;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ۟۟:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟:Ljavax/net/ssl/HostnameVerifier;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ۟۟۟:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۟:LYue/ۥ۟ۤ۟ۧ;

    iget-object v1, p1, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۟:LYue/ۥ۟ۤ۟ۧ;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۢۡ()I

    move-result v0

    iget-object p1, p1, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    invoke-virtual {p1}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۢۡ()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟۟۠۟()Ljavax/net/ssl/HostnameVerifier;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "hostnameVerifier"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final ۥ۟۟۠۠()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "protocols"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۤ:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۠ۡ()Ljava/net/Proxy;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "proxy"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۡ:Ljava/net/Proxy;

    return-object v0
.end method

.method public final ۥ۟۟۠ۢ()LYue/ۥ۟ۢۡۡ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "proxyAuthenticator"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟۠:LYue/ۥ۟ۢۡۡ;

    return-object v0
.end method

.method public final ۥۣ۟۟۠()Ljava/net/ProxySelector;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "proxySelector"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟۟ۢ:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final ۥ۟۟۠ۤ()Ljavax/net/SocketFactory;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "socketFactory"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final ۥ۟۟۠ۥ()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "sslSocketFactory"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥ۟۟:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public final ۥ۟۟۠ۦ()LYue/ۥ۠ۤۨۥ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "url"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۨۥ;

    return-object v0
.end method
