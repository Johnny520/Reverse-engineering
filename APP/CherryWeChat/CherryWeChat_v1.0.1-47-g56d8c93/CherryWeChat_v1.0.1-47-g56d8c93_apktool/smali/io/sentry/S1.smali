.class public final synthetic Lio/sentry/S1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lio/sentry/S1;->a:I

    iput-object p2, p0, Lio/sentry/S1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/E;Lio/sentry/android/core/D;)V
    .locals 0

    .line 3
    const/4 p1, 0x5

    iput p1, p0, Lio/sentry/S1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/sentry/S1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/a;Lr1;)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput p2, p0, Lio/sentry/S1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/S1;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 29

    move-object/from16 v1, p0

    iget v0, v1, Lio/sentry/S1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/logger/b;

    iget-object v2, v0, Lio/sentry/logger/b;->d:Lio/sentry/U1;

    iget-object v0, v0, Lio/sentry/logger/b;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getShutdownTimeoutMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lio/sentry/U1;->g(J)V

    return-void

    :pswitch_0
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio/sentry/cache/f;

    :try_start_0
    iget-object v0, v2, Lio/sentry/cache/f;->b:Lio/sentry/util/d;

    invoke-virtual {v0}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/cache/tape/e;

    invoke-virtual {v0}, Lio/sentry/cache/tape/e;->clear()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v2, v2, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "Failed to clear breadcrumbs from file queue"

    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/s;

    iget-object v2, v0, Lio/sentry/android/replay/s;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_1
    sget-object v2, Lio/sentry/android/replay/z;->b:Ljava/lang/Object;

    invoke-interface {v2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object v3, Lio/sentry/android/replay/z;->c:Ljava/lang/Object;

    invoke-interface {v3}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    iget-object v5, v0, Lio/sentry/android/replay/s;->b:Lio/sentry/util/a;

    invoke-virtual {v5}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object v0, v0, Lio/sentry/android/replay/s;->d:Lio/sentry/android/replay/r;

    invoke-virtual {v0, v4}, Lio/sentry/android/replay/r;->addAll(Ljava/util/Collection;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v4, 0x0

    :try_start_3
    invoke-static {v5, v4}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    invoke-virtual {v3, v2, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-static {v5, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    :cond_1
    :goto_1
    return-void

    :pswitch_2
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/ReplayIntegration;

    iget-object v2, v0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    :cond_2
    invoke-virtual {v2}, Lio/sentry/v2;->findPersistingScopeObserver()Lio/sentry/cache/f;

    move-result-object v2

    const-string v4, ""

    if-eqz v2, :cond_22

    iget-object v5, v0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v5, :cond_3

    const/4 v5, 0x0

    :cond_3
    const-string v6, "replay.json"

    const-class v7, Ljava/lang/String;

    invoke-virtual {v2, v5, v6, v7}, Lio/sentry/cache/f;->g(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_4

    goto/16 :goto_19

    :cond_4
    new-instance v11, Lio/sentry/protocol/t;

    invoke-direct {v11, v5}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    sget-object v6, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {v11, v6}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v0, v4}, Lio/sentry/android/replay/ReplayIntegration;->q(Ljava/lang/String;)V

    goto/16 :goto_1a

    :cond_5
    iget-object v6, v0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v6, :cond_6

    const/4 v6, 0x0

    :cond_6
    invoke-virtual {v6}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_7

    goto :goto_2

    :cond_7
    new-instance v7, Ljava/io/File;

    invoke-virtual {v6}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v12, "replay_"

    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    goto :goto_3

    :cond_8
    :goto_2
    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v7

    sget-object v9, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v10, "SentryOptions.cacheDirPath is not set, session replay is no-op"

    new-array v12, v8, [Ljava/lang/Object;

    invoke-interface {v7, v9, v10, v12}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v7, 0x0

    :goto_3
    new-instance v9, Ljava/io/File;

    const-string v10, ".ongoing_segment"

    invoke-direct {v9, v7, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    sget-object v8, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v9, "No ongoing segment found for replay: %s"

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v6, v8, v9, v10}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v7}, Lio/sentry/config/a;->f(Ljava/io/File;)Z

    :goto_4
    const/4 v3, 0x0

    goto/16 :goto_15

    :cond_9
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v12, Lw7;->a:Ljava/nio/charset/Charset;

    new-instance v13, Ljava/io/InputStreamReader;

    new-instance v14, Ljava/io/FileInputStream;

    invoke-direct {v14, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v13, v14, v12}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v9, Ljava/io/BufferedReader;

    const/16 v12, 0x2000

    invoke-direct {v9, v13, v12}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :try_start_6
    new-instance v12, Lpo;

    const/4 v13, 0x0

    invoke-direct {v12, v13, v9}, Lpo;-><init>(ILjava/lang/Object;)V

    new-instance v13, Lbb;

    invoke-direct {v13, v12}, Lbb;-><init>(Lyx;)V

    invoke-virtual {v13}, Lbb;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const/4 v14, 0x1

    if-eqz v13, :cond_a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    const-string v15, "="

    filled-new-array {v15}, [Ljava/lang/String;

    move-result-object v15

    const/4 v3, 0x2

    invoke-static {v13, v15, v3}, Ltz;->Z(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v10, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v2, v0

    goto/16 :goto_18

    :cond_a
    invoke-interface {v9}, Ljava/io/Closeable;->close()V

    const-string v3, "config.height"

    invoke-virtual {v10, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_b

    invoke-static {v3}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_6

    :cond_b
    const/4 v3, 0x0

    :goto_6
    const-string v9, "config.width"

    invoke-virtual {v10, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_c

    invoke-static {v9}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_7

    :cond_c
    const/4 v9, 0x0

    :goto_7
    const-string v12, "config.frame-rate"

    invoke-virtual {v10, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_d

    invoke-static {v12}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v12

    goto :goto_8

    :cond_d
    const/4 v12, 0x0

    :goto_8
    const-string v13, "config.bit-rate"

    invoke-virtual {v10, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v13, :cond_e

    invoke-static {v13}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v13

    goto :goto_9

    :cond_e
    const/4 v13, 0x0

    :goto_9
    const-string v15, "segment.id"

    invoke-virtual {v10, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    if-eqz v15, :cond_f

    invoke-static {v15}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v15

    goto :goto_a

    :cond_f
    const/4 v15, 0x0

    :goto_a
    :try_start_7
    const-string v8, "segment.timestamp"

    invoke-virtual {v10, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_10

    move-object v8, v4

    :cond_10
    invoke-static {v8}, Lio/sentry/config/a;->o(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_b

    :catchall_4
    const/4 v8, 0x0

    :goto_b
    :try_start_8
    const-string v14, "replay.type"

    invoke-virtual {v10, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    if-nez v14, :cond_11

    move-object v14, v4

    :cond_11
    invoke-static {v14}, Lio/sentry/w2;->valueOf(Ljava/lang/String;)Lio/sentry/w2;

    move-result-object v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_c

    :catchall_5
    const/4 v14, 0x0

    :goto_c
    if-eqz v3, :cond_1c

    if-eqz v9, :cond_1c

    if-eqz v12, :cond_1c

    if-eqz v13, :cond_1c

    if-eqz v15, :cond_1c

    move-object/from16 v19, v3

    const/4 v3, -0x1

    move-object/from16 v20, v7

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v3, :cond_12

    if-eqz v8, :cond_12

    if-nez v14, :cond_13

    :cond_12
    move-object/from16 v19, v6

    goto/16 :goto_14

    :cond_13
    new-instance v21, Lio/sentry/android/replay/w;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v22

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v23

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v26

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v27

    const/high16 v24, 0x3f800000    # 1.0f

    const/high16 v25, 0x3f800000    # 1.0f

    invoke-direct/range {v21 .. v27}, Lio/sentry/android/replay/w;-><init>(IIFFII)V

    new-instance v3, Lio/sentry/android/replay/j;

    invoke-direct {v3, v6, v11}, Lio/sentry/android/replay/j;-><init>(Lio/sentry/v2;Lio/sentry/protocol/t;)V

    iget-object v7, v3, Lio/sentry/android/replay/j;->h:Ljava/util/ArrayList;

    invoke-virtual {v3}, Lio/sentry/android/replay/j;->f()Ljava/io/File;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v13, Lio/sentry/u;

    move-object/from16 v19, v6

    const/4 v6, 0x1

    invoke-direct {v13, v6, v3}, Lio/sentry/u;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v9, v13}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    goto :goto_d

    :cond_14
    move-object/from16 v19, v6

    :goto_d
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-virtual/range {v19 .. v19}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v6, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v7, "No frames found for replay: %s, deleting the replay"

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v6, v7, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static/range {v20 .. v20}, Lio/sentry/config/a;->f(Ljava/io/File;)Z

    goto/16 :goto_4

    :cond_15
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v9, 0x1

    if-le v6, v9, :cond_16

    new-instance v6, Lio/sentry/android/replay/f;

    const/4 v13, 0x0

    invoke-direct {v6, v13}, Lio/sentry/android/replay/f;-><init>(I)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v13

    if-le v13, v9, :cond_16

    invoke-static {v7, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_16
    sget-object v6, Lio/sentry/w2;->SESSION:Lio/sentry/w2;

    if-ne v14, v6, :cond_17

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move/from16 v23, v9

    goto :goto_e

    :cond_17
    const/16 v23, 0x0

    :goto_e
    if-ne v14, v6, :cond_18

    :goto_f
    move-object/from16 v22, v8

    goto :goto_10

    :cond_18
    invoke-static {v7}, Lra;->h0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/android/replay/k;

    iget-wide v8, v6, Lio/sentry/android/replay/k;->b:J

    invoke-static {v8, v9}, Lio/sentry/config/a;->n(J)Ljava/util/Date;

    move-result-object v8

    goto :goto_f

    :goto_10
    invoke-static {v7}, Lra;->l0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/android/replay/k;

    iget-wide v6, v6, Lio/sentry/android/replay/k;->b:J

    invoke-virtual/range {v22 .. v22}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    sub-long/2addr v6, v8

    const/16 v8, 0x3e8

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v9

    div-int/2addr v8, v9

    int-to-long v8, v8

    add-long v24, v6, v8

    const-string v6, "replay.recording"

    invoke-virtual {v10, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_1b

    new-instance v7, Ljava/io/StringReader;

    invoke-direct {v7, v6}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v19 .. v19}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v6

    const-class v8, Lio/sentry/m1;

    invoke-interface {v6, v7, v8}, Lio/sentry/e0;->a(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/m1;

    if-eqz v6, :cond_19

    iget-object v7, v6, Lio/sentry/m1;->b:Ljava/util/List;

    goto :goto_11

    :cond_19
    const/4 v7, 0x0

    :goto_11
    if-eqz v7, :cond_1a

    new-instance v7, Ljava/util/LinkedList;

    iget-object v6, v6, Lio/sentry/m1;->b:Ljava/util/List;

    invoke-direct {v7, v6}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    goto :goto_12

    :cond_1a
    const/4 v7, 0x0

    :goto_12
    if-eqz v7, :cond_1b

    goto :goto_13

    :cond_1b
    sget-object v7, LKf;->a:LKf;

    :goto_13
    new-instance v19, Lio/sentry/android/replay/d;

    const-string v6, "replay.screen-at-start"

    invoke-virtual {v10, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v27, v6

    check-cast v27, Ljava/lang/String;

    new-instance v6, Lio/sentry/android/replay/f;

    const/4 v8, 0x1

    invoke-direct {v6, v8}, Lio/sentry/android/replay/f;-><init>(I)V

    invoke-static {v7, v6}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v28

    move-object/from16 v26, v14

    move-object/from16 v20, v21

    move-object/from16 v21, v3

    invoke-direct/range {v19 .. v28}, Lio/sentry/android/replay/d;-><init>(Lio/sentry/android/replay/w;Lio/sentry/android/replay/j;Ljava/util/Date;IJLio/sentry/w2;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v3, v19

    goto :goto_15

    :cond_1c
    move-object/from16 v19, v6

    move-object/from16 v20, v7

    :goto_14
    invoke-virtual/range {v19 .. v19}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v6, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v7, "Incorrect segment values found for replay: %s, deleting the replay"

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v6, v7, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static/range {v20 .. v20}, Lio/sentry/config/a;->f(Ljava/io/File;)Z

    goto/16 :goto_4

    :goto_15
    if-nez v3, :cond_1d

    invoke-virtual {v0, v4}, Lio/sentry/android/replay/ReplayIntegration;->q(Ljava/lang/String;)V

    goto/16 :goto_1a

    :cond_1d
    iget-object v4, v0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v4, :cond_1e

    const/4 v4, 0x0

    :cond_1e
    const-string v6, "breadcrumbs.json"

    const-class v7, Ljava/util/List;

    invoke-virtual {v2, v4, v6, v7}, Lio/sentry/cache/f;->g(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/util/List;

    if-eqz v4, :cond_1f

    check-cast v2, Ljava/util/List;

    move-object/from16 v20, v2

    goto :goto_16

    :cond_1f
    const/16 v20, 0x0

    :goto_16
    iget-object v6, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    iget-object v2, v0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v2, :cond_20

    const/4 v7, 0x0

    goto :goto_17

    :cond_20
    move-object v7, v2

    :goto_17
    iget-wide v8, v3, Lio/sentry/android/replay/d;->e:J

    iget-object v10, v3, Lio/sentry/android/replay/d;->c:Ljava/util/Date;

    iget v12, v3, Lio/sentry/android/replay/d;->d:I

    iget-object v2, v3, Lio/sentry/android/replay/d;->a:Lio/sentry/android/replay/w;

    iget v13, v2, Lio/sentry/android/replay/w;->b:I

    iget v14, v2, Lio/sentry/android/replay/w;->a:I

    iget v4, v2, Lio/sentry/android/replay/w;->e:I

    iget v2, v2, Lio/sentry/android/replay/w;->f:I

    iget-object v15, v3, Lio/sentry/android/replay/d;->b:Lio/sentry/android/replay/j;

    move-object/from16 v16, v15

    iget-object v15, v3, Lio/sentry/android/replay/d;->f:Lio/sentry/w2;

    move/from16 v18, v2

    iget-object v2, v3, Lio/sentry/android/replay/d;->g:Ljava/lang/String;

    move-object/from16 v19, v2

    new-instance v2, Ljava/util/LinkedList;

    iget-object v3, v3, Lio/sentry/android/replay/d;->h:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v21, v2

    move/from16 v17, v4

    invoke-static/range {v6 .. v21}, Lio/sentry/android/replay/capture/j;->a(Lio/sentry/Z;Lio/sentry/v2;JLjava/util/Date;Lio/sentry/protocol/t;IIILio/sentry/w2;Lio/sentry/android/replay/j;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/m;

    move-result-object v2

    instance-of v3, v2, Lio/sentry/android/replay/capture/k;

    if-eqz v3, :cond_21

    new-instance v3, Lio/sentry/android/replay/m;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Lio/sentry/config/a;->e(Ljava/lang/Object;)Lio/sentry/H;

    move-result-object v3

    check-cast v2, Lio/sentry/android/replay/capture/k;

    iget-object v4, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    if-eqz v4, :cond_21

    iget-object v6, v2, Lio/sentry/android/replay/capture/k;->a:Lio/sentry/x2;

    iget-object v2, v2, Lio/sentry/android/replay/capture/k;->b:Lio/sentry/m1;

    iput-object v2, v3, Lio/sentry/H;->g:Lio/sentry/m1;

    invoke-virtual {v4, v6, v3}, Lio/sentry/w1;->p(Lio/sentry/x2;Lio/sentry/H;)Lio/sentry/protocol/t;

    :cond_21
    invoke-virtual {v0, v5}, Lio/sentry/android/replay/ReplayIntegration;->q(Ljava/lang/String;)V

    goto :goto_1a

    :goto_18
    :try_start_9
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :catchall_6
    move-exception v0

    invoke-static {v9, v2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_22
    :goto_19
    invoke-virtual {v0, v4}, Lio/sentry/android/replay/ReplayIntegration;->q(Ljava/lang/String;)V

    :goto_1a
    return-void

    :pswitch_3
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/modules/f;

    invoke-virtual {v0}, Lio/sentry/internal/modules/d;->a()Ljava/util/Map;

    return-void

    :pswitch_4
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    invoke-virtual {v0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->l()V

    return-void

    :pswitch_5
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/D;

    if-eqz v0, :cond_23

    sget-object v2, Landroidx/lifecycle/ProcessLifecycleOwner;->i:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v2, v2, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Lao;

    invoke-virtual {v2, v0}, Lao;->b(LXn;)V

    :cond_23
    return-void

    :pswitch_6
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/p;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Lio/sentry/android/core/p;->a(Ljava/util/List;Z)Lio/sentry/android/core/o;

    return-void

    :pswitch_7
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/g;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lio/sentry/android/core/g;->e(Z)V

    return-void

    :pswitch_8
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, LFu;

    iget-object v0, v0, LFu;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/core/app/FrameMetricsAggregator;

    iget-object v0, v0, Landroidx/core/app/FrameMetricsAggregator;->a:LNi;

    iget-object v2, v0, LNi;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    :goto_1b
    if-ltz v3, :cond_25

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/Activity;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_24

    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    iget-object v5, v0, LNi;->d:Ljava/lang/Object;

    check-cast v5, LMi;

    invoke-virtual {v4, v5}, Landroid/view/Window;->removeOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_24
    add-int/lit8 v3, v3, -0x1

    goto :goto_1b

    :cond_25
    return-void

    :pswitch_9
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/a;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lio/sentry/android/core/a;->h:J

    iget-object v0, v0, Lio/sentry/android/core/a;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_a
    iget-object v0, v1, Lio/sentry/S1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/U1;

    iget-object v2, v0, Lio/sentry/U1;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v3, 0x0

    :goto_1c
    const/16 v4, 0x28

    if-ge v3, v4, :cond_26

    :try_start_a
    iget-object v4, v0, Lio/sentry/U1;->c:Ljava/lang/Object;

    check-cast v4, Lt8;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x16d

    invoke-virtual {v2, v4, v6, v7, v5}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v4

    const/4 v5, 0x1

    invoke-interface {v4, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1c

    :cond_26
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->purge()V
    :try_end_a
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_a .. :try_end_a} :catch_1

    :catch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
