.class public abstract Lio/sentry/config/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 3

    if-eqz p0, :cond_2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static B(Ljava/lang/String;J)[B
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-gtz v1, :cond_1

    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    :try_start_0
    new-instance p0, Ljava/io/BufferedInputStream;

    invoke-direct {p0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v0, 0x400

    :try_start_2
    new-array v0, v0, [B

    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    return-object v0

    :catchall_1
    move-exception p0

    goto :goto_5

    :catchall_2
    move-exception p2

    goto :goto_3

    :goto_1
    :try_start_5
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p2

    :try_start_6
    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_3
    :try_start_7
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception p0

    :try_start_8
    invoke-virtual {p2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_5
    :try_start_9
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_6

    :catchall_5
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    :cond_1
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p0, v0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Reading file failed, because size located at \'%s\' with %d bytes is bigger than the maximum allowed size of %d bytes."

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Reading the item "

    const-string v0, " failed, because can\'t read the file."

    invoke-static {p2, p0, v0}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Reading path "

    const-string v0, " failed, because it\'s not a file."

    invoke-static {p2, p0, v0}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "File \'"

    const-string v0, "\' doesn\'t exists"

    invoke-static {p2, p1, v0}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static C(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->canRead()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :try_start_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :goto_1
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_3
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static D(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static E(Lio/sentry/C1;Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    if-eqz v0, :cond_0

    const-string v0, "event_id"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_0
    const-string v0, "contexts"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->c:Lio/sentry/protocol/r;

    if-eqz v0, :cond_1

    const-string v0, "sdk"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->c:Lio/sentry/protocol/r;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_1
    iget-object v0, p0, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    if-eqz v0, :cond_2

    const-string v0, "request"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_2
    iget-object v0, p0, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "tags"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_3
    iget-object v0, p0, Lio/sentry/C1;->f:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "release"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_4
    iget-object v0, p0, Lio/sentry/C1;->g:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v0, "environment"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_5
    iget-object v0, p0, Lio/sentry/C1;->h:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v0, "platform"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_6
    iget-object v0, p0, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    if-eqz v0, :cond_7

    const-string v0, "user"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_7
    iget-object v0, p0, Lio/sentry/C1;->k:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v0, "server_name"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_8
    iget-object v0, p0, Lio/sentry/C1;->l:Ljava/lang/String;

    if-eqz v0, :cond_9

    const-string v0, "dist"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_9
    iget-object v0, p0, Lio/sentry/C1;->m:Ljava/util/List;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "breadcrumbs"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->m:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_a
    iget-object v0, p0, Lio/sentry/C1;->n:Lio/sentry/protocol/d;

    if-eqz v0, :cond_b

    const-string v0, "debug_meta"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/C1;->n:Lio/sentry/protocol/d;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_b
    iget-object v0, p0, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    if-eqz v0, :cond_c

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "extra"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object p0, p0, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    invoke-virtual {p1, p2, p0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_c
    return-void
.end method

.method public static F(Lio/sentry/H;)Z
    .locals 2

    const-class v0, Lio/sentry/hints/d;

    invoke-static {p0}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-class v0, Lio/sentry/hints/b;

    invoke-static {p0}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-class v0, Lio/sentry/android/core/O;

    invoke-static {p0}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static G(Lio/sentry/v2;Lio/sentry/v2;Z)Z
    .locals 3

    sget-boolean v0, Lio/sentry/util/f;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/sentry/v2;->getVersionDetector()Lio/sentry/l0;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/Y0;

    if-eqz v1, :cond_0

    new-instance v1, Lio/sentry/t;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lio/sentry/t;-><init>(Lio/sentry/v2;I)V

    invoke-virtual {p1, v1}, Lio/sentry/v2;->setVersionDetector(Lio/sentry/l0;)V

    :cond_0
    invoke-virtual {p1}, Lio/sentry/v2;->getVersionDetector()Lio/sentry/l0;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/l0;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p0

    sget-object p1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string p2, "Not initializing Sentry because mixed SDK versions have been detected."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-interface {p0, p1, p2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    const-string p0, "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions"

    goto :goto_0

    :cond_1
    const-string p0, "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions"

    :goto_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See "

    const-string v0, " for more details."

    invoke-static {p2, p0, v0}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lio/sentry/v2;->isForceInit()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lio/sentry/v2;->getInitPriority()Lio/sentry/m0;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    invoke-virtual {p1}, Lio/sentry/v2;->getInitPriority()Lio/sentry/m0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-gt p0, p1, :cond_6

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_6
    return v2
.end method

.method public static final H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SentryReplayIntegration"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lr8;

    const/16 v1, 0x8

    invoke-direct {v0, p3, p1, p2, v1}, Lr8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v0, "Failed to submit task "

    const-string v1, " to executor"

    invoke-static {v0, p2, v1}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2, p0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final I(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/f;Lio/sentry/v2;)V
    .locals 5

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2}, Lio/sentry/android/replay/viewhierarchy/b;->b(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/f;Lio/sentry/v2;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_4

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    invoke-static {v3, p1, p2}, Lio/sentry/config/a;->j(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/f;Lio/sentry/v2;)Lio/sentry/android/replay/viewhierarchy/f;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3, v4, p2}, Lio/sentry/config/a;->I(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/f;Lio/sentry/v2;)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    iput-object v0, p1, Lio/sentry/android/replay/viewhierarchy/f;->f:Ljava/util/ArrayList;

    return-void
.end method

.method public static J(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0

    :cond_1
    :goto_0
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/sentry/Y1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Lvx;)Lvx;
    .locals 9

    iget-object v0, p0, Lvx;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lvx;->b:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/Double;

    iget-object v1, p0, Lvx;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lio/sentry/config/a;->c(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Ljava/lang/Double;

    move-result-object v6

    new-instance v3, Lvx;

    iget-object v0, p0, Lvx;->a:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Boolean;

    iget-object v0, p0, Lvx;->b:Ljava/io/Serializable;

    move-object v5, v0

    check-cast v5, Ljava/lang/Double;

    iget-object v0, p0, Lvx;->d:Ljava/io/Serializable;

    move-object v7, v0

    check-cast v7, Ljava/lang/Boolean;

    iget-object p0, p0, Lvx;->e:Ljava/lang/Object;

    move-object v8, p0

    check-cast v8, Ljava/lang/Double;

    invoke-direct/range {v3 .. v8}, Lvx;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-object v3
.end method

.method public static c(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Ljava/lang/Double;
    .locals 6

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-static {}, Lio/sentry/util/h;->a()Lio/sentry/util/g;

    move-result-object p0

    invoke-virtual {p0}, Lio/sentry/util/g;->c()D

    move-result-wide v0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    mul-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    sub-double/2addr v4, p0

    mul-double/2addr v4, v0

    add-double/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 0

    if-nez p0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static e(Ljava/lang/Object;)Lio/sentry/H;
    .locals 2

    new-instance v0, Lio/sentry/H;

    invoke-direct {v0}, Lio/sentry/H;-><init>()V

    const-string v1, "sentry:typeCheckHint"

    invoke-virtual {v0, v1, p0}, Lio/sentry/H;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static f(Ljava/io/File;)Z
    .locals 5

    const/4 v0, 0x1

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    array-length v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    aget-object v4, v1, v3

    invoke-static {v4}, Lio/sentry/config/a;->f(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_3

    return v2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    return p0

    :cond_5
    :goto_1
    return v0
.end method

.method public static g(Lio/sentry/C1;Ljava/lang/String;Lio/sentry/A0;Lio/sentry/ILogger;)Z
    .locals 5

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "platform"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0xd

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "request"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v4, 0xc

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "release"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v4, 0xb

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "event_id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v4, 0xa

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "extra"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v4, 0x9

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "user"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    move v4, v1

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "tags"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_7
    const-string v0, "dist"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_8
    const-string v0, "sdk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_9
    const-string v0, "breadcrumbs"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_a
    const-string v0, "environment"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_b
    const-string v0, "contexts"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :cond_b
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_c
    const-string v0, "server_name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_0

    :cond_c
    move v4, v3

    goto :goto_0

    :sswitch_d
    const-string v0, "debug_meta"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_0

    :cond_d
    move v4, v2

    :goto_0
    packed-switch v4, :pswitch_data_0

    return v2

    :pswitch_0
    invoke-virtual {p2}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/C1;->h:Ljava/lang/String;

    return v3

    :pswitch_1
    new-instance p1, Lio/sentry/clientreport/a;

    const/16 v0, 0x12

    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {p2, p3, p1}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/n;

    iput-object p1, p0, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    return v3

    :pswitch_2
    invoke-virtual {p2}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/C1;->f:Ljava/lang/String;

    return v3

    :pswitch_3
    new-instance p1, Lio/sentry/clientreport/a;

    const/16 v0, 0x16

    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {p2, p3, p1}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/t;

    iput-object p1, p0, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    return v3

    :pswitch_4
    invoke-virtual {p2}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/C1;->o:Ljava/util/AbstractMap;

    return v3

    :pswitch_5
    new-instance p1, Lio/sentry/protocol/D;

    invoke-direct {p1, v2}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p2, p3, p1}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/E;

    iput-object p1, p0, Lio/sentry/C1;->i:Lio/sentry/protocol/E;

    return v3

    :pswitch_6
    invoke-virtual {p2}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/C1;->e:Ljava/util/AbstractMap;

    return v3

    :pswitch_7
    invoke-virtual {p2}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/C1;->l:Ljava/lang/String;

    return v3

    :pswitch_8
    new-instance p1, Lio/sentry/clientreport/a;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {p2, p3, p1}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/r;

    iput-object p1, p0, Lio/sentry/C1;->c:Lio/sentry/protocol/r;

    return v3

    :pswitch_9
    new-instance p1, Lio/sentry/e;

    invoke-direct {p1, v2}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {p2, p3, p1}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/C1;->m:Ljava/util/List;

    return v3

    :pswitch_a
    invoke-virtual {p2}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/C1;->g:Ljava/lang/String;

    return v3

    :pswitch_b
    invoke-static {p2, p3}, Lio/sentry/clientreport/a;->c(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/c;

    move-result-object p1

    iget-object p0, p0, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    invoke-virtual {p0, p1}, Lio/sentry/protocol/c;->k(Lio/sentry/protocol/c;)V

    return v3

    :pswitch_c
    invoke-virtual {p2}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/C1;->k:Ljava/lang/String;

    return v3

    :pswitch_d
    new-instance p1, Lio/sentry/clientreport/a;

    invoke-direct {p1, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {p2, p3, p1}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/d;

    iput-object p1, p0, Lio/sentry/C1;->n:Lio/sentry/protocol/d;

    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6db2cb8f -> :sswitch_d
        -0x2d39e9f9 -> :sswitch_c
        -0x21d07f5c -> :sswitch_b
        -0x51ecded -> :sswitch_a
        -0x3112f30 -> :sswitch_9
        0x1bc3a -> :sswitch_8
        0x2f0da6 -> :sswitch_7
        0x363419 -> :sswitch_6
        0x36ebcb -> :sswitch_5
        0x5c79410 -> :sswitch_4
        0x1093c0e0 -> :sswitch_3
        0x41012807 -> :sswitch_2
        0x414ef28f -> :sswitch_1
        0x6fbd6873 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static h(Lio/sentry/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lio/sentry/c;
    .locals 1

    if-nez p0, :cond_0

    new-instance p0, Lio/sentry/c;

    invoke-direct {p0}, Lio/sentry/c;-><init>()V

    :cond_0
    iget-object v0, p0, Lio/sentry/c;->d:Ljava/lang/Double;

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/sentry/c;->c:Ljava/lang/Double;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v0

    :goto_0
    invoke-static {p3, p2, p1}, Lio/sentry/config/a;->c(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Ljava/lang/Double;

    move-result-object p1

    iget-boolean p2, p0, Lio/sentry/c;->e:Z

    if-eqz p2, :cond_2

    iput-object p1, p0, Lio/sentry/c;->d:Ljava/lang/Double;

    :cond_2
    return-object p0
.end method

.method public static i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static j(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/f;Lio/sentry/v2;)Lio/sentry/android/replay/viewhierarchy/f;
    .locals 11

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v5, LEt;

    invoke-direct {v5, v1, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    move-object v1, p0

    :goto_0
    instance-of v5, v1, Landroid/view/View;

    if-eqz v5, :cond_4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-lt v5, v6, :cond_1

    move-object v5, v1

    check-cast v5, Landroid/view/View;

    invoke-static {v5}, LOE;->a(Landroid/view/View;)F

    move-result v5

    goto :goto_1

    :cond_1
    const/high16 v5, 0x3f800000    # 1.0f

    :goto_1
    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v6

    cmpg-float v6, v6, v2

    if-lez v6, :cond_3

    cmpg-float v5, v5, v2

    if-lez v5, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    :cond_3
    :goto_2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v5, LEt;

    invoke-direct {v5, v1, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p0, v1, v5}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    new-instance v6, LEt;

    invoke-direct {v6, v5, v1}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v6

    goto :goto_3

    :cond_5
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v5, LEt;

    invoke-direct {v5, v1, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    iget-object v1, v5, LEt;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v5, v5, LEt;->b:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Landroid/graphics/Rect;

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-eqz v1, :cond_10

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v8, v1, Ljava/lang/String;

    if-eqz v8, :cond_6

    check-cast v1, Ljava/lang/String;

    goto :goto_4

    :cond_6
    move-object v1, v3

    :goto_4
    if-eqz v1, :cond_7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "sentry-unmask"

    invoke-static {v1, v8, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-ne v1, v7, :cond_7

    goto/16 :goto_9

    :cond_7
    const v1, 0x550a01eb

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "unmask"

    invoke-static {v8, v9}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    goto/16 :goto_9

    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_9

    check-cast v8, Ljava/lang/String;

    goto :goto_5

    :cond_9
    move-object v8, v3

    :goto_5
    if-eqz v8, :cond_a

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "sentry-mask"

    invoke-static {v8, v9, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-ne v8, v7, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    const-string v8, "mask"

    invoke-static {v1, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {p2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    invoke-virtual {p2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v8

    iget-object v8, v8, Lio/sentry/z2;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    :goto_6
    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_6

    :cond_e
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v8

    iget-object v8, v8, Lio/sentry/z2;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    :goto_7
    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    :goto_8
    move v9, v7

    goto :goto_a

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_7

    :cond_10
    :goto_9
    move v9, v5

    :goto_a
    instance-of v1, p0, Landroid/widget/TextView;

    if-eqz v1, :cond_13

    move-object v0, p0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    if-eqz v1, :cond_11

    new-instance v3, Lio/sentry/B0;

    invoke-direct {v3, v1}, Lio/sentry/B0;-><init>(Ljava/lang/Object;)V

    :cond_11
    move-object v1, v3

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v3

    const/high16 v5, -0x1000000

    or-int/2addr v3, v5

    move v5, v3

    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v3

    :try_start_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v7
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :catch_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getExtendedPaddingTop()I

    move-result v7

    :goto_b
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move v8, v5

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    move-object v10, v6

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    if-eqz p1, :cond_12

    iget v2, p1, Lio/sentry/android/replay/viewhierarchy/f;->c:F

    :cond_12
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    move-result v0

    add-float/2addr v0, v2

    move v4, v7

    move v7, v0

    new-instance v0, Lio/sentry/android/replay/viewhierarchy/e;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v8, p1

    invoke-direct/range {v0 .. v10}, Lio/sentry/android/replay/viewhierarchy/e;-><init>(Lio/sentry/android/replay/util/i;Ljava/lang/Integer;IIIIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V

    return-object v0

    :cond_13
    instance-of v1, p0, Landroid/widget/ImageView;

    if-eqz v1, :cond_1e

    move-object v0, p0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    move v3, v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    if-eqz p1, :cond_14

    iget v3, p1, Lio/sentry/android/replay/viewhierarchy/f;->c:F

    :cond_14
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    move-result v8

    add-float/2addr v3, v8

    if-eqz v9, :cond_1d

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1c

    instance-of v8, v0, Landroid/graphics/drawable/InsetDrawable;

    if-eqz v8, :cond_15

    move v8, v7

    goto :goto_c

    :cond_15
    instance-of v8, v0, Landroid/graphics/drawable/ColorDrawable;

    :goto_c
    if-eqz v8, :cond_16

    move v8, v7

    goto :goto_d

    :cond_16
    instance-of v8, v0, Landroid/graphics/drawable/VectorDrawable;

    :goto_d
    if-eqz v8, :cond_17

    move v8, v7

    goto :goto_e

    :cond_17
    instance-of v8, v0, Landroid/graphics/drawable/GradientDrawable;

    :goto_e
    if-eqz v8, :cond_19

    :cond_18
    :goto_f
    move v0, v5

    goto :goto_10

    :cond_19
    instance-of v8, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v8, :cond_1b

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_1a

    goto :goto_f

    :cond_1a
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v8

    if-nez v8, :cond_18

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    const/16 v9, 0xa

    if-le v8, v9, :cond_18

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-le v0, v9, :cond_18

    :cond_1b
    move v0, v7

    :goto_10
    if-ne v0, v7, :cond_1c

    move v0, v7

    goto :goto_11

    :cond_1c
    move v0, v5

    :goto_11
    if-eqz v0, :cond_1d

    move v5, v7

    :cond_1d
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/d;

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(IIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V

    return-object v0

    :cond_1e
    move v3, v2

    new-instance v0, Lio/sentry/android/replay/viewhierarchy/c;

    invoke-virtual {p0}, Landroid/view/View;->getX()F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    if-eqz p1, :cond_1f

    iget v3, p1, Lio/sentry/android/replay/viewhierarchy/f;->c:F

    :cond_1f
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v5

    add-float/2addr v3, v5

    move-object v4, p1

    move v5, v9

    invoke-direct/range {v0 .. v6}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(IIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V

    return-object v0
.end method

.method public static k()Ljava/lang/String;
    .locals 12

    invoke-static {}, Lio/sentry/util/h;->a()Lio/sentry/util/g;

    move-result-object v0

    const/16 v1, 0x10

    new-array v2, v1, [B

    invoke-virtual {v0, v2}, Lio/sentry/util/g;->b([B)V

    const/4 v0, 0x6

    aget-byte v3, v2, v0

    and-int/lit8 v3, v3, 0xf

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    or-int/lit8 v3, v3, 0x40

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    const/16 v0, 0x8

    aget-byte v3, v2, v0

    and-int/lit8 v3, v3, 0x3f

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-wide v6, v3

    :goto_0
    if-ge v5, v0, :cond_0

    shl-long/2addr v6, v0

    aget-byte v8, v2, v5

    and-int/lit16 v8, v8, 0xff

    int-to-long v8, v8

    or-long/2addr v6, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v0

    :goto_1
    if-ge v5, v1, :cond_1

    shl-long/2addr v3, v0

    aget-byte v8, v2, v5

    and-int/lit16 v8, v8, 0xff

    int-to-long v8, v8

    or-long/2addr v3, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/util/UUID;

    invoke-direct {v2, v6, v7, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sget-object v3, Lio/sentry/util/k;->a:[C

    invoke-virtual {v2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v5

    const/16 v2, 0x20

    new-array v7, v2, [C

    invoke-static {v7, v3, v4}, Lio/sentry/util/k;->a([CJ)V

    sget-object v3, Lio/sentry/util/k;->a:[C

    const-wide/high16 v8, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v8, v5

    const/16 v4, 0x3c

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    aput-char v4, v7, v1

    const-wide/high16 v8, 0xf00000000000000L

    and-long/2addr v8, v5

    const/16 v4, 0x38

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x11

    aput-char v4, v7, v8

    const-wide/high16 v8, 0xf0000000000000L

    and-long/2addr v8, v5

    const/16 v4, 0x34

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x12

    aput-char v4, v7, v8

    const-wide/high16 v8, 0xf000000000000L

    and-long/2addr v8, v5

    const/16 v4, 0x30

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x13

    aput-char v4, v7, v8

    const-wide v8, 0xf00000000000L

    and-long/2addr v8, v5

    const/16 v4, 0x2c

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x14

    aput-char v4, v7, v8

    const-wide v9, 0xf0000000000L

    and-long/2addr v9, v5

    const/16 v4, 0x28

    ushr-long/2addr v9, v4

    long-to-int v4, v9

    aget-char v4, v3, v4

    const/16 v9, 0x15

    aput-char v4, v7, v9

    const-wide v9, 0xf000000000L

    and-long/2addr v9, v5

    const/16 v4, 0x24

    ushr-long/2addr v9, v4

    long-to-int v4, v9

    aget-char v4, v3, v4

    const/16 v9, 0x16

    aput-char v4, v7, v9

    const-wide v9, 0xf00000000L

    and-long/2addr v9, v5

    ushr-long/2addr v9, v2

    long-to-int v2, v9

    aget-char v2, v3, v2

    const/16 v4, 0x17

    aput-char v2, v7, v4

    const-wide v9, 0xf0000000L

    and-long/2addr v9, v5

    const/16 v2, 0x1c

    ushr-long/2addr v9, v2

    long-to-int v4, v9

    aget-char v4, v3, v4

    const/16 v9, 0x18

    aput-char v4, v7, v9

    const-wide/32 v10, 0xf000000

    and-long/2addr v10, v5

    ushr-long v9, v10, v9

    long-to-int v4, v9

    aget-char v4, v3, v4

    const/16 v9, 0x19

    aput-char v4, v7, v9

    const-wide/32 v9, 0xf00000

    and-long/2addr v9, v5

    ushr-long v8, v9, v8

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x1a

    aput-char v4, v7, v8

    const-wide/32 v8, 0xf0000

    and-long/2addr v8, v5

    ushr-long/2addr v8, v1

    long-to-int v1, v8

    aget-char v1, v3, v1

    const/16 v4, 0x1b

    aput-char v1, v7, v4

    const-wide/32 v8, 0xf000

    and-long/2addr v8, v5

    const/16 v1, 0xc

    ushr-long/2addr v8, v1

    long-to-int v1, v8

    aget-char v1, v3, v1

    aput-char v1, v7, v2

    const-wide/16 v1, 0xf00

    and-long/2addr v1, v5

    ushr-long v0, v1, v0

    long-to-int v0, v0

    aget-char v0, v3, v0

    const/16 v1, 0x1d

    aput-char v0, v7, v1

    const-wide/16 v0, 0xf0

    and-long/2addr v0, v5

    const/4 v2, 0x4

    ushr-long/2addr v0, v2

    long-to-int v0, v0

    aget-char v0, v3, v0

    const/16 v1, 0x1e

    aput-char v0, v7, v1

    const-wide/16 v0, 0xf

    and-long/2addr v0, v5

    long-to-int v0, v0

    aget-char v0, v3, v0

    const/16 v1, 0x1f

    aput-char v0, v7, v1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v7}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static l(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m()Ljava/util/Date;
    .locals 1

    sget-object v0, Lio/sentry/vendor/gson/internal/bind/util/a;->a:Ljava/util/TimeZone;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static n(J)Ljava/util/Date;
    .locals 1

    sget-object v0, Lio/sentry/vendor/gson/internal/bind/util/a;->a:Ljava/util/TimeZone;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static o(Ljava/lang/String;)Ljava/util/Date;
    .locals 2

    :try_start_0
    new-instance v0, Ljava/text/ParsePosition;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-static {p0, v0}, Lio/sentry/vendor/gson/internal/bind/util/a;->c(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "timestamp is not ISO format "

    invoke-static {v1, p0}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static p(Ljava/lang/String;)Ljava/util/Date;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lio/sentry/config/a;->n(J)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "timestamp is not millis format "

    invoke-static {v1, p0}, LEy;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final q(Landroid/view/View;)Landroid/view/Window;
    .locals 1

    sget-object v0, Lio/sentry/android/replay/D;->a:Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    sget-object v0, Lio/sentry/android/replay/D;->a:Ljava/lang/Object;

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/sentry/android/replay/D;->b:Ljava/lang/Object;

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/Window;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static s(Lio/sentry/H;)Ljava/lang/Object;
    .locals 2

    const-string v0, "sentry:typeCheckHint"

    iget-object v1, p0, Lio/sentry/H;->c:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_0
    iget-object p0, p0, Lio/sentry/H;->a:Ljava/util/HashMap;

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static t(Ljava/util/Date;)Ljava/lang/String;
    .locals 7

    sget-object v0, Lio/sentry/vendor/gson/internal/bind/util/a;->a:Ljava/util/TimeZone;

    new-instance v1, Ljava/util/GregorianCalendar;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v0, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V

    invoke-virtual {v1, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I

    move-result p0

    const/4 v2, 0x1

    if-nez p0, :cond_0

    move p0, v2

    goto :goto_0

    :cond_0
    const/4 p0, 0x6

    :goto_0
    const/16 v3, 0x17

    add-int/2addr v3, p0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x4

    invoke-static {p0, v3, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    const/16 v3, 0x2d

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    add-int/2addr v5, v2

    invoke-static {p0, v5, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {p0, v2, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    const/16 v2, 0x54

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-static {p0, v2, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    const/16 v2, 0x3a

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0xc

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-static {p0, v5, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0xd

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-static {p0, v5, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    const/16 v5, 0x2e

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0xe

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/4 v6, 0x3

    invoke-static {p0, v5, v6}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    if-eqz v0, :cond_2

    const v1, 0xea60

    div-int v1, v0, v1

    div-int/lit8 v5, v1, 0x3c

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    rem-int/lit8 v1, v1, 0x3c

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x2b

    :goto_1
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0, v5, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v4}, Lio/sentry/vendor/gson/internal/bind/util/a;->b(Ljava/lang/StringBuilder;II)V

    goto :goto_2

    :cond_2
    const/16 v0, 0x5a

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static u(Landroid/content/Context;)Z
    .locals 3

    const-string v0, "The application context is required."

    invoke-static {v0, p0}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p0, v2, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static v(Lio/sentry/H;Ljava/lang/Class;)Z
    .locals 0

    invoke-static {p0}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static w(Lio/sentry/H;)Z
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "sentry:isFromHybridSdk"

    const-class v2, Ljava/lang/Boolean;

    invoke-virtual {p0, v2, v1}, Lio/sentry/H;->b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static y(Ljava/lang/Double;Z)Z
    .locals 4

    if-nez p0, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Double;->isNaN()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double p1, v0, v2

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double p0, p0, v0

    if-gtz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static z(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V
    .locals 1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Hint"

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s is not %s"

    invoke-interface {p2, v0, p1, p0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public abstract r()I
.end method

.method public abstract x()Z
.end method
