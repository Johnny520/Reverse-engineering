.class public final LYue/ۥ۠ۤۡ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۡ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:LYue/ۥۢۡۧ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۟ۤۦۣ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟:LYue/ۥ۠ۦۨۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۤۡ۠$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۤۡ۠$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۡۧ۟;LYue/ۥ۟ۤۦۣ;Ljava/util/List;LYue/ۥۣ۠۠ۨ;)V
    .locals 1
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
    .param p4    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e1\u06e7\u06df;",
            "LYue/\u06e5\u06df\u06e4\u06e6\u06e3;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "tlsVersion"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cipherSuite"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localCertificates"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerCertificatesFn"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۤۡ۠;->ۥ:LYue/ۥۢۡۧ۟;

    iput-object p2, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟:LYue/ۥ۟ۤۦۣ;

    iput-object p3, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟:Ljava/util/List;

    new-instance p1, LYue/ۥ۠ۤۡ۠$ۥ۟;

    invoke-direct {p1, p4}, LYue/ۥ۠ۤۡ۠$ۥ۟;-><init>(LYue/ۥۣ۠۠ۨ;)V

    invoke-static {p1}, LYue/ۥ۠ۧ۟ۡ;->ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟:LYue/ۥ۠ۦۨۨ;

    return-void
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۢۡۧ۟;LYue/ۥ۟ۤۦۣ;Ljava/util/List;Ljava/util/List;)LYue/ۥ۠ۤۡ۠;
    .locals 1
    .param p0    # LYue/ۥۢۡۧ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۤۦۣ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
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

    sget-object v0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠$ۥ;

    invoke-virtual {v0, p0, p1, p2, p3}, LYue/ۥ۠ۤۡ۠$ۥ;->ۥ۟(LYue/ۥۢۡۧ۟;LYue/ۥ۟ۤۦۣ;Ljava/util/List;Ljava/util/List;)LYue/ۥ۠ۤۡ۠;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(Ljavax/net/ssl/SSLSession;)LYue/ۥ۠ۤۡ۠;
    .locals 1
    .param p0    # Ljavax/net/ssl/SSLSession;
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

    sget-object v0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۡ۠$ۥ;->ۥ۟۟(Ljavax/net/ssl/SSLSession;)LYue/ۥ۠ۤۡ۠;

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

    instance-of v0, p1, LYue/ۥ۠ۤۡ۠;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۠ۤۡ۠;

    iget-object v0, p1, LYue/ۥ۠ۤۡ۠;->ۥ:LYue/ۥۢۡۧ۟;

    iget-object v1, p0, LYue/ۥ۠ۤۡ۠;->ۥ:LYue/ۥۢۡۧ۟;

    if-ne v0, v1, :cond_0

    iget-object v0, p1, LYue/ۥ۠ۤۡ۠;->ۥ۟:LYue/ۥ۟ۤۦۣ;

    iget-object v1, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟:LYue/ۥ۟ۤۦۣ;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۧ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LYue/ۥ۠ۤۡ۠;->ۥ۟۟:Ljava/util/List;

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟:Ljava/util/List;

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

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ:LYue/ۥۢۡۧ۟;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟:LYue/ۥ۟ۤۦۣ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p0}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۧ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۧ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LYue/ۥ۟ۥۡۤ;->ۥۣ۟۟ۡ(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/Certificate;

    invoke-virtual {p0, v3}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۤ(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Handshake{tlsVersion="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LYue/ۥ۠ۤۡ۠;->ۥ:LYue/ۥۢۡۧ۟;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " cipherSuite="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟:LYue/ۥ۟ۤۦۣ;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " peerCertificates="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " localCertificates="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟:Ljava/util/List;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, LYue/ۥ۟ۥۡۤ;->ۥۣ۟۟ۡ(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    invoke-virtual {p0, v2}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۤ(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()LYue/ۥ۟ۤۦۣ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "cipherSuite"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_cipherSuite"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟:LYue/ۥ۟ۤۦۣ;

    return-object v0
.end method

.method public final ۥ۟()Ljava/util/List;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "localCertificates"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_localCertificates"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/security/Principal;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "localPrincipal"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_localPrincipal"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۦ()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟()Ljava/util/List;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "peerCertificates"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_peerCertificates"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۧ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/security/Principal;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "peerPrincipal"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_peerPrincipal"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۨ()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟۠()LYue/ۥۢۡۧ۟;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "tlsVersion"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_tlsVersion"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ:LYue/ۥۢۡۧ۟;

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥ۟ۤۦۣ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "cipherSuite"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟:LYue/ۥ۟ۤۦۣ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getType()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public final ۥ۟۟۟ۥ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "localCertificates"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ()Ljava/security/Principal;
    .locals 3
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "localPrincipal"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟:Ljava/util/List;

    invoke-static {v0}, LYue/ۥ۟ۥۢ۠;->ۥ۟۠ۥۣ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/security/cert/X509Certificate;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/security/cert/X509Certificate;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public final ۥ۟۟۟ۧ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "peerCertificates"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟:LYue/ۥ۠ۦۨۨ;

    invoke-interface {v0}, LYue/ۥ۠ۦۨۨ;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۟ۨ()Ljava/security/Principal;
    .locals 3
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "peerPrincipal"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۤۡ۠;->ۥ۟۟۟ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۥۢ۠;->ۥ۟۠ۥۣ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/security/cert/X509Certificate;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/security/cert/X509Certificate;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public final ۥ۟۟۠()LYue/ۥۢۡۧ۟;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "tlsVersion"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۡ۠;->ۥ:LYue/ۥۢۡۧ۟;

    return-object v0
.end method
