.class public final Lokio/Buffer;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lokio/BufferedSource;
.implements Lokio/BufferedSink;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokio/Buffer$UnsafeCursor;
    }
.end annotation


# instance fields
.field public head:Lokio/Segment;

.field private size:J


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

.method public static synthetic copyTo$default(Lokio/Buffer;Ljava/io/OutputStream;JJILjava/lang/Object;)Lokio/Buffer;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const-wide/16 p2, 0x0

    .line 6
    .line 7
    :cond_0
    move-wide v2, p2

    .line 8
    and-int/lit8 p2, p6, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-wide p2, p0, Lokio/Buffer;->size:J

    .line 13
    .line 14
    sub-long p4, p2, v2

    .line 15
    .line 16
    :cond_1
    move-object v0, p0

    .line 17
    move-object v1, p1

    .line 18
    move-wide v4, p4

    .line 19
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Ljava/io/OutputStream;JJ)Lokio/Buffer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static synthetic copyTo$default(Lokio/Buffer;Lokio/Buffer;JILjava/lang/Object;)Lokio/Buffer;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x0

    .line 25
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->copyTo(Lokio/Buffer;J)Lokio/Buffer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic copyTo$default(Lokio/Buffer;Lokio/Buffer;JJILjava/lang/Object;)Lokio/Buffer;
    .locals 6

    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    .line 24
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    move-result-object p0

    return-object p0
.end method

