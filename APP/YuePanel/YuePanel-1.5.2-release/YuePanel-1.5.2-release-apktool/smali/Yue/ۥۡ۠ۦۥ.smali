.class public LYue/ۥۡ۠ۦۥ;
.super LYue/ۥ۟ۢۥۨ;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡ۠ۦۥ$ۥ۟۟۟;,
        LYue/ۥۡ۠ۦۥ$ۥ۟;,
        LYue/ۥۡ۠ۦۥ$ۥ;,
        LYue/ۥۡ۠ۦۥ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠۠:Ljava/lang/String; = "MenuItemWrapper"


# instance fields
.field public final ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

.field public ۥ۟۟۠۟:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Landroid/content/Context;LYue/ۥۢ۠ۥۣ;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥ۟ۢۥۨ;-><init>(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    iput-object p2, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrapped Object can not be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public collapseActionView()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->collapseActionView()Z

    move-result v0

    return v0
.end method

.method public expandActionView()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->expandActionView()Z

    move-result v0

    return v0
.end method

.method public getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->ۥ()LYue/ۥ۟۟ۧ۠;

    move-result-object v0

    instance-of v1, v0, LYue/ۥۡ۠ۦۥ$ۥ;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۡ۠ۦۥ$ۥ;

    invoke-static {v0}, LYue/ۥۡ۠ۦۥ$ۥ;->ۥ۟۟۟ۨ(LYue/ۥۡ۠ۦۥ$ۥ;)Landroid/view/ActionProvider;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getActionView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->getActionView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, LYue/ۥۡ۠ۦۥ$ۥ۟;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۡ۠ۦۥ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥۡ۠ۦۥ$ۥ۟;->ۥ()Landroid/view/View;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getAlphabeticModifiers()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->getAlphabeticModifiers()I

    move-result v0

    return v0
.end method

.method public getAlphabeticShortcut()C
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getAlphabeticShortcut()C

    move-result v0

    return v0
.end method

.method public getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getGroupId()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getGroupId()I

    move-result v0

    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->getIconTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->getIconTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    return v0
.end method

.method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    return-object v0
.end method

.method public getNumericModifiers()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->getNumericModifiers()I

    move-result v0

    return v0
.end method

.method public getNumericShortcut()C
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getNumericShortcut()C

    move-result v0

    return v0
.end method

.method public getOrder()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getOrder()I

    move-result v0

    return v0
.end method

.method public getSubMenu()Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟۠(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTooltipText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->getTooltipText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hasSubMenu()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v0

    return v0
.end method

.method public isActionViewExpanded()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, LYue/ۥۢ۠ۥۣ;->isActionViewExpanded()Z

    move-result v0

    return v0
.end method

.method public isCheckable()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->isCheckable()Z

    move-result v0

    return v0
.end method

.method public isChecked()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public isVisible()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z

    move-result v0

    return v0
.end method

.method public setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 2

    new-instance v0, LYue/ۥۡ۠ۦۥ$ۥ;

    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۦ:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1}, LYue/ۥۡ۠ۦۥ$ۥ;-><init>(LYue/ۥۡ۠ۦۥ;Landroid/content/Context;Landroid/view/ActionProvider;)V

    iget-object v1, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, LYue/ۥۢ۠ۥۣ;->ۥ۟۟(LYue/ۥ۟۟ۧ۠;)LYue/ۥۢ۠ۥۣ;

    return-object p0
.end method

.method public setActionView(I)Landroid/view/MenuItem;
    .locals 2

    .line 4
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, LYue/ۥۢ۠ۥۣ;->setActionView(I)Landroid/view/MenuItem;

    .line 5
    iget-object p1, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {p1}, LYue/ۥۢ۠ۥۣ;->getActionView()Landroid/view/View;

    move-result-object p1

    .line 6
    instance-of v0, p1, Landroid/view/CollapsibleActionView;

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    new-instance v1, LYue/ۥۡ۠ۦۥ$ۥ۟;

    invoke-direct {v1, p1}, LYue/ۥۡ۠ۦۥ$ۥ۟;-><init>(Landroid/view/View;)V

    invoke-interface {v0, v1}, LYue/ۥۢ۠ۥۣ;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    :cond_0
    return-object p0
.end method

.method public setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/view/CollapsibleActionView;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, LYue/ۥۡ۠ۦۥ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥۡ۠ۦۥ$ۥ۟;-><init>(Landroid/view/View;)V

    move-object p1, v0

    .line 3
    :cond_0
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, LYue/ۥۢ۠ۥۣ;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setAlphabeticShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1, p2}, LYue/ۥۢ۠ۥۣ;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setCheckable(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setChecked(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, LYue/ۥۢ۠ۥۣ;->setContentDescription(Ljava/lang/CharSequence;)LYue/ۥۢ۠ۥۣ;

    return-object p0
.end method

.method public setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(I)Landroid/view/MenuItem;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, LYue/ۥۢ۠ۥۣ;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, LYue/ۥۢ۠ۥۣ;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setNumericShortcut(C)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setNumericShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1, p2}, LYue/ۥۢ۠ۥۣ;->setNumericShortcut(CI)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    if-eqz p1, :cond_0

    new-instance v1, LYue/ۥۡ۠ۦۥ$ۥ۟۟;

    invoke-direct {v1, p0, p1}, LYue/ۥۡ۠ۦۥ$ۥ۟۟;-><init>(LYue/ۥۡ۠ۦۥ;Landroid/view/MenuItem$OnActionExpandListener;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    if-eqz p1, :cond_0

    new-instance v1, LYue/ۥۡ۠ۦۥ$ۥ۟۟۟;

    invoke-direct {v1, p0, p1}, LYue/ۥۡ۠ۦۥ$ۥ۟۟۟;-><init>(LYue/ۥۡ۠ۦۥ;Landroid/view/MenuItem$OnMenuItemClickListener;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setShortcut(CC)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1, p2}, Landroid/view/MenuItem;->setShortcut(CC)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setShortcut(CCII)Landroid/view/MenuItem;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥۢ۠ۥۣ;->setShortcut(CCII)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setShowAsAction(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, LYue/ۥۢ۠ۥۣ;->setShowAsAction(I)V

    return-void
.end method

.method public setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, LYue/ۥۢ۠ۥۣ;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitle(I)Landroid/view/MenuItem;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, LYue/ۥۢ۠ۥۣ;->setTooltipText(Ljava/lang/CharSequence;)LYue/ۥۢ۠ۥۣ;

    return-object p0
.end method

.method public setVisible(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ(Z)V
    .locals 3

    :try_start_0
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠۟:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setExclusiveCheckable"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠۟:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠۟:Ljava/lang/reflect/Method;

    iget-object v1, p0, LYue/ۥۡ۠ۦۥ;->ۥ۟۟۠:LYue/ۥۢ۠ۥۣ;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    const-string v0, "MenuItemWrapper"

    const-string v1, "Error while calling setExclusiveCheckable"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-void
.end method
