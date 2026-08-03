.class public final synthetic La/h4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/s4;


# direct methods
.method public synthetic constructor <init>(La/s4;I)V
    .locals 0

    .line 1
    iput p2, p0, La/h4;->a:I

    iput-object p1, p0, La/h4;->b:La/s4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/s4;La/J8;I)V
    .locals 0

    .line 2
    iput p3, p0, La/h4;->a:I

    iput-object p1, p0, La/h4;->b:La/s4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    const/16 v0, 0xa

    const-string v2, "msg"

    const-string v3, "[ConvRV] "

    const-string v5, "chain"

    const/4 v6, 0x0

    const/4 v7, 0x1

    iget v8, v1, La/h4;->a:I

    packed-switch v8, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_4

    :cond_0
    :try_start_0
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    const-string v3, "getArguments"

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v0, v3, v5}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Landroid/os/Bundle;

    if-eqz v3, :cond_1

    check-cast v0, Landroid/os/Bundle;

    goto :goto_0

    :catchall_0
    move-exception v0

    const/4 v4, 0x0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const-string v3, "Chat_User"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    :try_start_1
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_2
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_3
    iget-object v0, v1, La/h4;->b:La/s4;

    const-string v3, "onActivityCreated"

    invoke-virtual {v0, v4, v3}, La/s4;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    return-object v2

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_6

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v5, v1, La/h4;->b:La/s4;

    iget-object v6, v5, La/s4;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    const-wide/16 v7, 0x0

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_5

    :cond_4
    move-wide v9, v7

    :goto_5
    sub-long v9, v3, v9

    const-wide/16 v11, 0x32

    cmp-long v6, v9, v11

    if-lez v6, :cond_7

    iget-object v6, v5, La/s4;->r:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    :cond_5
    sub-long v6, v3, v7

    const-wide/16 v8, 0xc8

    cmp-long v6, v6, v8

    if-gez v6, :cond_6

    goto :goto_6

    :cond_6
    iget-object v6, v5, La/s4;->w:Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->clear()V

    iget-object v6, v5, La/s4;->n:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v6, v0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, v5, La/s4;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_6
    return-object v2

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, La/h4;->b:La/s4;

    sget-object v3, La/K3;->a:La/K3$a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v3

    iget-boolean v5, v3, La/jc;->n:Z

    if-eqz v5, :cond_13

    invoke-static {}, La/K3$a;->l()Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_b

    :cond_8
    iget-object v5, v2, La/s4;->v:Ljava/lang/ThreadLocal;

    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v7}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    sget-object v5, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v5

    if-nez v5, :cond_12

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_9

    goto/16 :goto_a

    :cond_9
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_a

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_c

    :cond_a
    invoke-virtual {v2, v5, v3}, La/s4;->g(Ljava/lang/Object;La/jc;)I

    move-result v3

    if-nez v3, :cond_b

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_c

    :cond_b
    iget-object v3, v2, La/s4;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    if-nez v3, :cond_c

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_c

    :cond_c
    iget-object v2, v2, La/s4;->o:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_7

    :cond_d
    array-length v2, v3

    :goto_7
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/Integer;

    if-eqz v6, :cond_e

    move-object v4, v5

    check-cast v4, Ljava/lang/Integer;

    goto :goto_8

    :cond_e
    const/4 v4, 0x0

    :goto_8
    if-eqz v4, :cond_11

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ltz v4, :cond_10

    if-lt v4, v2, :cond_f

    goto :goto_9

    :cond_f
    aget v2, v3, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_c

    :cond_10
    :goto_9
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_c

    :cond_11
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_c

    :cond_12
    :goto_a
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_c

    :cond_13
    :goto_b
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    :goto_c
    return-object v0

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, La/h4;->b:La/s4;

    invoke-virtual {v2, v0}, La/s4;->b(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v5, v1, La/h4;->b:La/s4;

    move-object/from16 v8, p1

    check-cast v8, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v9, "chain3"

    invoke-static {v8, v9}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v9, v5, La/s4;->y:I

    const/4 v10, 0x5

    const-string v11, "getArgs(...)"

    const/4 v12, 0x2

    if-ge v9, v10, :cond_14

    add-int/2addr v9, v7

    iput v9, v5, La/s4;->y:I

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v9

    invoke-static {v9, v11}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v12}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v13, "DIAG fh5.w0.i CALLED: arg0="

    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " arg2="

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, La/x1;->b([Ljava/lang/Object;)V

    :cond_14
    sget-object v7, La/K3;->a:La/K3$a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v7

    iget-boolean v7, v7, La/jc;->n:Z

    if-nez v7, :cond_15

    goto/16 :goto_f

    :cond_15
    sget-object v7, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v7

    if-nez v7, :cond_1a

    sget-boolean v7, La/w1;->q:Z

    if-eqz v7, :cond_16

    goto/16 :goto_e

    :cond_16
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v11}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v12}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v7

    instance-of v9, v7, Ljava/lang/String;

    if-eqz v9, :cond_17

    check-cast v7, Ljava/lang/String;

    goto :goto_d

    :cond_17
    const/4 v7, 0x0

    :goto_d
    if-eqz v7, :cond_18

    const-string v9, "wxid_"

    invoke-static {v7, v9, v6}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_18

    sget-object v6, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v7}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_18

    iget v5, v5, La/s4;->y:I

    if-ge v5, v0, :cond_18

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "DIAG W0-I MASKED HIT: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " containChatUser="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_18
    if-eqz v7, :cond_19

    sget-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v7}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "W0-I-BLOCK: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " event blocked at entry"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const/4 v4, 0x0

    goto :goto_10

    :cond_19
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    goto :goto_10

    :cond_1a
    :goto_e
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    goto :goto_10

    :cond_1b
    :goto_f
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    :goto_10
    return-object v4

    :pswitch_4
    iget-object v5, v1, La/h4;->b:La/s4;

    move-object/from16 v8, p1

    check-cast v8, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v9, "chain2"

    invoke-static {v8, v9}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, La/K3;->a:La/K3$a;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v9

    if-eqz v9, :cond_3a

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v9

    iget-boolean v9, v9, La/jc;->n:Z

    if-nez v9, :cond_1c

    goto/16 :goto_23

    :cond_1c
    sget-object v9, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v9

    if-nez v9, :cond_39

    sget-boolean v9, La/w1;->q:Z

    if-eqz v9, :cond_1d

    goto/16 :goto_22

    :cond_1d
    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1e

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_24

    :cond_1e
    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v0}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v9}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1f
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9, v10}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v10, v0, Ljava/util/List;

    if-eqz v10, :cond_20

    check-cast v0, Ljava/util/List;

    move-object v10, v0

    goto :goto_12

    :cond_20
    const/4 v10, 0x0

    :goto_12
    if-nez v10, :cond_21

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_24

    :cond_21
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_24

    :cond_22
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_13
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_37

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_23

    move/from16 v16, v6

    goto/16 :goto_21

    :cond_23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v14, Ljava/lang/String;

    :try_start_2
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    move-object v15, v0

    move/from16 v16, v6

    :goto_14
    if-eqz v15, :cond_32

    :try_start_3
    const-class v0, Ljava/lang/Object;

    invoke-virtual {v15, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    const/4 v0, 0x3

    if-ge v6, v0, :cond_32

    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v17

    :goto_15
    invoke-virtual/range {v17 .. v17}, La/G1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-virtual/range {v17 .. v17}, La/G1;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v18

    if-nez v18, :cond_30

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->isPrimitive()Z

    move-result v18

    if-nez v18, :cond_30

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4, v14}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    goto :goto_15

    :cond_24
    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-virtual {v0, v13}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_16

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_16
    instance-of v4, v0, La/wd$a;

    if-eqz v4, :cond_25

    const/4 v0, 0x0

    :cond_25
    if-nez v0, :cond_26

    goto :goto_15

    :cond_26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    move/from16 v19, v7

    const-string v7, "getMethods(...)"

    invoke-static {v4, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v4

    move/from16 v1, v16

    :goto_17
    if-ge v1, v7, :cond_28

    aget-object v20, v4, v1

    move/from16 p1, v1

    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v21, v4

    const-string v4, "i1"

    invoke-static {v1, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    const-string v4, "getParameterTypes(...)"

    invoke-static {v1, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v1

    if-nez v1, :cond_27

    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, v14}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz v1, :cond_27

    move-object/from16 v1, v20

    goto :goto_18

    :catchall_3
    move-exception v0

    goto/16 :goto_1e

    :cond_27
    add-int/lit8 v1, p1, 0x1

    move-object/from16 v4, v21

    goto :goto_17

    :cond_28
    const/4 v1, 0x0

    :goto_18
    if-eqz v1, :cond_2a

    move/from16 v4, v19

    :try_start_6
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    const/4 v4, 0x0

    :try_start_7
    invoke-virtual {v1, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_29

    check-cast v1, Ljava/lang/String;

    goto :goto_19

    :cond_29
    move-object v1, v4

    :goto_19
    if-eqz v1, :cond_2b

    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_33

    goto :goto_1a

    :catchall_4
    move-exception v0

    const/4 v4, 0x0

    goto/16 :goto_1e

    :cond_2a
    const/4 v4, 0x0

    :cond_2b
    :goto_1a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    const-string v7, "getDeclaredFields(...)"

    invoke-static {v1, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v1

    move/from16 v4, v16

    :goto_1b
    if-ge v4, v7, :cond_2d

    aget-object v20, v1, v4

    move-object/from16 p1, v1

    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    move/from16 v21, v4

    const-string v4, "field_username"

    invoke-static {v1, v4}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    move-object/from16 v1, v20

    goto :goto_1c

    :cond_2c
    const/16 v19, 0x1

    add-int/lit8 v4, v21, 0x1

    move-object/from16 v1, p1

    goto :goto_1b

    :cond_2d
    const/4 v1, 0x0

    :goto_1c
    if-eqz v1, :cond_2f

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_2e

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    goto :goto_1d

    :cond_2e
    const/4 v1, 0x0

    :goto_1d
    if-eqz v1, :cond_2f

    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_33

    :cond_2f
    move-object/from16 v1, p0

    const/4 v7, 0x1

    goto/16 :goto_15

    :cond_30
    move-object/from16 v1, p0

    goto/16 :goto_15

    :cond_31
    invoke-virtual {v15}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v15
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    const/16 v19, 0x1

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p0

    const/4 v7, 0x1

    goto/16 :goto_14

    :cond_32
    const/4 v1, 0x0

    goto :goto_1f

    :catchall_5
    move-exception v0

    move/from16 v16, v6

    :goto_1e
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v1

    :cond_33
    :goto_1f
    instance-of v0, v1, La/wd$a;

    if-eqz v0, :cond_34

    const/4 v1, 0x0

    :cond_34
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_36

    invoke-virtual {v9, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    goto :goto_21

    :cond_35
    :goto_20
    move-object/from16 v1, p0

    move/from16 v6, v16

    const/4 v7, 0x1

    goto/16 :goto_13

    :cond_36
    :goto_21
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20

    :cond_37
    move/from16 v16, v6

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_38

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "fh5.a FILTER: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const/4 v4, 0x1

    new-array v0, v4, [Ljava/util/List;

    aput-object v11, v0, v16

    invoke-interface {v8, v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_24

    :cond_38
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_24

    :cond_39
    :goto_22
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    goto :goto_24

    :cond_3a
    :goto_23
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    :goto_24
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
