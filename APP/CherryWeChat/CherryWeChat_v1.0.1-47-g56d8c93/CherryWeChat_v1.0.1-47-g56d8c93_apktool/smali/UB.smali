.class public abstract LUB;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcr;

.field public static final b:LDp;

.field public static c:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "TypefaceCompat static init"

    invoke-static {v0}, LOj;->c(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, LXB;

    invoke-direct {v0}, Lcr;-><init>()V

    sput-object v0, LUB;->a:Lcr;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, LWB;

    invoke-direct {v0}, Lcr;-><init>()V

    sput-object v0, LUB;->a:Lcr;

    goto :goto_0

    :cond_1
    new-instance v0, LVB;

    invoke-direct {v0}, LVB;-><init>()V

    sput-object v0, LUB;->a:Lcr;

    :goto_0
    new-instance v0, LDp;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, LDp;-><init>(I)V

    sput-object v0, LUB;->b:LDp;

    const/4 v0, 0x0

    sput-object v0, LUB;->c:Landroid/graphics/Paint;

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method public static a(Landroid/content/Context;LUh;Landroid/content/res/Resources;ILjava/lang/String;IILNj;Z)Landroid/graphics/Typeface;
    .locals 14

    move/from16 v4, p6

    move-object/from16 v1, p7

    instance-of v2, p1, LXh;

    const/16 v3, 0xf

    const/4 v6, -0x3

    if-eqz v2, :cond_16

    move-object v0, p1

    check-cast v0, LXh;

    iget-object v2, v0, LXh;->d:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v5, :cond_0

    invoke-static {v2}, LUB;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2

    if-eqz v2, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v2, v0, LXh;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ne v5, v8, :cond_1

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LNh;

    iget-object v2, v2, LNh;->e:Ljava/lang/String;

    invoke-static {v2}, LUB;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2

    goto/16 :goto_6

    :cond_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1f

    if-ge v5, v10, :cond_2

    :catch_0
    :goto_0
    move-object v2, v7

    goto/16 :goto_6

    :cond_2
    move v5, v9

    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v5, v10, :cond_4

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LNh;

    iget-object v10, v10, LNh;->e:Ljava/lang/String;

    invoke-static {v10}, LUB;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v10

    if-nez v10, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    move-object v10, v7

    move v5, v9

    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v5, v11, :cond_9

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LNh;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v12

    sub-int/2addr v12, v8

    if-ne v5, v12, :cond_5

    iget-object v12, v11, LNh;->f:Ljava/lang/String;

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_5

    iget-object v2, v11, LNh;->e:Ljava/lang/String;

    invoke-static {v10, v2}, LQ;->p(Landroid/graphics/Typeface$CustomFallbackBuilder;Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    iget-object v12, v11, LNh;->e:Ljava/lang/String;

    iget-object v11, v11, LNh;->f:Ljava/lang/String;

    invoke-static {v12}, LUB;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v12

    invoke-static {v12}, LUB;->d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    move-result-object v12

    if-nez v12, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_7

    :try_start_0
    invoke-static {}, LQ;->m()V

    invoke-static {}, LQ;->x()V

    invoke-static {v12}, LW5;->f(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v12

    invoke-static {v12, v11}, LQ;->g(Landroid/graphics/fonts/Font$Builder;Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v11

    invoke-static {v11}, LQ;->h(Landroid/graphics/fonts/Font$Builder;)Landroid/graphics/fonts/Font;

    move-result-object v11

    invoke-static {v11}, LQ;->i(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    move-result-object v11

    invoke-static {v11}, LQ;->j(Landroid/graphics/fonts/FontFamily$Builder;)Landroid/graphics/fonts/FontFamily;

    move-result-object v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_7
    invoke-static {v12}, LQ;->i(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    move-result-object v11

    invoke-static {v11}, LQ;->j(Landroid/graphics/fonts/FontFamily$Builder;)Landroid/graphics/fonts/FontFamily;

    move-result-object v11

    :goto_3
    if-nez v10, :cond_8

    invoke-static {v11}, LQ;->c(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    move-result-object v10

    goto :goto_4

    :cond_8
    invoke-static {v10, v11}, LQ;->o(Landroid/graphics/Typeface$CustomFallbackBuilder;Landroid/graphics/fonts/FontFamily;)V

    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    :goto_5
    invoke-static {v10}, LQ;->d(Landroid/graphics/Typeface$CustomFallbackBuilder;)Landroid/graphics/Typeface;

    move-result-object v2

    :goto_6
    if-eqz v2, :cond_b

    if-eqz v1, :cond_a

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Ln3;

    invoke-direct {v0, v3, v1, v2}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_a
    sget-object p0, LUB;->b:LDp;

    invoke-static/range {p2 .. p6}, LUB;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, LDp;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_b
    if-eqz p8, :cond_d

    iget v2, v0, LXh;->c:I

    if-nez v2, :cond_c

    :goto_7
    move v2, v8

    goto :goto_8

    :cond_c
    move v2, v9

    goto :goto_8

    :cond_d
    if-nez v1, :cond_c

    goto :goto_7

    :goto_8
    const/4 v3, -0x1

    if-eqz p8, :cond_e

    iget v5, v0, LXh;->b:I

    move v10, v5

    goto :goto_9

    :cond_e
    move v10, v3

    :goto_9
    new-instance v5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v11

    invoke-direct {v5, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v11, LXm;

    const/16 v12, 0x11

    invoke-direct {v11, v12, v9}, LXm;-><init>(IZ)V

    iput-object v1, v11, LXm;->b:Ljava/lang/Object;

    iget-object v0, v0, LXh;->a:Ljava/util/ArrayList;

    new-instance v12, LP3;

    new-instance v1, Ldw;

    invoke-direct {v1, v5}, Ldw;-><init>(Landroid/os/Handler;)V

    const/16 v5, 0x9

    invoke-direct {v12, v5, v11, v1}, LP3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    if-eqz v2, :cond_12

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt v2, v8, :cond_11

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh;

    sget-object v2, LTh;->a:LDp;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v2

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v2, v2, v9

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {v4, v2}, LTh;->a(ILjava/util/List;)Ljava/lang/String;

    move-result-object v2

    sget-object v5, LTh;->a:LDp;

    invoke-virtual {v5, v2}, LDp;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Typeface;

    if-eqz v5, :cond_f

    new-instance p0, LB0;

    invoke-direct {p0, v11, v5, v8, v9}, LB0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    invoke-virtual {v1, p0}, Ldw;->execute(Ljava/lang/Runnable;)V

    move-object v7, v5

    goto/16 :goto_d

    :cond_f
    if-ne v10, v3, :cond_10

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v0, v0, v9

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v2, p0, v0, v4}, LTh;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)LSh;

    move-result-object p0

    invoke-virtual {v12, p0}, LP3;->L(LSh;)V

    iget-object v7, p0, LSh;->a:Landroid/graphics/Typeface;

    goto/16 :goto_d

    :cond_10
    move-object v3, v0

    new-instance v0, LQh;

    const/4 v5, 0x0

    move-object v1, v2

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LQh;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    :try_start_1
    sget-object p0, LTh;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4

    int-to-long v0, v10

    :try_start_2
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    check-cast p0, LSh;

    invoke-virtual {v12, p0}, LP3;->L(LSh;)V

    iget-object v7, p0, LSh;->a:Landroid/graphics/Typeface;

    goto/16 :goto_d

    :catch_1
    move-exception v0

    move-object p0, v0

    goto :goto_a

    :catch_2
    move-exception v0

    move-object p0, v0

    goto :goto_b

    :catch_3
    new-instance p0, Ljava/lang/InterruptedException;

    const-string v0, "timeout"

    invoke-direct {p0, v0}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_a
    throw p0

    :goto_b
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    :catch_4
    iget-object p0, v12, LP3;->c:Ljava/lang/Object;

    check-cast p0, Ldw;

    iget-object v0, v12, LP3;->b:Ljava/lang/Object;

    check-cast v0, LXm;

    new-instance v1, LH6;

    invoke-direct {v1, v6, v9, v0}, LH6;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p0, v1}, Ldw;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_d

    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Fallbacks with blocking fetches are not supported for performance reasons"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_12
    invoke-static {v4, v0}, LTh;->a(ILjava/util/List;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, LTh;->a:LDp;

    invoke-virtual {v3, v2}, LDp;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Typeface;

    if-eqz v3, :cond_13

    new-instance p0, LB0;

    invoke-direct {p0, v11, v3, v8, v9}, LB0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    invoke-virtual {v1, p0}, Ldw;->execute(Ljava/lang/Runnable;)V

    move-object v7, v3

    goto :goto_d

    :cond_13
    new-instance v1, LRh;

    invoke-direct {v1, v9, v12}, LRh;-><init>(ILjava/lang/Object;)V

    sget-object v5, LTh;->c:Ljava/lang/Object;

    monitor-enter v5

    :try_start_4
    sget-object v3, LTh;->d:Lsy;

    invoke-virtual {v3, v2}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    if-eqz v6, :cond_14

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v5

    goto :goto_d

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_e

    :cond_14
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v2, v6}, Lsy;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v3, v0

    new-instance v0, LQh;

    const/4 v5, 0x1

    move-object v1, v2

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LQh;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    sget-object p0, LTh;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, LRh;

    invoke-direct {v2, v8, v1}, LRh;-><init>(ILjava/lang/Object;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-nez v1, :cond_15

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_c

    :cond_15
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    :goto_c
    new-instance v3, Lew;

    invoke-direct {v3}, Lew;-><init>()V

    iput-object v0, v3, Lew;->b:Ljava/lang/Object;

    iput-object v2, v3, Lew;->c:Ljava/lang/Object;

    iput-object v1, v3, Lew;->d:Ljava/lang/Object;

    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :goto_d
    move-object p0, v7

    move-object/from16 v7, p2

    goto :goto_f

    :goto_e
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p0

    :cond_16
    sget-object v5, LUB;->a:Lcr;

    move-object v0, p1

    check-cast v0, LVh;

    move-object/from16 v7, p2

    invoke-virtual {v5, p0, v0, v7, v4}, Lcr;->q(Landroid/content/Context;LVh;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz v1, :cond_18

    if-eqz p0, :cond_17

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Ln3;

    invoke-direct {v2, v3, v1, p0}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_f

    :cond_17
    invoke-virtual {v1, v6}, LNj;->c(I)V

    :cond_18
    :goto_f
    if-eqz p0, :cond_19

    sget-object v0, LUB;->b:LDp;

    invoke-static/range {p2 .. p6}, LUB;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, LDp;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_19
    return-object p0
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

.method public static c(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    if-eqz p0, :cond_1

    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 2

    sget-object v0, LUB;->c:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sput-object v0, LUB;->c:Landroid/graphics/Paint;

    :cond_0
    sget-object v0, LUB;->c:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    sget-object v0, LUB;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    sget-object p0, LUB;->c:Landroid/graphics/Paint;

    invoke-static {p0}, LW5;->h(Landroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    move-result-object p0

    invoke-static {p0}, LW5;->b(Landroid/graphics/text/PositionedGlyphs;)I

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-static {p0}, LW5;->g(Landroid/graphics/text/PositionedGlyphs;)Landroid/graphics/fonts/Font;

    move-result-object p0

    return-object p0
.end method
