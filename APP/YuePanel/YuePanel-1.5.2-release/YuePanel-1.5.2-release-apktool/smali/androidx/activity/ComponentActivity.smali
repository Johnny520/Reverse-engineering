.class public Landroidx/activity/ComponentActivity;
.super Landroidx/core/app/ComponentActivity;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۧۥ;
.implements Landroidx/lifecycle/LifecycleOwner;
.implements Landroidx/lifecycle/ViewModelStoreOwner;
.implements Landroidx/lifecycle/HasDefaultViewModelProviderFactory;
.implements LYue/ۥۡۧۤۢ;
.implements LYue/ۥۣۡۡۥ;
.implements LYue/ۥ۟۟ۨۧ;
.implements LYue/ۥ۟۟ۨۡ;
.implements LYue/ۥۣۡۡۦ;
.implements LYue/ۥۣۡۢۤ;
.implements LYue/ۥۣۡۢ۠;
.implements LYue/ۥۣۡۢ۟;
.implements LYue/ۥۣۡۢۡ;
.implements LYue/ۥۡ۠ۦ۟;
.implements LYue/ۥۣ۠۠ۦ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;,
        Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;,
        Landroidx/activity/ComponentActivity$ۥ۟۟۟ۢ;,
        Landroidx/activity/ComponentActivity$ۥ۟۟۟ۡ;,
        Landroidx/activity/ComponentActivity$ۥ۟۟۟;,
        Landroidx/activity/ComponentActivity$ۥ۟۟;
    }
.end annotation


# static fields
.field private static final ACTIVITY_RESULT_TAG:Ljava/lang/String; = "android:support:activity-result"


# instance fields
.field private final mActivityResultRegistry:Landroidx/activity/result/ActivityResultRegistry;

.field private mContentLayoutId:I
    .annotation build LYue/ۥ۠ۦۨۧ;
    .end annotation
.end field

.field final mContextAwareHelper:LYue/ۥۣ۟ۧۦ;

.field private mDefaultFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

.field private mDispatchingOnMultiWindowModeChanged:Z

.field private mDispatchingOnPictureInPictureModeChanged:Z

.field final mFullyDrawnReporter:LYue/ۥۣ۠۠ۤ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field private final mLifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

.field private final mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

.field private final mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

.field private mOnBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

.field private final mOnConfigurationChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/content/res/Configuration;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mOnMultiWindowModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e1\u06e1\u06e6\u06e2;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mOnNewIntentListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/content/Intent;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mOnPictureInPictureModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e1\u06e4\u06e1;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mOnTrimMemoryListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field final mReportFullyDrawnExecutor:Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;

.field final mSavedStateRegistryController:LYue/ۥۡۧۤۡ;

