.class public Ltop/linl/dexparser/util/ConversionUtils;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static byte2Int([B)J
    .locals 4

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x3

    .line 8
    aget-byte v0, p0, v0

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    int-to-long v0, v0

    .line 13
    const/16 v2, 0x18

    .line 14
    .line 15
    shl-long/2addr v0, v2

    .line 16
    const/4 v2, 0x2

    .line 17
    aget-byte v2, p0, v2

    .line 18
    .line 19
    and-int/lit16 v2, v2, 0xff

    .line 20
    .line 21
    shl-int/lit8 v2, v2, 0x10

    .line 22
    .line 23
    int-to-long v2, v2

    .line 24
    or-long/2addr v0, v2

    .line 25
    const/4 v2, 0x1

    .line 26
    aget-byte v2, p0, v2

    .line 27
    .line 28
    and-int/lit16 v2, v2, 0xff

    .line 29
    .line 30
    shl-int/lit8 v2, v2, 0x8

    .line 31
    .line 32
    int-to-long v2, v2

    .line 33
    or-long/2addr v0, v2

    .line 34
    const/4 v2, 0x0

    .line 35
    aget-byte p0, p0, v2

    .line 36
    .line 37
    and-int/lit16 p0, p0, 0xff

    .line 38
    .line 39
    int-to-long v2, p0

    .line 40
    or-long/2addr v0, v2

    .line 41
    return-wide v0

    .line 42
    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    .line 43
    .line 44
    return-wide v0
.end method

.method public static byteToUnsignedInt([B)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x3

    .line 9
    aget-byte v1, p0, v1

    .line 10
    .line 11
    and-int/lit16 v1, v1, 0xff

    .line 12
    .line 13
    shl-int/lit8 v1, v1, 0x18

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    aget-byte v2, p0, v2

    .line 17
    .line 18
    and-int/lit16 v2, v2, 0xff

    .line 19
    .line 20
    shl-int/lit8 v2, v2, 0x10

    .line 21
    .line 22
    or-int/2addr v1, v2

    .line 23
    const/4 v2, 0x1

    .line 24
    aget-byte v2, p0, v2

    .line 25
    .line 26
    and-int/lit16 v2, v2, 0xff

    .line 27
    .line 28
    shl-int/lit8 v2, v2, 0x8

    .line 29
    .line 30
    or-int/2addr v1, v2

    .line 31
    aget-byte p0, p0, v0

    .line 32
    .line 33
    and-int/lit16 p0, p0, 0xff

    .line 34
    .line 35
    or-int/2addr p0, v1

    .line 36
    return p0

    .line 37
    :cond_1
    :goto_0
    return v0
.end method

.method public static bytesToHex([B)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    aget-byte v4, p0, v3

    .line 12
    .line 13
    and-int/lit16 v4, v4, 0xff

    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x2

    .line 24
    if-ge v5, v6, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static bytesToUnsignedBytes([B)[B
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p0

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-byte v2, p0, v1

    .line 9
    .line 10
    and-int/lit16 v2, v2, 0xff

    .line 11
    .line 12
    int-to-byte v2, v2

    .line 13
    aput-byte v2, v0, v1

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0
.end method

.method public static bytesToUnsignedShort([B)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    aget-byte v0, p0, v0

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    aget-byte p0, p0, v1

    .line 14
    .line 15
    and-int/lit16 p0, p0, 0xff

    .line 16
    .line 17
    shl-int/lit8 p0, p0, 0x8

    .line 18
    .line 19
    or-int/2addr p0, v0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    return v0
.end method

.method public static readULeb128([BI)I
    .locals 3

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    aput-byte v0, p0, p1

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    move p1, p0

    .line 8
    :cond_0
    and-int/lit8 v1, v0, 0x7f

    .line 9
    .line 10
    mul-int/lit8 v2, p1, 0x7

    .line 11
    .line 12
    shl-int/2addr v1, v2

    .line 13
    or-int/2addr p0, v1

    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    const/16 v1, 0x80

    .line 17
    .line 18
    and-int/lit16 v2, v0, 0x80

    .line 19
    .line 20
    if-ne v2, v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x5

    .line 23
    if-lt p1, v1, :cond_0

    .line 24
    .line 25
    :cond_1
    return p0
.end method
