.class public final LYue/ۥ۠ۤۡ۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۡ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۠ۤۡ۠$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljavax/net/ssl/SSLSession;)LYue/ۥ۠ۤۡ۠;
    .locals 1
    .param p1    # Ljavax/net/ssl/SSLSession;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "sslSession.handshake()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_get"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sslSession"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۡ۠$ۥ;->ۥ۟۟(Ljavax/net/ssl/SSLSession;)LYue/ۥ۠ۤۡ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟(LYue/ۥۢۡۧ۟;LYue/ۥ۟ۤۦۣ;Ljava/util/List;Ljava/util/List;)LYue/ۥ۠ۤۡ۠;
    .locals 2
    .param p1    # LYue/ۥۢۡۧ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۤۦۣ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e1\u06e7\u06df;",
            "LYue/\u06e5\u06df\u06e4\u06e6\u06e3;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e4\u06e1\u06e0;"
        }
    .end annotation

    const-string v0, "tlsVersion"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cipherSuite"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerCertificates"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localCertificates"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    new-instance v0, LYue/ۥ۠ۤۡ۠;

    invoke-static {p4}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object p4

    new-instance v1, LYue/ۥ۠ۤۡ۠$ۥ$ۥ;

    invoke-direct {v1, p3}, LYue/ۥ۠ۤۡ۠$ۥ$ۥ;-><init>(Ljava/util/List;)V

    invoke-direct {v0, p1, p2, p4, v1}, LYue/ۥ۠ۤۡ۠;-><init>(LYue/ۥۢۡۧ۟;LYue/ۥ۟ۤۦۣ;Ljava/util/List;LYue/ۥۣ۠۠ۨ;)V

    return-object v0
.end method

.method public final ۥ۟۟(Ljavax/net/ssl/SSLSession;)LYue/ۥ۠ۤۡ۠;
    .locals 5
    .param p1    # Ljavax/net/ssl/SSLSession;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "TLS_NULL_WITH_NULL_NULL"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "SSL_NULL_WITH_NULL_NULL"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_3

    sget-object v1, LYue/ۥ۟ۤۦۣ;->ۥ۟:LYue/ۥ۟ۤۦۣ$ۥ۟;

    invoke-virtual {v1, v0}, LYue/ۥ۟ۤۦۣ$ۥ۟;->ۥ۟(Ljava/lang/String;)LYue/ۥ۟ۤۦۣ;

    move-result-object v0

    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "NONE"

    invoke-static {v2, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, LYue/ۥۢۡۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۢۡۧ۟$ۥ;

    invoke-virtual {v2, v1}, LYue/ۥۢۡۧ۟$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۢۡۧ۟;

    move-result-object v1

    :try_start_0
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v2

    invoke-virtual {p0, v2}, LYue/ۥ۠ۤۡ۠$ۥ;->ۥ۟۟۟([Ljava/security/cert/Certificate;)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object v2

    :goto_1
    new-instance v3, LYue/ۥ۠ۤۡ۠;

    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۡ۠$ۥ;->ۥ۟۟۟([Ljava/security/cert/Certificate;)Ljava/util/List;

    move-result-object p1

    new-instance v4, LYue/ۥ۠ۤۡ۠$ۥ$ۥ۟;

    invoke-direct {v4, v2}, LYue/ۥ۠ۤۡ۠$ۥ$ۥ۟;-><init>(Ljava/util/List;)V

    invoke-direct {v3, v1, v0, p1, v4}, LYue/ۥ۠ۤۡ۠;-><init>(LYue/ۥۢۡۧ۟;LYue/ۥ۟ۤۦۣ;Ljava/util/List;LYue/ۥۣ۠۠ۨ;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "tlsVersion == NONE"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "tlsVersion == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cipherSuite == "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "cipherSuite == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟([Ljava/security/cert/Certificate;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/security/cert/Certificate;",
            ")",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡۡ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method
