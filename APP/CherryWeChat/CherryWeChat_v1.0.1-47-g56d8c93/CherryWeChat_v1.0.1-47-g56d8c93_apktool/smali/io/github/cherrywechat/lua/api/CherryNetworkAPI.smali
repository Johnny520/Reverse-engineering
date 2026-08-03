.class public final Lio/github/cherrywechat/lua/api/CherryNetworkAPI;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final DEFAULT_TIMEOUT:I = 0x7530

.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

.field private static final TAG:Ljava/lang/String;

.field private static final executor:Ljava/util/concurrent/ExecutorService;

.field private static final mainHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x1e532fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->mainHandler:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$6$lambda$5(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic B(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$20$lambda$19$lambda$18$lambda$17(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$23(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$32(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$13$lambda$12(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p1, p2, p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$6$lambda$5$lambda$2$lambda$1(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private final downloadFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const-wide v0, -0x1e7bcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Ljava/net/HttpURLConnection;

    const/16 v0, 0x7530

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v0, v1}, Lcr;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void

    :catchall_0
    move-exception p2

    goto :goto_1

    :catchall_1
    move-exception p2

    goto :goto_0

    :catchall_2
    move-exception p2

    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v2

    :try_start_6
    invoke-static {v1, p2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_0
    :try_start_7
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception v1

    :try_start_8
    invoke-static {v0, p2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p2
.end method

.method public static synthetic e(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$20(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$6(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$13(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p1, p2, p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$13$lambda$12$lambda$9$lambda$8(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private final httpGet(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const-wide v0, -0x1e76bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Ljava/net/HttpURLConnection;

    const-wide v0, -0x1e72bfffff835L

    :try_start_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v0, 0x7530

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    const/16 v0, 0xc8

    if-ne p2, v0, :cond_1

    new-instance p2, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p2, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p2}, LfG;->h0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v0

    :catchall_1
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-static {p2, v0}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1e72ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p2
.end method

.method private final httpPost(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const-wide v0, -0x1e735fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Ljava/net/HttpURLConnection;

    const-wide v0, -0x1e7f5fffff835L

    :try_start_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const/16 v0, 0x7530

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-wide v0, -0x1e7fafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, -0x1e787fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x1e794fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto/16 :goto_2

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance p3, Ljava/io/OutputStreamWriter;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p3, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/OutputStreamWriter;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-interface {p3}, Ljava/io/Closeable;->close()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    const/16 p3, 0xc8

    if-ne p2, p3, :cond_2

    new-instance p2, Ljava/io/BufferedReader;

    new-instance p3, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p2, p3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {p2}, LfG;->h0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object p3

    :catchall_1
    move-exception p3

    :try_start_5
    throw p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-static {p2, p3}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v0, -0x1e7b6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_3
    move-exception p2

    :try_start_7
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_8
    invoke-static {p3, p2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_2
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p2
.end method

.method public static synthetic i(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->tableToFormData$lambda$41(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;Ljava/lang/String;ZLparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$20$lambda$19(Ljava/lang/String;Ljava/lang/String;ZLparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic k(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$6$lambda$5$lambda$4(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V

    return-void
.end method

.method public static synthetic l(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$30(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic m(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$13$lambda$12$lambda$11$lambda$10(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$31(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$14(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic p(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$20$lambda$19$lambda$16$lambda$15(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object p0

    return-object p0
.end method

.method private final pushJsonArray(Lparty/iroiro/luajava/Lua;Lorg/json/JSONArray;)V
    .locals 4

    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_5

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lorg/json/JSONObject;

    if-eqz v3, :cond_0

    check-cast v2, Lorg/json/JSONObject;

    invoke-direct {p0, p1, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->pushJsonObject(Lparty/iroiro/luajava/Lua;Lorg/json/JSONObject;)V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Lorg/json/JSONArray;

    if-eqz v3, :cond_1

    check-cast v2, Lorg/json/JSONArray;

    invoke-direct {p0, p1, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->pushJsonArray(Lparty/iroiro/luajava/Lua;Lorg/json/JSONArray;)V

    goto :goto_1

    :cond_1
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    instance-of v3, v2, Ljava/lang/Number;

    if-eqz v3, :cond_3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    goto :goto_1

    :cond_3
    instance-of v3, v2, Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    const/4 v2, -0x2

    invoke-interface {p1, v2, v1}, Lparty/iroiro/luajava/Lua;->rawSetI(II)V

    goto :goto_0

    :cond_5
    return-void
.end method

.method private final pushJsonObject(Lparty/iroiro/luajava/Lua;Lorg/json/JSONObject;)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    const-wide v1, -0x1e60cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lorg/json/JSONObject;

    if-eqz v3, :cond_0

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    check-cast v2, Lorg/json/JSONObject;

    invoke-direct {v3, p1, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->pushJsonObject(Lparty/iroiro/luajava/Lua;Lorg/json/JSONObject;)V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Lorg/json/JSONArray;

    if-eqz v3, :cond_1

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    check-cast v2, Lorg/json/JSONArray;

    invoke-direct {v3, p1, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->pushJsonArray(Lparty/iroiro/luajava/Lua;Lorg/json/JSONArray;)V

    goto :goto_1

    :cond_1
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    instance-of v3, v2, Ljava/lang/Number;

    if-eqz v3, :cond_3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Number;)V

    goto :goto_1

    :cond_3
    instance-of v3, v2, Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->push(Z)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_1
    const/4 v2, -0x2

    invoke-interface {p1, v2, v1}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    goto :goto_0

    :cond_5
    return-void
.end method

.method public static synthetic q(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p1, p2, p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$6$lambda$5$lambda$2(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic r(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$13$lambda$12$lambda$11(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V

    return-void
.end method

.method private final readTableAsMap(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p2, -0x2

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->next(I)I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v1, -0x1

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_0

    if-eqz v1, :cond_0

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_0

    :cond_1
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object v0
.end method

.method private static final register$lambda$0(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e616fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v2

    const/4 v3, 0x2

    if-lt v2, v3, :cond_1

    invoke-interface {p0, v3}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v2, p0, v3}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->readTableAsMap(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v2

    goto :goto_0

    :cond_1
    sget-object v2, LLf;->a:LLf;

    :goto_0
    :try_start_0
    sget-object v4, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v4, v1, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->httpGet(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x1e618fffff835L

    invoke-static {v4, v5, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v3
.end method

.method private static final register$lambda$13(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x1e63efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x0

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v3, p0, v1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->tableToFormData(Lparty/iroiro/luajava/Lua;I)Ljava/lang/String;

    move-result-object v1

    :cond_1
    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_2
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isString(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-wide v3, -0x1e6c0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    const-wide v3, -0x1e6c1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :goto_1
    const/4 v1, 0x3

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v4

    if-nez v4, :cond_4

    :goto_2
    return v0

    :cond_4
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v4

    const/4 v5, 0x4

    if-lt v4, v5, :cond_5

    invoke-interface {p0, v5}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v4, p0, v5}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->readTableAsMap(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v4

    goto :goto_3

    :cond_5
    sget-object v4, LLf;->a:LLf;

    :goto_3
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v6

    sget-object v7, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LD8;

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, LD8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V

    invoke-interface {v7, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v0
.end method

.method private static final register$lambda$13$lambda$12(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V
    .locals 1

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v0, p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->httpPost(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->mainHandler:Landroid/os/Handler;

    new-instance p2, LA8;

    const/4 v0, 0x1

    invoke-direct {p2, p3, p4, p0, v0}, LA8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->mainHandler:Landroid/os/Handler;

    new-instance p2, LB8;

    const/4 v0, 0x2

    invoke-direct {p2, p3, p4, p0, v0}, LB8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;I)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final register$lambda$13$lambda$12$lambda$11(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, LC8;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, LC8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;I)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$13$lambda$12$lambda$11$lambda$10(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;
    .locals 3

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1e636fffff835L

    invoke-static {v1, v2, v0, p2, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$13$lambda$12$lambda$9(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, LE8;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, LE8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$13$lambda$12$lambda$9$lambda$8(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$14(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x1e6c2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v3, p0, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->tableToJson(Lparty/iroiro/luajava/Lua;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->isString(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    const-wide v3, -0x1e6c4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_2
    const-wide v3, -0x1e6c7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    :cond_3
    :goto_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v4

    const/4 v5, 0x3

    if-lt v4, v5, :cond_4

    invoke-interface {p0, v5}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v4, p0, v5}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->readTableAsMap(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v4

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    goto :goto_1

    :cond_4
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_1
    const-wide v6, -0x1e6cafffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v6, -0x1e6d7fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    sget-object v4, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v4, v1, v3, v5}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->httpPost(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1e6e8fffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method private static final register$lambda$20(Lparty/iroiro/luajava/Lua;)I
    .locals 9

    const-wide v0, -0x1e6f8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    :goto_0
    return v7

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v1

    const/4 v4, 0x3

    if-lt v1, v4, :cond_2

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v7

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v1

    :goto_2
    move v6, v1

    goto :goto_3

    :cond_3
    const/4 v1, -0x1

    goto :goto_2

    :goto_3
    sget-object v8, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LF8;

    move-object v5, p0

    move v4, v0

    invoke-direct/range {v1 .. v6}, LF8;-><init>(Ljava/lang/String;Ljava/lang/String;ZLparty/iroiro/luajava/Lua;I)V

    invoke-interface {v8, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v7
.end method

.method private static final register$lambda$20$lambda$19(Ljava/lang/String;Ljava/lang/String;ZLparty/iroiro/luajava/Lua;I)V
    .locals 1

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v0, p0, p1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->downloadFile(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object p0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->mainHandler:Landroid/os/Handler;

    new-instance p1, Lm8;

    const/4 v0, 0x3

    invoke-direct {p1, p3, p4, v0}, Lm8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    if-eqz p2, :cond_0

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->mainHandler:Landroid/os/Handler;

    new-instance p2, LB8;

    const/4 v0, 0x1

    invoke-direct {p2, p3, p4, p0, v0}, LB8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;I)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private static final register$lambda$20$lambda$19$lambda$16(Lparty/iroiro/luajava/Lua;I)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, Lj8;

    const/16 v2, 0xd

    invoke-direct {v1, p0, p1, v2}, Lj8;-><init>(Lparty/iroiro/luajava/Lua;II)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$20$lambda$19$lambda$16$lambda$15(Lparty/iroiro/luajava/Lua;I)LTC;
    .locals 2

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$20$lambda$19$lambda$18(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, LC8;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, LC8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;I)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$20$lambda$19$lambda$18$lambda$17(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;
    .locals 4

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1e6f0fffff835L

    invoke-static {v2, v3, v1, p2, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    const/4 p2, 0x2

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$23(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e6fafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v2, 0x2

    :try_start_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v3, -0x1e6fcfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v2

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    sget-object v1, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-static {v3}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/github/cherrywechat/lua/LuaEngine;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_3

    if-eqz v1, :cond_2

    sget-object v3, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v3}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v0

    :cond_2
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_3
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x1e68dfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :goto_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1e695fffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method private static final register$lambda$25(Lparty/iroiro/luajava/Lua;)I
    .locals 10

    const-wide v0, -0x1e69dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-lt v2, v4, :cond_1

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    :try_start_0
    sget-object v5, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v5}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v5

    if-nez v5, :cond_2

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x1e69ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v4

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const-wide v0, -0x1e6aafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v4

    :cond_3
    new-instance v1, Ljava/io/File;

    invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v7

    const-wide v8, -0x1e6b9fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_4
    new-instance v7, Ldalvik/system/DexClassLoader;

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-direct {v7, v6, v1, v3, v5}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    sget-object v1, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v1, v7}, Lio/github/cherrywechat/lua/LuaEngine;->addClassLoader(Ljava/lang/ClassLoader;)V

    if-eqz v2, :cond_5

    invoke-virtual {v7, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v1, v2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_1

    :cond_5
    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v7, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return v0

    :goto_2
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1e541fffff835L

    invoke-static {v2, v3, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v4
.end method

.method private static final register$lambda$30(Lparty/iroiro/luajava/Lua;)I
    .locals 9

    const-wide v0, -0x1e549fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v2, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :try_start_0
    new-instance v4, Ljava/io/File;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-wide v5, -0x1e54bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_1
    move-object v4, v3

    :goto_0
    const-wide v5, -0x1e557fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide v5, -0x1e55cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v7, 0x2e

    const/16 v8, 0x2f

    invoke-virtual {v1, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v7, -0x1e566fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v2, v5, v6}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v4, :cond_3

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v6, v3

    :goto_1
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v5

    if-ne v5, v0, :cond_2

    sget-object v5, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-static {v6}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lio/github/cherrywechat/lua/LuaEngine;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_2

    if-eqz v5, :cond_4

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p0, v5, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    return v0

    :cond_4
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Z)V

    return v0

    :cond_5
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1e56bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1e57efffff835L

    invoke-static {v2, v3, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    :goto_3
    const/4 p0, 0x2

    return p0
.end method

.method private static final register$lambda$31(Lparty/iroiro/luajava/Lua;)I
    .locals 5

    const-wide v0, -0x1e506fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1e508fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_0
    :try_start_0
    invoke-static {v1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1e50bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v1, p0, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->pushJsonArray(Lparty/iroiro/luajava/Lua;Lorg/json/JSONArray;)V

    return v0

    :cond_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v1, p0, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->pushJsonObject(Lparty/iroiro/luajava/Lua;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    return v0
.end method

.method private static final register$lambda$32(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    const-wide v0, -0x1e50dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v1

    if-nez v1, :cond_0

    const-wide v1, -0x1e50ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0

    :cond_0
    sget-object v1, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v1, p0, v0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->tableToJson(Lparty/iroiro/luajava/Lua;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$33(Lparty/iroiro/luajava/Lua;)I
    .locals 4

    const-wide v0, -0x1e512fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide v1, -0x1e514fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-wide v2, -0x1e515fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    return v0
.end method

.method private static final register$lambda$6(Lparty/iroiro/luajava/Lua;)I
    .locals 8

    const-wide v0, -0x1e628fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->isFunction(I)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    return v0

    :cond_1
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v3

    const/4 v4, 0x3

    if-lt v3, v4, :cond_2

    invoke-interface {p0, v4}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v3, p0, v4}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->readTableAsMap(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v3

    goto :goto_1

    :cond_2
    sget-object v3, LLf;->a:LLf;

    :goto_1
    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->ref()I

    move-result v5

    sget-object v7, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LG8;

    const/4 v6, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, LG8;-><init>(Ljava/lang/String;Ljava/lang/Object;Lparty/iroiro/luajava/Lua;II)V

    invoke-interface {v7, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v0
.end method

.method private static final register$lambda$6$lambda$5(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V
    .locals 2

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v0, p0, p1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->httpGet(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->mainHandler:Landroid/os/Handler;

    new-instance v0, LA8;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, p0, v1}, LA8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    sget-object p1, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->mainHandler:Landroid/os/Handler;

    new-instance v0, LB8;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, p0, v1}, LB8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;I)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final register$lambda$6$lambda$5$lambda$2(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, LE8;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, LE8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$6$lambda$5$lambda$2$lambda$1(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)LTC;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0, p2}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$6$lambda$5$lambda$4(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, LC8;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, p2, v2}, LC8;-><init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;I)V

    invoke-virtual {v0, p0, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    return-void
.end method

.method private static final register$lambda$6$lambda$5$lambda$4$lambda$3(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;
    .locals 3

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->refGet(I)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1e620fffff835L

    invoke-static {v1, v2, v0, p2, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-interface {p0, p2, v0}, Lparty/iroiro/luajava/Lua;->pCall(II)V

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->unref(I)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private static final register$lambda$7(Lparty/iroiro/luajava/Lua;)I
    .locals 6

    const-wide v0, -0x1e62afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v2, 0x2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v3, p0, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->tableToFormData(Lparty/iroiro/luajava/Lua;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->isString(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    const-wide v3, -0x1e62cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_2
    const-wide v3, -0x1e62dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    :cond_3
    :goto_0
    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result v4

    const/4 v5, 0x3

    if-lt v4, v5, :cond_4

    invoke-interface {p0, v5}, Lparty/iroiro/luajava/Lua;->isTable(I)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v4, p0, v5}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->readTableAsMap(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object v4

    goto :goto_1

    :cond_4
    sget-object v4, LLf;->a:LLf;

    :goto_1
    :try_start_0
    sget-object v5, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryNetworkAPI;

    invoke-direct {v5, v1, v3, v4}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->httpPost(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->pushNil()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1e62efffff835L

    invoke-static {v3, v4, v1, v0, p0}, LEy;->m(JLjava/lang/StringBuilder;Ljava/lang/Exception;Lparty/iroiro/luajava/Lua;)V

    return v2
.end method

.method public static synthetic s(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$0(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic t(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$25(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method private final tableToFormData(Lparty/iroiro/luajava/Lua;I)Ljava/lang/String;
    .locals 6

    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->readTableAsMap(Lparty/iroiro/luajava/Lua;I)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    const-wide p1, -0x1e67cfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v4, LF7;

    const/16 p1, 0x10

    invoke-direct {v4, p1}, LF7;-><init>(I)V

    const/16 v5, 0x1e

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static final tableToFormData$lambda$41(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 4

    const-wide v0, -0x1e51bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1e526fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide v2, -0x1e52cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final tableToJson(Lparty/iroiro/luajava/Lua;I)Ljava/lang/String;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->pushValue(I)V

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    const/4 p2, -0x2

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->next(I)I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v1, -0x1

    invoke-interface {p1, v1}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    goto :goto_0

    :cond_1
    invoke-interface {p1, v2}, Lparty/iroiro/luajava/Lua;->pop(I)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x1e67efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic u(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$20$lambda$19$lambda$18(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)V

    return-void
.end method

.method public static synthetic v(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$33(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method

.method public static synthetic w(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p1, p2, p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$13$lambda$12$lambda$9(Lparty/iroiro/luajava/Lua;ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic x(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$6$lambda$5$lambda$4$lambda$3(Lparty/iroiro/luajava/Lua;ILjava/lang/Exception;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$20$lambda$19$lambda$16(Lparty/iroiro/luajava/Lua;I)V

    return-void
.end method

.method public static synthetic z(Lparty/iroiro/luajava/Lua;)I
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->register$lambda$7(Lparty/iroiro/luajava/Lua;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final register(Lparty/iroiro/luajava/Lua;)V
    .locals 4

    const-wide v0, -0x1f8d9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/Lua;->createTable(II)V

    new-instance v0, Lz8;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v0, -0x1f8ddfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f8e1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f8eafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f8effffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f8f9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f882fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f88bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f893fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lv8;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Lv8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f89bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f8a3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f8adfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    new-instance v0, Lz8;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Lz8;-><init>(I)V

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Lparty/iroiro/luajava/JFunction;)V

    const-wide v2, -0x1f8b4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lparty/iroiro/luajava/Lua;->setField(ILjava/lang/String;)V

    const-wide v0, -0x1f8befffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1e74ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
