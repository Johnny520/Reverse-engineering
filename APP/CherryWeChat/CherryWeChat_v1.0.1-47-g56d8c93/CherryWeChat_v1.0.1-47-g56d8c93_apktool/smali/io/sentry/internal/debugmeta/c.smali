.class public final Lio/sentry/internal/debugmeta/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/internal/debugmeta/a;
.implements Lio/sentry/ILogger;
.implements Lio/sentry/Z0;
.implements Lio/sentry/clientreport/f;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lio/sentry/internal/debugmeta/c;->a:I

    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/ILogger;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 20
    :cond_0
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/ILogger;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    .line 14
    const-class v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 17
    invoke-static {v0}, Lio/sentry/config/a;->d(Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/J1;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-string v0, "SentryEnvelopeHeader is required."

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 24
    const-string p1, "SentryEnvelope items are required."

    invoke-static {p1, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/t;Lio/sentry/protocol/r;Lio/sentry/P1;)V
    .locals 2

    const/4 v0, 0x5

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lio/sentry/J1;

    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p1, p2, v1}, Lio/sentry/J1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/r;Lio/sentry/N2;)V

    .line 28
    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v2;)V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    .line 13
    new-instance p1, Lio/sentry/B0;

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lio/sentry/B0;-><init>(IZ)V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lio/sentry/vendor/gson/stream/c;

    invoke-direct {v0, p1}, Lio/sentry/vendor/gson/stream/c;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 5
    new-instance p1, Lio/sentry/B0;

    invoke-direct {p1, p2}, Lio/sentry/B0;-><init>(I)V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Lio/sentry/internal/debugmeta/c;->a:I

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, "url is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    :try_start_0
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    return-void

    :catch_0
    move-exception p1

    .line 10
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to compose the Sentry\'s server URL."

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public static j(Lio/sentry/Z1;)Lio/sentry/n;
    .locals 1

    sget-object v0, Lio/sentry/Z1;->Event:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lio/sentry/n;->Error:Lio/sentry/n;

    return-object p0

    :cond_0
    sget-object v0, Lio/sentry/Z1;->Session:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lio/sentry/n;->Session:Lio/sentry/n;

    return-object p0

    :cond_1
    sget-object v0, Lio/sentry/Z1;->Transaction:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lio/sentry/n;->Transaction:Lio/sentry/n;

    return-object p0

    :cond_2
    sget-object v0, Lio/sentry/Z1;->UserFeedback:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lio/sentry/n;->UserReport:Lio/sentry/n;

    return-object p0

    :cond_3
    sget-object v0, Lio/sentry/Z1;->Feedback:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lio/sentry/n;->Feedback:Lio/sentry/n;

    return-object p0

    :cond_4
    sget-object v0, Lio/sentry/Z1;->Profile:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lio/sentry/n;->Profile:Lio/sentry/n;

    return-object p0

    :cond_5
    sget-object v0, Lio/sentry/Z1;->ProfileChunk:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    return-object p0

    :cond_6
    sget-object v0, Lio/sentry/Z1;->Attachment:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Lio/sentry/n;->Attachment:Lio/sentry/n;

    return-object p0

    :cond_7
    sget-object v0, Lio/sentry/Z1;->CheckIn:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, Lio/sentry/n;->Monitor:Lio/sentry/n;

    return-object p0

    :cond_8
    sget-object v0, Lio/sentry/Z1;->ReplayVideo:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lio/sentry/n;->Replay:Lio/sentry/n;

    return-object p0

    :cond_9
    sget-object v0, Lio/sentry/Z1;->Log:Lio/sentry/Z1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_a

    sget-object p0, Lio/sentry/n;->LogItem:Lio/sentry/n;

    return-object p0

    :cond_a
    sget-object p0, Lio/sentry/n;->Default:Lio/sentry/n;

    return-object p0
.end method


# virtual methods
.method public A(Z)Lio/sentry/internal/debugmeta/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->d()V

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->a:Ljava/io/Writer;

    if-eqz p1, :cond_0

    const-string p1, "true"

    goto :goto_0

    :cond_0
    const-string p1, "false"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V
    .locals 3

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object p2, p2, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/P1;

    invoke-virtual {p0, p1, v0}, Lio/sentry/internal/debugmeta/c;->f(Lio/sentry/clientreport/d;Lio/sentry/P1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    return-void

    :goto_2
    iget-object p2, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast p2, Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unable to record lost envelope."

    invoke-interface {p2, v0, p1, v2, v1}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lio/sentry/clientreport/d;Lio/sentry/n;)V
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, p1, p2, v0, v1}, Lio/sentry/internal/debugmeta/c;->c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    return-void
.end method

