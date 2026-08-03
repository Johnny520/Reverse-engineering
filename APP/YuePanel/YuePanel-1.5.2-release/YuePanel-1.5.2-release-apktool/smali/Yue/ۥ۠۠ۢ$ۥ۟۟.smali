.class public LYue/ۥ۠۠ۢ$ۥ۟۟;
.super LYue/ۥۣ۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/graphics/Rect;

.field public final synthetic ۥ۟:LYue/ۥ۠۠ۢ;


# direct methods
.method public constructor <init>(LYue/ۥ۠۠ۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠۠ۢ$ۥ۟۟;->ۥ۟:LYue/ۥ۠۠ۢ;

    invoke-direct {p0}, LYue/ۥۣ۟۟ۢ;-><init>()V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۠ۢ$ۥ۟۟;->ۥ:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟;->ۥ۟:LYue/ۥ۠۠ۢ;

    invoke-virtual {p2}, LYue/ۥ۠۠ۢ;->ۥ۟۟۠۟()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p0, LYue/ۥ۠۠ۢ$ۥ۟۟;->ۥ۟:LYue/ۥ۠۠ۢ;

    invoke-virtual {v0, p2}, LYue/ۥ۠۠ۢ;->ۥۣ۟۟۠(Landroid/view/View;)I

    move-result p2

    iget-object v0, p0, LYue/ۥ۠۠ۢ$ۥ۟۟;->ۥ۟:LYue/ۥ۠۠ۢ;

    invoke-virtual {v0, p2}, LYue/ۥ۠۠ۢ;->ۥ۟۟۠ۢ(I)Ljava/lang/CharSequence;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    const-string p1, "androidx.drawerlayout.widget.DrawerLayout"

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V
    .locals 3

    sget-boolean v0, LYue/ۥ۠۠ۢ;->ۥ۟۟ۥۢ:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۧ۟(LYue/ۥ۟۟ۥۧ;)LYue/ۥ۟۟ۥۧ;

    move-result-object v0

    invoke-super {p0, p1, v0}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۢۧ(Landroid/view/View;)V

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۤۦ(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p2, v1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۡۧ(Landroid/view/View;)V

    :cond_1
    invoke-virtual {p0, p2, v0}, LYue/ۥ۠۠ۢ$ۥ۟۟;->ۥ۟۟۟(LYue/ۥ۟۟ۥۧ;LYue/ۥ۟۟ۥۧ;)V

    invoke-virtual {v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۧۤ()V

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p0, p2, p1}, LYue/ۥ۠۠ۢ$ۥ۟۟;->ۥ۟۟(LYue/ۥ۟۟ۥۧ;Landroid/view/ViewGroup;)V

    :goto_0
    const-string p1, "androidx.drawerlayout.widget.DrawerLayout"

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۠۟(Z)V

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۠۠(Z)V

    sget-object p1, LYue/ۥ۟۟ۥۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۧۦ(LYue/ۥ۟۟ۥۧ$ۥ;)Z

    sget-object p1, LYue/ۥ۟۟ۥۧ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۧۦ(LYue/ۥ۟۟ۥۧ$ۥ;)Z

    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    sget-boolean v0, LYue/ۥ۠۠ۢ;->ۥ۟۟ۥۢ:Z

    if-nez v0, :cond_1

    invoke-static {p2}, LYue/ۥ۠۠ۢ;->ۥ۟۟ۡ۟(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟(LYue/ۥ۟۟ۥۧ;Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۠۠ۢ;->ۥ۟۟ۡ۟(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1, v2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟(Landroid/view/View;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۟(LYue/ۥ۟۟ۥۧ;LYue/ۥ۟۟ۥۧ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۢ$ۥ۟۟;->ۥ:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, LYue/ۥ۟۟ۥۧ;->ۥۣ۟۟۠(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۨۤ(Landroid/graphics/Rect;)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۦۨ()Z

    move-result v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۤ۠(Z)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۢۦ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۡۥ(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟۠ۨ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۡۢ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۟ۢ(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۥۤ()Z

    move-result v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۟ۨ(Z)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۥۦ()Z

    move-result v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۠۠(Z)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۤۧ()Z

    move-result v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۨ۠(Z)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۦۤ()Z

    move-result v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۢۥ(Z)V

    invoke-virtual {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟۠۟()I

    move-result p2

    invoke-virtual {p1, p2}, LYue/ۥ۟۟ۥۧ;->ۥ(I)V

    return-void
.end method
