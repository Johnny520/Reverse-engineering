.class public final Lyyds/ᛱᲀᛶᲇ;
.super Lyyds/ᛲᲁᛲᛸ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᲁᛷᲁ;


# instance fields
.field public ᛱᲈᲁ:Ljava/lang/ref/WeakReference;

.field public ᛲᛳᛶᲁ:Z

.field public ᛲᛴᛳᛲ:Landroid/content/Context;

.field public ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

.field public ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛵᛸ;

.field public ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;


# virtual methods
.method public final ᛱᛳᲇ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lyyds/ᛱᲀᛶᲇ;->ᛳᲁᲁᲇ(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᛱᲈᲁ(Lyyds/ᛴᛴᛵᛸ;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lyyds/ᛱᲀᛶᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    iget-object p1, p1, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛲᛲᲇᲈ;

    .line 6
    .line 7
    invoke-virtual {p1, p0, p2}, Lyyds/ᛲᛲᲇᲈ;->ᛲᛳᛶᲁ(Lyyds/ᛲᲁᛲᛸ;Landroid/view/MenuItem;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛲᛳᛶᲁ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛱᲀᛶᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛵᛸ;

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, Lyyds/ᲀᲈᛶᲈ;->ᲈᲀᛲᲀ(Lyyds/ᛲᲁᛲᛸ;Landroid/view/Menu;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛲᛴᛳᛲ()Landroid/view/MenuInflater;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛷᛸᲈᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lyyds/ᛷᛸᲈᲁ;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final ᛲᲈᲁ()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛲᛳᛶᲁ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛲᛳᛶᲁ:Z

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lyyds/ᲀᲈᛶᲈ;->ᛲᛶᛱᲈ(Lyyds/ᛲᲁᛲᛸ;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final ᛳᲁᲁᲇ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛱᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/view/View;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛷᛲᲈᛱ(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iput-object v0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛱᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    return-void
.end method

.method public final ᛷᛵᲇᲀ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lyyds/ᛱᲀᛶᲇ;->ᛲᛲᲈᲈ(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᛷᲈᲈᲁ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ᛶᲈᛴᲈ:Z

    .line 4
    .line 5
    return p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᛴᛴᛵᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛱᛲ(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lyyds/ᛲᲁᛲᛸ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᲇᲇᲇᛱ()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛴᛴᛵᛸ;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲀᛶᲇ;->ᛲᛳᛶᲁ()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᛲᛸ;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᛶᛴᛲᛸ;->ᛷᛵᲇᲀ()Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
