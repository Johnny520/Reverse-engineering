.class public LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;
.super LYue/ۥ۠ۤۨ۠$ۥ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۨ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e4\u06e8\u06e0$\u06e5\u06df<",
        "LYue/\u06e5\u06df\u06e6\u06e7\u06e4$\u06e5\u06df\u06df\u06df\u06df;",
        ">;",
        "LYue/\u06e5\u06df\u06e6\u06e7\u06e4$\u06e5\u06df\u06df\u06df\u06df;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠۠:I = 0x14

.field public static final ۥ۟۟۠ۡ:Ljava/lang/String; = "Location"

.field public static final ۥ۟۟۠ۢ:Ljava/util/regex/Pattern;


# instance fields
.field public final ۥ۟۟۟۠:I

.field public final ۥ۟۟۟ۡ:Ljava/lang/String;

.field public ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

.field public ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

.field public ۥ۟۟۟ۤ:Ljava/net/HttpURLConnection;

.field public ۥ۟۟۟ۥ:Ljava/lang/String;

.field public final ۥ۟۟۟ۦ:Ljava/lang/String;

.field public ۥ۟۟۟ۧ:Z

.field public ۥ۟۟۟ۨ:Z

.field public ۥ۟۟۠:I

.field public final ۥ۟۟۠۟:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "(\\w+)/\\w*\\+?xml.*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۢ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟;-><init>(LYue/ۥ۠ۤۨ۠$ۥ;)V

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۧ:Z

    .line 3
    iput-boolean v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    .line 4
    iput v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠:I

    const/16 v1, 0x190

    .line 5
    iput v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟۠:I

    .line 6
    const-string v1, "Request not made"

    iput-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    .line 7
    new-instance v1, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-direct {v1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;-><init>()V

    iput-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠۟:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    .line 8
    iput-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۦ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟;-><init>(LYue/ۥ۠ۤۨ۠$ۥ;)V

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۧ:Z

    .line 11
    iput-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    .line 12
    iput v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠:I

    .line 13
    iput-object p1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۤ:Ljava/net/HttpURLConnection;

    .line 14
    iput-object p2, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠۟:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    .line 15
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟;->valueOf(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    .line 16
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ:Ljava/net/URL;

    .line 17
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟۠:I

    .line 18
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۦ:Ljava/lang/String;

    .line 20
    invoke-static {p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۧ(Ljava/net/HttpURLConnection;)Ljava/util/LinkedHashMap;

    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤۢ(Ljava/util/Map;)V

    .line 22
    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ:Ljava/net/URL;

    invoke-static {p2, v0, p1}, LYue/ۥ۟ۧۦ۟;->ۥ۟۟۟(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;Ljava/net/URL;Ljava/util/Map;)V

    if-eqz p3, :cond_3

    .line 23
    invoke-virtual {p3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۡۧ()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 24
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۢۤ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 25
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, v0, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۤ()V

    .line 27
    iget p1, p3, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠:I

    const/16 p2, 0x14

    if-ge p1, p2, :cond_2

    goto :goto_1

    .line 28
    :cond_2
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "Too many redirects occurred trying to load URL %s"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method public static ۥۣ۟۟ۦ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)Ljava/net/HttpURLConnection;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۡ()Ljava/net/Proxy;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡۡ()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡۡ()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    :cond_1
    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤ۟(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)LYue/ۥۡۦۤۨ;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v1, LYue/ۥ۟ۢۡ۠;->ۥ۟۟۟:LYue/ۥ۟ۢۡ۠$ۥ;

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤ۟(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)LYue/ۥۡۦۤۨ;

    move-result-object v2

    invoke-interface {v1, v2, v0}, LYue/ۥ۟ۢۡ۠$ۥ;->ۥ۟(LYue/ۥۡۦۤۨ;Ljava/net/HttpURLConnection;)V

    :cond_2
    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۟ۦۧۤ$ۥ۟۟;->ۥ۟۟۟()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    :cond_3
    invoke-static {p0, v0}, LYue/ۥ۟ۧۦ۟;->ۥ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;Ljava/net/HttpURLConnection;)V

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡۦ()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    return-object v0
.end method

.method public static ۥۣ۟۟ۧ(Ljava/net/HttpURLConnection;)Ljava/util/LinkedHashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object v3

    if-nez v2, :cond_1

    if-nez v3, :cond_1

    return-object v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    if-eqz v2, :cond_0

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v2, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public static ۥۣ۟۟ۨ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۤ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۧ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)Z

    move-result v0

    const-string v1, "Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads."

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۡ(ZLjava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۨ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;Z)Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const-string v1, "req"

    invoke-static {p0, v1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object v1

    const-string v2, "URL must be specified to connect"

    invoke-static {v1, v2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "https"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/net/MalformedURLException;

    const-string p1, "Only http & https protocols supported"

    invoke-direct {p0, p1}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۟ۦۧۤ$ۥ۟۟;->ۥ۟۟۟()Z

    move-result v1

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move v2, v0

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    if-nez v1, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Cannot set a request body for HTTP method "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۡ(ZLjava/lang/String;)V

    :cond_3
    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->data()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    if-lez v4, :cond_5

    if-eqz v1, :cond_4

    if-eqz v2, :cond_5

    :cond_4
    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤۤ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)V

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_6

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤۥ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_6
    :goto_2
    move-object v1, v5

    :goto_3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۦ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)Ljava/net/HttpURLConnection;

    move-result-object v2

    :try_start_1
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v2}, Ljava/net/URLConnection;->getDoOutput()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p0, v4, v1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤۦ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    goto/16 :goto_d

    :catch_0
    move-exception p1

    goto/16 :goto_c

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    :try_start_4
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    throw p1

    :cond_7
    :goto_5
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    new-instance v4, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;

    invoke-direct {v4, v2, p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;-><init>(Ljava/net/HttpURLConnection;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    const-string p1, "Location"

    invoke-virtual {v4, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۦ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۢۡ()Z

    move-result p1

    if-eqz p1, :cond_b

    const/16 p1, 0x133

    if-eq v1, p1, :cond_8

    sget-object p1, LYue/ۥ۟ۦۧۤ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟۠(LYue/ۥ۟ۦۧۤ$ۥ۟۟;)LYue/ۥ۟ۦۧۤ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->data()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    invoke-virtual {p0, v5}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    const-string p1, "Content-Type"

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۢۥ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    goto :goto_6

    :catch_2
    move-exception p1

    move-object v5, v4

    goto/16 :goto_c

    :cond_8
    :goto_6
    const-string p1, "Location"

    invoke-virtual {v4, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    const-string v0, "http:/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_9

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_9
    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۠ۢ(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۠ۢ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ$ۥ;

    invoke-static {p0, v3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۨ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;Z)Z

    invoke-static {p0, v4}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;

    move-result-object p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-static {p0, v3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۨ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;Z)Z

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤ۟(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)LYue/ۥۡۦۤۨ;

    move-result-object p0

    if-eqz p0, :cond_a

    sget-object p0, LYue/ۥ۟ۢۡ۠;->ۥ۟۟۟:LYue/ۥ۟ۢۡ۠$ۥ;

    invoke-interface {p0}, LYue/ۥ۟ۢۡ۠$ۥ;->remove()V

    :cond_a
    return-object p1

    :cond_b
    const/16 p1, 0xc8

    if-lt v1, p1, :cond_c

    const/16 p1, 0x190

    if-lt v1, p1, :cond_d

    :cond_c
    :try_start_7
    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟۠()Z

    move-result p1

    if-eqz p1, :cond_16

    :cond_d
    invoke-virtual {v4}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۠ۨ()Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "text/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    sget-object v1, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۢ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    new-instance v0, LYue/ۥۣۢۡ۟;

    const-string v1, "Unhandled content type. Must be text/*, */xml, or */*+xml"

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, LYue/ۥۣۢۡ۟;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_7
    if-eqz p1, :cond_10

    sget-object v1, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۢ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)Z

    move-result p1

    if-nez p1, :cond_10

    invoke-static {}, LYue/ۥۣۡۧۦ;->ۥ۟۟۠ۦ()LYue/ۥۣۡۧۦ;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۢ(LYue/ۥۣۡۧۦ;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    :cond_10
    iget-object p1, v4, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۦ:Ljava/lang/String;

    invoke-static {p1}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v4, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentLength()I

    move-result p1

    if-eqz p1, :cond_14

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    move-result-object p1

    sget-object v1, LYue/ۥ۟ۦۧۤ$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    if-eq p1, v1, :cond_14

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_11

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p1

    goto :goto_8

    :cond_11
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    :goto_8
    const-string v1, "Content-Encoding"

    const-string v2, "gzip"

    invoke-virtual {v4, v1, v2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۡ۟(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v1, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    :goto_9
    move-object p1, v1

    goto :goto_a

    :cond_12
    const-string v1, "Content-Encoding"

    const-string v2, "deflate"

    invoke-virtual {v4, v1, v2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۡ۟(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    new-instance v1, Ljava/util/zip/InflaterInputStream;

    new-instance v2, Ljava/util/zip/Inflater;

    invoke-direct {v2, v0}, Ljava/util/zip/Inflater;-><init>(Z)V

    invoke-direct {v1, p1, v2}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V

    goto :goto_9

    :cond_13
    :goto_a
    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟۟()I

    move-result v1

    const v2, 0x8000

    invoke-static {p1, v2, v1}, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۟ۢ(Ljava/io/InputStream;II)LYue/ۥ۟ۧۥۧ;

    move-result-object p1

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1, v6, v7, v1, v2}, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۟۟(JJ)LYue/ۥ۟ۧۥۧ;

    move-result-object p1

    iput-object p1, v4, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    goto :goto_b

    :cond_14
    invoke-static {}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟()Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, v4, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_b
    invoke-static {p0, v3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۨ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;Z)Z

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤ۟(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)LYue/ۥۡۦۤۨ;

    move-result-object p0

    if-eqz p0, :cond_15

    sget-object p0, LYue/ۥ۟ۢۡ۠;->ۥ۟۟۟:LYue/ۥ۟ۢۡ۠$ۥ;

    invoke-interface {p0}, LYue/ۥ۟ۢۡ۠$ۥ;->remove()V

    :cond_15
    iput-boolean v0, v4, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۧ:Z

    return-object v4

    :cond_16
    :try_start_8
    new-instance p1, LYue/ۥ۠ۤۨۤ;

    const-string v0, "HTTP error fetching URL"

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, LYue/ۥ۠ۤۨۤ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_c
    if-eqz v5, :cond_17

    :try_start_9
    invoke-virtual {v5}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۤ()V

    :cond_17
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_d
    invoke-static {p0, v3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۨ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;Z)Z

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤ۟(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)LYue/ۥۡۦۤۨ;

    move-result-object p0

    if-eqz p0, :cond_18

    sget-object p0, LYue/ۥ۟ۢۡ۠;->ۥ۟۟۟:LYue/ۥ۟ۢۡ۠$ۥ;

    invoke-interface {p0}, LYue/ۥ۟ۢۡ۠$ۥ;->remove()V

    :cond_18
    throw p1

    :catchall_2
    move-exception p1

    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    throw p1
.end method

.method public static ۥ۟۟ۤ۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-static {}, LYue/ۥ۠ۤۨ۠;->ۥ۟۟ۢۡ()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤ۠([B)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p0, Ljava/lang/String;

    sget-object v1, LYue/ۥ۟ۨۢۦ;->ۥ۟:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :cond_1
    return-object p0
.end method

.method public static ۥ۟۟ۤ۠([B)Z
    .locals 8

    array-length v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-lt v0, v3, :cond_0

    aget-byte v0, p0, v2

    and-int/lit16 v0, v0, 0xff

    const/16 v4, 0xef

    if-ne v0, v4, :cond_0

    aget-byte v0, p0, v1

    and-int/lit16 v0, v0, 0xff

    const/16 v4, 0xbb

    if-ne v0, v4, :cond_0

    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v4, 0xbf

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    array-length v0, p0

    move v4, v2

    :goto_1
    if-ge v3, v0, :cond_7

    aget-byte v5, p0, v3

    and-int/lit16 v6, v5, 0x80

    if-nez v6, :cond_1

    goto :goto_3

    :cond_1
    and-int/lit16 v4, v5, 0xe0

    const/16 v6, 0xc0

    if-ne v4, v6, :cond_2

    add-int/lit8 v4, v3, 0x1

    goto :goto_2

    :cond_2
    and-int/lit16 v4, v5, 0xf0

    const/16 v7, 0xe0

    if-ne v4, v7, :cond_3

    add-int/lit8 v4, v3, 0x2

    goto :goto_2

    :cond_3
    and-int/lit16 v4, v5, 0xf8

    const/16 v5, 0xf0

    if-ne v4, v5, :cond_6

    add-int/lit8 v4, v3, 0x3

    :goto_2
    array-length v5, p0

    if-lt v4, v5, :cond_4

    return v2

    :cond_4
    if-ge v3, v4, :cond_5

    add-int/lit8 v3, v3, 0x1

    aget-byte v5, p0, v3

    and-int/2addr v5, v6

    const/16 v7, 0x80

    if-eq v5, v7, :cond_4

    return v2

    :cond_5
    move v4, v1

    :goto_3
    add-int/2addr v3, v1

    goto :goto_1

    :cond_6
    return v2

    :cond_7
    return v4
.end method

.method public static ۥ۟۟ۤۤ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, LYue/ۥۣۣۢۡ;

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۣۣۢۡ;-><init>(Ljava/net/URL;)V

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->data()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۟ۦۧۤ$ۥ۟;

    invoke-interface {v2}, LYue/ۥ۟ۦۧۤ$ۥ۟;->ۥ۟۟۟۠()Z

    move-result v3

    const-string v4, "InputStream data not supported in URL query string."

    invoke-static {v3, v4}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۡ(ZLjava/lang/String;)V

    invoke-virtual {v0, v2}, LYue/ۥۣۣۢۡ;->ۥ(LYue/ۥ۟ۦۧۤ$ۥ۟;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LYue/ۥۣۣۢۡ;->ۥ۟۟()Ljava/net/URL;

    move-result-object v0

    invoke-interface {p0, v0}, LYue/ۥ۟ۦۧۤ$ۥ;->ۥ۟۟۠ۢ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ$ۥ;

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->data()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public static ۥ۟۟ۤۥ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)Ljava/lang/String;
    .locals 4

    const-string v0, "Content-Type"

    invoke-interface {p0, v0}, LYue/ۥ۟ۦۧۤ$ۥ;->ۥ۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "multipart/form-data; boundary="

    if-eqz v1, :cond_0

    const-string v3, "multipart/form-data"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "boundary"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, LYue/ۥ۟ۨۢۦ;->ۥۣ۟۟۟()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v0, v2}, LYue/ۥ۟ۦۧۤ$ۥ;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    goto :goto_0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۤۨ۠;->ۥ۟۟ۢۢ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, LYue/ۥ۟ۨۢۦ;->ۥۣ۟۟۟()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v0, v2}, LYue/ۥ۟ۦۧۤ$ۥ;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "application/x-www-form-urlencoded; charset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v0, v1}, LYue/ۥ۟ۦۧۤ$ۥ;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    :cond_2
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public static ۥ۟۟ۤۦ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->data()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v2, p1, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    if-eqz p2, :cond_3

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v2, "--"

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۦۧۤ$ۥ۟;

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v2, "\r\n"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v3, "Content-Disposition: form-data; name=\""

    invoke-virtual {v1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟;->key()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LYue/ۥ۠ۤۨ۠;->ۥۣ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v3, "\""

    invoke-virtual {v1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟;->ۥۣ۟۟۟()Ljava/io/InputStream;

    move-result-object v3

    const-string v4, "\r\n\r\n"

    if-eqz v3, :cond_1

    const-string v5, "; filename=\""

    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟;->value()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LYue/ۥ۠ۤۨ۠;->ۥۣ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v5, "\"\r\nContent-Type: "

    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "application/octet-stream"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V

    invoke-static {v3, p1}, LYue/ۥ۟ۨۢۦ;->ۥ(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    goto :goto_2

    :cond_1
    invoke-virtual {v1, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟;->value()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->ۥۣ۟۟()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۦۧۤ$ۥ۟;

    if-nez p2, :cond_5

    const/16 v2, 0x26

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    goto :goto_4

    :cond_5
    const/4 p2, 0x0

    :goto_4
    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟;->key()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v2, 0x3d

    invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(I)V

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟;->value()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    :goto_5
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V

    return-void
.end method


# virtual methods
.method public ۥ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۦ:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۟۠(LYue/ۥ۟ۦۧۤ$ۥ۟۟;)LYue/ۥ۟ۦۧۤ$ۥ;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟۟۠(LYue/ۥ۟ۦۧۤ$ۥ۟۟;)LYue/ۥ۟ۦۧۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤۡ()V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥ۟ۨۢۦ;->ۥ۟:Ljava/nio/charset/Charset;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    :goto_0
    iget-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۠ۢ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ$ۥ;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟۠ۢ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۥ()Ljava/io/BufferedInputStream;
    .locals 3

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۧ:Z

    const-string v1, "Request must be executed (with .execute(), .get(), or .post() before getting response body"

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    iget-object v2, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const v2, 0x8000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    return-object v0

    :cond_0
    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    const-string v1, "Request has already been read"

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۡ(ZLjava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    invoke-virtual {v0}, LYue/ۥ۟ۧۥۧ;->ۥ۟۟()Ljava/io/BufferedInputStream;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۠ۦ(Ljava/lang/String;)Z
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟۠ۦ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠ۧ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡ()Ljava/net/URL;
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۡ()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡ۟(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۡ۟(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟۟ۡ۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟;
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۡ۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡۢ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۡۢ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟ۡۤ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۥ(Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟ۡۥ(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۡۥ(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟ۡۦ()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۡۦ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡۧ()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۡۧ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢ۟()LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤۡ()V

    return-object p0
.end method

.method public ۥ۟۟ۢۢ()LYue/ۥ۠۟ۧۥ;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۧ:Z

    const-string v1, "Request must be executed (with .execute(), .get(), or .post() before parsing response"

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_0

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    :cond_0
    iget-boolean v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    const-string v2, "Input stream already read and parsed, cannot re-read."

    invoke-static {v1, v2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۡ(ZLjava/lang/String;)V

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    iget-object v2, p0, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ:Ljava/net/URL;

    invoke-virtual {v2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠۟:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۢ()LYue/ۥۣۡۧۦ;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۤ(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;

    move-result-object v0

    new-instance v1, LYue/ۥ۠ۤۨ۠;

    iget-object v2, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠۟:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p0, v3}, LYue/ۥ۠ۤۨ۠;-><init>(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ;)V

    invoke-virtual {v0, v1}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨۤ(LYue/ۥ۟ۦۧۤ;)LYue/ۥ۠۟ۧۥ;

    invoke-virtual {v0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۢ()LYue/ۥ۠۟ۧۥ$ۥ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟۟()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۤ()V

    return-object v0
.end method

.method public bridge synthetic ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟ۢۤ(Ljava/lang/String;)Z
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۢۤ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟۟ۢۥ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۢۥ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟ۢۧ()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟ۢۧ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۨ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟۠:I

    return v0
.end method

.method public ۥۣ۟۟۠()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥۣ۟۟ۡ()[B
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤۡ()V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟ۥ(Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    return-object p0
.end method

.method public final ۥ۟۟ۤۡ()V
    .locals 3

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۧ:Z

    const-string v1, "Request must be executed (with .execute(), .get(), or .post() before getting response body"

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    const-string v1, "Request has already been read (with .parse())"

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۡ(ZLjava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    iget-object v2, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۠۟:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟۟()I

    move-result v2

    invoke-static {v1, v2}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۥ(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۢ:Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۤ()V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_1
    new-instance v2, LYue/ۥۣۢ۟ۦ;

    invoke-direct {v2, v1}, LYue/ۥۣۢ۟ۦ;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Z

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۤ()V

    throw v1

    :cond_0
    :goto_1
    return-void
.end method

.method public ۥ۟۟ۤۢ(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const-string v2, "Set-Cookie"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    new-instance v4, LYue/ۥۢۡۧۢ;

    invoke-direct {v4, v3}, LYue/ۥۢۡۧۢ;-><init>(Ljava/lang/String;)V

    const-string v3, "="

    invoke-virtual {v4, v3}, LYue/ۥۢۡۧۢ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v5, ";"

    invoke-virtual {v4, v5}, LYue/ۥۢۡۧۢ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    iget-object v5, p0, LYue/ۥ۠ۤۨ۠$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {p0, v3, v4}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟ۤ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final ۥۣ۟۟ۤ()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    iput-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۧۥۧ;

    throw v0

    :cond_0
    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۤ:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    iput-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۤ:Ljava/net/HttpURLConnection;

    :cond_1
    return-void
.end method
