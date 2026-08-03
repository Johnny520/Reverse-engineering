.class public abstract LTa;
.super LSa;
.source ""

# interfaces
.implements LyE;
.implements Lqk;
.implements Lix;


# instance fields
.field public final c:LBb;

.field public final d:Lw4;

.field public final e:Lwy;

.field public f:LxE;

.field public final g:LOa;

.field public final h:LcA;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:LQa;

.field public final k:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final l:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final o:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public q:Z

.field public r:Z

.field public final s:LcA;

.field public final t:LcA;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, LSa;-><init>()V

    new-instance v0, LBb;

    invoke-direct {v0}, LBb;-><init>()V

    iput-object v0, p0, LTa;->c:LBb;

    new-instance v0, Lw4;

    new-instance v1, LGa;

    move-object v2, p0

    check-cast v2, Lki;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, LGa;-><init>(Lki;I)V

    invoke-direct {v0, v1}, Lw4;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, LTa;->d:Lw4;

    new-instance v0, Lwy;

    invoke-direct {v0, p0}, Lwy;-><init>(Lix;)V

    iput-object v0, p0, LTa;->e:Lwy;

    new-instance v1, LOa;

    invoke-direct {v1, v2}, LOa;-><init>(Lki;)V

    iput-object v1, p0, LTa;->g:LOa;

    new-instance v1, LRa;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, LRa;-><init>(Lki;I)V

    new-instance v3, LcA;

    invoke-direct {v3, v1}, LcA;-><init>(LUi;)V

    iput-object v3, p0, LTa;->h:LcA;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, LTa;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, LQa;

    invoke-direct {v1, v2}, LQa;-><init>(Lki;)V

    iput-object v1, p0, LTa;->j:LQa;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, LTa;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, LTa;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, LTa;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, LTa;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, LTa;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, LTa;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, LTa;->getLifecycle()LRn;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LTa;->getLifecycle()LRn;

    move-result-object v1

    new-instance v3, LHa;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2}, LHa;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, LRn;->a(LXn;)V

    invoke-virtual {p0}, LTa;->getLifecycle()LRn;

    move-result-object v1

    new-instance v3, LHa;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2}, LHa;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, LRn;->a(LXn;)V

    invoke-virtual {p0}, LTa;->getLifecycle()LRn;

    move-result-object v1

    new-instance v3, Lcv;

    invoke-direct {v3, v4, v2}, Lcv;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, LRn;->a(LXn;)V

    invoke-virtual {v0}, Lwy;->c()V

    invoke-static {p0}, LOj;->o(Lix;)V

    invoke-virtual {p0}, LTa;->getSavedStateRegistry()Lhx;

    move-result-object v0

    new-instance v1, LIa;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, LIa;-><init>(ILjava/lang/Object;)V

    const-string v3, "android:support:activity-result"

    invoke-virtual {v0, v3, v1}, Lhx;->c(Ljava/lang/String;Lgx;)V

    new-instance v0, LJa;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, LJa;-><init>(Lki;I)V

    invoke-virtual {p0, v0}, LTa;->addOnContextAvailableListener(Lpt;)V

    new-instance v0, LRa;

    invoke-direct {v0, v2, v1}, LRa;-><init>(Lki;I)V

    new-instance v1, LcA;

    invoke-direct {v1, v0}, LcA;-><init>(LUi;)V

    iput-object v1, p0, LTa;->s:LcA;

    new-instance v0, LRa;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, LRa;-><init>(Lki;I)V

    new-instance v1, LcA;

    invoke-direct {v1, v0}, LcA;-><init>(LUi;)V

    iput-object v1, p0, LTa;->t:LcA;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final access$addObserverForBackInvoker(LTa;Lot;)V
    .locals 3

    invoke-virtual {p0}, LTa;->getLifecycle()LRn;

    move-result-object v0

    new-instance v1, LKa;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, p0}, LKa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LRn;->a(LXn;)V

    return-void
.end method

.method public static final access$ensureViewModelStore(LTa;)V
    .locals 1

    iget-object v0, p0, LTa;->f:LxE;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMa;

    if-eqz v0, :cond_0

    iget-object v0, v0, LMa;->b:LxE;

    iput-object v0, p0, LTa;->f:LxE;

    :cond_0
    iget-object v0, p0, LTa;->f:LxE;

    if-nez v0, :cond_1

    new-instance v0, LxE;

    invoke-direct {v0}, LxE;-><init>()V

    iput-object v0, p0, LTa;->f:LxE;

    :cond_1
    return-void
