.class public Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;
.super LYue/ۥۣ۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;
    }
.end annotation


# instance fields
.field private final mItemDelegate:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;

.field final mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥۣ۟۟ۢ;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->getItemDelegate()LYue/ۥۣ۟۟ۢ;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mItemDelegate:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;

    invoke-direct {p1, p0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;)V

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mItemDelegate:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;

    :goto_0
    return-void
.end method


# virtual methods
.method public getItemDelegate()LYue/ۥۣ۟۟ۢ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mItemDelegate:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;

    return-object v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->shouldIgnore()Z

    move-result v0

    if-nez v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->shouldIgnore()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->onInitializeAccessibilityNodeInfo(LYue/ۥ۟۟ۥۧ;)V

    :cond_0
    return-void
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->shouldIgnore()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public shouldIgnore()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->hasPendingAdapterUpdates()Z

    move-result v0

    return v0
.end method
