.class public final synthetic La/eh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

.field public final synthetic c:La/J8;


# direct methods
.method public synthetic constructor <init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;I)V
    .locals 0

    iput p3, p0, La/eh;->a:I

    iput-object p1, p0, La/eh;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    iput-object p2, p0, La/eh;->c:La/J8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 14

    const-string v0, "FAIL"

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "OK"

    const-string v4, "ms)"

    const/4 v5, 0x1

    iget v6, p0, La/eh;->a:I

    packed-switch v6, :pswitch_data_0

    iget-object v0, p0, La/eh;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    iget-object v1, p0, La/eh;->c:La/J8;

    invoke-interface {v0, v1}, Ltop/mmjz/floatingclouds/plugin/IPlugin;->handleHook(La/J8;)V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_0
    iget-object v6, p0, La/eh;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v6, La/fh;

    iget-object v7, p0, La/eh;->c:La/J8;

    const-string v8, "WXMaskPlugin: handleHook -> hideRecentForwardPluginPart START (separate thread)"

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    :try_start_0
    iget-object v6, v6, La/fh;->p:La/q8;

    invoke-virtual {v6, v7}, La/q8;->handleHook(La/J8;)V

    sget-object v6, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v6}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v6

    :goto_0
    instance-of v7, v6, La/wd$a;

    const-string v10, "hideRecentForwardPluginPart"

    if-nez v7, :cond_0

    move-object v7, v6

    check-cast v7, La/Wf;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v8

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "WXMaskPlugin: handleHook -> hideRecentForwardPluginPart DONE ("

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v10, v3, v11, v12, v2}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_0
    invoke-static {v6}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v8

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "WXMaskPlugin: handleHook -> hideRecentForwardPluginPart FAIL (separate thread) ("

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    sget-boolean v1, La/n6;->a:Z

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v0, v5, v6, v1}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_1
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_1
    iget-object v6, p0, La/eh;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v6, La/fh;

    iget-object v7, p0, La/eh;->c:La/J8;

    const-string v8, "WXMaskPlugin: handleHook -> dotIndicator START (separate thread)"

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    :try_start_1
    iget-object v6, v6, La/fh;->n:La/v5;

    invoke-virtual {v6, v7}, La/v5;->handleHook(La/J8;)V

    sget-object v6, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v6

    invoke-static {v6}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v6

    :goto_1
    instance-of v7, v6, La/wd$a;

    const-string v10, "dotIndicator"

    if-nez v7, :cond_2

    move-object v7, v6

    check-cast v7, La/Wf;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v8

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "WXMaskPlugin: handleHook -> dotIndicator DONE ("

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v10, v3, v11, v12, v2}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_2
    invoke-static {v6}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v8

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "WXMaskPlugin: handleHook -> dotIndicator FAIL (separate thread) ("

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    sget-boolean v1, La/n6;->a:Z

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v0, v5, v6, v1}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_3
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_2
    iget-object v6, p0, La/eh;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v6, La/fh;

    iget-object v7, p0, La/eh;->c:La/J8;

    const-string v8, "WXMaskPlugin: handleHook -> boldBottomTab START (separate thread)"

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    :try_start_2
    iget-object v6, v6, La/fh;->m:La/o2;

    invoke-virtual {v6, v7}, La/o2;->handleHook(La/J8;)V

    sget-object v6, La/Wf;->a:La/Wf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v6

    invoke-static {v6}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v6

    :goto_2
    instance-of v7, v6, La/wd$a;

    const-string v10, "boldBottomTab"

    if-nez v7, :cond_4

    move-object v7, v6

    check-cast v7, La/Wf;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v8

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "WXMaskPlugin: handleHook -> boldBottomTab DONE ("

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v10, v3, v11, v12, v2}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_4
    invoke-static {v6}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v8

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "WXMaskPlugin: handleHook -> boldBottomTab FAIL (separate thread) ("

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    sget-boolean v1, La/n6;->a:Z

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v0, v5, v6, v1}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_5
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_3
    iget-object v6, p0, La/eh;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v6, La/fh;

    iget-object v7, p0, La/eh;->c:La/J8;

    const-string v8, "com.tencent.mm"

    const-string v9, "WXMaskPlugin: handleHook -> hideStorageParts START (separate thread)"

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    :try_start_3
    sget-object v11, La/w1;->l:Lorg/luckypray/dexkit/DexKitBridge;

    if-eqz v11, :cond_6

    goto :goto_4

    :cond_6
    sget-object v11, La/w1;->p:Landroid/content/Context;

    if-eqz v11, :cond_8

    iget-object v12, v7, La/J8;->b:Ljava/lang/String;

    invoke-static {v12, v8}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-eqz v12, :cond_8

    :try_start_4
    invoke-virtual {v11}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v11, v8, v12}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v8

    iget-object v8, v8, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v8

    :try_start_5
    invoke-static {v8}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v8

    :goto_3
    instance-of v11, v8, La/wd$a;

    if-eqz v11, :cond_7

    move-object v8, v2

    :cond_7
    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_8

    sget-object v11, La/w1;->k:La/w1;

    invoke-virtual {v11, v8}, La/w1;->E(Ljava/lang/String;)Z

    sget-object v8, La/if;->a:La/if;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/if;->c()V

    goto :goto_4

    :catchall_4
    move-exception v6

    goto :goto_5

    :cond_8
    :goto_4
    iget-object v8, v6, La/fh;->k:La/A8;

    invoke-virtual {v8, v7}, La/A8;->handleHook(La/J8;)V

    iget-object v6, v6, La/fh;->D:La/z8;

    invoke-virtual {v6, v7}, La/z8;->handleHook(La/J8;)V

    sget-object v6, La/Wf;->a:La/Wf;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_6

    :goto_5
    invoke-static {v6}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v6

    :goto_6
    instance-of v7, v6, La/wd$a;

    const-string v8, "hideStorageParts"

    if-nez v7, :cond_9

    move-object v7, v6

    check-cast v7, La/Wf;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v9

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "WXMaskPlugin: handleHook -> hideStorageParts DONE ("

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v8, v3, v11, v12, v2}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_9
    invoke-static {v6}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v9

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "WXMaskPlugin: handleHook -> hideStorageParts FAIL (separate thread) ("

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    sget-boolean v1, La/n6;->a:Z

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v0, v5, v6, v1}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_a
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_4
    iget-object v6, p0, La/eh;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v6, La/fh;

    iget-object v7, p0, La/eh;->c:La/J8;

    const-string v8, "WXMaskPlugin: handleHook -> muteNotificationPluginPart START (separate thread)"

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    :try_start_6
    iget-object v6, v6, La/fh;->E:La/Db;

    invoke-virtual {v6, v7}, La/Db;->handleHook(La/J8;)V

    sget-object v6, La/Wf;->a:La/Wf;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v6

    invoke-static {v6}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v6

    :goto_7
    instance-of v7, v6, La/wd$a;

    const-string v10, "muteNotificationPluginPart"

    if-nez v7, :cond_b

    move-object v7, v6

    check-cast v7, La/Wf;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v8

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "WXMaskPlugin: handleHook -> muteNotificationPluginPart DONE ("

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v10, v3, v11, v12, v2}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_b
    invoke-static {v6}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v8

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "WXMaskPlugin: handleHook -> muteNotificationPluginPart FAIL ("

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    sget-boolean v1, La/n6;->a:Z

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v0, v5, v6, v1}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_c
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_5
    iget-object v6, p0, La/eh;->b:Ltop/mmjz/floatingclouds/plugin/IPlugin;

    check-cast v6, La/fh;

    iget-object v7, p0, La/eh;->c:La/J8;

    const-string v8, "WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart START (separate thread)"

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    :try_start_7
    iget-object v6, v6, La/fh;->j:La/R8;

    invoke-virtual {v6, v7}, La/R8;->handleHook(La/J8;)V

    sget-object v6, La/Wf;->a:La/Wf;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_8

    :catchall_6
    move-exception v6

    invoke-static {v6}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v6

    :goto_8
    instance-of v7, v6, La/wd$a;

    const-string v10, "ignoreVoipCallPluginPart"

    if-nez v7, :cond_d

    move-object v7, v6

    check-cast v7, La/Wf;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v8

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart DONE ("

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v10, v3, v11, v12, v2}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_d
    invoke-static {v6}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v8

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart FAIL (separate thread) ("

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    sget-boolean v1, La/n6;->a:Z

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v0, v5, v6, v1}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :cond_e
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    nop

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
