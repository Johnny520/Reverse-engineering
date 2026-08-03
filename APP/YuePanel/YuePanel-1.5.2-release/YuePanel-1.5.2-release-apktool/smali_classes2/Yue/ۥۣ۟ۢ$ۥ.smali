.class public final LYue/ۥۣ۟ۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۧۧ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۢ;
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

    sget-object p1, LYue/ۥۣ۟ۡۨ;->ۥ۟۟۟ۡ:LYue/ۥۣ۟ۡۨ$ۥ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۨ$ۥ;->ۥ۟()Z

    move-result p1

    const/4 p1, 0x0

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

    new-instance p1, LYue/ۥۣ۟ۢ;

    invoke-direct {p1}, LYue/ۥۣ۟ۢ;-><init>()V

    return-object p1
.end method
