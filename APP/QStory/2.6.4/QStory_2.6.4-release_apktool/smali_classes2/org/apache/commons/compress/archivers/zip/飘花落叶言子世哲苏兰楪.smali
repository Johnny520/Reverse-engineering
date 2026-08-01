.class public abstract Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏兰哲:I

.field public static final 飘花落叶言子楪世苏哲兰:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/32 v0, 0x210000

    .line 2
    .line 3
    .line 4
    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲(J)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    sput-wide v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:J

    .line 9
    .line 10
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(I)B
    .locals 2

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    if-gt p0, v0, :cond_1

    .line 4
    .line 5
    if-ltz p0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x80

    .line 8
    .line 9
    if-ge p0, v0, :cond_0

    .line 10
    .line 11
    int-to-byte p0, p0

    .line 12
    return p0

    .line 13
    :cond_0
    add-int/lit16 p0, p0, -0x100

    .line 14
    .line 15
    int-to-byte p0, p0

    .line 16
    return p0

    .line 17
    :cond_1
    const-string v0, "Can only convert non-negative integers between [0,255] to byte: ["

    .line 18
    .line 19
    const-string v1, "]"

    .line 20
    .line 21
    invoke-static {p0, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static 飘花落叶言子楪世兰苏哲(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;)Z
    .locals 1

    .line 1
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->UNSHRINKING:Lorg/apache/commons/compress/archivers/zip/ZipMethod;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->getCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->IMPLODING:Lorg/apache/commons/compress/archivers/zip/ZipMethod;

    .line 14
    .line 15
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->getCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->ENHANCED_DEFLATED:Lorg/apache/commons/compress/archivers/zip/ZipMethod;

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->getCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eq p0, v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->BZIP2:Lorg/apache/commons/compress/archivers/zip/ZipMethod;

    .line 34
    .line 35
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->getCode()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eq p0, v0, :cond_1

    .line 40
    .line 41
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->isZstd(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->XZ:Lorg/apache/commons/compress/archivers/zip/ZipMethod;

    .line 48
    .line 49
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->getCode()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-ne p0, v0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 59
    return p0
.end method

.method public static 飘花落叶言子楪世哲兰苏([B)V
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p0

    .line 6
    div-int/lit8 v2, v2, 0x2

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    aget-byte v2, p0, v1

    .line 11
    .line 12
    sub-int v3, v0, v1

    .line 13
    .line 14
    aget-byte v4, p0, v3

    .line 15
    .line 16
    aput-byte v4, p0, v1

    .line 17
    .line 18
    aput-byte v2, p0, v3

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(J)Ljava/math/BigInteger;
    .locals 3

    .line 1
    const-wide/32 v0, -0x80000000

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    if-ltz v0, :cond_2

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    cmp-long v1, p0, v1

    .line 11
    .line 12
    if-gez v1, :cond_1

    .line 13
    .line 14
    if-ltz v0, :cond_1

    .line 15
    .line 16
    long-to-int p0, p0

    .line 17
    if-gez p0, :cond_0

    .line 18
    .line 19
    const-wide v0, 0x100000000L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    int-to-long p0, p0

    .line 25
    add-long/2addr p0, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    int-to-long p0, p0

    .line 28
    :cond_1
    :goto_0
    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Negative longs < -2^31 not permitted: ["

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, "]"

    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
.end method

.method public static 飘花落叶言子楪世苏兰哲(J)J
    .locals 7

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x19

    .line 6
    .line 7
    shr-long v1, p0, v1

    .line 8
    .line 9
    const-wide/16 v3, 0x7f

    .line 10
    .line 11
    and-long/2addr v1, v3

    .line 12
    long-to-int v1, v1

    .line 13
    add-int/lit16 v1, v1, 0x7bc

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x15

    .line 20
    .line 21
    shr-long v3, p0, v1

    .line 22
    .line 23
    const-wide/16 v5, 0xf

    .line 24
    .line 25
    and-long/2addr v3, v5

    .line 26
    long-to-int v1, v3

    .line 27
    sub-int/2addr v1, v2

    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-virtual {v0, v3, v1}, Ljava/util/Calendar;->set(II)V

    .line 30
    .line 31
    .line 32
    const/16 v1, 0x10

    .line 33
    .line 34
    shr-long v3, p0, v1

    .line 35
    .line 36
    long-to-int v1, v3

    .line 37
    and-int/lit8 v1, v1, 0x1f

    .line 38
    .line 39
    const/4 v3, 0x5

    .line 40
    invoke-virtual {v0, v3, v1}, Ljava/util/Calendar;->set(II)V

    .line 41
    .line 42
    .line 43
    const/16 v1, 0xb

    .line 44
    .line 45
    shr-long v4, p0, v1

    .line 46
    .line 47
    long-to-int v4, v4

    .line 48
    and-int/lit8 v4, v4, 0x1f

    .line 49
    .line 50
    invoke-virtual {v0, v1, v4}, Ljava/util/Calendar;->set(II)V

    .line 51
    .line 52
    .line 53
    shr-long v3, p0, v3

    .line 54
    .line 55
    long-to-int v1, v3

    .line 56
    and-int/lit8 v1, v1, 0x3f

    .line 57
    .line 58
    const/16 v3, 0xc

    .line 59
    .line 60
    invoke-virtual {v0, v3, v1}, Ljava/util/Calendar;->set(II)V

    .line 61
    .line 62
    .line 63
    shl-long/2addr p0, v2

    .line 64
    long-to-int p0, p0

    .line 65
    and-int/lit8 p0, p0, 0x3e

    .line 66
    .line 67
    const/16 p1, 0xd

    .line 68
    .line 69
    invoke-virtual {v0, p1, p0}, Ljava/util/Calendar;->set(II)V

    .line 70
    .line 71
    .line 72
    const/16 p0, 0xe

    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->set(II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 83
    .line 84
    .line 85
    move-result-wide p0

    .line 86
    return-wide p0
.end method

.method public static 飘花落叶言子楪世苏哲兰([B)[B
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return-object p0
.end method
