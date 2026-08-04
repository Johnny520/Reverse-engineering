.class public final Lyyds/ᛷᲇᲀᲀ;
.super Lyyds/ᲀᛸᲈᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛷᛵᲇᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᛷᛵᲇᲁ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lyyds/ᲀᛸᲈᲁ;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᛷᲇᲀᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛵᲇᲁ;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲀᛸᲈᲁ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛱᲈᲁ(Landroid/view/View;I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛱᲈᲁ(Landroid/view/View;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final ᛲᛳᛶᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲀᛸᲈᲁ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛲᛳᛶᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛲᛳᛶᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲀᛸᲈᲁ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛲᛴᛳᛲ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛲᛴᛳᛲ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final ᛲᲈᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲀᛸᲈᲁ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Landroid/view/View;)Lyyds/ᛱᛱᛴ;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲀᛸᲈᲁ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lyyds/ᲀᛸᲈᲁ;->ᛵᛸᛸᛷ(Landroid/view/View;)Lyyds/ᛱᛱᛴ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-super {p0, p1}, Lyyds/ᲀᛸᲈᲁ;->ᛵᛸᛸᛷ(Landroid/view/View;)Lyyds/ᛱᛱᛴ;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛵᲇᲁ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛷᛵᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 4
    .line 5
    iget-object v0, v0, Lyyds/ᛷᛵᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 6
    .line 7
    invoke-virtual {v1}, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v1, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lyyds/ᲀᛸᲈᲁ;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1, p1, p2, p3}, Lyyds/ᲀᛸᲈᲁ;->ᛶᛷᛲᲁ(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lyyds/ᲀᛸᲈᲁ;->ᛶᛷᛲᲁ(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_1
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    iget-object p0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 49
    .line 50
    iget-object p0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return p0

    .line 54
    :cond_2
    invoke-super {p0, p1, p2, p3}, Lyyds/ᲀᛸᲈᲁ;->ᛶᛷᛲᲁ(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0
.end method

.method public final ᲀᛲᛳᲀ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲀᛸᲈᲁ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᲀᛲᛳᲀ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᲀᛲᛳᲀ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲀᛸᲈᲁ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᲀᛸᲈᲁ;->ᲇᲇᲇᛱ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V
    .locals 4

    .line 1
    iget-object v0, p2, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛷᲇᲀᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛵᲇᲁ;

    .line 4
    .line 5
    iget-object v2, v1, Lyyds/ᛷᛵᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 6
    .line 7
    iget-object v1, v1, Lyyds/ᛷᛵᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 8
    .line 9
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, p1, p2}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛵᛸᛲ(Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lyyds/ᛷᲇᲀᲀ;->ᛲᛴᛳᛲ:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lyyds/ᲀᛸᲈᲁ;

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {v3, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-virtual {v3, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