.end method

.method public static final synthetic access$getReportFullyDrawnExecutor$p(LTa;)LNa;
    .locals 0

    iget-object p0, p0, LTa;->g:LOa;

    return-object p0
.end method

.method public static final synthetic access$onBackPressed$s1027565324(LTa;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method public static synthetic getOnBackPressedDispatcher$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public addMenuProvider(LEr;)V
    .locals 2

    .line 1
    iget-object v0, p0, LTa;->d:Lw4;

    iget-object v1, v0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, v0, Lw4;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public addMenuProvider(LEr;LYn;)V
    .locals 5

    .line 4
    iget-object v0, p0, LTa;->d:Lw4;

    iget-object v1, v0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v1, v0, Lw4;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 6
    invoke-interface {p2}, LYn;->getLifecycle()LRn;

    move-result-object p2

    .line 7
    iget-object v1, v0, Lw4;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lor;

    if-eqz v2, :cond_0

    .line 8
    iget-object v3, v2, Lor;->a:LRn;

    iget-object v4, v2, Lor;->b:LUn;

    invoke-virtual {v3, v4}, LRn;->b(LXn;)V

    const/4 v3, 0x0

    .line 9
    iput-object v3, v2, Lor;->b:LUn;

    .line 10
    :cond_0
    new-instance v2, LKa;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0, p1}, LKa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    new-instance v0, Lor;

    invoke-direct {v0, p2, v2}, Lor;-><init>(LRn;LUn;)V

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public addMenuProvider(LEr;LYn;LPn;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    .line 12
    iget-object v0, p0, LTa;->d:Lw4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-interface {p2}, LYn;->getLifecycle()LRn;

    move-result-object p2

    .line 14
    iget-object v1, v0, Lw4;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lor;

    if-eqz v2, :cond_0

    .line 15
    iget-object v3, v2, Lor;->a:LRn;

    iget-object v4, v2, Lor;->b:LUn;

    invoke-virtual {v3, v4}, LRn;->b(LXn;)V

    const/4 v3, 0x0

    .line 16
    iput-object v3, v2, Lor;->b:LUn;

    .line 17
    :cond_0
    new-instance v2, Lnr;

    invoke-direct {v2, v0, p3, p1}, Lnr;-><init>(Lw4;LPn;LEr;)V

    .line 18
    new-instance p3, Lor;

    invoke-direct {p3, p2, v2}, Lor;-><init>(LRn;LUn;)V

    invoke-virtual {v1, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final addOnConfigurationChangedListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnContextAvailableListener(Lpt;)V
    .locals 2

    iget-object v0, p0, LTa;->c:LBb;

    iget-object v1, v0, LBb;->b:Ljava/lang/Object;

    check-cast v1, LTa;

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lpt;->a()V

    :cond_0
    iget-object v0, v0, LBb;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnMultiWindowModeChangedListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnNewIntentListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnPictureInPictureModeChangedListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnTrimMemoryListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addOnUserLeaveHintListener(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LTa;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final getActivityResultRegistry()Lc1;
    .locals 1

    iget-object v0, p0, LTa;->j:LQa;

    return-object v0
.end method

.method public getDefaultViewModelCreationExtras()Llc;
    .locals 3

    new-instance v0, Lts;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lts;-><init>(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v1, Lgf;->m:Lgf;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :cond_0
    sget-object v1, LOj;->h:Lhw;

    invoke-virtual {v0, v1, p0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    sget-object v1, LOj;->i:Lhw;

    invoke-virtual {v0, v1, p0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    sget-object v2, LOj;->j:Lhw;

    invoke-virtual {v0, v2, v1}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public getDefaultViewModelProviderFactory()LwE;
    .locals 1

    iget-object v0, p0, LTa;->s:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LwE;

    return-object v0
.end method

.method public getFullyDrawnReporter()LQi;
    .locals 1

    iget-object v0, p0, LTa;->h:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQi;

    return-object v0
.end method

.method public getLastCustomNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMa;

    if-eqz v0, :cond_0

    iget-object v0, v0, LMa;->a:Ljava/lang/Object;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLifecycle()LRn;
    .locals 1

    iget-object v0, p0, LSa;->b:Lao;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Lot;
    .locals 1

    iget-object v0, p0, LTa;->t:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lot;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lhx;
    .locals 1

    iget-object v0, p0, LTa;->e:Lwy;

    iget-object v0, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Lhx;

    return-object v0
.end method

.method public getViewModelStore()LxE;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LTa;->f:LxE;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMa;

    if-eqz v0, :cond_0

    iget-object v0, v0, LMa;->b:LxE;

    iput-object v0, p0, LTa;->f:LxE;

    :cond_0
    iget-object v0, p0, LTa;->f:LxE;

    if-nez v0, :cond_1

    new-instance v0, LxE;

    invoke-direct {v0}, LxE;-><init>()V

    iput-object v0, p0, LTa;->f:LxE;

    :cond_1
    iget-object v0, p0, LTa;->f:LxE;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public initializeViewTreeOwners()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a025f

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a0262

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a0261

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a0260

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a01c0

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public invalidateMenu()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, LTa;->j:LQa;

    invoke-virtual {v0, p1, p2, p3}, Lc1;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, LTa;->getOnBackPressedDispatcher()Lot;

    move-result-object v0

    invoke-virtual {v0}, Lot;->b()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, LTa;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lub;

    invoke-interface {v1, p1}, Lub;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, LTa;->e:Lwy;

    invoke-virtual {v0, p1}, Lwy;->d(Landroid/os/Bundle;)V

    iget-object v0, p0, LTa;->c:LBb;

    iput-object p0, v0, LBb;->b:Ljava/lang/Object;

    iget-object v0, v0, LBb;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpt;

    invoke-interface {v1}, Lpt;->a()V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LSa;->onCreate(Landroid/os/Bundle;)V

    sget p1, LWv;->b:I

    invoke-static {p0}, LUv;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    iget-object p1, p0, LTa;->d:Lw4;

    iget-object p1, p1, Lw4;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LEr;

    check-cast p2, Lsi;

    iget-object p2, p2, Lsi;->a:Lzi;

    invoke-virtual {p2}, Lzi;->j()Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, LTa;->d:Lw4;

    invoke-virtual {p1}, Lw4;->B()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LTa;->q:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, LTa;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lub;

    .line 3
    new-instance v2, Lss;

    invoke-direct {v2, p1}, Lss;-><init>(Z)V

    invoke-interface {v1, v2}, Lub;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 2

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, LTa;->q:Z

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iput-boolean v0, p0, LTa;->q:Z

    .line 7
    iget-object p2, p0, LTa;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lub;

    .line 8
    new-instance v1, Lss;

    .line 9
    invoke-direct {v1, p1}, Lss;-><init>(Z)V

    .line 10
    invoke-interface {v0, v1}, Lub;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 11
    iput-boolean v0, p0, LTa;->q:Z

    throw p1
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    iget-object v0, p0, LTa;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lub;

    invoke-interface {v1, p1}, Lub;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    iget-object v0, p0, LTa;->d:Lw4;

    iget-object v0, v0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEr;

    check-cast v1, Lsi;

    iget-object v1, v1, Lsi;->a:Lzi;

    invoke-virtual {v1}, Lzi;->p()V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LTa;->r:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, LTa;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lub;

    .line 3
    new-instance v2, LOt;

    invoke-direct {v2, p1}, LOt;-><init>(Z)V

    invoke-interface {v1, v2}, Lub;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 2

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, LTa;->r:Z

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iput-boolean v0, p0, LTa;->r:Z

    .line 7
    iget-object p2, p0, LTa;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lub;

    .line 8
    new-instance v1, LOt;

    .line 9
    invoke-direct {v1, p1}, LOt;-><init>(Z)V

    .line 10
    invoke-interface {v0, v1}, Lub;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 11
    iput-boolean v0, p0, LTa;->r:Z

    throw p1
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    iget-object p1, p0, LTa;->d:Lw4;

    iget-object p1, p1, Lw4;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LEr;

    check-cast p2, Lsi;

    iget-object p2, p2, Lsi;->a:Lzi;

    invoke-virtual {p2}, Lzi;->s()Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, LTa;->j:LQa;

    const/4 v2, -0x1

    invoke-virtual {v1, p1, v2, v0}, Lc1;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public onRetainCustomNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LTa;->onRetainCustomNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LTa;->f:LxE;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LMa;

    if-eqz v2, :cond_0

    iget-object v1, v2, LMa;->b:LxE;

    :cond_0
    if-nez v1, :cond_1

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v2, LMa;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v0, v2, LMa;->a:Ljava/lang/Object;

    iput-object v1, v2, LMa;->b:LxE;

    return-object v2
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, LTa;->getLifecycle()LRn;

    move-result-object v0

    instance-of v0, v0, Lao;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LTa;->getLifecycle()LRn;

    move-result-object v0

    check-cast v0, Lao;

    const-string v1, "setCurrentState"

    invoke-virtual {v0, v1}, Lao;->d(Ljava/lang/String;)V

    sget-object v1, LPn;->c:LPn;

    invoke-virtual {v0, v1}, Lao;->f(LPn;)V

    :cond_0
    invoke-super {p0, p1}, LSa;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, LTa;->e:Lwy;

    invoke-virtual {v0, p1}, Lwy;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    iget-object v0, p0, LTa;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lub;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Lub;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onUserLeaveHint()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onUserLeaveHint()V

    iget-object v0, p0, LTa;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public peekAvailableContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LTa;->c:LBb;

    iget-object v0, v0, LBb;->b:Ljava/lang/Object;

    check-cast v0, LTa;

    return-object v0
.end method

.method public final registerForActivityResult(LT0;LR0;)LV0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "LT0;",
            "LR0;",
            ")",
            "LV0;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, LTa;->j:LQa;

    invoke-virtual {p0, p1, v0, p2}, LTa;->registerForActivityResult(LT0;Lc1;LR0;)LV0;

    move-result-object p1

    return-object p1
.end method

.method public final registerForActivityResult(LT0;Lc1;LR0;)LV0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "LT0;",
            "Lc1;",
            "LR0;",
            ")",
            "LV0;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "activity_rq#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LTa;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p2, Lc1;->c:Ljava/util/LinkedHashMap;

    .line 3
    invoke-interface {p0}, LYn;->getLifecycle()LRn;

    move-result-object v2

    .line 4
    move-object v3, v2

    check-cast v3, Lao;

    .line 5
    iget-object v4, v3, Lao;->c:LPn;

    .line 6
    sget-object v5, LPn;->d:LPn;

    invoke-virtual {v4, v5}, LPn;->a(LPn;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 7
    invoke-virtual {p2, v0}, Lc1;->d(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0;

    if-nez v3, :cond_0

    new-instance v3, LY0;

    invoke-direct {v3, v2}, LY0;-><init>(LRn;)V

    .line 9
    :cond_0
    new-instance v2, LW0;

    invoke-direct {v2, p2, v0, p3, p1}, LW0;-><init>(Lc1;Ljava/lang/String;LR0;LT0;)V

    .line 10
    iget-object p1, v3, LY0;->a:LRn;

    invoke-virtual {p1, v2}, LRn;->a(LXn;)V

    .line 11
    iget-object p1, v3, LY0;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    new-instance p1, La1;

    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "LifecycleOwner "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is attempting to register while current state is "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    iget-object p2, v3, Lao;->c:LPn;

    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    const-string p2, ". LifecycleOwners must call register before they are STARTED."

    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 20
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public removeMenuProvider(LEr;)V
    .locals 1

    iget-object v0, p0, LTa;->d:Lw4;

    invoke-virtual {v0, p1}, Lw4;->F(LEr;)V

    return-void
.end method

.method public final removeOnConfigurationChangedListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnContextAvailableListener(Lpt;)V
    .locals 1

    iget-object v0, p0, LTa;->c:LBb;

    iget-object v0, v0, LBb;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnMultiWindowModeChangedListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnNewIntentListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnPictureInPictureModeChangedListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnTrimMemoryListener(Lub;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LTa;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeOnUserLeaveHintListener(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LTa;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public reportFullyDrawn()V
    .locals 4

    :try_start_0
    invoke-static {}, LOj;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "reportFullyDrawn() for ComponentActivity"

    invoke-static {v0}, LOj;->c(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    invoke-virtual {p0}, LTa;->getFullyDrawnReporter()LQi;

    move-result-object v0

    iget-object v1, v0, LQi;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    :try_start_1
    iput-boolean v2, v0, LQi;->b:Z

    iget-object v2, v0, LQi;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LUi;

    invoke-interface {v3}, LUi;->a()Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v0, v0, LQi;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    :try_start_3
    monitor-exit v1

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, LTa;->initializeViewTreeOwners()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, LTa;->g:LOa;

    iget-boolean v2, v1, LOa;->c:Z

    if-nez v2, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, v1, LOa;->c:Z

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 0

    .line 2
    invoke-super/range {p0 .. p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method
