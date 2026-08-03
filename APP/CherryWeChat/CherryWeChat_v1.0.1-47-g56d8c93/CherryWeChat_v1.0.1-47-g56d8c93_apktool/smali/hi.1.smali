.class public abstract Lhi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements LYn;
.implements LyE;
.implements Lqk;
.implements Lix;


# static fields
.field public static final S:Ljava/lang/Object;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Landroid/view/ViewGroup;

.field public E:Landroid/view/View;

.field public F:Z

.field public G:Z

.field public H:Lfi;

.field public I:Z

.field public J:Z

.field public K:Ljava/lang/String;

.field public L:LPn;

.field public M:Lao;

.field public N:LLi;

.field public final O:Lus;

.field public P:Lwy;

.field public final Q:Ljava/util/ArrayList;

.field public final R:Ldi;

.field public a:I

.field public b:Landroid/os/Bundle;

.field public c:Landroid/util/SparseArray;

.field public d:Landroid/os/Bundle;

.field public e:Ljava/lang/String;

.field public f:Landroid/os/Bundle;

.field public g:Lhi;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Ljava/lang/Boolean;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:I

.field public r:Lzi;

.field public s:Lji;

.field public t:LAi;

.field public u:Lhi;

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhi;->S:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lhi;->a:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lhi;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lhi;->h:Ljava/lang/String;

    iput-object v0, p0, Lhi;->j:Ljava/lang/Boolean;

    new-instance v0, LAi;

    invoke-direct {v0}, Lzi;-><init>()V

    iput-object v0, p0, Lhi;->t:LAi;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->B:Z

    iput-boolean v0, p0, Lhi;->G:Z

    new-instance v0, LK0;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0}, LK0;-><init>(ILjava/lang/Object;)V

    sget-object v0, LPn;->e:LPn;

    iput-object v0, p0, Lhi;->L:LPn;

    new-instance v0, Lus;

    invoke-direct {v0}, Lus;-><init>()V

    iput-object v0, p0, Lhi;->O:Lus;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhi;->Q:Ljava/util/ArrayList;

    new-instance v0, Ldi;

    invoke-direct {v0, p0}, Ldi;-><init>(Lhi;)V

    iput-object v0, p0, Lhi;->R:Ldi;

    invoke-virtual {p0}, Lhi;->g()V

    return-void
.end method


# virtual methods
.method public final A(IIII)V
    .locals 1

    iget-object v0, p0, Lhi;->H:Lfi;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lhi;->b()Lfi;

    move-result-object v0

    iput p1, v0, Lfi;->b:I

    invoke-virtual {p0}, Lhi;->b()Lfi;

    move-result-object p1

    iput p2, p1, Lfi;->c:I

    invoke-virtual {p0}, Lhi;->b()Lfi;

    move-result-object p1

    iput p3, p1, Lfi;->d:I

    invoke-virtual {p0}, Lhi;->b()Lfi;

    move-result-object p1

    iput p4, p1, Lfi;->e:I

    return-void
.end method

