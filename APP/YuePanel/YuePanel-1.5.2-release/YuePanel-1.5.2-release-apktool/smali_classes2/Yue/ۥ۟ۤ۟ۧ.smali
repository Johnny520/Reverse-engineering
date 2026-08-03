.class public final LYue/ۥ۟ۤ۟ۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۤ۟ۧ$ۥ;,
        LYue/ۥ۟ۤ۟ۧ$ۥ۟;,
        LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥ۟ۤ۟ۧ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:LYue/ۥ۟ۤ۟ۧ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e7$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۟ۤ۟ۦ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۟ۤ۟ۧ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟:LYue/ۥ۟ۤ۟ۧ$ۥ۟;

    new-instance v0, LYue/ۥ۟ۤ۟ۧ$ۥ;

    invoke-direct {v0}, LYue/ۥ۟ۤ۟ۧ$ۥ;-><init>()V

    invoke-virtual {v0}, LYue/ۥ۟ۤ۟ۧ$ۥ;->ۥ۟()LYue/ۥ۟ۤ۟ۧ;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟۟:LYue/ۥ۟ۤ۟ۧ;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;LYue/ۥ۟ۤ۟ۦ;)V
    .locals 1
    .param p1    # Ljava/util/Set;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۤ۟ۦ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e7$\u06e5\u06df\u06df;",
            ">;",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e6;",
            ")V"
        }
    .end annotation

    const-string v0, "pins"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ:Ljava/util/Set;

    .line 3
    iput-object p2, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟:LYue/ۥ۟ۤ۟ۦ;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Set;LYue/ۥ۟ۤ۟ۦ;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, LYue/ۥ۟ۤ۟ۧ;-><init>(Ljava/util/Set;LYue/ۥ۟ۤ۟ۦ;)V

    return-void
.end method

.method public static final ۥ۟۟۟ۡ(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/security/cert/Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟:LYue/ۥ۟ۤ۟ۧ$ۥ۟;

    invoke-virtual {v0, p0}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;->ۥ(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p0    # Ljava/security/cert/X509Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟:LYue/ۥ۟ۤ۟ۧ$ۥ۟;

    invoke-virtual {v0, p0}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;->ۥ۟(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;
    .locals 1
    .param p0    # Ljava/security/cert/X509Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟:LYue/ۥ۟ۤ۟ۧ$ۥ۟;

    invoke-virtual {v0, p0}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;->ۥ۟۟(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥ۟ۤ۟ۧ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۟ۤ۟ۧ;

    iget-object v0, p1, LYue/ۥ۟ۤ۟ۧ;->ۥ:Ljava/util/Set;

    iget-object v1, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ:Ljava/util/Set;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LYue/ۥ۟ۤ۟ۧ;->ۥ۟:LYue/ۥ۟ۤ۟ۦ;

    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟:LYue/ۥ۟ۤ۟ۦ;

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

    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x5ed

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x29

    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟:LYue/ۥ۟ۤ۟ۦ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public final ۥ(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    const-string v0, "hostname"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerCertificates"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;

    invoke-direct {v0, p0, p2, p1}, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;-><init>(LYue/ۥ۟ۤ۟ۧ;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟(Ljava/lang/String;LYue/ۥۣ۠۠ۨ;)V

    return-void
.end method

.method public final varargs ۥ۟(Ljava/lang/String;[Ljava/security/cert/Certificate;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [Ljava/security/cert/Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "replaced with {@link #check(String, List)}."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "check(hostname, peerCertificates.toList())"
            imports = {}
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    const-string v0, "hostname"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerCertificates"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥ۟ۢ۟۠;->ۥ۠ۥۥۥ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۤ۟ۧ;->ۥ(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final ۥ۟۟(Ljava/lang/String;LYue/ۥۣ۠۠ۨ;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/X509Certificate;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "hostname"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cleanedPeerCertificatesFn"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move-object v5, v4

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;

    invoke-virtual {v6}, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;->ۥ۟()Ljava/lang/String;

    move-result-object v7

    const-string v8, "sha256"

    invoke-static {v7, v8}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    if-nez v4, :cond_3

    sget-object v4, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟:LYue/ۥ۟ۤ۟ۧ$ۥ۟;

    invoke-virtual {v4, v2}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;->ۥ۟۟(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;

    move-result-object v4

    :cond_3
    invoke-virtual {v6}, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;->ۥ()LYue/ۥۣ۟ۥۤ;

    move-result-object v6

    invoke-static {v6, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    return-void

    :cond_4
    const-string v8, "sha1"

    invoke-static {v7, v8}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    if-nez v5, :cond_5

    sget-object v5, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟:LYue/ۥ۟ۤ۟ۧ$ۥ۟;

    invoke-virtual {v5, v2}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;->ۥ۟(Ljava/security/cert/X509Certificate;)LYue/ۥۣ۟ۥۤ;

    move-result-object v5

    :cond_5
    invoke-virtual {v6}, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;->ۥ()LYue/ۥۣ۟ۥۤ;

    move-result-object v6

    invoke-static {v6, v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    return-void

    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unsupported hashAlgorithm: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Certificate pinning failure!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n  Peer certificate chain:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "\n    "

    if-eqz v2, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟:LYue/ۥ۟ۤ۟ۧ$ۥ۟;

    invoke-virtual {v3, v2}, LYue/ۥ۟ۤ۟ۧ$ۥ۟;->ۥ(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_8
    const-string p2, "\n  Pinned certificates for "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۥ۟۟۟(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e7$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation

    const-string v0, "hostname"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ:Ljava/util/Set;

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;

    invoke-virtual {v3, p1}, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;->ۥ۟۟۟۟(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    const-string v3, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>"

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LYue/ۥۣۢۢ۟;->ۥ۟۟۟ۡ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final ۥ۟۟۟۟()LYue/ۥ۟ۤ۟ۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟:LYue/ۥ۟ۤ۟ۦ;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()Ljava/util/Set;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e7$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ:Ljava/util/Set;

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ(LYue/ۥ۟ۤ۟ۦ;)LYue/ۥ۟ۤ۟ۧ;
    .locals 2
    .param p1    # LYue/ۥ۟ۤ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "certificateChainCleaner"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ۟:LYue/ۥ۟ۤ۟ۦ;

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۤ۟ۧ;

    iget-object v1, p0, LYue/ۥ۟ۤ۟ۧ;->ۥ:Ljava/util/Set;

    invoke-direct {v0, v1, p1}, LYue/ۥ۟ۤ۟ۧ;-><init>(Ljava/util/Set;LYue/ۥ۟ۤ۟ۦ;)V

    :goto_0
    return-object v0
.end method
