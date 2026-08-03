.class public final LUk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ltc;


# instance fields
.field public final a:LYj;

.field public final b:I

.field public c:Ljava/net/HttpURLConnection;

.field public d:Ljava/io/InputStream;

.field public volatile e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LYj;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUk;->a:LYj;

    iput p2, p0, LUk;->b:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public final b(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;
    .locals 7

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ge p2, v0, :cond_a

    if-eqz p3, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p3}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/net/URI;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p3, Lna;

    const-string v0, "In re-direct loop"

    invoke-direct {p3, v0, v2, v1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p3
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    iget p3, p0, LUk;->b:I

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8

    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v6, v5}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v3, p3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v3, p3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    const/4 p3, 0x1

    invoke-virtual {v3, p3}, Ljava/net/URLConnection;->setDoInput(Z)V

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    iput-object v3, p0, LUk;->c:Ljava/net/HttpURLConnection;

    :try_start_2
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    iget-object v0, p0, LUk;->c:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, LUk;->d:Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6

    iget-boolean v0, p0, LUk;->e:Z

    if-eqz v0, :cond_3

    return-object v1

    :cond_3
    iget-object v0, p0, LUk;->c:Ljava/net/HttpURLConnection;

    :try_start_3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move v0, v2

    :goto_2
    div-int/lit8 v3, v0, 0x64

    const/4 v4, 0x2

    const/4 v5, 0x3

    if-ne v3, v4, :cond_6

    iget-object p1, p0, LUk;->c:Ljava/net/HttpURLConnection;

    :try_start_4
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    move-result p2

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p3

    int-to-long v0, p2

    new-instance p2, LAb;

    invoke-direct {p2, p3, v0, v1}, LAb;-><init>(Ljava/io/InputStream;J)V

    iput-object p2, p0, LUk;->d:Ljava/io/InputStream;

    goto :goto_3

    :catch_2
    move-exception p2

    goto :goto_4

    :cond_4
    const-string p2, "HttpUrlFetcher"

    invoke-static {p2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    :cond_5
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p2

    iput-object p2, p0, LUk;->d:Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :goto_3
    iget-object p1, p0, LUk;->d:Ljava/io/InputStream;

    return-object p1

    :goto_4
    new-instance p3, Lna;

    :try_start_5
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    const-string p1, "Failed to obtain InputStream"

    invoke-direct {p3, p1, v2, p2}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p3

    :cond_6
    if-ne v3, v5, :cond_8

    iget-object v2, p0, LUk;->c:Ljava/net/HttpURLConnection;

    const-string v3, "Location"

    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    :try_start_6
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1, v2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/net/MalformedURLException; {:try_start_6 .. :try_end_6} :catch_4

    invoke-virtual {p0}, LUk;->c()V

    add-int/2addr p2, p3

    invoke-virtual {p0, v1, p2, p1, p4}, LUk;->b(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    :catch_4
    move-exception p1

    new-instance p2, Lna;

    const-string p3, "Bad redirect url: "

    invoke-static {p3, v2}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, v0, p1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p2

    :cond_7
    new-instance p1, Lna;

    const-string p2, "Received empty or null redirect url"

    invoke-direct {p1, p2, v0, v1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p1

    :cond_8
    if-ne v0, v2, :cond_9

    new-instance p1, Lna;

    const-string p2, "Http request failed"

    invoke-direct {p1, p2, v0, v1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p1

    :cond_9
    :try_start_7
    new-instance p1, Lna;

    iget-object p2, p0, LUk;->c:Ljava/net/HttpURLConnection;

    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v0, v1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    :catch_5
    move-exception p1

    new-instance p2, Lna;

    const-string p3, "Failed to get a response message"

    invoke-direct {p2, p3, v0, p1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p2

    :catch_6
    move-exception p1

    new-instance p2, Lna;

    iget-object p3, p0, LUk;->c:Ljava/net/HttpURLConnection;

    :try_start_8
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    :catch_7
    const-string p3, "Failed to connect or obtain data"

    invoke-direct {p2, p3, v2, p1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p2

    :catch_8
    move-exception p1

    new-instance p2, Lna;

    const-string p3, "URL.openConnection threw"

    invoke-direct {p2, p3, v0, p1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p2

    :cond_a
    new-instance p1, Lna;

    const-string p2, "Too many (> 5) redirects!"

    invoke-direct {p1, p2, v2, v1}, Lna;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    throw p1
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LUk;->d:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    iget-object v0, p0, LUk;->c:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, LUk;->c:Ljava/net/HttpURLConnection;

    return-void
.end method

.method public final cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LUk;->e:Z

    return-void
.end method

.method public final d(Lwu;Lsc;)V
    .locals 5

    iget-object p1, p0, LUk;->a:LYj;

    const-string v0, "HttpUrlFetcher"

    sget v1, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    const/4 v1, 0x2

    :try_start_0
    invoke-virtual {p1}, LYj;->d()Ljava/net/URL;

    move-result-object v2

    iget-object p1, p1, LYj;->b:Lsk;

    invoke-interface {p1}, Lsk;->a()Ljava/util/Map;

    move-result-object p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v3, v4, p1}, LUk;->b(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;

    move-result-object p1

    invoke-interface {p2, p1}, Lsc;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    invoke-interface {p2, p1}, Lsc;->b(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_0
    return-void

    :goto_0
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    :cond_1
    throw p1
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
