.class public final synthetic Lf0/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:LP0/a;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;LP0/a;I)V
    .locals 0

    iput p3, p0, Lf0/D;->a:I

    iput-object p1, p0, Lf0/D;->b:Landroid/app/Activity;

    iput-object p2, p0, Lf0/D;->c:LP0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "$refresh"

    const-string v3, "$host"

    iget v4, p0, Lf0/D;->a:I

    packed-switch v4, :pswitch_data_0

    iget-object v4, p0, Lf0/D;->b:Landroid/app/Activity;

    iget-object v11, p0, Lf0/D;->c:LP0/a;

    invoke-static {v4, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    const-string v3, "\u7528\u6237\u70b9\u51fb\uff1a\u91cd\u65b0\u68c0\u67e5\u9002\u914d"

    invoke-virtual {v2, v3}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    sget-object v2, Lf0/i;->a:Lf0/i;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    const-string v2, "getClassLoader(...)"

    invoke-static {v7, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lf0/P;->a:Ljava/lang/String;

    sget-object v2, Lf0/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v0, "\u6b63\u5728\u68c0\u67e5\u4e2d\u2026"

    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v2, Lf0/i;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sput-boolean v0, LU/S;->i:Z

    sget-object v0, Lb0/k;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v9, Lf0/e;

    invoke-direct {v9, v4, v0}, Lf0/e;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v9}, Landroid/app/Dialog;->show()V

    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lc0/B;

    const/4 v10, 0x2

    move-object v5, v2

    move-object v6, v4

    invoke-direct/range {v5 .. v10}, Lc0/B;-><init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_0
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v2, Lf0/l;

    invoke-direct {v2, v11, v1}, Lf0/l;-><init>(LP0/a;I)V

    const-wide/16 v3, 0x4b0

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_0
    iget-object v1, p0, Lf0/D;->b:Landroid/app/Activity;

    invoke-static {v1, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lf0/D;->c:LP0/a;

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lc0/h1;->a:Lc0/h1;

    const-string v4, "night_mode_follow"

    invoke-static {v4, v0}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_2

    sget-object v4, Lf0/V;->a:Lf0/V;

    invoke-static {v1}, Lf0/V;->k(Landroid/content/Context;)Z

    move-result v1

    const-string v4, "night_mode"

    invoke-virtual {v2, v4, v1, v0}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    :cond_2
    invoke-interface {v3}, LP0/a;->invoke()Ljava/lang/Object;

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
