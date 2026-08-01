.class public Lhc2;
.super Lgc2;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public κ:Lnm0;

.field public λ:Lnm0;

.field public μ:Lnm0;


# direct methods
.method public constructor <init>(Loc2;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgc2;-><init>(Loc2;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lhc2;->κ:Lnm0;

    .line 6
    .line 7
    iput-object p1, p0, Lhc2;->λ:Lnm0;

    .line 8
    .line 9
    iput-object p1, p0, Lhc2;->μ:Lnm0;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Loc2;Lhc2;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lgc2;-><init>(Loc2;Lgc2;)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lhc2;->κ:Lnm0;

    .line 14
    iput-object p1, p0, Lhc2;->λ:Lnm0;

    .line 15
    iput-object p1, p0, Lhc2;->μ:Lnm0;

    return-void
.end method


# virtual methods
.method public ι()Lnm0;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc2;->λ:Lnm0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lec2;->γ:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lnm0;->γ(Landroid/graphics/Insets;)Lnm0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lhc2;->λ:Lnm0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lhc2;->λ:Lnm0;

    .line 18
    .line 19
    return-object p0
.end method

.method public λ()Lnm0;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc2;->κ:Lnm0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lec2;->γ:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lnm0;->γ(Landroid/graphics/Insets;)Lnm0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lhc2;->κ:Lnm0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lhc2;->κ:Lnm0;

    .line 18
    .line 19
    return-object p0
.end method

.method public ν()Lnm0;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc2;->μ:Lnm0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lec2;->γ:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lnm0;->γ(Landroid/graphics/Insets;)Lnm0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lhc2;->μ:Lnm0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lhc2;->μ:Lnm0;

    .line 18
    .line 19
    return-object p0
.end method

.method public ξ(IIII)Loc2;
    .locals 0

    .line 1
    iget-object p0, p0, Lec2;->γ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p1, p0}, Loc2;->θ(Landroid/view/View;Landroid/view/WindowInsets;)Loc2;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
