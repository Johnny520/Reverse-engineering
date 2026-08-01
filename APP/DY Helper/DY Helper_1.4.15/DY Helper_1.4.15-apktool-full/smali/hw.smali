.class public final Lhw;
.super Landroidx/core/view/α;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic θ:Landroidx/drawerlayout/widget/DrawerLayout;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhw;->θ:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/core/view/α;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final α(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lhw;->θ:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->ε()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->η(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    sget-object p2, Lb92;->α:Ljava/util/WeakHashMap;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p1, p0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_1
    iget-object p0, p0, Landroidx/core/view/α;->ε:Landroid/view/View$AccessibilityDelegate;

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public final γ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/core/view/α;->γ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-class p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final δ(Landroid/view/View;Lэ;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/drawerlayout/widget/DrawerLayout;->Η:[I

    .line 2
    .line 3
    iget-object v0, p2, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/core/view/α;->ε:Landroid/view/View$AccessibilityDelegate;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 8
    .line 9
    .line 10
    const-class p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p2, p0}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lч;->γ:Lч;

    .line 27
    .line 28
    iget-object p0, p0, Lч;->α:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->removeAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)Z

    .line 33
    .line 34
    .line 35
    sget-object p0, Lч;->δ:Lч;

    .line 36
    .line 37
    iget-object p0, p0, Lч;->α:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->removeAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)Z

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final ζ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    sget-object v0, Landroidx/drawerlayout/widget/DrawerLayout;->Η:[I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/core/view/α;->ε:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
