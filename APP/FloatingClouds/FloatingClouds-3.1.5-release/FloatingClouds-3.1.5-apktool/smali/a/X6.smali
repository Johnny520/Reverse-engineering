.class public La/X6;
.super Landroidx/activity/ComponentActivity;
.source "SourceFile"

# interfaces
.implements La/U;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/X6$a;
    }
.end annotation


# static fields
.field static final LIFECYCLE_TAG:Ljava/lang/String; = "android:support:lifecycle"


# instance fields
.field mCreated:Z

.field final mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

.field final mFragments:La/Y6;

.field mResumed:Z

.field mStopped:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 2
    new-instance v0, La/X6$a;

    invoke-direct {v0, p0}, La/X6$a;-><init>(La/X6;)V

    .line 3
    new-instance v1, La/Y6;

    invoke-direct {v1, v0}, La/Y6;-><init>(La/X6$a;)V

    .line 4
    iput-object v1, p0, La/X6;->mFragments:La/Y6;

    .line 5
    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h;-><init>(La/y9;)V

    iput-object v0, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La/X6;->mStopped:Z

    .line 7
    invoke-direct {p0}, La/X6;->init()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 8
    invoke-direct {p0, p1}, Landroidx/activity/ComponentActivity;-><init>(I)V

    .line 9
    new-instance p1, La/X6$a;

    invoke-direct {p1, p0}, La/X6$a;-><init>(La/X6;)V

    .line 10
    new-instance v0, La/Y6;

    invoke-direct {v0, p1}, La/Y6;-><init>(La/X6$a;)V

    .line 11
    iput-object v0, p0, La/X6;->mFragments:La/Y6;

    .line 12
    new-instance p1, Landroidx/lifecycle/h;

    invoke-direct {p1, p0}, Landroidx/lifecycle/h;-><init>(La/y9;)V

    iput-object p1, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, La/X6;->mStopped:Z

    .line 14
    invoke-direct {p0}, La/X6;->init()V

    return-void
.end method

