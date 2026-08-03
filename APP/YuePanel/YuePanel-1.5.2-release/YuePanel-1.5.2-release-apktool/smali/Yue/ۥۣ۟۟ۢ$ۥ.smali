.class public final LYue/ۥۣ۟۟ۢ$ۥ;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟۟ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣ۟۟ۢ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟۟ۢ;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟۟ۢ;->getAccessibilityNodeProvider(Landroid/view/View;)LYue/ۥ۟۟ۦۡ;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥ۟۟ۦۡ;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    invoke-static {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۤۢ(Landroid/view/accessibility/AccessibilityNodeInfo;)LYue/ۥ۟۟ۥۧ;

    move-result-object v0

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥۣ۟۟ۨ(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۥۧ;->ۥۣ۟۠ۢ(Z)V

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۧۡ(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۠ۢ(Z)V

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۡۨ(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۡۦ(Ljava/lang/CharSequence;)V

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۥۥ(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۥۧ;->ۥۣ۟۠(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟۟۠(Ljava/lang/CharSequence;Landroid/view/View;)V

    invoke-static {p1}, LYue/ۥۣ۟۟ۢ;->getActionList(Landroid/view/View;)Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۥۧ;->ۥ۟(LYue/ۥ۟۟ۥۧ$ۥ;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->sendAccessibilityEvent(Landroid/view/View;I)V

    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟ۢ$ۥ;->ۥ:LYue/ۥۣ۟۟ۢ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
