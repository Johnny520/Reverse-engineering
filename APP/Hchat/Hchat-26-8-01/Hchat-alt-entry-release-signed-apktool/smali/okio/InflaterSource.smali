.class public final Lokio/InflaterSource;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lokio/Source;


# instance fields
.field private bufferBytesHeldByInflater:I

.field private closed:Z

.field private final inflater:Ljava/util/zip/Inflater;

.field private final source:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lokio/InflaterSource;->source:Lokio/BufferedSource;

    .line 11
    .line 12
    iput-object p2, p0, Lokio/InflaterSource;->inflater:Ljava/util/zip/Inflater;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lokio/Source;Ljava/util/zip/Inflater;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lokio/InflaterSource;-><init>(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V

    return-void
.end method

.method private final releaseBytesAfterInflate()V
    .locals 4

    .line 1
    iget v0, p0, Lokio/InflaterSource;->bufferBytesHeldByInflater:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lokio/InflaterSource;->inflater:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    iget v1, p0, Lokio/InflaterSource;->bufferBytesHeldByInflater:I

    .line 14
    .line 15
    sub-int/2addr v1, v0

    .line 16
    iput v1, p0, Lokio/InflaterSource;->bufferBytesHeldByInflater:I

    .line 17
    .line 18
    iget-object v1, p0, Lokio/InflaterSource;->source:Lokio/BufferedSource;

    .line 19
    .line 20
    int-to-long v2, v0

    .line 21
    invoke-interface {v1, v2, v3}, Lokio/BufferedSource;->skip(J)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokio/InflaterSource;->closed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lokio/InflaterSource;->inflater:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lokio/InflaterSource;->closed:Z

    .line 13
    .line 14
    iget-object v0, p0, Lokio/InflaterSource;->source:Lokio/BufferedSource;

    .line 15
    .line 16
    invoke-interface {v0}, Lokio/Source;->close()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lokio/InflaterSource;->readOrInflate(Lokio/Buffer;J)J

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
    return-wide v0

    .line 15
    :cond_0
    iget-object v0, p0, Lokio/InflaterSource;->inflater:Ljava/util/zip/Inflater;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, Lokio/InflaterSource;->inflater:Ljava/util/zip/Inflater;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object v0, p0, Lokio/InflaterSource;->source:Lokio/BufferedSource;

    .line 33
    .line 34
    invoke-interface {v0}, Lokio/BufferedSource;->exhausted()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    .line 42
    .line 43
    const-string p2, "source exhausted prematurely"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_3
    :goto_1
    const-wide/16 p1, -0x1

    .line 50
    .line 51
    return-wide p1
.end method

.method public final readOrInflate(Lokio/Buffer;J)J
    .locals 5

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
    if-ltz v2, :cond_4

    .line 9
    .line 10
    iget-boolean v3, p0, Lokio/InflaterSource;->closed:Z

    .line 11
    .line 12
    if-nez v3, :cond_3

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    const/4 v2, 0x1

    .line 18
    :try_start_0
    invoke-virtual {p1, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget v3, v2, Lokio/Segment;->limit:I

    .line 23
    .line 24
    rsub-int v3, v3, 0x2000

    .line 25
    .line 26
    int-to-long v3, v3

    .line 27
    invoke-static {p2, p3, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide p2

    .line 31
    long-to-int p2, p2

    .line 32
    invoke-virtual {p0}, Lokio/InflaterSource;->refill()Z

    .line 33
    .line 34
    .line 35
    iget-object p3, p0, Lokio/InflaterSource;->inflater:Ljava/util/zip/Inflater;

    .line 36
    .line 37
    iget-object v3, v2, Lokio/Segment;->data:[B

    .line 38
    .line 39
    iget v4, v2, Lokio/Segment;->limit:I

    .line 40
    .line 41
    invoke-virtual {p3, v3, v4, p2}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-direct {p0}, Lokio/InflaterSource;->releaseBytesAfterInflate()V

    .line 46
    .line 47
    .line 48
    if-lez p2, :cond_1

    .line 49
    .line 50
    iget p3, v2, Lokio/Segment;->limit:I

    .line 51
    .line 52
    add-int/2addr p3, p2

    .line 53
    iput p3, v2, Lokio/Segment;->limit:I

    .line 54
    .line 55
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    int-to-long p2, p2

    .line 60
    add-long/2addr v0, p2

    .line 61
    invoke-virtual {p1, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 62
    .line 63
    .line 64
    return-wide p2

    .line 65
    :catch_0
    move-exception p1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget p2, v2, Lokio/Segment;->pos:I

    .line 68
    .line 69
    iget p3, v2, Lokio/Segment;->limit:I

    .line 70
    .line 71
    if-ne p2, p3, :cond_2

    .line 72
    .line 73
    invoke-virtual {v2}, Lokio/Segment;->pop()Lokio/Segment;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iput-object p2, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 78
    .line 79
    invoke-static {v2}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    :cond_2
    return-wide v0

    .line 83
    :goto_0
    new-instance p2, Ljava/io/IOException;

    .line 84
    .line 85
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw p2

    .line 89
    :cond_3
    const-string p1, "closed"

    .line 90
    .line 91
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    const-wide/16 p1, 0x0

    .line 95
    .line 96
    return-wide p1

    .line 97
    :cond_4
    const-string p1, "byteCount < 0: "

    .line 98
    .line 99
    invoke-static {p2, p3, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1
.end method

.method public final refill()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lokio/InflaterSource;->inflater:Ljava/util/zip/Inflater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lokio/InflaterSource;->source:Lokio/BufferedSource;

    .line 12
    .line 13
    invoke-interface {v0}, Lokio/BufferedSource;->exhausted()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_1
    iget-object v0, p0, Lokio/InflaterSource;->source:Lokio/BufferedSource;

    .line 22
    .line 23
    invoke-interface {v0}, Lokio/BufferedSource;->getBuffer()Lokio/Buffer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget v2, v0, Lokio/Segment;->limit:I

    .line 33
    .line 34
    iget v3, v0, Lokio/Segment;->pos:I

    .line 35
    .line 36
    sub-int/2addr v2, v3

    .line 37
    iput v2, p0, Lokio/InflaterSource;->bufferBytesHeldByInflater:I

    .line 38
    .line 39
    iget-object v4, p0, Lokio/InflaterSource;->inflater:Ljava/util/zip/Inflater;

    .line 40
    .line 41
    iget-object v0, v0, Lokio/Segment;->data:[B

    .line 42
    .line 43
    invoke-virtual {v4, v0, v3, v2}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 44
    .line 45
    .line 46
    return v1
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/InflaterSource;->source:Lokio/BufferedSource;

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