.field private mViewModelStore:Landroidx/lifecycle/ViewModelStore;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/core/app/ComponentActivity;-><init>()V

    .line 2
    new-instance v0, LYue/ۥۣ۟ۧۦ;

    invoke-direct {v0}, LYue/ۥۣ۟ۧۦ;-><init>()V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->mContextAwareHelper:LYue/ۥۣ۟ۧۦ;

    .line 3
    new-instance v0, LYue/ۥۡ۠ۦۢ;

    new-instance v1, LYue/ۥ۟ۦۤ۟;

    invoke-direct {v1, p0}, LYue/ۥ۟ۦۤ۟;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-direct {v0, v1}, LYue/ۥۡ۠ۦۢ;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    .line 4
    new-instance v0, Landroidx/lifecycle/LifecycleRegistry;

    invoke-direct {v0, p0}, Landroidx/lifecycle/LifecycleRegistry;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->mLifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    .line 5
    invoke-static {p0}, LYue/ۥۡۧۤۡ;->ۥ(LYue/ۥۡۧۤۢ;)LYue/ۥۡۧۤۡ;

    move-result-object v0

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->mSavedStateRegistryController:LYue/ۥۡۧۤۡ;

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mOnBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    .line 7
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ۥ۟۟۟ۡ()Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;

    move-result-object v1

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mReportFullyDrawnExecutor:Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;

    .line 8
    new-instance v2, LYue/ۥۣ۠۠ۤ;

    new-instance v3, LYue/ۥ۟ۦۤ۠;

    invoke-direct {v3, p0}, LYue/ۥ۟ۦۤ۠;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-direct {v2, v1, v3}, LYue/ۥۣ۠۠ۤ;-><init>(Ljava/util/concurrent/Executor;LYue/ۥۣ۠۠ۨ;)V

    iput-object v2, p0, Landroidx/activity/ComponentActivity;->mFullyDrawnReporter:LYue/ۥۣ۠۠ۤ;

    .line 9
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    new-instance v1, Landroidx/activity/ComponentActivity$ۥ;

    invoke-direct {v1, p0}, Landroidx/activity/ComponentActivity$ۥ;-><init>(Landroidx/activity/ComponentActivity;)V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mActivityResultRegistry:Landroidx/activity/result/ActivityResultRegistry;

    .line 11
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mOnConfigurationChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mOnTrimMemoryListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mOnNewIntentListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mOnMultiWindowModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->mOnPictureInPictureModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnMultiWindowModeChanged:Z

    .line 17
    iput-boolean v1, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnPictureInPictureModeChanged:Z

    .line 18
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 19
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v1

    new-instance v2, Landroidx/activity/ComponentActivity$2;

    invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$2;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 20
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v1

    new-instance v2, Landroidx/activity/ComponentActivity$3;

    invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$3;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 21
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v1

    new-instance v2, Landroidx/activity/ComponentActivity$4;

    invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$4;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 22
    invoke-virtual {v0}, LYue/ۥۡۧۤۡ;->ۥ۟۟()V

    .line 23
    invoke-static {p0}, Landroidx/lifecycle/SavedStateHandleSupport;->enableSavedStateHandles(LYue/ۥۡۧۤۢ;)V

    .line 24
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/ۥ;

    move-result-object v0

    new-instance v1, LYue/ۥ۟ۦۤۡ;

    invoke-direct {v1, p0}, LYue/ۥ۟ۦۤۡ;-><init>(Landroidx/activity/ComponentActivity;)V

    const-string v2, "android:support:activity-result"

    invoke-virtual {v0, v2, v1}, Landroidx/savedstate/ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Landroidx/savedstate/ۥ$ۥ۟۟;)V

    .line 25
    new-instance v0, LYue/ۥ۟ۦۤۢ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۦۤۢ;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnContextAvailableListener(LYue/ۥۣۡۡۧ;)V

    return-void

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۦۨۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۧۤ;
    .end annotation

    .line 27
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 28
    iput p1, p0, Landroidx/activity/ComponentActivity;->mContentLayoutId:I

    return-void
.end method

