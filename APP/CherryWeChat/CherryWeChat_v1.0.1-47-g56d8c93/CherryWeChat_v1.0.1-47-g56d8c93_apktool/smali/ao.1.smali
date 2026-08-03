.class public final Lao;
.super LRn;
.source ""


# instance fields
.field public final a:Z

.field public b:Lfh;

.field public c:LPn;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:LZy;


# direct methods
.method public constructor <init>(LYn;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lao;->a:Z

    new-instance v0, Lfh;

    invoke-direct {v0}, Lfh;-><init>()V

    iput-object v0, p0, Lao;->b:Lfh;

    sget-object v0, LPn;->b:LPn;

    iput-object v0, p0, Lao;->c:LPn;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lao;->h:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lao;->d:Ljava/lang/ref/WeakReference;

    new-instance p1, LZy;

    invoke-direct {p1, v0}, LZy;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lao;->i:LZy;

    return-void
.end method


# virtual methods
.method public final a(LXn;)V
    .locals 9

    const-string v0, "addObserver"

    invoke-virtual {p0, v0}, Lao;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lao;->c:LPn;

    sget-object v1, LPn;->a:LPn;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, LPn;->b:LPn;

    :goto_0
    new-instance v0, LZn;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v2, Lco;->a:Ljava/util/HashMap;

    instance-of v2, p1, LUn;

    instance-of v3, p1, Landroidx/lifecycle/DefaultLifecycleObserver;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    new-instance v2, Led;

    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/DefaultLifecycleObserver;

    move-object v8, p1

    check-cast v8, LUn;

    invoke-direct {v2, v6, v3, v8}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    if-eqz v3, :cond_2

    new-instance v2, Led;

    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/DefaultLifecycleObserver;

    invoke-direct {v2, v6, v3, v5}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, LUn;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lco;->b(Ljava/lang/Class;)I

    move-result v3

    if-ne v3, v4, :cond_6

    sget-object v3, Lco;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v7, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v8, v3, [Lrj;

    if-gtz v3, :cond_4

    new-instance v2, Lcv;

    invoke-direct {v2, v4, v8}, Lcv;-><init>(ILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Lco;->a(Ljava/lang/reflect/Constructor;LXn;)V

    throw v5

    :cond_5
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Lco;->a(Ljava/lang/reflect/Constructor;LXn;)V

    throw v5

    :cond_6
    new-instance v2, Led;

    invoke-direct {v2, p1}, Led;-><init>(LXn;)V

    :goto_1
    iput-object v2, v0, LZn;->b:LUn;

    iput-object v1, v0, LZn;->a:LPn;

    iget-object v1, p0, Lao;->b:Lfh;

    invoke-virtual {v1, p1}, Lfh;->a(Ljava/lang/Object;)LUw;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v1, v2, LUw;->b:Ljava/lang/Object;

    goto :goto_3

    :cond_7
    iget-object v2, v1, Lfh;->e:Ljava/util/HashMap;

    new-instance v3, LUw;

    invoke-direct {v3, p1, v0}, LUw;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v8, v1, LXw;->d:I

    add-int/2addr v8, v7

    iput v8, v1, LXw;->d:I

    iget-object v8, v1, LXw;->b:LUw;

    if-nez v8, :cond_8

    iput-object v3, v1, LXw;->a:LUw;

    iput-object v3, v1, LXw;->b:LUw;

    goto :goto_2

    :cond_8
    iput-object v3, v8, LUw;->c:LUw;

    iput-object v8, v3, LUw;->d:LUw;

    iput-object v3, v1, LXw;->b:LUw;

    :goto_2
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v5

    :goto_3
    check-cast v1, LZn;

    if-eqz v1, :cond_9

    goto :goto_4

    :cond_9
    iget-object v1, p0, Lao;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYn;

    if-nez v1, :cond_a

    :goto_4
    return-void

    :cond_a
    iget v2, p0, Lao;->e:I

    if-nez v2, :cond_b

    iget-boolean v2, p0, Lao;->f:Z

    if-eqz v2, :cond_c

    :cond_b
    move v6, v7

    :cond_c
    invoke-virtual {p0, p1}, Lao;->c(LXn;)LPn;

    move-result-object v2

    iget v3, p0, Lao;->e:I

    add-int/2addr v3, v7

    iput v3, p0, Lao;->e:I

    :goto_5
    iget-object v3, v0, LZn;->a:LPn;

    invoke-virtual {v3, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_11

    iget-object v2, p0, Lao;->b:Lfh;

    iget-object v2, v2, Lfh;->e:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v0, LZn;->a:LPn;

    iget-object v3, p0, Lao;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, LOn;->Companion:LMn;

    iget-object v8, v0, LZn;->a:LPn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eq v2, v7, :cond_f

    if-eq v2, v4, :cond_e

    const/4 v8, 0x3

    if-eq v2, v8, :cond_d

    move-object v2, v5

    goto :goto_6

    :cond_d
    sget-object v2, LOn;->ON_RESUME:LOn;

    goto :goto_6

    :cond_e
    sget-object v2, LOn;->ON_START:LOn;

    goto :goto_6

    :cond_f
    sget-object v2, LOn;->ON_CREATE:LOn;

    :goto_6
    if-eqz v2, :cond_10

    invoke-virtual {v0, v1, v2}, LZn;->a(LYn;LOn;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v7

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lao;->c(LXn;)LPn;

    move-result-object v2

    goto :goto_5

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no event up from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, LZn;->a:LPn;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    if-nez v6, :cond_12

    invoke-virtual {p0}, Lao;->g()V

    :cond_12
    iget p1, p0, Lao;->e:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lao;->e:I

    return-void
.end method

.method public final b(LXn;)V
    .locals 1

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Lao;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lao;->b:Lfh;

    invoke-virtual {v0, p1}, Lfh;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(LXn;)LPn;
    .locals 3

    iget-object v0, p0, Lao;->b:Lfh;

    iget-object v0, v0, Lfh;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUw;

    iget-object p1, p1, LUw;->d:LUw;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, LUw;->b:Ljava/lang/Object;

    check-cast p1, LZn;

    if-eqz p1, :cond_1

    iget-object p1, p1, LZn;->a:LPn;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, Lao;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LPn;

    :cond_2
    iget-object v0, p0, Lao;->c:LPn;

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

.method public final d(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lao;->a:Z

    if-eqz v0, :cond_1

    invoke-static {}, LA4;->X()LA4;

    move-result-object v0

    iget-object v0, v0, LA4;->f:Lpd;

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

    invoke-static {v0, p1, v1}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public final e(LOn;)V
    .locals 1

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Lao;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, LOn;->a()LPn;

    move-result-object p1

    invoke-virtual {p0, p1}, Lao;->f(LPn;)V

    return-void
.end method

.method public final f(LPn;)V
    .locals 3

    iget-object v0, p0, Lao;->c:LPn;

    if-ne v0, p1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, LPn;->b:LPn;

    sget-object v2, LPn;->a:LPn;

    if-ne v0, v1, :cond_2

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "no event down from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lao;->c:LPn;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " in component "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lao;->d:Ljava/lang/ref/WeakReference;

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
    iput-object p1, p0, Lao;->c:LPn;

    iget-boolean p1, p0, Lao;->f:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, Lao;->e:I

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    iput-boolean v0, p0, Lao;->f:Z

    invoke-virtual {p0}, Lao;->g()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lao;->f:Z

    iget-object p1, p0, Lao;->c:LPn;

    if-ne p1, v2, :cond_4

    new-instance p1, Lfh;

    invoke-direct {p1}, Lfh;-><init>()V

    iput-object p1, p0, Lao;->b:Lfh;

    :cond_4
    :goto_1
    return-void

    :cond_5
    :goto_2
    iput-boolean v0, p0, Lao;->g:Z

    return-void
.end method

.method public final g()V
    .locals 11

    iget-object v0, p0, Lao;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYn;

    if-eqz v0, :cond_e

    :cond_0
    iget-object v1, p0, Lao;->b:Lfh;

    iget v2, v1, LXw;->d:I

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, LXw;->a:LUw;

    iget-object v2, v2, LUw;->b:Ljava/lang/Object;

    check-cast v2, LZn;

    iget-object v2, v2, LZn;->a:LPn;

    iget-object v1, v1, LXw;->b:LUw;

    iget-object v1, v1, LUw;->b:Ljava/lang/Object;

    check-cast v1, LZn;

    iget-object v1, v1, LZn;->a:LPn;

    if-ne v2, v1, :cond_2

    iget-object v4, p0, Lao;->c:LPn;

    if-ne v4, v1, :cond_2

    :goto_0
    iput-boolean v3, p0, Lao;->g:Z

    iget-object v0, p0, Lao;->i:LZy;

    iget-object v1, p0, Lao;->c:LPn;

    invoke-virtual {v0, v1}, LZy;->D(Ljava/lang/Object;)V

    return-void

    :cond_2
    iput-boolean v3, p0, Lao;->g:Z

    iget-object v1, p0, Lao;->c:LPn;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    iget-object v6, p0, Lao;->h:Ljava/util/ArrayList;

    if-gez v1, :cond_8

    iget-object v1, p0, Lao;->b:Lfh;

    new-instance v7, LTw;

    iget-object v8, v1, LXw;->b:LUw;

    iget-object v9, v1, LXw;->a:LUw;

    const/4 v10, 0x1

    invoke-direct {v7, v8, v9, v10}, LTw;-><init>(LUw;LUw;I)V

    iget-object v1, v1, LXw;->c:Ljava/util/WeakHashMap;

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v7}, LTw;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-boolean v1, p0, Lao;->g:Z

    if-nez v1, :cond_8

    invoke-virtual {v7}, LTw;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LXn;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZn;

    :goto_1
    iget-object v9, v1, LZn;->a:LPn;

    iget-object v10, p0, Lao;->c:LPn;

    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v9

    if-lez v9, :cond_3

    iget-boolean v9, p0, Lao;->g:Z

    if-nez v9, :cond_3

    iget-object v9, p0, Lao;->b:Lfh;

    iget-object v9, v9, Lfh;->e:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    sget-object v9, LOn;->Companion:LMn;

    iget-object v10, v1, LZn;->a:LPn;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eq v9, v4, :cond_6

    if-eq v9, v3, :cond_5

    const/4 v10, 0x4

    if-eq v9, v10, :cond_4

    move-object v9, v2

    goto :goto_2

    :cond_4
    sget-object v9, LOn;->ON_PAUSE:LOn;

    goto :goto_2

    :cond_5
    sget-object v9, LOn;->ON_STOP:LOn;

    goto :goto_2

    :cond_6
    sget-object v9, LOn;->ON_DESTROY:LOn;

    :goto_2
    if-eqz v9, :cond_7

    invoke-virtual {v9}, LOn;->a()LPn;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0, v9}, LZn;->a(LYn;LOn;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v5

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event down from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, LZn;->a:LPn;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v1, p0, Lao;->b:Lfh;

    iget-object v1, v1, LXw;->b:LUw;

    iget-boolean v7, p0, Lao;->g:Z

    if-nez v7, :cond_0

    if-eqz v1, :cond_0

    iget-object v7, p0, Lao;->c:LPn;

    iget-object v1, v1, LUw;->b:Ljava/lang/Object;

    check-cast v1, LZn;

    iget-object v1, v1, LZn;->a:LPn;

    invoke-virtual {v7, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lao;->b:Lfh;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, LVw;

    invoke-direct {v7, v1}, LVw;-><init>(LXw;)V

    iget-object v1, v1, LXw;->c:Ljava/util/WeakHashMap;

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {v7}, LVw;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lao;->g:Z

    if-nez v1, :cond_0

    invoke-virtual {v7}, LVw;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LXn;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZn;

    :goto_3
    iget-object v9, v1, LZn;->a:LPn;

    iget-object v10, p0, Lao;->c:LPn;

    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v9

    if-gez v9, :cond_9

    iget-boolean v9, p0, Lao;->g:Z

    if-nez v9, :cond_9

    iget-object v9, p0, Lao;->b:Lfh;

    iget-object v9, v9, Lfh;->e:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    iget-object v9, v1, LZn;->a:LPn;

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v9, LOn;->Companion:LMn;

    iget-object v10, v1, LZn;->a:LPn;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eq v9, v5, :cond_c

    if-eq v9, v4, :cond_b

    if-eq v9, v3, :cond_a

    move-object v9, v2

    goto :goto_4

    :cond_a
    sget-object v9, LOn;->ON_RESUME:LOn;

    goto :goto_4

    :cond_b
    sget-object v9, LOn;->ON_START:LOn;

    goto :goto_4

    :cond_c
    sget-object v9, LOn;->ON_CREATE:LOn;

    :goto_4
    if-eqz v9, :cond_d

    invoke-virtual {v1, v0, v9}, LZn;->a(LYn;LOn;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v5

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event up from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, LZn;->a:LPn;

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
