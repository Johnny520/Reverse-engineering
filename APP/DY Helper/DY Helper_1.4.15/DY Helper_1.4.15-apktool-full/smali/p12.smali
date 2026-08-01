.class public final Lp12;
.super Landroid/view/ActionMode;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/content/Context;

.field public final β:Lｗ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lｗ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp12;->α:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lp12;->β:Lｗ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lｗ;->α()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lｗ;->β()Landroid/view/View;

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
    new-instance v0, Lxz0;

    .line 2
    .line 3
    iget-object v1, p0, Lp12;->β:Lｗ;

    .line 4
    .line 5
    invoke-virtual {v1}, Lｗ;->γ()Liz0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, Lp12;->α:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lxz0;-><init>(Landroid/content/Context;Liz0;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lｗ;->ε()Landroid/view/MenuInflater;

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
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lｗ;->ζ()Ljava/lang/CharSequence;

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
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    iget-object p0, p0, Lｗ;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lｗ;->η()Ljava/lang/CharSequence;

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
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    iget-boolean p0, p0, Lｗ;->ζ:Z

    .line 4
    .line 5
    return p0
.end method

.method public final invalidate()V
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lｗ;->ι()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isTitleOptional()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lｗ;->κ()Z

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
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lｗ;->λ(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSubtitle(I)V
    .locals 0

    .line 7
    iget-object p0, p0, Lp12;->β:Lｗ;

    invoke-virtual {p0, p1}, Lｗ;->μ(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lｗ;->ν(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    iput-object p1, p0, Lｗ;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
.end method

.method public final setTitle(I)V
    .locals 0

    .line 7
    iget-object p0, p0, Lp12;->β:Lｗ;

    invoke-virtual {p0, p1}, Lｗ;->ξ(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lｗ;->ο(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lp12;->β:Lｗ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lｗ;->π(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
