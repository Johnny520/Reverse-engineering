.class public final Ly0;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ly0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ly0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Ly0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Ly0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->w:Landroid/view/ViewPropertyAnimator;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Z

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, Ly0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr70;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr70;->l()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    const-string v0, "ivyOJsx2GYKF\n"

    .line 18
    .line 19
    const-string v1, "65LnS60CcO0=\n"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Ly0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Landroid/widget/FrameLayout;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_1
    iget-object p1, p0, Ly0;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput-object v0, p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->h:Landroid/view/ViewPropertyAnimator;

    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_2
    iget-object p1, p0, Ly0;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lph;

    .line 49
    .line 50
    invoke-virtual {p1}, Lfj;->p()V

    .line 51
    .line 52
    .line 53
    iget-object p1, p1, Lph;->r:Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_3
    new-instance p1, Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object v0, p0, Ly0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ln2;

    .line 64
    .line 65
    iget-object v1, v0, Ln2;->e:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v2, 0x0

    .line 75
    :goto_0
    if-ge v2, v1, :cond_1

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Lvt;

    .line 82
    .line 83
    iget-object v3, v3, Lvt;->b:Lxt;

    .line 84
    .line 85
    iget-object v3, v3, Lxt;->o:Landroid/content/res/ColorStateList;

    .line 86
    .line 87
    if-eqz v3, :cond_0

    .line 88
    .line 89
    invoke-static {v0, v3}, Lch;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    return-void

    .line 96
    :pswitch_4
    iget-object p1, p0, Ly0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->w:Landroid/view/ViewPropertyAnimator;

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    iput-boolean v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Z

    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 6

    .line 1
    iget v0, p0, Ly0;->a:I

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
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v0, p0, Ly0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ln2;

    .line 15
    .line 16
    iget-object v1, v0, Ln2;->e:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lvt;

    .line 33
    .line 34
    iget-object v3, v3, Lvt;->b:Lxt;

    .line 35
    .line 36
    iget-object v4, v3, Lxt;->o:Landroid/content/res/ColorStateList;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    iget-object v3, v3, Lxt;->s:[I

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v4, v3, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {v0, v3}, Lch;->g(Landroid/graphics/drawable/Drawable;I)V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
