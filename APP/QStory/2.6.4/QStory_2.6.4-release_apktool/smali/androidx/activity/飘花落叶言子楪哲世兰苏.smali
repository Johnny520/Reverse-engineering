.class public final Landroidx/activity/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/activity/飘花落叶言子楪苏兰哲世;
.implements Landroid/view/ViewTreeObserver$OnDrawListener;
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Landroidx/activity/ComponentActivity;

.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:J


# direct methods
.method public constructor <init>(Landroidx/activity/ComponentActivity;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:Landroidx/activity/ComponentActivity;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x2710

    .line 11
    .line 12
    add-long/2addr v0, v2

    .line 13
    iput-wide v0, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:J

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:Landroidx/activity/ComponentActivity;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    new-instance v0, Landroidx/activity/飘花落叶言子楪哲世苏兰;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final onDraw()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:Landroidx/activity/ComponentActivity;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getFullyDrawnReporter()Landroidx/activity/飘花落叶言子世楪兰哲苏;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v3, v1, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v3

    .line 21
    :try_start_0
    iget-boolean v1, v1, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v3

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iput-boolean v2, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Z

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    monitor-exit v3

    .line 42
    throw p0

    .line 43
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    iget-wide v5, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:J

    .line 48
    .line 49
    cmp-long v1, v3, v5

    .line 50
    .line 51
    if-lez v1, :cond_1

    .line 52
    .line 53
    iput-boolean v2, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Z

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 64
    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:Landroidx/activity/ComponentActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Z

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
