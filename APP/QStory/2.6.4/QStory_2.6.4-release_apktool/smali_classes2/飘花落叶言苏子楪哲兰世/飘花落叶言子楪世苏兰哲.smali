.class public L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪哲世苏兰:J

.field public static final 飘花落叶言子楪苏世兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

.field public static final 飘花落叶言子楪苏兰世哲:Ljava/util/concurrent/locks/Condition;

.field public static final 飘花落叶言子楪苏兰哲世:J

.field public static 飘花落叶言子楪苏哲世兰:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;

.field public static final 飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/locks/ReentrantLock;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public 飘花落叶言子楪世兰苏哲:I

.field public 飘花落叶言子楪苏世哲兰:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;-><init>(BI)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    new-array v1, v1, [L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    iput-object v1, v0, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 14
    .line 15
    sput-object v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 16
    .line 17
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/locks/ReentrantLock;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sput-object v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲:Ljava/util/concurrent/locks/Condition;

    .line 32
    .line 33
    const-wide/32 v0, 0xea60

    .line 34
    .line 35
    .line 36
    sput-wide v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世:J

    .line 37
    .line 38
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 39
    .line 40
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    sput-wide v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:J

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏世兰哲()V
    .locals 5

    .line 1
    iget-wide v0, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:J

    .line 2
    .line 3
    iget-boolean v2, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v3

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/locks/ReentrantLock;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget v1, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput v1, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 25
    .line 26
    invoke-static {p0}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :try_start_1
    const-string p0, "Unbalanced enter/exit"

    .line 36
    .line 37
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 44
    .line 45
    .line 46
    throw p0
.end method

.method public 飘花落叶言子楪苏兰世哲()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰()Z
    .locals 4

    .line 1
    sget-object v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget v1, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    sget-object v1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏世兰(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x2

    .line 26
    if-ne v1, p0, :cond_1

    .line 27
    .line 28
    move v2, v3

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    return v2

    .line 33
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 34
    .line 35
    .line 36
    throw p0
.end method

.method public 飘花落叶言子楪苏哲兰世(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
