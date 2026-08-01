.class public abstract Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;
.implements Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;
.implements Landroidx/core/view/飘花落叶言子苏楪兰哲世;


# instance fields
.field protected blurAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏哲兰;

.field public dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

.field dismissWithRunnable:Ljava/lang/Runnable;

.field protected doAfterDismissTask:Ljava/lang/Runnable;

.field protected doAfterShowTask:Ljava/lang/Runnable;

.field protected handler:Landroid/os/Handler;

.field private hasModifySoftMode:Z

.field public hasMoveUp:Z

.field private final initTask:Ljava/lang/Runnable;

.field protected isCreated:Z

.field protected lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

.field protected popupContentAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;

.field public popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

.field public popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

.field private preSoftMode:I

.field protected shadowBgAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;

.field private showSoftInputTask:Lcom/lxj/xpopup/core/飘花落叶言子楪世哲兰苏;

.field private final touchSlop:I

.field private x:F

.field private y:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/lxj/xpopup/enums/PopupStatus;->Dismiss:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->hasMoveUp:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->isCreated:Z

    .line 12
    .line 13
    new-instance v1, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 23
    .line 24
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    check-cast v2, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;I)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->doAfterDismissTask:Ljava/lang/Runnable;

    .line 33
    .line 34
    iput-boolean v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->hasModifySoftMode:Z

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    iput v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->preSoftMode:I

    .line 38
    .line 39
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    invoke-direct {v1, v2, v3}, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;I)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->doAfterShowTask:Ljava/lang/Runnable;

    .line 46
    .line 47
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    invoke-direct {v1, v2, v4}, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏哲兰;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;I)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->initTask:Ljava/lang/Runnable;

    .line 54
    .line 55
    instance-of v1, p1, Landroid/app/Application;

    .line 56
    .line 57
    if-nez v1, :cond_0

    .line 58
    .line 59
    new-instance v1, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 60
    .line 61
    invoke-direct {v1, p0, v3}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;-><init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Z)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 65
    .line 66
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iput v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->touchSlop:I

    .line 75
    .line 76
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p0, v1}, Landroid/view/View;->setId(I)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getInnerLayoutId()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {p1, v1, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const/4 v0, 0x0

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_0
    const-string p0, "XPopup\u7684Context\u5fc5\u987b\u662fActivity\u7c7b\u578b\uff01"

    .line 108
    .line 109
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 p0, 0x0

    .line 113
    throw p0
.end method


# virtual methods
.method public addOnUnhandledKeyListener(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p1, p0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲世苏兰(Landroid/view/View;Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1, p0}, Landroidx/core/view/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏楪兰哲世;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const v0, 0x24090346

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/4 v0, 0x1

    .line 41
    if-ne p0, v0, :cond_4

    .line 42
    .line 43
    sget-object p0, Landroidx/core/view/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 44
    .line 45
    monitor-enter p0

    .line 46
    :try_start_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-ne v1, p1, :cond_2

    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    sget-object v0, Landroidx/core/view/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 73
    .line 74
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    monitor-exit p0

    .line 83
    return-void

    .line 84
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    throw p1

    .line 86
    :cond_4
    return-void
.end method

.method public applyDarkTheme()V
    .locals 0

    .line 1
    return-void
.end method

.method public applyLightTheme()V
    .locals 0

    .line 1
    return-void
.end method

.method public beforeDismiss()V
    .locals 0

    .line 1
    return-void
.end method

.method public beforeShow()V
    .locals 0

    .line 1
    return-void
.end method

.method public delayDismiss(J)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    move-wide p1, v0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, v2}, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public delayDismissWith(JLjava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismissWithRunnable:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->delayDismiss(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 1
    invoke-static {p0, p0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲世苏兰(Landroid/view/View;Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 40
    .line 41
    :cond_0
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 57
    .line 58
    iput-object v1, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 59
    .line 60
    iput-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 61
    .line 62
    :cond_2
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->shadowBgAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;

    .line 63
    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    iget-object p0, p0, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 75
    .line 76
    .line 77
    :cond_3
    return-void
.end method

.method public abstract dismiss()V
.end method

.method public dismissOrHideSoftInput()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Landroid/view/Window;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismiss()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    sget-object v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "input_method"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public dismissWith(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismissWithRunnable:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismiss()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public doAfterShow()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->doAfterShowTask:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->doAfterShowTask:Ljava/lang/Runnable;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getAnimationDuration()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    int-to-long v2, p0

    .line 17
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public focusAndProcessBackPress()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 10
    .line 11
    .line 12
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v2, 0x1c

    .line 15
    .line 16
    if-lt v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->addOnUnhandledKeyListener(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世哲苏兰;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/view/ViewGroup;

    .line 40
    .line 41
    invoke-static {v1, v3}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/util/ArrayList;Landroid/view/ViewGroup;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-lez v3, :cond_6

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 59
    .line 60
    iput v3, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->preSoftMode:I

    .line 61
    .line 62
    iget-object v3, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-ge v3, v4, :cond_7

    .line 73
    .line 74
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Landroid/widget/EditText;

    .line 79
    .line 80
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    if-lt v5, v2, :cond_1

    .line 83
    .line 84
    invoke-virtual {p0, v4}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->addOnUnhandledKeyListener(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_1
    :try_start_0
    const-class v5, Landroid/view/View;

    .line 89
    .line 90
    const-string v6, "getListenerInfo"

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-nez v6, :cond_2

    .line 102
    .line 103
    invoke-virtual {v5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v5, v4, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    const-string v6, "android.view.View$ListenerInfo"

    .line 111
    .line 112
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    const-string v7, "mOnKeyListener"

    .line 117
    .line 118
    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v6}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_3

    .line 127
    .line 128
    invoke-virtual {v6, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 129
    .line 130
    .line 131
    :cond_3
    invoke-virtual {v6, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    if-eqz v5, :cond_4

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catch_0
    :cond_4
    new-instance v5, Lcom/lxj/xpopup/core/飘花落叶言子楪世哲苏兰;

    .line 139
    .line 140
    invoke-direct {v5, p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世哲苏兰;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 144
    .line 145
    .line 146
    :goto_2
    if-nez v3, :cond_5

    .line 147
    .line 148
    iget-object v5, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, Landroid/view/View;->requestFocus()Z

    .line 160
    .line 161
    .line 162
    iget-object v4, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_6
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    :cond_7
    return-void
.end method

.method public genAnimatorByPopupType()L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public getActivityContentLeft()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const v0, 0x1020002

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x2

    .line 33
    new-array v0, v0, [I

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 36
    .line 37
    .line 38
    aget p0, v0, v1

    .line 39
    .line 40
    return p0
.end method

.method public getActivityContentView()Landroid/view/View;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const v0, 0x1020002

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public getAnimationDuration()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    sget-object p0, Lcom/lxj/xpopup/enums/PopupAnimation;->NoAnimation:Lcom/lxj/xpopup/enums/PopupAnimation;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    sget p0, L飘花落叶言楪哲苏兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 14
    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public getHostWindow()Landroid/view/Window;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 9
    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public getImplLayoutId()I
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    return p0
.end method

.method public abstract getInnerLayoutId()I
.end method

.method public getInternalFragmentNames()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaxHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public getMaxWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public getPopupAnimator()L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getPopupContentView()Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public getPopupHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public getPopupImplView()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public getPopupWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public getShadowBgColor()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    sget p0, L飘花落叶言楪哲苏兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 9
    .line 10
    return p0
.end method

.method public getStatusBarBgColor()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    sget p0, L飘花落叶言楪哲苏兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    return p0
.end method

.method public getWindowDecorView()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    return-object p0
.end method

.method public init()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->shadowBgAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getAnimationDuration()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getShadowBgColor()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v0, p0, v1, v3}, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;-><init>(Landroid/view/View;ILcom/lxj/xpopup/enums/PopupAnimation;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Landroid/animation/ArgbEvaluator;

    .line 20
    .line 21
    invoke-direct {v1}, Landroid/animation/ArgbEvaluator;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Landroid/animation/ArgbEvaluator;

    .line 25
    .line 26
    iput v2, v0, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 27
    .line 28
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->shadowBgAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-boolean v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->isCreated:Z

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->initPopupContent()V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-boolean v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->isCreated:Z

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->isCreated:Z

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->onCreate()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->lifecycleRegistry:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 53
    .line 54
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_CREATE:Landroidx/lifecycle/Lifecycle$Event;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    :cond_2
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 65
    .line 66
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->initTask:Ljava/lang/Runnable;

    .line 67
    .line 68
    const-wide/16 v1, 0xa

    .line 69
    .line 70
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public initAnimator()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->genAnimatorByPopupType()L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupContentAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupAnimator()L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupContentAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->shadowBgAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;

    .line 29
    .line 30
    invoke-virtual {v0}, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupContentAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public abstract initPopupContent()V
.end method

.method public isDismiss()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 2
    .line 3
    sget-object v0, Lcom/lxj/xpopup/enums/PopupStatus;->Dismiss:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isShow()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 2
    .line 3
    sget-object v0, Lcom/lxj/xpopup/enums/PopupStatus;->Dismiss:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public onBackPressed()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract onCreate()V
.end method

.method public onDestroy()V
    .locals 1
    .annotation runtime Landroidx/lifecycle/飘花落叶言子世兰楪哲苏;
        value = .enum Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->destroy()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getWindowDecorView()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 15
    .line 16
    const v1, 0x1020002

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iget-boolean v0, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Z

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->destroy()V

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    instance-of v0, v0, Landroidx/fragment/app/FragmentActivity;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    sget-object v0, Lcom/lxj/xpopup/enums/PopupStatus;->Dismiss:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 99
    .line 100
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 101
    .line 102
    iput-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->showSoftInputTask:Lcom/lxj/xpopup/core/飘花落叶言子楪世哲兰苏;

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->hasMoveUp:Z

    .line 106
    .line 107
    return-void
.end method

.method public abstract onDismiss()V
.end method

.method public onKeyboardHeightChange(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public onShow()V
    .locals 0

    .line 1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v1, v2, v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(FFLandroid/graphics/Rect;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-nez v0, :cond_4

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    if-eq v0, v1, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    if-eq v0, v2, :cond_0

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    if-eq v0, v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 44
    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismiss()V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    return v1

    .line 59
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget v2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->x:F

    .line 64
    .line 65
    sub-float/2addr v0, v2

    .line 66
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iget v3, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->y:F

    .line 71
    .line 72
    sub-float/2addr v2, v3

    .line 73
    float-to-double v3, v0

    .line 74
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 75
    .line 76
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    float-to-double v7, v2

    .line 81
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    add-double/2addr v5, v3

    .line 86
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide v2

    .line 90
    double-to-float v0, v2

    .line 91
    invoke-virtual {p0, p1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->passTouchThrough(Landroid/view/MotionEvent;)V

    .line 92
    .line 93
    .line 94
    iget p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->touchSlop:I

    .line 95
    .line 96
    int-to-float p1, p1

    .line 97
    cmpg-float p1, v0, p1

    .line 98
    .line 99
    if-gez p1, :cond_2

    .line 100
    .line 101
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 102
    .line 103
    if-eqz p1, :cond_2

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismiss()V

    .line 109
    .line 110
    .line 111
    :cond_2
    const/4 p1, 0x0

    .line 112
    iput p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->x:F

    .line 113
    .line 114
    iput p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->y:F

    .line 115
    .line 116
    return v1

    .line 117
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iput v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->x:F

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iput v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->y:F

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->passTouchThrough(Landroid/view/MotionEvent;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    :goto_0
    return v1
.end method

.method public onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->processKeyEvent(ILandroid/view/KeyEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public passTouchThrough(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public processKeyEvent(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ne p1, v0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 p2, 0x1

    .line 9
    if-ne p1, p2, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->onBackPressed()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    return p2

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismissOrHideSoftInput()V

    .line 33
    .line 34
    .line 35
    return p2

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public show()Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;
    .locals 7

    .line 1
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_11

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_10

    .line 19
    .line 20
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 21
    .line 22
    sget-object v2, Lcom/lxj/xpopup/enums/PopupStatus;->Showing:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 23
    .line 24
    if-eq v0, v2, :cond_11

    .line 25
    .line 26
    sget-object v3, Lcom/lxj/xpopup/enums/PopupStatus;->Dismissing:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 27
    .line 28
    if-ne v0, v3, :cond_1

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_1
    iput-object v2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 47
    .line 48
    if-eqz v0, :cond_f

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    instance-of v0, v0, Landroidx/fragment/app/FragmentActivity;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-nez v0, :cond_a

    .line 76
    .line 77
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)Landroid/app/Activity;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const v1, 0x1020030

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/4 v2, 0x3

    .line 97
    const/4 v3, 0x0

    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {v4}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Landroid/content/Context;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_5

    .line 109
    .line 110
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 119
    .line 120
    and-int/lit8 v4, v4, 0xf

    .line 121
    .line 122
    if-lt v4, v2, :cond_4

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    goto :goto_1

    .line 135
    :cond_6
    move v1, v3

    .line 136
    :goto_1
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getActivityContentView()Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    new-instance v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 141
    .line 142
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-static {v6}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Landroid/content/Context;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_7

    .line 159
    .line 160
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    iget v6, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 169
    .line 170
    and-int/lit8 v6, v6, 0xf

    .line 171
    .line 172
    if-lt v6, v2, :cond_8

    .line 173
    .line 174
    :cond_7
    move v3, v1

    .line 175
    :cond_8
    sub-int/2addr v0, v3

    .line 176
    invoke-direct {v5, v4, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Landroid/content/Context;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_9

    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getActivityContentLeft()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    iput v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 194
    .line 195
    :cond_9
    invoke-virtual {p0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 196
    .line 197
    .line 198
    :cond_a
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 204
    .line 205
    if-nez v0, :cond_c

    .line 206
    .line 207
    new-instance v0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 208
    .line 209
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    const v2, 0x2413060e

    .line 214
    .line 215
    .line 216
    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-eqz v1, :cond_b

    .line 224
    .line 225
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    check-cast v1, Landroid/view/ViewGroup;

    .line 230
    .line 231
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    :cond_b
    iput-object p0, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 235
    .line 236
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 237
    .line 238
    :cond_c
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)Landroid/app/Activity;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-eqz v0, :cond_d

    .line 243
    .line 244
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_d

    .line 249
    .line 250
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_d

    .line 257
    .line 258
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dialog:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;

    .line 259
    .line 260
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 261
    .line 262
    .line 263
    :cond_d
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getHostWindow()Landroid/view/Window;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;

    .line 268
    .line 269
    invoke-direct {v1, p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)V

    .line 270
    .line 271
    .line 272
    sget-object v2, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 279
    .line 280
    const/16 v3, 0x200

    .line 281
    .line 282
    and-int/2addr v2, v3

    .line 283
    if-eqz v2, :cond_e

    .line 284
    .line 285
    invoke-virtual {v0, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 286
    .line 287
    .line 288
    :cond_e
    const v2, 0x1020002

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Landroid/widget/FrameLayout;

    .line 296
    .line 297
    invoke-static {v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroid/view/Window;)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    filled-new-array {v3}, [I

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    new-instance v4, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;

    .line 306
    .line 307
    invoke-direct {v4, v0, v3, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;-><init>(Landroid/view/Window;[ILcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0, v4}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 315
    .line 316
    .line 317
    sget-object v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 318
    .line 319
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    invoke-virtual {v0, v1, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->init()V

    .line 327
    .line 328
    .line 329
    return-object p0

    .line 330
    :cond_f
    const-string p0, "\u5982\u679c\u5f39\u7a97\u5bf9\u8c61\u662f\u590d\u7528\u7684\uff0c\u5219\u4e0d\u8981\u8bbe\u7f6eisDestroyOnDismiss(true)"

    .line 331
    .line 332
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    return-object v1

    .line 336
    :cond_10
    const-string p0, "popupInfo is null, if your popup object is used once, do not set isDestroyOnDismiss(true) !"

    .line 337
    .line 338
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    return-object v1

    .line 342
    :cond_11
    :goto_2
    return-object p0
.end method

.method public showSoftInput(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->showSoftInputTask:Lcom/lxj/xpopup/core/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroid/view/View;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->showSoftInputTask:Lcom/lxj/xpopup/core/飘花落叶言子楪世哲兰苏;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->showSoftInputTask:Lcom/lxj/xpopup/core/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    const-wide/16 v0, 0xa

    .line 29
    .line 30
    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public smartDismiss()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public toggle()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->isShow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismiss()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->show()Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public tryRemoveFragments()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroidx/fragment/app/FragmentActivity;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, v0, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世哲兰苏楪()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getInternalFragmentNames()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-lez v2, :cond_1

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-ge v2, v3, :cond_1

    .line 45
    .line 46
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {p0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    new-instance v3, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;

    .line 67
    .line 68
    invoke-direct {v3, v0}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x1

    .line 81
    invoke-virtual {v3, v4}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Z)I

    .line 82
    .line 83
    .line 84
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    return-void
.end method
