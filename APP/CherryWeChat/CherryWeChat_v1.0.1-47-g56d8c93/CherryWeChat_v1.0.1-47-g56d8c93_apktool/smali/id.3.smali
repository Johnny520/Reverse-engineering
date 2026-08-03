.class public final synthetic Lid;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LN6;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lid;->a:Ljava/lang/Object;

    iput-object p2, p0, Lid;->b:Ljava/lang/Object;

    iput-object p3, p0, Lid;->c:Ljava/lang/Object;

    iput-object p4, p0, Lid;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Lid;->a:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio/sentry/ILogger;

    iget-object v0, v1, Lid;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, v1, Lid;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/w;

    iget-object v4, v1, Lid;->d:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v6, "Started processing cached files from %s"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v2, v5, v6, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v13, v0, Lio/sentry/w;->d:Lio/sentry/M2;

    iget-object v6, v0, Lio/sentry/w;->b:Lio/sentry/ILogger;

    :try_start_0
    const-string v7, "Processing dir. %s"

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v6, v5, v7, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_0

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v5, "Directory \'%s\' doesn\'t exist. No cached events to send."

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v0, v5, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-nez v7, :cond_1

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Cache dir %s is not a directory."

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v0, v5, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    if-nez v7, :cond_2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Cache dir %s is null."

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v0, v5, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    new-instance v8, Lio/sentry/u;

    const/4 v9, 0x0

    invoke-direct {v8, v9, v0}, Lio/sentry/u;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v8}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v8

    const-string v9, "Processing %d items from cache dir %s"

    const/4 v14, 0x0

    if-eqz v8, :cond_3

    array-length v8, v8

    goto :goto_0

    :cond_3
    move v8, v14

    :goto_0
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v10

    filled-new-array {v8, v10}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v6, v5, v9, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    array-length v5, v7

    move v15, v14

    :goto_1
    if-ge v15, v5, :cond_7

    aget-object v8, v7, v15

    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v9

    if-nez v9, :cond_4

    sget-object v9, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v10, "File %s is not a File."

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v6, v9, v10, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v13, v12}, Lio/sentry/M2;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    sget-object v8, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v9, "File \'%s\' has already been processed so it will not be processed again."

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v6, v8, v9, v10}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object v9, v0, Lio/sentry/w;->a:Lio/sentry/Z;

    invoke-interface {v9}, Lio/sentry/Z;->c()Lio/sentry/transport/p;

    move-result-object v9

    if-eqz v9, :cond_6

    sget-object v10, Lio/sentry/n;->All:Lio/sentry/n;

    invoke-virtual {v9, v10}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v5, "DirectoryProcessor, rate limiting active."

    new-array v7, v14, [Ljava/lang/Object;

    invoke-interface {v6, v0, v5, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    sget-object v9, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v10, "Processing file: %s"

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v6, v9, v10, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v9, v8

    new-instance v8, Lio/sentry/v;

    move-object v11, v9

    iget-wide v9, v0, Lio/sentry/w;->c:J

    move-object/from16 v16, v11

    iget-object v11, v0, Lio/sentry/w;->b:Lio/sentry/ILogger;

    move-object/from16 v14, v16

    invoke-direct/range {v8 .. v13}, Lio/sentry/v;-><init>(JLio/sentry/ILogger;Ljava/lang/String;Lio/sentry/M2;)V

    invoke-static {v8}, Lio/sentry/config/a;->e(Ljava/lang/Object;)Lio/sentry/H;

    move-result-object v8

    invoke-virtual {v0, v14, v8}, Lio/sentry/w;->b(Ljava/io/File;Lio/sentry/H;)V

    const-wide/16 v8, 0x64

    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    add-int/lit8 v15, v15, 0x1

    const/4 v14, 0x0

    goto :goto_1

    :goto_3
    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v7, "Failed processing \'%s\'"

    invoke-interface {v6, v5, v0, v7, v4}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    :goto_4
    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v4, "Finished processing cached files from %s"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v0, v4, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onCancel()V
    .locals 4

    iget-object v0, p0, Lid;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lid;->b:Ljava/lang/Object;

    check-cast v1, Lnd;

    iget-object v2, p0, Lid;->c:Ljava/lang/Object;

    check-cast v2, Ljd;

    iget-object v3, p0, Lid;->d:Ljava/lang/Object;

    check-cast v3, LMy;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v1, v1, Lnd;->a:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    invoke-virtual {v2}, LB3;->d()V

    const/4 v0, 0x2

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, LMy;->toString()Ljava/lang/String;

    :cond_0
    return-void
.end method