.method public c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v2;

    :try_start_0
    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lio/sentry/n;->getCategory()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v0}, Lio/sentry/v2;->getOnDiscard()Lio/sentry/q2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const/4 p4, 0x0

    new-array p4, p4, [Ljava/lang/Object;

    const-string v0, "Unable to record lost event."

    invoke-interface {p2, p3, p1, v0, p4}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public d()Ljava/util/List;
    .locals 9

    iget v0, p0, Lio/sentry/internal/debugmeta/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/ILogger;

    const-string v1, "sentry-debug-meta.properties"

    iget-object v2, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-virtual {v2, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v2, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :catchall_0
    move-exception v2

    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "%s file is malformed."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v3, v2, v4, v1}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :goto_2
    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Error getting Proguard UUIDs."

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_2
    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "%s file was not found."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    const/4 v2, 0x0

    :goto_4
    return-object v2

    :pswitch_0
    const-string v0, "sentry-debug-meta.properties"

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/ILogger;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :try_start_5
    iget-object v3, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v3

    :cond_0
    :goto_5
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/net/URL;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :try_start_6
    invoke-virtual {v4}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v5
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    :try_start_7
    new-instance v6, Ljava/util/Properties;

    invoke-direct {v6}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v6, v5}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v6, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v7, "Debug Meta Data Properties loaded from %s"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v1, v6, v7, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v5, :cond_0

    :try_start_8
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_5

    :catch_3
    move-exception v3

    goto :goto_8

    :catch_4
    move-exception v5

    goto :goto_7

    :catchall_2
    move-exception v6

    if-eqz v5, :cond_1

    :try_start_9
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v5

    :try_start_a
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_6
    throw v6
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3

    :goto_7
    :try_start_b
    sget-object v6, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v7, "%s file is malformed."

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v6, v5, v7, v4}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    goto :goto_5

    :goto_8
    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Failed to load %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v1, v4, v3, v5, v6}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "No %s file was found."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x0

    :cond_3
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public varargs e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/ILogger;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/internal/debugmeta/c;->i(Lio/sentry/a2;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public f(Lio/sentry/clientreport/d;Lio/sentry/P1;)V
    .locals 10

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v3, Lio/sentry/v2;

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v4, 0x0

    :try_start_0
    iget-object v5, p2, Lio/sentry/P1;->a:Lio/sentry/Q1;

    iget-object v5, v5, Lio/sentry/Q1;->e:Lio/sentry/Z1;

    sget-object v6, Lio/sentry/Z1;->ClientReport:Lio/sentry/Z1;

    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_1

    :try_start_1
    invoke-virtual {v3}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/sentry/P1;->e(Lio/sentry/e0;)Lio/sentry/clientreport/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/sentry/internal/debugmeta/c;->s(Lio/sentry/clientreport/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v0, "Unable to restore counts from previous client report."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lio/sentry/internal/debugmeta/c;->j(Lio/sentry/Z1;)Lio/sentry/n;

    move-result-object v5

    sget-object v6, Lio/sentry/n;->Transaction:Lio/sentry/n;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v3}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v6

    invoke-virtual {p2, v6}, Lio/sentry/P1;->g(Lio/sentry/e0;)Lio/sentry/protocol/A;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object p2, p2, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lio/sentry/n;->Span:Lio/sentry/n;

    invoke-virtual {v7}, Lio/sentry/n;->getCategory()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v8

    int-to-long v8, v8

    add-long/2addr v8, v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v6, v7, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    invoke-virtual {v3}, Lio/sentry/v2;->getOnDiscard()Lio/sentry/q2;

    :cond_2
    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, Lio/sentry/n;->getCategory()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v3}, Lio/sentry/v2;->getOnDiscard()Lio/sentry/q2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Unable to record lost envelope item."

    new-array v2, v4, [Ljava/lang/Object;

    invoke-interface {p2, v0, p1, v1, v2}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public g(Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;
    .locals 10

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v2;

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/B0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v2, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v2, Lio/sentry/util/d;

    invoke-virtual {v2}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v6, 0x0

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    cmp-long v6, v8, v6

    if-lez v6, :cond_0

    new-instance v6, Lio/sentry/clientreport/e;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/clientreport/c;

    iget-object v7, v7, Lio/sentry/clientreport/c;->a:Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/clientreport/c;

    iget-object v4, v4, Lio/sentry/clientreport/c;->b:Ljava/lang/String;

    invoke-direct {v6, v7, v4, v5}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    new-instance v2, Lio/sentry/clientreport/b;

    invoke-direct {v2, v1, v3}, Lio/sentry/clientreport/b;-><init>(Ljava/util/Date;Ljava/util/ArrayList;)V

    move-object v1, v2

    :goto_1
    if-nez v1, :cond_3

    return-object p1

    :cond_3
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Attaching client report to envelope."

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v3, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p1, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/P1;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v4

    invoke-static {v4, v1}, Lio/sentry/P1;->b(Lio/sentry/e0;Lio/sentry/clientreport/b;)Lio/sentry/P1;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    iget-object v4, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v4, Lio/sentry/J1;

    invoke-direct {v1, v4, v3}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/J1;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :goto_3
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "Unable to attach client report to envelope."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v3, v1, v4, v2}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method public h()Lio/sentry/internal/debugmeta/c;
    .locals 4

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->d()V

    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    iget-object v2, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    array-length v3, v2

    if-ne v1, v3, :cond_0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    :cond_0
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    iget v2, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    const/4 v3, 0x3

    aput v3, v1, v2

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->a:Ljava/io/Writer;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    return-object p0
.end method

.method public i(Lio/sentry/a2;)Z
    .locals 3

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getDiagnosticLevel()Lio/sentry/a2;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Lio/sentry/v2;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-lt p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method

.method public k()Lio/sentry/internal/debugmeta/c;
    .locals 4

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    const/4 v1, 0x5

    const/16 v2, 0x7d

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v1, v2}, Lio/sentry/vendor/gson/stream/c;->f(IIC)V

    return-object p0
