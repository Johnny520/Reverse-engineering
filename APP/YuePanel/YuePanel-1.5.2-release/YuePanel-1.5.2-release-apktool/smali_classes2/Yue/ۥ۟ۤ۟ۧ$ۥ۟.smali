.class public final LYue/ۥ۟ۤ۟ۧ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"
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
    invoke-direct {p0}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/security/cert/Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "certificate"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sha256/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;->ۥ۟۟(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۟۠()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Certificate pinning requires X509 certificates"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;
    .locals 7
    .param p1    # Ljava/security/cert/X509Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ$ۥ;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p1

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    const-string p1, "publicKey.encoded"

    invoke-static {v2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۠۟(LYue/ۥۣ۟ۥۤ$ۥ;[BIIILjava/lang/Object;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۣ۟ۥۤ;->ۥۣ۟۟ۨ()LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;
    .locals 7
    .param p1    # Ljava/security/cert/X509Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ$ۥ;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p1

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    const-string p1, "publicKey.encoded"

    invoke-static {v2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۠۟(LYue/ۥۣ۟ۥۤ$ۥ;[BIIILjava/lang/Object;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ()LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    return-object p1
.end method