.method public static synthetic access$001(Landroidx/activity/ComponentActivity;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method public static synthetic access$100(Landroidx/activity/ComponentActivity;)Landroidx/activity/OnBackPressedDispatcher;
    .locals 0

    iget-object p0, p0, Landroidx/activity/ComponentActivity;->mOnBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟(Landroidx/activity/ComponentActivity;Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->ۥ۟۟۟ۤ(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(Landroidx/activity/ComponentActivity;)Landroid/os/Bundle;
    .locals 0

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ۥۣ۟۟۟()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟۠(Landroidx/activity/ComponentActivity;)LYue/ۥۣۢ۠ۤ;
    .locals 0

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ۥ۟۟۟ۢ()LYue/ۥۣۢ۠ۤ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->initializeViewTreeOwners()V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mReportFullyDrawnExecutor:Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;->ۥ۟۟ۤۦ(Landroid/view/View;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addMenuProvider(LYue/ۥۡ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۡ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {v0, p1}, LYue/ۥۡ۠ۦۢ;->ۥ۟۟(LYue/ۥۡ۠ۧ;)V

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
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۡ۠ۦۢ;->ۥ۟۟۟(LYue/ۥۡ۠ۧ;Landroidx/lifecycle/LifecycleOwner;)V

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
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۡ۠ۦۢ;->ۥ۟۟۟۟(LYue/ۥۡ۠ۧ;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V

    return-void
.end method

.method public final addOnConfigurationChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
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

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnConfigurationChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnContextAvailableListener(LYue/ۥۣۡۡۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۡۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mContextAwareHelper:LYue/ۥۣ۟ۧۦ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۧۦ;->ۥ(LYue/ۥۣۡۡۧ;)V

    return-void
.end method

.method public final addOnMultiWindowModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
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

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnMultiWindowModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnNewIntentListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/content/Intent;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnNewIntentListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnPictureInPictureModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
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

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnPictureInPictureModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnTrimMemoryListener(LYue/ۥ۟ۧ۠ۧ;)V
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

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnTrimMemoryListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ensureViewModelStore()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mViewModelStore:Landroidx/lifecycle/ViewModelStore;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;->ۥ۟:Landroidx/lifecycle/ViewModelStore;

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->mViewModelStore:Landroidx/lifecycle/ViewModelStore;

    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mViewModelStore:Landroidx/lifecycle/ViewModelStore;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/lifecycle/ViewModelStore;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelStore;-><init>()V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->mViewModelStore:Landroidx/lifecycle/ViewModelStore;

    :cond_1
    return-void
.end method

.method public final getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mActivityResultRegistry:Landroidx/activity/result/ActivityResultRegistry;

    return-object v0
.end method

.method public getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;
    .locals 3
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/lifecycle/viewmodel/MutableCreationExtras;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/MutableCreationExtras;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;->APPLICATION_KEY:Landroidx/lifecycle/viewmodel/CreationExtras$Key;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/viewmodel/MutableCreationExtras;->set(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V

    :cond_0
    sget-object v1, Landroidx/lifecycle/SavedStateHandleSupport;->SAVED_STATE_REGISTRY_OWNER_KEY:Landroidx/lifecycle/viewmodel/CreationExtras$Key;

    invoke-virtual {v0, v1, p0}, Landroidx/lifecycle/viewmodel/MutableCreationExtras;->set(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V

    sget-object v1, Landroidx/lifecycle/SavedStateHandleSupport;->VIEW_MODEL_STORE_OWNER_KEY:Landroidx/lifecycle/viewmodel/CreationExtras$Key;

    invoke-virtual {v0, v1, p0}, Landroidx/lifecycle/viewmodel/MutableCreationExtras;->set(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Landroidx/lifecycle/SavedStateHandleSupport;->DEFAULT_ARGS_KEY:Landroidx/lifecycle/viewmodel/CreationExtras$Key;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/viewmodel/MutableCreationExtras;->set(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method public getDefaultViewModelProviderFactory()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mDefaultFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/lifecycle/SavedStateViewModelFactory;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v0, v1, p0, v2}, Landroidx/lifecycle/SavedStateViewModelFactory;-><init>(Landroid/app/Application;LYue/ۥۡۧۤۢ;Landroid/os/Bundle;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->mDefaultFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    :cond_1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mDefaultFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method public getFullyDrawnReporter()LYue/ۥۣ۠۠ۤ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mFullyDrawnReporter:LYue/ۥۣ۠۠ۤ;

    return-object v0
.end method

.method public getLastCustomNonConfigurationInstance()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;->ۥ:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getLifecycle()Landroidx/lifecycle/Lifecycle;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mLifecycleRegistry:Landroidx/lifecycle/LifecycleRegistry;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/activity/OnBackPressedDispatcher;

    new-instance v1, Landroidx/activity/ComponentActivity$ۥ۟;

    invoke-direct {v1, p0}, Landroidx/activity/ComponentActivity$ۥ۟;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-direct {v0, v1}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->mOnBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    new-instance v1, Landroidx/activity/ComponentActivity$6;

    invoke-direct {v1, p0}, Landroidx/activity/ComponentActivity$6;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public final getSavedStateRegistry()Landroidx/savedstate/ۥ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mSavedStateRegistryController:LYue/ۥۡۧۤۡ;

    invoke-virtual {v0}, LYue/ۥۡۧۤۡ;->ۥ۟()Landroidx/savedstate/ۥ;

    move-result-object v0

    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/ViewModelStore;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ensureViewModelStore()V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mViewModelStore:Landroidx/lifecycle/ViewModelStore;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public initializeViewTreeOwners()V
    .locals 1
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/ViewTreeLifecycleOwner;->set(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/ViewTreeViewModelStoreOwner;->set(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LYue/ۥۣۢۤۧ;->ۥ۟(Landroid/view/View;LYue/ۥۡۧۤۢ;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LYue/ۥۢۤۧۢ;->ۥ۟(Landroid/view/View;LYue/ۥۣۡۡۥ;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LYue/ۥۢۤۧۡ;->ۥ۟(Landroid/view/View;LYue/ۥۣ۠۠ۦ;)V

    return-void
.end method

.method public invalidateMenu()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mActivityResultRegistry:Landroidx/activity/result/ActivityResultRegistry;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠۟()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnConfigurationChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۧ۠ۧ;

    invoke-interface {v1, p1}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mSavedStateRegistryController:LYue/ۥۡۧۤۡ;

    invoke-virtual {v0, p1}, LYue/ۥۡۧۤۡ;->ۥ۟۟۟(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mContextAwareHelper:LYue/ۥۣ۟ۧۦ;

    invoke-virtual {v0, p0}, LYue/ۥۣ۟ۧۦ;->ۥ۟۟(Landroid/content/Context;)V

    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Landroidx/lifecycle/ReportFragment;->injectIfNeededIn(Landroid/app/Activity;)V

    iget p1, p0, Landroidx/activity/ComponentActivity;->mContentLayoutId:I

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(I)V

    :cond_0
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1
    .param p2    # Landroid/view/Menu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    iget-object p1, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, LYue/ۥۡ۠ۦۢ;->ۥ۟۟۟ۢ(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1
    .param p2    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {p1, p2}, LYue/ۥۡ۠ۦۢ;->ۥ۟۟۟ۤ(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 3
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnMultiWindowModeChanged:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnMultiWindowModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۧ۠ۧ;

    .line 3
    new-instance v2, LYue/ۥۡۡۦۢ;

    invoke-direct {v2, p1}, LYue/ۥۡۡۦۢ;-><init>(Z)V

    invoke-interface {v1, v2}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3
    .param p2    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        api = 0x1a
    .end annotation

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnMultiWindowModeChanged:Z

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnMultiWindowModeChanged:Z

    .line 7
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnMultiWindowModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۧ۠ۧ;

    .line 8
    new-instance v2, LYue/ۥۡۡۦۢ;

    invoke-direct {v2, p1, p2}, LYue/ۥۡۡۦۢ;-><init>(ZLandroid/content/res/Configuration;)V

    invoke-interface {v1, v2}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 9
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnMultiWindowModeChanged:Z

    .line 10
    throw p1
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnNewIntentListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۧ۠ۧ;

    invoke-interface {v1, p1}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1
    .param p2    # Landroid/view/Menu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {v0, p2}, LYue/ۥۡ۠ۦۢ;->ۥۣ۟۟۟(Landroid/view/Menu;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 3
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnPictureInPictureModeChanged:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnPictureInPictureModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۧ۠ۧ;

    .line 3
    new-instance v2, LYue/ۥۡۤۡ;

    invoke-direct {v2, p1}, LYue/ۥۡۤۡ;-><init>(Z)V

    invoke-interface {v1, v2}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3
    .param p2    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        api = 0x1a
    .end annotation

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnPictureInPictureModeChanged:Z

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnPictureInPictureModeChanged:Z

    .line 7
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnPictureInPictureModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۧ۠ۧ;

    .line 8
    new-instance v2, LYue/ۥۡۤۡ;

    invoke-direct {v2, p1, p2}, LYue/ۥۡۤۡ;-><init>(ZLandroid/content/res/Configuration;)V

    invoke-interface {v1, v2}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 9
    iput-boolean v0, p0, Landroidx/activity/ComponentActivity;->mDispatchingOnPictureInPictureModeChanged:Z

    .line 10
    throw p1
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/view/Menu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    iget-object p1, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {p1, p3}, LYue/ۥۡ۠ۦۢ;->ۥ۟۟۟ۥ(Landroid/view/Menu;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3
    .param p2    # [Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mActivityResultRegistry:Landroidx/activity/result/ActivityResultRegistry;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v0, p1, v2, v1}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public onRetainCustomNonConfigurationInstance()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->onRetainCustomNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/activity/ComponentActivity;->mViewModelStore:Landroidx/lifecycle/ViewModelStore;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;

    if-eqz v2, :cond_0

    iget-object v1, v2, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;->ۥ۟:Landroidx/lifecycle/ViewModelStore;

    :cond_0
    if-nez v1, :cond_1

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v2, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;

    invoke-direct {v2}, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;-><init>()V

    iput-object v0, v2, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;->ۥ:Ljava/lang/Object;

    iput-object v1, v2, Landroidx/activity/ComponentActivity$ۥ۟۟۟۟;->ۥ۟:Landroidx/lifecycle/ViewModelStore;

    return-object v2
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    instance-of v1, v0, Landroidx/lifecycle/LifecycleRegistry;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/lifecycle/LifecycleRegistry;

    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleRegistry;->setCurrentState(Landroidx/lifecycle/Lifecycle$State;)V

    :cond_0
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mSavedStateRegistryController:LYue/ۥۡۧۤۡ;

    invoke-virtual {v0, p1}, LYue/ۥۡۧۤۡ;->ۥ۟۟۟۟(Landroid/os/Bundle;)V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 3
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnTrimMemoryListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۧ۠ۧ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public peekAvailableContext()Landroid/content/Context;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mContextAwareHelper:LYue/ۥۣ۟ۧۦ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۧۦ;->ۥ۟۟۟()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final registerForActivityResult(LYue/ۥ۟۟ۨۢ;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;
    .locals 1
    .param p1    # LYue/ۥ۟۟ۨۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟۟ۨ۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2<",
            "TI;TO;>;",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e0<",
            "TO;>;)",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e6<",
            "TI;>;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mActivityResultRegistry:Landroidx/activity/result/ActivityResultRegistry;

    invoke-virtual {p0, p1, v0, p2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(LYue/ۥ۟۟ۨۢ;Landroidx/activity/result/ActivityResultRegistry;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;

    move-result-object p1

    return-object p1
.end method

.method public final registerForActivityResult(LYue/ۥ۟۟ۨۢ;Landroidx/activity/result/ActivityResultRegistry;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;
    .locals 2
    .param p1    # LYue/ۥ۟۟ۨۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/activity/result/ActivityResultRegistry;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟۟ۨ۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2<",
            "TI;TO;>;",
            "Landroidx/activity/result/ActivityResultRegistry;",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e0<",
            "TO;>;)",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e6<",
            "TI;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activity_rq#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/activity/ComponentActivity;->mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p2, v0, p0, p1, p3}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۤ(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;LYue/ۥ۟۟ۨۢ;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;

    move-result-object p1

    return-object p1
.end method

.method public removeMenuProvider(LYue/ۥۡ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۡ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mMenuHostHelper:LYue/ۥۡ۠ۦۢ;

    invoke-virtual {v0, p1}, LYue/ۥۡ۠ۦۢ;->ۥ۟۟۟ۦ(LYue/ۥۡ۠ۧ;)V

    return-void
.end method

.method public final removeOnConfigurationChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
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

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnConfigurationChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnContextAvailableListener(LYue/ۥۣۡۡۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۡۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mContextAwareHelper:LYue/ۥۣ۟ۧۦ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۧۦ;->ۥ۟۟۟۟(LYue/ۥۣۡۡۧ;)V

    return-void
.end method

.method public final removeOnMultiWindowModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
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

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnMultiWindowModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnNewIntentListener(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Landroid/content/Intent;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnNewIntentListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnPictureInPictureModeChangedListener(LYue/ۥ۟ۧ۠ۧ;)V
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

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnPictureInPictureModeChangedListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnTrimMemoryListener(LYue/ۥ۟ۧ۠ۧ;)V
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

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mOnTrimMemoryListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public reportFullyDrawn()V
    .locals 1

    :try_start_0
    invoke-static {}, LYue/ۥۢۢ۟;->ۥ۟۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "reportFullyDrawn() for ComponentActivity"

    invoke-static {v0}, LYue/ۥۢۢ۟;->ۥ۟۟(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mFullyDrawnReporter:LYue/ۥۣ۠۠ۤ;

    invoke-virtual {v0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LYue/ۥۢۢ۟;->ۥ۟۟۟۠()V

    return-void

    :goto_1
    invoke-static {}, LYue/ۥۢۢ۟;->ۥ۟۟۟۠()V

    throw v0
.end method

.method public setContentView(I)V
    .locals 2
    .param p1    # I
        .annotation build LYue/ۥ۠ۦۨۧ;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->initializeViewTreeOwners()V

    .line 2
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mReportFullyDrawnExecutor:Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;->ۥ۟۟ۤۦ(Landroid/view/View;)V

    .line 3
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    .line 4
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->initializeViewTreeOwners()V

    .line 5
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mReportFullyDrawnExecutor:Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;->ۥ۟۟ۤۦ(Landroid/view/View;)V

    .line 6
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    .line 7
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->initializeViewTreeOwners()V

    .line 8
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mReportFullyDrawnExecutor:Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;->ۥ۟۟ۤۦ(Landroid/view/View;)V

    .line 9
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .locals 0
    .param p1    # Landroid/content/IntentSender;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/content/IntentSender;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p7    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-super/range {p0 .. p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

.method public final ۥ۟۟۟ۡ()Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;
    .locals 1

    new-instance v0, Landroidx/activity/ComponentActivity$ۥ۟۟۟ۡ;

    invoke-direct {v0, p0}, Landroidx/activity/ComponentActivity$ۥ۟۟۟ۡ;-><init>(Landroidx/activity/ComponentActivity;)V

    return-object v0
.end method

.method public final synthetic ۥ۟۟۟ۢ()LYue/ۥۣۢ۠ۤ;
    .locals 1

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->reportFullyDrawn()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic ۥۣ۟۟۟()Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Landroidx/activity/ComponentActivity;->mActivityResultRegistry:Landroidx/activity/result/ActivityResultRegistry;

    invoke-virtual {v1, v0}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۢ(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final synthetic ۥ۟۟۟ۤ(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/ۥ;

    move-result-object p1

    const-string v0, "android:support:activity-result"

    invoke-virtual {p1, v0}, Landroidx/savedstate/ۥ;->ۥ۟(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->mActivityResultRegistry:Landroidx/activity/result/ActivityResultRegistry;

    invoke-virtual {v0, p1}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟۟ۡ(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method
