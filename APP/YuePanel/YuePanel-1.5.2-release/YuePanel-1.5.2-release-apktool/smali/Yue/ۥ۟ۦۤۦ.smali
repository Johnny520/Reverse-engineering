.class public LYue/ۥ۟ۦۤۦ;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleOwner;
.implements LYue/ۥۣۡۡۥ;
.implements LYue/ۥۡۧۤۢ;


# instance fields
.field private _lifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field private final onBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final savedStateRegistryController:LYue/ۥۡۧۤۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, LYue/ۥ۟ۦۤۦ;-><init>(Landroid/content/Context;IILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥۣۢ۠ۡ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 4
    sget-object p1, LYue/ۥۡۧۤۡ;->ۥ۟۟۟:LYue/ۥۡۧۤۡ$ۥ;

    invoke-virtual {p1, p0}, LYue/ۥۡۧۤۡ$ۥ;->ۥ(LYue/ۥۡۧۤۢ;)LYue/ۥۡۧۤۡ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟ۦۤۦ;->savedStateRegistryController:LYue/ۥۡۧۤۡ;

    .line 5
    new-instance p1, Landroidx/activity/OnBackPressedDispatcher;

    new-instance p2, LYue/ۥ۟ۦۤۥ;

    invoke-direct {p2, p0}, LYue/ۥ۟ۦۤۥ;-><init>(LYue/ۥ۟ۦۤۦ;)V

    invoke-direct {p1, p2}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, LYue/ۥ۟ۦۤۦ;->onBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, LYue/ۥ۟ۦۤۦ;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic getOnBackPressedDispatcher$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۟ۦۤۦ;)V
    .locals 0

    invoke-static {p0}, LYue/ۥ۟ۦۤۦ;->ۥ۟۟(LYue/ۥ۟ۦۤۦ;)V

    return-void
.end method

.method public static final ۥ۟۟(LYue/ۥ۟ۦۤۦ;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۟ۦۤۦ;->initializeViewTreeOwners()V

    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public getLifecycle()Landroidx/lifecycle/Lifecycle;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۦۤۦ;->ۥ۟()Landroidx/lifecycle/LifecycleRegistry;

    move-result-object v0

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۤۦ;->onBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public getSavedStateRegistry()Landroidx/savedstate/ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۤۦ;->savedStateRegistryController:LYue/ۥۡۧۤۡ;

    invoke-virtual {v0}, LYue/ۥۡۧۤۡ;->ۥ۟()Landroidx/savedstate/ۥ;

    move-result-object v0

    return-object v0
.end method

.method public initializeViewTreeOwners()V
    .locals 2
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window!!.decorView"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Landroidx/lifecycle/ViewTreeLifecycleOwner;->set(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, LYue/ۥۢۤۧۢ;->ۥ۟(Landroid/view/View;LYue/ۥۣۡۡۥ;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, LYue/ۥۣۢۤۧ;->ۥ۟(Landroid/view/View;LYue/ۥۡۧۤۢ;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۤۦ;->onBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠۟()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۦۤۦ;->onBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    invoke-static {p0}, LYue/ۥ۟ۦۤۤ;->ۥ(LYue/ۥ۟ۦۤۦ;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v1

    const-string v2, "onBackInvokedDispatcher"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠ۢ(Landroid/window/OnBackInvokedDispatcher;)V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۦۤۦ;->savedStateRegistryController:LYue/ۥۡۧۤۡ;

    invoke-virtual {v0, p1}, LYue/ۥۡۧۤۡ;->ۥ۟۟۟(Landroid/os/Bundle;)V

    invoke-virtual {p0}, LYue/ۥ۟ۦۤۦ;->ۥ۟()Landroidx/lifecycle/LifecycleRegistry;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_CREATE:Landroidx/lifecycle/Lifecycle$Event;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleRegistry;->handleLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Bundle;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "super.onSaveInstanceState()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LYue/ۥ۟ۦۤۦ;->savedStateRegistryController:LYue/ۥۡۧۤۡ;

    invoke-virtual {v1, v0}, LYue/ۥۡۧۤۡ;->ۥ۟۟۟۟(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public onStart()V
    .locals 2
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    invoke-virtual {p0}, LYue/ۥ۟ۦۤۦ;->ۥ۟()Landroidx/lifecycle/LifecycleRegistry;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleRegistry;->handleLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method public onStop()V
    .locals 2
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۦۤۦ;->ۥ۟()Landroidx/lifecycle/LifecycleRegistry;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleRegistry;->handleLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۦۤۦ;->_lifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LYue/ۥ۟ۦۤۦ;->initializeViewTreeOwners()V

    .line 2
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, LYue/ۥ۟ۦۤۦ;->initializeViewTreeOwners()V

    .line 4
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, LYue/ۥ۟ۦۤۦ;->initializeViewTreeOwners()V

    .line 6
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final ۥ۟()Landroidx/lifecycle/LifecycleRegistry;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۤۦ;->_lifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/LifecycleRegistry;

    invoke-direct {v0, p0}, Landroidx/lifecycle/LifecycleRegistry;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    iput-object v0, p0, LYue/ۥ۟ۦۤۦ;->_lifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    :cond_0
    return-object v0
.end method
