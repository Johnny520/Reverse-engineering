.class public LYue/ۥ۟ۨۦۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۥۢ۠;


# instance fields
.field public ۥ:Ljavax/net/ssl/SSLContext;

.field public ۥ۟:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/SSLContext;)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۨۦۤ;-><init>(Ljavax/net/ssl/SSLContext;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/SSLContext;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 3
    iput-object p1, p0, LYue/ۥ۟ۨۦۤ;->ۥ:Ljavax/net/ssl/SSLContext;

    .line 4
    iput-object p2, p0, LYue/ۥ۟ۨۦۤ;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۦۤ;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public bridge synthetic ۥ(LYue/ۥۢۥۡۡ;LYue/ۥ۠۠۠۟;)LYue/ۥۢۥۡ۠;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۨۦۤ;->ۥ(LYue/ۥۢۥۡۡ;LYue/ۥ۠۠۠۟;)LYue/ۥۢۥۡۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(LYue/ۥۢۥۡۡ;LYue/ۥ۠۠۠۟;)LYue/ۥۢۥۡۥ;
    .locals 1

    .line 2
    new-instance v0, LYue/ۥۢۥۡۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥۢۥۡۥ;-><init>(LYue/ۥۢۥۡۦ;LYue/ۥ۠۠۠۟;)V

    return-object v0
.end method

.method public bridge synthetic ۥ۟(LYue/ۥۢۥۡۡ;Ljava/util/List;)LYue/ۥۢۥۡ۠;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۨۦۤ;->ۥ۟(LYue/ۥۢۥۡۡ;Ljava/util/List;)LYue/ۥۢۥۡۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟(LYue/ۥۢۥۡۡ;Ljava/util/List;)LYue/ۥۢۥۡۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e5\u06e1\u06e1;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e0\u06e0\u06df;",
            ">;)",
            "LYue/\u06e5\u06e2\u06e5\u06e1\u06e5;"
        }
    .end annotation

    .line 2
    new-instance v0, LYue/ۥۢۥۡۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥۢۥۡۥ;-><init>(LYue/ۥۢۥۡۦ;Ljava/util/List;)V

    return-object v0
.end method

.method public ۥ۟۟(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۦۤ;->ۥ:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->createSSLEngine()Ljavax/net/ssl/SSLEngine;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLEngine;->setEnabledCipherSuites([Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLEngine;->setUseClientMode(Z)V

    new-instance v1, LYue/ۥۡۧۢ;

    iget-object v2, p0, LYue/ۥ۟ۨۦۤ;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    invoke-direct {v1, p1, v0, v2, p2}, LYue/ۥۡۧۢ;-><init>(Ljava/nio/channels/SocketChannel;Ljavax/net/ssl/SSLEngine;Ljava/util/concurrent/ExecutorService;Ljava/nio/channels/SelectionKey;)V

    return-object v1
.end method
