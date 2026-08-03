.class public final Lio/sentry/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/q0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/H2;
    .locals 13

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v10

    sget-object v11, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v10, v11, :cond_a

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    const/4 v12, -0x1

    sparse-switch v11, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v11, "trace_id"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v12, 0x8

    goto/16 :goto_1

    :sswitch_1
    const-string v11, "tags"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_1

    :cond_1
    const/4 v12, 0x7

    goto :goto_1

    :sswitch_2
    const-string v11, "data"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    const/4 v12, 0x6

    goto :goto_1

    :sswitch_3
    const-string v11, "op"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    goto :goto_1

    :cond_3
    const/4 v12, 0x5

    goto :goto_1

    :sswitch_4
    const-string v11, "status"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    goto :goto_1

    :cond_4
    const/4 v12, 0x4

    goto :goto_1

    :sswitch_5
    const-string v11, "origin"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_1

    :cond_5
    const/4 v12, 0x3

    goto :goto_1

    :sswitch_6
    const-string v11, "description"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    goto :goto_1

    :cond_6
    const/4 v12, 0x2

    goto :goto_1

    :sswitch_7
    const-string v11, "parent_span_id"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    goto :goto_1

    :cond_7
    const/4 v12, 0x1

    goto :goto_1

    :sswitch_8
    const-string v11, "span_id"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    goto :goto_1

    :cond_8
    const/4 v12, 0x0

    :goto_1
    packed-switch v12, :pswitch_data_0

    if-nez v3, :cond_9

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_9
    invoke-virtual {p0, p1, v3, v10}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_0
    new-instance v0, Lio/sentry/protocol/t;

    invoke-virtual {p0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v10}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    invoke-static {v8}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v8

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_0

    :pswitch_4
    new-instance v6, Lio/sentry/e;

    const/16 v10, 0x16

    invoke-direct {v6, v10}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {p0, p1, v6}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/L2;

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {p0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    :pswitch_7
    new-instance v4, Lio/sentry/e;

    const/16 v10, 0x15

    invoke-direct {v4, v10}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {p0, p1, v4}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/K2;

    goto/16 :goto_0

    :pswitch_8
    new-instance v1, Lio/sentry/K2;

    invoke-virtual {p0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v10}, Lio/sentry/K2;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_a
    if-eqz v0, :cond_f

    if-eqz v1, :cond_e

    if-nez v2, :cond_b

    const-string v2, ""

    :cond_b
    new-instance p1, Lio/sentry/H2;

    invoke-direct {p1, v0, v1, v2, v4}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Ljava/lang/String;Lio/sentry/K2;)V

    iput-object v5, p1, Lio/sentry/H2;->f:Ljava/lang/String;

    iput-object v6, p1, Lio/sentry/H2;->g:Lio/sentry/L2;

    iput-object v7, p1, Lio/sentry/H2;->i:Ljava/lang/String;

    if-eqz v8, :cond_c

    iput-object v8, p1, Lio/sentry/H2;->h:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_c
    if-eqz v9, :cond_d

    iput-object v9, p1, Lio/sentry/H2;->j:Ljava/util/Map;

    :cond_d
    iput-object v3, p1, Lio/sentry/H2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object p1

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Missing required field \"span_id\""

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {p1, v1, v0, p0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Missing required field \"trace_id\""

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {p1, v1, v0, p0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77ea41d0 -> :sswitch_8
        -0x68c5dc65 -> :sswitch_7
        -0x66ca7c04 -> :sswitch_6
        -0x3c1e50da -> :sswitch_5
        -0x3532300e -> :sswitch_4
        0xde1 -> :sswitch_3
        0x2eefaa -> :sswitch_2
        0x363419 -> :sswitch_1
        0x4bb73e55 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method private final c(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;
    .locals 12

    invoke-virtual {p1}, Lio/sentry/A0;->f()V

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v8

    sget-object v9, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v8, v9, :cond_9

    invoke-virtual {p1}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9

    const/4 v10, 0x0

    const/4 v11, -0x1

    sparse-switch v9, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v9, "message"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    goto :goto_1

    :cond_1
    const/4 v11, 0x6

    goto :goto_1

    :sswitch_1
    const-string v9, "level"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_1

    :cond_2
    const/4 v11, 0x5

    goto :goto_1

    :sswitch_2
    const-string v9, "timestamp"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_1

    :cond_3
    const/4 v11, 0x4

    goto :goto_1

    :sswitch_3
    const-string v9, "category"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_1

    :cond_4
    const/4 v11, 0x3

    goto :goto_1

    :sswitch_4
    const-string v9, "type"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_1

    :cond_5
    const/4 v11, 0x2

    goto :goto_1

    :sswitch_5
    const-string v9, "data"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_1

    :cond_6
    const/4 v11, 0x1

    goto :goto_1

    :sswitch_6
    const-string v9, "origin"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    goto :goto_1

    :cond_7
    move v11, v10

    :goto_1
    packed-switch v11, :pswitch_data_0

    if-nez v7, :cond_8

    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_8
    invoke-virtual {p1, p2, v7, v8}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :pswitch_1
    :try_start_0
    invoke-virtual {p1}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lio/sentry/a2;->valueOf(Ljava/lang/String;)Lio/sentry/a2;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v8

    sget-object v9, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v11, "Error when deserializing SentryLevel"

    new-array v10, v10, [Ljava/lang/Object;

    invoke-interface {p2, v9, v8, v11, v10}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p1, p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v8

    if-eqz v8, :cond_0

    move-object v0, v8

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {p1}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    invoke-static {v8}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v8

    if-eqz v8, :cond_0

    move-object v1, v8

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    :cond_9
    new-instance p2, Lio/sentry/f;

    invoke-direct {p2, v0}, Lio/sentry/f;-><init>(Ljava/util/Date;)V

    iput-object v2, p2, Lio/sentry/f;->d:Ljava/lang/String;

    iput-object v3, p2, Lio/sentry/f;->e:Ljava/lang/String;

    iput-object v1, p2, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object v4, p2, Lio/sentry/f;->g:Ljava/lang/String;

    iput-object v5, p2, Lio/sentry/f;->h:Ljava/lang/String;

    iput-object v6, p2, Lio/sentry/f;->i:Lio/sentry/a2;

    iput-object v7, p2, Lio/sentry/f;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lio/sentry/A0;->i()V

    return-object p2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3c1e50da -> :sswitch_6
        0x2eefaa -> :sswitch_5
        0x368f3a -> :sswitch_4
        0x302bcfe -> :sswitch_3
        0x3492916 -> :sswitch_2
        0x6219b84 -> :sswitch_1
        0x38eb0007 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;
    .locals 2

    const-string v0, "Missing required field \""

    const-string v1, "\""

    invoke-static {v0, p0, v1}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {p1, v1, p0, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static e(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;
    .locals 2

    const-string v0, "Missing required field \""

    const-string v1, "\""

    invoke-static {v0, p0, v1}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {p1, v1, p0, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;
    .locals 46

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget v3, v1, Lio/sentry/e;->a:I

    const/16 v4, 0xe

    const-string v7, "release"

    const-string v8, "environment"

    const-string v9, "type"

    const-string v10, "trace_id"

    const/16 v11, 0xa

    const-string v12, "timestamp"

    const/16 v16, 0x6

    const/16 v17, 0x5

    const/4 v14, 0x4

    const/4 v6, 0x3

    const/16 v20, -0x1

    const/4 v13, 0x2

    const/4 v15, 0x0

    packed-switch v3, :pswitch_data_0

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v10

    sget-object v11, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v10, v11, :cond_5

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    :goto_1
    move/from16 v11, v20

    goto :goto_2

    :sswitch_0
    const-string v11, "event_id"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    goto :goto_1

    :cond_0
    move v11, v6

    goto :goto_2

    :sswitch_1
    const-string v11, "email"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_1

    :cond_1
    move v11, v13

    goto :goto_2

    :sswitch_2
    const-string v11, "name"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    const/4 v11, 0x1

    goto :goto_2

    :sswitch_3
    const-string v11, "comments"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    goto :goto_1

    :cond_3
    move v11, v15

    :goto_2
    packed-switch v11, :pswitch_data_1

    if-nez v9, :cond_4

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    :cond_4
    invoke-virtual {v0, v2, v9, v10}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    new-instance v3, Lio/sentry/protocol/t;

    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v3, v10}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :pswitch_3
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v3, :cond_6

    new-instance v0, Lio/sentry/S2;

    invoke-direct {v0, v3, v4, v7, v8}, Lio/sentry/S2;-><init>(Lio/sentry/protocol/t;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v9, v0, Lio/sentry/S2;->e:Ljava/util/HashMap;

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Missing required field \"event_id\""

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v4, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_4
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move v4, v6

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    :goto_3
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v11

    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v11, v5, :cond_12

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_1

    :goto_4
    move/from16 v11, v20

    goto/16 :goto_5

    :sswitch_4
    const-string v11, "transaction"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    goto :goto_4

    :cond_7
    const/16 v11, 0x9

    goto/16 :goto_5

    :sswitch_5
    const-string v11, "public_key"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    goto :goto_4

    :cond_8
    const/16 v11, 0x8

    goto/16 :goto_5

    :sswitch_6
    const-string v11, "sampled"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    goto :goto_4

    :cond_9
    const/4 v11, 0x7

    goto :goto_5

    :sswitch_7
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    goto :goto_4

    :cond_a
    move/from16 v11, v16

    goto :goto_5

    :sswitch_8
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    goto :goto_4

    :cond_b
    move/from16 v11, v17

    goto :goto_5

    :sswitch_9
    const-string v11, "sample_rate"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_4

    :cond_c
    const/4 v11, 0x4

    goto :goto_5

    :sswitch_a
    const-string v11, "sample_rand"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_d

    goto :goto_4

    :cond_d
    move v11, v4

    goto :goto_5

    :sswitch_b
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_e

    goto :goto_4

    :cond_e
    const/4 v11, 0x2

    goto :goto_5

    :sswitch_c
    const-string v11, "user_id"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    goto :goto_4

    :cond_f
    const/4 v11, 0x1

    goto :goto_5

    :sswitch_d
    const-string v11, "replay_id"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_10

    goto :goto_4

    :cond_10
    const/4 v11, 0x0

    :goto_5
    packed-switch v11, :pswitch_data_2

    if-nez v1, :cond_11

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_11
    invoke-virtual {v0, v2, v1, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_5
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v18, v5

    goto/16 :goto_3

    :pswitch_6
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v21, v5

    goto/16 :goto_3

    :pswitch_7
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    move-object v13, v5

    goto/16 :goto_3

    :pswitch_8
    new-instance v5, Lio/sentry/protocol/t;

    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    move-object v6, v5

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    move-object v12, v5

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    move-object v15, v5

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    move-object v9, v5

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v19, v5

    goto/16 :goto_3

    :pswitch_e
    new-instance v5, Lio/sentry/protocol/t;

    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v5, v11}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    move-object v14, v5

    goto/16 :goto_3

    :cond_12
    if-eqz v6, :cond_14

    if-eqz v21, :cond_13

    new-instance v5, Lio/sentry/N2;

    move-object v8, v3

    move-object/from16 v11, v18

    move-object/from16 v10, v19

    move-object/from16 v7, v21

    invoke-direct/range {v5 .. v15}, Lio/sentry/N2;-><init>(Lio/sentry/protocol/t;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/sentry/protocol/t;Ljava/lang/String;)V

    iput-object v1, v5, Lio/sentry/N2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v5

    :cond_13
    const-string v0, "public_key"

    invoke-static {v0, v2}, Lio/sentry/e;->e(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_14
    invoke-static {v10, v2}, Lio/sentry/e;->e(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :pswitch_f
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/L2;->valueOf(Ljava/lang/String;)Lio/sentry/L2;

    move-result-object v0

    return-object v0

    :pswitch_10
    new-instance v1, Lio/sentry/K2;

    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lio/sentry/K2;-><init>(Ljava/lang/String;)V

    return-object v1

    :pswitch_11
    invoke-static/range {p1 .. p2}, Lio/sentry/e;->b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/H2;

    move-result-object v0

    return-object v0

    :pswitch_12
    move v1, v4

    move v4, v6

    move v3, v11

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    :goto_6
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v9

    sget-object v10, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v9, v10, :cond_3a

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_2

    :goto_7
    move/from16 v10, v20

    goto/16 :goto_8

    :sswitch_e
    const-string v10, "abnormal_mechanism"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_15

    goto :goto_7

    :cond_15
    move v10, v3

    goto/16 :goto_8

    :sswitch_f
    const-string v10, "attrs"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_16

    goto :goto_7

    :cond_16
    const/16 v10, 0x9

    goto/16 :goto_8

    :sswitch_10
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_17

    goto :goto_7

    :cond_17
    const/16 v10, 0x8

    goto/16 :goto_8

    :sswitch_11
    const-string v10, "init"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    goto :goto_7

    :cond_18
    const/4 v10, 0x7

    goto :goto_8

    :sswitch_12
    const-string v10, "sid"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_19

    goto :goto_7

    :cond_19
    move/from16 v10, v16

    goto :goto_8

    :sswitch_13
    const-string v10, "seq"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1a

    goto :goto_7

    :cond_1a
    move/from16 v10, v17

    goto :goto_8

    :sswitch_14
    const-string v10, "did"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1b

    goto :goto_7

    :cond_1b
    const/4 v10, 0x4

    goto :goto_8

    :sswitch_15
    const-string v10, "status"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1c

    goto :goto_7

    :cond_1c
    move v10, v4

    goto :goto_8

    :sswitch_16
    const-string v10, "errors"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1d

    goto :goto_7

    :cond_1d
    const/4 v10, 0x2

    goto :goto_8

    :sswitch_17
    const-string v10, "started"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1e

    goto :goto_7

    :cond_1e
    const/4 v10, 0x1

    goto :goto_8

    :sswitch_18
    const-string v10, "duration"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    goto :goto_7

    :cond_1f
    const/4 v10, 0x0

    :goto_8
    packed-switch v10, :pswitch_data_3

    if-nez v6, :cond_20

    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_20
    invoke-virtual {v0, v2, v6, v9}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    :goto_9
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    goto/16 :goto_19

    :pswitch_13
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v40, v9

    goto :goto_9

    :pswitch_14
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    :goto_a
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v9

    sget-object v10, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v9, v10, :cond_36

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_3

    :goto_b
    move/from16 v9, v20

    goto :goto_c

    :sswitch_19
    const-string v10, "user_agent"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_21

    goto :goto_b

    :cond_21
    move v9, v4

    goto :goto_c

    :sswitch_1a
    const-string v10, "ip_address"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_22

    goto :goto_b

    :cond_22
    const/4 v9, 0x2

    goto :goto_c

    :sswitch_1b
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_23

    goto :goto_b

    :cond_23
    const/4 v9, 0x1

    goto :goto_c

    :sswitch_1c
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_24

    goto :goto_b

    :cond_24
    const/4 v9, 0x0

    :goto_c
    packed-switch v9, :pswitch_data_4

    iget v9, v0, Lio/sentry/A0;->a:I

    packed-switch v9, :pswitch_data_5

    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    goto/16 :goto_18

    :pswitch_15
    iget-object v9, v0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v9, Lio/sentry/vendor/gson/stream/a;

    const/4 v10, 0x0

    :goto_d
    iget v11, v9, Lio/sentry/vendor/gson/stream/a;->h:I

    if-nez v11, :cond_25

    invoke-virtual {v9}, Lio/sentry/vendor/gson/stream/a;->l()I

    move-result v11

    :cond_25
    if-ne v11, v4, :cond_26

    const/4 v13, 0x1

    invoke-virtual {v9, v13}, Lio/sentry/vendor/gson/stream/a;->D(I)V

    :goto_e
    add-int/lit8 v10, v10, 0x1

    :goto_f
    const/4 v4, 0x0

    const/4 v14, 0x2

    :goto_10
    const/16 v22, 0x9

    goto/16 :goto_17

    :cond_26
    const/4 v13, 0x1

    if-ne v11, v13, :cond_27

    invoke-virtual {v9, v4}, Lio/sentry/vendor/gson/stream/a;->D(I)V

    goto :goto_e

    :cond_27
    const/4 v14, 0x4

    if-ne v11, v14, :cond_28

    iget v11, v9, Lio/sentry/vendor/gson/stream/a;->m:I

    sub-int/2addr v11, v13

    iput v11, v9, Lio/sentry/vendor/gson/stream/a;->m:I

    add-int/lit8 v10, v10, -0x1

    goto :goto_f

    :cond_28
    const/4 v14, 0x2

    if-ne v11, v14, :cond_29

    iget v11, v9, Lio/sentry/vendor/gson/stream/a;->m:I

    sub-int/2addr v11, v13

    iput v11, v9, Lio/sentry/vendor/gson/stream/a;->m:I

    add-int/lit8 v10, v10, -0x1

    const/4 v4, 0x0

    const/4 v13, 0x1

    goto :goto_10

    :cond_29
    const/16 v13, 0xc

    if-eq v11, v1, :cond_30

    if-ne v11, v3, :cond_2a

    goto :goto_14

    :cond_2a
    const/16 v15, 0x8

    if-eq v11, v15, :cond_2f

    if-ne v11, v13, :cond_2b

    goto :goto_13

    :cond_2b
    const/16 v13, 0x9

    if-eq v11, v13, :cond_2e

    const/16 v13, 0xd

    if-ne v11, v13, :cond_2c

    goto :goto_12

    :cond_2c
    const/16 v13, 0x10

    if-ne v11, v13, :cond_2d

    iget v11, v9, Lio/sentry/vendor/gson/stream/a;->d:I

    iget v13, v9, Lio/sentry/vendor/gson/stream/a;->j:I

    add-int/2addr v11, v13

    iput v11, v9, Lio/sentry/vendor/gson/stream/a;->d:I

    :cond_2d
    :goto_11
    const/4 v13, 0x1

    const/16 v22, 0x9

    goto/16 :goto_16

    :cond_2e
    :goto_12
    const/16 v11, 0x22

    invoke-virtual {v9, v11}, Lio/sentry/vendor/gson/stream/a;->F(C)V

    goto :goto_11

    :cond_2f
    :goto_13
    const/16 v11, 0x27

    invoke-virtual {v9, v11}, Lio/sentry/vendor/gson/stream/a;->F(C)V

    goto :goto_11

    :cond_30
    :goto_14
    const/4 v11, 0x0

    :goto_15
    iget v15, v9, Lio/sentry/vendor/gson/stream/a;->d:I

    add-int/2addr v15, v11

    iget v4, v9, Lio/sentry/vendor/gson/stream/a;->e:I

    if-ge v15, v4, :cond_33

    iget-object v4, v9, Lio/sentry/vendor/gson/stream/a;->c:[C

    aget-char v4, v4, v15

    const/16 v15, 0x9

    if-eq v4, v15, :cond_32

    if-eq v4, v3, :cond_32

    if-eq v4, v13, :cond_32

    const/16 v13, 0xd

    if-eq v4, v13, :cond_32

    const/16 v13, 0x20

    if-eq v4, v13, :cond_32

    const/16 v13, 0x23

    if-eq v4, v13, :cond_31

    const/16 v13, 0x2c

    if-eq v4, v13, :cond_32

    const/16 v13, 0x2f

    if-eq v4, v13, :cond_31

    const/16 v13, 0x3d

    if-eq v4, v13, :cond_31

    const/16 v13, 0x7b

    if-eq v4, v13, :cond_32

    const/16 v13, 0x7d

    if-eq v4, v13, :cond_32

    const/16 v13, 0x3a

    if-eq v4, v13, :cond_32

    const/16 v13, 0x3b

    if-eq v4, v13, :cond_31

    packed-switch v4, :pswitch_data_6

    add-int/lit8 v11, v11, 0x1

    const/4 v4, 0x3

    const/16 v13, 0xc

    goto :goto_15

    :cond_31
    :pswitch_16
    invoke-virtual {v9}, Lio/sentry/vendor/gson/stream/a;->i()V

    :cond_32
    :pswitch_17
    iget v4, v9, Lio/sentry/vendor/gson/stream/a;->d:I

    add-int/2addr v4, v11

    iput v4, v9, Lio/sentry/vendor/gson/stream/a;->d:I

    move/from16 v22, v15

    const/4 v13, 0x1

    goto :goto_16

    :cond_33
    const/16 v22, 0x9

    iput v15, v9, Lio/sentry/vendor/gson/stream/a;->d:I

    const/4 v13, 0x1

    invoke-virtual {v9, v13}, Lio/sentry/vendor/gson/stream/a;->p(I)Z

    move-result v4

    if-nez v4, :cond_35

    :goto_16
    const/4 v4, 0x0

    :goto_17
    iput v4, v9, Lio/sentry/vendor/gson/stream/a;->h:I

    if-nez v10, :cond_34

    iget-object v10, v9, Lio/sentry/vendor/gson/stream/a;->o:[I

    iget v11, v9, Lio/sentry/vendor/gson/stream/a;->m:I

    sub-int/2addr v11, v13

    aget v15, v10, v11

    add-int/2addr v15, v13

    aput v15, v10, v11

    iget-object v9, v9, Lio/sentry/vendor/gson/stream/a;->n:[Ljava/lang/String;

    const-string v10, "null"

    aput-object v10, v9, v11

    goto :goto_18

    :cond_34
    const/4 v4, 0x3

    goto/16 :goto_d

    :cond_35
    const/4 v4, 0x3

    const/16 v13, 0xc

    goto :goto_14

    :pswitch_18
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v37, v9

    goto :goto_18

    :pswitch_19
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v36, v9

    goto :goto_18

    :pswitch_1a
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v39, v9

    goto :goto_18

    :pswitch_1b
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v38, v9

    :goto_18
    const/4 v4, 0x3

    goto/16 :goto_a

    :cond_36
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    goto/16 :goto_19

    :pswitch_1c
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v9

    move-object/from16 v29, v9

    goto/16 :goto_19

    :pswitch_1d
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v9

    move-object/from16 v33, v9

    goto/16 :goto_19

    :pswitch_1e
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_38

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    const/16 v11, 0x24

    if-eq v10, v11, :cond_37

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    const/16 v11, 0x20

    if-ne v10, v11, :cond_38

    :cond_37
    move-object/from16 v32, v9

    goto :goto_19

    :cond_38
    sget-object v10, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v11, "%s sid is not valid."

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v2, v10, v11, v9}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_19

    :pswitch_1f
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v9

    move-object/from16 v34, v9

    goto :goto_19

    :pswitch_20
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v31, v9

    goto :goto_19

    :pswitch_21
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lio/sentry/util/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_39

    invoke-static {v9}, Lio/sentry/E2;->valueOf(Ljava/lang/String;)Lio/sentry/E2;

    move-result-object v9

    move-object/from16 v27, v9

    goto :goto_19

    :pswitch_22
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v5

    goto :goto_19

    :pswitch_23
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v9

    move-object/from16 v28, v9

    goto :goto_19

    :pswitch_24
    const/4 v4, 0x0

    const/4 v14, 0x2

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v9

    move-object/from16 v35, v9

    :cond_39
    :goto_19
    const/4 v4, 0x3

    goto/16 :goto_6

    :cond_3a
    if-eqz v27, :cond_3e

    if-eqz v28, :cond_3d

    if-eqz v5, :cond_3c

    if-eqz v39, :cond_3b

    new-instance v26, Lio/sentry/F2;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v30

    invoke-direct/range {v26 .. v40}, Lio/sentry/F2;-><init>(Lio/sentry/E2;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v26

    iput-object v6, v1, Lio/sentry/F2;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :cond_3b
    invoke-static {v7, v2}, Lio/sentry/e;->d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_3c
    const-string v0, "errors"

    invoke-static {v0, v2}, Lio/sentry/e;->d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_3d
    const-string v0, "started"

    invoke-static {v0, v2}, Lio/sentry/e;->d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_3e
    const-string v0, "status"

    invoke-static {v0, v2}, Lio/sentry/e;->d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :pswitch_25
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/w2;->valueOf(Ljava/lang/String;)Lio/sentry/w2;

    move-result-object v0

    return-object v0

    :pswitch_26
    move v14, v13

    move v4, v15

    new-instance v1, Lio/sentry/x2;

    invoke-direct {v1}, Lio/sentry/x2;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    :goto_1a
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v14

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v14, v4, :cond_4a

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_4

    :goto_1b
    move/from16 v14, v20

    goto/16 :goto_1c

    :sswitch_1d
    const-string v14, "segment_id"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3f

    goto :goto_1b

    :cond_3f
    const/16 v14, 0x8

    goto/16 :goto_1c

    :sswitch_1e
    const-string v14, "replay_type"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_40

    goto :goto_1b

    :cond_40
    const/4 v14, 0x7

    goto :goto_1c

    :sswitch_1f
    const-string v14, "trace_ids"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_41

    goto :goto_1b

    :cond_41
    move/from16 v14, v16

    goto :goto_1c

    :sswitch_20
    const-string v14, "error_ids"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_42

    goto :goto_1b

    :cond_42
    move/from16 v14, v17

    goto :goto_1c

    :sswitch_21
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_43

    goto :goto_1b

    :cond_43
    const/4 v14, 0x4

    goto :goto_1c

    :sswitch_22
    const-string v14, "urls"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_44

    goto :goto_1b

    :cond_44
    const/4 v14, 0x3

    goto :goto_1c

    :sswitch_23
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_45

    goto :goto_1b

    :cond_45
    const/4 v14, 0x2

    goto :goto_1c

    :sswitch_24
    const-string v14, "replay_start_timestamp"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_46

    goto :goto_1b

    :cond_46
    const/4 v14, 0x1

    goto :goto_1c

    :sswitch_25
    const-string v14, "replay_id"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_47

    goto :goto_1b

    :cond_47
    const/4 v14, 0x0

    :goto_1c
    packed-switch v14, :pswitch_data_7

    invoke-static {v1, v4, v0, v2}, Lio/sentry/config/a;->g(Lio/sentry/C1;Ljava/lang/String;Lio/sentry/A0;Lio/sentry/ILogger;)Z

    move-result v14

    if-nez v14, :cond_49

    if-nez v7, :cond_48

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    :cond_48
    invoke-virtual {v0, v2, v7, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1d

    :pswitch_27
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v21, v4

    goto :goto_1d

    :pswitch_28
    new-instance v3, Lio/sentry/e;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/w2;

    goto :goto_1d

    :pswitch_29
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    move-object v15, v4

    goto :goto_1d

    :pswitch_2a
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    move-object v13, v4

    goto :goto_1d

    :pswitch_2b
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v4

    move-object v6, v4

    goto :goto_1d

    :pswitch_2c
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    move-object v11, v4

    goto :goto_1d

    :pswitch_2d
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    move-object v5, v4

    goto :goto_1d

    :pswitch_2e
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v4

    move-object v10, v4

    goto :goto_1d

    :pswitch_2f
    new-instance v4, Lio/sentry/clientreport/a;

    const/16 v8, 0x16

    invoke-direct {v4, v8}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v4}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/protocol/t;

    move-object v8, v4

    :cond_49
    :goto_1d
    const/4 v4, 0x0

    goto/16 :goto_1a

    :cond_4a
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v5, :cond_4b

    iput-object v5, v1, Lio/sentry/x2;->q:Ljava/lang/String;

    :cond_4b
    if-eqz v3, :cond_4c

    iput-object v3, v1, Lio/sentry/x2;->r:Lio/sentry/w2;

    :cond_4c
    if-eqz v21, :cond_4d

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Lio/sentry/x2;->t:I

    :cond_4d
    if-eqz v6, :cond_4e

    iput-object v6, v1, Lio/sentry/x2;->u:Ljava/util/Date;

    :cond_4e
    iput-object v8, v1, Lio/sentry/x2;->s:Lio/sentry/protocol/t;

    iput-object v10, v1, Lio/sentry/x2;->v:Ljava/util/Date;

    iput-object v11, v1, Lio/sentry/x2;->w:Ljava/util/List;

    iput-object v13, v1, Lio/sentry/x2;->x:Ljava/util/List;

    iput-object v15, v1, Lio/sentry/x2;->y:Ljava/util/List;

    iput-object v7, v1, Lio/sentry/x2;->z:Ljava/util/HashMap;

    return-object v1

    :pswitch_30
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/e2;->valueOf(Ljava/lang/String;)Lio/sentry/e2;

    move-result-object v0

    return-object v0

    :pswitch_31
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_1e
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_51

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "items"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_50

    if-nez v1, :cond_4f

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :cond_4f
    invoke-virtual {v0, v2, v1, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    const/16 v13, 0xd

    goto :goto_1e

    :cond_50
    new-instance v3, Lio/sentry/e;

    const/16 v13, 0xd

    invoke-direct {v3, v13}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v3

    move-object v5, v3

    goto :goto_1e

    :cond_51
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v5, :cond_52

    new-instance v0, Lio/sentry/d2;

    const/4 v4, 0x0

    invoke-direct {v0, v4, v5}, Lio/sentry/d2;-><init>(ILjava/lang/Object;)V

    iput-object v1, v0, Lio/sentry/d2;->c:Ljava/util/AbstractMap;

    return-object v0

    :cond_52
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"items\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_32
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_1f
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v6, :cond_56

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_55

    const-string v6, "value"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_54

    if-nez v3, :cond_53

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    :cond_53
    invoke-virtual {v0, v2, v3, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1f

    :cond_54
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v1

    goto :goto_1f

    :cond_55
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    move-object v5, v4

    goto :goto_1f

    :cond_56
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v5, :cond_58

    new-instance v0, Lio/sentry/protocol/j;

    invoke-direct {v0}, Lio/sentry/protocol/j;-><init>()V

    iput-object v5, v0, Lio/sentry/protocol/j;->b:Ljava/lang/String;

    if-eqz v1, :cond_57

    const-string v2, "string"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_57

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/j;->c:Ljava/lang/Object;

    goto :goto_20

    :cond_57
    iput-object v1, v0, Lio/sentry/protocol/j;->c:Ljava/lang/Object;

    :goto_20
    iput-object v3, v0, Lio/sentry/protocol/j;->d:Ljava/util/AbstractMap;

    return-object v0

    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"type\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_33
    move v1, v4

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_21
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v11

    sget-object v13, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v11, v13, :cond_60

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v13

    sparse-switch v13, :sswitch_data_5

    :goto_22
    move/from16 v13, v20

    goto :goto_23

    :sswitch_26
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_59

    goto :goto_22

    :cond_59
    move/from16 v13, v17

    goto :goto_23

    :sswitch_27
    const-string v13, "attributes"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5a

    goto :goto_22

    :cond_5a
    const/4 v13, 0x4

    goto :goto_23

    :sswitch_28
    const-string v13, "level"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5b

    goto :goto_22

    :cond_5b
    const/4 v13, 0x3

    goto :goto_23

    :sswitch_29
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5c

    goto :goto_22

    :cond_5c
    const/4 v13, 0x2

    goto :goto_23

    :sswitch_2a
    const-string v13, "body"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5d

    goto :goto_22

    :cond_5d
    const/4 v13, 0x1

    goto :goto_23

    :sswitch_2b
    const-string v13, "severity_number"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5e

    goto :goto_22

    :cond_5e
    const/4 v13, 0x0

    :goto_23
    packed-switch v13, :pswitch_data_8

    if-nez v6, :cond_5f

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_5f
    invoke-virtual {v0, v2, v6, v11}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_21

    :pswitch_34
    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v11, 0x16

    invoke-direct {v5, v11}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v5}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/t;

    goto :goto_21

    :pswitch_35
    new-instance v8, Lio/sentry/e;

    invoke-direct {v8, v1}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v8}, Lio/sentry/A0;->x(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/HashMap;

    move-result-object v8

    goto :goto_21

    :pswitch_36
    new-instance v7, Lio/sentry/e;

    const/16 v13, 0x10

    invoke-direct {v7, v13}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v7}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/e2;

    goto/16 :goto_21

    :pswitch_37
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v3

    goto/16 :goto_21

    :pswitch_38
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_21

    :pswitch_39
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v9

    goto/16 :goto_21

    :cond_60
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v5, :cond_64

    if-eqz v3, :cond_63

    if-eqz v4, :cond_62

    if-eqz v7, :cond_61

    new-instance v0, Lio/sentry/c2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v5, v0, Lio/sentry/c2;->a:Lio/sentry/protocol/t;

    iput-object v3, v0, Lio/sentry/c2;->b:Ljava/lang/Double;

    iput-object v4, v0, Lio/sentry/c2;->c:Ljava/lang/String;

    iput-object v7, v0, Lio/sentry/c2;->d:Lio/sentry/e2;

    iput-object v8, v0, Lio/sentry/c2;->f:Ljava/util/Map;

    iput-object v9, v0, Lio/sentry/c2;->e:Ljava/lang/Integer;

    iput-object v6, v0, Lio/sentry/c2;->g:Ljava/util/HashMap;

    return-object v0

    :cond_61
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"level\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_62
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"body\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_63
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"timestamp\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_64
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"trace_id\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_3a
    new-instance v1, Lio/sentry/b2;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v5, 0x0

    :goto_24
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_6b

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_6

    :goto_25
    move/from16 v4, v20

    goto :goto_26

    :sswitch_2c
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_65

    goto :goto_25

    :cond_65
    const/4 v4, 0x4

    goto :goto_26

    :sswitch_2d
    const-string v4, "class_name"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_66

    goto :goto_25

    :cond_66
    const/4 v4, 0x3

    goto :goto_26

    :sswitch_2e
    const-string v4, "address"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_67

    goto :goto_25

    :cond_67
    const/4 v4, 0x2

    goto :goto_26

    :sswitch_2f
    const-string v4, "thread_id"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_68

    goto :goto_25

    :cond_68
    const/4 v4, 0x1

    goto :goto_26

    :sswitch_30
    const-string v4, "package_name"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_69

    goto :goto_25

    :cond_69
    const/4 v4, 0x0

    :goto_26
    packed-switch v4, :pswitch_data_9

    if-nez v5, :cond_6a

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_6a
    invoke-virtual {v0, v2, v5, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_24

    :pswitch_3b
    invoke-virtual {v0}, Lio/sentry/A0;->s()I

    move-result v3

    iput v3, v1, Lio/sentry/b2;->a:I

    goto :goto_24

    :pswitch_3c
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lio/sentry/b2;->d:Ljava/lang/String;

    goto :goto_24

    :pswitch_3d
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lio/sentry/b2;->b:Ljava/lang/String;

    goto :goto_24

    :pswitch_3e
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v1, Lio/sentry/b2;->e:Ljava/lang/Long;

    goto :goto_24

    :pswitch_3f
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lio/sentry/b2;->c:Ljava/lang/String;

    goto :goto_24

    :cond_6b
    iput-object v5, v1, Lio/sentry/b2;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :pswitch_40
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/a2;->valueOf(Ljava/lang/String;)Lio/sentry/a2;

    move-result-object v0

    return-object v0

    :pswitch_41
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/Z1;->valueOfLabel(Ljava/lang/String;)Lio/sentry/Z1;

    move-result-object v0

    return-object v0

    :pswitch_42
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/R1;

    invoke-direct {v1}, Lio/sentry/R1;-><init>()V

    const/4 v5, 0x0

    :cond_6c
    :goto_27
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_78

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_7

    :goto_28
    move/from16 v4, v20

    goto/16 :goto_29

    :sswitch_31
    const-string v4, "transaction"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6d

    goto :goto_28

    :cond_6d
    const/16 v4, 0x8

    goto/16 :goto_29

    :sswitch_32
    const-string v4, "exception"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6e

    goto :goto_28

    :cond_6e
    const/4 v4, 0x7

    goto :goto_29

    :sswitch_33
    const-string v4, "modules"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6f

    goto :goto_28

    :cond_6f
    move/from16 v4, v16

    goto :goto_29

    :sswitch_34
    const-string v4, "message"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_70

    goto :goto_28

    :cond_70
    move/from16 v4, v17

    goto :goto_29

    :sswitch_35
    const-string v4, "level"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_71

    goto :goto_28

    :cond_71
    const/4 v4, 0x4

    goto :goto_29

    :sswitch_36
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_72

    goto :goto_28

    :cond_72
    const/4 v4, 0x3

    goto :goto_29

    :sswitch_37
    const-string v4, "logger"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_73

    goto :goto_28

    :cond_73
    const/4 v4, 0x2

    goto :goto_29

    :sswitch_38
    const-string v4, "threads"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_74

    goto :goto_28

    :cond_74
    const/4 v4, 0x1

    goto :goto_29

    :sswitch_39
    const-string v4, "fingerprint"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_75

    goto :goto_28

    :cond_75
    const/4 v4, 0x0

    :goto_29
    packed-switch v4, :pswitch_data_a

    invoke-static {v1, v3, v0, v2}, Lio/sentry/config/a;->g(Lio/sentry/C1;Ljava/lang/String;Lio/sentry/A0;Lio/sentry/ILogger;)Z

    move-result v4

    if-nez v4, :cond_77

    if-nez v5, :cond_76

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_76
    invoke-virtual {v0, v2, v5, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    :cond_77
    :goto_2a
    const/16 v4, 0x10

    goto/16 :goto_27

    :pswitch_43
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lio/sentry/R1;->v:Ljava/lang/String;

    goto :goto_2a

    :pswitch_44
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    new-instance v3, Lio/sentry/z0;

    new-instance v4, Lio/sentry/clientreport/a;

    const/16 v6, 0x15

    invoke-direct {v4, v6}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v4}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-direct {v3, v4}, Lio/sentry/z0;-><init>(Ljava/util/List;)V

    iput-object v3, v1, Lio/sentry/R1;->t:Lio/sentry/z0;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    goto :goto_2a

    :pswitch_45
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-static {v3}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iput-object v3, v1, Lio/sentry/R1;->y:Ljava/util/AbstractMap;

    goto :goto_2a

    :pswitch_46
    new-instance v3, Lio/sentry/clientreport/a;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/l;

    iput-object v3, v1, Lio/sentry/R1;->q:Lio/sentry/protocol/l;

    goto/16 :goto_27

    :pswitch_47
    const/16 v4, 0x10

    new-instance v3, Lio/sentry/e;

    const/16 v6, 0xb

    invoke-direct {v3, v6}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/a2;

    iput-object v3, v1, Lio/sentry/R1;->u:Lio/sentry/a2;

    goto/16 :goto_27

    :pswitch_48
    const/16 v4, 0x10

    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_6c

    iput-object v3, v1, Lio/sentry/R1;->p:Ljava/util/Date;

    goto/16 :goto_27

    :pswitch_49
    const/16 v4, 0x10

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lio/sentry/R1;->r:Ljava/lang/String;

    goto/16 :goto_27

    :pswitch_4a
    const/16 v4, 0x10

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    new-instance v3, Lio/sentry/z0;

    new-instance v6, Lio/sentry/clientreport/a;

    const/16 v7, 0x1c

    invoke-direct {v6, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v6}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-direct {v3, v6}, Lio/sentry/z0;-><init>(Ljava/util/List;)V

    iput-object v3, v1, Lio/sentry/R1;->s:Lio/sentry/z0;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    goto/16 :goto_27

    :pswitch_4b
    const/16 v4, 0x10

    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_6c

    iput-object v3, v1, Lio/sentry/R1;->w:Ljava/util/List;

    goto/16 :goto_27

    :cond_78
    iput-object v5, v1, Lio/sentry/R1;->x:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :pswitch_4c
    move v3, v11

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v5, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    :goto_2b
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v4, :cond_81

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_8

    :goto_2c
    move/from16 v4, v20

    goto :goto_2d

    :sswitch_3a
    const-string v4, "platform"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_79

    goto :goto_2c

    :cond_79
    move/from16 v4, v16

    goto :goto_2d

    :sswitch_3b
    const-string v4, "content_type"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7a

    goto :goto_2c

    :cond_7a
    move/from16 v4, v17

    goto :goto_2d

    :sswitch_3c
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7b

    goto :goto_2c

    :cond_7b
    const/4 v4, 0x4

    goto :goto_2d

    :sswitch_3d
    const-string v4, "attachment_type"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7c

    goto :goto_2c

    :cond_7c
    const/4 v4, 0x3

    goto :goto_2d

    :sswitch_3e
    const-string v4, "filename"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7d

    goto :goto_2c

    :cond_7d
    const/4 v4, 0x2

    goto :goto_2d

    :sswitch_3f
    const-string v4, "length"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7e

    goto :goto_2c

    :cond_7e
    const/4 v4, 0x1

    goto :goto_2d

    :sswitch_40
    const-string v4, "item_count"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7f

    goto :goto_2c

    :cond_7f
    const/4 v4, 0x0

    :goto_2d
    packed-switch v4, :pswitch_data_b

    if-nez v5, :cond_80

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_80
    invoke-virtual {v0, v2, v5, v1}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_2b

    :pswitch_4d
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v33, v1

    goto :goto_2b

    :pswitch_4e
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v30, v1

    goto/16 :goto_2b

    :pswitch_4f
    new-instance v1, Lio/sentry/e;

    invoke-direct {v1, v3}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v1}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/Z1;

    move-object/from16 v28, v1

    goto/16 :goto_2b

    :pswitch_50
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v32, v1

    goto/16 :goto_2b

    :pswitch_51
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v31, v1

    goto/16 :goto_2b

    :pswitch_52
    invoke-virtual {v0}, Lio/sentry/A0;->s()I

    move-result v1

    move/from16 v29, v1

    goto/16 :goto_2b

    :pswitch_53
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v34, v1

    goto/16 :goto_2b

    :cond_81
    if-eqz v28, :cond_82

    new-instance v27, Lio/sentry/Q1;

    invoke-direct/range {v27 .. v34}, Lio/sentry/Q1;-><init>(Lio/sentry/Z1;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    move-object/from16 v1, v27

    iput-object v5, v1, Lio/sentry/Q1;->i:Ljava/util/HashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :cond_82
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"type\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_54
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_2e
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v8, :cond_88

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_9

    :goto_2f
    move/from16 v8, v20

    goto :goto_30

    :sswitch_41
    const-string v8, "sent_at"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_83

    goto :goto_2f

    :cond_83
    const/4 v8, 0x3

    goto :goto_30

    :sswitch_42
    const-string v8, "event_id"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_84

    goto :goto_2f

    :cond_84
    const/4 v8, 0x2

    goto :goto_30

    :sswitch_43
    const-string v8, "trace"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_85

    goto :goto_2f

    :cond_85
    const/4 v8, 0x1

    goto :goto_30

    :sswitch_44
    const-string v8, "sdk"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_86

    goto :goto_2f

    :cond_86
    const/4 v8, 0x0

    :goto_30
    packed-switch v8, :pswitch_data_c

    if-nez v6, :cond_87

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_87
    invoke-virtual {v0, v2, v6, v7}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_2e

    :pswitch_55
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v4

    goto :goto_2e

    :pswitch_56
    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v8, 0x16

    invoke-direct {v5, v8}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v5}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/t;

    goto :goto_2e

    :pswitch_57
    new-instance v3, Lio/sentry/e;

    const/16 v7, 0x17

    invoke-direct {v3, v7}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/N2;

    goto :goto_2e

    :pswitch_58
    new-instance v1, Lio/sentry/clientreport/a;

    const/16 v7, 0x14

    invoke-direct {v1, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v1}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/protocol/r;

    goto/16 :goto_2e

    :cond_88
    new-instance v2, Lio/sentry/J1;

    invoke-direct {v2, v5, v1, v3}, Lio/sentry/J1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/r;Lio/sentry/N2;)V

    iput-object v4, v2, Lio/sentry/J1;->d:Ljava/util/Date;

    iput-object v6, v2, Lio/sentry/J1;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v2

    :pswitch_59
    move v3, v11

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/A1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    iput-boolean v4, v1, Lio/sentry/A1;->c:Z

    const/4 v5, 0x0

    iput-object v5, v1, Lio/sentry/A1;->d:Ljava/lang/Double;

    iput-boolean v4, v1, Lio/sentry/A1;->a:Z

    iput-object v5, v1, Lio/sentry/A1;->b:Ljava/lang/Double;

    iput-boolean v4, v1, Lio/sentry/A1;->i:Z

    iput-object v5, v1, Lio/sentry/A1;->e:Ljava/lang/String;

    iput-boolean v4, v1, Lio/sentry/A1;->f:Z

    iput-boolean v4, v1, Lio/sentry/A1;->g:Z

    sget-object v5, Lio/sentry/g1;->MANUAL:Lio/sentry/g1;

    iput-object v5, v1, Lio/sentry/A1;->l:Lio/sentry/g1;

    iput v4, v1, Lio/sentry/A1;->h:I

    const/4 v13, 0x1

    iput-boolean v13, v1, Lio/sentry/A1;->j:Z

    iput-boolean v4, v1, Lio/sentry/A1;->k:Z

    const/4 v5, 0x0

    :cond_89
    :goto_31
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v6, :cond_97

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_a

    :goto_32
    move/from16 v6, v20

    goto/16 :goto_33

    :sswitch_45
    const-string v6, "profile_sample_rate"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8a

    goto :goto_32

    :cond_8a
    const/16 v6, 0xb

    goto/16 :goto_33

    :sswitch_46
    const-string v6, "trace_sample_rate"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8b

    goto :goto_32

    :cond_8b
    move v6, v3

    goto/16 :goto_33

    :sswitch_47
    const-string v6, "profiling_traces_hz"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8c

    goto :goto_32

    :cond_8c
    move/from16 v6, v22

    goto/16 :goto_33

    :sswitch_48
    const-string v6, "continuous_profile_sampled"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8d

    goto :goto_32

    :cond_8d
    const/16 v6, 0x8

    goto/16 :goto_33

    :sswitch_49
    const-string v6, "profile_lifecycle"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8e

    goto :goto_32

    :cond_8e
    const/4 v6, 0x7

    goto :goto_33

    :sswitch_4a
    const-string v6, "profile_sampled"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8f

    goto :goto_32

    :cond_8f
    move/from16 v6, v16

    goto :goto_33

    :sswitch_4b
    const-string v6, "is_start_profiler_on_app_start"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_90

    goto :goto_32

    :cond_90
    move/from16 v6, v17

    goto :goto_33

    :sswitch_4c
    const-string v6, "is_profiling_enabled"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_91

    goto :goto_32

    :cond_91
    const/4 v6, 0x4

    goto :goto_33

    :sswitch_4d
    const-string v6, "is_continuous_profiling_enabled"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_92

    goto :goto_32

    :cond_92
    const/4 v6, 0x3

    goto :goto_33

    :sswitch_4e
    const-string v6, "profiling_traces_dir_path"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_93

    goto :goto_32

    :cond_93
    const/4 v6, 0x2

    goto :goto_33

    :sswitch_4f
    const-string v6, "trace_sampled"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_94

    goto/16 :goto_32

    :cond_94
    const/4 v6, 0x1

    goto :goto_33

    :sswitch_50
    const-string v6, "is_enable_app_start_profiling"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_95

    goto/16 :goto_32

    :cond_95
    const/4 v6, 0x0

    :goto_33
    packed-switch v6, :pswitch_data_d

    if-nez v5, :cond_96

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_96
    invoke-virtual {v0, v2, v5, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_31

    :pswitch_5a
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_89

    iput-object v4, v1, Lio/sentry/A1;->b:Ljava/lang/Double;

    goto/16 :goto_31

    :pswitch_5b
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_89

    iput-object v4, v1, Lio/sentry/A1;->d:Ljava/lang/Double;

    goto/16 :goto_31

    :pswitch_5c
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_89

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iput v4, v1, Lio/sentry/A1;->h:I

    goto/16 :goto_31

    :pswitch_5d
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_89

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iput-boolean v4, v1, Lio/sentry/A1;->i:Z

    goto/16 :goto_31

    :pswitch_5e
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_89

    :try_start_0
    invoke-static {v4}, Lio/sentry/g1;->valueOf(Ljava/lang/String;)Lio/sentry/g1;

    move-result-object v6

    iput-object v6, v1, Lio/sentry/A1;->l:Lio/sentry/g1;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_31

    :catch_0
    sget-object v6, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v7, "Error when deserializing ProfileLifecycle: "

    invoke-virtual {v7, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    new-array v8, v7, [Ljava/lang/Object;

    invoke-interface {v2, v6, v4, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_31

    :pswitch_5f
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_89

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iput-boolean v4, v1, Lio/sentry/A1;->a:Z

    goto/16 :goto_31

    :pswitch_60
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_89

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iput-boolean v4, v1, Lio/sentry/A1;->k:Z

    goto/16 :goto_31

    :pswitch_61
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_89

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iput-boolean v4, v1, Lio/sentry/A1;->f:Z

    goto/16 :goto_31

    :pswitch_62
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_89

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iput-boolean v4, v1, Lio/sentry/A1;->g:Z

    goto/16 :goto_31

    :pswitch_63
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_89

    iput-object v4, v1, Lio/sentry/A1;->e:Ljava/lang/String;

    goto/16 :goto_31

    :pswitch_64
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_89

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iput-boolean v4, v1, Lio/sentry/A1;->c:Z

    goto/16 :goto_31

    :pswitch_65
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_89

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iput-boolean v4, v1, Lio/sentry/A1;->j:Z

    goto/16 :goto_31

    :cond_97
    iput-object v5, v1, Lio/sentry/A1;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :pswitch_66
    new-instance v1, Lio/sentry/m1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_34
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v6, :cond_9a

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "segment_id"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_99

    if-nez v5, :cond_98

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_98
    invoke-virtual {v0, v2, v5, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_34

    :cond_99
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v3

    goto :goto_34

    :cond_9a
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    const/4 v13, 0x1

    invoke-virtual {v0, v13}, Lio/sentry/A0;->G(Z)V

    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lio/sentry/A0;->G(Z)V

    if-eqz v4, :cond_a8

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_35
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/util/Map;

    if-eqz v8, :cond_a7

    check-cast v7, Ljava/util/Map;

    new-instance v8, Lio/sentry/A0;

    invoke-direct {v8, v7}, Lio/sentry/A0;-><init>(Ljava/util/Map;)V

    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_36
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a6

    invoke-static {}, Lio/sentry/rrweb/c;->values()[Lio/sentry/rrweb/c;

    move-result-object v12

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    aget-object v11, v12, v11

    sget-object v12, Lio/sentry/l1;->b:[I

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v12, v12, v13

    const-string v13, "data"

    const/4 v14, 0x1

    if-eq v12, v14, :cond_a2

    const/4 v14, 0x2

    if-eq v12, v14, :cond_a1

    const-string v14, "Unsupported rrweb event type %s"

    const/4 v15, 0x3

    if-eq v12, v15, :cond_9c

    sget-object v12, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v2, v12, v14, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_9b
    :goto_37
    const/4 v14, 0x1

    goto :goto_36

    :cond_9c
    invoke-interface {v7, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map;

    if-nez v12, :cond_9d

    sget-object v12, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    :cond_9d
    const-string v13, "tag"

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_9b

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v13

    sparse-switch v13, :sswitch_data_b

    :goto_38
    move/from16 v23, v20

    goto :goto_39

    :sswitch_51
    const-string v13, "breadcrumb"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9e

    goto :goto_38

    :cond_9e
    const/16 v23, 0x2

    goto :goto_39

    :sswitch_52
    const-string v13, "video"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9f

    goto :goto_38

    :cond_9f
    const/16 v23, 0x1

    goto :goto_39

    :sswitch_53
    const-string v13, "performanceSpan"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a0

    goto :goto_38

    :cond_a0
    move/from16 v23, v6

    :goto_39
    packed-switch v23, :pswitch_data_e

    sget-object v12, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v2, v12, v14, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_37

    :pswitch_67
    invoke-static {v8, v2}, Lio/sentry/protocol/D;->b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/a;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_37

    :pswitch_68
    invoke-static {v8, v2}, Lio/sentry/protocol/D;->g(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/m;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_37

    :pswitch_69
    invoke-static {v8, v2}, Lio/sentry/protocol/D;->f(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/l;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_37

    :cond_a1
    const/4 v15, 0x3

    invoke-static {v8, v2}, Lio/sentry/protocol/D;->e(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/j;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_37

    :cond_a2
    const/4 v15, 0x3

    invoke-interface {v7, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    if-nez v11, :cond_a3

    sget-object v11, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    :cond_a3
    const-string v12, "source"

    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_9b

    invoke-static {}, Lio/sentry/rrweb/d;->values()[Lio/sentry/rrweb/d;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    aget-object v11, v12, v11

    sget-object v12, Lio/sentry/l1;->a:[I

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v12, v12, v13

    const/4 v14, 0x1

    if-eq v12, v14, :cond_a5

    const/4 v13, 0x2

    if-eq v12, v13, :cond_a4

    sget-object v12, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v13, "Unsupported rrweb incremental snapshot type %s"

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v2, v12, v13, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_36

    :cond_a4
    invoke-static {v8, v2}, Lio/sentry/protocol/D;->d(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/i;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_36

    :cond_a5
    invoke-static {v8, v2}, Lio/sentry/protocol/D;->c(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/g;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_36

    :cond_a6
    const/4 v14, 0x1

    const/4 v15, 0x3

    goto/16 :goto_36

    :cond_a7
    const/4 v14, 0x1

    const/4 v15, 0x3

    goto/16 :goto_35

    :cond_a8
    const/4 v0, 0x0

    :cond_a9
    iput-object v3, v1, Lio/sentry/m1;->a:Ljava/lang/Integer;

    iput-object v0, v1, Lio/sentry/m1;->b:Ljava/util/List;

    iput-object v5, v1, Lio/sentry/m1;->c:Ljava/util/HashMap;

    return-object v1

    :pswitch_6a
    move v14, v15

    move v15, v6

    move v6, v14

    const/4 v14, 0x1

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/i1;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    sget-object v4, Lio/sentry/W0;->a:Lio/sentry/W0;

    invoke-direct {v1, v4, v3, v3}, Lio/sentry/i1;-><init>(Lio/sentry/i0;Ljava/lang/Long;Ljava/lang/Long;)V

    const/4 v5, 0x0

    :cond_aa
    :goto_3a
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_b3

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_c

    :goto_3b
    move/from16 v23, v20

    goto :goto_3c

    :sswitch_54
    const-string v4, "relative_cpu_start_ms"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_ab

    goto :goto_3b

    :cond_ab
    move/from16 v23, v16

    goto :goto_3c

    :sswitch_55
    const-string v4, "relative_cpu_end_ms"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_ac

    goto :goto_3b

    :cond_ac
    move/from16 v23, v17

    goto :goto_3c

    :sswitch_56
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_ad

    goto :goto_3b

    :cond_ad
    const/16 v23, 0x4

    goto :goto_3c

    :sswitch_57
    const-string v4, "name"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_ae

    goto :goto_3b

    :cond_ae
    move/from16 v23, v15

    goto :goto_3c

    :sswitch_58
    const-string v4, "id"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_af

    goto :goto_3b

    :cond_af
    const/16 v23, 0x2

    goto :goto_3c

    :sswitch_59
    const-string v4, "relative_end_ns"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b0

    goto :goto_3b

    :cond_b0
    move/from16 v23, v14

    goto :goto_3c

    :sswitch_5a
    const-string v4, "relative_start_ns"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b1

    goto :goto_3b

    :cond_b1
    move/from16 v23, v6

    :goto_3c
    packed-switch v23, :pswitch_data_f

    if-nez v5, :cond_b2

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_b2
    invoke-virtual {v0, v2, v5, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_3a

    :pswitch_6b
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_aa

    iput-object v3, v1, Lio/sentry/i1;->f:Ljava/lang/Long;

    goto/16 :goto_3a

    :pswitch_6c
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_aa

    iput-object v3, v1, Lio/sentry/i1;->g:Ljava/lang/Long;

    goto/16 :goto_3a

    :pswitch_6d
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_aa

    iput-object v3, v1, Lio/sentry/i1;->b:Ljava/lang/String;

    goto/16 :goto_3a

    :pswitch_6e
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_aa

    iput-object v3, v1, Lio/sentry/i1;->c:Ljava/lang/String;

    goto/16 :goto_3a

    :pswitch_6f
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_aa

    iput-object v3, v1, Lio/sentry/i1;->a:Ljava/lang/String;

    goto/16 :goto_3a

    :pswitch_70
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_aa

    iput-object v3, v1, Lio/sentry/i1;->e:Ljava/lang/Long;

    goto/16 :goto_3a

    :pswitch_71
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_aa

    iput-object v3, v1, Lio/sentry/i1;->d:Ljava/lang/Long;

    goto/16 :goto_3a

    :cond_b3
    iput-object v5, v1, Lio/sentry/i1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :pswitch_72
    move v1, v15

    move v15, v6

    move v6, v1

    move v1, v4

    move v3, v11

    const/16 v4, 0x10

    const/16 v13, 0xd

    const/4 v14, 0x1

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v25, Lio/sentry/h1;

    new-instance v5, Ljava/io/File;

    const-string v7, "dummy"

    invoke-direct {v5, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v27

    new-instance v28, Ljava/util/ArrayList;

    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    sget-object v7, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {v7}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v30

    new-instance v9, Lio/sentry/H2;

    sget-object v11, Lio/sentry/K2;->b:Lio/sentry/K2;

    const-string v1, "op"

    const/4 v3, 0x0

    invoke-direct {v9, v7, v11, v1, v3}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Ljava/lang/String;Lio/sentry/K2;)V

    iget-object v1, v9, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    invoke-virtual {v1}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v31

    new-instance v1, Lio/sentry/I;

    const/4 v7, 0x2

    invoke-direct {v1, v7}, Lio/sentry/I;-><init>(I)V

    new-instance v45, Ljava/util/HashMap;

    invoke-direct/range {v45 .. v45}, Ljava/util/HashMap;-><init>()V

    const-string v29, ""

    const-string v32, "0"

    const/16 v33, 0x0

    const-string v34, ""

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-string v44, "normal"

    move-object/from16 v35, v1

    move-object/from16 v26, v5

    invoke-direct/range {v25 .. v45}, Lio/sentry/h1;-><init>(Ljava/io/File;Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    move-object/from16 v1, v25

    move-object v5, v3

    :cond_b4
    :goto_3d
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v7, :cond_d0

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_d

    :goto_3e
    move/from16 v7, v20

    goto/16 :goto_3f

    :sswitch_5b
    const-string v7, "transactions"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b5

    goto :goto_3e

    :cond_b5
    const/16 v7, 0x19

    goto/16 :goto_3f

    :sswitch_5c
    const-string v7, "sampled_profile"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b6

    goto :goto_3e

    :cond_b6
    const/16 v7, 0x18

    goto/16 :goto_3f

    :sswitch_5d
    const-string v7, "platform"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b7

    goto :goto_3e

    :cond_b7
    const/16 v7, 0x17

    goto/16 :goto_3f

    :sswitch_5e
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b8

    goto :goto_3e

    :cond_b8
    const/16 v7, 0x16

    goto/16 :goto_3f

    :sswitch_5f
    const-string v7, "truncation_reason"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b9

    goto :goto_3e

    :cond_b9
    const/16 v7, 0x15

    goto/16 :goto_3f

    :sswitch_60
    const-string v7, "device_os_version"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_ba

    goto :goto_3e

    :cond_ba
    const/16 v7, 0x14

    goto/16 :goto_3f

    :sswitch_61
    const-string v7, "transaction_id"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_bb

    goto :goto_3e

    :cond_bb
    const/16 v7, 0x13

    goto/16 :goto_3f

    :sswitch_62
    const-string v7, "architecture"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_bc

    goto :goto_3e

    :cond_bc
    const/16 v7, 0x12

    goto/16 :goto_3f

    :sswitch_63
    const-string v7, "device_os_name"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_bd

    goto :goto_3e

    :cond_bd
    const/16 v7, 0x11

    goto/16 :goto_3f

    :sswitch_64
    const-string v7, "transaction_name"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_be

    goto :goto_3e

    :cond_be
    move v7, v4

    goto/16 :goto_3f

    :sswitch_65
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_bf

    goto/16 :goto_3e

    :cond_bf
    const/16 v7, 0xf

    goto/16 :goto_3f

    :sswitch_66
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c0

    goto/16 :goto_3e

    :cond_c0
    const/16 v7, 0xe

    goto/16 :goto_3f

    :sswitch_67
    const-string v7, "version_name"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c1

    goto/16 :goto_3e

    :cond_c1
    move v7, v13

    goto/16 :goto_3f

    :sswitch_68
    const-string v7, "version_code"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c2

    goto/16 :goto_3e

    :cond_c2
    const/16 v7, 0xc

    goto/16 :goto_3f

    :sswitch_69
    const-string v7, "device_cpu_frequencies"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c3

    goto/16 :goto_3e

    :cond_c3
    const/16 v7, 0xb

    goto/16 :goto_3f

    :sswitch_6a
    const-string v7, "device_physical_memory_bytes"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c4

    goto/16 :goto_3e

    :cond_c4
    const/16 v7, 0xa

    goto/16 :goto_3f

    :sswitch_6b
    const-string v7, "measurements"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c5

    goto/16 :goto_3e

    :cond_c5
    move/from16 v7, v22

    goto/16 :goto_3f

    :sswitch_6c
    const-string v7, "duration_ns"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c6

    goto/16 :goto_3e

    :cond_c6
    const/16 v7, 0x8

    goto/16 :goto_3f

    :sswitch_6d
    const-string v7, "device_is_emulator"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c7

    goto/16 :goto_3e

    :cond_c7
    const/4 v7, 0x7

    goto :goto_3f

    :sswitch_6e
    const-string v7, "device_model"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c8

    goto/16 :goto_3e

    :cond_c8
    move/from16 v7, v16

    goto :goto_3f

    :sswitch_6f
    const-string v7, "device_os_build_number"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c9

    goto/16 :goto_3e

    :cond_c9
    move/from16 v7, v17

    goto :goto_3f

    :sswitch_70
    const-string v7, "profile_id"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_ca

    goto/16 :goto_3e

    :cond_ca
    const/4 v7, 0x4

    goto :goto_3f

    :sswitch_71
    const-string v7, "device_locale"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_cb

    goto/16 :goto_3e

    :cond_cb
    move v7, v15

    goto :goto_3f

    :sswitch_72
    const-string v7, "build_id"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_cc

    goto/16 :goto_3e

    :cond_cc
    const/4 v7, 0x2

    goto :goto_3f

    :sswitch_73
    const-string v7, "android_api_level"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_cd

    goto/16 :goto_3e

    :cond_cd
    move v7, v14

    goto :goto_3f

    :sswitch_74
    const-string v7, "device_manufacturer"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_ce

    goto/16 :goto_3e

    :cond_ce
    move v7, v6

    :goto_3f
    packed-switch v7, :pswitch_data_10

    if-nez v5, :cond_cf

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_cf
    invoke-virtual {v0, v2, v5, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    const/4 v9, 0x4

    goto/16 :goto_3d

    :pswitch_73
    new-instance v3, Lio/sentry/e;

    const/4 v9, 0x4

    invoke-direct {v3, v9}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_b4

    iget-object v7, v1, Lio/sentry/h1;->p:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_3d

    :pswitch_74
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->B:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_75
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->n:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_76
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->v:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_77
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->y:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_78
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->i:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_79
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->u:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_7a
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->k:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_7b
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->h:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_7c
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->q:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_7d
    const/4 v9, 0x4

    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->z:Ljava/util/Date;

    goto/16 :goto_3d

    :pswitch_7e
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->x:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_7f
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->t:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_80
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->s:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_81
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->l:Ljava/util/List;

    goto/16 :goto_3d

    :pswitch_82
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->m:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_83
    const/4 v9, 0x4

    new-instance v3, Lio/sentry/clientreport/a;

    const/4 v7, 0x2

    invoke-direct {v3, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->x(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/HashMap;

    move-result-object v3

    if-eqz v3, :cond_b4

    iget-object v7, v1, Lio/sentry/h1;->A:Ljava/util/Map;

    invoke-interface {v7, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto/16 :goto_3d

    :pswitch_84
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->r:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_85
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_b4

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iput-boolean v3, v1, Lio/sentry/h1;->j:Z

    goto/16 :goto_3d

    :pswitch_86
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->f:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_87
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->g:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_88
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->w:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_89
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->d:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_8a
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->o:Ljava/lang/String;

    goto/16 :goto_3d

    :pswitch_8b
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_b4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v1, Lio/sentry/h1;->c:I

    goto/16 :goto_3d

    :pswitch_8c
    const/4 v9, 0x4

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b4

    iput-object v3, v1, Lio/sentry/h1;->e:Ljava/lang/String;

    goto/16 :goto_3d

    :cond_d0
    iput-object v5, v1, Lio/sentry/h1;->C:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :pswitch_8d
    const/4 v3, 0x0

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/f1;

    sget-object v4, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-direct {v1, v4}, Lio/sentry/f1;-><init>(Lio/sentry/protocol/t;)V

    move-object v5, v3

    :cond_d1
    :goto_40
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_d4

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "profiler_id"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d3

    if-nez v5, :cond_d2

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_d2
    invoke-virtual {v0, v2, v5, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_40

    :cond_d3
    new-instance v3, Lio/sentry/clientreport/a;

    const/16 v8, 0x16

    invoke-direct {v3, v8}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/t;

    if-eqz v3, :cond_d1

    iput-object v3, v1, Lio/sentry/f1;->a:Lio/sentry/protocol/t;

    goto :goto_40

    :cond_d4
    iput-object v5, v1, Lio/sentry/f1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :pswitch_8e
    move v3, v15

    move v15, v6

    move v6, v3

    move v9, v14

    const/4 v3, 0x0

    const/4 v14, 0x1

    const/16 v22, 0x9

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v24, Lio/sentry/e1;

    sget-object v25, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    new-instance v1, Ljava/io/File;

    const-string v4, "dummy"

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v28, Ljava/util/HashMap;

    invoke-direct/range {v28 .. v28}, Ljava/util/HashMap;-><init>()V

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v29

    invoke-static {}, Lio/sentry/v2;->empty()Lio/sentry/v2;

    move-result-object v30

    move-object/from16 v26, v25

    move-object/from16 v27, v1

    invoke-direct/range {v24 .. v30}, Lio/sentry/e1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/t;Ljava/io/File;Ljava/util/Map;Ljava/lang/Double;Lio/sentry/v2;)V

    move-object/from16 v1, v24

    move-object v5, v3

    :cond_d5
    :goto_41
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_e5

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_e

    :goto_42
    move/from16 v23, v20

    goto/16 :goto_43

    :sswitch_75
    const-string v4, "chunk_id"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d6

    goto :goto_42

    :cond_d6
    const/16 v23, 0xa

    goto/16 :goto_43

    :sswitch_76
    const-string v4, "sampled_profile"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d7

    goto :goto_42

    :cond_d7
    move/from16 v23, v22

    goto/16 :goto_43

    :sswitch_77
    const-string v4, "platform"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d8

    goto :goto_42

    :cond_d8
    const/16 v23, 0x8

    goto/16 :goto_43

    :sswitch_78
    const-string v4, "client_sdk"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d9

    goto :goto_42

    :cond_d9
    const/16 v23, 0x7

    goto :goto_43

    :sswitch_79
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_da

    goto :goto_42

    :cond_da
    move/from16 v23, v16

    goto :goto_43

    :sswitch_7a
    const-string v4, "version"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_db

    goto :goto_42

    :cond_db
    move/from16 v23, v17

    goto :goto_43

    :sswitch_7b
    const-string v4, "profiler_id"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_dc

    goto :goto_42

    :cond_dc
    move/from16 v23, v9

    goto :goto_43

    :sswitch_7c
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_dd

    goto :goto_42

    :cond_dd
    move/from16 v23, v15

    goto :goto_43

    :sswitch_7d
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_de

    goto :goto_42

    :cond_de
    const/16 v23, 0x2

    goto :goto_43

    :sswitch_7e
    const-string v4, "measurements"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_df

    goto :goto_42

    :cond_df
    move/from16 v23, v14

    goto :goto_43

    :sswitch_7f
    const-string v4, "debug_meta"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e0

    goto/16 :goto_42

    :cond_e0
    move/from16 v23, v6

    :goto_43
    packed-switch v23, :pswitch_data_11

    if-nez v5, :cond_e1

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_e1
    invoke-virtual {v0, v2, v5, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_44

    :pswitch_8f
    new-instance v3, Lio/sentry/clientreport/a;

    const/16 v11, 0x16

    invoke-direct {v3, v11}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/t;

    if-eqz v3, :cond_e2

    iput-object v3, v1, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    :cond_e2
    :goto_44
    const/16 v4, 0x8

    const/16 v11, 0x16

    :goto_45
    const/4 v13, 0x2

    goto/16 :goto_41

    :pswitch_90
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e2

    iput-object v3, v1, Lio/sentry/e1;->l:Ljava/lang/String;

    goto :goto_44

    :pswitch_91
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e2

    iput-object v3, v1, Lio/sentry/e1;->f:Ljava/lang/String;

    goto :goto_44

    :pswitch_92
    new-instance v3, Lio/sentry/clientreport/a;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/r;

    if-eqz v3, :cond_e2

    iput-object v3, v1, Lio/sentry/e1;->d:Lio/sentry/protocol/r;

    goto :goto_44

    :pswitch_93
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e2

    iput-object v3, v1, Lio/sentry/e1;->g:Ljava/lang/String;

    goto :goto_44

    :pswitch_94
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e2

    iput-object v3, v1, Lio/sentry/e1;->i:Ljava/lang/String;

    goto :goto_44

    :pswitch_95
    new-instance v3, Lio/sentry/clientreport/a;

    const/16 v11, 0x16

    invoke-direct {v3, v11}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/t;

    if-eqz v3, :cond_e3

    iput-object v3, v1, Lio/sentry/e1;->b:Lio/sentry/protocol/t;

    :cond_e3
    :goto_46
    const/16 v4, 0x8

    goto :goto_45

    :pswitch_96
    const/16 v11, 0x16

    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_e3

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    iput-wide v3, v1, Lio/sentry/e1;->j:D

    goto :goto_46

    :pswitch_97
    const/16 v11, 0x16

    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e3

    iput-object v3, v1, Lio/sentry/e1;->h:Ljava/lang/String;

    goto :goto_46

    :pswitch_98
    const/16 v11, 0x16

    new-instance v3, Lio/sentry/clientreport/a;

    const/4 v13, 0x2

    invoke-direct {v3, v13}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->x(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/HashMap;

    move-result-object v3

    if-eqz v3, :cond_e4

    iget-object v4, v1, Lio/sentry/e1;->e:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_e4
    const/16 v4, 0x8

    goto/16 :goto_41

    :pswitch_99
    const/16 v11, 0x16

    const/4 v13, 0x2

    new-instance v3, Lio/sentry/clientreport/a;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/d;

    if-eqz v3, :cond_d5

    iput-object v3, v1, Lio/sentry/e1;->a:Lio/sentry/protocol/d;

    goto/16 :goto_41

    :cond_e5
    iput-object v5, v1, Lio/sentry/e1;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v1

    :pswitch_9a
    invoke-direct/range {p0 .. p2}, Lio/sentry/e;->c(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9a
        :pswitch_8e
        :pswitch_8d
        :pswitch_72
        :pswitch_6a
        :pswitch_66
        :pswitch_59
        :pswitch_54
        :pswitch_4c
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3a
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_26
        :pswitch_25
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_4
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x23e8220c -> :sswitch_3
        0x337a8b -> :sswitch_2
        0x5c24b9c -> :sswitch_1
        0x1093c0e0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x1b1b338d -> :sswitch_d
        -0x8c511f1 -> :sswitch_c
        -0x51ecded -> :sswitch_b
        0x921899a -> :sswitch_a
        0x9218a55 -> :sswitch_9
        0x41012807 -> :sswitch_8
        0x4bb73e55 -> :sswitch_7
        0x6f273ffa -> :sswitch_6
        0x71892389 -> :sswitch_5
        0x7fa0d2de -> :sswitch_4
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x76bbb26c -> :sswitch_18
        -0x7114bf7f -> :sswitch_17
        -0x4d2a9095 -> :sswitch_16
        -0x3532300e -> :sswitch_15
        0x1847f -> :sswitch_14
        0x1bc5f -> :sswitch_13
        0x1bcce -> :sswitch_12
        0x316510 -> :sswitch_11
        0x3492916 -> :sswitch_10
        0x58d64a2 -> :sswitch_f
        0xcbd1022 -> :sswitch_e
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_14
        :pswitch_13
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x51ecded -> :sswitch_1c
        0x41012807 -> :sswitch_1b
        0x583738dc -> :sswitch_1a
        0x724f4d91 -> :sswitch_19
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_15
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x5b
        :pswitch_17
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        -0x1b1b338d -> :sswitch_25
        -0xfbcbadf -> :sswitch_24
        0x368f3a -> :sswitch_23
        0x36e8e4 -> :sswitch_22
        0x3492916 -> :sswitch_21
        0x13a95401 -> :sswitch_20
        0x2b308cbe -> :sswitch_1f
        0x3ee8d892 -> :sswitch_1e
        0x403ba1a7 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        -0x60432135 -> :sswitch_2b
        0x2e39a2 -> :sswitch_2a
        0x3492916 -> :sswitch_29
        0x6219b84 -> :sswitch_28
        0x182da957 -> :sswitch_27
        0x4bb73e55 -> :sswitch_26
    .end sparse-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch

    :sswitch_data_6
    .sparse-switch
        -0x6fe3451c -> :sswitch_30
        -0x5d1dd090 -> :sswitch_2f
        -0x4468640c -> :sswitch_2e
        -0x11504b0e -> :sswitch_2d
        0x368f3a -> :sswitch_2c
    .end sparse-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
    .end packed-switch

    :sswitch_data_7
    .sparse-switch
        -0x5203171c -> :sswitch_39
        -0x4fbf4c57 -> :sswitch_38
        -0x41680a70 -> :sswitch_37
        0x3492916 -> :sswitch_36
        0x6219b84 -> :sswitch_35
        0x38eb0007 -> :sswitch_34
        0x49292787 -> :sswitch_33
        0x584fd04f -> :sswitch_32
        0x7fa0d2de -> :sswitch_31
    .end sparse-switch

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
    .end packed-switch

    :sswitch_data_8
    .sparse-switch
        -0x753cab1d -> :sswitch_40
        -0x41f1c51a -> :sswitch_3f
        -0x2bcbadf9 -> :sswitch_3e
        -0x281cd32a -> :sswitch_3d
        0x368f3a -> :sswitch_3c
        0x3194f740 -> :sswitch_3b
        0x6fbd6873 -> :sswitch_3a
    .end sparse-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
    .end packed-switch

    :sswitch_data_9
    .sparse-switch
        0x1bc3a -> :sswitch_44
        0x697f145 -> :sswitch_43
        0x1093c0e0 -> :sswitch_42
        0x760a5a3a -> :sswitch_41
    .end sparse-switch

    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
    .end packed-switch

    :sswitch_data_a
    .sparse-switch
        -0x2fc0721c -> :sswitch_50
        -0x21c03d00 -> :sswitch_4f
        -0x1ad38c31 -> :sswitch_4e
        -0x1a0bb613 -> :sswitch_4d
        -0x6f7b3ad -> :sswitch_4c
        -0x63526b8 -> :sswitch_4b
        -0x426489c -> :sswitch_4a
        0x17ed2c54 -> :sswitch_49
        0x5381e234 -> :sswitch_48
        0x5e67e24a -> :sswitch_47
        0x62951a5b -> :sswitch_46
        0x7f963cbf -> :sswitch_45
    .end sparse-switch

    :pswitch_data_d
    .packed-switch 0x0
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        -0xd791c66 -> :sswitch_53
        0x6b0147b -> :sswitch_52
        0x41f73003 -> :sswitch_51
    .end sparse-switch

    :pswitch_data_e
    .packed-switch 0x0
        :pswitch_69
        :pswitch_68
        :pswitch_67
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        -0x6b2a92b -> :sswitch_5a
        -0x50b0384 -> :sswitch_59
        0xd1b -> :sswitch_58
        0x337a8b -> :sswitch_57
        0x4bb73e55 -> :sswitch_56
        0x5d612954 -> :sswitch_55
        0x716221ed -> :sswitch_54
    .end sparse-switch

    :pswitch_data_f
    .packed-switch 0x0
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
    .end packed-switch

    :sswitch_data_d
    .sparse-switch
        -0x7f2b14e6 -> :sswitch_74
        -0x761ad0b1 -> :sswitch_73
        -0x55461374 -> :sswitch_72
        -0x45ddbf9d -> :sswitch_71
        -0x41b8e48f -> :sswitch_70
        -0x2ab74f34 -> :sswitch_6f
        -0x233b1c00 -> :sswitch_6e
        -0x1e8c4ddf -> :sswitch_6d
        -0x1c7eb3b0 -> :sswitch_6c
        -0x159763c9 -> :sswitch_6b
        -0x13d06b14 -> :sswitch_6a
        -0xca6e506 -> :sswitch_69
        -0x6236f0c -> :sswitch_68
        -0x61ea26e -> :sswitch_67
        -0x51ecded -> :sswitch_66
        0x3492916 -> :sswitch_65
        0x1e547b4c -> :sswitch_64
        0x2f79431d -> :sswitch_63
        0x320c6953 -> :sswitch_62
        0x3c3c4a1c -> :sswitch_61
        0x3ebcb306 -> :sswitch_60
        0x4560227a -> :sswitch_5f
        0x4bb73e55 -> :sswitch_5e
        0x6fbd6873 -> :sswitch_5d
        0x746ad664 -> :sswitch_5c
        0x74798955 -> :sswitch_5b
    .end sparse-switch

    :pswitch_data_10
    .packed-switch 0x0
        :pswitch_8c
        :pswitch_8b
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
    .end packed-switch

    :sswitch_data_e
    .sparse-switch
        -0x6db2cb8f -> :sswitch_7f
        -0x159763c9 -> :sswitch_7e
        -0x51ecded -> :sswitch_7d
        0x3492916 -> :sswitch_7c
        0xaa4d131 -> :sswitch_7b
        0x14f51cd8 -> :sswitch_7a
        0x41012807 -> :sswitch_79
        0x41bb01c6 -> :sswitch_78
        0x6fbd6873 -> :sswitch_77
        0x746ad664 -> :sswitch_76
        0x77839c2d -> :sswitch_75
    .end sparse-switch

    :pswitch_data_11
    .packed-switch 0x0
        :pswitch_99
        :pswitch_98
        :pswitch_97
        :pswitch_96
        :pswitch_95
        :pswitch_94
        :pswitch_93
        :pswitch_92
        :pswitch_91
        :pswitch_90
        :pswitch_8f
    .end packed-switch
.end method
