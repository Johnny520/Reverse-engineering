.class public final Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final 飘花落叶言子楪世兰苏哲(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final 飘花落叶言子楪世哲兰苏(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final 飘花落叶言子楪世哲苏兰(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final 飘花落叶言子楪世苏兰哲(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final 飘花落叶言子楪世苏哲兰(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    check-cast p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰楪哲:Landroid/view/accessibility/AccessibilityManager;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰哲楪:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰哲楪:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    :pswitch_2
    return-void

    .line 31
    :pswitch_3
    check-cast p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰哲苏;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Z

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/graphics/飘花落叶言子楪世哲兰苏;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Z

    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;

    .line 10
    .line 11
    iget-object p0, v2, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p1, v2, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世苏兰哲:Landroid/view/accessibility/AccessibilityManager;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 20
    .line 21
    .line 22
    iput-object v1, v2, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :pswitch_0
    check-cast v2, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 26
    .line 27
    iget-object p0, v2, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    iget-object p1, v2, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世哲兰:Landroid/view/accessibility/AccessibilityManager;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 36
    .line 37
    .line 38
    iput-object v1, v2, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    :cond_1
    return-void

    .line 41
    :pswitch_1
    check-cast v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;

    .line 42
    .line 43
    iget-object v0, v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世苏楪哲兰:Landroid/view/ViewTreeObserver;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世苏楪哲兰:Landroid/view/ViewTreeObserver;

    .line 58
    .line 59
    :cond_2
    iget-object v0, v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世苏楪哲兰:Landroid/view/ViewTreeObserver;

    .line 60
    .line 61
    iget-object v1, v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪苏哲兰:Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_2
    check-cast v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;

    .line 71
    .line 72
    iget-object v0, v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子世哲苏兰楪:Landroid/view/ViewTreeObserver;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子世哲苏兰楪:Landroid/view/ViewTreeObserver;

    .line 87
    .line 88
    :cond_4
    iget-object v0, v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子世哲苏兰楪:Landroid/view/ViewTreeObserver;

    .line 89
    .line 90
    iget-object v1, v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_3
    check-cast v2, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;

    .line 100
    .line 101
    iget-object p0, v2, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰哲楪:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 102
    .line 103
    if-eqz p0, :cond_6

    .line 104
    .line 105
    iget-object p1, v2, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰楪哲:Landroid/view/accessibility/AccessibilityManager;

    .line 106
    .line 107
    if-eqz p1, :cond_6

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 110
    .line 111
    .line 112
    :cond_6
    return-void

    .line 113
    :pswitch_4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 114
    .line 115
    .line 116
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 117
    .line 118
    invoke-virtual {v2, v1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_5
    check-cast v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰哲苏;

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget-boolean p1, v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Z

    .line 129
    .line 130
    if-eqz p1, :cond_7

    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    iget-object p1, v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/graphics/飘花落叶言子楪世哲兰苏;

    .line 137
    .line 138
    invoke-virtual {p0, p1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 139
    .line 140
    .line 141
    const/4 p0, 0x0

    .line 142
    iput-boolean p0, v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Z

    .line 143
    .line 144
    :cond_7
    return-void

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
