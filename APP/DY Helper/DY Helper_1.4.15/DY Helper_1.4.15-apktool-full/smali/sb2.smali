.class public final Lsb2;
.super Lｗ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lgz0;


# instance fields
.field public final η:Landroid/content/Context;

.field public final θ:Liz0;

.field public ι:Ln5;

.field public κ:Ljava/lang/ref/WeakReference;

.field public final synthetic λ:Ltb2;


# direct methods
.method public constructor <init>(Ltb2;Landroid/content/Context;Ln5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsb2;->λ:Ltb2;

    .line 5
    .line 6
    iput-object p2, p0, Lsb2;->η:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lsb2;->ι:Ln5;

    .line 9
    .line 10
    new-instance p1, Liz0;

    .line 11
    .line 12
    invoke-direct {p1, p2}, Liz0;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    iput p2, p1, Liz0;->μ:I

    .line 17
    .line 18
    iput-object p1, p0, Lsb2;->θ:Liz0;

    .line 19
    .line 20
    iput-object p0, p1, Liz0;->ε:Lgz0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 3

    .line 1
    iget-object v0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object v1, v0, Ltb2;->ι:Lsb2;

    .line 4
    .line 5
    if-eq v1, p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v1, v0, Ltb2;->π:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iput-object p0, v0, Ltb2;->κ:Lsb2;

    .line 13
    .line 14
    iget-object v1, p0, Lsb2;->ι:Ln5;

    .line 15
    .line 16
    iput-object v1, v0, Ltb2;->λ:Ln5;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v1, p0, Lsb2;->ι:Ln5;

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ln5;->Ν(Lｗ;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    const/4 v1, 0x0

    .line 25
    iput-object v1, p0, Lsb2;->ι:Ln5;

    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    invoke-virtual {v0, p0}, Ltb2;->α(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p0, v0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->ο:Landroid/view/View;

    .line 34
    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->η()V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object p0, v0, Ltb2;->γ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 41
    .line 42
    iget-boolean v2, v0, Ltb2;->φ:Z

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 45
    .line 46
    .line 47
    iput-object v1, v0, Ltb2;->ι:Lsb2;

    .line 48
    .line 49
    return-void
.end method

.method public final β()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lsb2;->κ:Ljava/lang/ref/WeakReference;

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
    iget-object p0, p0, Lsb2;->θ:Liz0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final δ(Liz0;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lsb2;->ι:Ln5;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Ln5;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Li0;

    .line 8
    .line 9
    invoke-virtual {p1, p0, p2}, Li0;->Δ(Lｗ;Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final ε()Landroid/view/MenuInflater;
    .locals 1

    .line 1
    new-instance v0, Ls12;

    .line 2
    .line 3
    iget-object p0, p0, Lsb2;->η:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ls12;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final ζ()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object p0, p0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final η()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object p0, p0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final θ(Liz0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lsb2;->ι:Ln5;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lsb2;->ι()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lsb2;->λ:Ltb2;

    .line 10
    .line 11
    iget-object p0, p0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->ι()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ι()V
    .locals 2

    .line 1
    iget-object v0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object v0, v0, Ltb2;->ι:Lsb2;

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lsb2;->θ:Liz0;

    .line 9
    .line 10
    invoke-virtual {v0}, Liz0;->ψ()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v1, p0, Lsb2;->ι:Ln5;

    .line 14
    .line 15
    invoke-virtual {v1, p0, v0}, Ln5;->Ξ(Lｗ;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Liz0;->χ()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    invoke-virtual {v0}, Liz0;->χ()V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public final κ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object p0, p0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ψ:Z

    .line 6
    .line 7
    return p0
.end method

.method public final λ(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object v0, v0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lsb2;->κ:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    return-void
.end method

.method public final μ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object v0, v0, Ltb2;->α:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lsb2;->ν(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ν(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object p0, p0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ξ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object v0, v0, Ltb2;->α:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lsb2;->ο(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ο(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsb2;->λ:Ltb2;

    .line 2
    .line 3
    iget-object p0, p0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final π(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lｗ;->ζ:Z

    .line 2
    .line 3
    iget-object p0, p0, Lsb2;->λ:Ltb2;

    .line 4
    .line 5
    iget-object p0, p0, Ltb2;->ζ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
