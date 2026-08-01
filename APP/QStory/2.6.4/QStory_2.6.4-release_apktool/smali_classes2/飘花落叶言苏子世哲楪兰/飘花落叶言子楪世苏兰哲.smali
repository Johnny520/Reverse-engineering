.class public abstract L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 5
    .line 6
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(J[BII)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p4, :cond_0

    .line 3
    .line 4
    add-int v1, p3, v0

    .line 5
    .line 6
    const-wide/16 v2, 0xff

    .line 7
    .line 8
    and-long/2addr v2, p0

    .line 9
    long-to-int v2, v2

    .line 10
    int-to-byte v2, v2

    .line 11
    aput-byte v2, p2, v1

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    shr-long/2addr p0, v1

    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/io/InputStream;I)[B
    .locals 12

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    int-to-long v1, p1

    .line 7
    sget-object p1, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [B

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {p1, v3}, Ljava/util/Arrays;->fill([BB)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    cmp-long v6, v1, v4

    .line 22
    .line 23
    if-nez v6, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    array-length v7, p1

    .line 27
    if-lez v6, :cond_1

    .line 28
    .line 29
    int-to-long v8, v7

    .line 30
    cmp-long v8, v1, v8

    .line 31
    .line 32
    if-gez v8, :cond_1

    .line 33
    .line 34
    long-to-int v8, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v8, v7

    .line 37
    :cond_2
    :goto_0
    if-lez v8, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0, p1, v3, v8}, Ljava/io/InputStream;->read([BII)I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    const/4 v10, -0x1

    .line 44
    if-eq v10, v9, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, p1, v3, v9}, Ljava/io/OutputStream;->write([BII)V

    .line 47
    .line 48
    .line 49
    int-to-long v9, v9

    .line 50
    add-long/2addr v4, v9

    .line 51
    if-lez v6, :cond_2

    .line 52
    .line 53
    sub-long v8, v1, v4

    .line 54
    .line 55
    int-to-long v10, v7

    .line 56
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    long-to-int v8, v8

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(I[BI)J
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-gt p2, v0, :cond_1

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, p2, :cond_0

    .line 9
    .line 10
    add-int v3, p0, v2

    .line 11
    .line 12
    aget-byte v3, p1, v3

    .line 13
    .line 14
    int-to-long v3, v3

    .line 15
    const-wide/16 v5, 0xff

    .line 16
    .line 17
    and-long/2addr v3, v5

    .line 18
    mul-int/lit8 v5, v2, 0x8

    .line 19
    .line 20
    shl-long/2addr v3, v5

    .line 21
    or-long/2addr v0, v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-wide v0

    .line 26
    :cond_1
    const-string p0, "Can\'t read more than eight bytes into a long value"

    .line 27
    .line 28
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-wide/16 p0, 0x0

    .line 32
    .line 33
    return-wide p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(IJ)I
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Math;->toIntExact(J)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Math;->addExact(II)I

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return p0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p2, "Argument too large or result overflows"

    .line 14
    .line 15
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method
