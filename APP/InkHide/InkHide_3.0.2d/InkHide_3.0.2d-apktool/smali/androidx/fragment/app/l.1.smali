.class public abstract Landroidx/fragment/app/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Landroidx/lifecycle/s;
.implements Landroidx/lifecycle/Q;
.implements Landroidx/lifecycle/i;
.implements LM/f;


# static fields
.field public static final R:Ljava/lang/Object;


# instance fields
.field public A:Z

.field public B:Z

.field public final C:Z

.field public D:Z

.field public E:Landroid/view/ViewGroup;

.field public F:Landroid/view/View;

.field public G:Z

.field public H:Z

.field public I:Landroidx/fragment/app/k;

.field public J:Z

.field public K:Z

.field public L:Landroidx/lifecycle/n;

.field public M:Landroidx/lifecycle/u;

.field public N:Landroidx/fragment/app/H;

.field public final O:Landroidx/lifecycle/x;

.field public P:LM/e;

.field public final Q:Ljava/util/ArrayList;

.field public b:I

.field public c:Landroid/os/Bundle;

.field public d:Landroid/util/SparseArray;

.field public e:Landroid/os/Bundle;

.field public f:Ljava/lang/String;

.field public g:Landroid/os/Bundle;

.field public h:Landroidx/fragment/app/l;

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Ljava/lang/Boolean;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:I

.field public s:Landroidx/fragment/app/z;

.field public t:Landroidx/fragment/app/o;

.field public u:Landroidx/fragment/app/z;

.field public v:Landroidx/fragment/app/l;

.field public w:I

.field public x:I

.field public y:Ljava/lang/String;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/fragment/app/l;->R:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Landroidx/fragment/app/l;->b:I

    .line 6
    .line 7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/fragment/app/l;->k:Ljava/lang/Boolean;

    .line 21
    .line 22
    new-instance v0, Landroidx/fragment/app/z;

    .line 23
    .line 24
    invoke-direct {v0}, Landroidx/fragment/app/z;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Landroidx/fragment/app/l;->C:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Landroidx/fragment/app/l;->H:Z

    .line 33
    .line 34
    sget-object v0, Landroidx/lifecycle/n;->e:Landroidx/lifecycle/n;

    .line 35
    .line 36
    iput-object v0, p0, Landroidx/fragment/app/l;->L:Landroidx/lifecycle/n;

    .line 37
    .line 38
    new-instance v0, Landroidx/lifecycle/x;

    .line 39
    .line 40
    invoke-direct {v0}, Landroidx/lifecycle/x;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Landroidx/fragment/app/l;->O:Landroidx/lifecycle/x;

    .line 44
    .line 45
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Landroidx/fragment/app/l;->Q:Ljava/util/ArrayList;

    .line 56
    .line 57
    new-instance v0, Landroidx/lifecycle/u;

    .line 58
    .line 59
    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 63
    .line 64
    new-instance v0, LM/e;

    .line 65
    .line 66
    invoke-direct {v0, p0}, LM/e;-><init>(LM/f;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Landroidx/fragment/app/l;->P:LM/e;

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final b()LM/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->P:LM/e;

    .line 2
    .line 3
    iget-object v0, v0, LM/e;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LM/d;

    .line 6
    .line 7
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/u;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroidx/fragment/app/k;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/fragment/app/k;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Landroidx/fragment/app/l;->R:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v1, v0, Landroidx/fragment/app/k;->g:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, v0, Landroidx/fragment/app/k;->h:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v1, v0, Landroidx/fragment/app/k;->i:Ljava/lang/Object;

    .line 17
    .line 18
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    iput v1, v0, Landroidx/fragment/app/k;->j:F

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-object v1, v0, Landroidx/fragment/app/k;->k:Landroid/view/View;

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 28
    .line 29
    return-object v0
.end method

.method public final e()Landroidx/fragment/app/z;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "Fragment "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " has not been attached yet."

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final f()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->L:Landroidx/lifecycle/n;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/fragment/app/l;->v:Landroidx/fragment/app/l;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Landroidx/fragment/app/l;->v:Landroidx/fragment/app/l;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/fragment/app/l;->f()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0
.end method

.method public final g()Landroidx/fragment/app/z;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Fragment "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, " not associated with a fragment manager."

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/P;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/l;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 15
    .line 16
    iget-object v0, v0, Landroidx/fragment/app/B;->f:Ljava/util/HashMap;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroidx/lifecycle/P;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Landroidx/lifecycle/P;

    .line 29
    .line 30
    invoke-direct {v1}, Landroidx/lifecycle/P;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_0
    return-object v1

    .line 39
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v1, "Can\'t access ViewModels from detached fragment"

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public final h(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Fragment "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " received the following in onActivityResult(): requestCode: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, " resultCode: "

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, " data: "

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, "FragmentManager"

    .line 47
    .line 48
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public i(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public j(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final k(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p3, p0, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroidx/fragment/app/z;->J()V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x1

    .line 7
    iput-boolean p3, p0, Landroidx/fragment/app/l;->q:Z

    .line 8
    .line 9
    new-instance p3, Landroidx/fragment/app/H;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/l;->getViewModelStore()Landroidx/lifecycle/P;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p3, p0, v0}, Landroidx/fragment/app/H;-><init>(Landroidx/fragment/app/l;Landroidx/lifecycle/P;)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/l;->i(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/fragment/app/H;->e()V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 34
    .line 35
    iget-object p2, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 36
    .line 37
    const-string p3, "<this>"

    .line 38
    .line 39
    invoke-static {p1, p3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const v0, 0x7f0900bf

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 49
    .line 50
    iget-object p2, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 51
    .line 52
    invoke-static {p1, p3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const v0, 0x7f0900c2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 62
    .line 63
    iget-object p2, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 64
    .line 65
    invoke-static {p1, p3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const p3, 0x7f0900c1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Landroidx/fragment/app/l;->O:Landroidx/lifecycle/x;

    .line 75
    .line 76
    iget-object p2, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 83
    .line 84
    iget-object p1, p1, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 85
    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    iput-object p1, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    .line 95
    .line 96
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public final l()Landroid/view/LayoutInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/o;->h:Le/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/fragment/app/z;->f:Landroidx/fragment/app/s;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public final m()Le/i;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/o;->d:Le/i;

    .line 8
    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Fragment "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " not attached to an activity."

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public final n()Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Fragment "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public final o(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    if-nez p4, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput p1, v0, Landroidx/fragment/app/k;->b:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput p2, p1, Landroidx/fragment/app/k;->c:I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput p3, p1, Landroidx/fragment/app/k;->d:I

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput p4, p1, Landroidx/fragment/app/k;->e:I

    .line 37
    .line 38
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/fragment/app/l;->D:Z

    .line 3
    .line 4
    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l;->m()Le/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/l;->D:Z

    .line 3
    .line 4
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "{"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "} ("

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v1, p0, Landroidx/fragment/app/l;->w:I

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    const-string v1, " id=0x"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v1, p0, Landroidx/fragment/app/l;->w:I

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    const-string v1, " tag="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    :cond_1
    const-string v1, ")"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method
