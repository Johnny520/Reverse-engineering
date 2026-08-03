.class public final synthetic Landroidx/emoji2/text/k;
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
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Landroidx/emoji2/text/k;->a:I

    iput-object p1, p0, Landroidx/emoji2/text/k;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget v2, p0, Landroidx/emoji2/text/k;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "$progress"

    iget-object v3, p0, Landroidx/emoji2/text/k;->b:Ljava/lang/Object;

    check-cast v3, Lf0/e;

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$activity"

    iget-object v4, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    check-cast v4, Landroid/app/Activity;

    invoke-static {v4, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$t"

    iget-object v5, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Throwable;

    invoke-static {v5, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lf0/e;->a()V

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "\u9002\u914d\u68c0\u67e5\u5931\u8d25: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    sget-object v1, Lf0/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    check-cast v0, Lc0/O0;

    const-string v1, "$identity"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/q1;->a:Lc0/q1;

    iget-object v1, p0, Landroidx/emoji2/text/k;->b:Ljava/lang/Object;

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v0, v0, Lc0/O0;->b:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lc0/q1;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_1
    const-string v2, "$done"

    iget-object v3, p0, Landroidx/emoji2/text/k;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$activity"

    iget-object v4, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Activity;

    invoke-static {v4, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lc0/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v2, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "\u83b7\u53d6\u5931\u8d25: \u53ef\u80fd\u88ab\u5220\u9664/\u62c9\u9ed1/\u5bf9\u65b9\u8d26\u53f7\u5f02\u5e38"

    invoke-static {v4, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/emoji2/text/k;->b:Ljava/lang/Object;

    const-string v2, "$currentMsg"

    invoke-static {v0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lc0/a0;->a:Lc0/a0;

    invoke-static {v0}, Lc0/a0;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lc0/a0;->R(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v2, Lc0/L;

    iget-object v3, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    check-cast v3, Landroid/view/View;

    invoke-direct {v2, v1, v3, v0}, Lc0/L;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    const-wide/16 v0, 0x50

    iget-object v3, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/emoji2/text/k;->b:Ljava/lang/Object;

    check-cast v0, LD/d;

    iget-object v1, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    check-cast v1, LU/S;

    iget-object v2, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LU/S;->m(Landroid/content/Context;)Landroidx/emoji2/text/r;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v3, v0, Landroidx/emoji2/text/r;->a:Landroidx/emoji2/text/i;

    check-cast v3, Landroidx/emoji2/text/q;

    iget-object v4, v3, Landroidx/emoji2/text/q;->d:Ljava/lang/Object;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object v2, v3, Landroidx/emoji2/text/q;->f:Ljava/util/concurrent/Executor;

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, v0, Landroidx/emoji2/text/r;->a:Landroidx/emoji2/text/i;

    new-instance v3, Landroidx/emoji2/text/l;

    invoke-direct {v3, v1, v2}, Landroidx/emoji2/text/l;-><init>(LU/S;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v3}, Landroidx/emoji2/text/i;->p(LU/S;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    invoke-virtual {v1, v0}, LU/S;->U(Ljava/lang/Throwable;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
