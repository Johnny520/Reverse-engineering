.class public final LY3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le4;
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public a:Lx2;

.field public b:LZ3;

.field public c:Ljava/lang/CharSequence;

.field public final synthetic d:Lf4;


# direct methods
.method public constructor <init>(Lf4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY3;->d:Lf4;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, LY3;->a:Lx2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final dismiss()V
    .locals 1

    iget-object v0, p0, LY3;->a:Lx2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx2;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, LY3;->a:Lx2;

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LY3;->c:Ljava/lang/CharSequence;

    return-void
.end method

.method public final g(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final j(I)V
    .locals 0

    return-void
.end method

.method public final k(I)V
    .locals 0

    return-void
.end method

.method public final l(I)V
    .locals 0

    return-void
.end method

.method public final m(II)V
    .locals 4

    iget-object v0, p0, LY3;->b:LZ3;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lw2;

    iget-object v1, p0, LY3;->d:Lf4;

    invoke-virtual {v1}, Lf4;->getPopupContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lw2;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, LY3;->c:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Lw2;->setTitle(Ljava/lang/CharSequence;)Lw2;

    :cond_1
    iget-object v2, p0, LY3;->b:LZ3;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    iget-object v3, v0, Lw2;->a:Ls2;

    iput-object v2, v3, Ls2;->k:Ljava/lang/Object;

    iput-object p0, v3, Ls2;->l:Landroid/content/DialogInterface$OnClickListener;

    iput v1, v3, Ls2;->o:I

    const/4 v1, 0x1

    iput-boolean v1, v3, Ls2;->n:Z

    invoke-virtual {v0}, Lw2;->create()Lx2;

    move-result-object v0

    iput-object v0, p0, LY3;->a:Lx2;

    iget-object v0, v0, Lx2;->f:Lv2;

    iget-object v0, v0, Lv2;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTextDirection(I)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setTextAlignment(I)V

    iget-object p1, p0, LY3;->a:Lx2;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final o()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LY3;->c:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, LY3;->d:Lf4;

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LY3;->b:LZ3;

    invoke-virtual {v0, p2}, LZ3;->getItemId(I)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, p2, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    invoke-virtual {p0}, LY3;->dismiss()V

    return-void
.end method

.method public final p(Landroid/widget/ListAdapter;)V
    .locals 0

    check-cast p1, LZ3;

    iput-object p1, p0, LY3;->b:LZ3;

    return-void
.end method
