.class public final Lio/sentry/android/replay/capture/j;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lio/sentry/Z;Lio/sentry/v2;JLjava/util/Date;Lio/sentry/protocol/t;IIILio/sentry/w2;Lio/sentry/android/replay/j;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/m;
    .locals 30

    move-object/from16 v1, p0

    move/from16 v3, p6

    move-object/from16 v10, p10

    if-eqz v10, :cond_27

    iget-object v12, v10, Lio/sentry/android/replay/j;->h:Ljava/util/ArrayList;

    iget-object v13, v10, Lio/sentry/android/replay/j;->a:Lio/sentry/v2;

    const-wide/32 v4, 0x493e0

    move-wide/from16 v6, p2

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    invoke-virtual/range {p4 .. p4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    move-wide v6, v4

    new-instance v5, Ljava/io/File;

    invoke-virtual {v10}, Lio/sentry/android/replay/j;->f()Ljava/io/File;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ".mp4"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v4, v10, Lio/sentry/android/replay/j;->d:Lio/sentry/util/a;

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v16, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v8

    cmp-long v0, v8, v16

    if-lez v0, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    :cond_0
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v9, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v13}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "No captured frames, skipping generating a video segment"

    const/4 v6, 0x0

    new-array v7, v6, [Ljava/lang/Object;

    invoke-interface {v0, v4, v5, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    move/from16 v10, p7

    move/from16 v13, p8

    move/from16 v14, p11

    goto/16 :goto_e

    :cond_1
    move-wide/from16 p2, v14

    const/16 v18, 0x0

    invoke-virtual {v4}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v14

    :try_start_0
    new-instance v0, Lio/sentry/android/replay/video/d;

    move-object v15, v4

    new-instance v4, Lio/sentry/android/replay/video/a;

    move-wide v2, v6

    move v11, v9

    move-object/from16 v19, v15

    move/from16 v7, p7

    move/from16 v6, p8

    move/from16 v9, p12

    move-object v15, v8

    move/from16 v8, p11

    invoke-direct/range {v4 .. v9}, Lio/sentry/android/replay/video/a;-><init>(Ljava/io/File;IIII)V

    move-object v6, v4

    move v4, v8

    invoke-direct {v0, v13, v6}, Lio/sentry/android/replay/video/d;-><init>(Lio/sentry/v2;Lio/sentry/android/replay/video/a;)V

    iget-object v6, v0, Lio/sentry/android/replay/video/d;->d:Landroid/media/MediaCodec;

    iget-object v7, v0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    invoke-interface {v7}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/media/MediaFormat;

    invoke-virtual {v6, v7, v15, v15, v11}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    invoke-virtual {v6}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v7

    iput-object v7, v0, Lio/sentry/android/replay/video/d;->h:Landroid/view/Surface;

    invoke-virtual {v6}, Landroid/media/MediaCodec;->start()V

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lio/sentry/android/replay/video/d;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    invoke-static {v14, v15}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    iput-object v0, v10, Lio/sentry/android/replay/j;->f:Lio/sentry/android/replay/video/d;

    const/16 v0, 0x3e8

    int-to-long v6, v0

    int-to-long v8, v4

    div-long/2addr v6, v8

    invoke-static {v12}, Lra;->h0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/replay/k;

    add-long v8, v2, p2

    const-wide/high16 v20, -0x8000000000000000L

    cmp-long v14, v8, v20

    if-gtz v14, :cond_2

    sget-object v2, Ltp;->d:Ltp;

    move-object/from16 v22, v12

    goto :goto_0

    :cond_2
    new-instance v14, Ltp;

    const-wide/16 v20, 0x1

    move-object/from16 v22, v12

    sub-long v11, v8, v20

    invoke-direct {v14, v2, v3, v11, v12}, Ltp;-><init>(JJ)V

    move-object v2, v14

    :goto_0
    cmp-long v3, v6, v16

    if-lez v3, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    if-eqz v3, :cond_26

    iget-wide v11, v2, Lrp;->a:J

    iget-wide v3, v2, Lrp;->b:J

    move-wide/from16 v26, v3

    iget-wide v2, v2, Lrp;->c:J

    cmp-long v2, v2, v16

    if-lez v2, :cond_4

    move-wide/from16 v28, v6

    goto :goto_2

    :cond_4
    neg-long v2, v6

    move-wide/from16 v28, v2

    :goto_2
    new-instance v23, Lrp;

    move-wide/from16 v24, v11

    invoke-direct/range {v23 .. v29}, Lrp;-><init>(JJJ)V

    move-object/from16 v2, v23

    cmp-long v3, v28, v16

    iget-wide v11, v2, Lrp;->b:J

    if-lez v3, :cond_5

    cmp-long v2, v24, v11

    if-lez v2, :cond_6

    :cond_5
    if-gez v3, :cond_d

    cmp-long v2, v11, v24

    if-gtz v2, :cond_d

    :cond_6
    const/4 v2, 0x0

    :goto_3
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/k;

    add-long v20, v24, v6

    move/from16 p3, v2

    move-object/from16 p12, v3

    iget-wide v2, v4, Lio/sentry/android/replay/k;->b:J

    cmp-long v14, v24, v2

    if-gtz v14, :cond_7

    cmp-long v14, v2, v20

    if-gtz v14, :cond_7

    goto :goto_6

    :cond_7
    cmp-long v2, v2, v20

    if-lez v2, :cond_8

    goto :goto_5

    :cond_8
    move/from16 v2, p3

    move-object/from16 v3, p12

    goto :goto_4

    :cond_9
    move/from16 p3, v2

    :goto_5
    move-object v4, v0

    :goto_6
    if-nez v4, :cond_a

    goto :goto_a

    :cond_a
    :try_start_1
    iget-object v0, v4, Lio/sentry/android/replay/k;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v3, v10, Lio/sentry/android/replay/j;->f:Lio/sentry/android/replay/video/d;

    if-eqz v3, :cond_b

    invoke-virtual {v3, v0}, Lio/sentry/android/replay/video/d;->b(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v3, v0

    goto :goto_8

    :cond_b
    :goto_7
    :try_start_3
    invoke-static {v2, v15}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    add-int/lit8 v2, p3, 0x1

    move v3, v2

    move-object v0, v4

    move-object/from16 v2, v22

    goto :goto_b

    :catchall_1
    move-exception v0

    goto :goto_9

    :goto_8
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v2, v3}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_9
    invoke-virtual {v13}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v14, "Unable to decode bitmap and encode it into a video, skipping frame"

    invoke-interface {v2, v3, v14, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_a
    if-eqz v4, :cond_c

    iget-object v0, v4, Lio/sentry/android/replay/k;->a:Ljava/io/File;

    invoke-virtual {v10, v0}, Lio/sentry/android/replay/j;->d(Ljava/io/File;)V

    move-object/from16 v2, v22

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move/from16 v3, p3

    move-object v0, v15

    goto :goto_b

    :cond_c
    move-object/from16 v2, v22

    move/from16 v3, p3

    move-object v0, v4

    :goto_b
    cmp-long v4, v24, v11

    if-eqz v4, :cond_e

    add-long v24, v24, v28

    move-object/from16 v22, v2

    move v2, v3

    goto/16 :goto_3

    :cond_d
    move-object/from16 v2, v22

    const/4 v3, 0x0

    :cond_e
    if-nez v3, :cond_f

    invoke-virtual {v13}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Generated a video with no frames, not capturing a replay segment"

    const/4 v6, 0x0

    new-array v4, v6, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v10, v5}, Lio/sentry/android/replay/j;->d(Ljava/io/File;)V

    move/from16 v10, p7

    move/from16 v13, p8

    move/from16 v14, p11

    move-object v8, v15

    goto :goto_e

    :cond_f
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v4

    :try_start_6
    iget-object v0, v10, Lio/sentry/android/replay/j;->f:Lio/sentry/android/replay/video/d;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lio/sentry/android/replay/video/d;->c()V

    goto :goto_c

    :catchall_3
    move-exception v0

    move-object v1, v0

    goto/16 :goto_17

    :cond_10
    :goto_c
    iget-object v0, v10, Lio/sentry/android/replay/j;->f:Lio/sentry/android/replay/video/d;

    if-eqz v0, :cond_12

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->g:Lio/sentry/android/replay/video/b;

    iget v6, v0, Lio/sentry/android/replay/video/b;->e:I

    if-nez v6, :cond_11

    goto :goto_d

    :cond_11
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v11, v0, Lio/sentry/android/replay/video/b;->f:J

    iget-wide v13, v0, Lio/sentry/android/replay/video/b;->a:J

    add-long/2addr v11, v13

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v11, v12, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v16

    :cond_12
    :goto_d
    move-wide/from16 v11, v16

    iput-object v15, v10, Lio/sentry/android/replay/j;->f:Lio/sentry/android/replay/video/d;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-static {v4, v15}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    move-object v4, v5

    move-wide v5, v8

    new-instance v8, LIv;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    move-object v7, v4

    new-instance v4, Lio/sentry/android/replay/i;

    const/4 v9, 0x0

    move/from16 v13, p8

    move/from16 v14, p11

    move-object v15, v7

    move-object v7, v10

    move/from16 v10, p7

    invoke-direct/range {v4 .. v9}, Lio/sentry/android/replay/i;-><init>(JLjava/lang/Object;Ljava/io/Serializable;I)V

    invoke-static {v2, v4}, Lxa;->e0(Ljava/util/ArrayList;Lfj;)V

    iget-object v0, v8, LIv;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v8, Lio/sentry/android/replay/c;

    invoke-direct {v8, v15, v3, v11, v12}, Lio/sentry/android/replay/c;-><init>(Ljava/io/File;IJ)V

    :goto_e
    if-nez v8, :cond_13

    goto/16 :goto_1a

    :cond_13
    iget-object v0, v8, Lio/sentry/android/replay/c;->a:Ljava/io/File;

    iget v2, v8, Lio/sentry/android/replay/c;->b:I

    iget-wide v3, v8, Lio/sentry/android/replay/c;->c:J

    if-nez p14, :cond_15

    new-instance v5, LIv;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sget-object v6, LKf;->a:LKf;

    iput-object v6, v5, LIv;->a:Ljava/lang/Object;

    if-eqz v1, :cond_14

    new-instance v6, Lio/sentry/android/replay/l;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v7}, Lio/sentry/android/replay/l;-><init>(LIv;I)V

    invoke-interface {v1, v6}, Lio/sentry/Z;->m(Lio/sentry/s1;)V

    :cond_14
    iget-object v1, v5, LIv;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    goto :goto_f

    :cond_15
    move-object/from16 v1, p14

    :goto_f
    invoke-virtual/range {p4 .. p4}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    add-long/2addr v5, v3

    invoke-static {v5, v6}, Lio/sentry/config/a;->n(J)Ljava/util/Date;

    move-result-object v5

    new-instance v6, Lio/sentry/x2;

    invoke-direct {v6}, Lio/sentry/x2;-><init>()V

    move-object/from16 v7, p5

    iput-object v7, v6, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    iput-object v7, v6, Lio/sentry/x2;->s:Lio/sentry/protocol/t;

    move/from16 v7, p6

    iput v7, v6, Lio/sentry/x2;->t:I

    iput-object v5, v6, Lio/sentry/x2;->u:Ljava/util/Date;

    move-object/from16 v8, p4

    iput-object v8, v6, Lio/sentry/x2;->v:Ljava/util/Date;

    move-object/from16 v9, p9

    iput-object v9, v6, Lio/sentry/x2;->r:Lio/sentry/w2;

    iput-object v0, v6, Lio/sentry/x2;->p:Ljava/io/File;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Lio/sentry/rrweb/j;

    invoke-direct {v11}, Lio/sentry/rrweb/j;-><init>()V

    move-object v12, v0

    move-object/from16 p0, v1

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, v11, Lio/sentry/rrweb/b;->b:J

    iput v10, v11, Lio/sentry/rrweb/j;->d:I

    iput v13, v11, Lio/sentry/rrweb/j;->e:I

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lio/sentry/rrweb/m;

    invoke-direct {v0}, Lio/sentry/rrweb/m;-><init>()V

    move-object/from16 p3, v12

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    iput-wide v11, v0, Lio/sentry/rrweb/b;->b:J

    iput v7, v0, Lio/sentry/rrweb/m;->d:I

    iput-wide v3, v0, Lio/sentry/rrweb/m;->f:J

    iput v2, v0, Lio/sentry/rrweb/m;->k:I

    invoke-virtual/range {p3 .. p3}, Ljava/io/File;->length()J

    move-result-wide v1

    iput-wide v1, v0, Lio/sentry/rrweb/m;->e:J

    iput v14, v0, Lio/sentry/rrweb/m;->m:I

    iput v10, v0, Lio/sentry/rrweb/m;->i:I

    iput v13, v0, Lio/sentry/rrweb/m;->j:I

    const/4 v1, 0x0

    iput v1, v0, Lio/sentry/rrweb/m;->n:I

    iput v1, v0, Lio/sentry/rrweb/m;->o:I

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/f;

    if-eqz v2, :cond_17

    iget-object v4, v2, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v10, "network.event"

    invoke-static {v4, v10}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_17

    iget-object v2, v2, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "action"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_16

    const/4 v2, 0x0

    :cond_16
    const-string v4, "NETWORK_AVAILABLE"

    invoke-static {v2, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v2, v3, Lio/sentry/f;->g:Ljava/lang/String;

    invoke-static {v2, v10}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v2, v3, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "network_type"

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual {v3}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    const-wide/16 v12, 0x1388

    add-long/2addr v10, v12

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    cmp-long v2, v10, v12

    if-ltz v2, :cond_17

    const/4 v2, 0x1

    goto :goto_11

    :cond_17
    const/4 v2, 0x0

    :goto_11
    invoke-virtual {v3}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    cmp-long v4, v10, v12

    if-gez v4, :cond_18

    if-eqz v2, :cond_1d

    :cond_18
    invoke-virtual {v3}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    cmp-long v2, v10, v12

    if-gez v2, :cond_1d

    invoke-virtual/range {p1 .. p1}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v2

    invoke-interface {v2}, Lio/sentry/k1;->t()Lio/sentry/j1;

    move-result-object v2

    invoke-interface {v2, v3}, Lio/sentry/j1;->j(Lio/sentry/f;)Lio/sentry/rrweb/b;

    move-result-object v2

    if-eqz v2, :cond_1d

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    instance-of v4, v2, Lio/sentry/rrweb/a;

    if-eqz v4, :cond_19

    move-object v4, v2

    check-cast v4, Lio/sentry/rrweb/a;

    goto :goto_12

    :cond_19
    const/4 v4, 0x0

    :goto_12
    if-eqz v4, :cond_1a

    iget-object v4, v4, Lio/sentry/rrweb/a;->f:Ljava/lang/String;

    goto :goto_13

    :cond_1a
    const/4 v4, 0x0

    :goto_13
    const-string v10, "navigation"

    invoke-static {v4, v10}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1d

    check-cast v2, Lio/sentry/rrweb/a;

    iget-object v4, v2, Lio/sentry/rrweb/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v10, "to"

    if-eqz v4, :cond_1b

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1c

    :cond_1b
    const/4 v4, 0x0

    :cond_1c
    instance-of v4, v4, Ljava/lang/String;

    if-eqz v4, :cond_1d

    iget-object v2, v2, Lio/sentry/rrweb/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_1d
    move-object v2, v3

    goto/16 :goto_10

    :cond_1e
    if-eqz p13, :cond_20

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1f

    const/4 v1, 0x0

    :goto_14
    move-object/from16 v11, p13

    goto :goto_15

    :cond_1f
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_14

    :goto_15
    invoke-static {v1, v11}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    invoke-virtual {v0, v11}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    :cond_20
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-interface/range {p15 .. p15}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_21
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_23

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/rrweb/b;

    iget-wide v10, v4, Lio/sentry/rrweb/b;->b:J

    cmp-long v5, v10, v1

    if-gez v5, :cond_21

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    cmp-long v5, v10, v12

    if-ltz v5, :cond_22

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_16

    :cond_23
    if-nez v7, :cond_25

    new-instance v1, Lio/sentry/rrweb/k;

    sget-object v2, Lio/sentry/rrweb/c;->Custom:Lio/sentry/rrweb/c;

    invoke-direct {v1, v2}, Lio/sentry/rrweb/b;-><init>(Lio/sentry/rrweb/c;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lio/sentry/rrweb/k;->d:Ljava/util/HashMap;

    const-string v3, "options"

    iput-object v3, v1, Lio/sentry/rrweb/k;->c:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lio/sentry/v2;->getSdkVersion()Lio/sentry/protocol/r;

    move-result-object v3

    if-eqz v3, :cond_24

    const-string v4, "nativeSdkName"

    iget-object v5, v3, Lio/sentry/protocol/r;->a:Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "nativeSdkVersion"

    iget-object v3, v3, Lio/sentry/protocol/r;->b:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_24
    invoke-virtual/range {p1 .. p1}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v3

    iget-object v4, v3, Lio/sentry/z2;->b:Ljava/lang/Double;

    iget-object v5, v3, Lio/sentry/z2;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v8, "errorSampleRate"

    invoke-virtual {v2, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "sessionSampleRate"

    iget-object v8, v3, Lio/sentry/z2;->a:Ljava/lang/Double;

    invoke-virtual {v2, v4, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.widget.ImageView"

    invoke-virtual {v5, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v8, "maskAllImages"

    invoke-virtual {v2, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.widget.TextView"

    invoke-virtual {v5, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v8, "maskAllText"

    invoke-virtual {v2, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v3, Lio/sentry/z2;->e:Lio/sentry/y2;

    invoke-virtual {v4}, Lio/sentry/y2;->serializedName()Ljava/lang/String;

    move-result-object v4

    const-string v8, "quality"

    invoke-virtual {v2, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "maskedViewClasses"

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "unmaskedViewClasses"

    iget-object v3, v3, Lio/sentry/z2;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_25
    new-instance v1, Lio/sentry/m1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/m1;->a:Ljava/lang/Integer;

    new-instance v2, Lio/sentry/android/replay/capture/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v9, v2}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/m1;->b:Ljava/util/List;

    iput-object v0, v6, Lio/sentry/x2;->w:Ljava/util/List;

    new-instance v0, Lio/sentry/android/replay/capture/k;

    invoke-direct {v0, v6, v1}, Lio/sentry/android/replay/capture/k;-><init>(Lio/sentry/x2;Lio/sentry/m1;)V

    return-object v0

    :goto_17
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception v0

    invoke-static {v4, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v0

    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Step must be positive, was: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_18
    move-object v1, v0

    goto :goto_19

    :catchall_5
    move-exception v0

    goto :goto_18

    :goto_19
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    :catchall_6
    move-exception v0

    invoke-static {v14, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v0

    :cond_27
    :goto_1a
    sget-object v0, Lio/sentry/android/replay/capture/l;->a:Lio/sentry/android/replay/capture/l;

    return-object v0
.end method