.end method

.method public l()[B
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, [B

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, [B

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public m(Ljava/util/Map;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;
    .locals 9

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Thread;

    const/4 v4, 0x0

    if-ne v3, v0, :cond_1

    if-eqz p3, :cond_2

    :cond_1
    if-eqz p2, :cond_3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez p3, :cond_3

    :cond_2
    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/StackTraceElement;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Thread;

    new-instance v6, Lio/sentry/protocol/z;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lio/sentry/protocol/z;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Thread;->getPriority()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lio/sentry/protocol/z;->b:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v6, Lio/sentry/protocol/z;->a:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Thread;->isDaemon()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v6, Lio/sentry/protocol/z;->g:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v6, Lio/sentry/protocol/z;->d:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v6, Lio/sentry/protocol/z;->e:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/t;

    invoke-virtual {v2, v5, v4}, Lio/sentry/t;->b([Ljava/lang/StackTraceElement;Z)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v3, Lio/sentry/v2;

    invoke-virtual {v3}, Lio/sentry/v2;->isAttachStacktrace()Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    new-instance v3, Lio/sentry/protocol/y;

    invoke-direct {v3, v2}, Lio/sentry/protocol/y;-><init>(Ljava/util/List;)V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v2, v3, Lio/sentry/protocol/y;->c:Ljava/lang/Boolean;

    iput-object v3, v6, Lio/sentry/protocol/z;->i:Lio/sentry/protocol/y;

    :cond_4
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    return-object v1

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method

.method public varargs n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/ILogger;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/internal/debugmeta/c;->i(Lio/sentry/a2;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1, p2, p3, p4}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public o()Ljava/util/Properties;
    .locals 6

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/io/BufferedInputStream;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v2, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catch_0
    move-exception v2

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :cond_0
    return-object v1

    :goto_1
    iget-object v3, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v3, Lio/sentry/K0;

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Failed to load Sentry configuration from file: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v4, v2, v5, v0}, Lio/sentry/K0;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;
    .locals 2

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-eqz p1, :cond_2

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->g:Ljava/lang/String;

    if-nez v1, :cond_1

    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    if-eqz v1, :cond_0

    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->g:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "JsonWriter is closed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 1

    new-instance v0, Lio/sentry/clientreport/c;

    invoke-direct {v0, p1, p2}, Lio/sentry/clientreport/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/B0;

    iget-object p1, p1, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast p1, Lio/sentry/util/d;

    invoke-virtual {p1}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/atomic/AtomicLong;

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_0
    return-void
.end method

.method public r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/ILogger;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/internal/debugmeta/c;->i(Lio/sentry/a2;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public s(Lio/sentry/clientreport/b;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lio/sentry/clientreport/b;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/clientreport/e;

    iget-object v1, v0, Lio/sentry/clientreport/e;->a:Ljava/lang/String;

    iget-object v2, v0, Lio/sentry/clientreport/e;->b:Ljava/lang/String;

    iget-object v0, v0, Lio/sentry/clientreport/e;->c:Ljava/lang/Long;

    invoke-virtual {p0, v1, v2, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public t(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->d:Ljava/lang/String;

    const-string p1, ": "

    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->e:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->d:Ljava/lang/String;

    const-string p1, ":"

    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->e:Ljava/lang/String;

    return-void
.end method

.method public u(D)Lio/sentry/internal/debugmeta/c;
    .locals 3

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    iget-boolean v1, v0, Lio/sentry/vendor/gson/stream/c;->f:Z

    if-nez v1, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Numeric values must be finite, but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->d()V

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->a:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public v(J)Lio/sentry/internal/debugmeta/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->d()V

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->a:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/B0;

    invoke-virtual {v0, p0, p1, p2}, Lio/sentry/B0;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    return-object p0
.end method

.method public x(Ljava/lang/Boolean;)Lio/sentry/internal/debugmeta/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->l()V

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->d()V

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->a:Ljava/io/Writer;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "true"

    goto :goto_0

    :cond_1
    const-string p1, "false"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public y(Ljava/lang/Number;)Lio/sentry/internal/debugmeta/c;
    .locals 3

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->l()V

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Lio/sentry/vendor/gson/stream/c;->f:Z

    if-nez v2, :cond_2

    const-string v2, "-Infinity"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "Infinity"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "NaN"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Numeric values must be finite, but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->d()V

    iget-object p1, v0, Lio/sentry/vendor/gson/stream/c;->a:Ljava/io/Writer;

    invoke-virtual {p1, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->l()V

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->d()V

    invoke-virtual {v0, p1}, Lio/sentry/vendor/gson/stream/c;->o(Ljava/lang/String;)V

    return-object p0
.end method
