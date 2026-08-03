.class public final LYue/ۥ۟۠ۥۡ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۢۢ۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۥۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljavax/net/ssl/X509TrustManager;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/reflect/Method;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V
    .locals 1
    .param p1    # Ljavax/net/ssl/X509TrustManager;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/reflect/Method;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "trustManager"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "findByIssuerAndSignatureMethod"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ:Ljavax/net/ssl/X509TrustManager;

    iput-object p2, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥ۟۠ۥۡ$ۥ۟;Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;ILjava/lang/Object;)LYue/ۥ۟۠ۥۡ$ۥ۟;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ:Ljavax/net/ssl/X509TrustManager;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟:Ljava/lang/reflect/Method;

    :cond_1
    invoke-virtual {p0, p1, p2}, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟۟۟(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)LYue/ۥ۟۠ۥۡ$ۥ۟;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۟۠ۥۡ$ۥ۟;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۟۠ۥۡ$ۥ۟;

    iget-object v1, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ:Ljavax/net/ssl/X509TrustManager;

    iget-object v3, p1, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ:Ljavax/net/ssl/X509TrustManager;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟:Ljava/lang/reflect/Method;

    iget-object p1, p1, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟:Ljava/lang/reflect/Method;

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CustomTrustRootIndex(trustManager="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", findByIssuerAndSignatureMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;
    .locals 2
    .param p1    # Ljava/security/cert/X509Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "cert"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟:Ljava/lang/reflect/Method;

    iget-object v1, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ:Ljavax/net/ssl/X509TrustManager;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type java.security.cert.TrustAnchor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/security/cert/TrustAnchor;

    invoke-virtual {p1}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :goto_1
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "unable to get issues and signature"

    invoke-direct {v0, v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ۥ۟()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/lang/reflect/Method;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۠ۥۡ$ۥ۟;->ۥ۟:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public final ۥ۟۟۟(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)LYue/ۥ۟۠ۥۡ$ۥ۟;
    .locals 1
    .param p1    # Ljavax/net/ssl/X509TrustManager;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/reflect/Method;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "trustManager"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "findByIssuerAndSignatureMethod"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟۠ۥۡ$ۥ۟;

    invoke-direct {v0, p1, p2}, LYue/ۥ۟۠ۥۡ$ۥ۟;-><init>(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V

    return-object v0
.end method
