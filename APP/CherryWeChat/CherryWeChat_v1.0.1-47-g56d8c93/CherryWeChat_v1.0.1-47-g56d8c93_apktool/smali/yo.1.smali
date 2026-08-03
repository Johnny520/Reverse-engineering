.class public final Lyo;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LDr;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/view/LayoutInflater;

.field public c:Llr;

.field public d:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public e:LCr;

.field public f:Lxo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo;->a:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lyo;->b:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public final b(Llr;Z)V
    .locals 1

    iget-object v0, p0, Lyo;->e:LCr;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, LCr;->b(Llr;Z)V

    :cond_0
    return-void
.end method

.method public final d(Lqr;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final e(LCr;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f(Lqr;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lyo;->f:Lxo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lxo;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final i(Landroid/content/Context;Llr;)V
    .locals 1

    iget-object v0, p0, Lyo;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lyo;->a:Landroid/content/Context;

    iget-object v0, p0, Lyo;->b:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lyo;->b:Landroid/view/LayoutInflater;

    :cond_0
    iput-object p2, p0, Lyo;->c:Llr;

    iget-object p1, p0, Lyo;->f:Lxo;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lxo;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public final j(LEz;)Z
    .locals 5

    invoke-virtual {p1}, Llr;->hasVisibleItems()Z

    move-result v0

    iget-object v1, p1, Llr;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lmr;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lmr;->a:LEz;

    new-instance v2, Lw2;

    invoke-direct {v2, v1}, Lw2;-><init>(Landroid/content/Context;)V

    new-instance v3, Lyo;

    invoke-virtual {v2}, Lw2;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Lyo;-><init>(Landroid/content/Context;)V

    iput-object v3, v0, Lmr;->c:Lyo;

    iput-object v0, v3, Lyo;->e:LCr;

    invoke-virtual {p1, v3, v1}, Llr;->b(LDr;Landroid/content/Context;)V

    iget-object v1, v0, Lmr;->c:Lyo;

    iget-object v3, v1, Lyo;->f:Lxo;

    if-nez v3, :cond_1

    new-instance v3, Lxo;

    invoke-direct {v3, v1}, Lxo;-><init>(Lyo;)V

    iput-object v3, v1, Lyo;->f:Lxo;

    :cond_1
    iget-object v1, v1, Lyo;->f:Lxo;

    iget-object v3, v2, Lw2;->a:Ls2;

    iput-object v1, v3, Ls2;->k:Ljava/lang/Object;

    iput-object v0, v3, Ls2;->l:Landroid/content/DialogInterface$OnClickListener;

    iget-object v1, p1, Llr;->o:Landroid/view/View;

    if-eqz v1, :cond_2

    iput-object v1, v3, Ls2;->e:Landroid/view/View;

    goto :goto_0

    :cond_2
    iget-object v1, p1, Llr;->n:Landroid/graphics/drawable/Drawable;

    iput-object v1, v3, Ls2;->c:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, Llr;->m:Ljava/lang/CharSequence;

    invoke-virtual {v2, v1}, Lw2;->setTitle(Ljava/lang/CharSequence;)Lw2;

    :goto_0
    iput-object v0, v3, Ls2;->j:Lmr;

    invoke-virtual {v2}, Lw2;->create()Lx2;

    move-result-object v1

    iput-object v1, v0, Lmr;->b:Lx2;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v0, Lmr;->b:Lx2;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/16 v2, 0x3eb

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v3, 0x20000

    or-int/2addr v2, v3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, v0, Lmr;->b:Lx2;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lyo;->e:LCr;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, LCr;->s(Llr;)Z

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, Lyo;->c:Llr;

    iget-object p2, p0, Lyo;->f:Lxo;

    invoke-virtual {p2, p3}, Lxo;->b(I)Lqr;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Llr;->q(Landroid/view/MenuItem;LDr;I)Z

    return-void
.end method
