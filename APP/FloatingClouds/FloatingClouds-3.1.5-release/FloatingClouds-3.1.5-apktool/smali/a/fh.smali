.class public final La/fh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;
.implements La/K3$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/fh$a;
    }
.end annotation


# static fields
.field public static final G:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final A:La/va;

.field public final B:La/i5;

.field public final C:La/Od;

.field public final D:La/z8;

.field public final E:La/Db;

.field public volatile F:Z

.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ltop/mmjz/floatingclouds/bean/MaskItemBean;",
            ">;"
        }
    .end annotation
.end field

.field public final c:La/r8;

.field public final d:La/d6;

.field public final e:La/s4;

.field public final f:La/xb;

.field public final g:La/Ue;

.field public final h:La/h8;

.field public final i:La/h2;

.field public final j:La/R8;

.field public final k:La/A8;

.field public final l:La/D8;

.field public final m:La/o2;

.field public final n:La/v5;

.field public final o:La/s8;

.field public final p:La/q8;

.field public final q:La/m8;

.field public final r:La/T9;

.field public final s:La/w8;

.field public final t:La/u8;

.field public final u:La/g8;

.field public final v:La/Y7;

.field public final w:La/e4;

.field public final x:La/S3;

.field public final y:La/i2;

.field public final z:La/ta;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, La/dh;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/fh;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, La/fh;->b:Ljava/util/LinkedHashMap;

    new-instance v0, La/r8;

    invoke-direct {v0}, La/r8;-><init>()V

    iput-object v0, p0, La/fh;->c:La/r8;

    new-instance v0, La/d6;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->d:La/d6;

    new-instance v0, La/s4;

    invoke-direct {v0}, La/s4;-><init>()V

    iput-object v0, p0, La/fh;->e:La/s4;

    new-instance v0, La/xb;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->f:La/xb;

    new-instance v0, La/Ue;

    invoke-direct {v0}, La/Ue;-><init>()V

    iput-object v0, p0, La/fh;->g:La/Ue;

    new-instance v0, La/h8;

    invoke-direct {v0}, La/h8;-><init>()V

    iput-object v0, p0, La/fh;->h:La/h8;

    new-instance v0, La/h2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->i:La/h2;

    new-instance v0, La/R8;

    invoke-direct {v0}, La/R8;-><init>()V

    iput-object v0, p0, La/fh;->j:La/R8;

    new-instance v0, La/A8;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->k:La/A8;

    new-instance v0, La/D8;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->l:La/D8;

    new-instance v0, La/o2;

    invoke-direct {v0}, La/o2;-><init>()V

    iput-object v0, p0, La/fh;->m:La/o2;

    new-instance v0, La/v5;

    invoke-direct {v0}, La/v5;-><init>()V

    iput-object v0, p0, La/fh;->n:La/v5;

    new-instance v0, La/s8;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->o:La/s8;

    new-instance v0, La/q8;

    invoke-direct {v0}, La/q8;-><init>()V

    iput-object v0, p0, La/fh;->p:La/q8;

    new-instance v0, La/m8;

    invoke-direct {v0}, La/m8;-><init>()V

    iput-object v0, p0, La/fh;->q:La/m8;

    new-instance v0, La/T9;

    invoke-direct {v0}, La/T9;-><init>()V

    iput-object v0, p0, La/fh;->r:La/T9;

    new-instance v0, La/w8;

    invoke-direct {v0}, La/w8;-><init>()V

    iput-object v0, p0, La/fh;->s:La/w8;

    new-instance v0, La/u8;

    invoke-direct {v0}, La/u8;-><init>()V

    iput-object v0, p0, La/fh;->t:La/u8;

    new-instance v0, La/g8;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->u:La/g8;

    new-instance v0, La/Y7;

    invoke-direct {v0}, La/Y7;-><init>()V

    iput-object v0, p0, La/fh;->v:La/Y7;

    new-instance v0, La/e4;

    invoke-direct {v0}, La/e4;-><init>()V

    iput-object v0, p0, La/fh;->w:La/e4;

    new-instance v0, La/S3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->x:La/S3;

    new-instance v0, La/i2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->y:La/i2;

    new-instance v0, La/ta;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->z:La/ta;

    new-instance v0, La/va;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, -0x1

    iput-wide v1, v0, La/va;->e:J

    iput-object v0, p0, La/fh;->A:La/va;

    new-instance v0, La/i5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->B:La/i5;

    new-instance v0, La/Od;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->C:La/Od;

    new-instance v0, La/z8;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->D:La/z8;

    new-instance v0, La/Db;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/fh;->E:La/Db;

    return-void
