.class public abstract Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;
.super Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field protected bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

.field private translateAnimator:L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x2409008d

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public addInnerContent()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->getImplLayoutId()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public dismiss()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 7
    .line 8
    sget-object v2, Lcom/lxj/xpopup/enums/PopupStatus;->Dismissing:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 9
    .line 10
    if-ne v1, v2, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    iput-object v2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 25
    .line 26
    new-instance v1, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    invoke-direct {v1, p0, v0}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;-><init>(Lcom/lxj/xpopup/widget/SmartDragLayout;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public doAfterDismiss()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->doAfterDismissTask:Ljava/lang/Runnable;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->handler:Landroid/os/Handler;

    .line 22
    .line 23
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->doAfterDismissTask:Ljava/lang/Runnable;

    .line 24
    .line 25
    const-wide/16 v1, 0x0

    .line 26
    .line 27
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public doDismissAnimation()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世哲苏:Z

    .line 13
    .line 14
    new-instance v1, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    invoke-direct {v1, p0, v0}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;-><init>(Lcom/lxj/xpopup/widget/SmartDragLayout;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public doShowAnimation()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p0, v1}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;-><init>(Lcom/lxj/xpopup/widget/SmartDragLayout;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public getImplLayoutId()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getInnerLayoutId()I
    .locals 0

    .line 1
    const p0, 0x240c0005

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public getMaxWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "window"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroid/view/WindowManager;

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, -0x1

    .line 21
    return p0

    .line 22
    :cond_0
    new-instance v0, Landroid/graphics/Point;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 32
    .line 33
    .line 34
    iget p0, v0, Landroid/graphics/Point;->x:I

    .line 35
    .line 36
    return p0
.end method

.method public getPopupAnimator()L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世苏兰哲;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->translateAnimator:L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世兰苏哲;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getAnimationDuration()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    sget-object v4, Lcom/lxj/xpopup/enums/PopupAnimation;->TranslateFromBottom:Lcom/lxj/xpopup/enums/PopupAnimation;

    .line 22
    .line 23
    invoke-direct {v0, v2, v3, v4}, L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世苏兰哲;-><init>(Landroid/view/View;ILcom/lxj/xpopup/enums/PopupAnimation;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->translateAnimator:L飘花落叶言楪哲兰世苏子/飘花落叶言子楪世兰苏哲;

    .line 27
    .line 28
    :cond_1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public initPopupContent()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->addInnerContent()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getAnimationDuration()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/lxj/xpopup/widget/SmartDragLayout;->setDuration(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 30
    .line 31
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v3, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 67
    .line 68
    iget-object v2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iput-boolean v1, v0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰世苏哲:Z

    .line 74
    .line 75
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 76
    .line 77
    iget-object v1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v2, v0

    .line 90
    check-cast v2, Landroid/view/ViewGroup;

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->getMaxWidth()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getMaxHeight()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupWidth()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupHeight()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    new-instance v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;

    .line 109
    .line 110
    invoke-direct/range {v1 .. v6}, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;-><init>(Landroid/view/ViewGroup;IIII)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 117
    .line 118
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;

    .line 119
    .line 120
    invoke-direct {v1, p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lcom/lxj/xpopup/widget/SmartDragLayout;->setOnCloseListener(Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰哲苏;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->bottomPopupContainer:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 127
    .line 128
    new-instance v1, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世哲兰;

    .line 129
    .line 130
    invoke-direct {v1, p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世哲兰;-><init>(Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public onDetachedFromWindow()V
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
    invoke-super {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->onDetachedFromWindow()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