.method public static synthetic d(La/X6;Landroidx/activity/ComponentActivity;)V
    .locals 0

    invoke-direct {p0, p1}, La/X6;->lambda$init$3(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic e(La/X6;Landroid/content/res/Configuration;)V
    .locals 0

    invoke-direct {p0, p1}, La/X6;->lambda$init$1(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public static synthetic f(La/X6;)Landroid/os/Bundle;
    .locals 0

    invoke-direct {p0}, La/X6;->lambda$init$0()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(La/X6;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, La/X6;->lambda$init$2(Landroid/content/Intent;)V

    return-void
.end method

.method private init()V
    .locals 3

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v0

    new-instance v1, La/B3;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, La/B3;-><init>(ILjava/lang/Object;)V

    const-string v2, "android:support:lifecycle"

    invoke-virtual {v0, v2, v1}, Landroidx/savedstate/a;->c(Ljava/lang/String;Landroidx/savedstate/a$b;)V

    new-instance v0, La/W6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/W6;-><init>(La/X6;I)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnConfigurationChangedListener(La/Q3;)V

    new-instance v0, La/W6;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, La/W6;-><init>(La/X6;I)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnNewIntentListener(La/Q3;)V

    new-instance v0, La/C3;

    invoke-direct {v0, p0, v1}, La/C3;-><init>(Landroidx/activity/ComponentActivity;I)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnContextAvailableListener(La/ac;)V

    return-void
.end method

.method private synthetic lambda$init$0()Landroid/os/Bundle;
    .locals 2

    invoke-virtual {p0}, La/X6;->markFragmentsCreated()V

    iget-object v0, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/e$a;->ON_STOP:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method private synthetic lambda$init$1(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, La/X6;->mFragments:La/Y6;

    invoke-virtual {p1}, La/Y6;->a()V

    return-void
.end method

.method private synthetic lambda$init$2(Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, La/X6;->mFragments:La/Y6;

    invoke-virtual {p1}, La/Y6;->a()V

    return-void
.end method

.method private lambda$init$3(Landroid/content/Context;)V
    .locals 2

    iget-object p1, p0, La/X6;->mFragments:La/Y6;

    iget-object p1, p1, La/Y6;->a:La/X6$a;

    const/4 v0, 0x0

    iget-object v1, p1, La/Z6;->d:La/i7;

    invoke-virtual {v1, p1, p1, v0}, La/e7;->b(La/X6$a;La/a2;Landroidx/fragment/app/b;)V

    return-void
.end method

.method private static markState(La/e7;Landroidx/lifecycle/e$b;)Z
    .locals 5

    iget-object p0, p0, La/e7;->c:La/A2;

    invoke-virtual {p0}, La/A2;->g()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/b;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Landroidx/fragment/app/b;->u:La/X6$a;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    iget-object v2, v2, La/X6$a;->e:La/X6;

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v1}, Landroidx/fragment/app/b;->c()La/e7;

    move-result-object v2

    invoke-static {v2, p1}, La/X6;->markState(La/e7;Landroidx/lifecycle/e$b;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/b;->P:La/q7;

    sget-object v3, Landroidx/lifecycle/e$b;->d:Landroidx/lifecycle/e$b;

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v2}, La/q7;->b()V

    iget-object v2, v2, La/q7;->d:Landroidx/lifecycle/h;

    iget-object v2, v2, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_4

    iget-object v0, v1, Landroidx/fragment/app/b;->P:La/q7;

    iget-object v0, v0, La/q7;->d:Landroidx/lifecycle/h;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/e$b;)V

    move v0, v4

    :cond_4
    iget-object v2, v1, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    iget-object v2, v2, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_0

    iget-object v0, v1, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/e$b;)V

    move v0, v4

    goto :goto_0

    :cond_5
    return v0
.end method


# virtual methods
.method public final dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    iget-object v0, v0, La/Y6;->a:La/X6$a;

    iget-object v0, v0, La/Z6;->d:La/i7;

    iget-object v0, v0, La/e7;->f:La/a7;

    invoke-virtual {v0, p1, p2, p3, p4}, La/a7;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p0, p4}, La/D3;->shouldDumpInternalState([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, La/X6;->mCreated:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, La/X6;->mResumed:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, La/X6;->mStopped:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v1, La/I9;

    invoke-interface {p0}, La/Gg;->getViewModelStore()La/Fg;

    move-result-object v2

    invoke-direct {v1, p0, v2}, La/I9;-><init>(La/y9;La/Fg;)V

    invoke-virtual {v1, v0, p3}, La/I9;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_1
    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    iget-object v0, v0, La/Y6;->a:La/X6$a;

    iget-object v0, v0, La/Z6;->d:La/i7;

    invoke-virtual {v0, p1, p2, p3, p4}, La/e7;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public getSupportFragmentManager()La/e7;
    .locals 1

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    iget-object v0, v0, La/Y6;->a:La/X6$a;

    iget-object v0, v0, La/Z6;->d:La/i7;

    return-object v0
.end method

.method public getSupportLoaderManager()La/H9;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, La/I9;

    invoke-interface {p0}, La/Gg;->getViewModelStore()La/Fg;

    move-result-object v1

    invoke-direct {v0, p0, v1}, La/I9;-><init>(La/y9;La/Fg;)V

    return-object v0
.end method

.method public markFragmentsCreated()V
    .locals 2

    :cond_0
    invoke-virtual {p0}, La/X6;->getSupportFragmentManager()La/e7;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/e$b;->c:Landroidx/lifecycle/e$b;

    invoke-static {v0, v1}, La/X6;->markState(La/e7;Landroidx/lifecycle/e$b;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    invoke-virtual {v0}, La/Y6;->a()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onAttachFragment(Landroidx/fragment/app/b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    sget-object v0, Landroidx/lifecycle/e$a;->ON_CREATE:Landroidx/lifecycle/e$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    iget-object p1, p0, La/X6;->mFragments:La/Y6;

    iget-object p1, p1, La/Y6;->a:La/X6$a;

    iget-object p1, p1, La/Z6;->d:La/i7;

    const/4 v0, 0x0

    iput-boolean v0, p1, La/e7;->G:Z

    iput-boolean v0, p1, La/e7;->H:Z

    iget-object v1, p1, La/e7;->N:La/k7;

    iput-boolean v0, v1, La/k7;->i:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, La/e7;->u(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, La/X6;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, La/X6;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    iget-object v0, v0, La/Y6;->a:La/X6$a;

    iget-object v0, v0, La/Z6;->d:La/i7;

    invoke-virtual {v0}, La/e7;->l()V

    iget-object v0, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/e$a;->ON_DESTROY:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p2, 0x6

    if-ne p1, p2, :cond_1

    iget-object p1, p0, La/X6;->mFragments:La/Y6;

    iget-object p1, p1, La/Y6;->a:La/X6$a;

    iget-object p1, p1, La/Z6;->d:La/i7;

    invoke-virtual {p1}, La/e7;->j()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/X6;->mResumed:Z

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    iget-object v0, v0, La/Y6;->a:La/X6$a;

    const/4 v1, 0x5

    iget-object v0, v0, La/Z6;->d:La/i7;

    invoke-virtual {v0, v1}, La/e7;->u(I)V

    iget-object v0, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/e$a;->ON_PAUSE:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    return-void
.end method

.method public onPostResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, La/X6;->onResumeFragments()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    invoke-virtual {v0}, La/Y6;->a()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    invoke-virtual {v0}, La/Y6;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/X6;->mResumed:Z

    iget-object v1, p0, La/X6;->mFragments:La/Y6;

    iget-object v1, v1, La/Y6;->a:La/X6$a;

    iget-object v1, v1, La/Z6;->d:La/i7;

    invoke-virtual {v1, v0}, La/e7;->z(Z)Z

    return-void
.end method

.method public onResumeFragments()V
    .locals 3

    iget-object v0, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/e$a;->ON_RESUME:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    iget-object v0, v0, La/Y6;->a:La/X6$a;

    iget-object v0, v0, La/Z6;->d:La/i7;

    const/4 v1, 0x0

    iput-boolean v1, v0, La/e7;->G:Z

    iput-boolean v1, v0, La/e7;->H:Z

    iget-object v2, v0, La/e7;->N:La/k7;

    iput-boolean v1, v2, La/k7;->i:Z

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, La/e7;->u(I)V

    return-void
.end method

.method public onStart()V
    .locals 4

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    invoke-virtual {v0}, La/Y6;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/X6;->mStopped:Z

    iget-boolean v1, p0, La/X6;->mCreated:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iput-boolean v2, p0, La/X6;->mCreated:Z

    iget-object v1, p0, La/X6;->mFragments:La/Y6;

    iget-object v1, v1, La/Y6;->a:La/X6$a;

    iget-object v1, v1, La/Z6;->d:La/i7;

    iput-boolean v0, v1, La/e7;->G:Z

    iput-boolean v0, v1, La/e7;->H:Z

    iget-object v3, v1, La/e7;->N:La/k7;

    iput-boolean v0, v3, La/k7;->i:Z

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, La/e7;->u(I)V

    :cond_0
    iget-object v1, p0, La/X6;->mFragments:La/Y6;

    iget-object v1, v1, La/Y6;->a:La/X6$a;

    iget-object v1, v1, La/Z6;->d:La/i7;

    invoke-virtual {v1, v2}, La/e7;->z(Z)Z

    iget-object v1, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    sget-object v2, Landroidx/lifecycle/e$a;->ON_START:Landroidx/lifecycle/e$a;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    iget-object v1, p0, La/X6;->mFragments:La/Y6;

    iget-object v1, v1, La/Y6;->a:La/X6$a;

    iget-object v1, v1, La/Z6;->d:La/i7;

    iput-boolean v0, v1, La/e7;->G:Z

    iput-boolean v0, v1, La/e7;->H:Z

    iget-object v2, v1, La/e7;->N:La/k7;

    iput-boolean v0, v2, La/k7;->i:Z

    const/4 v0, 0x5

    invoke-virtual {v1, v0}, La/e7;->u(I)V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, La/X6;->mFragments:La/Y6;

    invoke-virtual {v0}, La/Y6;->a()V

    return-void
.end method

.method public onStop()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/X6;->mStopped:Z

    invoke-virtual {p0}, La/X6;->markFragmentsCreated()V

    iget-object v1, p0, La/X6;->mFragments:La/Y6;

    iget-object v1, v1, La/Y6;->a:La/X6$a;

    iget-object v1, v1, La/Z6;->d:La/i7;

    iput-boolean v0, v1, La/e7;->H:Z

    iget-object v2, v1, La/e7;->N:La/k7;

    iput-boolean v0, v2, La/k7;->i:Z

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, La/e7;->u(I)V

    iget-object v0, p0, La/X6;->mFragmentLifecycleRegistry:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/e$a;->ON_STOP:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    return-void
.end method

.method public setEnterSharedElementCallback(La/ae;)V
    .locals 0

    const/4 p1, 0x0

    invoke-static {p0, p1}, La/S;->c(Landroid/app/Activity;Landroid/app/SharedElementCallback;)V

    return-void
.end method

.method public setExitSharedElementCallback(La/ae;)V
    .locals 0

    const/4 p1, 0x0

    invoke-static {p0, p1}, La/S;->d(Landroid/app/Activity;Landroid/app/SharedElementCallback;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/b;Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, p1, p2, p3, v0}, La/X6;->startActivityFromFragment(Landroidx/fragment/app/b;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/b;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 3

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 1
    invoke-virtual {p0, p2, v0, p4}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 2
    :cond_0
    iget-object v1, p1, Landroidx/fragment/app/b;->u:La/X6$a;

    if-eqz v1, :cond_4

    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v1

    .line 4
    iget-object v2, v1, La/e7;->B:La/d0;

    if-eqz v2, :cond_2

    .line 5
    new-instance v0, La/e7$g;

    iget-object p1, p1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-direct {v0, p1, p3}, La/e7$g;-><init>(Ljava/lang/String;I)V

    .line 6
    iget-object p1, v1, La/e7;->E:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    .line 7
    const-string p1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {p2, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 8
    :cond_1
    iget-object p1, v1, La/e7;->B:La/d0;

    .line 9
    invoke-virtual {p1, p2}, La/d0;->a(Ljava/lang/Object;)V

    return-void

    .line 10
    :cond_2
    iget-object p1, v1, La/e7;->v:La/X6$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    const-string v1, "intent"

    invoke-static {p2, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p3, v0, :cond_3

    .line 12
    iget-object p1, p1, La/Z6;->b:La/X6;

    invoke-virtual {p1, p2, p4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    .line 13
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting activity with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Fragment "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not attached to Activity"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public startIntentSenderFromFragment(Landroidx/fragment/app/b;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 12
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v8, -0x1

    if-ne p3, v8, :cond_0

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, Landroidx/activity/ComponentActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    :cond_0
    move-object/from16 v3, p4

    move-object/from16 v7, p8

    iget-object v0, p1, Landroidx/fragment/app/b;->u:La/X6$a;

    const-string v4, "Fragment "

    if-eqz v0, :cond_9

    const/4 v0, 0x2

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v5

    const-string v6, "FragmentManager"

    if-eqz v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " received the following in startIntentSenderForResult() requestCode: "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " IntentSender: "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " fillInIntent: "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " options: "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/b;->f()La/e7;

    move-result-object v5

    iget-object v9, v5, La/e7;->C:La/d0;

    if-eqz v9, :cond_6

    if-eqz v7, :cond_4

    if-nez v3, :cond_2

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const-string v8, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    const/4 v9, 0x1

    invoke-virtual {v3, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_2
    invoke-static {v0}, La/e7;->J(I)Z

    move-result v8

    if-eqz v8, :cond_3

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "ActivityOptions "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " were added to fillInIntent "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " for fragment "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    const-string v8, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {v3, v8, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_4
    const-string v7, "intentSender"

    invoke-static {p2, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, La/g9;

    move/from16 v9, p5

    move/from16 v10, p6

    invoke-direct {v7, p2, v3, v9, v10}, La/g9;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    new-instance p2, La/e7$g;

    iget-object v1, p1, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-direct {p2, v1, p3}, La/e7$g;-><init>(Ljava/lang/String;I)V

    iget-object p3, v5, La/e7;->E:Ljava/util/ArrayDeque;

    invoke-virtual {p3, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    invoke-static {v0}, La/e7;->J(I)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "is launching an IntentSender for result "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    iget-object p1, v5, La/e7;->C:La/d0;

    invoke-virtual {p1, v7}, La/d0;->a(Ljava/lang/Object;)V

    return-void

    :cond_6
    move/from16 v9, p5

    move/from16 v10, p6

    iget-object p1, v5, La/e7;->v:La/X6$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "intent"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "Starting intent sender with a requestCode requires a FragmentActivity host"

    if-ne p3, v8, :cond_8

    iget-object v0, p1, La/Z6;->a:La/X6;

    if-eqz v0, :cond_7

    move-object v1, p2

    move v2, p3

    move/from16 v6, p7

    move v4, v9

    move v5, v10

    invoke-virtual/range {v0 .. v7}, Landroidx/activity/ComponentActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not attached to Activity"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public supportFinishAfterTransition()V
    .locals 0

    invoke-static {p0}, La/S;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->invalidateMenu()V

    return-void
.end method

.method public supportPostponeEnterTransition()V
    .locals 0

    invoke-static {p0}, La/S;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public supportStartPostponedEnterTransition()V
    .locals 0

    invoke-static {p0}, La/S;->e(Landroid/app/Activity;)V

    return-void
.end method

.method public final validateRequestPermissionsRequestCode(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
