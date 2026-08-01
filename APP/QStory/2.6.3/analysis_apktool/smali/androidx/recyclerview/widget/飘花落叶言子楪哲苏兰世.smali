.class public final Landroidx/recyclerview/widget/飘花落叶言子楪哲苏兰世;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;

.field public 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Z

    .line 3
    .line 4
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-boolean p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-boolean v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪苏兰哲:Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Float;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v1, 0x0

    .line 24
    cmpl-float p1, p1, v1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iput v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪哲苏兰:I

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰哲世(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    const/4 p1, 0x2

    .line 35
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪哲苏兰:I

    .line 36
    .line 37
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 40
    .line 41
    .line 42
    return-void
.end method
