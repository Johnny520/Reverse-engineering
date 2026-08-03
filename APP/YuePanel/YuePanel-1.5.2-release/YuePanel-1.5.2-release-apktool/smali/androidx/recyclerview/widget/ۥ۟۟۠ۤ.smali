.class public abstract Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;
.super Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟۟ۧ:Z = false

.field public static final ۥ۟۟۟ۨ:Ljava/lang/String; = "SimpleItemAnimator"


# instance fields
.field public ۥ۟۟۟ۦ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟۟ۦ:Z

    return-void
.end method


# virtual methods
.method public ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)Z
    .locals 6
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    if-eqz p2, :cond_1

    iget v2, p2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    iget v4, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    if-ne v2, v4, :cond_0

    iget v0, p2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    iget v1, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    if-eq v0, v1, :cond_1

    :cond_0
    iget v3, p2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    iget v5, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۡۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIII)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۡۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)Z
    .locals 7
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget v3, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    iget v4, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->shouldIgnore()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p4, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    iget p3, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    move v6, p3

    move v5, p4

    goto :goto_0

    :cond_0
    iget p3, p4, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    iget p4, p4, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    move v5, p3

    move v6, p4

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIII)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)Z
    .locals 6
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget v2, p2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    iget v3, p2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->itemView:Landroid/view/View;

    if-nez p3, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_0
    iget v0, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    goto :goto_0

    :goto_1
    if-nez p3, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p3

    :goto_2
    move v5, p3

    goto :goto_3

    :cond_1
    iget p3, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    goto :goto_2

    :goto_3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->isRemoved()Z

    move-result p3

    if-nez p3, :cond_3

    if-ne v2, v4, :cond_2

    if-eq v3, v5, :cond_3

    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p3

    add-int/2addr p3, v4

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/2addr v0, v5

    invoke-virtual {p2, v4, v5, p3, v0}, Landroid/view/View;->layout(IIII)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۡۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIII)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۡۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)Z
    .locals 6
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget v2, p2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    iget v4, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ:I

    if-ne v2, v4, :cond_1

    iget v0, p2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    iget v1, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۢ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    iget v3, p2, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    iget v5, p3, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;->ۥ۟:I

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۡۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIII)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟۟ۦ:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->isInvalid()Z

    move-result p1

    if-eqz p1, :cond_0

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

.method public abstract ۥ۟۟ۡۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z
.end method

.method public abstract ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIII)Z
.end method

.method public abstract ۥ۟۟ۡۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIII)Z
.end method

.method public abstract ۥ۟۟ۡۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z
.end method

.method public final ۥ۟۟ۡۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۢۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public final ۥ۟۟ۡۧ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۢۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public final ۥ۟۟ۡۨ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۢۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Z)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public final ۥ۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۢۧ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Z)V

    return-void
.end method

.method public final ۥ۟۟ۢ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟ۢۨ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public final ۥ۟۟ۢ۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥۣ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public final ۥ۟۟ۢۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥۣ۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public final ۥ۟۟ۢۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥۣ۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public ۥۣ۟۟ۢ()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟۟ۦ:Z

    return v0
.end method

.method public ۥ۟۟ۢۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۢۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۢۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Z)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۢۧ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Z)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۢۨ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    return-void
.end method

.method public ۥۣ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    return-void
.end method

.method public ۥۣ۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    return-void
.end method

.method public ۥۣ۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    return-void
.end method

.method public ۥۣ۟۟ۡ(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۤ;->ۥ۟۟۟ۦ:Z

    return-void
.end method
