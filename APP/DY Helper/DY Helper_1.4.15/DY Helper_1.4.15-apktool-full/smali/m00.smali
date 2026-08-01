.class public final Lm00;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public β:Z

.field public final synthetic γ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm00;->α:I

    .line 2
    .line 3
    iput-object p2, p0, Lm00;->γ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lm00;->β:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget p1, p0, Lm00;->α:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lm00;->β:Z

    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lm00;->β:Z

    .line 12
    .line 13
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget p1, p0, Lm00;->α:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm00;->γ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/ScrollingTabContainerView;

    .line 9
    .line 10
    iget-boolean p0, p0, Lm00;->β:Z

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :pswitch_0
    iget-object p1, p0, Lm00;->γ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lo00;

    .line 23
    .line 24
    iget-boolean v0, p0, Lm00;->β:Z

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iput-boolean v1, p0, Lm00;->β:Z

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object p0, p1, Lo00;->φ:Landroid/animation/ValueAnimator;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Float;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    const/4 v0, 0x0

    .line 45
    cmpl-float p0, p0, v0

    .line 46
    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    iput v1, p1, Lo00;->χ:I

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Lo00;->δ(I)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/4 p0, 0x2

    .line 56
    iput p0, p1, Lo00;->χ:I

    .line 57
    .line 58
    iget-object p0, p1, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    :goto_1
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Lm00;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Lm00;->γ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Landroidx/appcompat/widget/ScrollingTabContainerView;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iput-boolean v0, p0, Lm00;->β:Z

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
