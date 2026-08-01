.class public Lcom/google/android/material/behavior/HideViewOnScrollBehavior;
.super L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u54f2\u696a\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public 飘花落叶言子楪世兰苏哲:I

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

.field public 飘花落叶言子楪世哲苏兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪世苏兰哲:Landroid/view/accessibility/AccessibilityManager;

.field public 飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子楪哲世苏兰:I

.field public 飘花落叶言子楪苏世兰哲:Landroid/animation/TimeInterpolator;

.field public 飘花落叶言子楪苏世哲兰:Landroid/animation/TimeInterpolator;

.field public 飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

.field public 飘花落叶言子楪苏兰哲世:I

.field public 飘花落叶言子楪苏哲世兰:I

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
    iput-object v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲世兰:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iput v1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 16
    .line 17
    iput v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏兰哲世:I

    .line 18
    .line 19
    iput v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪哲世苏兰:I

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲世兰:I

    const/4 p2, 0x2

    .line 25
    iput p2, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

    .line 26
    iput p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏兰哲世:I

    .line 27
    iput p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪哲世苏兰:I

    return-void
.end method


# virtual methods
.method public addOnScrollStateChangedListener(L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnScrollStateChangedListener(L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪兰世哲苏(Landroid/view/View;I)V
    .locals 2

    .line 1
    iput p2, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

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
    iput p2, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏兰哲世:I

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
    iput p2, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪哲世苏兰:I

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
    iget p2, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏兰哲世:I

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
    iget p2, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪哲世苏兰:I

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    :cond_5
    :goto_0
    iget-object p0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashSet;

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

.method public final 飘花落叶言子楪兰世苏哲(Landroid/view/View;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

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
    invoke-virtual {p0, p1, v1}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪兰世哲苏(Landroid/view/View;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

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
    iget-object v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世兰苏哲:I

    .line 26
    .line 27
    int-to-long v0, v0

    .line 28
    iget-object v2, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏世哲兰:Landroid/animation/TimeInterpolator;

    .line 29
    .line 30
    iget-object v3, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-virtual {v3, p1, v4}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Landroid/view/View;I)Landroid/view/ViewPropertyAnimator;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Landroidx/core/view/飘花落叶言子苏哲兰楪世;

    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-direct {v1, p0, v2, p1}, Landroidx/core/view/飘花落叶言子苏哲兰楪世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

    .line 56
    .line 57
    return-void
.end method

.method public final 飘花落叶言子楪哲兰苏世(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget v0, v0, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    :pswitch_0
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :pswitch_1
    move v0, v2

    .line 18
    :goto_0
    if-eq v0, p1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    return-void

    .line 22
    :cond_1
    :goto_1
    if-eqz p1, :cond_4

    .line 23
    .line 24
    if-eq p1, v2, :cond_3

    .line 25
    .line 26
    if-ne p1, v3, :cond_2

    .line 27
    .line 28
    new-instance p1, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 29
    .line 30
    invoke-direct {p1, v2}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string p0, "Invalid view edge position value: "

    .line 37
    .line 38
    const-string v0, ". Must be 0, 1 or 2."

    .line 39
    .line 40
    invoke-static {p1, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    new-instance p1, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 49
    .line 50
    invoke-direct {p1, v1}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    new-instance p1, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 57
    .line 58
    invoke-direct {p1, v3}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪哲苏世兰(Landroid/view/View;II)Z
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

.method public final 飘花落叶言子楪苏世哲兰(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏兰哲:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-class v0, Landroid/view/accessibility/AccessibilityManager;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏兰哲:Landroid/view/accessibility/AccessibilityManager;

    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏兰哲:Landroid/view/accessibility/AccessibilityManager;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    new-instance v1, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    invoke-direct {v1, p0, p2, v0}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世苏哲兰;Landroid/view/View;I)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 36
    .line 37
    .line 38
    new-instance p1, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;

    .line 39
    .line 40
    const/4 v1, 0x6

    .line 41
    invoke-direct {p1, p0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世哲兰苏;

    .line 58
    .line 59
    iget v1, v1, L飘花落叶言子苏兰哲楪世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 60
    .line 61
    const/16 v2, 0x50

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    if-eq v1, v2, :cond_5

    .line 65
    .line 66
    const/16 v2, 0x51

    .line 67
    .line 68
    if-ne v1, v2, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-static {v1, p3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    const/4 v0, 0x3

    .line 76
    if-eq p3, v0, :cond_4

    .line 77
    .line 78
    const/16 v0, 0x13

    .line 79
    .line 80
    if-ne p3, v0, :cond_3

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    move p3, v3

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    :goto_0
    const/4 p3, 0x2

    .line 86
    :goto_1
    invoke-virtual {p0, p3}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪哲兰苏世(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    :goto_2
    invoke-virtual {p0, v0}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪哲兰苏世(I)V

    .line 91
    .line 92
    .line 93
    :goto_3
    iget-object p3, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 94
    .line 95
    iget p3, p3, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 96
    .line 97
    packed-switch p3, :pswitch_data_0

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 105
    .line 106
    :goto_4
    add-int/2addr p3, p1

    .line 107
    goto :goto_5

    .line 108
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :pswitch_1
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :goto_5
    iput p3, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲世兰:I

    .line 123
    .line 124
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const p3, 0x2404041e

    .line 129
    .line 130
    .line 131
    const/16 v0, 0xe1

    .line 132
    .line 133
    invoke-static {p1, p3, v0}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲楪兰苏(Landroid/content/Context;II)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    iput p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世兰苏哲:I

    .line 138
    .line 139
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const p3, 0x24040424

    .line 144
    .line 145
    .line 146
    const/16 v0, 0xaf

    .line 147
    .line 148
    invoke-static {p1, p3, v0}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲楪兰苏(Landroid/content/Context;II)I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    iput p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世兰哲苏:I

    .line 153
    .line 154
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object p3, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 159
    .line 160
    const v0, 0x2404042e

    .line 161
    .line 162
    .line 163
    invoke-static {p1, v0, p3}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏楪兰(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏世哲兰:Landroid/animation/TimeInterpolator;

    .line 168
    .line 169
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    sget-object p2, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 174
    .line 175
    invoke-static {p1, v0, p2}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏楪兰(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏世兰哲:Landroid/animation/TimeInterpolator;

    .line 180
    .line 181
    return v3

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III[I)V
    .locals 0

    .line 1
    if-lez p3, :cond_3

    .line 2
    .line 3
    iget p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲兰世:I

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
    iget-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏兰哲:Landroid/view/accessibility/AccessibilityManager;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/View;->clearAnimation()V

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪兰世哲苏(Landroid/view/View;I)V

    .line 31
    .line 32
    .line 33
    iget p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏哲世兰:I

    .line 34
    .line 35
    iget p3, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世兰哲苏:I

    .line 36
    .line 37
    int-to-long p3, p3

    .line 38
    iget-object p5, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏世兰哲:Landroid/animation/TimeInterpolator;

    .line 39
    .line 40
    iget-object p6, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;

    .line 41
    .line 42
    invoke-virtual {p6, p2, p1}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Landroid/view/View;I)Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, p5}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1, p3, p4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p3, Landroidx/core/view/飘花落叶言子苏哲兰楪世;

    .line 55
    .line 56
    const/4 p4, 0x3

    .line 57
    invoke-direct {p3, p0, p4, p2}, Landroidx/core/view/飘花落叶言子苏哲兰楪世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪苏兰世哲:Landroid/view/ViewPropertyAnimator;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    if-gez p3, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0, p2}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪兰世苏哲(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    :goto_0
    return-void
.end method
