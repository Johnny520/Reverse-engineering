.class public final Lxhss/ᛲᛶᛳᲁ;
.super Lxhss/ᲇᛷᛲᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᲇᲀᛷ;
.implements Lxhss/ᛱᛴᛶᛴ;


# static fields
.field public static final synthetic ᛸᛲᲀᛵ:J

.field public static final synthetic ᛸᛴᛶᛳ:J

.field public static final synthetic ᲀᲇᛳᲁ:J


# instance fields
.field private volatile synthetic _decisionAndIndex$volatile:I

.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public final ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

.field public final ᲇᛶᛴᲀ:Lxhss/ᛴᛵᛳᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛲᛶᛳᲁ;

    .line 4
    .line 5
    const-string v2, "_decisionAndIndex$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    sput-wide v2, Lxhss/ᛲᛶᛳᲁ;->ᲀᲇᛳᲁ:J

    .line 16
    .line 17
    const-string v2, "_state$volatile"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    sput-wide v2, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 28
    .line 29
    const-string v2, "_parentHandle$volatile"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    sput-wide v0, Lxhss/ᛲᛶᛳᲁ;->ᛸᛴᛶᛳ:J

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lxhss/ᛱᛴᛶᛴ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lxhss/ᲇᛷᛲᛱ;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lxhss/ᛲᛶᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

    .line 6
    .line 7
    invoke-interface {p1}, Lxhss/ᛱᛴᛶᛴ;->ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lxhss/ᛲᛶᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛴᛵᛳᛵ;

    .line 12
    .line 13
    const p1, 0x1fffffff

    .line 14
    .line 15
    .line 16
    iput p1, p0, Lxhss/ᛲᛶᛳᲁ;->_decisionAndIndex$volatile:I

    .line 17
    .line 18
    sget-object p1, Lxhss/ᛶᲀᛵᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛶᲀᛵᲇ;

    .line 19
    .line 20
    iput-object p1, p0, Lxhss/ᛲᛶᛳᲁ;->_state$volatile:Ljava/lang/Object;

    .line 21
    .line 22
    return-void
.end method

