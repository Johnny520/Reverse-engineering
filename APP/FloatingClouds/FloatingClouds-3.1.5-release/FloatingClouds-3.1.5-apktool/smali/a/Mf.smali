.class public final La/Mf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Mf$a;
    }
.end annotation


# static fields
.field public static final a:La/Rf;

.field public static final b:La/W9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/W9<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, La/Qf;

    invoke-direct {v0}, La/Rf;-><init>()V

    sput-object v0, La/Mf;->a:La/Rf;

    goto :goto_0

    :cond_0
    new-instance v0, La/Pf;

    invoke-direct {v0}, La/Of;-><init>()V

    sput-object v0, La/Mf;->a:La/Rf;

    :goto_0
    new-instance v0, La/W9;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, La/W9;-><init>(I)V

    sput-object v0, La/Mf;->b:La/W9;

    return-void
.end method

.method public static a(Landroid/content/Context;La/S6$b;Landroid/content/res/Resources;ILjava/lang/String;IILa/qd$e;Z)Landroid/graphics/Typeface;
    .locals 11

    move/from16 v1, p6

    move-object/from16 v0, p7

    const/16 v2, 0xe

    const/4 v3, 0x0

    instance-of v4, p1, La/S6$e;

    const/4 v5, -0x3

    if-eqz v4, :cond_d

    check-cast p1, La/S6$e;

    iget-object v4, p1, La/S6$e;->d:Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v4, v3}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    sget-object v7, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v7, v3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v7

    if-eqz v4, :cond_1

    invoke-virtual {v4, v7}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, v6

    :goto_1
    if-eqz v4, :cond_3

    if-eqz v0, :cond_2

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p1, La/P0;

    invoke-direct {p1, v0, v2, v4}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-object v4

    :cond_3
    const/4 v2, 0x1

    if-eqz p8, :cond_5

    iget v4, p1, La/S6$e;->c:I

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    goto :goto_2

    :cond_5
    if-nez v0, :cond_4

    :goto_2
    const/4 v4, -0x1

    if-eqz p8, :cond_6

    iget v7, p1, La/S6$e;->b:I

    goto :goto_3

    :cond_6
    move v7, v4

    :goto_3
    new-instance v8, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v9

    invoke-direct {v8, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v9, La/Mf$a;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iput-object v0, v9, La/Mf$a;->u:La/qd$e;

    iget-object p1, p1, La/S6$e;->a:La/M6;

    new-instance v10, La/H2;

    invoke-direct {v10, v9, v8}, La/H2;-><init>(La/Mf$a;Landroid/os/Handler;)V

    if-eqz v2, :cond_9

    sget-object v0, La/R6;->a:La/W9;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, La/M6;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, La/R6;->a:La/W9;

    invoke-virtual {v2, v0}, La/W9;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Typeface;

    if-eqz v2, :cond_7

    new-instance p0, La/F2;

    invoke-direct {p0, v9, v2}, La/F2;-><init>(La/Mf$a;Landroid/graphics/Typeface;)V

    invoke-virtual {v8, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_4
    move-object v6, v2

    goto/16 :goto_9

    :cond_7
    if-ne v7, v4, :cond_8

    invoke-static {v0, p0, p1, v1}, La/R6;->a(Ljava/lang/String;Landroid/content/Context;La/M6;I)La/R6$a;

    move-result-object p0

    invoke-virtual {v10, p0}, La/H2;->a(La/R6$a;)V

    iget-object v6, p0, La/R6$a;->a:Landroid/graphics/Typeface;

    goto/16 :goto_9

    :cond_8
    new-instance v2, La/N6;

    invoke-direct {v2, v0, p0, p1, v1}, La/N6;-><init>(Ljava/lang/String;Landroid/content/Context;La/M6;I)V

    :try_start_0
    sget-object p0, La/R6;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {p0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    int-to-long v7, v7

    :try_start_1
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v7, v8, p1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    check-cast p0, La/R6$a;

    invoke-virtual {v10, p0}, La/H2;->a(La/R6$a;)V

    iget-object v6, p0, La/R6$a;->a:Landroid/graphics/Typeface;

    goto/16 :goto_9

    :catch_0
    move-exception v0

    move-object p0, v0

    goto :goto_5

    :catch_1
    move-exception v0

    move-object p0, v0

    goto :goto_6

    :catch_2
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "timeout"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_5
    throw p0

    :goto_6
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    :catch_3
    new-instance p0, La/G2;

    iget-object p1, v10, La/H2;->a:La/Mf$a;

    invoke-direct {p0, p1, v5, v3}, La/G2;-><init>(Ljava/lang/Object;II)V

    iget-object p1, v10, La/H2;->b:Landroid/os/Handler;

    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_9

    :cond_9
    sget-object v0, La/R6;->a:La/W9;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, La/M6;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, La/R6;->a:La/W9;

    invoke-virtual {v2, v0}, La/W9;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Typeface;

    if-eqz v2, :cond_a

    new-instance p0, La/F2;

    invoke-direct {p0, v9, v2}, La/F2;-><init>(La/Mf$a;Landroid/graphics/Typeface;)V

    invoke-virtual {v8, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    :cond_a
    new-instance v2, La/O6;

    invoke-direct {v2, v10}, La/O6;-><init>(La/H2;)V

    sget-object v3, La/R6;->c:Ljava/lang/Object;

    monitor-enter v3

    :try_start_3
    sget-object v4, La/R6;->d:La/ge;

    invoke-virtual {v4, v0, v6}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    if-eqz v5, :cond_b

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v3

    goto :goto_9

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_8

    :cond_b
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, v0, v5}, La/ge;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    new-instance v2, La/P6;

    invoke-direct {v2, v0, p0, p1, v1}, La/P6;-><init>(Ljava/lang/String;Landroid/content/Context;La/M6;I)V

    sget-object p0, La/R6;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance p1, La/Q6;

    invoke-direct {p1, v0}, La/Q6;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_c

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_7

    :cond_c
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    :goto_7
    new-instance v3, La/ad;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v2, v3, La/ad;->a:La/P6;

    iput-object p1, v3, La/ad;->b:La/Q6;

    iput-object v0, v3, La/ad;->c:Landroid/os/Handler;

    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_9

    :goto_8
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0

    :cond_d
    sget-object v3, La/Mf;->a:La/Rf;

    check-cast p1, La/S6$c;

    invoke-virtual {v3, p0, p1, p2, v1}, La/Rf;->a(Landroid/content/Context;La/S6$c;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v6

    if-eqz v0, :cond_f

    if-eqz v6, :cond_e

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p1, La/P0;

    invoke-direct {p1, v0, v2, v6}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_9

    :cond_e
    invoke-virtual {v0, v5}, La/qd$e;->a(I)V

    :cond_f
    :goto_9
    if-eqz v6, :cond_10

    sget-object p0, La/Mf;->b:La/W9;

    invoke-static/range {p2 .. p6}, La/Mf;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v6}, La/W9;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    return-object v6
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
