.class public Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;
.super LYue/ۥۣ۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;

.field public ۥ۟:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "LYue/\u06e5\u06df\u06df\u06e3\u06e2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥۣ۟۟ۢ;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;

    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)LYue/ۥ۟۟ۦۡ;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥۣ۟۟ۢ;->getAccessibilityNodeProvider(Landroid/view/View;)LYue/ۥ۟۟ۦۡ;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۣ۟۟ۢ;->getAccessibilityNodeProvider(Landroid/view/View;)LYue/ۥ۟۟ۦۡ;

    move-result-object p1

    return-object p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->shouldIgnore()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->onInitializeAccessibilityNodeInfoForItem(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    :goto_0
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_0
    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->shouldIgnore()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_0
    invoke-super {p0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->performAccessibilityActionForItem(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_2
    invoke-super {p0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->sendAccessibilityEvent(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->sendAccessibilityEvent(Landroid/view/View;I)V

    :goto_0
    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟۟ۢ;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟(Landroid/view/View;)LYue/ۥۣ۟۟ۢ;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣ۟۟ۢ;

    return-object p1
.end method

.method public ۥ۟۟۟(Landroid/view/View;)V
    .locals 2

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥۣ۟۟ۡ(Landroid/view/View;)LYue/ۥۣ۟۟ۢ;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۢ$ۥ;->ۥ۟:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
