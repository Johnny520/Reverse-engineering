.class public final Landroidx/appcompat/widget/ι;
.super Landroidx/appcompat/widget/θ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lkz0;


# instance fields
.field public Ζ:Ln;


# virtual methods
.method public final α(Landroid/content/Context;Z)Landroidx/appcompat/widget/DropDownListView;
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->setHoverListener(Lkz0;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final ζ(Liz0;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/ι;->Ζ:Ln;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ln;->ζ(Liz0;Landroid/view/MenuItem;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final κ(Liz0;Llz0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/ι;->Ζ:Ln;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ln;->κ(Liz0;Llz0;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
