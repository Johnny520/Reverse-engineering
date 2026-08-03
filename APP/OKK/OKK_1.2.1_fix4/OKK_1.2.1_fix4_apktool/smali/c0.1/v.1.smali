.class public final synthetic Lc0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    iput p2, p0, Lc0/v;->a:I

    iput-object p1, p0, Lc0/v;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const-string v0, "$act"

    const-string v1, "$activity"

    iget-object v2, p0, Lc0/v;->b:Landroid/app/Activity;

    iget v3, p0, Lc0/v;->a:I

    packed-switch v3, :pswitch_data_0

    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LU/S;->n0(Landroid/app/Activity;)V

    return-void

    :pswitch_0
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/P1;->a:Lc0/P1;

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v3, "com.tencent.mm.plugin.location.ui.RedirectUI"

    invoke-static {v1, v3}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "map_view_type"

    const/16 v4, 0x8

    invoke-virtual {v3, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const v1, 0xac07

    invoke-virtual {v2, v3, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    const-string v1, "launched RedirectUI for map pick"

    invoke-static {v1}, Lc0/P1;->c(Ljava/lang/String;)V

    const-string v1, "OKK\uff1a\u8bf7\u5728\u5730\u56fe\u4e0a\u9009\u62e9\u4f4d\u7f6e"

    invoke-static {v2, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    sget-object v1, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_0
    invoke-static {v1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v3, Lc0/P1;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    invoke-static {}, Lc0/L1;->a()V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "launch RedirectUI failed: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/P1;->c(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "OKK\uff1a\u6253\u5f00\u5fae\u4fe1\u5730\u56fe\u5931\u8d25 "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void

    :pswitch_1
    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v2}, Lc0/G1;->a(Landroid/app/Activity;)Z

    :cond_1
    return-void

    :pswitch_2
    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v2}, Lc0/G1;->a(Landroid/app/Activity;)Z

    :cond_2
    return-void

    :pswitch_3
    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v2}, Lc0/G1;->a(Landroid/app/Activity;)Z

    :cond_3
    return-void

    :pswitch_4
    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v2}, Lc0/G1;->a(Landroid/app/Activity;)Z

    :cond_4
    return-void

    :pswitch_5
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v2}, Lc0/G1;->a(Landroid/app/Activity;)Z

    invoke-static {v2}, Lc0/G1;->h(Landroid/app/Activity;)V

    :cond_5
    return-void

    :pswitch_6
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v2}, Lc0/G1;->k(Landroid/app/Activity;)V

    :cond_6
    return-void

    :pswitch_7
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCreate.postDelayed"

    invoke-static {v2, v0}, Lc0/w;->a(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    :pswitch_8
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCreate.post"

    invoke-static {v2, v0}, Lc0/w;->a(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    nop

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
