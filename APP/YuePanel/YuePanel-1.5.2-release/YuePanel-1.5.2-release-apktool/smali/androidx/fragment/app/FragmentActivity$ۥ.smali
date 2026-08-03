.class public Landroidx/fragment/app/FragmentActivity$ۥ;
.super LYue/ۥ۠ۢۨ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۡۡۦ;
.implements LYue/ۥۣۡۢۤ;
.implements LYue/ۥۣۡۢ۟;
.implements LYue/ۥۣۡۢۡ;
.implements Landroidx/lifecycle/ViewModelStoreOwner;
.implements LYue/ۥۣۡۡۥ;
.implements LYue/ۥ۟۟ۨۧ;
.implements LYue/ۥۡۧۤۢ;
.implements LYue/ۥ۠ۢۨۦ;
.implements LYue/ۥۡ۠ۦ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e2\u06e8<",
        "Landroidx/fragment/app/FragmentActivity;",
        ">;",
        "LYue/\u06e5\u06e1\u06e3\u06e1\u06e6;",
        "LYue/\u06e5\u06e1\u06e3\u06e2\u06e4;",
        "LYue/\u06e5\u06e1\u06e3\u06e2\u06df;",
        "LYue/\u06e5\u06e1\u06e3\u06e2\u06e1;",
        "Landroidx/lifecycle/ViewModelStoreOwner;",
        "LYue/\u06e5\u06e1\u06e3\u06e1\u06e5;",
        "LYue/\u06e5\u06df\u06df\u06e8\u06e7;",
        "LYue/\u06e5\u06e1\u06e7\u06e4\u06e2;",
        "LYue/\u06e5\u06e0\u06e2\u06e8\u06e6;",
        "LYue/\u06e5\u06e1\u06e0\u06e6\u06df;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۨ;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    return-void
.end method


# virtual methods
.method public addMenuProvider(LYue/ۥۡ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۡ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addMenuProvider(LYue/ۥۡ۠ۧ;)V

    return-void
.end method

.method public addMenuProvider(LYue/ۥۡ۠ۧ;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1
    .param p1    # LYue/ۥۡ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1, p2}, Landroidx/activity/ComponentActivity;->addMenuProvider(LYue/ۥۡ۠ۧ;Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method

.method public addMenuProvider(LYue/ۥۡ۠ۧ;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V
    .locals 1
    .param p1    # LYue/ۥۡ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/lifecycle/Lifecycle$State;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->addMenuProvider(LYue/ۥۡ۠ۧ;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V

    return-void
.end method

.method public addOnConfigurationChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/content/res/Configuration;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addOnConfigurationChangedListener(LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public addOnMultiWindowModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e1\u06e1\u06e6\u06e2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addOnMultiWindowModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public addOnPictureInPictureModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e1\u06e4\u06e1;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addOnPictureInPictureModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public addOnTrimMemoryListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addOnTrimMemoryListener(LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object v0

    return-object v0
.end method

.method public getLifecycle()Landroidx/lifecycle/Lifecycle;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    iget-object v0, v0, Landroidx/fragment/app/FragmentActivity;->mFragmentLifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    return-object v0
.end method

.method public getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public getSavedStateRegistry()Landroidx/savedstate/ۥ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/ۥ;

    move-result-object v0

    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/ViewModelStore;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getViewModelStore()Landroidx/lifecycle/ViewModelStore;

    move-result-object v0

    return-object v0
.end method

.method public invalidateMenu()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->invalidateMenu()V

    return-void
.end method

.method public removeMenuProvider(LYue/ۥۡ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۡ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeMenuProvider(LYue/ۥۡ۠ۧ;)V

    return-void
.end method

.method public removeOnConfigurationChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/content/res/Configuration;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeOnConfigurationChangedListener(LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public removeOnMultiWindowModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e1\u06e1\u06e6\u06e2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeOnMultiWindowModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public removeOnPictureInPictureModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e1\u06e4\u06e1;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeOnPictureInPictureModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public removeOnTrimMemoryListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeOnTrimMemoryListener(LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public ۥ(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .locals 0
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentActivity;->onAttachFragment(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public ۥ۟۟(I)Landroid/view/View;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/io/FileDescriptor;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Ljava/io/PrintWriter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/FragmentActivity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic ۥۣ۟۟۟()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥۣ۟۟۠()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۤ()Landroid/view/LayoutInflater;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۨ(Landroidx/fragment/app/Fragment;)Z
    .locals 0
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public ۥ۟۟۠(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    invoke-static {v0, p1}, LYue/ۥۣ۟۟ۧ;->ۥ۟۟ۢۧ(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠ۢ()V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity$ۥ;->invalidateMenu()V

    return-void
.end method

.method public ۥۣ۟۟۠()Landroidx/fragment/app/FragmentActivity;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$ۥ;->ۥ۟۟۠ۨ:Landroidx/fragment/app/FragmentActivity;

    return-object v0
.end method
