.class public final synthetic La/P8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/R8;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/R8;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, La/P8;->a:I

    iput-object p1, p0, La/P8;->b:La/R8;

    iput-object p2, p0, La/P8;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    const-string v1, "chain"

    iget v2, p0, La/P8;->a:I

    packed-switch v2, :pswitch_data_0

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNewIntent"

    iget-object v1, p0, La/P8;->b:La/R8;

    iget-object v2, p0, La/P8;->c:Ljava/lang/String;

    invoke-virtual {v1, p1, v2, v0}, La/R8;->i(Lio/github/libxposed/api/XposedInterface$Chain;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResume"

    iget-object v1, p0, La/P8;->b:La/R8;

    iget-object v2, p0, La/P8;->c:Ljava/lang/String;

    invoke-virtual {v1, p1, v2, v0}, La/R8;->i(Lio/github/libxposed/api/XposedInterface$Chain;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCreate"

    iget-object v1, p0, La/P8;->b:La/R8;

    iget-object v2, p0, La/P8;->c:Ljava/lang/String;

    invoke-virtual {v1, p1, v2, v0}, La/R8;->i(Lio/github/libxposed/api/XposedInterface$Chain;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v2, p0, La/P8;->b:La/R8;

    iget-object v3, p0, La/P8;->c:Ljava/lang/String;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean v0, v2, La/R8;->b:Z

    invoke-static {}, La/bh;->e()V

    const-string v0, "VoIP service onDestroy "

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v2, p0, La/P8;->b:La/R8;

    iget-object v3, p0, La/P8;->c:Ljava/lang/String;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v1

    const-string v4, "getArgs(...)"

    invoke-static {v1, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Landroid/content/Intent;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v1, Landroid/content/Intent;

    goto :goto_0

    :cond_0
    move-object v1, v5

    :goto_0
    if-eqz v1, :cond_1

    const-string v4, "Voip_User"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v5

    :goto_1
    invoke-static {}, La/bh;->b()Z

    move-result v4

    const-string v6, "VoIP service onStartCommand "

    const-string v7, " user="

    const-string v8, " active="

    invoke-static {v6, v3, v7, v1, v8}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La/R8;->r(Ljava/lang/String;)V

    iput-boolean v0, v2, La/R8;->b:Z

    if-eqz v1, :cond_3

    sget-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v1}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, v2, La/R8;->b:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "intercept user="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " at "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onStartCommand"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v1}, La/bh;->g(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/app/Service;

    if-eqz v2, :cond_2

    move-object v5, v1

    check-cast v5, Landroid/app/Service;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    if-eqz v5, :cond_3

    invoke-virtual {v5, v0}, Landroid/app/Service;->stopForeground(I)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_3
    :goto_4
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
