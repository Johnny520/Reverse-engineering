.class public abstract La9;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final c:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final d:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La9;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    .line 17
    .line 18
    invoke-direct {v10}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 22
    .line 23
    new-instance v8, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {v8, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v9, Ln7;

    .line 30
    .line 31
    const-string v1, "Elaris-KkTtsCatalog"

    .line 32
    .line 33
    invoke-direct {v9, v1}, Ln7;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    const/4 v4, 0x1

    .line 38
    const-wide/16 v5, 0x14

    .line 39
    .line 40
    sget-object v16, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 41
    .line 42
    move-object/from16 v7, v16

    .line 43
    .line 44
    invoke-direct/range {v2 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 48
    .line 49
    .line 50
    sput-object v2, La9;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 51
    .line 52
    new-instance v19, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;

    .line 53
    .line 54
    invoke-direct/range {v19 .. v19}, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v11, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 58
    .line 59
    new-instance v1, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Ln7;

    .line 65
    .line 66
    const-string v3, "Elaris-KkTts"

    .line 67
    .line 68
    invoke-direct {v2, v3}, Ln7;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v12, 0x1

    .line 72
    const/4 v13, 0x1

    .line 73
    const-wide/16 v14, 0x14

    .line 74
    .line 75
    move-object/from16 v17, v1

    .line 76
    .line 77
    move-object/from16 v18, v2

    .line 78
    .line 79
    invoke-direct/range {v11 .. v19}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v11, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 83
    .line 84
    .line 85
    sput-object v11, La9;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 86
    .line 87
    return-void
.end method

.method public static a(Ll8;)V
    .locals 2

    .line 1
    :cond_0
    sget-object v0, La9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eq v0, p0, :cond_0

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p0}, Ll8;->c()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static b()V
    .locals 2

    .line 1
    sget-object v0, La9;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
