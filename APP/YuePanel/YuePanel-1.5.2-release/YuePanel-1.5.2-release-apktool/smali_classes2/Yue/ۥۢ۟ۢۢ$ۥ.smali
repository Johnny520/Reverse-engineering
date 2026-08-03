.class public final LYue/ۥۢ۟ۢۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۟ۢۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static ۥ(LYue/ۥۢ۟ۢۢ;Ljavax/net/ssl/SSLSocketFactory;)Z
    .locals 0
    .param p0    # LYue/ۥۢ۟ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string p0, "sslSocketFactory"

    invoke-static {p1, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static ۥ۟(LYue/ۥۢ۟ۢۢ;Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .locals 0
    .param p0    # LYue/ۥۢ۟ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string p0, "sslSocketFactory"

    invoke-static {p1, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method
