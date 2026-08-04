.class public final Lyyds/ᛵᛷᛱᲀ;
.super Lyyds/ᛴᲇᛴᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲈᛲᛱ;


# static fields
.field public static final synthetic ᛲᛳᛶᲁ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic ᛷᲈᲈᲁ:J


# instance fields
.field private volatile synthetic runningWorkers$volatile:I

.field public final ᛱᲈᲁ:Ljava/lang/Object;

.field public final ᛲᛴᛳᛲ:Lyyds/ᛴᲇᛴᛲ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛲᲈᛳ;

.field public final ᲇᲇᲇᛱ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲈᲈᛲᛱ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lyyds/ᛵᛷᛱᲀ;

    .line 2
    .line 3
    const-string v1, "runningWorkers$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sput-object v2, Lyyds/ᛵᛷᛱᲀ;->ᛲᛳᛶᲁ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    sget-object v2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v2, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sput-wide v0, Lyyds/ᛵᛷᛱᲀ;->ᛷᲈᲈᲁ:J

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lyyds/ᛴᲇᛴᛲ;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lyyds/ᛴᲇᛴᛲ;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lyyds/ᲈᲈᛲᛱ;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lyyds/ᲈᲈᛲᛱ;

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
    sget-object v0, Lyyds/ᲇᛶᛵᛸ;->ᛲᲈᲁ:Lyyds/ᲈᲈᛲᛱ;

    .line 16
    .line 17
    :cond_1
    iput-object v0, p0, Lyyds/ᛵᛷᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲈᛲᛱ;

    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᛵᛷᛱᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲇᛴᛲ;

    .line 20
    .line 21
    iput p2, p0, Lyyds/ᛵᛷᛱᲀ;->ᲇᲇᲇᛱ:I

    .line 22
    .line 23
    new-instance p1, Lyyds/ᛲᲈᛳ;

    .line 24
    .line 25
    invoke-direct {p1}, Lyyds/ᛲᲈᛳ;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᛵᛷᛱᲀ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᛳ;

    .line 29
    .line 30
    new-instance p1, Ljava/lang/Object;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lyyds/ᛵᛷᛱᲀ;->ᛱᲈᲁ:Ljava/lang/Object;

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
    iget-object v1, p0, Lyyds/ᛵᛷᛱᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲇᛴᛲ;

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
    iget p0, p0, Lyyds/ᛵᛷᛱᲀ;->ᲇᲇᲇᛱ:I

    .line 17
    .line 18
    const/16 v1, 0x29

    .line 19
    .line 20
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final ᛱᛸᲁᲇ()Ljava/lang/Runnable;
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lyyds/ᛵᛷᛱᲀ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᛳ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛲᲈᛳ;->ᲇᲈᛵᛷ()Ljava/lang/Object;

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
    iget-object v0, p0, Lyyds/ᛵᛷᛱᲀ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    sget-object v1, Lyyds/ᛵᛷᛱᲀ;->ᛲᛳᛶᲁ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lyyds/ᛵᛷᛱᲀ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᛳ;

    .line 20
    .line 21
    invoke-virtual {v2}, Lyyds/ᛲᲈᛳ;->ᲀᛲᛳᲀ()I

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

.method public final ᛳᛸᛴᛶ(JLyyds/ᛸᲀᛱᛴ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲈᛲᛱ;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, Lyyds/ᲈᲈᛲᛱ;->ᛳᛸᛴᛶ(JLyyds/ᛸᲀᛱᛴ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lyyds/ᛵᛷᛱᲀ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᛳ;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lyyds/ᛲᲈᛳ;->ᛲᲈᲁ(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    sget-object p1, Lyyds/ᛵᛷᛱᲀ;->ᛲᛳᛶᲁ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 7
    .line 8
    sget-object p2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 9
    .line 10
    sget-wide v0, Lyyds/ᛵᛷᛱᲀ;->ᛷᲈᲈᲁ:J

    .line 11
    .line 12
    invoke-virtual {p2, p0, v0, v1}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p0, Lyyds/ᛵᛷᛱᲀ;->ᲇᲇᲇᛱ:I

    .line 17
    .line 18
    if-ge v2, v3, :cond_2

    .line 19
    .line 20
    iget-object v2, p0, Lyyds/ᛵᛷᛱᲀ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v2

    .line 23
    :try_start_0
    invoke-virtual {p2, p0, v0, v1}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iget v0, p0, Lyyds/ᛵᛷᛱᲀ;->ᲇᲇᲇᛱ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-lt p2, v0, :cond_0

    .line 30
    .line 31
    monitor-exit v2

    .line 32
    return-void

    .line 33
    :cond_0
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit v2

    .line 37
    invoke-virtual {p0}, Lyyds/ᛵᛷᛱᲀ;->ᛱᛸᲁᲇ()Ljava/lang/Runnable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance p2, Lyyds/ᲈᛵᛶᛲ;

    .line 45
    .line 46
    const/4 v0, 0x6

    .line 47
    invoke-direct {p2, p0, v0, p1}, Lyyds/ᲈᛵᛶᛲ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lyyds/ᛵᛷᛱᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲇᛴᛲ;

    .line 51
    .line 52
    invoke-virtual {p1, p0, p2}, Lyyds/ᛴᲇᛴᛲ;->ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    monitor-exit v2

    .line 58
    throw p0

    .line 59
    :cond_2
    :goto_0
    return-void
.end method

.method public final ᛸᛸᛷᛱ(JLyyds/ᲀᛴᛸᛴ;Lyyds/ᲁᛴᛲ;)Lyyds/ᛴᲇᛲᛱ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲈᛲᛱ;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3, p4}, Lyyds/ᲈᲈᛲᛱ;->ᛸᛸᛷᛱ(JLyyds/ᲀᛴᛸᛴ;Lyyds/ᲁᛴᛲ;)Lyyds/ᛴᲇᛲᛱ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
