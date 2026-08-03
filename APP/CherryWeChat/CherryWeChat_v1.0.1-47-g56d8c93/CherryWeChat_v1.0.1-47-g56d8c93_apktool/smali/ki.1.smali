.class public abstract Lki;
.super LTa;
.source ""

# interfaces
.implements LN0;


# instance fields
.field public final u:LD2;

.field public final v:Lao;

.field public w:Z

.field public x:Z

.field public y:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, LTa;-><init>()V

    new-instance v0, Lji;

    move-object v1, p0

    check-cast v1, Lc3;

    invoke-direct {v0, v1}, Lji;-><init>(Lc3;)V

    new-instance v2, LD2;

    const/16 v3, 0x17

    invoke-direct {v2, v3, v0}, LD2;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Lki;->u:LD2;

    new-instance v0, Lao;

    invoke-direct {v0, p0}, Lao;-><init>(LYn;)V

    iput-object v0, p0, Lki;->v:Lao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lki;->y:Z

    invoke-virtual {p0}, LTa;->getSavedStateRegistry()Lhx;

    move-result-object v0

    new-instance v2, LIa;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, LIa;-><init>(ILjava/lang/Object;)V

    const-string v3, "android:support:lifecycle"

    invoke-virtual {v0, v3, v2}, Lhx;->c(Ljava/lang/String;Lgx;)V

    new-instance v0, Lii;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lii;-><init>(Lc3;I)V

    invoke-virtual {p0, v0}, LTa;->addOnConfigurationChangedListener(Lub;)V

    new-instance v0, Lii;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lii;-><init>(Lc3;I)V

    invoke-virtual {p0, v0}, LTa;->addOnNewIntentListener(Lub;)V

    new-instance v0, LJa;

    invoke-direct {v0, v1, v2}, LJa;-><init>(Lki;I)V

    invoke-virtual {p0, v0}, LTa;->addOnContextAvailableListener(Lpt;)V

    return-void
.end method

