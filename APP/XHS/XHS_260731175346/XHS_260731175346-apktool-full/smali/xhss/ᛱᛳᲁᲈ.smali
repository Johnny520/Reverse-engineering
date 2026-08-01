.class public final Lxhss/ᛱᛳᲁᲈ;
.super Landroid/view/View$AccessibilityDelegate;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;


# direct methods
.method public constructor <init>(Lxhss/ᛲᛴᲀᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛲᛴᲀᲈ;->ᛷᛵᛵᲈ:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛲᛴᲀᲈ;->ᛷᛵᛵᲈ:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 p1, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p0}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, p1

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object p0, v0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lxhss/ᛲᛴᲀᲈ;->ᛷᛵᛵᲈ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛸᛴᛸᛲ;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lxhss/ᛸᛴᛸᛲ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    .line 5
    .line 6
    sget v1, Lxhss/ᛷᛱᛴᛴ;->ᛷᛵᛵᲈ:I

    .line 7
    .line 8
    invoke-static {p1}, Lxhss/ᛸᛴᛸᛸ;->ᛳᲁᲇᛸ(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lxhss/ᛸᛴᛸᛸ;->ᛱᛱᛲᲇ(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lxhss/ᛸᛴᛸᛸ;->ᛷᛵᛵᲈ(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lxhss/ᛵᲈᛷᛴ;->ᛷᛵᛵᲈ(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setStateDescription(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 37
    .line 38
    invoke-virtual {p0, p1, v0}, Lxhss/ᛲᛴᲀᲈ;->ᛱᛱᛲᲇ(Landroid/view/View;Lxhss/ᛸᛴᛸᛲ;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    const p0, 0x640800fc

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/util/List;

    .line 52
    .line 53
    if-nez p0, :cond_0

    .line 54
    .line 55
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 56
    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-ge p1, p2, :cond_1

    .line 63
    .line 64
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Lxhss/ᛳᛸᛵᲀ;

    .line 69
    .line 70
    iget-object p2, p2, Lxhss/ᛳᛸᛵᲀ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 73
    .line 74
    iget-object v1, v0, Lxhss/ᛸᛴᛸᛲ;->ᛷᛵᛵᲈ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 75
    .line 76
    invoke-virtual {v1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛲᛴᲀᲈ;->ᛷᛵᛵᲈ:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛲᛴᲀᲈ;->ᛷᛵᛵᲈ:Landroid/view/View$AccessibilityDelegate;

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

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lxhss/ᛲᛴᲀᲈ;->ᛳᲁᲇᛸ(Landroid/view/View;ILandroid/os/Bundle;)Z

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
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛲᛴᲀᲈ;->ᛷᛵᛵᲈ:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛳᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛴᲀᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛲᛴᲀᲈ;->ᛷᛵᛵᲈ:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
