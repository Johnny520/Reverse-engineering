.class public LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;
.super LYue/ۥۣ۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۤۦ۠;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦ۠;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    invoke-direct {p0}, LYue/ۥۣ۟۟ۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    const-class p1, LYue/ۥۢۤۦ۠;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ۟۟()Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    const/16 v0, 0x1000

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    iget-object p1, p1, LYue/ۥۢۤۦ۠;->ۥ۟۟۠ۧ:LYue/ۥۣۡۥۦ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣۡۥۦ;->ۥ۟۟۟۟()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    iget p1, p1, LYue/ۥۢۤۦ۠;->ۥ۟۟۠ۨ:I

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    iget p1, p1, LYue/ۥۢۤۦ۠;->ۥ۟۟۠ۨ:I

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V
    .locals 1

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    const-class p1, LYue/ۥۢۤۦ۠;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ۟۟()Z

    move-result p1

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۢۤ(Z)V

    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦ۠;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1000

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ(I)V

    :cond_0
    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦ۠;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x2000

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ(I)V

    :cond_1
    return-void
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    invoke-super {p0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

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
    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, LYue/ۥۢۤۦ۠;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    iget p2, p1, LYue/ۥۢۤۦ۠;->ۥ۟۟۠ۨ:I

    sub-int/2addr p2, p3

    invoke-virtual {p1, p2}, LYue/ۥۢۤۦ۠;->setCurrentItem(I)V

    return p3

    :cond_2
    return v0

    :cond_3
    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    invoke-virtual {p1, p3}, LYue/ۥۢۤۦ۠;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    iget p2, p1, LYue/ۥۢۤۦ۠;->ۥ۟۟۠ۨ:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, LYue/ۥۢۤۦ۠;->setCurrentItem(I)V

    return p3

    :cond_4
    return v0
.end method

.method public final ۥ۟۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦ۠$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦ۠;

    iget-object v0, v0, LYue/ۥۢۤۦ۠;->ۥ۟۟۠ۧ:LYue/ۥۣۡۥۦ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۣۡۥۦ;->ۥ۟۟۟۟()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
