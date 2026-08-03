.class public final LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n*L\n152#1:371\n152#1:372,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۤ۟ۧ;->ۥ(Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Ljava/util/List<",
        "+",
        "Ljava/security/cert/X509Certificate;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n*L\n152#1:371\n152#1:372,3\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۤ۟ۧ;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۥ:Ljava/lang/String;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۤ۟ۧ;Ljava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e7;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۤ۟ۧ;

    iput-object p2, p0, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/util/List;

    iput-object p3, p0, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۤ۟ۧ;

    invoke-virtual {v0}, LYue/ۥ۟ۤ۟ۧ;->ۥ۟۟۟۟()LYue/ۥ۟ۤ۟ۦ;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/util/List;

    iget-object v2, p0, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, LYue/ۥ۟ۤ۟ۦ;->ۥ(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/util/List;

    .line 3
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LYue/ۥ۟ۥۡۤ;->ۥۣ۟۟ۡ(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 5
    check-cast v2, Ljava/security/cert/Certificate;

    .line 6
    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 7
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method
