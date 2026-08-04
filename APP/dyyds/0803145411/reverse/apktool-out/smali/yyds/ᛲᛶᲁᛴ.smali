.class public abstract Lyyds/ᛲᛶᲁᛴ;
.super Lyyds/ᛶᛱᛳᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛴᲀᲈ;


# static fields
.field public static final synthetic ᛲᛴᛳᛲ:J

.field public static final synthetic ᲇᲈᛵᛷ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic cleanedAndPointers$volatile:I

.field public final ᲀᛲᛳᲀ:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lyyds/ᛲᛶᲁᛴ;

    .line 2
    .line 3
    const-string v1, "cleanedAndPointers$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sput-object v2, Lyyds/ᛲᛶᲁᛴ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

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
    sput-wide v0, Lyyds/ᛲᛶᲁᛴ;->ᛲᛴᛳᛲ:J

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(JLyyds/ᛵᛳᛳᛷ;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Lyyds/ᛶᛱᛳᲇ;-><init>(Lyyds/ᛵᛳᛳᛷ;)V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lyyds/ᛲᛶᲁᛴ;->ᲀᛲᛳᲀ:J

    .line 5
    .line 6
    shl-int/lit8 p1, p4, 0x10

    .line 7
    .line 8
    iput p1, p0, Lyyds/ᛲᛶᲁᛴ;->cleanedAndPointers$volatile:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract ᛲᛴᛳᛲ()I
.end method

.method public final ᛵᛸᛸᛷ()Z
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lyyds/ᛲᛶᲁᛴ;->ᛲᛴᛳᛲ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lyyds/ᛲᛶᲁᛴ;->ᛲᛴᛳᛲ()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ne v1, v2, :cond_2

    .line 14
    .line 15
    sget-wide v1, Lyyds/ᛶᛱᛳᲇ;->ᛲᲈᲁ:J

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, Lyyds/ᛶᛶᲁᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 22
    .line 23
    if-ne p0, v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    check-cast p0, Lyyds/ᛶᛱᛳᲇ;

    .line 28
    .line 29
    :goto_0
    if-nez p0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public final ᛶᛷᛲᲁ()Z
    .locals 7

    .line 1
    :goto_0
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v2, Lyyds/ᛲᛶᲁᛴ;->ᛲᛴᛳᛲ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v2, v3}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    invoke-virtual {p0}, Lyyds/ᛲᛶᲁᛴ;->ᛲᛴᛳᛲ()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ne v4, v1, :cond_2

    .line 14
    .line 15
    sget-wide v5, Lyyds/ᛶᛱᛳᲇ;->ᛲᲈᲁ:J

    .line 16
    .line 17
    invoke-virtual {v0, p0, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v5, Lyyds/ᛶᛶᲁᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 22
    .line 23
    if-ne v1, v5, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    check-cast v1, Lyyds/ᛶᛱᛳᲇ;

    .line 28
    .line 29
    :goto_1
    if-nez v1, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_2
    const/high16 v1, 0x10000

    .line 35
    .line 36
    add-int v5, v4, v1

    .line 37
    .line 38
    move-object v1, p0

    .line 39
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_3
    move-object p0, v1

    .line 48
    goto :goto_0
.end method

.method public abstract ᲇᲇᲇᛱ(I)V
.end method

.method public final ᲇᲈᛵᛷ()Z
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛲᛶᲁᛴ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    const/high16 v1, -0x10000

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->addAndGet(Ljava/lang/Object;I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lyyds/ᛲᛶᲁᛴ;->ᛲᛴᛳᛲ()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 16
    .line 17
    sget-wide v1, Lyyds/ᛶᛱᛳᲇ;->ᛲᲈᲁ:J

    .line 18
    .line 19
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object v0, Lyyds/ᛶᛶᲁᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 24
    .line 25
    if-ne p0, v0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    check-cast p0, Lyyds/ᛶᛱᛳᲇ;

    .line 30
    .line 31
    :goto_0
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 37
    return p0
.end method
