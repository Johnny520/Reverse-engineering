.class public final Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;
.super Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;


# static fields
.field public static final synthetic 飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic runningWorkers$volatile:I

.field public final 飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;

.field public final 飘花落叶言子楪兰世苏哲:I

.field public final 飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

.field public final 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const-string v1, "runningWorkers$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

    .line 16
    .line 17
    :cond_1
    iput-object v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

    .line 18
    .line 19
    iput-object p1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 20
    .line 21
    iput p2, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    new-instance p1, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;

    .line 24
    .line 25
    invoke-direct {p1}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;

    .line 29
    .line 30
    new-instance p1, Ljava/lang/Object;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ".limitedParallelism("

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 17
    .line 18
    const/16 v1, 0x29

    .line 19
    .line 20
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(JLjava/lang/Runnable;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(JLjava/lang/Runnable;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(JLkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, Lkotlinx/coroutines/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲(JLkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪兰世哲苏()Ljava/lang/Runnable;
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Runnable;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    sget-object v1, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;

    .line 20
    .line 21
    invoke-virtual {v2}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()I

    .line 22
    .line 23
    .line 24
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit v0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    monitor-exit v0

    .line 37
    throw p0

    .line 38
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪兰苏世哲()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    iget v3, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-lt v2, v3, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    monitor-exit v0

    .line 25
    throw p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    sget-object p1, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 13
    .line 14
    if-ge p2, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏()Ljava/lang/Runnable;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    new-instance v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-direct {v0, p0, v1, p2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 36
    .line 37
    invoke-static {p2, p0, v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p2

    .line 42
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    throw p2

    .line 46
    :cond_1
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    sget-object p1, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget v0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 13
    .line 14
    if-ge p2, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏()Ljava/lang/Runnable;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    new-instance v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-direct {v0, p0, v1, p2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 36
    .line 37
    invoke-virtual {p2, p0, v0}, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p2

    .line 42
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    throw p2

    .line 46
    :cond_1
    :goto_0
    return-void
.end method
