.class public abstract Lr/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb1/h;

.field public static final b:Ll/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lr/k;

    .line 8
    .line 9
    invoke-direct {v0}, Lb1/h;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lr/f;->a:Lb1/h;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x1c

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lr/j;

    .line 20
    .line 21
    invoke-direct {v0}, Lr/i;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lr/f;->a:Lb1/h;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/16 v1, 0x1a

    .line 28
    .line 29
    if-lt v0, v1, :cond_2

    .line 30
    .line 31
    new-instance v0, Lr/i;

    .line 32
    .line 33
    invoke-direct {v0}, Lr/i;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lr/f;->a:Lb1/h;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    sget-object v0, Lr/h;->r:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    const-string v1, "TypefaceCompatApi24Impl"

    .line 44
    .line 45
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 46
    .line 47
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_3
    if-eqz v0, :cond_4

    .line 51
    .line 52
    new-instance v0, Lr/h;

    .line 53
    .line 54
    invoke-direct {v0}, Lb1/h;-><init>()V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lr/f;->a:Lb1/h;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    new-instance v0, Lr/g;

    .line 61
    .line 62
    invoke-direct {v0}, Lb1/h;-><init>()V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lr/f;->a:Lb1/h;

    .line 66
    .line 67
    :goto_0
    new-instance v0, Ll/f;

    .line 68
    .line 69
    const/16 v1, 0x10

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ll/f;-><init>(I)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lr/f;->b:Ll/f;

    .line 75
    .line 76
    return-void
.end method

