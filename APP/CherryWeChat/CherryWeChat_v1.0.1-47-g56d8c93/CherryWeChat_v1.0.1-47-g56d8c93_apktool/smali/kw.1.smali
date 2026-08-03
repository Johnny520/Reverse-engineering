.class public final Lkw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final e:Lhw;


# instance fields
.field public volatile a:Lgw;

.field public final b:LM4;

.field public final c:LOi;

.field public final d:LP3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhw;-><init>(I)V

    sput-object v0, Lkw;->e:Lhw;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LM4;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsy;-><init>(I)V

    iput-object v0, p0, Lkw;->b:LM4;

    new-instance v0, LP3;

    sget-object v1, Lkw;->e:Lhw;

    invoke-direct {v0, v1}, LP3;-><init>(Lhw;)V

    iput-object v0, p0, Lkw;->d:LP3;

    sget-boolean v0, Lpk;->f:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lpk;->e:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lyh;

    invoke-direct {v0}, Lyh;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lm6;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lm6;-><init>(I)V

    :goto_1
    iput-object v0, p0, Lkw;->c:LOi;

    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lkw;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Ljava/util/List;LM4;)V
    .locals 2

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhi;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lhi;->E:Landroid/view/View;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v1, v0}, Lsy;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lhi;->c()Lzi;

    move-result-object v0

    iget-object v0, v0, Lzi;->c:Lqs;

    invoke-virtual {v0}, Lqs;->t()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lkw;->b(Ljava/util/List;LM4;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final c(Lki;)Lgw;
    .locals 10

    sget-object v0, LvD;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkw;->d(Landroid/content/Context;)Lgw;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lkw;->c:LOi;

    invoke-interface {v0, p1}, LOi;->a(Lki;)V

    invoke-static {p1}, Lkw;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move v9, v2

    goto :goto_2

    :cond_3
    :goto_1
    move v9, v3

    :goto_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v6

    invoke-virtual {p1}, LTa;->getLifecycle()LRn;

    move-result-object v7

    invoke-virtual {p1}, Lki;->getSupportFragmentManager()Lzi;

    move-result-object v8

    iget-object v4, p0, Lkw;->d:LP3;

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, LP3;->E(Landroid/content/Context;Lcom/bumptech/glide/a;LRn;Lzi;Z)Lgw;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load for a destroyed activity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Landroid/content/Context;)Lgw;
    .locals 4

    if-eqz p1, :cond_4

    sget-object v0, LvD;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    instance-of v0, p1, Landroid/app/Application;

    if-nez v0, :cond_1

    instance-of v0, p1, Lki;

    if-eqz v0, :cond_0

    check-cast p1, Lki;

    invoke-virtual {p0, p1}, Lkw;->c(Lki;)Lgw;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkw;->d(Landroid/content/Context;)Lgw;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lkw;->a:Lgw;

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkw;->a:Lgw;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v0

    new-instance v1, Lgf;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lgf;-><init>(I)V

    new-instance v2, Lm6;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lm6;-><init>(I)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v3, Lgw;

    invoke-direct {v3, v0, v1, v2, p1}, Lgw;-><init>(Lcom/bumptech/glide/a;LQn;Llw;Landroid/content/Context;)V

    iput-object v3, p0, Lkw;->a:Lgw;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_2
    iget-object p1, p0, Lkw;->a:Lgw;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a null Context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
