.class public LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;
.super LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e6"
.end annotation


# instance fields
.field public final ۥ۟:LYue/ۥ۟۟ۦۤ;

.field public final ۥ۟۟:LYue/ۥ۟۟ۦۤ;

.field public ۥ۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

.field public final synthetic ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;)V
    .locals 1

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;-><init>(LYue/ۥۢۤۦۢ;LYue/ۥۢۤۦۢ$ۥ;)V

    new-instance p1, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ;

    invoke-direct {p1, p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ;-><init>(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;)V

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۟۟ۦۤ;

    new-instance p1, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟;

    invoke-direct {p1, p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟;-><init>(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;)V

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟:LYue/ۥ۟۟ۦۤ;

    return-void
.end method


# virtual methods
.method public ۥ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟(ILandroid/os/Bundle;)Z
    .locals 0

    const/16 p2, 0x2000

    if-eq p1, p2, :cond_1

    const/16 p2, 0x1000

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public ۥ۟۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e1<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ()V

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e1<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۡ()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "androidx.viewpager.widget.ViewPager"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۦۤۧ;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۦۤۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x2

    invoke-static {p2, p1}, LYue/ۥۢۤۤۦ;->ۥ۟۠ۢۦ(Landroid/view/View;I)V

    new-instance p1, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟۟;

    invoke-direct {p1, p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟۟;-><init>(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;)V

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥۣ۟۟۠(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    const/4 p2, 0x1

    invoke-static {p1, p2}, LYue/ۥۢۤۤۦ;->ۥ۟۠ۢۦ(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public ۥۣ۟۟۟(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥۣ۟۟۠(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-void
.end method

.method public ۥ۟۟۟ۦ(ILandroid/os/Bundle;)Z
    .locals 1

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟(ILandroid/os/Bundle;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/16 p2, 0x2000

    const/4 v0, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ;->getCurrentItem()I

    move-result p1

    sub-int/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ;->getCurrentItem()I

    move-result p1

    add-int/2addr p1, v0

    :goto_0
    invoke-virtual {p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ(I)V

    return v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public ۥ۟۟۟ۧ()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ()V

    return-void
.end method

.method public ۥ۟۟۠(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;)V

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟۠۟()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ()V

    return-void
.end method

.method public ۥ۟۟۠۠()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ()V

    return-void
.end method

.method public ۥ۟۟۠ۡ()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ()V

    return-void
.end method

.method public ۥ۟۟۠ۢ()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ()V

    return-void
.end method

.method public final ۥۣ۟۟۠(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 3

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->getOrientation()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v0

    move v2, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v0

    move v2, v0

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v1

    move v2, v0

    :goto_0
    invoke-static {p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۤۢ(Landroid/view/accessibility/AccessibilityNodeInfo;)LYue/ۥ۟۟ۥۧ;

    move-result-object p1

    invoke-static {v0, v2, v1, v1}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;->ۥ۟۟۟۠(IIZI)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۟۟(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟۟۠ۤ(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 3

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v1}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۦ()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    iget v1, v1, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    if-lez v1, :cond_2

    const/16 v1, 0x2000

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_2
    iget-object v1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    iget v1, v1, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    if-ge v1, v0, :cond_3

    const/16 v0, 0x1000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_3
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    :cond_4
    :goto_0
    return-void
.end method

.method public ۥ۟۟۠ۥ(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠(IZ)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠ۦ()V
    .locals 8

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    const v1, 0x1020048

    invoke-static {v0, v1}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠۠(Landroid/view/View;I)V

    const v2, 0x1020049

    invoke-static {v0, v2}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠۠(Landroid/view/View;I)V

    const v3, 0x1020046

    invoke-static {v0, v3}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠۠(Landroid/view/View;I)V

    const v4, 0x1020047

    invoke-static {v0, v4}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠۠(Landroid/view/View;I)V

    iget-object v5, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v5}, LYue/ۥۢۤۦۢ;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v5

    if-nez v5, :cond_0

    return-void

    :cond_0
    iget-object v5, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v5}, LYue/ۥۢۤۦۢ;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v5

    if-nez v5, :cond_1

    return-void

    :cond_1
    iget-object v6, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v6}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۦ()Z

    move-result v6

    if-nez v6, :cond_2

    return-void

    :cond_2
    iget-object v6, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v6}, LYue/ۥۢۤۦۢ;->getOrientation()I

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_6

    iget-object v3, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v3}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۥ()Z

    move-result v3

    if-eqz v3, :cond_3

    move v4, v1

    goto :goto_0

    :cond_3
    move v4, v2

    :goto_0
    if-eqz v3, :cond_4

    move v1, v2

    :cond_4
    iget-object v2, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    iget v2, v2, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    add-int/lit8 v5, v5, -0x1

    if-ge v2, v5, :cond_5

    new-instance v2, LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-direct {v2, v4, v7}, LYue/ۥ۟۟ۥۧ$ۥ;-><init>(ILjava/lang/CharSequence;)V

    iget-object v3, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۟۟ۦۤ;

    invoke-static {v0, v2, v7, v3}, LYue/ۥۢۤۤۦ;->ۥۣ۟۠۠(Landroid/view/View;LYue/ۥ۟۟ۥۧ$ۥ;Ljava/lang/CharSequence;LYue/ۥ۟۟ۦۤ;)V

    :cond_5
    iget-object v2, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    iget v2, v2, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    if-lez v2, :cond_8

    new-instance v2, LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-direct {v2, v1, v7}, LYue/ۥ۟۟ۥۧ$ۥ;-><init>(ILjava/lang/CharSequence;)V

    iget-object v1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟:LYue/ۥ۟۟ۦۤ;

    invoke-static {v0, v2, v7, v1}, LYue/ۥۢۤۤۦ;->ۥۣ۟۠۠(Landroid/view/View;LYue/ۥ۟۟ۥۧ$ۥ;Ljava/lang/CharSequence;LYue/ۥ۟۟ۦۤ;)V

    goto :goto_1

    :cond_6
    iget-object v1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    iget v1, v1, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    add-int/lit8 v5, v5, -0x1

    if-ge v1, v5, :cond_7

    new-instance v1, LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-direct {v1, v4, v7}, LYue/ۥ۟۟ۥۧ$ۥ;-><init>(ILjava/lang/CharSequence;)V

    iget-object v2, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۟۟ۦۤ;

    invoke-static {v0, v1, v7, v2}, LYue/ۥۢۤۤۦ;->ۥۣ۟۠۠(Landroid/view/View;LYue/ۥ۟۟ۥۧ$ۥ;Ljava/lang/CharSequence;LYue/ۥ۟۟ۦۤ;)V

    :cond_7
    iget-object v1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥۢۤۦۢ;

    iget v1, v1, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    if-lez v1, :cond_8

    new-instance v1, LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-direct {v1, v3, v7}, LYue/ۥ۟۟ۥۧ$ۥ;-><init>(ILjava/lang/CharSequence;)V

    iget-object v2, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟:LYue/ۥ۟۟ۦۤ;

    invoke-static {v0, v1, v7, v2}, LYue/ۥۢۤۤۦ;->ۥۣ۟۠۠(Landroid/view/View;LYue/ۥ۟۟ۥۧ$ۥ;Ljava/lang/CharSequence;LYue/ۥ۟۟ۦۤ;)V

    :cond_8
    :goto_1
    return-void
.end method
