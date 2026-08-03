.class public final synthetic LJp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LRp;


# direct methods
.method public synthetic constructor <init>(LRp;I)V
    .locals 0

    iput p2, p0, LJp;->a:I

    iput-object p1, p0, LJp;->b:LRp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget p1, p0, LJp;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LJp;->b:LRp;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->getServerUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v3, p1, LRp;->g:Landroid/app/Activity;

    if-nez v3, :cond_0

    const-wide v3, -0x18cd3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v2

    :cond_0
    const-wide v4, -0x18ce3fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-wide v4, -0x18cedfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/content/ClipboardManager;

    const-wide v4, -0x18cb3fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    iget-object p1, p1, LRp;->g:Landroid/app/Activity;

    if-nez p1, :cond_1

    const-wide v3, -0x18b41fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v2, p1

    :goto_0
    const-wide v3, -0x18b51fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_2

    :cond_2
    iget-object p1, p1, LRp;->g:Landroid/app/Activity;

    if-nez p1, :cond_3

    const-wide v3, -0x18b57fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v2, p1

    :goto_1
    const-wide v3, -0x18b67fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_2
    return-void

    :pswitch_0
    sget-object p1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->isRunning()Z

    move-result v0

    iget-object v1, p0, LJp;->b:LRp;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->stop()V

    iget-object p1, v1, LRp;->n:Landroid/os/Handler;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_4
    iput-object v2, v1, LRp;->n:Landroid/os/Handler;

    invoke-virtual {v1, v3}, LRp;->h(Z)V

    const-wide v2, -0x18d5cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LRp;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    iget-object v0, v1, LRp;->g:Landroid/app/Activity;

    if-nez v0, :cond_6

    const-wide v4, -0x18d6bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v2

    :cond_6
    const/4 v4, 0x2

    invoke-static {p1, v0, v3, v4, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->start$default(Lio/github/cherrywechat/lua/dev/CherryDevServer;Landroid/content/Context;IILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, LRp;->h(Z)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, v1, LRp;->n:Landroid/os/Handler;

    new-instance v2, LK0;

    const/16 v3, 0xb

    invoke-direct {v2, v3, v1}, LK0;-><init>(ILjava/lang/Object;)V

    const-wide/16 v3, 0x7d0

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x18d7bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->getServerUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LRp;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    const-wide v2, -0x18d0bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LRp;->a(Ljava/lang/String;)V

    :goto_3
    return-void

    :pswitch_1
    iget-object p1, p0, LJp;->b:LRp;

    iget-object p1, p1, LRp;->c:Landroid/widget/TextView;

    if-eqz p1, :cond_8

    const-wide v0, -0x188b2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
