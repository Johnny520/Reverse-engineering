.class public final Lc0/F1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Landroid/view/ViewGroup;

.field public final c:Landroid/widget/ImageView;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/ViewGroup;Landroid/widget/ImageView;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc0/F1;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lc0/F1;->b:Landroid/view/ViewGroup;

    iput-object p3, p0, Lc0/F1;->c:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lc0/F1;->c:Landroid/widget/ImageView;

    if-ne p2, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lc0/F1;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_1

    return-void

    :cond_1
    sget-object p2, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {p2}, Lc0/B1;->e()Z

    move-result p2

    if-nez p2, :cond_2

    return-void

    :cond_2
    sget-object p2, Lc0/G1;->e:Landroid/os/Handler;

    new-instance v0, LS/h;

    const/4 v1, 0x4

    invoke-direct {v0, p1, p0, v1}, LS/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onPreDraw()Z
    .locals 11

    iget-object v0, p0, Lc0/F1;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_5

    sget-object v2, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v2}, Lc0/B1;->e()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "LauncherUI"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    iget-object v5, p0, Lc0/F1;->b:Landroid/view/ViewGroup;

    iget-object v6, p0, Lc0/F1;->c:Landroid/widget/ImageView;

    if-eqz v2, :cond_2

    sget-object v2, Lc0/G1;->a:Ljava/lang/Object;

    sget-object v2, Lc0/G1;->j:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    cmp-long v2, v7, v9

    if-lez v2, :cond_2

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, v5, :cond_1

    return v1

    :cond_1
    invoke-static {v6}, Lc0/G1;->C(Landroid/widget/ImageView;)V

    return v1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lc0/G1;->p(Landroid/app/Activity;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Lc0/G1;->l(Landroid/app/Activity;)V

    return v1

    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, v5, :cond_4

    return v1

    :cond_4
    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v6}, Lc0/G1;->C(Landroid/widget/ImageView;)V

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    sub-int/2addr v0, v1

    if-ltz v0, :cond_5

    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eq v0, v6, :cond_5

    invoke-static {v6}, Lc0/G1;->r(Landroid/widget/ImageView;)V

    :cond_5
    :goto_0
    return v1
.end method