.method public static a(Lzi;)Z
    .locals 7

    iget-object p0, p0, Lzi;->c:Lqs;

    invoke-virtual {p0}, Lqs;->t()Ljava/util/List;

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

    check-cast v1, Lhi;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Lhi;->s:Lji;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    iget-object v2, v2, Lji;->p:Lc3;

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lhi;->c()Lzi;

    move-result-object v2

    invoke-static {v2}, Lki;->a(Lzi;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_3
    iget-object v2, v1, Lhi;->N:LLi;

    const-string v3, "setCurrentState"

    sget-object v4, LPn;->c:LPn;

    const/4 v5, 0x1

    sget-object v6, LPn;->d:LPn;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, LLi;->b()V

    iget-object v2, v2, LLi;->d:Lao;

    iget-object v2, v2, Lao;->c:LPn;

    invoke-virtual {v2, v6}, LPn;->a(LPn;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v1, Lhi;->N:LLi;

    iget-object v0, v0, LLi;->d:Lao;

    invoke-virtual {v0, v3}, Lao;->d(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lao;->f(LPn;)V

    move v0, v5

    :cond_4
    iget-object v2, v1, Lhi;->M:Lao;

    iget-object v2, v2, Lao;->c:LPn;

    invoke-virtual {v2, v6}, LPn;->a(LPn;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v1, Lhi;->M:Lao;

    invoke-virtual {v0, v3}, Lao;->d(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lao;->f(LPn;)V

    move v0, v5

    goto :goto_0

    :cond_5
    return v0
.end method


# virtual methods
.method public final dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lki;->u:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v0, v0, Lji;->o:LAi;

    iget-object v0, v0, Lzi;->f:Lni;

    invoke-virtual {v0, p1, p2, p3, p4}, Lni;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 9

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p0, p4}, LSa;->shouldDumpInternalState([Ljava/lang/String;)Z

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

    iget-boolean v1, p0, Lki;->w:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lki;->x:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lki;->y:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {p0}, LyE;->getViewModelStore()LxE;

    move-result-object v1

    sget-object v2, Ljc;->b:Ljc;

    const-class v3, LQo;

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v1, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LuE;

    invoke-virtual {v3, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    sget-object v8, LQo;->e:LCi;

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    new-instance v5, Lts;

    invoke-direct {v5, v2}, Lts;-><init>(Llc;)V

    sget-object v2, Lgf;->n:Lgf;

    invoke-virtual {v5, v2, v4}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :try_start_0
    invoke-interface {v8, v3, v5}, LwE;->b(Ljava/lang/Class;Lts;)LuE;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v5, v2

    goto :goto_1

    :catch_0
    invoke-interface {v8, v3}, LwE;->a(Ljava/lang/Class;)LuE;

    move-result-object v2

    goto :goto_0

    :goto_1
    iget-object v1, v1, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LuE;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LuE;->b()V

    :cond_2
    :goto_2
    check-cast v5, LQo;

    iget-object v1, v5, LQo;->d:LKy;

    iget v2, v1, LKy;->c:I

    if-lez v2, :cond_6

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "Loaders:"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget v2, v1, LKy;->c:I

    if-gtz v2, :cond_3

    goto :goto_3

    :cond_3
    iget-object p1, v1, LKy;->b:[Ljava/lang/Object;

    const/4 p2, 0x0

    aget-object p1, p1, p2

    if-nez p1, :cond_4

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p1, v1, LKy;->a:[I

    aget p1, p1, p2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, ": "

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    throw v7

    :cond_4
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_3
    iget-object v0, p0, Lki;->u:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v0, v0, Lji;->o:LAi;

    invoke-virtual {v0, p1, p2, p3, p4}, Lzi;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public getSupportFragmentManager()Lzi;
    .locals 1

    iget-object v0, p0, Lki;->u:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v0, v0, Lji;->o:LAi;

    return-object v0
.end method

.method public getSupportLoaderManager()LPo;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LRo;

    invoke-interface {p0}, LyE;->getViewModelStore()LxE;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LRo;-><init>(LYn;LxE;)V

    return-object v0
.end method

.method public markFragmentsCreated()V
    .locals 1

    :cond_0
    invoke-virtual {p0}, Lki;->getSupportFragmentManager()Lzi;

    move-result-object v0

    invoke-static {v0}, Lki;->a(Lzi;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lki;->u:LD2;

    invoke-virtual {v0}, LD2;->w()V

    invoke-super {p0, p1, p2, p3}, LTa;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onAttachFragment(Lhi;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, LTa;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lki;->v:Lao;

    sget-object v0, LOn;->ON_CREATE:LOn;

    invoke-virtual {p1, v0}, Lao;->e(LOn;)V

    iget-object p1, p0, Lki;->u:LD2;

    iget-object p1, p1, LD2;->b:Ljava/lang/Object;

    check-cast p1, Lji;

    iget-object p1, p1, Lji;->o:LAi;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lzi;->F:Z

    iput-boolean v0, p1, Lzi;->G:Z

    iget-object v1, p1, Lzi;->M:LDi;

    iput-boolean v0, v1, LDi;->i:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lzi;->t(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lki;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

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
    invoke-virtual {p0, v0, p1, p2, p3}, Lki;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

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

    iget-object v0, p0, Lki;->u:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v0, v0, Lji;->o:LAi;

    invoke-virtual {v0}, Lzi;->k()V

    iget-object v0, p0, Lki;->v:Lao;

    sget-object v1, LOn;->ON_DESTROY:LOn;

    invoke-virtual {v0, v1}, Lao;->e(LOn;)V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1, p2}, LTa;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p2, 0x6

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lki;->u:LD2;

    iget-object p1, p1, LD2;->b:Ljava/lang/Object;

    check-cast p1, Lji;

    iget-object p1, p1, Lji;->o:LAi;

    invoke-virtual {p1}, Lzi;->i()Z

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

    iput-boolean v0, p0, Lki;->x:Z

    iget-object v0, p0, Lki;->u:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v0, v0, Lji;->o:LAi;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lzi;->t(I)V

    iget-object v0, p0, Lki;->v:Lao;

    sget-object v1, LOn;->ON_PAUSE:LOn;

    invoke-virtual {v0, v1}, Lao;->e(LOn;)V

    return-void
.end method

.method public onPostResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, Lki;->onResumeFragments()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Lki;->u:LD2;

    invoke-virtual {v0}, LD2;->w()V

    invoke-super {p0, p1, p2, p3}, LTa;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Lki;->u:LD2;

    invoke-virtual {v0}, LD2;->w()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lki;->x:Z

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v0, v0, Lji;->o:LAi;

    invoke-virtual {v0, v1}, Lzi;->y(Z)Z

    return-void
.end method

.method public onResumeFragments()V
    .locals 3

    iget-object v0, p0, Lki;->v:Lao;

    sget-object v1, LOn;->ON_RESUME:LOn;

    invoke-virtual {v0, v1}, Lao;->e(LOn;)V

    iget-object v0, p0, Lki;->u:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v0, v0, Lji;->o:LAi;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lzi;->F:Z

    iput-boolean v1, v0, Lzi;->G:Z

    iget-object v2, v0, Lzi;->M:LDi;

    iput-boolean v1, v2, LDi;->i:Z

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lzi;->t(I)V

    return-void
.end method

.method public onStart()V
    .locals 5

    iget-object v0, p0, Lki;->u:LD2;

    invoke-virtual {v0}, LD2;->w()V

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lki;->y:Z

    iget-boolean v2, p0, Lki;->w:Z

    const/4 v3, 0x1

    if-nez v2, :cond_0

    iput-boolean v3, p0, Lki;->w:Z

    iget-object v2, v0, Lji;->o:LAi;

    iput-boolean v1, v2, Lzi;->F:Z

    iput-boolean v1, v2, Lzi;->G:Z

    iget-object v4, v2, Lzi;->M:LDi;

    iput-boolean v1, v4, LDi;->i:Z

    const/4 v4, 0x4

    invoke-virtual {v2, v4}, Lzi;->t(I)V

    :cond_0
    iget-object v2, v0, Lji;->o:LAi;

    invoke-virtual {v2, v3}, Lzi;->y(Z)Z

    iget-object v2, p0, Lki;->v:Lao;

    sget-object v3, LOn;->ON_START:LOn;

    invoke-virtual {v2, v3}, Lao;->e(LOn;)V

    iget-object v0, v0, Lji;->o:LAi;

    iput-boolean v1, v0, Lzi;->F:Z

    iput-boolean v1, v0, Lzi;->G:Z

    iget-object v2, v0, Lzi;->M:LDi;

    iput-boolean v1, v2, LDi;->i:Z

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lzi;->t(I)V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Lki;->u:LD2;

    invoke-virtual {v0}, LD2;->w()V

    return-void
.end method

.method public onStop()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lki;->y:Z

    invoke-virtual {p0}, Lki;->markFragmentsCreated()V

    iget-object v1, p0, Lki;->u:LD2;

    iget-object v1, v1, LD2;->b:Ljava/lang/Object;

    check-cast v1, Lji;

    iget-object v1, v1, Lji;->o:LAi;

    iput-boolean v0, v1, Lzi;->G:Z

    iget-object v2, v1, Lzi;->M:LDi;

    iput-boolean v0, v2, LDi;->i:Z

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Lzi;->t(I)V

    iget-object v0, p0, Lki;->v:Lao;

    sget-object v1, LOn;->ON_STOP:LOn;

    invoke-virtual {v0, v1}, Lao;->e(LOn;)V

    return-void
.end method

.method public setEnterSharedElementCallback(Ley;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setEnterSharedElementCallback(Landroid/app/SharedElementCallback;)V

    return-void
.end method

.method public setExitSharedElementCallback(Ley;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setExitSharedElementCallback(Landroid/app/SharedElementCallback;)V

    return-void
.end method

.method public startActivityFromFragment(Lhi;Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p1, p2, p3, v0}, Lki;->startActivityFromFragment(Lhi;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityFromFragment(Lhi;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 3

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 1
    invoke-virtual {p0, p2, v0, p4}, LTa;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 2
    :cond_0
    iget-object v1, p1, Lhi;->s:Lji;

    if-eqz v1, :cond_4

    .line 3
    invoke-virtual {p1}, Lhi;->f()Lzi;

    move-result-object v1

    .line 4
    iget-object v2, v1, Lzi;->A:Lb1;

    if-eqz v2, :cond_2

    .line 5
    new-instance v0, Lwi;

    iget-object p1, p1, Lhi;->e:Ljava/lang/String;

    invoke-direct {v0, p1, p3}, Lwi;-><init>(Ljava/lang/String;I)V

    .line 6
    iget-object p1, v1, Lzi;->D:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    .line 7
    const-string p1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {p2, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 8
    :cond_1
    iget-object p1, v1, Lzi;->A:Lb1;

    .line 9
    invoke-virtual {p1, p2}, Lb1;->a(Ljava/lang/Object;)V

    return-void

    .line 10
    :cond_2
    iget-object p1, v1, Lzi;->u:Lji;

    if-ne p3, v0, :cond_3

    .line 11
    iget-object p1, p1, Lji;->m:Lc3;

    .line 12
    invoke-virtual {p1, p2, p4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    .line 13
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting activity with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
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

.method public startIntentSenderFromFragment(Lhi;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v8, -0x1

    if-ne p3, v8, :cond_0

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, LTa;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    :cond_0
    move-object/from16 v7, p8

    iget-object v0, p1, Lhi;->s:Lji;

    if-eqz v0, :cond_8

    const/4 v0, 0x2

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lhi;->toString()Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    invoke-virtual {p1}, Lhi;->f()Lzi;

    move-result-object v3

    iget-object v4, v3, Lzi;->B:Lb1;

    if-eqz v4, :cond_6

    if-eqz v7, :cond_4

    if-nez p4, :cond_2

    new-instance p4, Landroid/content/Intent;

    invoke-direct {p4}, Landroid/content/Intent;-><init>()V

    const-string v4, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    const/4 v5, 0x1

    invoke-virtual {p4, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_2
    invoke-static {v0}, Lzi;->G(I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_3
    const-string v4, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {p4, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_4
    new-instance v4, LIl;

    invoke-direct {v4, p2, p4, p5, p6}, LIl;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    new-instance p2, Lwi;

    iget-object p4, p1, Lhi;->e:Ljava/lang/String;

    invoke-direct {p2, p4, p3}, Lwi;-><init>(Ljava/lang/String;I)V

    iget-object p3, v3, Lzi;->D:Ljava/util/ArrayDeque;

    invoke-virtual {p3, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    invoke-static {v0}, Lzi;->G(I)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lhi;->toString()Ljava/lang/String;

    :cond_5
    iget-object p1, v3, Lzi;->B:Lb1;

    invoke-virtual {p1, v4}, Lb1;->a(Ljava/lang/Object;)V

    return-void

    :cond_6
    iget-object p1, v3, Lzi;->u:Lji;

    if-ne p3, v8, :cond_7

    iget-object v0, p1, Lji;->l:Lc3;

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v7}, LTa;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting intent sender with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
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

.method public supportFinishAfterTransition()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finishAfterTransition()V

    return-void
.end method

.method public supportPostponeEnterTransition()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->postponeEnterTransition()V

    return-void
.end method

.method public supportStartPostponedEnterTransition()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->startPostponedEnterTransition()V

    return-void
.end method

.method public final validateRequestPermissionsRequestCode(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
