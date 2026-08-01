.class public final Lwz1;
.super Lｗ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lgz0;


# instance fields
.field public η:Landroid/content/Context;

.field public θ:Landroidx/appcompat/widget/ActionBarContextView;

.field public ι:Ln5;

.field public κ:Ljava/lang/ref/WeakReference;

.field public λ:Z

.field public μ:Liz0;


# virtual methods
.method public final α()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwz1;->λ:Z

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
    iput-boolean v0, p0, Lwz1;->λ:Z

    .line 8
    .line 9
    iget-object v0, p0, Lwz1;->ι:Ln5;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ln5;->Ν(Lｗ;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final β()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lwz1;->κ:Ljava/lang/ref/WeakReference;

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

.method public final γ()Liz0;
    .locals 0

    .line 1
    iget-object p0, p0, Lwz1;->μ:Liz0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final δ(Liz0;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lwz1;->ι:Ln5;

    .line 2
    .line 3
    iget-object p1, p1, Ln5;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Li0;

    .line 6
    .line 7
    invoke-virtual {p1, p0, p2}, Li0;->Δ(Lｗ;Landroid/view/MenuItem;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ε()Landroid/view/MenuInflater;
    .locals 1

    .line 1
    new-instance v0, Ls12;

    .line 2
    .line 3
    iget-object p0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Ls12;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final ζ()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

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

.method public final η()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

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

.method public final θ(Liz0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lwz1;->ι()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->ι()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ι()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwz1;->ι:Ln5;

    .line 2
    .line 3
    iget-object v1, p0, Lwz1;->μ:Liz0;

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, Ln5;->Ξ(Lｗ;Landroid/view/Menu;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final κ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ψ:Z

    .line 4
    .line 5
    return p0
.end method

.method public final λ(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

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
    iput-object v0, p0, Lwz1;->κ:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    return-void
.end method

.method public final μ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lwz1;->η:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lwz1;->ν(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ν(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ξ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lwz1;->η:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lwz1;->ο(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ο(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final π(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lｗ;->ζ:Z

    .line 2
    .line 3
    iget-object p0, p0, Lwz1;->θ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