.method public static ᛴᲈᛱᛴ(Lxhss/ᛲᛶᛳᲁ;Ljava/lang/Object;I)V
    .locals 9

    .line 1
    :goto_0
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    instance-of v3, v7, Lxhss/ᛲᲇᛱᛶ;

    .line 10
    .line 11
    if-eqz v3, :cond_3

    .line 12
    .line 13
    move-object v0, v7

    .line 14
    check-cast v0, Lxhss/ᛲᲇᛱᛶ;

    .line 15
    .line 16
    invoke-static {v0, p1, p2}, Lxhss/ᛲᛶᛳᲁ;->ᲁᛲᛴᛴ(Lxhss/ᛲᲇᛱᛶ;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    :goto_1
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 21
    .line 22
    sget-wide v5, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 23
    .line 24
    move-object v4, p0

    .line 25
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v4}, Lxhss/ᛲᛶᛳᲁ;->ᛶᲇᲈᛸ()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v4}, Lxhss/ᛲᛶᛳᲁ;->ᛷᲁᲁ()V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v4, p2}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛶᲈᛶ(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eq p0, v7, :cond_2

    .line 49
    .line 50
    move-object p0, v4

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move-object p0, v4

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    instance-of p0, v7, Lxhss/ᛴᲀᛳᛱ;

    .line 55
    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    move-object v1, v7

    .line 59
    check-cast v1, Lxhss/ᛴᲀᛳᛱ;

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    sget-wide v2, Lxhss/ᛴᲀᛳᛱ;->ᛳᲁᲇᛸ:J

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    const-string p0, "Already resumed, but proposed with update "

    .line 73
    .line 74
    invoke-static {p1, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static ᛸᛶᛴᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Object;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ", already has "

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public static ᲁᛲᛴᛴ(Lxhss/ᛲᲇᛱᛶ;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p1, Lxhss/ᛷᲁᲇᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-eq p2, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-ne p2, v0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    return-object p1

    .line 14
    :cond_2
    :goto_0
    instance-of p2, p0, Lxhss/ᛶᛳᲁᲈ;

    .line 15
    .line 16
    if-nez p2, :cond_3

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_3
    new-instance p2, Lxhss/ᲇᲁᛲᛳ;

    .line 20
    .line 21
    instance-of v0, p0, Lxhss/ᛶᛳᲁᲈ;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    check-cast p0, Lxhss/ᛶᛳᲁᲈ;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_4
    move-object p0, v1

    .line 30
    :goto_1
    const/16 v0, 0x10

    .line 31
    .line 32
    invoke-direct {p2, p1, p0, v1, v0}, Lxhss/ᲇᲁᛲᛳ;-><init>(Ljava/lang/Object;Lxhss/ᛶᛳᲁᲈ;Ljava/util/concurrent/CancellationException;I)V

    .line 33
    .line 34
    .line 35
    return-object p2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CancellableContinuation("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxhss/ᛲᛶᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

    .line 9
    .line 10
    invoke-static {v1}, Lxhss/ᛶᛵᛱ;->ᛲᛴᲀᲈ(Lxhss/ᛱᛴᛶᛴ;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "){"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 23
    .line 24
    sget-wide v2, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 25
    .line 26
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    instance-of v2, v1, Lxhss/ᛲᲇᛱᛶ;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    const-string v1, "Active"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    instance-of v1, v1, Lxhss/ᛴᲀᛳᛱ;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const-string v1, "Cancelled"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string v1, "Completed"

    .line 45
    .line 46
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, "}@"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Lxhss/ᛶᛵᛱ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()Lxhss/ᛱᛴᛶᛴ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛶᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛳᛶᛷᲀ(Lxhss/ᛲᛶᲇᲇ;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛶᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

    .line 2
    .line 3
    instance-of v1, v0, Lxhss/ᛸᲇᲁᛱ;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lxhss/ᛸᲇᲁᛱ;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v2, v0, Lxhss/ᛸᲇᲁᛱ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛶᲇᲇ;

    .line 15
    .line 16
    :cond_1
    if-ne v2, p1, :cond_2

    .line 17
    .line 18
    const/4 p1, 0x4

    .line 19
    goto :goto_1

    .line 20
    :cond_2
    iget p1, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 21
    .line 22
    :goto_1
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 23
    .line 24
    invoke-static {p0, v0, p1}, Lxhss/ᛲᛶᛳᲁ;->ᛴᲈᛱᛴ(Lxhss/ᛲᛶᛳᲁ;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lxhss/ᲇᛷᛲᛱ;->ᛳᲁᲇᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final ᛳᲈᲈᛲ()Lxhss/ᛱᛲᲁᲇ;
    .locals 9

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛶᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lxhss/ᛸᛷᛳᲈ;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v1, Lxhss/ᛳᛶᛳᛳ;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lxhss/ᛳᛶᛳᛳ;-><init>(Lxhss/ᛲᛶᛳᲁ;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-static {v0, v2, v1}, Lxhss/ᛵᛵᛲᲈ;->ᛸᛶᲈᛶ(Lxhss/ᛸᛷᛳᲈ;ZLxhss/ᛴᛷᛴᲀ;)Lxhss/ᛱᛲᲁᲇ;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    :goto_0
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 26
    .line 27
    sget-wide v5, Lxhss/ᛲᛶᛳᲁ;->ᛸᛴᛶᛳ:J

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    move-object v4, p0

    .line 31
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v3, v4, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    :goto_1
    return-object v8

    .line 45
    :cond_2
    move-object p0, v4

    .line 46
    goto :goto_0
.end method

.method public final ᛶᲇᲈᛸ()Z
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛲᛶᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

    .line 7
    .line 8
    check-cast p0, Lxhss/ᛸᲇᲁᛱ;

    .line 9
    .line 10
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 11
    .line 12
    sget-wide v1, Lxhss/ᛸᲇᲁᛱ;->ᛸᛲᲀᛵ:J

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᛱᲇᲀᛷ;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛶᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

    .line 2
    .line 3
    instance-of v0, p0, Lxhss/ᛱᲇᲀᛷ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lxhss/ᛱᲇᲀᛷ;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/util/concurrent/CancellationException;)V
    .locals 9

    .line 1
    :goto_0
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    instance-of v0, v7, Lxhss/ᛲᲇᛱᛶ;

    .line 10
    .line 11
    if-nez v0, :cond_8

    .line 12
    .line 13
    instance-of v0, v7, Lxhss/ᛷᲁᲇᛷ;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    instance-of v0, v7, Lxhss/ᲇᲁᛲᛳ;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    move-object v0, v7

    .line 24
    check-cast v0, Lxhss/ᲇᲁᛲᛳ;

    .line 25
    .line 26
    iget-object v4, v0, Lxhss/ᲇᲁᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Throwable;

    .line 27
    .line 28
    if-nez v4, :cond_3

    .line 29
    .line 30
    const/16 v4, 0xf

    .line 31
    .line 32
    invoke-static {v0, v3, p1, v4}, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ(Lxhss/ᲇᲁᛲᛳ;Lxhss/ᛶᛳᲁᲈ;Ljava/util/concurrent/CancellationException;I)Lxhss/ᲇᲁᛲᛳ;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    :goto_1
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 37
    .line 38
    sget-wide v5, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 39
    .line 40
    move-object v4, p0

    .line 41
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    iget-object p0, v0, Lxhss/ᲇᲁᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

    .line 48
    .line 49
    if-eqz p0, :cond_6

    .line 50
    .line 51
    invoke-virtual {v4, p0, p1}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛷᲈᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eq p0, v7, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    move-object p0, v4

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    const-string p0, "Must be called at most once"

    .line 65
    .line 66
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    move-object v4, p0

    .line 71
    new-instance v8, Lxhss/ᲇᲁᛲᛳ;

    .line 72
    .line 73
    const/16 p0, 0xe

    .line 74
    .line 75
    invoke-direct {v8, v7, v3, p1, p0}, Lxhss/ᲇᲁᛲᛳ;-><init>(Ljava/lang/Object;Lxhss/ᛶᛳᲁᲈ;Ljava/util/concurrent/CancellationException;I)V

    .line 76
    .line 77
    .line 78
    :cond_5
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 79
    .line 80
    sget-wide v5, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 81
    .line 82
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_7

    .line 87
    .line 88
    :cond_6
    :goto_2
    return-void

    .line 89
    :cond_7
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-eq p0, v7, :cond_5

    .line 94
    .line 95
    :goto_3
    move-object p0, v4

    .line 96
    goto :goto_0

    .line 97
    :cond_8
    const-string p0, "Not completed"

    .line 98
    .line 99
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final ᛷᲁᲁ()V
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lxhss/ᛲᛶᛳᲁ;->ᛸᛴᛶᛳ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    check-cast v3, Lxhss/ᛱᛲᲁᲇ;

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-interface {v3}, Lxhss/ᛱᛲᲁᲇ;->ᛷᛵᛵᲈ()V

    .line 15
    .line 16
    .line 17
    sget-object v3, Lxhss/ᛵᛵᲇᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛳ;

    .line 18
    .line 19
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final ᛸᛲᛷᛱ()V
    .locals 10

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛶᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

    .line 2
    .line 3
    instance-of v1, v0, Lxhss/ᛸᲇᲁᛱ;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lxhss/ᛸᲇᲁᛱ;

    .line 9
    .line 10
    move-object v4, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v4, v2

    .line 13
    :goto_0
    if-eqz v4, :cond_8

    .line 14
    .line 15
    sget-wide v0, Lxhss/ᛸᲇᲁᛱ;->ᛸᛲᲀᛵ:J

    .line 16
    .line 17
    :goto_1
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {v3, v4, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    move-object v3, v7

    .line 24
    sget-object v7, Lxhss/ᲈᲀᲀᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛲᛷᛵ;

    .line 25
    .line 26
    if-ne v3, v7, :cond_3

    .line 27
    .line 28
    :goto_2
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 29
    .line 30
    sget-wide v5, Lxhss/ᛸᲇᲁᛱ;->ᛸᛲᲀᛵ:J

    .line 31
    .line 32
    move-object v8, p0

    .line 33
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    move-object v9, v8

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    invoke-virtual {v3, v4, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eq p0, v7, :cond_2

    .line 46
    .line 47
    move-object p0, v9

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object p0, v9

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-object v9, p0

    .line 52
    instance-of p0, v3, Ljava/lang/Throwable;

    .line 53
    .line 54
    if-eqz p0, :cond_7

    .line 55
    .line 56
    move-object v7, v3

    .line 57
    :goto_3
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 58
    .line 59
    sget-wide v5, Lxhss/ᛸᲇᲁᛱ;->ᛸᛲᲀᛵ:J

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_5

    .line 67
    .line 68
    move-object v2, v7

    .line 69
    check-cast v2, Ljava/lang/Throwable;

    .line 70
    .line 71
    :goto_4
    if-nez v2, :cond_4

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_4
    invoke-virtual {v9}, Lxhss/ᛲᛶᛳᲁ;->ᛷᲁᲁ()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v2}, Lxhss/ᛲᛶᛳᲁ;->ᲈᛳᲀ(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_5
    invoke-virtual {v3, v4, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v7, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    const-string p0, "Failed requirement."

    .line 89
    .line 90
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_7
    move-object v7, v3

    .line 95
    const-string p0, "Inconsistent state "

    .line 96
    .line 97
    invoke-static {v7, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_8
    :goto_5
    return-void
.end method

.method public final ᛸᛲᲀᛵ()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lxhss/ᛷᲁᲇᛷ;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget v0, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 15
    .line 16
    invoke-static {p0, p1, v0}, Lxhss/ᛲᛶᛳᲁ;->ᛴᲈᛱᛴ(Lxhss/ᛲᛶᛳᲁ;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final ᛸᛶᲈᛶ(I)V
    .locals 6

    .line 1
    :goto_0
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v2, Lxhss/ᛲᛶᛳᲁ;->ᲀᲇᛳᲁ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v2, v3}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    shr-int/lit8 v1, v4, 0x1d

    .line 10
    .line 11
    if-eqz v1, :cond_b

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-ne v1, v0, :cond_a

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    const/4 v2, 0x0

    .line 18
    if-ne p1, v1, :cond_0

    .line 19
    .line 20
    move v1, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_1
    iget-object v3, p0, Lxhss/ᛲᛶᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛴᛶᛴ;

    .line 24
    .line 25
    if-nez v1, :cond_9

    .line 26
    .line 27
    instance-of v4, v3, Lxhss/ᛸᲇᲁᛱ;

    .line 28
    .line 29
    if-eqz v4, :cond_9

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    if-eq p1, v0, :cond_2

    .line 33
    .line 34
    if-ne p1, v4, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    move p1, v2

    .line 38
    goto :goto_3

    .line 39
    :cond_2
    :goto_2
    move p1, v0

    .line 40
    :goto_3
    iget v5, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 41
    .line 42
    if-eq v5, v0, :cond_3

    .line 43
    .line 44
    if-ne v5, v4, :cond_4

    .line 45
    .line 46
    :cond_3
    move v2, v0

    .line 47
    :cond_4
    if-ne p1, v2, :cond_9

    .line 48
    .line 49
    move-object p1, v3

    .line 50
    check-cast p1, Lxhss/ᛸᲇᲁᛱ;

    .line 51
    .line 52
    iget-object v1, p1, Lxhss/ᛸᲇᲁᛱ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛶᲇᲇ;

    .line 53
    .line 54
    iget-object p1, p1, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 55
    .line 56
    iget-object p1, p1, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 57
    .line 58
    invoke-virtual {v1, p1}, Lxhss/ᛲᛶᲇᲇ;->ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    invoke-virtual {v1, p1, p0}, Lxhss/ᛲᛶᲇᲇ;->ᛷᲁᲁ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_5
    invoke-static {}, Lxhss/ᲀᛵᛷᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛵᛸᛲᛲ;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-wide v1, p1, Lxhss/ᛵᛸᛲᛲ;->ᛳᲁᲇᛸ:J

    .line 73
    .line 74
    const-wide v4, 0x100000000L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    cmp-long v1, v1, v4

    .line 80
    .line 81
    if-ltz v1, :cond_7

    .line 82
    .line 83
    iget-object v0, p1, Lxhss/ᛵᛸᛲᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛸᲀᛷᛷ;

    .line 84
    .line 85
    if-nez v0, :cond_6

    .line 86
    .line 87
    new-instance v0, Lxhss/ᛸᲀᛷᛷ;

    .line 88
    .line 89
    invoke-direct {v0}, Lxhss/ᛸᲀᛷᛷ;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v0, p1, Lxhss/ᛵᛸᛲᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛸᲀᛷᛷ;

    .line 93
    .line 94
    :cond_6
    invoke-virtual {v0, p0}, Lxhss/ᛸᲀᛷᛷ;->addLast(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_7
    invoke-virtual {p1, v0}, Lxhss/ᛵᛸᛲᛲ;->ᛳᛶᛷᲀ(Z)V

    .line 99
    .line 100
    .line 101
    :try_start_0
    invoke-static {p0, v3, v0}, Lxhss/ᛱᛷᛵᛷ;->ᲇᛸᛳᲁ(Lxhss/ᛲᛶᛳᲁ;Lxhss/ᛱᛴᛶᛴ;Z)V

    .line 102
    .line 103
    .line 104
    :cond_8
    invoke-virtual {p1}, Lxhss/ᛵᛸᛲᛲ;->ᲁᛴᲇᛲ()Z

    .line 105
    .line 106
    .line 107
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    if-nez v0, :cond_8

    .line 109
    .line 110
    :goto_4
    invoke-virtual {p1}, Lxhss/ᛵᛸᛲᛲ;->ᛳᲈᲈᛲ()V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    :try_start_1
    invoke-virtual {p0, v0}, Lxhss/ᲇᛷᛲᛱ;->ᲀᲇᛳᲁ(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    move-object p0, v0

    .line 121
    invoke-virtual {p1}, Lxhss/ᛵᛸᛲᛲ;->ᛳᲈᲈᛲ()V

    .line 122
    .line 123
    .line 124
    throw p0

    .line 125
    :cond_9
    invoke-static {p0, v3, v1}, Lxhss/ᛱᛷᛵᛷ;->ᲇᛸᛳᲁ(Lxhss/ᛲᛶᛳᲁ;Lxhss/ᛱᛴᛶᛴ;Z)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_a
    const-string p0, "Already resumed"

    .line 130
    .line 131
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_b
    const v1, 0x1fffffff

    .line 136
    .line 137
    .line 138
    and-int/2addr v1, v4

    .line 139
    const/high16 v5, 0x40000000    # 2.0f

    .line 140
    .line 141
    add-int/2addr v5, v1

    .line 142
    move-object v1, p0

    .line 143
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_c

    .line 148
    .line 149
    :goto_5
    return-void

    .line 150
    :cond_c
    move-object p0, v1

    .line 151
    goto/16 :goto_0
.end method

.method public final ᛸᛷᲈᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, Lxhss/ᛶᛳᲁᲈ;->ᛷᛵᛵᲈ(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    new-instance p2, Lxhss/ᛵᛲᛲᲇ;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Exception in invokeOnCancellation handler for "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lxhss/ᛲᛶᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛴᛵᛳᛵ;

    .line 26
    .line 27
    invoke-static {p0, p2}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛷᲈᲈ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    instance-of p0, p1, Lxhss/ᲇᲁᛲᛳ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lxhss/ᲇᲁᛲᛳ;

    .line 6
    .line 7
    iget-object p0, p1, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    return-object p1
.end method

.method public final ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛶᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛸᛳᲁ()Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lxhss/ᛲᛶᛳᲁ;->ᛶᲇᲈᛸ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 6
    .line 7
    sget-wide v3, Lxhss/ᛲᛶᛳᲁ;->ᲀᲇᛳᲁ:J

    .line 8
    .line 9
    invoke-virtual {v1, p0, v3, v4}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    shr-int/lit8 v2, v5, 0x1d

    .line 14
    .line 15
    if-eqz v2, :cond_6

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-ne v2, v3, :cond_5

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᛷᛱ()V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-wide v4, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 26
    .line 27
    invoke-virtual {v1, p0, v4, v5}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v1, v0, Lxhss/ᛷᲁᲇᛷ;

    .line 32
    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    iget v1, p0, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    if-eq v1, v2, :cond_1

    .line 39
    .line 40
    if-ne v1, v3, :cond_3

    .line 41
    .line 42
    :cond_1
    iget-object v1, p0, Lxhss/ᛲᛶᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛴᛵᛳᛵ;

    .line 43
    .line 44
    sget-object v2, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 45
    .line 46
    invoke-interface {v1, v2}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lxhss/ᛸᛷᛳᲈ;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-virtual {v1}, Lxhss/ᛸᛷᛳᲈ;->ᛲᛴᲇᛲ()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v1}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛲᛷᛱ()Ljava/util/concurrent/CancellationException;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0, v0}, Lxhss/ᛲᛶᛳᲁ;->ᛷᛵᛵᲈ(Ljava/util/concurrent/CancellationException;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_3
    :goto_1
    invoke-virtual {p0, v0}, Lxhss/ᛲᛶᛳᲁ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_4
    check-cast v0, Lxhss/ᛷᲁᲇᛷ;

    .line 75
    .line 76
    iget-object p0, v0, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 77
    .line 78
    throw p0

    .line 79
    :cond_5
    const-string p0, "Already suspended"

    .line 80
    .line 81
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    return-object p0

    .line 86
    :cond_6
    const v2, 0x1fffffff

    .line 87
    .line 88
    .line 89
    and-int/2addr v2, v5

    .line 90
    const/high16 v6, 0x20000000

    .line 91
    .line 92
    add-int/2addr v6, v2

    .line 93
    move-object v2, p0

    .line 94
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_9

    .line 99
    .line 100
    sget-wide v3, Lxhss/ᛲᛶᛳᲁ;->ᛸᛴᛶᛳ:J

    .line 101
    .line 102
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, Lxhss/ᛱᛲᲁᲇ;

    .line 107
    .line 108
    if-nez p0, :cond_7

    .line 109
    .line 110
    invoke-virtual {v2}, Lxhss/ᛲᛶᛳᲁ;->ᛳᲈᲈᛲ()Lxhss/ᛱᛲᲁᲇ;

    .line 111
    .line 112
    .line 113
    :cond_7
    if-eqz v0, :cond_8

    .line 114
    .line 115
    invoke-virtual {v2}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᛷᛱ()V

    .line 116
    .line 117
    .line 118
    :cond_8
    sget-object p0, Lxhss/ᛸᛴᛸᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛸᲈ;

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_9
    move-object p0, v2

    .line 122
    goto :goto_0
.end method

.method public final ᲈᛳᲀ(Ljava/lang/Throwable;)V
    .locals 9

    .line 1
    :goto_0
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    instance-of v0, v7, Lxhss/ᛲᲇᛱᛶ;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v8, Lxhss/ᛴᲀᛳᛱ;

    .line 15
    .line 16
    instance-of v0, v7, Lxhss/ᛶᛳᲁᲈ;

    .line 17
    .line 18
    invoke-direct {v8, p0, p1, v0}, Lxhss/ᛴᲀᛳᛱ;-><init>(Lxhss/ᛲᛶᛳᲁ;Ljava/lang/Throwable;Z)V

    .line 19
    .line 20
    .line 21
    :goto_1
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 22
    .line 23
    sget-wide v5, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 24
    .line 25
    move-object v4, p0

    .line 26
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    move-object p0, v7

    .line 33
    check-cast p0, Lxhss/ᛲᲇᛱᛶ;

    .line 34
    .line 35
    instance-of p0, p0, Lxhss/ᛶᛳᲁᲈ;

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    check-cast v7, Lxhss/ᛶᛳᲁᲈ;

    .line 40
    .line 41
    invoke-virtual {v4, v7, p1}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛷᲈᲈ(Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v4}, Lxhss/ᛲᛶᛳᲁ;->ᛶᲇᲈᛸ()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v4}, Lxhss/ᛲᛶᛳᲁ;->ᛷᲁᲁ()V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget p0, v4, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 54
    .line 55
    invoke-virtual {v4, p0}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛶᲈᛶ(I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eq p0, v7, :cond_4

    .line 64
    .line 65
    move-object p0, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_4
    move-object p0, v4

    .line 68
    goto :goto_1
.end method
