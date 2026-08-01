.class public abstract Lzb2;
.super Ldc2;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ldc2;-><init>()V

    .line 25
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lzb2;->α:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Loc2;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ldc2;-><init>(Loc2;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Loc2;->η()Landroid/view/WindowInsets;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/view/WindowInsets$Builder;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Landroid/view/WindowInsets$Builder;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    .line 19
    .line 20
    .line 21
    :goto_0
    iput-object v0, p0, Lzb2;->α:Landroid/view/WindowInsets$Builder;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public β()Loc2;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldc2;->α()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lzb2;->α:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {v0, p0}, Loc2;->θ(Landroid/view/View;Landroid/view/WindowInsets;)Loc2;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v1, p0, Loc2;->α:Llc2;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Llc2;->σ([Lnm0;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public γ(Lnm0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzb2;->α:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lnm0;->δ()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public δ(Lnm0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzb2;->α:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lnm0;->δ()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method
