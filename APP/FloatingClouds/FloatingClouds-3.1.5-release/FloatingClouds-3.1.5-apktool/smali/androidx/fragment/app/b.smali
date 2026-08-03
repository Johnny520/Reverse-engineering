.class public Landroidx/fragment/app/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements La/y9;
.implements La/Gg;
.implements Landroidx/lifecycle/c;
.implements La/Ld;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/b$f;,
        Landroidx/fragment/app/b$e;,
        Landroidx/fragment/app/b$d;
    }
.end annotation


# static fields
.field public static final U:Ljava/lang/Object;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public final D:Z

.field public E:Z

.field public F:Landroid/view/ViewGroup;

.field public G:Landroid/view/View;

.field public H:Z

.field public I:Z

.field public J:Landroidx/fragment/app/b$d;

.field public K:Z

.field public L:Z

.field public M:Ljava/lang/String;

.field public N:Landroidx/lifecycle/e$b;

.field public O:Landroidx/lifecycle/h;

.field public P:La/q7;

.field public final Q:La/Bb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/Bb<",
            "La/y9;",
            ">;"
        }
    .end annotation
.end field

.field public R:La/Kd;

.field public final S:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/b$f;",
            ">;"
        }
    .end annotation
.end field

.field public final T:Landroidx/fragment/app/b$b;

.field public a:I

.field public b:Landroid/os/Bundle;

.field public c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/os/Bundle;

.field public e:Ljava/lang/String;

.field public f:Landroid/os/Bundle;

.field public g:Landroidx/fragment/app/b;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Ljava/lang/Boolean;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:I

.field public t:La/e7;

.field public u:La/X6$a;

.field public v:La/i7;

.field public w:Landroidx/fragment/app/b;

.field public x:I

.field public y:I

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/b;->U:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/b;->a:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/b;->h:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/b;->j:Ljava/lang/Boolean;

    new-instance v0, La/i7;

    invoke-direct {v0}, La/e7;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/b;->D:Z

    iput-boolean v0, p0, Landroidx/fragment/app/b;->I:Z

    new-instance v0, Landroidx/fragment/app/b$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/b$a;-><init>(Landroidx/fragment/app/b;)V

    sget-object v0, Landroidx/lifecycle/e$b;->e:Landroidx/lifecycle/e$b;

    iput-object v0, p0, Landroidx/fragment/app/b;->N:Landroidx/lifecycle/e$b;

    new-instance v0, La/Bb;

    invoke-direct {v0}, La/Bb;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/b;->Q:La/Bb;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/b;->S:Ljava/util/ArrayList;

    new-instance v0, Landroidx/fragment/app/b$b;

    invoke-direct {v0, p0}, Landroidx/fragment/app/b$b;-><init>(Landroidx/fragment/app/b;)V

    iput-object v0, p0, Landroidx/fragment/app/b;->T:Landroidx/fragment/app/b$b;

    invoke-virtual {p0}, Landroidx/fragment/app/b;->g()V

    return-void
.end method


# virtual methods
.method public final A()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/b;->d()Landroid/content/Context;

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

.method public final B()Landroid/view/View;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b;->G:Landroid/view/View;

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

