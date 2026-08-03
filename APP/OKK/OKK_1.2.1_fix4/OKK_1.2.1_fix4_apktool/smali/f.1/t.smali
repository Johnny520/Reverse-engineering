.class public final Lf/t;
.super Lf/j;
.source "SourceFile"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public final v:Lf/j;

.field public final w:Lf/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lf/j;Lf/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lf/j;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lf/t;->v:Lf/j;

    iput-object p3, p0, Lf/t;->w:Lf/k;

    return-void
.end method


# virtual methods
.method public final d(Lf/k;)Z
    .locals 1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0, p1}, Lf/j;->d(Lf/k;)Z

    move-result p1

    return p1
.end method

.method public final e(Lf/j;Landroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Lf/j;->e(Lf/j;Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0, p1, p2}, Lf/j;->e(Lf/j;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final f(Lf/k;)Z
    .locals 1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0, p1}, Lf/j;->f(Lf/k;)Z

    move-result p1

    return p1
.end method

.method public final getItem()Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lf/t;->w:Lf/k;

    return-object v0
.end method

.method public final j()Lf/j;
    .locals 1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0}, Lf/j;->j()Lf/j;

    move-result-object v0

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0}, Lf/j;->l()Z

    move-result v0

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0}, Lf/j;->m()Z

    move-result v0

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0}, Lf/j;->n()Z

    move-result v0

    return v0
.end method

.method public final setGroupDividerEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0, p1}, Lf/j;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1, p1, v1}, Lf/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p1, v0}, Lf/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, p1, v1, v0, v1}, Lf/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v1, p1, v1, v0}, Lf/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1, p1}, Lf/j;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, Lf/t;->w:Lf/k;

    invoke-virtual {v0, p1}, Lf/k;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, Lf/t;->w:Lf/k;

    invoke-virtual {v0, p1}, Lf/k;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setQwertyMode(Z)V
    .locals 1

    iget-object v0, p0, Lf/t;->v:Lf/j;

    invoke-virtual {v0, p1}, Lf/j;->setQwertyMode(Z)V

    return-void
.end method
