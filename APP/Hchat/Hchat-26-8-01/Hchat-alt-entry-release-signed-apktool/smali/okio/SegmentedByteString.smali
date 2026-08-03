.class public final Lokio/SegmentedByteString;
.super Lokio/ByteString;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final transient directory:[I

.field private final transient segments:[[B


# direct methods
.method public constructor <init>([[B[I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lokio/ByteString;->getData$okio()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0, v0}, Lokio/ByteString;-><init>([B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lokio/SegmentedByteString;->segments:[[B

    .line 17
    .line 18
    iput-object p2, p0, Lokio/SegmentedByteString;->directory:[I

    .line 19
    .line 20
    return-void
.end method

.method private final toByteString()Lokio/ByteString;
    .locals 2

    .line 1
    new-instance v0, Lokio/ByteString;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokio/SegmentedByteString;->toByteArray()[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lokio/ByteString;-><init>([B)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->toByteArray()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public base64()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->base64()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public base64Url()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->base64Url()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public copyInto(I[BII)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-long v1, v0

    .line 9
    int-to-long v3, p1

    .line 10
    int-to-long v5, p4

    .line 11
    invoke-static/range {v1 .. v6}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 12
    .line 13
    .line 14
    array-length v0, p2

    .line 15
    int-to-long v0, v0

    .line 16
    int-to-long v7, p3

    .line 17
    move-wide v9, v5

    .line 18
    move-wide v5, v0

    .line 19
    invoke-static/range {v5 .. v10}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 20
    .line 21
    .line 22
    add-int/2addr p4, p1

    .line 23
    invoke-static {p0, p1}, Lokio/internal/-SegmentedByteString;->segment(Lokio/SegmentedByteString;I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    if-ge p1, p4, :cond_1

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    add-int/lit8 v2, v0, -0x1

    .line 38
    .line 39
    aget v1, v1, v2

    .line 40
    .line 41
    :goto_1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    aget v2, v2, v0

    .line 46
    .line 47
    sub-int/2addr v2, v1

    .line 48
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    array-length v4, v4

    .line 57
    add-int/2addr v4, v0

    .line 58
    aget v3, v3, v4

    .line 59
    .line 60
    add-int/2addr v2, v1

    .line 61
    invoke-static {p4, v2}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    sub-int/2addr v2, p1

    .line 66
    sub-int v1, p1, v1

    .line 67
    .line 68
    add-int/2addr v1, v3

    .line 69
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    aget-object v3, v3, v0

    .line 74
    .line 75
    add-int v4, v1, v2

    .line 76
    .line 77
    invoke-static {v3, p3, v1, p2, v4}, Ltf/l;->o0([BII[BI)V

    .line 78
    .line 79
    .line 80
    add-int/2addr p3, v2

    .line 81
    add-int/2addr p1, v2

    .line 82
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    return-void
.end method

.method public digest$okio(Ljava/lang/String;)Lokio/ByteString;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    array-length v0, v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    if-ge v1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    add-int v4, v0, v1

    .line 22
    .line 23
    aget v3, v3, v4

    .line 24
    .line 25
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    aget v4, v4, v1

    .line 30
    .line 31
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    aget-object v5, v5, v1

    .line 36
    .line 37
    sub-int v2, v4, v2

    .line 38
    .line 39
    invoke-virtual {p1, v5, v3, v2}, Ljava/security/MessageDigest;->update([BII)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    move v2, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v0, Lokio/ByteString;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p1}, Lokio/ByteString;-><init>([B)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lokio/ByteString;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lokio/ByteString;

    .line 11
    .line 12
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p0, v2, p1, v2, v1}, Lokio/SegmentedByteString;->rangeEquals(ILokio/ByteString;II)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return v0

    .line 33
    :cond_1
    return v2
.end method

.method public final getDirectory$okio()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSegments$okio()[[B
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    .line 2
    .line 3
    return-object v0
.end method

.method public getSize$okio()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v1, v1

    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    return v0
.end method

.method public hashCode()I
    .locals 8

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->getHashCode$okio()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    array-length v0, v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    move v3, v2

    .line 16
    move v2, v1

    .line 17
    :goto_0
    if-ge v1, v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int v5, v0, v1

    .line 24
    .line 25
    aget v4, v4, v5

    .line 26
    .line 27
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    aget v5, v5, v1

    .line 32
    .line 33
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    aget-object v6, v6, v1

    .line 38
    .line 39
    sub-int v2, v5, v2

    .line 40
    .line 41
    add-int/2addr v2, v4

    .line 42
    :goto_1
    if-ge v4, v2, :cond_1

    .line 43
    .line 44
    mul-int/lit8 v3, v3, 0x1f

    .line 45
    .line 46
    aget-byte v7, v6, v4

    .line 47
    .line 48
    add-int/2addr v3, v7

    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    move v2, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p0, v3}, Lokio/ByteString;->setHashCode$okio(I)V

    .line 57
    .line 58
    .line 59
    return v3
.end method

.method public hex()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public hmac$okio(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 12
    .line 13
    invoke-virtual {p2}, Lokio/ByteString;->toByteArray()[B

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {v1, p2, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    array-length p1, p1

    .line 28
    const/4 p2, 0x0

    .line 29
    move v1, p2

    .line 30
    :goto_0
    if-ge p2, p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    add-int v3, p1, p2

    .line 37
    .line 38
    aget v2, v2, v3

    .line 39
    .line 40
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    aget v3, v3, p2

    .line 45
    .line 46
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    aget-object v4, v4, p2

    .line 51
    .line 52
    sub-int v1, v3, v1

    .line 53
    .line 54
    invoke-virtual {v0, v4, v2, v1}, Ljavax/crypto/Mac;->update([BII)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 p2, p2, 0x1

    .line 58
    .line 59
    move v1, v3

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    new-instance p1, Lokio/ByteString;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-direct {p1, p2}, Lokio/ByteString;-><init>([B)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    return-object p1

    .line 76
    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 77
    .line 78
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p2
.end method

.method public indexOf([BI)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1, p2}, Lokio/ByteString;->indexOf([BI)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public internalArray$okio()[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->toByteArray()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public internalGet$okio(I)B
    .locals 7

    .line 1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v1, v1

    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    int-to-long v1, v0

    .line 15
    int-to-long v3, p1

    .line 16
    const-wide/16 v5, 0x1

    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Lokio/internal/-SegmentedByteString;->segment(Lokio/SegmentedByteString;I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    add-int/lit8 v2, v0, -0x1

    .line 34
    .line 35
    aget v1, v1, v2

    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    array-length v3, v3

    .line 46
    add-int/2addr v3, v0

    .line 47
    aget v2, v2, v3

    .line 48
    .line 49
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    aget-object v0, v3, v0

    .line 54
    .line 55
    sub-int/2addr p1, v1

    .line 56
    add-int/2addr p1, v2

    .line 57
    aget-byte p1, v0, p1

    .line 58
    .line 59
    return p1
.end method

.method public lastIndexOf([BI)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1, p2}, Lokio/ByteString;->lastIndexOf([BI)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public rangeEquals(ILokio/ByteString;II)Z
    .locals 6

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    .line 89
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    move-result v1

    sub-int/2addr v1, p4

    if-le p1, v1, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr p4, p1

    .line 90
    invoke-static {p0, p1}, Lokio/internal/-SegmentedByteString;->segment(Lokio/SegmentedByteString;I)I

    move-result v1

    :goto_0
    if-ge p1, p4, :cond_3

    if-nez v1, :cond_1

    move v2, v0

    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    move-result-object v2

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    .line 92
    :goto_1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    move-result-object v3

    aget v3, v3, v1

    sub-int/2addr v3, v2

    .line 93
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    move-result-object v4

    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    move-result-object v5

    array-length v5, v5

    add-int/2addr v5, v1

    aget v4, v4, v5

    add-int/2addr v3, v2

    .line 94
    invoke-static {p4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, p1

    sub-int v2, p1, v2

    add-int/2addr v2, v4

    .line 95
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    move-result-object v4

    aget-object v4, v4, v1

    .line 96
    invoke-virtual {p2, p3, v4, v2, v3}, Lokio/ByteString;->rangeEquals(I[BII)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_2
    add-int/2addr p3, v3

    add-int/2addr p1, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_2
    return v0
.end method

.method public rangeEquals(I[BII)Z
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sub-int/2addr v1, p4

    .line 12
    if-gt p1, v1, :cond_4

    .line 13
    .line 14
    if-ltz p3, :cond_4

    .line 15
    .line 16
    array-length v1, p2

    .line 17
    sub-int/2addr v1, p4

    .line 18
    if-le p3, v1, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    add-int/2addr p4, p1

    .line 22
    invoke-static {p0, p1}, Lokio/internal/-SegmentedByteString;->segment(Lokio/SegmentedByteString;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    :goto_0
    if-ge p1, p4, :cond_3

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    move v2, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    add-int/lit8 v3, v1, -0x1

    .line 37
    .line 38
    aget v2, v2, v3

    .line 39
    .line 40
    :goto_1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    aget v3, v3, v1

    .line 45
    .line 46
    sub-int/2addr v3, v2

    .line 47
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    array-length v5, v5

    .line 56
    add-int/2addr v5, v1

    .line 57
    aget v4, v4, v5

    .line 58
    .line 59
    add-int/2addr v3, v2

    .line 60
    invoke-static {p4, v3}, Ljava/lang/Math;->min(II)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    sub-int/2addr v3, p1

    .line 65
    sub-int v2, p1, v2

    .line 66
    .line 67
    add-int/2addr v2, v4

    .line 68
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    aget-object v4, v4, v1

    .line 73
    .line 74
    invoke-static {v4, v2, p2, p3, v3}, Lokio/-SegmentedByteString;->arrayRangeEquals([BI[BII)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    return v0

    .line 81
    :cond_2
    add-int/2addr p3, v3

    .line 82
    add-int/2addr p1, v3

    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    const/4 p1, 0x1

    .line 87
    return p1

    .line 88
    :cond_4
    :goto_2
    return v0
.end method

.method public string(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Lokio/ByteString;->string(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public substring(II)Lokio/ByteString;
    .locals 10

    .line 1
    invoke-static {p0, p2}, Lokio/-SegmentedByteString;->resolveDefaultParameter(Lokio/ByteString;I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-ltz p1, :cond_6

    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "endIndex="

    .line 12
    .line 13
    if-gt p2, v0, :cond_5

    .line 14
    .line 15
    sub-int v0, p2, p1

    .line 16
    .line 17
    if-ltz v0, :cond_4

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne p2, v1, :cond_0

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    if-ne p1, p2, :cond_1

    .line 29
    .line 30
    sget-object p1, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    invoke-static {p0, p1}, Lokio/internal/-SegmentedByteString;->segment(Lokio/SegmentedByteString;I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/lit8 p2, p2, -0x1

    .line 38
    .line 39
    invoke-static {p0, p2}, Lokio/internal/-SegmentedByteString;->segment(Lokio/SegmentedByteString;I)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    add-int/lit8 v3, p2, 0x1

    .line 48
    .line 49
    invoke-static {v2, v1, v3}, Ltf/l;->u0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, [[B

    .line 54
    .line 55
    array-length v3, v2

    .line 56
    mul-int/lit8 v3, v3, 0x2

    .line 57
    .line 58
    new-array v3, v3, [I

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    if-gt v1, p2, :cond_2

    .line 62
    .line 63
    move v6, v1

    .line 64
    move v5, v4

    .line 65
    :goto_0
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    aget v7, v7, v6

    .line 70
    .line 71
    sub-int/2addr v7, p1

    .line 72
    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    aput v7, v3, v5

    .line 77
    .line 78
    add-int/lit8 v7, v5, 0x1

    .line 79
    .line 80
    array-length v8, v2

    .line 81
    add-int/2addr v5, v8

    .line 82
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    array-length v9, v9

    .line 91
    add-int/2addr v9, v6

    .line 92
    aget v8, v8, v9

    .line 93
    .line 94
    aput v8, v3, v5

    .line 95
    .line 96
    if-eq v6, p2, :cond_2

    .line 97
    .line 98
    add-int/lit8 v6, v6, 0x1

    .line 99
    .line 100
    move v5, v7

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    if-nez v1, :cond_3

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    add-int/lit8 v1, v1, -0x1

    .line 110
    .line 111
    aget v4, p2, v1

    .line 112
    .line 113
    :goto_1
    array-length p2, v2

    .line 114
    aget v0, v3, p2

    .line 115
    .line 116
    sub-int/2addr p1, v4

    .line 117
    add-int/2addr p1, v0

    .line 118
    aput p1, v3, p2

    .line 119
    .line 120
    new-instance p1, Lokio/SegmentedByteString;

    .line 121
    .line 122
    invoke-direct {p1, v2, v3}, Lokio/SegmentedByteString;-><init>([[B[I)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :cond_4
    const-string v0, " < beginIndex="

    .line 127
    .line 128
    invoke-static {p2, v1, v0, p1}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x0

    .line 136
    return-object p1

    .line 137
    :cond_5
    const-string p1, " > length("

    .line 138
    .line 139
    invoke-static {p2, v1, p1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const/16 p2, 0x29

    .line 151
    .line 152
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p2

    .line 169
    :cond_6
    const-string p2, "beginIndex="

    .line 170
    .line 171
    const-string v0, " < 0"

    .line 172
    .line 173
    invoke-static {p1, p2, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    const/4 p1, 0x0

    .line 181
    return-object p1
.end method

.method public toAsciiLowercase()Lokio/ByteString;
    .locals 1

    .line 1
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->toAsciiLowercase()Lokio/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public toAsciiUppercase()Lokio/ByteString;
    .locals 1

    .line 1
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->toAsciiUppercase()Lokio/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public toByteArray()[B
    .locals 9

    .line 1
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    array-length v1, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    add-int v6, v1, v2

    .line 22
    .line 23
    aget v5, v5, v6

    .line 24
    .line 25
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    aget v6, v6, v2

    .line 30
    .line 31
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    aget-object v7, v7, v2

    .line 36
    .line 37
    sub-int v3, v6, v3

    .line 38
    .line 39
    add-int v8, v5, v3

    .line 40
    .line 41
    invoke-static {v7, v4, v5, v0, v8}, Ltf/l;->o0([BII[BI)V

    .line 42
    .line 43
    .line 44
    add-int/2addr v4, v3

    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    move v3, v6

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokio/ByteString;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public write(Ljava/io/OutputStream;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    array-length v0, v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    add-int v4, v0, v1

    .line 18
    .line 19
    aget v3, v3, v4

    .line 20
    .line 21
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    aget v4, v4, v1

    .line 26
    .line 27
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    aget-object v5, v5, v1

    .line 32
    .line 33
    sub-int v2, v4, v2

    .line 34
    .line 35
    invoke-virtual {p1, v5, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    move v2, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
.end method

.method public write$okio(Lokio/Buffer;II)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    add-int v0, p2, p3

    .line 5
    .line 6
    invoke-static {p0, p2}, Lokio/internal/-SegmentedByteString;->segment(Lokio/SegmentedByteString;I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    :goto_0
    if-ge p2, v0, :cond_2

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    add-int/lit8 v3, v1, -0x1

    .line 21
    .line 22
    aget v2, v2, v3

    .line 23
    .line 24
    :goto_1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    aget v3, v3, v1

    .line 29
    .line 30
    sub-int/2addr v3, v2

    .line 31
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    array-length v5, v5

    .line 40
    add-int/2addr v5, v1

    .line 41
    aget v4, v4, v5

    .line 42
    .line 43
    add-int/2addr v3, v2

    .line 44
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sub-int/2addr v3, p2

    .line 49
    sub-int v2, p2, v2

    .line 50
    .line 51
    add-int v7, v2, v4

    .line 52
    .line 53
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    aget-object v6, v2, v1

    .line 58
    .line 59
    new-instance v5, Lokio/Segment;

    .line 60
    .line 61
    add-int v8, v7, v3

    .line 62
    .line 63
    const/4 v9, 0x1

    .line 64
    const/4 v10, 0x0

    .line 65
    invoke-direct/range {v5 .. v10}, Lokio/Segment;-><init>([BIIZZ)V

    .line 66
    .line 67
    .line 68
    iget-object v2, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 69
    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    iput-object v5, v5, Lokio/Segment;->prev:Lokio/Segment;

    .line 73
    .line 74
    iput-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 75
    .line 76
    iput-object v5, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v5}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 88
    .line 89
    .line 90
    :goto_2
    add-int/2addr p2, v3

    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    int-to-long p2, p3

    .line 99
    add-long/2addr v0, p2

    .line 100
    invoke-virtual {p1, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 101
    .line 102
    .line 103
    return-void
.end method
