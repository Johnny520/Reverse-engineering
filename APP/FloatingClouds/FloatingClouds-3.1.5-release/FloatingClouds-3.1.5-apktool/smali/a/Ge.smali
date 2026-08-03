.class public final La/Ge;
.super Landroid/view/ActionMode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Ge$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/P;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/P;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, La/Ge;->a:Landroid/content/Context;

    iput-object p2, p0, La/Ge;->b:La/P;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0}, La/P;->c()V

    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0}, La/P;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, La/hb;

    iget-object v1, p0, La/Ge;->b:La/P;

    invoke-virtual {v1}, La/P;->e()Landroidx/appcompat/view/menu/f;

    move-result-object v1

    iget-object v2, p0, La/Ge;->a:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, La/hb;-><init>(Landroid/content/Context;La/He;)V

    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0}, La/P;->f()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0}, La/P;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    iget-object v0, v0, La/P;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0}, La/P;->h()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    iget-boolean v0, v0, La/P;->b:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0}, La/P;->i()V

    return-void
.end method

.method public final isTitleOptional()Z
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0}, La/P;->j()Z

    move-result v0

    return v0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0, p1}, La/P;->k(Landroid/view/View;)V

    return-void
.end method

.method public final setSubtitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0, p1}, La/P;->l(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0, p1}, La/P;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    iput-object p1, v0, La/P;->a:Ljava/lang/Object;

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0, p1}, La/P;->n(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0, p1}, La/P;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, La/Ge;->b:La/P;

    invoke-virtual {v0, p1}, La/P;->p(Z)V

    return-void
.end method
