.class public final LYue/ۥ۟ۤ۟ۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
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
    invoke-direct {p0}, LYue/ۥ۟ۤ۟ۦ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljavax/net/ssl/X509TrustManager;)LYue/ۥ۟ۤ۟ۦ;
    .locals 1
    .param p1    # Ljavax/net/ssl/X509TrustManager;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "trustManager"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۤۡۢ;->ۥ:LYue/ۥۡۤۡۢ$ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۡ()LYue/ۥۡۤۡۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥۡۤۡۢ;->ۥ۟۟۟(Ljavax/net/ssl/X509TrustManager;)LYue/ۥ۟ۤ۟ۦ;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ۥ۟([Ljava/security/cert/X509Certificate;)LYue/ۥ۟ۤ۟ۦ;
    .locals 3
    .param p1    # [Ljava/security/cert/X509Certificate;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "caCerts"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۢۦ۠;

    new-instance v1, LYue/ۥ۟ۢۦۥ;

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/security/cert/X509Certificate;

    invoke-direct {v1, p1}, LYue/ۥ۟ۢۦۥ;-><init>([Ljava/security/cert/X509Certificate;)V

    invoke-direct {v0, v1}, LYue/ۥ۟ۢۦ۠;-><init>(LYue/ۥۢۢۢ۠;)V

    return-object v0
.end method
