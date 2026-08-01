.class public final Lｏ;
.super Landroidx/appcompat/widget/ζ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ξ:I

.field public final synthetic ο:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lｏ;->ξ:I

    .line 10
    iput-object p1, p0, Lｏ;->ο:Landroid/view/View;

    .line 11
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ζ;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;Landroid/widget/FrameLayout;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lｏ;->ξ:I

    .line 3
    .line 4
    iput-object p1, p0, Lｏ;->ο:Landroid/view/View;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Landroidx/appcompat/widget/ζ;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final β()Lew1;
    .locals 1

    .line 1
    iget v0, p0, Lｏ;->ξ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lｏ;->ο:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroidx/appcompat/widget/ActivityChooserView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/θ;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lｏ;->ο:Landroid/view/View;

    .line 16
    .line 17
    check-cast p0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 18
    .line 19
    iget-object p0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->π:Lｐ;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    check-cast p0, Lｒ;

    .line 24
    .line 25
    iget-object p0, p0, Lｒ;->α:Landroidx/appcompat/widget/γ;

    .line 26
    .line 27
    iget-object p0, p0, Landroidx/appcompat/widget/γ;->ω:Lｑ;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lqz0;->α()Loz0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    :goto_0
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final γ()Z
    .locals 2

    .line 1
    iget v0, p0, Lｏ;->ξ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lｏ;->ο:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroidx/appcompat/widget/ActivityChooserView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->β()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ο:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string p0, "No data model. Did you call #setDataModel?"

    .line 27
    .line 28
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 34
    :goto_1
    return p0

    .line 35
    :pswitch_0
    iget-object v0, p0, Lｏ;->ο:Landroid/view/View;

    .line 36
    .line 37
    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 38
    .line 39
    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->ξ:Lhz0;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->λ:Llz0;

    .line 44
    .line 45
    invoke-interface {v1, v0}, Lhz0;->α(Llz0;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lｏ;->β()Lew1;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    invoke-interface {p0}, Lew1;->β()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/4 p0, 0x0

    .line 66
    :goto_2
    return p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public δ()Z
    .locals 1

    .line 1
    iget v0, p0, Lｏ;->ξ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroidx/appcompat/widget/ζ;->δ()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lｏ;->ο:Landroid/view/View;

    .line 12
    .line 13
    check-cast p0, Landroidx/appcompat/widget/ActivityChooserView;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->α()V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
