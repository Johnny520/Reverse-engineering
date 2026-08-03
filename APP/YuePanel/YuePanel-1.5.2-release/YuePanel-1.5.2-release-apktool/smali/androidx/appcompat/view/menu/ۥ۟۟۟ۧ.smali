.class public Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;
.super Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
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
.field private mItem:Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

.field private mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    iput-object p3, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mItem:Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    return-void
.end method


# virtual methods
.method public collapseItemActionView(Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->collapseItemActionView(Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)Z

    move-result p1

    return p1
.end method

.method public dispatchMenuItemSelected(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)Z
    .locals 1
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->dispatchMenuItemSelected(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->dispatchMenuItemSelected(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)Z

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

.method public expandItemActionView(Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->expandItemActionView(Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)Z

    move-result p1

    return p1
.end method

.method public getActionViewStatesKey()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mItem:Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;->getItemId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getActionViewStatesKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItem()Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mItem:Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    return-object v0
.end method

.method public getParentMenu()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    return-object v0
.end method

.method public getRootMenu()Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getRootMenu()Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public isGroupDividerEnabled()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->isGroupDividerEnabled()Z

    move-result v0

    return v0
.end method

.method public isQwertyMode()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->isQwertyMode()Z

    move-result v0

    return v0
.end method

.method public isShortcutsVisible()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->isShortcutsVisible()Z

    move-result v0

    return v0
.end method

.method public setCallback(Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setCallback(Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;)V

    return-void
.end method

.method public setGroupDividerEnabled(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setHeaderIconInt(I)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setHeaderIconInt(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setHeaderTitleInt(I)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setHeaderTitleInt(Ljava/lang/CharSequence;)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setHeaderViewInt(Landroid/view/View;)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object p1

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mItem:Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mItem:Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setQwertyMode(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setQwertyMode(Z)V

    return-void
.end method

.method public setShortcutsVisible(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->mParentMenu:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setShortcutsVisible(Z)V

    return-void
.end method