.method private final digest(Ljava/lang/String;)Lokio/ByteString;
    .locals 5

    .line 1
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lokio/Segment;->data:[B

    .line 10
    .line 11
    iget v2, v0, Lokio/Segment;->pos:I

    .line 12
    .line 13
    iget v3, v0, Lokio/Segment;->limit:I

    .line 14
    .line 15
    sub-int/2addr v3, v2

    .line 16
    invoke-virtual {p1, v1, v2, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    :goto_0
    if-eq v1, v0, :cond_0

    .line 25
    .line 26
    iget-object v2, v1, Lokio/Segment;->data:[B

    .line 27
    .line 28
    iget v3, v1, Lokio/Segment;->pos:I

    .line 29
    .line 30
    iget v4, v1, Lokio/Segment;->limit:I

    .line 31
    .line 32
    sub-int/2addr v4, v3

    .line 33
    invoke-virtual {p1, v2, v3, v4}, Ljava/security/MessageDigest;->update([BII)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v1, Lokio/Segment;->next:Lokio/Segment;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v0, Lokio/ByteString;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, p1}, Lokio/ByteString;-><init>([B)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method private final hmac(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 6
    .line 7
    invoke-virtual {p2}, Lokio/ByteString;->internalArray$okio()[B

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {v1, p2, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p2, p1, Lokio/Segment;->data:[B

    .line 22
    .line 23
    iget v1, p1, Lokio/Segment;->pos:I

    .line 24
    .line 25
    iget v2, p1, Lokio/Segment;->limit:I

    .line 26
    .line 27
    sub-int/2addr v2, v1

    .line 28
    invoke-virtual {v0, p2, v1, v2}, Ljavax/crypto/Mac;->update([BII)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    :goto_0
    if-eq p2, p1, :cond_0

    .line 37
    .line 38
    iget-object v1, p2, Lokio/Segment;->data:[B

    .line 39
    .line 40
    iget v2, p2, Lokio/Segment;->pos:I

    .line 41
    .line 42
    iget v3, p2, Lokio/Segment;->limit:I

    .line 43
    .line 44
    sub-int/2addr v3, v2

    .line 45
    invoke-virtual {v0, v1, v2, v3}, Ljavax/crypto/Mac;->update([BII)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p2, Lokio/Segment;->next:Lokio/Segment;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance p1, Lokio/ByteString;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, p2}, Lokio/ByteString;-><init>([B)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw p2
.end method

.method public static synthetic readAndWriteUnsafe$default(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;ILjava/lang/Object;)Lokio/Buffer$UnsafeCursor;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lokio/-SegmentedByteString;->getDEFAULT__new_UnsafeCursor()Lokio/Buffer$UnsafeCursor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lokio/Buffer;->readAndWriteUnsafe(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private final readFrom(Ljava/io/InputStream;JZ)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p2, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    if-eqz p4, :cond_2

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v1, v0, Lokio/Segment;->limit:I

    .line 15
    .line 16
    rsub-int v1, v1, 0x2000

    .line 17
    .line 18
    int-to-long v1, v1

    .line 19
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    long-to-int v1, v1

    .line 24
    iget-object v2, v0, Lokio/Segment;->data:[B

    .line 25
    .line 26
    iget v3, v0, Lokio/Segment;->limit:I

    .line 27
    .line 28
    invoke-virtual {p1, v2, v3, v1}, Ljava/io/InputStream;->read([BII)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, -0x1

    .line 33
    if-ne v1, v2, :cond_4

    .line 34
    .line 35
    iget p1, v0, Lokio/Segment;->pos:I

    .line 36
    .line 37
    iget p2, v0, Lokio/Segment;->limit:I

    .line 38
    .line 39
    if-ne p1, p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 46
    .line 47
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    if-eqz p4, :cond_3

    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :cond_3
    invoke-static {}, Lj8/o;->a()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_4
    iget v2, v0, Lokio/Segment;->limit:I

    .line 58
    .line 59
    add-int/2addr v2, v1

    .line 60
    iput v2, v0, Lokio/Segment;->limit:I

    .line 61
    .line 62
    iget-wide v2, p0, Lokio/Buffer;->size:J

    .line 63
    .line 64
    int-to-long v0, v1

    .line 65
    add-long/2addr v2, v0

    .line 66
    iput-wide v2, p0, Lokio/Buffer;->size:J

    .line 67
    .line 68
    sub-long/2addr p2, v0

    .line 69
    goto :goto_0
.end method

.method public static synthetic readUnsafe$default(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;ILjava/lang/Object;)Lokio/Buffer$UnsafeCursor;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lokio/-SegmentedByteString;->getDEFAULT__new_UnsafeCursor()Lokio/Buffer$UnsafeCursor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lokio/Buffer;->readUnsafe(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static synthetic writeTo$default(Lokio/Buffer;Ljava/io/OutputStream;JILjava/lang/Object;)Lokio/Buffer;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-wide p2, p0, Lokio/Buffer;->size:J

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->writeTo(Ljava/io/OutputStream;J)Lokio/Buffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final -deprecated_getByte(J)B
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->getByte(J)B

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final -deprecated_size()J
    .locals 2
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public buffer()Lokio/Buffer;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final clear()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->clone()Lokio/Buffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public clone()Lokio/Buffer;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lokio/Buffer;->copy()Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final completeSegmentByteCount()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget v3, v2, Lokio/Segment;->limit:I

    .line 23
    .line 24
    const/16 v4, 0x2000

    .line 25
    .line 26
    if-ge v3, v4, :cond_1

    .line 27
    .line 28
    iget-boolean v4, v2, Lokio/Segment;->owner:Z

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    iget v2, v2, Lokio/Segment;->pos:I

    .line 33
    .line 34
    sub-int/2addr v3, v2

    .line 35
    int-to-long v2, v3

    .line 36
    sub-long/2addr v0, v2

    .line 37
    :cond_1
    return-wide v0
.end method

.method public final copy()Lokio/Buffer;
    .locals 6

    .line 1
    new-instance v0, Lokio/Buffer;

    .line 2
    .line 3
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lokio/Segment;->sharedCopy()Lokio/Segment;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 27
    .line 28
    iput-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 29
    .line 30
    iput-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 31
    .line 32
    iget-object v3, v1, Lokio/Segment;->next:Lokio/Segment;

    .line 33
    .line 34
    :goto_0
    if-eq v3, v1, :cond_1

    .line 35
    .line 36
    iget-object v4, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lokio/Segment;->sharedCopy()Lokio/Segment;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v4, v5}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 49
    .line 50
    .line 51
    iget-object v3, v3, Lokio/Segment;->next:Lokio/Segment;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    invoke-virtual {v0, v1, v2}, Lokio/Buffer;->setSize$okio(J)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public final copyTo(Ljava/io/OutputStream;)Lokio/Buffer;
    .locals 8

    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lokio/Buffer;->copyTo$default(Lokio/Buffer;Ljava/io/OutputStream;JJILjava/lang/Object;)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public final copyTo(Ljava/io/OutputStream;J)Lokio/Buffer;
    .locals 8

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-static/range {v0 .. v7}, Lokio/Buffer;->copyTo$default(Lokio/Buffer;Ljava/io/OutputStream;JJILjava/lang/Object;)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public final copyTo(Ljava/io/OutputStream;JJ)Lokio/Buffer;
    .locals 8

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    iget-wide v0, p0, Lokio/Buffer;->size:J

    move-wide v2, p2

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    const-wide/16 p2, 0x0

    cmp-long p4, v4, p2

    if-nez p4, :cond_0

    goto :goto_2

    .line 115
    :cond_0
    iget-object p4, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 116
    :goto_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p5, p4, Lokio/Segment;->limit:I

    iget v0, p4, Lokio/Segment;->pos:I

    sub-int v1, p5, v0

    int-to-long v6, v1

    cmp-long v1, v2, v6

    if-ltz v1, :cond_1

    sub-int/2addr p5, v0

    int-to-long v0, p5

    sub-long/2addr v2, v0

    .line 117
    iget-object p4, p4, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0

    :cond_1
    move-object v0, p4

    move-wide p4, v4

    :goto_1
    cmp-long v1, p4, p2

    if-lez v1, :cond_2

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lokio/Segment;->pos:I

    int-to-long v4, v1

    add-long/2addr v4, v2

    long-to-int v1, v4

    .line 119
    iget v2, v0, Lokio/Segment;->limit:I

    sub-int/2addr v2, v1

    int-to-long v2, v2

    .line 120
    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v2, v2

    .line 121
    iget-object v3, v0, Lokio/Segment;->data:[B

    invoke-virtual {p1, v3, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v1, v2

    sub-long/2addr p4, v1

    .line 122
    iget-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    move-wide v2, p2

    goto :goto_1

    :cond_2
    :goto_2
    return-object p0
.end method

.method public final copyTo(Lokio/Buffer;J)Lokio/Buffer;
    .locals 8

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    iget-wide v0, p0, Lokio/Buffer;->size:J

    sub-long v6, v0, p2

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-virtual/range {v2 .. v7}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public final copyTo(Lokio/Buffer;JJ)Lokio/Buffer;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    move-wide v2, p2

    .line 9
    move-wide v4, p4

    .line 10
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 11
    .line 12
    .line 13
    const-wide/16 p2, 0x0

    .line 14
    .line 15
    cmp-long p4, v4, p2

    .line 16
    .line 17
    if-nez p4, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 21
    .line 22
    .line 23
    move-result-wide p4

    .line 24
    add-long/2addr p4, v4

    .line 25
    invoke-virtual {p1, p4, p5}, Lokio/Buffer;->setSize$okio(J)V

    .line 26
    .line 27
    .line 28
    iget-object p4, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 29
    .line 30
    :goto_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget p5, p4, Lokio/Segment;->limit:I

    .line 34
    .line 35
    iget v0, p4, Lokio/Segment;->pos:I

    .line 36
    .line 37
    sub-int v1, p5, v0

    .line 38
    .line 39
    int-to-long v6, v1

    .line 40
    cmp-long v1, v2, v6

    .line 41
    .line 42
    if-ltz v1, :cond_1

    .line 43
    .line 44
    sub-int/2addr p5, v0

    .line 45
    int-to-long v0, p5

    .line 46
    sub-long/2addr v2, v0

    .line 47
    iget-object p4, p4, Lokio/Segment;->next:Lokio/Segment;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v0, p4

    .line 51
    move-wide p4, v4

    .line 52
    :goto_1
    cmp-long v1, p4, p2

    .line 53
    .line 54
    if-lez v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lokio/Segment;->sharedCopy()Lokio/Segment;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget v4, v1, Lokio/Segment;->pos:I

    .line 64
    .line 65
    long-to-int v2, v2

    .line 66
    add-int/2addr v4, v2

    .line 67
    iput v4, v1, Lokio/Segment;->pos:I

    .line 68
    .line 69
    long-to-int v2, p4

    .line 70
    add-int/2addr v4, v2

    .line 71
    iget v2, v1, Lokio/Segment;->limit:I

    .line 72
    .line 73
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    iput v2, v1, Lokio/Segment;->limit:I

    .line 78
    .line 79
    iget-object v2, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 80
    .line 81
    if-nez v2, :cond_2

    .line 82
    .line 83
    iput-object v1, v1, Lokio/Segment;->prev:Lokio/Segment;

    .line 84
    .line 85
    iput-object v1, v1, Lokio/Segment;->next:Lokio/Segment;

    .line 86
    .line 87
    iput-object v1, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v1}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 99
    .line 100
    .line 101
    :goto_2
    iget v2, v1, Lokio/Segment;->limit:I

    .line 102
    .line 103
    iget v1, v1, Lokio/Segment;->pos:I

    .line 104
    .line 105
    sub-int/2addr v2, v1

    .line 106
    int-to-long v1, v2

    .line 107
    sub-long/2addr p4, v1

    .line 108
    iget-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 109
    .line 110
    move-wide v2, p2

    .line 111
    goto :goto_1

    .line 112
    :cond_3
    :goto_3
    return-object p0
.end method

.method public emit()Lokio/Buffer;
    .locals 0

    .line 6
    return-object p0
.end method

.method public bridge synthetic emit()Lokio/BufferedSink;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->emit()Lokio/Buffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public emitCompleteSegments()Lokio/Buffer;
    .locals 0

    .line 6
    return-object p0
.end method

.method public bridge synthetic emitCompleteSegments()Lokio/BufferedSink;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->emitCompleteSegments()Lokio/Buffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, Lokio/Buffer;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    check-cast v1, Lokio/Buffer;

    .line 20
    .line 21
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    cmp-long v3, v5, v7

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    return v4

    .line 30
    :cond_2
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    const-wide/16 v7, 0x0

    .line 35
    .line 36
    cmp-long v3, v5, v7

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    return v2

    .line 41
    :cond_3
    iget-object v3, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v1, v1, Lokio/Buffer;->head:Lokio/Segment;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget v5, v3, Lokio/Segment;->pos:I

    .line 52
    .line 53
    iget v6, v1, Lokio/Segment;->pos:I

    .line 54
    .line 55
    move-wide v9, v7

    .line 56
    :goto_0
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    cmp-long v11, v9, v11

    .line 61
    .line 62
    if-gez v11, :cond_8

    .line 63
    .line 64
    iget v11, v3, Lokio/Segment;->limit:I

    .line 65
    .line 66
    sub-int/2addr v11, v5

    .line 67
    iget v12, v1, Lokio/Segment;->limit:I

    .line 68
    .line 69
    sub-int/2addr v12, v6

    .line 70
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    int-to-long v11, v11

    .line 75
    move-wide v13, v7

    .line 76
    :goto_1
    cmp-long v15, v13, v11

    .line 77
    .line 78
    if-gez v15, :cond_5

    .line 79
    .line 80
    iget-object v15, v3, Lokio/Segment;->data:[B

    .line 81
    .line 82
    add-int/lit8 v16, v5, 0x1

    .line 83
    .line 84
    aget-byte v5, v15, v5

    .line 85
    .line 86
    iget-object v15, v1, Lokio/Segment;->data:[B

    .line 87
    .line 88
    add-int/lit8 v17, v6, 0x1

    .line 89
    .line 90
    aget-byte v6, v15, v6

    .line 91
    .line 92
    if-eq v5, v6, :cond_4

    .line 93
    .line 94
    return v4

    .line 95
    :cond_4
    const-wide/16 v5, 0x1

    .line 96
    .line 97
    add-long/2addr v13, v5

    .line 98
    move/from16 v5, v16

    .line 99
    .line 100
    move/from16 v6, v17

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    iget v13, v3, Lokio/Segment;->limit:I

    .line 104
    .line 105
    if-ne v5, v13, :cond_6

    .line 106
    .line 107
    iget-object v3, v3, Lokio/Segment;->next:Lokio/Segment;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget v5, v3, Lokio/Segment;->pos:I

    .line 113
    .line 114
    :cond_6
    iget v13, v1, Lokio/Segment;->limit:I

    .line 115
    .line 116
    if-ne v6, v13, :cond_7

    .line 117
    .line 118
    iget-object v1, v1, Lokio/Segment;->next:Lokio/Segment;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget v6, v1, Lokio/Segment;->pos:I

    .line 124
    .line 125
    :cond_7
    add-long/2addr v9, v11

    .line 126
    goto :goto_0

    .line 127
    :cond_8
    return v2
.end method

.method public exhausted()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public getBuffer()Lokio/Buffer;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getByte(J)B
    .locals 7

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v4, 0x1

    .line 6
    .line 7
    move-wide v2, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sub-long/2addr v0, v2

    .line 21
    cmp-long p2, v0, v2

    .line 22
    .line 23
    if-gez p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    :goto_0
    cmp-long p2, v0, v2

    .line 30
    .line 31
    if-lez p2, :cond_0

    .line 32
    .line 33
    iget-object p1, p1, Lokio/Segment;->prev:Lokio/Segment;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget p2, p1, Lokio/Segment;->limit:I

    .line 39
    .line 40
    iget v4, p1, Lokio/Segment;->pos:I

    .line 41
    .line 42
    sub-int/2addr p2, v4

    .line 43
    int-to-long v4, p2

    .line 44
    sub-long/2addr v0, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object p2, p1, Lokio/Segment;->data:[B

    .line 47
    .line 48
    iget p1, p1, Lokio/Segment;->pos:I

    .line 49
    .line 50
    int-to-long v4, p1

    .line 51
    add-long/2addr v4, v2

    .line 52
    sub-long/2addr v4, v0

    .line 53
    long-to-int p1, v4

    .line 54
    aget-byte p1, p2, p1

    .line 55
    .line 56
    return p1

    .line 57
    :cond_1
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    :goto_1
    iget p2, p1, Lokio/Segment;->limit:I

    .line 60
    .line 61
    iget v4, p1, Lokio/Segment;->pos:I

    .line 62
    .line 63
    sub-int/2addr p2, v4

    .line 64
    int-to-long v5, p2

    .line 65
    add-long/2addr v5, v0

    .line 66
    cmp-long p2, v5, v2

    .line 67
    .line 68
    if-gtz p2, :cond_2

    .line 69
    .line 70
    iget-object p1, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-wide v0, v5

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    iget-object p1, p1, Lokio/Segment;->data:[B

    .line 78
    .line 79
    int-to-long v4, v4

    .line 80
    add-long/2addr v4, v2

    .line 81
    sub-long/2addr v4, v0

    .line 82
    long-to-int p2, v4

    .line 83
    aget-byte p1, p1, p2

    .line 84
    .line 85
    return p1
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, 0x1

    .line 8
    :cond_1
    iget v2, v0, Lokio/Segment;->pos:I

    .line 9
    .line 10
    iget v3, v0, Lokio/Segment;->limit:I

    .line 11
    .line 12
    :goto_0
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v4, v0, Lokio/Segment;->data:[B

    .line 17
    .line 18
    aget-byte v4, v4, v2

    .line 19
    .line 20
    add-int/2addr v1, v4

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 30
    .line 31
    if-ne v0, v2, :cond_1

    .line 32
    .line 33
    return v1
.end method

.method public final hmacSha1(Lokio/ByteString;)Lokio/ByteString;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "HmacSHA1"

    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lokio/Buffer;->hmac(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final hmacSha256(Lokio/ByteString;)Lokio/ByteString;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "HmacSHA256"

    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lokio/Buffer;->hmac(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final hmacSha512(Lokio/ByteString;)Lokio/ByteString;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "HmacSHA512"

    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lokio/Buffer;->hmac(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public indexOf(B)J
    .locals 6

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    .line 308
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->indexOf(BJJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public indexOf(BJ)J
    .locals 6

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    .line 284
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->indexOf(BJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public indexOf(BJJ)J
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, v0, p2

    if-gtz v2, :cond_c

    cmp-long v2, p2, p4

    if-gtz v2, :cond_c

    .line 286
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v2

    cmp-long v2, p4, v2

    if-lez v2, :cond_0

    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide p4

    :cond_0
    cmp-long v2, p2, p4

    const-wide/16 v3, -0x1

    if-nez v2, :cond_1

    return-wide v3

    .line 287
    :cond_1
    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v2, :cond_2

    return-wide v3

    .line 288
    :cond_2
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v5

    sub-long/2addr v5, p2

    cmp-long v5, v5, p2

    if-gez v5, :cond_7

    .line 289
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    :goto_0
    cmp-long v5, v0, p2

    if-lez v5, :cond_3

    .line 290
    iget-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    iget v5, v2, Lokio/Segment;->limit:I

    iget v6, v2, Lokio/Segment;->pos:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    sub-long/2addr v0, v5

    goto :goto_0

    :cond_3
    :goto_1
    cmp-long v5, v0, p4

    if-gez v5, :cond_6

    .line 292
    iget-object v5, v2, Lokio/Segment;->data:[B

    .line 293
    iget v6, v2, Lokio/Segment;->limit:I

    int-to-long v6, v6

    iget v8, v2, Lokio/Segment;->pos:I

    int-to-long v8, v8

    add-long/2addr v8, p4

    sub-long/2addr v8, v0

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v6, v6

    .line 294
    iget v7, v2, Lokio/Segment;->pos:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    :goto_2
    if-ge p2, v6, :cond_5

    .line 295
    aget-byte p3, v5, p2

    if-ne p3, p1, :cond_4

    .line 296
    :goto_3
    iget p1, v2, Lokio/Segment;->pos:I

    sub-int/2addr p2, p1

    int-to-long p1, p2

    add-long/2addr p1, v0

    return-wide p1

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 297
    :cond_5
    iget p2, v2, Lokio/Segment;->limit:I

    iget p3, v2, Lokio/Segment;->pos:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    .line 298
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide p2, v0

    goto :goto_1

    :cond_6
    return-wide v3

    .line 299
    :cond_7
    :goto_4
    iget v5, v2, Lokio/Segment;->limit:I

    iget v6, v2, Lokio/Segment;->pos:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    add-long/2addr v5, v0

    cmp-long v7, v5, p2

    if-gtz v7, :cond_8

    .line 300
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v0, v5

    goto :goto_4

    :cond_8
    :goto_5
    cmp-long v5, v0, p4

    if-gez v5, :cond_b

    .line 301
    iget-object v5, v2, Lokio/Segment;->data:[B

    .line 302
    iget v6, v2, Lokio/Segment;->limit:I

    int-to-long v6, v6

    iget v8, v2, Lokio/Segment;->pos:I

    int-to-long v8, v8

    add-long/2addr v8, p4

    sub-long/2addr v8, v0

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v6, v6

    .line 303
    iget v7, v2, Lokio/Segment;->pos:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    :goto_6
    if-ge p2, v6, :cond_a

    .line 304
    aget-byte p3, v5, p2

    if-ne p3, p1, :cond_9

    goto :goto_3

    :cond_9
    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    .line 305
    :cond_a
    iget p2, v2, Lokio/Segment;->limit:I

    iget p3, v2, Lokio/Segment;->pos:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    .line 306
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide p2, v0

    goto :goto_5

    :cond_b
    return-wide v3

    .line 307
    :cond_c
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "size="

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " fromIndex="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " toIndex="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public indexOf(Lokio/ByteString;)J
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    .line 285
    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->indexOf(Lokio/ByteString;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public indexOf(Lokio/ByteString;J)J
    .locals 18

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-lez v2, :cond_d

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v4, v0, v2

    .line 15
    .line 16
    if-ltz v4, :cond_c

    .line 17
    .line 18
    move-object/from16 v4, p0

    .line 19
    .line 20
    iget-object v5, v4, Lokio/Buffer;->head:Lokio/Segment;

    .line 21
    .line 22
    const-wide/16 v6, -0x1

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    return-wide v6

    .line 27
    :cond_0
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 28
    .line 29
    .line 30
    move-result-wide v8

    .line 31
    sub-long/2addr v8, v0

    .line 32
    cmp-long v8, v8, v0

    .line 33
    .line 34
    const-wide/16 v9, 0x1

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    if-gez v8, :cond_6

    .line 38
    .line 39
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    :goto_0
    cmp-long v8, v2, v0

    .line 44
    .line 45
    if-lez v8, :cond_1

    .line 46
    .line 47
    iget-object v5, v5, Lokio/Segment;->prev:Lokio/Segment;

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget v8, v5, Lokio/Segment;->limit:I

    .line 53
    .line 54
    iget v13, v5, Lokio/Segment;->pos:I

    .line 55
    .line 56
    sub-int/2addr v8, v13

    .line 57
    int-to-long v13, v8

    .line 58
    sub-long/2addr v2, v13

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->internalArray$okio()[B

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    aget-byte v11, v8, v11

    .line 65
    .line 66
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->size()I

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 71
    .line 72
    .line 73
    move-result-wide v14

    .line 74
    move-wide/from16 v16, v6

    .line 75
    .line 76
    int-to-long v6, v13

    .line 77
    sub-long/2addr v14, v6

    .line 78
    add-long/2addr v14, v9

    .line 79
    :goto_1
    cmp-long v6, v2, v14

    .line 80
    .line 81
    if-gez v6, :cond_5

    .line 82
    .line 83
    iget-object v6, v5, Lokio/Segment;->data:[B

    .line 84
    .line 85
    iget v7, v5, Lokio/Segment;->limit:I

    .line 86
    .line 87
    iget v9, v5, Lokio/Segment;->pos:I

    .line 88
    .line 89
    int-to-long v9, v9

    .line 90
    add-long/2addr v9, v14

    .line 91
    sub-long/2addr v9, v2

    .line 92
    move/from16 p1, v13

    .line 93
    .line 94
    int-to-long v12, v7

    .line 95
    invoke-static {v12, v13, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 96
    .line 97
    .line 98
    move-result-wide v9

    .line 99
    long-to-int v7, v9

    .line 100
    iget v9, v5, Lokio/Segment;->pos:I

    .line 101
    .line 102
    int-to-long v9, v9

    .line 103
    add-long/2addr v9, v0

    .line 104
    sub-long/2addr v9, v2

    .line 105
    long-to-int v0, v9

    .line 106
    :goto_2
    if-ge v0, v7, :cond_4

    .line 107
    .line 108
    aget-byte v1, v6, v0

    .line 109
    .line 110
    if-ne v1, v11, :cond_2

    .line 111
    .line 112
    add-int/lit8 v1, v0, 0x1

    .line 113
    .line 114
    move/from16 v9, p1

    .line 115
    .line 116
    const/4 v10, 0x1

    .line 117
    invoke-static {v5, v1, v8, v10, v9}, Lokio/internal/-Buffer;->rangeEquals(Lokio/Segment;I[BII)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    iget v1, v5, Lokio/Segment;->pos:I

    .line 124
    .line 125
    sub-int/2addr v0, v1

    .line 126
    int-to-long v0, v0

    .line 127
    add-long/2addr v0, v2

    .line 128
    return-wide v0

    .line 129
    :cond_2
    move/from16 v9, p1

    .line 130
    .line 131
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    move/from16 p1, v9

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    move/from16 v9, p1

    .line 137
    .line 138
    iget v0, v5, Lokio/Segment;->limit:I

    .line 139
    .line 140
    iget v1, v5, Lokio/Segment;->pos:I

    .line 141
    .line 142
    sub-int/2addr v0, v1

    .line 143
    int-to-long v0, v0

    .line 144
    add-long/2addr v2, v0

    .line 145
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-wide v0, v2

    .line 151
    move v13, v9

    .line 152
    goto :goto_1

    .line 153
    :cond_5
    return-wide v16

    .line 154
    :cond_6
    move-wide/from16 v16, v6

    .line 155
    .line 156
    :goto_3
    iget v6, v5, Lokio/Segment;->limit:I

    .line 157
    .line 158
    iget v7, v5, Lokio/Segment;->pos:I

    .line 159
    .line 160
    sub-int/2addr v6, v7

    .line 161
    int-to-long v6, v6

    .line 162
    add-long/2addr v6, v2

    .line 163
    cmp-long v8, v6, v0

    .line 164
    .line 165
    if-gtz v8, :cond_7

    .line 166
    .line 167
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-wide v2, v6

    .line 173
    goto :goto_3

    .line 174
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->internalArray$okio()[B

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    aget-byte v7, v6, v11

    .line 179
    .line 180
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->size()I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 185
    .line 186
    .line 187
    move-result-wide v11

    .line 188
    int-to-long v13, v8

    .line 189
    sub-long/2addr v11, v13

    .line 190
    add-long/2addr v11, v9

    .line 191
    :goto_4
    cmp-long v9, v2, v11

    .line 192
    .line 193
    if-gez v9, :cond_b

    .line 194
    .line 195
    iget-object v9, v5, Lokio/Segment;->data:[B

    .line 196
    .line 197
    iget v10, v5, Lokio/Segment;->limit:I

    .line 198
    .line 199
    iget v13, v5, Lokio/Segment;->pos:I

    .line 200
    .line 201
    int-to-long v13, v13

    .line 202
    add-long/2addr v13, v11

    .line 203
    sub-long/2addr v13, v2

    .line 204
    move-wide/from16 p1, v0

    .line 205
    .line 206
    int-to-long v0, v10

    .line 207
    invoke-static {v0, v1, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 208
    .line 209
    .line 210
    move-result-wide v0

    .line 211
    long-to-int v0, v0

    .line 212
    iget v1, v5, Lokio/Segment;->pos:I

    .line 213
    .line 214
    int-to-long v13, v1

    .line 215
    add-long v13, v13, p1

    .line 216
    .line 217
    sub-long/2addr v13, v2

    .line 218
    long-to-int v1, v13

    .line 219
    :goto_5
    if-ge v1, v0, :cond_a

    .line 220
    .line 221
    aget-byte v10, v9, v1

    .line 222
    .line 223
    if-ne v10, v7, :cond_8

    .line 224
    .line 225
    add-int/lit8 v10, v1, 0x1

    .line 226
    .line 227
    const/4 v13, 0x1

    .line 228
    invoke-static {v5, v10, v6, v13, v8}, Lokio/internal/-Buffer;->rangeEquals(Lokio/Segment;I[BII)Z

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    if-eqz v10, :cond_9

    .line 233
    .line 234
    iget v0, v5, Lokio/Segment;->pos:I

    .line 235
    .line 236
    sub-int/2addr v1, v0

    .line 237
    int-to-long v0, v1

    .line 238
    add-long/2addr v0, v2

    .line 239
    return-wide v0

    .line 240
    :cond_8
    const/4 v13, 0x1

    .line 241
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    const/4 v13, 0x1

    .line 245
    iget v0, v5, Lokio/Segment;->limit:I

    .line 246
    .line 247
    iget v1, v5, Lokio/Segment;->pos:I

    .line 248
    .line 249
    sub-int/2addr v0, v1

    .line 250
    int-to-long v0, v0

    .line 251
    add-long/2addr v2, v0

    .line 252
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 253
    .line 254
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-wide v0, v2

    .line 258
    goto :goto_4

    .line 259
    :cond_b
    return-wide v16

    .line 260
    :cond_c
    move-object/from16 v4, p0

    .line 261
    .line 262
    const-string v2, "fromIndex < 0: "

    .line 263
    .line 264
    invoke-static {v0, v1, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    const-wide/16 v0, 0x0

    .line 272
    .line 273
    return-wide v0

    .line 274
    :cond_d
    move-object/from16 v4, p0

    .line 275
    .line 276
    const-string v0, "bytes is empty"

    .line 277
    .line 278
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    const-wide/16 v0, 0x0

    .line 282
    .line 283
    return-wide v0
.end method

.method public indexOfElement(Lokio/ByteString;)J
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    .line 330
    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->indexOfElement(Lokio/ByteString;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public indexOfElement(Lokio/ByteString;J)J
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p2, v0

    .line 7
    .line 8
    if-ltz v2, :cond_14

    .line 9
    .line 10
    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 11
    .line 12
    const-wide/16 v3, -0x1

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    return-wide v3

    .line 17
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    sub-long/2addr v5, p2

    .line 22
    cmp-long v5, v5, p2

    .line 23
    .line 24
    const/4 v6, 0x2

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x1

    .line 27
    if-gez v5, :cond_a

    .line 28
    .line 29
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    :goto_0
    cmp-long v5, v0, p2

    .line 34
    .line 35
    if-lez v5, :cond_1

    .line 36
    .line 37
    iget-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget v5, v2, Lokio/Segment;->limit:I

    .line 43
    .line 44
    iget v9, v2, Lokio/Segment;->pos:I

    .line 45
    .line 46
    sub-int/2addr v5, v9

    .line 47
    int-to-long v9, v5

    .line 48
    sub-long/2addr v0, v9

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-ne v5, v6, :cond_5

    .line 55
    .line 56
    invoke-virtual {p1, v7}, Lokio/ByteString;->getByte(I)B

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {p1, v8}, Lokio/ByteString;->getByte(I)B

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    :goto_1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    cmp-long v6, v0, v6

    .line 69
    .line 70
    if-gez v6, :cond_9

    .line 71
    .line 72
    iget-object v6, v2, Lokio/Segment;->data:[B

    .line 73
    .line 74
    iget v7, v2, Lokio/Segment;->pos:I

    .line 75
    .line 76
    int-to-long v7, v7

    .line 77
    add-long/2addr v7, p2

    .line 78
    sub-long/2addr v7, v0

    .line 79
    long-to-int p2, v7

    .line 80
    iget p3, v2, Lokio/Segment;->limit:I

    .line 81
    .line 82
    :goto_2
    if-ge p2, p3, :cond_4

    .line 83
    .line 84
    aget-byte v7, v6, p2

    .line 85
    .line 86
    if-eq v7, v5, :cond_3

    .line 87
    .line 88
    if-ne v7, p1, :cond_2

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    :goto_3
    iget p1, v2, Lokio/Segment;->pos:I

    .line 95
    .line 96
    sub-int/2addr p2, p1

    .line 97
    int-to-long p1, p2

    .line 98
    add-long/2addr p1, v0

    .line 99
    return-wide p1

    .line 100
    :cond_4
    iget p2, v2, Lokio/Segment;->limit:I

    .line 101
    .line 102
    iget p3, v2, Lokio/Segment;->pos:I

    .line 103
    .line 104
    sub-int/2addr p2, p3

    .line 105
    int-to-long p2, p2

    .line 106
    add-long/2addr v0, p2

    .line 107
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-wide p2, v0

    .line 113
    goto :goto_1

    .line 114
    :cond_5
    invoke-virtual {p1}, Lokio/ByteString;->internalArray$okio()[B

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :goto_4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 119
    .line 120
    .line 121
    move-result-wide v5

    .line 122
    cmp-long v5, v0, v5

    .line 123
    .line 124
    if-gez v5, :cond_9

    .line 125
    .line 126
    iget-object v5, v2, Lokio/Segment;->data:[B

    .line 127
    .line 128
    iget v6, v2, Lokio/Segment;->pos:I

    .line 129
    .line 130
    int-to-long v8, v6

    .line 131
    add-long/2addr v8, p2

    .line 132
    sub-long/2addr v8, v0

    .line 133
    long-to-int p2, v8

    .line 134
    iget p3, v2, Lokio/Segment;->limit:I

    .line 135
    .line 136
    :goto_5
    if-ge p2, p3, :cond_8

    .line 137
    .line 138
    aget-byte v6, v5, p2

    .line 139
    .line 140
    array-length v8, p1

    .line 141
    move v9, v7

    .line 142
    :goto_6
    if-ge v9, v8, :cond_7

    .line 143
    .line 144
    aget-byte v10, p1, v9

    .line 145
    .line 146
    if-ne v6, v10, :cond_6

    .line 147
    .line 148
    iget p1, v2, Lokio/Segment;->pos:I

    .line 149
    .line 150
    sub-int/2addr p2, p1

    .line 151
    int-to-long p1, p2

    .line 152
    add-long/2addr p1, v0

    .line 153
    return-wide p1

    .line 154
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_7
    add-int/lit8 p2, p2, 0x1

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_8
    iget p2, v2, Lokio/Segment;->limit:I

    .line 161
    .line 162
    iget p3, v2, Lokio/Segment;->pos:I

    .line 163
    .line 164
    sub-int/2addr p2, p3

    .line 165
    int-to-long p2, p2

    .line 166
    add-long/2addr v0, p2

    .line 167
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-wide p2, v0

    .line 173
    goto :goto_4

    .line 174
    :cond_9
    return-wide v3

    .line 175
    :cond_a
    :goto_7
    iget v5, v2, Lokio/Segment;->limit:I

    .line 176
    .line 177
    iget v9, v2, Lokio/Segment;->pos:I

    .line 178
    .line 179
    sub-int/2addr v5, v9

    .line 180
    int-to-long v9, v5

    .line 181
    add-long/2addr v9, v0

    .line 182
    cmp-long v5, v9, p2

    .line 183
    .line 184
    if-gtz v5, :cond_b

    .line 185
    .line 186
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-wide v0, v9

    .line 192
    goto :goto_7

    .line 193
    :cond_b
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-ne v5, v6, :cond_f

    .line 198
    .line 199
    invoke-virtual {p1, v7}, Lokio/ByteString;->getByte(I)B

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    invoke-virtual {p1, v8}, Lokio/ByteString;->getByte(I)B

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    :goto_8
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 208
    .line 209
    .line 210
    move-result-wide v6

    .line 211
    cmp-long v6, v0, v6

    .line 212
    .line 213
    if-gez v6, :cond_13

    .line 214
    .line 215
    iget-object v6, v2, Lokio/Segment;->data:[B

    .line 216
    .line 217
    iget v7, v2, Lokio/Segment;->pos:I

    .line 218
    .line 219
    int-to-long v7, v7

    .line 220
    add-long/2addr v7, p2

    .line 221
    sub-long/2addr v7, v0

    .line 222
    long-to-int p2, v7

    .line 223
    iget p3, v2, Lokio/Segment;->limit:I

    .line 224
    .line 225
    :goto_9
    if-ge p2, p3, :cond_e

    .line 226
    .line 227
    aget-byte v7, v6, p2

    .line 228
    .line 229
    if-eq v7, v5, :cond_d

    .line 230
    .line 231
    if-ne v7, p1, :cond_c

    .line 232
    .line 233
    goto :goto_a

    .line 234
    :cond_c
    add-int/lit8 p2, p2, 0x1

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_d
    :goto_a
    iget p1, v2, Lokio/Segment;->pos:I

    .line 238
    .line 239
    sub-int/2addr p2, p1

    .line 240
    int-to-long p1, p2

    .line 241
    add-long/2addr p1, v0

    .line 242
    return-wide p1

    .line 243
    :cond_e
    iget p2, v2, Lokio/Segment;->limit:I

    .line 244
    .line 245
    iget p3, v2, Lokio/Segment;->pos:I

    .line 246
    .line 247
    sub-int/2addr p2, p3

    .line 248
    int-to-long p2, p2

    .line 249
    add-long/2addr v0, p2

    .line 250
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-wide p2, v0

    .line 256
    goto :goto_8

    .line 257
    :cond_f
    invoke-virtual {p1}, Lokio/ByteString;->internalArray$okio()[B

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    :goto_b
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 262
    .line 263
    .line 264
    move-result-wide v5

    .line 265
    cmp-long v5, v0, v5

    .line 266
    .line 267
    if-gez v5, :cond_13

    .line 268
    .line 269
    iget-object v5, v2, Lokio/Segment;->data:[B

    .line 270
    .line 271
    iget v6, v2, Lokio/Segment;->pos:I

    .line 272
    .line 273
    int-to-long v8, v6

    .line 274
    add-long/2addr v8, p2

    .line 275
    sub-long/2addr v8, v0

    .line 276
    long-to-int p2, v8

    .line 277
    iget p3, v2, Lokio/Segment;->limit:I

    .line 278
    .line 279
    :goto_c
    if-ge p2, p3, :cond_12

    .line 280
    .line 281
    aget-byte v6, v5, p2

    .line 282
    .line 283
    array-length v8, p1

    .line 284
    move v9, v7

    .line 285
    :goto_d
    if-ge v9, v8, :cond_11

    .line 286
    .line 287
    aget-byte v10, p1, v9

    .line 288
    .line 289
    if-ne v6, v10, :cond_10

    .line 290
    .line 291
    iget p1, v2, Lokio/Segment;->pos:I

    .line 292
    .line 293
    sub-int/2addr p2, p1

    .line 294
    int-to-long p1, p2

    .line 295
    add-long/2addr p1, v0

    .line 296
    return-wide p1

    .line 297
    :cond_10
    add-int/lit8 v9, v9, 0x1

    .line 298
    .line 299
    goto :goto_d

    .line 300
    :cond_11
    add-int/lit8 p2, p2, 0x1

    .line 301
    .line 302
    goto :goto_c

    .line 303
    :cond_12
    iget p2, v2, Lokio/Segment;->limit:I

    .line 304
    .line 305
    iget p3, v2, Lokio/Segment;->pos:I

    .line 306
    .line 307
    sub-int/2addr p2, p3

    .line 308
    int-to-long p2, p2

    .line 309
    add-long/2addr v0, p2

    .line 310
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-wide p2, v0

    .line 316
    goto :goto_b

    .line 317
    :cond_13
    return-wide v3

    .line 318
    :cond_14
    const-string p1, "fromIndex < 0: "

    .line 319
    .line 320
    invoke-static {p2, p3, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    const-wide/16 p1, 0x0

    .line 328
    .line 329
    return-wide p1
.end method

.method public inputStream()Ljava/io/InputStream;
    .locals 1

    .line 1
    new-instance v0, Lokio/Buffer$inputStream$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lokio/Buffer$inputStream$1;-><init>(Lokio/Buffer;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final md5()Lokio/ByteString;
    .locals 1

    .line 1
    const-string v0, "MD5"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lokio/Buffer;->digest(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public outputStream()Ljava/io/OutputStream;
    .locals 1

    .line 1
    new-instance v0, Lokio/Buffer$outputStream$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lokio/Buffer$outputStream$1;-><init>(Lokio/Buffer;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public peek()Lokio/BufferedSource;
    .locals 1

    .line 1
    new-instance v0, Lokio/PeekSource;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lokio/PeekSource;-><init>(Lokio/BufferedSource;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public rangeEquals(JLokio/ByteString;)Z
    .locals 6

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    .line 57
    invoke-virtual {p3}, Lokio/ByteString;->size()I

    move-result v5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->rangeEquals(JLokio/ByteString;II)Z

    move-result p1

    return p1
.end method

.method public rangeEquals(JLokio/ByteString;II)Z
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ltz v0, :cond_3

    .line 10
    .line 11
    if-ltz p4, :cond_3

    .line 12
    .line 13
    if-ltz p5, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    sub-long/2addr v2, p1

    .line 20
    int-to-long v4, p5

    .line 21
    cmp-long v0, v2, v4

    .line 22
    .line 23
    if-ltz v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {p3}, Lokio/ByteString;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, p4

    .line 30
    if-ge v0, p5, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move v0, v1

    .line 34
    :goto_0
    if-ge v0, p5, :cond_2

    .line 35
    .line 36
    int-to-long v2, v0

    .line 37
    add-long/2addr v2, p1

    .line 38
    invoke-virtual {p0, v2, v3}, Lokio/Buffer;->getByte(J)B

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int v3, p4, v0

    .line 43
    .line 44
    invoke-virtual {p3, v3}, Lokio/ByteString;->getByte(I)B

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eq v2, v3, :cond_1

    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 p1, 0x1

    .line 55
    return p1

    .line 56
    :cond_3
    :goto_1
    return v1
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 67
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget v2, v0, Lokio/Segment;->limit:I

    iget v3, v0, Lokio/Segment;->pos:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 68
    iget-object v2, v0, Lokio/Segment;->data:[B

    iget v3, v0, Lokio/Segment;->pos:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 69
    iget p1, v0, Lokio/Segment;->pos:I

    add-int/2addr p1, v1

    iput p1, v0, Lokio/Segment;->pos:I

    .line 70
    iget-wide v2, p0, Lokio/Buffer;->size:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lokio/Buffer;->size:J

    .line 71
    iget v2, v0, Lokio/Segment;->limit:I

    if-ne p1, v2, :cond_1

    .line 72
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object p1

    iput-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 73
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    :cond_1
    return v1
.end method

.method public read([B)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 65
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    int-to-long v1, v0

    .line 6
    int-to-long v3, p2

    .line 7
    int-to-long v5, p3

    .line 8
    invoke-static/range {v1 .. v6}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    return p1

    .line 17
    :cond_0
    iget v1, v0, Lokio/Segment;->limit:I

    .line 18
    .line 19
    iget v2, v0, Lokio/Segment;->pos:I

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    iget-object v1, v0, Lokio/Segment;->data:[B

    .line 27
    .line 28
    iget v2, v0, Lokio/Segment;->pos:I

    .line 29
    .line 30
    add-int v3, v2, p3

    .line 31
    .line 32
    invoke-static {v1, p2, v2, p1, v3}, Ltf/l;->o0([BII[BI)V

    .line 33
    .line 34
    .line 35
    iget p1, v0, Lokio/Segment;->pos:I

    .line 36
    .line 37
    add-int/2addr p1, p3

    .line 38
    iput p1, v0, Lokio/Segment;->pos:I

    .line 39
    .line 40
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    int-to-long v1, p3

    .line 45
    sub-long/2addr p1, v1

    .line 46
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 47
    .line 48
    .line 49
    iget p1, v0, Lokio/Segment;->pos:I

    .line 50
    .line 51
    iget p2, v0, Lokio/Segment;->limit:I

    .line 52
    .line 53
    if-ne p1, p2, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 60
    .line 61
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return p3
.end method

.method public read(Lokio/Buffer;J)J
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    .line 74
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    .line 75
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide p2

    .line 76
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    return-wide p2

    .line 77
    :cond_2
    const-string p1, "byteCount < 0: "

    .line 78
    invoke-static {p2, p3, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 79
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public readAll(Lokio/Sink;)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-lez v2, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, p0, v0, v1}, Lokio/Sink;->write(Lokio/Buffer;J)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-wide v0
.end method

.method public final readAndWriteUnsafe()Lokio/Buffer$UnsafeCursor;
    .locals 2

    .line 9
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lokio/Buffer;->readAndWriteUnsafe$default(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;ILjava/lang/Object;)Lokio/Buffer$UnsafeCursor;

    move-result-object v0

    return-object v0
.end method

.method public final readAndWriteUnsafe(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lokio/internal/-Buffer;->commonReadAndWriteUnsafe(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public readByte()B
    .locals 9

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v1, v0, Lokio/Segment;->pos:I

    .line 17
    .line 18
    iget v2, v0, Lokio/Segment;->limit:I

    .line 19
    .line 20
    iget-object v3, v0, Lokio/Segment;->data:[B

    .line 21
    .line 22
    add-int/lit8 v4, v1, 0x1

    .line 23
    .line 24
    aget-byte v1, v3, v1

    .line 25
    .line 26
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    const-wide/16 v7, 0x1

    .line 31
    .line 32
    sub-long/2addr v5, v7

    .line 33
    invoke-virtual {p0, v5, v6}, Lokio/Buffer;->setSize$okio(J)V

    .line 34
    .line 35
    .line 36
    if-ne v4, v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 43
    .line 44
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 45
    .line 46
    .line 47
    return v1

    .line 48
    :cond_0
    iput v4, v0, Lokio/Segment;->pos:I

    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    invoke-static {}, Lj8/o;->a()V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return v0
.end method

.method public readByteArray()[B
    .locals 2

    .line 45
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readByteArray(J)[B

    move-result-object v0

    return-object v0
.end method

.method public readByteArray(J)[B
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    const-wide/32 v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-gtz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    cmp-long v0, v0, p1

    .line 19
    .line 20
    if-ltz v0, :cond_0

    .line 21
    .line 22
    long-to-int p1, p1

    .line 23
    new-array p1, p1, [B

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lokio/Buffer;->readFully([B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    invoke-static {}, Lj8/o;->a()V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return-object p1

    .line 34
    :cond_1
    const-string v0, "byteCount: "

    .line 35
    .line 36
    invoke-static {p1, p2, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public readByteString()Lokio/ByteString;
    .locals 2

    .line 62
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readByteString(J)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public readByteString(J)Lokio/ByteString;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_2

    .line 6
    .line 7
    const-wide/32 v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-gtz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    cmp-long v0, v0, p1

    .line 19
    .line 20
    if-ltz v0, :cond_1

    .line 21
    .line 22
    const-wide/16 v0, 0x1000

    .line 23
    .line 24
    cmp-long v0, p1, v0

    .line 25
    .line 26
    if-ltz v0, :cond_0

    .line 27
    .line 28
    long-to-int v0, p1

    .line 29
    invoke-virtual {p0, v0}, Lokio/Buffer;->snapshot(I)Lokio/ByteString;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->skip(J)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v0, Lokio/ByteString;

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->readByteArray(J)[B

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Lokio/ByteString;-><init>([B)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_1
    invoke-static {}, Lj8/o;->a()V

    .line 48
    .line 49
    .line 50
    :goto_0
    const/4 p1, 0x0

    .line 51
    return-object p1

    .line 52
    :cond_2
    const-string v0, "byteCount: "

    .line 53
    .line 54
    invoke-static {p1, p2, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0
.end method

.method public readDecimalLong()J
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    cmp-long v1, v1, v3

    .line 10
    .line 11
    if-eqz v1, :cond_e

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-wide/16 v5, -0x7

    .line 15
    .line 16
    move v2, v1

    .line 17
    move-wide v8, v3

    .line 18
    move-wide v6, v5

    .line 19
    move v5, v2

    .line 20
    :goto_0
    iget-object v10, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 21
    .line 22
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v11, v10, Lokio/Segment;->data:[B

    .line 26
    .line 27
    iget v12, v10, Lokio/Segment;->pos:I

    .line 28
    .line 29
    iget v13, v10, Lokio/Segment;->limit:I

    .line 30
    .line 31
    :goto_1
    if-ge v12, v13, :cond_5

    .line 32
    .line 33
    aget-byte v15, v11, v12

    .line 34
    .line 35
    const/16 v14, 0x30

    .line 36
    .line 37
    if-lt v15, v14, :cond_3

    .line 38
    .line 39
    const/16 v14, 0x39

    .line 40
    .line 41
    if-gt v15, v14, :cond_3

    .line 42
    .line 43
    rsub-int/lit8 v14, v15, 0x30

    .line 44
    .line 45
    const-wide v16, -0xcccccccccccccccL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    cmp-long v16, v8, v16

    .line 51
    .line 52
    if-ltz v16, :cond_1

    .line 53
    .line 54
    move-wide/from16 v17, v3

    .line 55
    .line 56
    if-nez v16, :cond_0

    .line 57
    .line 58
    int-to-long v3, v14

    .line 59
    cmp-long v3, v3, v6

    .line 60
    .line 61
    if-gez v3, :cond_0

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_0
    const-wide/16 v3, 0xa

    .line 65
    .line 66
    mul-long/2addr v8, v3

    .line 67
    int-to-long v3, v14

    .line 68
    add-long/2addr v8, v3

    .line 69
    goto :goto_4

    .line 70
    :cond_1
    :goto_2
    new-instance v1, Lokio/Buffer;

    .line 71
    .line 72
    invoke-direct {v1}, Lokio/Buffer;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v8, v9}, Lokio/Buffer;->writeDecimalLong(J)Lokio/Buffer;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1, v15}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-nez v2, :cond_2

    .line 84
    .line 85
    invoke-virtual {v1}, Lokio/Buffer;->readByte()B

    .line 86
    .line 87
    .line 88
    :cond_2
    const-string v2, "Number too large: "

    .line 89
    .line 90
    invoke-virtual {v1}, Lokio/Buffer;->readUtf8()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1, v2}, Lj8/o;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_3
    const-wide/16 v1, 0x0

    .line 98
    .line 99
    return-wide v1

    .line 100
    :cond_3
    move-wide/from16 v17, v3

    .line 101
    .line 102
    const/16 v3, 0x2d

    .line 103
    .line 104
    if-ne v15, v3, :cond_4

    .line 105
    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    const-wide/16 v2, 0x1

    .line 109
    .line 110
    sub-long/2addr v6, v2

    .line 111
    const/4 v2, 0x1

    .line 112
    :goto_4
    add-int/lit8 v12, v12, 0x1

    .line 113
    .line 114
    add-int/lit8 v1, v1, 0x1

    .line 115
    .line 116
    move-wide/from16 v3, v17

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    const/4 v5, 0x1

    .line 120
    goto :goto_5

    .line 121
    :cond_5
    move-wide/from16 v17, v3

    .line 122
    .line 123
    :goto_5
    if-ne v12, v13, :cond_6

    .line 124
    .line 125
    invoke-virtual {v10}, Lokio/Segment;->pop()Lokio/Segment;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iput-object v3, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 130
    .line 131
    invoke-static {v10}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 132
    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_6
    iput v12, v10, Lokio/Segment;->pos:I

    .line 136
    .line 137
    :goto_6
    if-nez v5, :cond_8

    .line 138
    .line 139
    iget-object v3, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 140
    .line 141
    if-nez v3, :cond_7

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_7
    move-wide/from16 v3, v17

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_8
    :goto_7
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 148
    .line 149
    .line 150
    move-result-wide v3

    .line 151
    int-to-long v5, v1

    .line 152
    sub-long/2addr v3, v5

    .line 153
    invoke-virtual {v0, v3, v4}, Lokio/Buffer;->setSize$okio(J)V

    .line 154
    .line 155
    .line 156
    if-eqz v2, :cond_9

    .line 157
    .line 158
    const/4 v14, 0x2

    .line 159
    goto :goto_8

    .line 160
    :cond_9
    const/4 v14, 0x1

    .line 161
    :goto_8
    if-ge v1, v14, :cond_c

    .line 162
    .line 163
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    cmp-long v1, v3, v17

    .line 168
    .line 169
    if-eqz v1, :cond_b

    .line 170
    .line 171
    if-eqz v2, :cond_a

    .line 172
    .line 173
    const-string v1, "Expected a digit"

    .line 174
    .line 175
    goto :goto_9

    .line 176
    :cond_a
    const-string v1, "Expected a digit or \'-\'"

    .line 177
    .line 178
    :goto_9
    new-instance v2, Ljava/lang/NumberFormatException;

    .line 179
    .line 180
    const-string v3, " but was 0x"

    .line 181
    .line 182
    invoke-static {v1, v3}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    move-wide/from16 v3, v17

    .line 187
    .line 188
    invoke-virtual {v0, v3, v4}, Lokio/Buffer;->getByte(J)B

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    invoke-static {v3}, Lokio/-SegmentedByteString;->toHexString(B)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-direct {v2, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v2

    .line 207
    :cond_b
    invoke-static {}, Lj8/o;->a()V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_c
    if-eqz v2, :cond_d

    .line 212
    .line 213
    return-wide v8

    .line 214
    :cond_d
    neg-long v1, v8

    .line 215
    return-wide v1

    .line 216
    :cond_e
    invoke-static {}, Lj8/o;->a()V

    .line 217
    .line 218
    .line 219
    goto :goto_3
.end method

.method public final readFrom(Ljava/io/InputStream;)Lokio/Buffer;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, 0x7fffffffffffffffL

    const/4 v2, 0x1

    .line 74
    invoke-direct {p0, p1, v0, v1, v2}, Lokio/Buffer;->readFrom(Ljava/io/InputStream;JZ)V

    return-object p0
.end method

.method public final readFrom(Ljava/io/InputStream;J)Lokio/Buffer;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x0

    .line 70
    invoke-direct {p0, p1, p2, p3, v0}, Lokio/Buffer;->readFrom(Ljava/io/InputStream;JZ)V

    return-object p0

    .line 71
    :cond_0
    const-string p1, "byteCount < 0: "

    .line 72
    invoke-static {p2, p3, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public readFully(Lokio/Buffer;J)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    cmp-long v0, v0, p2

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 17
    .line 18
    .line 19
    move-result-wide p2

    .line 20
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lj8/o;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public readFully([B)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 27
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 28
    array-length v1, p1

    sub-int/2addr v1, v0

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    .line 29
    :cond_0
    invoke-static {}, Lj8/o;->a()V

    :cond_1
    return-void
.end method

.method public readHexadecimalUnsignedLong()J
    .locals 14

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    move-wide v4, v2

    .line 14
    :cond_0
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 15
    .line 16
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v7, v6, Lokio/Segment;->data:[B

    .line 20
    .line 21
    iget v8, v6, Lokio/Segment;->pos:I

    .line 22
    .line 23
    iget v9, v6, Lokio/Segment;->limit:I

    .line 24
    .line 25
    :goto_0
    if-ge v8, v9, :cond_6

    .line 26
    .line 27
    aget-byte v10, v7, v8

    .line 28
    .line 29
    const/16 v11, 0x30

    .line 30
    .line 31
    if-lt v10, v11, :cond_1

    .line 32
    .line 33
    const/16 v11, 0x39

    .line 34
    .line 35
    if-gt v10, v11, :cond_1

    .line 36
    .line 37
    add-int/lit8 v11, v10, -0x30

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/16 v11, 0x61

    .line 41
    .line 42
    if-lt v10, v11, :cond_2

    .line 43
    .line 44
    const/16 v11, 0x66

    .line 45
    .line 46
    if-gt v10, v11, :cond_2

    .line 47
    .line 48
    add-int/lit8 v11, v10, -0x57

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/16 v11, 0x41

    .line 52
    .line 53
    if-lt v10, v11, :cond_4

    .line 54
    .line 55
    const/16 v11, 0x46

    .line 56
    .line 57
    if-gt v10, v11, :cond_4

    .line 58
    .line 59
    add-int/lit8 v11, v10, -0x37

    .line 60
    .line 61
    :goto_1
    const-wide/high16 v12, -0x1000000000000000L    # -3.105036184601418E231

    .line 62
    .line 63
    and-long/2addr v12, v4

    .line 64
    cmp-long v12, v12, v2

    .line 65
    .line 66
    if-nez v12, :cond_3

    .line 67
    .line 68
    const/4 v10, 0x4

    .line 69
    shl-long/2addr v4, v10

    .line 70
    int-to-long v10, v11

    .line 71
    or-long/2addr v4, v10

    .line 72
    add-int/lit8 v8, v8, 0x1

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    new-instance v0, Lokio/Buffer;

    .line 78
    .line 79
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v4, v5}, Lokio/Buffer;->writeHexadecimalUnsignedLong(J)Lokio/Buffer;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, v10}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, "Number too large: "

    .line 91
    .line 92
    invoke-virtual {v0}, Lokio/Buffer;->readUtf8()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0, v1}, Lj8/o;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_2
    const-wide/16 v0, 0x0

    .line 100
    .line 101
    return-wide v0

    .line 102
    :cond_4
    if-eqz v0, :cond_5

    .line 103
    .line 104
    const/4 v1, 0x1

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    const-string v0, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 107
    .line 108
    invoke-static {v10}, Lokio/-SegmentedByteString;->toHexString(B)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v1, v0}, Lj8/o;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    :goto_3
    if-ne v8, v9, :cond_7

    .line 117
    .line 118
    invoke-virtual {v6}, Lokio/Segment;->pop()Lokio/Segment;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iput-object v7, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 123
    .line 124
    invoke-static {v6}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    iput v8, v6, Lokio/Segment;->pos:I

    .line 129
    .line 130
    :goto_4
    if-nez v1, :cond_8

    .line 131
    .line 132
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 133
    .line 134
    if-nez v6, :cond_0

    .line 135
    .line 136
    :cond_8
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 137
    .line 138
    .line 139
    move-result-wide v1

    .line 140
    int-to-long v6, v0

    .line 141
    sub-long/2addr v1, v6

    .line 142
    invoke-virtual {p0, v1, v2}, Lokio/Buffer;->setSize$okio(J)V

    .line 143
    .line 144
    .line 145
    return-wide v4

    .line 146
    :cond_9
    invoke-static {}, Lj8/o;->a()V

    .line 147
    .line 148
    .line 149
    goto :goto_2
.end method

.method public readInt()I
    .locals 9

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x4

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-ltz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v1, v0, Lokio/Segment;->pos:I

    .line 17
    .line 18
    iget v4, v0, Lokio/Segment;->limit:I

    .line 19
    .line 20
    sub-int v5, v4, v1

    .line 21
    .line 22
    int-to-long v5, v5

    .line 23
    cmp-long v5, v5, v2

    .line 24
    .line 25
    if-gez v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    and-int/lit16 v0, v0, 0xff

    .line 32
    .line 33
    shl-int/lit8 v0, v0, 0x18

    .line 34
    .line 35
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    and-int/lit16 v1, v1, 0xff

    .line 40
    .line 41
    shl-int/lit8 v1, v1, 0x10

    .line 42
    .line 43
    or-int/2addr v0, v1

    .line 44
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    and-int/lit16 v1, v1, 0xff

    .line 49
    .line 50
    shl-int/lit8 v1, v1, 0x8

    .line 51
    .line 52
    or-int/2addr v0, v1

    .line 53
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    and-int/lit16 v1, v1, 0xff

    .line 58
    .line 59
    or-int/2addr v0, v1

    .line 60
    return v0

    .line 61
    :cond_0
    iget-object v5, v0, Lokio/Segment;->data:[B

    .line 62
    .line 63
    add-int/lit8 v6, v1, 0x1

    .line 64
    .line 65
    aget-byte v7, v5, v1

    .line 66
    .line 67
    and-int/lit16 v7, v7, 0xff

    .line 68
    .line 69
    shl-int/lit8 v7, v7, 0x18

    .line 70
    .line 71
    add-int/lit8 v8, v1, 0x2

    .line 72
    .line 73
    aget-byte v6, v5, v6

    .line 74
    .line 75
    and-int/lit16 v6, v6, 0xff

    .line 76
    .line 77
    shl-int/lit8 v6, v6, 0x10

    .line 78
    .line 79
    or-int/2addr v6, v7

    .line 80
    add-int/lit8 v7, v1, 0x3

    .line 81
    .line 82
    aget-byte v8, v5, v8

    .line 83
    .line 84
    and-int/lit16 v8, v8, 0xff

    .line 85
    .line 86
    shl-int/lit8 v8, v8, 0x8

    .line 87
    .line 88
    or-int/2addr v6, v8

    .line 89
    add-int/lit8 v1, v1, 0x4

    .line 90
    .line 91
    aget-byte v5, v5, v7

    .line 92
    .line 93
    and-int/lit16 v5, v5, 0xff

    .line 94
    .line 95
    or-int/2addr v5, v6

    .line 96
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 97
    .line 98
    .line 99
    move-result-wide v6

    .line 100
    sub-long/2addr v6, v2

    .line 101
    invoke-virtual {p0, v6, v7}, Lokio/Buffer;->setSize$okio(J)V

    .line 102
    .line 103
    .line 104
    if-ne v1, v4, :cond_1

    .line 105
    .line 106
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 111
    .line 112
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 113
    .line 114
    .line 115
    return v5

    .line 116
    :cond_1
    iput v1, v0, Lokio/Segment;->pos:I

    .line 117
    .line 118
    return v5

    .line 119
    :cond_2
    invoke-static {}, Lj8/o;->a()V

    .line 120
    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    return v0
.end method

.method public readIntLe()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lokio/-SegmentedByteString;->reverseBytes(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public readLong()J
    .locals 15

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x8

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-ltz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v1, v0, Lokio/Segment;->pos:I

    .line 17
    .line 18
    iget v4, v0, Lokio/Segment;->limit:I

    .line 19
    .line 20
    sub-int v5, v4, v1

    .line 21
    .line 22
    int-to-long v5, v5

    .line 23
    cmp-long v5, v5, v2

    .line 24
    .line 25
    const/16 v6, 0x20

    .line 26
    .line 27
    if-gez v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lokio/Buffer;->readInt()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    int-to-long v0, v0

    .line 34
    const-wide v2, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v0, v2

    .line 40
    shl-long/2addr v0, v6

    .line 41
    invoke-virtual {p0}, Lokio/Buffer;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    int-to-long v4, v4

    .line 46
    and-long/2addr v2, v4

    .line 47
    or-long/2addr v0, v2

    .line 48
    return-wide v0

    .line 49
    :cond_0
    iget-object v5, v0, Lokio/Segment;->data:[B

    .line 50
    .line 51
    add-int/lit8 v7, v1, 0x1

    .line 52
    .line 53
    aget-byte v8, v5, v1

    .line 54
    .line 55
    int-to-long v8, v8

    .line 56
    const-wide/16 v10, 0xff

    .line 57
    .line 58
    and-long/2addr v8, v10

    .line 59
    const/16 v12, 0x38

    .line 60
    .line 61
    shl-long/2addr v8, v12

    .line 62
    add-int/lit8 v12, v1, 0x2

    .line 63
    .line 64
    aget-byte v7, v5, v7

    .line 65
    .line 66
    int-to-long v13, v7

    .line 67
    and-long/2addr v13, v10

    .line 68
    const/16 v7, 0x30

    .line 69
    .line 70
    shl-long/2addr v13, v7

    .line 71
    or-long v7, v8, v13

    .line 72
    .line 73
    add-int/lit8 v9, v1, 0x3

    .line 74
    .line 75
    aget-byte v12, v5, v12

    .line 76
    .line 77
    int-to-long v12, v12

    .line 78
    and-long/2addr v12, v10

    .line 79
    const/16 v14, 0x28

    .line 80
    .line 81
    shl-long/2addr v12, v14

    .line 82
    or-long/2addr v7, v12

    .line 83
    add-int/lit8 v12, v1, 0x4

    .line 84
    .line 85
    aget-byte v9, v5, v9

    .line 86
    .line 87
    int-to-long v13, v9

    .line 88
    and-long/2addr v13, v10

    .line 89
    shl-long/2addr v13, v6

    .line 90
    or-long v6, v7, v13

    .line 91
    .line 92
    add-int/lit8 v8, v1, 0x5

    .line 93
    .line 94
    aget-byte v9, v5, v12

    .line 95
    .line 96
    int-to-long v12, v9

    .line 97
    and-long/2addr v12, v10

    .line 98
    const/16 v9, 0x18

    .line 99
    .line 100
    shl-long/2addr v12, v9

    .line 101
    or-long/2addr v6, v12

    .line 102
    add-int/lit8 v9, v1, 0x6

    .line 103
    .line 104
    aget-byte v8, v5, v8

    .line 105
    .line 106
    int-to-long v12, v8

    .line 107
    and-long/2addr v12, v10

    .line 108
    const/16 v8, 0x10

    .line 109
    .line 110
    shl-long/2addr v12, v8

    .line 111
    or-long/2addr v6, v12

    .line 112
    add-int/lit8 v8, v1, 0x7

    .line 113
    .line 114
    aget-byte v9, v5, v9

    .line 115
    .line 116
    int-to-long v12, v9

    .line 117
    and-long/2addr v12, v10

    .line 118
    const/16 v9, 0x8

    .line 119
    .line 120
    shl-long/2addr v12, v9

    .line 121
    or-long/2addr v6, v12

    .line 122
    add-int/2addr v1, v9

    .line 123
    aget-byte v5, v5, v8

    .line 124
    .line 125
    int-to-long v8, v5

    .line 126
    and-long/2addr v8, v10

    .line 127
    or-long v5, v6, v8

    .line 128
    .line 129
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 130
    .line 131
    .line 132
    move-result-wide v7

    .line 133
    sub-long/2addr v7, v2

    .line 134
    invoke-virtual {p0, v7, v8}, Lokio/Buffer;->setSize$okio(J)V

    .line 135
    .line 136
    .line 137
    if-ne v1, v4, :cond_1

    .line 138
    .line 139
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 144
    .line 145
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 146
    .line 147
    .line 148
    return-wide v5

    .line 149
    :cond_1
    iput v1, v0, Lokio/Segment;->pos:I

    .line 150
    .line 151
    return-wide v5

    .line 152
    :cond_2
    invoke-static {}, Lj8/o;->a()V

    .line 153
    .line 154
    .line 155
    const-wide/16 v0, 0x0

    .line 156
    .line 157
    return-wide v0
.end method

.method public readLongLe()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->readLong()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lokio/-SegmentedByteString;->reverseBytes(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public readShort()S
    .locals 9

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x2

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-ltz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v1, v0, Lokio/Segment;->pos:I

    .line 17
    .line 18
    iget v4, v0, Lokio/Segment;->limit:I

    .line 19
    .line 20
    sub-int v5, v4, v1

    .line 21
    .line 22
    const/4 v6, 0x2

    .line 23
    if-ge v5, v6, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    and-int/lit16 v0, v0, 0xff

    .line 30
    .line 31
    shl-int/lit8 v0, v0, 0x8

    .line 32
    .line 33
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    and-int/lit16 v1, v1, 0xff

    .line 38
    .line 39
    or-int/2addr v0, v1

    .line 40
    int-to-short v0, v0

    .line 41
    return v0

    .line 42
    :cond_0
    iget-object v5, v0, Lokio/Segment;->data:[B

    .line 43
    .line 44
    add-int/lit8 v7, v1, 0x1

    .line 45
    .line 46
    aget-byte v8, v5, v1

    .line 47
    .line 48
    and-int/lit16 v8, v8, 0xff

    .line 49
    .line 50
    shl-int/lit8 v8, v8, 0x8

    .line 51
    .line 52
    add-int/2addr v1, v6

    .line 53
    aget-byte v5, v5, v7

    .line 54
    .line 55
    and-int/lit16 v5, v5, 0xff

    .line 56
    .line 57
    or-int/2addr v5, v8

    .line 58
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    sub-long/2addr v6, v2

    .line 63
    invoke-virtual {p0, v6, v7}, Lokio/Buffer;->setSize$okio(J)V

    .line 64
    .line 65
    .line 66
    if-ne v1, v4, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 73
    .line 74
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iput v1, v0, Lokio/Segment;->pos:I

    .line 79
    .line 80
    :goto_0
    int-to-short v0, v5

    .line 81
    return v0

    .line 82
    :cond_2
    invoke-static {}, Lj8/o;->a()V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    return v0
.end method

.method public readShortLe()S
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lokio/-SegmentedByteString;->reverseBytes(S)S

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public readString(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-ltz v0, :cond_4

    .line 9
    .line 10
    const-wide/32 v1, 0x7fffffff

    .line 11
    .line 12
    .line 13
    cmp-long v1, p1, v1

    .line 14
    .line 15
    if-gtz v1, :cond_4

    .line 16
    .line 17
    iget-wide v1, p0, Lokio/Buffer;->size:J

    .line 18
    .line 19
    cmp-long v1, v1, p1

    .line 20
    .line 21
    if-ltz v1, :cond_3

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string p1, ""

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget v1, v0, Lokio/Segment;->pos:I

    .line 34
    .line 35
    int-to-long v2, v1

    .line 36
    add-long/2addr v2, p1

    .line 37
    iget v4, v0, Lokio/Segment;->limit:I

    .line 38
    .line 39
    int-to-long v4, v4

    .line 40
    cmp-long v2, v2, v4

    .line 41
    .line 42
    if-lez v2, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->readByteArray(J)[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_1
    new-instance v2, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, v0, Lokio/Segment;->data:[B

    .line 57
    .line 58
    long-to-int v4, p1

    .line 59
    invoke-direct {v2, v3, v1, v4, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 60
    .line 61
    .line 62
    iget p3, v0, Lokio/Segment;->pos:I

    .line 63
    .line 64
    add-int/2addr p3, v4

    .line 65
    iput p3, v0, Lokio/Segment;->pos:I

    .line 66
    .line 67
    iget-wide v3, p0, Lokio/Buffer;->size:J

    .line 68
    .line 69
    sub-long/2addr v3, p1

    .line 70
    iput-wide v3, p0, Lokio/Buffer;->size:J

    .line 71
    .line 72
    iget p1, v0, Lokio/Segment;->limit:I

    .line 73
    .line 74
    if-ne p3, p1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 81
    .line 82
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    return-object v2

    .line 86
    :cond_3
    invoke-static {}, Lj8/o;->a()V

    .line 87
    .line 88
    .line 89
    :goto_0
    const/4 p1, 0x0

    .line 90
    return-object p1

    .line 91
    :cond_4
    const-string p3, "byteCount: "

    .line 92
    .line 93
    invoke-static {p1, p2, p3}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0
.end method

.method public readString(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    iget-wide v0, p0, Lokio/Buffer;->size:J

    invoke-virtual {p0, v0, v1, p1}, Lokio/Buffer;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final readUnsafe()Lokio/Buffer$UnsafeCursor;
    .locals 2

    .line 9
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lokio/Buffer;->readUnsafe$default(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;ILjava/lang/Object;)Lokio/Buffer$UnsafeCursor;

    move-result-object v0

    return-object v0
.end method

.method public final readUnsafe(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lokio/internal/-Buffer;->commonReadUnsafe(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public readUtf8()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    .line 2
    .line 3
    sget-object v2, Log/a;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, v2}, Lokio/Buffer;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public readUtf8(J)Ljava/lang/String;
    .locals 1

    .line 10
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, p2, v0}, Lokio/Buffer;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public readUtf8CodePoint()I
    .locals 12

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_a

    .line 10
    .line 11
    invoke-virtual {p0, v2, v3}, Lokio/Buffer;->getByte(J)B

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    and-int/lit16 v1, v0, 0x80

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const/16 v3, 0x80

    .line 19
    .line 20
    const v4, 0xfffd

    .line 21
    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    and-int/lit8 v1, v0, 0x7f

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    move v6, v5

    .line 29
    move v5, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    and-int/lit16 v1, v0, 0xe0

    .line 32
    .line 33
    const/16 v5, 0xc0

    .line 34
    .line 35
    if-ne v1, v5, :cond_1

    .line 36
    .line 37
    and-int/lit8 v1, v0, 0x1f

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    move v6, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    and-int/lit16 v1, v0, 0xf0

    .line 43
    .line 44
    const/16 v5, 0xe0

    .line 45
    .line 46
    if-ne v1, v5, :cond_2

    .line 47
    .line 48
    and-int/lit8 v1, v0, 0xf

    .line 49
    .line 50
    const/4 v5, 0x3

    .line 51
    const/16 v6, 0x800

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    and-int/lit16 v1, v0, 0xf8

    .line 55
    .line 56
    const/16 v5, 0xf0

    .line 57
    .line 58
    if-ne v1, v5, :cond_9

    .line 59
    .line 60
    and-int/lit8 v1, v0, 0x7

    .line 61
    .line 62
    const/4 v5, 0x4

    .line 63
    const/high16 v6, 0x10000

    .line 64
    .line 65
    :goto_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    int-to-long v9, v5

    .line 70
    cmp-long v7, v7, v9

    .line 71
    .line 72
    if-ltz v7, :cond_8

    .line 73
    .line 74
    :goto_1
    if-ge v2, v5, :cond_4

    .line 75
    .line 76
    int-to-long v7, v2

    .line 77
    invoke-virtual {p0, v7, v8}, Lokio/Buffer;->getByte(J)B

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    and-int/lit16 v11, v0, 0xc0

    .line 82
    .line 83
    if-ne v11, v3, :cond_3

    .line 84
    .line 85
    shl-int/lit8 v1, v1, 0x6

    .line 86
    .line 87
    and-int/lit8 v0, v0, 0x3f

    .line 88
    .line 89
    or-int/2addr v1, v0

    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-virtual {p0, v7, v8}, Lokio/Buffer;->skip(J)V

    .line 94
    .line 95
    .line 96
    return v4

    .line 97
    :cond_4
    invoke-virtual {p0, v9, v10}, Lokio/Buffer;->skip(J)V

    .line 98
    .line 99
    .line 100
    const v0, 0x10ffff

    .line 101
    .line 102
    .line 103
    if-le v1, v0, :cond_5

    .line 104
    .line 105
    return v4

    .line 106
    :cond_5
    const v0, 0xd800

    .line 107
    .line 108
    .line 109
    if-gt v0, v1, :cond_6

    .line 110
    .line 111
    const v0, 0xe000

    .line 112
    .line 113
    .line 114
    if-ge v1, v0, :cond_6

    .line 115
    .line 116
    return v4

    .line 117
    :cond_6
    if-ge v1, v6, :cond_7

    .line 118
    .line 119
    return v4

    .line 120
    :cond_7
    return v1

    .line 121
    :cond_8
    new-instance v1, Ljava/io/EOFException;

    .line 122
    .line 123
    const-string v2, "size < "

    .line 124
    .line 125
    const-string v3, ": "

    .line 126
    .line 127
    invoke-static {v5, v2, v3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v3, " (to read code point prefixed 0x"

    .line 139
    .line 140
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Lokio/-SegmentedByteString;->toHexString(B)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const/16 v0, 0x29

    .line 151
    .line 152
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-direct {v1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v1

    .line 163
    :cond_9
    const-wide/16 v0, 0x1

    .line 164
    .line 165
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 166
    .line 167
    .line 168
    return v4

    .line 169
    :cond_a
    invoke-static {}, Lj8/o;->a()V

    .line 170
    .line 171
    .line 172
    const/4 v0, 0x0

    .line 173
    return v0
.end method

.method public readUtf8Line()Ljava/lang/String;
    .locals 4

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lokio/Buffer;->indexOf(B)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readUtf8(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    return-object v0
.end method

.method public readUtf8LineStrict()Ljava/lang/String;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 127
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public readUtf8LineStrict(J)Ljava/lang/String;
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_3

    .line 6
    .line 7
    const-wide v0, 0x7fffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v2, p1, v0

    .line 13
    .line 14
    const-wide/16 v6, 0x1

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    :goto_0
    move-wide v4, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-long v0, p1, v6

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :goto_1
    const/16 v1, 0xa

    .line 24
    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    move-object v0, p0

    .line 28
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->indexOf(BJJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    const-wide/16 v8, -0x1

    .line 33
    .line 34
    cmp-long v3, v1, v8

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-static {p0, v1, v2}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    return-object v1

    .line 43
    :cond_1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    cmp-long v1, v4, v1

    .line 48
    .line 49
    if-gez v1, :cond_2

    .line 50
    .line 51
    sub-long v1, v4, v6

    .line 52
    .line 53
    invoke-virtual {p0, v1, v2}, Lokio/Buffer;->getByte(J)B

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/16 v2, 0xd

    .line 58
    .line 59
    if-ne v1, v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0, v4, v5}, Lokio/Buffer;->getByte(J)B

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/16 v2, 0xa

    .line 66
    .line 67
    if-ne v1, v2, :cond_2

    .line 68
    .line 69
    invoke-static {p0, v4, v5}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    return-object v1

    .line 74
    :cond_2
    new-instance v1, Lokio/Buffer;

    .line 75
    .line 76
    invoke-direct {v1}, Lokio/Buffer;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    const/16 v4, 0x20

    .line 84
    .line 85
    int-to-long v4, v4

    .line 86
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    const-wide/16 v2, 0x0

    .line 91
    .line 92
    move-object v0, p0

    .line 93
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    invoke-virtual {v1}, Lokio/Buffer;->readByteString()Lokio/ByteString;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0, v2, v3}, Lj8/o;->g(Ljava/lang/Object;J)V

    .line 113
    .line 114
    .line 115
    :goto_2
    const/4 v0, 0x0

    .line 116
    return-object v0

    .line 117
    :cond_3
    const-string v0, "limit < 0: "

    .line 118
    .line 119
    invoke-static {p1, p2, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2
.end method

.method public request(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    .line 2
    .line 3
    cmp-long p1, v0, p1

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public require(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    .line 2
    .line 3
    cmp-long p1, v0, p1

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lj8/o;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public select(Lokio/Options;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p0, p1, v2, v0, v1}, Lokio/internal/-Buffer;->selectPrefix$default(Lokio/Buffer;Lokio/Options;ZILjava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Lokio/Options;->getByteStrings$okio()[Lokio/ByteString;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    aget-object p1, p1, v0

    .line 20
    .line 21
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    int-to-long v1, p1

    .line 26
    invoke-virtual {p0, v1, v2}, Lokio/Buffer;->skip(J)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method public final setSize$okio(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lokio/Buffer;->size:J

    .line 2
    .line 3
    return-void
.end method

.method public final sha1()Lokio/ByteString;
    .locals 1

    .line 1
    const-string v0, "SHA-1"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lokio/Buffer;->digest(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final sha256()Lokio/ByteString;
    .locals 1

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lokio/Buffer;->digest(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final sha512()Lokio/ByteString;
    .locals 1

    .line 1
    const-string v0, "SHA-512"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lokio/Buffer;->digest(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final size()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public skip(J)V
    .locals 6

    .line 1
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lokio/Segment;->limit:I

    .line 12
    .line 13
    iget v2, v0, Lokio/Segment;->pos:I

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    int-to-long v1, v1

    .line 17
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    long-to-int v1, v1

    .line 22
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    int-to-long v4, v1

    .line 27
    sub-long/2addr v2, v4

    .line 28
    invoke-virtual {p0, v2, v3}, Lokio/Buffer;->setSize$okio(J)V

    .line 29
    .line 30
    .line 31
    sub-long/2addr p1, v4

    .line 32
    iget v2, v0, Lokio/Segment;->pos:I

    .line 33
    .line 34
    add-int/2addr v2, v1

    .line 35
    iput v2, v0, Lokio/Segment;->pos:I

    .line 36
    .line 37
    iget v1, v0, Lokio/Segment;->limit:I

    .line 38
    .line 39
    if-ne v2, v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 46
    .line 47
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, Lj8/o;->a()V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public final snapshot()Lokio/ByteString;
    .locals 4

    .line 96
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 97
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Lokio/Buffer;->snapshot(I)Lokio/ByteString;

    move-result-object v0

    return-object v0

    .line 98
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "size > Int.MAX_VALUE: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final snapshot(I)Lokio/ByteString;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    int-to-long v4, p1

    .line 13
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    move v3, v2

    .line 21
    :goto_0
    if-ge v2, p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget v4, v0, Lokio/Segment;->limit:I

    .line 27
    .line 28
    iget v5, v0, Lokio/Segment;->pos:I

    .line 29
    .line 30
    if-eq v4, v5, :cond_1

    .line 31
    .line 32
    sub-int/2addr v4, v5

    .line 33
    add-int/2addr v2, v4

    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    iget-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string p1, "s.limit == s.pos"

    .line 40
    .line 41
    invoke-static {p1}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_2
    new-array v0, v3, [[B

    .line 47
    .line 48
    mul-int/lit8 v2, v3, 0x2

    .line 49
    .line 50
    new-array v2, v2, [I

    .line 51
    .line 52
    iget-object v4, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 53
    .line 54
    move-object v5, v4

    .line 55
    move v4, v1

    .line 56
    :goto_1
    if-ge v1, p1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v6, v5, Lokio/Segment;->data:[B

    .line 62
    .line 63
    aput-object v6, v0, v4

    .line 64
    .line 65
    iget v6, v5, Lokio/Segment;->limit:I

    .line 66
    .line 67
    iget v7, v5, Lokio/Segment;->pos:I

    .line 68
    .line 69
    sub-int/2addr v6, v7

    .line 70
    add-int/2addr v1, v6

    .line 71
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    aput v6, v2, v4

    .line 76
    .line 77
    add-int v6, v4, v3

    .line 78
    .line 79
    iget v7, v5, Lokio/Segment;->pos:I

    .line 80
    .line 81
    aput v7, v2, v6

    .line 82
    .line 83
    const/4 v6, 0x1

    .line 84
    iput-boolean v6, v5, Lokio/Segment;->shared:Z

    .line 85
    .line 86
    add-int/2addr v4, v6

    .line 87
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    new-instance p1, Lokio/SegmentedByteString;

    .line 91
    .line 92
    invoke-direct {p1, v0, v2}, Lokio/SegmentedByteString;-><init>([[B[I)V

    .line 93
    .line 94
    .line 95
    return-object p1
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    sget-object v0, Lokio/Timeout;->NONE:Lokio/Timeout;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/Buffer;->snapshot()Lokio/ByteString;

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

.method public final writableSegment$okio(I)Lokio/Segment;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_3

    .line 3
    .line 4
    const/16 v0, 0x2000

    .line 5
    .line 6
    if-gt p1, v0, :cond_3

    .line 7
    .line 8
    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lokio/SegmentPool;->take()Lokio/Segment;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 17
    .line 18
    iput-object p1, p1, Lokio/Segment;->prev:Lokio/Segment;

    .line 19
    .line 20
    iput-object p1, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Lokio/Segment;->prev:Lokio/Segment;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget v2, v1, Lokio/Segment;->limit:I

    .line 32
    .line 33
    add-int/2addr v2, p1

    .line 34
    if-gt v2, v0, :cond_2

    .line 35
    .line 36
    iget-boolean p1, v1, Lokio/Segment;->owner:Z

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v1

    .line 42
    :cond_2
    :goto_0
    invoke-static {}, Lokio/SegmentPool;->take()Lokio/Segment;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v1, p1}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_3
    const-string p1, "unexpected capacity"

    .line 52
    .line 53
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    return-object p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    move v1, v0

    :goto_0
    if-lez v1, :cond_0

    const/4 v2, 0x1

    .line 191
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    move-result-object v2

    .line 192
    iget v3, v2, Lokio/Segment;->limit:I

    rsub-int v3, v3, 0x2000

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 193
    iget-object v4, v2, Lokio/Segment;->data:[B

    iget v5, v2, Lokio/Segment;->limit:I

    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v1, v3

    .line 194
    iget v4, v2, Lokio/Segment;->limit:I

    add-int/2addr v4, v3

    iput v4, v2, Lokio/Segment;->limit:I

    goto :goto_0

    .line 195
    :cond_0
    iget-wide v1, p0, Lokio/Buffer;->size:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lokio/Buffer;->size:J

    return v0
.end method

.method public write(Lokio/ByteString;)Lokio/Buffer;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 196
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    move-result v1

    .line 197
    invoke-virtual {p1, p0, v0, v1}, Lokio/ByteString;->write$okio(Lokio/Buffer;II)V

    return-object p0
.end method

.method public write(Lokio/ByteString;II)Lokio/Buffer;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    invoke-virtual {p1, p0, p2, p3}, Lokio/ByteString;->write$okio(Lokio/Buffer;II)V

    return-object p0
.end method

.method public write(Lokio/Source;J)Lokio/Buffer;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    .line 208
    invoke-interface {p1, p0, p2, p3}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    sub-long/2addr p2, v0

    goto :goto_0

    .line 209
    :cond_0
    invoke-static {}, Lj8/o;->a()V

    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object p0
.end method

.method public write([B)Lokio/Buffer;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 199
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->write([BII)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public write([BII)Lokio/Buffer;
    .locals 7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    const/4 v0, 0x1

    .line 201
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    move-result-object v0

    sub-int v1, p3, p2

    .line 202
    iget v2, v0, Lokio/Segment;->limit:I

    rsub-int v2, v2, 0x2000

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 203
    iget-object v2, v0, Lokio/Segment;->data:[B

    .line 204
    iget v3, v0, Lokio/Segment;->limit:I

    add-int v4, p2, v1

    .line 205
    invoke-static {p1, v3, p2, v2, v4}, Ltf/l;->o0([BII[BI)V

    .line 206
    iget p2, v0, Lokio/Segment;->limit:I

    add-int/2addr p2, v1

    iput p2, v0, Lokio/Segment;->limit:I

    move p2, v4

    goto :goto_0

    .line 207
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide p1

    add-long/2addr p1, v5

    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    return-object p0
.end method

.method public bridge synthetic write(Lokio/ByteString;)Lokio/BufferedSink;
    .locals 0

    .line 210
    invoke-virtual {p0, p1}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Lokio/ByteString;II)Lokio/BufferedSink;
    .locals 0

    .line 186
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->write(Lokio/ByteString;II)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Lokio/Source;J)Lokio/BufferedSink;
    .locals 0

    .line 187
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->write(Lokio/Source;J)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write([B)Lokio/BufferedSink;
    .locals 0

    .line 188
    invoke-virtual {p0, p1}, Lokio/Buffer;->write([B)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write([BII)Lokio/BufferedSink;
    .locals 0

    .line 189
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->write([BII)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public write(Lokio/Buffer;J)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eq p1, p0, :cond_6

    .line 5
    .line 6
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    move-wide v4, p2

    .line 13
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 14
    .line 15
    .line 16
    :goto_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long v0, p2, v0

    .line 19
    .line 20
    if-lez v0, :cond_5

    .line 21
    .line 22
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget v0, v0, Lokio/Segment;->limit:I

    .line 28
    .line 29
    iget-object v1, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget v1, v1, Lokio/Segment;->pos:I

    .line 35
    .line 36
    sub-int/2addr v0, v1

    .line 37
    int-to-long v0, v0

    .line 38
    cmp-long v0, p2, v0

    .line 39
    .line 40
    if-gez v0, :cond_3

    .line 41
    .line 42
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Lokio/Segment;->prev:Lokio/Segment;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const/4 v0, 0x0

    .line 53
    :goto_1
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iget-boolean v1, v0, Lokio/Segment;->owner:Z

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    iget v1, v0, Lokio/Segment;->limit:I

    .line 60
    .line 61
    int-to-long v1, v1

    .line 62
    add-long/2addr v1, p2

    .line 63
    iget-boolean v3, v0, Lokio/Segment;->shared:Z

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    iget v3, v0, Lokio/Segment;->pos:I

    .line 70
    .line 71
    :goto_2
    int-to-long v3, v3

    .line 72
    sub-long/2addr v1, v3

    .line 73
    const-wide/16 v3, 0x2000

    .line 74
    .line 75
    cmp-long v1, v1, v3

    .line 76
    .line 77
    if-gtz v1, :cond_2

    .line 78
    .line 79
    iget-object v1, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    long-to-int v2, p2

    .line 85
    invoke-virtual {v1, v0, v2}, Lokio/Segment;->writeTo(Lokio/Segment;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    sub-long/2addr v0, p2

    .line 93
    invoke-virtual {p1, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    add-long/2addr v0, p2

    .line 101
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_2
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    long-to-int v1, p2

    .line 111
    invoke-virtual {v0, v1}, Lokio/Segment;->split(I)Lokio/Segment;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 116
    .line 117
    :cond_3
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget v1, v0, Lokio/Segment;->limit:I

    .line 123
    .line 124
    iget v2, v0, Lokio/Segment;->pos:I

    .line 125
    .line 126
    sub-int/2addr v1, v2

    .line 127
    int-to-long v1, v1

    .line 128
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    iput-object v3, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 133
    .line 134
    iget-object v3, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 135
    .line 136
    if-nez v3, :cond_4

    .line 137
    .line 138
    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 139
    .line 140
    iput-object v0, v0, Lokio/Segment;->prev:Lokio/Segment;

    .line 141
    .line 142
    iput-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v3, v3, Lokio/Segment;->prev:Lokio/Segment;

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v0}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Lokio/Segment;->compact()V

    .line 158
    .line 159
    .line 160
    :goto_3
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    sub-long/2addr v3, v1

    .line 165
    invoke-virtual {p1, v3, v4}, Lokio/Buffer;->setSize$okio(J)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 169
    .line 170
    .line 171
    move-result-wide v3

    .line 172
    add-long/2addr v3, v1

    .line 173
    invoke-virtual {p0, v3, v4}, Lokio/Buffer;->setSize$okio(J)V

    .line 174
    .line 175
    .line 176
    sub-long/2addr p2, v1

    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_5
    return-void

    .line 180
    :cond_6
    const-string p1, "source == this"

    .line 181
    .line 182
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public writeAll(Lokio/Source;)J
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    :goto_0
    const-wide/16 v2, 0x2000

    .line 7
    .line 8
    invoke-interface {p1, p0, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/16 v4, -0x1

    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    add-long/2addr v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-wide v0
.end method

.method public writeByte(I)Lokio/Buffer;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, v0, Lokio/Segment;->data:[B

    .line 7
    .line 8
    iget v2, v0, Lokio/Segment;->limit:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x1

    .line 11
    .line 12
    iput v3, v0, Lokio/Segment;->limit:I

    .line 13
    .line 14
    int-to-byte p1, p1

    .line 15
    aput-byte p1, v1, v2

    .line 16
    .line 17
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide/16 v2, 0x1

    .line 22
    .line 23
    add-long/2addr v0, v2

    .line 24
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public bridge synthetic writeByte(I)Lokio/BufferedSink;
    .locals 0

    .line 28
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeDecimalLong(J)Lokio/Buffer;
    .locals 12

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    const/16 p1, 0x30

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 v3, 0x1

    .line 15
    if-gez v2, :cond_2

    .line 16
    .line 17
    neg-long p1, p1

    .line 18
    cmp-long v2, p1, v0

    .line 19
    .line 20
    if-gez v2, :cond_1

    .line 21
    .line 22
    const-string p1, "-9223372036854775808"

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    move v2, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/4 v2, 0x0

    .line 32
    :goto_0
    const-wide/32 v4, 0x5f5e100

    .line 33
    .line 34
    .line 35
    cmp-long v4, p1, v4

    .line 36
    .line 37
    const/16 v5, 0xa

    .line 38
    .line 39
    if-gez v4, :cond_a

    .line 40
    .line 41
    const-wide/16 v6, 0x2710

    .line 42
    .line 43
    cmp-long v4, p1, v6

    .line 44
    .line 45
    if-gez v4, :cond_6

    .line 46
    .line 47
    const-wide/16 v6, 0x64

    .line 48
    .line 49
    cmp-long v4, p1, v6

    .line 50
    .line 51
    if-gez v4, :cond_4

    .line 52
    .line 53
    const-wide/16 v6, 0xa

    .line 54
    .line 55
    cmp-long v4, p1, v6

    .line 56
    .line 57
    if-gez v4, :cond_3

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :cond_3
    const/4 v3, 0x2

    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_4
    const-wide/16 v3, 0x3e8

    .line 65
    .line 66
    cmp-long v3, p1, v3

    .line 67
    .line 68
    if-gez v3, :cond_5

    .line 69
    .line 70
    const/4 v3, 0x3

    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_5
    const/4 v3, 0x4

    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_6
    const-wide/32 v3, 0xf4240

    .line 77
    .line 78
    .line 79
    cmp-long v3, p1, v3

    .line 80
    .line 81
    if-gez v3, :cond_8

    .line 82
    .line 83
    const-wide/32 v3, 0x186a0

    .line 84
    .line 85
    .line 86
    cmp-long v3, p1, v3

    .line 87
    .line 88
    if-gez v3, :cond_7

    .line 89
    .line 90
    const/4 v3, 0x5

    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :cond_7
    const/4 v3, 0x6

    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :cond_8
    const-wide/32 v3, 0x989680

    .line 97
    .line 98
    .line 99
    cmp-long v3, p1, v3

    .line 100
    .line 101
    if-gez v3, :cond_9

    .line 102
    .line 103
    const/4 v3, 0x7

    .line 104
    goto/16 :goto_1

    .line 105
    .line 106
    :cond_9
    const/16 v3, 0x8

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :cond_a
    const-wide v3, 0xe8d4a51000L

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    cmp-long v3, p1, v3

    .line 116
    .line 117
    if-gez v3, :cond_e

    .line 118
    .line 119
    const-wide v3, 0x2540be400L

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    cmp-long v3, p1, v3

    .line 125
    .line 126
    if-gez v3, :cond_c

    .line 127
    .line 128
    const-wide/32 v3, 0x3b9aca00

    .line 129
    .line 130
    .line 131
    cmp-long v3, p1, v3

    .line 132
    .line 133
    if-gez v3, :cond_b

    .line 134
    .line 135
    const/16 v3, 0x9

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_b
    move v3, v5

    .line 139
    goto :goto_1

    .line 140
    :cond_c
    const-wide v3, 0x174876e800L

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    cmp-long v3, p1, v3

    .line 146
    .line 147
    if-gez v3, :cond_d

    .line 148
    .line 149
    const/16 v3, 0xb

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_d
    const/16 v3, 0xc

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_e
    const-wide v3, 0x38d7ea4c68000L

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    cmp-long v3, p1, v3

    .line 161
    .line 162
    if-gez v3, :cond_11

    .line 163
    .line 164
    const-wide v3, 0x9184e72a000L

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    cmp-long v3, p1, v3

    .line 170
    .line 171
    if-gez v3, :cond_f

    .line 172
    .line 173
    const/16 v3, 0xd

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_f
    const-wide v3, 0x5af3107a4000L

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    cmp-long v3, p1, v3

    .line 182
    .line 183
    if-gez v3, :cond_10

    .line 184
    .line 185
    const/16 v3, 0xe

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_10
    const/16 v3, 0xf

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_11
    const-wide v3, 0x16345785d8a0000L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    cmp-long v3, p1, v3

    .line 197
    .line 198
    if-gez v3, :cond_13

    .line 199
    .line 200
    const-wide v3, 0x2386f26fc10000L

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    cmp-long v3, p1, v3

    .line 206
    .line 207
    if-gez v3, :cond_12

    .line 208
    .line 209
    const/16 v3, 0x10

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_12
    const/16 v3, 0x11

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_13
    const-wide v3, 0xde0b6b3a7640000L

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    cmp-long v3, p1, v3

    .line 221
    .line 222
    if-gez v3, :cond_14

    .line 223
    .line 224
    const/16 v3, 0x12

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_14
    const/16 v3, 0x13

    .line 228
    .line 229
    :goto_1
    if-eqz v2, :cond_15

    .line 230
    .line 231
    add-int/lit8 v3, v3, 0x1

    .line 232
    .line 233
    :cond_15
    invoke-virtual {p0, v3}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    iget-object v6, v4, Lokio/Segment;->data:[B

    .line 238
    .line 239
    iget v7, v4, Lokio/Segment;->limit:I

    .line 240
    .line 241
    add-int/2addr v7, v3

    .line 242
    :goto_2
    cmp-long v8, p1, v0

    .line 243
    .line 244
    if-eqz v8, :cond_16

    .line 245
    .line 246
    int-to-long v8, v5

    .line 247
    rem-long v10, p1, v8

    .line 248
    .line 249
    long-to-int v10, v10

    .line 250
    add-int/lit8 v7, v7, -0x1

    .line 251
    .line 252
    invoke-static {}, Lokio/internal/-Buffer;->getHEX_DIGIT_BYTES()[B

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    aget-byte v10, v11, v10

    .line 257
    .line 258
    aput-byte v10, v6, v7

    .line 259
    .line 260
    div-long/2addr p1, v8

    .line 261
    goto :goto_2

    .line 262
    :cond_16
    if-eqz v2, :cond_17

    .line 263
    .line 264
    add-int/lit8 v7, v7, -0x1

    .line 265
    .line 266
    const/16 p1, 0x2d

    .line 267
    .line 268
    aput-byte p1, v6, v7

    .line 269
    .line 270
    :cond_17
    iget p1, v4, Lokio/Segment;->limit:I

    .line 271
    .line 272
    add-int/2addr p1, v3

    .line 273
    iput p1, v4, Lokio/Segment;->limit:I

    .line 274
    .line 275
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 276
    .line 277
    .line 278
    move-result-wide p1

    .line 279
    int-to-long v0, v3

    .line 280
    add-long/2addr p1, v0

    .line 281
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 282
    .line 283
    .line 284
    return-object p0
.end method

.method public bridge synthetic writeDecimalLong(J)Lokio/BufferedSink;
    .locals 0

    .line 285
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeDecimalLong(J)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeHexadecimalUnsignedLong(J)Lokio/Buffer;
    .locals 12

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/16 p1, 0x30

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    ushr-long v1, p1, v0

    .line 16
    .line 17
    or-long/2addr v1, p1

    .line 18
    const/4 v3, 0x2

    .line 19
    ushr-long v4, v1, v3

    .line 20
    .line 21
    or-long/2addr v1, v4

    .line 22
    const/4 v4, 0x4

    .line 23
    ushr-long v5, v1, v4

    .line 24
    .line 25
    or-long/2addr v1, v5

    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    ushr-long v6, v1, v5

    .line 29
    .line 30
    or-long/2addr v1, v6

    .line 31
    const/16 v6, 0x10

    .line 32
    .line 33
    ushr-long v7, v1, v6

    .line 34
    .line 35
    or-long/2addr v1, v7

    .line 36
    const/16 v7, 0x20

    .line 37
    .line 38
    ushr-long v8, v1, v7

    .line 39
    .line 40
    or-long/2addr v1, v8

    .line 41
    ushr-long v8, v1, v0

    .line 42
    .line 43
    const-wide v10, 0x5555555555555555L    # 1.1945305291614955E103

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v8, v10

    .line 49
    sub-long/2addr v1, v8

    .line 50
    ushr-long v8, v1, v3

    .line 51
    .line 52
    const-wide v10, 0x3333333333333333L    # 4.667261458395856E-62

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v8, v10

    .line 58
    and-long/2addr v1, v10

    .line 59
    add-long/2addr v8, v1

    .line 60
    ushr-long v1, v8, v4

    .line 61
    .line 62
    add-long/2addr v1, v8

    .line 63
    const-wide v8, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    and-long/2addr v1, v8

    .line 69
    ushr-long v8, v1, v5

    .line 70
    .line 71
    add-long/2addr v1, v8

    .line 72
    ushr-long v5, v1, v6

    .line 73
    .line 74
    add-long/2addr v1, v5

    .line 75
    const-wide/16 v5, 0x3f

    .line 76
    .line 77
    and-long v8, v1, v5

    .line 78
    .line 79
    ushr-long/2addr v1, v7

    .line 80
    and-long/2addr v1, v5

    .line 81
    add-long/2addr v8, v1

    .line 82
    const/4 v1, 0x3

    .line 83
    int-to-long v1, v1

    .line 84
    add-long/2addr v8, v1

    .line 85
    int-to-long v1, v4

    .line 86
    div-long/2addr v8, v1

    .line 87
    long-to-int v1, v8

    .line 88
    invoke-virtual {p0, v1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v3, v2, Lokio/Segment;->data:[B

    .line 93
    .line 94
    iget v5, v2, Lokio/Segment;->limit:I

    .line 95
    .line 96
    add-int v6, v5, v1

    .line 97
    .line 98
    sub-int/2addr v6, v0

    .line 99
    :goto_0
    if-lt v6, v5, :cond_1

    .line 100
    .line 101
    invoke-static {}, Lokio/internal/-Buffer;->getHEX_DIGIT_BYTES()[B

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-wide/16 v7, 0xf

    .line 106
    .line 107
    and-long/2addr v7, p1

    .line 108
    long-to-int v7, v7

    .line 109
    aget-byte v0, v0, v7

    .line 110
    .line 111
    aput-byte v0, v3, v6

    .line 112
    .line 113
    ushr-long/2addr p1, v4

    .line 114
    add-int/lit8 v6, v6, -0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    iget p1, v2, Lokio/Segment;->limit:I

    .line 118
    .line 119
    add-int/2addr p1, v1

    .line 120
    iput p1, v2, Lokio/Segment;->limit:I

    .line 121
    .line 122
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 123
    .line 124
    .line 125
    move-result-wide p1

    .line 126
    int-to-long v0, v1

    .line 127
    add-long/2addr p1, v0

    .line 128
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 129
    .line 130
    .line 131
    return-object p0
.end method

.method public bridge synthetic writeHexadecimalUnsignedLong(J)Lokio/BufferedSink;
    .locals 0

    .line 132
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeHexadecimalUnsignedLong(J)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeInt(I)Lokio/Buffer;
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Lokio/Segment;->data:[B

    .line 7
    .line 8
    iget v3, v1, Lokio/Segment;->limit:I

    .line 9
    .line 10
    add-int/lit8 v4, v3, 0x1

    .line 11
    .line 12
    ushr-int/lit8 v5, p1, 0x18

    .line 13
    .line 14
    and-int/lit16 v5, v5, 0xff

    .line 15
    .line 16
    int-to-byte v5, v5

    .line 17
    aput-byte v5, v2, v3

    .line 18
    .line 19
    add-int/lit8 v5, v3, 0x2

    .line 20
    .line 21
    ushr-int/lit8 v6, p1, 0x10

    .line 22
    .line 23
    and-int/lit16 v6, v6, 0xff

    .line 24
    .line 25
    int-to-byte v6, v6

    .line 26
    aput-byte v6, v2, v4

    .line 27
    .line 28
    add-int/lit8 v4, v3, 0x3

    .line 29
    .line 30
    ushr-int/lit8 v6, p1, 0x8

    .line 31
    .line 32
    and-int/lit16 v6, v6, 0xff

    .line 33
    .line 34
    int-to-byte v6, v6

    .line 35
    aput-byte v6, v2, v5

    .line 36
    .line 37
    add-int/2addr v3, v0

    .line 38
    and-int/lit16 p1, p1, 0xff

    .line 39
    .line 40
    int-to-byte p1, p1

    .line 41
    aput-byte p1, v2, v4

    .line 42
    .line 43
    iput v3, v1, Lokio/Segment;->limit:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    const-wide/16 v2, 0x4

    .line 50
    .line 51
    add-long/2addr v0, v2

    .line 52
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public bridge synthetic writeInt(I)Lokio/BufferedSink;
    .locals 0

    .line 56
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeIntLe(I)Lokio/Buffer;
    .locals 0

    .line 1
    invoke-static {p1}, Lokio/-SegmentedByteString;->reverseBytes(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public bridge synthetic writeIntLe(I)Lokio/BufferedSink;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeIntLe(I)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeLong(J)Lokio/Buffer;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, Lokio/Segment;->data:[B

    .line 8
    .line 9
    iget v3, v1, Lokio/Segment;->limit:I

    .line 10
    .line 11
    add-int/lit8 v4, v3, 0x1

    .line 12
    .line 13
    const/16 v5, 0x38

    .line 14
    .line 15
    ushr-long v5, p1, v5

    .line 16
    .line 17
    const-wide/16 v7, 0xff

    .line 18
    .line 19
    and-long/2addr v5, v7

    .line 20
    long-to-int v5, v5

    .line 21
    int-to-byte v5, v5

    .line 22
    aput-byte v5, v2, v3

    .line 23
    .line 24
    add-int/lit8 v5, v3, 0x2

    .line 25
    .line 26
    const/16 v6, 0x30

    .line 27
    .line 28
    ushr-long v9, p1, v6

    .line 29
    .line 30
    and-long/2addr v9, v7

    .line 31
    long-to-int v6, v9

    .line 32
    int-to-byte v6, v6

    .line 33
    aput-byte v6, v2, v4

    .line 34
    .line 35
    add-int/lit8 v4, v3, 0x3

    .line 36
    .line 37
    const/16 v6, 0x28

    .line 38
    .line 39
    ushr-long v9, p1, v6

    .line 40
    .line 41
    and-long/2addr v9, v7

    .line 42
    long-to-int v6, v9

    .line 43
    int-to-byte v6, v6

    .line 44
    aput-byte v6, v2, v5

    .line 45
    .line 46
    add-int/lit8 v5, v3, 0x4

    .line 47
    .line 48
    const/16 v6, 0x20

    .line 49
    .line 50
    ushr-long v9, p1, v6

    .line 51
    .line 52
    and-long/2addr v9, v7

    .line 53
    long-to-int v6, v9

    .line 54
    int-to-byte v6, v6

    .line 55
    aput-byte v6, v2, v4

    .line 56
    .line 57
    add-int/lit8 v4, v3, 0x5

    .line 58
    .line 59
    const/16 v6, 0x18

    .line 60
    .line 61
    ushr-long v9, p1, v6

    .line 62
    .line 63
    and-long/2addr v9, v7

    .line 64
    long-to-int v6, v9

    .line 65
    int-to-byte v6, v6

    .line 66
    aput-byte v6, v2, v5

    .line 67
    .line 68
    add-int/lit8 v5, v3, 0x6

    .line 69
    .line 70
    const/16 v6, 0x10

    .line 71
    .line 72
    ushr-long v9, p1, v6

    .line 73
    .line 74
    and-long/2addr v9, v7

    .line 75
    long-to-int v6, v9

    .line 76
    int-to-byte v6, v6

    .line 77
    aput-byte v6, v2, v4

    .line 78
    .line 79
    add-int/lit8 v4, v3, 0x7

    .line 80
    .line 81
    ushr-long v9, p1, v0

    .line 82
    .line 83
    and-long/2addr v9, v7

    .line 84
    long-to-int v6, v9

    .line 85
    int-to-byte v6, v6

    .line 86
    aput-byte v6, v2, v5

    .line 87
    .line 88
    add-int/2addr v3, v0

    .line 89
    and-long/2addr p1, v7

    .line 90
    long-to-int p1, p1

    .line 91
    int-to-byte p1, p1

    .line 92
    aput-byte p1, v2, v4

    .line 93
    .line 94
    iput v3, v1, Lokio/Segment;->limit:I

    .line 95
    .line 96
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    const-wide/16 v0, 0x8

    .line 101
    .line 102
    add-long/2addr p1, v0

    .line 103
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 104
    .line 105
    .line 106
    return-object p0
.end method

.method public bridge synthetic writeLong(J)Lokio/BufferedSink;
    .locals 0

    .line 107
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeLong(J)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeLongLe(J)Lokio/Buffer;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lokio/-SegmentedByteString;->reverseBytes(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeLong(J)Lokio/Buffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public bridge synthetic writeLongLe(J)Lokio/BufferedSink;
    .locals 0

    .line 10
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeLongLe(J)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeShort(I)Lokio/Buffer;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Lokio/Segment;->data:[B

    .line 7
    .line 8
    iget v3, v1, Lokio/Segment;->limit:I

    .line 9
    .line 10
    add-int/lit8 v4, v3, 0x1

    .line 11
    .line 12
    ushr-int/lit8 v5, p1, 0x8

    .line 13
    .line 14
    and-int/lit16 v5, v5, 0xff

    .line 15
    .line 16
    int-to-byte v5, v5

    .line 17
    aput-byte v5, v2, v3

    .line 18
    .line 19
    add-int/2addr v3, v0

    .line 20
    and-int/lit16 p1, p1, 0xff

    .line 21
    .line 22
    int-to-byte p1, p1

    .line 23
    aput-byte p1, v2, v4

    .line 24
    .line 25
    iput v3, v1, Lokio/Segment;->limit:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    const-wide/16 v2, 0x2

    .line 32
    .line 33
    add-long/2addr v0, v2

    .line 34
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public bridge synthetic writeShort(I)Lokio/BufferedSink;
    .locals 0

    .line 38
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeShort(I)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeShortLe(I)Lokio/Buffer;
    .locals 0

    .line 1
    int-to-short p1, p1

    .line 2
    invoke-static {p1}, Lokio/-SegmentedByteString;->reverseBytes(S)S

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeShort(I)Lokio/Buffer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public bridge synthetic writeShortLe(I)Lokio/BufferedSink;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeShortLe(I)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-ltz p2, :cond_3

    .line 8
    .line 9
    if-lt p3, p2, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gt p3, v0, :cond_1

    .line 16
    .line 17
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-virtual {p4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;II)Lokio/Buffer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 p2, 0x0

    .line 42
    array-length p3, p1

    .line 43
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->write([BII)Lokio/Buffer;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_1
    const-string p2, "endIndex > string.length: "

    .line 49
    .line 50
    const-string p4, " > "

    .line 51
    .line 52
    invoke-static {p3, p2, p4}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-static {p1, p2}, Lokio/a;->e(ILjava/lang/StringBuilder;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    return-object p1

    .line 65
    :cond_2
    const-string p1, "endIndex < beginIndex: "

    .line 66
    .line 67
    const-string p4, " < "

    .line 68
    .line 69
    invoke-static {p3, p1, p4, p2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    return-object p1

    .line 78
    :cond_3
    const-string p1, "beginIndex < 0: "

    .line 79
    .line 80
    invoke-static {p2, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    return-object p1
.end method

.method public writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/Buffer;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 90
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 91
    invoke-virtual {p0, p1, v0, v1, p2}, Lokio/Buffer;->writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;
    .locals 0

    .line 92
    invoke-virtual {p0, p1, p2, p3, p4}, Lokio/Buffer;->writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;
    .locals 0

    .line 89
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public final writeTo(Ljava/io/OutputStream;)Lokio/Buffer;
    .locals 6

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lokio/Buffer;->writeTo$default(Lokio/Buffer;Ljava/io/OutputStream;JILjava/lang/Object;)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public final writeTo(Ljava/io/OutputStream;J)Lokio/Buffer;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lokio/Buffer;->size:J

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    move-wide v4, p2

    .line 9
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 13
    .line 14
    move-object v0, p2

    .line 15
    move-wide p2, v4

    .line 16
    :cond_0
    :goto_0
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    cmp-long v1, p2, v1

    .line 19
    .line 20
    if-lez v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget v1, v0, Lokio/Segment;->limit:I

    .line 26
    .line 27
    iget v2, v0, Lokio/Segment;->pos:I

    .line 28
    .line 29
    sub-int/2addr v1, v2

    .line 30
    int-to-long v1, v1

    .line 31
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    long-to-int v1, v1

    .line 36
    iget-object v2, v0, Lokio/Segment;->data:[B

    .line 37
    .line 38
    iget v3, v0, Lokio/Segment;->pos:I

    .line 39
    .line 40
    invoke-virtual {p1, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 41
    .line 42
    .line 43
    iget v2, v0, Lokio/Segment;->pos:I

    .line 44
    .line 45
    add-int/2addr v2, v1

    .line 46
    iput v2, v0, Lokio/Segment;->pos:I

    .line 47
    .line 48
    iget-wide v3, p0, Lokio/Buffer;->size:J

    .line 49
    .line 50
    int-to-long v5, v1

    .line 51
    sub-long/2addr v3, v5

    .line 52
    iput-wide v3, p0, Lokio/Buffer;->size:J

    .line 53
    .line 54
    sub-long/2addr p2, v5

    .line 55
    iget v1, v0, Lokio/Segment;->limit:I

    .line 56
    .line 57
    if-ne v2, v1, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 64
    .line 65
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 66
    .line 67
    .line 68
    move-object v0, v1

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return-object p0
.end method

.method public writeUtf8(Ljava/lang/String;)Lokio/Buffer;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 324
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;II)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeUtf8(Ljava/lang/String;II)Lokio/Buffer;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-ltz p2, :cond_a

    .line 5
    .line 6
    if-lt p3, p2, :cond_9

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gt p3, v0, :cond_8

    .line 13
    .line 14
    :goto_0
    if-ge p2, p3, :cond_7

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v1, 0x80

    .line 21
    .line 22
    if-ge v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v3, v2, Lokio/Segment;->data:[B

    .line 30
    .line 31
    iget v4, v2, Lokio/Segment;->limit:I

    .line 32
    .line 33
    sub-int/2addr v4, p2

    .line 34
    rsub-int v5, v4, 0x2000

    .line 35
    .line 36
    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    add-int/lit8 v6, p2, 0x1

    .line 41
    .line 42
    add-int/2addr p2, v4

    .line 43
    int-to-byte v0, v0

    .line 44
    aput-byte v0, v3, p2

    .line 45
    .line 46
    :goto_1
    move p2, v6

    .line 47
    if-ge p2, v5, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-ge v0, v1, :cond_0

    .line 54
    .line 55
    add-int/lit8 v6, p2, 0x1

    .line 56
    .line 57
    add-int/2addr p2, v4

    .line 58
    int-to-byte v0, v0

    .line 59
    aput-byte v0, v3, p2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    add-int/2addr v4, p2

    .line 63
    iget v0, v2, Lokio/Segment;->limit:I

    .line 64
    .line 65
    sub-int/2addr v4, v0

    .line 66
    add-int/2addr v0, v4

    .line 67
    iput v0, v2, Lokio/Segment;->limit:I

    .line 68
    .line 69
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    int-to-long v2, v4

    .line 74
    add-long/2addr v0, v2

    .line 75
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const/16 v2, 0x800

    .line 80
    .line 81
    if-ge v0, v2, :cond_2

    .line 82
    .line 83
    const/4 v2, 0x2

    .line 84
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iget-object v4, v3, Lokio/Segment;->data:[B

    .line 89
    .line 90
    iget v5, v3, Lokio/Segment;->limit:I

    .line 91
    .line 92
    shr-int/lit8 v6, v0, 0x6

    .line 93
    .line 94
    or-int/lit16 v6, v6, 0xc0

    .line 95
    .line 96
    int-to-byte v6, v6

    .line 97
    aput-byte v6, v4, v5

    .line 98
    .line 99
    add-int/lit8 v6, v5, 0x1

    .line 100
    .line 101
    and-int/lit8 v0, v0, 0x3f

    .line 102
    .line 103
    or-int/2addr v0, v1

    .line 104
    int-to-byte v0, v0

    .line 105
    aput-byte v0, v4, v6

    .line 106
    .line 107
    add-int/2addr v5, v2

    .line 108
    iput v5, v3, Lokio/Segment;->limit:I

    .line 109
    .line 110
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    const-wide/16 v2, 0x2

    .line 115
    .line 116
    add-long/2addr v0, v2

    .line 117
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 118
    .line 119
    .line 120
    :goto_2
    add-int/lit8 p2, p2, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    const v2, 0xd800

    .line 124
    .line 125
    .line 126
    const/16 v3, 0x3f

    .line 127
    .line 128
    if-lt v0, v2, :cond_6

    .line 129
    .line 130
    const v2, 0xdfff

    .line 131
    .line 132
    .line 133
    if-le v0, v2, :cond_3

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_3
    add-int/lit8 v2, p2, 0x1

    .line 137
    .line 138
    if-ge v2, p3, :cond_4

    .line 139
    .line 140
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    goto :goto_3

    .line 145
    :cond_4
    const/4 v4, 0x0

    .line 146
    :goto_3
    const v5, 0xdbff

    .line 147
    .line 148
    .line 149
    if-gt v0, v5, :cond_5

    .line 150
    .line 151
    const v5, 0xdc00

    .line 152
    .line 153
    .line 154
    if-gt v5, v4, :cond_5

    .line 155
    .line 156
    const v5, 0xe000

    .line 157
    .line 158
    .line 159
    if-ge v4, v5, :cond_5

    .line 160
    .line 161
    and-int/lit16 v0, v0, 0x3ff

    .line 162
    .line 163
    shl-int/lit8 v0, v0, 0xa

    .line 164
    .line 165
    and-int/lit16 v2, v4, 0x3ff

    .line 166
    .line 167
    or-int/2addr v0, v2

    .line 168
    const/high16 v2, 0x10000

    .line 169
    .line 170
    add-int/2addr v0, v2

    .line 171
    const/4 v2, 0x4

    .line 172
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    iget-object v5, v4, Lokio/Segment;->data:[B

    .line 177
    .line 178
    iget v6, v4, Lokio/Segment;->limit:I

    .line 179
    .line 180
    shr-int/lit8 v7, v0, 0x12

    .line 181
    .line 182
    or-int/lit16 v7, v7, 0xf0

    .line 183
    .line 184
    int-to-byte v7, v7

    .line 185
    aput-byte v7, v5, v6

    .line 186
    .line 187
    add-int/lit8 v7, v6, 0x1

    .line 188
    .line 189
    shr-int/lit8 v8, v0, 0xc

    .line 190
    .line 191
    and-int/2addr v8, v3

    .line 192
    or-int/2addr v8, v1

    .line 193
    int-to-byte v8, v8

    .line 194
    aput-byte v8, v5, v7

    .line 195
    .line 196
    add-int/lit8 v7, v6, 0x2

    .line 197
    .line 198
    shr-int/lit8 v8, v0, 0x6

    .line 199
    .line 200
    and-int/2addr v8, v3

    .line 201
    or-int/2addr v8, v1

    .line 202
    int-to-byte v8, v8

    .line 203
    aput-byte v8, v5, v7

    .line 204
    .line 205
    add-int/lit8 v7, v6, 0x3

    .line 206
    .line 207
    and-int/2addr v0, v3

    .line 208
    or-int/2addr v0, v1

    .line 209
    int-to-byte v0, v0

    .line 210
    aput-byte v0, v5, v7

    .line 211
    .line 212
    add-int/2addr v6, v2

    .line 213
    iput v6, v4, Lokio/Segment;->limit:I

    .line 214
    .line 215
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    const-wide/16 v2, 0x4

    .line 220
    .line 221
    add-long/2addr v0, v2

    .line 222
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 223
    .line 224
    .line 225
    add-int/lit8 p2, p2, 0x2

    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_5
    invoke-virtual {p0, v3}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 230
    .line 231
    .line 232
    move p2, v2

    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_6
    :goto_4
    const/4 v2, 0x3

    .line 236
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    iget-object v5, v4, Lokio/Segment;->data:[B

    .line 241
    .line 242
    iget v6, v4, Lokio/Segment;->limit:I

    .line 243
    .line 244
    shr-int/lit8 v7, v0, 0xc

    .line 245
    .line 246
    or-int/lit16 v7, v7, 0xe0

    .line 247
    .line 248
    int-to-byte v7, v7

    .line 249
    aput-byte v7, v5, v6

    .line 250
    .line 251
    add-int/lit8 v7, v6, 0x1

    .line 252
    .line 253
    shr-int/lit8 v8, v0, 0x6

    .line 254
    .line 255
    and-int/2addr v3, v8

    .line 256
    or-int/2addr v3, v1

    .line 257
    int-to-byte v3, v3

    .line 258
    aput-byte v3, v5, v7

    .line 259
    .line 260
    add-int/lit8 v3, v6, 0x2

    .line 261
    .line 262
    and-int/lit8 v0, v0, 0x3f

    .line 263
    .line 264
    or-int/2addr v0, v1

    .line 265
    int-to-byte v0, v0

    .line 266
    aput-byte v0, v5, v3

    .line 267
    .line 268
    add-int/2addr v6, v2

    .line 269
    iput v6, v4, Lokio/Segment;->limit:I

    .line 270
    .line 271
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    const-wide/16 v2, 0x3

    .line 276
    .line 277
    add-long/2addr v0, v2

    .line 278
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :cond_7
    return-object p0

    .line 284
    :cond_8
    const-string p2, "endIndex > string.length: "

    .line 285
    .line 286
    const-string v0, " > "

    .line 287
    .line 288
    invoke-static {p3, p2, v0}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    invoke-static {p1, p2}, Lokio/a;->e(ILjava/lang/StringBuilder;)V

    .line 297
    .line 298
    .line 299
    :goto_5
    const/4 p1, 0x0

    .line 300
    return-object p1

    .line 301
    :cond_9
    const-string p1, "endIndex < beginIndex: "

    .line 302
    .line 303
    const-string v0, " < "

    .line 304
    .line 305
    invoke-static {p3, p1, v0, p2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_a
    const-string p1, "beginIndex < 0: "

    .line 314
    .line 315
    invoke-static {p2, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto :goto_5
.end method

.method public bridge synthetic writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;
    .locals 0

    .line 325
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic writeUtf8(Ljava/lang/String;II)Lokio/BufferedSink;
    .locals 0

    .line 323
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;II)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method

.method public writeUtf8CodePoint(I)Lokio/Buffer;
    .locals 8

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    const/16 v1, 0x800

    .line 10
    .line 11
    const/16 v2, 0x3f

    .line 12
    .line 13
    if-ge p1, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-virtual {p0, v1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, v3, Lokio/Segment;->data:[B

    .line 21
    .line 22
    iget v5, v3, Lokio/Segment;->limit:I

    .line 23
    .line 24
    shr-int/lit8 v6, p1, 0x6

    .line 25
    .line 26
    or-int/lit16 v6, v6, 0xc0

    .line 27
    .line 28
    int-to-byte v6, v6

    .line 29
    aput-byte v6, v4, v5

    .line 30
    .line 31
    add-int/lit8 v6, v5, 0x1

    .line 32
    .line 33
    and-int/2addr p1, v2

    .line 34
    or-int/2addr p1, v0

    .line 35
    int-to-byte p1, p1

    .line 36
    aput-byte p1, v4, v6

    .line 37
    .line 38
    add-int/2addr v5, v1

    .line 39
    iput v5, v3, Lokio/Segment;->limit:I

    .line 40
    .line 41
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    const-wide/16 v2, 0x2

    .line 46
    .line 47
    add-long/2addr v0, v2

    .line 48
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_1
    const v1, 0xd800

    .line 53
    .line 54
    .line 55
    if-gt v1, p1, :cond_2

    .line 56
    .line 57
    const v1, 0xe000

    .line 58
    .line 59
    .line 60
    if-ge p1, v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v2}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_2
    const/high16 v1, 0x10000

    .line 67
    .line 68
    if-ge p1, v1, :cond_3

    .line 69
    .line 70
    const/4 v1, 0x3

    .line 71
    invoke-virtual {p0, v1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget-object v4, v3, Lokio/Segment;->data:[B

    .line 76
    .line 77
    iget v5, v3, Lokio/Segment;->limit:I

    .line 78
    .line 79
    shr-int/lit8 v6, p1, 0xc

    .line 80
    .line 81
    or-int/lit16 v6, v6, 0xe0

    .line 82
    .line 83
    int-to-byte v6, v6

    .line 84
    aput-byte v6, v4, v5

    .line 85
    .line 86
    add-int/lit8 v6, v5, 0x1

    .line 87
    .line 88
    shr-int/lit8 v7, p1, 0x6

    .line 89
    .line 90
    and-int/2addr v7, v2

    .line 91
    or-int/2addr v7, v0

    .line 92
    int-to-byte v7, v7

    .line 93
    aput-byte v7, v4, v6

    .line 94
    .line 95
    add-int/lit8 v6, v5, 0x2

    .line 96
    .line 97
    and-int/2addr p1, v2

    .line 98
    or-int/2addr p1, v0

    .line 99
    int-to-byte p1, p1

    .line 100
    aput-byte p1, v4, v6

    .line 101
    .line 102
    add-int/2addr v5, v1

    .line 103
    iput v5, v3, Lokio/Segment;->limit:I

    .line 104
    .line 105
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    const-wide/16 v2, 0x3

    .line 110
    .line 111
    add-long/2addr v0, v2

    .line 112
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_3
    const v1, 0x10ffff

    .line 117
    .line 118
    .line 119
    if-gt p1, v1, :cond_4

    .line 120
    .line 121
    const/4 v1, 0x4

    .line 122
    invoke-virtual {p0, v1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    iget-object v4, v3, Lokio/Segment;->data:[B

    .line 127
    .line 128
    iget v5, v3, Lokio/Segment;->limit:I

    .line 129
    .line 130
    shr-int/lit8 v6, p1, 0x12

    .line 131
    .line 132
    or-int/lit16 v6, v6, 0xf0

    .line 133
    .line 134
    int-to-byte v6, v6

    .line 135
    aput-byte v6, v4, v5

    .line 136
    .line 137
    add-int/lit8 v6, v5, 0x1

    .line 138
    .line 139
    shr-int/lit8 v7, p1, 0xc

    .line 140
    .line 141
    and-int/2addr v7, v2

    .line 142
    or-int/2addr v7, v0

    .line 143
    int-to-byte v7, v7

    .line 144
    aput-byte v7, v4, v6

    .line 145
    .line 146
    add-int/lit8 v6, v5, 0x2

    .line 147
    .line 148
    shr-int/lit8 v7, p1, 0x6

    .line 149
    .line 150
    and-int/2addr v7, v2

    .line 151
    or-int/2addr v7, v0

    .line 152
    int-to-byte v7, v7

    .line 153
    aput-byte v7, v4, v6

    .line 154
    .line 155
    add-int/lit8 v6, v5, 0x3

    .line 156
    .line 157
    and-int/2addr p1, v2

    .line 158
    or-int/2addr p1, v0

    .line 159
    int-to-byte p1, p1

    .line 160
    aput-byte p1, v4, v6

    .line 161
    .line 162
    add-int/2addr v5, v1

    .line 163
    iput v5, v3, Lokio/Segment;->limit:I

    .line 164
    .line 165
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 166
    .line 167
    .line 168
    move-result-wide v0

    .line 169
    const-wide/16 v2, 0x4

    .line 170
    .line 171
    add-long/2addr v0, v2

    .line 172
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :cond_4
    const-string v0, "Unexpected code point: 0x"

    .line 177
    .line 178
    invoke-static {p1}, Lokio/-SegmentedByteString;->toHexString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-static {p1, v0}, Lj8/o;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const/4 p1, 0x0

    .line 186
    return-object p1
.end method

.method public bridge synthetic writeUtf8CodePoint(I)Lokio/BufferedSink;
    .locals 0

    .line 187
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeUtf8CodePoint(I)Lokio/Buffer;

    move-result-object p1

    return-object p1
.end method
