.class public final Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(Landroidx/core/view/飘花落叶言子苏哲楪兰世;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 10
    iput p2, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, Lcom/google/android/material/focus/FocusRingDrawable;

    .line 16
    .line 17
    const/high16 p0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    iput p0, v1, Lcom/google/android/material/focus/FocusRingDrawable;->飘花落叶言子世楪苏兰哲:F

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :sswitch_1
    check-cast v1, Landroidx/core/view/飘花落叶言子苏哲楪兰世;

    .line 26
    .line 27
    invoke-interface {v1}, Landroidx/core/view/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :sswitch_2
    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    iput-object p0, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->飘花落叶言子世哲楪兰苏:Landroid/view/ViewPropertyAnimator;

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    iput-boolean p0, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->飘花落叶言子世楪苏哲兰:Z

    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_1
        0x5 -> :sswitch_0
    .end sparse-switch
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    new-instance p0, Ljava/util/ArrayList;

    .line 14
    .line 15
    check-cast v2, L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世兰哲苏;

    .line 16
    .line 17
    iget-object p1, v2, L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    :goto_0
    if-ge v1, p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Landroid/content/res/ColorStateList;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v2, v0}, L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世兰哲苏;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void

    .line 47
    :pswitch_1
    check-cast v2, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;

    .line 48
    .line 49
    invoke-virtual {v2}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏世兰()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_2
    check-cast v2, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世()V

    .line 59
    .line 60
    .line 61
    iget-object p0, v2, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Landroid/animation/ValueAnimator;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_3
    check-cast v2, Landroidx/core/view/飘花落叶言子苏哲楪兰世;

    .line 68
    .line 69
    invoke-interface {v2}, Landroidx/core/view/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世哲苏兰()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_4
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    iput-object p0, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->飘花落叶言子世哲楪兰苏:Landroid/view/ViewPropertyAnimator;

    .line 77
    .line 78
    iput-boolean v1, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->飘花落叶言子世楪苏哲兰:Z

    .line 79
    .line 80
    return-void

    .line 81
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
    .locals 5

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    new-instance p0, Ljava/util/ArrayList;

    .line 13
    .line 14
    check-cast v1, L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    iget-object p1, v1, L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-ge v0, p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    iget-object v2, v2, Lcom/google/android/material/checkbox/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;

    .line 35
    .line 36
    iget-object v3, v2, Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Landroid/content/res/ColorStateList;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    iget-object v2, v2, Lcom/google/android/material/checkbox/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲兰楪:[I

    .line 41
    .line 42
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v3, v2, v4}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {v1, v2}, L飘花落叶言子兰世哲苏楪/飘花落叶言子楪世兰哲苏;->setTint(I)V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void

    .line 57
    :sswitch_1
    check-cast v1, Landroidx/core/view/飘花落叶言子苏哲楪兰世;

    .line 58
    .line 59
    invoke-interface {v1}, Landroidx/core/view/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏兰哲()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method
