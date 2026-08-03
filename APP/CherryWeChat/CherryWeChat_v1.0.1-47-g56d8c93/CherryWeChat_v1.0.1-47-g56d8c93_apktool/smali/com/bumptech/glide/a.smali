.class public final Lcom/bumptech/glide/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile h:Lcom/bumptech/glide/a;

.field public static volatile i:Z


# instance fields
.field public final a:LN5;

.field public final b:LEp;

.field public final c:LRj;

.field public final d:Lzp;

.field public final e:Lkw;

.field public final f:Lm6;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcg;LEp;LN5;Lzp;Lkw;Lm6;LPg;LM4;Ljava/util/List;Ljava/util/ArrayList;LDc;LD2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/bumptech/glide/a;->a:LN5;

    iput-object p5, p0, Lcom/bumptech/glide/a;->d:Lzp;

    iput-object p3, p0, Lcom/bumptech/glide/a;->b:LEp;

    iput-object p6, p0, Lcom/bumptech/glide/a;->e:Lkw;

    iput-object p7, p0, Lcom/bumptech/glide/a;->f:Lm6;

    new-instance p4, Lwy;

    invoke-direct {p4, p0, p11, p12}, Lwy;-><init>(Lcom/bumptech/glide/a;Ljava/util/ArrayList;LDc;)V

    move-object p3, p5

    new-instance p5, LPg;

    const/16 p6, 0xe

    invoke-direct {p5, p6}, LPg;-><init>(I)V

    move-object p7, p9

    move-object p9, p2

    move-object p2, p1

    new-instance p1, LRj;

    move-object p6, p8

    move-object p8, p10

    move-object p10, p13

    invoke-direct/range {p1 .. p10}, LRj;-><init>(Landroid/content/Context;Lzp;Lwy;LPg;LPg;LM4;Ljava/util/List;Lcg;LD2;)V

    iput-object p1, p0, Lcom/bumptech/glide/a;->c:LRj;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/bumptech/glide/a;
    .locals 3

    sget-object v0, Lcom/bumptech/glide/a;->h:Lcom/bumptech/glide/a;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :try_start_0
    const-string v1, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lcom/bumptech/glide/a;

    monitor-enter v1

    :try_start_1
    sget-object v2, Lcom/bumptech/glide/a;->h:Lcom/bumptech/glide/a;

    if-nez v2, :cond_1

    sget-boolean v2, Lcom/bumptech/glide/a;->i:Z

    if-nez v2, :cond_0

    const/4 v2, 0x1

    sput-boolean v2, Lcom/bumptech/glide/a;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x0

    :try_start_2
    invoke-static {p0, v0}, Lcom/bumptech/glide/a;->b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    sput-boolean v2, Lcom/bumptech/glide/a;->i:Z

    goto :goto_1

    :catchall_0
    move-exception p0

    sput-boolean v2, Lcom/bumptech/glide/a;->i:Z

    throw p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Glide has been called recursively, this is probably an internal library error!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_1
    monitor-exit v1

    goto :goto_2

    :catchall_1
    move-exception p0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0

    :cond_2
    :goto_2
    sget-object p0, Lcom/bumptech/glide/a;->h:Lcom/bumptech/glide/a;

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 27

    new-instance v9, LM4;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Lsy;-><init>(I)V

    new-instance v1, Lyc;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lyc;-><init>(I)V

    new-instance v8, LPg;

    const/16 v2, 0xc

    invoke-direct {v8, v2}, LPg;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x2

    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x80

    invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v5, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "ManifestParser"

    invoke-static {v5, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    iget-object v5, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v5}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "GlideModule"

    iget-object v10, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v10, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v6}, LPj;->u(Ljava/lang/String;)V

    const/4 v4, 0x0

    throw v4
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_5
    :goto_2
    const-string v4, "Glide"

    const/4 v5, 0x3

    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_7
    :goto_3
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_13

    new-instance v4, LL0;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, LL0;-><init>(I)V

    sget v5, LWj;->c:I

    const/4 v6, 0x4

    if-nez v5, :cond_8

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v5

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sput v5, LWj;->c:I

    :cond_8
    sget v13, LWj;->c:I

    const-string v5, "source"

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_12

    new-instance v12, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v19, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v18, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct/range {v18 .. v18}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v7, LVj;

    invoke-direct {v7, v4, v5, v0}, LVj;-><init>(LL0;Ljava/lang/String;Z)V

    const-wide/16 v15, 0x0

    move v14, v13

    move-object/from16 v17, v19

    move-object/from16 v19, v7

    invoke-direct/range {v12 .. v19}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object/from16 v19, v17

    new-instance v4, LWj;

    invoke-direct {v4, v12}, LWj;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    new-instance v5, LL0;

    const/4 v7, 0x1

    invoke-direct {v5, v7}, LL0;-><init>(I)V

    const-string v7, "disk-cache"

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_11

    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v10, LVj;

    const/4 v15, 0x1

    invoke-direct {v10, v5, v7, v15}, LVj;-><init>(LL0;Ljava/lang/String;Z)V

    const-wide/16 v17, 0x0

    move/from16 v16, v15

    move-object/from16 v21, v10

    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v5, LWj;

    invoke-direct {v5, v14}, LWj;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    sget v7, LWj;->c:I

    if-nez v7, :cond_9

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    sput v7, LWj;->c:I

    :cond_9
    sget v7, LWj;->c:I

    const/4 v10, 0x1

    if-lt v7, v6, :cond_a

    move v15, v3

    goto :goto_4

    :cond_a
    move v15, v10

    :goto_4
    new-instance v3, LL0;

    const/4 v6, 0x1

    invoke-direct {v3, v6}, LL0;-><init>(I)V

    const-string v6, "animation"

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_10

    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v7, LVj;

    invoke-direct {v7, v3, v6, v10}, LVj;-><init>(LL0;Ljava/lang/String;Z)V

    const-wide/16 v17, 0x0

    move/from16 v16, v15

    move-object/from16 v21, v7

    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v3, LWj;

    invoke-direct {v3, v14}, LWj;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    new-instance v6, Lgr;

    invoke-direct {v6, v2}, Lgr;-><init>(Landroid/content/Context;)V

    new-instance v7, Lhr;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iget-object v10, v6, Lgr;->a:Landroid/content/Context;

    iget v12, v6, Lgr;->d:F

    iget-object v13, v6, Lgr;->b:Landroid/app/ActivityManager;

    invoke-virtual {v13}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v14

    if-eqz v14, :cond_b

    const/high16 v14, 0x200000

    goto :goto_5

    :cond_b
    const/high16 v14, 0x400000

    :goto_5
    iput v14, v7, Lhr;->c:I

    invoke-virtual {v13}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v15

    const/high16 v16, 0x100000

    mul-int v15, v15, v16

    invoke-virtual {v13}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v16

    int-to-float v15, v15

    if-eqz v16, :cond_c

    const v16, 0x3ea8f5c3    # 0.33f

    goto :goto_6

    :cond_c
    const v16, 0x3ecccccd    # 0.4f

    :goto_6
    mul-float v15, v15, v16

    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    move-result v15

    iget-object v6, v6, Lgr;->c:LXm;

    iget-object v6, v6, LXm;->b:Ljava/lang/Object;

    check-cast v6, Landroid/util/DisplayMetrics;

    iget v0, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/2addr v0, v6

    mul-int/lit8 v0, v0, 0x4

    int-to-float v0, v0

    mul-float v6, v0, v12

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    const/high16 v17, 0x40000000    # 2.0f

    mul-float v0, v0, v17

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    move-object/from16 v26, v3

    sub-int v3, v15, v14

    move-object/from16 v24, v4

    add-int v4, v0, v6

    if-gt v4, v3, :cond_d

    iput v0, v7, Lhr;->b:I

    iput v6, v7, Lhr;->a:I

    goto :goto_7

    :cond_d
    int-to-float v0, v3

    add-float v3, v12, v17

    div-float/2addr v0, v3

    mul-float v17, v17, v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    move-result v3

    iput v3, v7, Lhr;->b:I

    mul-float/2addr v0, v12

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, v7, Lhr;->a:I

    :goto_7
    const-string v0, "MemorySizeCalculator"

    const/4 v3, 0x3

    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_e

    iget v0, v7, Lhr;->b:I

    int-to-long v3, v0

    invoke-static {v10, v3, v4}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    iget v0, v7, Lhr;->a:I

    int-to-long v3, v0

    invoke-static {v10, v3, v4}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    int-to-long v3, v14

    invoke-static {v10, v3, v4}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    int-to-long v3, v15

    invoke-static {v10, v3, v4}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    invoke-virtual {v13}, Landroid/app/ActivityManager;->getMemoryClass()I

    invoke-virtual {v13}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    :cond_e
    new-instance v0, Lm6;

    const/16 v3, 0xa

    invoke-direct {v0, v3}, Lm6;-><init>(I)V

    iget v3, v7, Lhr;->a:I

    if-lez v3, :cond_f

    new-instance v4, LAp;

    int-to-long v12, v3

    invoke-direct {v4, v12, v13}, LAp;-><init>(J)V

    :goto_8
    move-object/from16 v23, v5

    goto :goto_9

    :cond_f
    new-instance v4, Lgf;

    const/16 v3, 0x18

    invoke-direct {v4, v3}, Lgf;-><init>(I)V

    goto :goto_8

    :goto_9
    new-instance v5, Lzp;

    iget v3, v7, Lhr;->c:I

    invoke-direct {v5, v3}, Lzp;-><init>(I)V

    new-instance v3, LEp;

    iget v6, v7, Lhr;->b:I

    int-to-long v6, v6

    invoke-direct {v3, v6, v7}, LCp;-><init>(J)V

    new-instance v6, LD2;

    invoke-direct {v6, v2}, LD2;-><init>(Landroid/content/Context;)V

    new-instance v7, Lcg;

    new-instance v10, LWj;

    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-wide v17, LWj;->b:J

    new-instance v20, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    new-instance v12, LVj;

    new-instance v13, LL0;

    const/4 v15, 0x1

    invoke-direct {v13, v15}, LL0;-><init>(I)V

    const-string v15, "source-unlimited"

    move-object/from16 p0, v0

    const/4 v0, 0x0

    invoke-direct {v12, v13, v15, v0}, LVj;-><init>(LL0;Ljava/lang/String;Z)V

    const/4 v15, 0x0

    const v16, 0x7fffffff

    move-object/from16 v21, v12

    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {v10, v14}, LWj;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    move-object/from16 v21, v3

    move-object/from16 v22, v6

    move-object/from16 v20, v7

    move-object/from16 v25, v10

    invoke-direct/range {v20 .. v26}, Lcg;-><init>(LEp;LD2;LWj;LWj;LWj;LWj;)V

    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v13, LD2;

    invoke-direct {v13, v1}, LD2;-><init>(Lyc;)V

    new-instance v6, Lkw;

    invoke-direct {v6}, Lkw;-><init>()V

    new-instance v0, Lcom/bumptech/glide/a;

    move-object/from16 v7, p0

    move-object/from16 v12, p1

    move-object v1, v2

    move-object/from16 v2, v20

    invoke-direct/range {v0 .. v13}, Lcom/bumptech/glide/a;-><init>(Landroid/content/Context;Lcg;LEp;LN5;Lzp;Lkw;Lm6;LPg;LM4;Ljava/util/List;Ljava/util/ArrayList;LDc;LD2;)V

    invoke-virtual {v1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    sput-object v0, Lcom/bumptech/glide/a;->h:Lcom/bumptech/glide/a;

    return-void

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: animation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: disk-cache"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: source"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method

.method public static c(Landroid/content/Context;)Lgw;
    .locals 1

    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    invoke-static {v0, p0}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v0

    iget-object v0, v0, Lcom/bumptech/glide/a;->e:Lkw;

    invoke-virtual {v0, p0}, Lkw;->d(Landroid/content/Context;)Lgw;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/View;)Lgw;
    .locals 14

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    invoke-static {v1, v0}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v0

    iget-object v0, v0, Lcom/bumptech/glide/a;->e:Lkw;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LvD;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkw;->d(Landroid/content/Context;)Lgw;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "Unable to obtain a request manager for a view without a Context"

    invoke-static {v2, v1}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkw;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkw;->d(Landroid/content/Context;)Lgw;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v2, v1, Lki;

    if-eqz v2, :cond_c

    check-cast v1, Lki;

    iget-object v2, v0, Lkw;->b:LM4;

    invoke-virtual {v2}, Lsy;->clear()V

    invoke-virtual {v1}, Lki;->getSupportFragmentManager()Lzi;

    move-result-object v5

    iget-object v5, v5, Lzi;->c:Lqs;

    invoke-virtual {v5}, Lqs;->t()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v2}, Lkw;->b(Ljava/util/List;LM4;)V

    const v5, 0x1020002

    invoke-virtual {v1, v5}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/4 v6, 0x0

    move-object v7, v6

    :goto_1
    invoke-virtual {p0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-virtual {v2, p0}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lhi;

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    instance-of v8, v8, Landroid/view/View;

    if-eqz v8, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    goto :goto_1

    :cond_4
    :goto_2
    invoke-virtual {v2}, Lsy;->clear()V

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lhi;->d()Landroid/content/Context;

    move-result-object p0

    const-string v1, "You cannot start a load on a fragment before it is attached or after it is destroyed"

    invoke-static {v1, p0}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p0, v1, :cond_5

    move p0, v4

    goto :goto_3

    :cond_5
    move p0, v3

    :goto_3
    if-nez p0, :cond_6

    invoke-virtual {v7}, Lhi;->d()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkw;->d(Landroid/content/Context;)Lgw;

    move-result-object p0

    return-object p0

    :cond_6
    iget-object p0, v7, Lhi;->s:Lji;

    if-nez p0, :cond_7

    move-object v1, v6

    goto :goto_4

    :cond_7
    iget-object v1, p0, Lji;->l:Lc3;

    :goto_4
    if-eqz v1, :cond_9

    iget-object v1, v0, Lkw;->c:LOi;

    if-nez p0, :cond_8

    goto :goto_5

    :cond_8
    iget-object v6, p0, Lji;->l:Lc3;

    :goto_5
    invoke-interface {v1, v6}, LOi;->a(Lki;)V

    :cond_9
    invoke-virtual {v7}, Lhi;->c()Lzi;

    move-result-object v12

    invoke-virtual {v7}, Lhi;->d()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v10

    iget-object v8, v0, Lkw;->d:LP3;

    iget-object v11, v7, Lhi;->M:Lao;

    invoke-virtual {v7}, Lhi;->i()Z

    move-result p0

    if-eqz p0, :cond_a

    invoke-virtual {v7}, Lhi;->j()Z

    move-result p0

    if-nez p0, :cond_a

    iget-object p0, v7, Lhi;->E:Landroid/view/View;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    if-eqz p0, :cond_a

    iget-object p0, v7, Lhi;->E:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_a

    move v13, v4

    goto :goto_6

    :cond_a
    move v13, v3

    :goto_6
    invoke-virtual/range {v8 .. v13}, LP3;->E(Landroid/content/Context;Lcom/bumptech/glide/a;LRn;Lzi;Z)Lgw;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-virtual {v0, v1}, Lkw;->c(Lki;)Lgw;

    move-result-object p0

    return-object p0

    :cond_c
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkw;->d(Landroid/content/Context;)Lgw;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    invoke-static {}, LvD;->a()V

    iget-object v0, p0, Lcom/bumptech/glide/a;->b:LEp;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, LCp;->e(J)V

    iget-object v0, p0, Lcom/bumptech/glide/a;->a:LN5;

    invoke-interface {v0}, LN5;->m()V

    iget-object v0, p0, Lcom/bumptech/glide/a;->d:Lzp;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Lzp;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final onTrimMemory(I)V
    .locals 8

    invoke-static {}, LvD;->a()V

    iget-object v0, p0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgw;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/bumptech/glide/a;->b:LEp;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xf

    const/16 v2, 0x14

    const/16 v3, 0x28

    if-lt p1, v3, :cond_1

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v4, v5}, LCp;->e(J)V

    goto :goto_1

    :cond_1
    if-ge p1, v2, :cond_2

    if-ne p1, v0, :cond_3

    :cond_2
    monitor-enter v1

    :try_start_1
    iget-wide v4, v1, LCp;->a:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    monitor-exit v1

    const-wide/16 v6, 0x2

    div-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, LCp;->e(J)V

    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/bumptech/glide/a;->a:LN5;

    invoke-interface {v1, p1}, LN5;->k(I)V

    iget-object v4, p0, Lcom/bumptech/glide/a;->d:Lzp;

    monitor-enter v4

    if-lt p1, v3, :cond_4

    :try_start_2
    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 p1, 0x0

    :try_start_3
    invoke-virtual {v4, p1}, Lzp;->b(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1

    :cond_4
    if-ge p1, v2, :cond_5

    if-ne p1, v0, :cond_6

    :cond_5
    iget p1, v4, Lzp;->e:I

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {v4, p1}, Lzp;->b(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_6
    :goto_2
    monitor-exit v4

    return-void

    :catchall_2
    move-exception p1

    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1

    :catchall_3
    move-exception p1

    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw p1

    :goto_3
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw p1
.end method
