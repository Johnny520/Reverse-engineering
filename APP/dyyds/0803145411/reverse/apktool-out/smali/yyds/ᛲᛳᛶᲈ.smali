.class public Lyyds/ᛲᛳᛶᲈ;
.super Lyyds/ᲈᲁᛴᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Lyyds/ᛸᛴᛷᛵ;

.field public static final ᛲᛲᲈᲈ:J

.field public static ᛲᛳᛶᲁ:Lyyds/ᛲᛳᛶᲈ;

.field public static final ᛷᛲᲈᛱ:Ljava/util/concurrent/locks/Condition;

.field public static final ᛷᛵᲇᲀ:J

.field public static final ᛷᲈᲈᲁ:Ljava/util/concurrent/locks/ReentrantLock;


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public ᛶᛷᛲᲁ:J

.field public ᲇᲇᲇᛱ:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛸᛴᛷᛵ;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, Lyyds/ᛸᛴᛷᛵ;-><init>(CI)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    new-array v1, v1, [Lyyds/ᛲᛳᛶᲈ;

    .line 11
    .line 12
    iput-object v1, v0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 13
    .line 14
    sput-object v0, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ:Lyyds/ᛸᛴᛷᛵ;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lyyds/ᛲᛳᛶᲈ;->ᛷᲈᲈᲁ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lyyds/ᛲᛳᛶᲈ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/locks/Condition;

    .line 28
    .line 29
    const-wide/32 v0, 0xea60

    .line 30
    .line 31
    .line 32
    sput-wide v0, Lyyds/ᛲᛳᛶᲈ;->ᛷᛵᲇᲀ:J

    .line 33
    .line 34
    const-wide v0, 0xdf8475800L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    sput-wide v0, Lyyds/ᛲᛳᛶᲈ;->ᛲᛲᲈᲈ:J

    .line 40
    .line 41
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
    iput v0, p0, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lyyds/ᲈᲁᛴᛲ;->ᲀᛲᛳᲀ:J

    .line 2
    .line 3
    iget-boolean v2, p0, Lyyds/ᲈᲁᛴᛲ;->ᛲᲈᲁ:Z

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
    sget-object v0, Lyyds/ᛲᛳᛶᲈ;->ᛷᲈᲈᲁ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget v1, p0, Lyyds/ᛲᛳᛶᲈ;->ᛲᛴᛳᛲ:I

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput v1, p0, Lyyds/ᛲᛳᛶᲈ;->ᛲᛴᛳᛲ:I

    .line 25
    .line 26
    invoke-static {p0}, Lyyds/ᛲᛸᲈᲈ;->ᛶᛷᛲᲁ(Lyyds/ᛲᛳᛶᲈ;)V
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

.method public final ᛲᛳᛶᲁ()Z
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᛲᛳᛶᲈ;->ᛷᲈᲈᲁ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget v1, p0, Lyyds/ᛲᛳᛶᲈ;->ᛲᛴᛳᛲ:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p0, Lyyds/ᛲᛳᛶᲈ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    sget-object v1, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ:Lyyds/ᛸᛴᛷᛵ;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lyyds/ᛸᛴᛷᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛲᛳᛶᲈ;)V
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

.method public ᛷᲈᲈᲁ()V
    .locals 0

    .line 1
    return-void
.end method
