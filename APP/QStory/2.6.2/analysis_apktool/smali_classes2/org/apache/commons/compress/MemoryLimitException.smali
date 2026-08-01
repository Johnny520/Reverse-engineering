.class public Lorg/apache/commons/compress/MemoryLimitException;
.super Lorg/apache/commons/compress/CompressException;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final memoryLimitKiB:I

.field private final memoryNeededKiB:J


# direct methods
.method public constructor <init>(JI)V
    .locals 1

    .line 1
    invoke-static {p1, p2, p3}, Lorg/apache/commons/compress/MemoryLimitException;->buildMessage(JI)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lorg/apache/commons/compress/CompressException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Lorg/apache/commons/compress/MemoryLimitException;->memoryNeededKiB:J

    .line 9
    .line 10
    iput p3, p0, Lorg/apache/commons/compress/MemoryLimitException;->memoryLimitKiB:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(JILjava/lang/Exception;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 13
    invoke-static {p1, p2, p3}, Lorg/apache/commons/compress/MemoryLimitException;->buildMessage(JI)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p4}, Lorg/apache/commons/compress/CompressException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    iput-wide p1, p0, Lorg/apache/commons/compress/MemoryLimitException;->memoryNeededKiB:J

    .line 15
    iput p3, p0, Lorg/apache/commons/compress/MemoryLimitException;->memoryLimitKiB:I

    return-void
.end method

.method public constructor <init>(JILjava/lang/Throwable;)V
    .locals 1

    .line 16
    invoke-static {p1, p2, p3}, Lorg/apache/commons/compress/MemoryLimitException;->buildMessage(JI)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p4}, Lorg/apache/commons/compress/CompressException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    iput-wide p1, p0, Lorg/apache/commons/compress/MemoryLimitException;->memoryNeededKiB:J

    .line 18
    iput p3, p0, Lorg/apache/commons/compress/MemoryLimitException;->memoryLimitKiB:I

    return-void
.end method

.method private static buildMessage(JI)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string p1, "%,d KiB of memory would be needed; limit was %,d KiB. If the file is not corrupt, consider increasing the memory limit."

    .line 14
    .line 15
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method


# virtual methods
.method public getMemoryLimitInKb()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/compress/MemoryLimitException;->memoryLimitKiB:I

    .line 2
    .line 3
    return p0
.end method

.method public getMemoryNeededInKb()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/MemoryLimitException;->memoryNeededKiB:J

    .line 2
    .line 3
    return-wide v0
.end method
