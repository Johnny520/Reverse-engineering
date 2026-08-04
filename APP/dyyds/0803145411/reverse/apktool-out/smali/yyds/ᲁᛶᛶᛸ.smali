.class public final Lyyds/ᲁᛶᛶᛸ;
.super Lyyds/ᛸᛵᛶᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᛳᲈᛴ;


# static fields
.field public static final synthetic ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ᛷᛵᲇᲀ:J


# instance fields
.field private volatile synthetic owner$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lyyds/ᲁᛶᛶᛸ;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "owner$volatile"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, Lyyds/ᲁᛶᛶᛸ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sput-wide v0, Lyyds/ᲁᛶᛶᛸ;->ᛷᛵᲇᲀ:J

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lyyds/ᛸᛵᛶᲀ;-><init>(I)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 6
    .line 7
    iput-object v0, p0, Lyyds/ᲁᛶᛶᛸ;->owner$volatile:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Mutex@"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lyyds/ᲇᛲᲁᛱ;->ᛷᲈᲈᲁ(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "[isLocked="

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    sget-object v1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 21
    .line 22
    sget-wide v2, Lyyds/ᛸᛵᛶᲀ;->ᛱᲈᲁ:J

    .line 23
    .line 24
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ",owner="

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    sget-wide v2, Lyyds/ᲁᛶᛶᛸ;->ᛷᛵᲇᲀ:J

    .line 45
    .line 46
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 p0, 0x5d

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Object;)V
    .locals 9

    .line 1
    :cond_0
    :goto_0
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lyyds/ᛸᛵᛶᲀ;->ᛱᲈᲁ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_5

    .line 15
    .line 16
    sget-wide v1, Lyyds/ᲁᛶᛶᛸ;->ᛷᛵᲇᲀ:J

    .line 17
    .line 18
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    sget-object v8, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 23
    .line 24
    if-eq v7, v8, :cond_0

    .line 25
    .line 26
    if-eq v7, p1, :cond_2

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, "This mutex is locked by "

    .line 34
    .line 35
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ", but "

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, " is expected"

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    :goto_1
    sget-object v3, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 69
    .line 70
    sget-wide v5, Lyyds/ᲁᛶᛶᛸ;->ᛷᛵᲇᲀ:J

    .line 71
    .line 72
    move-object v4, p0

    .line 73
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v4}, Lyyds/ᛸᛵᛶᲀ;->ᲀᛲᛳᲀ()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-eq p0, v7, :cond_4

    .line 88
    .line 89
    move-object p0, v4

    .line 90
    goto :goto_0

    .line 91
    :cond_4
    move-object p0, v4

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    const-string p0, "This mutex is not locked"

    .line 94
    .line 95
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 11

    .line 1
    :goto_0
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v2, Lyyds/ᛸᛵᛶᲀ;->ᛱᲈᲁ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v2, v3}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    iget v1, p0, Lyyds/ᛸᛵᛶᲀ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    if-le v4, v1, :cond_2

    .line 12
    .line 13
    :goto_1
    sget-object v5, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v7, Lyyds/ᛸᛵᛶᲀ;->ᛱᲈᲁ:J

    .line 16
    .line 17
    invoke-virtual {v5, p0, v7, v8}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    iget v10, p0, Lyyds/ᛸᛵᛶᲀ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    move-object v6, p0

    .line 24
    if-le v9, v10, :cond_1

    .line 25
    .line 26
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    move-object p0, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_2
    move-object p0, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object v6, p0

    .line 38
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 39
    .line 40
    if-gtz v4, :cond_7

    .line 41
    .line 42
    invoke-static {p1}, Lyyds/ᛶᛶᲁᲇ;->ᛷᲈᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lyyds/ᛲᛷᛵᲇ;->ᛷᲈᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛸᲀᛱᛴ;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :try_start_0
    new-instance v0, Lyyds/ᛸᛱᛳᛴ;

    .line 51
    .line 52
    invoke-direct {v0, v6, p1}, Lyyds/ᛸᛱᛳᛴ;-><init>(Lyyds/ᲁᛶᛶᛸ;Lyyds/ᛸᲀᛱᛴ;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    sget-object v2, Lyyds/ᛸᛵᛶᲀ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 56
    .line 57
    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-gt v2, v1, :cond_3

    .line 62
    .line 63
    if-lez v2, :cond_4

    .line 64
    .line 65
    iget-object v1, v6, Lyyds/ᛸᛵᛶᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛸᲈᛵᛸ;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lyyds/ᛸᛱᛳᛴ;->ᛵᛸᛸᛷ(Lyyds/ᛸᲈᛵᛸ;)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-virtual {v6, v0}, Lyyds/ᛸᛵᛶᲀ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛱᲀᛳ;)Z

    .line 72
    .line 73
    .line 74
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    :goto_3
    invoke-virtual {p1}, Lyyds/ᛸᲀᛱᛴ;->ᛶᲈᛴᲈ()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object v0, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 82
    .line 83
    if-ne p1, v0, :cond_5

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    move-object p1, p0

    .line 87
    :goto_4
    if-ne p1, v0, :cond_6

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_6
    return-object p0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    move-object p0, v0

    .line 93
    invoke-virtual {p1}, Lyyds/ᛸᲀᛱᛴ;->ᛱᛳᛶᛳ()V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_7
    add-int/lit8 v5, v4, -0x1

    .line 98
    .line 99
    move-object v1, v6

    .line 100
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    sget-wide v1, Lyyds/ᲁᛶᛶᛸ;->ᛷᛵᲇᲀ:J

    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    invoke-virtual {v0, v6, v1, v2, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object p0
.end method
