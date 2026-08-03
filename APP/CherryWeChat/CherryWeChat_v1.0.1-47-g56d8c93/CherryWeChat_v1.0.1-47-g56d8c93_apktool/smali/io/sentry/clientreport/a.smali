.class public final Lio/sentry/clientreport/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/q0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/clientreport/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/a;
    .locals 5

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/protocol/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_f

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v3, "is_split_apks"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v4, 0xc

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "app_build"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v4, 0xb

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "app_name"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v4, 0xa

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "permissions"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v4, 0x9

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "app_start_time"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v4, 0x8

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "app_identifier"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_1

    :cond_6
    const/4 v4, 0x7

    goto :goto_1

    :sswitch_6
    const-string v3, "build_type"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_1

    :cond_7
    const/4 v4, 0x6

    goto :goto_1

    :sswitch_7
    const-string v3, "in_foreground"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_1

    :cond_8
    const/4 v4, 0x5

    goto :goto_1

    :sswitch_8
    const-string v3, "app_version"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_1

    :cond_9
    const/4 v4, 0x4

    goto :goto_1

    :sswitch_9
    const-string v3, "view_names"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_1

    :cond_a
    const/4 v4, 0x3

    goto :goto_1

    :sswitch_a
    const-string v3, "start_type"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_1

    :cond_b
    const/4 v4, 0x2

    goto :goto_1

    :sswitch_b
    const-string v3, "device_app_hash"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_1

    :cond_c
    const/4 v4, 0x1

    goto :goto_1

    :sswitch_c
    const-string v3, "split_names"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_1

    :cond_d
    const/4 v4, 0x0

    :goto_1
    packed-switch v4, :pswitch_data_0

    if-nez v1, :cond_e

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_e
    invoke-virtual {p0, p1, v1, v2}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->l:Ljava/lang/Boolean;

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->g:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->e:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->h:Ljava/util/AbstractMap;

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p0, p1}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->b:Ljava/util/Date;

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->a:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->d:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {p0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->k:Ljava/lang/Boolean;

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->f:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_0

    iput-object v2, v0, Lio/sentry/protocol/a;->i:Ljava/util/List;

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->j:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->c:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_0

    iput-object v2, v0, Lio/sentry/protocol/a;->m:Ljava/util/List;

    goto/16 :goto_0

    :cond_f
    iput-object v1, v0, Lio/sentry/protocol/a;->n:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x743ce61d -> :sswitch_c
        -0x7121ffcb -> :sswitch_b
        -0x5dc40f09 -> :sswitch_a
        -0x5adfdad2 -> :sswitch_9
        -0x35c17346 -> :sswitch_8
        -0x26c68763 -> :sswitch_7
        -0x1c09a995 -> :sswitch_6
        0x2c7b9987 -> :sswitch_5
        0x2f2ea168 -> :sswitch_4
        0x4392f484 -> :sswitch_3
        0x4598e5e9 -> :sswitch_2
        0x6ce3c6d0 -> :sswitch_1
        0x751f9211 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static c(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/c;
    .locals 14

    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_25

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x4

    const-string v4, "feedback"

    const/4 v5, 0x3

    const-string v6, "profile"

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, -0x1

    sparse-switch v2, :sswitch_data_0

    :goto_1
    move v2, v10

    goto/16 :goto_2

    :sswitch_0
    const-string v2, "runtime"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0xa

    goto/16 :goto_2

    :sswitch_1
    const-string v2, "browser"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x9

    goto/16 :goto_2

    :sswitch_2
    const-string v2, "trace"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/16 v2, 0x8

    goto/16 :goto_2

    :sswitch_3
    const-string v2, "gpu"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x7

    goto :goto_2

    :sswitch_4
    const-string v2, "app"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x6

    goto :goto_2

    :sswitch_5
    const-string v2, "os"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    const/4 v2, 0x5

    goto :goto_2

    :sswitch_6
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    move v2, v3

    goto :goto_2

    :sswitch_7
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_1

    :cond_8
    move v2, v5

    goto :goto_2

    :sswitch_8
    const-string v2, "response"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_1

    :cond_9
    move v2, v7

    goto :goto_2

    :sswitch_9
    const-string v2, "spring"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_1

    :cond_a
    move v2, v8

    goto :goto_2

    :sswitch_a
    const-string v2, "device"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_1

    :cond_b
    move v2, v9

    :goto_2
    const-string v11, "version"

    const-string v12, "name"

    const/4 v13, 0x0

    packed-switch v2, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1, v2}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/protocol/v;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :goto_3
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_10

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_1

    :goto_4
    move v3, v10

    goto :goto_5

    :sswitch_b
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_4

    :cond_c
    move v3, v7

    goto :goto_5

    :sswitch_c
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_4

    :cond_d
    move v3, v8

    goto :goto_5

    :sswitch_d
    const-string v3, "raw_description"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_4

    :cond_e
    move v3, v9

    :goto_5
    packed-switch v3, :pswitch_data_1

    if-nez v13, :cond_f

    new-instance v13, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v13}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_f
    invoke-virtual {p0, p1, v13, v2}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_3

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/v;->b:Ljava/lang/String;

    goto :goto_3

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/v;->a:Ljava/lang/String;

    goto :goto_3

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/v;->c:Ljava/lang/String;

    goto :goto_3

    :cond_10
    iput-object v13, v1, Lio/sentry/protocol/v;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->r(Lio/sentry/protocol/v;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/protocol/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :goto_6
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_14

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    if-nez v13, :cond_11

    new-instance v13, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v13}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_11
    invoke-virtual {p0, p1, v13, v2}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_6

    :cond_12
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/b;->b:Ljava/lang/String;

    goto :goto_6

    :cond_13
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/b;->a:Ljava/lang/String;

    goto :goto_6

    :cond_14
    iput-object v13, v1, Lio/sentry/protocol/b;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->m(Lio/sentry/protocol/b;)V

    goto/16 :goto_0

    :pswitch_5
    invoke-static {p0, p1}, Lio/sentry/e;->b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/H2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->t(Lio/sentry/H2;)V

    goto/16 :goto_0

    :pswitch_6
    invoke-static {p0, p1}, Lio/sentry/clientreport/a;->f(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->o(Lio/sentry/protocol/i;)V

    goto/16 :goto_0

    :pswitch_7
    invoke-static {p0, p1}, Lio/sentry/clientreport/a;->b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->l(Lio/sentry/protocol/a;)V

    goto/16 :goto_0

    :pswitch_8
    invoke-static {p0, p1}, Lio/sentry/clientreport/a;->g(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->p(Lio/sentry/protocol/m;)V

    goto/16 :goto_0

    :pswitch_9
    invoke-static {p0, p1}, Lio/sentry/clientreport/a;->e(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/g;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/f1;

    sget-object v2, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-direct {v1, v2}, Lio/sentry/f1;-><init>(Lio/sentry/protocol/t;)V

    :cond_15
    :goto_7
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_18

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "profiler_id"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    if-nez v13, :cond_16

    new-instance v13, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v13}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_16
    invoke-virtual {p0, p1, v13, v2}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_7

    :cond_17
    new-instance v2, Lio/sentry/clientreport/a;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {p0, p1, v2}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/protocol/t;

    if-eqz v2, :cond_15

    iput-object v2, v1, Lio/sentry/f1;->a:Lio/sentry/protocol/t;

    goto :goto_7

    :cond_18
    iput-object v13, v1, Lio/sentry/f1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    invoke-virtual {v0, v6, v1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/protocol/p;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :cond_19
    :goto_8
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v4, :cond_20

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_2

    :goto_9
    move v4, v10

    goto :goto_a

    :sswitch_e
    const-string v4, "body_size"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    goto :goto_9

    :cond_1a
    move v4, v3

    goto :goto_a

    :sswitch_f
    const-string v4, "cookies"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    goto :goto_9

    :cond_1b
    move v4, v5

    goto :goto_a

    :sswitch_10
    const-string v4, "headers"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c

    goto :goto_9

    :cond_1c
    move v4, v7

    goto :goto_a

    :sswitch_11
    const-string v4, "data"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_9

    :cond_1d
    move v4, v8

    goto :goto_a

    :sswitch_12
    const-string v4, "status_code"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_9

    :cond_1e
    move v4, v9

    :goto_a
    packed-switch v4, :pswitch_data_2

    if-nez v13, :cond_1f

    new-instance v13, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v13}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_1f
    invoke-virtual {p0, p1, v13, v2}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_8

    :pswitch_c
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/p;->d:Ljava/lang/Long;

    goto :goto_8

    :pswitch_d
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/p;->a:Ljava/lang/String;

    goto :goto_8

    :pswitch_e
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_19

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/p;->b:Ljava/util/concurrent/ConcurrentHashMap;

    goto :goto_8

    :pswitch_f
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/p;->e:Ljava/lang/Object;

    goto :goto_8

    :pswitch_10
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/p;->c:Ljava/lang/Integer;

    goto/16 :goto_8

    :cond_20
    iput-object v13, v1, Lio/sentry/protocol/p;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->q(Lio/sentry/protocol/p;)V

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v1, Lio/sentry/protocol/B;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :cond_21
    :goto_b
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_24

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "active_profiles"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    if-nez v13, :cond_22

    new-instance v13, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v13}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_22
    invoke-virtual {p0, p1, v13, v2}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_b

    :cond_23
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_21

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iput-object v3, v1, Lio/sentry/protocol/B;->a:[Ljava/lang/String;

    goto :goto_b

    :cond_24
    iput-object v13, v1, Lio/sentry/protocol/B;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->s(Lio/sentry/protocol/B;)V

    goto/16 :goto_0

    :pswitch_12
    invoke-static {p0, p1}, Lio/sentry/clientreport/a;->d(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->n(Lio/sentry/protocol/f;)V

    goto/16 :goto_0

    :cond_25
    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f94e1aa -> :sswitch_a
        -0x3562fdf3 -> :sswitch_9
        -0x1448ebbf -> :sswitch_8
        -0x12717657 -> :sswitch_7
        -0xb6a147b -> :sswitch_6
        0xde4 -> :sswitch_5
        0x17a21 -> :sswitch_4
        0x190ac -> :sswitch_3
        0x697f145 -> :sswitch_2
        0x8ff2b28 -> :sswitch_1
        0x5c71cfd8 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x1437619b -> :sswitch_d
        0x337a8b -> :sswitch_c
        0x14f51cd8 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x352641e6 -> :sswitch_12
        0x2eefaa -> :sswitch_11
        0x2f676f86 -> :sswitch_10
        0x38c1428f -> :sswitch_f
        0x4aaf147e -> :sswitch_e
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method

.method public static d(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/f;
    .locals 7

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/protocol/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_26

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0xa

    const/4 v6, -0x1

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v4, "screen_height_pixels"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v6, 0x21

    goto/16 :goto_1

    :sswitch_1
    const-string v4, "free_storage"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v6, 0x20

    goto/16 :goto_1

    :sswitch_2
    const-string v4, "external_free_storage"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v6, 0x1f

    goto/16 :goto_1

    :sswitch_3
    const-string v4, "charging"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v6, 0x1e

    goto/16 :goto_1

    :sswitch_4
    const-string v4, "memory_size"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v6, 0x1d

    goto/16 :goto_1

    :sswitch_5
    const-string v4, "usable_memory"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v6, 0x1c

    goto/16 :goto_1

    :sswitch_6
    const-string v4, "storage_size"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v6, 0x1b

    goto/16 :goto_1

    :sswitch_7
    const-string v4, "external_storage_size"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v6, 0x1a

    goto/16 :goto_1

    :sswitch_8
    const-string v4, "screen_width_pixels"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v6, 0x19

    goto/16 :goto_1

    :sswitch_9
    const-string v4, "chipset"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v6, 0x18

    goto/16 :goto_1

    :sswitch_a
    const-string v4, "connection_type"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v6, 0x17

    goto/16 :goto_1

    :sswitch_b
    const-string v4, "processor_frequency"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v6, 0x16

    goto/16 :goto_1

    :sswitch_c
    const-string v4, "cpu_description"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v6, 0x15

    goto/16 :goto_1

    :sswitch_d
    const-string v4, "model"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v6, 0x14

    goto/16 :goto_1

    :sswitch_e
    const-string v4, "brand"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v6, 0x13

    goto/16 :goto_1

    :sswitch_f
    const-string v4, "archs"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v6, 0x12

    goto/16 :goto_1

    :sswitch_10
    const-string v4, "low_memory"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v6, 0x11

    goto/16 :goto_1

    :sswitch_11
    const-string v4, "name"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v6, 0x10

    goto/16 :goto_1

    :sswitch_12
    const-string v4, "id"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto/16 :goto_1

    :cond_13
    const/16 v6, 0xf

    goto/16 :goto_1

    :sswitch_13
    const-string v4, "free_memory"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto/16 :goto_1

    :cond_14
    const/16 v6, 0xe

    goto/16 :goto_1

    :sswitch_14
    const-string v4, "screen_dpi"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    goto/16 :goto_1

    :cond_15
    const/16 v6, 0xd

    goto/16 :goto_1

    :sswitch_15
    const-string v4, "screen_density"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto/16 :goto_1

    :cond_16
    const/16 v6, 0xc

    goto/16 :goto_1

    :sswitch_16
    const-string v4, "model_id"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    goto/16 :goto_1

    :cond_17
    const/16 v6, 0xb

    goto/16 :goto_1

    :sswitch_17
    const-string v4, "battery_level"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    goto/16 :goto_1

    :cond_18
    move v6, v5

    goto/16 :goto_1

    :sswitch_18
    const-string v4, "online"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    goto/16 :goto_1

    :cond_19
    const/16 v6, 0x9

    goto/16 :goto_1

    :sswitch_19
    const-string v4, "locale"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    goto/16 :goto_1

    :cond_1a
    const/16 v6, 0x8

    goto/16 :goto_1

    :sswitch_1a
    const-string v4, "family"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    goto :goto_1

    :cond_1b
    const/4 v6, 0x7

    goto :goto_1

    :sswitch_1b
    const-string v4, "battery_temperature"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c

    goto :goto_1

    :cond_1c
    const/4 v6, 0x6

    goto :goto_1

    :sswitch_1c
    const-string v4, "orientation"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_1

    :cond_1d
    const/4 v6, 0x5

    goto :goto_1

    :sswitch_1d
    const-string v4, "processor_count"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_1

    :cond_1e
    const/4 v6, 0x4

    goto :goto_1

    :sswitch_1e
    const-string v4, "manufacturer"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    goto :goto_1

    :cond_1f
    const/4 v6, 0x3

    goto :goto_1

    :sswitch_1f
    const-string v4, "simulator"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    goto :goto_1

    :cond_20
    const/4 v6, 0x2

    goto :goto_1

    :sswitch_20
    const-string v4, "boot_time"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    goto :goto_1

    :cond_21
    const/4 v6, 0x1

    goto :goto_1

    :sswitch_21
    const-string v4, "timezone"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_22

    goto :goto_1

    :cond_22
    const/4 v6, 0x0

    :goto_1
    packed-switch v6, :pswitch_data_0

    if-nez v2, :cond_23

    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_23
    invoke-virtual {p0, p1, v2, v3}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->v:Ljava/lang/Integer;

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->r:Ljava/lang/Long;

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->t:Ljava/lang/Long;

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->i:Ljava/lang/Boolean;

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->m:Ljava/lang/Long;

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->o:Ljava/lang/Long;

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->q:Ljava/lang/Long;

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->s:Ljava/lang/Long;

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->u:Ljava/lang/Integer;

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->H:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->C:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {p0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->F:Ljava/lang/Double;

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->G:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->e:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->c:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iput-object v4, v0, Lio/sentry/protocol/f;->g:[Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual {p0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->p:Ljava/lang/Boolean;

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->a:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->A:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_13
    invoke-virtual {p0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->n:Ljava/lang/Long;

    goto/16 :goto_0

    :pswitch_14
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->x:Ljava/lang/Integer;

    goto/16 :goto_0

    :pswitch_15
    invoke-virtual {p0}, Lio/sentry/A0;->r()Ljava/lang/Float;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->w:Ljava/lang/Float;

    goto/16 :goto_0

    :pswitch_16
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->f:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_17
    invoke-virtual {p0}, Lio/sentry/A0;->r()Ljava/lang/Float;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->h:Ljava/lang/Float;

    goto/16 :goto_0

    :pswitch_18
    invoke-virtual {p0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->j:Ljava/lang/Boolean;

    goto/16 :goto_0

    :pswitch_19
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->B:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_1a
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->d:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_1b
    invoke-virtual {p0}, Lio/sentry/A0;->r()Ljava/lang/Float;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->D:Ljava/lang/Float;

    goto/16 :goto_0

    :pswitch_1c
    new-instance v3, Lio/sentry/clientreport/a;

    invoke-direct {v3, v5}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {p0, p1, v3}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/e;

    iput-object v3, v0, Lio/sentry/protocol/f;->k:Lio/sentry/protocol/e;

    goto/16 :goto_0

    :pswitch_1d
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->E:Ljava/lang/Integer;

    goto/16 :goto_0

    :pswitch_1e
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->b:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_1f
    invoke-virtual {p0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->l:Ljava/lang/Boolean;

    goto/16 :goto_0

    :pswitch_20
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->STRING:Lio/sentry/vendor/gson/stream/b;

    if-ne v3, v4, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/protocol/f;->y:Ljava/util/Date;

    goto/16 :goto_0

    :pswitch_21
    iget v3, p0, Lio/sentry/A0;->a:I

    packed-switch v3, :pswitch_data_1

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_24

    invoke-static {v3}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v3

    goto :goto_3

    :cond_24
    :goto_2
    move-object v3, v1

    goto :goto_3

    :pswitch_22
    iget-object v3, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v3, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v3}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v5, :cond_25

    invoke-virtual {v3}, Lio/sentry/vendor/gson/stream/a;->y()V

    goto :goto_2

    :cond_25
    :try_start_0
    invoke-virtual {v3}, Lio/sentry/vendor/gson/stream/a;->A()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v3

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Error when deserializing TimeZone"

    invoke-interface {p1, v4, v5, v3}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_3
    iput-object v3, v0, Lio/sentry/protocol/f;->z:Ljava/util/TimeZone;

    goto/16 :goto_0

    :cond_26
    iput-object v2, v0, Lio/sentry/protocol/f;->I:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x7bc0b807 -> :sswitch_21
        -0x77f42806 -> :sswitch_20
        -0x7618bbfc -> :sswitch_1f
        -0x7561dc2f -> :sswitch_1e
        -0x5fd834de -> :sswitch_1d
        -0x55cd0a30 -> :sswitch_1c
        -0x5412d9be -> :sswitch_1b
        -0x4c67a49c -> :sswitch_1a
        -0x4169f1a6 -> :sswitch_19
        -0x3c5549ad -> :sswitch_18
        -0x3449d12e -> :sswitch_17
        -0x24e5c60f -> :sswitch_16
        -0x21df2feb -> :sswitch_15
        -0x18dba0f6 -> :sswitch_14
        -0x8232dcc -> :sswitch_13
        0xd1b -> :sswitch_12
        0x337a8b -> :sswitch_11
        0x386704c -> :sswitch_10
        0x58c3add -> :sswitch_f
        0x59a4b87 -> :sswitch_e
        0x633fb29 -> :sswitch_d
        0x6e627e5 -> :sswitch_c
        0xe92bdef -> :sswitch_b
        0x2b9f63fb -> :sswitch_a
        0x2c7d3496 -> :sswitch_9
        0x30bf1c39 -> :sswitch_8
        0x311b7339 -> :sswitch_7
        0x357dab45 -> :sswitch_6
        0x4f5c8e28 -> :sswitch_5
        0x5490d47f -> :sswitch_4
        0x55996271 -> :sswitch_3
        0x56769b9c -> :sswitch_2
        0x5ad8d3a8 -> :sswitch_1
        0x5cc30632 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
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

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_22
    .end packed-switch
.end method

.method public static e(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/g;
    .locals 11

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    const/4 v9, 0x0

    if-ne v7, v8, :cond_7

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    const/4 v10, -0x1

    sparse-switch v8, :sswitch_data_0

    :goto_1
    move v9, v10

    goto :goto_2

    :sswitch_0
    const-string v8, "message"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_1

    :cond_0
    const/4 v9, 0x5

    goto :goto_2

    :sswitch_1
    const-string v8, "contact_email"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    const/4 v9, 0x4

    goto :goto_2

    :sswitch_2
    const-string v8, "name"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    const/4 v9, 0x3

    goto :goto_2

    :sswitch_3
    const-string v8, "url"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_1

    :cond_3
    const/4 v9, 0x2

    goto :goto_2

    :sswitch_4
    const-string v8, "replay_id"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    const/4 v9, 0x1

    goto :goto_2

    :sswitch_5
    const-string v8, "associated_event_id"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    packed-switch v9, :pswitch_data_0

    if-nez v6, :cond_6

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_6
    invoke-virtual {p0, p1, v6, v7}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :pswitch_4
    new-instance v4, Lio/sentry/protocol/t;

    invoke-virtual {p0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v7}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_5
    new-instance v3, Lio/sentry/protocol/t;

    invoke-virtual {p0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v7}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    if-eqz v0, :cond_9

    new-instance p0, Lio/sentry/protocol/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v7, 0x1000

    if-le p1, v7, :cond_8

    invoke-virtual {v0, v9, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/protocol/g;->a:Ljava/lang/String;

    goto :goto_3

    :cond_8
    iput-object v0, p0, Lio/sentry/protocol/g;->a:Ljava/lang/String;

    :goto_3
    iput-object v1, p0, Lio/sentry/protocol/g;->b:Ljava/lang/String;

    iput-object v2, p0, Lio/sentry/protocol/g;->c:Ljava/lang/String;

    iput-object v3, p0, Lio/sentry/protocol/g;->d:Lio/sentry/protocol/t;

    iput-object v4, p0, Lio/sentry/protocol/g;->e:Lio/sentry/protocol/t;

    iput-object v5, p0, Lio/sentry/protocol/g;->f:Ljava/lang/String;

    iput-object v6, p0, Lio/sentry/protocol/g;->g:Ljava/util/AbstractMap;

    return-object p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Missing required field \"message\""

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {p1, v1, v0, p0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x39809c07 -> :sswitch_5
        -0x1b1b338d -> :sswitch_4
        0x1c56f -> :sswitch_3
        0x337a8b -> :sswitch_2
        0x38723abd -> :sswitch_1
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

.method public static f(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/i;
    .locals 5

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/protocol/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_a

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v3, "memory_size"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v4, 0x8

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "api_type"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x7

    goto :goto_1

    :sswitch_2
    const-string v3, "version"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x6

    goto :goto_1

    :sswitch_3
    const-string v3, "vendor_name"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x5

    goto :goto_1

    :sswitch_4
    const-string v3, "name"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x4

    goto :goto_1

    :sswitch_5
    const-string v3, "id"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x3

    goto :goto_1

    :sswitch_6
    const-string v3, "multi_threaded_rendering"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_1

    :cond_6
    const/4 v4, 0x2

    goto :goto_1

    :sswitch_7
    const-string v3, "vendor_id"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_1

    :cond_7
    const/4 v4, 0x1

    goto :goto_1

    :sswitch_8
    const-string v3, "npot_support"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_1

    :cond_8
    const/4 v4, 0x0

    :goto_1
    packed-switch v4, :pswitch_data_0

    if-nez v1, :cond_9

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_9
    invoke-virtual {p0, p1, v1, v2}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->e:Ljava/lang/Integer;

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->f:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->h:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->d:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->a:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {p0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->b:Ljava/lang/Integer;

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->g:Ljava/lang/Boolean;

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->c:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/i;->i:Ljava/lang/String;

    goto/16 :goto_0

    :cond_a
    iput-object v1, v0, Lio/sentry/protocol/i;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x54c03d49 -> :sswitch_8
        -0x40ba988e -> :sswitch_7
        -0x3c27b144 -> :sswitch_6
        0xd1b -> :sswitch_5
        0x337a8b -> :sswitch_4
        0x38b9b22 -> :sswitch_3
        0x14f51cd8 -> :sswitch_2
        0x39aa0e3f -> :sswitch_1
        0x5490d47f -> :sswitch_0
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

.method public static g(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/m;
    .locals 5

    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/protocol/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_7

    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "kernel_version"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x5

    goto :goto_1

    :sswitch_1
    const-string v3, "version"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x4

    goto :goto_1

    :sswitch_2
    const-string v3, "build"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x3

    goto :goto_1

    :sswitch_3
    const-string v3, "name"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x2

    goto :goto_1

    :sswitch_4
    const-string v3, "raw_description"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    goto :goto_1

    :sswitch_5
    const-string v3, "rooted"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    packed-switch v4, :pswitch_data_0

    if-nez v1, :cond_6

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_6
    invoke-virtual {p0, p1, v1, v2}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/m;->e:Ljava/lang/String;

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/m;->b:Ljava/lang/String;

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/m;->d:Ljava/lang/String;

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/m;->a:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/m;->c:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {p0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/m;->f:Ljava/lang/Boolean;

    goto/16 :goto_0

    :cond_7
    iput-object v1, v0, Lio/sentry/protocol/m;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lio/sentry/A0;->i()V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x372722ff -> :sswitch_5
        -0x1437619b -> :sswitch_4
        0x337a8b -> :sswitch_3
        0x59bc66e -> :sswitch_2
        0x14f51cd8 -> :sswitch_1
        0x782282d6 -> :sswitch_0
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

.method public static h(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;
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

.method public static i(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;
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

.method public static j(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;
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
    .locals 37

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget v3, v1, Lio/sentry/clientreport/a;->a:I

    const-string v4, "data"

    const/16 v6, 0xc

    const/16 v7, 0xe

    const-string v8, "start_timestamp"

    const-string v11, "version"

    const-string v12, "type"

    const-string v14, "name"

    const-string v15, "timestamp"

    const/16 v16, 0x8

    const/4 v5, 0x7

    const/16 v17, 0x6

    const/16 v18, 0x5

    const/16 v19, 0x4

    const-wide v20, 0x408f400000000000L    # 1000.0

    const/4 v9, 0x3

    const/16 v22, -0x1

    const/16 v23, 0x0

    const/4 v10, 0x1

    const/16 v24, 0x0

    packed-switch v3, :pswitch_data_0

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/protocol/A;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Lio/sentry/d2;

    sget-object v11, Lio/sentry/protocol/C;->CUSTOM:Lio/sentry/protocol/C;

    invoke-virtual {v11}, Lio/sentry/protocol/C;->apiName()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v6, v10, v11}, Lio/sentry/d2;-><init>(ILjava/lang/Object;)V

    invoke-direct {v3, v4, v5, v6}, Lio/sentry/protocol/A;-><init>(Ljava/util/ArrayList;Ljava/util/HashMap;Lio/sentry/d2;)V

    move-object/from16 v4, v24

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_c

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    :goto_1
    move/from16 v6, v22

    goto :goto_2

    :sswitch_0
    const-string v6, "transaction"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    move/from16 v6, v17

    goto :goto_2

    :sswitch_1
    const-string v6, "transaction_info"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v6, v18

    goto :goto_2

    :sswitch_2
    const-string v6, "spans"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    move/from16 v6, v19

    goto :goto_2

    :sswitch_3
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    move v6, v9

    goto :goto_2

    :sswitch_4
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    const/4 v6, 0x2

    goto :goto_2

    :sswitch_5
    const-string v6, "measurements"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_1

    :cond_6
    move v6, v10

    goto :goto_2

    :sswitch_6
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    move/from16 v6, v23

    :goto_2
    packed-switch v6, :pswitch_data_1

    invoke-static {v3, v5, v0, v2}, Lio/sentry/config/a;->g(Lio/sentry/C1;Ljava/lang/String;Lio/sentry/A0;Lio/sentry/ILogger;)Z

    move-result v6

    if-nez v6, :cond_0

    if-nez v4, :cond_8

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_8
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/A;->p:Ljava/lang/String;

    goto :goto_0

    :pswitch_1
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v5, v24

    move-object v6, v5

    :goto_3
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v11

    sget-object v13, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v11, v13, :cond_b

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v13, "source"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    if-nez v6, :cond_9

    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_9
    invoke-virtual {v0, v2, v6, v11}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_b
    new-instance v11, Lio/sentry/d2;

    invoke-direct {v11, v10, v5}, Lio/sentry/d2;-><init>(ILjava/lang/Object;)V

    iput-object v6, v11, Lio/sentry/d2;->c:Ljava/util/AbstractMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    iput-object v11, v3, Lio/sentry/protocol/A;->u:Lio/sentry/d2;

    goto/16 :goto_0

    :pswitch_2
    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v6, 0x19

    invoke-direct {v5, v6}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v5}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_0

    iget-object v6, v3, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    :pswitch_3
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_0

    iput-object v5, v3, Lio/sentry/protocol/A;->r:Ljava/lang/Double;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    long-to-double v5, v5

    div-double v5, v5, v20

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/A;->r:Ljava/lang/Double;

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_5
    new-instance v5, Lio/sentry/clientreport/a;

    invoke-direct {v5, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v5}, Lio/sentry/A0;->x(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/HashMap;

    move-result-object v5

    if-eqz v5, :cond_0

    iget-object v6, v3, Lio/sentry/protocol/A;->t:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    goto/16 :goto_0

    :pswitch_6
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_0

    iput-object v5, v3, Lio/sentry/protocol/A;->q:Ljava/lang/Double;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    long-to-double v5, v5

    div-double v5, v5, v20

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/A;->q:Ljava/lang/Double;

    goto/16 :goto_0

    :cond_c
    iput-object v4, v3, Lio/sentry/protocol/A;->v:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_7
    new-instance v3, Lio/sentry/protocol/z;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v4, v24

    :cond_d
    :goto_4
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v8, :cond_19

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_1

    :goto_5
    move/from16 v8, v22

    goto/16 :goto_6

    :sswitch_7
    const-string v8, "stacktrace"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_5

    :cond_e
    const/16 v8, 0x9

    goto/16 :goto_6

    :sswitch_8
    const-string v8, "current"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_5

    :cond_f
    move/from16 v8, v16

    goto/16 :goto_6

    :sswitch_9
    const-string v8, "crashed"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto :goto_5

    :cond_10
    move v8, v5

    goto :goto_6

    :sswitch_a
    const-string v8, "state"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    goto :goto_5

    :cond_11
    move/from16 v8, v17

    goto :goto_6

    :sswitch_b
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    goto :goto_5

    :cond_12
    move/from16 v8, v18

    goto :goto_6

    :sswitch_c
    const-string v8, "main"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    goto :goto_5

    :cond_13
    move/from16 v8, v19

    goto :goto_6

    :sswitch_d
    const-string v8, "id"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    goto :goto_5

    :cond_14
    move v8, v9

    goto :goto_6

    :sswitch_e
    const-string v8, "held_locks"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    goto :goto_5

    :cond_15
    const/4 v8, 0x2

    goto :goto_6

    :sswitch_f
    const-string v8, "priority"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_16

    goto :goto_5

    :cond_16
    move v8, v10

    goto :goto_6

    :sswitch_10
    const-string v8, "daemon"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    goto :goto_5

    :cond_17
    move/from16 v8, v23

    :goto_6
    packed-switch v8, :pswitch_data_2

    if-nez v4, :cond_18

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_18
    invoke-virtual {v0, v2, v4, v7}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_4

    :pswitch_8
    new-instance v7, Lio/sentry/clientreport/a;

    const/16 v8, 0x1b

    invoke-direct {v7, v8}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v7}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/protocol/y;

    iput-object v7, v3, Lio/sentry/protocol/z;->i:Lio/sentry/protocol/y;

    goto/16 :goto_4

    :pswitch_9
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/z;->f:Ljava/lang/Boolean;

    goto/16 :goto_4

    :pswitch_a
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/z;->e:Ljava/lang/Boolean;

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/z;->d:Ljava/lang/String;

    goto/16 :goto_4

    :pswitch_c
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/z;->c:Ljava/lang/String;

    goto/16 :goto_4

    :pswitch_d
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/z;->h:Ljava/lang/Boolean;

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/z;->a:Ljava/lang/Long;

    goto/16 :goto_4

    :pswitch_f
    new-instance v7, Lio/sentry/e;

    invoke-direct {v7, v6}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v7}, Lio/sentry/A0;->x(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/HashMap;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8, v7}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v8, v3, Lio/sentry/protocol/z;->j:Ljava/util/Map;

    goto/16 :goto_4

    :pswitch_10
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/z;->b:Ljava/lang/Integer;

    goto/16 :goto_4

    :pswitch_11
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/z;->g:Ljava/lang/Boolean;

    goto/16 :goto_4

    :cond_19
    iput-object v4, v3, Lio/sentry/protocol/z;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_12
    new-instance v3, Lio/sentry/protocol/y;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v4, v24

    :goto_7
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_1e

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_2

    :goto_8
    move/from16 v6, v22

    goto :goto_9

    :sswitch_11
    const-string v6, "snapshot"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1a

    goto :goto_8

    :cond_1a
    const/4 v6, 0x2

    goto :goto_9

    :sswitch_12
    const-string v6, "registers"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    goto :goto_8

    :cond_1b
    move v6, v10

    goto :goto_9

    :sswitch_13
    const-string v6, "frames"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    goto :goto_8

    :cond_1c
    move/from16 v6, v23

    :goto_9
    packed-switch v6, :pswitch_data_3

    if-nez v4, :cond_1d

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_1d
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_7

    :pswitch_13
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/y;->c:Ljava/lang/Boolean;

    goto :goto_7

    :pswitch_14
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-static {v5}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/y;->b:Ljava/util/concurrent/ConcurrentHashMap;

    goto :goto_7

    :pswitch_15
    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v6, 0x1a

    invoke-direct {v5, v6}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v5}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/y;->a:Ljava/util/List;

    goto :goto_7

    :cond_1e
    iput-object v4, v3, Lio/sentry/protocol/y;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_16
    new-instance v3, Lio/sentry/protocol/x;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v4, v24

    :goto_a
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v8

    sget-object v11, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v8, v11, :cond_35

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_3

    :goto_b
    move/from16 v11, v22

    goto/16 :goto_c

    :sswitch_14
    const-string v11, "platform"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1f

    goto :goto_b

    :cond_1f
    const/16 v11, 0x14

    goto/16 :goto_c

    :sswitch_15
    const-string v11, "abs_path"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_20

    goto :goto_b

    :cond_20
    const/16 v11, 0x13

    goto/16 :goto_c

    :sswitch_16
    const-string v11, "function"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_21

    goto :goto_b

    :cond_21
    const/16 v11, 0x12

    goto/16 :goto_c

    :sswitch_17
    const-string v11, "context_line"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_22

    goto :goto_b

    :cond_22
    const/16 v11, 0x11

    goto/16 :goto_c

    :sswitch_18
    const-string v11, "addr_mode"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_23

    goto :goto_b

    :cond_23
    const/16 v11, 0x10

    goto/16 :goto_c

    :sswitch_19
    const-string v11, "pre_context"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_24

    goto :goto_b

    :cond_24
    const/16 v11, 0xf

    goto/16 :goto_c

    :sswitch_1a
    const-string v11, "instruction_addr"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_25

    goto :goto_b

    :cond_25
    move v11, v7

    goto/16 :goto_c

    :sswitch_1b
    const-string v11, "colno"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_26

    goto :goto_b

    :cond_26
    const/16 v11, 0xd

    goto/16 :goto_c

    :sswitch_1c
    const-string v11, "vars"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_27

    goto :goto_b

    :cond_27
    move v11, v6

    goto/16 :goto_c

    :sswitch_1d
    const-string v11, "lock"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_28

    goto :goto_b

    :cond_28
    const/16 v11, 0xb

    goto/16 :goto_c

    :sswitch_1e
    const-string v11, "symbol_addr"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_29

    goto/16 :goto_b

    :cond_29
    const/16 v11, 0xa

    goto/16 :goto_c

    :sswitch_1f
    const-string v11, "filename"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2a

    goto/16 :goto_b

    :cond_2a
    const/16 v11, 0x9

    goto/16 :goto_c

    :sswitch_20
    const-string v11, "package"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2b

    goto/16 :goto_b

    :cond_2b
    move/from16 v11, v16

    goto/16 :goto_c

    :sswitch_21
    const-string v11, "symbol"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2c

    goto/16 :goto_b

    :cond_2c
    move v11, v5

    goto :goto_c

    :sswitch_22
    const-string v11, "native"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2d

    goto/16 :goto_b

    :cond_2d
    move/from16 v11, v17

    goto :goto_c

    :sswitch_23
    const-string v11, "module"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2e

    goto/16 :goto_b

    :cond_2e
    move/from16 v11, v18

    goto :goto_c

    :sswitch_24
    const-string v11, "lineno"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2f

    goto/16 :goto_b

    :cond_2f
    move/from16 v11, v19

    goto :goto_c

    :sswitch_25
    const-string v11, "raw_function"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_30

    goto/16 :goto_b

    :cond_30
    move v11, v9

    goto :goto_c

    :sswitch_26
    const-string v11, "in_app"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_31

    goto/16 :goto_b

    :cond_31
    const/4 v11, 0x2

    goto :goto_c

    :sswitch_27
    const-string v11, "image_addr"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_32

    goto/16 :goto_b

    :cond_32
    move v11, v10

    goto :goto_c

    :sswitch_28
    const-string v11, "post_context"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_33

    goto/16 :goto_b

    :cond_33
    move/from16 v11, v23

    :goto_c
    packed-switch v11, :pswitch_data_4

    if-nez v4, :cond_34

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_34
    invoke-virtual {v0, v2, v4, v8}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_a

    :pswitch_17
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->n:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_18
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->i:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_19
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->e:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_1a
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->j:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_1b
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->r:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_1c
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    iput-object v8, v3, Lio/sentry/protocol/x;->a:Ljava/util/List;

    goto/16 :goto_a

    :pswitch_1d
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->q:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_1e
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->h:Ljava/lang/Integer;

    goto/16 :goto_a

    :pswitch_1f
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    iput-object v8, v3, Lio/sentry/protocol/x;->c:Ljava/util/Map;

    goto/16 :goto_a

    :pswitch_20
    new-instance v8, Lio/sentry/e;

    invoke-direct {v8, v6}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v8}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/b2;

    iput-object v8, v3, Lio/sentry/protocol/x;->v:Lio/sentry/b2;

    goto/16 :goto_a

    :pswitch_21
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->p:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_22
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->d:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_23
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->l:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_24
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->s:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_25
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->m:Ljava/lang/Boolean;

    goto/16 :goto_a

    :pswitch_26
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->f:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_27
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->g:Ljava/lang/Integer;

    goto/16 :goto_a

    :pswitch_28
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->u:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_29
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->k:Ljava/lang/Boolean;

    goto/16 :goto_a

    :pswitch_2a
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v3, Lio/sentry/protocol/x;->o:Ljava/lang/String;

    goto/16 :goto_a

    :pswitch_2b
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    iput-object v8, v3, Lio/sentry/protocol/x;->b:Ljava/util/List;

    goto/16 :goto_a

    :cond_35
    iput-object v4, v3, Lio/sentry/protocol/x;->t:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_2c
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v3, v24

    move-object v6, v3

    move-object v11, v6

    move-object/from16 v25, v11

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v36, v33

    :goto_d
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v12

    sget-object v14, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v12, v14, :cond_45

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_4

    :goto_e
    move/from16 v14, v22

    goto/16 :goto_f

    :sswitch_29
    const-string v14, "trace_id"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_36

    goto :goto_e

    :cond_36
    const/16 v14, 0xb

    goto/16 :goto_f

    :sswitch_2a
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_37

    goto :goto_e

    :cond_37
    const/16 v14, 0xa

    goto/16 :goto_f

    :sswitch_2b
    const-string v14, "tags"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_38

    goto :goto_e

    :cond_38
    const/16 v14, 0x9

    goto/16 :goto_f

    :sswitch_2c
    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_39

    goto :goto_e

    :cond_39
    move/from16 v14, v16

    goto/16 :goto_f

    :sswitch_2d
    const-string v14, "op"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3a

    goto :goto_e

    :cond_3a
    move v14, v5

    goto :goto_f

    :sswitch_2e
    const-string v14, "measurements"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3b

    goto :goto_e

    :cond_3b
    move/from16 v14, v17

    goto :goto_f

    :sswitch_2f
    const-string v14, "status"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3c

    goto :goto_e

    :cond_3c
    move/from16 v14, v18

    goto :goto_f

    :sswitch_30
    const-string v14, "origin"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3d

    goto :goto_e

    :cond_3d
    move/from16 v14, v19

    goto :goto_f

    :sswitch_31
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3e

    goto :goto_e

    :cond_3e
    move v14, v9

    goto :goto_f

    :sswitch_32
    const-string v14, "description"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3f

    goto :goto_e

    :cond_3f
    const/4 v14, 0x2

    goto :goto_f

    :sswitch_33
    const-string v14, "parent_span_id"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_40

    goto :goto_e

    :cond_40
    move v14, v10

    goto :goto_f

    :sswitch_34
    const-string v14, "span_id"

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_41

    goto/16 :goto_e

    :cond_41
    move/from16 v14, v23

    :goto_f
    packed-switch v14, :pswitch_data_5

    if-nez v3, :cond_42

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_42
    invoke-virtual {v0, v2, v3, v12}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_d

    :pswitch_2d
    new-instance v12, Lio/sentry/protocol/t;

    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v12, v14}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    move-object/from16 v27, v12

    goto/16 :goto_d

    :pswitch_2e
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v26
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_d

    :catch_2
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v12

    if-eqz v12, :cond_43

    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    long-to-double v12, v13

    div-double v12, v12, v20

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    move-object/from16 v26, v12

    goto/16 :goto_d

    :cond_43
    move-object/from16 v26, v24

    goto/16 :goto_d

    :pswitch_2f
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    goto/16 :goto_d

    :pswitch_30
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v36, v12

    check-cast v36, Ljava/util/Map;

    goto/16 :goto_d

    :pswitch_31
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v30

    goto/16 :goto_d

    :pswitch_32
    new-instance v11, Lio/sentry/clientreport/a;

    invoke-direct {v11, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v11}, Lio/sentry/A0;->x(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/HashMap;

    move-result-object v11

    goto/16 :goto_d

    :pswitch_33
    new-instance v12, Lio/sentry/e;

    const/16 v13, 0x16

    invoke-direct {v12, v13}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v12}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v32, v12

    check-cast v32, Lio/sentry/L2;

    goto/16 :goto_d

    :pswitch_34
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v33

    goto/16 :goto_d

    :pswitch_35
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v25
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_d

    :catch_3
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v12

    if-eqz v12, :cond_44

    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    long-to-double v12, v12

    div-double v12, v12, v20

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    move-object/from16 v25, v12

    goto/16 :goto_d

    :cond_44
    move-object/from16 v25, v24

    goto/16 :goto_d

    :pswitch_36
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v31

    goto/16 :goto_d

    :pswitch_37
    new-instance v12, Lio/sentry/e;

    const/16 v13, 0x15

    invoke-direct {v12, v13}, Lio/sentry/e;-><init>(I)V

    invoke-virtual {v0, v2, v12}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v29, v12

    check-cast v29, Lio/sentry/K2;

    goto/16 :goto_d

    :pswitch_38
    new-instance v12, Lio/sentry/K2;

    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Lio/sentry/K2;-><init>(Ljava/lang/String;)V

    move-object/from16 v28, v12

    goto/16 :goto_d

    :cond_45
    if-eqz v25, :cond_4b

    if-eqz v27, :cond_4a

    if-eqz v28, :cond_49

    if-eqz v30, :cond_48

    if-nez v6, :cond_46

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_46
    move-object/from16 v34, v6

    if-nez v11, :cond_47

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    :cond_47
    move-object/from16 v35, v11

    new-instance v24, Lio/sentry/protocol/w;

    invoke-direct/range {v24 .. v36}, Lio/sentry/protocol/w;-><init>(Ljava/lang/Double;Ljava/lang/Double;Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/K2;Ljava/lang/String;Ljava/lang/String;Lio/sentry/L2;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    move-object/from16 v2, v24

    iput-object v3, v2, Lio/sentry/protocol/w;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v2

    :cond_48
    const-string v0, "op"

    invoke-static {v0, v2}, Lio/sentry/clientreport/a;->j(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_49
    const-string v0, "span_id"

    invoke-static {v0, v2}, Lio/sentry/clientreport/a;->j(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_4a
    const-string v0, "trace_id"

    invoke-static {v0, v2}, Lio/sentry/clientreport/a;->j(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_4b
    invoke-static {v8, v2}, Lio/sentry/clientreport/a;->j(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :pswitch_39
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/protocol/v;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, v24

    :goto_10
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_50

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_5

    :goto_11
    move/from16 v6, v22

    goto :goto_12

    :sswitch_35
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4c

    goto :goto_11

    :cond_4c
    const/4 v6, 0x2

    goto :goto_12

    :sswitch_36
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4d

    goto :goto_11

    :cond_4d
    move v6, v10

    goto :goto_12

    :sswitch_37
    const-string v6, "raw_description"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4e

    goto :goto_11

    :cond_4e
    move/from16 v6, v23

    :goto_12
    packed-switch v6, :pswitch_data_6

    if-nez v4, :cond_4f

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_4f
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_10

    :pswitch_3a
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/v;->b:Ljava/lang/String;

    goto :goto_10

    :pswitch_3b
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/v;->a:Ljava/lang/String;

    goto :goto_10

    :pswitch_3c
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/v;->c:Ljava/lang/String;

    goto :goto_10

    :cond_50
    iput-object v4, v3, Lio/sentry/protocol/v;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_3d
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v3, v24

    move-object v4, v3

    move-object v5, v4

    :goto_13
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v6

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v6, v7, :cond_54

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_53

    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_52

    if-nez v5, :cond_51

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_51
    invoke-virtual {v0, v2, v5, v6}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_13

    :cond_52
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v4

    goto :goto_13

    :cond_53
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v3

    goto :goto_13

    :cond_54
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v3, :cond_56

    if-eqz v4, :cond_55

    new-instance v0, Lio/sentry/protocol/u;

    invoke-direct {v0, v3, v4}, Lio/sentry/protocol/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, v0, Lio/sentry/protocol/u;->c:Ljava/util/HashMap;

    return-object v0

    :cond_55
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Missing required field \"version\""

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v4, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_56
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Missing required field \"name\""

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v4, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_3e
    new-instance v2, Lio/sentry/protocol/t;

    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_3f
    new-instance v3, Lio/sentry/protocol/s;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v4, v24

    :goto_14
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_5e

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_6

    :goto_15
    move/from16 v6, v22

    goto :goto_16

    :sswitch_38
    const-string v6, "stacktrace"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_57

    goto :goto_15

    :cond_57
    move/from16 v6, v18

    goto :goto_16

    :sswitch_39
    const-string v6, "mechanism"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_58

    goto :goto_15

    :cond_58
    move/from16 v6, v19

    goto :goto_16

    :sswitch_3a
    const-string v6, "value"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_59

    goto :goto_15

    :cond_59
    move v6, v9

    goto :goto_16

    :sswitch_3b
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5a

    goto :goto_15

    :cond_5a
    const/4 v6, 0x2

    goto :goto_16

    :sswitch_3c
    const-string v6, "module"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5b

    goto :goto_15

    :cond_5b
    move v6, v10

    goto :goto_16

    :sswitch_3d
    const-string v6, "thread_id"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5c

    goto :goto_15

    :cond_5c
    move/from16 v6, v23

    :goto_16
    packed-switch v6, :pswitch_data_7

    if-nez v4, :cond_5d

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    :cond_5d
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_14

    :pswitch_40
    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v6, 0x1b

    invoke-direct {v5, v6}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v5}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/y;

    iput-object v5, v3, Lio/sentry/protocol/s;->e:Lio/sentry/protocol/y;

    goto :goto_14

    :pswitch_41
    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v6, 0xf

    invoke-direct {v5, v6}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v5}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/k;

    iput-object v5, v3, Lio/sentry/protocol/s;->f:Lio/sentry/protocol/k;

    goto/16 :goto_14

    :pswitch_42
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/s;->b:Ljava/lang/String;

    goto/16 :goto_14

    :pswitch_43
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/s;->a:Ljava/lang/String;

    goto/16 :goto_14

    :pswitch_44
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/s;->c:Ljava/lang/String;

    goto/16 :goto_14

    :pswitch_45
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/s;->d:Ljava/lang/Long;

    goto/16 :goto_14

    :cond_5e
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    iput-object v4, v3, Lio/sentry/protocol/s;->g:Ljava/util/HashMap;

    return-object v3

    :pswitch_46
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v5, v24

    move-object v6, v5

    move-object v7, v6

    :cond_5f
    :goto_17
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v8

    sget-object v12, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v8, v12, :cond_65

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_7

    :goto_18
    move/from16 v12, v22

    goto :goto_19

    :sswitch_3e
    const-string v12, "integrations"

    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_60

    goto :goto_18

    :cond_60
    move v12, v9

    goto :goto_19

    :sswitch_3f
    const-string v12, "packages"

    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_61

    goto :goto_18

    :cond_61
    const/4 v12, 0x2

    goto :goto_19

    :sswitch_40
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_62

    goto :goto_18

    :cond_62
    move v12, v10

    goto :goto_19

    :sswitch_41
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_63

    goto :goto_18

    :cond_63
    move/from16 v12, v23

    :goto_19
    packed-switch v12, :pswitch_data_8

    if-nez v7, :cond_64

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    :cond_64
    invoke-virtual {v0, v2, v7, v8}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_17

    :pswitch_47
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_5f

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_17

    :pswitch_48
    new-instance v8, Lio/sentry/clientreport/a;

    const/16 v12, 0x17

    invoke-direct {v8, v12}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v8}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v8

    if-eqz v8, :cond_5f

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_17

    :pswitch_49
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v6

    goto :goto_17

    :pswitch_4a
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v5

    goto :goto_17

    :cond_65
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v5, :cond_67

    if-eqz v6, :cond_66

    new-instance v0, Lio/sentry/protocol/r;

    invoke-direct {v0, v5, v6}, Lio/sentry/protocol/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Lio/sentry/protocol/r;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v2, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Lio/sentry/protocol/r;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput-object v7, v0, Lio/sentry/protocol/r;->e:Ljava/util/HashMap;

    return-object v0

    :cond_66
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Missing required field \"version\""

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v4, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_67
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Missing required field \"name\""

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v4, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_4b
    new-instance v3, Lio/sentry/protocol/q;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v4, v24

    :goto_1a
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_6d

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_8

    :goto_1b
    move/from16 v6, v22

    goto :goto_1c

    :sswitch_42
    const-string v6, "version_minor"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_68

    goto :goto_1b

    :cond_68
    move v6, v9

    goto :goto_1c

    :sswitch_43
    const-string v6, "version_major"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_69

    goto :goto_1b

    :cond_69
    const/4 v6, 0x2

    goto :goto_1c

    :sswitch_44
    const-string v6, "version_patchlevel"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6a

    goto :goto_1b

    :cond_6a
    move v6, v10

    goto :goto_1c

    :sswitch_45
    const-string v6, "sdk_name"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6b

    goto :goto_1b

    :cond_6b
    move/from16 v6, v23

    :goto_1c
    packed-switch v6, :pswitch_data_9

    if-nez v4, :cond_6c

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    :cond_6c
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_1a

    :pswitch_4c
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/q;->c:Ljava/lang/Integer;

    goto :goto_1a

    :pswitch_4d
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/q;->b:Ljava/lang/Integer;

    goto :goto_1a

    :pswitch_4e
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/q;->d:Ljava/lang/Integer;

    goto :goto_1a

    :pswitch_4f
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/q;->a:Ljava/lang/String;

    goto :goto_1a

    :cond_6d
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    iput-object v4, v3, Lio/sentry/protocol/q;->e:Ljava/util/HashMap;

    return-object v3

    :pswitch_50
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/protocol/n;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object/from16 v6, v24

    :cond_6e
    :goto_1d
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v8, :cond_7b

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_9

    :goto_1e
    move/from16 v8, v22

    goto/16 :goto_1f

    :sswitch_46
    const-string v8, "api_target"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6f

    goto :goto_1e

    :cond_6f
    const/16 v8, 0xa

    goto/16 :goto_1f

    :sswitch_47
    const-string v8, "query_string"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_70

    goto :goto_1e

    :cond_70
    const/16 v8, 0x9

    goto/16 :goto_1f

    :sswitch_48
    const-string v8, "body_size"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_71

    goto :goto_1e

    :cond_71
    move/from16 v8, v16

    goto/16 :goto_1f

    :sswitch_49
    const-string v8, "cookies"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_72

    goto :goto_1e

    :cond_72
    move v8, v5

    goto :goto_1f

    :sswitch_4a
    const-string v8, "headers"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_73

    goto :goto_1e

    :cond_73
    move/from16 v8, v17

    goto :goto_1f

    :sswitch_4b
    const-string v8, "other"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_74

    goto :goto_1e

    :cond_74
    move/from16 v8, v18

    goto :goto_1f

    :sswitch_4c
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_75

    goto :goto_1e

    :cond_75
    move/from16 v8, v19

    goto :goto_1f

    :sswitch_4d
    const-string v8, "url"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_76

    goto :goto_1e

    :cond_76
    move v8, v9

    goto :goto_1f

    :sswitch_4e
    const-string v8, "env"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_77

    goto :goto_1e

    :cond_77
    const/4 v8, 0x2

    goto :goto_1f

    :sswitch_4f
    const-string v8, "method"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_78

    goto :goto_1e

    :cond_78
    move v8, v10

    goto :goto_1f

    :sswitch_50
    const-string v8, "fragment"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_79

    goto/16 :goto_1e

    :cond_79
    move/from16 v8, v23

    :goto_1f
    packed-switch v8, :pswitch_data_a

    if-nez v6, :cond_7a

    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_7a
    invoke-virtual {v0, v2, v6, v7}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_1d

    :pswitch_51
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->k:Ljava/lang/String;

    goto/16 :goto_1d

    :pswitch_52
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->c:Ljava/lang/String;

    goto/16 :goto_1d

    :pswitch_53
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->h:Ljava/lang/Long;

    goto/16 :goto_1d

    :pswitch_54
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->e:Ljava/lang/String;

    goto/16 :goto_1d

    :pswitch_55
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    if-eqz v7, :cond_6e

    invoke-static {v7}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->f:Ljava/util/concurrent/ConcurrentHashMap;

    goto/16 :goto_1d

    :pswitch_56
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    if-eqz v7, :cond_6e

    invoke-static {v7}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->i:Ljava/util/concurrent/ConcurrentHashMap;

    goto/16 :goto_1d

    :pswitch_57
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->d:Ljava/lang/Object;

    goto/16 :goto_1d

    :pswitch_58
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->a:Ljava/lang/String;

    goto/16 :goto_1d

    :pswitch_59
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    if-eqz v7, :cond_6e

    invoke-static {v7}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->g:Ljava/util/concurrent/ConcurrentHashMap;

    goto/16 :goto_1d

    :pswitch_5a
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->b:Ljava/lang/String;

    goto/16 :goto_1d

    :pswitch_5b
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/n;->j:Ljava/lang/String;

    goto/16 :goto_1d

    :cond_7b
    iput-object v6, v3, Lio/sentry/protocol/n;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_5c
    invoke-static/range {p1 .. p2}, Lio/sentry/clientreport/a;->g(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/m;

    move-result-object v0

    return-object v0

    :pswitch_5d
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/protocol/l;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, v24

    :cond_7c
    :goto_20
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_81

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_a

    :goto_21
    move/from16 v6, v22

    goto :goto_22

    :sswitch_51
    const-string v6, "formatted"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7d

    goto :goto_21

    :cond_7d
    const/4 v6, 0x2

    goto :goto_22

    :sswitch_52
    const-string v6, "message"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7e

    goto :goto_21

    :cond_7e
    move v6, v10

    goto :goto_22

    :sswitch_53
    const-string v6, "params"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7f

    goto :goto_21

    :cond_7f
    move/from16 v6, v23

    :goto_22
    packed-switch v6, :pswitch_data_b

    if-nez v4, :cond_80

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_80
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_20

    :pswitch_5e
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/l;->a:Ljava/lang/String;

    goto :goto_20

    :pswitch_5f
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/l;->b:Ljava/lang/String;

    goto :goto_20

    :pswitch_60
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_7c

    iput-object v5, v3, Lio/sentry/protocol/l;->c:Ljava/util/List;

    goto :goto_20

    :cond_81
    iput-object v4, v3, Lio/sentry/protocol/l;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_61
    new-instance v3, Lio/sentry/protocol/k;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v6, v24

    :goto_23
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v8, :cond_8d

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_b

    :goto_24
    move/from16 v8, v22

    goto/16 :goto_25

    :sswitch_54
    const-string v8, "parent_id"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_82

    goto :goto_24

    :cond_82
    const/16 v8, 0x9

    goto/16 :goto_25

    :sswitch_55
    const-string v8, "help_link"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_83

    goto :goto_24

    :cond_83
    move/from16 v8, v16

    goto/16 :goto_25

    :sswitch_56
    const-string v8, "is_exception_group"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_84

    goto :goto_24

    :cond_84
    move v8, v5

    goto :goto_25

    :sswitch_57
    const-string v8, "synthetic"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_85

    goto :goto_24

    :cond_85
    move/from16 v8, v17

    goto :goto_25

    :sswitch_58
    const-string v8, "handled"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_86

    goto :goto_24

    :cond_86
    move/from16 v8, v18

    goto :goto_25

    :sswitch_59
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_87

    goto :goto_24

    :cond_87
    move/from16 v8, v19

    goto :goto_25

    :sswitch_5a
    const-string v8, "meta"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_88

    goto :goto_24

    :cond_88
    move v8, v9

    goto :goto_25

    :sswitch_5b
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_89

    goto :goto_24

    :cond_89
    const/4 v8, 0x2

    goto :goto_25

    :sswitch_5c
    const-string v8, "exception_id"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8a

    goto :goto_24

    :cond_8a
    move v8, v10

    goto :goto_25

    :sswitch_5d
    const-string v8, "description"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8b

    goto :goto_24

    :cond_8b
    move/from16 v8, v23

    :goto_25
    packed-switch v8, :pswitch_data_c

    if-nez v6, :cond_8c

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_8c
    invoke-virtual {v0, v2, v6, v7}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_23

    :pswitch_62
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->i:Ljava/lang/Integer;

    goto/16 :goto_23

    :pswitch_63
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->c:Ljava/lang/String;

    goto/16 :goto_23

    :pswitch_64
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->j:Ljava/lang/Boolean;

    goto/16 :goto_23

    :pswitch_65
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->g:Ljava/lang/Boolean;

    goto/16 :goto_23

    :pswitch_66
    invoke-virtual {v0}, Lio/sentry/A0;->l()Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->d:Ljava/lang/Boolean;

    goto/16 :goto_23

    :pswitch_67
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->a:Ljava/lang/String;

    goto/16 :goto_23

    :pswitch_68
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    invoke-static {v7}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->e:Ljava/util/concurrent/ConcurrentHashMap;

    goto/16 :goto_23

    :pswitch_69
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    invoke-static {v7}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->f:Ljava/util/concurrent/ConcurrentHashMap;

    goto/16 :goto_23

    :pswitch_6a
    invoke-virtual {v0}, Lio/sentry/A0;->t()Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->h:Ljava/lang/Integer;

    goto/16 :goto_23

    :pswitch_6b
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lio/sentry/protocol/k;->b:Ljava/lang/String;

    goto/16 :goto_23

    :cond_8d
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    iput-object v6, v3, Lio/sentry/protocol/k;->k:Ljava/util/HashMap;

    return-object v3

    :pswitch_6c
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v3, v24

    move-object v4, v3

    move-object v5, v4

    :goto_26
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v6

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v6, v7, :cond_91

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "unit"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_90

    const-string v7, "value"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8f

    if-nez v5, :cond_8e

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_8e
    invoke-virtual {v0, v2, v5, v6}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_26

    :cond_8f
    invoke-virtual {v0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    goto :goto_26

    :cond_90
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    goto :goto_26

    :cond_91
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v3, :cond_92

    new-instance v0, Lio/sentry/protocol/j;

    invoke-direct {v0, v3, v4}, Lio/sentry/protocol/j;-><init>(Ljava/lang/Number;Ljava/lang/String;)V

    iput-object v5, v0, Lio/sentry/protocol/j;->d:Ljava/util/AbstractMap;

    return-object v0

    :cond_92
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Missing required field \"value\""

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v2, v4, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_6d
    invoke-static/range {p1 .. p2}, Lio/sentry/clientreport/a;->f(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/i;

    move-result-object v0

    return-object v0

    :pswitch_6e
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/protocol/h;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, v24

    :goto_27
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_97

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_c

    :goto_28
    move/from16 v6, v22

    goto :goto_29

    :sswitch_5e
    const-string v6, "country_code"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_93

    goto :goto_28

    :cond_93
    const/4 v6, 0x2

    goto :goto_29

    :sswitch_5f
    const-string v6, "city"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_94

    goto :goto_28

    :cond_94
    move v6, v10

    goto :goto_29

    :sswitch_60
    const-string v6, "region"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_95

    goto :goto_28

    :cond_95
    move/from16 v6, v23

    :goto_29
    packed-switch v6, :pswitch_data_d

    if-nez v4, :cond_96

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_96
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_27

    :pswitch_6f
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/h;->b:Ljava/lang/String;

    goto :goto_27

    :pswitch_70
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/h;->a:Ljava/lang/String;

    goto :goto_27

    :pswitch_71
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/h;->c:Ljava/lang/String;

    goto :goto_27

    :cond_97
    iput-object v4, v3, Lio/sentry/protocol/h;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_72
    invoke-static/range {p1 .. p2}, Lio/sentry/clientreport/a;->e(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/g;

    move-result-object v0

    return-object v0

    :pswitch_73
    invoke-virtual {v0}, Lio/sentry/A0;->B()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/protocol/e;->valueOf(Ljava/lang/String;)Lio/sentry/protocol/e;

    move-result-object v0

    return-object v0

    :pswitch_74
    invoke-static/range {p1 .. p2}, Lio/sentry/clientreport/a;->d(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/f;

    move-result-object v0

    return-object v0

    :pswitch_75
    new-instance v3, Lio/sentry/protocol/d;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v4, v24

    :goto_2a
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v6

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v6, v7, :cond_9b

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "images"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9a

    const-string v7, "sdk_info"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_99

    if-nez v4, :cond_98

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    :cond_98
    invoke-virtual {v0, v2, v4, v6}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_2a

    :cond_99
    new-instance v6, Lio/sentry/clientreport/a;

    const/16 v7, 0x13

    invoke-direct {v6, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v6}, Lio/sentry/A0;->A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/protocol/q;

    iput-object v6, v3, Lio/sentry/protocol/d;->a:Lio/sentry/protocol/q;

    goto :goto_2a

    :cond_9a
    new-instance v6, Lio/sentry/clientreport/a;

    invoke-direct {v6, v5}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v6}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v6

    iput-object v6, v3, Lio/sentry/protocol/d;->b:Ljava/util/List;

    goto :goto_2a

    :cond_9b
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    iput-object v4, v3, Lio/sentry/protocol/d;->c:Ljava/util/HashMap;

    return-object v3

    :pswitch_76
    new-instance v3, Lio/sentry/protocol/DebugImage;

    invoke-direct {v3}, Lio/sentry/protocol/DebugImage;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v4, v24

    :goto_2b
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v6

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v6, v7, :cond_a6

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_d

    :goto_2c
    move/from16 v7, v22

    goto/16 :goto_2d

    :sswitch_61
    const-string v7, "code_id"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9c

    goto :goto_2c

    :cond_9c
    move/from16 v7, v16

    goto/16 :goto_2d

    :sswitch_62
    const-string v7, "debug_id"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9d

    goto :goto_2c

    :cond_9d
    move v7, v5

    goto :goto_2d

    :sswitch_63
    const-string v7, "uuid"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9e

    goto :goto_2c

    :cond_9e
    move/from16 v7, v17

    goto :goto_2d

    :sswitch_64
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9f

    goto :goto_2c

    :cond_9f
    move/from16 v7, v18

    goto :goto_2d

    :sswitch_65
    const-string v7, "arch"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a0

    goto :goto_2c

    :cond_a0
    move/from16 v7, v19

    goto :goto_2d

    :sswitch_66
    const-string v7, "code_file"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a1

    goto :goto_2c

    :cond_a1
    move v7, v9

    goto :goto_2d

    :sswitch_67
    const-string v7, "image_size"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a2

    goto :goto_2c

    :cond_a2
    const/4 v7, 0x2

    goto :goto_2d

    :sswitch_68
    const-string v7, "image_addr"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a3

    goto :goto_2c

    :cond_a3
    move v7, v10

    goto :goto_2d

    :sswitch_69
    const-string v7, "debug_file"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a4

    goto :goto_2c

    :cond_a4
    move/from16 v7, v23

    :goto_2d
    packed-switch v7, :pswitch_data_e

    if-nez v4, :cond_a5

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    :cond_a5
    invoke-virtual {v0, v2, v4, v6}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_2b

    :pswitch_77
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$402(Lio/sentry/protocol/DebugImage;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_78
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$202(Lio/sentry/protocol/DebugImage;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_79
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$002(Lio/sentry/protocol/DebugImage;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_7a
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$102(Lio/sentry/protocol/DebugImage;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_7b
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$802(Lio/sentry/protocol/DebugImage;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_7c
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$502(Lio/sentry/protocol/DebugImage;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_7d
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$702(Lio/sentry/protocol/DebugImage;Ljava/lang/Long;)Ljava/lang/Long;

    goto/16 :goto_2b

    :pswitch_7e
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$602(Lio/sentry/protocol/DebugImage;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_7f
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lio/sentry/protocol/DebugImage;->access$302(Lio/sentry/protocol/DebugImage;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_2b

    :cond_a6
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    invoke-virtual {v3, v4}, Lio/sentry/protocol/DebugImage;->setUnknown(Ljava/util/Map;)V

    return-object v3

    :pswitch_80
    invoke-static/range {p1 .. p2}, Lio/sentry/clientreport/a;->c(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/c;

    move-result-object v0

    return-object v0

    :pswitch_81
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/protocol/b;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, v24

    :goto_2e
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_aa

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a9

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a8

    if-nez v4, :cond_a7

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_a7
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_2e

    :cond_a8
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/b;->b:Ljava/lang/String;

    goto :goto_2e

    :cond_a9
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/b;->a:Ljava/lang/String;

    goto :goto_2e

    :cond_aa
    iput-object v4, v3, Lio/sentry/protocol/b;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_82
    invoke-static/range {p1 .. p2}, Lio/sentry/clientreport/a;->b(Lio/sentry/A0;Lio/sentry/ILogger;)Lio/sentry/protocol/a;

    move-result-object v0

    return-object v0

    :pswitch_83
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/profilemeasurements/b;

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v3, v6, v7, v4, v5}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;J)V

    move-object/from16 v4, v24

    :cond_ab
    :goto_2f
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_b1

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_e

    :goto_30
    move/from16 v6, v22

    goto :goto_31

    :sswitch_6a
    const-string v6, "value"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_ac

    goto :goto_30

    :cond_ac
    const/4 v6, 0x2

    goto :goto_31

    :sswitch_6b
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_ad

    goto :goto_30

    :cond_ad
    move v6, v10

    goto :goto_31

    :sswitch_6c
    const-string v6, "elapsed_since_start_ns"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_ae

    goto :goto_30

    :cond_ae
    move/from16 v6, v23

    :goto_31
    packed-switch v6, :pswitch_data_f

    if-nez v4, :cond_af

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_af
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_2f

    :pswitch_84
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_ab

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    iput-wide v5, v3, Lio/sentry/profilemeasurements/b;->d:D

    goto :goto_2f

    :pswitch_85
    :try_start_4
    invoke-virtual {v0}, Lio/sentry/A0;->p()Ljava/lang/Double;

    move-result-object v5
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_32

    :catch_4
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_b0

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    long-to-double v5, v5

    div-double v5, v5, v20

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    goto :goto_32

    :cond_b0
    move-object/from16 v5, v24

    :goto_32
    if-eqz v5, :cond_ab

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    iput-wide v5, v3, Lio/sentry/profilemeasurements/b;->b:D

    goto :goto_2f

    :pswitch_86
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_ab

    iput-object v5, v3, Lio/sentry/profilemeasurements/b;->c:Ljava/lang/String;

    goto :goto_2f

    :cond_b1
    iput-object v4, v3, Lio/sentry/profilemeasurements/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_87
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    new-instance v3, Lio/sentry/profilemeasurements/a;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-string v5, "unknown"

    invoke-direct {v3, v5, v4}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/AbstractCollection;)V

    move-object/from16 v4, v24

    :cond_b2
    :goto_33
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_b6

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "values"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b5

    const-string v6, "unit"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b4

    if-nez v4, :cond_b3

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_b3
    invoke-virtual {v0, v2, v4, v5}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_33

    :cond_b4
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b2

    iput-object v5, v3, Lio/sentry/profilemeasurements/a;->b:Ljava/lang/String;

    goto :goto_33

    :cond_b5
    new-instance v5, Lio/sentry/clientreport/a;

    invoke-direct {v5, v9}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v5}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_b2

    iput-object v5, v3, Lio/sentry/profilemeasurements/a;->c:Ljava/util/Collection;

    goto :goto_33

    :cond_b6
    iput-object v4, v3, Lio/sentry/profilemeasurements/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    return-object v3

    :pswitch_88
    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v3, v24

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    :goto_34
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v8, :cond_bb

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_f

    :goto_35
    move/from16 v8, v22

    goto :goto_36

    :sswitch_6d
    const-string v8, "category"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b7

    goto :goto_35

    :cond_b7
    const/4 v8, 0x2

    goto :goto_36

    :sswitch_6e
    const-string v8, "reason"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b8

    goto :goto_35

    :cond_b8
    move v8, v10

    goto :goto_36

    :sswitch_6f
    const-string v8, "quantity"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b9

    goto :goto_35

    :cond_b9
    move/from16 v8, v23

    :goto_36
    packed-switch v8, :pswitch_data_10

    if-nez v6, :cond_ba

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_ba
    invoke-virtual {v0, v2, v6, v7}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_34

    :pswitch_89
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v4

    goto :goto_34

    :pswitch_8a
    invoke-virtual {v0}, Lio/sentry/A0;->C()Ljava/lang/String;

    move-result-object v3

    goto :goto_34

    :pswitch_8b
    invoke-virtual {v0}, Lio/sentry/A0;->w()Ljava/lang/Long;

    move-result-object v5

    goto :goto_34

    :cond_bb
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v3, :cond_be

    if-eqz v4, :cond_bd

    if-eqz v5, :cond_bc

    new-instance v0, Lio/sentry/clientreport/e;

    invoke-direct {v0, v3, v4, v5}, Lio/sentry/clientreport/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    iput-object v6, v0, Lio/sentry/clientreport/e;->d:Ljava/util/HashMap;

    return-object v0

    :cond_bc
    const-string v0, "quantity"

    invoke-static {v0, v2}, Lio/sentry/clientreport/a;->i(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_bd
    const-string v0, "category"

    invoke-static {v0, v2}, Lio/sentry/clientreport/a;->i(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_be
    const-string v0, "reason"

    invoke-static {v0, v2}, Lio/sentry/clientreport/a;->i(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :pswitch_8c
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lio/sentry/A0;->f()V

    move-object/from16 v4, v24

    move-object v5, v4

    :goto_37
    invoke-virtual {v0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v6

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v6, v7, :cond_c2

    invoke-virtual {v0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "discarded_events"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c1

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c0

    if-nez v5, :cond_bf

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_bf
    invoke-virtual {v0, v2, v5, v6}, Lio/sentry/A0;->D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_37

    :cond_c0
    invoke-virtual/range {p1 .. p2}, Lio/sentry/A0;->m(Lio/sentry/ILogger;)Ljava/util/Date;

    move-result-object v4

    goto :goto_37

    :cond_c1
    new-instance v6, Lio/sentry/clientreport/a;

    invoke-direct {v6, v10}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-virtual {v0, v2, v6}, Lio/sentry/A0;->u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_37

    :cond_c2
    invoke-virtual {v0}, Lio/sentry/A0;->i()V

    if-eqz v4, :cond_c4

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c3

    new-instance v0, Lio/sentry/clientreport/b;

    invoke-direct {v0, v4, v3}, Lio/sentry/clientreport/b;-><init>(Ljava/util/Date;Ljava/util/ArrayList;)V

    iput-object v5, v0, Lio/sentry/clientreport/b;->c:Ljava/util/HashMap;

    return-object v0

    :cond_c3
    const-string v0, "discarded_events"

    invoke-static {v0, v2}, Lio/sentry/clientreport/a;->h(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_c4
    invoke-static {v15, v2}, Lio/sentry/clientreport/a;->h(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8c
        :pswitch_88
        :pswitch_87
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_61
        :pswitch_5d
        :pswitch_5c
        :pswitch_50
        :pswitch_4b
        :pswitch_46
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_39
        :pswitch_2c
        :pswitch_16
        :pswitch_12
        :pswitch_7
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x5b03aa87 -> :sswitch_6
        -0x159763c9 -> :sswitch_5
        0x368f3a -> :sswitch_4
        0x3492916 -> :sswitch_3
        0x688f269 -> :sswitch_2
        0x1e52656f -> :sswitch_1
        0x7fa0d2de -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x4fd4e97c -> :sswitch_10
        -0x4577865c -> :sswitch_f
        -0x1df9e8e2 -> :sswitch_e
        0xd1b -> :sswitch_d
        0x3305b9 -> :sswitch_c
        0x337a8b -> :sswitch_b
        0x68ac491 -> :sswitch_a
        0x3d1e2286 -> :sswitch_9
        0x432bbd79 -> :sswitch_8
        0x7a8983bd -> :sswitch_7
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x4b7d7b5a -> :sswitch_13
        0x4a9a630 -> :sswitch_12
        0x10fad5c4 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x61d72af0 -> :sswitch_28
        -0x5607b3ab -> :sswitch_27
        -0x469863f9 -> :sswitch_26
        -0x426465f1 -> :sswitch_25
        -0x41b96f4b -> :sswitch_24
        -0x3fb45994 -> :sswitch_23
        -0x3ebdafe9 -> :sswitch_22
        -0x34e68a68 -> :sswitch_21
        -0x301acbba -> :sswitch_20
        -0x2bcbadf9 -> :sswitch_1f
        -0x13af61c8 -> :sswitch_1e
        0x32c52b -> :sswitch_1d
        0x371e2c -> :sswitch_1c
        0x5a72f41 -> :sswitch_1b
        0x18731102 -> :sswitch_1a
        0x31093c13 -> :sswitch_19
        0x33c92531 -> :sswitch_18
        0x428f6884 -> :sswitch_17
        0x524f73d8 -> :sswitch_16
        0x66211bd2 -> :sswitch_15
        0x6fbd6873 -> :sswitch_14
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        -0x77ea41d0 -> :sswitch_34
        -0x68c5dc65 -> :sswitch_33
        -0x66ca7c04 -> :sswitch_32
        -0x5b03aa87 -> :sswitch_31
        -0x3c1e50da -> :sswitch_30
        -0x3532300e -> :sswitch_2f
        -0x159763c9 -> :sswitch_2e
        0xde1 -> :sswitch_2d
        0x2eefaa -> :sswitch_2c
        0x363419 -> :sswitch_2b
        0x3492916 -> :sswitch_2a
        0x4bb73e55 -> :sswitch_29
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        -0x1437619b -> :sswitch_37
        0x337a8b -> :sswitch_36
        0x14f51cd8 -> :sswitch_35
    .end sparse-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
    .end packed-switch

    :sswitch_data_6
    .sparse-switch
        -0x5d1dd090 -> :sswitch_3d
        -0x3fb45994 -> :sswitch_3c
        0x368f3a -> :sswitch_3b
        0x6ac9171 -> :sswitch_3a
        0x49056359 -> :sswitch_39
        0x7a8983bd -> :sswitch_38
    .end sparse-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
    .end packed-switch

    :sswitch_data_7
    .sparse-switch
        0x337a8b -> :sswitch_41
        0x14f51cd8 -> :sswitch_40
        0x2cc154ed -> :sswitch_3f
        0x58a2451f -> :sswitch_3e
    .end sparse-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
    .end packed-switch

    :sswitch_data_8
    .sparse-switch
        0x101b0b70 -> :sswitch_45
        0x297daa03 -> :sswitch_44
        0x423c3392 -> :sswitch_43
        0x423fe58e -> :sswitch_42
    .end sparse-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
    .end packed-switch

    :sswitch_data_9
    .sparse-switch
        -0x625d1db0 -> :sswitch_50
        -0x403a2f1f -> :sswitch_4f
        0x188ed -> :sswitch_4e
        0x1c56f -> :sswitch_4d
        0x2eefaa -> :sswitch_4c
        0x6527f10 -> :sswitch_4b
        0x2f676f86 -> :sswitch_4a
        0x38c1428f -> :sswitch_49
        0x4aaf147e -> :sswitch_48
        0x5f165368 -> :sswitch_47
        0x760e4356 -> :sswitch_46
    .end sparse-switch

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
    .end packed-switch

    :sswitch_data_a
    .sparse-switch
        -0x3b55067a -> :sswitch_53
        0x38eb0007 -> :sswitch_52
        0x6bfab0bc -> :sswitch_51
    .end sparse-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        -0x66ca7c04 -> :sswitch_5d
        -0xffc74f5 -> :sswitch_5c
        0x2eefaa -> :sswitch_5b
        0x331605 -> :sswitch_5a
        0x368f3a -> :sswitch_59
        0x294b573c -> :sswitch_58
        0x3af4e745 -> :sswitch_57
        0x3d83417a -> :sswitch_56
        0x4d50fa38 -> :sswitch_55
        0x7b66b0d0 -> :sswitch_54
    .end sparse-switch

    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        -0x37b7d90c -> :sswitch_60
        0x2e996b -> :sswitch_5f
        0x58475cf6 -> :sswitch_5e
    .end sparse-switch

    :pswitch_data_d
    .packed-switch 0x0
        :pswitch_71
        :pswitch_70
        :pswitch_6f
    .end packed-switch

    :sswitch_data_d
    .sparse-switch
        -0x6db5ec18 -> :sswitch_69
        -0x5607b3ab -> :sswitch_68
        -0x55ff6f9b -> :sswitch_67
        -0x43335372 -> :sswitch_66
        0x2dd056 -> :sswitch_65
        0x368f3a -> :sswitch_64
        0x36f3bb -> :sswitch_63
        0x20a6d687 -> :sswitch_62
        0x382360ad -> :sswitch_61
    .end sparse-switch

    :pswitch_data_e
    .packed-switch 0x0
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
    .end packed-switch

    :sswitch_data_e
    .sparse-switch
        -0x65e390b6 -> :sswitch_6c
        0x3492916 -> :sswitch_6b
        0x6ac9171 -> :sswitch_6a
    .end sparse-switch

    :pswitch_data_f
    .packed-switch 0x0
        :pswitch_86
        :pswitch_85
        :pswitch_84
    .end packed-switch

    :sswitch_data_f
    .sparse-switch
        -0x4c979b75 -> :sswitch_6f
        -0x37ba6dbc -> :sswitch_6e
        0x302bcfe -> :sswitch_6d
    .end sparse-switch

    :pswitch_data_10
    .packed-switch 0x0
        :pswitch_8b
        :pswitch_8a
        :pswitch_89
    .end packed-switch
.end method
