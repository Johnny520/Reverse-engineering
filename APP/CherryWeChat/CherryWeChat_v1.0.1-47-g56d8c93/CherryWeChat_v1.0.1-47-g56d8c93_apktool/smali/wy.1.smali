.class public final Lwy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LXj;


# static fields
.field public static volatile e:Lwy;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lwy;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 3
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lwy;->c:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lwy;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lwy;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lwy;->d:Ljava/lang/Object;

    .line 9
    new-instance v0, LSd;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, LSd;-><init>(Landroid/content/Context;I)V

    .line 10
    new-instance p1, LBb;

    invoke-direct {p1, v0}, LBb;-><init>(Ljava/lang/Object;)V

    .line 11
    new-instance v0, Luy;

    invoke-direct {v0, p0}, Luy;-><init>(Lwy;)V

    .line 12
    new-instance v1, LZd;

    invoke-direct {v1, p1, v0}, LZd;-><init>(LBb;Luy;)V

    .line 13
    iput-object v1, p0, Lwy;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Ljava/util/ArrayList;LDc;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, Lwy;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwy;->c:Ljava/lang/Object;

    iput-object p2, p0, Lwy;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lix;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lwy;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwy;->c:Ljava/lang/Object;

    .line 6
    new-instance p1, Lhx;

    invoke-direct {p1}, Lhx;-><init>()V

    iput-object p1, p0, Lwy;->d:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/content/Context;)Lwy;
    .locals 2

    sget-object v0, Lwy;->e:Lwy;

    if-nez v0, :cond_1

    const-class v0, Lwy;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lwy;->e:Lwy;

    if-nez v1, :cond_0

    new-instance v1, Lwy;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lwy;-><init>(Landroid/content/Context;)V

    sput-object v1, Lwy;->e:Lwy;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lwy;->e:Lwy;

    return-object p0
.end method


# virtual methods
.method public a(LXv;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lwy;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lwy;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashSet;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    invoke-interface {p1}, LXv;->clear()V

    :cond_3
    return v0
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lwy;->c:Ljava/lang/Object;

    check-cast v0, Lix;

    invoke-interface {v0}, LYn;->getLifecycle()LRn;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lao;

    iget-object v2, v2, Lao;->c:LPn;

    sget-object v3, LPn;->b:LPn;

    if-ne v2, v3, :cond_1

    new-instance v2, Lcv;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Lcv;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, LRn;->a(LXn;)V

    iget-object v0, p0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Lhx;

    iget-boolean v2, v0, Lhx;->b:Z

    if-nez v2, :cond_0

    new-instance v2, LHa;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v0}, LHa;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, LRn;->a(LXn;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lhx;->b:Z

    iput-boolean v1, p0, Lwy;->b:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SavedStateRegistry was already attached."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 3

    iget-boolean v0, p0, Lwy;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lwy;->c()V

    :cond_0
    iget-object v0, p0, Lwy;->c:Ljava/lang/Object;

    check-cast v0, Lix;

    invoke-interface {v0}, LYn;->getLifecycle()LRn;

    move-result-object v0

    check-cast v0, Lao;

    iget-object v1, v0, Lao;->c:LPn;

    sget-object v2, LPn;->d:LPn;

    invoke-virtual {v1, v2}, LPn;->a(LPn;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v0, p0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Lhx;

    iget-boolean v1, v0, Lhx;->b:Z

    if-eqz v1, :cond_3

    iget-boolean v1, v0, Lhx;->d:Z

    if-nez v1, :cond_2

    if-eqz p1, :cond_1

    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-object p1, v0, Lhx;->c:Landroid/os/Bundle;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lhx;->d:Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SavedStateRegistry was already restored."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You must call performAttach() before calling performRestore(Bundle)."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "performRestore cannot be called when owner is "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lao;->c:LPn;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Lhx;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lhx;->c:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    iget-object v0, v0, Lhx;->a:LXw;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, LVw;

    invoke-direct {v2, v0}, LVw;-><init>(LXw;)V

    iget-object v0, v0, LXw;->c:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-virtual {v2}, LVw;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, LVw;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgx;

    invoke-interface {v0}, Lgx;->saveState()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lwy;->b:Z

    if-nez v0, :cond_0

    const-string v0, "Glide registry"

    invoke-static {v0}, LOj;->c(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwy;->b:Z

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lwy;->c:Ljava/lang/Object;

    check-cast v1, Lcom/bumptech/glide/a;

    iget-object v2, p0, Lwy;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v1, v2}, LDc;->g(Lcom/bumptech/glide/a;Ljava/util/ArrayList;)LPv;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Lwy;->b:Z

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v1

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Lwy;->b:Z

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lwy;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{numRequests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwy;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isPaused="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lwy;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
