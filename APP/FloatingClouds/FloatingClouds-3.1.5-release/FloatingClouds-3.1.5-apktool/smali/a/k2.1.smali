.class public final synthetic La/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/o2;


# direct methods
.method public synthetic constructor <init>(La/o2;I)V
    .locals 0

    iput p2, p0, La/k2;->a:I

    iput-object p1, p0, La/k2;->b:La/o2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, La/k2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/k2;->b:La/o2;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v1, "chain"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :try_start_0
    invoke-static {}, La/o2;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, La/o2;->e:Landroid/os/Handler;

    new-instance v2, La/l2;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, La/l2;-><init>(La/o2;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, La/k2;->b:La/o2;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v1, "chain"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v1

    :try_start_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :goto_1
    return-object v1

    :pswitch_1
    iget-object v0, p0, La/k2;->b:La/o2;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v1, "chain"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v1

    :try_start_2
    invoke-static {}, La/o2;->e()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_4

    check-cast p1, Landroid/app/Activity;

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    new-instance v2, La/l2;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, La/l2;-><init>(La/o2;I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :goto_3
    return-object v1

    :pswitch_2
    iget-object v0, p0, La/k2;->b:La/o2;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v1, "chain"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    :try_start_3
    invoke-static {}, La/o2;->e()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, v0, La/o2;->e:Landroid/os/Handler;

    new-instance v2, La/l2;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, La/l2;-><init>(La/o2;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    :cond_6
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