.end method

.method public static a(La/J8;)Ljava/util/LinkedHashMap;
    .locals 4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object p0, p0, La/J8;->a:Ljava/lang/ClassLoader;

    :try_start_0
    sget-object v1, La/Gb;->a:La/Gb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, La/Gb;->h(Ljava/lang/ClassLoader;)La/Rb$a;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "F010:convStorage"

    iget-object v3, v1, La/Rb$a;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "F010:convStorageHelper"

    iget-object v3, v1, La/Rb$a;->b:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "F010:convGetter"

    iget-object v1, v1, La/Rb$a;->c:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {v1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_2
    :try_start_1
    sget-object v1, La/Rb;->a:La/Rb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, La/Rb;->k(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "F007_voip_mgr"

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    invoke-static {v1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_1
    :goto_3
    :try_start_2
    sget-object v1, La/Rb;->a:La/Rb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, La/Rb;->e(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "F010:convStorageLegacy"

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, La/Wf;->a:La/Wf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v1

    invoke-static {v1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_2
    :goto_4
    :try_start_3
    sget-object v1, La/Rb;->a:La/Rb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, La/Rb;->f(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_3

    const-string v1, "F010:convStorageHelperLegacy"

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception p0

    invoke-static {p0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_3
    :goto_5
    return-object v0
.end method

.method public static b(La/J8;Ljava/util/List;)V
    .locals 11

    const-string v0, "ms)"

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/mc;

    iget-object v2, v1, La/mc;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v1, v1, La/mc;->b:Ljava/lang/Object;

    check-cast v1, Ltop/mmjz/floatingclouds/plugin/IPlugin;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-string v5, "WXMaskPlugin: handleHook -> "

    const-string v6, " START"

    invoke-static {v5, v2, v6}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v6, La/eh;

    const/4 v8, 0x6

    invoke-direct {v6, v1, p0, v8}, La/eh;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;I)V

    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    const/4 v6, 0x0

    :try_start_0
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v9, 0xbb8

    invoke-interface {v1, v9, v10, v8}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " DONE ("

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    const-string v1, "OK"

    invoke-static {v2, v1, v8, v9, v6}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " INTERRUPTED ("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    const-string v1, "INTERRUPTED"

    invoke-static {v2, v1, v8, v9, v6}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    goto/16 :goto_0

    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v3

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    move-object v1, v3

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " FAIL ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v1}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/x1;->a([Ljava/lang/Object;)V

    sget-boolean v3, La/n6;->a:Z

    const-string v3, "FAIL"

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v6, v7, v1}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    goto/16 :goto_0

    :catch_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " TIMEOUT("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "ms) skip & continue (watchdog)"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V

    const-string v1, "TIMEOUT"

    const-string v3, "init timeout 3000ms"

    invoke-static {v2, v1, v8, v9, v3}, La/n6;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    iget-object v0, p0, La/fh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/fh;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v3}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final handleHook(La/J8;)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v7, 0x1

    const-string v0, "session"

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->n()V

    const-string v0, "WXMaskPlugin: ConfigUtil reloaded from disk (early, before any part init)"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v0, v2, La/J8;->b:Ljava/lang/String;

    const-string v8, ":patch"

    invoke-static {v0, v8}, La/Ae;->D(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "WXMaskPlugin: :patch process -> diagnostic-only (skip masking/UI parts)"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, v1, La/fh;->y:La/i2;

    invoke-virtual {v0, v2}, La/i2;->handleHook(La/J8;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_0
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_29

    const-string v2, "WXMaskPlugin: :patch diagnostic FAILED"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    goto/16 :goto_27

    :cond_0
    new-instance v0, La/eh;

    invoke-direct {v0, v1, v2, v5}, La/eh;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;I)V

    sget-object v8, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v8, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    new-instance v0, La/eh;

    invoke-direct {v0, v1, v2, v4}, La/eh;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;I)V

    invoke-interface {v8, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    new-instance v0, La/eh;

    const/4 v9, 0x4

    invoke-direct {v0, v1, v2, v9}, La/eh;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;I)V

    invoke-interface {v8, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    invoke-virtual {v1}, La/fh;->c()V

    sget-object v8, La/w1;->p:Landroid/content/Context;

    const/4 v9, 0x0

    if-eqz v8, :cond_5

    const-string v0, "/"

    const-string v10, "getString(...)"

    const-string v11, "StartupSnapshot"

    :try_start_1
    const-string v12, "fc_startup_state"

    invoke-virtual {v8, v12, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v12

    const-string v13, "startup_snapshot"

    invoke-interface {v12, v13, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_1

    move-object v14, v9

    goto/16 :goto_5

    :cond_1
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13, v12}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v12, "wechatVersion"

    invoke-virtual {v13, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v10}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "pluginVersion"

    invoke-virtual {v13, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v10}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "resolvedClasses"

    invoke-virtual {v13, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v10}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    const-string v6, "keys(...)"

    invoke-static {v4, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v10, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v14, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x0

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_2
    const-string v4, "createdAt"

    invoke-virtual {v13, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v18

    move-object/from16 v17, v14

    new-instance v14, La/te$a;

    move-object/from16 v16, v12

    invoke-direct/range {v14 .. v19}, La/te$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;J)V

    move-object/from16 v4, v16

    invoke-static {}, La/B1$a;->a()Ljava/lang/String;

    move-result-object v6

    const-string v9, "3.1.5"

    invoke-virtual {v15, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v12, " plugin="

    if-eqz v10, :cond_4

    :try_start_2
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface/range {v17 .. v17}, Ljava/util/Map;->size()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "VALID: wechat="

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " classes="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v11, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_5

    :cond_4
    :goto_2
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "INVALIDATED: cached="

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v11, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v4, "load failed: "

    invoke-static {v4, v0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v11, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    :cond_5
    :goto_4
    const/4 v14, 0x0

    :goto_5
    if-eqz v14, :cond_8

    iget-object v4, v2, La/J8;->a:Ljava/lang/ClassLoader;

    iget-object v0, v14, La/te$a;->c:Ljava/util/LinkedHashMap;

    const-string v6, "F010:convStorage"

    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v6, "F010:convStorageHelper"

    iget-object v9, v14, La/te$a;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v9, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v10, "F010:convGetter"

    invoke-virtual {v9, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const-string v11, "StartupSnapshot"

    if-eqz v0, :cond_6

    if-eqz v6, :cond_6

    if-eqz v10, :cond_6

    :try_start_3
    invoke-static {v0, v3, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v6, v3, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v6

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v6}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v0, v6, v10}, La/Gb;->f(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    move v0, v3

    const/16 v20, 0x3

    goto :goto_6

    :catch_1
    move-exception v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v10, "F010 class not found: "

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", will fallback to full resolve"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v11, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    move/from16 v20, v3

    const/4 v0, 0x3

    goto :goto_6

    :cond_6
    move v0, v3

    move/from16 v20, v0

    :goto_6
    const-string v6, "F007_voip_mgr"

    invoke-virtual {v9, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_7

    :try_start_4
    invoke-static {v6, v3, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_2

    add-int/lit8 v20, v20, 0x1

    :cond_7
    :goto_7
    move/from16 v4, v20

    goto :goto_8

    :catch_2
    const-string v4, "F007 voip class not found: "

    invoke-virtual {v4, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v11, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->e([Ljava/lang/Object;)V

    add-int/2addr v0, v7

    goto :goto_7

    :goto_8
    invoke-interface {v9}, Ljava/util/Map;->size()I

    move-result v6

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "applySnapshot done: injected="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " failed="

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " total="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v11, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const-string v0, "WXMaskPlugin: FAST PATH \u2014 snapshot applied, skip class resolution"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_9

    :cond_8
    const-string v0, "WXMaskPlugin: FULL PATH \u2014 no valid snapshot, full init"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :goto_9
    :try_start_5
    invoke-static {v2}, La/Gb;->g(La/J8;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_a

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_a
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v4, "WXMaskPlugin: registerInstanceCapture FAILED"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_9
    :try_start_6
    iget-object v0, v2, La/J8;->a:Ljava/lang/ClassLoader;

    new-instance v4, Ljava/lang/Thread;

    new-instance v6, La/M2;

    const/16 v9, 0x12

    invoke-direct {v6, v9, v0}, La/M2;-><init>(ILjava/lang/Object;)V

    const-string v0, "ConvHide-EarlyInit"

    invoke-direct {v4, v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_b

    :catchall_2
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    :try_start_7
    invoke-static {}, La/a5;->a()La/a5$b;

    move-result-object v0

    sget-boolean v4, La/n6;->a:Z

    const-string v4, "contact_classes"

    if-eqz v0, :cond_a

    const-string v6, "CACHED"

    goto :goto_c

    :cond_a
    const-string v6, "SKIP"

    :goto_c
    if-eqz v0, :cond_b

    iget-object v0, v0, La/a5$b;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_d

    :cond_b
    move v0, v3

    :goto_d
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "count="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v6, v0}, La/n6;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "search_command_v2"

    invoke-static {v0}, La/a5;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_c

    const-string v0, "search_command_v1"

    invoke-static {v0}, La/a5;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    if-nez v0, :cond_c

    :catch_3
    const/4 v4, 0x0

    goto :goto_e

    :cond_c
    :try_start_8
    new-instance v4, La/a5$j;

    const-string v6, "searchViewClassNames"

    invoke-static {v6, v0}, La/a5;->g(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v4, v0}, La/a5$j;-><init>(Ljava/util/List;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    :goto_e
    :try_start_9
    sget-boolean v0, La/n6;->a:Z

    const-string v0, "search_classes"

    if-eqz v4, :cond_d

    const-string v6, "CACHED"

    goto :goto_f

    :cond_d
    const-string v6, "SKIP"

    :goto_f
    if-eqz v4, :cond_e

    iget-object v4, v4, La/a5$j;->a:Ljava/lang/Object;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_10

    :cond_e
    move v4, v3

    :goto_10
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "count="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v6, v4}, La/n6;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "recent_forward_v2"

    invoke-static {v0}, La/a5;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_f

    const-string v0, "recent_forward_v1"

    invoke-static {v0}, La/a5;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    if-nez v0, :cond_f

    :catch_4
    const/4 v4, 0x0

    goto :goto_11

    :cond_f
    :try_start_a
    new-instance v4, La/a5$i;

    const-string v6, "activityClassNames"

    invoke-static {v6, v0}, La/a5;->g(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v4, v0}, La/a5$i;-><init>(Ljava/util/List;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    :goto_11
    :try_start_b
    sget-boolean v0, La/n6;->a:Z

    const-string v0, "forward_classes"

    if-eqz v4, :cond_10

    const-string v6, "CACHED"

    goto :goto_12

    :cond_10
    const-string v6, "SKIP"

    :goto_12
    if-eqz v4, :cond_11

    iget-object v4, v4, La/a5$i;->a:Ljava/lang/Object;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_13

    :cond_11
    move v4, v3

    :goto_13
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "count="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v6, v4}, La/n6;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    :catch_5
    sget-boolean v0, La/Ed;->a:Z

    iget-object v0, v2, La/J8;->a:Ljava/lang/ClassLoader;

    const-string v4, "classLoader"

    invoke-static {v0, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v4, La/Ed;->a:Z

    if-eqz v4, :cond_12

    :goto_14
    move-wide/from16 v21, v9

    goto/16 :goto_1f

    :cond_12
    sget-object v4, La/K3;->a:La/K3$a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->j()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v6, "rcr_ver"

    const/4 v11, 0x0

    invoke-interface {v4, v6, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "cls_cache_"

    if-eqz v12, :cond_16

    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_16

    sget-object v11, La/Ed;->p:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move v12, v3

    :goto_15
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_14

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, La/Ed$a;

    iget-object v5, v15, La/Ed$a;->a:Ljava/lang/String;

    move/from16 v17, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_13

    :try_start_c
    iget-object v7, v15, La/Ed$a;->c:La/D7;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    move-object/from16 v18, v4

    :try_start_d
    invoke-static {v5, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v7, v4}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v12, v12, 0x1

    sget-boolean v4, La/n6;->a:Z

    iget-object v4, v15, La/Ed$a;->a:Ljava/lang/String;

    move/from16 v7, v17

    invoke-static {v4, v5, v7}, La/n6;->b(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    move-object/from16 v4, v18

    const/4 v5, 0x2

    const/4 v7, 0x1

    goto :goto_15

    :catch_6
    move-object/from16 v18, v4

    :catch_7
    sget-boolean v4, La/n6;->a:Z

    iget-object v4, v15, La/Ed$a;->a:Ljava/lang/String;

    invoke-static {v4, v5, v3}, La/n6;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_16
    move v4, v3

    goto :goto_17

    :cond_13
    move-object/from16 v18, v4

    goto :goto_16

    :cond_14
    move-object/from16 v18, v4

    const/4 v4, 0x1

    :goto_17
    if-eqz v4, :cond_17

    sget-object v0, La/Ed;->b:Ljava/lang/Class;

    if-eqz v0, :cond_15

    sget-object v0, La/Ed;->c:Ljava/lang/Class;

    if-eqz v0, :cond_15

    sget-object v0, La/Ed;->d:Ljava/lang/Class;

    if-eqz v0, :cond_15

    sget-object v0, La/Ed;->i:Ljava/lang/Class;

    if-eqz v0, :cond_15

    sget-object v0, La/Ed;->k:Ljava/lang/Class;

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    goto :goto_18

    :cond_15
    move v0, v3

    :goto_18
    sput-boolean v0, La/Ed;->a:Z

    sget-boolean v0, La/n6;->a:Z

    sget-object v0, La/Ed;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v4, "SP hit null"

    const/4 v7, 0x1

    invoke-static {v7, v12, v3, v0, v4}, La/n6;->e(ZIIILjava/lang/String;)V

    const-string v0, "[RuntimeClassResolver] cached (SP, null)"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_16
    move-object/from16 v18, v4

    :cond_17
    invoke-interface/range {v18 .. v18}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    const/4 v7, 0x0

    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    sget-object v5, La/Ed;->p:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v3

    move v7, v6

    :cond_18
    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_20

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/Ed$a;

    iget-object v12, v11, La/Ed$a;->d:La/s7;

    invoke-interface {v12}, La/s7;->a()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_18

    iget-object v12, v11, La/Ed$a;->e:La/s7;

    if-eqz v12, :cond_1a

    invoke-interface {v12}, La/s7;->a()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    if-eqz v12, :cond_1a

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_19

    goto :goto_1a

    :cond_19
    const/4 v12, 0x0

    :goto_1a
    if-nez v12, :cond_1b

    :cond_1a
    iget-object v12, v11, La/Ed$a;->b:Ljava/util/List;

    :cond_1b
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move v15, v3

    :goto_1b
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_1c

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v3, v18

    check-cast v3, Ljava/lang/String;

    move-object/from16 v18, v5

    :try_start_e
    iget-object v5, v11, La/Ed$a;->c:La/D7;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_a

    move/from16 v20, v6

    move-wide/from16 v21, v9

    const/4 v6, 0x0

    :try_start_f
    invoke-static {v3, v6, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v9

    invoke-interface {v5, v9}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_9

    const/4 v5, 0x1

    add-int/lit8 v6, v20, 0x1

    :try_start_10
    sget-boolean v9, La/n6;->a:Z

    iget-object v9, v11, La/Ed$a;->a:Ljava/lang/String;

    invoke-static {v9, v3, v5}, La/n6;->b(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_8

    const/4 v15, 0x1

    goto :goto_1d

    :catch_8
    const/4 v15, 0x1

    goto :goto_1c

    :catch_9
    move/from16 v6, v20

    goto :goto_1c

    :catch_a
    move/from16 v20, v6

    move-wide/from16 v21, v9

    :goto_1c
    move-object/from16 v5, v18

    move-wide/from16 v9, v21

    const/4 v3, 0x0

    goto :goto_1b

    :cond_1c
    move-object/from16 v18, v5

    move/from16 v20, v6

    move-wide/from16 v21, v9

    :goto_1d
    if-nez v15, :cond_1e

    const/16 v17, 0x1

    add-int/lit8 v7, v7, 0x1

    sget-boolean v3, La/n6;->a:Z

    iget-object v3, v11, La/Ed$a;->a:Ljava/lang/String;

    iget-object v5, v11, La/Ed$a;->b:Ljava/util/List;

    invoke-static {v5}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_1d

    const-string v5, "unknown"

    :cond_1d
    const/4 v9, 0x0

    invoke-static {v3, v5, v9}, La/n6;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_1e
    iget-object v3, v11, La/Ed$a;->d:La/s7;

    invoke-interface {v3}, La/s7;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    if-eqz v3, :cond_1f

    iget-object v5, v11, La/Ed$a;->a:Ljava/lang/String;

    invoke-static {v13, v5}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_1f
    move-object/from16 v5, v18

    move-wide/from16 v9, v21

    const/4 v3, 0x0

    goto/16 :goto_19

    :cond_20
    move-wide/from16 v21, v9

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object v0, La/Ed;->b:Ljava/lang/Class;

    if-eqz v0, :cond_21

    sget-object v0, La/Ed;->c:Ljava/lang/Class;

    if-eqz v0, :cond_21

    sget-object v0, La/Ed;->d:Ljava/lang/Class;

    if-eqz v0, :cond_21

    sget-object v0, La/Ed;->i:Ljava/lang/Class;

    if-eqz v0, :cond_21

    sget-object v0, La/Ed;->k:Ljava/lang/Class;

    if-eqz v0, :cond_21

    const/4 v0, 0x1

    goto :goto_1e

    :cond_21
    const/4 v0, 0x0

    :goto_1e
    sput-boolean v0, La/Ed;->a:Z

    sget-boolean v0, La/n6;->a:Z

    sget-boolean v0, La/Ed;->a:Z

    sget-object v3, La/Ed;->p:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v11, 0x0

    invoke-static {v0, v6, v7, v3, v11}, La/n6;->e(ZIIILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "[RuntimeClassResolver] ready (null) found="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " miss="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v7, 0x1

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :goto_1f
    sget-boolean v0, La/n6;->a:Z

    sget-boolean v0, La/Ed;->a:Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v0, v6, v6, v6, v7}, La/n6;->e(ZIIILjava/lang/String;)V

    const-string v0, "[WXMaskPlugin] handleHook started"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const-string v0, "globalLifecycleHook"

    iget-object v3, v1, La/fh;->v:La/Y7;

    new-instance v4, La/mc;

    invoke-direct {v4, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "msgInsertDispatcher"

    iget-object v3, v1, La/fh;->f:La/xb;

    new-instance v5, La/mc;

    invoke-direct {v5, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "tempUnhideTriggerPart"

    iget-object v3, v1, La/fh;->g:La/Ue;

    new-instance v6, La/mc;

    invoke-direct {v6, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "maskUIManagerPluginPart"

    iget-object v3, v1, La/fh;->z:La/ta;

    new-instance v7, La/mc;

    invoke-direct {v7, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "maskedMsgVibratePluginPart"

    iget-object v3, v1, La/fh;->A:La/va;

    new-instance v9, La/mc;

    invoke-direct {v9, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "hideMainUIListPluginPart"

    iget-object v3, v1, La/fh;->e:La/s4;

    new-instance v10, La/mc;

    invoke-direct {v10, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "convAddMaskPluginPart"

    iget-object v3, v1, La/fh;->w:La/e4;

    new-instance v11, La/mc;

    invoke-direct {v11, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "contactAddMaskPluginPart"

    iget-object v3, v1, La/fh;->x:La/S3;

    new-instance v12, La/mc;

    invoke-direct {v12, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "longClickTracePluginPart"

    iget-object v3, v1, La/fh;->r:La/T9;

    new-instance v13, La/mc;

    invoke-direct {v13, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "hideOwnSnsPluginPart"

    iget-object v3, v1, La/fh;->q:La/m8;

    new-instance v15, La/mc;

    invoke-direct {v15, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    move-object/from16 v27, v9

    move-object/from16 v28, v10

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move-object/from16 v31, v13

    move-object/from16 v32, v15

    filled-new-array/range {v23 .. v32}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v3, "hideContactListPluginPart"

    iget-object v4, v1, La/fh;->h:La/h8;

    new-instance v5, La/mc;

    invoke-direct {v5, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "blockContactInfoPluginPart"

    iget-object v4, v1, La/fh;->i:La/h2;

    new-instance v6, La/mc;

    invoke-direct {v6, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "enterChattingUIPluginPart"

    iget-object v4, v1, La/fh;->d:La/d6;

    new-instance v7, La/mc;

    invoke-direct {v7, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "hideTextStatusPluginPart"

    iget-object v4, v1, La/fh;->l:La/D8;

    new-instance v9, La/mc;

    invoke-direct {v9, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "hideSnsEntryPluginPart"

    iget-object v4, v1, La/fh;->o:La/s8;

    new-instance v10, La/mc;

    invoke-direct {v10, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "hideSnsInteractionPluginPart"

    iget-object v4, v1, La/fh;->s:La/w8;

    new-instance v11, La/mc;

    invoke-direct {v11, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "hideSnsGroupIconPluginPart"

    iget-object v4, v1, La/fh;->t:La/u8;

    new-instance v12, La/mc;

    invoke-direct {v12, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "hideContactLabelPluginPart"

    iget-object v4, v1, La/fh;->u:La/g8;

    new-instance v13, La/mc;

    invoke-direct {v13, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "diagSnsLabelPluginPart"

    iget-object v4, v1, La/fh;->B:La/i5;

    new-instance v15, La/mc;

    invoke-direct {v15, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "blockHotUpdatePluginPart"

    iget-object v4, v1, La/fh;->y:La/i2;

    move-object/from16 v23, v5

    new-instance v5, La/mc;

    invoke-direct {v5, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "searchCommandPluginPart"

    iget-object v4, v1, La/fh;->C:La/Od;

    move-object/from16 v32, v5

    new-instance v5, La/mc;

    invoke-direct {v5, v3, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v33, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move-object/from16 v28, v11

    move-object/from16 v29, v12

    move-object/from16 v30, v13

    move-object/from16 v31, v15

    filled-new-array/range {v23 .. v33}, [La/mc;

    move-result-object v3

    invoke-static {v3}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v0}, La/fh;->b(La/J8;Ljava/util/List;)V

    new-instance v0, La/eh;

    const/4 v6, 0x0

    invoke-direct {v0, v1, v2, v6}, La/eh;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;I)V

    sget-object v4, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    new-instance v0, La/eh;

    const/4 v7, 0x1

    invoke-direct {v0, v1, v2, v7}, La/eh;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;I)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    new-instance v0, La/eh;

    const/4 v5, 0x5

    invoke-direct {v0, v1, v2, v5}, La/eh;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;I)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    sget-object v0, La/rb;->a:La/rb;

    const-string v4, "phase2b_async_init"

    invoke-virtual {v0, v4}, La/rb;->b(Ljava/lang/String;)V

    const-string v4, "phase2b_async_init"

    invoke-virtual {v0, v4}, La/rb;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/mc;

    iget-object v4, v3, La/mc;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v3, v3, La/mc;->b:Ljava/lang/Object;

    check-cast v3, Ltop/mmjz/floatingclouds/plugin/IPlugin;

    sget-object v5, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    new-instance v6, La/h0;

    invoke-direct {v6, v1, v4, v3, v2}, La/h0;-><init>(La/fh;Ljava/lang/String;Ltop/mmjz/floatingclouds/plugin/IPlugin;La/J8;)V

    invoke-interface {v5, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_20

    :cond_22
    sget-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    new-instance v3, La/P0;

    const/16 v4, 0x10

    invoke-direct {v3, v1, v4, v2}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    new-instance v3, La/l0;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, La/l0;-><init>(I)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_21

    :cond_23
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, La/h0;

    const/4 v5, 0x5

    invoke-direct {v4, v1, v2, v3, v5}, La/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long v3, v3, v21

    const-string v0, "WXMaskPlugin"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "critical parts done in "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "ms, async parts scheduled"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const-string v0, "WXMaskPlugin"

    const-string v3, "DexKit bridge init skipped on main thread (delegated to background)"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :try_start_11
    const-string v0, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"

    iget-object v3, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v3, v0}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_24

    goto :goto_22

    :cond_24
    const-string v0, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"

    const-string v3, "onCreate"

    const-class v4, Landroid/os/Bundle;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    new-instance v5, La/kd;

    const/16 v6, 0x1d

    invoke-direct {v5, v6}, La/kd;-><init>(I)V

    invoke-static {v2, v0, v3, v4, v5}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    :goto_22
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    goto :goto_23

    :catchall_3
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_23
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_25

    const-string v3, "WXMaskPlugin: hook ExtDeviceWXLoginUI fail"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x2

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_25
    const-string v0, "WXMaskPlugin"

    const-string v3, "ExtDeviceWXLoginUI hook block passed"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const-string v0, "WXMaskPlugin"

    const-string v3, "ResolverRegistry.init() about to call"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/ld;->a:La/ld;

    invoke-virtual {v0}, La/ld;->a()V

    sget-object v0, La/rb;->a:La/rb;

    const-string v3, "F010_conv_storage_pair"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F010_chat_user_extractor"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "WXMaskPlugin"

    const-string v4, "Phase6b enabled: F010_conv_storage_pair + F010_chat_user_extractor"

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/x1;->b([Ljava/lang/Object;)V

    const-string v3, "F007_voip_mgr"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F017_msg_info"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "WXMaskPlugin"

    const-string v4, "Phase3-B batch1 enabled: F007_voip_mgr + F017_msg_info"

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/x1;->b([Ljava/lang/Object;)V

    const-string v3, "F005_hide_contact_label"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F021_select_contact_mvvm_list"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F013_timeline_adapter"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F006_hide_sns_entry"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F008_hide_own_sns"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "WXMaskPlugin"

    const-string v4, "Phase3-B batch2 enabled: F005 + F021 + F013 + F006 + F008"

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/x1;->b([Ljava/lang/Object;)V

    const-string v3, "F004_contact_add_mask"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F004_contact_list_fields"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F024_status_store"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F024_mvvm_submit_param"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F025_msg_storage"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v3, "F021_recent_forward_adapter"

    invoke-virtual {v0, v3}, La/rb;->b(Ljava/lang/String;)V

    const-string v0, "WXMaskPlugin"

    const-string v3, "Phase5-A enabled: F024_status_store + F024_mvvm_submit_param + F025_msg_storage + F021_recent_forward_adapter"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const-string v0, "WXMaskPlugin"

    const-string v3, "Phase6b registering ConvMuteRuleRegistrar"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/v4;->a:La/v4;

    iget-object v3, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, La/v4;->b(Ljava/lang/ClassLoader;)V

    const-string v0, "WXMaskPlugin"

    const-string v3, "Phase6b ConvMuteRuleRegistrar.register returned"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v0, v2, La/J8;->b:Ljava/lang/String;

    const-string v3, "com.tencent.mm"

    invoke-static {v0, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    iget-boolean v0, v1, La/fh;->F:Z

    if-eqz v0, :cond_26

    goto :goto_26

    :cond_26
    const/4 v7, 0x1

    iput-boolean v7, v1, La/fh;->F:Z

    iget-object v0, v2, La/J8;->a:Ljava/lang/ClassLoader;

    sget-object v3, La/hd;->a:La/hd;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object v0, La/hd;->c:Ljava/lang/ClassLoader;

    sget v0, La/B1;->a:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_27

    :try_start_12
    sget-object v0, La/w1;->p:Landroid/content/Context;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v4, "com.tencent.mm"

    const/4 v6, 0x0

    invoke-virtual {v0, v4, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v3, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_b

    const/4 v7, 0x1

    goto :goto_24

    :catch_b
    move-exception v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v7, 0x1

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_24
    sput v3, La/B1;->a:I

    goto :goto_25

    :cond_27
    const/4 v7, 0x1

    :goto_25
    sput-boolean v7, La/hd;->b:Z

    sget-object v3, La/rb;->a:La/rb;

    const-string v0, "F010_conv_storage_pair"

    monitor-enter v3

    :try_start_13
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v5, La/rb;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    monitor-exit v3

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, La/l0;

    const/4 v5, 0x5

    invoke-direct {v3, v5}, La/l0;-><init>(I)V

    const-wide/32 v4, 0xafc8

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_26

    :catchall_4
    move-exception v0

    :try_start_14
    monitor-exit v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    throw v0

    :cond_28
    :goto_26
    if-nez v14, :cond_29

    if-eqz v8, :cond_29

    iget-object v0, v2, La/J8;->b:Ljava/lang/String;

    const-string v3, "com.tencent.mm"

    invoke-static {v0, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    new-instance v0, Ljava/lang/Thread;

    new-instance v3, La/P0;

    invoke-direct {v3, v1, v2, v8}, La/P0;-><init>(La/fh;La/J8;Landroid/content/Context;)V

    const-string v2, "FC-Snapshot-Save"

    invoke-direct {v0, v3, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_29
    :goto_27
    return-void
.end method

.method public final onConfigChange()V
    .locals 0

    invoke-virtual {p0}, La/fh;->c()V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La/K3;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
