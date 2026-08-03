.class public final synthetic La/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/fh;Ljava/lang/String;Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    iput p1, p0, La/h0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/h0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/h0;->c:Ljava/lang/Object;

    iput-object p4, p0, La/h0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, La/h0;->a:I

    iput-object p1, p0, La/h0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/h0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/h0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 23

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    iget v0, v1, La/h0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, La/h0;->b:Ljava/lang/Object;

    check-cast v0, La/fh;

    iget-object v2, v1, La/h0;->c:Ljava/lang/Object;

    check-cast v2, La/J8;

    iget-object v3, v1, La/h0;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {v2, v3}, La/fh;->b(La/J8;Ljava/util/List;)V

    :try_start_0
    iget-object v0, v0, La/fh;->c:La/r8;

    invoke-virtual {v0, v2}, La/r8;->handleHook(La/J8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v2, "WXMaskPlugin: handleHook -> hideSearchListPluginPart FAIL"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_0
    sget-boolean v0, La/n6;->a:Z

    sput-boolean v5, La/n6;->q:Z

    return-void

    :pswitch_0
    iget-object v0, v1, La/h0;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, v1, La/h0;->c:Ljava/lang/Object;

    check-cast v0, Ltop/mmjz/floatingclouds/plugin/IPlugin;

    iget-object v3, v1, La/h0;->d:Ljava/lang/Object;

    check-cast v3, La/J8;

    const-string v6, "WXMaskPlugin: async init -> "

    :try_start_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " START"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, La/x1;->b([Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ltop/mmjz/floatingclouds/plugin/IPlugin;->handleHook(La/J8;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " DONE"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_1
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v3, " FAIL"

    invoke-static {v6, v2, v3}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, v1, La/h0;->b:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, La/h8;

    iget-object v7, v1, La/h0;->c:Ljava/lang/Object;

    iget-object v8, v1, La/h0;->d:Ljava/lang/Object;

    const-string v0, "HideContactList: refreshContactList BLOCKED in-handler, adapter="

    :try_start_2
    invoke-virtual {v6, v7}, La/h8;->e(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " data not compatible"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    iput-object v2, v6, La/h8;->d:Ljava/lang/Object;

    iput-object v2, v6, La/h8;->e:Ljava/lang/Object;

    goto/16 :goto_10

    :catchall_2
    move-exception v0

    goto/16 :goto_11

    :cond_1
    iget-object v0, v6, La/h8;->b:La/a5$c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string v9, ""

    if-eqz v0, :cond_2

    :try_start_3
    iget-object v0, v0, La/a5$c;->a:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v0, v9

    :goto_2
    invoke-static {v8, v0}, La/h8;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    check-cast v0, Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object v0, v2

    :goto_3
    if-nez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    move-object v10, v0

    iget-object v0, v6, La/h8;->b:La/a5$c;

    if-eqz v0, :cond_5

    iget-object v0, v0, La/a5$c;->b:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object v0, v9

    :goto_4
    invoke-static {v8, v0}, La/h8;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v11, v0, Ljava/util/List;

    if-eqz v11, :cond_6

    check-cast v0, Ljava/util/List;

    goto :goto_5

    :cond_6
    move-object v0, v2

    :goto_5
    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_7

    goto :goto_6

    :cond_7
    move-object v0, v2

    :goto_6
    if-eqz v0, :cond_8

    goto :goto_7

    :cond_8
    iget-object v0, v6, La/h8;->f:Ljava/util/ArrayList;

    :goto_7
    if-eqz v0, :cond_d

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_d

    iget-object v11, v6, La/h8;->h:Ljava/lang/reflect/Method;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v11, :cond_d

    :try_start_4
    iget-object v11, v6, La/h8;->h:Ljava/lang/reflect/Method;

    invoke-static {v11}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v11, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    iget-object v11, v6, La/h8;->h:Ljava/lang/reflect/Method;

    invoke-static {v11}, La/i9;->b(Ljava/lang/Object;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v11, v0, Ljava/util/List;

    if-eqz v11, :cond_9

    check-cast v0, Ljava/util/List;

    goto :goto_8

    :catchall_3
    move-exception v0

    goto :goto_9

    :cond_9
    move-object v0, v2

    :goto_8
    if-eqz v0, :cond_a

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_a

    :cond_a
    move-object v11, v2

    goto :goto_a

    :goto_9
    :try_start_5
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v11

    :goto_a
    instance-of v0, v11, La/wd$a;

    if-eqz v0, :cond_b

    move-object v11, v2

    :cond_b
    check-cast v11, Ljava/util/ArrayList;

    if-eqz v11, :cond_c

    goto :goto_b

    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v6, v0}, La/h8;->c(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v11

    goto :goto_b

    :cond_d
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v6, v0}, La/h8;->c(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v11

    :goto_b
    invoke-static {v7}, La/h8;->i(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v6, v6, La/h8;->b:La/a5$c;

    if-eqz v6, :cond_e

    iget-object v9, v6, La/a5$c;->a:Ljava/lang/String;

    :cond_e
    invoke-static {v8, v9}, La/h8;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, La/Kf;->b(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    check-cast v6, Ljava/util/List;

    goto :goto_c

    :cond_f
    move-object v6, v2

    :goto_c
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_d

    :cond_10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v7, v0}, La/h8;->l(Ljava/lang/Object;Ljava/util/ArrayList;)V

    :goto_d
    if-eqz v6, :cond_11

    invoke-interface {v6}, Ljava/util/List;->clear()V

    invoke-interface {v6, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_11
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v6, "getMethods(...)"

    invoke-static {v0, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v6, v0

    :goto_e
    if-ge v3, v6, :cond_13

    aget-object v8, v0, v3

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "notifyDataSetChanged"

    invoke-static {v9, v10}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    const-string v10, "getParameterTypes(...)"

    invoke-static {v9, v10}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v9

    if-nez v9, :cond_12

    goto :goto_f

    :cond_12
    add-int/2addr v3, v5

    goto :goto_e

    :cond_13
    move-object v8, v2

    :goto_f
    if-eqz v8, :cond_14

    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_14
    if-eqz v8, :cond_15

    invoke-virtual {v8, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HideContactList: refreshContactList -> e() re-run + notifyDataSetChanged (in-place), newSize="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :goto_10
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_12

    :goto_11
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_12
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_16

    const-string v2, "HideContactList: refreshContactList failed"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    :cond_16
    return-void

    :pswitch_2
    iget-object v0, v1, La/h0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/emoji2/text/EmojiCompatInitializer$b;

    iget-object v2, v1, La/h0;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/emoji2/text/c$h;

    iget-object v3, v1, La/h0;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_6
    iget-object v0, v0, Landroidx/emoji2/text/EmojiCompatInitializer$b;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/emoji2/text/a;->a(Landroid/content/Context;)Landroidx/emoji2/text/e;

    move-result-object v0

    if-eqz v0, :cond_17

    iget-object v4, v0, Landroidx/emoji2/text/c$c;->a:Landroidx/emoji2/text/c$g;

    check-cast v4, Landroidx/emoji2/text/e$b;

    iget-object v5, v4, Landroidx/emoji2/text/e$b;->d:Ljava/lang/Object;

    monitor-enter v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    iput-object v3, v4, Landroidx/emoji2/text/e$b;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :try_start_8
    iget-object v0, v0, Landroidx/emoji2/text/c$c;->a:Landroidx/emoji2/text/c$g;

    new-instance v4, Landroidx/emoji2/text/d;

    invoke-direct {v4, v2, v3}, Landroidx/emoji2/text/d;-><init>(Landroidx/emoji2/text/c$h;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v4}, Landroidx/emoji2/text/c$g;->a(Landroidx/emoji2/text/c$h;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_14

    :catchall_4
    move-exception v0

    goto :goto_13

    :catchall_5
    move-exception v0

    :try_start_9
    monitor-exit v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :try_start_a
    throw v0

    :cond_17
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v4, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :goto_13
    invoke-virtual {v2, v0}, Landroidx/emoji2/text/c$h;->a(Ljava/lang/Throwable;)V

    invoke-virtual {v3}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_14
    return-void

    :pswitch_3
    const-string v0, "$container"

    iget-object v2, v1, La/h0;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    iget-object v3, v1, La/h0;->d:Ljava/lang/Object;

    check-cast v3, Landroidx/fragment/app/a$a;

    invoke-static {v3, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, La/h0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, v3, Landroidx/fragment/app/a$a;->c:Landroidx/fragment/app/a$b;

    iget-object v0, v0, Landroidx/fragment/app/a$f;->a:Landroidx/fragment/app/f$c;

    invoke-virtual {v0, v3}, Landroidx/fragment/app/f$c;->c(Landroidx/fragment/app/f$a;)V

    return-void

    :pswitch_4
    const-string v6, ""

    iget-object v0, v1, La/h0;->b:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, La/c5;

    iget-object v0, v1, La/h0;->c:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Landroid/app/ProgressDialog;

    iget-object v0, v1, La/h0;->d:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Landroid/app/Activity;

    new-instance v10, La/i0;

    invoke-direct {v10, v3, v8}, La/i0;-><init>(ILjava/lang/Object;)V

    const-string v11, "FAIL"

    const-string v0, "DexKit: bridge="

    sget-boolean v12, La/c5;->g:Z

    if-eqz v12, :cond_18

    const-string v0, "\u626b\u63cf\u5df2\u5728\u8fd0\u884c\u4e2d"

    sput-object v0, La/c5;->h:Ljava/lang/String;

    goto/16 :goto_20

    :cond_18
    sput-boolean v5, La/c5;->g:Z

    sput-object v2, La/c5;->h:Ljava/lang/String;

    const/4 v12, 0x5

    :try_start_b
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const-string v13, "\u521d\u59cb\u5316 DexKit..."

    invoke-virtual {v10, v12, v13}, La/i0;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v12, "dexkit"
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    :try_start_c
    invoke-static {v12}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_15

    :catchall_6
    :try_start_d
    invoke-static {v12}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :goto_15
    :try_start_e
    sget-object v12, La/w1;->k:La/w1;

    iget-object v13, v7, La/c5;->b:Ljava/lang/String;

    invoke-virtual {v12, v13}, La/w1;->E(Ljava/lang/String;)Z

    move-result v12
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1

    goto :goto_16

    :catchall_7
    move v12, v3

    :goto_16
    const-string v13, "OK"

    if-eqz v12, :cond_19

    move-object v14, v13

    goto :goto_17

    :cond_19
    :try_start_f
    const-string v14, "NULL (fallback to cache)"

    :goto_17
    invoke-virtual {v0, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-boolean v0, La/n6;->a:Z

    const-string v0, "__bridge__"
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1

    const-string v14, "SKIP"

    if-eqz v12, :cond_1a

    move-object v15, v13

    goto :goto_18

    :cond_1a
    move-object v15, v14

    :goto_18
    :try_start_10
    invoke-static {v0, v15, v6}, La/n6;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v7, La/c5;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    move/from16 v16, v3

    :goto_19
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, La/c5$a;

    mul-int/lit8 v0, v16, 0x64

    iget v2, v7, La/c5;->e:I

    div-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, v3, La/c5$a;->a:Ljava/lang/String;

    invoke-virtual {v10, v0, v2}, La/i0;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1

    :try_start_11
    iget-object v0, v3, La/c5$a;->d:La/s7;

    invoke-interface {v0}, La/s7;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    if-eqz v0, :cond_1d

    iget-object v2, v3, La/c5$a;->b:Ljava/lang/String;

    invoke-virtual {v7, v2, v0}, La/c5;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    sget-boolean v2, La/n6;->a:Z

    iget-object v2, v3, La/c5$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v19, v5

    const-string v5, "keys(...)"

    invoke-static {v0, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, La/M1;

    invoke-direct {v5, v4, v0}, La/M1;-><init>(ILjava/lang/Object;)V

    new-instance v0, La/L3;

    invoke-direct {v0, v5}, La/L3;-><init>(La/Pd;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v0}, La/L3;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/16 v20, 0x0

    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v22, v0

    add-int/lit8 v0, v20, 0x1

    move/from16 v1, v19

    if-le v0, v1, :cond_1b

    const-string v1, ","

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_1b
    const/4 v1, 0x0

    invoke-static {v5, v4, v1}, La/n9;->e(Ljava/lang/StringBuilder;Ljava/lang/Object;La/D7;)V

    move-object/from16 v1, p0

    move/from16 v20, v0

    move-object/from16 v0, v22

    const/4 v4, 0x2

    const/16 v19, 0x1

    goto :goto_1a

    :cond_1c
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "keys="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v13, v0}, La/n6;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1e

    :catch_0
    move-exception v0

    goto :goto_1c

    :cond_1d
    sget-boolean v0, La/n6;->a:Z

    iget-object v0, v3, La/c5$a;->a:Ljava/lang/String;

    if-eqz v12, :cond_1e

    move-object v1, v11

    goto :goto_1b

    :cond_1e
    move-object v1, v14

    :goto_1b
    const-string v2, "no result"

    invoke-static {v0, v1, v2}, La/n6;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    goto :goto_1e

    :goto_1c
    :try_start_12
    iget-object v1, v3, La/c5$a;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DexKit: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " scan error"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    sget-boolean v1, La/n6;->a:Z

    iget-object v1, v3, La/c5$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1f

    const-string v0, "unknown"

    goto :goto_1d

    :catch_1
    move-exception v0

    goto :goto_1f

    :cond_1f
    :goto_1d
    invoke-static {v1, v11, v0}, La/n6;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1e
    iget v0, v3, La/c5$a;->c:I

    add-int v16, v16, v0

    mul-int/lit8 v0, v16, 0x64

    iget v1, v7, La/c5;->e:I

    div-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, v3, La/c5$a;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \u5b8c\u6210"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, La/i0;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_1

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    goto/16 :goto_19

    :cond_20
    :try_start_13
    iget-object v0, v7, La/c5;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.tencent.mm"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    iget-object v1, v7, La/c5;->c:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "last_version_code"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "scan_status"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_2

    :catch_2
    :try_start_14
    sget-boolean v0, La/n6;->a:Z

    const/16 v19, 0x1

    sput-boolean v19, La/n6;->n:Z

    const/16 v18, 0x0

    sput-object v18, La/n6;->p:Ljava/lang/String;

    const/16 v17, 0x0

    sput-boolean v17, La/c5;->g:Z
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_1

    move/from16 v3, v19

    goto :goto_20

    :goto_1f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u626b\u63cf\u5f02\u5e38: "

    invoke-static {v2, v1}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, La/c5;->h:Ljava/lang/String;

    const-string v1, "DexKit: scanAll failed"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    sget-boolean v1, La/n6;->a:Z

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v17, 0x0

    sput-boolean v17, La/n6;->n:Z

    sput-object v0, La/n6;->p:Ljava/lang/String;

    sput-boolean v17, La/c5;->g:Z

    move/from16 v3, v17

    :goto_20
    sget-object v0, La/c5;->h:Ljava/lang/String;

    sget-object v1, La/m0;->b:Landroid/os/Handler;

    new-instance v2, La/j0;

    invoke-direct {v2, v3, v9, v0, v8}, La/j0;-><init>(ZLandroid/app/Activity;Ljava/lang/String;Landroid/app/ProgressDialog;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
