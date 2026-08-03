.class public final synthetic La/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    iput p2, p0, La/l4;->a:I

    iput-object p1, p0, La/l4;->b:Ljava/lang/Object;

    iput-object p3, p0, La/l4;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    const-string v0, "getMethods(...)"

    const/4 v2, 0x0

    const-string v4, "chain"

    const/4 v5, 0x1

    iget v6, v1, La/l4;->a:I

    packed-switch v6, :pswitch_data_0

    iget-object v0, v1, La/l4;->b:Ljava/lang/Object;

    check-cast v0, La/va;

    iget-object v2, v1, La/l4;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/ClassLoader;

    move-object/from16 v3, p1

    check-cast v3, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v3, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {v3}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    const-string v5, "getArgs(...)"

    invoke-static {v4, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4, v2}, La/va;->b(Ljava/lang/Object;Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v2, "[MaskedMsgVibrate] onMessageInserted fail"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_0
    invoke-interface {v3}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v2, v1, La/l4;->b:Ljava/lang/Object;

    check-cast v2, La/X9;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, v1, La/l4;->c:Ljava/lang/Object;

    check-cast v4, La/jc;

    invoke-static {v4}, La/jc$a;->b(La/jc;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v4, "hideMaskedMessageNotification"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "toString(...)"

    invoke-static {v0, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La/jc$a;->a(Ljava/lang/String;)La/jc;

    move-result-object v0

    sget-object v3, La/K3;->a:La/K3$a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/K3$a;->t(La/jc;)V

    invoke-virtual {v2}, La/X9;->F()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_1
    iget-object v0, v1, La/l4;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v6, "HideTextStatus: ["

    invoke-static {v0, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    iget-object v0, v1, La/l4;->b:Ljava/lang/Object;

    check-cast v0, La/D8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/D8;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    :try_start_1
    invoke-static {}, La/D8;->f()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_3

    :cond_1
    instance-of v7, v4, Ljava/util/ArrayList;

    if-eqz v7, :cond_2

    move-object v3, v4

    check-cast v3, Ljava/util/ArrayList;

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v3, v0}, La/D8;->b(Ljava/util/ArrayList;Ljava/util/HashSet;)I

    move-result v0

    if-lez v0, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "] filtered "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " masked cards from R6 output"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] filter output error (safe skip): "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_4
    :goto_3
    return-object v4

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, La/l4;->b:Ljava/lang/Object;

    check-cast v5, La/A8;

    sget-object v6, La/K3;->a:La/K3$a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v6

    iget-boolean v6, v6, La/jc;->d:Z

    if-eqz v6, :cond_6

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Landroid/app/Activity;

    if-eqz v6, :cond_5

    move-object v3, v0

    check-cast v3, Landroid/app/Activity;

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_6

    iget-object v0, v1, La/l4;->c:Ljava/lang/Object;

    invoke-static {v3, v0}, La/A8;->c(Landroid/app/Activity;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v5, v3, v2}, La/A8;->d(Landroid/app/Activity;I)V

    :cond_6
    return-object v4

    :pswitch_3
    iget-object v6, v1, La/l4;->c:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Class;

    move-object/from16 v7, p1

    check-cast v7, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v7, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    iget-object v8, v1, La/l4;->b:Ljava/lang/Object;

    check-cast v8, La/r8;

    sget-object v9, La/K3;->a:La/K3$a;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v9

    iget-boolean v9, v9, La/jc;->a:Z

    if-eqz v9, :cond_f

    invoke-interface {v7}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/lang/Integer;

    if-eqz v10, :cond_7

    check-cast v9, Ljava/lang/Integer;

    goto :goto_5

    :cond_7
    const/4 v9, 0x0

    :goto_5
    if-eqz v9, :cond_f

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v10

    instance-of v11, v4, Landroid/view/View;

    if-eqz v11, :cond_8

    move-object v11, v4

    check-cast v11, Landroid/view/View;

    goto :goto_6

    :cond_8
    const/4 v11, 0x0

    :goto_6
    if-nez v11, :cond_9

    goto/16 :goto_c

    :cond_9
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-static {v6, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v6

    move v12, v2

    :goto_7
    if-ge v12, v0, :cond_b

    aget-object v13, v6, v12

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v14

    const-string v15, "getItem"

    invoke-static {v14, v15}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    array-length v14, v14

    if-ne v14, v5, :cond_a

    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    aget-object v14, v14, v2

    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v14, v15}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    goto :goto_8

    :catchall_2
    move-exception v0

    goto :goto_9

    :cond_a
    add-int/2addr v12, v5

    goto :goto_7

    :cond_b
    const/4 v13, 0x0

    :goto_8
    if-eqz v13, :cond_c

    invoke-interface {v7}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v13, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_a

    :cond_c
    const/4 v0, 0x0

    goto :goto_a

    :goto_9
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_a
    instance-of v5, v0, La/wd$a;

    if-eqz v5, :cond_d

    const/4 v3, 0x0

    goto :goto_b

    :cond_d
    move-object v3, v0

    :goto_b
    if-nez v3, :cond_e

    goto :goto_c

    :cond_e
    invoke-virtual {v8, v3}, La/r8;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0x8

    invoke-virtual {v11, v0}, Landroid/view/View;->setVisibility(I)V

    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v11, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "HideSearchList: hidden search result at position "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/n9;->m([Ljava/lang/Object;)V

    :cond_f
    :goto_c
    return-object v4

    :pswitch_4
    iget-object v0, v1, La/l4;->b:Ljava/lang/Object;

    check-cast v0, La/q8;

    iget-object v2, v1, La/l4;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 v5, p1

    check-cast v5, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v6, "[RecentForward] provider."

    invoke-static {v5, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    :try_start_3
    invoke-static {}, La/q8;->j()Z

    move-result v5

    if-nez v5, :cond_10

    goto :goto_e

    :cond_10
    invoke-static {v4}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    move-object v3, v4

    check-cast v3, Ljava/util/List;

    goto :goto_d

    :cond_11
    const/4 v3, 0x0

    :goto_d
    if-nez v3, :cond_12

    goto :goto_e

    :cond_12
    invoke-virtual {v0, v3}, La/q8;->g(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_13

    const-string v3, "MyPlugin-DexKit"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " filtered "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    :cond_13
    :goto_e
    return-object v4

    :pswitch_5
    iget-object v6, v1, La/l4;->b:Ljava/lang/Object;

    check-cast v6, Ljava/lang/reflect/Method;

    iget-object v7, v1, La/l4;->c:Ljava/lang/Object;

    check-cast v7, La/s4;

    move-object/from16 v8, p1

    check-cast v8, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v9, "EVENT-FILTER: "

    invoke-static {v8, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_14

    invoke-static {v4, v6}, La/w1;->c(Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    :cond_14
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_15

    check-cast v4, Ljava/lang/String;

    goto :goto_f

    :cond_15
    const/4 v4, 0x0

    :goto_f
    iget v6, v7, La/s4;->x:I

    const-string v10, "] "

    const-string v11, "["

    const-string v12, "ConvRV"

    const-string v13, "[ConvRV] "

    const/4 v14, 0x5

    const-string v15, "msg"

    if-ge v6, v14, :cond_17

    add-int/2addr v6, v5

    iput v6, v7, La/s4;->x:I

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    sget-object v7, La/w1;->r:Ljava/lang/Object;

    if-eqz v7, :cond_16

    sget-object v7, La/w1;->s:Ljava/lang/reflect/Method;

    if-eqz v7, :cond_16

    move v7, v5

    goto :goto_10

    :cond_16
    move v7, v2

    :goto_10
    new-instance v14, Ljava/lang/StringBuilder;

    move/from16 v16, v2

    const-string v2, "DIAG fh5.w.k CALLED: type="

    invoke-direct {v14, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " username="

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " dsReady="

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_11

    :cond_17
    move/from16 v16, v2

    :goto_11
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v2

    if-eqz v2, :cond_26

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-boolean v2, v2, La/jc;->n:Z

    if-nez v2, :cond_18

    goto/16 :goto_1f

    :cond_18
    sget-object v2, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v2

    if-nez v2, :cond_25

    sget-boolean v2, La/w1;->q:Z

    if-eqz v2, :cond_19

    goto/16 :goto_1e

    :cond_19
    if-eqz v4, :cond_24

    sget-object v2, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v4}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v2

    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v6

    const-string v7, "getDeclaredFields(...)"

    invoke-static {v6, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move/from16 v8, v16

    :goto_12
    const-class v14, Ljava/lang/String;

    const-string v3, "c"

    if-ge v8, v7, :cond_1f

    :try_start_5
    aget-object v17, v6, v8

    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v1, "f269481g"

    invoke-static {v5, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v5, "g"

    invoke-static {v1, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-nez v1, :cond_1d

    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v5, "getDeclaredMethods(...)"

    invoke-static {v1, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v1

    move-object/from16 p1, v1

    move/from16 v1, v16

    :goto_13
    if-ge v1, v5, :cond_1d

    aget-object v19, p1, v1

    move/from16 v20, v1

    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    move/from16 v21, v5

    const/4 v5, 0x1

    if-ne v1, v5, :cond_1b

    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    aget-object v1, v1, v16

    invoke-static {v1, v14}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_16

    :cond_1a
    :goto_14
    const/16 v18, 0x1

    goto :goto_15

    :catchall_3
    move-exception v0

    goto/16 :goto_1c

    :cond_1b
    move/from16 v18, v5

    goto :goto_15

    :cond_1c
    move/from16 v21, v5

    goto :goto_14

    :goto_15
    add-int/lit8 v1, v20, 0x1

    move/from16 v5, v21

    goto :goto_13

    :cond_1d
    const/16 v18, 0x1

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, p0

    const/4 v5, 0x1

    goto :goto_12

    :cond_1e
    :goto_16
    move-object/from16 v1, v17

    goto :goto_17

    :cond_1f
    const/4 v1, 0x0

    :goto_17
    if-eqz v1, :cond_23

    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_23

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v2

    move/from16 v5, v16

    :goto_18
    if-ge v5, v0, :cond_22

    aget-object v6, v2, v5

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    array-length v7, v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_21

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    aget-object v7, v7, v16

    invoke-static {v7, v14}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_20

    :goto_19
    const/4 v8, 0x1

    goto :goto_1a

    :cond_20
    const/4 v8, 0x1

    :cond_21
    add-int/2addr v5, v8

    goto :goto_18

    :cond_22
    const/4 v6, 0x0

    goto :goto_19

    :goto_1a
    if-eqz v6, :cond_23

    invoke-virtual {v6, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " forced submitRemove"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v15}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :goto_1b
    const/4 v3, 0x0

    goto :goto_20

    :cond_23
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1d

    :goto_1c
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_1d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " blocked (fallback)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v15}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_1b

    :cond_24
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    goto :goto_20

    :cond_25
    :goto_1e
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    goto :goto_20

    :cond_26
    :goto_1f
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    :goto_20
    return-object v3

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
