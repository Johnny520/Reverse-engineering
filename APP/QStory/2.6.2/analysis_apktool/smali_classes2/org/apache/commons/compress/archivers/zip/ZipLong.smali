.class public final Lorg/apache/commons/compress/archivers/zip/ZipLong;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final AED_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

.field public static final CFH_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

.field public static final DD_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

.field public static final LFH_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

.field public static final SINGLE_SEGMENT_SPLIT_MARKER:Lorg/apache/commons/compress/archivers/zip/ZipLong;

.field static final ZIP64_MAGIC:Lorg/apache/commons/compress/archivers/zip/ZipLong;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final value:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 2
    .line 3
    const-wide/32 v1, 0x2014b50    # 1.6619997E-316

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>(J)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->CFH_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 10
    .line 11
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 12
    .line 13
    const-wide/32 v1, 0x4034b50

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>(J)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->LFH_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 20
    .line 21
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 22
    .line 23
    const-wide/32 v1, 0x8074b50

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>(J)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->DD_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 30
    .line 31
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 32
    .line 33
    const-wide v1, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>(J)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->ZIP64_MAGIC:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 42
    .line 43
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 44
    .line 45
    const-wide/32 v1, 0x30304b50

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>(J)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->SINGLE_SEGMENT_SPLIT_MARKER:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 52
    .line 53
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 54
    .line 55
    const-wide/32 v1, 0x8064b50

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>(J)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->AED_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-long v0, p1

    .line 13
    iput-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide p1, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue([BI)J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    iput-wide p1, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    .line 9
    .line 10
    return-void
.end method

.method public static getBytes(J)[B
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->putLong(J[BI)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static getValue([B)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue([BI)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    return-wide v0
.end method

.method public static getValue([BI)J
    .locals 1

    const/4 v0, 0x4

    .line 7
    invoke-static {p1, p0, v0}, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I[BI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static putLong(J[BI)V
    .locals 1

    const/4 v0, 0x4

    .line 7
    invoke-static {p0, p1, p2, p3, v0}, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J[BII)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-wide v2, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    .line 8
    .line 9
    check-cast p1, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 10
    .line 11
    invoke-virtual {p1}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    cmp-long p0, v2, p0

    .line 16
    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    return v1
.end method

.method public getBytes()[B
    .locals 2

    .line 9
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes(J)[B

    move-result-object p0

    return-object p0
.end method

.method public getIntValue()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    return p0
.end method

.method public getValue()J
    .locals 2

    .line 8
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    return p0
.end method

.method public putLong([BI)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->putLong(J[BI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ZipLong value: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->value:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
