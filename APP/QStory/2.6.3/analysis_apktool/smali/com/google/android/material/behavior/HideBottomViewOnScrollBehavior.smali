.class public Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;
.super L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u54f2\u696a\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public 飘花落叶言子楪世兰苏哲:Landroid/animation/TimeInterpolator;

.field public 飘花落叶言子楪世哲兰苏:Landroid/animation/TimeInterpolator;

.field public 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashSet;

.field public 飘花落叶言子楪哲世苏兰:I

.field public 飘花落叶言子楪苏世兰哲:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪苏世哲兰:Landroid/view/accessibility/AccessibilityManager;

.field public 飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

.field public 飘花落叶言子楪苏兰哲世:I

.field public final 飘花落叶言子楪苏哲世兰:Z

.field public 飘花落叶言子楪苏哲兰世:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世兰哲苏:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲世兰:Z

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    iput v1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 19
    .line 20
    iput v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏兰哲世:I

    .line 21
    .line 22
    iput v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪哲世苏兰:I

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashSet;

    const/4 p1, 0x0

    .line 27
    iput p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世兰哲苏:I

    const/4 p2, 0x1

    .line 28
    iput-boolean p2, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲世兰:Z

    const/4 p2, 0x2

    .line 29
    iput p2, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 30
    iput p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏兰哲世:I

    .line 31
    iput p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪哲世苏兰:I

    return-void
.end method


# virtual methods
.method public addOnScrollStateChangedListener(L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnScrollStateChangedListener(L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪兰世苏哲(Landroid/view/View;I)V
    .locals 2

    .line 1
    iput p2, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x4

    .line 5
    if-ne p2, v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eq p2, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏兰哲世:I

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eq p2, v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪哲世苏兰:I

    .line 39
    .line 40
    :cond_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 v0, 0x2

    .line 45
    if-ne p2, v0, :cond_5

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-ne p2, v1, :cond_4

    .line 52
    .line 53
    iget p2, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏兰哲世:I

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 56
    .line 57
    .line 58
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-ne p2, v1, :cond_5

    .line 63
    .line 64
    iget p2, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪哲世苏兰:I

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    :cond_5
    :goto_0
    iget-object p0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashSet;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_6

    .line 80
    .line 81
    return-void

    .line 82
    :cond_6
    invoke-static {p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    throw p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(Landroid/view/View;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, p1, v1}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪兰世苏哲(Landroid/view/View;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    int-to-long v2, v0

    .line 23
    iget-object v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世哲兰苏:Landroid/animation/TimeInterpolator;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-virtual {v4, v5}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v2, Landroidx/core/view/飘花落叶言子苏哲兰楪世;

    .line 43
    .line 44
    invoke-direct {v2, p0, v1, p1}, Landroidx/core/view/飘花落叶言子苏哲兰楪世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

    .line 52
    .line 53
    return-void
.end method

.method public 飘花落叶言子楪哲苏世兰(Landroid/view/View;II)Z
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ne p2, p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public 飘花落叶言子楪苏世哲兰(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 12
    .line 13
    add-int/2addr p3, p1

    .line 14
    iput p3, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世兰哲苏:I

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const p3, 0x2404041e

    .line 21
    .line 22
    .line 23
    const/16 v0, 0xe1

    .line 24
    .line 25
    invoke-static {p1, p3, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏兰楪世哲(Landroid/content/Context;II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世苏兰哲:I

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const p3, 0x24040424

    .line 36
    .line 37
    .line 38
    const/16 v0, 0xaf

    .line 39
    .line 40
    invoke-static {p1, p3, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏兰楪世哲(Landroid/content/Context;II)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世哲苏兰:I

    .line 45
    .line 46
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object p3, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 51
    .line 52
    const v0, 0x2404042e

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0, p3}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏兰楪哲世(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世哲兰苏:Landroid/animation/TimeInterpolator;

    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    sget-object p3, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 66
    .line 67
    invoke-static {p1, v0, p3}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏兰楪哲世(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世兰苏哲:Landroid/animation/TimeInterpolator;

    .line 72
    .line 73
    iget-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世哲兰:Landroid/view/accessibility/AccessibilityManager;

    .line 74
    .line 75
    if-nez p1, :cond_0

    .line 76
    .line 77
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-class p3, Landroid/view/accessibility/AccessibilityManager;

    .line 82
    .line 83
    invoke-virtual {p1, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 88
    .line 89
    iput-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世哲兰:Landroid/view/accessibility/AccessibilityManager;

    .line 90
    .line 91
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世哲兰:Landroid/view/accessibility/AccessibilityManager;

    .line 92
    .line 93
    const/4 p3, 0x0

    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    iget-object v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 97
    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    new-instance v0, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 101
    .line 102
    invoke-direct {v0, p0, p2, p3}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世苏哲兰;Landroid/view/View;I)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 108
    .line 109
    .line 110
    new-instance p1, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;

    .line 111
    .line 112
    const/4 v0, 0x5

    .line 113
    invoke-direct {p1, p0, v0}, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    return p3
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III[I)V
    .locals 0

    .line 1
    if-lez p3, :cond_3

    .line 2
    .line 3
    iget p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-boolean p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏哲世兰:Z

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世哲兰:Landroid/view/accessibility/AccessibilityManager;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/View;->clearAnimation()V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪兰世苏哲(Landroid/view/View;I)V

    .line 35
    .line 36
    .line 37
    iget p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世兰哲苏:I

    .line 38
    .line 39
    iget p3, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世哲苏兰:I

    .line 40
    .line 41
    int-to-long p3, p3

    .line 42
    iget-object p5, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪世兰苏哲:Landroid/animation/TimeInterpolator;

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 45
    .line 46
    .line 47
    move-result-object p6

    .line 48
    int-to-float p1, p1

    .line 49
    invoke-virtual {p6, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1, p5}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1, p3, p4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p3, Landroidx/core/view/飘花落叶言子苏哲兰楪世;

    .line 62
    .line 63
    const/4 p4, 0x2

    .line 64
    invoke-direct {p3, p0, p4, p2}, Landroidx/core/view/飘花落叶言子苏哲兰楪世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    if-gez p3, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0, p2}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪哲兰苏世(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_0
    return-void
.end method