.method public static a(Landroid/content/Context;Lq/e;Landroid/content/res/Resources;ILjava/lang/String;IILi/W;)Landroid/graphics/Typeface;
    .locals 11

    move/from16 v4, p6

    move-object/from16 v0, p7

    const/4 v6, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x3

    .line 1
    instance-of v3, p1, Lq/h;

    if-eqz v3, :cond_a

    .line 2
    check-cast p1, Lq/h;

    .line 3
    iget-object v3, p1, Lq/h;->d:Ljava/lang/String;

    const/4 v7, 0x0

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {v3, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v3

    .line 6
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v5, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v5

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {v3, v5}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v3, v7

    :goto_1
    if-eqz v3, :cond_2

    .line 8
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 9
    new-instance p1, LA0/m;

    invoke-direct {p1, v0, v3, v2}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v3

    .line 10
    :cond_2
    iget v3, p1, Lq/h;->c:I

    if-nez v3, :cond_3

    move v3, v6

    goto :goto_2

    :cond_3
    move v3, v1

    .line 11
    :goto_2
    iget v8, p1, Lq/h;->b:I

    .line 12
    new-instance v5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v9

    invoke-direct {v5, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    new-instance v9, LC/j;

    const/16 v10, 0x15

    .line 14
    invoke-direct {v9, v10}, LC/j;-><init>(I)V

    .line 15
    iput-object v0, v9, LC/j;->c:Ljava/lang/Object;

    .line 16
    iget-object p1, p1, Lq/h;->a:Lv/c;

    .line 17
    new-instance v10, LH/a;

    invoke-direct {v10, v9, v5, v1}, LH/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    if-eqz v3, :cond_6

    .line 18
    sget-object v0, Lv/g;->a:Ll/f;

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lv/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 20
    sget-object v0, Lv/g;->a:Ll/f;

    invoke-virtual {v0, v1}, Ll/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    if-eqz v0, :cond_4

    .line 21
    new-instance p0, Lo/a;

    invoke-direct {p0, v9, v0, v2}, Lo/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_3
    move-object v7, v0

    goto/16 :goto_8

    :cond_4
    const/4 v0, -0x1

    if-ne v8, v0, :cond_5

    .line 22
    invoke-static {v1, p0, p1, v4}, Lv/g;->a(Ljava/lang/String;Landroid/content/Context;Lv/c;I)Lv/f;

    move-result-object p0

    .line 23
    invoke-virtual {v10, p0}, LH/a;->t(Lv/f;)V

    .line 24
    iget-object v7, p0, Lv/f;->a:Landroid/graphics/Typeface;

    goto/16 :goto_8

    .line 25
    :cond_5
    new-instance v0, Lv/d;

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lv/d;-><init>(Ljava/lang/String;Landroid/content/Context;Lv/c;II)V

    .line 26
    :try_start_0
    sget-object p0, Lv/g;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 27
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    int-to-long v0, v8

    .line 28
    :try_start_1
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, p1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 29
    :try_start_2
    check-cast p0, Lv/f;

    .line 30
    invoke-virtual {v10, p0}, LH/a;->t(Lv/f;)V

    .line 31
    iget-object v7, p0, Lv/f;->a:Landroid/graphics/Typeface;

    goto/16 :goto_8

    :catch_0
    move-exception v0

    move-object p0, v0

    goto :goto_4

    :catch_1
    move-exception v0

    move-object p0, v0

    goto :goto_5

    .line 32
    :catch_2
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "timeout"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 33
    :goto_4
    throw p0

    .line 34
    :goto_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 35
    :catch_3
    new-instance p0, LD/b;

    iget-object p1, v10, LH/a;->b:Ljava/lang/Object;

    check-cast p1, LC/j;

    const/4 v0, -0x3

    invoke-direct {p0, p1, v0}, LD/b;-><init>(LC/j;I)V

    iget-object p1, v10, LH/a;->c:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_8

    :cond_6
    move-object v3, p1

    .line 36
    sget-object p1, Lv/g;->a:Ll/f;

    .line 37
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v3, Lv/c;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 38
    sget-object v0, Lv/g;->a:Ll/f;

    invoke-virtual {v0, p1}, Ll/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    if-eqz v0, :cond_7

    .line 39
    new-instance p0, Lo/a;

    invoke-direct {p0, v9, v0, v2}, Lo/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_3

    .line 40
    :cond_7
    new-instance v0, Lv/e;

    invoke-direct {v0, v1, v10}, Lv/e;-><init>(ILjava/lang/Object;)V

    .line 41
    sget-object v1, Lv/g;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 42
    :try_start_3
    sget-object v2, Lv/g;->d:Ll/k;

    .line 43
    invoke-virtual {v2, p1, v7}, Ll/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 44
    check-cast v5, Ljava/util/ArrayList;

    if-eqz v5, :cond_8

    .line 45
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    monitor-exit v1

    goto :goto_8

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_7

    .line 47
    :cond_8
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-virtual {v2, p1, v5}, Ll/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    new-instance v0, Lv/d;

    const/4 v5, 0x1

    move-object v2, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lv/d;-><init>(Ljava/lang/String;Landroid/content/Context;Lv/c;II)V

    .line 52
    sget-object p0, Lv/g;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 53
    new-instance p1, Lv/e;

    invoke-direct {p1, v6, v1}, Lv/e;-><init>(ILjava/lang/Object;)V

    .line 54
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-nez v1, :cond_9

    .line 55
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_6

    .line 56
    :cond_9
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 57
    :goto_6
    new-instance v2, Landroidx/fragment/app/c;

    .line 58
    invoke-direct {v2}, Landroidx/fragment/app/c;-><init>()V

    .line 59
    iput-object v0, v2, Landroidx/fragment/app/c;->b:Ljava/lang/Object;

    .line 60
    iput-object p1, v2, Landroidx/fragment/app/c;->c:Ljava/lang/Object;

    .line 61
    iput-object v1, v2, Landroidx/fragment/app/c;->d:Ljava/lang/Object;

    .line 62
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_8

    .line 63
    :goto_7
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0

    .line 64
    :cond_a
    sget-object v1, Lr/f;->a:Lb1/h;

    check-cast p1, Lq/f;

    invoke-virtual {v1, p0, p1, p2, v4}, Lb1/h;->l(Landroid/content/Context;Lq/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v7

    if-eqz v7, :cond_b

    .line 65
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 66
    new-instance p1, LA0/m;

    invoke-direct {p1, v0, v7, v2}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_8

    .line 67
    :cond_b
    invoke-virtual {v0}, Li/W;->a()V

    :goto_8
    if-eqz v7, :cond_c

    .line 68
    sget-object p0, Lr/f;->b:Ll/f;

    invoke-static/range {p2 .. p6}, Lr/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v7}, Ll/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    return-object v7
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
