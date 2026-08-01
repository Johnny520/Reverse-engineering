.class public Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static build()L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;
    .locals 5

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder;->getX509TrustManager()Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 6
    .line 7
    invoke-direct {v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0}, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder;->getSocketFactory(Ljavax/net/ssl/TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v3, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Ljavax/net/ssl/SSLSocketFactory;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v3, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljavax/net/ssl/X509TrustManager;

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    :cond_0
    iput-object v4, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 42
    .line 43
    :cond_1
    iput-object v2, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Ljavax/net/ssl/SSLSocketFactory;

    .line 44
    .line 45
    sget-object v2, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;

    .line 46
    .line 47
    sget-object v2, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljavax/net/ssl/X509TrustManager;)Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput-object v2, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏哲世:Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;

    .line 54
    .line 55
    iput-object v0, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljavax/net/ssl/X509TrustManager;

    .line 56
    .line 57
    invoke-static {}, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v2, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世哲苏:Ljavax/net/ssl/HostnameVerifier;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_2

    .line 71
    .line 72
    iput-object v4, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪兰苏哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 73
    .line 74
    :cond_2
    iput-object v0, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世哲苏:Ljavax/net/ssl/HostnameVerifier;

    .line 75
    .line 76
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 77
    .line 78
    invoke-direct {v0, v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public static getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    new-instance v0, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder$2;

    .line 2
    .line 3
    invoke-direct {v0}, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder$2;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 46
    invoke-static {}, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder;->getX509TrustManager()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    invoke-static {v0}, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder;->getSocketFactory(Ljavax/net/ssl/TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    return-object v0
.end method

.method public static getSocketFactory(Ljavax/net/ssl/TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 4

    .line 1
    const-wide v0, -0x36a54236051405a7L    # -2.3854093099636654E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object p0, v1, v3

    .line 20
    .line 21
    new-instance p0, Ljava/security/SecureRandom;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2, v1, p0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object p0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    .line 44
    .line 45
    :goto_2
    return-object v2
.end method

.method public static getX509TrustManager()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    new-instance v0, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder$1;

    .line 2
    .line 3
    invoke-direct {v0}, Llin/xposed/hook/javaplugin/online/upload/OkHttpClientBuilder$1;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
