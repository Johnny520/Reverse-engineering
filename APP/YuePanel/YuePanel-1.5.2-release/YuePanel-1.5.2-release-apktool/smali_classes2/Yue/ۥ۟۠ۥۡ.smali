.class public final LYue/ۥ۟۠ۥۡ;
.super LYue/ۥۡۤۡۢ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"
    }
.end annotation

.annotation build LYue/ۥۢ۠ۥۦ;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟۠ۥۡ$ۥ;,
        LYue/ۥ۟۠ۥۡ$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟۟ۢ:LYue/ۥ۟۠ۥۡ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥۣ۟۟۟:Z


# instance fields
.field public final ۥ۟۟۟۠:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06e2\u06e2;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:LYue/ۥ۟ۤۨۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۟۠ۥۡ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟۠ۥۡ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟ۢ:LYue/ۥ۟۠ۥۡ$ۥ;

    sget-object v0, LYue/ۥۡۤۡۢ;->ۥ:LYue/ۥۡۤۡۢ$ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۢ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_0
    sput-boolean v1, LYue/ۥ۟۠ۥۡ;->ۥۣ۟۟۟:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, LYue/ۥۡۤۡۢ;-><init>()V

    sget-object v0, LYue/ۥۢ۟ۨ;->ۥ۟۟۟ۤ:LYue/ۥۢ۟ۨ$ۥ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LYue/ۥۢ۟ۨ$ۥ;->ۥ۟(LYue/ۥۢ۟ۨ$ۥ;Ljava/lang/String;ILjava/lang/Object;)LYue/ۥۢ۟ۢۢ;

    move-result-object v0

    new-instance v1, LYue/ۥ۟ۨۧۧ;

    sget-object v3, LYue/ۥ۟۠ۥۣ;->ۥ۟۟۟۠:LYue/ۥ۟۠ۥۣ$ۥ;

    invoke-virtual {v3}, LYue/ۥ۟۠ۥۣ$ۥ;->ۥ۟۟۟()LYue/ۥ۟ۨۧۧ$ۥ;

    move-result-object v3

    invoke-direct {v1, v3}, LYue/ۥ۟ۨۧۧ;-><init>(LYue/ۥ۟ۨۧۧ$ۥ;)V

    new-instance v3, LYue/ۥ۟ۨۧۧ;

    sget-object v4, LYue/ۥ۟ۦۨۡ;->ۥ:LYue/ۥ۟ۦۨۡ$ۥ۟;

    invoke-virtual {v4}, LYue/ۥ۟ۦۨۡ$ۥ۟;->ۥ()LYue/ۥ۟ۨۧۧ$ۥ;

    move-result-object v4

    invoke-direct {v3, v4}, LYue/ۥ۟ۨۧۧ;-><init>(LYue/ۥ۟ۨۧۧ$ۥ;)V

    new-instance v4, LYue/ۥ۟ۨۧۧ;

    sget-object v5, LYue/ۥۣ۟ۢ;->ۥ:LYue/ۥۣ۟ۢ$ۥ۟;

    invoke-virtual {v5}, LYue/ۥۣ۟ۢ$ۥ۟;->ۥ()LYue/ۥ۟ۨۧۧ$ۥ;

    move-result-object v5

    invoke-direct {v4, v5}, LYue/ۥ۟ۨۧۧ;-><init>(LYue/ۥ۟ۨۧۧ$ۥ;)V

    const/4 v5, 0x4

    new-array v5, v5, [LYue/ۥۢ۟ۢۢ;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    aput-object v1, v5, v2

    const/4 v0, 0x2

    aput-object v3, v5, v0

    const/4 v0, 0x3

    aput-object v4, v5, v0

    invoke-static {v5}, LYue/ۥ۟ۥۣۡ;->ۥ۟۟ۢۡ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LYue/ۥۢ۟ۢۢ;

    invoke-interface {v3}, LYue/ۥۢ۟ۢۢ;->isSupported()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iput-object v1, p0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟۠:Ljava/util/List;

    sget-object v0, LYue/ۥ۟ۤۨۦ;->ۥ۟۟۟:LYue/ۥ۟ۤۨۦ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۤۨۦ$ۥ;->ۥ()LYue/ۥ۟ۤۨۦ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۤۨۦ;

    return-void
.end method

.method public static final synthetic ۥۣ۟۟۠()Z
    .locals 1

    sget-boolean v0, LYue/ۥ۟۠ۥۡ;->ۥۣ۟۟۟:Z

    return v0
.end method


# virtual methods
.method public ۥ۟۟۟(Ljavax/net/ssl/X509TrustManager;)LYue/ۥ۟ۤ۟ۦ;
    .locals 1
    .param p1    # Ljavax/net/ssl/X509TrustManager;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "trustManager"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۟۠ۤۦ;->ۥ۟۟۟:LYue/ۥ۟۠ۤۦ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۟۠ۤۦ$ۥ;->ۥ(Ljavax/net/ssl/X509TrustManager;)LYue/ۥ۟۠ۤۦ;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۡۤۡۢ;->ۥ۟۟۟(Ljavax/net/ssl/X509TrustManager;)LYue/ۥ۟ۤ۟ۦ;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟۟۟(Ljavax/net/ssl/X509TrustManager;)LYue/ۥۢۢۢ۠;
    .locals 3
    .param p1    # Ljavax/net/ssl/X509TrustManager;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "trustManager"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "findTrustAnchorByIssuerAndSignature"

    const-class v2, Ljava/security/cert/X509Certificate;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v1, LYue/ۥ۟۠ۥۡ$ۥ۟;

    const-string v2, "method"

    invoke-static {v0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, LYue/ۥ۟۠ۥۡ$ۥ۟;-><init>(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-super {p0, p1}, LYue/ۥۡۤۡۢ;->ۥ۟۟۟۟(Ljavax/net/ssl/X509TrustManager;)LYue/ۥۢۢۢ۠;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public ۥ۟۟۟۠(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .param p1    # Ljavax/net/ssl/SSLSocket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/net/ssl/SSLSocket;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LYue/ۥۢ۟ۢۢ;

    invoke-interface {v2, p1}, LYue/ۥۢ۟ۢۢ;->ۥ(Ljavax/net/ssl/SSLSocket;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, LYue/ۥۢ۟ۢۢ;

    if-eqz v1, :cond_2

    invoke-interface {v1, p1, p2, p3}, LYue/ۥۢ۟ۢۢ;->ۥ۟۟۟۟(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public ۥ۟۟۟ۡ(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 1
    .param p1    # Ljava/net/Socket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/net/InetSocketAddress;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "socket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-ne p2, p3, :cond_0

    new-instance p2, Ljava/io/IOException;

    const-string p3, "Exception in connect"

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    throw p1
.end method

.method public ۥ۟۟۟ۤ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 4
    .param p1    # Ljavax/net/ssl/SSLSocket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LYue/ۥۢ۟ۢۢ;

    invoke-interface {v3, p1}, LYue/ۥۢ۟ۢۢ;->ۥ(Ljavax/net/ssl/SSLSocket;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LYue/ۥۢ۟ۢۢ;

    if-eqz v1, :cond_2

    invoke-interface {v1, p1}, LYue/ۥۢ۟ۢۢ;->ۥ۟(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_2
    return-object v2
.end method

.method public ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "closer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۤۨۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۤۨۦ;->ۥ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "hostname"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۤۨۦ;

    invoke-virtual {v0, p2}, LYue/ۥ۟ۤۨۦ;->ۥ۟(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LYue/ۥۡۤۡۢ;->ۥ۟۟۟ۨ(LYue/ۥۡۤۡۢ;Ljava/lang/String;ILjava/lang/Throwable;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠ۢ(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .locals 4
    .param p1    # Ljavax/net/ssl/SSLSocketFactory;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "sslSocketFactory"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LYue/ۥۢ۟ۢۢ;

    invoke-interface {v3, p1}, LYue/ۥۢ۟ۢۢ;->ۥ۟۟۟(Ljavax/net/ssl/SSLSocketFactory;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LYue/ۥۢ۟ۢۢ;

    if-eqz v1, :cond_2

    invoke-interface {v1, p1}, LYue/ۥۢ۟ۢۢ;->ۥ۟۟(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;

    move-result-object v2

    :cond_2
    return-object v2
.end method
