.class public final LYue/ۥ۟ۨۧۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢ۟ۢۢ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۨۧۧ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۟ۨۧۧ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۢ۟ۢۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۨۧۧ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۨۧۧ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "socketAdapterFactory"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۨۧۧ;->ۥ:LYue/ۥ۟ۨۧۧ$ۥ;

    return-void
.end method


# virtual methods
.method public isSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ(Ljavax/net/ssl/SSLSocket;)Z
    .locals 1
    .param p1    # Ljavax/net/ssl/SSLSocket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨۧۧ;->ۥ:LYue/ۥ۟ۨۧۧ$ۥ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۧۧ$ۥ;->ۥ(Ljavax/net/ssl/SSLSocket;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljavax/net/ssl/SSLSocket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۟ۨۧۧ;->ۥ۟۟۟۠(Ljavax/net/ssl/SSLSocket;)LYue/ۥۢ۟ۢۢ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LYue/ۥۢ۟ۢۢ;->ۥ۟(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public ۥ۟۟(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .locals 0
    .param p1    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۢ۟ۢۢ$ۥ;->ۥ۟(LYue/ۥۢ۟ۢۢ;Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(Ljavax/net/ssl/SSLSocketFactory;)Z
    .locals 0
    .param p1    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۢ۟ۢۢ$ۥ;->ۥ(LYue/ۥۢ۟ۢۢ;Ljavax/net/ssl/SSLSocketFactory;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljavax/net/ssl/SSLSocket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/net/ssl/SSLSocket;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۟ۨۧۧ;->ۥ۟۟۟۠(Ljavax/net/ssl/SSLSocket;)LYue/ۥۢ۟ۢۢ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥۢ۟ۢۢ;->ۥ۟۟۟۟(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized ۥ۟۟۟۠(Ljavax/net/ssl/SSLSocket;)LYue/ۥۢ۟ۢۢ;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟ۨۧۧ;->ۥ۟:LYue/ۥۢ۟ۢۢ;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۨۧۧ;->ۥ:LYue/ۥ۟ۨۧۧ$ۥ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۧۧ$ۥ;->ۥ(Ljavax/net/ssl/SSLSocket;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۨۧۧ;->ۥ:LYue/ۥ۟ۨۧۧ$ۥ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۧۧ$ۥ;->ۥ۟(Ljavax/net/ssl/SSLSocket;)LYue/ۥۢ۟ۢۢ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟ۨۧۧ;->ۥ۟:LYue/ۥۢ۟ۢۢ;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, LYue/ۥ۟ۨۧۧ;->ۥ۟:LYue/ۥۢ۟ۢۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