.method public final C()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const-string v1, "childFragmentManager"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v1, v0}, La/e7;->V(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/b;->v:La/i7;

    const/4 v1, 0x0

    iput-boolean v1, v0, La/e7;->G:Z

    iput-boolean v1, v0, La/e7;->H:Z

    iget-object v2, v0, La/e7;->N:La/k7;

    iput-boolean v1, v2, La/k7;->i:Z

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, La/e7;->u(I)V

    :cond_0
    return-void
.end method

.method public final D(IIII)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/b$d;->b:I

    invoke-virtual {p0}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object p1

    iput p2, p1, Landroidx/fragment/app/b$d;->c:I

    invoke-virtual {p0}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object p1

    iput p3, p1, Landroidx/fragment/app/b$d;->d:I

    invoke-virtual {p0}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object p1

    iput p4, p1, Landroidx/fragment/app/b$d;->e:I

    return-void
.end method

.method public final E(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/b;->t:La/e7;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, La/e7;->G:Z

    if-nez v1, :cond_0

    iget-boolean v0, v0, La/e7;->H:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/b;->f:Landroid/os/Bundle;

    return-void
.end method

.method public a()La/a2;
    .locals 1

    new-instance v0, Landroidx/fragment/app/b$c;

    invoke-direct {v0, p0}, Landroidx/fragment/app/b$c;-><init>(Landroidx/fragment/app/b;)V

    return-object v0
.end method

.method public final b()Landroidx/fragment/app/b$d;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/fragment/app/b$d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Landroidx/fragment/app/b;->U:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/b$d;->g:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/b$d;->h:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/b$d;->i:Ljava/lang/Object;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Landroidx/fragment/app/b$d;->j:F

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/b$d;->k:Landroid/view/View;

    iput-object v0, p0, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    return-object v0
.end method

.method public final c()La/e7;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b;->u:La/X6$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/b;->v:La/i7;

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

    iget-object v0, p0, Landroidx/fragment/app/b;->u:La/X6$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, La/Z6;->b:La/X6;

    return-object v0
.end method

.method public final e()I
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/b;->N:Landroidx/lifecycle/e$b;

    sget-object v1, Landroidx/lifecycle/e$b;->b:Landroidx/lifecycle/e$b;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    invoke-virtual {v1}, Landroidx/fragment/app/b;->e()I

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

.method public final f()La/e7;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b;->t:La/e7;

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

    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h;-><init>(La/y9;)V

    iput-object v0, p0, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    new-instance v0, La/Kd;

    invoke-direct {v0, p0}, La/Kd;-><init>(La/Ld;)V

    iput-object v0, p0, Landroidx/fragment/app/b;->R:La/Kd;

    iget-object v0, p0, Landroidx/fragment/app/b;->S:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/b;->T:Landroidx/fragment/app/b$b;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget v2, p0, Landroidx/fragment/app/b;->a:I

    if-ltz v2, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/b$b;->a()V

    return-void

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final getDefaultViewModelCreationExtras()La/A4;
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/b;->A()Landroid/content/Context;

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

    invoke-static {v1}, La/e7;->J(I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not find Application instance from Context "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/b;->A()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance v1, La/Ab;

    invoke-direct {v1}, La/Ab;-><init>()V

    iget-object v2, v1, La/A4;->a:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_3

    sget-object v3, Landroidx/lifecycle/p;->a:Landroidx/lifecycle/p;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v0, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n$b;

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n$c;

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/fragment/app/b;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    sget-object v3, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n$a;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1
.end method

.method public final getLifecycle()Landroidx/lifecycle/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/b;->O:Landroidx/lifecycle/h;

    return-object v0
.end method

.method public final getSavedStateRegistry()Landroidx/savedstate/a;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/b;->R:La/Kd;

    iget-object v0, v0, La/Kd;->b:Landroidx/savedstate/a;

    return-object v0
.end method

.method public final getViewModelStore()La/Fg;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b;->t:La/e7;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/b;->e()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/b;->t:La/e7;

    iget-object v0, v0, La/e7;->N:La/k7;

    iget-object v0, v0, La/k7;->f:Ljava/util/HashMap;

    iget-object v1, p0, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/Fg;

    if-nez v1, :cond_0

    new-instance v1, La/Fg;

    invoke-direct {v1}, La/Fg;-><init>()V

    iget-object v2, p0, Landroidx/fragment/app/b;->e:Ljava/lang/String;

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

    invoke-virtual {p0}, Landroidx/fragment/app/b;->g()V

    iget-object v0, p0, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/b;->M:Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/b;->k:Z

    iput-boolean v0, p0, Landroidx/fragment/app/b;->l:Z

    iput-boolean v0, p0, Landroidx/fragment/app/b;->n:Z

    iput-boolean v0, p0, Landroidx/fragment/app/b;->o:Z

    iput-boolean v0, p0, Landroidx/fragment/app/b;->q:Z

    iput v0, p0, Landroidx/fragment/app/b;->s:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/fragment/app/b;->t:La/e7;

    new-instance v2, La/i7;

    invoke-direct {v2}, La/e7;-><init>()V

    iput-object v2, p0, Landroidx/fragment/app/b;->v:La/i7;

    iput-object v1, p0, Landroidx/fragment/app/b;->u:La/X6$a;

    iput v0, p0, Landroidx/fragment/app/b;->x:I

    iput v0, p0, Landroidx/fragment/app/b;->y:I

    iput-object v1, p0, Landroidx/fragment/app/b;->z:Ljava/lang/String;

    iput-boolean v0, p0, Landroidx/fragment/app/b;->A:Z

    iput-boolean v0, p0, Landroidx/fragment/app/b;->B:Z

    return-void
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/b;->u:La/X6$a;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/b;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()Z
    .locals 3

    iget-boolean v0, p0, Landroidx/fragment/app/b;->A:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/b;->t:La/e7;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/b;->w:Landroidx/fragment/app/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroidx/fragment/app/b;->j()Z

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

    iget v0, p0, Landroidx/fragment/app/b;->s:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/b;->E:Z

    return-void
.end method

.method public final m(IILandroid/content/Intent;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x2

    invoke-static {v0}, La/e7;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " received the following in onActivityResult(): requestCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " resultCode: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " data: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public n(La/X6;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/b;->E:Z

    iget-object v0, p0, Landroidx/fragment/app/b;->u:La/X6$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, La/Z6;->a:La/X6;

    :goto_0
    if-eqz v0, :cond_1

    iput-boolean p1, p0, Landroidx/fragment/app/b;->E:Z

    :cond_1
    return-void
.end method

.method public o(Landroid/os/Bundle;)V
    .locals 3

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/b;->E:Z

    invoke-virtual {p0}, Landroidx/fragment/app/b;->C()V

    iget-object v0, p0, Landroidx/fragment/app/b;->v:La/i7;

    iget v1, v0, La/e7;->u:I

    if-lt v1, p1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, v0, La/e7;->G:Z

    iput-boolean v1, v0, La/e7;->H:Z

    iget-object v2, v0, La/e7;->N:La/k7;

    iput-boolean v1, v2, La/k7;->i:Z

    invoke-virtual {v0, p1}, La/e7;->u(I)V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/b;->E:Z

    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/b;->z()La/X6;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/b;->E:Z

    return-void
.end method

.method public p(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/b;->E:Z

    return-void
.end method

.method public r()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/b;->E:Z

    return-void
.end method

.method public s(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/b;->u:La/X6$a;

    if-eqz p1, :cond_0

    iget-object p1, p1, La/X6$a;->e:La/X6;

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/b;->v:La/i7;

    iget-object v0, v0, La/e7;->f:La/a7;

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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

    iget-object v1, p0, Landroidx/fragment/app/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/b;->x:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/b;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/b;->z:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/b;->z:Ljava/lang/String;

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

    iput-boolean v0, p0, Landroidx/fragment/app/b;->E:Z

    return-void
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/b;->E:Z

    return-void
.end method

.method public w(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public x(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/b;->E:Z

    return-void
.end method

.method public y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/b;->v:La/i7;

    invoke-virtual {v0}, La/e7;->P()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/b;->r:Z

    new-instance v0, La/q7;

    invoke-virtual {p0}, Landroidx/fragment/app/b;->getViewModelStore()La/Fg;

    move-result-object v1

    new-instance v2, La/M2;

    const/16 v3, 0x9

    invoke-direct {v2, v3, p0}, La/M2;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, p0, v1, v2}, La/q7;-><init>(Landroidx/fragment/app/b;La/Fg;La/M2;)V

    iput-object v0, p0, Landroidx/fragment/app/b;->P:La/q7;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/b;->p(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/b;->P:La/q7;

    invoke-virtual {p1}, La/q7;->b()V

    const/4 p1, 0x3

    invoke-static {p1}, La/e7;->J(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Setting ViewLifecycleOwner on View "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " for Fragment "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/b;->P:La/q7;

    invoke-static {p1, p2}, La/Mg;->a(Landroid/view/View;La/y9;)V

    iget-object p1, p0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/b;->P:La/q7;

    const-string p3, "<this>"

    invoke-static {p1, p3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget p3, Landroidx/lifecycle/viewmodel/R$id;->view_tree_view_model_store_owner:I

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/b;->P:La/q7;

    invoke-static {p1, p2}, Landroidx/savedstate/b;->a(Landroid/view/View;La/Ld;)V

    iget-object p1, p0, Landroidx/fragment/app/b;->Q:La/Bb;

    iget-object p2, p0, Landroidx/fragment/app/b;->P:La/q7;

    invoke-virtual {p1, p2}, La/Bb;->g(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/b;->P:La/q7;

    iget-object p1, p1, La/q7;->d:Landroidx/lifecycle/h;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/b;->P:La/q7;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z()La/X6;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b;->u:La/X6$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, La/Z6;->a:La/X6;

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to an activity."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
