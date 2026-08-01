.class public final L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;


# static fields
.field public static final 飘花落叶言子世楪苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

.field public static final synthetic 飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic 飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic 飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field private volatile synthetic _isTerminated$volatile:I

.field private volatile synthetic controlState$volatile:J

.field private volatile synthetic parkedWorkersStack$volatile:J

.field public final 飘花落叶言子楪兰世哲苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/String;

.field public final 飘花落叶言子楪兰苏世哲:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:J

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "parkedWorkersStack$volatile"

    .line 2
    .line 3
    const-class v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    const-string v0, "controlState$volatile"

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    const-string v0, "_isTerminated$volatile"

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 26
    .line 27
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 28
    .line 29
    const-string v1, "NOT_IN_STACK"

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput-wide p3, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:J

    .line 9
    .line 10
    iput-object p5, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p5, 0x1

    .line 13
    if-lt p1, p5, :cond_3

    .line 14
    .line 15
    const-string p5, "Max pool size "

    .line 16
    .line 17
    if-lt p2, p1, :cond_2

    .line 18
    .line 19
    const v0, 0x1ffffe

    .line 20
    .line 21
    .line 22
    if-gt p2, v0, :cond_1

    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    cmp-long p2, p3, v0

    .line 27
    .line 28
    if-lez p2, :cond_0

    .line 29
    .line 30
    new-instance p2, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    invoke-direct {p2}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 36
    .line 37
    new-instance p2, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 38
    .line 39
    invoke-direct {p2}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 43
    .line 44
    new-instance p2, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 45
    .line 46
    add-int/lit8 p3, p1, 0x1

    .line 47
    .line 48
    mul-int/lit8 p3, p3, 0x2

    .line 49
    .line 50
    invoke-direct {p2, p3}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object p2, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 54
    .line 55
    int-to-long p1, p1

    .line 56
    const/16 p3, 0x2a

    .line 57
    .line 58
    shl-long/2addr p1, p3

    .line 59
    iput-wide p1, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->controlState$volatile:J

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "Idle worker keep alive time "

    .line 63
    .line 64
    const-string p1, " must be positive"

    .line 65
    .line 66
    invoke-static {p0, p3, p4, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;JLjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    throw p0

    .line 71
    :cond_1
    const-string p0, " should not exceed maximal supported number of threads 2097150"

    .line 72
    .line 73
    invoke-static {p2, p5, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    throw p0

    .line 82
    :cond_2
    const-string p0, " should be greater than or equals to core pool size "

    .line 83
    .line 84
    invoke-static {p2, p1, p5, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    throw p0

    .line 93
    :cond_3
    const-string p0, "Core pool size "

    .line 94
    .line 95
    const-string p2, " should be at least 1"

    .line 96
    .line 97
    invoke-static {p1, p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    throw p0
.end method

.method public static synthetic 飘花落叶言子楪世兰哲苏(L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;Ljava/lang/Runnable;I)V
    .locals 1

    .line 1
    and-int/lit8 p2, p2, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x1

    .line 9
    :goto_0
    invoke-virtual {p0, p1, v0, p2}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Runnable;ZZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 8

    .line 1
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v1, v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v0, v3

    .line 25
    :goto_0
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object v1, v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;

    .line 28
    .line 29
    if-eq v1, p0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move-object v3, v0

    .line 33
    :cond_3
    :goto_1
    iget-object v0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 34
    .line 35
    monitor-enter v0

    .line 36
    :try_start_0
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    const-wide/32 v6, 0x1fffff

    .line 43
    .line 44
    .line 45
    and-long/2addr v4, v6

    .line 46
    long-to-int v1, v4

    .line 47
    monitor-exit v0

    .line 48
    if-gt v2, v1, :cond_6

    .line 49
    .line 50
    move v0, v2

    .line 51
    :goto_2
    iget-object v4, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 52
    .line 53
    invoke-virtual {v4, v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast v4, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 61
    .line 62
    if-eq v4, v3, :cond_5

    .line 63
    .line 64
    :goto_3
    invoke-virtual {v4}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    sget-object v6, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    .line 69
    .line 70
    if-eq v5, v6, :cond_4

    .line 71
    .line 72
    invoke-static {v4}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 73
    .line 74
    .line 75
    const-wide/16 v5, 0x2710

    .line 76
    .line 77
    invoke-virtual {v4, v5, v6}, Ljava/lang/Thread;->join(J)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    iget-object v4, v4, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏兰哲世;

    .line 82
    .line 83
    iget-object v5, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 84
    .line 85
    invoke-virtual {v4, v5}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    if-eq v0, v1, :cond_6

    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    iget-object v0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 94
    .line 95
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲()V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 99
    .line 100
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲()V

    .line 101
    .line 102
    .line 103
    :goto_4
    if-eqz v3, :cond_7

    .line 104
    .line 105
    invoke-virtual {v3, v2}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Z)L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-nez v0, :cond_9

    .line 110
    .line 111
    :cond_7
    iget-object v0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 112
    .line 113
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;

    .line 118
    .line 119
    if-nez v0, :cond_9

    .line 120
    .line 121
    iget-object v0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 122
    .line 123
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;

    .line 128
    .line 129
    if-nez v0, :cond_9

    .line 130
    .line 131
    if-eqz v3, :cond_8

    .line 132
    .line 133
    sget-object v0, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    .line 134
    .line 135
    invoke-virtual {v3, v0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z

    .line 136
    .line 137
    .line 138
    :cond_8
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 139
    .line 140
    const-wide/16 v1, 0x0

    .line 141
    .line 142
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 143
    .line 144
    .line 145
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 146
    .line 147
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_9
    :try_start_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-interface {v4, v1, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :catchall_1
    move-exception p0

    .line 169
    monitor-exit v0

    .line 170
    throw p0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-static {p0, p1, v0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;Ljava/lang/Runnable;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 7
    .line 8
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    move v5, v3

    .line 15
    move v6, v5

    .line 16
    move v7, v6

    .line 17
    move v8, v7

    .line 18
    move v9, v4

    .line 19
    :goto_0
    if-ge v9, v2, :cond_7

    .line 20
    .line 21
    invoke-virtual {v1, v9}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    check-cast v10, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 26
    .line 27
    if-nez v10, :cond_0

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    iget-object v11, v10, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏兰哲世;

    .line 32
    .line 33
    invoke-virtual {v11}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    iget-object v10, v10, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    .line 38
    .line 39
    sget-object v12, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 40
    .line 41
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    aget v10, v12, v10

    .line 46
    .line 47
    if-eq v10, v4, :cond_5

    .line 48
    .line 49
    const/4 v12, 0x2

    .line 50
    if-eq v10, v12, :cond_4

    .line 51
    .line 52
    const/4 v12, 0x3

    .line 53
    if-eq v10, v12, :cond_3

    .line 54
    .line 55
    const/4 v12, 0x4

    .line 56
    if-eq v10, v12, :cond_2

    .line 57
    .line 58
    const/4 v11, 0x5

    .line 59
    if-ne v10, v11, :cond_1

    .line 60
    .line 61
    add-int/lit8 v8, v8, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0

    .line 69
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 70
    .line 71
    if-lez v11, :cond_6

    .line 72
    .line 73
    new-instance v10, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 v11, 0x64

    .line 82
    .line 83
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    new-instance v10, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const/16 v11, 0x63

    .line 105
    .line 106
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    new-instance v10, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const/16 v11, 0x62

    .line 128
    .line 129
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 141
    .line 142
    :cond_6
    :goto_1
    add-int/lit8 v9, v9, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_7
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 146
    .line 147
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v1

    .line 151
    new-instance v4, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    iget-object v9, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const/16 v9, 0x40

    .line 162
    .line 163
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v9, "[Pool Size {core = "

    .line 174
    .line 175
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget v9, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 179
    .line 180
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v10, ", max = "

    .line 184
    .line 185
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget v10, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 189
    .line 190
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v10, "}, Worker States {CPU = "

    .line 194
    .line 195
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v3, ", blocking = "

    .line 202
    .line 203
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v3, ", parked = "

    .line 210
    .line 211
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v3, ", dormant = "

    .line 218
    .line 219
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v3, ", terminated = "

    .line 226
    .line 227
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v3, "}, running workers queues = "

    .line 234
    .line 235
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v0, ", global CPU queue size = "

    .line 242
    .line 243
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 247
    .line 248
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v0, ", global blocking queue size = "

    .line 256
    .line 257
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    iget-object p0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 261
    .line 262
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string p0, ", Control State {created workers= "

    .line 270
    .line 271
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-wide/32 v5, 0x1fffff

    .line 275
    .line 276
    .line 277
    and-long/2addr v5, v1

    .line 278
    long-to-int p0, v5

    .line 279
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string p0, ", blocking tasks = "

    .line 283
    .line 284
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-wide v5, 0x3ffffe00000L

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    and-long/2addr v5, v1

    .line 293
    const/16 p0, 0x15

    .line 294
    .line 295
    shr-long/2addr v5, p0

    .line 296
    long-to-int p0, v5

    .line 297
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string p0, ", CPUs acquired = "

    .line 301
    .line 302
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-wide v5, 0x7ffffc0000000000L

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    and-long v0, v1, v5

    .line 311
    .line 312
    const/16 p0, 0x2a

    .line 313
    .line 314
    shr-long/2addr v0, p0

    .line 315
    long-to-int p0, v0

    .line 316
    sub-int/2addr v9, p0

    .line 317
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    const-string p0, "}]"

    .line 321
    .line 322
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Runnable;ZZ)V
    .locals 6

    .line 1
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    instance-of v2, p1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast p1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;

    .line 15
    .line 16
    iput-wide v0, p1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:J

    .line 17
    .line 18
    iput-boolean p2, p1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v2, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏哲世兰;

    .line 22
    .line 23
    invoke-direct {v2, p1, v0, v1, p2}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/Runnable;JZ)V

    .line 24
    .line 25
    .line 26
    move-object p1, v2

    .line 27
    :goto_0
    iget-boolean p2, p1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Z

    .line 28
    .line 29
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    const-wide/32 v1, 0x200000

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    instance-of v4, v3, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    check-cast v3, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v5

    .line 56
    :goto_2
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iget-object v4, v3, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;

    .line 59
    .line 60
    if-eq v4, p0, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move-object v5, v3

    .line 64
    :cond_4
    :goto_3
    if-nez v5, :cond_5

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    iget-object v3, v5, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    .line 68
    .line 69
    sget-object v4, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->TERMINATED:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    .line 70
    .line 71
    if-ne v3, v4, :cond_6

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_6
    iget-boolean v4, p1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Z

    .line 75
    .line 76
    if-nez v4, :cond_7

    .line 77
    .line 78
    sget-object v4, Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;->BLOCKING:Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;

    .line 79
    .line 80
    if-ne v3, v4, :cond_7

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_7
    const/4 v3, 0x1

    .line 84
    iput-boolean v3, v5, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Z

    .line 85
    .line 86
    iget-object v3, v5, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏兰哲世;

    .line 87
    .line 88
    invoke-virtual {v3, p1, p3}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;Z)L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :goto_4
    if-eqz p1, :cond_a

    .line 93
    .line 94
    iget-boolean p3, p1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Z

    .line 95
    .line 96
    if-eqz p3, :cond_8

    .line 97
    .line 98
    iget-object p3, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 99
    .line 100
    invoke-virtual {p3, p1}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Runnable;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    goto :goto_5

    .line 105
    :cond_8
    iget-object p3, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 106
    .line 107
    invoke-virtual {p3, p1}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Runnable;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    :goto_5
    if-eqz p1, :cond_9

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_9
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    .line 115
    .line 116
    new-instance p2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    iget-object p0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 122
    .line 123
    const-string p3, " was terminated"

    .line 124
    .line 125
    invoke-static {p2, p0, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-direct {p1, p0}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_a
    :goto_6
    if-eqz p2, :cond_d

    .line 134
    .line 135
    invoke-virtual {p0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_b

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_b
    invoke-virtual {p0, v1, v2}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(J)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_c

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_c
    invoke-virtual {p0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世()Z

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_d
    invoke-virtual {p0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_e

    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_e
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 161
    .line 162
    .line 163
    move-result-wide p1

    .line 164
    invoke-virtual {p0, p1, p2}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(J)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_f

    .line 169
    .line 170
    :goto_7
    return-void

    .line 171
    :cond_f
    invoke-virtual {p0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世()Z

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()I
    .locals 11

    .line 1
    iget-object v0, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v3

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    const/4 p0, -0x1

    .line 21
    return p0

    .line 22
    :cond_1
    :try_start_1
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide/32 v6, 0x1fffff

    .line 29
    .line 30
    .line 31
    and-long v8, v4, v6

    .line 32
    .line 33
    long-to-int v8, v8

    .line 34
    const-wide v9, 0x3ffffe00000L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v4, v9

    .line 40
    const/16 v9, 0x15

    .line 41
    .line 42
    shr-long/2addr v4, v9

    .line 43
    long-to-int v4, v4

    .line 44
    sub-int v4, v8, v4

    .line 45
    .line 46
    if-gez v4, :cond_2

    .line 47
    .line 48
    move v4, v3

    .line 49
    :cond_2
    iget v5, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    if-lt v4, v5, :cond_3

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return v3

    .line 55
    :cond_3
    :try_start_2
    iget v5, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    .line 57
    if-lt v8, v5, :cond_4

    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return v3

    .line 61
    :cond_4
    :try_start_3
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v8

    .line 65
    and-long/2addr v8, v6

    .line 66
    long-to-int v3, v8

    .line 67
    add-int/2addr v3, v2

    .line 68
    if-lez v3, :cond_6

    .line 69
    .line 70
    iget-object v5, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 71
    .line 72
    invoke-virtual {v5, v3}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-nez v5, :cond_6

    .line 77
    .line 78
    new-instance v5, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 79
    .line 80
    invoke-direct {v5, p0, v3}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;I)V

    .line 81
    .line 82
    .line 83
    iget-object v8, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 84
    .line 85
    invoke-virtual {v8, v3, v5}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰(IL飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 92
    and-long/2addr v6, v8

    .line 93
    long-to-int p0, v6

    .line 94
    if-ne v3, p0, :cond_5

    .line 95
    .line 96
    add-int/2addr v4, v2

    .line 97
    monitor-exit v0

    .line 98
    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    .line 99
    .line 100
    .line 101
    return v4

    .line 102
    :cond_5
    :try_start_4
    const-string p0, "Failed requirement."

    .line 103
    .line 104
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    goto :goto_1

    .line 112
    :cond_6
    const-string p0, "Failed requirement."

    .line 113
    .line 114
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 115
    .line 116
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 120
    :goto_1
    monitor-exit v0

    .line 121
    throw p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(J)Z
    .locals 3

    .line 1
    const-wide/32 v0, 0x1fffff

    .line 2
    .line 3
    .line 4
    and-long/2addr v0, p1

    .line 5
    long-to-int v0, v0

    .line 6
    const-wide v1, 0x3ffffe00000L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v1

    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    shr-long/2addr p1, v1

    .line 15
    long-to-int p1, p1

    .line 16
    sub-int/2addr v0, p1

    .line 17
    const/4 p1, 0x0

    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    move v0, p1

    .line 21
    :cond_0
    iget p2, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 22
    .line 23
    if-ge v0, p2, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    if-le p2, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()I

    .line 35
    .line 36
    .line 37
    :cond_1
    if-lez v0, :cond_2

    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    return p1
.end method

.method public final 飘花落叶言子楪苏世哲兰(L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;II)V
    .locals 7

    .line 1
    :cond_0
    :goto_0
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const-wide/32 v0, 0x1fffff

    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v3

    .line 11
    long-to-int v0, v0

    .line 12
    const-wide/32 v1, 0x200000

    .line 13
    .line 14
    .line 15
    add-long/2addr v1, v3

    .line 16
    const-wide/32 v5, -0x200000

    .line 17
    .line 18
    .line 19
    and-long/2addr v1, v5

    .line 20
    if-ne v0, p2, :cond_5

    .line 21
    .line 22
    if-nez p3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_1
    sget-object v5, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 29
    .line 30
    if-ne v0, v5, :cond_1

    .line 31
    .line 32
    const/4 v0, -0x1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    if-nez v0, :cond_2

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    check-cast v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    invoke-virtual {v0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    move v0, v5

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    invoke-virtual {v0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    move v0, p3

    .line 54
    :cond_5
    :goto_2
    if-ltz v0, :cond_0

    .line 55
    .line 56
    int-to-long v5, v0

    .line 57
    or-long/2addr v5, v1

    .line 58
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 59
    .line 60
    move-object v2, p0

    .line 61
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_6

    .line 66
    .line 67
    return-void

    .line 68
    :cond_6
    move-object p0, v2

    .line 69
    goto :goto_0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Z
    .locals 11

    .line 1
    :cond_0
    :goto_0
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const-wide/32 v0, 0x1fffff

    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v3

    .line 11
    long-to-int v0, v0

    .line 12
    iget-object v1, p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    const/4 v7, -0x1

    .line 21
    const/4 v8, 0x0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    move-object v3, p0

    .line 26
    goto :goto_3

    .line 27
    :cond_1
    const-wide/32 v1, 0x200000

    .line 28
    .line 29
    .line 30
    add-long/2addr v1, v3

    .line 31
    const-wide/32 v5, -0x200000

    .line 32
    .line 33
    .line 34
    and-long/2addr v1, v5

    .line 35
    invoke-virtual {v0}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    :goto_1
    sget-object v9, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 40
    .line 41
    if-ne v5, v9, :cond_2

    .line 42
    .line 43
    move v6, v7

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    if-nez v5, :cond_3

    .line 46
    .line 47
    move v6, v8

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    check-cast v5, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;

    .line 50
    .line 51
    invoke-virtual {v5}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_6

    .line 56
    .line 57
    :goto_2
    if-ltz v6, :cond_0

    .line 58
    .line 59
    int-to-long v5, v6

    .line 60
    or-long/2addr v5, v1

    .line 61
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 62
    .line 63
    move-object v2, p0

    .line 64
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    move-object v3, v2

    .line 69
    if-eqz p0, :cond_5

    .line 70
    .line 71
    invoke-virtual {v0, v9}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :goto_3
    if-nez v0, :cond_4

    .line 75
    .line 76
    return v8

    .line 77
    :cond_4
    sget-object p0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 78
    .line 79
    invoke-virtual {p0, v0, v7, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_5

    .line 84
    .line 85
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x1

    .line 89
    return p0

    .line 90
    :cond_5
    move-object p0, v3

    .line 91
    goto :goto_0

    .line 92
    :cond_6
    move-wide v9, v3

    .line 93
    move-object v3, p0

    .line 94
    invoke-virtual {v5}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    move-wide v3, v9

    .line 99
    goto :goto_1
.end method
