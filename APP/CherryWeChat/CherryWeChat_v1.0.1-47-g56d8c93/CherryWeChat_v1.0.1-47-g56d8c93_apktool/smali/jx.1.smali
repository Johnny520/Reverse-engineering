.class public final Ljx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LwE;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:LvE;

.field public final c:Landroid/os/Bundle;

.field public final d:LRn;

.field public final e:Lhx;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lki;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lix;->getSavedStateRegistry()Lhx;

    move-result-object v0

    iput-object v0, p0, Ljx;->e:Lhx;

    invoke-interface {p2}, LYn;->getLifecycle()LRn;

    move-result-object p2

    iput-object p2, p0, Ljx;->d:LRn;

    iput-object p3, p0, Ljx;->c:Landroid/os/Bundle;

    iput-object p1, p0, Ljx;->a:Landroid/app/Application;

    if-eqz p1, :cond_1

    sget-object p2, LvE;->d:LvE;

    if-nez p2, :cond_0

    new-instance p2, LvE;

    invoke-direct {p2, p1}, LvE;-><init>(Landroid/app/Application;)V

    sput-object p2, LvE;->d:LvE;

    :cond_0
    sget-object p1, LvE;->d:LvE;

    goto :goto_0

    :cond_1
    new-instance p1, LvE;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LvE;-><init>(Landroid/app/Application;)V

    :goto_0
    iput-object p1, p0, Ljx;->b:LvE;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)LuE;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Ljx;->c(Ljava/lang/Class;Ljava/lang/String;)LuE;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/Class;Lts;)LuE;
    .locals 3

    sget-object v0, Lgf;->n:Lgf;

    iget-object v1, p2, Llc;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    sget-object v2, LOj;->h:Lhw;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v2, LOj;->i:Lhw;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v0, Lgf;->m:Lgf;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    const-class v1, LF2;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    sget-object v2, Lkx;->a:Ljava/util/List;

    invoke-static {p1, v2}, Lkx;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v2, Lkx;->b:Ljava/util/List;

    invoke-static {p1, v2}, Lkx;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    iget-object v0, p0, Ljx;->b:LvE;

    invoke-virtual {v0, p1, p2}, LvE;->b(Ljava/lang/Class;Lts;)LuE;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-static {p2}, LOj;->l(Lts;)Lax;

    move-result-object p2

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lkx;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)LuE;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p2}, LOj;->l(Lts;)Lax;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lkx;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)LuE;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p0, Ljx;->d:LRn;

    if-eqz p2, :cond_4

    invoke-virtual {p0, p1, v0}, Ljx;->c(Ljava/lang/Class;Ljava/lang/String;)LuE;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ljava/lang/Class;Ljava/lang/String;)LuE;
    .locals 8

    iget-object v0, p0, Ljx;->d:LRn;

    if-eqz v0, :cond_b

    const-class v1, LF2;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Ljx;->a:Landroid/app/Application;

    if-eqz v2, :cond_0

    sget-object v2, Lkx;->a:Ljava/util/List;

    invoke-static {p1, v2}, Lkx;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v2, Lkx;->b:Ljava/util/List;

    invoke-static {p1, v2}, Lkx;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_3

    iget-object p2, p0, Ljx;->a:Landroid/app/Application;

    if-eqz p2, :cond_1

    iget-object p2, p0, Ljx;->b:LvE;

    invoke-virtual {p2, p1}, LvE;->a(Ljava/lang/Class;)LuE;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p2, LCi;->b:LCi;

    if-nez p2, :cond_2

    new-instance p2, LCi;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, LCi;-><init>(I)V

    sput-object p2, LCi;->b:LCi;

    :cond_2
    sget-object p2, LCi;->b:LCi;

    invoke-virtual {p2, p1}, LCi;->a(Ljava/lang/Class;)LuE;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v3, p0, Ljx;->e:Lhx;

    iget-object v4, p0, Ljx;->c:Landroid/os/Bundle;

    invoke-virtual {v3, p2}, Lhx;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    sget-object v6, Lax;->f:[Ljava/lang/Class;

    invoke-static {v5, v4}, LQj;->m(Landroid/os/Bundle;Landroid/os/Bundle;)Lax;

    move-result-object v4

    new-instance v5, Lbx;

    invoke-direct {v5, p2, v4}, Lbx;-><init>(Ljava/lang/String;Lax;)V

    iget-boolean v6, v5, Lbx;->c:Z

    if-nez v6, :cond_a

    const/4 v6, 0x1

    iput-boolean v6, v5, Lbx;->c:Z

    invoke-virtual {v0, v5}, LRn;->a(LXn;)V

    iget-object v7, v4, Lax;->e:Lgx;

    invoke-virtual {v3, p2, v7}, Lhx;->c(Ljava/lang/String;Lgx;)V

    move-object p2, v0

    check-cast p2, Lao;

    iget-object p2, p2, Lao;->c:LPn;

    sget-object v7, LPn;->b:LPn;

    if-eq p2, v7, :cond_5

    sget-object v7, LPn;->d:LPn;

    invoke-virtual {p2, v7}, LPn;->a(LPn;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p2, Led;

    invoke-direct {p2, v6, v0, v3}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, LRn;->a(LXn;)V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {v3}, Lhx;->d()V

    :goto_2
    if-eqz v1, :cond_6

    iget-object p2, p0, Ljx;->a:Landroid/app/Application;

    if-eqz p2, :cond_6

    filled-new-array {p2, v4}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lkx;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)LuE;

    move-result-object p1

    goto :goto_3

    :cond_6
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lkx;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)LuE;

    move-result-object p1

    :goto_3
    const-string p2, "androidx.lifecycle.savedstate.vm.tag"

    iget-object v0, p1, LuE;->a:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, LuE;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    iget-object v2, p1, LuE;->a:Ljava/util/HashMap;

    invoke-virtual {v2, p2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_7
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    move-object v5, v1

    :goto_5
    iget-boolean p2, p1, LuE;->c:Z

    if-eqz p2, :cond_9

    invoke-static {v5}, LuE;->a(Ljava/lang/Object;)V

    :cond_9
    return-object p1

    :goto_6
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_a
    const-string p1, "Already attached to lifecycleOwner"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
