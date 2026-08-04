.class public final Lyyds/ᛷᛷᛴ;
.super Landroid/view/ActionMode;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Landroid/content/Context;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lyyds/ᛲᲁᛲᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᛷᛴ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᲁᛲᛸ;->ᛲᲈᲁ()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᲁᛲᛸ;->ᛵᛸᛸᛷ()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲀᛲᛷᛵ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 4
    .line 5
    invoke-virtual {v1}, Lyyds/ᛲᲁᛲᛸ;->ᲀᛲᛳᲀ()Lyyds/ᛴᛴᛵᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lyyds/ᲀᛲᛷᛵ;-><init>(Landroid/content/Context;Lyyds/ᛴᛴᛵᛸ;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᲁᛲᛸ;->ᛲᛴᛳᛲ()Landroid/view/MenuInflater;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᲁᛲᛸ;->ᲇᲇᲇᛱ()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛲᲁᛲᛸ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᲁᛲᛸ;->ᛶᛷᛲᲁ()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getTitleOptionalHint()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    iget-boolean p0, p0, Lyyds/ᛲᲁᛲᛸ;->ᲇᲈᛵᛷ:Z

    .line 4
    .line 5
    return p0
.end method

.method public final invalidate()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᲁᛲᛸ;->ᛲᛳᛶᲁ()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isTitleOptional()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᲁᛲᛸ;->ᛷᲈᲈᲁ()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛲᛸ;->ᛷᛲᲈᛱ(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSubtitle(I)V
    .locals 0

    .line 7
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛲᛸ;->ᛷᛵᲇᲀ(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛲᛸ;->ᛲᛲᲈᲈ(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛲᲁᛲᛸ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
.end method

.method public final setTitle(I)V
    .locals 0

    .line 7
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛲᛸ;->ᛱᛳᲇ(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛲᛸ;->ᛳᲁᲁᲇ(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛷᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛲᛸ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛲᛸ;->ᲇᛱᛲ(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
