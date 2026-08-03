.class public final synthetic La/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/s4$a$a$a;ZLa/s4;La/s7;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, La/j0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j0;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/j0;->b:Z

    iput-object p3, p0, La/j0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/j0;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLandroid/app/Activity;Ljava/lang/String;Landroid/app/ProgressDialog;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, La/j0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/j0;->b:Z

    iput-object p2, p0, La/j0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/j0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/j0;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget v2, p0, La/j0;->a:I

    packed-switch v2, :pswitch_data_0

    iget-object v2, p0, La/j0;->c:Ljava/lang/Object;

    check-cast v2, La/s4$a$a$a;

    iget-boolean v3, p0, La/j0;->b:Z

    iget-object v4, p0, La/j0;->d:Ljava/lang/Object;

    check-cast v4, La/s4;

    iget-object v5, p0, La/j0;->e:Ljava/lang/Object;

    check-cast v5, La/s7;

    sget-object v6, La/s4$a$a;->a:La/s4$a$a;

    invoke-static {v2}, La/s4$a$a;->a(La/s4$a$a$a;)Z

    move-result v7

    if-nez v7, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "[HideMainUI] toggleHide("

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ") STALE: expected="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " actual="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    if-eqz v3, :cond_1

    sget-object v6, La/K3;->a:La/K3$a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v6

    iget-boolean v6, v6, La/jc;->q:Z

    if-nez v6, :cond_1

    goto/16 :goto_1

    :cond_1
    sput-boolean v1, La/s4;->J:Z

    :try_start_0
    sget-object v6, La/K3;->a:La/K3$a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v8}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    new-instance v6, La/A3;

    invoke-direct {v6, v1, v2}, La/A3;-><init>(ILjava/lang/Object;)V

    invoke-static {v7, v3, v6}, La/f4;->a(Ljava/util/ArrayList;ZLa/A3;)I

    move-result v2

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[HideMainUI] toggleHide: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " hide="

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sput-boolean v0, La/s4;->J:Z

    if-eqz v3, :cond_3

    invoke-virtual {v4}, La/s4;->f()V

    :cond_3
    if-eqz v5, :cond_4

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, La/M2;

    const/4 v2, 0x6

    invoke-direct {v1, v2, v5}, La/M2;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_1
    return-void

    :goto_2
    sput-boolean v0, La/s4;->J:Z

    if-eqz v3, :cond_5

    invoke-virtual {v4}, La/s4;->f()V

    :cond_5
    throw v1

    :pswitch_0
    iget-boolean v2, p0, La/j0;->b:Z

    iget-object v3, p0, La/j0;->c:Ljava/lang/Object;

    check-cast v3, Landroid/app/Activity;

    iget-object v4, p0, La/j0;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, La/j0;->e:Ljava/lang/Object;

    check-cast v5, Landroid/app/ProgressDialog;

    :try_start_1
    invoke-virtual {v5}, Landroid/app/Dialog;->dismiss()V

    sget-object v5, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    invoke-static {v5}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_3
    if-eqz v2, :cond_6

    sget-object v2, La/m0;->a:La/m0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "AdaptationManager"

    const-string v4, " pluginUpdate=1785635034120"

    const-string v5, "saveVersionInfo plugin=316 wechat="

    :try_start_2
    const-string v6, "adaptation_state_v2"

    invoke-virtual {v3, v6, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    const-string v7, "getSharedPreferences(...)"

    invoke-static {v6, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    const-string v7, "last_plugin_version_code"

    const/16 v8, 0x13c

    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    const-string v7, "last_wechat_version_code"

    invoke-static {v3}, La/m0;->d(Landroid/content/Context;)I

    move-result v8

    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    const-string v7, "last_plugin_update_time"

    const-wide v8, 0x19fc0245408L

    invoke-interface {v6, v7, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    const-string v7, "last_adaptation_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-interface {v6, v7, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {v3}, La/m0;->d(Landroid/content/Context;)I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    move-exception v4

    const-string v5, "saveVersionInfo failed"

    filled-new-array {v2, v5, v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->a([Ljava/lang/Object;)V

    :goto_4
    sget-object v2, La/m0;->a:La/m0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, La/m0;->e(Landroid/app/Activity;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const-string v4, "\u9002\u914d\u5b8c\u6210"

    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const-string v4, "\u626b\u63cf\u9002\u914d\u5df2\u5b8c\u6210\uff0c\u5373\u5c06\u81ea\u52a8\u91cd\u542f\u5fae\u4fe1\u4ee5\u751f\u6548\u3002"

    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, La/f0;

    invoke-direct {v2, v3, v1}, La/f0;-><init>(Landroid/app/Activity;I)V

    const-string v1, "\u7acb\u5373\u91cd\u542f"

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v0, v3}, La/m0;->a(Landroid/app/AlertDialog;Landroid/app/Activity;)V

    goto :goto_5

    :cond_6
    sput-boolean v0, La/m0;->c:Z

    sget-object v0, La/m0;->a:La/m0;

    if-nez v4, :cond_7

    const-string v4, "\u626b\u63cf\u5931\u8d25\uff0c\u8bf7\u67e5\u770b\u65e5\u5fd7\u786e\u8ba4\u8be6\u60c5\u3002"

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, La/m0;->e(Landroid/app/Activity;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u9002\u914d\u5f02\u5e38"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\n\n\u53ef\u7a0d\u540e\u4ece\u8bbe\u7f6e\u9875\u624b\u52a8\u91cd\u65b0\u626b\u63cf\u9002\u914d\u3002"

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "\u786e\u5b9a"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v0, v3}, La/m0;->a(Landroid/app/AlertDialog;Landroid/app/Activity;)V

    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
