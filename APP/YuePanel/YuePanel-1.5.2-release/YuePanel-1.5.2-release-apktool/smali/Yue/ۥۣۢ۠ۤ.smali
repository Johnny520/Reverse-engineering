.class public LYue/ۥۣۢ۠ۤ;
.super LYue/ۥۡ۠ۧ۠;
.source "SourceFile"

# interfaces
.implements Landroid/view/SubMenu;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;


# direct methods
.method public constructor <init>(Landroid/content/Context;LYue/ۥۢ۠ۥۤ;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LYue/ۥۡ۠ۧ۠;-><init>(Landroid/content/Context;LYue/ۥۢ۠ۥۡ;)V

    iput-object p2, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    return-void
.end method


# virtual methods
.method public clearHeader()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    return-void
.end method

.method public getItem()Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟۟(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۣۢ۠ۤ;->ۥ۟۟۠۟:LYue/ۥۢ۠ۥۤ;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    return-object p0
.end method
