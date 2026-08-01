.class public Lic2;
.super Lhc2;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final ν:Loc2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v0}, Loc2;->θ(Landroid/view/View;Landroid/view/WindowInsets;)Loc2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lic2;->ν:Loc2;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Loc2;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lhc2;-><init>(Loc2;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Loc2;Lic2;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lhc2;-><init>(Loc2;Lhc2;)V

    return-void
.end method


# virtual methods
.method public final δ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public η(I)Lnm0;
    .locals 0

    .line 1
    iget-object p0, p0, Lec2;->γ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lmc2;->α(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lnm0;->γ(Landroid/graphics/Insets;)Lnm0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public θ(I)Lnm0;
    .locals 0

    .line 1
    iget-object p0, p0, Lec2;->γ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lmc2;->α(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lnm0;->γ(Landroid/graphics/Insets;)Lnm0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public ρ(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lec2;->γ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lmc2;->α(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->isVisible(I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
