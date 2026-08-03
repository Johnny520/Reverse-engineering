.class public final Lokio/RealBufferedSource;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lokio/BufferedSource;


# instance fields
.field public final bufferField:Lokio/Buffer;

.field public closed:Z

.field public final source:Lokio/Source;


# direct methods
.method public constructor <init>(Lokio/Source;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 8
    .line 9
    new-instance p1, Lokio/Buffer;

    .line 10
    .line 11
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic getBuffer$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public buffer()Lokio/Buffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 2
    .line 3
    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 7
    .line 8
    iget-object v0, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 9
    .line 10
    invoke-interface {v0}, Lokio/Source;->close()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 14
    .line 15
    invoke-virtual {v0}, Lokio/Buffer;->clear()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public exhausted()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lokio/Buffer;->exhausted()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 14
    .line 15
    iget-object v1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 16
    .line 17
    const-wide/16 v2, 0x2000

    .line 18
    .line 19
    invoke-interface {v0, v1, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, -0x1

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :cond_1
    const-string v0, "closed"

    .line 34
    .line 35
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    return v0
.end method

.method public getBuffer()Lokio/Buffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 2
    .line 3
    return-object v0
.end method

.method public indexOf(B)J
    .locals 6

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    .line 104
    invoke-virtual/range {v0 .. v5}, Lokio/RealBufferedSource;->indexOf(BJJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public indexOf(BJ)J
    .locals 6

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    .line 102
    invoke-virtual/range {v0 .. v5}, Lokio/RealBufferedSource;->indexOf(BJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public indexOf(BJJ)J
    .locals 9

    .line 1
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, p2

    .line 8
    .line 9
    if-gtz v0, :cond_3

    .line 10
    .line 11
    cmp-long v0, p2, p4

    .line 12
    .line 13
    if-gtz v0, :cond_3

    .line 14
    .line 15
    move-wide v3, p2

    .line 16
    :goto_0
    cmp-long p2, v3, p4

    .line 17
    .line 18
    const-wide/16 v7, -0x1

    .line 19
    .line 20
    if-gez p2, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 23
    .line 24
    move v2, p1

    .line 25
    move-wide v5, p4

    .line 26
    invoke-virtual/range {v1 .. v6}, Lokio/Buffer;->indexOf(BJJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    cmp-long p3, p1, v7

    .line 31
    .line 32
    if-eqz p3, :cond_0

    .line 33
    .line 34
    return-wide p1

    .line 35
    :cond_0
    iget-object p1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 36
    .line 37
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    cmp-long p3, p1, v5

    .line 42
    .line 43
    if-gez p3, :cond_2

    .line 44
    .line 45
    iget-object p3, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 46
    .line 47
    iget-object p4, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 48
    .line 49
    const-wide/16 v0, 0x2000

    .line 50
    .line 51
    invoke-interface {p3, p4, v0, v1}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 52
    .line 53
    .line 54
    move-result-wide p3

    .line 55
    cmp-long p3, p3, v7

    .line 56
    .line 57
    if-nez p3, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    move p1, v2

    .line 65
    move-wide p4, v5

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    :goto_1
    return-wide v7

    .line 68
    :cond_3
    move-wide v5, p4

    .line 69
    const-string p1, "fromIndex="

    .line 70
    .line 71
    const-string p4, " toIndex="

    .line 72
    .line 73
    invoke-static {p2, p3, p1, p4}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p2

    .line 94
    :cond_4
    const-string p1, "closed"

    .line 95
    .line 96
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-wide/16 p1, 0x0

    .line 100
    .line 101
    return-wide p1
.end method

.method public indexOf(Lokio/ByteString;)J
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    .line 103
    invoke-virtual {p0, p1, v0, v1}, Lokio/RealBufferedSource;->indexOf(Lokio/ByteString;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public indexOf(Lokio/ByteString;J)J
    .locals 8

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    if-nez v0, :cond_2

    .line 106
    :goto_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 107
    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->indexOf(Lokio/ByteString;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    return-wide v0

    .line 108
    :cond_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 109
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    .line 110
    iget-object v4, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 111
    iget-object v5, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    const-wide/16 v6, 0x2000

    .line 112
    invoke-interface {v4, v5, v6, v7}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-nez v4, :cond_1

    return-wide v2

    .line 113
    :cond_1
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    .line 114
    :cond_2
    const-string p1, "closed"

    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public indexOfElement(Lokio/ByteString;)J
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    .line 55
    invoke-virtual {p0, p1, v0, v1}, Lokio/RealBufferedSource;->indexOfElement(Lokio/ByteString;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public indexOfElement(Lokio/ByteString;J)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->indexOfElement(Lokio/ByteString;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, -0x1

    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    return-wide v0

    .line 21
    :cond_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 22
    .line 23
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iget-object v4, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 28
    .line 29
    iget-object v5, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 30
    .line 31
    const-wide/16 v6, 0x2000

    .line 32
    .line 33
    invoke-interface {v4, v5, v6, v7}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    cmp-long v4, v4, v2

    .line 38
    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    return-wide v2

    .line 42
    :cond_1
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide p2

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-string p1, "closed"

    .line 48
    .line 49
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 p1, 0x0

    .line 53
    .line 54
    return-wide p1
.end method

.method public inputStream()Ljava/io/InputStream;
    .locals 1

    .line 1
    new-instance v0, Lokio/RealBufferedSource$inputStream$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lokio/RealBufferedSource$inputStream$1;-><init>(Lokio/RealBufferedSource;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
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

    .line 70
    invoke-virtual {p3}, Lokio/ByteString;->size()I

    move-result v5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    .line 71
    invoke-virtual/range {v0 .. v5}, Lokio/RealBufferedSource;->rangeEquals(JLokio/ByteString;II)Z

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
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 5
    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-ltz v0, :cond_4

    .line 14
    .line 15
    if-ltz p4, :cond_4

    .line 16
    .line 17
    if-ltz p5, :cond_4

    .line 18
    .line 19
    invoke-virtual {p3}, Lokio/ByteString;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sub-int/2addr v0, p4

    .line 24
    if-ge v0, p5, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move v0, v1

    .line 28
    :goto_0
    if-ge v0, p5, :cond_3

    .line 29
    .line 30
    int-to-long v2, v0

    .line 31
    add-long/2addr v2, p1

    .line 32
    const-wide/16 v4, 0x1

    .line 33
    .line 34
    add-long/2addr v4, v2

    .line 35
    invoke-virtual {p0, v4, v5}, Lokio/RealBufferedSource;->request(J)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    return v1

    .line 42
    :cond_1
    iget-object v4, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 43
    .line 44
    invoke-virtual {v4, v2, v3}, Lokio/Buffer;->getByte(J)B

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int v3, p4, v0

    .line 49
    .line 50
    invoke-virtual {p3, v3}, Lokio/ByteString;->getByte(I)B

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eq v2, v3, :cond_2

    .line 55
    .line 56
    return v1

    .line 57
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    :cond_4
    :goto_1
    return v1

    .line 63
    :cond_5
    const-string p1, "closed"

    .line 64
    .line 65
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    return p1
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 91
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 93
    iget-object v1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    const-wide/16 v2, 0x2000

    .line 94
    invoke-interface {v0, v1, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 95
    :cond_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 96
    invoke-virtual {v0, p1}, Lokio/Buffer;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public read([B)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 78
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lokio/RealBufferedSource;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 80
    iget-object p3, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 81
    invoke-virtual {p3}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    .line 82
    iget-object p3, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 83
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    const-wide/16 v1, 0x2000

    .line 84
    invoke-interface {p3, v0, v1, v2}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    const/4 p1, -0x1

    return p1

    .line 85
    :cond_0
    iget-object p3, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 86
    invoke-virtual {p3}, Lokio/Buffer;->size()J

    move-result-wide v0

    .line 87
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 88
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 89
    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->read([BII)I

    move-result p1

    return p1
.end method

.method public read(Lokio/Buffer;J)J
    .locals 4

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
    if-ltz v2, :cond_2

    .line 9
    .line 10
    iget-boolean v2, p0, Lokio/RealBufferedSource;->closed:Z

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 15
    .line 16
    invoke-virtual {v2}, Lokio/Buffer;->size()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    cmp-long v0, v2, v0

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 25
    .line 26
    iget-object v1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 27
    .line 28
    const-wide/16 v2, 0x2000

    .line 29
    .line 30
    invoke-interface {v0, v1, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide/16 v2, -0x1

    .line 35
    .line 36
    cmp-long v0, v0, v2

    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-wide v2

    .line 41
    :cond_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 42
    .line 43
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 52
    .line 53
    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->read(Lokio/Buffer;J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    return-wide p1

    .line 58
    :cond_1
    const-string p1, "closed"

    .line 59
    .line 60
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-wide/16 p1, 0x0

    .line 64
    .line 65
    return-wide p1

    .line 66
    :cond_2
    const-string p1, "byteCount < 0: "

    .line 67
    .line 68
    invoke-static {p2, p3, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-wide/16 p1, 0x0

    .line 76
    .line 77
    return-wide p1
.end method

.method public readAll(Lokio/Sink;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    move-wide v2, v0

    .line 7
    :cond_0
    :goto_0
    iget-object v4, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 8
    .line 9
    iget-object v5, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 10
    .line 11
    const-wide/16 v6, 0x2000

    .line 12
    .line 13
    invoke-interface {v4, v5, v6, v7}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    const-wide/16 v6, -0x1

    .line 18
    .line 19
    cmp-long v4, v4, v6

    .line 20
    .line 21
    iget-object v5, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v5}, Lokio/Buffer;->completeSegmentByteCount()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    cmp-long v6, v4, v0

    .line 30
    .line 31
    if-lez v6, :cond_0

    .line 32
    .line 33
    add-long/2addr v2, v4

    .line 34
    iget-object v6, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 35
    .line 36
    invoke-interface {p1, v6, v4, v5}, Lokio/Sink;->write(Lokio/Buffer;J)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v5}, Lokio/Buffer;->size()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    cmp-long v0, v4, v0

    .line 45
    .line 46
    if-lez v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 49
    .line 50
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    add-long/2addr v0, v2

    .line 55
    iget-object v2, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 56
    .line 57
    invoke-virtual {v2}, Lokio/Buffer;->size()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    invoke-interface {p1, v2, v3, v4}, Lokio/Sink;->write(Lokio/Buffer;J)V

    .line 62
    .line 63
    .line 64
    return-wide v0

    .line 65
    :cond_2
    return-wide v2
.end method

.method public readByte()B
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokio/Buffer;->readByte()B

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public readByteArray()[B
    .locals 2

    .line 1
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 2
    .line 3
    iget-object v1, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 9
    .line 10
    invoke-virtual {v0}, Lokio/Buffer;->readByteArray()[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public readByteArray(J)[B
    .locals 1

    .line 15
    invoke-virtual {p0, p1, p2}, Lokio/RealBufferedSource;->require(J)V

    .line 16
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 17
    invoke-virtual {v0, p1, p2}, Lokio/Buffer;->readByteArray(J)[B

    move-result-object p1

    return-object p1
.end method

.method public readByteString()Lokio/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 2
    .line 3
    iget-object v1, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 9
    .line 10
    invoke-virtual {v0}, Lokio/Buffer;->readByteString()Lokio/ByteString;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public readByteString(J)Lokio/ByteString;
    .locals 1

    .line 15
    invoke-virtual {p0, p1, p2}, Lokio/RealBufferedSource;->require(J)V

    .line 16
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 17
    invoke-virtual {v0, p1, p2}, Lokio/Buffer;->readByteString(J)Lokio/ByteString;

    move-result-object p1

    return-object p1
.end method

.method public readDecimalLong()J
    .locals 10

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    move-wide v4, v2

    .line 9
    :goto_0
    add-long v6, v4, v0

    .line 10
    .line 11
    invoke-virtual {p0, v6, v7}, Lokio/RealBufferedSource;->request(J)Z

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    if-eqz v8, :cond_4

    .line 16
    .line 17
    iget-object v8, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 18
    .line 19
    invoke-virtual {v8, v4, v5}, Lokio/Buffer;->getByte(J)B

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    const/16 v9, 0x30

    .line 24
    .line 25
    if-lt v8, v9, :cond_0

    .line 26
    .line 27
    const/16 v9, 0x39

    .line 28
    .line 29
    if-le v8, v9, :cond_1

    .line 30
    .line 31
    :cond_0
    cmp-long v4, v4, v2

    .line 32
    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    const/16 v5, 0x2d

    .line 36
    .line 37
    if-eq v8, v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-wide v4, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    if-eqz v4, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 46
    .line 47
    const/16 v1, 0x10

    .line 48
    .line 49
    invoke-static {v1}, La/a;->w(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, La/a;->w(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v8, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-string v2, "Expected a digit or \'-\' but was 0x"

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_4
    :goto_2
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 73
    .line 74
    invoke-virtual {v0}, Lokio/Buffer;->readDecimalLong()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    return-wide v0
.end method

.method public readFully(Lokio/Buffer;J)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lokio/RealBufferedSource;->require(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 54
    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->readFully(Lokio/Buffer;J)V

    return-void

    :catch_0
    move-exception p2

    .line 55
    iget-object p3, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 56
    invoke-virtual {p1, p3}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 57
    throw p2
.end method

.method public readFully([B)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    array-length v0, p1

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lokio/Buffer;->readFully([B)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    iget-object v2, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 18
    .line 19
    invoke-virtual {v2}, Lokio/Buffer;->size()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    cmp-long v2, v2, v4

    .line 26
    .line 27
    if-lez v2, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 30
    .line 31
    invoke-virtual {v2}, Lokio/Buffer;->size()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    long-to-int v3, v3

    .line 36
    invoke-virtual {v2, p1, v1, v3}, Lokio/Buffer;->read([BII)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, -0x1

    .line 41
    if-eq v2, v3, :cond_0

    .line 42
    .line 43
    add-int/2addr v1, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    throw v0
.end method

.method public readHexadecimalUnsignedLong()J
    .locals 5

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    int-to-long v2, v1

    .line 10
    invoke-virtual {p0, v2, v3}, Lokio/RealBufferedSource;->request(J)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_5

    .line 15
    .line 16
    iget-object v2, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 17
    .line 18
    int-to-long v3, v0

    .line 19
    invoke-virtual {v2, v3, v4}, Lokio/Buffer;->getByte(J)B

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/16 v3, 0x30

    .line 24
    .line 25
    if-lt v2, v3, :cond_0

    .line 26
    .line 27
    const/16 v3, 0x39

    .line 28
    .line 29
    if-le v2, v3, :cond_2

    .line 30
    .line 31
    :cond_0
    const/16 v3, 0x61

    .line 32
    .line 33
    if-lt v2, v3, :cond_1

    .line 34
    .line 35
    const/16 v3, 0x66

    .line 36
    .line 37
    if-le v2, v3, :cond_2

    .line 38
    .line 39
    :cond_1
    const/16 v3, 0x41

    .line 40
    .line 41
    if-lt v2, v3, :cond_3

    .line 42
    .line 43
    const/16 v3, 0x46

    .line 44
    .line 45
    if-le v2, v3, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v0, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 54
    .line 55
    const/16 v1, 0x10

    .line 56
    .line 57
    invoke-static {v1}, La/a;->w(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, La/a;->w(I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const-string v2, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_5
    :goto_2
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 81
    .line 82
    invoke-virtual {v0}, Lokio/Buffer;->readHexadecimalUnsignedLong()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    return-wide v0
.end method

.method public readInt()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokio/Buffer;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public readIntLe()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokio/Buffer;->readIntLe()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public readLong()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokio/Buffer;->readLong()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public readLongLe()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokio/Buffer;->readLongLe()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public readShort()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokio/Buffer;->readShort()S

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public readShortLe()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokio/Buffer;->readShortLe()S

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public readString(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-virtual {p0, p1, p2}, Lokio/RealBufferedSource;->require(J)V

    .line 19
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 20
    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public readString(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 5
    .line 6
    iget-object v1, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public readUtf8()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 2
    .line 3
    iget-object v1, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 9
    .line 10
    invoke-virtual {v0}, Lokio/Buffer;->readUtf8()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public readUtf8(J)Ljava/lang/String;
    .locals 1

    .line 15
    invoke-virtual {p0, p1, p2}, Lokio/RealBufferedSource;->require(J)V

    .line 16
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 17
    invoke-virtual {v0, p1, p2}, Lokio/Buffer;->readUtf8(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public readUtf8CodePoint()I
    .locals 3

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lokio/Buffer;->getByte(J)B

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    and-int/lit16 v1, v0, 0xe0

    .line 15
    .line 16
    const/16 v2, 0xc0

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    const-wide/16 v0, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    and-int/lit16 v1, v0, 0xf0

    .line 27
    .line 28
    const/16 v2, 0xe0

    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    const-wide/16 v0, 0x3

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    and-int/lit16 v0, v0, 0xf8

    .line 39
    .line 40
    const/16 v1, 0xf0

    .line 41
    .line 42
    if-ne v0, v1, :cond_2

    .line 43
    .line 44
    const-wide/16 v0, 0x4

    .line 45
    .line 46
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->require(J)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 50
    .line 51
    invoke-virtual {v0}, Lokio/Buffer;->readUtf8CodePoint()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    return v0
.end method

.method public readUtf8Line()Ljava/lang/String;
    .locals 4

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lokio/RealBufferedSource;->indexOf(B)J

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
    iget-object v3, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v3}, Lokio/Buffer;->size()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    cmp-long v0, v0, v2

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 26
    .line 27
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->readUtf8(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    return-object v0

    .line 38
    :cond_1
    invoke-static {v3, v0, v1}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public readUtf8LineStrict()Ljava/lang/String;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 150
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public readUtf8LineStrict(J)Ljava/lang/String;
    .locals 13

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
    const-wide/16 v3, 0x1

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    move-wide v11, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    add-long v5, p1, v3

    .line 21
    .line 22
    move-wide v11, v5

    .line 23
    :goto_0
    const/16 v8, 0xa

    .line 24
    .line 25
    const-wide/16 v9, 0x0

    .line 26
    .line 27
    move-object v7, p0

    .line 28
    invoke-virtual/range {v7 .. v12}, Lokio/RealBufferedSource;->indexOf(BJJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    const-wide/16 v8, -0x1

    .line 33
    .line 34
    cmp-long v2, v5, v8

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object p1, v7, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 39
    .line 40
    invoke-static {p1, v5, v6}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    cmp-long v0, v11, v0

    .line 46
    .line 47
    if-gez v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, v11, v12}, Lokio/RealBufferedSource;->request(J)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iget-object v0, v7, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 56
    .line 57
    sub-long v1, v11, v3

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lokio/Buffer;->getByte(J)B

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/16 v1, 0xd

    .line 64
    .line 65
    if-ne v0, v1, :cond_2

    .line 66
    .line 67
    add-long v0, v11, v3

    .line 68
    .line 69
    invoke-virtual {p0, v0, v1}, Lokio/RealBufferedSource;->request(J)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    iget-object v0, v7, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 76
    .line 77
    invoke-virtual {v0, v11, v12}, Lokio/Buffer;->getByte(J)B

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/16 v1, 0xa

    .line 82
    .line 83
    if-ne v0, v1, :cond_2

    .line 84
    .line 85
    iget-object p1, v7, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 86
    .line 87
    invoke-static {p1, v11, v12}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_2
    new-instance v1, Lokio/Buffer;

    .line 93
    .line 94
    invoke-direct {v1}, Lokio/Buffer;-><init>()V

    .line 95
    .line 96
    .line 97
    iget-object v0, v7, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 98
    .line 99
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    const/16 v4, 0x20

    .line 104
    .line 105
    int-to-long v4, v4

    .line 106
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 107
    .line 108
    .line 109
    move-result-wide v4

    .line 110
    const-wide/16 v2, 0x0

    .line 111
    .line 112
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    .line 113
    .line 114
    .line 115
    iget-object v0, v7, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 116
    .line 117
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 122
    .line 123
    .line 124
    move-result-wide p1

    .line 125
    invoke-virtual {v1}, Lokio/Buffer;->readByteString()Lokio/ByteString;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0, p1, p2}, Lj8/o;->g(Ljava/lang/Object;J)V

    .line 134
    .line 135
    .line 136
    const/4 p1, 0x0

    .line 137
    return-object p1

    .line 138
    :cond_3
    move-object v7, p0

    .line 139
    const-string v0, "limit < 0: "

    .line 140
    .line 141
    invoke-static {p1, p2, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    const/4 p1, 0x0

    .line 149
    return-object p1
.end method

.method public request(J)Z
    .locals 4

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
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 12
    .line 13
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    cmp-long v0, v0, p1

    .line 18
    .line 19
    if-gez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 22
    .line 23
    iget-object v1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 24
    .line 25
    const-wide/16 v2, 0x2000

    .line 26
    .line 27
    invoke-interface {v0, v1, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    const-wide/16 v2, -0x1

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_1
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_2
    const-string p1, "closed"

    .line 42
    .line 43
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    const/4 p1, 0x0

    .line 47
    return p1

    .line 48
    :cond_3
    const-string v0, "byteCount < 0: "

    .line 49
    .line 50
    invoke-static {p1, p2, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0
.end method

.method public require(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lokio/RealBufferedSource;->request(J)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

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
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v0, p1, v1}, Lokio/internal/-Buffer;->selectPrefix(Lokio/Buffer;Lokio/Options;Z)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, -0x2

    .line 16
    const/4 v2, -0x1

    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lokio/Options;->getByteStrings$okio()[Lokio/ByteString;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    aget-object p1, p1, v0

    .line 26
    .line 27
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object v1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 32
    .line 33
    int-to-long v2, p1

    .line 34
    invoke-virtual {v1, v2, v3}, Lokio/Buffer;->skip(J)V

    .line 35
    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    return v2

    .line 39
    :cond_2
    iget-object v0, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 40
    .line 41
    iget-object v1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 42
    .line 43
    const-wide/16 v3, 0x2000

    .line 44
    .line 45
    invoke-interface {v0, v1, v3, v4}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    const-wide/16 v3, -0x1

    .line 50
    .line 51
    cmp-long v0, v0, v3

    .line 52
    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    return v2

    .line 56
    :cond_3
    const-string p1, "closed"

    .line 57
    .line 58
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    return p1
.end method

.method public skip(J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lokio/RealBufferedSource;->closed:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    :goto_0
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-lez v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 12
    .line 13
    invoke-virtual {v2}, Lokio/Buffer;->size()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    cmp-long v0, v2, v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 22
    .line 23
    iget-object v1, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 24
    .line 25
    const-wide/16 v2, 0x2000

    .line 26
    .line 27
    invoke-interface {v0, v1, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    const-wide/16 v2, -0x1

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {}, Lj8/o;->a()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    :goto_1
    iget-object v0, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 43
    .line 44
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    iget-object v2, p0, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 53
    .line 54
    invoke-virtual {v2, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 55
    .line 56
    .line 57
    sub-long/2addr p1, v0

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    return-void

    .line 60
    :cond_3
    const-string p1, "closed"

    .line 61
    .line 62
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 2
    .line 3
    invoke-interface {v0}, Lokio/Source;->timeout()Lokio/Timeout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lokio/RealBufferedSource;->source:Lokio/Source;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
