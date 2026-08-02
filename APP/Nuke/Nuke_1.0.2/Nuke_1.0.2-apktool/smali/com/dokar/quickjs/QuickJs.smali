.class public final Lcom/dokar/quickjs/QuickJs;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final Companion:Ls42;


# instance fields
.field private final asyncJobs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk21;",
            ">;"
        }
    .end annotation
.end field

.field private context:J

.field private final coroutineScope:Lj20;

.field private evalException:Ljava/lang/Throwable;

.field private final exceptionHandler:Ld20;

.field private final globalFunctions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lsk;",
            ">;"
        }
    .end annotation
.end field

.field private globals:J

.field private isClosed:Z

.field private final jobDispatcher:Lc20;

.field private final jobsMutex:Lil1;

.field private final jsMutex:Lil1;

.field private final jsResultMutex:Lil1;

.field private maxStackSize:J

.field private memoryLimit:J

.field private final modules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private final objectBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Les1;",
            ">;"
        }
    .end annotation
.end field

.field private runtime:J

.field private final typeConverters:Lz53;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ls42;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/dokar/quickjs/QuickJs;->Companion:Ls42;

    .line 7
    .line 8
    sget-object v0, Lsn;->N:Lsn;

    .line 9
    .line 10
    const-string v1, "quickjs"

    .line 11
    .line 12
    const-string v2, "Cannot find a suitable QuickJS binary at the configured path (com.dokar.quickjs.library.path = "

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    const-string v3, "com.dokar.quickjs.library.path"

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "com.dokar.quickjs.library.name"

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    new-instance v1, Ljava/io/File;

    .line 32
    .line 33
    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Ljava/lang/System;->load(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, "). File "

    .line 62
    .line 63
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, " does not exist."

    .line 70
    .line 71
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :cond_1
    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :goto_0
    monitor-exit v0

    .line 94
    throw v1
.end method

.method private constructor <init>(Lc20;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jobDispatcher:Lc20;

    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/dokar/quickjs/QuickJs;->objectBindings:Ljava/util/Map;

    .line 12
    .line 13
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/dokar/quickjs/QuickJs;->globalFunctions:Ljava/util/Map;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/dokar/quickjs/QuickJs;->modules:Ljava/util/List;

    .line 26
    .line 27
    new-instance v0, Ly42;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Ly42;-><init>(Lcom/dokar/quickjs/QuickJs;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/dokar/quickjs/QuickJs;->exceptionHandler:Ld20;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v0}, Lxe1;->f0(Ly10;La20;)La20;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lte;->e(La20;)Ls00;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->coroutineScope:Lj20;

    .line 46
    .line 47
    new-instance p1, Lkl1;

    .line 48
    .line 49
    invoke-direct {p1}, Lkl1;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 53
    .line 54
    new-instance p1, Lkl1;

    .line 55
    .line 56
    invoke-direct {p1}, Lkl1;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jsResultMutex:Lil1;

    .line 60
    .line 61
    new-instance p1, Lkl1;

    .line 62
    .line 63
    invoke-direct {p1}, Lkl1;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jobsMutex:Lil1;

    .line 67
    .line 68
    new-instance p1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->asyncJobs:Ljava/util/List;

    .line 74
    .line 75
    new-instance p1, Lz53;

    .line 76
    .line 77
    invoke-direct {p1}, Lz53;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->typeConverters:Lz53;

    .line 81
    .line 82
    const-wide/16 v0, -0x1

    .line 83
    .line 84
    iput-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->memoryLimit:J

    .line 85
    .line 86
    const-wide/32 v0, 0x40000

    .line 87
    .line 88
    .line 89
    iput-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->maxStackSize:J

    .line 90
    .line 91
    :try_start_0
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->newRuntime()J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    iput-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J

    .line 96
    .line 97
    invoke-direct {p0, v0, v1}, Lcom/dokar/quickjs/QuickJs;->newContext(J)J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    iput-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 102
    .line 103
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J

    .line 104
    .line 105
    const-class p1, La83;

    .line 106
    .line 107
    const-class v2, Lkotlin/UByteArray;

    .line 108
    .line 109
    filled-new-array {p1, v2}, [Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-direct {p0, v0, v1, p1}, Lcom/dokar/quickjs/QuickJs;->initGlobals(J[Ljava/lang/Class;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    iput-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->globals:J
    :try_end_0
    .catch Lcom/dokar/quickjs/QuickJsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    return-void

    .line 120
    :catch_0
    move-exception p1

    .line 121
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->close()V

    .line 122
    .line 123
    .line 124
    throw p1
.end method

.method public synthetic constructor <init>(Lc20;Lc50;)V
    .locals 0

    .line 125
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJs;-><init>(Lc20;)V

    return-void
.end method

.method public static final synthetic access$awaitAsyncJobs(Lcom/dokar/quickjs/QuickJs;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJs;->awaitAsyncJobs(Lt00;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$evalAndAwait(Lcom/dokar/quickjs/QuickJs;Lin0;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/dokar/quickjs/QuickJs;->evalAndAwait(Lin0;Lt00;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$evaluate(Lcom/dokar/quickjs/QuickJs;JJLjava/lang/String;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/dokar/quickjs/QuickJs;->evaluate(JJLjava/lang/String;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$evaluateBytecode(Lcom/dokar/quickjs/QuickJs;JJ[B)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/dokar/quickjs/QuickJs;->evaluateBytecode(JJ[B)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$executePendingJob(Lcom/dokar/quickjs/QuickJs;JJ)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/dokar/quickjs/QuickJs;->executePendingJob(JJ)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$getContext$p(Lcom/dokar/quickjs/QuickJs;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getEvalException$p(Lcom/dokar/quickjs/QuickJs;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getGlobals$p(Lcom/dokar/quickjs/QuickJs;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getJsMutex$p(Lcom/dokar/quickjs/QuickJs;)Lil1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$invokeJsFunction(Lcom/dokar/quickjs/QuickJs;JJJ[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/dokar/quickjs/QuickJs;->invokeJsFunction(JJJ[Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$loadModules(Lcom/dokar/quickjs/QuickJs;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJs;->loadModules(Lt00;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setEvalException$p(Lcom/dokar/quickjs/QuickJs;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-void
.end method

.method private final awaitAsyncJobs(Lt00;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt00<",
            "-",
            "La83;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lt42;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lt42;

    .line 7
    .line 8
    iget v1, v0, Lt42;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lt42;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lt42;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lt42;-><init>(Lcom/dokar/quickjs/QuickJs;Lt00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lt42;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lt42;->n:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    sget-object v6, Lk20;->h:Lk20;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v4, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object v1, v0, Lt42;->k:Lil1;

    .line 44
    .line 45
    check-cast v1, Ljava/util/List;

    .line 46
    .line 47
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_2
    iget-object v1, v0, Lt42;->k:Lil1;

    .line 58
    .line 59
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    iget-object v1, v0, Lt42;->k:Lil1;

    .line 64
    .line 65
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 73
    .line 74
    iput-object p1, v0, Lt42;->k:Lil1;

    .line 75
    .line 76
    iput v4, v0, Lt42;->n:I

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    check-cast v1, Lkl1;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v6, :cond_5

    .line 86
    .line 87
    goto :goto_6

    .line 88
    :cond_5
    :goto_1
    :try_start_0
    iget-boolean p1, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 89
    .line 90
    if-nez p1, :cond_7

    .line 91
    .line 92
    :cond_6
    iget-wide v7, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 93
    .line 94
    iget-wide v9, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 95
    .line 96
    invoke-direct {p0, v7, v8, v9, v10}, Lcom/dokar/quickjs/QuickJs;->executePendingJob(JJ)Z

    .line 97
    .line 98
    .line 99
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    goto :goto_8

    .line 105
    :cond_7
    :goto_2
    check-cast v1, Lkl1;

    .line 106
    .line 107
    invoke-virtual {v1, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_8
    :goto_3
    iget-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jobsMutex:Lil1;

    .line 111
    .line 112
    iput-object p1, v0, Lt42;->k:Lil1;

    .line 113
    .line 114
    iput v3, v0, Lt42;->n:I

    .line 115
    .line 116
    move-object v1, p1

    .line 117
    check-cast v1, Lkl1;

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-ne p1, v6, :cond_9

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_9
    :goto_4
    :try_start_1
    iget-object p1, p0, Lcom/dokar/quickjs/QuickJs;->asyncJobs:Ljava/util/List;

    .line 127
    .line 128
    new-instance v4, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_a
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_b

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    move-object v8, v7

    .line 148
    check-cast v8, Lk21;

    .line 149
    .line 150
    invoke-interface {v8}, Lk21;->b()Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-eqz v8, :cond_a

    .line 155
    .line 156
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :catchall_1
    move-exception p0

    .line 161
    goto :goto_7

    .line 162
    :cond_b
    check-cast v1, Lkl1;

    .line 163
    .line 164
    invoke-virtual {v1, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_c

    .line 172
    .line 173
    sget-object p0, La83;->a:La83;

    .line 174
    .line 175
    return-object p0

    .line 176
    :cond_c
    iput-object v5, v0, Lt42;->k:Lil1;

    .line 177
    .line 178
    iput v2, v0, Lt42;->n:I

    .line 179
    .line 180
    invoke-static {v4, v0}, Lop0;->t(Ljava/util/ArrayList;Lu00;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-ne p1, v6, :cond_8

    .line 185
    .line 186
    :goto_6
    return-object v6

    .line 187
    :goto_7
    check-cast v1, Lkl1;

    .line 188
    .line 189
    invoke-virtual {v1, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    throw p0

    .line 193
    :goto_8
    check-cast v1, Lkl1;

    .line 194
    .line 195
    invoke-virtual {v1, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    throw p0
.end method

.method public static synthetic b(Lcom/dokar/quickjs/QuickJs;Lzt2;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/dokar/quickjs/QuickJs;->invokeAsyncFunction$lambda$1(Lcom/dokar/quickjs/QuickJs;Lk21;Ljava/lang/Throwable;)La83;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final clearHandledPromiseRejection()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 8
    .line 9
    return-void
.end method

.method private final native compile(JJLjava/lang/String;Ljava/lang/String;Z)[B
.end method

.method public static synthetic compile$default(Lcom/dokar/quickjs/QuickJs;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)[B
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const-string p2, "main.js"

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/dokar/quickjs/QuickJs;->compile(Ljava/lang/String;Ljava/lang/String;Z)[B

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic defineBinding-NW8rdx8$default(Lcom/dokar/quickjs/QuickJs;Ljava/lang/String;Les1;JILjava/lang/Object;)J
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x4

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const-wide/16 p3, -0x1

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/dokar/quickjs/QuickJs;->defineBinding-NW8rdx8(Ljava/lang/String;Les1;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private final native defineFunction(JJLjava/lang/String;Z)V
.end method

.method private final native defineObject(JJJLjava/lang/String;[Lcom/dokar/quickjs/binding/JsProperty;[Lcom/dokar/quickjs/binding/JsFunction;)J
.end method

.method private final ensureNotClosed()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 20
    .line 21
    cmp-long p0, v0, v2

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p0, Lcom/dokar/quickjs/QuickJsException;

    .line 27
    .line 28
    const-string v0, "Already closed."

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method private final evalAndAwait(Lin0;Lt00;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lin0;",
            "Lt00<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lu42;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lu42;

    .line 7
    .line 8
    iget v1, v0, Lu42;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lu42;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu42;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lu42;-><init>(Lcom/dokar/quickjs/QuickJs;Lt00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lu42;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lu42;->s:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    sget-object v4, Lk20;->h:Lk20;

    .line 32
    .line 33
    packed-switch v1, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :pswitch_0
    iget-object p1, v0, Lu42;->m:Lil1;

    .line 43
    .line 44
    iget-object v0, v0, Lu42;->l:Lil1;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto/16 :goto_b

    .line 53
    .line 54
    :pswitch_1
    iget p1, v0, Lu42;->o:I

    .line 55
    .line 56
    iget v1, v0, Lu42;->n:I

    .line 57
    .line 58
    iget-object v5, v0, Lu42;->l:Lil1;

    .line 59
    .line 60
    :try_start_1
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .line 62
    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :catchall_1
    move-exception p0

    .line 66
    move-object v0, v5

    .line 67
    goto/16 :goto_b

    .line 68
    .line 69
    :pswitch_2
    iget p1, v0, Lu42;->o:I

    .line 70
    .line 71
    iget v1, v0, Lu42;->n:I

    .line 72
    .line 73
    iget-object v5, v0, Lu42;->m:Lil1;

    .line 74
    .line 75
    iget-object v6, v0, Lu42;->l:Lil1;

    .line 76
    .line 77
    :try_start_2
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 78
    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :catchall_2
    move-exception p0

    .line 83
    move-object v0, v6

    .line 84
    goto/16 :goto_9

    .line 85
    .line 86
    :pswitch_3
    iget p1, v0, Lu42;->p:I

    .line 87
    .line 88
    iget v1, v0, Lu42;->o:I

    .line 89
    .line 90
    iget v5, v0, Lu42;->n:I

    .line 91
    .line 92
    iget-object v6, v0, Lu42;->m:Lil1;

    .line 93
    .line 94
    iget-object v7, v0, Lu42;->l:Lil1;

    .line 95
    .line 96
    iget-object v8, v0, Lu42;->k:Lin0;

    .line 97
    .line 98
    :try_start_3
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 99
    .line 100
    .line 101
    move p2, v5

    .line 102
    move-object v5, v6

    .line 103
    goto/16 :goto_3

    .line 104
    .line 105
    :catchall_3
    move-exception p0

    .line 106
    move-object v0, v7

    .line 107
    goto/16 :goto_b

    .line 108
    .line 109
    :pswitch_4
    iget p1, v0, Lu42;->n:I

    .line 110
    .line 111
    iget-object v1, v0, Lu42;->l:Lil1;

    .line 112
    .line 113
    iget-object v5, v0, Lu42;->k:Lin0;

    .line 114
    .line 115
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object p2, v1

    .line 119
    move-object v8, v5

    .line 120
    move v5, p1

    .line 121
    goto :goto_2

    .line 122
    :pswitch_5
    iget-object p1, v0, Lu42;->k:Lin0;

    .line 123
    .line 124
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :pswitch_6
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 132
    .line 133
    .line 134
    iput-object v3, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 135
    .line 136
    iput-object p1, v0, Lu42;->k:Lin0;

    .line 137
    .line 138
    const/4 p2, 0x1

    .line 139
    iput p2, v0, Lu42;->s:I

    .line 140
    .line 141
    invoke-direct {p0, v0}, Lcom/dokar/quickjs/QuickJs;->loadModules(Lt00;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    if-ne p2, v4, :cond_1

    .line 146
    .line 147
    goto/16 :goto_6

    .line 148
    .line 149
    :cond_1
    :goto_1
    iget-object p2, p0, Lcom/dokar/quickjs/QuickJs;->jsResultMutex:Lil1;

    .line 150
    .line 151
    iput-object p1, v0, Lu42;->k:Lin0;

    .line 152
    .line 153
    iput-object p2, v0, Lu42;->l:Lil1;

    .line 154
    .line 155
    iput v2, v0, Lu42;->n:I

    .line 156
    .line 157
    const/4 v1, 0x2

    .line 158
    iput v1, v0, Lu42;->s:I

    .line 159
    .line 160
    check-cast p2, Lkl1;

    .line 161
    .line 162
    invoke-virtual {p2, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-ne v1, v4, :cond_2

    .line 167
    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :cond_2
    move-object v8, p1

    .line 171
    move v5, v2

    .line 172
    :goto_2
    :try_start_4
    iget-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 173
    .line 174
    iput-object v8, v0, Lu42;->k:Lin0;

    .line 175
    .line 176
    iput-object p2, v0, Lu42;->l:Lil1;

    .line 177
    .line 178
    iput-object p1, v0, Lu42;->m:Lil1;

    .line 179
    .line 180
    iput v5, v0, Lu42;->n:I

    .line 181
    .line 182
    iput v2, v0, Lu42;->o:I

    .line 183
    .line 184
    iput v2, v0, Lu42;->p:I

    .line 185
    .line 186
    const/4 v1, 0x3

    .line 187
    iput v1, v0, Lu42;->s:I

    .line 188
    .line 189
    check-cast p1, Lkl1;

    .line 190
    .line 191
    invoke-virtual {p1, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    .line 195
    if-ne v1, v4, :cond_3

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_3
    move-object v7, p2

    .line 199
    move v1, v2

    .line 200
    move p2, v5

    .line 201
    move-object v5, p1

    .line 202
    move p1, v1

    .line 203
    :goto_3
    :try_start_5
    iput-object v3, v0, Lu42;->k:Lin0;

    .line 204
    .line 205
    iput-object v7, v0, Lu42;->l:Lil1;

    .line 206
    .line 207
    iput-object v5, v0, Lu42;->m:Lil1;

    .line 208
    .line 209
    iput p2, v0, Lu42;->n:I

    .line 210
    .line 211
    iput v1, v0, Lu42;->o:I

    .line 212
    .line 213
    iput p1, v0, Lu42;->p:I

    .line 214
    .line 215
    const/4 p1, 0x4

    .line 216
    iput p1, v0, Lu42;->s:I

    .line 217
    .line 218
    invoke-interface {v8, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 222
    if-ne p1, v4, :cond_4

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_4
    move p1, v1

    .line 226
    move-object v6, v7

    .line 227
    move v1, p2

    .line 228
    :goto_4
    :try_start_6
    check-cast v5, Lkl1;

    .line 229
    .line 230
    invoke-virtual {v5, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    iput-object v3, v0, Lu42;->k:Lin0;

    .line 234
    .line 235
    iput-object v6, v0, Lu42;->l:Lil1;

    .line 236
    .line 237
    iput-object v3, v0, Lu42;->m:Lil1;

    .line 238
    .line 239
    iput v1, v0, Lu42;->n:I

    .line 240
    .line 241
    iput p1, v0, Lu42;->o:I

    .line 242
    .line 243
    const/4 p2, 0x5

    .line 244
    iput p2, v0, Lu42;->s:I

    .line 245
    .line 246
    invoke-direct {p0, v0}, Lcom/dokar/quickjs/QuickJs;->awaitAsyncJobs(Lt00;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 250
    if-ne p2, v4, :cond_5

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_5
    move-object v5, v6

    .line 254
    :goto_5
    :try_start_7
    iget-object p2, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 255
    .line 256
    iput-object v3, v0, Lu42;->k:Lin0;

    .line 257
    .line 258
    iput-object v5, v0, Lu42;->l:Lil1;

    .line 259
    .line 260
    iput-object p2, v0, Lu42;->m:Lil1;

    .line 261
    .line 262
    iput v1, v0, Lu42;->n:I

    .line 263
    .line 264
    iput p1, v0, Lu42;->o:I

    .line 265
    .line 266
    iput v2, v0, Lu42;->p:I

    .line 267
    .line 268
    const/4 p1, 0x6

    .line 269
    iput p1, v0, Lu42;->s:I

    .line 270
    .line 271
    move-object p1, p2

    .line 272
    check-cast p1, Lkl1;

    .line 273
    .line 274
    invoke-virtual {p1, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 278
    if-ne p2, v4, :cond_6

    .line 279
    .line 280
    :goto_6
    return-object v4

    .line 281
    :cond_6
    move-object v0, v5

    .line 282
    :goto_7
    :try_start_8
    iget-boolean p2, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 283
    .line 284
    if-nez p2, :cond_7

    .line 285
    .line 286
    iget-wide v1, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 287
    .line 288
    iget-wide v4, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 289
    .line 290
    invoke-direct {p0, v1, v2, v4, v5}, Lcom/dokar/quickjs/QuickJs;->getEvaluateResult(JJ)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 294
    :try_start_9
    check-cast p1, Lkl1;

    .line 295
    .line 296
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 297
    .line 298
    .line 299
    check-cast v0, Lkl1;

    .line 300
    .line 301
    invoke-virtual {v0, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->handleException()V

    .line 305
    .line 306
    .line 307
    return-object p2

    .line 308
    :catchall_4
    move-exception p0

    .line 309
    goto :goto_8

    .line 310
    :cond_7
    :try_start_a
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 311
    .line 312
    const-string p2, "Already closed."

    .line 313
    .line 314
    invoke-direct {p0, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 318
    :goto_8
    :try_start_b
    check-cast p1, Lkl1;

    .line 319
    .line 320
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    throw p0

    .line 324
    :catchall_5
    move-exception p0

    .line 325
    move-object v0, v6

    .line 326
    goto :goto_b

    .line 327
    :catchall_6
    move-exception p0

    .line 328
    move-object v0, v7

    .line 329
    :goto_9
    check-cast v5, Lkl1;

    .line 330
    .line 331
    invoke-virtual {v5, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 335
    :goto_a
    move-object v0, p2

    .line 336
    goto :goto_b

    .line 337
    :catchall_7
    move-exception p0

    .line 338
    goto :goto_a

    .line 339
    :goto_b
    check-cast v0, Lkl1;

    .line 340
    .line 341
    invoke-virtual {v0, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    throw p0

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final native evaluate(JJLjava/lang/String;Ljava/lang/String;Z)Ljava/lang/Object;
.end method

.method public static evaluate$default(Lcom/dokar/quickjs/QuickJs;Ljava/lang/String;Ljava/lang/String;ZLt00;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-string p2, "main.js"

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/dokar/quickjs/QuickJs;->evaluateInternal(Ljava/lang/String;Ljava/lang/String;ZLt00;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lt11;->R()V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method private final native evaluateBytecode(JJ[B)Ljava/lang/Object;
.end method

.method private final native executePendingJob(JJ)Z
.end method

.method private final native gc(JJ)V
.end method

.method private final native getEvaluateResult(JJ)Ljava/lang/Object;
.end method

.method private final native getMemoryUsage(JJ)Lcom/dokar/quickjs/MemoryUsage;
.end method

.method public static synthetic getTypeConverters$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final handleException()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 8
    .line 9
    throw v0
.end method

.method private final native initGlobals(J[Ljava/lang/Class;)J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J[",
            "Ljava/lang/Class<",
            "*>;)J"
        }
    .end annotation
.end method

.method private static final invokeAsyncFunction$lambda$1(Lcom/dokar/quickjs/QuickJs;Lk21;Ljava/lang/Throwable;)La83;
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/dokar/quickjs/QuickJs;->jobsMutex:Lil1;

    .line 2
    .line 3
    :cond_0
    :try_start_0
    move-object v0, p2

    .line 4
    check-cast v0, Lkl1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkl1;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->asyncJobs:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lsp0;->l0(Lil1;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, La83;->a:La83;

    .line 21
    .line 22
    return-object p0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    invoke-static {p2}, Lsp0;->l0(Lil1;)V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method private final native invokeJsFunction(JJJ[Ljava/lang/Object;)V
.end method

.method private final loadModules(Lt00;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt00<",
            "-",
            "La83;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lx42;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lx42;

    .line 7
    .line 8
    iget v1, v0, Lx42;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lx42;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx42;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lx42;-><init>(Lcom/dokar/quickjs/QuickJs;Lt00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lx42;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lx42;->n:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lx42;->k:Lil1;

    .line 36
    .line 37
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 52
    .line 53
    iput-object p1, v0, Lx42;->k:Lil1;

    .line 54
    .line 55
    iput v2, v0, Lx42;->n:I

    .line 56
    .line 57
    check-cast p1, Lkl1;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lk20;->h:Lk20;

    .line 64
    .line 65
    if-ne v0, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/dokar/quickjs/QuickJs;->modules:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    move-object v9, v1

    .line 85
    check-cast v9, [B

    .line 86
    .line 87
    iget-wide v5, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 88
    .line 89
    iget-wide v7, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 90
    .line 91
    move-object v4, p0

    .line 92
    invoke-direct/range {v4 .. v9}, Lcom/dokar/quickjs/QuickJs;->evaluateBytecode(JJ[B)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-object p0, v4

    .line 96
    goto :goto_2

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    move-object p0, v0

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move-object v4, p0

    .line 101
    iget-object p0, v4, Lcom/dokar/quickjs/QuickJs;->modules:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 104
    .line 105
    .line 106
    sget-object p0, La83;->a:La83;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    check-cast p1, Lkl1;

    .line 109
    .line 110
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-object p0

    .line 114
    :goto_3
    check-cast p1, Lkl1;

    .line 115
    .line 116
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    throw p0
.end method

.method private final native nativeGetVersion()Ljava/lang/String;
.end method

.method private final native newContext(J)J
.end method

.method private final native newRuntime()J
.end method

.method private final onCallFunction(JLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    sget-object v1, La83;->a:La83;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "\'"

    .line 12
    .line 13
    if-nez v0, :cond_4

    .line 14
    .line 15
    iget-object p1, p0, Lcom/dokar/quickjs/QuickJs;->globalFunctions:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lsk;

    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    instance-of p2, p1, Lug;

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    new-instance p2, La2;

    .line 30
    .line 31
    const/16 p3, 0x16

    .line 32
    .line 33
    invoke-direct {p2, p1, v2, p3}, La2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p4, p2}, Lcom/dokar/quickjs/QuickJs;->invokeAsyncFunction$quickjs_release([Ljava/lang/Object;Lmn0;)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_0
    instance-of p0, p1, Lxn0;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    check-cast p1, Lxn0;

    .line 45
    .line 46
    invoke-interface {p1, p4}, Lxn0;->b([Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    instance-of p0, p1, Les1;

    .line 52
    .line 53
    if-nez p0, :cond_2

    .line 54
    .line 55
    invoke-static {}, Lc80;->s()V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_2
    new-instance p0, Lcom/dokar/quickjs/QuickJsException;

    .line 60
    .line 61
    const-string p1, "Object call not be invoked."

    .line 62
    .line 63
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_3
    new-instance p0, Lcom/dokar/quickjs/QuickJsException;

    .line 68
    .line 69
    const-string p1, "()\' does not found in global functions."

    .line 70
    .line 71
    invoke-static {v3, p3, p1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :cond_4
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->objectBindings:Ljava/util/Map;

    .line 80
    .line 81
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Les1;

    .line 90
    .line 91
    if-eqz p0, :cond_a

    .line 92
    .line 93
    check-cast p0, Lzc0;

    .line 94
    .line 95
    iget-object p1, p0, Lzc0;->b:Lcom/dokar/quickjs/QuickJs;

    .line 96
    .line 97
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object p2, p0, Lzc0;->d:Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-virtual {p2, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Lyc0;

    .line 110
    .line 111
    if-eqz p2, :cond_9

    .line 112
    .line 113
    iget-object p2, p2, Lyc0;->b:Lsk;

    .line 114
    .line 115
    instance-of p3, p2, Lug;

    .line 116
    .line 117
    if-eqz p3, :cond_5

    .line 118
    .line 119
    new-instance p3, Lb2;

    .line 120
    .line 121
    const/4 v0, 0x7

    .line 122
    invoke-direct {p3, p2, p0, v2, v0}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p4, p3}, Lcom/dokar/quickjs/QuickJs;->invokeAsyncFunction$quickjs_release([Ljava/lang/Object;Lmn0;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_5
    instance-of p0, p2, Lxn0;

    .line 130
    .line 131
    if-eqz p0, :cond_7

    .line 132
    .line 133
    check-cast p2, Lxn0;

    .line 134
    .line 135
    invoke-interface {p2, p4}, Lxn0;->b([Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :goto_0
    invoke-static {v1}, Lte;->o0(Ljava/lang/Object;)Lh63;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-eqz p0, :cond_6

    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_6
    iget-object p0, p1, Lcom/dokar/quickjs/QuickJs;->typeConverters:Lz53;

    .line 147
    .line 148
    invoke-static {p0, v1}, Lte;->n0(Lz53;Ljava/lang/Object;)Lh63;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const-class p2, Lcom/dokar/quickjs/binding/JsObject;

    .line 153
    .line 154
    invoke-static {p2}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-virtual {p0, v1, p1, p2}, Lz53;->a(Ljava/lang/Object;Lh63;Lh63;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :cond_7
    instance-of p0, p2, Les1;

    .line 163
    .line 164
    if-nez p0, :cond_8

    .line 165
    .line 166
    invoke-static {}, Lc80;->s()V

    .line 167
    .line 168
    .line 169
    return-object v2

    .line 170
    :cond_8
    new-instance p0, Lcom/dokar/quickjs/QuickJsException;

    .line 171
    .line 172
    const-string p1, "Object cannot be invoked!"

    .line 173
    .line 174
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p0

    .line 178
    :cond_9
    iget-object p0, p0, Lzc0;->a:Lfs1;

    .line 179
    .line 180
    iget-object p0, p0, Lfs1;->a:Ljava/lang/String;

    .line 181
    .line 182
    const-string p1, "Function \'"

    .line 183
    .line 184
    const-string p2, "\' not found on object \'"

    .line 185
    .line 186
    invoke-static {p1, p3, p2, p0, v3}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance p1, Lcom/dokar/quickjs/QuickJsException;

    .line 191
    .line 192
    invoke-direct {p1, p0}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_a
    new-instance p0, Lcom/dokar/quickjs/QuickJsException;

    .line 197
    .line 198
    const-string p1, "JavaScript called function \'"

    .line 199
    .line 200
    const-string p2, "\' on an unknown binding"

    .line 201
    .line 202
    invoke-static {p1, p3, p2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p0
.end method

.method private final onCallGetter(JLjava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->objectBindings:Ljava/util/Map;

    .line 5
    .line 6
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Les1;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    check-cast p0, Lzc0;

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lzc0;->c:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Lzc0;->a:Lfs1;

    .line 32
    .line 33
    iget-object p0, p0, Lfs1;->a:Ljava/lang/String;

    .line 34
    .line 35
    const-string p1, "\' not found on object \'"

    .line 36
    .line 37
    const-string p2, "\'"

    .line 38
    .line 39
    const-string v0, "Property \'"

    .line 40
    .line 41
    invoke-static {v0, p3, p1, p0, p2}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Lcom/dokar/quickjs/QuickJsException;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_1
    new-instance p0, Lcom/dokar/quickjs/QuickJsException;

    .line 58
    .line 59
    const-string p1, "JavaScript called getter of \'"

    .line 60
    .line 61
    const-string p2, "\' on an unknown binding"

    .line 62
    .line 63
    invoke-static {p1, p3, p2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0
.end method

.method private final onCallSetter(JLjava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->objectBindings:Ljava/util/Map;

    .line 5
    .line 6
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Les1;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    check-cast p0, Lzc0;

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lzc0;->c:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Lzc0;->a:Lfs1;

    .line 32
    .line 33
    iget-object p0, p0, Lfs1;->a:Ljava/lang/String;

    .line 34
    .line 35
    const-string p1, "\' not found on object \'"

    .line 36
    .line 37
    const-string p2, "\'"

    .line 38
    .line 39
    const-string p4, "Property \'"

    .line 40
    .line 41
    invoke-static {p4, p3, p1, p0, p2}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Lcom/dokar/quickjs/QuickJsException;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_1
    new-instance p0, Lcom/dokar/quickjs/QuickJsException;

    .line 58
    .line 59
    const-string p1, "JavaScript called setter of \'"

    .line 60
    .line 61
    const-string p2, "\' on an unknown binding"

    .line 62
    .line 63
    invoke-static {p1, p3, p2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0
.end method

.method private final promiseHandlesFromArgs([Ljava/lang/Object;)Low1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Low1;"
        }
    .end annotation

    .line 1
    array-length p0, p1

    .line 2
    const/4 v0, 0x2

    .line 3
    const/4 v1, 0x0

    .line 4
    if-lt p0, v0, :cond_4

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    aget-object p0, p1, p0

    .line 8
    .line 9
    instance-of v0, p0, Ljava/lang/Long;

    .line 10
    .line 11
    const-string v2, ", expected: Long"

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lbt;->b()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object p0, v1

    .line 31
    :goto_0
    const-string p1, "Unexpected resolve handle type "

    .line 32
    .line 33
    invoke-static {p1, p0, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_1
    const/4 v0, 0x1

    .line 42
    aget-object p1, p1, v0

    .line 43
    .line 44
    instance-of v0, p1, Ljava/lang/Long;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lbt;->b()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-object p0, v1

    .line 64
    :goto_1
    const-string p1, "Unexpected reject handle type "

    .line 65
    .line 66
    invoke-static {p1, p0, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    new-instance v0, Low1;

    .line 75
    .line 76
    invoke-direct {v0, p0, p1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_4
    const-string p0, "Invoking async functions requires resolve and reject handles."

    .line 81
    .line 82
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object v1
.end method

.method private final native releaseContext(J)V
.end method

.method private final native releaseGlobals(JJ)V
.end method

.method private final native releaseRuntime(J)V
.end method

.method private final setEvalException(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 5
    .line 6
    return-void
.end method

.method private final native setMaxStackSize(JJJ)V
.end method

.method private final native setMemoryLimit(JJJ)V
.end method

.method private final setUnhandledPromiseRejection(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    instance-of v0, p1, Ljava/lang/Throwable;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, Ljava/lang/Throwable;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v0, v1

    .line 20
    :goto_0
    if-nez v0, :cond_2

    .line 21
    .line 22
    new-instance v0, Lcom/dokar/quickjs/QuickJsException;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p1}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    iput-object v0, p0, Lcom/dokar/quickjs/QuickJs;->evalException:Ljava/lang/Throwable;

    .line 32
    .line 33
    :cond_3
    iget-object p1, p0, Lcom/dokar/quickjs/QuickJs;->jobsMutex:Lil1;

    .line 34
    .line 35
    :cond_4
    :try_start_0
    move-object v0, p1

    .line 36
    check-cast v0, Lkl1;

    .line 37
    .line 38
    invoke-virtual {v0}, Lkl1;->e()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->asyncJobs:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lk21;

    .line 61
    .line 62
    invoke-interface {v0, v1}, Lk21;->c(Ljava/util/concurrent/CancellationException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :cond_5
    invoke-static {p1}, Lsp0;->l0(Lil1;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :goto_2
    invoke-static {p1}, Lsp0;->l0(Lil1;)V

    .line 73
    .line 74
    .line 75
    throw p0
.end method


# virtual methods
.method public final addModule(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, p2, p1, v0}, Lcom/dokar/quickjs/QuickJs;->compile(Ljava/lang/String;Ljava/lang/String;Z)[B

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->modules:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final addModule([B)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 22
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->modules:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final varargs addTypeConverters([Ly53;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ly53;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->typeConverters:Lz53;

    .line 5
    .line 6
    array-length v0, p1

    .line 7
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, [Ly53;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lz53;->a:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {p0, p1}, Liu;->h0(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lc80;->g()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final close()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/dokar/quickjs/QuickJs;->jobsMutex:Lil1;

    .line 10
    .line 11
    :cond_1
    :try_start_0
    move-object v1, v0

    .line 12
    check-cast v1, Lkl1;

    .line 13
    .line 14
    invoke-virtual {v1}, Lkl1;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/dokar/quickjs/QuickJs;->asyncJobs:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lk21;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-interface {v2, v3}, Lk21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_3

    .line 45
    :cond_2
    iget-object v1, p0, Lcom/dokar/quickjs/QuickJs;->asyncJobs:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lsp0;->l0(Lil1;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 54
    .line 55
    :cond_3
    :try_start_1
    move-object v1, v0

    .line 56
    check-cast v1, Lkl1;

    .line 57
    .line 58
    invoke-virtual {v1}, Lkl1;->e()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    iget-object v1, p0, Lcom/dokar/quickjs/QuickJs;->objectBindings:Ljava/util/Map;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/dokar/quickjs/QuickJs;->globalFunctions:Ljava/util/Map;

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lcom/dokar/quickjs/QuickJs;->modules:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 77
    .line 78
    .line 79
    iget-wide v1, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 80
    .line 81
    const-wide/16 v3, 0x0

    .line 82
    .line 83
    cmp-long v5, v1, v3

    .line 84
    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    iget-wide v5, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 88
    .line 89
    invoke-direct {p0, v5, v6, v1, v2}, Lcom/dokar/quickjs/QuickJs;->releaseGlobals(JJ)V

    .line 90
    .line 91
    .line 92
    iput-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_1
    move-exception p0

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    :goto_1
    iget-wide v1, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 98
    .line 99
    cmp-long v5, v1, v3

    .line 100
    .line 101
    if-eqz v5, :cond_5

    .line 102
    .line 103
    invoke-direct {p0, v1, v2}, Lcom/dokar/quickjs/QuickJs;->releaseContext(J)V

    .line 104
    .line 105
    .line 106
    iput-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 107
    .line 108
    :cond_5
    iget-wide v1, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J

    .line 109
    .line 110
    cmp-long v5, v1, v3

    .line 111
    .line 112
    if-eqz v5, :cond_6

    .line 113
    .line 114
    invoke-direct {p0, v1, v2}, Lcom/dokar/quickjs/QuickJs;->releaseRuntime(J)V

    .line 115
    .line 116
    .line 117
    iput-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    .line 119
    :cond_6
    invoke-static {v0}, Lsp0;->l0(Lil1;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :goto_2
    invoke-static {v0}, Lsp0;->l0(Lil1;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :goto_3
    invoke-static {v0}, Lsp0;->l0(Lil1;)V

    .line 128
    .line 129
    .line 130
    throw p0
.end method

.method public final compile(Ljava/lang/String;Ljava/lang/String;Z)[B
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 11
    .line 12
    :cond_0
    :try_start_0
    move-object v0, v1

    .line 13
    check-cast v0, Lkl1;

    .line 14
    .line 15
    invoke-virtual {v0}, Lkl1;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 22
    .line 23
    iget-wide v5, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    move-object v8, p1

    .line 27
    move-object v7, p2

    .line 28
    move v9, p3

    .line 29
    invoke-direct/range {v2 .. v9}, Lcom/dokar/quickjs/QuickJs;->compile(JJLjava/lang/String;Ljava/lang/String;Z)[B

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-static {v1}, Lsp0;->l0(Lil1;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    move-object p0, v0

    .line 39
    invoke-static {v1}, Lsp0;->l0(Lil1;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public final defineBinding(Ljava/lang/String;Lug;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lug;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    iget-object v1, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 47
    :cond_0
    :try_start_0
    move-object v0, v1

    check-cast v0, Lkl1;

    invoke-virtual {v0}, Lkl1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 49
    iget-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 50
    iget-wide v5, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    const/4 v8, 0x1

    move-object v2, p0

    move-object v7, p1

    .line 51
    invoke-direct/range {v2 .. v8}, Lcom/dokar/quickjs/QuickJs;->defineFunction(JJLjava/lang/String;Z)V

    .line 52
    iget-object p0, v2, Lcom/dokar/quickjs/QuickJs;->globalFunctions:Ljava/util/Map;

    invoke-interface {p0, v7, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    invoke-static {v1}, Lsp0;->l0(Lil1;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-static {v1}, Lsp0;->l0(Lil1;)V

    throw p0
.end method

.method public final defineBinding(Ljava/lang/String;Lxn0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lxn0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 8
    .line 9
    :cond_0
    :try_start_0
    move-object v0, v1

    .line 10
    check-cast v0, Lkl1;

    .line 11
    .line 12
    invoke-virtual {v0}, Lkl1;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 19
    .line 20
    .line 21
    iget-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 22
    .line 23
    iget-wide v5, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    move-object v2, p0

    .line 27
    move-object v7, p1

    .line 28
    invoke-direct/range {v2 .. v8}, Lcom/dokar/quickjs/QuickJs;->defineFunction(JJLjava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    iget-object p0, v2, Lcom/dokar/quickjs/QuickJs;->globalFunctions:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {p0, v7, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lsp0;->l0(Lil1;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    invoke-static {v1}, Lsp0;->l0(Lil1;)V

    .line 43
    .line 44
    .line 45
    throw p0
.end method

.method public final defineBinding-NW8rdx8(Ljava/lang/String;Les1;J)J
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v10, p0, Lcom/dokar/quickjs/QuickJs;->jsMutex:Lil1;

    .line 8
    .line 9
    :cond_0
    :try_start_0
    move-object v1, v10

    .line 10
    check-cast v1, Lkl1;

    .line 11
    .line 12
    invoke-virtual {v1}, Lkl1;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 22
    .line 23
    iget-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->context:J

    .line 24
    .line 25
    move-object v5, p2

    .line 26
    check-cast v5, Lzc0;

    .line 27
    .line 28
    iget-object v5, v5, Lzc0;->e:Ljava/util/ArrayList;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    new-array v7, v6, [Lcom/dokar/quickjs/binding/JsProperty;

    .line 32
    .line 33
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    move-object v8, v5

    .line 38
    check-cast v8, [Lcom/dokar/quickjs/binding/JsProperty;

    .line 39
    .line 40
    move-object v5, p2

    .line 41
    check-cast v5, Lzc0;

    .line 42
    .line 43
    iget-object v5, v5, Lzc0;->f:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-array v6, v6, [Lcom/dokar/quickjs/binding/JsFunction;

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    move-object v9, v5

    .line 52
    check-cast v9, [Lcom/dokar/quickjs/binding/JsFunction;

    .line 53
    .line 54
    move-object v0, p0

    .line 55
    move-object v7, p1

    .line 56
    move-wide v5, p3

    .line 57
    invoke-direct/range {v0 .. v9}, Lcom/dokar/quickjs/QuickJs;->defineObject(JJJLjava/lang/String;[Lcom/dokar/quickjs/binding/JsProperty;[Lcom/dokar/quickjs/binding/JsFunction;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    const-wide/16 v3, 0x0

    .line 62
    .line 63
    cmp-long v3, v1, v3

    .line 64
    .line 65
    if-ltz v3, :cond_1

    .line 66
    .line 67
    iget-object v0, p0, Lcom/dokar/quickjs/QuickJs;->objectBindings:Ljava/util/Map;

    .line 68
    .line 69
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-interface {v0, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    invoke-static {v10}, Lsp0;->l0(Lil1;)V

    .line 77
    .line 78
    .line 79
    return-wide v1

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    :try_start_1
    new-instance v0, Lcom/dokar/quickjs/QuickJsException;

    .line 83
    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v2, "Failed to define object \'"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v2, "\'."

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-direct {v0, v1}, Lcom/dokar/quickjs/QuickJsException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    :goto_0
    invoke-static {v10}, Lsp0;->l0(Lil1;)V

    .line 111
    .line 112
    .line 113
    throw v0
.end method

.method public final evaluate(Ljava/lang/String;Ljava/lang/String;ZLt00;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lt00<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 9
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/dokar/quickjs/QuickJs;->evaluateInternal(Ljava/lang/String;Ljava/lang/String;ZLt00;)Ljava/lang/Object;

    .line 10
    invoke-static {}, Lt11;->R()V

    const/4 p0, 0x0

    throw p0
.end method

.method public final evaluate([BLt00;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Lt00<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/dokar/quickjs/QuickJs;->evaluateInternal([BLt00;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lt11;->R()V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    throw p0
.end method

.method public final evaluateInternal(Ljava/lang/String;Ljava/lang/String;ZLt00;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lt00<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lv42;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v3, p1

    .line 6
    move-object v2, p2

    .line 7
    move v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Lv42;-><init>(Lcom/dokar/quickjs/QuickJs;Ljava/lang/String;Ljava/lang/String;ZLt00;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v0, p4}, Lcom/dokar/quickjs/QuickJs;->evalAndAwait(Lin0;Lt00;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final evaluateInternal([BLt00;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lt00<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 16
    new-instance v0, Lrc;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, p1, v1, v2}, Lrc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    invoke-direct {p0, v0, p2}, Lcom/dokar/quickjs/QuickJs;->evalAndAwait(Lin0;Lt00;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final gc()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/dokar/quickjs/QuickJs;->gc(JJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final getMaxStackSize()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->maxStackSize:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMemoryLimit()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->memoryLimit:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMemoryUsage()Lcom/dokar/quickjs/MemoryUsage;
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/dokar/quickjs/QuickJs;->getMemoryUsage(JJ)Lcom/dokar/quickjs/MemoryUsage;

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final getTypeConverters()Lz53;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/dokar/quickjs/QuickJs;->typeConverters:Lz53;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->nativeGetVersion()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final invokeAsyncFunction$quickjs_release([Ljava/lang/Object;Lmn0;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "Lmn0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lcom/dokar/quickjs/QuickJs;->promiseHandlesFromArgs([Ljava/lang/Object;)Low1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, v0, Low1;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    iget-object v0, v0, Low1;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v8

    .line 32
    iget-object v0, p0, Lcom/dokar/quickjs/QuickJs;->coroutineScope:Lj20;

    .line 33
    .line 34
    new-instance v2, Lw42;

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    move-object v5, p0

    .line 38
    move-object v4, p1

    .line 39
    move-object v3, p2

    .line 40
    invoke-direct/range {v2 .. v10}, Lw42;-><init>(Lmn0;[Ljava/lang/Object;Lcom/dokar/quickjs/QuickJs;JJLt00;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x3

    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-static {v0, p1, v2, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p1, v5, Lcom/dokar/quickjs/QuickJs;->jobsMutex:Lil1;

    .line 50
    .line 51
    :cond_1
    :try_start_0
    move-object p2, p1

    .line 52
    check-cast p2, Lkl1;

    .line 53
    .line 54
    invoke-virtual {p2}, Lkl1;->e()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    iget-object p2, v5, Lcom/dokar/quickjs/QuickJs;->asyncJobs:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {p2, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lsp0;->l0(Lil1;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, Ld2;

    .line 69
    .line 70
    const/16 p2, 0x1c

    .line 71
    .line 72
    invoke-direct {p1, p2, v5, p0}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lr21;->t(Lin0;)Lca0;

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    move-object p0, v0

    .line 81
    invoke-static {p1}, Lsp0;->l0(Lil1;)V

    .line 82
    .line 83
    .line 84
    throw p0
.end method

.method public final isClosed()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/dokar/quickjs/QuickJs;->isClosed:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setMaxStackSize(J)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/dokar/quickjs/QuickJs;->maxStackSize:J

    .line 5
    .line 6
    iget-wide v1, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    move-wide v5, p1

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/dokar/quickjs/QuickJs;->setMaxStackSize(JJJ)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setMemoryLimit(J)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/dokar/quickjs/QuickJs;->ensureNotClosed()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/dokar/quickjs/QuickJs;->memoryLimit:J

    .line 5
    .line 6
    iget-wide v1, p0, Lcom/dokar/quickjs/QuickJs;->runtime:J

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/dokar/quickjs/QuickJs;->globals:J

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    move-wide v5, p1

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/dokar/quickjs/QuickJs;->setMemoryLimit(JJJ)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
