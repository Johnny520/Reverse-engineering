.class public final L۟/kc$g;
.super Landroidx/core/view/AccessibilityDelegateCompat;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/kc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/kc;


# direct methods
.method public constructor <init>(L۟/kc;)V
    .locals 0

    iput-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    invoke-direct {p0}, Landroidx/core/view/AccessibilityDelegateCompat;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/core/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-class p1, L۟/kc;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    .line 14
    .line 15
    iget-object p1, p1, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, L۟/p7;->ۥ۟()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-le p1, v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/16 v0, 0x1000

    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    .line 40
    .line 41
    iget-object p1, p1, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, L۟/p7;->ۥ۟()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    .line 53
    .line 54
    iget p1, p1, L۟/kc;->ۥ۟ۢ:I

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    .line 60
    .line 61
    iget p1, p1, L۟/kc;->ۥ۟ۢ:I

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 64
    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/core/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 2
    .line 3
    .line 4
    const-class p1, L۟/kc;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    .line 14
    .line 15
    iget-object p1, p1, L۟/kc;->ۥ۟ۡ:L۟/p7;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, L۟/p7;->ۥ۟()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-le p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->setScrollable(Z)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, L۟/kc;->canScrollHorizontally(I)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    const/16 p1, 0x1000

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    .line 46
    .line 47
    const/4 v0, -0x1

    .line 48
    invoke-virtual {p1, v0}, L۟/kc;->canScrollHorizontally(I)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    const/16 p1, 0x2000

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/AccessibilityDelegateCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    const/4 p3, 0x1

    if-eqz p1, :cond_0

    return p3

    :cond_0
    const/16 p1, 0x1000

    const/4 v0, 0x0

    if-eq p2, p1, :cond_3

    const/16 p1, 0x2000

    if-eq p2, p1, :cond_1

    return v0

    :cond_1
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, L۟/kc;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    iget p2, p1, L۟/kc;->ۥ۟ۢ:I

    sub-int/2addr p2, p3

    :goto_0
    invoke-virtual {p1, p2}, L۟/kc;->setCurrentItem(I)V

    return p3

    :cond_2
    return v0

    :cond_3
    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    invoke-virtual {p1, p3}, L۟/kc;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, L۟/kc$g;->ۥ:L۟/kc;

    iget p2, p1, L۟/kc;->ۥ۟ۢ:I

    add-int/2addr p2, p3

    goto :goto_0

    :cond_4
    return v0
.end method
