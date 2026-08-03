.class public final Lokio/internal/-Buffer;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final HEX_DIGIT_BYTES:[B

.field public static final OVERFLOW_DIGIT_START:J = -0x7L

.field public static final OVERFLOW_ZONE:J = -0xcccccccccccccccL

.field public static final SEGMENTING_THRESHOLD:I = 0x1000


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "0123456789abcdef"

    .line 2
    .line 3
    invoke-static {v0}, Lokio/_JvmPlatformKt;->asUtf8ToByteArray(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lokio/internal/-Buffer;->HEX_DIGIT_BYTES:[B

    .line 8
    .line 9
    return-void
.end method

.method public static final commonClear(Lokio/Buffer;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final commonClose(Lokio/Buffer$UnsafeCursor;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lokio/Buffer$UnsafeCursor;->setSegment$okio(Lokio/Segment;)V

    .line 12
    .line 13
    .line 14
    const-wide/16 v1, -0x1

    .line 15
    .line 16
    iput-wide v1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 17
    .line 18
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 22
    .line 23
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->end:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "not attached to a buffer"

    .line 27
    .line 28
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final commonCompleteSegmentByteCount(Lokio/Buffer;)J
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    cmp-long v4, v0, v2

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    return-wide v2

    .line 15
    :cond_0
    iget-object p0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lokio/Segment;->prev:Lokio/Segment;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget v2, p0, Lokio/Segment;->limit:I

    .line 26
    .line 27
    const/16 v3, 0x2000

    .line 28
    .line 29
    if-ge v2, v3, :cond_1

    .line 30
    .line 31
    iget-boolean v3, p0, Lokio/Segment;->owner:Z

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    iget p0, p0, Lokio/Segment;->pos:I

    .line 36
    .line 37
    sub-int/2addr v2, p0

    .line 38
    int-to-long v2, v2

    .line 39
    sub-long/2addr v0, v2

    .line 40
    :cond_1
    return-wide v0
.end method

.method public static final commonCopy(Lokio/Buffer;)Lokio/Buffer;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokio/Buffer;

    .line 5
    .line 6
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lokio/Segment;->sharedCopy()Lokio/Segment;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 30
    .line 31
    iput-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 32
    .line 33
    iput-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 34
    .line 35
    iget-object v3, v1, Lokio/Segment;->next:Lokio/Segment;

    .line 36
    .line 37
    :goto_0
    if-eq v3, v1, :cond_1

    .line 38
    .line 39
    iget-object v4, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Lokio/Segment;->sharedCopy()Lokio/Segment;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v4, v5}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 52
    .line 53
    .line 54
    iget-object v3, v3, Lokio/Segment;->next:Lokio/Segment;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    invoke-virtual {v0, v1, v2}, Lokio/Buffer;->setSize$okio(J)V

    .line 62
    .line 63
    .line 64
    return-object v0
.end method

.method public static final commonCopyTo(Lokio/Buffer;Lokio/Buffer;JJ)Lokio/Buffer;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    move-wide v2, p2

    .line 12
    move-wide v4, p4

    .line 13
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 14
    .line 15
    .line 16
    const-wide/16 p2, 0x0

    .line 17
    .line 18
    cmp-long p4, v4, p2

    .line 19
    .line 20
    if-nez p4, :cond_0

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 24
    .line 25
    .line 26
    move-result-wide p4

    .line 27
    add-long/2addr p4, v4

    .line 28
    invoke-virtual {p1, p4, p5}, Lokio/Buffer;->setSize$okio(J)V

    .line 29
    .line 30
    .line 31
    iget-object p4, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 32
    .line 33
    :goto_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget p5, p4, Lokio/Segment;->limit:I

    .line 37
    .line 38
    iget v0, p4, Lokio/Segment;->pos:I

    .line 39
    .line 40
    sub-int v1, p5, v0

    .line 41
    .line 42
    int-to-long v6, v1

    .line 43
    cmp-long v1, v2, v6

    .line 44
    .line 45
    if-ltz v1, :cond_1

    .line 46
    .line 47
    sub-int/2addr p5, v0

    .line 48
    int-to-long v0, p5

    .line 49
    sub-long/2addr v2, v0

    .line 50
    iget-object p4, p4, Lokio/Segment;->next:Lokio/Segment;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v0, p4

    .line 54
    move-wide p4, v4

    .line 55
    :goto_1
    cmp-long v1, p4, p2

    .line 56
    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lokio/Segment;->sharedCopy()Lokio/Segment;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget v4, v1, Lokio/Segment;->pos:I

    .line 67
    .line 68
    long-to-int v2, v2

    .line 69
    add-int/2addr v4, v2

    .line 70
    iput v4, v1, Lokio/Segment;->pos:I

    .line 71
    .line 72
    long-to-int v2, p4

    .line 73
    add-int/2addr v4, v2

    .line 74
    iget v2, v1, Lokio/Segment;->limit:I

    .line 75
    .line 76
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iput v2, v1, Lokio/Segment;->limit:I

    .line 81
    .line 82
    iget-object v2, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 83
    .line 84
    if-nez v2, :cond_2

    .line 85
    .line 86
    iput-object v1, v1, Lokio/Segment;->prev:Lokio/Segment;

    .line 87
    .line 88
    iput-object v1, v1, Lokio/Segment;->next:Lokio/Segment;

    .line 89
    .line 90
    iput-object v1, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v1}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 102
    .line 103
    .line 104
    :goto_2
    iget v2, v1, Lokio/Segment;->limit:I

    .line 105
    .line 106
    iget v1, v1, Lokio/Segment;->pos:I

    .line 107
    .line 108
    sub-int/2addr v2, v1

    .line 109
    int-to-long v1, v2

    .line 110
    sub-long/2addr p4, v1

    .line 111
    iget-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 112
    .line 113
    move-wide v2, p2

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    :goto_3
    return-object p0
.end method

.method public static final commonEquals(Lokio/Buffer;Ljava/lang/Object;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    instance-of v3, v1, Lokio/Buffer;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    return v4

    .line 18
    :cond_1
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    check-cast v1, Lokio/Buffer;

    .line 23
    .line 24
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    cmp-long v3, v5, v7

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    return v4

    .line 33
    :cond_2
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    cmp-long v3, v5, v7

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    return v2

    .line 44
    :cond_3
    iget-object v3, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v1, v1, Lokio/Buffer;->head:Lokio/Segment;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget v5, v3, Lokio/Segment;->pos:I

    .line 55
    .line 56
    iget v6, v1, Lokio/Segment;->pos:I

    .line 57
    .line 58
    move-wide v9, v7

    .line 59
    :goto_0
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 60
    .line 61
    .line 62
    move-result-wide v11

    .line 63
    cmp-long v11, v9, v11

    .line 64
    .line 65
    if-gez v11, :cond_8

    .line 66
    .line 67
    iget v11, v3, Lokio/Segment;->limit:I

    .line 68
    .line 69
    sub-int/2addr v11, v5

    .line 70
    iget v12, v1, Lokio/Segment;->limit:I

    .line 71
    .line 72
    sub-int/2addr v12, v6

    .line 73
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    int-to-long v11, v11

    .line 78
    move-wide v13, v7

    .line 79
    :goto_1
    cmp-long v15, v13, v11

    .line 80
    .line 81
    if-gez v15, :cond_5

    .line 82
    .line 83
    iget-object v15, v3, Lokio/Segment;->data:[B

    .line 84
    .line 85
    add-int/lit8 v16, v5, 0x1

    .line 86
    .line 87
    aget-byte v5, v15, v5

    .line 88
    .line 89
    iget-object v15, v1, Lokio/Segment;->data:[B

    .line 90
    .line 91
    add-int/lit8 v17, v6, 0x1

    .line 92
    .line 93
    aget-byte v6, v15, v6

    .line 94
    .line 95
    if-eq v5, v6, :cond_4

    .line 96
    .line 97
    return v4

    .line 98
    :cond_4
    const-wide/16 v5, 0x1

    .line 99
    .line 100
    add-long/2addr v13, v5

    .line 101
    move/from16 v5, v16

    .line 102
    .line 103
    move/from16 v6, v17

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    iget v13, v3, Lokio/Segment;->limit:I

    .line 107
    .line 108
    if-ne v5, v13, :cond_6

    .line 109
    .line 110
    iget-object v3, v3, Lokio/Segment;->next:Lokio/Segment;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget v5, v3, Lokio/Segment;->pos:I

    .line 116
    .line 117
    :cond_6
    iget v13, v1, Lokio/Segment;->limit:I

    .line 118
    .line 119
    if-ne v6, v13, :cond_7

    .line 120
    .line 121
    iget-object v1, v1, Lokio/Segment;->next:Lokio/Segment;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget v6, v1, Lokio/Segment;->pos:I

    .line 127
    .line 128
    :cond_7
    add-long/2addr v9, v11

    .line 129
    goto :goto_0

    .line 130
    :cond_8
    return v2
.end method

.method public static final commonExpandBuffer(Lokio/Buffer$UnsafeCursor;I)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_3

    .line 5
    .line 6
    const/16 v0, 0x2000

    .line 7
    .line 8
    if-gt p1, v0, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-boolean v2, p0, Lokio/Buffer$UnsafeCursor;->readWrite:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-virtual {v1, p1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget v4, p1, Lokio/Segment;->limit:I

    .line 27
    .line 28
    rsub-int v4, v4, 0x2000

    .line 29
    .line 30
    iput v0, p1, Lokio/Segment;->limit:I

    .line 31
    .line 32
    int-to-long v5, v4

    .line 33
    add-long v7, v2, v5

    .line 34
    .line 35
    invoke-virtual {v1, v7, v8}, Lokio/Buffer;->setSize$okio(J)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lokio/Buffer$UnsafeCursor;->setSegment$okio(Lokio/Segment;)V

    .line 39
    .line 40
    .line 41
    iput-wide v2, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 42
    .line 43
    iget-object p1, p1, Lokio/Segment;->data:[B

    .line 44
    .line 45
    iput-object p1, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 46
    .line 47
    rsub-int p1, v4, 0x2000

    .line 48
    .line 49
    iput p1, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 50
    .line 51
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->end:I

    .line 52
    .line 53
    return-wide v5

    .line 54
    :cond_0
    const-string p0, "expandBuffer() only permitted for read/write buffers"

    .line 55
    .line 56
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    const-wide/16 p0, 0x0

    .line 60
    .line 61
    return-wide p0

    .line 62
    :cond_1
    const-string p0, "not attached to a buffer"

    .line 63
    .line 64
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string p0, "minByteCount > Segment.SIZE: "

    .line 69
    .line 70
    invoke-static {p1, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const-string p0, "minByteCount <= 0: "

    .line 79
    .line 80
    invoke-static {p1, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0
.end method

.method public static final commonGet(Lokio/Buffer;J)B
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v4, 0x1

    .line 9
    .line 10
    move-wide v2, p1

    .line 11
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sub-long/2addr v0, v2

    .line 24
    cmp-long p2, v0, v2

    .line 25
    .line 26
    if-gez p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    :goto_0
    cmp-long p0, v0, v2

    .line 33
    .line 34
    if-lez p0, :cond_0

    .line 35
    .line 36
    iget-object p1, p1, Lokio/Segment;->prev:Lokio/Segment;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget p0, p1, Lokio/Segment;->limit:I

    .line 42
    .line 43
    iget p2, p1, Lokio/Segment;->pos:I

    .line 44
    .line 45
    sub-int/2addr p0, p2

    .line 46
    int-to-long v4, p0

    .line 47
    sub-long/2addr v0, v4

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object p0, p1, Lokio/Segment;->data:[B

    .line 50
    .line 51
    iget p1, p1, Lokio/Segment;->pos:I

    .line 52
    .line 53
    int-to-long p1, p1

    .line 54
    add-long/2addr p1, v2

    .line 55
    sub-long/2addr p1, v0

    .line 56
    long-to-int p1, p1

    .line 57
    aget-byte p0, p0, p1

    .line 58
    .line 59
    return p0

    .line 60
    :cond_1
    const-wide/16 v0, 0x0

    .line 61
    .line 62
    :goto_1
    iget p0, p1, Lokio/Segment;->limit:I

    .line 63
    .line 64
    iget p2, p1, Lokio/Segment;->pos:I

    .line 65
    .line 66
    sub-int/2addr p0, p2

    .line 67
    int-to-long v4, p0

    .line 68
    add-long/2addr v4, v0

    .line 69
    cmp-long p0, v4, v2

    .line 70
    .line 71
    if-gtz p0, :cond_2

    .line 72
    .line 73
    iget-object p1, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-wide v0, v4

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    iget-object p0, p1, Lokio/Segment;->data:[B

    .line 81
    .line 82
    int-to-long p1, p2

    .line 83
    add-long/2addr p1, v2

    .line 84
    sub-long/2addr p1, v0

    .line 85
    long-to-int p1, p1

    .line 86
    aget-byte p0, p0, p1

    .line 87
    .line 88
    return p0
.end method

.method public static final commonHashCode(Lokio/Buffer;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    :cond_1
    iget v2, v0, Lokio/Segment;->pos:I

    .line 12
    .line 13
    iget v3, v0, Lokio/Segment;->limit:I

    .line 14
    .line 15
    :goto_0
    if-ge v2, v3, :cond_2

    .line 16
    .line 17
    mul-int/lit8 v1, v1, 0x1f

    .line 18
    .line 19
    iget-object v4, v0, Lokio/Segment;->data:[B

    .line 20
    .line 21
    aget-byte v4, v4, v2

    .line 22
    .line 23
    add-int/2addr v1, v4

    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    iget-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 33
    .line 34
    if-ne v0, v2, :cond_1

    .line 35
    .line 36
    return v1
.end method

.method public static final commonIndexOf(Lokio/Buffer;BJJ)J
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    cmp-long v2, v0, p2

    if-gtz v2, :cond_c

    cmp-long v2, p2, p4

    if-gtz v2, :cond_c

    .line 277
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

    .line 278
    :cond_1
    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v2, :cond_2

    return-wide v3

    .line 279
    :cond_2
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v5

    sub-long/2addr v5, p2

    cmp-long v5, v5, p2

    if-gez v5, :cond_7

    .line 280
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    :goto_0
    cmp-long p0, v0, p2

    if-lez p0, :cond_3

    .line 281
    iget-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    iget p0, v2, Lokio/Segment;->limit:I

    iget v5, v2, Lokio/Segment;->pos:I

    sub-int/2addr p0, v5

    int-to-long v5, p0

    sub-long/2addr v0, v5

    goto :goto_0

    :cond_3
    :goto_1
    cmp-long p0, v0, p4

    if-gez p0, :cond_6

    .line 283
    iget-object p0, v2, Lokio/Segment;->data:[B

    .line 284
    iget v5, v2, Lokio/Segment;->limit:I

    int-to-long v5, v5

    iget v7, v2, Lokio/Segment;->pos:I

    int-to-long v7, v7

    add-long/2addr v7, p4

    sub-long/2addr v7, v0

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    .line 285
    iget v6, v2, Lokio/Segment;->pos:I

    int-to-long v6, v6

    add-long/2addr v6, p2

    sub-long/2addr v6, v0

    long-to-int p2, v6

    :goto_2
    if-ge p2, v5, :cond_5

    .line 286
    aget-byte p3, p0, p2

    if-ne p3, p1, :cond_4

    .line 287
    :goto_3
    iget p0, v2, Lokio/Segment;->pos:I

    sub-int/2addr p2, p0

    int-to-long p0, p2

    add-long/2addr p0, v0

    return-wide p0

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 288
    :cond_5
    iget p0, v2, Lokio/Segment;->limit:I

    iget p2, v2, Lokio/Segment;->pos:I

    sub-int/2addr p0, p2

    int-to-long p2, p0

    add-long/2addr v0, p2

    .line 289
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide p2, v0

    goto :goto_1

    :cond_6
    return-wide v3

    .line 290
    :cond_7
    :goto_4
    iget p0, v2, Lokio/Segment;->limit:I

    iget v5, v2, Lokio/Segment;->pos:I

    sub-int/2addr p0, v5

    int-to-long v5, p0

    add-long/2addr v5, v0

    cmp-long p0, v5, p2

    if-gtz p0, :cond_8

    .line 291
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v0, v5

    goto :goto_4

    :cond_8
    :goto_5
    cmp-long p0, v0, p4

    if-gez p0, :cond_b

    .line 292
    iget-object p0, v2, Lokio/Segment;->data:[B

    .line 293
    iget v5, v2, Lokio/Segment;->limit:I

    int-to-long v5, v5

    iget v7, v2, Lokio/Segment;->pos:I

    int-to-long v7, v7

    add-long/2addr v7, p4

    sub-long/2addr v7, v0

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    .line 294
    iget v6, v2, Lokio/Segment;->pos:I

    int-to-long v6, v6

    add-long/2addr v6, p2

    sub-long/2addr v6, v0

    long-to-int p2, v6

    :goto_6
    if-ge p2, v5, :cond_a

    .line 295
    aget-byte p3, p0, p2

    if-ne p3, p1, :cond_9

    goto :goto_3

    :cond_9
    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    .line 296
    :cond_a
    iget p0, v2, Lokio/Segment;->limit:I

    iget p2, v2, Lokio/Segment;->pos:I

    sub-int/2addr p0, p2

    int-to-long p2, p0

    add-long/2addr v0, p2

    .line 297
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide p2, v0

    goto :goto_5

    :cond_b
    return-wide v3

    .line 298
    :cond_c
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "size="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " fromIndex="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " toIndex="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final commonIndexOf(Lokio/Buffer;Lokio/ByteString;J)J
    .locals 20

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-lez v2, :cond_c

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v4, v0, v2

    .line 18
    .line 19
    if-ltz v4, :cond_b

    .line 20
    .line 21
    move-object/from16 v4, p0

    .line 22
    .line 23
    iget-object v5, v4, Lokio/Buffer;->head:Lokio/Segment;

    .line 24
    .line 25
    const-wide/16 v6, -0x1

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    return-wide v6

    .line 30
    :cond_0
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 31
    .line 32
    .line 33
    move-result-wide v8

    .line 34
    sub-long/2addr v8, v0

    .line 35
    cmp-long v8, v8, v0

    .line 36
    .line 37
    const-wide/16 v9, 0x1

    .line 38
    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x1

    .line 41
    if-gez v8, :cond_5

    .line 42
    .line 43
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    :goto_0
    cmp-long v8, v2, v0

    .line 48
    .line 49
    if-lez v8, :cond_1

    .line 50
    .line 51
    iget-object v5, v5, Lokio/Segment;->prev:Lokio/Segment;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget v8, v5, Lokio/Segment;->limit:I

    .line 57
    .line 58
    iget v13, v5, Lokio/Segment;->pos:I

    .line 59
    .line 60
    sub-int/2addr v8, v13

    .line 61
    int-to-long v13, v8

    .line 62
    sub-long/2addr v2, v13

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->internalArray$okio()[B

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    aget-byte v11, v8, v11

    .line 69
    .line 70
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->size()I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 75
    .line 76
    .line 77
    move-result-wide v14

    .line 78
    move-wide/from16 v16, v6

    .line 79
    .line 80
    int-to-long v6, v13

    .line 81
    sub-long/2addr v14, v6

    .line 82
    add-long/2addr v14, v9

    .line 83
    :goto_1
    cmp-long v4, v2, v14

    .line 84
    .line 85
    if-gez v4, :cond_4

    .line 86
    .line 87
    iget-object v4, v5, Lokio/Segment;->data:[B

    .line 88
    .line 89
    iget v6, v5, Lokio/Segment;->limit:I

    .line 90
    .line 91
    iget v7, v5, Lokio/Segment;->pos:I

    .line 92
    .line 93
    int-to-long v9, v7

    .line 94
    add-long/2addr v9, v14

    .line 95
    sub-long/2addr v9, v2

    .line 96
    int-to-long v6, v6

    .line 97
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide v6

    .line 101
    long-to-int v6, v6

    .line 102
    iget v7, v5, Lokio/Segment;->pos:I

    .line 103
    .line 104
    int-to-long v9, v7

    .line 105
    add-long/2addr v9, v0

    .line 106
    sub-long/2addr v9, v2

    .line 107
    long-to-int v0, v9

    .line 108
    :goto_2
    if-ge v0, v6, :cond_3

    .line 109
    .line 110
    aget-byte v1, v4, v0

    .line 111
    .line 112
    if-ne v1, v11, :cond_2

    .line 113
    .line 114
    add-int/lit8 v1, v0, 0x1

    .line 115
    .line 116
    invoke-static {v5, v1, v8, v12, v13}, Lokio/internal/-Buffer;->rangeEquals(Lokio/Segment;I[BII)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_2

    .line 121
    .line 122
    iget v1, v5, Lokio/Segment;->pos:I

    .line 123
    .line 124
    sub-int/2addr v0, v1

    .line 125
    int-to-long v0, v0

    .line 126
    add-long/2addr v0, v2

    .line 127
    return-wide v0

    .line 128
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_3
    iget v0, v5, Lokio/Segment;->limit:I

    .line 132
    .line 133
    iget v1, v5, Lokio/Segment;->pos:I

    .line 134
    .line 135
    sub-int/2addr v0, v1

    .line 136
    int-to-long v0, v0

    .line 137
    add-long/2addr v2, v0

    .line 138
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-wide v0, v2

    .line 144
    goto :goto_1

    .line 145
    :cond_4
    return-wide v16

    .line 146
    :cond_5
    move-wide/from16 v16, v6

    .line 147
    .line 148
    :goto_3
    iget v6, v5, Lokio/Segment;->limit:I

    .line 149
    .line 150
    iget v7, v5, Lokio/Segment;->pos:I

    .line 151
    .line 152
    sub-int/2addr v6, v7

    .line 153
    int-to-long v6, v6

    .line 154
    add-long/2addr v6, v2

    .line 155
    cmp-long v8, v6, v0

    .line 156
    .line 157
    if-gtz v8, :cond_6

    .line 158
    .line 159
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 160
    .line 161
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-wide v2, v6

    .line 165
    goto :goto_3

    .line 166
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->internalArray$okio()[B

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    aget-byte v7, v6, v11

    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->size()I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 177
    .line 178
    .line 179
    move-result-wide v13

    .line 180
    move-wide/from16 v18, v9

    .line 181
    .line 182
    int-to-long v9, v8

    .line 183
    sub-long/2addr v13, v9

    .line 184
    add-long v13, v13, v18

    .line 185
    .line 186
    :goto_4
    cmp-long v4, v2, v13

    .line 187
    .line 188
    if-gez v4, :cond_a

    .line 189
    .line 190
    iget-object v4, v5, Lokio/Segment;->data:[B

    .line 191
    .line 192
    iget v9, v5, Lokio/Segment;->limit:I

    .line 193
    .line 194
    iget v10, v5, Lokio/Segment;->pos:I

    .line 195
    .line 196
    int-to-long v10, v10

    .line 197
    add-long/2addr v10, v13

    .line 198
    sub-long/2addr v10, v2

    .line 199
    move-wide/from16 p0, v13

    .line 200
    .line 201
    int-to-long v12, v9

    .line 202
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v9

    .line 206
    long-to-int v9, v9

    .line 207
    iget v10, v5, Lokio/Segment;->pos:I

    .line 208
    .line 209
    int-to-long v10, v10

    .line 210
    add-long/2addr v10, v0

    .line 211
    sub-long/2addr v10, v2

    .line 212
    long-to-int v0, v10

    .line 213
    :goto_5
    if-ge v0, v9, :cond_9

    .line 214
    .line 215
    aget-byte v1, v4, v0

    .line 216
    .line 217
    if-ne v1, v7, :cond_7

    .line 218
    .line 219
    add-int/lit8 v1, v0, 0x1

    .line 220
    .line 221
    const/4 v15, 0x1

    .line 222
    invoke-static {v5, v1, v6, v15, v8}, Lokio/internal/-Buffer;->rangeEquals(Lokio/Segment;I[BII)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_8

    .line 227
    .line 228
    iget v1, v5, Lokio/Segment;->pos:I

    .line 229
    .line 230
    sub-int/2addr v0, v1

    .line 231
    int-to-long v0, v0

    .line 232
    add-long/2addr v0, v2

    .line 233
    return-wide v0

    .line 234
    :cond_7
    const/4 v15, 0x1

    .line 235
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_9
    const/4 v15, 0x1

    .line 239
    iget v0, v5, Lokio/Segment;->limit:I

    .line 240
    .line 241
    iget v1, v5, Lokio/Segment;->pos:I

    .line 242
    .line 243
    sub-int/2addr v0, v1

    .line 244
    int-to-long v0, v0

    .line 245
    add-long/2addr v2, v0

    .line 246
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 247
    .line 248
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-wide/from16 v13, p0

    .line 252
    .line 253
    move-wide v0, v2

    .line 254
    move v12, v15

    .line 255
    goto :goto_4

    .line 256
    :cond_a
    return-wide v16

    .line 257
    :cond_b
    const-string v2, "fromIndex < 0: "

    .line 258
    .line 259
    invoke-static {v0, v1, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    const-wide/16 v0, 0x0

    .line 267
    .line 268
    return-wide v0

    .line 269
    :cond_c
    const-string v0, "bytes is empty"

    .line 270
    .line 271
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    const-wide/16 v0, 0x0

    .line 275
    .line 276
    return-wide v0
.end method

.method public static final commonIndexOfElement(Lokio/Buffer;Lokio/ByteString;J)J
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v2, p2, v0

    .line 10
    .line 11
    if-ltz v2, :cond_14

    .line 12
    .line 13
    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 14
    .line 15
    const-wide/16 v3, -0x1

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    return-wide v3

    .line 20
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    sub-long/2addr v5, p2

    .line 25
    cmp-long v5, v5, p2

    .line 26
    .line 27
    const/4 v6, 0x2

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    if-gez v5, :cond_a

    .line 31
    .line 32
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    :goto_0
    cmp-long v5, v0, p2

    .line 37
    .line 38
    if-lez v5, :cond_1

    .line 39
    .line 40
    iget-object v2, v2, Lokio/Segment;->prev:Lokio/Segment;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget v5, v2, Lokio/Segment;->limit:I

    .line 46
    .line 47
    iget v9, v2, Lokio/Segment;->pos:I

    .line 48
    .line 49
    sub-int/2addr v5, v9

    .line 50
    int-to-long v9, v5

    .line 51
    sub-long/2addr v0, v9

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ne v5, v6, :cond_5

    .line 58
    .line 59
    invoke-virtual {p1, v7}, Lokio/ByteString;->getByte(I)B

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {p1, v8}, Lokio/ByteString;->getByte(I)B

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    :goto_1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    cmp-long v6, v0, v6

    .line 72
    .line 73
    if-gez v6, :cond_9

    .line 74
    .line 75
    iget-object v6, v2, Lokio/Segment;->data:[B

    .line 76
    .line 77
    iget v7, v2, Lokio/Segment;->pos:I

    .line 78
    .line 79
    int-to-long v7, v7

    .line 80
    add-long/2addr v7, p2

    .line 81
    sub-long/2addr v7, v0

    .line 82
    long-to-int p2, v7

    .line 83
    iget p3, v2, Lokio/Segment;->limit:I

    .line 84
    .line 85
    :goto_2
    if-ge p2, p3, :cond_4

    .line 86
    .line 87
    aget-byte v7, v6, p2

    .line 88
    .line 89
    if-eq v7, v5, :cond_3

    .line 90
    .line 91
    if-ne v7, p1, :cond_2

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    :goto_3
    iget p0, v2, Lokio/Segment;->pos:I

    .line 98
    .line 99
    sub-int/2addr p2, p0

    .line 100
    int-to-long p0, p2

    .line 101
    add-long/2addr p0, v0

    .line 102
    return-wide p0

    .line 103
    :cond_4
    iget p2, v2, Lokio/Segment;->limit:I

    .line 104
    .line 105
    iget p3, v2, Lokio/Segment;->pos:I

    .line 106
    .line 107
    sub-int/2addr p2, p3

    .line 108
    int-to-long p2, p2

    .line 109
    add-long/2addr v0, p2

    .line 110
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-wide p2, v0

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    invoke-virtual {p1}, Lokio/ByteString;->internalArray$okio()[B

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    :goto_4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 122
    .line 123
    .line 124
    move-result-wide v5

    .line 125
    cmp-long v5, v0, v5

    .line 126
    .line 127
    if-gez v5, :cond_9

    .line 128
    .line 129
    iget-object v5, v2, Lokio/Segment;->data:[B

    .line 130
    .line 131
    iget v6, v2, Lokio/Segment;->pos:I

    .line 132
    .line 133
    int-to-long v8, v6

    .line 134
    add-long/2addr v8, p2

    .line 135
    sub-long/2addr v8, v0

    .line 136
    long-to-int p2, v8

    .line 137
    iget p3, v2, Lokio/Segment;->limit:I

    .line 138
    .line 139
    :goto_5
    if-ge p2, p3, :cond_8

    .line 140
    .line 141
    aget-byte v6, v5, p2

    .line 142
    .line 143
    array-length v8, p1

    .line 144
    move v9, v7

    .line 145
    :goto_6
    if-ge v9, v8, :cond_7

    .line 146
    .line 147
    aget-byte v10, p1, v9

    .line 148
    .line 149
    if-ne v6, v10, :cond_6

    .line 150
    .line 151
    iget p0, v2, Lokio/Segment;->pos:I

    .line 152
    .line 153
    sub-int/2addr p2, p0

    .line 154
    int-to-long p0, p2

    .line 155
    add-long/2addr p0, v0

    .line 156
    return-wide p0

    .line 157
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_7
    add-int/lit8 p2, p2, 0x1

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_8
    iget p2, v2, Lokio/Segment;->limit:I

    .line 164
    .line 165
    iget p3, v2, Lokio/Segment;->pos:I

    .line 166
    .line 167
    sub-int/2addr p2, p3

    .line 168
    int-to-long p2, p2

    .line 169
    add-long/2addr v0, p2

    .line 170
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-wide p2, v0

    .line 176
    goto :goto_4

    .line 177
    :cond_9
    return-wide v3

    .line 178
    :cond_a
    :goto_7
    iget v5, v2, Lokio/Segment;->limit:I

    .line 179
    .line 180
    iget v9, v2, Lokio/Segment;->pos:I

    .line 181
    .line 182
    sub-int/2addr v5, v9

    .line 183
    int-to-long v9, v5

    .line 184
    add-long/2addr v9, v0

    .line 185
    cmp-long v5, v9, p2

    .line 186
    .line 187
    if-gtz v5, :cond_b

    .line 188
    .line 189
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-wide v0, v9

    .line 195
    goto :goto_7

    .line 196
    :cond_b
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-ne v5, v6, :cond_f

    .line 201
    .line 202
    invoke-virtual {p1, v7}, Lokio/ByteString;->getByte(I)B

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    invoke-virtual {p1, v8}, Lokio/ByteString;->getByte(I)B

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    :goto_8
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 211
    .line 212
    .line 213
    move-result-wide v6

    .line 214
    cmp-long v6, v0, v6

    .line 215
    .line 216
    if-gez v6, :cond_13

    .line 217
    .line 218
    iget-object v6, v2, Lokio/Segment;->data:[B

    .line 219
    .line 220
    iget v7, v2, Lokio/Segment;->pos:I

    .line 221
    .line 222
    int-to-long v7, v7

    .line 223
    add-long/2addr v7, p2

    .line 224
    sub-long/2addr v7, v0

    .line 225
    long-to-int p2, v7

    .line 226
    iget p3, v2, Lokio/Segment;->limit:I

    .line 227
    .line 228
    :goto_9
    if-ge p2, p3, :cond_e

    .line 229
    .line 230
    aget-byte v7, v6, p2

    .line 231
    .line 232
    if-eq v7, v5, :cond_d

    .line 233
    .line 234
    if-ne v7, p1, :cond_c

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_c
    add-int/lit8 p2, p2, 0x1

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_d
    :goto_a
    iget p0, v2, Lokio/Segment;->pos:I

    .line 241
    .line 242
    sub-int/2addr p2, p0

    .line 243
    int-to-long p0, p2

    .line 244
    add-long/2addr p0, v0

    .line 245
    return-wide p0

    .line 246
    :cond_e
    iget p2, v2, Lokio/Segment;->limit:I

    .line 247
    .line 248
    iget p3, v2, Lokio/Segment;->pos:I

    .line 249
    .line 250
    sub-int/2addr p2, p3

    .line 251
    int-to-long p2, p2

    .line 252
    add-long/2addr v0, p2

    .line 253
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 254
    .line 255
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-wide p2, v0

    .line 259
    goto :goto_8

    .line 260
    :cond_f
    invoke-virtual {p1}, Lokio/ByteString;->internalArray$okio()[B

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    :goto_b
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 265
    .line 266
    .line 267
    move-result-wide v5

    .line 268
    cmp-long v5, v0, v5

    .line 269
    .line 270
    if-gez v5, :cond_13

    .line 271
    .line 272
    iget-object v5, v2, Lokio/Segment;->data:[B

    .line 273
    .line 274
    iget v6, v2, Lokio/Segment;->pos:I

    .line 275
    .line 276
    int-to-long v8, v6

    .line 277
    add-long/2addr v8, p2

    .line 278
    sub-long/2addr v8, v0

    .line 279
    long-to-int p2, v8

    .line 280
    iget p3, v2, Lokio/Segment;->limit:I

    .line 281
    .line 282
    :goto_c
    if-ge p2, p3, :cond_12

    .line 283
    .line 284
    aget-byte v6, v5, p2

    .line 285
    .line 286
    array-length v8, p1

    .line 287
    move v9, v7

    .line 288
    :goto_d
    if-ge v9, v8, :cond_11

    .line 289
    .line 290
    aget-byte v10, p1, v9

    .line 291
    .line 292
    if-ne v6, v10, :cond_10

    .line 293
    .line 294
    iget p0, v2, Lokio/Segment;->pos:I

    .line 295
    .line 296
    sub-int/2addr p2, p0

    .line 297
    int-to-long p0, p2

    .line 298
    add-long/2addr p0, v0

    .line 299
    return-wide p0

    .line 300
    :cond_10
    add-int/lit8 v9, v9, 0x1

    .line 301
    .line 302
    goto :goto_d

    .line 303
    :cond_11
    add-int/lit8 p2, p2, 0x1

    .line 304
    .line 305
    goto :goto_c

    .line 306
    :cond_12
    iget p2, v2, Lokio/Segment;->limit:I

    .line 307
    .line 308
    iget p3, v2, Lokio/Segment;->pos:I

    .line 309
    .line 310
    sub-int/2addr p2, p3

    .line 311
    int-to-long p2, p2

    .line 312
    add-long/2addr v0, p2

    .line 313
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-wide p2, v0

    .line 319
    goto :goto_b

    .line 320
    :cond_13
    return-wide v3

    .line 321
    :cond_14
    const-string p0, "fromIndex < 0: "

    .line 322
    .line 323
    invoke-static {p2, p3, p0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    const-wide/16 p0, 0x0

    .line 331
    .line 332
    return-wide p0
.end method

.method public static final commonNext(Lokio/Buffer$UnsafeCursor;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 5
    .line 6
    iget-object v2, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Lokio/Buffer;->size()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-wide v0, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 20
    .line 21
    const-wide/16 v2, -0x1

    .line 22
    .line 23
    cmp-long v2, v0, v2

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Lokio/Buffer$UnsafeCursor;->seek(J)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_0
    iget v2, p0, Lokio/Buffer$UnsafeCursor;->end:I

    .line 35
    .line 36
    iget v3, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 37
    .line 38
    sub-int/2addr v2, v3

    .line 39
    int-to-long v2, v2

    .line 40
    add-long/2addr v0, v2

    .line 41
    invoke-virtual {p0, v0, v1}, Lokio/Buffer$UnsafeCursor;->seek(J)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    const-string p0, "no more bytes"

    .line 47
    .line 48
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public static final commonRangeEquals(Lokio/Buffer;JLokio/ByteString;II)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v0, p1, v0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-ltz v0, :cond_3

    .line 13
    .line 14
    if-ltz p4, :cond_3

    .line 15
    .line 16
    if-ltz p5, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    sub-long/2addr v2, p1

    .line 23
    int-to-long v4, p5

    .line 24
    cmp-long v0, v2, v4

    .line 25
    .line 26
    if-ltz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p3}, Lokio/ByteString;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v0, p4

    .line 33
    if-ge v0, p5, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    move v0, v1

    .line 37
    :goto_0
    if-ge v0, p5, :cond_2

    .line 38
    .line 39
    int-to-long v2, v0

    .line 40
    add-long/2addr v2, p1

    .line 41
    invoke-virtual {p0, v2, v3}, Lokio/Buffer;->getByte(J)B

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int v3, p4, v0

    .line 46
    .line 47
    invoke-virtual {p3, v3}, Lokio/ByteString;->getByte(I)B

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eq v2, v3, :cond_1

    .line 52
    .line 53
    return v1

    .line 54
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_3
    :goto_1
    return v1
.end method

.method public static final commonRead(Lokio/Buffer;[B)I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 68
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->read([BII)I

    move-result p0

    return p0
.end method

.method public static final commonRead(Lokio/Buffer;[BII)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    array-length v0, p1

    .line 8
    int-to-long v1, v0

    .line 9
    int-to-long v3, p2

    .line 10
    int-to-long v5, p3

    .line 11
    invoke-static/range {v1 .. v6}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/4 p0, -0x1

    .line 19
    return p0

    .line 20
    :cond_0
    iget v1, v0, Lokio/Segment;->limit:I

    .line 21
    .line 22
    iget v2, v0, Lokio/Segment;->pos:I

    .line 23
    .line 24
    sub-int/2addr v1, v2

    .line 25
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    iget-object v1, v0, Lokio/Segment;->data:[B

    .line 30
    .line 31
    iget v2, v0, Lokio/Segment;->pos:I

    .line 32
    .line 33
    add-int v3, v2, p3

    .line 34
    .line 35
    invoke-static {v1, p2, v2, p1, v3}, Ltf/l;->o0([BII[BI)V

    .line 36
    .line 37
    .line 38
    iget p1, v0, Lokio/Segment;->pos:I

    .line 39
    .line 40
    add-int/2addr p1, p3

    .line 41
    iput p1, v0, Lokio/Segment;->pos:I

    .line 42
    .line 43
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    int-to-long v1, p3

    .line 48
    sub-long/2addr p1, v1

    .line 49
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 50
    .line 51
    .line 52
    iget p1, v0, Lokio/Segment;->pos:I

    .line 53
    .line 54
    iget p2, v0, Lokio/Segment;->limit:I

    .line 55
    .line 56
    if-ne p1, p2, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 63
    .line 64
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    return p3
.end method

.method public static final commonRead(Lokio/Buffer;Lokio/Buffer;J)J
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    .line 69
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const-wide/16 p0, -0x1

    return-wide p0

    .line 70
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide p2

    .line 71
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    return-wide p2

    .line 72
    :cond_2
    const-string p0, "byteCount < 0: "

    .line 73
    invoke-static {p2, p3, p0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 74
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method public static final commonReadAll(Lokio/Buffer;Lokio/Sink;)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    invoke-interface {p1, p0, v0, v1}, Lokio/Sink;->write(Lokio/Buffer;J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-wide v0
.end method

.method public static final commonReadAndWriteUnsafe(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lokio/-SegmentedByteString;->resolveDefaultParameter(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput-object p0, p1, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    iput-boolean p0, p1, Lokio/Buffer$UnsafeCursor;->readWrite:Z

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const-string p0, "already attached to a buffer"

    .line 22
    .line 23
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static final commonReadByte(Lokio/Buffer;)B
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v1, v0, Lokio/Segment;->pos:I

    .line 20
    .line 21
    iget v2, v0, Lokio/Segment;->limit:I

    .line 22
    .line 23
    iget-object v3, v0, Lokio/Segment;->data:[B

    .line 24
    .line 25
    add-int/lit8 v4, v1, 0x1

    .line 26
    .line 27
    aget-byte v1, v3, v1

    .line 28
    .line 29
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    const-wide/16 v7, 0x1

    .line 34
    .line 35
    sub-long/2addr v5, v7

    .line 36
    invoke-virtual {p0, v5, v6}, Lokio/Buffer;->setSize$okio(J)V

    .line 37
    .line 38
    .line 39
    if-ne v4, v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iput-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 46
    .line 47
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_0
    iput v4, v0, Lokio/Segment;->pos:I

    .line 52
    .line 53
    return v1

    .line 54
    :cond_1
    invoke-static {}, Lj8/o;->a()V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return p0
.end method

.method public static final commonReadByteArray(Lokio/Buffer;)[B
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readByteArray(J)[B

    move-result-object p0

    return-object p0
.end method

.method public static final commonReadByteArray(Lokio/Buffer;J)[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    const-wide/32 v0, 0x7fffffff

    .line 11
    .line 12
    .line 13
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-gtz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    cmp-long v0, v0, p1

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    .line 25
    long-to-int p1, p1

    .line 26
    new-array p1, p1, [B

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lokio/Buffer;->readFully([B)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    invoke-static {}, Lj8/o;->a()V

    .line 33
    .line 34
    .line 35
    :goto_0
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    const-string p0, "byteCount: "

    .line 38
    .line 39
    invoke-static {p1, p2, p0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0
.end method

.method public static final commonReadByteString(Lokio/Buffer;)Lokio/ByteString;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readByteString(J)Lokio/ByteString;

    move-result-object p0

    return-object p0
.end method

.method public static final commonReadByteString(Lokio/Buffer;J)Lokio/ByteString;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-ltz v0, :cond_2

    .line 9
    .line 10
    const-wide/32 v0, 0x7fffffff

    .line 11
    .line 12
    .line 13
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-gtz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    cmp-long v0, v0, p1

    .line 22
    .line 23
    if-ltz v0, :cond_1

    .line 24
    .line 25
    const-wide/16 v0, 0x1000

    .line 26
    .line 27
    cmp-long v0, p1, v0

    .line 28
    .line 29
    if-ltz v0, :cond_0

    .line 30
    .line 31
    long-to-int v0, p1

    .line 32
    invoke-virtual {p0, v0}, Lokio/Buffer;->snapshot(I)Lokio/ByteString;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->skip(J)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_0
    new-instance v0, Lokio/ByteString;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->readByteArray(J)[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v0, p0}, Lokio/ByteString;-><init>([B)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    invoke-static {}, Lj8/o;->a()V

    .line 51
    .line 52
    .line 53
    :goto_0
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    const-string p0, "byteCount: "

    .line 56
    .line 57
    invoke-static {p1, p2, p0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0
.end method

.method public static final commonReadDecimalLong(Lokio/Buffer;)J
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lokio/Buffer;->size()J

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
    if-eqz v1, :cond_e

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-wide/16 v5, -0x7

    .line 18
    .line 19
    move v2, v1

    .line 20
    move-wide v8, v3

    .line 21
    move-wide v6, v5

    .line 22
    move v5, v2

    .line 23
    :goto_0
    iget-object v10, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 24
    .line 25
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v11, v10, Lokio/Segment;->data:[B

    .line 29
    .line 30
    iget v12, v10, Lokio/Segment;->pos:I

    .line 31
    .line 32
    iget v13, v10, Lokio/Segment;->limit:I

    .line 33
    .line 34
    :goto_1
    if-ge v12, v13, :cond_5

    .line 35
    .line 36
    aget-byte v15, v11, v12

    .line 37
    .line 38
    const/16 v14, 0x30

    .line 39
    .line 40
    if-lt v15, v14, :cond_3

    .line 41
    .line 42
    const/16 v14, 0x39

    .line 43
    .line 44
    if-gt v15, v14, :cond_3

    .line 45
    .line 46
    rsub-int/lit8 v14, v15, 0x30

    .line 47
    .line 48
    const-wide v16, -0xcccccccccccccccL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    cmp-long v16, v8, v16

    .line 54
    .line 55
    if-ltz v16, :cond_1

    .line 56
    .line 57
    move-wide/from16 v17, v3

    .line 58
    .line 59
    if-nez v16, :cond_0

    .line 60
    .line 61
    int-to-long v3, v14

    .line 62
    cmp-long v3, v3, v6

    .line 63
    .line 64
    if-gez v3, :cond_0

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    const-wide/16 v3, 0xa

    .line 68
    .line 69
    mul-long/2addr v8, v3

    .line 70
    int-to-long v3, v14

    .line 71
    add-long/2addr v8, v3

    .line 72
    goto :goto_4

    .line 73
    :cond_1
    :goto_2
    new-instance v0, Lokio/Buffer;

    .line 74
    .line 75
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v8, v9}, Lokio/Buffer;->writeDecimalLong(J)Lokio/Buffer;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0, v15}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    invoke-virtual {v0}, Lokio/Buffer;->readByte()B

    .line 89
    .line 90
    .line 91
    :cond_2
    const-string v1, "Number too large: "

    .line 92
    .line 93
    invoke-virtual {v0}, Lokio/Buffer;->readUtf8()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0, v1}, Lj8/o;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    const-wide/16 v0, 0x0

    .line 101
    .line 102
    return-wide v0

    .line 103
    :cond_3
    move-wide/from16 v17, v3

    .line 104
    .line 105
    const/16 v3, 0x2d

    .line 106
    .line 107
    if-ne v15, v3, :cond_4

    .line 108
    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    const-wide/16 v2, 0x1

    .line 112
    .line 113
    sub-long/2addr v6, v2

    .line 114
    const/4 v2, 0x1

    .line 115
    :goto_4
    add-int/lit8 v12, v12, 0x1

    .line 116
    .line 117
    add-int/lit8 v1, v1, 0x1

    .line 118
    .line 119
    move-wide/from16 v3, v17

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    const/4 v5, 0x1

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    move-wide/from16 v17, v3

    .line 125
    .line 126
    :goto_5
    if-ne v12, v13, :cond_6

    .line 127
    .line 128
    invoke-virtual {v10}, Lokio/Segment;->pop()Lokio/Segment;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    iput-object v3, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 133
    .line 134
    invoke-static {v10}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 135
    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_6
    iput v12, v10, Lokio/Segment;->pos:I

    .line 139
    .line 140
    :goto_6
    if-nez v5, :cond_8

    .line 141
    .line 142
    iget-object v3, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 143
    .line 144
    if-nez v3, :cond_7

    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_7
    move-wide/from16 v3, v17

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_8
    :goto_7
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 151
    .line 152
    .line 153
    move-result-wide v3

    .line 154
    int-to-long v5, v1

    .line 155
    sub-long/2addr v3, v5

    .line 156
    invoke-virtual {v0, v3, v4}, Lokio/Buffer;->setSize$okio(J)V

    .line 157
    .line 158
    .line 159
    if-eqz v2, :cond_9

    .line 160
    .line 161
    const/4 v14, 0x2

    .line 162
    goto :goto_8

    .line 163
    :cond_9
    const/4 v14, 0x1

    .line 164
    :goto_8
    if-ge v1, v14, :cond_c

    .line 165
    .line 166
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 167
    .line 168
    .line 169
    move-result-wide v3

    .line 170
    cmp-long v1, v3, v17

    .line 171
    .line 172
    if-eqz v1, :cond_b

    .line 173
    .line 174
    if-eqz v2, :cond_a

    .line 175
    .line 176
    const-string v1, "Expected a digit"

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_a
    const-string v1, "Expected a digit or \'-\'"

    .line 180
    .line 181
    :goto_9
    new-instance v2, Ljava/lang/NumberFormatException;

    .line 182
    .line 183
    const-string v3, " but was 0x"

    .line 184
    .line 185
    invoke-static {v1, v3}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    move-wide/from16 v3, v17

    .line 190
    .line 191
    invoke-virtual {v0, v3, v4}, Lokio/Buffer;->getByte(J)B

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    invoke-static {v0}, Lokio/-SegmentedByteString;->toHexString(B)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v2

    .line 210
    :cond_b
    invoke-static {}, Lj8/o;->a()V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_c
    if-eqz v2, :cond_d

    .line 215
    .line 216
    return-wide v8

    .line 217
    :cond_d
    neg-long v0, v8

    .line 218
    return-wide v0

    .line 219
    :cond_e
    invoke-static {}, Lj8/o;->a()V

    .line 220
    .line 221
    .line 222
    goto :goto_3
.end method

.method public static final commonReadFully(Lokio/Buffer;Lokio/Buffer;J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    cmp-long v0, v0, p2

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lj8/o;->a()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final commonReadFully(Lokio/Buffer;[B)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 30
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 31
    array-length v1, p1

    sub-int/2addr v1, v0

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, Lj8/o;->a()V

    :cond_1
    return-void
.end method

.method public static final commonReadHexadecimalUnsignedLong(Lokio/Buffer;)J
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_9

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    move v1, v0

    .line 16
    move-wide v4, v2

    .line 17
    :cond_0
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v7, v6, Lokio/Segment;->data:[B

    .line 23
    .line 24
    iget v8, v6, Lokio/Segment;->pos:I

    .line 25
    .line 26
    iget v9, v6, Lokio/Segment;->limit:I

    .line 27
    .line 28
    :goto_0
    if-ge v8, v9, :cond_6

    .line 29
    .line 30
    aget-byte v10, v7, v8

    .line 31
    .line 32
    const/16 v11, 0x30

    .line 33
    .line 34
    if-lt v10, v11, :cond_1

    .line 35
    .line 36
    const/16 v11, 0x39

    .line 37
    .line 38
    if-gt v10, v11, :cond_1

    .line 39
    .line 40
    add-int/lit8 v11, v10, -0x30

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v11, 0x61

    .line 44
    .line 45
    if-lt v10, v11, :cond_2

    .line 46
    .line 47
    const/16 v11, 0x66

    .line 48
    .line 49
    if-gt v10, v11, :cond_2

    .line 50
    .line 51
    add-int/lit8 v11, v10, -0x57

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/16 v11, 0x41

    .line 55
    .line 56
    if-lt v10, v11, :cond_4

    .line 57
    .line 58
    const/16 v11, 0x46

    .line 59
    .line 60
    if-gt v10, v11, :cond_4

    .line 61
    .line 62
    add-int/lit8 v11, v10, -0x37

    .line 63
    .line 64
    :goto_1
    const-wide/high16 v12, -0x1000000000000000L    # -3.105036184601418E231

    .line 65
    .line 66
    and-long/2addr v12, v4

    .line 67
    cmp-long v12, v12, v2

    .line 68
    .line 69
    if-nez v12, :cond_3

    .line 70
    .line 71
    const/4 v10, 0x4

    .line 72
    shl-long/2addr v4, v10

    .line 73
    int-to-long v10, v11

    .line 74
    or-long/2addr v4, v10

    .line 75
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    new-instance p0, Lokio/Buffer;

    .line 81
    .line 82
    invoke-direct {p0}, Lokio/Buffer;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v4, v5}, Lokio/Buffer;->writeHexadecimalUnsignedLong(J)Lokio/Buffer;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0, v10}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string v0, "Number too large: "

    .line 94
    .line 95
    invoke-virtual {p0}, Lokio/Buffer;->readUtf8()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0, v0}, Lj8/o;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :goto_2
    const-wide/16 v0, 0x0

    .line 103
    .line 104
    return-wide v0

    .line 105
    :cond_4
    if-eqz v0, :cond_5

    .line 106
    .line 107
    const/4 v1, 0x1

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    const-string p0, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 110
    .line 111
    invoke-static {v10}, Lokio/-SegmentedByteString;->toHexString(B)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0, p0}, Lj8/o;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    :goto_3
    if-ne v8, v9, :cond_7

    .line 120
    .line 121
    invoke-virtual {v6}, Lokio/Segment;->pop()Lokio/Segment;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    iput-object v7, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 126
    .line 127
    invoke-static {v6}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    iput v8, v6, Lokio/Segment;->pos:I

    .line 132
    .line 133
    :goto_4
    if-nez v1, :cond_8

    .line 134
    .line 135
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 136
    .line 137
    if-nez v6, :cond_0

    .line 138
    .line 139
    :cond_8
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 140
    .line 141
    .line 142
    move-result-wide v1

    .line 143
    int-to-long v6, v0

    .line 144
    sub-long/2addr v1, v6

    .line 145
    invoke-virtual {p0, v1, v2}, Lokio/Buffer;->setSize$okio(J)V

    .line 146
    .line 147
    .line 148
    return-wide v4

    .line 149
    :cond_9
    invoke-static {}, Lj8/o;->a()V

    .line 150
    .line 151
    .line 152
    goto :goto_2
.end method

.method public static final commonReadInt(Lokio/Buffer;)I
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x4

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-ltz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v1, v0, Lokio/Segment;->pos:I

    .line 20
    .line 21
    iget v4, v0, Lokio/Segment;->limit:I

    .line 22
    .line 23
    sub-int v5, v4, v1

    .line 24
    .line 25
    int-to-long v5, v5

    .line 26
    cmp-long v5, v5, v2

    .line 27
    .line 28
    if-gez v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    and-int/lit16 v0, v0, 0xff

    .line 35
    .line 36
    shl-int/lit8 v0, v0, 0x18

    .line 37
    .line 38
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    and-int/lit16 v1, v1, 0xff

    .line 43
    .line 44
    shl-int/lit8 v1, v1, 0x10

    .line 45
    .line 46
    or-int/2addr v0, v1

    .line 47
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    and-int/lit16 v1, v1, 0xff

    .line 52
    .line 53
    shl-int/lit8 v1, v1, 0x8

    .line 54
    .line 55
    or-int/2addr v0, v1

    .line 56
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    and-int/lit16 p0, p0, 0xff

    .line 61
    .line 62
    or-int/2addr p0, v0

    .line 63
    return p0

    .line 64
    :cond_0
    iget-object v5, v0, Lokio/Segment;->data:[B

    .line 65
    .line 66
    add-int/lit8 v6, v1, 0x1

    .line 67
    .line 68
    aget-byte v7, v5, v1

    .line 69
    .line 70
    and-int/lit16 v7, v7, 0xff

    .line 71
    .line 72
    shl-int/lit8 v7, v7, 0x18

    .line 73
    .line 74
    add-int/lit8 v8, v1, 0x2

    .line 75
    .line 76
    aget-byte v6, v5, v6

    .line 77
    .line 78
    and-int/lit16 v6, v6, 0xff

    .line 79
    .line 80
    shl-int/lit8 v6, v6, 0x10

    .line 81
    .line 82
    or-int/2addr v6, v7

    .line 83
    add-int/lit8 v7, v1, 0x3

    .line 84
    .line 85
    aget-byte v8, v5, v8

    .line 86
    .line 87
    and-int/lit16 v8, v8, 0xff

    .line 88
    .line 89
    shl-int/lit8 v8, v8, 0x8

    .line 90
    .line 91
    or-int/2addr v6, v8

    .line 92
    add-int/lit8 v1, v1, 0x4

    .line 93
    .line 94
    aget-byte v5, v5, v7

    .line 95
    .line 96
    and-int/lit16 v5, v5, 0xff

    .line 97
    .line 98
    or-int/2addr v5, v6

    .line 99
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 100
    .line 101
    .line 102
    move-result-wide v6

    .line 103
    sub-long/2addr v6, v2

    .line 104
    invoke-virtual {p0, v6, v7}, Lokio/Buffer;->setSize$okio(J)V

    .line 105
    .line 106
    .line 107
    if-ne v1, v4, :cond_1

    .line 108
    .line 109
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 114
    .line 115
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 116
    .line 117
    .line 118
    return v5

    .line 119
    :cond_1
    iput v1, v0, Lokio/Segment;->pos:I

    .line 120
    .line 121
    return v5

    .line 122
    :cond_2
    invoke-static {}, Lj8/o;->a()V

    .line 123
    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    return p0
.end method

.method public static final commonReadLong(Lokio/Buffer;)J
    .locals 15

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x8

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-ltz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v1, v0, Lokio/Segment;->pos:I

    .line 20
    .line 21
    iget v4, v0, Lokio/Segment;->limit:I

    .line 22
    .line 23
    sub-int v5, v4, v1

    .line 24
    .line 25
    int-to-long v5, v5

    .line 26
    cmp-long v5, v5, v2

    .line 27
    .line 28
    const/16 v6, 0x20

    .line 29
    .line 30
    if-gez v5, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lokio/Buffer;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    int-to-long v0, v0

    .line 37
    const-wide v2, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v0, v2

    .line 43
    shl-long/2addr v0, v6

    .line 44
    invoke-virtual {p0}, Lokio/Buffer;->readInt()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    int-to-long v4, p0

    .line 49
    and-long/2addr v2, v4

    .line 50
    or-long/2addr v0, v2

    .line 51
    return-wide v0

    .line 52
    :cond_0
    iget-object v5, v0, Lokio/Segment;->data:[B

    .line 53
    .line 54
    add-int/lit8 v7, v1, 0x1

    .line 55
    .line 56
    aget-byte v8, v5, v1

    .line 57
    .line 58
    int-to-long v8, v8

    .line 59
    const-wide/16 v10, 0xff

    .line 60
    .line 61
    and-long/2addr v8, v10

    .line 62
    const/16 v12, 0x38

    .line 63
    .line 64
    shl-long/2addr v8, v12

    .line 65
    add-int/lit8 v12, v1, 0x2

    .line 66
    .line 67
    aget-byte v7, v5, v7

    .line 68
    .line 69
    int-to-long v13, v7

    .line 70
    and-long/2addr v13, v10

    .line 71
    const/16 v7, 0x30

    .line 72
    .line 73
    shl-long/2addr v13, v7

    .line 74
    or-long v7, v8, v13

    .line 75
    .line 76
    add-int/lit8 v9, v1, 0x3

    .line 77
    .line 78
    aget-byte v12, v5, v12

    .line 79
    .line 80
    int-to-long v12, v12

    .line 81
    and-long/2addr v12, v10

    .line 82
    const/16 v14, 0x28

    .line 83
    .line 84
    shl-long/2addr v12, v14

    .line 85
    or-long/2addr v7, v12

    .line 86
    add-int/lit8 v12, v1, 0x4

    .line 87
    .line 88
    aget-byte v9, v5, v9

    .line 89
    .line 90
    int-to-long v13, v9

    .line 91
    and-long/2addr v13, v10

    .line 92
    shl-long/2addr v13, v6

    .line 93
    or-long v6, v7, v13

    .line 94
    .line 95
    add-int/lit8 v8, v1, 0x5

    .line 96
    .line 97
    aget-byte v9, v5, v12

    .line 98
    .line 99
    int-to-long v12, v9

    .line 100
    and-long/2addr v12, v10

    .line 101
    const/16 v9, 0x18

    .line 102
    .line 103
    shl-long/2addr v12, v9

    .line 104
    or-long/2addr v6, v12

    .line 105
    add-int/lit8 v9, v1, 0x6

    .line 106
    .line 107
    aget-byte v8, v5, v8

    .line 108
    .line 109
    int-to-long v12, v8

    .line 110
    and-long/2addr v12, v10

    .line 111
    const/16 v8, 0x10

    .line 112
    .line 113
    shl-long/2addr v12, v8

    .line 114
    or-long/2addr v6, v12

    .line 115
    add-int/lit8 v8, v1, 0x7

    .line 116
    .line 117
    aget-byte v9, v5, v9

    .line 118
    .line 119
    int-to-long v12, v9

    .line 120
    and-long/2addr v12, v10

    .line 121
    const/16 v9, 0x8

    .line 122
    .line 123
    shl-long/2addr v12, v9

    .line 124
    or-long/2addr v6, v12

    .line 125
    add-int/2addr v1, v9

    .line 126
    aget-byte v5, v5, v8

    .line 127
    .line 128
    int-to-long v8, v5

    .line 129
    and-long/2addr v8, v10

    .line 130
    or-long v5, v6, v8

    .line 131
    .line 132
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 133
    .line 134
    .line 135
    move-result-wide v7

    .line 136
    sub-long/2addr v7, v2

    .line 137
    invoke-virtual {p0, v7, v8}, Lokio/Buffer;->setSize$okio(J)V

    .line 138
    .line 139
    .line 140
    if-ne v1, v4, :cond_1

    .line 141
    .line 142
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 147
    .line 148
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 149
    .line 150
    .line 151
    return-wide v5

    .line 152
    :cond_1
    iput v1, v0, Lokio/Segment;->pos:I

    .line 153
    .line 154
    return-wide v5

    .line 155
    :cond_2
    invoke-static {}, Lj8/o;->a()V

    .line 156
    .line 157
    .line 158
    const-wide/16 v0, 0x0

    .line 159
    .line 160
    return-wide v0
.end method

.method public static final commonReadShort(Lokio/Buffer;)S
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x2

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-ltz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v1, v0, Lokio/Segment;->pos:I

    .line 20
    .line 21
    iget v4, v0, Lokio/Segment;->limit:I

    .line 22
    .line 23
    sub-int v5, v4, v1

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    if-ge v5, v6, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    and-int/lit16 v0, v0, 0xff

    .line 33
    .line 34
    shl-int/lit8 v0, v0, 0x8

    .line 35
    .line 36
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    and-int/lit16 p0, p0, 0xff

    .line 41
    .line 42
    or-int/2addr p0, v0

    .line 43
    int-to-short p0, p0

    .line 44
    return p0

    .line 45
    :cond_0
    iget-object v5, v0, Lokio/Segment;->data:[B

    .line 46
    .line 47
    add-int/lit8 v7, v1, 0x1

    .line 48
    .line 49
    aget-byte v8, v5, v1

    .line 50
    .line 51
    and-int/lit16 v8, v8, 0xff

    .line 52
    .line 53
    shl-int/lit8 v8, v8, 0x8

    .line 54
    .line 55
    add-int/2addr v1, v6

    .line 56
    aget-byte v5, v5, v7

    .line 57
    .line 58
    and-int/lit16 v5, v5, 0xff

    .line 59
    .line 60
    or-int/2addr v5, v8

    .line 61
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 62
    .line 63
    .line 64
    move-result-wide v6

    .line 65
    sub-long/2addr v6, v2

    .line 66
    invoke-virtual {p0, v6, v7}, Lokio/Buffer;->setSize$okio(J)V

    .line 67
    .line 68
    .line 69
    if-ne v1, v4, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 76
    .line 77
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iput v1, v0, Lokio/Segment;->pos:I

    .line 82
    .line 83
    :goto_0
    int-to-short p0, v5

    .line 84
    return p0

    .line 85
    :cond_2
    invoke-static {}, Lj8/o;->a()V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    return p0
.end method

.method public static final commonReadUnsafe(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lokio/-SegmentedByteString;->resolveDefaultParameter(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput-object p0, p1, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    iput-boolean p0, p1, Lokio/Buffer$UnsafeCursor;->readWrite:Z

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const-string p0, "already attached to a buffer"

    .line 22
    .line 23
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static final commonReadUtf8(Lokio/Buffer;J)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    cmp-long v1, v1, p1

    .line 22
    .line 23
    if-ltz v1, :cond_3

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-string p0, ""

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget v1, v0, Lokio/Segment;->pos:I

    .line 36
    .line 37
    int-to-long v2, v1

    .line 38
    add-long/2addr v2, p1

    .line 39
    iget v4, v0, Lokio/Segment;->limit:I

    .line 40
    .line 41
    int-to-long v4, v4

    .line 42
    cmp-long v2, v2, v4

    .line 43
    .line 44
    if-lez v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->readByteArray(J)[B

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 p1, 0x3

    .line 51
    const/4 p2, 0x0

    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p0, v0, v0, p1, p2}, Lokio/internal/_Utf8Kt;->commonToUtf8String$default([BIIILjava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_1
    iget-object v2, v0, Lokio/Segment;->data:[B

    .line 59
    .line 60
    long-to-int v3, p1

    .line 61
    add-int v4, v1, v3

    .line 62
    .line 63
    invoke-static {v2, v1, v4}, Lokio/internal/_Utf8Kt;->commonToUtf8String([BII)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget v2, v0, Lokio/Segment;->pos:I

    .line 68
    .line 69
    add-int/2addr v2, v3

    .line 70
    iput v2, v0, Lokio/Segment;->pos:I

    .line 71
    .line 72
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    sub-long/2addr v2, p1

    .line 77
    invoke-virtual {p0, v2, v3}, Lokio/Buffer;->setSize$okio(J)V

    .line 78
    .line 79
    .line 80
    iget p1, v0, Lokio/Segment;->pos:I

    .line 81
    .line 82
    iget p2, v0, Lokio/Segment;->limit:I

    .line 83
    .line 84
    if-ne p1, p2, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 91
    .line 92
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    return-object v1

    .line 96
    :cond_3
    invoke-static {}, Lj8/o;->a()V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    return-object p0

    .line 101
    :cond_4
    const-string p0, "byteCount: "

    .line 102
    .line 103
    invoke-static {p1, p2, p0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    return-object p0
.end method

.method public static final commonReadUtf8CodePoint(Lokio/Buffer;)I
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_a

    .line 13
    .line 14
    invoke-virtual {p0, v2, v3}, Lokio/Buffer;->getByte(J)B

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    and-int/lit16 v1, v0, 0x80

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    const/16 v3, 0x80

    .line 22
    .line 23
    const v4, 0xfffd

    .line 24
    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    and-int/lit8 v1, v0, 0x7f

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    move v6, v5

    .line 32
    move v5, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    and-int/lit16 v1, v0, 0xe0

    .line 35
    .line 36
    const/16 v5, 0xc0

    .line 37
    .line 38
    if-ne v1, v5, :cond_1

    .line 39
    .line 40
    and-int/lit8 v1, v0, 0x1f

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    move v6, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    and-int/lit16 v1, v0, 0xf0

    .line 46
    .line 47
    const/16 v5, 0xe0

    .line 48
    .line 49
    if-ne v1, v5, :cond_2

    .line 50
    .line 51
    and-int/lit8 v1, v0, 0xf

    .line 52
    .line 53
    const/4 v5, 0x3

    .line 54
    const/16 v6, 0x800

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    and-int/lit16 v1, v0, 0xf8

    .line 58
    .line 59
    const/16 v5, 0xf0

    .line 60
    .line 61
    if-ne v1, v5, :cond_9

    .line 62
    .line 63
    and-int/lit8 v1, v0, 0x7

    .line 64
    .line 65
    const/4 v5, 0x4

    .line 66
    const/high16 v6, 0x10000

    .line 67
    .line 68
    :goto_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 69
    .line 70
    .line 71
    move-result-wide v7

    .line 72
    int-to-long v9, v5

    .line 73
    cmp-long v7, v7, v9

    .line 74
    .line 75
    if-ltz v7, :cond_8

    .line 76
    .line 77
    :goto_1
    if-ge v2, v5, :cond_4

    .line 78
    .line 79
    int-to-long v7, v2

    .line 80
    invoke-virtual {p0, v7, v8}, Lokio/Buffer;->getByte(J)B

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    and-int/lit16 v11, v0, 0xc0

    .line 85
    .line 86
    if-ne v11, v3, :cond_3

    .line 87
    .line 88
    shl-int/lit8 v1, v1, 0x6

    .line 89
    .line 90
    and-int/lit8 v0, v0, 0x3f

    .line 91
    .line 92
    or-int/2addr v1, v0

    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {p0, v7, v8}, Lokio/Buffer;->skip(J)V

    .line 97
    .line 98
    .line 99
    return v4

    .line 100
    :cond_4
    invoke-virtual {p0, v9, v10}, Lokio/Buffer;->skip(J)V

    .line 101
    .line 102
    .line 103
    const p0, 0x10ffff

    .line 104
    .line 105
    .line 106
    if-le v1, p0, :cond_5

    .line 107
    .line 108
    return v4

    .line 109
    :cond_5
    const p0, 0xd800

    .line 110
    .line 111
    .line 112
    if-gt p0, v1, :cond_6

    .line 113
    .line 114
    const p0, 0xe000

    .line 115
    .line 116
    .line 117
    if-ge v1, p0, :cond_6

    .line 118
    .line 119
    return v4

    .line 120
    :cond_6
    if-ge v1, v6, :cond_7

    .line 121
    .line 122
    return v4

    .line 123
    :cond_7
    return v1

    .line 124
    :cond_8
    new-instance v1, Ljava/io/EOFException;

    .line 125
    .line 126
    const-string v2, "size < "

    .line 127
    .line 128
    const-string v3, ": "

    .line 129
    .line 130
    invoke-static {v5, v2, v3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string p0, " (to read code point prefixed 0x"

    .line 142
    .line 143
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, Lokio/-SegmentedByteString;->toHexString(B)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const/16 p0, 0x29

    .line 154
    .line 155
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-direct {v1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v1

    .line 166
    :cond_9
    const-wide/16 v0, 0x1

    .line 167
    .line 168
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 169
    .line 170
    .line 171
    return v4

    .line 172
    :cond_a
    invoke-static {}, Lj8/o;->a()V

    .line 173
    .line 174
    .line 175
    const/4 p0, 0x0

    .line 176
    return p0
.end method

.method public static final commonReadUtf8Line(Lokio/Buffer;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lokio/Buffer;->indexOf(B)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {p0, v0, v1}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readUtf8(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static final commonReadUtf8LineStrict(Lokio/Buffer;J)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-ltz v0, :cond_3

    .line 9
    .line 10
    const-wide v0, 0x7fffffffffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v2, p1, v0

    .line 16
    .line 17
    const-wide/16 v6, 0x1

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    :goto_0
    move-wide v4, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-long v0, p1, v6

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    const/16 v1, 0xa

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    move-object v0, p0

    .line 31
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->indexOf(BJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    const-wide/16 v8, -0x1

    .line 36
    .line 37
    cmp-long v3, v1, v8

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-static {p0, v1, v2}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_1
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    cmp-long v1, v4, v1

    .line 51
    .line 52
    if-gez v1, :cond_2

    .line 53
    .line 54
    sub-long v1, v4, v6

    .line 55
    .line 56
    invoke-virtual {p0, v1, v2}, Lokio/Buffer;->getByte(J)B

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/16 v2, 0xd

    .line 61
    .line 62
    if-ne v1, v2, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0, v4, v5}, Lokio/Buffer;->getByte(J)B

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/16 v2, 0xa

    .line 69
    .line 70
    if-ne v1, v2, :cond_2

    .line 71
    .line 72
    invoke-static {p0, v4, v5}, Lokio/internal/-Buffer;->readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0

    .line 77
    :cond_2
    new-instance v1, Lokio/Buffer;

    .line 78
    .line 79
    invoke-direct {v1}, Lokio/Buffer;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    const/16 v4, 0x20

    .line 87
    .line 88
    int-to-long v4, v4

    .line 89
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    const-wide/16 v2, 0x0

    .line 94
    .line 95
    move-object v0, p0

    .line 96
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    invoke-virtual {v1}, Lokio/Buffer;->readByteString()Lokio/ByteString;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0, v2, v3}, Lj8/o;->g(Ljava/lang/Object;J)V

    .line 116
    .line 117
    .line 118
    :goto_2
    const/4 v0, 0x0

    .line 119
    return-object v0

    .line 120
    :cond_3
    const-string v0, "limit < 0: "

    .line 121
    .line 122
    invoke-static {p1, p2, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2
.end method

.method public static final commonResizeBuffer(Lokio/Buffer$UnsafeCursor;J)J
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 5
    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget-boolean v1, p0, Lokio/Buffer$UnsafeCursor;->readWrite:Z

    .line 9
    .line 10
    if-eqz v1, :cond_6

    .line 11
    .line 12
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    cmp-long v3, p1, v1

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    if-gtz v3, :cond_3

    .line 21
    .line 22
    cmp-long v3, p1, v4

    .line 23
    .line 24
    if-ltz v3, :cond_2

    .line 25
    .line 26
    sub-long v6, v1, p1

    .line 27
    .line 28
    :goto_0
    cmp-long v3, v6, v4

    .line 29
    .line 30
    if-lez v3, :cond_1

    .line 31
    .line 32
    iget-object v3, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v3, v3, Lokio/Segment;->prev:Lokio/Segment;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget v8, v3, Lokio/Segment;->limit:I

    .line 43
    .line 44
    iget v9, v3, Lokio/Segment;->pos:I

    .line 45
    .line 46
    sub-int v9, v8, v9

    .line 47
    .line 48
    int-to-long v9, v9

    .line 49
    cmp-long v11, v9, v6

    .line 50
    .line 51
    if-gtz v11, :cond_0

    .line 52
    .line 53
    invoke-virtual {v3}, Lokio/Segment;->pop()Lokio/Segment;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    iput-object v8, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 58
    .line 59
    invoke-static {v3}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 60
    .line 61
    .line 62
    sub-long/2addr v6, v9

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    long-to-int v4, v6

    .line 65
    sub-int/2addr v8, v4

    .line 66
    iput v8, v3, Lokio/Segment;->limit:I

    .line 67
    .line 68
    :cond_1
    const/4 v3, 0x0

    .line 69
    invoke-virtual {p0, v3}, Lokio/Buffer$UnsafeCursor;->setSegment$okio(Lokio/Segment;)V

    .line 70
    .line 71
    .line 72
    iput-wide p1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 73
    .line 74
    iput-object v3, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 75
    .line 76
    const/4 v3, -0x1

    .line 77
    iput v3, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 78
    .line 79
    iput v3, p0, Lokio/Buffer$UnsafeCursor;->end:I

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    const-string p0, "newSize < 0: "

    .line 83
    .line 84
    invoke-static {p1, p2, p0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :goto_1
    const-wide/16 p0, 0x0

    .line 92
    .line 93
    return-wide p0

    .line 94
    :cond_3
    if-lez v3, :cond_5

    .line 95
    .line 96
    sub-long v6, p1, v1

    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    move v8, v3

    .line 100
    :cond_4
    :goto_2
    cmp-long v9, v6, v4

    .line 101
    .line 102
    if-lez v9, :cond_5

    .line 103
    .line 104
    invoke-virtual {v0, v3}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    iget v10, v9, Lokio/Segment;->limit:I

    .line 109
    .line 110
    rsub-int v10, v10, 0x2000

    .line 111
    .line 112
    int-to-long v10, v10

    .line 113
    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 114
    .line 115
    .line 116
    move-result-wide v10

    .line 117
    long-to-int v10, v10

    .line 118
    iget v11, v9, Lokio/Segment;->limit:I

    .line 119
    .line 120
    add-int/2addr v11, v10

    .line 121
    iput v11, v9, Lokio/Segment;->limit:I

    .line 122
    .line 123
    int-to-long v11, v10

    .line 124
    sub-long/2addr v6, v11

    .line 125
    if-eqz v8, :cond_4

    .line 126
    .line 127
    invoke-virtual {p0, v9}, Lokio/Buffer$UnsafeCursor;->setSegment$okio(Lokio/Segment;)V

    .line 128
    .line 129
    .line 130
    iput-wide v1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 131
    .line 132
    iget-object v8, v9, Lokio/Segment;->data:[B

    .line 133
    .line 134
    iput-object v8, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 135
    .line 136
    iget v8, v9, Lokio/Segment;->limit:I

    .line 137
    .line 138
    sub-int v9, v8, v10

    .line 139
    .line 140
    iput v9, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 141
    .line 142
    iput v8, p0, Lokio/Buffer$UnsafeCursor;->end:I

    .line 143
    .line 144
    const/4 v8, 0x0

    .line 145
    goto :goto_2

    .line 146
    :cond_5
    :goto_3
    invoke-virtual {v0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 147
    .line 148
    .line 149
    return-wide v1

    .line 150
    :cond_6
    const-string p0, "resizeBuffer() only permitted for read/write buffers"

    .line 151
    .line 152
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_7
    const-string p0, "not attached to a buffer"

    .line 157
    .line 158
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1
.end method

.method public static final commonSeek(Lokio/Buffer$UnsafeCursor;J)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    const-wide/16 v1, -0x1

    .line 9
    .line 10
    cmp-long v1, p1, v1

    .line 11
    .line 12
    if-ltz v1, :cond_9

    .line 13
    .line 14
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    cmp-long v2, p1, v2

    .line 19
    .line 20
    if-gtz v2, :cond_9

    .line 21
    .line 22
    if-eqz v1, :cond_8

    .line 23
    .line 24
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    cmp-long v1, p1, v1

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iget-object v3, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 39
    .line 40
    invoke-virtual {p0}, Lokio/Buffer$UnsafeCursor;->getSegment$okio()Lokio/Segment;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-wide/16 v5, 0x0

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    iget-wide v7, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 49
    .line 50
    iget v4, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 51
    .line 52
    invoke-virtual {p0}, Lokio/Buffer$UnsafeCursor;->getSegment$okio()Lokio/Segment;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget v9, v9, Lokio/Segment;->pos:I

    .line 60
    .line 61
    sub-int/2addr v4, v9

    .line 62
    int-to-long v9, v4

    .line 63
    sub-long/2addr v7, v9

    .line 64
    cmp-long v4, v7, p1

    .line 65
    .line 66
    if-lez v4, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0}, Lokio/Buffer$UnsafeCursor;->getSegment$okio()Lokio/Segment;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v4, v3

    .line 73
    move-object v3, v1

    .line 74
    move-wide v1, v7

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p0}, Lokio/Buffer$UnsafeCursor;->getSegment$okio()Lokio/Segment;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    move-wide v5, v7

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    move-object v4, v3

    .line 83
    :goto_0
    sub-long v7, v1, p1

    .line 84
    .line 85
    sub-long v9, p1, v5

    .line 86
    .line 87
    cmp-long v7, v7, v9

    .line 88
    .line 89
    if-lez v7, :cond_3

    .line 90
    .line 91
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget v1, v4, Lokio/Segment;->limit:I

    .line 95
    .line 96
    iget v2, v4, Lokio/Segment;->pos:I

    .line 97
    .line 98
    sub-int v3, v1, v2

    .line 99
    .line 100
    int-to-long v7, v3

    .line 101
    add-long/2addr v7, v5

    .line 102
    cmp-long v3, p1, v7

    .line 103
    .line 104
    if-ltz v3, :cond_5

    .line 105
    .line 106
    sub-int/2addr v1, v2

    .line 107
    int-to-long v1, v1

    .line 108
    add-long/2addr v5, v1

    .line 109
    iget-object v4, v4, Lokio/Segment;->next:Lokio/Segment;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    :goto_2
    cmp-long v4, v1, p1

    .line 113
    .line 114
    if-lez v4, :cond_4

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v3, v3, Lokio/Segment;->prev:Lokio/Segment;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget v4, v3, Lokio/Segment;->limit:I

    .line 125
    .line 126
    iget v5, v3, Lokio/Segment;->pos:I

    .line 127
    .line 128
    sub-int/2addr v4, v5

    .line 129
    int-to-long v4, v4

    .line 130
    sub-long/2addr v1, v4

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    move-wide v5, v1

    .line 133
    move-object v4, v3

    .line 134
    :cond_5
    iget-boolean v1, p0, Lokio/Buffer$UnsafeCursor;->readWrite:Z

    .line 135
    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-boolean v1, v4, Lokio/Segment;->shared:Z

    .line 142
    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    invoke-virtual {v4}, Lokio/Segment;->unsharedCopy()Lokio/Segment;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v2, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 150
    .line 151
    if-ne v2, v4, :cond_6

    .line 152
    .line 153
    iput-object v1, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 154
    .line 155
    :cond_6
    invoke-virtual {v4, v1}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    iget-object v0, v4, Lokio/Segment;->prev:Lokio/Segment;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 165
    .line 166
    .line 167
    :cond_7
    invoke-virtual {p0, v4}, Lokio/Buffer$UnsafeCursor;->setSegment$okio(Lokio/Segment;)V

    .line 168
    .line 169
    .line 170
    iput-wide p1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v0, v4, Lokio/Segment;->data:[B

    .line 176
    .line 177
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 178
    .line 179
    iget v0, v4, Lokio/Segment;->pos:I

    .line 180
    .line 181
    sub-long/2addr p1, v5

    .line 182
    long-to-int p1, p1

    .line 183
    add-int/2addr v0, p1

    .line 184
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 185
    .line 186
    iget p1, v4, Lokio/Segment;->limit:I

    .line 187
    .line 188
    iput p1, p0, Lokio/Buffer$UnsafeCursor;->end:I

    .line 189
    .line 190
    sub-int/2addr p1, v0

    .line 191
    return p1

    .line 192
    :cond_8
    :goto_3
    const/4 v0, 0x0

    .line 193
    invoke-virtual {p0, v0}, Lokio/Buffer$UnsafeCursor;->setSegment$okio(Lokio/Segment;)V

    .line 194
    .line 195
    .line 196
    iput-wide p1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 197
    .line 198
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 199
    .line 200
    const/4 p1, -0x1

    .line 201
    iput p1, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 202
    .line 203
    iput p1, p0, Lokio/Buffer$UnsafeCursor;->end:I

    .line 204
    .line 205
    return p1

    .line 206
    :cond_9
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 207
    .line 208
    const-string v1, "offset="

    .line 209
    .line 210
    const-string v2, " > size="

    .line 211
    .line 212
    invoke-static {p1, p2, v1, v2}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 217
    .line 218
    .line 219
    move-result-wide v0

    .line 220
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p0

    .line 231
    :cond_a
    const-string p0, "not attached to a buffer"

    .line 232
    .line 233
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const/4 p0, 0x0

    .line 237
    return p0
.end method

.method public static final commonSelect(Lokio/Buffer;Lokio/Options;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p0, p1, v2, v0, v1}, Lokio/internal/-Buffer;->selectPrefix$default(Lokio/Buffer;Lokio/Options;ZILjava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, -0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    invoke-virtual {p1}, Lokio/Options;->getByteStrings$okio()[Lokio/ByteString;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    aget-object p1, p1, v0

    .line 23
    .line 24
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    int-to-long v1, p1

    .line 29
    invoke-virtual {p0, v1, v2}, Lokio/Buffer;->skip(J)V

    .line 30
    .line 31
    .line 32
    return v0
.end method

.method public static final commonSkip(Lokio/Buffer;J)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-lez v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget v1, v0, Lokio/Segment;->limit:I

    .line 15
    .line 16
    iget v2, v0, Lokio/Segment;->pos:I

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    int-to-long v1, v1

    .line 20
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    long-to-int v1, v1

    .line 25
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    int-to-long v4, v1

    .line 30
    sub-long/2addr v2, v4

    .line 31
    invoke-virtual {p0, v2, v3}, Lokio/Buffer;->setSize$okio(J)V

    .line 32
    .line 33
    .line 34
    sub-long/2addr p1, v4

    .line 35
    iget v2, v0, Lokio/Segment;->pos:I

    .line 36
    .line 37
    add-int/2addr v2, v1

    .line 38
    iput v2, v0, Lokio/Segment;->pos:I

    .line 39
    .line 40
    iget v1, v0, Lokio/Segment;->limit:I

    .line 41
    .line 42
    if-ne v2, v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 49
    .line 50
    invoke-static {v0}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {}, Lj8/o;->a()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public static final commonSnapshot(Lokio/Buffer;)Lokio/ByteString;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 99
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Lokio/Buffer;->snapshot(I)Lokio/ByteString;

    move-result-object p0

    return-object p0

    .line 100
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v0

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v2, "size > Int.MAX_VALUE: "

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final commonSnapshot(Lokio/Buffer;I)Lokio/ByteString;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p0, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    int-to-long v4, p1

    .line 16
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    move v2, v1

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v2, p1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget v4, v0, Lokio/Segment;->limit:I

    .line 30
    .line 31
    iget v5, v0, Lokio/Segment;->pos:I

    .line 32
    .line 33
    if-eq v4, v5, :cond_1

    .line 34
    .line 35
    sub-int/2addr v4, v5

    .line 36
    add-int/2addr v2, v4

    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    iget-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string p0, "s.limit == s.pos"

    .line 43
    .line 44
    invoke-static {p0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    new-array v0, v3, [[B

    .line 50
    .line 51
    mul-int/lit8 v2, v3, 0x2

    .line 52
    .line 53
    new-array v2, v2, [I

    .line 54
    .line 55
    iget-object p0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 56
    .line 57
    move v4, v1

    .line 58
    :goto_1
    if-ge v1, p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v5, p0, Lokio/Segment;->data:[B

    .line 64
    .line 65
    aput-object v5, v0, v4

    .line 66
    .line 67
    iget v5, p0, Lokio/Segment;->limit:I

    .line 68
    .line 69
    iget v6, p0, Lokio/Segment;->pos:I

    .line 70
    .line 71
    sub-int/2addr v5, v6

    .line 72
    add-int/2addr v1, v5

    .line 73
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    aput v5, v2, v4

    .line 78
    .line 79
    add-int v5, v4, v3

    .line 80
    .line 81
    iget v6, p0, Lokio/Segment;->pos:I

    .line 82
    .line 83
    aput v6, v2, v5

    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    iput-boolean v5, p0, Lokio/Segment;->shared:Z

    .line 87
    .line 88
    add-int/2addr v4, v5

    .line 89
    iget-object p0, p0, Lokio/Segment;->next:Lokio/Segment;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    new-instance p0, Lokio/SegmentedByteString;

    .line 93
    .line 94
    invoke-direct {p0, v0, v2}, Lokio/SegmentedByteString;-><init>([[B[I)V

    .line 95
    .line 96
    .line 97
    return-object p0
.end method

.method public static final commonWritableSegment(Lokio/Buffer;I)Lokio/Segment;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-lt p1, v0, :cond_3

    .line 6
    .line 7
    const/16 v0, 0x2000

    .line 8
    .line 9
    if-gt p1, v0, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lokio/SegmentPool;->take()Lokio/Segment;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 20
    .line 21
    iput-object p1, p1, Lokio/Segment;->prev:Lokio/Segment;

    .line 22
    .line 23
    iput-object p1, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p0, v1, Lokio/Segment;->prev:Lokio/Segment;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget v1, p0, Lokio/Segment;->limit:I

    .line 35
    .line 36
    add-int/2addr v1, p1

    .line 37
    if-gt v1, v0, :cond_2

    .line 38
    .line 39
    iget-boolean p1, p0, Lokio/Segment;->owner:Z

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object p0

    .line 45
    :cond_2
    :goto_0
    invoke-static {}, Lokio/SegmentPool;->take()Lokio/Segment;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    const-string p0, "unexpected capacity"

    .line 55
    .line 56
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0
.end method

.method public static final commonWrite(Lokio/Buffer;Lokio/ByteString;II)Lokio/Buffer;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    invoke-virtual {p1, p0, p2, p3}, Lokio/ByteString;->write$okio(Lokio/Buffer;II)V

    return-object p0
.end method

.method public static final commonWrite(Lokio/Buffer;Lokio/Source;J)Lokio/Buffer;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    .line 198
    invoke-interface {p1, p0, p2, p3}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    sub-long/2addr p2, v0

    goto :goto_0

    .line 199
    :cond_0
    invoke-static {}, Lj8/o;->a()V

    const/4 p0, 0x0

    :cond_1
    return-object p0
.end method

.method public static final commonWrite(Lokio/Buffer;[B)Lokio/Buffer;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 189
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->write([BII)Lokio/Buffer;

    move-result-object p0

    return-object p0
.end method

.method public static final commonWrite(Lokio/Buffer;[BII)Lokio/Buffer;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    const/4 v0, 0x1

    .line 191
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    move-result-object v0

    sub-int v1, p3, p2

    .line 192
    iget v2, v0, Lokio/Segment;->limit:I

    rsub-int v2, v2, 0x2000

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 193
    iget-object v2, v0, Lokio/Segment;->data:[B

    .line 194
    iget v3, v0, Lokio/Segment;->limit:I

    add-int v4, p2, v1

    .line 195
    invoke-static {p1, v3, p2, v2, v4}, Ltf/l;->o0([BII[BI)V

    .line 196
    iget p2, v0, Lokio/Segment;->limit:I

    add-int/2addr p2, v1

    iput p2, v0, Lokio/Segment;->limit:I

    move p2, v4

    goto :goto_0

    .line 197
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide p1

    add-long/2addr p1, v5

    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    return-object p0
.end method

.method public static final commonWrite(Lokio/Buffer;Lokio/Buffer;J)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-eq p1, p0, :cond_6

    .line 8
    .line 9
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    move-wide v4, p2

    .line 16
    invoke-static/range {v0 .. v5}, Lokio/-SegmentedByteString;->checkOffsetAndCount(JJJ)V

    .line 17
    .line 18
    .line 19
    :goto_0
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    cmp-long v0, p2, v0

    .line 22
    .line 23
    if-lez v0, :cond_5

    .line 24
    .line 25
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget v0, v0, Lokio/Segment;->limit:I

    .line 31
    .line 32
    iget-object v1, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget v1, v1, Lokio/Segment;->pos:I

    .line 38
    .line 39
    sub-int/2addr v0, v1

    .line 40
    int-to-long v0, v0

    .line 41
    cmp-long v0, p2, v0

    .line 42
    .line 43
    if-gez v0, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Lokio/Segment;->prev:Lokio/Segment;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const/4 v0, 0x0

    .line 56
    :goto_1
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-boolean v1, v0, Lokio/Segment;->owner:Z

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget v1, v0, Lokio/Segment;->limit:I

    .line 63
    .line 64
    int-to-long v1, v1

    .line 65
    add-long/2addr v1, p2

    .line 66
    iget-boolean v3, v0, Lokio/Segment;->shared:Z

    .line 67
    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    iget v3, v0, Lokio/Segment;->pos:I

    .line 73
    .line 74
    :goto_2
    int-to-long v3, v3

    .line 75
    sub-long/2addr v1, v3

    .line 76
    const-wide/16 v3, 0x2000

    .line 77
    .line 78
    cmp-long v1, v1, v3

    .line 79
    .line 80
    if-gtz v1, :cond_2

    .line 81
    .line 82
    iget-object v1, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    long-to-int v2, p2

    .line 88
    invoke-virtual {v1, v0, v2}, Lokio/Segment;->writeTo(Lokio/Segment;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    sub-long/2addr v0, p2

    .line 96
    invoke-virtual {p1, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    add-long/2addr v0, p2

    .line 104
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    long-to-int v1, p2

    .line 114
    invoke-virtual {v0, v1}, Lokio/Segment;->split(I)Lokio/Segment;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 119
    .line 120
    :cond_3
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget v1, v0, Lokio/Segment;->limit:I

    .line 126
    .line 127
    iget v2, v0, Lokio/Segment;->pos:I

    .line 128
    .line 129
    sub-int/2addr v1, v2

    .line 130
    int-to-long v1, v1

    .line 131
    invoke-virtual {v0}, Lokio/Segment;->pop()Lokio/Segment;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    iput-object v3, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 136
    .line 137
    iget-object v3, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 138
    .line 139
    if-nez v3, :cond_4

    .line 140
    .line 141
    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 142
    .line 143
    iput-object v0, v0, Lokio/Segment;->prev:Lokio/Segment;

    .line 144
    .line 145
    iput-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v3, v3, Lokio/Segment;->prev:Lokio/Segment;

    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v0}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lokio/Segment;->compact()V

    .line 161
    .line 162
    .line 163
    :goto_3
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    sub-long/2addr v3, v1

    .line 168
    invoke-virtual {p1, v3, v4}, Lokio/Buffer;->setSize$okio(J)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 172
    .line 173
    .line 174
    move-result-wide v3

    .line 175
    add-long/2addr v3, v1

    .line 176
    invoke-virtual {p0, v3, v4}, Lokio/Buffer;->setSize$okio(J)V

    .line 177
    .line 178
    .line 179
    sub-long/2addr p2, v1

    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_5
    return-void

    .line 183
    :cond_6
    const-string p0, "source == this"

    .line 184
    .line 185
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public static synthetic commonWrite$default(Lokio/Buffer;Lokio/ByteString;IIILjava/lang/Object;)Lokio/Buffer;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0, p2, p3}, Lokio/ByteString;->write$okio(Lokio/Buffer;II)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public static final commonWriteAll(Lokio/Buffer;Lokio/Source;)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    :goto_0
    const-wide/16 v2, 0x2000

    .line 10
    .line 11
    invoke-interface {p1, p0, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    const-wide/16 v4, -0x1

    .line 16
    .line 17
    cmp-long v4, v2, v4

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    add-long/2addr v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-wide v0
.end method

.method public static final commonWriteByte(Lokio/Buffer;I)Lokio/Buffer;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Lokio/Segment;->data:[B

    .line 10
    .line 11
    iget v2, v0, Lokio/Segment;->limit:I

    .line 12
    .line 13
    add-int/lit8 v3, v2, 0x1

    .line 14
    .line 15
    iput v3, v0, Lokio/Segment;->limit:I

    .line 16
    .line 17
    int-to-byte p1, p1

    .line 18
    aput-byte p1, v1, v2

    .line 19
    .line 20
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    const-wide/16 v2, 0x1

    .line 25
    .line 26
    add-long/2addr v0, v2

    .line 27
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public static final commonWriteDecimalLong(Lokio/Buffer;J)Lokio/Buffer;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x30

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 v3, 0x1

    .line 18
    if-gez v2, :cond_2

    .line 19
    .line 20
    neg-long p1, p1

    .line 21
    cmp-long v2, p1, v0

    .line 22
    .line 23
    if-gez v2, :cond_1

    .line 24
    .line 25
    const-string p1, "-9223372036854775808"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    move v2, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 v2, 0x0

    .line 35
    :goto_0
    const-wide/32 v4, 0x5f5e100

    .line 36
    .line 37
    .line 38
    cmp-long v4, p1, v4

    .line 39
    .line 40
    const/16 v5, 0xa

    .line 41
    .line 42
    if-gez v4, :cond_a

    .line 43
    .line 44
    const-wide/16 v6, 0x2710

    .line 45
    .line 46
    cmp-long v4, p1, v6

    .line 47
    .line 48
    if-gez v4, :cond_6

    .line 49
    .line 50
    const-wide/16 v6, 0x64

    .line 51
    .line 52
    cmp-long v4, p1, v6

    .line 53
    .line 54
    if-gez v4, :cond_4

    .line 55
    .line 56
    const-wide/16 v6, 0xa

    .line 57
    .line 58
    cmp-long v4, p1, v6

    .line 59
    .line 60
    if-gez v4, :cond_3

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_3
    const/4 v3, 0x2

    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_4
    const-wide/16 v3, 0x3e8

    .line 68
    .line 69
    cmp-long v3, p1, v3

    .line 70
    .line 71
    if-gez v3, :cond_5

    .line 72
    .line 73
    const/4 v3, 0x3

    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_5
    const/4 v3, 0x4

    .line 77
    goto/16 :goto_1

    .line 78
    .line 79
    :cond_6
    const-wide/32 v3, 0xf4240

    .line 80
    .line 81
    .line 82
    cmp-long v3, p1, v3

    .line 83
    .line 84
    if-gez v3, :cond_8

    .line 85
    .line 86
    const-wide/32 v3, 0x186a0

    .line 87
    .line 88
    .line 89
    cmp-long v3, p1, v3

    .line 90
    .line 91
    if-gez v3, :cond_7

    .line 92
    .line 93
    const/4 v3, 0x5

    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :cond_7
    const/4 v3, 0x6

    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :cond_8
    const-wide/32 v3, 0x989680

    .line 100
    .line 101
    .line 102
    cmp-long v3, p1, v3

    .line 103
    .line 104
    if-gez v3, :cond_9

    .line 105
    .line 106
    const/4 v3, 0x7

    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :cond_9
    const/16 v3, 0x8

    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :cond_a
    const-wide v3, 0xe8d4a51000L

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    cmp-long v3, p1, v3

    .line 119
    .line 120
    if-gez v3, :cond_e

    .line 121
    .line 122
    const-wide v3, 0x2540be400L

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    cmp-long v3, p1, v3

    .line 128
    .line 129
    if-gez v3, :cond_c

    .line 130
    .line 131
    const-wide/32 v3, 0x3b9aca00

    .line 132
    .line 133
    .line 134
    cmp-long v3, p1, v3

    .line 135
    .line 136
    if-gez v3, :cond_b

    .line 137
    .line 138
    const/16 v3, 0x9

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_b
    move v3, v5

    .line 142
    goto :goto_1

    .line 143
    :cond_c
    const-wide v3, 0x174876e800L

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    cmp-long v3, p1, v3

    .line 149
    .line 150
    if-gez v3, :cond_d

    .line 151
    .line 152
    const/16 v3, 0xb

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_d
    const/16 v3, 0xc

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_e
    const-wide v3, 0x38d7ea4c68000L

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    cmp-long v3, p1, v3

    .line 164
    .line 165
    if-gez v3, :cond_11

    .line 166
    .line 167
    const-wide v3, 0x9184e72a000L

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    cmp-long v3, p1, v3

    .line 173
    .line 174
    if-gez v3, :cond_f

    .line 175
    .line 176
    const/16 v3, 0xd

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_f
    const-wide v3, 0x5af3107a4000L

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    cmp-long v3, p1, v3

    .line 185
    .line 186
    if-gez v3, :cond_10

    .line 187
    .line 188
    const/16 v3, 0xe

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_10
    const/16 v3, 0xf

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_11
    const-wide v3, 0x16345785d8a0000L

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    cmp-long v3, p1, v3

    .line 200
    .line 201
    if-gez v3, :cond_13

    .line 202
    .line 203
    const-wide v3, 0x2386f26fc10000L

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    cmp-long v3, p1, v3

    .line 209
    .line 210
    if-gez v3, :cond_12

    .line 211
    .line 212
    const/16 v3, 0x10

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_12
    const/16 v3, 0x11

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_13
    const-wide v3, 0xde0b6b3a7640000L

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    cmp-long v3, p1, v3

    .line 224
    .line 225
    if-gez v3, :cond_14

    .line 226
    .line 227
    const/16 v3, 0x12

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_14
    const/16 v3, 0x13

    .line 231
    .line 232
    :goto_1
    if-eqz v2, :cond_15

    .line 233
    .line 234
    add-int/lit8 v3, v3, 0x1

    .line 235
    .line 236
    :cond_15
    invoke-virtual {p0, v3}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    iget-object v6, v4, Lokio/Segment;->data:[B

    .line 241
    .line 242
    iget v7, v4, Lokio/Segment;->limit:I

    .line 243
    .line 244
    add-int/2addr v7, v3

    .line 245
    :goto_2
    cmp-long v8, p1, v0

    .line 246
    .line 247
    if-eqz v8, :cond_16

    .line 248
    .line 249
    int-to-long v8, v5

    .line 250
    rem-long v10, p1, v8

    .line 251
    .line 252
    long-to-int v10, v10

    .line 253
    add-int/lit8 v7, v7, -0x1

    .line 254
    .line 255
    invoke-static {}, Lokio/internal/-Buffer;->getHEX_DIGIT_BYTES()[B

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    aget-byte v10, v11, v10

    .line 260
    .line 261
    aput-byte v10, v6, v7

    .line 262
    .line 263
    div-long/2addr p1, v8

    .line 264
    goto :goto_2

    .line 265
    :cond_16
    if-eqz v2, :cond_17

    .line 266
    .line 267
    add-int/lit8 v7, v7, -0x1

    .line 268
    .line 269
    const/16 p1, 0x2d

    .line 270
    .line 271
    aput-byte p1, v6, v7

    .line 272
    .line 273
    :cond_17
    iget p1, v4, Lokio/Segment;->limit:I

    .line 274
    .line 275
    add-int/2addr p1, v3

    .line 276
    iput p1, v4, Lokio/Segment;->limit:I

    .line 277
    .line 278
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 279
    .line 280
    .line 281
    move-result-wide p1

    .line 282
    int-to-long v0, v3

    .line 283
    add-long/2addr p1, v0

    .line 284
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 285
    .line 286
    .line 287
    return-object p0
.end method

.method public static final commonWriteHexadecimalUnsignedLong(Lokio/Buffer;J)Lokio/Buffer;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x30

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    ushr-long v1, p1, v0

    .line 19
    .line 20
    or-long/2addr v1, p1

    .line 21
    const/4 v3, 0x2

    .line 22
    ushr-long v4, v1, v3

    .line 23
    .line 24
    or-long/2addr v1, v4

    .line 25
    const/4 v4, 0x4

    .line 26
    ushr-long v5, v1, v4

    .line 27
    .line 28
    or-long/2addr v1, v5

    .line 29
    const/16 v5, 0x8

    .line 30
    .line 31
    ushr-long v6, v1, v5

    .line 32
    .line 33
    or-long/2addr v1, v6

    .line 34
    const/16 v6, 0x10

    .line 35
    .line 36
    ushr-long v7, v1, v6

    .line 37
    .line 38
    or-long/2addr v1, v7

    .line 39
    const/16 v7, 0x20

    .line 40
    .line 41
    ushr-long v8, v1, v7

    .line 42
    .line 43
    or-long/2addr v1, v8

    .line 44
    ushr-long v8, v1, v0

    .line 45
    .line 46
    const-wide v10, 0x5555555555555555L    # 1.1945305291614955E103

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr v8, v10

    .line 52
    sub-long/2addr v1, v8

    .line 53
    ushr-long v8, v1, v3

    .line 54
    .line 55
    const-wide v10, 0x3333333333333333L    # 4.667261458395856E-62

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v8, v10

    .line 61
    and-long/2addr v1, v10

    .line 62
    add-long/2addr v8, v1

    .line 63
    ushr-long v1, v8, v4

    .line 64
    .line 65
    add-long/2addr v1, v8

    .line 66
    const-wide v8, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr v1, v8

    .line 72
    ushr-long v8, v1, v5

    .line 73
    .line 74
    add-long/2addr v1, v8

    .line 75
    ushr-long v5, v1, v6

    .line 76
    .line 77
    add-long/2addr v1, v5

    .line 78
    const-wide/16 v5, 0x3f

    .line 79
    .line 80
    and-long v8, v1, v5

    .line 81
    .line 82
    ushr-long/2addr v1, v7

    .line 83
    and-long/2addr v1, v5

    .line 84
    add-long/2addr v8, v1

    .line 85
    const/4 v1, 0x3

    .line 86
    int-to-long v1, v1

    .line 87
    add-long/2addr v8, v1

    .line 88
    int-to-long v1, v4

    .line 89
    div-long/2addr v8, v1

    .line 90
    long-to-int v1, v8

    .line 91
    invoke-virtual {p0, v1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object v3, v2, Lokio/Segment;->data:[B

    .line 96
    .line 97
    iget v5, v2, Lokio/Segment;->limit:I

    .line 98
    .line 99
    add-int v6, v5, v1

    .line 100
    .line 101
    sub-int/2addr v6, v0

    .line 102
    :goto_0
    if-lt v6, v5, :cond_1

    .line 103
    .line 104
    invoke-static {}, Lokio/internal/-Buffer;->getHEX_DIGIT_BYTES()[B

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-wide/16 v7, 0xf

    .line 109
    .line 110
    and-long/2addr v7, p1

    .line 111
    long-to-int v7, v7

    .line 112
    aget-byte v0, v0, v7

    .line 113
    .line 114
    aput-byte v0, v3, v6

    .line 115
    .line 116
    ushr-long/2addr p1, v4

    .line 117
    add-int/lit8 v6, v6, -0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_1
    iget p1, v2, Lokio/Segment;->limit:I

    .line 121
    .line 122
    add-int/2addr p1, v1

    .line 123
    iput p1, v2, Lokio/Segment;->limit:I

    .line 124
    .line 125
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 126
    .line 127
    .line 128
    move-result-wide p1

    .line 129
    int-to-long v0, v1

    .line 130
    add-long/2addr p1, v0

    .line 131
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 132
    .line 133
    .line 134
    return-object p0
.end method

.method public static final commonWriteInt(Lokio/Buffer;I)Lokio/Buffer;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v1, Lokio/Segment;->data:[B

    .line 10
    .line 11
    iget v3, v1, Lokio/Segment;->limit:I

    .line 12
    .line 13
    add-int/lit8 v4, v3, 0x1

    .line 14
    .line 15
    ushr-int/lit8 v5, p1, 0x18

    .line 16
    .line 17
    and-int/lit16 v5, v5, 0xff

    .line 18
    .line 19
    int-to-byte v5, v5

    .line 20
    aput-byte v5, v2, v3

    .line 21
    .line 22
    add-int/lit8 v5, v3, 0x2

    .line 23
    .line 24
    ushr-int/lit8 v6, p1, 0x10

    .line 25
    .line 26
    and-int/lit16 v6, v6, 0xff

    .line 27
    .line 28
    int-to-byte v6, v6

    .line 29
    aput-byte v6, v2, v4

    .line 30
    .line 31
    add-int/lit8 v4, v3, 0x3

    .line 32
    .line 33
    ushr-int/lit8 v6, p1, 0x8

    .line 34
    .line 35
    and-int/lit16 v6, v6, 0xff

    .line 36
    .line 37
    int-to-byte v6, v6

    .line 38
    aput-byte v6, v2, v5

    .line 39
    .line 40
    add-int/2addr v3, v0

    .line 41
    and-int/lit16 p1, p1, 0xff

    .line 42
    .line 43
    int-to-byte p1, p1

    .line 44
    aput-byte p1, v2, v4

    .line 45
    .line 46
    iput v3, v1, Lokio/Segment;->limit:I

    .line 47
    .line 48
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    const-wide/16 v2, 0x4

    .line 53
    .line 54
    add-long/2addr v0, v2

    .line 55
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method public static final commonWriteLong(Lokio/Buffer;J)Lokio/Buffer;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, v1, Lokio/Segment;->data:[B

    .line 11
    .line 12
    iget v3, v1, Lokio/Segment;->limit:I

    .line 13
    .line 14
    add-int/lit8 v4, v3, 0x1

    .line 15
    .line 16
    const/16 v5, 0x38

    .line 17
    .line 18
    ushr-long v5, p1, v5

    .line 19
    .line 20
    const-wide/16 v7, 0xff

    .line 21
    .line 22
    and-long/2addr v5, v7

    .line 23
    long-to-int v5, v5

    .line 24
    int-to-byte v5, v5

    .line 25
    aput-byte v5, v2, v3

    .line 26
    .line 27
    add-int/lit8 v5, v3, 0x2

    .line 28
    .line 29
    const/16 v6, 0x30

    .line 30
    .line 31
    ushr-long v9, p1, v6

    .line 32
    .line 33
    and-long/2addr v9, v7

    .line 34
    long-to-int v6, v9

    .line 35
    int-to-byte v6, v6

    .line 36
    aput-byte v6, v2, v4

    .line 37
    .line 38
    add-int/lit8 v4, v3, 0x3

    .line 39
    .line 40
    const/16 v6, 0x28

    .line 41
    .line 42
    ushr-long v9, p1, v6

    .line 43
    .line 44
    and-long/2addr v9, v7

    .line 45
    long-to-int v6, v9

    .line 46
    int-to-byte v6, v6

    .line 47
    aput-byte v6, v2, v5

    .line 48
    .line 49
    add-int/lit8 v5, v3, 0x4

    .line 50
    .line 51
    const/16 v6, 0x20

    .line 52
    .line 53
    ushr-long v9, p1, v6

    .line 54
    .line 55
    and-long/2addr v9, v7

    .line 56
    long-to-int v6, v9

    .line 57
    int-to-byte v6, v6

    .line 58
    aput-byte v6, v2, v4

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x5

    .line 61
    .line 62
    const/16 v6, 0x18

    .line 63
    .line 64
    ushr-long v9, p1, v6

    .line 65
    .line 66
    and-long/2addr v9, v7

    .line 67
    long-to-int v6, v9

    .line 68
    int-to-byte v6, v6

    .line 69
    aput-byte v6, v2, v5

    .line 70
    .line 71
    add-int/lit8 v5, v3, 0x6

    .line 72
    .line 73
    const/16 v6, 0x10

    .line 74
    .line 75
    ushr-long v9, p1, v6

    .line 76
    .line 77
    and-long/2addr v9, v7

    .line 78
    long-to-int v6, v9

    .line 79
    int-to-byte v6, v6

    .line 80
    aput-byte v6, v2, v4

    .line 81
    .line 82
    add-int/lit8 v4, v3, 0x7

    .line 83
    .line 84
    ushr-long v9, p1, v0

    .line 85
    .line 86
    and-long/2addr v9, v7

    .line 87
    long-to-int v6, v9

    .line 88
    int-to-byte v6, v6

    .line 89
    aput-byte v6, v2, v5

    .line 90
    .line 91
    add-int/2addr v3, v0

    .line 92
    and-long/2addr p1, v7

    .line 93
    long-to-int p1, p1

    .line 94
    int-to-byte p1, p1

    .line 95
    aput-byte p1, v2, v4

    .line 96
    .line 97
    iput v3, v1, Lokio/Segment;->limit:I

    .line 98
    .line 99
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 100
    .line 101
    .line 102
    move-result-wide p1

    .line 103
    const-wide/16 v0, 0x8

    .line 104
    .line 105
    add-long/2addr p1, v0

    .line 106
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->setSize$okio(J)V

    .line 107
    .line 108
    .line 109
    return-object p0
.end method

.method public static final commonWriteShort(Lokio/Buffer;I)Lokio/Buffer;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v1, Lokio/Segment;->data:[B

    .line 10
    .line 11
    iget v3, v1, Lokio/Segment;->limit:I

    .line 12
    .line 13
    add-int/lit8 v4, v3, 0x1

    .line 14
    .line 15
    ushr-int/lit8 v5, p1, 0x8

    .line 16
    .line 17
    and-int/lit16 v5, v5, 0xff

    .line 18
    .line 19
    int-to-byte v5, v5

    .line 20
    aput-byte v5, v2, v3

    .line 21
    .line 22
    add-int/2addr v3, v0

    .line 23
    and-int/lit16 p1, p1, 0xff

    .line 24
    .line 25
    int-to-byte p1, p1

    .line 26
    aput-byte p1, v2, v4

    .line 27
    .line 28
    iput v3, v1, Lokio/Segment;->limit:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide/16 v2, 0x2

    .line 35
    .line 36
    add-long/2addr v0, v2

    .line 37
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method public static final commonWriteUtf8(Lokio/Buffer;Ljava/lang/String;II)Lokio/Buffer;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-ltz p2, :cond_a

    .line 8
    .line 9
    if-lt p3, p2, :cond_9

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gt p3, v0, :cond_8

    .line 16
    .line 17
    :goto_0
    if-ge p2, p3, :cond_7

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x80

    .line 24
    .line 25
    if-ge v0, v1, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, v2, Lokio/Segment;->data:[B

    .line 33
    .line 34
    iget v4, v2, Lokio/Segment;->limit:I

    .line 35
    .line 36
    sub-int/2addr v4, p2

    .line 37
    rsub-int v5, v4, 0x2000

    .line 38
    .line 39
    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    add-int/lit8 v6, p2, 0x1

    .line 44
    .line 45
    add-int/2addr p2, v4

    .line 46
    int-to-byte v0, v0

    .line 47
    aput-byte v0, v3, p2

    .line 48
    .line 49
    :goto_1
    move p2, v6

    .line 50
    if-ge p2, v5, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-ge v0, v1, :cond_0

    .line 57
    .line 58
    add-int/lit8 v6, p2, 0x1

    .line 59
    .line 60
    add-int/2addr p2, v4

    .line 61
    int-to-byte v0, v0

    .line 62
    aput-byte v0, v3, p2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    add-int/2addr v4, p2

    .line 66
    iget v0, v2, Lokio/Segment;->limit:I

    .line 67
    .line 68
    sub-int/2addr v4, v0

    .line 69
    add-int/2addr v0, v4

    .line 70
    iput v0, v2, Lokio/Segment;->limit:I

    .line 71
    .line 72
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    int-to-long v2, v4

    .line 77
    add-long/2addr v0, v2

    .line 78
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/16 v2, 0x800

    .line 83
    .line 84
    if-ge v0, v2, :cond_2

    .line 85
    .line 86
    const/4 v2, 0x2

    .line 87
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget-object v4, v3, Lokio/Segment;->data:[B

    .line 92
    .line 93
    iget v5, v3, Lokio/Segment;->limit:I

    .line 94
    .line 95
    shr-int/lit8 v6, v0, 0x6

    .line 96
    .line 97
    or-int/lit16 v6, v6, 0xc0

    .line 98
    .line 99
    int-to-byte v6, v6

    .line 100
    aput-byte v6, v4, v5

    .line 101
    .line 102
    add-int/lit8 v6, v5, 0x1

    .line 103
    .line 104
    and-int/lit8 v0, v0, 0x3f

    .line 105
    .line 106
    or-int/2addr v0, v1

    .line 107
    int-to-byte v0, v0

    .line 108
    aput-byte v0, v4, v6

    .line 109
    .line 110
    add-int/2addr v5, v2

    .line 111
    iput v5, v3, Lokio/Segment;->limit:I

    .line 112
    .line 113
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    const-wide/16 v2, 0x2

    .line 118
    .line 119
    add-long/2addr v0, v2

    .line 120
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 121
    .line 122
    .line 123
    :goto_2
    add-int/lit8 p2, p2, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    const v2, 0xd800

    .line 127
    .line 128
    .line 129
    const/16 v3, 0x3f

    .line 130
    .line 131
    if-lt v0, v2, :cond_6

    .line 132
    .line 133
    const v2, 0xdfff

    .line 134
    .line 135
    .line 136
    if-le v0, v2, :cond_3

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_3
    add-int/lit8 v2, p2, 0x1

    .line 140
    .line 141
    if-ge v2, p3, :cond_4

    .line 142
    .line 143
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    goto :goto_3

    .line 148
    :cond_4
    const/4 v4, 0x0

    .line 149
    :goto_3
    const v5, 0xdbff

    .line 150
    .line 151
    .line 152
    if-gt v0, v5, :cond_5

    .line 153
    .line 154
    const v5, 0xdc00

    .line 155
    .line 156
    .line 157
    if-gt v5, v4, :cond_5

    .line 158
    .line 159
    const v5, 0xe000

    .line 160
    .line 161
    .line 162
    if-ge v4, v5, :cond_5

    .line 163
    .line 164
    and-int/lit16 v0, v0, 0x3ff

    .line 165
    .line 166
    shl-int/lit8 v0, v0, 0xa

    .line 167
    .line 168
    and-int/lit16 v2, v4, 0x3ff

    .line 169
    .line 170
    or-int/2addr v0, v2

    .line 171
    const/high16 v2, 0x10000

    .line 172
    .line 173
    add-int/2addr v0, v2

    .line 174
    const/4 v2, 0x4

    .line 175
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    iget-object v5, v4, Lokio/Segment;->data:[B

    .line 180
    .line 181
    iget v6, v4, Lokio/Segment;->limit:I

    .line 182
    .line 183
    shr-int/lit8 v7, v0, 0x12

    .line 184
    .line 185
    or-int/lit16 v7, v7, 0xf0

    .line 186
    .line 187
    int-to-byte v7, v7

    .line 188
    aput-byte v7, v5, v6

    .line 189
    .line 190
    add-int/lit8 v7, v6, 0x1

    .line 191
    .line 192
    shr-int/lit8 v8, v0, 0xc

    .line 193
    .line 194
    and-int/2addr v8, v3

    .line 195
    or-int/2addr v8, v1

    .line 196
    int-to-byte v8, v8

    .line 197
    aput-byte v8, v5, v7

    .line 198
    .line 199
    add-int/lit8 v7, v6, 0x2

    .line 200
    .line 201
    shr-int/lit8 v8, v0, 0x6

    .line 202
    .line 203
    and-int/2addr v8, v3

    .line 204
    or-int/2addr v8, v1

    .line 205
    int-to-byte v8, v8

    .line 206
    aput-byte v8, v5, v7

    .line 207
    .line 208
    add-int/lit8 v7, v6, 0x3

    .line 209
    .line 210
    and-int/2addr v0, v3

    .line 211
    or-int/2addr v0, v1

    .line 212
    int-to-byte v0, v0

    .line 213
    aput-byte v0, v5, v7

    .line 214
    .line 215
    add-int/2addr v6, v2

    .line 216
    iput v6, v4, Lokio/Segment;->limit:I

    .line 217
    .line 218
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 219
    .line 220
    .line 221
    move-result-wide v0

    .line 222
    const-wide/16 v2, 0x4

    .line 223
    .line 224
    add-long/2addr v0, v2

    .line 225
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 226
    .line 227
    .line 228
    add-int/lit8 p2, p2, 0x2

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_5
    invoke-virtual {p0, v3}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 233
    .line 234
    .line 235
    move p2, v2

    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_6
    :goto_4
    const/4 v2, 0x3

    .line 239
    invoke-virtual {p0, v2}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    iget-object v5, v4, Lokio/Segment;->data:[B

    .line 244
    .line 245
    iget v6, v4, Lokio/Segment;->limit:I

    .line 246
    .line 247
    shr-int/lit8 v7, v0, 0xc

    .line 248
    .line 249
    or-int/lit16 v7, v7, 0xe0

    .line 250
    .line 251
    int-to-byte v7, v7

    .line 252
    aput-byte v7, v5, v6

    .line 253
    .line 254
    add-int/lit8 v7, v6, 0x1

    .line 255
    .line 256
    shr-int/lit8 v8, v0, 0x6

    .line 257
    .line 258
    and-int/2addr v3, v8

    .line 259
    or-int/2addr v3, v1

    .line 260
    int-to-byte v3, v3

    .line 261
    aput-byte v3, v5, v7

    .line 262
    .line 263
    add-int/lit8 v3, v6, 0x2

    .line 264
    .line 265
    and-int/lit8 v0, v0, 0x3f

    .line 266
    .line 267
    or-int/2addr v0, v1

    .line 268
    int-to-byte v0, v0

    .line 269
    aput-byte v0, v5, v3

    .line 270
    .line 271
    add-int/2addr v6, v2

    .line 272
    iput v6, v4, Lokio/Segment;->limit:I

    .line 273
    .line 274
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 275
    .line 276
    .line 277
    move-result-wide v0

    .line 278
    const-wide/16 v2, 0x3

    .line 279
    .line 280
    add-long/2addr v0, v2

    .line 281
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_2

    .line 285
    .line 286
    :cond_7
    return-object p0

    .line 287
    :cond_8
    const-string p0, "endIndex > string.length: "

    .line 288
    .line 289
    const-string p2, " > "

    .line 290
    .line 291
    invoke-static {p3, p0, p2}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    invoke-static {p1, p0}, Lokio/a;->e(ILjava/lang/StringBuilder;)V

    .line 300
    .line 301
    .line 302
    :goto_5
    const/4 p0, 0x0

    .line 303
    return-object p0

    .line 304
    :cond_9
    const-string p0, "endIndex < beginIndex: "

    .line 305
    .line 306
    const-string p1, " < "

    .line 307
    .line 308
    invoke-static {p3, p0, p1, p2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_a
    const-string p0, "beginIndex < 0: "

    .line 317
    .line 318
    invoke-static {p2, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    goto :goto_5
.end method

.method public static final commonWriteUtf8CodePoint(Lokio/Buffer;I)Lokio/Buffer;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x80

    .line 5
    .line 6
    if-ge p1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v1, 0x800

    .line 13
    .line 14
    const/16 v2, 0x3f

    .line 15
    .line 16
    if-ge p1, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-virtual {p0, v1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, v3, Lokio/Segment;->data:[B

    .line 24
    .line 25
    iget v5, v3, Lokio/Segment;->limit:I

    .line 26
    .line 27
    shr-int/lit8 v6, p1, 0x6

    .line 28
    .line 29
    or-int/lit16 v6, v6, 0xc0

    .line 30
    .line 31
    int-to-byte v6, v6

    .line 32
    aput-byte v6, v4, v5

    .line 33
    .line 34
    add-int/lit8 v6, v5, 0x1

    .line 35
    .line 36
    and-int/2addr p1, v2

    .line 37
    or-int/2addr p1, v0

    .line 38
    int-to-byte p1, p1

    .line 39
    aput-byte p1, v4, v6

    .line 40
    .line 41
    add-int/2addr v5, v1

    .line 42
    iput v5, v3, Lokio/Segment;->limit:I

    .line 43
    .line 44
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    const-wide/16 v2, 0x2

    .line 49
    .line 50
    add-long/2addr v0, v2

    .line 51
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    const v1, 0xd800

    .line 56
    .line 57
    .line 58
    if-gt v1, p1, :cond_2

    .line 59
    .line 60
    const v1, 0xe000

    .line 61
    .line 62
    .line 63
    if-ge p1, v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_2
    const/high16 v1, 0x10000

    .line 70
    .line 71
    if-ge p1, v1, :cond_3

    .line 72
    .line 73
    const/4 v1, 0x3

    .line 74
    invoke-virtual {p0, v1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, v3, Lokio/Segment;->data:[B

    .line 79
    .line 80
    iget v5, v3, Lokio/Segment;->limit:I

    .line 81
    .line 82
    shr-int/lit8 v6, p1, 0xc

    .line 83
    .line 84
    or-int/lit16 v6, v6, 0xe0

    .line 85
    .line 86
    int-to-byte v6, v6

    .line 87
    aput-byte v6, v4, v5

    .line 88
    .line 89
    add-int/lit8 v6, v5, 0x1

    .line 90
    .line 91
    shr-int/lit8 v7, p1, 0x6

    .line 92
    .line 93
    and-int/2addr v7, v2

    .line 94
    or-int/2addr v7, v0

    .line 95
    int-to-byte v7, v7

    .line 96
    aput-byte v7, v4, v6

    .line 97
    .line 98
    add-int/lit8 v6, v5, 0x2

    .line 99
    .line 100
    and-int/2addr p1, v2

    .line 101
    or-int/2addr p1, v0

    .line 102
    int-to-byte p1, p1

    .line 103
    aput-byte p1, v4, v6

    .line 104
    .line 105
    add-int/2addr v5, v1

    .line 106
    iput v5, v3, Lokio/Segment;->limit:I

    .line 107
    .line 108
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    const-wide/16 v2, 0x3

    .line 113
    .line 114
    add-long/2addr v0, v2

    .line 115
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 116
    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_3
    const v1, 0x10ffff

    .line 120
    .line 121
    .line 122
    if-gt p1, v1, :cond_4

    .line 123
    .line 124
    const/4 v1, 0x4

    .line 125
    invoke-virtual {p0, v1}, Lokio/Buffer;->writableSegment$okio(I)Lokio/Segment;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iget-object v4, v3, Lokio/Segment;->data:[B

    .line 130
    .line 131
    iget v5, v3, Lokio/Segment;->limit:I

    .line 132
    .line 133
    shr-int/lit8 v6, p1, 0x12

    .line 134
    .line 135
    or-int/lit16 v6, v6, 0xf0

    .line 136
    .line 137
    int-to-byte v6, v6

    .line 138
    aput-byte v6, v4, v5

    .line 139
    .line 140
    add-int/lit8 v6, v5, 0x1

    .line 141
    .line 142
    shr-int/lit8 v7, p1, 0xc

    .line 143
    .line 144
    and-int/2addr v7, v2

    .line 145
    or-int/2addr v7, v0

    .line 146
    int-to-byte v7, v7

    .line 147
    aput-byte v7, v4, v6

    .line 148
    .line 149
    add-int/lit8 v6, v5, 0x2

    .line 150
    .line 151
    shr-int/lit8 v7, p1, 0x6

    .line 152
    .line 153
    and-int/2addr v7, v2

    .line 154
    or-int/2addr v7, v0

    .line 155
    int-to-byte v7, v7

    .line 156
    aput-byte v7, v4, v6

    .line 157
    .line 158
    add-int/lit8 v6, v5, 0x3

    .line 159
    .line 160
    and-int/2addr p1, v2

    .line 161
    or-int/2addr p1, v0

    .line 162
    int-to-byte p1, p1

    .line 163
    aput-byte p1, v4, v6

    .line 164
    .line 165
    add-int/2addr v5, v1

    .line 166
    iput v5, v3, Lokio/Segment;->limit:I

    .line 167
    .line 168
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 169
    .line 170
    .line 171
    move-result-wide v0

    .line 172
    const-wide/16 v2, 0x4

    .line 173
    .line 174
    add-long/2addr v0, v2

    .line 175
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->setSize$okio(J)V

    .line 176
    .line 177
    .line 178
    return-object p0

    .line 179
    :cond_4
    const-string p0, "Unexpected code point: 0x"

    .line 180
    .line 181
    invoke-static {p1}, Lokio/-SegmentedByteString;->toHexString(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1, p0}, Lj8/o;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const/4 p0, 0x0

    .line 189
    return-object p0
.end method

.method public static final getHEX_DIGIT_BYTES()[B
    .locals 1

    .line 1
    sget-object v0, Lokio/internal/-Buffer;->HEX_DIGIT_BYTES:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getHEX_DIGIT_BYTES$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final rangeEquals(Lokio/Segment;I[BII)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lokio/Segment;->limit:I

    .line 8
    .line 9
    iget-object v1, p0, Lokio/Segment;->data:[B

    .line 10
    .line 11
    :goto_0
    if-ge p3, p4, :cond_2

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lokio/Segment;->next:Lokio/Segment;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lokio/Segment;->data:[B

    .line 21
    .line 22
    iget v0, p0, Lokio/Segment;->pos:I

    .line 23
    .line 24
    iget v1, p0, Lokio/Segment;->limit:I

    .line 25
    .line 26
    move v4, v1

    .line 27
    move-object v1, p1

    .line 28
    move p1, v0

    .line 29
    move v0, v4

    .line 30
    :cond_0
    aget-byte v2, v1, p1

    .line 31
    .line 32
    aget-byte v3, p2, p3

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    add-int/lit8 p3, p3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 p0, 0x1

    .line 44
    return p0
.end method

.method public static final readUtf8Line(Lokio/Buffer;J)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    const-wide/16 v1, 0x1

    .line 9
    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    sub-long v3, p1, v1

    .line 13
    .line 14
    invoke-virtual {p0, v3, v4}, Lokio/Buffer;->getByte(J)B

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v5, 0xd

    .line 19
    .line 20
    if-ne v0, v5, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v3, v4}, Lokio/Buffer;->readUtf8(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-wide/16 v0, 0x2

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->readUtf8(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, v1, v2}, Lokio/Buffer;->skip(J)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public static final seek(Lokio/Buffer;JLfg/p;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lokio/Buffer;",
            "J",
            "Lfg/p;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-wide/16 p0, -0x1

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-interface {p3, p1, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    sub-long/2addr v1, p1

    .line 28
    cmp-long v1, v1, p1

    .line 29
    .line 30
    if-gez v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    :goto_0
    cmp-long p0, v1, p1

    .line 37
    .line 38
    if-lez p0, :cond_1

    .line 39
    .line 40
    iget-object v0, v0, Lokio/Segment;->prev:Lokio/Segment;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget p0, v0, Lokio/Segment;->limit:I

    .line 46
    .line 47
    iget v3, v0, Lokio/Segment;->pos:I

    .line 48
    .line 49
    sub-int/2addr p0, v3

    .line 50
    int-to-long v3, p0

    .line 51
    sub-long/2addr v1, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p3, v0, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_2
    const-wide/16 v1, 0x0

    .line 63
    .line 64
    :goto_1
    iget p0, v0, Lokio/Segment;->limit:I

    .line 65
    .line 66
    iget v3, v0, Lokio/Segment;->pos:I

    .line 67
    .line 68
    sub-int/2addr p0, v3

    .line 69
    int-to-long v3, p0

    .line 70
    add-long/2addr v3, v1

    .line 71
    cmp-long p0, v3, p1

    .line 72
    .line 73
    if-gtz p0, :cond_3

    .line 74
    .line 75
    iget-object v0, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-wide v1, v3

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-interface {p3, v0, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method

.method public static final selectPrefix(Lokio/Buffer;Lokio/Options;Z)I
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-object/from16 v0, p0

    .line 8
    .line 9
    iget-object v0, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 10
    .line 11
    const/4 v1, -0x2

    .line 12
    const/4 v2, -0x1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    return v2

    .line 19
    :cond_1
    iget-object v3, v0, Lokio/Segment;->data:[B

    .line 20
    .line 21
    iget v4, v0, Lokio/Segment;->pos:I

    .line 22
    .line 23
    iget v5, v0, Lokio/Segment;->limit:I

    .line 24
    .line 25
    invoke-virtual/range {p1 .. p1}, Lokio/Options;->getTrie$okio()[I

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const/4 v7, 0x0

    .line 30
    move-object v9, v0

    .line 31
    move v10, v2

    .line 32
    move v8, v7

    .line 33
    :goto_0
    add-int/lit8 v11, v8, 0x1

    .line 34
    .line 35
    aget v12, v6, v8

    .line 36
    .line 37
    add-int/lit8 v8, v8, 0x2

    .line 38
    .line 39
    aget v11, v6, v11

    .line 40
    .line 41
    if-eq v11, v2, :cond_2

    .line 42
    .line 43
    move v10, v11

    .line 44
    :cond_2
    if-nez v9, :cond_3

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    const/4 v11, 0x0

    .line 48
    if-gez v12, :cond_a

    .line 49
    .line 50
    mul-int/lit8 v12, v12, -0x1

    .line 51
    .line 52
    add-int v13, v12, v8

    .line 53
    .line 54
    :goto_1
    add-int/lit8 v12, v4, 0x1

    .line 55
    .line 56
    aget-byte v4, v3, v4

    .line 57
    .line 58
    and-int/lit16 v4, v4, 0xff

    .line 59
    .line 60
    add-int/lit8 v14, v8, 0x1

    .line 61
    .line 62
    aget v8, v6, v8

    .line 63
    .line 64
    if-eq v4, v8, :cond_4

    .line 65
    .line 66
    goto :goto_6

    .line 67
    :cond_4
    if-ne v14, v13, :cond_5

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_5
    move v4, v7

    .line 72
    :goto_2
    if-ne v12, v5, :cond_8

    .line 73
    .line 74
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v3, v9, Lokio/Segment;->next:Lokio/Segment;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget v5, v3, Lokio/Segment;->pos:I

    .line 83
    .line 84
    iget-object v8, v3, Lokio/Segment;->data:[B

    .line 85
    .line 86
    iget v9, v3, Lokio/Segment;->limit:I

    .line 87
    .line 88
    if-ne v3, v0, :cond_7

    .line 89
    .line 90
    if-eqz v4, :cond_6

    .line 91
    .line 92
    move-object v3, v8

    .line 93
    move-object v8, v11

    .line 94
    goto :goto_4

    .line 95
    :cond_6
    :goto_3
    if-eqz p2, :cond_b

    .line 96
    .line 97
    return v1

    .line 98
    :cond_7
    move-object/from16 v16, v8

    .line 99
    .line 100
    move-object v8, v3

    .line 101
    move-object/from16 v3, v16

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_8
    move-object v8, v9

    .line 105
    move v9, v5

    .line 106
    move v5, v12

    .line 107
    :goto_4
    if-eqz v4, :cond_9

    .line 108
    .line 109
    aget v4, v6, v14

    .line 110
    .line 111
    move v13, v5

    .line 112
    move v5, v9

    .line 113
    move-object v9, v8

    .line 114
    goto :goto_7

    .line 115
    :cond_9
    move v4, v5

    .line 116
    move v5, v9

    .line 117
    move-object v9, v8

    .line 118
    move v8, v14

    .line 119
    goto :goto_1

    .line 120
    :cond_a
    add-int/lit8 v13, v4, 0x1

    .line 121
    .line 122
    aget-byte v4, v3, v4

    .line 123
    .line 124
    and-int/lit16 v4, v4, 0xff

    .line 125
    .line 126
    add-int v14, v8, v12

    .line 127
    .line 128
    :goto_5
    if-ne v8, v14, :cond_c

    .line 129
    .line 130
    :cond_b
    :goto_6
    return v10

    .line 131
    :cond_c
    aget v15, v6, v8

    .line 132
    .line 133
    if-ne v4, v15, :cond_f

    .line 134
    .line 135
    add-int/2addr v8, v12

    .line 136
    aget v4, v6, v8

    .line 137
    .line 138
    if-ne v13, v5, :cond_d

    .line 139
    .line 140
    iget-object v9, v9, Lokio/Segment;->next:Lokio/Segment;

    .line 141
    .line 142
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget v3, v9, Lokio/Segment;->pos:I

    .line 146
    .line 147
    iget-object v5, v9, Lokio/Segment;->data:[B

    .line 148
    .line 149
    iget v8, v9, Lokio/Segment;->limit:I

    .line 150
    .line 151
    move v13, v3

    .line 152
    move-object v3, v5

    .line 153
    move v5, v8

    .line 154
    if-ne v9, v0, :cond_d

    .line 155
    .line 156
    move-object v9, v11

    .line 157
    :cond_d
    :goto_7
    if-ltz v4, :cond_e

    .line 158
    .line 159
    return v4

    .line 160
    :cond_e
    neg-int v8, v4

    .line 161
    move v4, v13

    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 165
    .line 166
    goto :goto_5
.end method

.method public static synthetic selectPrefix$default(Lokio/Buffer;Lokio/Options;ZILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, Lokio/internal/-Buffer;->selectPrefix(Lokio/Buffer;Lokio/Options;Z)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method
