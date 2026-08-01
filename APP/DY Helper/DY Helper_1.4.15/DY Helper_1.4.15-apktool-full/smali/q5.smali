.class public final Lq5;
.super Landroidx/appcompat/widget/ζ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ξ:Landroidx/appcompat/widget/δ;

.field public final synthetic ο:Landroidx/appcompat/widget/AppCompatSpinner;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroidx/appcompat/widget/AppCompatSpinner;Landroidx/appcompat/widget/δ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq5;->ο:Landroidx/appcompat/widget/AppCompatSpinner;

    .line 2
    .line 3
    iput-object p3, p0, Lq5;->ξ:Landroidx/appcompat/widget/δ;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroidx/appcompat/widget/ζ;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final β()Lew1;
    .locals 0

    .line 1
    iget-object p0, p0, Lq5;->ξ:Landroidx/appcompat/widget/δ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final γ()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lq5;->ο:Landroidx/appcompat/widget/AppCompatSpinner;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner;->getInternalPopup()Lx5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lx5;->β()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->κ:Lx5;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getTextDirection()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getTextAlignment()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-interface {v0, v1, p0}, Lx5;->ξ(II)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method
