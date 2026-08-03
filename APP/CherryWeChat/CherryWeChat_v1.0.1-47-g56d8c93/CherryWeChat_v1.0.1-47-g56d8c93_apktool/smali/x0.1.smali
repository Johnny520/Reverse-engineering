.class public final Lx0;
.super Lci;
.source ""


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroid/view/View;


# direct methods
.method public constructor <init>(LC0;LC0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lx0;->j:I

    .line 3
    iput-object p1, p0, Lx0;->k:Landroid/view/View;

    invoke-direct {p0, p2}, Lci;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx0;->j:I

    .line 1
    iput-object p1, p0, Lx0;->k:Landroid/view/View;

    .line 2
    invoke-direct {p0, p1}, Lci;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lky;
    .locals 1

    iget v0, p0, Lx0;->j:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx0;->k:Landroid/view/View;

    check-cast v0, LC0;

    iget-object v0, v0, LC0;->d:LD0;

    iget-object v0, v0, LD0;->s:Lz0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lxr;->a()Lvr;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lx0;->k:Landroid/view/View;

    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->l:Ly0;

    if-eqz v0, :cond_1

    check-cast v0, LA0;

    iget-object v0, v0, LA0;->a:LD0;

    iget-object v0, v0, LD0;->t:Lz0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lxr;->a()Lvr;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lx0;->j:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx0;->k:Landroid/view/View;

    check-cast v0, LC0;

    iget-object v0, v0, LC0;->d:LD0;

    invoke-virtual {v0}, LD0;->l()Z

    const/4 v0, 0x1

    return v0

    :pswitch_0
    iget-object v0, p0, Lx0;->k:Landroid/view/View;

    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->j:Lkr;

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->g:Lqr;

    invoke-interface {v1, v0}, Lkr;->a(Lqr;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lx0;->b()Lky;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lky;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Lx0;->j:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lci;->d()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lx0;->k:Landroid/view/View;

    check-cast v0, LC0;

    iget-object v0, v0, LC0;->d:LD0;

    iget-object v1, v0, LD0;->u:LB0;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LD0;->c()Z

    const/4 v0, 0x1

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
