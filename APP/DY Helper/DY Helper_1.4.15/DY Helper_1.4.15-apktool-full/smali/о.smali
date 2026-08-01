.class public final Lо;
.super Landroid/view/View$AccessibilityDelegate;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroidx/core/view/α;


# direct methods
.method public constructor <init>(Landroidx/core/view/α;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lо;->α:Landroidx/core/view/α;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/core/view/α;->α(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 0

    .line 1
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/core/view/α;->β(Landroid/view/View;)Ln;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/core/view/α;->γ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    .line 1
    new-instance v0, Lэ;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lэ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lb92;->α:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-static {p1}, Lx82;->γ(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lx82;->β(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lx82;->α(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lz82;->β(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setStateDescription(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 39
    .line 40
    invoke-virtual {p0, p1, v0}, Landroidx/core/view/α;->δ(Landroid/view/View;Lэ;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    const p0, 0x7f0902d7

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ljava/util/List;

    .line 54
    .line 55
    if-nez p0, :cond_0

    .line 56
    .line 57
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 58
    .line 59
    :cond_0
    const/4 p1, 0x0

    .line 60
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-ge p1, p2, :cond_1

    .line 65
    .line 66
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Lч;

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Lэ;->β(Lч;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 p1, p1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/core/view/α;->ε(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroidx/core/view/α;->ζ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroidx/core/view/α;->η(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/core/view/α;->θ(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lо;->α:Landroidx/core/view/α;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/core/view/α;->ι(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
