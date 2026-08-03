.class public LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۤۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦۢ;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public calculateExtraLayoutSpace(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;[I)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦۢ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ;->getOffscreenPageLimit()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->calculateExtraLayoutSpace(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;[I)V

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦۢ;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ;->getPageSize()I

    move-result p1

    mul-int/2addr p1, v0

    const/4 v0, 0x0

    aput p1, p2, v0

    const/4 v0, 0x1

    aput p1, p2, v0

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;LYue/ۥ۟۟ۥۧ;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟۟ۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->onInitializeAccessibilityNodeInfo(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;LYue/ۥ۟۟ۥۧ;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦۢ;

    iget-object p1, p1, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {p1, p3}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۟ۤ(LYue/ۥ۟۟ۥۧ;)V

    return-void
.end method

.method public performAccessibilityAction(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;ILandroid/os/Bundle;)Z
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦۢ;

    iget-object v0, v0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v0, p3}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;->ۥ:LYue/ۥۢۤۦۢ;

    iget-object p1, p1, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {p1, p3}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۟ۥ(I)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->performAccessibilityAction(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public requestChildRectangleOnScreen(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method
