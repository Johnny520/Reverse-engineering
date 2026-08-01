.class public final Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:[I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;[ILcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/view/Window;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:[I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/view/Window;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroid/view/Window;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:[I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget v3, v1, v2

    .line 11
    .line 12
    if-eq v3, v0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->onKeyboardHeightChange(I)V

    .line 19
    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    new-instance v4, Landroid/view/animation/LinearInterpolator;

    .line 37
    .line 38
    invoke-direct {v4}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-wide/16 v4, 0x64

    .line 46
    .line 47
    invoke-virtual {v3, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 52
    .line 53
    .line 54
    iput-boolean v2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->hasMoveUp:Z

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sput v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:I

    .line 58
    .line 59
    new-instance v3, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 60
    .line 61
    const/16 v4, 0xb

    .line 62
    .line 63
    invoke-direct {v3, p0, v4}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 67
    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    iput-boolean v3, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->hasMoveUp:Z

    .line 71
    .line 72
    :goto_0
    aput v0, v1, v2

    .line 73
    .line 74
    :cond_1
    return-void
.end method
