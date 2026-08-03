.class public final synthetic LS/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, LS/h;->a:I

    iput-object p1, p0, LS/h;->b:Ljava/lang/Object;

    iput-object p2, p0, LS/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    const-string v0, "$name"

    const-string v1, "$activity"

    const-string v2, "this$0"

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, LS/h;->c:Ljava/lang/Object;

    iget-object v6, p0, LS/h;->b:Ljava/lang/Object;

    iget v7, p0, LS/h;->a:I

    packed-switch v7, :pswitch_data_0

    check-cast v6, Lu/b;

    check-cast v5, Landroid/graphics/Typeface;

    invoke-virtual {v6, v5}, Lu/b;->g(Landroid/graphics/Typeface;)V

    return-void

    :pswitch_0
    const-string v0, "$item"

    check-cast v6, Lf0/H;

    invoke-static {v6, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$host"

    check-cast v5, Landroid/app/Activity;

    invoke-static {v5, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lf0/H;->f:LP0/p;

    if-eqz v0, :cond_0

    new-instance v1, Lc0/D1;

    invoke-direct {v1, v4}, Lc0/D1;-><init>(I)V

    invoke-interface {v0, v5, v1}, LP0/p;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :pswitch_1
    const-string v0, "$v"

    check-cast v6, Landroid/widget/TextView;

    invoke-static {v6, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ld0/s;

    invoke-static {v5, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xb4

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, v5, Ld0/s;->E:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void

    :pswitch_2
    check-cast v6, Landroid/app/Activity;

    invoke-static {v6, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, LP0/a;

    const-string v0, "$action"

    invoke-static {v5, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-interface {v5}, LP0/a;->invoke()Ljava/lang/Object;

    sget-object v0, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_0
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v0, "\u6253\u5f00\u5931\u8d25"

    invoke-static {v6, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_2
    :goto_1
    return-void

    :pswitch_3
    check-cast v6, Landroid/app/Activity;

    const-string v0, "$act"

    invoke-static {v6, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lc0/F1;

    invoke-static {v5, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    sget-object v0, Lc0/G1;->j:Ljava/util/WeakHashMap;

    invoke-virtual {v0, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v6}, Lc0/G1;->p(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_4

    :goto_2
    iget-object v0, v5, Lc0/F1;->c:Landroid/widget/ImageView;

    invoke-static {v0}, Lc0/G1;->r(Landroid/widget/ImageView;)V

    :cond_4
    return-void

    :pswitch_4
    check-cast v6, Lc0/O0;

    const-string v1, "$identity"

    invoke-static {v6, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/String;

    invoke-static {v5, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/q1;->a:Lc0/q1;

    sget-object v0, Lc0/q1;->j:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, v6, Lc0/O0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_5

    new-instance v2, Lc0/P;

    invoke-direct {v2, v4, v1, v5}, Lc0/P;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v2}, LE0/s;->n0(Ljava/util/List;LP0/l;)V

    :cond_5
    return-void

    :pswitch_5
    check-cast v6, Landroid/app/Activity;

    invoke-static {v6, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/String;

    invoke-static {v5, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\u5b9e\u540d: "

    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    sget-object v0, Lc0/q1;->a:Lc0/q1;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "getClassLoader(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v0}, Lc0/q1;->f(Landroid/app/Activity;Ljava/lang/ClassLoader;)V

    return-void

    :pswitch_6
    const-string v0, "$bar"

    check-cast v6, Ld0/s;

    invoke-static {v6, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$parent"

    check-cast v5, Landroid/view/ViewGroup;

    invoke-static {v5, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x14

    invoke-static {v6, v5, v0}, Lc0/G;->f(Ld0/s;Landroid/view/ViewGroup;I)V

    return-void

    :pswitch_7
    check-cast v6, Landroidx/profileinstaller/ProfileInstallerInitializer;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, LS/l;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_3
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    const/16 v2, 0x3e8

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    new-instance v2, LS/i;

    check-cast v5, Landroid/content/Context;

    invoke-direct {v2, v5, v3}, LS/i;-><init>(Landroid/content/Context;I)V

    add-int/lit16 v1, v1, 0x1388

    int-to-long v3, v1

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
