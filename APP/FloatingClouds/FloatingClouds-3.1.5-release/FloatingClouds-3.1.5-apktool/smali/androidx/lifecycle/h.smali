.class public final Landroidx/lifecycle/h;
.super Landroidx/lifecycle/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/h$a;
    }
.end annotation


# instance fields
.field public final a:Z

.field public b:La/m6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/m6<",
            "La/x9;",
            "Landroidx/lifecycle/h$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroidx/lifecycle/e$b;

.field public final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "La/y9;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/lifecycle/e$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/y9;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/h;->a:Z

    new-instance v0, La/m6;

    invoke-direct {v0}, La/m6;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/h;->b:La/m6;

    sget-object v0, Landroidx/lifecycle/e$b;->b:Landroidx/lifecycle/e$b;

    iput-object v0, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/h;->h:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/h;->d:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a(La/x9;)V
    .locals 12

    iget-object v0, p0, Landroidx/lifecycle/h;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "addObserver"

    invoke-virtual {p0, v3}, Landroidx/lifecycle/h;->e(Ljava/lang/String;)V

    iget-object v3, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    sget-object v4, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/e$b;

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    sget-object v4, Landroidx/lifecycle/e$b;->b:Landroidx/lifecycle/e$b;

    :goto_0
    new-instance v3, Landroidx/lifecycle/h$a;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    sget-object v5, La/A9;->a:Ljava/util/HashMap;

    instance-of v5, p1, Landroidx/lifecycle/g;

    instance-of v6, p1, La/Q4;

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v5, :cond_1

    if-eqz v6, :cond_1

    new-instance v5, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    move-object v6, p1

    check-cast v6, La/Q4;

    move-object v9, p1

    check-cast v9, Landroidx/lifecycle/g;

    invoke-direct {v5, v6, v9}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(La/Q4;Landroidx/lifecycle/g;)V

    goto :goto_2

    :cond_1
    if-eqz v6, :cond_2

    new-instance v5, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    move-object v6, p1

    check-cast v6, La/Q4;

    invoke-direct {v5, v6, v1}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(La/Q4;Landroidx/lifecycle/g;)V

    goto :goto_2

    :cond_2
    if-eqz v5, :cond_3

    move-object v5, p1

    check-cast v5, Landroidx/lifecycle/g;

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, La/A9;->b(Ljava/lang/Class;)I

    move-result v6

    if-ne v6, v7, :cond_6

    sget-object v6, La/A9;->b:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-ne v6, v2, :cond_4

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/reflect/Constructor;

    invoke-static {v5, p1}, La/A9;->a(Ljava/lang/reflect/Constructor;La/x9;)Landroidx/lifecycle/b;

    move-result-object v5

    new-instance v6, Landroidx/lifecycle/SingleGeneratedAdapterObserver;

    invoke-direct {v6, v5}, Landroidx/lifecycle/SingleGeneratedAdapterObserver;-><init>(Landroidx/lifecycle/b;)V

    move-object v5, v6

    goto :goto_2

    :cond_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    new-array v9, v6, [Landroidx/lifecycle/b;

    move v10, v8

    :goto_1
    if-ge v10, v6, :cond_5

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/reflect/Constructor;

    invoke-static {v11, p1}, La/A9;->a(Ljava/lang/reflect/Constructor;La/x9;)Landroidx/lifecycle/b;

    move-result-object v11

    aput-object v11, v9, v10

    add-int/2addr v10, v2

    goto :goto_1

    :cond_5
    new-instance v5, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;

    invoke-direct {v5, v9}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Landroidx/lifecycle/b;)V

    goto :goto_2

    :cond_6
    new-instance v5, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;

    invoke-direct {v5, p1}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(La/x9;)V

    :goto_2
    iput-object v5, v3, Landroidx/lifecycle/h$a;->b:Landroidx/lifecycle/g;

    iput-object v4, v3, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    iget-object v4, p0, Landroidx/lifecycle/h;->b:La/m6;

    invoke-virtual {v4, p1}, La/m6;->a(Ljava/lang/Object;)La/Gd$c;

    move-result-object v5

    if-eqz v5, :cond_7

    iget-object v4, v5, La/Gd$c;->b:Ljava/lang/Object;

    goto :goto_4

    :cond_7
    iget-object v5, v4, La/m6;->e:Ljava/util/HashMap;

    new-instance v6, La/Gd$c;

    invoke-direct {v6, p1, v3}, La/Gd$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v9, v4, La/Gd;->d:I

    add-int/2addr v9, v2

    iput v9, v4, La/Gd;->d:I

    iget-object v9, v4, La/Gd;->b:La/Gd$c;

    if-nez v9, :cond_8

    iput-object v6, v4, La/Gd;->a:La/Gd$c;

    iput-object v6, v4, La/Gd;->b:La/Gd$c;

    goto :goto_3

    :cond_8
    iput-object v6, v9, La/Gd$c;->c:La/Gd$c;

    iput-object v9, v6, La/Gd$c;->d:La/Gd$c;

    iput-object v6, v4, La/Gd;->b:La/Gd$c;

    :goto_3
    invoke-virtual {v5, p1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v1

    :goto_4
    check-cast v4, Landroidx/lifecycle/h$a;

    if-eqz v4, :cond_9

    goto :goto_5

    :cond_9
    iget-object v4, p0, Landroidx/lifecycle/h;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/y9;

    if-nez v4, :cond_a

    :goto_5
    return-void

    :cond_a
    iget v5, p0, Landroidx/lifecycle/h;->e:I

    if-nez v5, :cond_b

    iget-boolean v5, p0, Landroidx/lifecycle/h;->f:Z

    if-eqz v5, :cond_c

    :cond_b
    move v8, v2

    :cond_c
    invoke-virtual {p0, p1}, Landroidx/lifecycle/h;->d(La/x9;)Landroidx/lifecycle/e$b;

    move-result-object v5

    iget v6, p0, Landroidx/lifecycle/h;->e:I

    add-int/2addr v6, v2

    iput v6, p0, Landroidx/lifecycle/h;->e:I

    :goto_6
    iget-object v6, v3, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v6, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-gez v5, :cond_11

    iget-object v5, p0, Landroidx/lifecycle/h;->b:La/m6;

    iget-object v5, v5, La/m6;->e:Ljava/util/HashMap;

    invoke-virtual {v5, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    iget-object v5, v3, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Landroidx/lifecycle/e$a;->Companion:Landroidx/lifecycle/e$a$a;

    iget-object v6, v3, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "state"

    invoke-static {v6, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eq v5, v2, :cond_f

    if-eq v5, v7, :cond_e

    const/4 v6, 0x3

    if-eq v5, v6, :cond_d

    move-object v5, v1

    goto :goto_7

    :cond_d
    sget-object v5, Landroidx/lifecycle/e$a;->ON_RESUME:Landroidx/lifecycle/e$a;

    goto :goto_7

    :cond_e
    sget-object v5, Landroidx/lifecycle/e$a;->ON_START:Landroidx/lifecycle/e$a;

    goto :goto_7

    :cond_f
    sget-object v5, Landroidx/lifecycle/e$a;->ON_CREATE:Landroidx/lifecycle/e$a;

    :goto_7
    if-eqz v5, :cond_10

    invoke-virtual {v3, v4, v5}, Landroidx/lifecycle/h$a;->a(La/y9;Landroidx/lifecycle/e$a;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v2

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/h;->d(La/x9;)Landroidx/lifecycle/e$b;

    move-result-object v5

    goto :goto_6

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "no event up from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v3, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    if-nez v8, :cond_12

    invoke-virtual {p0}, Landroidx/lifecycle/h;->i()V

    :cond_12
    iget p1, p0, Landroidx/lifecycle/h;->e:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/lifecycle/h;->e:I

    return-void
.end method

.method public final b()Landroidx/lifecycle/e$b;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    return-object v0
.end method

.method public final c(La/x9;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/h;->e(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/h;->b:La/m6;

    invoke-virtual {v0, p1}, La/m6;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(La/x9;)Landroidx/lifecycle/e$b;
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/h;->b:La/m6;

    iget-object v0, v0, La/m6;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/Gd$c;

    iget-object p1, p1, La/Gd$c;->d:La/Gd$c;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, La/Gd$c;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/h$a;

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/e$b;

    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    const-string v1, "state1"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_4

    return-object v2

    :cond_4
    return-object p1
.end method

.method public final e(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/lifecycle/h;->a:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/C1;->g()La/C1;

    move-result-object v0

    iget-object v0, v0, La/C1;->a:La/R4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "Method "

    const-string v1, " must be called on the main thread"

    invoke-static {v0, p1, v1}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public final f(Landroidx/lifecycle/e$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/h;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/e$a;->a()Landroidx/lifecycle/e$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/h;->g(Landroidx/lifecycle/e$b;)V

    return-void
.end method

.method public final g(Landroidx/lifecycle/e$b;)V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    if-ne v0, p1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Landroidx/lifecycle/e$b;->b:Landroidx/lifecycle/e$b;

    sget-object v2, Landroidx/lifecycle/e$b;->a:Landroidx/lifecycle/e$b;

    if-ne v0, v1, :cond_2

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "no event down from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " in component "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/lifecycle/h;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    iget-boolean p1, p0, Landroidx/lifecycle/h;->f:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, Landroidx/lifecycle/h;->e:I

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/h;->f:Z

    invoke-virtual {p0}, Landroidx/lifecycle/h;->i()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/lifecycle/h;->f:Z

    iget-object p1, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    if-ne p1, v2, :cond_4

    new-instance p1, La/m6;

    invoke-direct {p1}, La/m6;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/h;->b:La/m6;

    :cond_4
    :goto_1
    return-void

    :cond_5
    :goto_2
    iput-boolean v0, p0, Landroidx/lifecycle/h;->g:Z

    return-void
.end method

.method public final h(Landroidx/lifecycle/e$b;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setCurrentState"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/h;->e(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/h;->g(Landroidx/lifecycle/e$b;)V

    return-void
.end method

.method public final i()V
    .locals 12

    iget-object v0, p0, Landroidx/lifecycle/h;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/y9;

    if-eqz v0, :cond_e

    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/h;->b:La/m6;

    iget v2, v1, La/Gd;->d:I

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, La/Gd;->a:La/Gd$c;

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v1, v1, La/Gd$c;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/h$a;

    iget-object v1, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    iget-object v2, p0, Landroidx/lifecycle/h;->b:La/m6;

    iget-object v2, v2, La/Gd;->b:La/Gd$c;

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v2, v2, La/Gd$c;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/h$a;

    iget-object v2, v2, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    if-ne v1, v2, :cond_2

    :goto_0
    iput-boolean v3, p0, Landroidx/lifecycle/h;->g:Z

    return-void

    :cond_2
    iput-boolean v3, p0, Landroidx/lifecycle/h;->g:Z

    iget-object v1, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    iget-object v2, p0, Landroidx/lifecycle/h;->b:La/m6;

    iget-object v2, v2, La/Gd;->a:La/Gd$c;

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v2, v2, La/Gd$c;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/h$a;

    iget-object v2, v2, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const-string v5, "state"

    const/4 v6, 0x1

    if-gez v1, :cond_8

    iget-object v1, p0, Landroidx/lifecycle/h;->b:La/m6;

    new-instance v7, La/Gd$b;

    iget-object v8, v1, La/Gd;->b:La/Gd$c;

    iget-object v9, v1, La/Gd;->a:La/Gd$c;

    invoke-direct {v7, v8, v9}, La/Gd$e;-><init>(La/Gd$c;La/Gd$c;)V

    iget-object v1, v1, La/Gd;->c:Ljava/util/WeakHashMap;

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v7}, La/Gd$e;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-boolean v1, p0, Landroidx/lifecycle/h;->g:Z

    if-nez v1, :cond_8

    invoke-virtual {v7}, La/Gd$e;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v8, "next()"

    invoke-static {v1, v8}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/x9;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/h$a;

    :goto_1
    iget-object v9, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    iget-object v10, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v9

    if-lez v9, :cond_3

    iget-boolean v9, p0, Landroidx/lifecycle/h;->g:Z

    if-nez v9, :cond_3

    iget-object v9, p0, Landroidx/lifecycle/h;->b:La/m6;

    iget-object v9, v9, La/m6;->e:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    sget-object v9, Landroidx/lifecycle/e$a;->Companion:Landroidx/lifecycle/e$a$a;

    iget-object v10, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eq v9, v4, :cond_6

    if-eq v9, v3, :cond_5

    const/4 v10, 0x4

    if-eq v9, v10, :cond_4

    move-object v9, v2

    goto :goto_2

    :cond_4
    sget-object v9, Landroidx/lifecycle/e$a;->ON_PAUSE:Landroidx/lifecycle/e$a;

    goto :goto_2

    :cond_5
    sget-object v9, Landroidx/lifecycle/e$a;->ON_STOP:Landroidx/lifecycle/e$a;

    goto :goto_2

    :cond_6
    sget-object v9, Landroidx/lifecycle/e$a;->ON_DESTROY:Landroidx/lifecycle/e$a;

    :goto_2
    if-eqz v9, :cond_7

    invoke-virtual {v9}, Landroidx/lifecycle/e$a;->a()Landroidx/lifecycle/e$b;

    move-result-object v10

    iget-object v11, p0, Landroidx/lifecycle/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0, v9}, Landroidx/lifecycle/h$a;->a(La/y9;Landroidx/lifecycle/e$a;)V

    iget-object v9, p0, Landroidx/lifecycle/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    sub-int/2addr v10, v6

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event down from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v1, p0, Landroidx/lifecycle/h;->b:La/m6;

    iget-object v1, v1, La/Gd;->b:La/Gd$c;

    iget-boolean v7, p0, Landroidx/lifecycle/h;->g:Z

    if-nez v7, :cond_0

    if-eqz v1, :cond_0

    iget-object v7, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    iget-object v1, v1, La/Gd$c;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/h$a;

    iget-object v1, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v7, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Landroidx/lifecycle/h;->b:La/m6;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, La/Gd$d;

    invoke-direct {v7, v1}, La/Gd$d;-><init>(La/Gd;)V

    iget-object v1, v1, La/Gd;->c:Ljava/util/WeakHashMap;

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {v7}, La/Gd$d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroidx/lifecycle/h;->g:Z

    if-nez v1, :cond_0

    invoke-virtual {v7}, La/Gd$d;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/x9;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/h$a;

    :goto_3
    iget-object v9, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    iget-object v10, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/e$b;

    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v9

    if-gez v9, :cond_9

    iget-boolean v9, p0, Landroidx/lifecycle/h;->g:Z

    if-nez v9, :cond_9

    iget-object v9, p0, Landroidx/lifecycle/h;->b:La/m6;

    iget-object v9, v9, La/m6;->e:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    iget-object v9, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    iget-object v10, p0, Landroidx/lifecycle/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v9, Landroidx/lifecycle/e$a;->Companion:Landroidx/lifecycle/e$a$a;

    iget-object v10, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eq v9, v6, :cond_c

    if-eq v9, v4, :cond_b

    if-eq v9, v3, :cond_a

    move-object v9, v2

    goto :goto_4

    :cond_a
    sget-object v9, Landroidx/lifecycle/e$a;->ON_RESUME:Landroidx/lifecycle/e$a;

    goto :goto_4

    :cond_b
    sget-object v9, Landroidx/lifecycle/e$a;->ON_START:Landroidx/lifecycle/e$a;

    goto :goto_4

    :cond_c
    sget-object v9, Landroidx/lifecycle/e$a;->ON_CREATE:Landroidx/lifecycle/e$a;

    :goto_4
    if-eqz v9, :cond_d

    invoke-virtual {v1, v0, v9}, Landroidx/lifecycle/h$a;->a(La/y9;Landroidx/lifecycle/e$a;)V

    iget-object v9, p0, Landroidx/lifecycle/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    sub-int/2addr v10, v6

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event up from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
