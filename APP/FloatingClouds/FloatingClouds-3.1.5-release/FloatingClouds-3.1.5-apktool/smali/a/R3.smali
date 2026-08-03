.class public final synthetic La/R3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/S3;


# direct methods
.method public synthetic constructor <init>(La/S3;I)V
    .locals 0

    iput p2, p0, La/R3;->a:I

    iput-object p1, p0, La/R3;->b:La/S3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v0, "getArgs(...)"

    const-string v4, "ContactAddMask"

    const-string v5, "chain"

    const/4 v6, 0x1

    iget v7, v1, La/R3;->a:I

    packed-switch v7, :pswitch_data_0

    iget-object v7, v1, La/R3;->b:La/S3;

    move-object/from16 v8, p1

    check-cast v8, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v8, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "getMethods(...)"

    const-string v9, "addMask OK: "

    const-string v10, "removeMask OK: "

    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v11

    invoke-static {v11, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Landroid/widget/AdapterView;

    if-eqz v12, :cond_0

    check-cast v11, Landroid/widget/AdapterView;

    goto :goto_0

    :cond_0
    move-object v11, v2

    :goto_0
    if-nez v11, :cond_1

    goto/16 :goto_12

    :cond_1
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v12

    invoke-static {v12, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {v12, v0}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    instance-of v12, v0, Ljava/lang/Integer;

    if-eqz v12, :cond_2

    check-cast v0, Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v11}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v11

    if-nez v11, :cond_3

    goto/16 :goto_12

    :cond_3
    instance-of v12, v11, Landroid/widget/HeaderViewListAdapter;

    if-eqz v12, :cond_4

    check-cast v11, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v11}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v11

    :cond_4
    instance-of v12, v11, La/S3$a;

    if-nez v12, :cond_5

    goto/16 :goto_12

    :cond_5
    check-cast v11, La/S3$a;

    invoke-virtual {v11}, La/S3$a;->getCount()I

    move-result v12

    sub-int/2addr v12, v6

    if-eq v0, v12, :cond_6

    goto/16 :goto_12

    :cond_6
    iget-object v14, v11, La/S3$a;->b:Ljava/lang/String;

    :try_start_0
    sget-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v14}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v8, "\u523b\u821f\u6c42\u5251"

    if-eqz v0, :cond_a

    :try_start_1
    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14}, La/K3$a;->o(Ljava/lang/String;)V

    sget-object v0, La/w1;->p:Landroid/content/Context;

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v9

    iget-boolean v11, v9, La/jc;->R:Z

    if-eqz v11, :cond_9

    iget-object v9, v9, La/jc;->U:Ljava/lang/String;

    invoke-static {v9}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_8

    goto :goto_2

    :cond_8
    move-object v8, v9

    :goto_2
    invoke-static {v0, v8, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_9
    :goto_3
    invoke-virtual {v10, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_a
    sget-object v0, La/K3;->a:La/K3$a;

    new-instance v13, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1c

    const/16 v20, 0x0

    move-object v15, v14

    invoke-direct/range {v13 .. v20}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;ILa/O4;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13}, La/K3$a;->a(Ltop/mmjz/floatingclouds/bean/MaskItemBean;)V

    sget-object v0, La/w1;->p:Landroid/content/Context;

    if-nez v0, :cond_b

    goto :goto_5

    :cond_b
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v10

    iget-boolean v11, v10, La/jc;->R:Z

    if-eqz v11, :cond_d

    iget-object v10, v10, La/jc;->T:Ljava/lang/String;

    invoke-static {v10}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_4

    :cond_c
    move-object v8, v10

    :goto_4
    invoke-static {v0, v8, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_d
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_6
    sget-object v0, La/s4;->M:La/k4;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, La/k4;->a()Ljava/lang/Object;

    :cond_e
    sget-object v0, La/h8;->k:La/A3;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, La/A3;->a()Ljava/lang/Object;

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_8

    :cond_f
    move-object v0, v2

    goto :goto_8

    :goto_7
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_8
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_10

    const-string v8, "consume fail"

    invoke-static {v4, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_10
    iput-boolean v3, v7, La/S3;->b:Z

    iput-object v2, v7, La/S3;->a:Ljava/lang/String;

    :try_start_2
    iget-object v0, v7, La/S3;->e:Ljava/lang/Object;

    if-nez v0, :cond_11

    goto/16 :goto_f

    :cond_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static {v7, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move v9, v3

    :goto_9
    const-string v10, "getParameterTypes(...)"

    if-ge v9, v8, :cond_13

    :try_start_3
    aget-object v11, v7, v9

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "a"

    invoke-static {v12, v13}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12, v10}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v12

    if-nez v12, :cond_12

    goto :goto_a

    :catchall_1
    move-exception v0

    goto/16 :goto_10

    :cond_12
    add-int/2addr v9, v6

    goto :goto_9

    :cond_13
    move-object v11, v2

    :goto_a
    if-eqz v11, :cond_14

    invoke-virtual {v11, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_f

    :cond_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    const-string v8, "getDeclaredFields(...)"

    invoke-static {v7, v8}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v7

    move v9, v3

    :goto_b
    if-ge v9, v8, :cond_16

    aget-object v11, v7, v9

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "kc5.d5"

    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_15

    goto :goto_c

    :cond_15
    add-int/2addr v9, v6

    goto :goto_b

    :cond_16
    move-object v11, v2

    :goto_c
    if-eqz v11, :cond_17

    invoke-virtual {v11, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_17
    if-eqz v11, :cond_1b

    invoke-virtual {v11, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_18

    goto :goto_f

    :cond_18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static {v7, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v7

    :goto_d
    if-ge v3, v5, :cond_1a

    aget-object v8, v7, v3

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v11, "dismiss"

    invoke-static {v9, v11}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v10}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v9

    if-nez v9, :cond_19

    goto :goto_e

    :cond_19
    add-int/2addr v3, v6

    goto :goto_d

    :cond_1a
    move-object v8, v2

    :goto_e
    if-eqz v8, :cond_1b

    invoke-virtual {v8, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1b
    :goto_f
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_11

    :goto_10
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_11
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1d

    const-string v2, "dismiss fail"

    invoke-static {v4, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_13

    :cond_1c
    :goto_12
    invoke-interface {v8}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    :cond_1d
    :goto_13
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_0
    iget-object v0, v1, La/R3;->b:La/S3;

    move-object/from16 v2, p1

    check-cast v2, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v2, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    :try_start_4
    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "getThisObject(...)"

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, La/S3;->a(Ljava/lang/Object;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_14

    :catchall_2
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_14
    new-instance v2, La/wd;

    invoke-direct {v2, v0}, La/wd;-><init>(Ljava/lang/Object;)V

    return-object v2

    :pswitch_1
    iget-object v0, v1, La/R3;->b:La/S3;

    move-object/from16 v6, p1

    check-cast v6, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v6, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_21

    iget-object v5, v0, La/S3;->d:Ljava/lang/Class;

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v5, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    sget-object v5, La/K3;->a:La/K3$a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v5

    iget-boolean v5, v5, La/jc;->B:Z

    if-eqz v5, :cond_21

    iget-boolean v5, v0, La/S3;->b:Z

    if-eqz v5, :cond_21

    iget-object v0, v0, La/S3;->a:Ljava/lang/String;

    if-eqz v0, :cond_21

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1e

    goto :goto_16

    :cond_1e
    sget-object v5, La/w1;->p:Landroid/content/Context;

    if-eqz v5, :cond_21

    sget-object v7, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1f

    const-string v8, "\u53d6\u6d88\u5bc6\u53cb"

    goto :goto_15

    :cond_1f
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v8

    iget-object v8, v8, La/jc;->C:Ljava/lang/String;

    invoke-static {v8}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_20

    const-string v8, "\u52a0\u5165\u5bc6\u53cb"

    :cond_20
    :goto_15
    new-instance v9, La/S3$a;

    check-cast v3, Landroid/widget/BaseAdapter;

    invoke-direct {v9, v3, v0, v5, v8}, La/S3$a;-><init>(Landroid/widget/BaseAdapter;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v6}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type android.widget.ListView"

    invoke-static {v3, v5}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/ListView;

    invoke-virtual {v3, v9}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "wrap OK: \'"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\' wxid="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " masked="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_17

    :cond_21
    :goto_16
    invoke-interface {v6}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    :goto_17
    return-object v2

    :pswitch_2
    iget-object v2, v1, La/R3;->b:La/S3;

    move-object/from16 v3, p1

    check-cast v3, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v3, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    invoke-interface {v3}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v6}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/S3;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, La/S3;->a:Ljava/lang/String;

    iput-boolean v6, v2, La/S3;->b:Z

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_18

    :catchall_3
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_18
    invoke-interface {v3}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
