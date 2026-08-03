.class public final Landroidx/lifecycle/o;
.super Landroidx/lifecycle/q$d;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q$b;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Landroidx/lifecycle/q$a;

.field public final c:Landroid/os/Bundle;

.field public final d:Landroidx/lifecycle/e;

.field public final e:Landroidx/savedstate/a;


# direct methods
.method public constructor <init>(Landroid/app/Application;Landroidx/activity/ComponentActivity;Landroid/os/Bundle;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/lifecycle/q$d;-><init>()V

    invoke-interface {p2}, La/Ld;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/o;->e:Landroidx/savedstate/a;

    invoke-interface {p2}, La/y9;->getLifecycle()Landroidx/lifecycle/e;

    move-result-object p2

    iput-object p2, p0, Landroidx/lifecycle/o;->d:Landroidx/lifecycle/e;

    iput-object p3, p0, Landroidx/lifecycle/o;->c:Landroid/os/Bundle;

    iput-object p1, p0, Landroidx/lifecycle/o;->a:Landroid/app/Application;

    if-eqz p1, :cond_1

    sget-object p2, Landroidx/lifecycle/q$a;->c:Landroidx/lifecycle/q$a;

    if-nez p2, :cond_0

    new-instance p2, Landroidx/lifecycle/q$a;

    invoke-direct {p2, p1}, Landroidx/lifecycle/q$a;-><init>(Landroid/app/Application;)V

    sput-object p2, Landroidx/lifecycle/q$a;->c:Landroidx/lifecycle/q$a;

    :cond_0
    sget-object p1, Landroidx/lifecycle/q$a;->c:Landroidx/lifecycle/q$a;

    invoke-static {p1}, La/i9;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Landroidx/lifecycle/q$a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroidx/lifecycle/q$a;-><init>(Landroid/app/Application;)V

    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/o;->b:Landroidx/lifecycle/q$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)La/Dg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "La/Dg;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/o;->d(Ljava/lang/Class;Ljava/lang/String;)La/Dg;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/Class;La/Ab;)La/Dg;
    .locals 3

    sget-object v0, Landroidx/lifecycle/r;->a:Landroidx/lifecycle/r;

    iget-object v1, p2, La/A4;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    sget-object v2, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n$b;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v2, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n$c;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v0, Landroidx/lifecycle/p;->a:Landroidx/lifecycle/p;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    const-class v1, La/r0;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    sget-object v2, La/Md;->a:Ljava/util/List;

    invoke-static {p1, v2}, La/Md;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v2, La/Md;->b:Ljava/util/List;

    invoke-static {p1, v2}, La/Md;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/o;->b:Landroidx/lifecycle/q$a;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/q$a;->b(Ljava/lang/Class;La/Ab;)La/Dg;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-static {p2}, Landroidx/lifecycle/n;->a(La/Ab;)Landroidx/lifecycle/m;

    move-result-object p2

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, La/Md;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)La/Dg;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p2}, Landroidx/lifecycle/n;->a(La/Ab;)Landroidx/lifecycle/m;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, La/Md;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)La/Dg;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/o;->d:Landroidx/lifecycle/e;

    if-eqz p2, :cond_4

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/o;->d(Ljava/lang/Class;Ljava/lang/String;)La/Dg;

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

.method public final c(La/Dg;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/o;->d:Landroidx/lifecycle/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/lifecycle/o;->e:Landroidx/savedstate/a;

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {p1, v1, v0}, Landroidx/lifecycle/d;->a(La/Dg;Landroidx/savedstate/a;Landroidx/lifecycle/e;)V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Class;Ljava/lang/String;)La/Dg;
    .locals 7

    iget-object v0, p0, Landroidx/lifecycle/o;->d:Landroidx/lifecycle/e;

    if-eqz v0, :cond_a

    const-class v1, La/r0;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/lifecycle/o;->a:Landroid/app/Application;

    if-eqz v2, :cond_0

    sget-object v2, La/Md;->a:Ljava/util/List;

    invoke-static {p1, v2}, La/Md;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v2, La/Md;->b:Ljava/util/List;

    invoke-static {p1, v2}, La/Md;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_3

    iget-object p2, p0, Landroidx/lifecycle/o;->a:Landroid/app/Application;

    if-eqz p2, :cond_1

    iget-object p2, p0, Landroidx/lifecycle/o;->b:Landroidx/lifecycle/q$a;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/q$a;->a(Ljava/lang/Class;)La/Dg;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p2, Landroidx/lifecycle/q$c;->a:Landroidx/lifecycle/q$c;

    if-nez p2, :cond_2

    new-instance p2, Landroidx/lifecycle/q$c;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    sput-object p2, Landroidx/lifecycle/q$c;->a:Landroidx/lifecycle/q$c;

    :cond_2
    sget-object p2, Landroidx/lifecycle/q$c;->a:Landroidx/lifecycle/q$c;

    invoke-static {p2}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Landroidx/lifecycle/q$c;->a(Ljava/lang/Class;)La/Dg;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v3, p0, Landroidx/lifecycle/o;->e:Landroidx/savedstate/a;

    invoke-static {v3}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v4, p0, Landroidx/lifecycle/o;->c:Landroid/os/Bundle;

    invoke-virtual {v3, p2}, Landroidx/savedstate/a;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    sget-object v6, Landroidx/lifecycle/m;->f:[Ljava/lang/Class;

    invoke-static {v5, v4}, Landroidx/lifecycle/m$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/m;

    move-result-object v4

    new-instance v5, Landroidx/lifecycle/SavedStateHandleController;

    invoke-direct {v5, p2, v4}, Landroidx/lifecycle/SavedStateHandleController;-><init>(Ljava/lang/String;Landroidx/lifecycle/m;)V

    invoke-virtual {v5, v0, v3}, Landroidx/lifecycle/SavedStateHandleController;->c(Landroidx/lifecycle/e;Landroidx/savedstate/a;)V

    invoke-virtual {v0}, Landroidx/lifecycle/e;->b()Landroidx/lifecycle/e$b;

    move-result-object p2

    sget-object v6, Landroidx/lifecycle/e$b;->b:Landroidx/lifecycle/e$b;

    if-eq p2, v6, :cond_5

    sget-object v6, Landroidx/lifecycle/e$b;->d:Landroidx/lifecycle/e$b;

    invoke-virtual {p2, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p2

    if-ltz p2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p2, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;

    invoke-direct {p2, v0, v3}, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;-><init>(Landroidx/lifecycle/e;Landroidx/savedstate/a;)V

    invoke-virtual {v0, p2}, Landroidx/lifecycle/e;->a(La/x9;)V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {v3}, Landroidx/savedstate/a;->d()V

    :goto_2
    if-eqz v1, :cond_6

    iget-object p2, p0, Landroidx/lifecycle/o;->a:Landroid/app/Application;

    if-eqz p2, :cond_6

    filled-new-array {p2, v4}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, La/Md;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)La/Dg;

    move-result-object p1

    goto :goto_3

    :cond_6
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, La/Md;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)La/Dg;

    move-result-object p1

    :goto_3
    const-string p2, "androidx.lifecycle.savedstate.vm.tag"

    iget-object v0, p1, La/Dg;->a:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, La/Dg;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    iget-object v2, p1, La/Dg;->a:Ljava/util/HashMap;

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
    iget-boolean p2, p1, La/Dg;->c:Z

    if-eqz p2, :cond_9

    invoke-static {v5}, La/Dg;->a(Ljava/lang/Object;)V

    :cond_9
    return-object p1

    :goto_6
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
