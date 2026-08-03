.class public Lio/sentry/cache/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/cache/d;


# static fields
.field public static final i:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Lio/sentry/util/d;

.field public final c:Ljava/io/File;

.field public final d:I

.field public final e:Ljava/util/concurrent/CountDownLatch;

.field public final f:Ljava/util/WeakHashMap;

.field public final g:Lio/sentry/util/a;

.field public final h:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lio/sentry/cache/c;->i:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v2;Ljava/lang/String;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/d;

    new-instance v1, Lrl;

    const/16 v2, 0xd

    invoke-direct {v1, v2, p0}, Lrl;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object v0, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/d;

    const-string v0, "SentryOptions is required."

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/cache/c;->c:Ljava/io/File;

    iput p3, p0, Lio/sentry/cache/c;->d:I

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/c;->f:Ljava/util/WeakHashMap;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/c;->g:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/c;->h:Lio/sentry/util/a;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lio/sentry/cache/c;->e:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final a()[Ljava/io/File;
    .locals 4

    iget-object v0, p0, Lio/sentry/cache/c;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lio/sentry/cache/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_1
    :goto_0
    iget-object v1, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "The directory for caching files is inaccessible.: %s"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/io/File;

    return-object v0
.end method

.method public final b(Lio/sentry/internal/debugmeta/c;)Ljava/io/File;
    .locals 4

    iget-object v0, p0, Lio/sentry/cache/c;->f:Ljava/util/WeakHashMap;

    const-string v1, ".envelope"

    iget-object v2, p0, Lio/sentry/cache/c;->g:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v2

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {}, Lio/sentry/config/a;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v1

    :goto_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/sentry/cache/c;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Lio/sentry/r;->close()V

    return-object v0

    :goto_1
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final c(Ljava/io/File;Ljava/io/File;)V
    .locals 7

    iget-object v0, p0, Lio/sentry/cache/c;->h:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    iget-object v3, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Previous session file already exists, deleting it."

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v1, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v4, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v5, "Unable to delete previous session file: %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v1, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v4, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v5, "Moving current session to previous session."

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v1, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v1, "Unable to move current session to previous session."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error moving current session to previous session."

    invoke-interface {p2, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_2
    :try_start_4
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public final e(Ljava/io/File;)Lio/sentry/internal/debugmeta/c;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p1, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/d;

    invoke-virtual {p1}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/e0;

    invoke-interface {p1, v0}, Lio/sentry/e0;->c(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    iget-object v0, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to deserialize the envelope."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final g(Lio/sentry/P1;)Lio/sentry/F2;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p1}, Lio/sentry/P1;->f()[B

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    sget-object p1, Lio/sentry/cache/c;->i:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p1, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/d;

    invoke-virtual {p1}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/e0;

    const-class v1, Lio/sentry/F2;

    invoke-interface {p1, v0, v1}, Lio/sentry/e0;->a(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/F2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    iget-object v0, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to deserialize the session."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final h()Z
    .locals 5

    iget-object v0, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    :try_start_0
    iget-object v1, p0, Lio/sentry/cache/c;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionFlushTimeoutMillis()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v2, "Timed out waiting for previous session to flush."

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return v3
.end method

.method public i(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Z
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "Envelope is required."

    invoke-static {v0, v2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/cache/c;->a()[Ljava/io/File;

    move-result-object v3

    array-length v0, v3

    iget-object v5, v1, Lio/sentry/cache/c;->b:Lio/sentry/util/d;

    const/4 v6, 0x0

    iget-object v7, v1, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    const/4 v8, 0x1

    iget v9, v1, Lio/sentry/cache/c;->d:I

    if-lt v0, v9, :cond_19

    invoke-virtual {v7}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v10

    sget-object v11, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v12, "Cache folder if full (respecting maxSize). Rotating files"

    new-array v13, v6, [Ljava/lang/Object;

    invoke-interface {v10, v11, v12, v13}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    sub-int v9, v0, v9

    add-int/2addr v9, v8

    array-length v10, v3

    if-le v10, v8, :cond_0

    new-instance v10, LKh;

    const/4 v11, 0x2

    invoke-direct {v10, v11}, LKh;-><init>(I)V

    invoke-static {v3, v10}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    :cond_0
    invoke-static {v3, v9, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [Ljava/io/File;

    move v11, v6

    :goto_0
    if-ge v11, v9, :cond_19

    aget-object v12, v3, v11

    invoke-virtual {v1, v12}, Lio/sentry/cache/c;->e(Ljava/io/File;)Lio/sentry/internal/debugmeta/c;

    move-result-object v0

    const-string v13, "File can\'t be deleted: %s"

    if-eqz v0, :cond_1

    iget-object v14, v0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-nez v15, :cond_2

    :cond_1
    :goto_1
    move-object/from16 v17, v3

    move-object/from16 v19, v5

    move-object/from16 v20, v7

    goto/16 :goto_12

    :cond_2
    invoke-virtual {v7}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v15

    sget-object v4, Lio/sentry/clientreport/d;->CACHE_OVERFLOW:Lio/sentry/clientreport/d;

    invoke-interface {v15, v4, v0}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/P1;

    if-nez v4, :cond_3

    move v14, v6

    goto :goto_3

    :cond_3
    iget-object v14, v4, Lio/sentry/P1;->a:Lio/sentry/Q1;

    iget-object v14, v14, Lio/sentry/Q1;->e:Lio/sentry/Z1;

    sget-object v15, Lio/sentry/Z1;->Session:Lio/sentry/Z1;

    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    :goto_3
    if-nez v14, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v4}, Lio/sentry/cache/c;->g(Lio/sentry/P1;)Lio/sentry/F2;

    move-result-object v0

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_1

    iget-object v4, v0, Lio/sentry/F2;->e:Ljava/lang/String;

    iget-object v14, v0, Lio/sentry/F2;->g:Lio/sentry/E2;

    sget-object v15, Lio/sentry/E2;->Ok:Lio/sentry/E2;

    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    goto :goto_5

    :cond_6
    if-eqz v4, :cond_7

    move v14, v8

    goto :goto_6

    :cond_7
    :goto_5
    move v14, v6

    :goto_6
    if-nez v14, :cond_8

    goto :goto_1

    :cond_8
    iget-object v0, v0, Lio/sentry/F2;->f:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    array-length v14, v10

    move v15, v6

    :goto_7
    if-ge v15, v14, :cond_1

    aget-object v8, v10, v15

    invoke-virtual {v1, v8}, Lio/sentry/cache/c;->e(Ljava/io/File;)Lio/sentry/internal/debugmeta/c;

    move-result-object v6

    if-eqz v6, :cond_a

    iget-object v0, v6, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/Iterable;

    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    move-object/from16 v17, v3

    move-object/from16 v21, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v7

    goto/16 :goto_11

    :cond_b
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    check-cast v0, Lio/sentry/P1;

    if-nez v0, :cond_c

    move-object/from16 v17, v3

    move-object/from16 v19, v5

    const/4 v3, 0x0

    goto :goto_9

    :cond_c
    move-object/from16 v17, v3

    iget-object v3, v0, Lio/sentry/P1;->a:Lio/sentry/Q1;

    iget-object v3, v3, Lio/sentry/Q1;->e:Lio/sentry/Z1;

    move-object/from16 v19, v5

    sget-object v5, Lio/sentry/Z1;->Session:Lio/sentry/Z1;

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    :goto_9
    if-nez v3, :cond_e

    :cond_d
    move-object/from16 v3, v17

    move-object/from16 v0, v18

    move-object/from16 v5, v19

    goto :goto_8

    :cond_e
    invoke-virtual {v1, v0}, Lio/sentry/cache/c;->g(Lio/sentry/P1;)Lio/sentry/F2;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v3, v0, Lio/sentry/F2;->e:Ljava/lang/String;

    iget-object v5, v0, Lio/sentry/F2;->g:Lio/sentry/E2;

    move-object/from16 v20, v7

    sget-object v7, Lio/sentry/E2;->Ok:Lio/sentry/E2;

    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    goto :goto_a

    :cond_f
    if-eqz v3, :cond_10

    const/4 v5, 0x1

    goto :goto_b

    :cond_10
    :goto_a
    const/4 v5, 0x0

    :goto_b
    if-nez v5, :cond_11

    move-object/from16 v3, v17

    move-object/from16 v0, v18

    move-object/from16 v5, v19

    move-object/from16 v7, v20

    goto :goto_8

    :cond_11
    iget-object v5, v0, Lio/sentry/F2;->f:Ljava/lang/Boolean;

    if-eqz v5, :cond_12

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Session %s has 2 times the init flag."

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v3, v5, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_12

    :cond_12
    if-eqz v4, :cond_13

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v3, v0, Lio/sentry/F2;->f:Ljava/lang/Boolean;

    :try_start_0
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/e0;

    invoke-static {v3, v0}, Lio/sentry/P1;->d(Lio/sentry/e0;Lio/sentry/F2;)Lio/sentry/P1;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v21, v4

    goto :goto_d

    :catch_0
    move-exception v0

    goto :goto_c

    :catch_1
    move-exception v0

    const/4 v3, 0x0

    :goto_c
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v7, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    move-object/from16 v18, v3

    const-string v3, "Failed to create new envelope item for the session %s"

    move-object/from16 v21, v4

    filled-new-array/range {v21 .. v21}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5, v7, v0, v3, v4}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object/from16 v3, v18

    goto :goto_d

    :cond_13
    move-object/from16 v21, v4

    move-object/from16 v3, v17

    move-object/from16 v0, v18

    move-object/from16 v5, v19

    move-object/from16 v7, v20

    move-object/from16 v4, v21

    goto/16 :goto_8

    :cond_14
    move-object/from16 v17, v3

    move-object/from16 v21, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v7

    const/4 v3, 0x0

    :goto_d
    if-eqz v3, :cond_17

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/P1;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lio/sentry/internal/debugmeta/c;

    iget-object v4, v6, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v4, Lio/sentry/J1;

    invoke-direct {v3, v4, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/J1;Ljava/util/List;)V

    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v6, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0, v6, v13, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_16
    :try_start_2
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/e0;

    invoke-interface {v0, v3, v6}, Lio/sentry/e0;->e(Lio/sentry/internal/debugmeta/c;Ljava/io/OutputStream;)V

    invoke-virtual {v8, v4, v5}, Ljava/io/File;->setLastModified(J)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_12

    :catchall_0
    move-exception v0

    goto :goto_10

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_5
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_f

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_10
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Failed to serialize the new envelope to the disk."

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_17
    :goto_11
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v3, v17

    move-object/from16 v5, v19

    move-object/from16 v7, v20

    move-object/from16 v4, v21

    const/4 v6, 0x0

    const/4 v8, 0x1

    goto/16 :goto_7

    :goto_12
    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_18

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v3, v13, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_18
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v3, v17

    move-object/from16 v5, v19

    move-object/from16 v7, v20

    const/4 v6, 0x0

    const/4 v8, 0x1

    goto/16 :goto_0

    :cond_19
    move-object/from16 v19, v5

    move-object/from16 v20, v7

    iget-object v0, v1, Lio/sentry/cache/c;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/io/File;

    const-string v5, "session.json"

    invoke-direct {v4, v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/io/File;

    const-string v6, "previous_session.json"

    invoke-direct {v5, v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-class v3, Lio/sentry/hints/h;

    move-object/from16 v7, p2

    invoke-static {v7, v3}, Lio/sentry/config/a;->v(Lio/sentry/H;Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v3

    if-nez v3, :cond_1a

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v8, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v9, "Current envelope doesn\'t exist."

    const/4 v10, 0x0

    new-array v11, v10, [Ljava/lang/Object;

    invoke-interface {v3, v8, v9, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1a
    const-class v3, Lio/sentry/hints/a;

    invoke-static {v7}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    const-class v8, Lio/sentry/F2;

    sget-object v9, Lio/sentry/cache/c;->i:Ljava/nio/charset/Charset;

    if-eqz v3, :cond_21

    invoke-static {v7}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    instance-of v10, v3, Lio/sentry/hints/a;

    if-eqz v10, :cond_21

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v0, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v6, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v11, "Previous session is not ended, we\'d need to end it."

    const/4 v12, 0x0

    new-array v13, v12, [Ljava/lang/Object;

    invoke-interface {v0, v6, v11, v13}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_7
    new-instance v11, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    new-instance v12, Ljava/io/FileInputStream;

    invoke-direct {v12, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v12, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v11, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/e0;

    invoke-interface {v0, v11, v8}, Lio/sentry/e0;->a(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/F2;

    if-eqz v0, :cond_1d

    check-cast v3, Lio/sentry/hints/a;

    invoke-interface {v3}, Lio/sentry/hints/a;->b()Ljava/lang/Long;

    move-result-object v12

    if-eqz v12, :cond_1e

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v12, v13}, Lio/sentry/config/a;->n(J)Ljava/util/Date;

    move-result-object v12

    iget-object v13, v0, Lio/sentry/F2;->a:Ljava/util/Date;

    if-nez v13, :cond_1b

    const/4 v13, 0x0

    goto :goto_13

    :cond_1b
    invoke-virtual {v13}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Date;

    :goto_13
    if-eqz v13, :cond_1c

    invoke-virtual {v12, v13}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v13

    if-eqz v13, :cond_1f

    goto :goto_14

    :catchall_3
    move-exception v0

    move-object v3, v0

    goto :goto_16

    :cond_1c
    :goto_14
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    const-string v3, "Abnormal exit happened before previous session start, not ending the session."

    const/4 v10, 0x0

    new-array v12, v10, [Ljava/lang/Object;

    invoke-interface {v0, v6, v3, v12}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :cond_1d
    :goto_15
    :try_start_9
    invoke-virtual {v11}, Ljava/io/Reader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_19

    :catchall_4
    move-exception v0

    goto :goto_18

    :cond_1e
    const/4 v12, 0x0

    :cond_1f
    :try_start_a
    invoke-interface {v3}, Lio/sentry/hints/a;->e()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lio/sentry/E2;->Abnormal:Lio/sentry/E2;

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-virtual {v0, v6, v13, v14, v3}, Lio/sentry/F2;->c(Lio/sentry/E2;Ljava/lang/String;ZLjava/lang/String;)Z

    invoke-virtual {v0, v12}, Lio/sentry/F2;->b(Ljava/util/Date;)V

    invoke-virtual {v1, v10, v0}, Lio/sentry/cache/c;->j(Ljava/io/File;Lio/sentry/F2;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_15

    :goto_16
    :try_start_b
    invoke-virtual {v11}, Ljava/io/Reader;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_17

    :catchall_5
    move-exception v0

    :try_start_c
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_17
    throw v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :goto_18
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v6, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v10, "Error processing previous session."

    invoke-interface {v3, v6, v10, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_19

    :cond_20
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v6, "No previous session file to end."

    const/4 v10, 0x0

    new-array v11, v10, [Ljava/lang/Object;

    invoke-interface {v0, v3, v6, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_21
    :goto_19
    const-class v0, Lio/sentry/hints/i;

    invoke-static {v7}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "last_crash"

    if-eqz v0, :cond_28

    invoke-virtual {v1, v4, v5}, Lio/sentry/cache/c;->c(Ljava/io/File;Ljava/io/File;)V

    iget-object v0, v2, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_24

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/P1;

    sget-object v5, Lio/sentry/Z1;->Session:Lio/sentry/Z1;

    iget-object v6, v0, Lio/sentry/P1;->a:Lio/sentry/Q1;

    iget-object v6, v6, Lio/sentry/Q1;->e:Lio/sentry/Z1;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_23

    :try_start_d
    new-instance v5, Ljava/io/BufferedReader;

    new-instance v10, Ljava/io/InputStreamReader;

    new-instance v11, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Lio/sentry/P1;->f()[B

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v10, v11, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v5, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :try_start_e
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/e0;

    invoke-interface {v0, v5, v8}, Lio/sentry/e0;->a(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/F2;

    if-nez v0, :cond_22

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v8, "Item of type %s returned null by the parser."

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v4, v8, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1a

    :catchall_6
    move-exception v0

    move-object v4, v0

    goto :goto_1b

    :cond_22
    invoke-virtual {v1, v4, v0}, Lio/sentry/cache/c;->j(Ljava/io/File;Lio/sentry/F2;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :goto_1a
    :try_start_f
    invoke-virtual {v5}, Ljava/io/Reader;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_1e

    :catchall_7
    move-exception v0

    goto :goto_1d

    :goto_1b
    :try_start_10
    invoke-virtual {v5}, Ljava/io/Reader;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    goto :goto_1c

    :catchall_8
    move-exception v0

    :try_start_11
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1c
    throw v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :goto_1d
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v6, "Item failed to process."

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1e

    :cond_23
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v4, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v5, "Current envelope has a different envelope type %s"

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1e

    :cond_24
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v5, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v6, "Current envelope %s is empty"

    invoke-interface {v0, v5, v6, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1e
    new-instance v0, Ljava/io/File;

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".sentry-native/last_crash"

    invoke-direct {v0, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_25

    new-instance v0, Ljava/io/File;

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v6, "Crash marker file exists, crashedLastRun will return true."

    const/4 v10, 0x0

    new-array v8, v10, [Ljava/lang/Object;

    invoke-interface {v4, v5, v6, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v4

    if-nez v4, :cond_26

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v6, "Failed to delete the crash marker file. %s."

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1f

    :cond_25
    const/4 v10, 0x0

    :cond_26
    :goto_1f
    sget-object v0, Lio/sentry/G1;->c:Lio/sentry/G1;

    iget-object v4, v0, Lio/sentry/G1;->b:Lio/sentry/util/a;

    invoke-virtual {v4}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v4

    :try_start_12
    iget-boolean v5, v0, Lio/sentry/G1;->a:Z

    if-nez v5, :cond_27

    const/4 v14, 0x1

    iput-boolean v14, v0, Lio/sentry/G1;->a:Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    goto :goto_20

    :catchall_9
    move-exception v0

    move-object v2, v0

    goto :goto_21

    :cond_27
    const/4 v14, 0x1

    :goto_20
    invoke-virtual {v4}, Lio/sentry/r;->close()V

    iget-object v0, v1, Lio/sentry/cache/c;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_23

    :goto_21
    :try_start_13
    invoke-virtual {v4}, Lio/sentry/r;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    goto :goto_22

    :catchall_a
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_22
    throw v2

    :cond_28
    const/4 v10, 0x0

    const/4 v14, 0x1

    :goto_23
    invoke-virtual/range {p0 .. p1}, Lio/sentry/cache/c;->b(Lio/sentry/internal/debugmeta/c;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Not adding Envelope to offline storage because it already exists: %s"

    invoke-interface {v0, v2, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    move v8, v14

    goto/16 :goto_2a

    :cond_29
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v8, "Adding Envelope to offline storage: %s"

    invoke-interface {v0, v5, v8, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v8, "Overwriting envelope to offline storage: %s"

    invoke-interface {v0, v5, v8, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_2a

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v8, "Failed to delete: %s"

    invoke-interface {v0, v5, v8, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2a
    :try_start_14
    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    :try_start_15
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/e0;

    invoke-interface {v0, v2, v5}, Lio/sentry/e0;->e(Lio/sentry/internal/debugmeta/c;Ljava/io/OutputStream;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    :try_start_16
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    move v6, v14

    goto :goto_26

    :catchall_b
    move-exception v0

    goto :goto_25

    :catchall_c
    move-exception v0

    move-object v2, v0

    :try_start_17
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    goto :goto_24

    :catchall_d
    move-exception v0

    :try_start_18
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_24
    throw v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_b

    :goto_25
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v6, "Error writing Envelope %s to offline storage"

    invoke-interface {v2, v5, v0, v6, v4}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move v6, v10

    :goto_26
    const-class v0, Lio/sentry/R2;

    invoke-static {v7}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    new-instance v0, Ljava/io/File;

    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_19
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_e

    :try_start_1a
    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/config/a;->t(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_f

    :try_start_1b
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_e

    goto :goto_29

    :catchall_e
    move-exception v0

    goto :goto_28

    :catchall_f
    move-exception v0

    move-object v3, v0

    :try_start_1c
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_10

    goto :goto_27

    :catchall_10
    move-exception v0

    :try_start_1d
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_27
    throw v3
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_e

    :goto_28
    invoke-virtual/range {v20 .. v20}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "Error writing the crash marker file to the disk"

    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2b
    :goto_29
    move v8, v6

    :goto_2a
    return v8
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 11

    iget-object v0, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    invoke-virtual {p0}, Lio/sentry/cache/c;->a()[Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v1, v4

    :try_start_0
    new-instance v6, Ljava/io/BufferedInputStream;

    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v6, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v7, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/d;

    invoke-virtual {v7}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/e0;

    invoke-interface {v7, v6}, Lio/sentry/e0;->c(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v6

    goto :goto_2

    :catchall_0
    move-exception v7

    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v6

    :try_start_4
    invoke-virtual {v7, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v7
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_2
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v7

    sget-object v8, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Error while reading cached envelope from file "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v8, v5, v6}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_1
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    sget-object v7, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v8, "Envelope file \'%s\' disappeared while converting all cached files to envelopes."

    invoke-interface {v6, v7, v8, v5}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/io/File;Lio/sentry/F2;)V
    .locals 7

    iget-object v0, p2, Lio/sentry/F2;->e:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance p1, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/OutputStreamWriter;

    sget-object v4, Lio/sentry/cache/c;->i:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {p1, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Overwriting session to offline storage: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/d;

    invoke-virtual {v3}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/e0;

    invoke-interface {v3, p2, p1}, Lio/sentry/e0;->d(Ljava/lang/Object;Ljava/io/BufferedWriter;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {p1}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_1

    :catchall_2
    move-exception p2

    :try_start_5
    invoke-virtual {p1}, Ljava/io/Writer;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_0

    :catchall_3
    move-exception p1

    :try_start_6
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_1
    :try_start_7
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception p2

    :try_start_8
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_3
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error writing Session to offline storage: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v1, p1, v2, v0}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final p(Lio/sentry/internal/debugmeta/c;)V
    .locals 5

    const-string v0, "Envelope is required."

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lio/sentry/cache/c;->b(Lio/sentry/internal/debugmeta/c;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    iget-object v1, p0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Discarding envelope from cache: %s"

    invoke-interface {v0, v2, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to delete envelope: %s"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Envelope was not cached: %s"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
