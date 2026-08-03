.class public final LYue/ۥ۟ۦۨۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۧۧ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۨۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Ljavax/net/ssl/SSLSocket;)Z
    .locals 1
    .param p1    # Ljavax/net/ssl/SSLSocket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۟ۦۨ۠;->ۥ۟۟۟ۡ:LYue/ۥ۟ۦۨ۠$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۦۨ۠$ۥ;->ۥ۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/conscrypt/Conscrypt;->isConscrypt(Ljavax/net/ssl/SSLSocket;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟(Ljavax/net/ssl/SSLSocket;)LYue/ۥۢ۟ۢۢ;
    .locals 1
    .param p1    # Ljavax/net/ssl/SSLSocket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۟ۦۨۡ;

    invoke-direct {p1}, LYue/ۥ۟ۦۨۡ;-><init>()V

    return-object p1
.end method
