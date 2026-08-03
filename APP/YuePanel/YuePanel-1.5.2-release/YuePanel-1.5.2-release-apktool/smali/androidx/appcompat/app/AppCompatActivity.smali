.class public Landroidx/appcompat/app/AppCompatActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۡ۟ۦ;
.implements LYue/ۥۣۢۡ۟$ۥ;
.implements Landroidx/appcompat/app/ۥ۟$ۥ۟۟;


# static fields
.field private static final DELEGATE_TAG:Ljava/lang/String; = "androidx:appcompat"


# instance fields
.field private mDelegate:Landroidx/appcompat/app/ۥ۟۟۟;

.field private mResources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->ۥ۟۟۠ۤ()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۦۨۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۧۤ;
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentActivity;-><init>(I)V

    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->ۥ۟۟۠ۤ()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->initializeViewTreeOwners()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۟(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۟ۥ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public closeOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ۥ;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_1
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ۥ;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroidx/appcompat/app/ۥ;->ۥ۟۟ۢ۟(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠۠(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->mDelegate:Landroidx/appcompat/app/ۥ۟۟۟;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۟ۦ(Landroid/app/Activity;LYue/ۥ۟ۡ۟ۦ;)Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->mDelegate:Landroidx/appcompat/app/ۥ۟۟۟;

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->mDelegate:Landroidx/appcompat/app/ۥ۟۟۟;

    return-object v0
.end method

.method public getDrawerToggleDelegate()Landroidx/appcompat/app/ۥ۟$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۤ()Landroidx/appcompat/app/ۥ۟$ۥ۟;

    move-result-object v0

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟۠ۧ()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->mResources:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    invoke-static {}, LYue/ۥۣۢۥۤ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۣۢۥۤ;

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LYue/ۥۣۢۥۤ;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    iput-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->mResources:Landroid/content/res/Resources;

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->mResources:Landroid/content/res/Resources;

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getSupportActionBar()Landroidx/appcompat/app/ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡ۟()Landroidx/appcompat/app/ۥ;

    move-result-object v0

    return-object v0
.end method

.method public getSupportParentActivityIntent()Landroid/content/Intent;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥۡۢۡ۠;->ۥ(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۢ()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۨ(Landroid/content/res/Configuration;)V

    iget-object p1, p0, Landroidx/appcompat/app/AppCompatActivity;->mResources:Landroid/content/res/Resources;

    if-eqz p1, :cond_0

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/app/AppCompatActivity;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->onSupportContentChanged()V

    return-void
.end method

.method public onCreateSupportNavigateUpTaskStack(LYue/ۥۣۢۡ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣۢۡ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1, p0}, LYue/ۥۣۢۡ۟;->ۥ۟۟(Landroid/app/Activity;)LYue/ۥۣۢۡ۟;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ۟()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0, p2}, Landroidx/appcompat/app/AppCompatActivity;->ۥ۟۟۠ۥ(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onLocalesChanged(LYue/ۥ۠ۧۦۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۧۦۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1
    .param p2    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/FragmentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ۥ;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x102002c

    if-ne p2, v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ;->ۥ۟۟۠۟()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->onSupportNavigateUp()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onNightModeChanged(I)V
    .locals 0

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0
    .param p2    # Landroid/view/Menu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ۠(Landroid/os/Bundle;)V

    return-void
.end method

.method public onPostResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPostResume()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢۡ()V

    return-void
.end method

.method public onPrepareSupportNavigateUpTaskStack(LYue/ۥۣۢۡ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣۢۡ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStart()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۢ()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStop()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢۤ()V

    return-void
.end method

.method public onSupportActionModeFinished(LYue/ۥ۟۟ۧ۟;)V
    .locals 0
    .param p1    # LYue/ۥ۟۟ۧ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    return-void
.end method

.method public onSupportActionModeStarted(LYue/ۥ۟۟ۧ۟;)V
    .locals 0
    .param p1    # LYue/ۥ۟۟ۧ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    return-void
.end method

.method public onSupportContentChanged()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportParentActivityIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->supportShouldUpRecreateTask(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, LYue/ۥۣۢۡ۟;->ۥ۟۟۟۠(Landroid/content/Context;)LYue/ۥۣۢۡ۟;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->onCreateSupportNavigateUpTaskStack(LYue/ۥۣۢۡ۟;)V

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->onPrepareSupportNavigateUpTaskStack(LYue/ۥۣۢۡ۟;)V

    invoke-virtual {v0}, LYue/ۥۣۢۡ۟;->ۥ۟۟۟ۨ()V

    :try_start_0
    invoke-static {p0}, LYue/ۥۣ۟۟ۧ;->ۥ۟۟ۡۢ(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->supportNavigateUpTo(Landroid/content/Intent;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۤ۟(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onWindowStartingSupportActionMode(LYue/ۥ۟۟ۧ۟$ۥ;)LYue/ۥ۟۟ۧ۟;
    .locals 0
    .param p1    # LYue/ۥ۟۟ۧ۟$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public openOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ۥ;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ;->ۥ۟۟ۢ۠()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_1
    return-void
.end method

.method public setContentView(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۦۨۧ;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->initializeViewTreeOwners()V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟۠(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->initializeViewTreeOwners()V

    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۡ(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->initializeViewTreeOwners()V

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۢ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1
    .param p1    # Landroidx/appcompat/widget/Toolbar;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥۣ۟۟ۨ(Landroidx/appcompat/widget/Toolbar;)V

    return-void
.end method

.method public setSupportProgress(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setSupportProgressBarIndeterminate(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setSupportProgressBarIndeterminateVisibility(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setSupportProgressBarVisibility(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setTheme(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥۣۢ۠ۡ;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۤ(I)V

    return-void
.end method

.method public startSupportActionMode(LYue/ۥ۟۟ۧ۟$ۥ;)LYue/ۥ۟۟ۧ۟;
    .locals 1
    .param p1    # LYue/ۥ۟۟ۧ۟$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۤ۠(LYue/ۥ۟۟ۧ۟$ۥ;)LYue/ۥ۟۟ۧ۟;

    move-result-object p1

    return-object p1
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۢ()V

    return-void
.end method

.method public supportNavigateUpTo(Landroid/content/Intent;)V
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۡۢۡ۠;->ۥ۟۟۟ۡ(Landroid/app/Activity;Landroid/content/Intent;)V

    return-void
.end method

.method public supportRequestWindowFeature(I)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢۧ(I)Z

    move-result p1

    return p1
.end method

.method public supportShouldUpRecreateTask(Landroid/content/Intent;)Z
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۡۢۡ۠;->ۥ۟۟۟ۢ(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۠ۤ()V
    .locals 3

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/ۥ;

    move-result-object v0

    new-instance v1, Landroidx/appcompat/app/AppCompatActivity$ۥ;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/AppCompatActivity$ۥ;-><init>(Landroidx/appcompat/app/AppCompatActivity;)V

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2, v1}, Landroidx/savedstate/ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Landroidx/savedstate/ۥ$ۥ۟۟;)V

    new-instance v0, Landroidx/appcompat/app/AppCompatActivity$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/AppCompatActivity$ۥ۟;-><init>(Landroidx/appcompat/app/AppCompatActivity;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnContextAvailableListener(LYue/ۥۣۡۡۧ;)V

    return-void
.end method

.method public final ۥ۟۟۠ۥ(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
