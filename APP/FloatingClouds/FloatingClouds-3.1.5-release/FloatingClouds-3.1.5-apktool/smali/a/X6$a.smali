.class public final La/X6$a;
.super La/Z6;
.source "SourceFile"

# interfaces
.implements La/Zb;
.implements La/gc;
.implements La/bc;
.implements La/cc;
.implements La/Gg;
.implements La/Yb;
.implements La/e0;
.implements La/Ld;
.implements La/l7;
.implements La/Xa;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/X6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/Z6<",
        "La/X6;",
        ">;",
        "La/Zb;",
        "La/gc;",
        "La/bc;",
        "La/cc;",
        "La/Gg;",
        "La/Yb;",
        "La/e0;",
        "La/Ld;",
        "La/l7;",
        "La/Xa;"
    }
.end annotation


# instance fields
.field public final synthetic e:La/X6;


# direct methods
.method public constructor <init>(La/X6;)V
    .locals 0

    iput-object p1, p0, La/X6$a;->e:La/X6;

    invoke-direct {p0, p1}, La/Z6;-><init>(La/X6;)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/b;)V
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, La/X6;->onAttachFragment(Landroidx/fragment/app/b;)V

    return-void
.end method

.method public final addMenuProvider(La/gb;)V
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addMenuProvider(La/gb;)V

    return-void
.end method

.method public final addOnConfigurationChangedListener(La/Q3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Q3<",
            "Landroid/content/res/Configuration;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addOnConfigurationChangedListener(La/Q3;)V

    return-void
.end method

.method public final addOnMultiWindowModeChangedListener(La/Q3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Q3<",
            "La/zb;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addOnMultiWindowModeChangedListener(La/Q3;)V

    return-void
.end method

.method public final addOnPictureInPictureModeChangedListener(La/Q3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Q3<",
            "La/uc;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addOnPictureInPictureModeChangedListener(La/Q3;)V

    return-void
.end method

.method public final addOnTrimMemoryListener(La/Q3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Q3<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->addOnTrimMemoryListener(La/Q3;)V

    return-void
.end method

.method public final c(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getActivityResultRegistry()Landroidx/activity/result/a;
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/a;

    move-result-object v0

    return-object v0
.end method

.method public final getLifecycle()Landroidx/lifecycle/e;
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    iget-object v0, v0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public final getSavedStateRegistry()Landroidx/savedstate/a;
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStore()La/Fg;
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getViewModelStore()La/Fg;

    move-result-object v0

    return-object v0
.end method

.method public final removeMenuProvider(La/gb;)V
    .locals 1

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeMenuProvider(La/gb;)V

    return-void
.end method

.method public final removeOnConfigurationChangedListener(La/Q3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Q3<",
            "Landroid/content/res/Configuration;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeOnConfigurationChangedListener(La/Q3;)V

    return-void
.end method

.method public final removeOnMultiWindowModeChangedListener(La/Q3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Q3<",
            "La/zb;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeOnMultiWindowModeChangedListener(La/Q3;)V

    return-void
.end method

.method public final removeOnPictureInPictureModeChangedListener(La/Q3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Q3<",
            "La/uc;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeOnPictureInPictureModeChangedListener(La/Q3;)V

    return-void
.end method

.method public final removeOnTrimMemoryListener(La/Q3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Q3<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/X6$a;->e:La/X6;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->removeOnTrimMemoryListener(La/Q3;)V

    return-void
.end method
