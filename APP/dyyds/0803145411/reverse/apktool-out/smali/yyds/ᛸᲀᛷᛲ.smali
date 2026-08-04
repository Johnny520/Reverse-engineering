.class public final Lyyds/ᛸᲀᛷᛲ;
.super Landroid/view/View$AccessibilityDelegate;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᲀᛸᲈᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

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
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᲀᛸᲈᲁ;->ᛵᛸᛸᛷ(Landroid/view/View;)Lyyds/ᛱᛱᛴ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

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
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᲀᛲᛳᲀ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛱᛵᲈᛸ;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lyyds/ᛱᛵᲈᛸ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-static {p1}, Lyyds/ᲁᛷᛶᲇ;->ᲀᛲᛳᲀ(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lyyds/ᲁᛷᛶᲇ;->ᛵᛸᛸᛷ(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lyyds/ᲁᛷᛶᲇ;->ᛲᲈᲁ(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lyyds/ᛳᛵᛴᲈ;->ᛵᛸᛸᛷ(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setStateDescription(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 37
    .line 38
    invoke-virtual {p0, p1, v0}, Lyyds/ᲀᛸᲈᲁ;->ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    const p0, 0x66090468

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
    check-cast p2, Lyyds/ᛵᛲᛶᲁ;

    .line 69
    .line 70
    invoke-virtual {v0, p2}, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ(Lyyds/ᛵᛲᛶᲁ;)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛲᛴᛳᛲ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᲀᛸᲈᲁ;->ᲇᲇᲇᛱ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

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
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᲀᛸᲈᲁ;->ᛶᛷᛲᲁ(Landroid/view/View;ILandroid/os/Bundle;)Z

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
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛱᲈᲁ(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᲀᛷᛲ;->ᛲᲈᲁ:Lyyds/ᲀᛸᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛲᛳᛶᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
