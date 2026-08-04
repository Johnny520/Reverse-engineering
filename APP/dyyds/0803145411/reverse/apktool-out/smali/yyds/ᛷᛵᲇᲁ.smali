.class public final Lyyds/ᛷᛵᲇᲁ;
.super Lyyds/ᲀᛸᲈᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛷᲇᲀᲀ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;


# direct methods
.method public constructor <init>(Lyyds/ᛵᲇᛲᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᲀᛸᲈᲁ;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᛵᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 5
    .line 6
    iget-object p1, p0, Lyyds/ᛷᛵᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲇᲀᲀ;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lyyds/ᛷᛵᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲇᲀᲀ;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Lyyds/ᛷᲇᲀᲀ;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lyyds/ᛷᲇᲀᲀ;-><init>(Lyyds/ᛷᛵᲇᲁ;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lyyds/ᛷᛵᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲇᲀᲀ;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lyyds/ᲀᛸᲈᲁ;->ᛶᛷᛲᲁ(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Lyyds/ᛷᛵᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, p2, p3}, Lyyds/ᲇᲇᛵᛲ;->ᛴᛵᛷᛳ(ILandroid/os/Bundle;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final ᲀᛲᛳᲀ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lyyds/ᲀᛸᲈᲁ;->ᲀᛲᛳᲀ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lyyds/ᛵᲇᛲᛱ;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛷᛵᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    check-cast p1, Lyyds/ᛵᲇᛲᛱ;

    .line 17
    .line 18
    invoke-virtual {p1}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, p2}, Lyyds/ᲇᲇᛵᛲ;->ᛴᛸᛴᛸ(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    iget-object v1, p2, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛷᛵᲇᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p1, p0, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 27
    .line 28
    iget-object v0, p1, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 29
    .line 30
    iget-object p1, p1, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 31
    .line 32
    invoke-virtual {p0, v0, p1, p2}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲈᲇᛵ(Lyyds/ᲈᲈᲁᛱ;Lyyds/ᲈᛳᲇᛲ;Lyyds/ᛱᛵᲈᛸ;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