.method public final B(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lhi;->r:Lzi;

    if-eqz v0, :cond_2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lzi;->L()Z

    move-result v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iput-object p1, p0, Lhi;->f:Landroid/os/Bundle;

    return-void
.end method

.method public a()LTB;
    .locals 1

    new-instance v0, Lei;

    invoke-direct {v0, p0}, Lei;-><init>(Lhi;)V

    return-object v0
.end method

.method public final b()Lfi;
    .locals 2

    iget-object v0, p0, Lhi;->H:Lfi;

    if-nez v0, :cond_0

    new-instance v0, Lfi;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lhi;->S:Ljava/lang/Object;

    iput-object v1, v0, Lfi;->g:Ljava/lang/Object;

    iput-object v1, v0, Lfi;->h:Ljava/lang/Object;

    iput-object v1, v0, Lfi;->i:Ljava/lang/Object;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lfi;->j:F

    const/4 v1, 0x0

    iput-object v1, v0, Lfi;->k:Landroid/view/View;

    iput-object v0, p0, Lhi;->H:Lfi;

    :cond_0
    iget-object v0, p0, Lhi;->H:Lfi;

    return-object v0
.end method

.method public final c()Lzi;
    .locals 3

    iget-object v0, p0, Lhi;->s:Lji;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhi;->t:LAi;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has not been attached yet."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lhi;->s:Lji;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lji;->m:Lc3;

    return-object v0
.end method

.method public final e()I
    .locals 2

    iget-object v0, p0, Lhi;->L:LPn;

    sget-object v1, LPn;->b:LPn;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lhi;->u:Lhi;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Lhi;->u:Lhi;

    invoke-virtual {v1}, Lhi;->e()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public final f()Lzi;
    .locals 3

    iget-object v0, p0, Lhi;->r:Lzi;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not associated with a fragment manager."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()V
    .locals 3

    new-instance v0, Lao;

    invoke-direct {v0, p0}, Lao;-><init>(LYn;)V

    iput-object v0, p0, Lhi;->M:Lao;

    new-instance v0, Lwy;

    invoke-direct {v0, p0}, Lwy;-><init>(Lix;)V

    iput-object v0, p0, Lhi;->P:Lwy;

    iget-object v0, p0, Lhi;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Lhi;->R:Ldi;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget v2, p0, Lhi;->a:I

    if-ltz v2, :cond_1

    iget-object v0, v1, Ldi;->a:Lhi;

    iget-object v1, v0, Lhi;->P:Lwy;

    invoke-virtual {v1}, Lwy;->c()V

    invoke-static {v0}, LOj;->o(Lix;)V

    iget-object v1, v0, Lhi;->b:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    const-string v2, "registryState"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v0, v0, Lhi;->P:Lwy;

    invoke-virtual {v0, v1}, Lwy;->d(Landroid/os/Bundle;)V

    return-void

    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final getDefaultViewModelCreationExtras()Llc;
    .locals 3

    invoke-virtual {p0}, Lhi;->y()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const/4 v1, 0x3

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lhi;->y()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    new-instance v1, Lts;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lts;-><init>(I)V

    if-eqz v0, :cond_3

    sget-object v2, Lgf;->m:Lgf;

    invoke-virtual {v1, v2, v0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :cond_3
    sget-object v0, LOj;->h:Lhw;

    invoke-virtual {v1, v0, p0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    sget-object v0, LOj;->i:Lhw;

    invoke-virtual {v1, v0, p0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    iget-object v0, p0, Lhi;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    sget-object v2, LOj;->j:Lhw;

    invoke-virtual {v1, v2, v0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :cond_4
    return-object v1
.end method

.method public final getLifecycle()LRn;
    .locals 1

    iget-object v0, p0, Lhi;->M:Lao;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lhx;
    .locals 1

    iget-object v0, p0, Lhi;->P:Lwy;

    iget-object v0, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Lhx;

    return-object v0
.end method

.method public final getViewModelStore()LxE;
    .locals 3

    iget-object v0, p0, Lhi;->r:Lzi;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lhi;->e()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lhi;->r:Lzi;

    iget-object v0, v0, Lzi;->M:LDi;

    iget-object v0, v0, LDi;->f:Ljava/util/HashMap;

    iget-object v1, p0, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LxE;

    if-nez v1, :cond_0

    new-instance v1, LxE;

    invoke-direct {v1}, LxE;-><init>()V

    iget-object v2, p0, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()V
    .locals 3

    invoke-virtual {p0}, Lhi;->g()V

    iget-object v0, p0, Lhi;->e:Ljava/lang/String;

    iput-object v0, p0, Lhi;->K:Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lhi;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhi;->k:Z

    iput-boolean v0, p0, Lhi;->l:Z

    iput-boolean v0, p0, Lhi;->m:Z

    iput-boolean v0, p0, Lhi;->n:Z

    iput-boolean v0, p0, Lhi;->o:Z

    iput v0, p0, Lhi;->q:I

    const/4 v1, 0x0

    iput-object v1, p0, Lhi;->r:Lzi;

    new-instance v2, LAi;

    invoke-direct {v2}, Lzi;-><init>()V

    iput-object v2, p0, Lhi;->t:LAi;

    iput-object v1, p0, Lhi;->s:Lji;

    iput v0, p0, Lhi;->v:I

    iput v0, p0, Lhi;->w:I

    iput-object v1, p0, Lhi;->x:Ljava/lang/String;

    iput-boolean v0, p0, Lhi;->y:Z

    iput-boolean v0, p0, Lhi;->z:Z

    return-void
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lhi;->s:Lji;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lhi;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()Z
    .locals 3

    iget-boolean v0, p0, Lhi;->y:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lhi;->r:Lzi;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lhi;->u:Lhi;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lhi;->j()Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    return v1

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final k()Z
    .locals 1

    iget v0, p0, Lhi;->q:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    return-void
.end method

.method public m(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhi;->C:Z

    iget-object v0, p0, Lhi;->s:Lji;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lji;->l:Lc3;

    :goto_0
    if-eqz v0, :cond_1

    iput-boolean p1, p0, Lhi;->C:Z

    :cond_1
    return-void
.end method

.method public n(Landroid/os/Bundle;)V
    .locals 3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhi;->C:Z

    iget-object v0, p0, Lhi;->b:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "childFragmentManager"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lhi;->t:LAi;

    invoke-virtual {v2, v0}, Lzi;->T(Landroid/os/Bundle;)V

    iget-object v0, p0, Lhi;->t:LAi;

    iput-boolean v1, v0, Lzi;->F:Z

    iput-boolean v1, v0, Lzi;->G:Z

    iget-object v2, v0, Lzi;->M:LDi;

    iput-boolean v1, v2, LDi;->i:Z

    invoke-virtual {v0, p1}, Lzi;->t(I)V

    :cond_0
    iget-object v0, p0, Lhi;->t:LAi;

    iget v2, v0, Lzi;->t:I

    if-lt v2, p1, :cond_1

    return-void

    :cond_1
    iput-boolean v1, v0, Lzi;->F:Z

    iput-boolean v1, v0, Lzi;->G:Z

    iget-object v2, v0, Lzi;->M:LDi;

    iput-boolean v1, v2, LDi;->i:Z

    invoke-virtual {v0, p1}, Lzi;->t(I)V

    return-void
.end method

.method public o(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhi;->C:Z

    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    iget-object v0, p0, Lhi;->s:Lji;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lji;->l:Lc3;

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " not attached to an activity."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    return-void
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    return-void
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    return-void
.end method

.method public r(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    iget-object p1, p0, Lhi;->s:Lji;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lji;->p:Lc3;

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Lhi;->t:LAi;

    iget-object v0, v0, Lzi;->f:Lni;

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    return-void
.end method

.method public t(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhi;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhi;->v:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhi;->v:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lhi;->x:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhi;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    return-void
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    return-void
.end method

.method public w(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhi;->C:Z

    return-void
.end method

.method public x(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 3

    iget-object p3, p0, Lhi;->t:LAi;

    invoke-virtual {p3}, Lzi;->N()V

    const/4 p3, 0x1

    iput-boolean p3, p0, Lhi;->p:Z

    new-instance p3, LLi;

    invoke-virtual {p0}, Lhi;->getViewModelStore()LxE;

    move-result-object v0

    new-instance v1, LN2;

    const/16 v2, 0xd

    invoke-direct {v1, v2, p0}, LN2;-><init>(ILjava/lang/Object;)V

    invoke-direct {p3, p0, v0, v1}, LLi;-><init>(Lhi;LxE;LN2;)V

    iput-object p3, p0, Lhi;->N:LLi;

    invoke-virtual {p0, p1, p2}, Lhi;->o(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lhi;->E:Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lhi;->N:LLi;

    invoke-virtual {p1}, LLi;->b()V

    const/4 p1, 0x3

    invoke-static {p1}, Lzi;->G(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhi;->E:Landroid/view/View;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lhi;->toString()Ljava/lang/String;

    :cond_0
    iget-object p1, p0, Lhi;->E:Landroid/view/View;

    iget-object p2, p0, Lhi;->N:LLi;

    const p3, 0x550a025f

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lhi;->E:Landroid/view/View;

    iget-object p2, p0, Lhi;->N:LLi;

    const p3, 0x550a0262

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lhi;->E:Landroid/view/View;

    iget-object p2, p0, Lhi;->N:LLi;

    const p3, 0x550a0261

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lhi;->O:Lus;

    iget-object p2, p0, Lhi;->N:LLi;

    invoke-virtual {p1, p2}, Lus;->d(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Lhi;->N:LLi;

    iget-object p1, p1, LLi;->d:Lao;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lhi;->N:LLi;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Lhi;->d()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to a context."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final z()Landroid/view/View;
    .locals 3

    iget-object v0, p0, Lhi;->E:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
