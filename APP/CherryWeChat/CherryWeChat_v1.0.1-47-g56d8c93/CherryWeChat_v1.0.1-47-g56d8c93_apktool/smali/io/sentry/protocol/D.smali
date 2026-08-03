.class public final Lio/sentry/protocol/D;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/q0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/protocol/D;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/a;
    .locals 14

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/rrweb/a;

    invoke-direct {v0}, Lio/sentry/rrweb/a;-><init>()V

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_12

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x4

    const-string v7, "timestamp"

    const-string v8, "type"

    const-string v9, ""

    if-nez v5, :cond_3

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, v2, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/A0;->v()J

    move-result-wide v3

    iput-wide v3, v0, Lio/sentry/rrweb/b;->b:J

    goto :goto_0

    :cond_2
    new-instance v3, Lio/sentry/protocol/D;

    invoke-direct {v3, v6}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/rrweb/c;

    invoke-static {v9, v3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v3, v0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v10, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v10, :cond_11

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "payload"

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    const-string v10, "tag"

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    if-nez v3, :cond_4

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_4
    invoke-virtual {p0, p1, v3, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_6

    move-object v5, v9

    :cond_6
    iput-object v5, v0, Lio/sentry/rrweb/a;->c:Ljava/lang/String;

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v5, v1

    :cond_8
    :goto_2
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v10

    sget-object v11, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v10, v11, :cond_10

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    const/4 v12, 0x0

    const/4 v13, -0x1

    sparse-switch v11, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v11, "message"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    goto :goto_3

    :cond_9
    const/4 v13, 0x5

    goto :goto_3

    :sswitch_1
    const-string v11, "level"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    goto :goto_3

    :cond_a
    move v13, v6

    goto :goto_3

    :sswitch_2
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    goto :goto_3

    :cond_b
    const/4 v13, 0x3

    goto :goto_3

    :sswitch_3
    const-string v11, "category"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_3

    :cond_c
    const/4 v13, 0x2

    goto :goto_3

    :sswitch_4
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_d

    goto :goto_3

    :cond_d
    const/4 v13, 0x1

    goto :goto_3

    :sswitch_5
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_e

    goto :goto_3

    :cond_e
    move v13, v12

    :goto_3
    packed-switch v13, :pswitch_data_0

    if-nez v5, :cond_f

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_f
    invoke-virtual {p0, p1, v5, v10}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_2

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v10

    iput-object v10, v0, Lio/sentry/rrweb/a;->g:Ljava/lang/String;

    goto :goto_2

    :pswitch_1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lio/sentry/a2;->valueOf(Ljava/lang/String;)Lio/sentry/a2;

    move-result-object v10

    iput-object v10, v0, Lio/sentry/rrweb/a;->h:Lio/sentry/a2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v10

    sget-object v11, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v13, "Error when deserializing SentryLevel"

    new-array v12, v12, [Ljava/lang/Object;

    invoke-interface {p1, v11, v10, v13, v12}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->o()D

    move-result-wide v10

    iput-wide v10, v0, Lio/sentry/rrweb/a;->d:D

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v10

    iput-object v10, v0, Lio/sentry/rrweb/a;->f:Ljava/lang/String;

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v10

    iput-object v10, v0, Lio/sentry/rrweb/a;->e:Ljava/lang/String;

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    invoke-static {v10}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v10

    if-eqz v10, :cond_8

    iput-object v10, v0, Lio/sentry/rrweb/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    goto/16 :goto_2

    :cond_10
    iput-object v5, v0, Lio/sentry/rrweb/a;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_1

    :cond_11
    iput-object v3, v0, Lio/sentry/rrweb/a;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_0

    :cond_12
    iput-object v2, v0, Lio/sentry/rrweb/a;->j:Ljava/util/HashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2eefaa -> :sswitch_5
        0x368f3a -> :sswitch_4
        0x302bcfe -> :sswitch_3
        0x3492916 -> :sswitch_2
        0x6219b84 -> :sswitch_1
        0x38eb0007 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/g;
    .locals 11

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/rrweb/g;

    invoke-direct {v0}, Lio/sentry/rrweb/g;-><init>()V

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_d

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x4

    const-string v6, "type"

    const-string v7, ""

    if-nez v4, :cond_3

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "timestamp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, v2, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/A0;->v()J

    move-result-wide v3

    iput-wide v3, v0, Lio/sentry/rrweb/b;->b:J

    goto :goto_0

    :cond_2
    new-instance v3, Lio/sentry/protocol/D;

    invoke-direct {v3, v5}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/rrweb/c;

    invoke-static {v7, v3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v3, v0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v8, :cond_c

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v8

    const/4 v9, 0x5

    const/4 v10, -0x1

    sparse-switch v8, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v8, "pointerId"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_2

    :cond_4
    move v10, v9

    goto :goto_2

    :sswitch_1
    const-string v8, "pointerType"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_2

    :cond_5
    move v10, v5

    goto :goto_2

    :sswitch_2
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    const/4 v10, 0x3

    goto :goto_2

    :sswitch_3
    const-string v8, "id"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_2

    :cond_7
    const/4 v10, 0x2

    goto :goto_2

    :sswitch_4
    const-string v8, "y"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_2

    :cond_8
    const/4 v10, 0x1

    goto :goto_2

    :sswitch_5
    const-string v8, "x"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_2

    :cond_9
    const/4 v10, 0x0

    :goto_2
    packed-switch v10, :pswitch_data_0

    const-string v8, "source"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    new-instance v4, Lio/sentry/protocol/D;

    invoke-direct {v4, v9}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v4}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/rrweb/d;

    invoke-static {v7, v4}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v4, v0, Lio/sentry/rrweb/e;->c:Lio/sentry/rrweb/d;

    goto :goto_1

    :cond_a
    if-nez v3, :cond_b

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    :cond_b
    invoke-virtual {p0, p1, v3, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->s()I

    move-result v4

    iput v4, v0, Lio/sentry/rrweb/g;->i:I

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->s()I

    move-result v4

    iput v4, v0, Lio/sentry/rrweb/g;->h:I

    goto/16 :goto_1

    :pswitch_2
    new-instance v4, Lio/sentry/protocol/D;

    const/4 v8, 0x7

    invoke-direct {v4, v8}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v4}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/rrweb/f;

    iput-object v4, v0, Lio/sentry/rrweb/g;->d:Lio/sentry/rrweb/f;

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->s()I

    move-result v4

    iput v4, v0, Lio/sentry/rrweb/g;->e:I

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p0}, Lio/sentry/A0;->q()F

    move-result v4

    iput v4, v0, Lio/sentry/rrweb/g;->g:F

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p0}, Lio/sentry/A0;->q()F

    move-result v4

    iput v4, v0, Lio/sentry/rrweb/g;->f:F

    goto/16 :goto_1

    :cond_c
    iput-object v3, v0, Lio/sentry/rrweb/g;->k:Ljava/util/HashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_0

    :cond_d
    iput-object v2, v0, Lio/sentry/rrweb/g;->j:Ljava/util/HashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x78 -> :sswitch_5
        0x79 -> :sswitch_4
        0xd1b -> :sswitch_3
        0x368f3a -> :sswitch_2
        0x2dd3db17 -> :sswitch_1
        0x5d48ac38 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/i;
    .locals 7

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/rrweb/i;

    invoke-direct {v0}, Lio/sentry/rrweb/i;-><init>()V

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_9

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, ""

    if-nez v4, :cond_3

    const-string v4, "type"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "timestamp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, v2, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/A0;->v()J

    move-result-wide v3

    iput-wide v3, v0, Lio/sentry/rrweb/b;->b:J

    goto :goto_0

    :cond_2
    new-instance v3, Lio/sentry/protocol/D;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/rrweb/c;

    invoke-static {v5, v3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v3, v0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v6, :cond_8

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "pointerId"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    const-string v6, "positions"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    const-string v6, "source"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    new-instance v4, Lio/sentry/protocol/D;

    const/4 v6, 0x5

    invoke-direct {v4, v6}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v4}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/rrweb/d;

    invoke-static {v5, v4}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v4, v0, Lio/sentry/rrweb/e;->c:Lio/sentry/rrweb/d;

    goto :goto_1

    :cond_4
    if-nez v3, :cond_5

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    :cond_5
    invoke-virtual {p0, p1, v3, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    new-instance v4, Lio/sentry/protocol/D;

    const/16 v6, 0x9

    invoke-direct {v4, v6}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v4}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, v0, Lio/sentry/rrweb/i;->e:Ljava/util/List;

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lio/sentry/A0;->s()I

    move-result v4

    iput v4, v0, Lio/sentry/rrweb/i;->d:I

    goto :goto_1

    :cond_8
    iput-object v3, v0, Lio/sentry/rrweb/i;->g:Ljava/util/HashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_0

    :cond_9
    iput-object v2, v0, Lio/sentry/rrweb/i;->f:Ljava/util/HashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0
.end method

.method public static e(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/j;
    .locals 9

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/rrweb/j;

    invoke-direct {v0}, Lio/sentry/rrweb/j;-><init>()V

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_c

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, ""

    if-nez v4, :cond_3

    const-string v4, "type"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "timestamp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, v2, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/A0;->v()J

    move-result-wide v3

    iput-wide v3, v0, Lio/sentry/rrweb/b;->b:J

    goto :goto_0

    :cond_2
    new-instance v3, Lio/sentry/protocol/D;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/rrweb/c;

    invoke-static {v5, v3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v3, v0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v6, :cond_b

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, -0x1

    sparse-switch v6, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v6, "width"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    const/4 v8, 0x2

    goto :goto_2

    :sswitch_1
    const-string v6, "href"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    const/4 v8, 0x1

    goto :goto_2

    :sswitch_2
    const-string v6, "height"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_2

    :cond_6
    move v8, v7

    :goto_2
    packed-switch v8, :pswitch_data_0

    if-nez v3, :cond_7

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_7
    invoke-virtual {p0, p1, v3, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_3
    iput v7, v0, Lio/sentry/rrweb/j;->e:I

    goto :goto_1

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    move-object v4, v5

    :cond_9
    iput-object v4, v0, Lio/sentry/rrweb/j;->c:Ljava/lang/String;

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_4
    iput v7, v0, Lio/sentry/rrweb/j;->d:I

    goto :goto_1

    :cond_b
    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_0

    :cond_c
    iput-object v2, v0, Lio/sentry/rrweb/j;->f:Ljava/util/HashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x48c76ed9 -> :sswitch_2
        0x30ff2b -> :sswitch_1
        0x6be2dc6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static f(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/l;
    .locals 11

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/rrweb/l;

    invoke-direct {v0}, Lio/sentry/rrweb/l;-><init>()V

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_11

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x4

    const-string v7, ""

    if-nez v5, :cond_3

    const-string v4, "type"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "timestamp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, v2, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/A0;->v()J

    move-result-wide v3

    iput-wide v3, v0, Lio/sentry/rrweb/b;->b:J

    goto :goto_0

    :cond_2
    new-instance v3, Lio/sentry/protocol/D;

    invoke-direct {v3, v6}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/rrweb/c;

    invoke-static {v7, v3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v3, v0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v8, :cond_10

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "payload"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    const-string v8, "tag"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    if-nez v3, :cond_4

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_4
    invoke-virtual {p0, p1, v3, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_6

    move-object v5, v7

    :cond_6
    iput-object v5, v0, Lio/sentry/rrweb/l;->c:Ljava/lang/String;

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v5, v1

    :cond_8
    :goto_2
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v8

    sget-object v9, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v8, v9, :cond_f

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9

    const/4 v10, -0x1

    sparse-switch v9, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_3

    :cond_9
    move v10, v6

    goto :goto_3

    :sswitch_1
    const-string v9, "op"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_3

    :cond_a
    const/4 v10, 0x3

    goto :goto_3

    :sswitch_2
    const-string v9, "startTimestamp"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    goto :goto_3

    :cond_b
    const/4 v10, 0x2

    goto :goto_3

    :sswitch_3
    const-string v9, "endTimestamp"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_3

    :cond_c
    const/4 v10, 0x1

    goto :goto_3

    :sswitch_4
    const-string v9, "description"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    goto :goto_3

    :cond_d
    const/4 v10, 0x0

    :goto_3
    packed-switch v10, :pswitch_data_0

    if-nez v5, :cond_e

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_e
    invoke-virtual {p0, p1, v5, v8}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_2

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    invoke-static {v8}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v8

    if-eqz v8, :cond_8

    iput-object v8, v0, Lio/sentry/rrweb/l;->h:Ljava/util/concurrent/ConcurrentHashMap;

    goto :goto_2

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v0, Lio/sentry/rrweb/l;->d:Ljava/lang/String;

    goto :goto_2

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->o()D

    move-result-wide v8

    iput-wide v8, v0, Lio/sentry/rrweb/l;->f:D

    goto :goto_2

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->o()D

    move-result-wide v8

    iput-wide v8, v0, Lio/sentry/rrweb/l;->g:D

    goto :goto_2

    :pswitch_4
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v0, Lio/sentry/rrweb/l;->e:Ljava/lang/String;

    goto/16 :goto_2

    :cond_f
    iput-object v5, v0, Lio/sentry/rrweb/l;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_1

    :cond_10
    iput-object v3, v0, Lio/sentry/rrweb/l;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_0

    :cond_11
    iput-object v2, v0, Lio/sentry/rrweb/l;->i:Ljava/util/HashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x66ca7c04 -> :sswitch_4
        -0x15397985 -> :sswitch_3
        -0x11d5ad2c -> :sswitch_2
        0xde1 -> :sswitch_1
        0x2eefaa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/m;
    .locals 11

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/rrweb/m;

    invoke-direct {v0}, Lio/sentry/rrweb/m;-><init>()V

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_21

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x4

    const-string v6, ""

    if-nez v4, :cond_3

    const-string v4, "type"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "timestamp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, v2, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/A0;->v()J

    move-result-wide v3

    iput-wide v3, v0, Lio/sentry/rrweb/b;->b:J

    goto :goto_0

    :cond_2
    new-instance v3, Lio/sentry/protocol/D;

    invoke-direct {v3, v5}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {p0, p1, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/rrweb/c;

    invoke-static {v6, v3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v3, v0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v7, :cond_20

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "payload"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    const-string v7, "tag"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    if-nez v3, :cond_4

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_4
    invoke-virtual {p0, p1, v3, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    move-object v4, v6

    :cond_6
    iput-object v4, v0, Lio/sentry/rrweb/m;->c:Ljava/lang/String;

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    move-object v4, v1

    :goto_2
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v8, :cond_1f

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, -0x1

    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v8, "frameRateType"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto/16 :goto_3

    :cond_8
    const/16 v10, 0xb

    goto/16 :goto_3

    :sswitch_1
    const-string v8, "encoding"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto/16 :goto_3

    :cond_9
    const/16 v10, 0xa

    goto/16 :goto_3

    :sswitch_2
    const-string v8, "frameRate"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto/16 :goto_3

    :cond_a
    const/16 v10, 0x9

    goto/16 :goto_3

    :sswitch_3
    const-string v8, "width"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto/16 :goto_3

    :cond_b
    const/16 v10, 0x8

    goto/16 :goto_3

    :sswitch_4
    const-string v8, "size"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_3

    :cond_c
    const/4 v10, 0x7

    goto :goto_3

    :sswitch_5
    const-string v8, "left"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_3

    :cond_d
    const/4 v10, 0x6

    goto :goto_3

    :sswitch_6
    const-string v8, "top"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_3

    :cond_e
    const/4 v10, 0x5

    goto :goto_3

    :sswitch_7
    const-string v8, "frameCount"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_3

    :cond_f
    move v10, v5

    goto :goto_3

    :sswitch_8
    const-string v8, "container"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto :goto_3

    :cond_10
    const/4 v10, 0x3

    goto :goto_3

    :sswitch_9
    const-string v8, "height"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    goto :goto_3

    :cond_11
    const/4 v10, 0x2

    goto :goto_3

    :sswitch_a
    const-string v8, "segmentId"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    goto :goto_3

    :cond_12
    const/4 v10, 0x1

    goto :goto_3

    :sswitch_b
    const-string v8, "duration"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    goto :goto_3

    :cond_13
    move v10, v9

    :goto_3
    packed-switch v10, :pswitch_data_0

    if-nez v4, :cond_14

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_14
    invoke-virtual {p0, p1, v4, v7}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_15

    move-object v7, v6

    :cond_15
    iput-object v7, v0, Lio/sentry/rrweb/m;->l:Ljava/lang/String;

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_16

    move-object v7, v6

    :cond_16
    iput-object v7, v0, Lio/sentry/rrweb/m;->g:Ljava/lang/String;

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_17

    goto :goto_4

    :cond_17
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :goto_4
    iput v9, v0, Lio/sentry/rrweb/m;->m:I

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_18

    goto :goto_5

    :cond_18
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :goto_5
    iput v9, v0, Lio/sentry/rrweb/m;->j:I

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v7

    if-nez v7, :cond_19

    const-wide/16 v7, 0x0

    goto :goto_6

    :cond_19
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    :goto_6
    iput-wide v7, v0, Lio/sentry/rrweb/m;->e:J

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_1a

    goto :goto_7

    :cond_1a
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :goto_7
    iput v9, v0, Lio/sentry/rrweb/m;->n:I

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_1b

    goto :goto_8

    :cond_1b
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :goto_8
    iput v9, v0, Lio/sentry/rrweb/m;->o:I

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_1c

    goto :goto_9

    :cond_1c
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :goto_9
    iput v9, v0, Lio/sentry/rrweb/m;->k:I

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1d

    move-object v7, v6

    :cond_1d
    iput-object v7, v0, Lio/sentry/rrweb/m;->h:Ljava/lang/String;

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_1e

    goto :goto_a

    :cond_1e
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :goto_a
    iput v9, v0, Lio/sentry/rrweb/m;->i:I

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0}, Lio/sentry/A0;->s()I

    move-result v7

    iput v7, v0, Lio/sentry/rrweb/m;->d:I

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0}, Lio/sentry/A0;->v()J

    move-result-wide v7

    iput-wide v7, v0, Lio/sentry/rrweb/m;->f:J

    goto/16 :goto_2

    :cond_1f
    iput-object v4, v0, Lio/sentry/rrweb/m;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_1

    :cond_20
    iput-object v3, v0, Lio/sentry/rrweb/m;->r:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    goto/16 :goto_0

    :cond_21
    iput-object v2, v0, Lio/sentry/rrweb/m;->p:Ljava/util/HashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76bbb26c -> :sswitch_b
        -0x61065852 -> :sswitch_a
        -0x48c76ed9 -> :sswitch_9
        -0x187eb37f -> :sswitch_8
        -0x11ac6c5e -> :sswitch_7
        0x1c155 -> :sswitch_6
        0x32a007 -> :sswitch_5
        0x35e001 -> :sswitch_4
        0x6be2dc6 -> :sswitch_3
        0x207cebed -> :sswitch_2
        0x65ff2d53 -> :sswitch_1
        0x7f4330c7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public final a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget v3, v0, Lio/sentry/protocol/D;->a:I

    const/4 v6, 0x4

    const-string v7, "rendering_system"

    const-string v8, "id"

    const-string v9, "y"

    const-string v10, "x"

    const/4 v11, 0x3

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, -0x1

    const/4 v15, 0x0

    const/4 v4, 0x2

    packed-switch v3, :pswitch_data_0

    invoke-static/range {p1 .. p2}, Lio/sentry/protocol/D;->g(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/m;

    move-result-object v1

    return-object v1

    :pswitch_0
    invoke-static/range {p1 .. p2}, Lio/sentry/protocol/D;->f(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/l;

    move-result-object v1

    return-object v1

    :pswitch_1
    invoke-static/range {p1 .. p2}, Lio/sentry/protocol/D;->e(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/j;

    move-result-object v1

    return-object v1

    :pswitch_2
    invoke-virtual {v1}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/rrweb/h;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    :goto_0
    invoke-virtual {v1}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_5

    invoke-virtual {v1}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    :goto_1
    move v6, v14

    goto :goto_2

    :sswitch_0
    const-string v6, "timeOffset"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v11

    goto :goto_2

    :sswitch_1
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    move v6, v4

    goto :goto_2

    :sswitch_2
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    move v6, v12

    goto :goto_2

    :sswitch_3
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    move v6, v13

    :goto_2
    packed-switch v6, :pswitch_data_1

    if-nez v15, :cond_4

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    :cond_4
    invoke-virtual {v1, v2, v15, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    invoke-virtual {v1}, Lio/sentry/A0;->v()J

    move-result-wide v5

    iput-wide v5, v3, Lio/sentry/rrweb/h;->d:J

    goto :goto_0

    :pswitch_4
    invoke-virtual {v1}, Lio/sentry/A0;->s()I

    move-result v5

    iput v5, v3, Lio/sentry/rrweb/h;->a:I

    goto :goto_0

    :pswitch_5
    invoke-virtual {v1}, Lio/sentry/A0;->q()F

    move-result v5

    iput v5, v3, Lio/sentry/rrweb/h;->c:F

    goto :goto_0

    :pswitch_6
    invoke-virtual {v1}, Lio/sentry/A0;->q()F

    move-result v5

    iput v5, v3, Lio/sentry/rrweb/h;->b:F

    goto :goto_0

    :cond_5
    iput-object v15, v3, Lio/sentry/rrweb/h;->e:Ljava/util/HashMap;

    invoke-virtual {v1}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_7
    invoke-static/range {p1 .. p2}, Lio/sentry/protocol/D;->d(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/i;

    move-result-object v1

    return-object v1

    :pswitch_8
    invoke-static {}, Lio/sentry/rrweb/f;->values()[Lio/sentry/rrweb/f;

    move-result-object v2

    invoke-virtual {v1}, Lio/sentry/A0;->s()I

    move-result v1

    aget-object v1, v2, v1

    return-object v1

    :pswitch_9
    invoke-static/range {p1 .. p2}, Lio/sentry/protocol/D;->c(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/g;

    move-result-object v1

    return-object v1

    :pswitch_a
    invoke-static {}, Lio/sentry/rrweb/d;->values()[Lio/sentry/rrweb/d;

    move-result-object v2

    invoke-virtual {v1}, Lio/sentry/A0;->s()I

    move-result v1

    aget-object v1, v2, v1

    return-object v1

    :pswitch_b
    invoke-static {}, Lio/sentry/rrweb/c;->values()[Lio/sentry/rrweb/c;

    move-result-object v2

    invoke-virtual {v1}, Lio/sentry/A0;->s()I

    move-result v1

    aget-object v1, v2, v1

    return-object v1

    :pswitch_c
    invoke-static/range {p1 .. p2}, Lio/sentry/protocol/D;->b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/rrweb/a;

    move-result-object v1

    return-object v1

    :pswitch_d
    new-instance v3, Lio/sentry/protocol/G;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Lio/sentry/A0;->f()V

    :goto_3
    invoke-virtual {v1}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v8

    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v8, v5, :cond_12

    invoke-virtual {v1}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_1

    :goto_4
    move v8, v14

    goto/16 :goto_5

    :sswitch_4
    const-string v8, "visibility"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    const/16 v8, 0xa

    goto/16 :goto_5

    :sswitch_5
    const-string v8, "children"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_4

    :cond_7
    const/16 v8, 0x9

    goto/16 :goto_5

    :sswitch_6
    const-string v8, "width"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_4

    :cond_8
    const/16 v8, 0x8

    goto/16 :goto_5

    :sswitch_7
    const-string v8, "alpha"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_4

    :cond_9
    const/4 v8, 0x7

    goto :goto_5

    :sswitch_8
    const-string v8, "type"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_4

    :cond_a
    const/4 v8, 0x6

    goto :goto_5

    :sswitch_9
    const-string v8, "tag"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_4

    :cond_b
    const/4 v8, 0x5

    goto :goto_5

    :sswitch_a
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_4

    :cond_c
    move v8, v6

    goto :goto_5

    :sswitch_b
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_4

    :cond_d
    move v8, v11

    goto :goto_5

    :sswitch_c
    const-string v8, "height"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_4

    :cond_e
    move v8, v4

    goto :goto_5

    :sswitch_d
    const-string v8, "identifier"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_4

    :cond_f
    move v8, v12

    goto :goto_5

    :sswitch_e
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto :goto_4

    :cond_10
    move v8, v13

    :goto_5
    packed-switch v8, :pswitch_data_2

    if-nez v15, :cond_11

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    :cond_11
    invoke-virtual {v1, v2, v15, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->i:Ljava/lang/String;

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {v1, v2, v0}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->k:Ljava/util/List;

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {v1}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->e:Ljava/lang/Double;

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {v1}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->j:Ljava/lang/Double;

    goto/16 :goto_3

    :pswitch_12
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->b:Ljava/lang/String;

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->d:Ljava/lang/String;

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {v1}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->h:Ljava/lang/Double;

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {v1}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->g:Ljava/lang/Double;

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {v1}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->f:Ljava/lang/Double;

    goto/16 :goto_3

    :pswitch_17
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->c:Ljava/lang/String;

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/G;->a:Ljava/lang/String;

    goto/16 :goto_3

    :cond_12
    invoke-virtual {v1}, Lio/sentry/A0;->i()V

    iput-object v15, v3, Lio/sentry/protocol/G;->l:Ljava/util/HashMap;

    return-object v3

    :pswitch_19
    invoke-virtual {v1}, Lio/sentry/A0;->f()V

    move-object v3, v15

    move-object v5, v3

    :goto_6
    invoke-virtual {v1}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v6

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v6, v8, :cond_16

    invoke-virtual {v1}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    const-string v8, "windows"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    if-nez v5, :cond_13

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_13
    invoke-virtual {v1, v2, v5, v6}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_6

    :cond_14
    new-instance v3, Lio/sentry/protocol/D;

    invoke-direct {v3, v4}, Lio/sentry/protocol/D;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_6

    :cond_15
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    move-object v15, v6

    goto :goto_6

    :cond_16
    invoke-virtual {v1}, Lio/sentry/A0;->i()V

    new-instance v1, Lio/sentry/protocol/F;

    invoke-direct {v1, v15, v3}, Lio/sentry/protocol/F;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iput-object v5, v1, Lio/sentry/protocol/F;->c:Ljava/util/HashMap;

    return-object v1

    :pswitch_1a
    invoke-virtual {v1}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/protocol/E;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object v5, v15

    :goto_7
    invoke-virtual {v1}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v9, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v9, :cond_24

    invoke-virtual {v1}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_2

    :goto_8
    move v9, v14

    goto :goto_9

    :sswitch_f
    const-string v9, "ip_address"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_17

    goto :goto_8

    :cond_17
    const/4 v9, 0x6

    goto :goto_9

    :sswitch_10
    const-string v9, "email"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_18

    goto :goto_8

    :cond_18
    const/4 v9, 0x5

    goto :goto_9

    :sswitch_11
    const-string v9, "name"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_19

    goto :goto_8

    :cond_19
    move v9, v6

    goto :goto_9

    :sswitch_12
    const-string v9, "data"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1a

    goto :goto_8

    :cond_1a
    move v9, v11

    goto :goto_9

    :sswitch_13
    const-string v9, "geo"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1b

    goto :goto_8

    :cond_1b
    move v9, v4

    goto :goto_9

    :sswitch_14
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1c

    goto :goto_8

    :cond_1c
    move v9, v12

    goto :goto_9

    :sswitch_15
    const-string v9, "username"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1d

    goto :goto_8

    :cond_1d
    move v9, v13

    :goto_9
    packed-switch v9, :pswitch_data_3

    if-nez v5, :cond_1e

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_1e
    invoke-virtual {v1, v2, v5, v7}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_e

    :pswitch_1b
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/E;->d:Ljava/lang/String;

    goto/16 :goto_e

    :pswitch_1c
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/E;->a:Ljava/lang/String;

    goto/16 :goto_e

    :pswitch_1d
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/E;->e:Ljava/lang/String;

    goto/16 :goto_e

    :pswitch_1e
    invoke-virtual {v1}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    invoke-static {v7}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/E;->g:Ljava/util/concurrent/ConcurrentHashMap;

    goto/16 :goto_e

    :pswitch_1f
    invoke-virtual {v1}, Lio/sentry/A0;->f()V

    new-instance v7, Lio/sentry/protocol/h;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    move-object v9, v15

    :goto_a
    invoke-virtual {v1}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v10

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v10, v4, :cond_23

    invoke-virtual {v1}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_3

    :goto_b
    move v10, v14

    goto :goto_c

    :sswitch_16
    const-string v10, "country_code"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    goto :goto_b

    :cond_1f
    const/4 v10, 0x2

    goto :goto_c

    :sswitch_17
    const-string v10, "city"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_20

    goto :goto_b

    :cond_20
    move v10, v12

    goto :goto_c

    :sswitch_18
    const-string v10, "region"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_21

    goto :goto_b

    :cond_21
    move v10, v13

    :goto_c
    packed-switch v10, :pswitch_data_4

    if-nez v9, :cond_22

    new-instance v9, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v9}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_22
    invoke-virtual {v1, v2, v9, v4}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_d

    :pswitch_20
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v7, Lio/sentry/protocol/h;->b:Ljava/lang/String;

    goto :goto_d

    :pswitch_21
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v7, Lio/sentry/protocol/h;->a:Ljava/lang/String;

    goto :goto_d

    :pswitch_22
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v7, Lio/sentry/protocol/h;->c:Ljava/lang/String;

    :goto_d
    const/4 v4, 0x2

    goto :goto_a

    :cond_23
    iput-object v9, v7, Lio/sentry/protocol/h;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Lio/sentry/A0;->i()V

    iput-object v7, v3, Lio/sentry/protocol/E;->f:Lio/sentry/protocol/h;

    goto :goto_e

    :pswitch_23
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lio/sentry/protocol/E;->b:Ljava/lang/String;

    goto :goto_e

    :pswitch_24
    invoke-virtual {v1}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lio/sentry/protocol/E;->c:Ljava/lang/String;

    :goto_e
    const/4 v4, 0x2

    goto/16 :goto_7

    :cond_24
    iput-object v5, v3, Lio/sentry/protocol/E;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Lio/sentry/A0;->i()V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x78 -> :sswitch_3
        0x79 -> :sswitch_2
        0xd1b -> :sswitch_1
        0x27aa95c0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x6a64acbe -> :sswitch_e
        -0x60775357 -> :sswitch_d
        -0x48c76ed9 -> :sswitch_c
        0x78 -> :sswitch_b
        0x79 -> :sswitch_a
        0x1bf9a -> :sswitch_9
        0x368f3a -> :sswitch_8
        0x589b15e -> :sswitch_7
        0x6be2dc6 -> :sswitch_6
        0x62ea5dff -> :sswitch_5
        0x73b66312 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0xfd6772a -> :sswitch_15
        0xd1b -> :sswitch_14
        0x18f51 -> :sswitch_13
        0x2eefaa -> :sswitch_12
        0x337a8b -> :sswitch_11
        0x5c24b9c -> :sswitch_10
        0x583738dc -> :sswitch_f
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_24
        :pswitch_23
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x37b7d90c -> :sswitch_18
        0x2e996b -> :sswitch_17
        0x58475cf6 -> :sswitch_16
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch
.end method
