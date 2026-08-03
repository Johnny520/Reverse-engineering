.class public final LYue/ۥۢ۟ۨ;
.super LYue/ۥ۟۠ۥۣ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢ۟ۨ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۤ:LYue/ۥۢ۟ۨ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ۟۟۟ۢ:Ljava/lang/Class;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "-",
            "Ljavax/net/ssl/SSLSocketFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥۣ۟۟۟:Ljava/lang/Class;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢ۟ۨ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢ۟ۨ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢ۟ۨ;->ۥ۟۟۟ۤ:LYue/ۥۢ۟ۨ$ۥ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "-",
            "Ljavax/net/ssl/SSLSocket;",
            ">;",
            "Ljava/lang/Class<",
            "-",
            "Ljavax/net/ssl/SSLSocketFactory;",
            ">;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "sslSocketClass"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sslSocketFactoryClass"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paramClass"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LYue/ۥ۟۠ۥۣ;-><init>(Ljava/lang/Class;)V

    iput-object p2, p0, LYue/ۥۢ۟ۨ;->ۥ۟۟۟ۢ:Ljava/lang/Class;

    iput-object p3, p0, LYue/ۥۢ۟ۨ;->ۥۣ۟۟۟:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public ۥ۟۟(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .locals 2
    .param p1    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "sslSocketFactory"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢ۟ۨ;->ۥۣ۟۟۟:Ljava/lang/Class;

    const-string v1, "sslParameters"

    invoke-static {p1, v0, v1}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۢۨ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    const-string v0, "x509TrustManager"

    const-class v1, Ljavax/net/ssl/X509TrustManager;

    invoke-static {p1, v1, v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۢۨ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    if-nez v0, :cond_0

    const-string v0, "trustManager"

    invoke-static {p1, v1, v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۢۨ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    :cond_0
    return-object v0
.end method

.method public ۥ۟۟۟(Ljavax/net/ssl/SSLSocketFactory;)Z
    .locals 1
    .param p1    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sslSocketFactory"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢ۟ۨ;->ۥ۟۟۟ۢ:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
