.class public final L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世哲苏兰;
.super L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世哲兰苏;


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:Z


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世哲苏兰:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    sput-boolean v0, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Z

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.android.org.conscrypt"

    .line 5
    .line 6
    const-string v1, ".SSLParametersImpl"

    .line 7
    .line 8
    const-string v2, ".OpenSSLSocketFactoryImpl"

    .line 9
    .line 10
    const-string v3, ".OpenSSLSocketImpl"

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏世兰;

    .line 35
    .line 36
    invoke-direct {v0, v3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    sget-object v1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 42
    .line 43
    const-class v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x5

    .line 50
    const-string v3, "unable to load android socket classes"

    .line 51
    .line 52
    invoke-static {v2, v1, v3, v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    :goto_0
    new-instance v1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世苏兰;

    .line 57
    .line 58
    sget-object v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 59
    .line 60
    invoke-direct {v1, v2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰哲世;)V

    .line 61
    .line 62
    .line 63
    new-instance v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世苏兰;

    .line 64
    .line 65
    sget-object v3, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;

    .line 66
    .line 67
    invoke-direct {v2, v3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰哲世;)V

    .line 68
    .line 69
    .line 70
    new-instance v3, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世苏兰;

    .line 71
    .line 72
    sget-object v4, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 73
    .line 74
    invoke-direct {v3, v4}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰哲世;)V

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x4

    .line 78
    new-array v4, v4, [L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    aput-object v0, v4, v5

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    aput-object v1, v4, v0

    .line 85
    .line 86
    const/4 v0, 0x2

    .line 87
    aput-object v2, v4, v0

    .line 88
    .line 89
    const/4 v0, 0x3

    .line 90
    aput-object v3, v4, v0

    .line 91
    .line 92
    invoke-static {v4}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏楪世兰哲([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_1

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    move-object v3, v2

    .line 116
    check-cast v3, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;

    .line 117
    .line 118
    invoke-interface {v3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_0

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    iput-object v1, p0, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 129
    .line 130
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;

    .line 20
    .line 21
    invoke-interface {v2, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(Ljavax/net/ssl/SSLSocket;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v1

    .line 29
    :goto_0
    check-cast v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {v0, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    return-object v1
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v1, v0

    .line 21
    check-cast v1, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;

    .line 22
    .line 23
    invoke-interface {v1, p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(Ljavax/net/ssl/SSLSocket;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    :goto_0
    check-cast v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-interface {v0, p1, p2, p3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljavax/net/ssl/X509TrustManager;)Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    new-instance v0, Landroid/net/http/X509TrustManagerExtensions;

    .line 3
    .line 4
    invoke-direct {v0, p1}, Landroid/net/http/X509TrustManagerExtensions;-><init>(Ljavax/net/ssl/X509TrustManager;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catch_0
    move-object v0, p0

    .line 9
    :goto_0
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世苏兰哲;-><init>(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p0, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    :try_start_1
    const-string v0, "buildTrustRootIndex"

    .line 22
    .line 23
    invoke-static {v0}, Landroid/os/StrictMode;->noteSlowCall(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "findTrustAnchorByIssuerAndSignature"

    .line 31
    .line 32
    const-class v2, Ljava/security/cert/X509Certificate;

    .line 33
    .line 34
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    .line 45
    .line 46
    new-instance v1, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏兰哲;

    .line 47
    .line 48
    invoke-direct {v1, p1, v0}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏兰哲;-><init>(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_1
    new-instance v1, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世苏兰哲;

    .line 53
    .line 54
    invoke-interface {p1}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    array-length v0, p1

    .line 59
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, [Ljava/security/cert/X509Certificate;

    .line 64
    .line 65
    invoke-direct {v1, p1}, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世苏兰哲;-><init>([Ljava/security/cert/X509Certificate;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-direct {p0, v1}, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲兰苏;)V

    .line 69
    .line 70
    .line 71
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Landroid/content/Context;

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final 飘花落叶言子楪苏兰世哲()Ljavax/net/ssl/SSLContext;
    .locals 0

    .line 1
    const-string p0, "newSSLContext"

    .line 2
    .line 3
    invoke-static {p0}, Landroid/os/StrictMode;->noteSlowCall(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "TLS"

    .line 7
    .line 8
    invoke-static {p0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲世兰(Ljava/lang/String;ILjava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 p0, 0x5

    .line 2
    const-string v0, "OkHttp"

    .line 3
    .line 4
    if-ne p2, p0, :cond_0

    .line 5
    .line 6
    invoke-static {v0, p1, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {v0, p1, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    .line 12
    .line 13
    return-void
.end method
