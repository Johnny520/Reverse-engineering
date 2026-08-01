.class public final Lｑ;
.super Lqz0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic μ:I

.field public final synthetic ν:Landroidx/appcompat/widget/γ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/γ;Landroid/content/Context;Lb12;Landroid/view/View;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lｑ;->μ:I

    .line 3
    .line 4
    iput-object p1, p0, Lｑ;->ν:Landroidx/appcompat/widget/γ;

    .line 5
    .line 6
    const v6, 0x7f040020

    .line 7
    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v4, p4

    .line 15
    invoke-direct/range {v1 .. v7}, Lqz0;-><init>(Landroid/content/Context;Liz0;Landroid/view/View;ZII)V

    .line 16
    .line 17
    .line 18
    iget-object p0, v3, Lb12;->Γ:Llz0;

    .line 19
    .line 20
    iget p0, p0, Llz0;->ω:I

    .line 21
    .line 22
    const/16 p2, 0x20

    .line 23
    .line 24
    and-int/2addr p0, p2

    .line 25
    if-ne p0, p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, p1, Landroidx/appcompat/widget/γ;->ν:Landroidx/appcompat/widget/ActionMenuPresenter$OverflowMenuButton;

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    iget-object p0, p1, Landroidx/appcompat/widget/γ;->μ:Lwz0;

    .line 33
    .line 34
    check-cast p0, Landroid/view/View;

    .line 35
    .line 36
    :cond_1
    iput-object p0, v1, Lqz0;->ε:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    iget-object p0, p1, Landroidx/appcompat/widget/γ;->Γ:Ln;

    .line 39
    .line 40
    iput-object p0, v1, Lqz0;->θ:Ltz0;

    .line 41
    .line 42
    iget-object p1, v1, Lqz0;->ι:Loz0;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-interface {p1, p0}, Luz0;->ε(Ltz0;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/γ;Landroid/content/Context;Liz0;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lｑ;->μ:I

    .line 50
    iput-object p1, p0, Lｑ;->ν:Landroidx/appcompat/widget/γ;

    const v6, 0x7f040020

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 51
    invoke-direct/range {v1 .. v7}, Lqz0;-><init>(Landroid/content/Context;Liz0;Landroid/view/View;ZII)V

    const p0, 0x800005

    .line 52
    iput p0, v1, Lqz0;->ζ:I

    .line 53
    iget-object p0, p1, Landroidx/appcompat/widget/γ;->Γ:Ln;

    .line 54
    iput-object p0, v1, Lqz0;->θ:Ltz0;

    .line 55
    iget-object p1, v1, Lqz0;->ι:Loz0;

    if-eqz p1, :cond_0

    .line 56
    invoke-interface {p1, p0}, Luz0;->ε(Ltz0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final γ()V
    .locals 3

    .line 1
    iget v0, p0, Lｑ;->μ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lｑ;->ν:Landroidx/appcompat/widget/γ;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/appcompat/widget/γ;->η:Liz0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Liz0;->γ(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Landroidx/appcompat/widget/γ;->ψ:Lｑ;

    .line 18
    .line 19
    invoke-super {p0}, Lqz0;->γ()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, p0, Lｑ;->ν:Landroidx/appcompat/widget/γ;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-object v1, v0, Landroidx/appcompat/widget/γ;->ω:Lｑ;

    .line 27
    .line 28
    invoke-super {p0}, Lqz0;->γ()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
