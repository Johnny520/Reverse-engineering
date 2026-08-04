.class public final Lyyds/ᛴᛱᛵᛵ;
.super Lyyds/ᛱᛷᲈᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:Landroid/net/http/X509TrustManagerExtensions;

.field public final ᛶᛷᛲᲁ:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᛱᛵᛵ;->ᛶᛷᛲᲁ:Ljavax/net/ssl/X509TrustManager;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛴᛱᛵᛵ;->ᛱᲈᲁ:Landroid/net/http/X509TrustManagerExtensions;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᛴᛱᛵᛵ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᛱᛵᛵ;

    .line 6
    .line 7
    iget-object p1, p1, Lyyds/ᛴᛱᛵᛵ;->ᛶᛷᛲᲁ:Ljavax/net/ssl/X509TrustManager;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛴᛱᛵᛵ;->ᛶᛷᛲᲁ:Ljavax/net/ssl/X509TrustManager;

    .line 10
    .line 11
    if-ne p1, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛵᛵ;->ᛶᛷᛲᲁ:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    .line 3
    .line 4
    invoke-interface {p2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    check-cast p2, [Ljava/security/cert/X509Certificate;

    .line 9
    .line 10
    :try_start_0
    iget-object p0, p0, Lyyds/ᛴᛱᛵᛵ;->ᛱᲈᲁ:Landroid/net/http/X509TrustManagerExtensions;

    .line 11
    .line 12
    const-string v0, "RSA"

    .line 13
    .line 14
    invoke-virtual {p0, p2, v0, p1}, Landroid/net/http/X509TrustManagerExtensions;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return-object p0

    .line 19
    :catch_0
    move-exception p0

    .line 20
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    throw p1
.end method
