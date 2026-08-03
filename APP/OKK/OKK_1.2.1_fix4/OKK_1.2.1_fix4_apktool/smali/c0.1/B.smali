.class public final synthetic Lc0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lc0/B;->a:I

    iput-object p1, p0, Lc0/B;->c:Ljava/lang/Object;

    iput-object p2, p0, Lc0/B;->d:Ljava/lang/Object;

    iput-object p3, p0, Lc0/B;->b:Ljava/lang/Object;

    iput-object p4, p0, Lc0/B;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lc0/q1;Lc0/b;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lc0/B;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/B;->b:Ljava/lang/Object;

    iput-object p2, p0, Lc0/B;->c:Ljava/lang/Object;

    iput-object p3, p0, Lc0/B;->d:Ljava/lang/Object;

    iput-object p4, p0, Lc0/B;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x1

    iget-object v1, p0, Lc0/B;->e:Ljava/lang/Object;

    iget-object v2, p0, Lc0/B;->b:Ljava/lang/Object;

    iget-object v3, p0, Lc0/B;->d:Ljava/lang/Object;

    iget-object v4, p0, Lc0/B;->c:Ljava/lang/Object;

    iget v5, p0, Lc0/B;->a:I

    packed-switch v5, :pswitch_data_0

    const-string v0, "$rowView"

    check-cast v4, Landroid/view/View;

    invoke-static {v4, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$scroll"

    check-cast v3, Landroid/widget/ScrollView;

    invoke-static {v3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$item"

    check-cast v2, Lf0/H;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$host"

    check-cast v1, Landroid/app/Activity;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    move v5, v0

    :cond_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    instance-of v6, v4, Landroid/view/View;

    if-eqz v6, :cond_1

    check-cast v4, Landroid/view/View;

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-ne v4, v3, :cond_0

    :cond_2
    invoke-virtual {v3, v0, v5}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    new-instance v0, LS/h;

    const/4 v4, 0x7

    invoke-direct {v0, v2, v1, v4}, LS/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    const-wide/16 v1, 0x17c

    invoke-virtual {v3, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_0
    check-cast v4, Landroid/app/Activity;

    const-string v5, "$activity"

    invoke-static {v4, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/ClassLoader;

    const-string v5, "$classLoader"

    invoke-static {v3, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/e;

    const-string v5, "$progress"

    invoke-static {v1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "getApplicationContext(...)"

    invoke-static {v5, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lf0/b;

    invoke-direct {v6, v1, v0}, Lf0/b;-><init>(Lf0/e;I)V

    check-cast v2, Ljava/lang/String;

    invoke-static {v5, v6, v3, v2}, LU/S;->e0(Landroid/content/Context;Lf0/b;Ljava/lang/ClassLoader;Ljava/lang/String;)Lb0/a;

    move-result-object v2

    sget-object v3, Lf0/i;->a:Lf0/i;

    invoke-static {v2}, Lf0/i;->e(Lb0/a;)Lb0/a;

    move-result-object v2

    sget-object v3, Lf0/i;->b:Landroid/os/Handler;

    new-instance v5, Lf0/c;

    invoke-direct {v5, v1, v2, v4, v0}, Lf0/c;-><init>(Lf0/e;Lb0/a;Landroid/app/Activity;I)V

    invoke-virtual {v3, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_1
    check-cast v4, Ljava/lang/String;

    const-string v0, "$sender"

    invoke-static {v4, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_runCatching"

    check-cast v3, Lc0/q1;

    invoke-static {v3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LP0/l;

    const-string v0, "$onResult"

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/q1;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v0, Lc0/q1;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lc0/q1;->i:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    const-string v0, "timeout "

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/q1;->s(Ljava/lang/String;)V

    new-instance v0, Lc0/m1;

    const-string v2, "timeout"

    invoke-direct {v0, v2}, Lc0/m1;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void

    :pswitch_2
    const-string v0, "$parent"

    check-cast v4, Landroid/view/ViewGroup;

    invoke-static {v4, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$mainTabUi"

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10

    check-cast v3, Landroid/view/ViewGroup;

    invoke-static {v0, v4, v3, v2, v1}, Lc0/G;->v(ILandroid/view/ViewGroup;Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
